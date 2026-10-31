package l;

import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܶ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15440 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f47291 = File.separator;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f47292;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f47293;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47294;

    public abstract String getName();

    public abstract String getParent();

    /* JADX INFO: renamed from: ֡֫ */
    public abstract boolean mo27911();

    /* JADX INFO: renamed from: ֨ */
    public boolean mo18535() {
        return true;
    }

    /* JADX INFO: renamed from: ֨֫ */
    public abstract boolean mo23113();

    /* JADX INFO: renamed from: ֨ۧ */
    public boolean mo27912() {
        return this instanceof C6849;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo18537(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public abstract boolean mo23545();

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean mo27917() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo23546();

    /* JADX INFO: renamed from: ۚۧ */
    public boolean mo29016() {
        return false;
    }

    /* JADX INFO: renamed from: ۛ֫ */
    public abstract long mo23117();

    /* JADX INFO: renamed from: ۜ */
    public abstract ParcelFileDescriptor mo27921(String str);

    /* JADX INFO: renamed from: ۜۧ */
    public abstract FileChannel mo27922();

    /* JADX INFO: renamed from: ۠ */
    public abstract boolean mo27924();

    /* JADX INFO: renamed from: ۠֫ */
    public abstract boolean mo23119();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo35194() {
        return true;
    }

    /* JADX INFO: renamed from: ۢۧ */
    public abstract InputStream mo27926();

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo23120();

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean mo23547() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract List mo23549(boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo23551(AbstractC15440 abstractC15440);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo29017(InterfaceC17066 interfaceC17066) {
        return false;
    }

    /* JADX INFO: renamed from: ۫֫ */
    public boolean mo35196() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract boolean mo23552();

    /* JADX INFO: renamed from: ܰ֫ */
    public abstract List mo27931();

    /* JADX INFO: renamed from: ܶ */
    public boolean mo18540() {
        return true;
    }

    /* JADX INFO: renamed from: ܺ */
    public abstract boolean mo27933();

    /* JADX INFO: renamed from: ܺ֫ */
    public abstract String mo23554();

    /* JADX INFO: renamed from: ܽ */
    public abstract OutputStream mo23555(boolean z);

    /* JADX INFO: renamed from: ܿ֫ */
    public String mo27935() {
        return null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo27936();

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean mo31568() {
        return false;
    }

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean mo36530() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract InterfaceC2245 mo23557(String str);

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean mo23126() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC15440 mo23559() {
        return this;
    }

    /* JADX INFO: renamed from: ᩺֫ */
    public abstract long mo23127();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getName().compareToIgnoreCase(((AbstractC15440) obj).getName());
    }

    static {
        String str = File.pathSeparator;
        char c = File.separatorChar;
        char c2 = File.pathSeparatorChar;
        f47293 = Pattern.compile("(.*) \\((\\d+)\\)");
        f47292 = Pattern.compile("(.*)\\((\\d+)\\)");
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m36487(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf);
        String[] strArr = {".1", ".apk.1", ".png", ".9.png", ".gz", ".tar.gz", ".xz", ".tar.xz", ".zst", ".tar.zst", ".zstd", ".tar.zstd", ".bz2", ".tar.bz2", ".lz4", ".tar.lz4"};
        for (int i = 0; i < 16; i += 2) {
            if (strSubstring.equals(strArr[i])) {
                int i2 = i + 1;
                if (C9679.m24617((CharSequence) strArr[i2], str)) {
                    return str.substring(str.length() - strArr[i2].length());
                }
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String m36517() {
        String name = getName();
        return name.substring(0, name.length() - m36487(name).length());
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final String m36505() {
        return m36487(getName());
    }

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final String m36511() {
        String parent = getParent();
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException(C4153.m12552(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final Uri m36522() {
        return Uri.fromFile(new File(mo23554()));
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public AbstractC15440 mo32032() {
        return m36514();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m36519() {
        String strMo27935 = mo27935();
        if (strMo27935 == null) {
            return null;
        }
        if (strMo27935.startsWith("/")) {
            return strMo27935;
        }
        AbstractC15440 abstractC15440Mo32032 = mo32032();
        while (abstractC15440Mo32032 != null) {
            if (strMo27935.isEmpty() || strMo27935.equals(".")) {
                return abstractC15440Mo32032.mo23554();
            }
            if (strMo27935.equals("..")) {
                return abstractC15440Mo32032.getParent();
            }
            if (strMo27935.startsWith("./")) {
                strMo27935 = strMo27935.substring(2);
            } else if (strMo27935.startsWith("../")) {
                strMo27935 = strMo27935.substring(3);
                abstractC15440Mo32032 = abstractC15440Mo32032.m36536();
            } else {
                return abstractC15440Mo32032.m36526(strMo27935).mo23554();
            }
        }
        return mo23554();
    }

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC10503 mo23558() {
        return new C20381(this);
    }

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final boolean m36533() {
        return mo27935() != null;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public String mo32031() {
        return m36533() ? m36519() : mo23554();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo27934(String str) {
        C20402.m46727(str, mo23554());
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36536() {
        String parent = getParent();
        if (parent != null) {
            return C16999.m39866(parent, new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36514() {
        AbstractC15440 abstractC15440M36536 = m36536();
        if (abstractC15440M36536 != null) {
            return abstractC15440M36536;
        }
        throw new NullPointerException(C4153.m12552(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36524(String str) {
        return C16999.m39866(m36511(), str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36526(String str) {
        return C16999.m39866(mo23554(), str);
    }

    /* JADX INFO: renamed from: ֫֫ */
    public String mo23544() {
        return mo23559().mo23554();
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public Uri mo31567() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final Uri m36509() {
        return C11914.m29045(mo23554());
    }

    /* JADX INFO: renamed from: ۫ */
    public boolean mo27929() {
        return mo23552();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m36490(InterfaceC17066 interfaceC17066) {
        if (!mo23113()) {
            return mo23127();
        }
        List listMo23549 = mo23549(true);
        long jM36490 = 0;
        for (int i = 0; i < listMo23549.size() && !interfaceC17066.mo1526(); i++) {
            jM36490 += ((AbstractC15440) listMo23549.get(i)).m36490(interfaceC17066);
        }
        return jM36490;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m36488() {
        String strMo23544 = mo23544();
        int i = C16999.f52136;
        return new File(strMo23544).canRead();
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo27919() {
        return m36488();
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        return new C18970(this, interfaceC6975);
    }

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m36518() {
        InputStream inputStreamMo27926 = mo27926();
        if (inputStreamMo27926 instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamMo27926;
        }
        return new BufferedInputStream(inputStreamMo27926);
    }

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final BufferedReader m36521() {
        return new BufferedReader(new InputStreamReader(mo27926(), StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream m36525() {
        OutputStream outputStreamMo23555 = mo23555(false);
        if (outputStreamMo23555 instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStreamMo23555;
        }
        return new BufferedOutputStream(outputStreamMo23555);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C23411 m36513(String str) {
        return C0127.m1200(mo23557(str));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00c7 */
    /* JADX WARN: Code duplicated, block: B:114:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0100 A[Catch: all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0144, blocks: (B:76:0x0100, B:102:0x0143, B:101:0x0140, B:74:0x00ee, B:98:0x013b), top: B:116:0x00ee, inners: #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0118  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36500(AbstractC15440 abstractC15440, C17558 c17558, InterfaceC5627 interfaceC5627) throws IOException {
        boolean[] zArr;
        InputStream inputStreamMo27926;
        C2036 c2036M6620;
        C19676 c19676;
        boolean zMo23120 = abstractC15440.mo23120();
        if (!zMo23120 && c17558 != null) {
            c17558.m41050(this);
        }
        long jMo23127 = mo23127();
        if (!mo18535() || !abstractC15440.mo18540() || ((mo36530() && abstractC15440.mo36530()) || (((this instanceof C6849) || (abstractC15440 instanceof C6849)) && (mo23127() > 524288000 || C22518.m50492().mo2658())))) {
            zArr = new boolean[]{false};
            try {
                inputStreamMo27926 = mo27926();
                try {
                    try {
                        abstractC15440.mo27915(new C5564(zArr, inputStreamMo27926, jMo23127, interfaceC5627)).m47984();
                        if (inputStreamMo27926 != null) {
                            inputStreamMo27926.close();
                        }
                        if (zArr[0] && interfaceC5627 != null && interfaceC5627.mo1526()) {
                            abstractC15440.mo23552();
                        }
                        if (abstractC15440.mo27912() && C4925.m14321()) {
                            abstractC15440.mo18537(mo23117());
                        }
                    } catch (Throwable th) {
                        if (zArr[0] && interfaceC5627 != null && interfaceC5627.mo1526()) {
                            abstractC15440.mo23552();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (inputStreamMo27926 != null) {
                        try {
                            inputStreamMo27926.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e) {
                C12598.m30862(this, e);
                throw e;
            }
        } else if (abstractC15440 instanceof C11293) {
            C11293 c11293 = (C11293) abstractC15440;
            if (c11293.m27916() || (c11293.m27923() && C22518.m50492().mo2658())) {
                zArr = new boolean[]{false};
                inputStreamMo27926 = mo27926();
                abstractC15440.mo27915(new C5564(zArr, inputStreamMo27926, jMo23127, interfaceC5627)).m47984();
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                if (zArr[0]) {
                    abstractC15440.mo23552();
                }
                if (abstractC15440.mo27912()) {
                    abstractC15440.mo18537(mo23117());
                }
            } else if ((!(this instanceof C11293) && ((C11293) this).m27923() && C22518.m50492().mo2658()) || (Build.VERSION.SDK_INT <= 22 && C22518.m50492().mo2657() && (mo36530() || abstractC15440.mo36530()))) {
                zArr = new boolean[]{false};
                inputStreamMo27926 = mo27926();
                abstractC15440.mo27915(new C5564(zArr, inputStreamMo27926, jMo23127, interfaceC5627)).m47984();
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                if (zArr[0]) {
                    abstractC15440.mo23552();
                }
                if (abstractC15440.mo27912()) {
                    abstractC15440.mo18537(mo23117());
                }
            } else {
                C19697 c19697M10607 = C3468.m10607(false);
                c2036M6620 = C2036.m6620(interfaceC5627);
                if (c2036M6620 == null) {
                    c19676 = null;
                } else {
                    try {
                        c19676 = new C19676(c2036M6620, jMo23127);
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message != null && message.startsWith("Unable to open source file")) {
                            C12598.m30862(this, e2);
                        }
                        throw e2;
                    }
                }
                abstractC15440.mo27915(new C0624(this, c19697M10607, c19676)).m47984();
                c19697M10607.m45389();
                if (c2036M6620 != null) {
                    c2036M6620.mo6622();
                }
            }
        } else if (!(this instanceof C11293)) {
            C19697 c19697M10608 = C3468.m10607(false);
            c2036M6620 = C2036.m6620(interfaceC5627);
            if (c2036M6620 == null) {
                c19676 = null;
            } else {
                c19676 = new C19676(c2036M6620, jMo23127);
            }
            abstractC15440.mo27915(new C0624(this, c19697M10608, c19676)).m47984();
            c19697M10608.m45389();
            if (c2036M6620 != null) {
                c2036M6620.mo6622();
            }
        } else {
            C19697 c19697M10609 = C3468.m10607(false);
            c2036M6620 = C2036.m6620(interfaceC5627);
            if (c2036M6620 == null) {
                c19676 = null;
            } else {
                c19676 = new C19676(c2036M6620, jMo23127);
            }
            abstractC15440.mo27915(new C0624(this, c19697M10609, c19676)).m47984();
            c19697M10609.m45389();
            if (c2036M6620 != null) {
                c2036M6620.mo6622();
            }
        }
        if ((interfaceC5627 == null || !interfaceC5627.mo1526()) && !zMo23120) {
            if (c17558 != null) {
                c17558.m41052(abstractC15440);
            }
            C16999.m39870(abstractC15440);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36495(OutputStream outputStream, InterfaceC1393 interfaceC1393) throws IOException {
        try {
            InputStream inputStreamMo27926 = mo27926();
            try {
                C14176.m33825(inputStreamMo27926, outputStream, mo23127(), interfaceC1393);
                inputStreamMo27926.close();
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C12598.m30862(this, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36499(AbstractC15440 abstractC15440, C17558 c17558) throws IOException {
        if (!mo23113()) {
            m36500(abstractC15440, c17558, (InterfaceC5627) null);
            return;
        }
        if (c17558 != null) {
            c17558.m41050(this);
            abstractC15440.m36508();
            c17558.m41052(abstractC15440);
        } else {
            abstractC15440.m36508();
        }
        for (AbstractC15440 abstractC15441 : mo23549(true)) {
            abstractC15441.m36499(abstractC15440.m36526(abstractC15441.getName()), c17558);
        }
    }

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m36506() throws IOException {
        InputStream inputStreamMo27926 = mo27926();
        try {
            byte[] bArrM1795 = C0349.m1795(inputStreamMo27926, (int) mo23127());
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return bArrM1795;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m36523() {
        long jMo23127 = mo23127();
        if (jMo23127 <= 20971520) {
            return m36506();
        }
        try {
            InputStream inputStreamMo27926 = mo27926();
            try {
                byte[] bArrM1794 = C0349.m1794(jMo23127, inputStreamMo27926);
                if (inputStreamMo27926 != null) {
                    inputStreamMo27926.close();
                }
                return bArrM1794;
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return m36506();
        }
    }

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final C12951 m36528() {
        return new C12951(m36506());
    }

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final String m36489() throws IOException {
        InputStream inputStreamMo27926 = mo27926();
        try {
            String strM49848 = C22194.m49848(inputStreamMo27926, Charset.defaultCharset());
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return strM49848;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final int m36512() throws IOException {
        InputStream inputStreamMo27926 = mo27926();
        try {
            byte[] bArr = new byte[4];
            C22194.m49857(inputStreamMo27926, bArr, 4);
            int iM37744 = C15972.m37744(0, bArr);
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return iM37744;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36502(byte[] bArr) {
        m36503(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36503(byte[] bArr, int i, int i2) {
        mo35195();
        mo27915(new C1330(this, bArr, i, i2, C16999.m39879(this) && !mo23120())).m47984();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36493(InputStream inputStream) {
        m36494(inputStream, -1L, (InterfaceC5627) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36494(InputStream inputStream, long j, InterfaceC5627 interfaceC5627) {
        mo35195();
        m36515(inputStream, j, interfaceC5627);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36515(InputStream inputStream, long j, InterfaceC5627 interfaceC5627) {
        mo27915(new C8386(this, inputStream, j, interfaceC5627, C16999.m39879(this) && !mo23120())).m47984();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36496(C10130 c10130) {
        m36503(c10130.m25438(), 0, c10130.size());
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m36510(String str) {
        m36502(str.getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36516(String str) throws IOException {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        mo35195();
        boolean z = C16999.m39879(this) && !mo23120();
        OutputStream outputStreamMo23555 = mo23555(true);
        try {
            outputStreamMo23555.write(bytes, 0, length);
            outputStreamMo23555.close();
            if (z) {
                C16999.m39882(this);
            }
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36527() {
        return C16999.m39868(this, ".tmp");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36535(String str) {
        return C16999.m39868(this, str);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36520(String str) {
        return C16999.m39868(m36514(), str);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m36529() {
        if (!mo23120() || mo23113()) {
            return;
        }
        if (mo23127() == 0) {
            mo23552();
            return;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(mo23554() + ".bak", new String[0]);
        abstractC15440M39866.mo23552();
        mo23551(abstractC15440M39866);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36532() {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(mo23554() + ".bak", new String[0]);
        if (abstractC15440M39866.mo23120()) {
            if (mo23120()) {
                mo23552();
            }
            abstractC15440M39866.mo23551(this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36497(InterfaceC12766 interfaceC12766) throws IOException {
        try {
            new C9945(this).m25070(interfaceC12766);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36498(AbstractC15440 abstractC15440, Runnable runnable) throws IOException {
        if (mo23551(abstractC15440)) {
            return;
        }
        if (abstractC15440.mo23120() && (mo23113() || abstractC15440.mo23113())) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Move failed, target exists: ")));
        }
        if (runnable != null) {
            runnable.run();
        }
        m36499(abstractC15440, new C17558());
        mo23552();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36501(AbstractC15440 abstractC15440, boolean z, boolean z2, Runnable runnable) throws IOException {
        AbstractC15440 abstractC15440M36520;
        if (equals(abstractC15440)) {
            throw new IOException(C4153.m12552(this, new StringBuilder("Source and target are the same file: ")));
        }
        if (mo23113()) {
            throw new IOException(C4153.m12552(this, new StringBuilder("Source file is a directory: ")));
        }
        if (abstractC15440.mo23120() && abstractC15440.mo23113()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Target file is a directory: ")));
        }
        if (!abstractC15440.mo23120()) {
            abstractC15440M36520 = null;
        } else {
            if (abstractC15440.getParent() == null) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Target file has no parent for rollback: ")));
            }
            abstractC15440M36520 = abstractC15440.m36520(".force_replace_target");
            if (!abstractC15440.mo23551(abstractC15440M36520)) {
                throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to move target file to rollback file: ")));
            }
        }
        try {
            m36498(abstractC15440, runnable);
            if (abstractC15440M36520 == null || !abstractC15440M36520.mo23120()) {
                return;
            }
            if (!z) {
                abstractC15440M36520.mo23552();
                return;
            }
            AbstractC15440 abstractC15440M39866 = C16999.m39866(abstractC15440.mo23554() + ".bak", new String[0]);
            if (abstractC15440M39866.mo23120() && !abstractC15440M39866.mo23552()) {
                abstractC15440M36520.mo23552();
            } else {
                if (abstractC15440M36520.mo23551(abstractC15440M39866)) {
                    return;
                }
                abstractC15440M36520.mo23552();
            }
        } catch (IOException e) {
            if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                e.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to delete failed target file: "))));
            }
            if (abstractC15440M36520 != null && abstractC15440M36520.mo23120() && !abstractC15440M36520.mo23551(abstractC15440)) {
                e.addSuppressed(new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to restore original target file: "))));
            }
            if (z2 && mo23120() && !mo23552()) {
                e.addSuppressed(new IOException(C4153.m12552(this, new StringBuilder("Unable to delete source file after replace failure: "))));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m36508() {
        if (!mo23120()) {
            if (!mo23546() && !mo23113()) {
                throw new IOException(C4153.m12552(this, new StringBuilder("Unable to create directory ")));
            }
        } else {
            if (mo23113()) {
                return;
            }
            throw new IOException("File " + mo23554() + " exists and is not a directory. Unable to create directory.");
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo35195() {
        m36514().m36508();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36492(boolean z) {
        String parent;
        String strM36505;
        AbstractC15440 abstractC15440M39866;
        if (!mo23120() || (parent = getParent()) == null) {
            return this;
        }
        String name = getName();
        int i = 0;
        if (mo23113()) {
            strM36505 = "";
        } else {
            strM36505 = m36505();
            name = name.substring(0, name.length() - strM36505.length());
        }
        Matcher matcher = (z ? f47293 : f47292).matcher(name);
        if (matcher.matches()) {
            try {
                i = Integer.parseInt(matcher.group(2));
                name = matcher.group(1);
            } catch (Exception unused) {
            }
        }
        StringBuilder sbM15339 = C5368.m15339(name);
        sbM15339.append(z ? " (" : MotionUtils.EASING_TYPE_FORMAT_START);
        String string = sbM15339.toString();
        String strConcat = MotionUtils.EASING_TYPE_FORMAT_END.concat(strM36505);
        do {
            i++;
            abstractC15440M39866 = C16999.m39866(parent, string + i + strConcat);
        } while (abstractC15440M39866.mo23120());
        return abstractC15440M39866;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m36491(String str) {
        return m36524(m36517() + str + m36505());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36504(AbstractC15440 abstractC15440) {
        String lowerCase = mo23544().toLowerCase();
        String lowerCase2 = abstractC15440.mo23544().toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        if (!lowerCase2.endsWith("/")) {
            lowerCase2 = lowerCase2.concat("/");
        }
        return lowerCase.startsWith(lowerCase2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC15440) {
            return mo23554().equals(((AbstractC15440) obj).mo23554());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f47294;
        if (i != 0) {
            return i;
        }
        int iHashCode = mo23554().hashCode();
        this.f47294 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return mo23554();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15587 mo36531() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final C15587 m36534() {
        if (mo36530()) {
            return mo36531();
        }
        if (this instanceof C12993) {
            return new C15587(new File(mo23554()), true);
        }
        return mo27917() ? new C15587(new File(mo23554()), mo27925().m27916()) : new C15587(new File(mo23554()), false);
    }

    /* JADX INFO: renamed from: ۢ */
    public C11293 mo27925() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36507() {
        return mo35196() && !mo23547();
    }

    /* JADX INFO: renamed from: ܿ */
    public C8966 mo23124() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩻ */
    public C13198 mo32036() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ */
    public C12993 mo31566() {
        throw new RuntimeException();
    }
}
