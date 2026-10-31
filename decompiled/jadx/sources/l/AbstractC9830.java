package l;

/* JADX INFO: renamed from: l.ۢ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7Y0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9830 extends AbstractC16553 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f29689;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C8087 f29690;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f29691;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f29692;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f29693;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f29694;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f29695;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f29696;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f29697;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f29698;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f29699;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC10910 f29700;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f29701;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f29702;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC0304 f29703;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f29704;

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C12651 {
        this.f29699 = bArr;
        this.f29696 = bArr2;
        this.f29702 = bArr3;
        this.f29694 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f29695)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f29691 = c16261;
            C8087 c8087 = new C8087(c16261);
            this.f29690 = c8087;
            c8087.m21457();
            this.f29691.m38235(this.f29693 + 5 + this.f29704);
            this.f29691.m38234((byte) 30);
            try {
                InterfaceC10910 interfaceC10910 = (InterfaceC10910) Class.forName(c7381.m19856(this.f29689)).asSubclass(InterfaceC10910.class).getDeclaredConstructor(null).newInstance(null);
                this.f29700 = interfaceC10910;
                interfaceC10910.init();
                InterfaceC0304 interfaceC0304 = (InterfaceC0304) Class.forName(c7381.m19856("xdh")).asSubclass(InterfaceC0304.class).getDeclaredConstructor(null).newInstance(null);
                this.f29703 = interfaceC0304;
                interfaceC0304.mo1674(this.f29704, this.f29692);
                byte[] publicKey = this.f29700.getPublicKey();
                byte[] q = this.f29703.getQ();
                int i = this.f29693;
                byte[] bArr5 = new byte[this.f29704 + i];
                this.f29697 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f29697, this.f29693, this.f29704);
                this.f29691.m38256(this.f29697);
                if (bArr == null) {
                    return;
                }
                c7381.m19872(this.f29690);
                c7381.f22696.m46777().getClass();
                this.f29698 = 31;
            } catch (Exception | LinkageError e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18944(C16261 c16261) throws C12651 {
        if (this.f29698 == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] bArrM38257 = c16261.m38257();
            int length = bArrM38257.length;
            int i = this.f29701;
            int i2 = this.f29704;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM38257, 0, bArr, 0, i);
                System.arraycopy(bArrM38257, this.f29701, bArr2, 0, this.f29704);
                if (this.f29703.mo1676(bArr2)) {
                    byte[] bArrMo25585 = null;
                    try {
                        bArrMo25585 = this.f29700.mo25585(bArr);
                        this.f50857.mo1151(bArrMo25585.length, bArrMo25585);
                        C19356.m44596(bArrMo25585);
                        try {
                            bArrMo25585 = this.f29703.mo1675(bArr2);
                            this.f50857.mo1151(bArrMo25585.length, bArrMo25585);
                            C19356.m44596(bArrMo25585);
                            this.f50856 = AbstractC16553.m38940(this.f50857.mo1152(), true);
                            byte[] bArrM38258 = c16261.m38257();
                            byte[] bArrM38940 = AbstractC16553.m38940(this.f29696, false);
                            this.f50857.mo1151(bArrM38940.length, bArrM38940);
                            byte[] bArrM38941 = AbstractC16553.m38940(this.f29699, false);
                            this.f50857.mo1151(bArrM38941.length, bArrM38941);
                            byte[] bArrM38942 = AbstractC16553.m38940(this.f29694, false);
                            this.f50857.mo1151(bArrM38942.length, bArrM38942);
                            byte[] bArrM38943 = AbstractC16553.m38940(this.f29702, false);
                            this.f50857.mo1151(bArrM38943.length, bArrM38943);
                            byte[] bArrM38944 = AbstractC16553.m38940(this.f50858, false);
                            this.f50857.mo1151(bArrM38944.length, bArrM38944);
                            byte[] bArrM38945 = AbstractC16553.m38940(this.f29697, false);
                            this.f50857.mo1151(bArrM38945.length, bArrM38945);
                            byte[] bArrM38946 = AbstractC16553.m38940(bArrM38257, false);
                            this.f50857.mo1151(bArrM38946.length, bArrM38946);
                            InterfaceC2774 interfaceC2774 = this.f50857;
                            byte[] bArr3 = this.f50856;
                            interfaceC2774.mo1151(bArr3.length, bArr3);
                            this.f50855 = this.f50857.mo1152();
                            byte[] bArr4 = this.f50858;
                            int i3 = ((bArr4[0] << 24) & (-16777216)) | ((bArr4[1] << 16) & 16711680) | ((bArr4[2] << 8) & 65280) | (bArr4[3] & 255);
                            boolean zM38942 = m38942(C19356.m44585(4, i3, bArr4), this.f50858, bArrM38258, i3 + 4);
                            this.f29698 = 0;
                            return zM38942;
                        } catch (Throwable th) {
                            C19356.m44596(bArrMo25585);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C19356.m44596(bArrMo25585);
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ܽ */
    public final int mo18945() {
        return this.f29698;
    }
}
