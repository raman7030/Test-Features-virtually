package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.text.Normalizer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۫ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U7M7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12465 implements InterfaceC18278 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37474 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21017 f37475;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37476;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f37477;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC7145 f37473 = C1707.getDefault();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f37472 = System.getProperty("os.name", "").contains("OS X");

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo10092(Collection collection);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC12465 mo10093(String str);

    public AbstractC12465(AbstractC21017 abstractC21017, InterfaceC20758 interfaceC20758) {
        C11003.requireNonNull(abstractC21017);
        this.f37475 = abstractC21017;
        if (C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.f37477 = interfaceC20758;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String mo30626() {
        return this.f37477.getFileName().toString();
    }

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public EnumC16866 mo21321() {
        Set set = AbstractC21017.f67841;
        return AbstractC21017.m47830(this.f37477.getFileName().toString());
    }

    @Override // l.InterfaceC18278
    /* JADX INFO: renamed from: ֫ */
    public boolean mo21322(String str, EnumC16866 enumC16866) {
        return m30624(this.f37477, str, enumC16866);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (java.text.Normalizer.normalize(r6, r0).equals(r5) != false) goto L20;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m30624(InterfaceC20758 interfaceC20758, String str, EnumC16866 enumC16866) {
        String string;
        String string2;
        Normalizer.Form form;
        C11003.requireNonNull(enumC16866);
        if (enumC16866 != EnumC16866.OTHER) {
            StringBuilder sbM15339 = C5368.m15339(str);
            sbM15339.append(enumC16866.f51754);
            string = sbM15339.toString();
            string2 = interfaceC20758.getFileName().toString();
            if (!string2.equals(string)) {
                if (interfaceC20758.getFileSystem() == f37473) {
                    if (f37472) {
                        form = Normalizer.Form.NFC;
                        if (Normalizer.isNormalized(string, form)) {
                        }
                    }
                    if (string2.equalsIgnoreCase(string)) {
                        return interfaceC20758.toRealPath(EnumC14406.NOFOLLOW_LINKS).getFileName().toString().equals(string);
                    }
                }
            }
            return true;
        }
        Set set = AbstractC21017.f67841;
        if (AbstractC21017.m47830(interfaceC20758.getFileName().toString()) == enumC16866) {
            StringBuilder sbM153310 = C5368.m15339(str);
            sbM153310.append(enumC16866.f51754);
            string = sbM153310.toString();
            string2 = interfaceC20758.getFileName().toString();
            if (!string2.equals(string)) {
                if (interfaceC20758.getFileSystem() == f37473) {
                    if (f37472 && Normalizer.isNormalized(string2, Normalizer.Form.NFD)) {
                        form = Normalizer.Form.NFC;
                        if (Normalizer.isNormalized(string, form)) {
                        }
                    }
                    if (string2.equalsIgnoreCase(string)) {
                        try {
                            return interfaceC20758.toRealPath(EnumC14406.NOFOLLOW_LINKS).getFileName().toString().equals(string);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC7757
    public URI toUri() {
        return this.f37477.toUri();
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo20795() {
        this.f37475.m47835();
        return C17229.newInputStream(this.f37477, new InterfaceC23579[0]);
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ܿ */
    public final OutputStream mo20797() throws IOException {
        AbstractC21017 abstractC21017 = this.f37475;
        abstractC21017.m47835();
        abstractC21017.f67843.remove(this);
        m30625();
        return C17229.newOutputStream(this.f37477, new InterfaceC23579[0]);
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo7388(boolean z) throws IOException {
        AbstractC21017 abstractC21017 = this.f37475;
        HashMap map = abstractC21017.f67843;
        C6905 c6905 = (C6905) map.get(this);
        CharBuffer charBuffer = null;
        if (c6905 != null) {
            if (c6905.f21314 != mo20798()) {
                map.remove(this);
            } else {
                charBuffer = (CharBuffer) c6905.f21313.get();
            }
        }
        if (charBuffer != null) {
            return charBuffer;
        }
        InputStream inputStreamMo20795 = mo20795();
        try {
            ByteBuffer byteBufferM47832 = abstractC21017.m47832(inputStreamMo20795);
            InterfaceC18278 interfaceC18278M7284 = abstractC21017.f67846.m7284(this);
            try {
                CharBuffer charBufferM47833 = abstractC21017.m47833(byteBufferM47832, z);
                abstractC21017.f67846.m7284(interfaceC18278M7284);
                abstractC21017.m47834(byteBufferM47832);
                if (!z) {
                    abstractC21017.f67843.put(this, new C6905(this, charBufferM47833));
                }
                inputStreamMo20795.close();
                return charBufferM47833;
            } catch (Throwable th) {
                abstractC21017.f67846.m7284(interfaceC18278M7284);
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStreamMo20795 != null) {
                try {
                    inputStreamMo20795.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo20796() throws IOException {
        AbstractC21017 abstractC21017 = this.f37475;
        abstractC21017.m47835();
        abstractC21017.f67843.remove(this);
        m30625();
        return new OutputStreamWriter(C17229.newOutputStream(this.f37477, new InterfaceC23579[0]), abstractC21017.m47831());
    }

    @Override // l.InterfaceC7757
    /* JADX INFO: renamed from: ᩳ */
    public final long mo20798() {
        try {
            return C17229.getLastModifiedTime(this.f37477, new EnumC14406[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // l.InterfaceC7757
    public final boolean delete() {
        try {
            C17229.delete(this.f37477);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC12465) && this.f37477.equals(((AbstractC12465) obj).f37477);
    }

    public final int hashCode() {
        return this.f37477.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f37477 + "]";
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m30625() throws IOException {
        if (this.f37476) {
            return;
        }
        InterfaceC20758 parent = this.f37477.getParent();
        if (parent != null && !C17229.isDirectory(parent, new EnumC14406[0])) {
            try {
                C17229.createDirectories(parent, new InterfaceC22168[0]);
            } catch (IOException e) {
                throw new IOException("could not create parent directories", e);
            }
        }
        this.f37476 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30623(InterfaceC20758 interfaceC20758) {
        String string = interfaceC20758.toString();
        String separator = interfaceC20758.getFileSystem().getSeparator();
        int iLastIndexOf = string.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            string = string.substring(0, iLastIndexOf);
        }
        return string.replace(separator, ".");
    }
}
