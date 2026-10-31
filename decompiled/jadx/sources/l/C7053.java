package l;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۜ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E971 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7053 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f21721;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11459 f21722 = C11459.m28260("^\\w+\\S+(\\.\\S+)+$");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f21719 = C11459.m28260("\\w+://.+");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f21720 = C11459.m28259(2, "\\.([a-z][a-z0-9]*)$");

    static {
        String[] strArrSplit = "ac ad ae af ag ai al am ao aq ar as at au aw ax az ba bb bd be bf bg bh bi bj bm bn bo bq br bs bt bw by bz ca cc cd cf cg ch ci ck cl cm cn co cr cu cv cw cx cy cz de dj dk dm do dz ec ee eg er es et eu fi fj fk fm fo fr ga gd ge gf gg gh gi gl gm gn gp gq gr gs gt gu gw gy hk hm hn hr ht hu id ie il im in io iq ir is it je jm jo jp ke kg kh ki km kn kp kr kw ky kz la lb lc li lk lr ls lt lu lv ly ma mc md me mg mh mk ml mm mn mo mp mq mr ms mt mu mv mw mx my mz na nc ne nf ng ni nl no np nr nu nz om pa pe pf pg ph pk pl pm pn pr ps pt pw py qa re ro rs ru rw sa sb sc sd se sg sh si sj sk sl sm sn so sr st sv sy sz tc td tf tg th tj tk tl tm tn to tr tt tv tw tz ua ug uk us uy uz va vc ve vg vi vn vu wf ws ye yt za zm zw app art bar bet bid bio biz car cat ceo com dev dog eat eco edu fan fly foo geo gov how ice ink int kim lol ltd mba men mil net now org pro pub red run sex ski tax tel top uno vet web win wtf xxx aero army arpa asia auto baby band bank beer best bike blog blue book buzz cafe camp care cars casa cash chat city club cool coop fail farm fast fish food fund game gift gold golf guru hair haus help host info jobs land lgbt life limo link live loan love mail menu mobi moda name news pics pink plus porn post real rent rich sale save sexy shop show site taxi team tech tips town toys vote wiki wine work yoga zone actor adult autos bingo black boats build cheap click cloud coach codes dance deals earth email faith forex forum gifts gives glass green gripe group guide homes horse hotel house irish jetzt lease legal loans media miami money movie music ninja parts party photo pizza place poker press rehab rocks salon shoes solar space sport store style sucks tires today tools tours trade vegas video vodka watch works world africa agency beauty berlin boston camera career casino center church claims clinic coffee condos credit cruise dating degree dental design direct doctor energy estate events expert family flight futbol garden global gratis health hiphop hockey kaufen lawyer london luxury maison market mobile museum online photos racing reisen repair report review school soccer social sports studio supply tennis travel villas vision voyage academy auction capital college company cooking country coupons courses cricket digital domains exposed express fashion finance fitness flights florist flowers forsale gallery guitars hamburg holiday hosting jewelry kitchen limited markets medical network organic recipes rentals reviews science singles support surgery systems theater theatre website wedding airforce attorney bargains boutique builders business catering cleaning clothing computer creative delivery diamonds discount download engineer exchange feedback football gambling graphics holdings hospital lighting memorial mortgage partners pictures plumbing property services shopping software supplies training ventures amsterdam community directory education equipment financial furniture institute insurance marketing solutions vacations accountant apartments associates consulting foundation healthcare industries management properties republican restaurant technology university advertising contractors engineering enterprises investments photography productions construction international".split(" ");
        HashSet hashSet = new HashSet(strArrSplit.length);
        Collections.addAll(hashSet, strArrSplit);
        f21721 = C20195.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19033(C7744 c7744, int i, int i2) {
        if (i2 - i > 2048) {
            return false;
        }
        C12164 c12164Matcher = f21722.matcher((CharSequence) c7744);
        c12164Matcher.m29614region(i, i2);
        if (!c12164Matcher.matches()) {
            return false;
        }
        String string = c7744.subSequence(i, i2).toString();
        try {
            String host = new URL(m19032(string)).getHost();
            if (!host.startsWith(".") && !host.startsWith("-")) {
                String lowerCase = string.toLowerCase();
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    C12164 c12164Matcher2 = f21720.matcher((CharSequence) host);
                    if (c12164Matcher2.find()) {
                        String strGroup = c12164Matcher2.group(1);
                        C11003.requireNonNull(strGroup);
                        return f21721.contains(strGroup.toLowerCase());
                    }
                }
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19032(String str) {
        return !f21719.matcher((CharSequence) str).matches() ? C20094.m46315("http://", str) : str;
    }
}
