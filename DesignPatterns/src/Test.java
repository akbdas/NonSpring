import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws Exception {
		/*
		 * int[][] arr={{11, 2, 4}, {4, 5, 6}, {10, 8 ,-12}};
		 * System.out.println("length"+arr.length); int dsum =
		 * IntStream.range(0, arr.length).map(i->arr[i][i]).sum();
		 * //IntStream.range(0,
		 * a.length).map(i->a[i][i]).forEach(System.out::println); int rdsum =
		 * IntStream.range(0, arr.length).map(i->arr[arr.length-1-i][i]).sum();
		 * //IntStream.range(0,
		 * a.length).map(i->a[a.length-1-i][i]).forEach(System.out::println);
		 * System.out.println(dsum); System.out.println(rdsum); if (dsum >
		 * rdsum) System.out.println( dsum-rdsum); else
		 * System.out.println(rdsum-dsum);
		 */

		/*
		 * int[] arr=new int[]{-4, 3, -9, 0, 4, 1 }; DecimalFormat df = new
		 * DecimalFormat("0.000000"); int pcnt = (int)
		 * Arrays.stream(arr).filter(x -> x > 0).count(); int ncnt = (int)
		 * Arrays.stream(arr).filter(x -> x < 0).count();
		 * System.out.println(df.format((float)pcnt/(float)arr.length));
		 * System.out.println(df.format((float)ncnt/(float)arr.length));
		 * System.out.println(df.format(((float)(arr.length-pcnt-ncnt))/arr.
		 * length));
		 */

		/*
		 * String s = "07:05:45PM"; SimpleDateFormat sdf = new
		 * SimpleDateFormat("hh:mm:ssa"); System.out.println(sdf.parse(s));
		 * System.out.println(new
		 * SimpleDateFormat("HH:mm:ss").format(sdf.parse(s)));
		 */

		/*
		 * int[] ar=new int[]{-4, 3, -9, 0, 4, 1 }; int
		 * maxc=Arrays.stream(ar).max().orElse(0);
		 * 
		 * int cnt = (int) Arrays.stream(ar).filter(a -> a==maxc).count();
		 * System.out.println( cnt);
		 */

		/*
		 * int[] arr=new int[]{-4, 3, -9, 0, 4, 1 };
		 * 
		 * Arrays.sort(arr); long maxSum =
		 * IntStream.range(0,4).map(i->arr[i]).asLongStream().sum(); long minSum
		 * = IntStream.range(0,4).map(i->arr[arr.length-i-1]).sum();
		 * System.out.println(maxSum+" "+minSum); System.out.println(ar);
		 */

		/*
		 * String s1=
		 * "APMCTKBUKYRGZPAUVZEBVUXRGDVITOYXWQWRVCSXESMEHQLHPDJQWETAWQVSBRRNRRFDLFTRXOTKQHFTYAZSGBORDNAMUAJTPVOKERLVOLEALDQQLUDCUIRXJHQEZBRWYPFJXNTPELEZHNJILIZVZLYQJDFYSYQNRFFAOYXHQBQVRLFDIIOGWKQIZGVELYOUKZBKMHVYGIKIPSEMWSCWYOJTHOQKMLBAIZYNAKYNCXKDTTESODDAEAHKCDHCJYAHERACMLYQHXIRDFUSRTZDNVHSYFKCSPPYSLHOGIBTNUJTZQWVTHKUNDNWZADMATSUXEISCACQNQXIHNTXGCZUGIGBDONYTUXAXFINAYGZJVDCTZCWPGFNQDPERUCNJUXIFDSQHULYPZRNUOKMLMMQAJMLKCHJMEFJVRYZIPFQOBSDPAITHGMNKROCWJEGESCGOIUOQHOYUEQNPJPBMCNRZUHOSQNSUNCSTVQVWFGMUFJZGMEUVUPH";
		 * String s2=
		 * "JUVSDRRSHFGSSLLLZEPJDVAWDPKQBKUHHOZFFXKQMGAACZUYOMNPHWGTYZWQGSMNYXWNFYNOIVVMPZXUNKJQYBYJINBOHXUWIVRTVLEKCOPDMTKTGDBWECDAVPMLHQLERZHDVZJZODPSAPGSRWJXNGFEBQBLTLNDIEGFHEGHJWFOIYXRUJMODSNXUFWBIJJMXTFMUKQEYPNBTZFEJNLDNWCGQLVUQUKGZHJOKZNPMUYEQLEYNNORKJQAMSTHTBCCPQTTCPRZATWNJQJXPODRXKIWDOFUBZVSDTAPFRMXJBJMUGVRZOCDUIPXVEGMRQNKXDKNWXMTNDJSETAKVSYMJISAREEJPLRABMXJSRQNASOJNEEVAMWCFJBCIOCKMHCMYCRCGYFNZKNALDUNPUSTSWGOYHOSWRHWSMFGZDWSBXWXGVKQPHGINRKMDXEVTNNZTBJPXYNAXLWZSBUMVMJXDIKORHBIBECJNKWJJJSRLYQIKKPXSNUT";
		 * int pos=0;
		 * 
		 * String[] as1=s1.split(""); String[] as2=s2.split(""); for(int i=0;
		 * i<as1.length;++i) { for (int j=0; j<as2.length;++j) { if
		 * (as1[i]).equals(as2[j])) { } }
		 * 
		 * 
		 * 
		 * List s = (List) Arrays.stream(s1.split("")).filter(x ->
		 * s2.contains(x)).collect(Collectors.toCollection(LinkedList::new));
		 * List se1 = (List) Arrays.stream(s2.split("")).filter(x ->
		 * s1.contains(x)).collect(Collectors.toList()); //s.addAll(se1);
		 * System.out.println(s.size()+","+se1.size()); System.out.println(s);
		 * System.out.println(se1);
		 */

		/*
		 * int a[]={1}; int b[]={100}; int minNum =
		 * Arrays.stream(b).min().orElse(0); int minNum1 =
		 * Arrays.stream(a).min().orElse(0); List fList = new ArrayList();
		 * for(int i=minNum1;i<= minNum;++i) { int status = 0; for (int j=0;j<
		 * b.length;++j) { if (b[j]%i==0) ++status; }
		 * System.out.println(i+":"+status); int aStatus =0; if (status ==
		 * b.length) { for ( int x=0;x< a.length;++x) { if (i%a[x]==0) {
		 * ++aStatus; } } } if ( aStatus == a.length) { fList.add(i); } }
		 * System.out.println( fList);
		 */
		/*
		 * int n=5; int[] c=new int[]{0,4}; int nearStat[] = new int[n];
		 * 
		 * for (int i=0;i<n;++i) { int[] len = new int[n]; for (int
		 * j=0;j<c.length;++j) { c[j]=c[j]; len[i]= len[i]; len[i] = Math.abs(
		 * i-c[j]); } Arrays.stream(len).forEach(d ->System.out.print(d+",") );
		 * System.out.println(); Arrays.sort(len); int minCount=-1; int
		 * minNum=len[0]; for ( int x: len) { if (x<= minNum) { minCount++;
		 * minNum=x; } } nearStat[i]=minCount; } int max =
		 * Arrays.stream(nearStat).max().orElse(0);
		 * 
		 * System.out.println(">>"+ max);
		 */

		fairRations(new int[] { 2, 3, 4, 5, 6 });

		/*
		 * int[] arr = new int[] { 1, 2, 12, 4, 5, 6, 9, 7, 10 };
		 * Arrays.sort(arr, 2, arr.length); Arrays.stream(arr).forEach(d ->
		 * System.out.print(d + ","));
		 */

	}

	static int fairRations(int[] b) {
		int bcnt = 0;
		for (int x = 0, y = 0; x < b.length; ++x) {
			if ((b[y] % 2 == 1 && (b[y - 1] % 2 == 1 && y > 0))
					|| (b[y] % 2 == 1 && (b[y + 1] % 2 == 1 && y < b.length))) {
				++bcnt;
			}
			++y;
			if (y == b.length - 1) {
				y = 0;
			}

		}
		boolean status = false;
		for (int y = 0; y < b.length; ++y) {
			if (b[y] % 2 != 0) {
				status = true;
				break;
			}
		}

		if (status) {
			System.out.println("NO");
		}
		return bcnt;

	}

	static void almostSorted(int[] arr) {
		int[] arrd = new int[arr.length - 1];
		int[] arrv = new int[arr.length];
		boolean status = true;
		int startIdx = 0;
		int endIdx = 0;
		String op = "";
		for (int i = 0; i < arr.length; ++i) {
			if (i + 1 < arr.length)
				arrd[i] = arr[i] - arr[i + 1];

		}
		int pcnt = 0;
		for (int j = 0; j < arrd.length; ++j) {
			if (arrd[j] > 0) {
				++pcnt;
				if (status) {
					startIdx = j;
					endIdx = j + 1;
					status = false;
				} else {
					endIdx = j + 1;
				}
			}

		}

		// Arrays.stream(arrd).forEach(d ->System.out.println(d+",") );

		if (pcnt < 3) {
			arr[startIdx] = arr[startIdx] + arr[endIdx];
			arr[endIdx] = arr[startIdx] - arr[endIdx];
			arr[startIdx] = arr[startIdx] - arr[endIdx];
			op = "swap ";
		} else if (pcnt > 2) {
			for (int x = 0; x < startIdx; ++x) {
				arrv[x] = arr[x];
			}
			for (int x = endIdx, y = startIdx; x >= startIdx; --x, ++y) {
				arrv[y] = arr[x];
			}
			for (int x = endIdx + 1; x < arr.length; ++x) {
				arrv[x] = arr[x];
			}
			arr = arrv;
			op = "reverse ";
		}
		// Arrays.stream(arr).forEach(d ->System.out.print(d+":") );
		boolean bstat = true;

		for (int j = 0; j < arr.length - 1; ++j) {
			if ((arr[j] <= arr[j + 1])) {
				;
			} else {
				bstat = false;
			}
		}

		if (bstat) {
			System.out.println("yes");

			System.out.println(op + (startIdx + 1) + " " + (endIdx + 1));

		} else {
			System.out.println("no");
		}

	}

}
