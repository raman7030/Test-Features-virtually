package l;

import android.util.Base64;
import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.۟ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5LS */
/* JADX INFO: loaded from: classes2.dex */
public final class C7184 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Map f21982 = AbstractC9608.m24536();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f21984;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21986;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f21988;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21989;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21991;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Boolean f21992;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f21993;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21994;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f21995;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21996;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f21997;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f21998;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22001;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f22002;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22003;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f22006;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f22007;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f22009;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22010;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Reader f22011;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f22012;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f22013;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String[] f22014 = new String[16];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String[] f21983 = new String[8];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int[] f22008 = new int[4];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public char[] f21999 = new char[128];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f22004 = new String[16];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16396[] f21985 = new C16396[8];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f21990 = new int[2];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C19720 f22000 = new C19720();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C16396 f21987 = new C16396();

    public C7184() {
        this.f22012 = new char[Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : 128];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m19211(String str) throws C1580 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C1580(str, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19205(String str, C16396 c16396) throws C1580 {
        if (str.length() >= 100) {
            str = str.substring(0, 100) + "\n";
        }
        throw new C1580(str, c16396);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private int m19207() throws C1580, IOException {
        int iM19209 = m19209(0);
        if (iM19209 == -1) {
            int i = this.f22001;
            if (i == 0) {
                return 1;
            }
            m19211(C9045.m23341(new StringBuilder("expected: </"), this.f22014[((i - 1) << 2) + 3], ">"));
            throw null;
        }
        if (iM19209 == 38) {
            return 6;
        }
        if (iM19209 != 60) {
            return 4;
        }
        int iM192010 = m19209(1);
        if (iM192010 == 33) {
            return EnumC3478.f11008;
        }
        if (iM192010 == 47) {
            return 3;
        }
        if (iM192010 != 63) {
            return 2;
        }
        return EnumC3478.f11008;
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
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m19215(int i) {
        int i2;
        char c;
        char[] cArr = this.f21999;
        int i3 = this.f21996 - i;
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
        C19720 c19720 = this.f22000;
        String str = (String) c19720.get(i4);
        if (str != null && str.length() == i3) {
            for (int i5 = 0; i5 < i3; i5++) {
                if (cArr[i5 + i] == str.charAt(i5)) {
                }
            }
            return str;
        }
        String str2 = new String(cArr, i, i3);
        c19720.mo2318(i4, str2);
        return str2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m19214(int i) {
        this.f22010 &= i <= 32;
        int i2 = this.f21996;
        char[] cArr = this.f21999;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[C23868.m52580(i2, 4, 3, 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f21999 = cArr2;
        }
        char[] cArr3 = this.f21999;
        int i3 = this.f21996;
        this.f21996 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16396 m19222() {
        return this.f21987;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19206(boolean z) throws C1580, IOException {
        String strSubstring;
        if (!z) {
            m19213();
        }
        C16396 c16396 = this.f21987;
        c16396.m38628(this);
        this.f21988 = m19202();
        c16396.m38627(this);
        this.f21997 = 0;
        if (this.f21992 == null) {
            try {
                ClassLoader classLoader = C7184.class.getClassLoader();
                C11003.requireNonNull(classLoader);
                if (classLoader.loadClass(new String(Base64.decode("YW5kcm9pZC5zdXBwb3J0LmNvbXBhdC5S", 0))) != null || classLoader.loadClass(new String(Base64.decode("bmV0LmRvbmdsaXUuYXBrLnBhcnNlci5wYXJzZXIuWG1sVHJhbnNsYXRvcg==", 0))) != null) {
                    this.f21992 = Boolean.TRUE;
                } else {
                    this.f21992 = Boolean.FALSE;
                }
            } catch (Throwable unused) {
                this.f21992 = Boolean.FALSE;
            }
        }
        boolean z2 = ((this.f21986 + this.f22006) % 4 == 0 && this.f21992.booleanValue()) ? false : true;
        while (true) {
            m19208();
            int iM19209 = m19209(0);
            if (!z) {
                if (iM19209 == 47) {
                    this.f22005 = true;
                    m19213();
                    m19208();
                    m19203('>');
                    break;
                }
                if (iM19209 == 62) {
                    m19213();
                    break;
                }
            } else if (iM19209 == 63) {
                m19213();
                m19203('>');
                return;
            }
            if (iM19209 == -1) {
                m19211("Unexpected EOF");
                throw null;
            }
            int i = this.f21997;
            int i2 = i << 2;
            int i3 = i + 1;
            this.f21997 = i3;
            int i4 = i << 1;
            if (!z2 && (i3 & (-2)) != 0) {
                this.f21997 = (i3 & 1) + 1;
            }
            String[] strArr = this.f22004;
            if (strArr.length < i2 + 4) {
                String[] strArr2 = new String[i2 + 20];
                System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
                strArr = strArr2;
            }
            this.f22004 = strArr;
            C16396[] c16396Arr = this.f21985;
            if (c16396Arr.length < i4 + 2) {
                C16396[] c16396Arr2 = new C16396[i4 + 10];
                System.arraycopy(c16396Arr, 0, c16396Arr2, 0, c16396Arr.length);
                c16396Arr = c16396Arr2;
            }
            this.f21985 = c16396Arr;
            C16396 c16397 = c16396Arr[i4];
            if (c16397 == null) {
                c16397 = new C16396();
                c16396Arr[i4] = c16397;
            }
            c16397.m38628(this);
            String strM19202 = m19202();
            c16397.m38627(this);
            if (strM19202.length() == 0) {
                m19211("attr name expected");
                throw null;
            }
            C16396[] c16396Arr3 = this.f21985;
            int i5 = i4 + 1;
            C16396 c16398 = c16396Arr3[i5];
            if (c16398 == null) {
                c16398 = new C16396();
                c16396Arr3[i5] = c16398;
            }
            String[] strArr3 = this.f22004;
            strArr3[i2] = "";
            int i6 = i2 + 2;
            strArr3[i2 + 1] = null;
            int i7 = i2 + 3;
            strArr3[i6] = strM19202;
            m19208();
            if (m19209(0) != 61) {
                m19211("Attr.value missing f. ".concat(strM19202));
                throw null;
            }
            m19203(a.h);
            m19208();
            int iM192010 = m19209(0);
            if (iM192010 != 39 && iM192010 != 34) {
                m19211("attr value delimiter missing!");
                throw null;
            }
            m19213();
            c16398.m38628(this);
            int i8 = this.f21996;
            m19204(iM192010, true);
            c16398.m38627(this);
            this.f22004[i7] = m19215(i8);
            this.f21996 = i8;
            if (iM192010 != 32) {
                m19213();
            }
        }
        int i9 = this.f22001;
        this.f22001 = i9 + 1;
        int i10 = i9 << 2;
        String[] strArr4 = this.f22014;
        if (strArr4.length < i10 + 4) {
            String[] strArr5 = new String[i10 + 20];
            System.arraycopy(strArr4, 0, strArr5, 0, strArr4.length);
            strArr4 = strArr5;
        }
        this.f22014 = strArr4;
        strArr4[i10 + 3] = this.f21988;
        int i11 = this.f22001;
        int[] iArr = this.f22008;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[i11 + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f22008 = iArr2;
        }
        int[] iArr3 = this.f22008;
        int i12 = this.f22001;
        iArr3[i12] = iArr3[i12 - 1];
        for (int i13 = 0; i13 < this.f21997; i13++) {
            int i14 = i13 << 2;
            int i15 = i13 << 1;
            String str = this.f22004[i14 + 2];
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
                int[] iArr4 = this.f22008;
                int i16 = this.f22001;
                int i17 = iArr4[i16];
                iArr4[i16] = i17 + 1;
                int i18 = i17 << 1;
                String[] strArr6 = this.f21983;
                if (strArr6.length < i18 + 2) {
                    String[] strArr7 = new String[i18 + 18];
                    System.arraycopy(strArr6, 0, strArr7, 0, strArr6.length);
                    strArr6 = strArr7;
                }
                this.f21983 = strArr6;
                strArr6[i18] = strSubstring;
                String[] strArr8 = this.f22004;
                int i19 = i14 + 3;
                strArr6[i18 + 1] = strArr8[i19];
                if (strSubstring != null && strArr8[i19].equals("")) {
                    m19205("illegal empty namespace", this.f21985[i15]);
                    throw null;
                }
            } else {
                continue;
            }
        }
        for (int i20 = 0; i20 < this.f21997; i20++) {
            int i21 = i20 << 2;
            int i22 = i20 << 1;
            int i23 = i21 + 2;
            String str2 = this.f22004[i23];
            int iIndexOf2 = str2.indexOf(58);
            if (iIndexOf2 == 0) {
                m19205("illegal attribute name: ".concat(str2), this.f21985[i22]);
                throw null;
            }
            if (iIndexOf2 != -1) {
                String strSubstring3 = str2.substring(0, iIndexOf2);
                String strSubstring4 = str2.substring(iIndexOf2 + 1);
                String strM19218 = m19218(strSubstring3);
                if (strM19218 == null) {
                    C16396 c16396M38636clone = this.f21985[i22].clone();
                    c16396M38636clone.m38631(c16396M38636clone.m38625() + iIndexOf2);
                    c16396M38636clone.m38633(c16396M38636clone.m38632() + iIndexOf2);
                    m19205("Undefined Prefix: " + strSubstring3, c16396M38636clone);
                    throw null;
                }
                String[] strArr9 = this.f22004;
                strArr9[i21] = strM19218;
                strArr9[i21 + 1] = strSubstring3;
                strArr9[i23] = strSubstring4;
            }
        }
        int iIndexOf3 = this.f21988.indexOf(58);
        if (iIndexOf3 == 0) {
            m19205("illegal tag name: " + this.f21988, c16396);
            throw null;
        }
        if (iIndexOf3 != -1) {
            this.f22002 = this.f21988.substring(0, iIndexOf3);
            this.f21988 = this.f21988.substring(iIndexOf3 + 1);
        }
        String strM19219 = m19218(this.f22002);
        this.f22007 = strM19219;
        if (strM19219 == null) {
            if (this.f22002 != null) {
                C16396 c16396M38636clone2 = c16396.clone();
                c16396M38636clone2.m38631(c16396M38636clone2.m38625() + iIndexOf3);
                c16396M38636clone2.m38633(c16396M38636clone2.m38632() + iIndexOf3);
                m19205("undefined prefix: " + this.f22002, c16396M38636clone2);
                throw null;
            }
            this.f22007 = "";
        }
        String[] strArr10 = this.f22014;
        strArr10[i10] = this.f22007;
        strArr10[i10 + 1] = this.f22002;
        strArr10[i10 + 2] = this.f21988;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19212() throws C1580, IOException {
        m19214(m19213());
        int i = this.f21996;
        while (true) {
            int iM19213 = m19213();
            if (iM19213 == 59) {
                String strM19215 = m19215(i);
                this.f21996 = i - 1;
                if (strM19215.charAt(0) == '#') {
                    m19214(strM19215.charAt(1) == 'x' ? Integer.parseInt(strM19215.substring(2), 16) : Integer.parseInt(strM19215.substring(1)));
                    return;
                }
                String str = (String) f21982.get(strM19215);
                boolean z = str == null;
                this.f21998 = z;
                if (z) {
                    m19211(C4860.m14172("unresolved: &", strM19215, l.b));
                    throw null;
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    m19214(str.charAt(i2));
                }
                return;
            }
            if (iM19213 < 128 && ((iM19213 < 48 || iM19213 > 57) && ((iM19213 < 97 || iM19213 > 122) && ((iM19213 < 65 || iM19213 > 90) && iM19213 != 95 && iM19213 != 45 && iM19213 != 35)))) {
                m19211("unterminated entity ref");
                throw null;
            }
            m19214(iM19213);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19204(int i, boolean z) throws C1580, IOException {
        int iM19209 = m19209(0);
        int i2 = 0;
        while (iM19209 != -1 && iM19209 != i) {
            if (i == 32 && (iM19209 <= 32 || iM19209 == 62)) {
                return;
            }
            if (iM19209 != 38) {
                m19214(m19213());
            } else if (!z) {
                return;
            } else {
                m19212();
            }
            if (iM19209 == 62 && i2 >= 2 && i != 93) {
                m19211("Illegal: ]]>");
                throw null;
            }
            i2 = iM19209 == 93 ? i2 + 1 : 0;
            iM19209 = m19209(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19203(char c) throws C1580, IOException {
        int iM19213 = m19213();
        if (iM19213 == c) {
            return;
        }
        m19211("expected: '" + c + "' actual: '" + ((char) iM19213) + "'");
        throw null;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private int m19213() throws IOException {
        int iM19209;
        if (this.f21984 == 0) {
            iM19209 = m19209(0);
        } else {
            int[] iArr = this.f21990;
            int i = iArr[0];
            iArr[0] = iArr[1];
            iM19209 = i;
        }
        this.f21984--;
        this.f22006++;
        this.f21993++;
        if (iM19209 == 10) {
            this.f21986++;
            this.f22006 = 1;
        }
        return iM19209;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m19209(int i) throws IOException {
        int i2;
        while (true) {
            int i3 = this.f21984;
            int[] iArr = this.f21990;
            if (i >= i3) {
                char[] cArr = this.f22012;
                if (cArr.length <= 1) {
                    i2 = this.f22011.read();
                } else {
                    int i4 = this.f21989;
                    if (i4 < this.f22009) {
                        this.f21989 = i4 + 1;
                        i2 = cArr[i4];
                    } else {
                        int i5 = this.f22011.read(cArr, 0, cArr.length);
                        this.f22009 = i5;
                        int i6 = i5 <= 0 ? -1 : cArr[0];
                        this.f21989 = 1;
                        i2 = i6;
                    }
                }
                if (i2 == 13) {
                    this.f22013 = true;
                    int i7 = this.f21984;
                    this.f21984 = i7 + 1;
                    iArr[i7] = 10;
                } else {
                    if (i2 == 10) {
                        if (!this.f22013) {
                            int i8 = this.f21984;
                            this.f21984 = i8 + 1;
                            iArr[i8] = 10;
                        }
                    } else {
                        int i9 = this.f21984;
                        this.f21984 = i9 + 1;
                        iArr[i9] = i2;
                    }
                    this.f22013 = false;
                }
            } else {
                return iArr[i];
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m19210(String str) {
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

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private String m19202() throws C1580, IOException {
        int i = this.f21996;
        int iM19209 = m19209(0);
        if ((iM19209 < 97 || iM19209 > 122) && !((iM19209 >= 65 && iM19209 <= 90) || iM19209 == 36 || iM19209 == 95 || iM19209 == 58 || iM19209 >= 192)) {
            m19211("name expected");
            throw null;
        }
        while (true) {
            m19214(m19213());
            int iM192010 = m19209(0);
            if (iM192010 < 97 || iM192010 > 122) {
                if (iM192010 < 65 || iM192010 > 90) {
                    if (iM192010 < 48 || iM192010 > 57) {
                        if (iM192010 != 36 && iM192010 != 95 && iM192010 != 45 && iM192010 != 58 && iM192010 != 46 && iM192010 < 183) {
                            String strM19215 = m19215(i);
                            this.f21996 = i;
                            return strM19215;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m19208() throws IOException {
        while (true) {
            int iM19209 = m19209(0);
            if (iM19209 > 32 || iM19209 == -1) {
                return;
            } else {
                m19213();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19219(Reader reader) {
        this.f22011 = reader;
        this.f21986 = 1;
        this.f22006 = 0;
        this.f21993 = 0;
        this.f21991 = 0;
        this.f21988 = null;
        this.f22007 = null;
        this.f22005 = false;
        this.f21997 = -1;
        this.f21989 = 0;
        this.f22009 = 0;
        this.f21984 = 0;
        this.f22001 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19218(String str) {
        if (DocumentReader.RESERVED.equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        int i = this.f22008[this.f22001] << 1;
        while (true) {
            i -= 2;
            if (i < 0) {
                return null;
            }
            if (str == null) {
                String[] strArr = this.f21983;
                if (strArr[i] == null) {
                    return strArr[i + 1];
                }
            } else if (str.equals(this.f21983[i])) {
                return this.f21983[i + 1];
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19235() {
        return this.f21994;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m19221() {
        return this.f21995;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m19223() {
        return this.f22003;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19229() {
        return this.f21986;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19224() {
        return this.f22006;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m19233() {
        return this.f21993;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m19228() {
        int i = this.f21991;
        if (i < 4) {
            return null;
        }
        if (i == 6 && this.f21998) {
            return null;
        }
        return m19215(0);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m19236() {
        return this.f22007;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m19226() {
        return this.f21988;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19216() {
        return this.f21997;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m19230(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[i << 2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19217(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 2];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16396 m19225(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f21985[i << 1];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m19234(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 1];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m19232(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f22004[(i << 2) + 3];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16396 m19227(int i) {
        if (i >= this.f21997) {
            throw new IndexOutOfBoundsException();
        }
        return this.f21985[(i << 1) + 1];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19231() {
        return this.f21991;
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
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m19220() throws C1580, IOException {
        String str;
        int i;
        int i2;
        int i3;
        String str2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int iM19213;
        boolean z2;
        int i7;
        int iM19214;
        int i8;
        this.f21996 = 0;
        this.f22010 = true;
        this.f21994 = this.f21986;
        this.f21995 = this.f22006;
        this.f22003 = this.f21993;
        int i9 = 9999;
        while (this.f22011 != null) {
            int i10 = 3;
            if (this.f21991 == 3) {
                this.f22001--;
            }
            while (true) {
                this.f21997 = -1;
                if (this.f22005) {
                    this.f22005 = false;
                    this.f21991 = i10;
                    break;
                }
                this.f22002 = null;
                this.f21988 = null;
                this.f22007 = null;
                int iM19207 = m19207();
                this.f21991 = iM19207;
                if (iM19207 == 1) {
                    break;
                }
                if (iM19207 == 2) {
                    m19206(false);
                    break;
                }
                if (iM19207 == i10) {
                    m19213();
                    m19213();
                    this.f21988 = m19202();
                    m19208();
                    m19203('>');
                    int i11 = this.f22001;
                    int i12 = (i11 - 1) << 2;
                    if (i11 == 0) {
                        m19211("element stack empty");
                        throw null;
                    }
                    int i13 = i12 + 3;
                    if (this.f21988.equals(this.f22014[i13])) {
                        String[] strArr = this.f22014;
                        this.f22007 = strArr[i12];
                        this.f22002 = strArr[i12 + 1];
                        this.f21988 = strArr[i12 + 2];
                        break;
                    }
                    m19211("expected: /" + this.f22014[i13] + " read: " + this.f21988);
                    throw null;
                }
                if (iM19207 == 4) {
                    m19204(60, true);
                    if (this.f22001 != 0 || !this.f22010) {
                        break;
                        break;
                    }
                    this.f21994 = this.f21986;
                    this.f21995 = this.f22006;
                    this.f22003 = this.f21993;
                    this.f21991 = 7;
                    break;
                }
                if (iM19207 == 6) {
                    m19212();
                    break;
                }
                m19213();
                int iM19215 = m19213();
                if (iM19215 == 63) {
                    if ((m19209(0) == 120 || m19209(0) == 88) && (m19209(1) == 109 || m19209(1) == 77)) {
                        m19213();
                        m19213();
                        if ((m19209(0) == 108 || m19209(0) == 76) && m19209(1) <= 32) {
                            if (this.f21986 != 1 || this.f22006 > 4) {
                                m19211("PI must not start with xml");
                                throw null;
                            }
                            m19206(true);
                            if (this.f21997 < 1 || !"version".equals(this.f22004[2])) {
                                m19211("version expected");
                                throw null;
                            }
                            String[] strArr2 = this.f22004;
                            String str3 = strArr2[3];
                            if (1 >= this.f21997 || !"encoding".equals(strArr2[6])) {
                                i8 = 1;
                            } else {
                                String str4 = this.f22004[7];
                                i8 = 2;
                            }
                            if (i8 < this.f21997) {
                                int i14 = i8 * 4;
                                if ("standalone".equals(this.f22004[i14 + 2])) {
                                    String str5 = this.f22004[i14 + 3];
                                    if (!"yes".equals(str5) && !"no".equals(str5)) {
                                        m19211(C20094.m46315("illegal standalone value: ", str5));
                                        throw null;
                                    }
                                    i8++;
                                }
                            }
                            if (i8 != this.f21997) {
                                m19211("illegal xmldecl");
                                throw null;
                            }
                            this.f22010 = true;
                            this.f21996 = 0;
                            i4 = EnumC3478.f11023;
                        }
                        this.f21991 = i4;
                        if (i4 == 998) {
                            break;
                        }
                        this.f21994 = this.f21986;
                        this.f21995 = this.f22006;
                        this.f22003 = this.f21993;
                        i10 = 3;
                    }
                    str = "";
                    i = 8;
                    i2 = 63;
                } else {
                    if (iM19215 != 33) {
                        m19211(C19370.m44628(iM19215, "illegal: <"));
                        throw null;
                    }
                    if (m19209(0) != 45) {
                        if (m19209(0) == 91) {
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
                            m19203(str2.charAt(i5));
                        }
                        if (i3 == 10) {
                            z2 = false;
                            i7 = 1;
                            while (true) {
                                iM19214 = m19213();
                                if (iM19214 != -1) {
                                    m19211("Unexpected EOF");
                                    throw null;
                                }
                                if (iM19214 != 39) {
                                    z2 = !z2;
                                } else if (iM19214 != 60) {
                                    if (iM19214 == 62 && !z2 && (i7 = i7 - 1) == 0) {
                                        break;
                                    }
                                } else if (!z2) {
                                    i7++;
                                }
                                if (z) {
                                    m19214(iM19214);
                                }
                            }
                        } else {
                            i6 = 0;
                            while (true) {
                                iM19213 = m19213();
                                if (iM19213 != -1) {
                                    m19211("Unexpected EOF");
                                    throw null;
                                }
                                if (z) {
                                    m19214(iM19213);
                                }
                                if ((i2 == 63 || iM19213 == i2) && m19209(0) == i2 && m19209(1) == 62) {
                                    if (i2 != 45 && i6 == 45) {
                                        m19211("illegal comment delimiter: --->");
                                        throw null;
                                    }
                                    m19213();
                                    m19213();
                                    if (!z || i2 == 63) {
                                        break;
                                        break;
                                    }
                                    this.f21996--;
                                    break;
                                }
                                i6 = iM19213;
                            }
                        }
                        i4 = i3;
                        this.f21991 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f21994 = this.f21986;
                        this.f21995 = this.f22006;
                        this.f22003 = this.f21993;
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
                    m19203(str2.charAt(i5));
                }
                if (i3 == 10) {
                    z2 = false;
                    i7 = 1;
                    while (true) {
                        iM19214 = m19213();
                        if (iM19214 != -1) {
                            m19211("Unexpected EOF");
                            throw null;
                        }
                        if (iM19214 != 39) {
                            z2 = !z2;
                        } else if (iM19214 != 60) {
                            if (iM19214 == 62) {
                                break;
                                break;
                            }
                        } else if (!z2) {
                            i7++;
                        }
                        if (z) {
                            m19214(iM19214);
                        }
                    }
                } else {
                    i6 = 0;
                    while (true) {
                        iM19213 = m19213();
                        if (iM19213 != -1) {
                            m19211("Unexpected EOF");
                            throw null;
                        }
                        if (z) {
                            m19214(iM19213);
                        }
                        if (i2 == 63) {
                            if (i2 != 45) {
                            }
                            m19213();
                            m19213();
                            if (!z) {
                                break;
                            }
                            this.f21996--;
                            break;
                        }
                        if (i2 != 45) {
                        }
                        m19213();
                        m19213();
                        if (!z) {
                            break;
                        }
                        this.f21996--;
                        break;
                        this.f21991 = i4;
                        if (i4 == 998) {
                            break;
                            break;
                        }
                        this.f21994 = this.f21986;
                        this.f21995 = this.f22006;
                        this.f22003 = this.f21993;
                        i10 = 3;
                        i6 = iM19213;
                    }
                }
                i4 = i3;
                this.f21991 = i4;
                if (i4 == 998) {
                    break;
                    break;
                }
                this.f21994 = this.f21986;
                this.f21995 = this.f22006;
                this.f22003 = this.f21993;
                i10 = 3;
            }
            int i16 = this.f21991;
            if (i16 < i9) {
                i9 = i16;
            }
            if (i9 <= 6 && (i9 < 4 || m19207() < 4)) {
                this.f21991 = i9;
                if (i9 > 4) {
                    this.f21991 = 4;
                }
                return this.f21991;
            }
        }
        m19211("No Input specified");
        throw null;
    }
}
