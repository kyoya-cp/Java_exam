import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement ;
import java.sql.SQLException ;

public class Exam1
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

		try
		{
			// (1)データベースに接続
			con = DriverManager.getConnection( url, user, password ) ;

			// (2)SQL文を作成
			sql = "INSERT INTO test_members( name, age, dep_id ) VALUES( '山田太郎', 62, 1 ) ; INSERT INTO test_members( name, age, dep_id ) VALUES( '佐藤花子', 33, 2 ) ; INSERT INTO test_members( name, age, dep_id ) VALUES( '遠藤次郎', 55, 2 ) ;";

			// (3)SQL実行準備
			pstmt = con.prepareStatement( sql ) ;

			// (4)SQL実行
			pstmt.executeUpdate() ;

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
