package l;

/* JADX INFO: renamed from: l.ۜ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7V1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7007 extends AbstractC16553 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC3771 f21612;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f21613;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f21614;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f21615;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f21616;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16261 f21617;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C8087 f21618;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f21619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f21620;

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo6806();

    /* JADX INFO: renamed from: ܿ */
    public abstract byte[] mo6807();

    /* JADX INFO: renamed from: ᩳ */
    public abstract byte[] mo6808();

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C12651 {
        this.f21615 = bArr;
        this.f21616 = bArr2;
        this.f21620 = bArr3;
        this.f21614 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(mo6806())).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f21617 = c16261;
            this.f21618 = new C8087(c16261);
            try {
                InterfaceC3771 interfaceC3771 = (InterfaceC3771) Class.forName(c7381.m19856("dh")).asSubclass(InterfaceC3771.class).getDeclaredConstructor(null).newInstance(null);
                this.f21612 = interfaceC3771;
                interfaceC3771.init();
                this.f21612.mo11429(mo6807());
                this.f21612.mo11425(mo6808());
                this.f21613 = this.f21612.mo11426();
                this.f21618.m21457();
                this.f21617.m38234((byte) 30);
                this.f21617.m38253(this.f21613);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f21618);
                c7381.f22696.m46777().getClass();
                this.f21619 = 31;
            } catch (Exception e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18944(C16261 c16261) throws C12651 {
        if (this.f21619 != 31) {
            return false;
        }
        c16261.m38250();
        c16261.m38233();
        if (c16261.m38233() != 31) {
            this.f50859.f22696.m46777().getClass();
            return false;
        }
        this.f50858 = c16261.m38257();
        byte[] bArrM38254 = c16261.m38254();
        byte[] bArrM38257 = c16261.m38257();
        this.f21612.mo11427(bArrM38254);
        this.f21612.getClass();
        this.f50856 = AbstractC16553.m38939(AbstractC16553.m38938(this.f21612.mo11428()), true);
        byte[] bArrM38940 = AbstractC16553.m38940(this.f21616, false);
        this.f50857.mo1151(bArrM38940.length, bArrM38940);
        byte[] bArrM38941 = AbstractC16553.m38940(this.f21615, false);
        this.f50857.mo1151(bArrM38941.length, bArrM38941);
        byte[] bArrM38942 = AbstractC16553.m38940(this.f21614, false);
        this.f50857.mo1151(bArrM38942.length, bArrM38942);
        byte[] bArrM38943 = AbstractC16553.m38940(this.f21620, false);
        this.f50857.mo1151(bArrM38943.length, bArrM38943);
        byte[] bArrM38944 = AbstractC16553.m38940(this.f50858, false);
        this.f50857.mo1151(bArrM38944.length, bArrM38944);
        byte[] bArrM38939 = AbstractC16553.m38939(this.f21613, false);
        this.f50857.mo1151(bArrM38939.length, bArrM38939);
        byte[] bArrM389310 = AbstractC16553.m38939(bArrM38254, false);
        this.f50857.mo1151(bArrM389310.length, bArrM389310);
        InterfaceC2774 interfaceC2774 = this.f50857;
        byte[] bArr = this.f50856;
        interfaceC2774.mo1151(bArr.length, bArr);
        this.f50855 = this.f50857.mo1152();
        byte[] bArr2 = this.f50858;
        int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zM38942 = m38942(C19356.m44585(4, i, bArr2), this.f50858, bArrM38257, i + 4);
        this.f21619 = 0;
        return zM38942;
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo18945() {
        return this.f21619;
    }
}
