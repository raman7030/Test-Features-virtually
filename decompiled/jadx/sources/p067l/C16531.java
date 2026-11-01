package p067l;

/* JADX INFO: renamed from: l.ܶ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C16531 extends C2449 {

    /* JADX INFO: renamed from: ܳ */
    public final C18543 f48575;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12628 f48576;

    /* JADX INFO: renamed from: ܿ */
    public final int f48577;

    /* JADX INFO: renamed from: ᩳ */
    public final C22016 f48578;

    public C16531(C22016 c22016, C21207 c21207, C18543 c18543) {
        super(c22016);
        this.f48578 = c22016;
        this.f48576 = c21207.f78179;
        this.f48575 = c18543;
        this.f48577 = c22016.f69300;
        int unused = c18543.f55372;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16531 m37508(C7933 c7933) {
        C22016 c22016;
        int i;
        if (!(c7933 instanceof C22016) || (i = (c22016 = (C22016) c7933).f69300) <= 0 || i != c22016.f69298) {
            return null;
        }
        C7933 c7934 = c22016.f69297;
        if (!(c7934 instanceof C21207)) {
            return null;
        }
        C21207 c21207 = (C21207) c7934;
        C18543 c18543M42222 = C18543.m42222(c22016.f20809, c21207.f78179, i);
        if (c18543M42222 == null) {
            return null;
        }
        return new C16531(c22016, c21207, c18543M42222);
    }
}
