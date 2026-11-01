package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩷ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB9W */
/* JADX INFO: loaded from: classes5.dex */
public final class C22308 extends AbstractC7555 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C22308 f70453 = new C22308(Double.doubleToLongBits(0.0d));

    /* JADX INFO: renamed from: ᩶ */
    public static final C22308 f70452 = new C22308(Double.doubleToLongBits(1.0d));

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.DOUBLE;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22308 m50120(long j) {
        return new C22308(j);
    }

    public final String toString() {
        long jMo4594 = mo4594();
        return "double{0x" + C16351.m37151(jMo4594) + " / " + Double.longBitsToDouble(jMo4594) + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26323;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Double.toString(Double.longBitsToDouble(mo4594()));
    }
}
