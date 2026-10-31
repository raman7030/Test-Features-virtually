package l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܳ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14766 extends AbstractC0947 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45086 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23939 f45089;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Logger f45088 = Logger.getLogger(AbstractC14766.class.getName());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f45087 = C21244.m48250();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo27812();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35085(byte b);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35086(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35087(int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35088(int i, long j);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35089(int i, String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35090(int i, AbstractC5886 abstractC5886);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35092(int i, InterfaceC8522 interfaceC8522, InterfaceC9374 interfaceC9374);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35093(int i, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35094(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35095(long j);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35096(String str);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35098(AbstractC5886 abstractC5886);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo35099(InterfaceC8522 interfaceC8522);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35100(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35101(int i, int i2);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35102(int i, long j);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35103(int i, AbstractC5886 abstractC5886);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35104(int i, InterfaceC8522 interfaceC8522);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo35105(long j);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo35106(int i);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo35107(int i, int i2);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo35108(int i, InterfaceC8522 interfaceC8522);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract void mo35109(int i, int i2);

    public AbstractC14766() {
    }

    public /* synthetic */ AbstractC14766(int i) {
        this();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m35074(int i, int i2) {
        return m35077(i2) + m35073(i);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m35084(int i, int i2) {
        return m35083(i2) + m35073(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m35078(int i) {
        return m35073(i) + 4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m35075(int i, long j) {
        return m35077(j) + m35073(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m35081(int i, long j) {
        return m35077(j) + m35073(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m35080(int i) {
        return m35073(i) + 1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m35079(int i, int i2) {
        return m35077(i2) + m35073(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m35076(int i, AbstractC5886 abstractC5886) {
        int iM35073 = m35073(i);
        int size = abstractC5886.size();
        return m35083(size) + size + iM35073;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35069(int i, C16135 c16135) {
        int iM35073 = m35073(i);
        int iM38045 = c16135.m38045();
        return m35083(iM38045) + iM38045 + iM35073;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m35082(int i, InterfaceC8522 interfaceC8522) {
        return m35071(interfaceC8522) + m35073(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m35073(int i) {
        return m35083(i << 3);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m35083(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m35077(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m35070(String str) {
        int length;
        try {
            length = C12071.m29450(str);
        } catch (C2899 unused) {
            length = str.getBytes(C13997.f41724).length;
        }
        return m35083(length) + length;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m35071(InterfaceC8522 interfaceC8522) {
        int serializedSize = interfaceC8522.getSerializedSize();
        return m35083(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35097(String str, C2899 c2899) throws C18295 {
        f45088.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2899);
        byte[] bytes = str.getBytes(C13997.f41724);
        try {
            mo35106(bytes.length);
            mo3366(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C18295(e);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35091(int i, InterfaceC8522 interfaceC8522) {
        mo35107(i, 3);
        interfaceC8522.writeTo(this);
        mo35107(i, 4);
    }
}
