package p067l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܳ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16402 extends AbstractC3268 {

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ int f48200 = 0;

    /* JADX INFO: renamed from: ֫ */
    public C25120 f48203;

    /* JADX INFO: renamed from: ᩳ */
    public static final Logger f48202 = Logger.getLogger(AbstractC16402.class.getName());

    /* JADX INFO: renamed from: ܽ */
    public static final boolean f48201 = C22558.m50581();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo29874();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37232(byte b);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37233(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37234(int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37235(int i, long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37236(int i, String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37237(int i, AbstractC7962 abstractC7962);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37239(int i, InterfaceC10467 interfaceC10467, InterfaceC11277 interfaceC11277);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37240(int i, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37241(int i, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37242(long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37243(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37245(AbstractC7962 abstractC7962);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo37246(InterfaceC10467 interfaceC10467);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37247(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37248(int i, int i2);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37249(int i, long j);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37250(int i, AbstractC7962 abstractC7962);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37251(int i, InterfaceC10467 interfaceC10467);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo37252(long j);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo37253(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo37254(int i, int i2);

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo37255(int i, InterfaceC10467 interfaceC10467);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo37256(int i, int i2);

    public AbstractC16402() {
    }

    public /* synthetic */ AbstractC16402(int i) {
        this();
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m37221(int i, int i2) {
        return m37224(i2) + m37220(i);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m37231(int i, int i2) {
        return m37230(i2) + m37220(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m37225(int i) {
        return m37220(i) + 4;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m37222(int i, long j) {
        return m37224(j) + m37220(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m37228(int i, long j) {
        return m37224(j) + m37220(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m37227(int i) {
        return m37220(i) + 1;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m37226(int i, int i2) {
        return m37224(i2) + m37220(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m37223(int i, AbstractC7962 abstractC7962) {
        int iM37220 = m37220(i);
        int size = abstractC7962.size();
        return m37230(size) + size + iM37220;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37216(int i, C17703 c17703) {
        int iM37220 = m37220(i);
        int iM40237 = c17703.m40237();
        return m37230(iM40237) + iM40237 + iM37220;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m37229(int i, InterfaceC10467 interfaceC10467) {
        return m37218(interfaceC10467) + m37220(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m37220(int i) {
        return m37230(i << 3);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m37230(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m37224(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m37217(String str) {
        int length;
        try {
            length = C13840.m31512(str);
        } catch (C5123 unused) {
            length = str.getBytes(C15671.f44807).length;
        }
        return m37230(length) + length;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m37218(InterfaceC10467 interfaceC10467) {
        int serializedSize = interfaceC10467.getSerializedSize();
        return m37230(serializedSize) + serializedSize;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37244(String str, C5123 c5123) throws C19756 {
        f48202.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c5123);
        byte[] bytes = str.getBytes(C15671.f44807);
        try {
            mo37253(bytes.length);
            mo5685(0, bytes.length, bytes);
        } catch (IndexOutOfBoundsException e) {
            throw new C19756(e);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final void m37238(int i, InterfaceC10467 interfaceC10467) {
        mo37254(i, 3);
        interfaceC10467.writeTo(this);
        mo37254(i, 4);
    }
}
