package p067l;

/* JADX INFO: renamed from: l.۫ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14007 implements InterfaceC4343 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11996 f39520;

    public C14007(C11996 c11996) {
        this.f39520 = c11996;
    }

    @Override // p067l.InterfaceC4343
    public final void writeByte(int i) {
        C11996 c11996 = this.f39520;
        byte[] bArr = c11996.f33452;
        int i2 = c11996.f33450;
        c11996.f33450 = i2 + 1;
        bArr[i2] = (byte) i;
    }
}
