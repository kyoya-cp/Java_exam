import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.sql.SQLException ;

public class Exam3
{
	public static void main( String[] args )
	{
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student" ;
		String user = "postgres" ;
		String password = "01061534" ;

		Connection con = null ; // 使用する変数の宣言
		PreparedStatement pstmt = null ;
		String sql = null ;
		ResultSet rslt = null ;

		int id, age ;
		String name, depName ;

		try
		{
			// (1)データベースに接続
			con = DriverManager.getConnection( url, user, password ) ;

			// (2)SQL文を作成
			sql = "SELECT * FROM test_members LEFT JOIN test_deps ON test_members.dep_id = test_deps.id ;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement( sql ) ;

			// (4)SQL実行
			rslt = pstmt.executeQuery() ;

			// (5)結果の操作
			while ( rslt.next() )
			{
				id = rslt.getInt( "id" ) ;
				name = rslt.getString( "name" ) ;
				age = rslt.getInt( "age" ) ;
				depName = rslt.getString( "name" ) ;

				System.out.println( "id=" + id + " name=" + name + " age=" + age + " dep_name=" + depName ) ;
			}
		}
		catch ( SQLException ex )
		{
			System.err.println( "SQL = " + sql ) ;
			ex.printStackTrace() ;
		}
		finally
		{
			try
			{
				// (6) メモリの解放(切断)
				con.close() ;
			}
			catch ( Exception ex ) {}
		}
	}
}
