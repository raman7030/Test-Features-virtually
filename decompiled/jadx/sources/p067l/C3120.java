package p067l;

/* JADX INFO: renamed from: l.֨֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C3120 extends C2449 {

    /* JADX INFO: renamed from: ܽ */
    public final C6454 f5677;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC12628 f5678;

    public C3120(C6454 c6454) {
        super(c6454);
        this.f5677 = c6454;
        this.f5678 = c6454.f23121;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3120 m5324(C7933 c7933) {
        if (!(c7933 instanceof C6454)) {
            return null;
        }
        C6454 c6454 = (C6454) c7933;
        if (c6454.f23120 > 0) {
            return new C3120(c6454);
        }
        return null;
    }
}
