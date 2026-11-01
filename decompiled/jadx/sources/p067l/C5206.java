package p067l;

/* JADX INFO: renamed from: l.ۗۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes2.dex */
public class C5206 extends C13923 {

    /* JADX INFO: renamed from: ۡ */
    public final int f12229;

    /* JADX INFO: renamed from: ۢ */
    public int f12230;

    public C5206(C5876 c5876, char[] cArr, int i) {
        super(c5876, cArr, cArr.length);
        this.f12229 = i;
        this.f12230 = 0;
    }

    @Override // p067l.C13923
    /* JADX INFO: renamed from: ۜ */
    public final char mo11169() {
        super.mo11169();
        if (m31656('\n') || m31656('\r') || m31656('\f')) {
            this.f12230 = 0;
        } else if (m31656('\t')) {
            this.f12230 = ((this.f12230 / 8) * 8) + 8;
        } else {
            this.f12230++;
        }
        return m31645();
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m11170() {
        return m31660() + this.f12229;
    }
}
