package p067l;

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
public abstract class AbstractC17043 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ۙ */
    public static final String f50420 = File.separator;

    /* JADX INFO: renamed from: ᩶ */
    public static final Pattern f50421;

    /* JADX INFO: renamed from: ᩹ */
    public static final Pattern f50422;

    /* JADX INFO: renamed from: ᩸ */
    public int f50423;

    public abstract String getName();

    public abstract String getParent();

    /* JADX INFO: renamed from: ֡֫ */
    public abstract boolean mo29972();

    /* JADX INFO: renamed from: ֨ */
    public boolean mo20484() {
        return true;
    }

    /* JADX INFO: renamed from: ֨֫ */
    public abstract boolean mo25087();

    /* JADX INFO: renamed from: ֨ۧ */
    public boolean mo29973() {
        return this instanceof C8878;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo20486(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۗ */
    public abstract boolean mo25496();

    /* JADX INFO: renamed from: ۗ֫ */
    public boolean mo29978() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo25497();

    /* JADX INFO: renamed from: ۚۧ */
    public boolean mo31068() {
        return false;
    }

    /* JADX INFO: renamed from: ۛ֫ */
    public abstract long mo25091();

    /* JADX INFO: renamed from: ۜ */
    public abstract ParcelFileDescriptor mo29982(String str);

    /* JADX INFO: renamed from: ۜۧ */
    public abstract FileChannel mo29983();

    /* JADX INFO: renamed from: ۠ */
    public abstract boolean mo29985();

    /* JADX INFO: renamed from: ۠֫ */
    public abstract boolean mo25093();

    /* JADX INFO: renamed from: ۡ */
    public boolean mo37341() {
        return true;
    }

    /* JADX INFO: renamed from: ۢۧ */
    public abstract InputStream mo29987();

    /* JADX INFO: renamed from: ۤ */
    public abstract boolean mo25094();

    /* JADX INFO: renamed from: ۤ֫ */
    public boolean mo25498() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract List mo25500(boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo25502(AbstractC17043 abstractC17043);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo31069(InterfaceC18588 interfaceC18588) {
        return false;
    }

    /* JADX INFO: renamed from: ۫֫ */
    public boolean mo37343() {
        return false;
    }

    /* JADX INFO: renamed from: ۬ */
    public abstract boolean mo25503();

    /* JADX INFO: renamed from: ܰ֫ */
    public abstract List mo29992();

    /* JADX INFO: renamed from: ܶ */
    public boolean mo20489() {
        return true;
    }

    /* JADX INFO: renamed from: ܺ */
    public abstract boolean mo29994();

    /* JADX INFO: renamed from: ܺ֫ */
    public abstract String mo25505();

    /* JADX INFO: renamed from: ܽ */
    public abstract OutputStream mo25506(boolean z);

    /* JADX INFO: renamed from: ܿ֫ */
    public String mo29996() {
        return null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public abstract boolean mo29997();

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean mo33653() {
        return false;
    }

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean mo38688() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract InterfaceC4502 mo25508(String str);

    /* JADX INFO: renamed from: ᩹֫ */
    public boolean mo25100() {
        return false;
    }

    /* JADX INFO: renamed from: ᩺ */
    public AbstractC17043 mo25510() {
        return this;
    }

    /* JADX INFO: renamed from: ᩺֫ */
    public abstract long mo25101();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getName().compareToIgnoreCase(((AbstractC17043) obj).getName());
    }

    static {
        String str = File.pathSeparator;
        char c = File.separatorChar;
        char c2 = File.pathSeparatorChar;
        f50422 = Pattern.compile("(.*) \\((\\d+)\\)");
        f50421 = Pattern.compile("(.*)\\((\\d+)\\)");
    }

    /* JADX INFO: renamed from: ܺ */
    public static String m38645(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf == -1 ? "" : str.substring(iLastIndexOf);
        String[] strArr = {".1", ".apk.1", ".png", ".9.png", ".gz", ".tar.gz", ".xz", ".tar.xz", ".zst", ".tar.zst", ".zstd", ".tar.zstd", ".bz2", ".tar.bz2", ".lz4", ".tar.lz4"};
        for (int i = 0; i < 16; i += 2) {
            if (strSubstring.equals(strArr[i])) {
                int i2 = i + 1;
                if (C11567.m26631((CharSequence) strArr[i2], str)) {
                    return str.substring(str.length() - strArr[i2].length());
                }
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final String m38675() {
        String name = getName();
        return name.substring(0, name.length() - m38645(name).length());
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final String m38663() {
        return m38645(getName());
    }

    /* JADX INFO: renamed from: ۡ֫ */
    public final String m38669() {
        String parent = getParent();
        if (parent != null) {
            return parent;
        }
        throw new NullPointerException(C6316.m14442(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ܶۧ */
    public final Uri m38680() {
        return Uri.fromFile(new File(mo25505()));
    }

    /* JADX INFO: renamed from: ۜ֫ */
    public AbstractC17043 mo34130() {
        return m38672();
    }

    /* JADX INFO: renamed from: ܰ */
    public final String m38677() {
        String strMo29996 = mo29996();
        if (strMo29996 == null) {
            return null;
        }
        if (strMo29996.startsWith("/")) {
            return strMo29996;
        }
        AbstractC17043 abstractC17043Mo34130 = mo34130();
        while (abstractC17043Mo34130 != null) {
            if (strMo29996.isEmpty() || strMo29996.equals(".")) {
                return abstractC17043Mo34130.mo25505();
            }
            if (strMo29996.equals("..")) {
                return abstractC17043Mo34130.getParent();
            }
            if (strMo29996.startsWith("./")) {
                strMo29996 = strMo29996.substring(2);
            } else if (strMo29996.startsWith("../")) {
                strMo29996 = strMo29996.substring(3);
                abstractC17043Mo34130 = abstractC17043Mo34130.m38694();
            } else {
                return abstractC17043Mo34130.m38684(strMo29996).mo25505();
            }
        }
        return mo25505();
    }

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC12351 mo25509() {
        return new C21739(this);
    }

    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean m38691() {
        return mo29996() != null;
    }

    /* JADX INFO: renamed from: ۖ֫ */
    public String mo34129() {
        return m38691() ? m38677() : mo25505();
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo29995(String str) {
        C21759.m49050(str, mo25505());
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final AbstractC17043 m38694() {
        String parent = getParent();
        if (parent != null) {
            return C18524.m42109(parent, new String[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public final AbstractC17043 m38672() {
        AbstractC17043 abstractC17043M38694 = m38694();
        if (abstractC17043M38694 != null) {
            return abstractC17043M38694;
        }
        throw new NullPointerException(C6316.m14442(this, new StringBuilder("Not parent: ")));
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17043 m38682(String str) {
        return C18524.m42109(m38669(), str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC17043 m38684(String str) {
        return C18524.m42109(mo25505(), str);
    }

    /* JADX INFO: renamed from: ֫֫ */
    public String mo25495() {
        return mo25510().mo25505();
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public Uri mo33652() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۠ۧ */
    public final Uri m38667() {
        return C13692.m31097(mo25505());
    }

    /* JADX INFO: renamed from: ۫ */
    public boolean mo29990() {
        return mo25503();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m38648(InterfaceC18588 interfaceC18588) {
        if (!mo25087()) {
            return mo25101();
        }
        List listMo25500 = mo25500(true);
        long jM38648 = 0;
        for (int i = 0; i < listMo25500.size() && !interfaceC18588.mo3924(); i++) {
            jM38648 += ((AbstractC17043) listMo25500.get(i)).m38648(interfaceC18588);
        }
        return jM38648;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m38646() {
        String strMo25495 = mo25495();
        int i = C18524.f55316;
        return new File(strMo25495).canRead();
    }

    /* JADX INFO: renamed from: ۚ */
    public boolean mo29980() {
        return m38646();
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        return new C20398(this, interfaceC8998);
    }

    /* JADX INFO: renamed from: ۧۧ */
    public final BufferedInputStream m38676() {
        InputStream inputStreamMo29987 = mo29987();
        if (inputStreamMo29987 instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStreamMo29987;
        }
        return new BufferedInputStream(inputStreamMo29987);
    }

    /* JADX INFO: renamed from: ܳۧ */
    public final BufferedReader m38679() {
        return new BufferedReader(new InputStreamReader(mo29987(), StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ܿۧ */
    public final BufferedOutputStream m38683() {
        OutputStream outputStreamMo25506 = mo25506(false);
        if (outputStreamMo25506 instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStreamMo25506;
        }
        return new BufferedOutputStream(outputStreamMo25506);
    }

    /* JADX INFO: renamed from: ۢ */
    public final C24618 m38671(String str) {
        return C2489.m3601(mo25508(str));
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m38658(AbstractC17043 abstractC17043, C19056 c19056, InterfaceC7717 interfaceC7717) throws IOException {
        boolean[] zArr;
        InputStream inputStreamMo29987;
        C4304 c4304M8746;
        C21069 c21069;
        boolean zMo25094 = abstractC17043.mo25094();
        if (!zMo25094 && c19056 != null) {
            c19056.m43296(this);
        }
        long jMo25101 = mo25101();
        if (!mo20484() || !abstractC17043.mo20489() || ((mo38688() && abstractC17043.mo38688()) || (((this instanceof C8878) || (abstractC17043 instanceof C8878)) && (mo25101() > 524288000 || C23770.m52834().mo4998())))) {
            zArr = new boolean[]{false};
            try {
                inputStreamMo29987 = mo29987();
                try {
                    try {
                        abstractC17043.mo29976(new C7657(zArr, inputStreamMo29987, jMo25101, interfaceC7717)).m50314();
                        if (inputStreamMo29987 != null) {
                            inputStreamMo29987.close();
                        }
                        if (zArr[0] && interfaceC7717 != null && interfaceC7717.mo3924()) {
                            abstractC17043.mo25503();
                        }
                        if (abstractC17043.mo29973() && C7050.m16218()) {
                            abstractC17043.mo20486(mo25091());
                        }
                    } catch (Throwable th) {
                        if (zArr[0] && interfaceC7717 != null && interfaceC7717.mo3924()) {
                            abstractC17043.mo25503();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (inputStreamMo29987 != null) {
                        try {
                            inputStreamMo29987.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e) {
                C14342.m32939(this, e);
                throw e;
            }
        } else if (abstractC17043 instanceof C13102) {
            C13102 c13102 = (C13102) abstractC17043;
            if (c13102.m29977() || (c13102.m29984() && C23770.m52834().mo4998())) {
                zArr = new boolean[]{false};
                inputStreamMo29987 = mo29987();
                abstractC17043.mo29976(new C7657(zArr, inputStreamMo29987, jMo25101, interfaceC7717)).m50314();
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                if (zArr[0]) {
                    abstractC17043.mo25503();
                }
                if (abstractC17043.mo29973()) {
                    abstractC17043.mo20486(mo25091());
                }
            } else if ((!(this instanceof C13102) && ((C13102) this).m29984() && C23770.m52834().mo4998()) || (Build.VERSION.SDK_INT <= 22 && C23770.m52834().mo4997() && (mo38688() || abstractC17043.mo38688()))) {
                zArr = new boolean[]{false};
                inputStreamMo29987 = mo29987();
                abstractC17043.mo29976(new C7657(zArr, inputStreamMo29987, jMo25101, interfaceC7717)).m50314();
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                if (zArr[0]) {
                    abstractC17043.mo25503();
                }
                if (abstractC17043.mo29973()) {
                    abstractC17043.mo20486(mo25091());
                }
            } else {
                C21089 c21089M12615 = C5665.m12615(false);
                c4304M8746 = C4304.m8746(interfaceC7717);
                if (c4304M8746 == null) {
                    c21069 = null;
                } else {
                    try {
                        c21069 = new C21069(c4304M8746, jMo25101);
                    } catch (IOException e2) {
                        String message = e2.getMessage();
                        if (message != null && message.startsWith("Unable to open source file")) {
                            C14342.m32939(this, e2);
                        }
                        throw e2;
                    }
                }
                abstractC17043.mo29976(new C2962(this, c21089M12615, c21069)).m50314();
                c21089M12615.m47686();
                if (c4304M8746 != null) {
                    c4304M8746.mo8748();
                }
            }
        } else if (!(this instanceof C13102)) {
            C21089 c21089M12616 = C5665.m12615(false);
            c4304M8746 = C4304.m8746(interfaceC7717);
            if (c4304M8746 == null) {
                c21069 = null;
            } else {
                c21069 = new C21069(c4304M8746, jMo25101);
            }
            abstractC17043.mo29976(new C2962(this, c21089M12616, c21069)).m50314();
            c21089M12616.m47686();
            if (c4304M8746 != null) {
                c4304M8746.mo8748();
            }
        } else {
            C21089 c21089M12617 = C5665.m12615(false);
            c4304M8746 = C4304.m8746(interfaceC7717);
            if (c4304M8746 == null) {
                c21069 = null;
            } else {
                c21069 = new C21069(c4304M8746, jMo25101);
            }
            abstractC17043.mo29976(new C2962(this, c21089M12617, c21069)).m50314();
            c21089M12617.m47686();
            if (c4304M8746 != null) {
                c4304M8746.mo8748();
            }
        }
        if ((interfaceC7717 == null || !interfaceC7717.mo3924()) && !zMo25094) {
            if (c19056 != null) {
                c19056.m43298(abstractC17043);
            }
            C18524.m42113(abstractC17043);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38653(OutputStream outputStream, InterfaceC3693 interfaceC3693) throws IOException {
        try {
            InputStream inputStreamMo29987 = mo29987();
            try {
                C15841.m35957(inputStreamMo29987, outputStream, mo25101(), interfaceC3693);
                inputStreamMo29987.close();
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            C14342.m32939(this, e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38657(AbstractC17043 abstractC17043, C19056 c19056) throws IOException {
        if (!mo25087()) {
            m38658(abstractC17043, c19056, (InterfaceC7717) null);
            return;
        }
        if (c19056 != null) {
            c19056.m43296(this);
            abstractC17043.m38666();
            c19056.m43298(abstractC17043);
        } else {
            abstractC17043.m38666();
        }
        for (AbstractC17043 abstractC17044 : mo25500(true)) {
            abstractC17044.m38657(abstractC17043.m38684(abstractC17044.getName()), c19056);
        }
    }

    /* JADX INFO: renamed from: ۘۧ */
    public final byte[] m38664() throws IOException {
        InputStream inputStreamMo29987 = mo29987();
        try {
            byte[] bArrM4194 = C2700.m4194(inputStreamMo29987, (int) mo25101());
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return bArrM4194;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܺۧ */
    public final byte[] m38681() {
        long jMo25101 = mo25101();
        if (jMo25101 <= 20971520) {
            return m38664();
        }
        try {
            InputStream inputStreamMo29987 = mo29987();
            try {
                byte[] bArrM4193 = C2700.m4193(jMo25101, inputStreamMo29987);
                if (inputStreamMo29987 != null) {
                    inputStreamMo29987.close();
                }
                return bArrM4193;
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception unused) {
            return m38664();
        }
    }

    /* JADX INFO: renamed from: ᩵ۧ */
    public final C14677 m38686() {
        return new C14677(m38664());
    }

    /* JADX INFO: renamed from: ֡ۧ */
    public final String m38647() throws IOException {
        InputStream inputStreamMo29987 = mo29987();
        try {
            String strM52175 = C23461.m52175(inputStreamMo29987, Charset.defaultCharset());
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return strM52175;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۡۧ */
    public final int m38670() throws IOException {
        InputStream inputStreamMo29987 = mo29987();
        try {
            byte[] bArr = new byte[4];
            C23461.m52184(inputStreamMo29987, bArr, 4);
            int iM39928 = C17548.m39928(0, bArr);
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return iM39928;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38660(byte[] bArr) {
        m38661(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38661(byte[] bArr, int i, int i2) {
        mo37342();
        mo29976(new C3633(this, bArr, i, i2, C18524.m42122(this) && !mo25094())).m50314();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38651(InputStream inputStream) {
        m38652(inputStream, -1L, (InterfaceC7717) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38652(InputStream inputStream, long j, InterfaceC7717 interfaceC7717) {
        mo37342();
        m38673(inputStream, j, interfaceC7717);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38673(InputStream inputStream, long j, InterfaceC7717 interfaceC7717) {
        mo29976(new C10339(this, inputStream, j, interfaceC7717, C18524.m42122(this) && !mo25094())).m50314();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38654(C11996 c11996) {
        m38661(c11996.m27458(), 0, c11996.size());
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m38668(String str) {
        m38660(str.getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38674(String str) throws IOException {
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        mo37342();
        boolean z = C18524.m42122(this) && !mo25094();
        OutputStream outputStreamMo25506 = mo25506(true);
        try {
            outputStreamMo25506.write(bytes, 0, length);
            outputStreamMo25506.close();
            if (z) {
                C18524.m42125(this);
            }
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final AbstractC17043 m38685() {
        return C18524.m42111(this, ".tmp");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC17043 m38693(String str) {
        return C18524.m42111(this, str);
    }

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17043 m38678(String str) {
        return C18524.m42111(m38672(), str);
    }

    /* JADX INFO: renamed from: ᩶ */
    public final void m38687() {
        if (!mo25094() || mo25087()) {
            return;
        }
        if (mo25101() == 0) {
            mo25503();
            return;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(mo25505() + ".bak", new String[0]);
        abstractC17043M42109.mo25503();
        mo25502(abstractC17043M42109);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m38690() {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(mo25505() + ".bak", new String[0]);
        if (abstractC17043M42109.mo25094()) {
            if (mo25094()) {
                mo25503();
            }
            abstractC17043M42109.mo25502(this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38655(InterfaceC14501 interfaceC14501) throws IOException {
        try {
            new C11820(this).m27087(interfaceC14501);
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38656(AbstractC17043 abstractC17043, Runnable runnable) throws IOException {
        if (mo25502(abstractC17043)) {
            return;
        }
        if (abstractC17043.mo25094() && (mo25087() || abstractC17043.mo25087())) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Move failed, target exists: ")));
        }
        if (runnable != null) {
            runnable.run();
        }
        m38657(abstractC17043, new C19056());
        mo25503();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38659(AbstractC17043 abstractC17043, boolean z, boolean z2, Runnable runnable) throws IOException {
        AbstractC17043 abstractC17043M38678;
        if (equals(abstractC17043)) {
            throw new IOException(C6316.m14442(this, new StringBuilder("Source and target are the same file: ")));
        }
        if (mo25087()) {
            throw new IOException(C6316.m14442(this, new StringBuilder("Source file is a directory: ")));
        }
        if (abstractC17043.mo25094() && abstractC17043.mo25087()) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Target file is a directory: ")));
        }
        if (!abstractC17043.mo25094()) {
            abstractC17043M38678 = null;
        } else {
            if (abstractC17043.getParent() == null) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Target file has no parent for rollback: ")));
            }
            abstractC17043M38678 = abstractC17043.m38678(".force_replace_target");
            if (!abstractC17043.mo25502(abstractC17043M38678)) {
                throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to move target file to rollback file: ")));
            }
        }
        try {
            m38656(abstractC17043, runnable);
            if (abstractC17043M38678 == null || !abstractC17043M38678.mo25094()) {
                return;
            }
            if (!z) {
                abstractC17043M38678.mo25503();
                return;
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(abstractC17043.mo25505() + ".bak", new String[0]);
            if (abstractC17043M42109.mo25094() && !abstractC17043M42109.mo25503()) {
                abstractC17043M38678.mo25503();
            } else {
                if (abstractC17043M38678.mo25502(abstractC17043M42109)) {
                    return;
                }
                abstractC17043M38678.mo25503();
            }
        } catch (IOException e) {
            if (abstractC17043.mo25094() && !abstractC17043.mo25503()) {
                e.addSuppressed(new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to delete failed target file: "))));
            }
            if (abstractC17043M38678 != null && abstractC17043M38678.mo25094() && !abstractC17043M38678.mo25502(abstractC17043)) {
                e.addSuppressed(new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to restore original target file: "))));
            }
            if (z2 && mo25094() && !mo25503()) {
                e.addSuppressed(new IOException(C6316.m14442(this, new StringBuilder("Unable to delete source file after replace failure: "))));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۛ */
    public final void m38666() {
        if (!mo25094()) {
            if (!mo25497() && !mo25087()) {
                throw new IOException(C6316.m14442(this, new StringBuilder("Unable to create directory ")));
            }
        } else {
            if (mo25087()) {
                return;
            }
            throw new IOException("File " + mo25505() + " exists and is not a directory. Unable to create directory.");
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public void mo37342() {
        m38672().m38666();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m38650(boolean z) {
        String parent;
        String strM38663;
        AbstractC17043 abstractC17043M42109;
        if (!mo25094() || (parent = getParent()) == null) {
            return this;
        }
        String name = getName();
        int i = 0;
        if (mo25087()) {
            strM38663 = "";
        } else {
            strM38663 = m38663();
            name = name.substring(0, name.length() - strM38663.length());
        }
        Matcher matcher = (z ? f50422 : f50421).matcher(name);
        if (matcher.matches()) {
            try {
                i = Integer.parseInt(matcher.group(2));
                name = matcher.group(1);
            } catch (Exception unused) {
            }
        }
        StringBuilder sbM17248 = C7470.m17248(name);
        sbM17248.append(z ? " (" : MotionUtils.EASING_TYPE_FORMAT_START);
        String string = sbM17248.toString();
        String strConcat = MotionUtils.EASING_TYPE_FORMAT_END.concat(strM38663);
        do {
            i++;
            abstractC17043M42109 = C18524.m42109(parent, string + i + strConcat);
        } while (abstractC17043M42109.mo25094());
        return abstractC17043M42109;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m38649(String str) {
        return m38682(m38675() + str + m38663());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38662(AbstractC17043 abstractC17043) {
        String lowerCase = mo25495().toLowerCase();
        String lowerCase2 = abstractC17043.mo25495().toLowerCase();
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
        if (obj instanceof AbstractC17043) {
            return mo25505().equals(((AbstractC17043) obj).mo25505());
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f50423;
        if (i != 0) {
            return i;
        }
        int iHashCode = mo25505().hashCode();
        this.f50423 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return mo25505();
    }

    /* JADX INFO: renamed from: ᩷ */
    public C17182 mo38689() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩸ۧ */
    public final C17182 m38692() {
        if (mo38688()) {
            return mo38689();
        }
        if (this instanceof C14717) {
            return new C17182(new File(mo25505()), true);
        }
        return mo29978() ? new C17182(new File(mo25505()), mo29986().m29977()) : new C17182(new File(mo25505()), false);
    }

    /* JADX INFO: renamed from: ۢ */
    public C13102 mo29986() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final boolean m38665() {
        return mo37343() && !mo25498();
    }

    /* JADX INFO: renamed from: ܿ */
    public C10890 mo25098() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩻ */
    public C14912 mo34134() {
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۧ */
    public C14717 mo33651() {
        throw new RuntimeException();
    }
}
