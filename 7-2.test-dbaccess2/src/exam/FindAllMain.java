package exam;

import java.util.List;
import dao.MemberDao;
import dto.Member;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain
{
	public static void main( String[] args )
	{
		MemberDao dao = new MemberDao() ;
		List<Member> list ;

		list = dao.findAll() ;

		for ( Member member : list )
		{
			System.out.println( "======================================" ) ;
			System.out.println( "NAME:" + member.getName() ) ;
			System.out.println( "AGE:" + member.getAge() ) ;
			System.out.println( "DEP_ID:" + member.getDepId() ) ;
		}
	}
}
