package l;

/* JADX INFO: renamed from: l.ۗۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QN */
/* JADX INFO: loaded from: classes2.dex */
public class C2986 extends C12158 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f9430;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f9431;

    public C2986(C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, cArr.length);
        this.f9430 = i;
        this.f9431 = 0;
    }

    @Override // l.C12158
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final char mo9118() {
        super.mo9118();
        if (m29591('\n') || m29591('\r') || m29591('\f')) {
            this.f9431 = 0;
        } else if (m29591('\t')) {
            this.f9431 = ((this.f9431 / 8) * 8) + 8;
        } else {
            this.f9431++;
        }
        return m29580();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m9119() {
        return m29595() + this.f9430;
    }
}
