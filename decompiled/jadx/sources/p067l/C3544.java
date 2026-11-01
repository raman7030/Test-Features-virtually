package p067l;

/* JADX INFO: renamed from: l.֨ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64HJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3544 extends Exception {

    /* JADX INFO: renamed from: ᩸ */
    public final String f7195;

    public C3544(String str) {
        super("Invalid reference");
        this.f7195 = str;
    }

    public C3544(String str, Throwable th) {
        super(th);
        this.f7195 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m6319() {
        return this.f7195;
    }
}
