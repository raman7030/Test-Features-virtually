package p067l;

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
public abstract class AbstractC14215 implements InterfaceC19740 {

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f40494 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22343 f40495;

    /* JADX INFO: renamed from: ۧ */
    public boolean f40496;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC22097 f40497;

    /* JADX INFO: renamed from: ܿ */
    public static final AbstractC9159 f40493 = C3991.getDefault();

    /* JADX INFO: renamed from: ܳ */
    public static final boolean f40492 = System.getProperty("os.name", "").contains("OS X");

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo12127(Collection collection);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC14215 mo12128(String str);

    public AbstractC14215(AbstractC22343 abstractC22343, InterfaceC22097 interfaceC22097) {
        C12826.requireNonNull(abstractC22343);
        this.f40495 = abstractC22343;
        if (C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
            throw new IllegalArgumentException("directories not supported");
        }
        this.f40497 = interfaceC22097;
    }

    /* JADX INFO: renamed from: ܳ */
    public String mo32691() {
        return this.f40497.getFileName().toString();
    }

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public EnumC18398 mo23287() {
        Set set = AbstractC22343.f70526;
        return AbstractC22343.m50160(this.f40497.getFileName().toString());
    }

    @Override // p067l.InterfaceC19740
    /* JADX INFO: renamed from: ֫ */
    public boolean mo23288(String str, EnumC18398 enumC18398) {
        return m32689(this.f40497, str, enumC18398);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (java.text.Normalizer.normalize(r6, r0).equals(r5) != false) goto L20;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m32689(InterfaceC22097 interfaceC22097, String str, EnumC18398 enumC18398) {
        String string;
        String string2;
        Normalizer.Form form;
        C12826.requireNonNull(enumC18398);
        if (enumC18398 != EnumC18398.OTHER) {
            StringBuilder sbM17248 = C7470.m17248(str);
            sbM17248.append(enumC18398.f54934);
            string = sbM17248.toString();
            string2 = interfaceC22097.getFileName().toString();
            if (!string2.equals(string)) {
                if (interfaceC22097.getFileSystem() == f40493) {
                    if (f40492) {
                        form = Normalizer.Form.NFC;
                        if (Normalizer.isNormalized(string, form)) {
                        }
                    }
                    if (string2.equalsIgnoreCase(string)) {
                        return interfaceC22097.toRealPath(EnumC16060.NOFOLLOW_LINKS).getFileName().toString().equals(string);
                    }
                }
            }
            return true;
        }
        Set set = AbstractC22343.f70526;
        if (AbstractC22343.m50160(interfaceC22097.getFileName().toString()) == enumC18398) {
            StringBuilder sbM17249 = C7470.m17248(str);
            sbM17249.append(enumC18398.f54934);
            string = sbM17249.toString();
            string2 = interfaceC22097.getFileName().toString();
            if (!string2.equals(string)) {
                if (interfaceC22097.getFileSystem() == f40493) {
                    if (f40492 && Normalizer.isNormalized(string2, Normalizer.Form.NFD)) {
                        form = Normalizer.Form.NFC;
                        if (Normalizer.isNormalized(string, form)) {
                        }
                    }
                    if (string2.equalsIgnoreCase(string)) {
                        try {
                            return interfaceC22097.toRealPath(EnumC16060.NOFOLLOW_LINKS).getFileName().toString().equals(string);
                        } catch (IOException unused) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // p067l.InterfaceC9741
    public URI toUri() {
        return this.f40497.toUri();
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ۧ */
    public final InputStream mo22776() {
        this.f40495.m50165();
        return C18743.newInputStream(this.f40497, new InterfaceC24778[0]);
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ܿ */
    public final OutputStream mo22778() throws IOException {
        AbstractC22343 abstractC22343 = this.f40495;
        abstractC22343.m50165();
        abstractC22343.f70528.remove(this);
        m32690();
        return C18743.newOutputStream(this.f40497, new InterfaceC24778[0]);
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo9471(boolean z) throws IOException {
        AbstractC22343 abstractC22343 = this.f40495;
        HashMap map = abstractC22343.f70528;
        C8931 c8931 = (C8931) map.get(this);
        CharBuffer charBuffer = null;
        if (c8931 != null) {
            if (c8931.f24193 != mo22779()) {
                map.remove(this);
            } else {
                charBuffer = (CharBuffer) c8931.f24192.get();
            }
        }
        if (charBuffer != null) {
            return charBuffer;
        }
        InputStream inputStreamMo22776 = mo22776();
        try {
            ByteBuffer byteBufferM50162 = abstractC22343.m50162(inputStreamMo22776);
            InterfaceC19740 interfaceC19740M9363 = abstractC22343.f70531.m9363(this);
            try {
                CharBuffer charBufferM50163 = abstractC22343.m50163(byteBufferM50162, z);
                abstractC22343.f70531.m9363(interfaceC19740M9363);
                abstractC22343.m50164(byteBufferM50162);
                if (!z) {
                    abstractC22343.f70528.put(this, new C8931(this, charBufferM50163));
                }
                inputStreamMo22776.close();
                return charBufferM50163;
            } catch (Throwable th) {
                abstractC22343.f70531.m9363(interfaceC19740M9363);
                throw th;
            }
        } catch (Throwable th2) {
            if (inputStreamMo22776 != null) {
                try {
                    inputStreamMo22776.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ܽ */
    public final Writer mo22777() throws IOException {
        AbstractC22343 abstractC22343 = this.f40495;
        abstractC22343.m50165();
        abstractC22343.f70528.remove(this);
        m32690();
        return new OutputStreamWriter(C18743.newOutputStream(this.f40497, new InterfaceC24778[0]), abstractC22343.m50161());
    }

    @Override // p067l.InterfaceC9741
    /* JADX INFO: renamed from: ᩳ */
    public final long mo22779() {
        try {
            return C18743.getLastModifiedTime(this.f40497, new EnumC16060[0]).toMillis();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // p067l.InterfaceC9741
    public final boolean delete() {
        try {
            C18743.delete(this.f40497);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC14215) && this.f40497.equals(((AbstractC14215) obj).f40497);
    }

    public final int hashCode() {
        return this.f40497.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + this.f40497 + "]";
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m32690() throws IOException {
        if (this.f40496) {
            return;
        }
        InterfaceC22097 parent = this.f40497.getParent();
        if (parent != null && !C18743.isDirectory(parent, new EnumC16060[0])) {
            try {
                C18743.createDirectories(parent, new InterfaceC23437[0]);
            } catch (IOException e) {
                throw new IOException("could not create parent directories", e);
            }
        }
        this.f40496 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32688(InterfaceC22097 interfaceC22097) {
        String string = interfaceC22097.toString();
        String separator = interfaceC22097.getFileSystem().getSeparator();
        int iLastIndexOf = string.lastIndexOf(".");
        if (iLastIndexOf != -1) {
            string = string.substring(0, iLastIndexOf);
        }
        return string.replace(separator, ".");
    }
}
