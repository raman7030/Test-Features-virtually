package p067l;

/* JADX INFO: renamed from: l.᩸֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C22568 extends C2449 {

    /* JADX INFO: renamed from: ܽ */
    public final C7933 f71256;

    /* JADX INFO: renamed from: ܿ */
    public final C18543 f71257;

    /* JADX INFO: renamed from: ᩳ */
    public final C7933 f71258;

    public C22568(C7933 c7933, C18543 c18543, C7933 c7934) {
        super(c7933);
        this.f71258 = c7933;
        this.f71257 = c18543;
        int unused = c18543.f55372;
        this.f71256 = c7934;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22568 m50591(C7933 c7933, C2449 c2449) {
        C18543 c18543M42224 = C18543.m42224(c7933);
        if (c18543M42224 == null) {
            return null;
        }
        if (c18543M42224.f55372 != 0 || c18543M42224.f55371) {
            return new C22568(c7933, c18543M42224, c2449);
        }
        return null;
    }
}
