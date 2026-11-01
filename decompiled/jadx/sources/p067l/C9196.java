package p067l;

import android.util.Base64;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.۟ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5LS */
/* JADX INFO: loaded from: classes2.dex */
public final class C9196 {

    /* JADX INFO: renamed from: ܰ */
    public static final Map f24861 = AbstractC11500.m26549();

    /* JADX INFO: renamed from: ֨ */
    public int f24863;

    /* JADX INFO: renamed from: ۖ */
    public int f24865;

    /* JADX INFO: renamed from: ۘ */
    public String f24867;

    /* JADX INFO: renamed from: ۙ */
    public int f24868;

    /* JADX INFO: renamed from: ۛ */
    public int f24870;

    /* JADX INFO: renamed from: ۜ */
    public Boolean f24871;

    /* JADX INFO: renamed from: ۠ */
    public int f24872;

    /* JADX INFO: renamed from: ۡ */
    public int f24873;

    /* JADX INFO: renamed from: ۢ */
    public int f24874;

    /* JADX INFO: renamed from: ۤ */
    public int f24875;

    /* JADX INFO: renamed from: ۧ */
    public int f24876;

    /* JADX INFO: renamed from: ۨ */
    public boolean f24877;

    /* JADX INFO: renamed from: ܳ */
    public int f24880;

    /* JADX INFO: renamed from: ܶ */
    public String f24881;

    /* JADX INFO: renamed from: ܺ */
    public int f24882;

    /* JADX INFO: renamed from: ܿ */
    public boolean f24884;

    /* JADX INFO: renamed from: ᩳ */
    public int f24885;

    /* JADX INFO: renamed from: ᩴ */
    public String f24886;

    /* JADX INFO: renamed from: ᩶ */
    public int f24888;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f24889;

    /* JADX INFO: renamed from: ᩸ */
    public Reader f24890;

    /* JADX INFO: renamed from: ᩹ */
    public char[] f24891;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f24892;

    /* JADX INFO: renamed from: ᩻ */
    public String[] f24893 = new String[16];

    /* JADX INFO: renamed from: ֡ */
    public String[] f24862 = new String[8];

    /* JADX INFO: renamed from: ᩵ */
    public int[] f24887 = new int[4];

    /* JADX INFO: renamed from: ۫ */
    public char[] f24878 = new char[128];

    /* JADX INFO: renamed from: ܽ */
    public String[] f24883 = new String[16];

    /* JADX INFO: renamed from: ֫ */
    public C17951[] f24864 = new C17951[8];

    /* JADX INFO: renamed from: ۚ */
    public int[] f24869 = new int[2];

    /* JADX INFO: renamed from: ۬ */
    public final C21111 f24879 = new C21111();

    /* JADX INFO: renamed from: ۗ */
    public C17951 f24866 = new C17951();

    public C9196() {
        this.f24891 = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : 128];
    }

    /* JADX INFO: renamed from: ܽ */
    private void m21158(String str) throws C3870 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C3870(str, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21152(String str, C17951 c17951) throws C3870 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C3870(str, c17951);
    }

    /* JADX INFO: renamed from: ۘ */
    private int m21154() throws C3870, IOException {
        int iM21156 = m21156(0);
        if (iM21156 == -1) {
            int i = this.f24880;
            if (i == 0) {
                return 1;
            }
            m21158(C10965.m25286(new StringBuilder("expected: </"), this.f24893[((i - 1) << 2) + 3], ">"));
            throw null;
        }
        if (iM21156 == 38) {
            return 6;
        }
        if (iM21156 != 60) {
            return 4;
        }
        int iM21157 = m21156(1);
        if (iM21157 == 33) {
            return EnumC5674.f13813;
        }
        if (iM21157 == 47) {
            return 3;
        }
        if (iM21157 != 63) {
            return 2;
        }
        return EnumC5674.f13813;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩻ */
    private String m21162(int i) {
        int i2;
        char c;
        char[] cArr = this.f24878;
        int i3 = this.f24875 - i;
        if (i3 > 16) {
            return new String(cArr, i, i3);
        }
        if (i3 == 0) {
            return "";
        }
        if (i3 == 1) {
            i2 = i3 * 31;
            c = cArr[i];
        } else {
            i2 = ((i3 * 31) + cArr[i]) * 31;
            c = cArr[i + 1];
        }
        int i4 = i2 + c;
        C21111 c21111 = this.f24879;
        String str = (String) c21111.get(i4);
        if (str != null && str.length() == i3) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5 + i] == str.charAt(i5)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i3);
        c21111.mo4686(i4, str2);
        return str2;
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m21161(int i) {
        this.f24889 &= i <= 32;
        int i2 = this.f24875;
        char[] cArr = this.f24878;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[C25053.m54989(i2, 4, 3, 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f24878 = cArr2;
        }
        char[] cArr3 = this.f24878;
        int i3 = this.f24875;
        this.f24875 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C17951 m21169() {
        return this.f24866;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21153(boolean z) throws C3870, IOException {
        String strSubstring;
        if (!z) {
            m21160();
        }
        C17951 c17951 = this.f24866;
        c17951.m40845(this);
        this.f24867 = m21149();
        c17951.m40844(this);
        this.f24876 = 0;
        if (this.f24871 == null) {
            try {
                ClassLoader classLoader = C9196.class.getClassLoader();
                C12826.requireNonNull(classLoader);
                if (classLoader.loadClass(new String(Base64.decode("YW5kcm9pZC5zdXBwb3J0LmNvbXBhdC5S", 0))) != null || classLoader.loadClass(new String(Base64.decode("bmV0LmRvbmdsaXUuYXBrLnBhcnNlci5wYXJzZXIuWG1sVHJhbnNsYXRvcg==", 0))) != null) {
                    this.f24871 = Boolean.TRUE;
                } else {
                    this.f24871 = Boolean.FALSE;
                }
            } catch (Throwable unused) {
                this.f24871 = Boolean.FALSE;
            }
        }
        boolean z2 = ((this.f24865 + this.f24885) % 4 == 0 && this.f24871.booleanValue()) ? false : true;
        while (true) {
            m21155();
            int iM21156 = m21156(0);
            if (!z) {
                if (iM21156 == 47) {
                    this.f24884 = true;
                    m21160();
                    m21155();
                    m21150('>');
                    break;
                }
                if (iM21156 == 62) {
                    m21160();
                    break;
                }
            } else if (iM21156 == 63) {
                m21160();
                m21150('>');
                return;
            }
            if (iM21156 == -1) {
                m21158("Unexpected EOF");
                throw null;
            }
            int i = this.f24876;
            int i2 = i << 2;
            int i3 = i + 1;
            this.f24876 = i3;
            int i4 = i << 1;
            if (!z2 && (i3 & (-2)) != 0) {
                this.f24876 = (i3 & 1) + 1;
            }
            String[] strArr = this.f24883;
            if (strArr.length < i2 + 4) {
                String[] strArr2 = new String[i2 + 20];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            this.f24883 = strArr;
            C17951[] c17951Arr = this.f24864;
            if (c17951Arr.length < i4 + 2) {
                C17951[] c17951Arr2 = new C17951[i4 + 10];
                System.arraycopy(c17951Arr, 0, c17951Arr2, 0, c17951Arr.length);
                c17951Arr = c17951Arr2;
            }
            this.f24864 = c17951Arr;
            C17951 c17952 = c17951Arr[i4];
            if (c17952 == null) {
                c17952 = new C17951();
                c17951Arr[i4] = c17952;
            }
            c17952.m40845(this);
            String strM21149 = m21149();
            c17952.m40844(this);
            if (strM21149.length() == 0) {
                m21158("attr name expected");
                throw null;
            }
            C17951[] c17951Arr3 = this.f24864;
            int i5 = i4 + 1;
            C17951 c17953 = c17951Arr3[i5];
            if (c17953 == null) {
                c17953 = new C17951();
                c17951Arr3[i5] = c17953;
            }
            String[] strArr3 = this.f24883;
            strArr3[i2] = "";
            int i6 = i2 + 2;
            strArr3[i2 + 1] = null;
            int i7 = i2 + 3;
            strArr3[i6] = strM21149;
            m21155();
            if (m21156(0) != 61) {
                m21158("Attr.value missing f. ".concat(strM21149));
                throw null;
            }
            m21150(C0184a.f880h);
            m21155();
            int iM21157 = m21156(0);
            if (iM21157 != 39 && iM21157 != 34) {
                m21158("attr value delimiter missing!");
                throw null;
            }
            m21160();
            c17953.m40845(this);
            int i8 = this.f24875;
            m21151(iM21157, true);
            c17953.m40844(this);
            this.f24883[i7] = m21162(i8);
            this.f24875 = i8;
            if (iM21157 != 32) {
                m21160();
            }
        }
        int i9 = this.f24880;
        this.f24880 = i9 + 1;
        int i10 = i9 << 2;
        String[] strArr4 = this.f24893;
        if (strArr4.length < i10 + 4) {
            String[] strArr5 = new String[i10 + 20];
            System.arraycopy(strArr4, 0, strArr5, 0, strArr4.length);
            strArr4 = strArr5;
        }
        this.f24893 = strArr4;
        strArr4[i10 + 3] = this.f24867;
        int i11 = this.f24880;
        int[] iArr = this.f24887;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[i11 + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f24887 = iArr2;
        }
        int[] iArr3 = this.f24887;
        int i12 = this.f24880;
        iArr3[i12] = iArr3[i12 - 1];
        for (int i13 = 0; i13 < this.f24876; i13++) {
            int i14 = i13 << 2;
            int i15 = i13 << 1;
            String str = this.f24883[i14 + 2];
            int iIndexOf = str.indexOf(58);
            if (iIndexOf != -1) {
                String strSubstring2 = str.substring(0, iIndexOf);
                strSubstring = str.substring(iIndexOf + 1);
                str = strSubstring2;
            } else {
                if (str.equals("xmlns")) {
                    strSubstring = null;
                } else {
                    continue;
                }
            }
            if (str.equals("xmlns")) {
                int[] iArr4 = this.f24887;
                int i16 = this.f24880;
                int i17 = iArr4[i16];
                iArr4[i16] = i17 + 1;
                int i18 = i17 << 1;
                String[] strArr6 = this.f24862;
                if (strArr6.length < i18 + 2) {
                    String[] strArr7 = new String[i18 + 18];
                    System.arraycopy(strArr6, 0, strArr7, 0, strArr6.length);
                    strArr6 = strArr7;
                }
                this.f24862 = strArr6;
                strArr6[i18] = strSubstring;
                String[] strArr8 = this.f24883;
                int i19 = i14 + 3;
                strArr6[i18 + 1] = strArr8[i19];
                if (strSubstring != null && strArr8[i19].equals("")) {
                    m21152("illegal empty namespace", this.f24864[i15]);
                    throw null;
                }
            } else {
                continue;
            }
        }
        for (int i20 = 0; i20 < this.f24876; i20++) {
            int i21 = i20 << 2;
            int i22 = i20 << 1;
            int i23 = i21 + 2;
            String str2 = this.f24883[i23];
            int iIndexOf2 = str2.indexOf(58);
            if (iIndexOf2 == 0) {
                m21152("illegal attribute name: ".concat(str2), this.f24864[i22]);
                throw null;
            }
            if (iIndexOf2 != -1) {
                String strSubstring3 = str2.substring(0, iIndexOf2);
                String strSubstring4 = str2.substring(iIndexOf2 + 1);
                String strM21165 = m21165(strSubstring3);
                if (strM21165 == null) {
                    C17951 c17951M56506clone = this.f24864[i22].clone();
                    c17951M56506clone.m40848(c17951M56506clone.m40842() + iIndexOf2);
                    c17951M56506clone.m40850(c17951M56506clone.m40849() + iIndexOf2);
                    m21152("Undefined Prefix: " + strSubstring3, c17951M56506clone);
                    throw null;
                }
                String[] strArr9 = this.f24883;
                strArr9[i21] = strM21165;
                strArr9[i21 + 1] = strSubstring3;
                strArr9[i23] = strSubstring4;
            }
        }
        int iIndexOf3 = this.f24867.indexOf(58);
        if (iIndexOf3 == 0) {
            m21152("illegal tag name: " + this.f24867, c17951);
            throw null;
        }
        if (iIndexOf3 != -1) {
            this.f24881 = this.f24867.substring(0, iIndexOf3);
            this.f24867 = this.f24867.substring(iIndexOf3 + 1);
        }
        String strM21166 = m21165(this.f24881);
        this.f24886 = strM21166;
        if (strM21166 == null) {
            if (this.f24881 != null) {
                C17951 c17951M56506clone2 = c17951.clone();
                c17951M56506clone2.m40848(c17951M56506clone2.m40842() + iIndexOf3);
                c17951M56506clone2.m40850(c17951M56506clone2.m40849() + iIndexOf3);
                m21152("undefined prefix: " + this.f24881, c17951M56506clone2);
                throw null;
            }
            this.f24886 = "";
        }
        String[] strArr10 = this.f24893;
        strArr10[i10] = this.f24886;
        strArr10[i10 + 1] = this.f24881;
        strArr10[i10 + 2] = this.f24867;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m21159() throws C3870, IOException {
        m21161(m21160());
        int i = this.f24875;
        while (true) {
            int iM21160 = m21160();
            if (iM21160 == 59) {
                String strM21162 = m21162(i);
                this.f24875 = i - 1;
                if (strM21162.charAt(0) == '#') {
                    m21161(strM21162.charAt(1) == 'x' ? Integer.parseInt(strM21162.substring(2), 16) : Integer.parseInt(strM21162.substring(1)));
                    return;
                }
                String str = (String) f24861.get(strM21162);
                boolean z = str == null;
                this.f24877 = z;
                if (z) {
                    m21158(C6988.m16053("unresolved: &", strM21162, C0249l.f1196b));
                    throw null;
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    m21161(str.charAt(i2));
                }
                return;
            }
            if (iM21160 < 128 && ((iM21160 < 48 || iM21160 > 57) && ((iM21160 < 97 || iM21160 > 122) && ((iM21160 < 65 || iM21160 > 90) && iM21160 != 95 && iM21160 != 45 && iM21160 != 35)))) {
                m21158("unterminated entity ref");
                throw null;
            }
            m21161(iM21160);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21151(int i, boolean z) throws C3870, IOException {
        int iM21156 = m21156(0);
        int i2 = 0;
        while (iM21156 != -1 && iM21156 != i) {
            if (i == 32 && (iM21156 <= 32 || iM21156 == 62)) {
                return;
            }
            if (iM21156 != 38) {
                m21161(m21160());
            } else if (!z) {
                return;
            } else {
                m21159();
            }
            if (iM21156 == 62 && i2 >= 2 && i != 93) {
                m21158("Illegal: ]]>");
                throw null;
            }
            i2 = iM21156 == 93 ? i2 + 1 : 0;
            iM21156 = m21156(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21150(char c) throws C3870, IOException {
        int iM21160 = m21160();
        if (iM21160 == c) {
            return;
        }
        m21158("expected: '" + c + "' actual: '" + ((char) iM21160) + "'");
        throw null;
    }

    /* JADX INFO: renamed from: ᩵ */
    private int m21160() throws IOException {
        int iM21156;
        if (this.f24863 == 0) {
            iM21156 = m21156(0);
        } else {
            int[] iArr = this.f24869;
            int i = iArr[0];
            iArr[0] = iArr[1];
            iM21156 = i;
        }
        this.f24863--;
        this.f24885++;
        this.f24872++;
        if (iM21156 == 10) {
            this.f24865++;
            this.f24885 = 1;
        }
        return iM21156;
    }

    /* JADX INFO: renamed from: ۜ */
    private int m21156(int i) throws IOException {
        int i2;
        while (true) {
            int i3 = this.f24863;
            int[] iArr = this.f24869;
            if (i >= i3) {
                char[] cArr = this.f24891;
                if (cArr.length <= 1) {
                    i2 = this.f24890.read();
                } else {
                    int i4 = this.f24868;
                    if (i4 < this.f24888) {
                        this.f24868 = i4 + 1;
                        i2 = cArr[i4];
                    } else {
                        int i5 = this.f24890.read(cArr, 0, cArr.length);
                        this.f24888 = i5;
                        int i6 = i5 <= 0 ? -1 : cArr[0];
                        this.f24868 = 1;
                        i2 = i6;
                    }
                }
                if (i2 == 13) {
                    this.f24892 = true;
                    int i7 = this.f24863;
                    this.f24863 = i7 + 1;
                    iArr[i7] = 10;
                } else {
                    if (i2 == 10) {
                        if (!this.f24892) {
                            int i8 = this.f24863;
                            this.f24863 = i8 + 1;
                            iArr[i8] = 10;
                        }
                    } else {
                        int i9 = this.f24863;
                        this.f24863 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    this.f24892 = false;
                }
            } else {
                return iArr[i];
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m21157(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == '$' || cCharAt == '_' || cCharAt == ':' || cCharAt >= 183)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֡ */
    private String m21149() throws C3870, IOException {
        int i = this.f24875;
        int iM21156 = m21156(0);
        if ((iM21156 < 97 || iM21156 > 122) && !((iM21156 >= 65 && iM21156 <= 90) || iM21156 == 36 || iM21156 == 95 || iM21156 == 58 || iM21156 >= 192)) {
            m21158("name expected");
            throw null;
        }
        while (true) {
            m21161(m21160());
            int iM21157 = m21156(0);
            if (iM21157 < 97 || iM21157 > 122) {
                if (iM21157 < 65 || iM21157 > 90) {
                    if (iM21157 < 48 || iM21157 > 57) {
                        if (iM21157 != 36 && iM21157 != 95 && iM21157 != 45 && iM21157 != 58 && iM21157 != 46 && iM21157 < 183) {
                            String strM21162 = m21162(i);
                            this.f24875 = i;
                            return strM21162;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ */
    private void m21155() throws IOException {
        while (true) {
            int iM21156 = m21156(0);
            if (iM21156 > 32 || iM21156 == -1) {
                return;
            } else {
                m21160();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21166(Reader reader) {
        this.f24890 = reader;
        this.f24865 = 1;
        this.f24885 = 0;
        this.f24872 = 0;
        this.f24870 = 0;
        this.f24867 = null;
        this.f24886 = null;
        this.f24884 = false;
        this.f24876 = -1;
        this.f24868 = 0;
        this.f24888 = 0;
        this.f24863 = 0;
        this.f24880 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21165(String str) {
        if (DocumentReader.RESERVED.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.f24887[this.f24880] << 1;
        while (true) {
            i -= 2;
            if (i < 0) {
                return null;
            }
            if (str == null) {
                String[] strArr = this.f24862;
                if (strArr[i] == null) {
                    return strArr[i + 1];
                }
            } else if (str.equals(this.f24862[i])) {
                return this.f24862[i + 1];
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m21182() {
        return this.f24873;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m21168() {
        return this.f24874;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m21170() {
        return this.f24882;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m21176() {
        return this.f24865;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m21171() {
        return this.f24885;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m21180() {
        return this.f24872;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m21175() {
        int i = this.f24870;
        if (i < 4) {
            return null;
        }
        if (i == 6 && this.f24877) {
            return null;
        }
        return m21162(0);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m21183() {
        return this.f24886;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m21173() {
        return this.f24867;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m21163() {
        return this.f24876;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m21177(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24883[i << 2];
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21164(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24883[(i << 2) + 2];
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17951 m21172(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24864[i << 1];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m21181(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24883[(i << 2) + 1];
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m21179(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24883[(i << 2) + 3];
    }

    /* JADX INFO: renamed from: ܳ */
    public final C17951 m21174(int i) {
        if (i >= this.f24876) {
            throw new IndexOutOfBoundsException();
        }
        return this.f24864[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m21178() {
        return this.f24870;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x019a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:132:0x01db A[LOOP:1: B:8:0x0025->B:132:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0281 A[EDGE_INSN: B:195:0x0281->B:154:0x0281 BREAK  A[LOOP:1: B:8:0x0025->B:132:0x01db], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0163 A[LOOP:2: B:83:0x015d->B:85:0x0163, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX INFO: renamed from: ۖ */
    public final int m21167() throws C3870, IOException {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int iM21160;
        boolean z2;
        int i7;
        int iM21161;
        int i8;
        this.f24875 = 0;
        this.f24889 = true;
        this.f24873 = this.f24865;
        this.f24874 = this.f24885;
        this.f24882 = this.f24872;
        int i9 = 9999;
        while (this.f24890 != null) {
            int i10 = 3;
            if (this.f24870 == 3) {
                this.f24880--;
            }
            while (true) {
                this.f24876 = -1;
                if (this.f24884) {
                    this.f24884 = false;
                    this.f24870 = i10;
                    break;
                }
                this.f24881 = null;
                this.f24867 = null;
                this.f24886 = null;
                int iM21154 = m21154();
                this.f24870 = iM21154;
                if (iM21154 == 1) {
                    break;
                }
                if (iM21154 == 2) {
                    m21153(false);
                    break;
                }
                if (iM21154 == i10) {
                    m21160();
                    m21160();
                    this.f24867 = m21149();
                    m21155();
                    m21150('>');
                    int i11 = this.f24880;
                    int i12 = (i11 - 1) << 2;
                    if (i11 == 0) {
                        m21158("element stack empty");
                        throw null;
                    }
                    int i13 = i12 + 3;
                    if (this.f24867.equals(this.f24893[i13])) {
                        String[] strArr = this.f24893;
                        this.f24886 = strArr[i12];
                        this.f24881 = strArr[i12 + 1];
                        this.f24867 = strArr[i12 + 2];
                        break;
                    }
                    m21158("expected: /" + this.f24893[i13] + " read: " + this.f24867);
                    throw null;
                }
                if (iM21154 == 4) {
                    m21151(60, true);
                    if (this.f24880 != 0 || !this.f24889) {
                        break;
                        break;
                    }
                    this.f24873 = this.f24865;
                    this.f24874 = this.f24885;
                    this.f24882 = this.f24872;
                    this.f24870 = 7;
                    break;
                }
                if (iM21154 == 6) {
                    m21159();
                    break;
                }
                m21160();
                int iM21162 = m21160();
                if (iM21162 == 63) {
                    if ((m21156(0) == 120 || m21156(0) == 88) && (m21156(1) == 109 || m21156(1) == 77)) {
                        m21160();
                        m21160();
                        if ((m21156(0) == 108 || m21156(0) == 76) && m21156(1) <= 32) {
                            if (this.f24865 != 1 || this.f24885 > 4) {
                                m21158("PI must not start with xml");
                                throw null;
                            }
                            m21153(true);
                            if (this.f24876 < 1 || !"version".equals(this.f24883[2])) {
                                m21158("version expected");
                                throw null;
                            }
                            String[] strArr2 = this.f24883;
                            String str3 = strArr2[3];
                            if (1 >= this.f24876 || !"encoding".equals(strArr2[6])) {
                                i8 = 1;
                            } else {
                                String str4 = this.f24883[7];
                                i8 = 2;
                            }
                            if (i8 < this.f24876) {
                                int i14 = i8 * 4;
                                if ("standalone".equals(this.f24883[i14 + 2])) {
                                    String str5 = this.f24883[i14 + 3];
                                    if (!"yes".equals(str5) && !"no".equals(str5)) {
                                        m21158(C21466.m48631("illegal standalone value: ", str5));
                                        throw null;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != this.f24876) {
                                m21158("illegal xmldecl");
                                throw null;
                            }
                            this.f24889 = true;
                            this.f24875 = 0;
                            i4 = EnumC5674.f13828;
                        }
                        this.f24870 = i4;
                        if (i4 == 998) {
                            break;
                        }
                        this.f24873 = this.f24865;
                        this.f24874 = this.f24885;
                        this.f24882 = this.f24872;
                        i10 = 3;
                    }
                    str = "";
                    i = 8;
                    i2 = 63;
                } else {
                    if (iM21162 != 33) {
                        m21158(C20778.m46922(iM21162, "illegal: <"));
                        throw null;
                    }
                    if (m21156(0) != 45) {
                        if (m21156(0) == 91) {
                            i3 = 5;
                            str2 = "[CDATA[";
                            i2 = 93;
                            z = true;
                        } else {
                            str = "DOCTYPE";
                            i = 10;
                            i2 = -1;
                        }
                        for (i5 = 0; i5 < str2.length(); i5++) {
                            m21150(str2.charAt(i5));
                        }
                        if (i3 == 10) {
                            z2 = false;
                            i7 = 1;
                            while (true) {
                                iM21161 = m21160();
                                if (iM21161 != -1) {
                                    m21158("Unexpected EOF");
                                    throw null;
                                }
                                if (iM21161 != 39) {
                                    z2 = !z2;
                                } else if (iM21161 != 60) {
                                    if (iM21161 == 62 && !z2 && (i7 = i7 - 1) == 0) {
                                        break;
                                    }
                                } else if (!z2) {
                                    i7++;
                                }
                                if (z) {
                                    m21161(iM21161);
                                }
                            }
                        } else {
                            i6 = 0;
                            while (true) {
                                iM21160 = m21160();
                                if (iM21160 != -1) {
                                    m21158("Unexpected EOF");
                                    throw null;
                                }
                                if (z) {
                                    m21161(iM21160);
                                }
                                if ((i2 == 63 || iM21160 == i2) && m21156(0) == i2 && m21156(1) == 62) {
                                    if (i2 != 45 && i6 == 45) {
                                        m21158("illegal comment delimiter: --->");
                                        throw null;
                                    }
                                    m21160();
                                    m21160();
                                    if (!z || i2 == 63) {
                                        break;
                                        break;
                                    }
                                    this.f24875--;
                                    break;
                                }
                                i6 = iM21160;
                            }
                        }
                        i4 = i3;
                        this.f24870 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f24873 = this.f24865;
                        this.f24874 = this.f24885;
                        this.f24882 = this.f24872;
                        i10 = 3;
                    } else {
                        i = 9;
                        str = "--";
                        i2 = 45;
                    }
                }
                z = false;
                int i15 = i;
                str2 = str;
                i3 = i15;
                while (i5 < str2.length()) {
                    m21150(str2.charAt(i5));
                }
                if (i3 == 10) {
                    z2 = false;
                    i7 = 1;
                    while (true) {
                        iM21161 = m21160();
                        if (iM21161 != -1) {
                            m21158("Unexpected EOF");
                            throw null;
                        }
                        if (iM21161 != 39) {
                            z2 = !z2;
                        } else if (iM21161 != 60) {
                            if (iM21161 == 62) {
                                break;
                                break;
                            }
                        } else if (!z2) {
                            i7++;
                        }
                        if (z) {
                            m21161(iM21161);
                        }
                    }
                } else {
                    i6 = 0;
                    while (true) {
                        iM21160 = m21160();
                        if (iM21160 != -1) {
                            m21158("Unexpected EOF");
                            throw null;
                        }
                        if (z) {
                            m21161(iM21160);
                        }
                        if (i2 == 63) {
                            if (i2 != 45) {
                            }
                            m21160();
                            m21160();
                            if (!z) {
                                break;
                            }
                            this.f24875--;
                            break;
                        }
                        if (i2 != 45) {
                        }
                        m21160();
                        m21160();
                        if (!z) {
                            break;
                        }
                        this.f24875--;
                        break;
                        this.f24870 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f24873 = this.f24865;
                        this.f24874 = this.f24885;
                        this.f24882 = this.f24872;
                        i10 = 3;
                        i6 = iM21160;
                    }
                }
                i4 = i3;
                this.f24870 = i4;
                if (i4 == 998) {
                    break;
                    break;
                }
                this.f24873 = this.f24865;
                this.f24874 = this.f24885;
                this.f24882 = this.f24872;
                i10 = 3;
            }
            int i16 = this.f24870;
            if (i16 < i9) {
                i9 = i16;
            }
            if (i9 <= 6 && (i9 < 4 || m21154() < 4)) {
                this.f24870 = i9;
                if (i9 > 4) {
                    this.f24870 = 4;
                }
                return this.f24870;
            }
        }
        m21158("No Input specified");
        throw null;
    }
}
