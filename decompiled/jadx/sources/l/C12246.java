package l;

/* JADX INFO: renamed from: l.۫ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12246 implements InterfaceC2077 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10130 f36503;

    public C12246(C10130 c10130) {
        this.f36503 = c10130;
    }

    @Override // l.InterfaceC2077
    public final void writeByte(int i) {
        C10130 c10130 = this.f36503;
        byte[] bArr = c10130.f30490;
        int i2 = c10130.f30488;
        c10130.f30488 = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
