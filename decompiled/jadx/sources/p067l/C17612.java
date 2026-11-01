package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܺܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBBH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17612 extends AbstractC2860 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C17612 f52625 = new C17612(Float.floatToIntBits(0.0f));

    /* JADX INFO: renamed from: ᩶ */
    public static final C17612 f52624 = new C17612(Float.floatToIntBits(1.0f));

    /* JADX INFO: renamed from: ۙ */
    public static final C17612 f52623 = new C17612(Float.floatToIntBits(2.0f));

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.FLOAT;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17612 m40103(int i) {
        return new C17612(i);
    }

    public final String toString() {
        int iMo4598 = mo4598();
        return "float{0x" + C16351.m37155(iMo4598) + " / " + Float.intBitsToFloat(iMo4598) + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26332;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Float.toString(Float.intBitsToFloat(mo4598()));
    }
}
