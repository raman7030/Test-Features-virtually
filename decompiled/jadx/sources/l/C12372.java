package l;

/* JADX INFO: renamed from: l.۫ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes4.dex */
public class C12372 implements InterfaceC13077 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f37102;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC13077 f37103;

    public C12372(InterfaceC13077 interfaceC13077) {
        this.f37103 = interfaceC13077;
    }

    @Override // l.InterfaceC13077
    /* JADX INFO: renamed from: ۙ */
    public void mo13119() {
        this.f37102 = false;
        this.f37103.mo13119();
    }

    @Override // l.InterfaceC13077
    /* JADX INFO: renamed from: ֫ */
    public final void mo13118(boolean z, boolean z2) {
        this.f37102 = true;
        this.f37103.mo13118(z, z2);
    }

    @Override // l.InterfaceC13077
    /* JADX INFO: renamed from: ֫ */
    public final void mo13117(int i, int i2) {
        float f = i2;
        this.f37103.mo13117(i, (int) (this.f37102 ? (f * 0.3f) + 70.0f : f * 0.7f));
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f37103.mo1526();
    }
}
