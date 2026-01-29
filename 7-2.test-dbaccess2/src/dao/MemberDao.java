package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao
{
	public final static String TABLE_NAME = "test_members" ;

	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll()
	{
		Connection con = DBManager.createConnection() ;
		String sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY age ASC ;";
		try {
			PreparedStatement pstmt = con.prepareStatement( sql ) ;
			ResultSet rtn = pstmt.executeQuery() ;
			List<Member> list = new ArrayList<>() ;

			while ( rtn.next() )
			{
				Member member = new Member() ;
				member.setName( rtn.getString("name") ) ;
				member.setAge( rtn.getInt("age") ) ;
				member.setDepId( rtn.getInt("dep_id") ) ;
				list.add( member ) ;
			}
			
			return ( list ) ; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace() ;
			throw new RuntimeException( "全件検索処理に失敗しました", e ) ;
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load( int id )
	{
		Connection con = DBManager.createConnection() ;
		String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?" ;
		try
		{
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt( 1, id ) ;

			ResultSet rtn = pstmt.executeQuery() ;

			if ( rtn.next() )
			{
				Member member = new Member() ;
				member.setId( rtn.getInt("id") ) ;
				member.setName( rtn.getString("name") ) ;
				member.setAge( rtn.getInt("age") ) ;
				member.setDepId( rtn.getInt("dep_id") ) ;
				return ( member ) ;
			}
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + "( name, age, dep_id ) VALUES( ?, ?, ? ) ;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString( 1, member.getName() ) ;
			pstmt.setInt( 2, member.getAge() ) ;
			pstmt.setInt( 3, member.getDepId() ) ;

			pstmt.executeUpdate() ;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	public void update(Member member)
	{
		Connection con = DBManager.createConnection();
		String sql = "UPDATE " + TABLE_NAME + " SET age = ? WHERE id = ? ;";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt( 1, 100 ) ;
			pstmt.setInt( 2, member.getId() ) ;

			pstmt.executeUpdate() ;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
}
