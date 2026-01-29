package exam;

import dao.MemberDao;
import dto.Member;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain
{
	public static void main(String[] args)
	{
		MemberDao dao = new MemberDao();
		Member member ;

		member = dao.load( 2 ) ;
		dao.update( member ) ;

		System.out.println( "update終了" ) ;

		// System.out.println( "=====確認用=====" ) ;
		// member = dao.load( 2 ) ;
		// System.out.println( "NAME:" + member.getName() ) ;
		// System.out.println( "AGE:" + member.getAge() ) ;
		// System.out.println( "DEP_ID:" + member.getDepId() ) ;
	}
}
