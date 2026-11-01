package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ABB0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10237 extends AbstractC7555 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C10237 f28361 = new C10237(0);

    /* JADX INFO: renamed from: ᩶ */
    public static final C10237 f28360 = new C10237(1);

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return ClassTransform.LONG;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10237 m23848(long j) {
        return new C10237(j);
    }

    public final String toString() {
        long jMo4594 = mo4594();
        return "long{0x" + C16351.m37151(jMo4594) + " / " + jMo4594 + '}';
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26330;
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return Long.toString(mo4594());
    }
}
