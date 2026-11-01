package p067l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۢܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: RAB8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11588 implements InterfaceC18983 {

    /* JADX INFO: renamed from: ֨֫ */
    public static final Map f32267;

    /* JADX INFO: renamed from: ۚ֫ */
    public static final Map f32268;

    /* JADX INFO: renamed from: ۠֫ */
    public static final int f32269;

    /* JADX INFO: renamed from: ܶ֫ */
    public static final String f32270;

    /* JADX INFO: renamed from: ᩶֫ */
    public static int f32271;

    /* JADX INFO: renamed from: ᩸֫ */
    public static final Map f32272;

    /* JADX INFO: renamed from: ᩹֫ */
    public static final Map f32273;

    /* JADX INFO: renamed from: ֡֫ */
    public InterfaceC3446 f32274;

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f32275;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f32276;

    /* JADX INFO: renamed from: ۗ */
    public final boolean f32277;

    /* JADX INFO: renamed from: ۘ֫ */
    public final boolean f32278;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f32279;

    /* JADX INFO: renamed from: ۛ */
    public String f32280;

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f32281;

    /* JADX INFO: renamed from: ۟ */
    public int f32282;

    /* JADX INFO: renamed from: ۡ֫ */
    public final boolean f32283;

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean f32284;

    /* JADX INFO: renamed from: ۤ */
    public final boolean f32285;

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean f32286;

    /* JADX INFO: renamed from: ۨ */
    public int f32287;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f32288;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f32289;

    /* JADX INFO: renamed from: ܰ */
    public boolean f32290;

    /* JADX INFO: renamed from: ܳ֫ */
    public final boolean f32291;

    /* JADX INFO: renamed from: ܺ֫ */
    public final boolean f32292;

    /* JADX INFO: renamed from: ܽ֫ */
    public final boolean f32293;

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean f32294;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean f32295;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final boolean f32296;

    /* JADX INFO: renamed from: ᩵֫ */
    public EnumC3290 f32297;

    /* JADX INFO: renamed from: ᩶ */
    public int f32298;

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean f32299;

    /* JADX INFO: renamed from: ᩸ */
    public final String f32300;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f32301;

    /* JADX INFO: renamed from: ᩺ */
    public int f32302;

    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean f32303;

    /* JADX INFO: renamed from: ܺ */
    public abstract String mo6309();

    @Override // p067l.InterfaceC18983
    /* JADX INFO: renamed from: ܽ */
    public /* synthetic */ boolean mo6310() {
        return true;
    }

    @Override // p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public void mo5334() {
        if (mo26663()) {
            mo20623();
        } else {
            mo20628();
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public boolean mo26663() {
        return this.f32297.m5729() && this.f32296;
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo20623() {
        throw new C22317();
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo20628() {
        throw new C22317();
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo6311(int i, int i2) {
        throw new C22317();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo6308(int i, int i2) {
        throw new C22317();
    }

    public AbstractC11588(InterfaceC3446 interfaceC3446) {
        this();
        this.f32274 = interfaceC3446;
    }

    public AbstractC11588() {
        EnumC4231 enumC4231 = EnumC4231.TABLE;
        this.f32296 = C12949.m29678(enumC4231);
        this.f32278 = C12949.m29678(EnumC4231.SYSINFO);
        this.f32279 = C12949.m29678(EnumC4231.DETAILED_Output);
        this.f32285 = C12949.m29678(EnumC4231.EXTRA_DETAILED_Output);
        this.f32301 = C12949.m29678(EnumC4231.BEST_EFFORT);
        this.f32288 = C12949.m29678(EnumC4231.DROP_Source);
        this.f32277 = C12949.m29678(EnumC4231.DROP_Classes);
        this.f32289 = C12949.m29678(EnumC4231.DROP_Signatures);
        C12949.m29678(EnumC4231.DROP_CharacterRange);
        EnumC4231 enumC4232 = EnumC4231.LOCAL_VARIABLE_All;
        this.f32299 = C12949.m29678(enumC4232, EnumC4231.LOCAL_VARIABLE_Vars);
        this.f32281 = C12949.m29678(enumC4232, EnumC4231.LOCAL_VARIABLE_Types);
        EnumC4231 enumC4233 = EnumC4231.LINE_NUMBER_TABLE_Numbers;
        EnumC4231 enumC4234 = EnumC4231.LINE_NUMBER_TABLE_Lines;
        EnumC4231 enumC4235 = EnumC4231.LINE_NUMBER_TABLE_Table;
        this.f32295 = C12949.m29678(enumC4233, enumC4234, enumC4235, enumC4231);
        this.f32275 = C12949.m29678(EnumC4231.CP_INDEX);
        this.f32292 = C12949.m29678(EnumC4231.NO_COMMENTS);
        boolean zM29678 = C12949.m29678(EnumC4231.PRINT_BCI);
        this.f32284 = zM29678;
        boolean z = C12949.m29678(EnumC4231.LABELS) && !zM29678;
        this.f32286 = C12949.m29678(EnumC4231.CONSTANT_POOL);
        this.f32283 = C12949.m29678(enumC4234);
        this.f32294 = C12949.m29678(enumC4235);
        this.f32291 = C12949.m29678(enumC4234);
        this.f32303 = C12949.m29678(enumC4233);
        this.f32293 = C12949.m29678(EnumC4231.HEX);
        this.f32297 = EnumC3290.NOT_SUPPORTED;
        this.f32302 = 0;
        this.f32290 = false;
        this.f32300 = z ? "L" : "";
        this.f32298 = 0;
        this.f32287 = 0;
        this.f32276 = 2;
        this.f32282 = 2;
        this.f32280 = " ";
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m26682() {
        return this.f32300;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26679(String str) {
        this.f32274.mo4349(m26658(str));
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m26683() {
        return this.f32276;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26673(String str, Object... objArr) {
        this.f32274.mo4349(m26658(new Formatter().format(str, objArr).toString()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26669(String str, Object... objArr) {
        this.f32274.mo4344(m26658(new Formatter().format(str, objArr).toString()));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m26672(String str) {
        this.f32274.mo4344(m26658(str));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m26675(int i, String str) {
        this.f32274.mo4344(m26671(i, str));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26668(String str) {
        this.f32274.mo4344(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26660(String str, Object... objArr) {
        this.f32274.mo4344(new Formatter().format(str, objArr).toString());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m26676(String str) {
        this.f32274.mo4349(str);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m26681() {
        this.f32274.mo4349("");
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26680(String str, Object... objArr) {
        this.f32274.mo4349(new Formatter().format(str, objArr).toString());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m26678(int i) {
        this.f32287 = (this.f32276 * i) + this.f32287;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26667(int i) {
        int i2 = this.f32287 - (this.f32276 * i);
        this.f32287 = i2;
        if (i2 < 0) {
            this.f32287 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26661(AbstractC13599 abstractC13599) {
        this.f32287 = abstractC13599.f32287;
        this.f32282 = abstractC13599.f32282;
        this.f32276 = abstractC13599.f32276;
        this.f32298 = abstractC13599.f32298;
        this.f32280 = abstractC13599.f32280;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m26662() {
        this.f32287 = 0;
        this.f32276 = 2;
        this.f32282 = 0;
        this.f32280 = " ";
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m26670() {
        return this.f32282 + this.f32287;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m26674(int i) {
        if (i < 0) {
            i = 0;
        }
        List listNCopies = Collections.nCopies(i, this.f32280);
        StringBuilder sb = new StringBuilder();
        Iterator it = listNCopies.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m26664() {
        return m26674(m26670());
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26657(int i, String str) {
        return m26664() + m26671(i, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m26666(int i, String str) {
        int length;
        if (i <= 0 || (length = i - str.length()) <= 0) {
            return str;
        }
        return m26674(length) + str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m26671(int i, String str) {
        int length;
        if (i <= 0 || (length = i - str.length()) <= 0) {
            return str;
        }
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(m26674(length));
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26658(String str) {
        return m26664() + str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m26677(int i, String str) {
        this.f32282 += i;
        String strM26658 = m26658(str);
        this.f32282 -= i;
        return strM26658;
    }

    /* JADX INFO: renamed from: ܿ */
    public int mo8555() {
        return this.f32298;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m26684(int i) {
        this.f32282 = i;
    }

    /* JADX INFO: renamed from: ۡ */
    public int mo20624() {
        return ((this.f32284 ? 7 : 7 - this.f32276) + 24) - (m26670() * 2);
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m26665() {
        return mo8555() - mo20624();
    }

    static {
        StringBuilder sb = new StringBuilder(2);
        for (int i = 0; i < 2; i++) {
            sb.append(" ");
        }
        f32270 = sb.toString();
        f32271 = 25;
        f32269 = C12949.m29678(EnumC4231.TABLE) ? 16 : 20;
        Object[] objArr = {2, 3};
        ArrayList arrayList = new ArrayList(2);
        int iM25047 = 0;
        while (iM25047 < 2) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        List listUnmodifiableList = C21562.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{3}[0];
        C12826.requireNonNull(obj2);
        arrayList2.add(obj2);
        List listUnmodifiableList2 = C21562.unmodifiableList(arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        Object obj3 = new Object[]{3}[0];
        C12826.requireNonNull(obj3);
        arrayList3.add(obj3);
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(0, listUnmodifiableList), new AbstractMap.SimpleEntry(1, listUnmodifiableList2), new AbstractMap.SimpleEntry(2, C21562.unmodifiableList(arrayList3))};
        HashMap map = new HashMap(3);
        for (int i2 = 0; i2 < 3; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            C12826.requireNonNull(key);
            Object value = entry.getValue();
            C12826.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(C7470.m17246(key, "duplicate key: "));
            }
        }
        f32272 = C21562.unmodifiableMap(map);
        ArrayList arrayList4 = new ArrayList(1);
        Object obj4 = new Object[]{3}[0];
        C12826.requireNonNull(obj4);
        arrayList4.add(obj4);
        List listUnmodifiableList3 = C21562.unmodifiableList(arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        Object obj5 = new Object[]{3}[0];
        C12826.requireNonNull(obj5);
        arrayList5.add(obj5);
        List listUnmodifiableList4 = C21562.unmodifiableList(arrayList5);
        ArrayList arrayList6 = new ArrayList(1);
        Object obj6 = new Object[]{3}[0];
        C12826.requireNonNull(obj6);
        arrayList6.add(obj6);
        Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(0, listUnmodifiableList3), new AbstractMap.SimpleEntry(1, listUnmodifiableList4), new AbstractMap.SimpleEntry(2, C21562.unmodifiableList(arrayList6))};
        HashMap map2 = new HashMap(3);
        for (int i3 = 0; i3 < 3; i3++) {
            Map.Entry entry2 = entryArr2[i3];
            Object key2 = entry2.getKey();
            C12826.requireNonNull(key2);
            Object value2 = entry2.getValue();
            C12826.requireNonNull(value2);
            if (map2.put(key2, value2) != null) {
                throw new IllegalArgumentException(C7470.m17246(key2, "duplicate key: "));
            }
        }
        f32273 = C21562.unmodifiableMap(map2);
        Object[] objArr2 = {2, 3};
        ArrayList arrayList7 = new ArrayList(2);
        int iM25048 = 0;
        while (iM25048 < 2) {
            Object obj7 = objArr2[iM25048];
            iM25048 = C10878.m25047(obj7, arrayList7, obj7, iM25048, 1);
        }
        Map.Entry[] entryArr3 = {new AbstractMap.SimpleEntry(0, C21562.unmodifiableList(arrayList7))};
        HashMap map3 = new HashMap(1);
        Map.Entry entry3 = entryArr3[0];
        Object key3 = entry3.getKey();
        C12826.requireNonNull(key3);
        Object value3 = entry3.getValue();
        C12826.requireNonNull(value3);
        if (map3.put(key3, value3) != null) {
            throw new IllegalArgumentException(C7470.m17246(key3, "duplicate key: "));
        }
        f32267 = C21562.unmodifiableMap(map3);
        ArrayList arrayList8 = new ArrayList(1);
        Object obj8 = new Object[]{3}[0];
        C12826.requireNonNull(obj8);
        arrayList8.add(obj8);
        Map.Entry[] entryArr4 = {new AbstractMap.SimpleEntry(0, C21562.unmodifiableList(arrayList8))};
        HashMap map4 = new HashMap(1);
        Map.Entry entry4 = entryArr4[0];
        Object key4 = entry4.getKey();
        C12826.requireNonNull(key4);
        Object value4 = entry4.getValue();
        C12826.requireNonNull(value4);
        if (map4.put(key4, value4) != null) {
            throw new IllegalArgumentException(C7470.m17246(key4, "duplicate key: "));
        }
        f32268 = C21562.unmodifiableMap(map4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26659(String str, int i, String str2, Map map) {
        String strReplaceAll = str;
        boolean zContains = strReplaceAll.contains("{}");
        if (zContains) {
            strReplaceAll = strReplaceAll.replaceAll("\\{\\}", "<!>");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strReplaceAll, ":\"{}\\^⾀", true);
        StringBuilder sb = new StringBuilder(80);
        String str3 = "";
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            List list = (List) C15525.getOrDefault(map, Integer.valueOf(i2), Collections.EMPTY_LIST);
            strNextToken.getClass();
            StringTokenizer stringTokenizer2 = stringTokenizer;
            switch (strNextToken) {
                case """:
                    if (!str3.equals("\\")) {
                        z = !z;
                    }
                    sb.append(strNextToken);
                    continue;
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                case ":":
                    sb.append(strNextToken);
                    if (z) {
                        i3++;
                        if (list.contains(Integer.valueOf(i3))) {
                            sb.append(System.lineSeparator());
                            sb.append(m26674(i));
                            sb.append(str2);
                            sb.append(m26674(this.f32276 * i2));
                        }
                    } else {
                        continue;
                    }
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                case "^":
                    if (z) {
                        sb.append(',');
                        sb.append(System.lineSeparator());
                        sb.append(m26674(i));
                        sb.append(str2);
                        sb.append(m26674(this.f32276 * i2));
                        break;
                    } else {
                        sb.append("^");
                    }
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                case "{":
                    if (z) {
                        i2++;
                        sb.append(" {");
                        sb.append(System.lineSeparator());
                        sb.append(m26674(i));
                        sb.append(str2);
                        sb.append(m26674(this.f32276 * i2));
                        break;
                    } else {
                        sb.append(strNextToken);
                    }
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                case "}":
                    if (z) {
                        if (i2 != 0) {
                            i2--;
                        }
                        sb.append(System.lineSeparator());
                        sb.append(m26674(i));
                        sb.append(str2);
                        sb.append(m26674(this.f32276 * i2));
                        sb.append(strNextToken);
                        break;
                    } else {
                        sb.append(strNextToken);
                    }
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                case "⾀":
                    if (z) {
                        sb.append(System.lineSeparator());
                        sb.append(m26674(i));
                        sb.append(str2);
                        sb.append(m26674(this.f32276 * i2));
                        continue;
                    } else {
                        sb.append("^");
                    }
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
                default:
                    sb.append(strNextToken);
                    continue;
                    stringTokenizer = stringTokenizer2;
                    str3 = strNextToken;
                    break;
            }
            i3 = 0;
            stringTokenizer = stringTokenizer2;
            str3 = strNextToken;
        }
        String string = sb.toString();
        return zContains ? string.replaceAll("<!>", "{}") : string;
    }
}
