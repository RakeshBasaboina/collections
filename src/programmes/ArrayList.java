package programmes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("rakesh","pramod","manikanta");
		Stream<String> s =  l.stream();
		List<String> ls = s.map(x->x.toUpperCase()).collect(Collectors.toList() );
		ls.forEach(x->System.out.println(x));
		// TODO Auto-generated method stub

	}
}
