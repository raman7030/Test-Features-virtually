package p067l;

/* JADX INFO: renamed from: l.ۢ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7Y0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11711 extends AbstractC18100 {

    /* JADX INFO: renamed from: ֡ */
    public String f32642;

    /* JADX INFO: renamed from: ֨ */
    public C10054 f32643;

    /* JADX INFO: renamed from: ۖ */
    public C17823 f32644;

    /* JADX INFO: renamed from: ۘ */
    public String f32645;

    /* JADX INFO: renamed from: ۚ */
    public int f32646;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f32647;

    /* JADX INFO: renamed from: ۠ */
    public String f32648;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f32649;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f32650;

    /* JADX INFO: renamed from: ܶ */
    public int f32651;

    /* JADX INFO: renamed from: ܺ */
    public byte[] f32652;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC12737 f32653;

    /* JADX INFO: renamed from: ᩵ */
    public int f32654;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f32655;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC2657 f32656;

    /* JADX INFO: renamed from: ᩹ */
    public int f32657;

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C14392 {
        this.f32652 = bArr;
        this.f32649 = bArr2;
        this.f32655 = bArr3;
        this.f32647 = bArr4;
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(c9383.m21829(this.f32648)).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f54035 = interfaceC5005;
            interfaceC5005.init();
            C17823 c17823 = new C17823();
            this.f32644 = c17823;
            C10054 c10054 = new C10054(c17823);
            this.f32643 = c10054;
            c10054.m23425();
            this.f32644.m40449(this.f32646 + 5 + this.f32657);
            this.f32644.m40448((byte) 30);
            try {
                InterfaceC12737 interfaceC12737 = (InterfaceC12737) Class.forName(c9383.m21829(this.f32642)).asSubclass(InterfaceC12737.class).getDeclaredConstructor(null).newInstance(null);
                this.f32653 = interfaceC12737;
                interfaceC12737.init();
                InterfaceC2657 interfaceC2657 = (InterfaceC2657) Class.forName(c9383.m21829("xdh")).asSubclass(InterfaceC2657.class).getDeclaredConstructor(null).newInstance(null);
                this.f32656 = interfaceC2657;
                interfaceC2657.mo4072(this.f32657, this.f32645);
                byte[] publicKey = this.f32653.getPublicKey();
                byte[] q = this.f32656.getQ();
                int i = this.f32646;
                byte[] bArr5 = new byte[this.f32657 + i];
                this.f32650 = bArr5;
                System.arraycopy(publicKey, 0, bArr5, 0, i);
                System.arraycopy(q, 0, this.f32650, this.f32646, this.f32657);
                this.f32644.m40470(this.f32650);
                if (bArr == null) {
                    return;
                }
                c9383.m21845(this.f32643);
                c9383.f25608.m49100().getClass();
                this.f32651 = 31;
            } catch (Exception | LinkageError e) {
                throw new C14392(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C14392(e2.toString(), e2);
        }
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20901(C17823 c17823) throws C14392 {
        if (this.f32651 == 31) {
            c17823.m40464();
            c17823.m40447();
            if (c17823.m40447() != 31) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f54036 = c17823.m40471();
            byte[] bArrM40471 = c17823.m40471();
            int length = bArrM40471.length;
            int i = this.f32654;
            int i2 = this.f32657;
            if (length == i + i2) {
                byte[] bArr = new byte[i];
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArrM40471, 0, bArr, 0, i);
                System.arraycopy(bArrM40471, this.f32654, bArr2, 0, this.f32657);
                if (this.f32656.mo4074(bArr2)) {
                    byte[] bArrMo27605 = null;
                    try {
                        bArrMo27605 = this.f32653.mo27605(bArr);
                        this.f54035.mo3552(bArrMo27605.length, bArrMo27605);
                        C20764.m46890(bArrMo27605);
                        try {
                            bArrMo27605 = this.f32656.mo4073(bArr2);
                            this.f54035.mo3552(bArrMo27605.length, bArrMo27605);
                            C20764.m46890(bArrMo27605);
                            this.f54034 = AbstractC18100.m41166(this.f54035.mo3553(), true);
                            byte[] bArrM40472 = c17823.m40471();
                            byte[] bArrM41166 = AbstractC18100.m41166(this.f32649, false);
                            this.f54035.mo3552(bArrM41166.length, bArrM41166);
                            byte[] bArrM41167 = AbstractC18100.m41166(this.f32652, false);
                            this.f54035.mo3552(bArrM41167.length, bArrM41167);
                            byte[] bArrM41168 = AbstractC18100.m41166(this.f32647, false);
                            this.f54035.mo3552(bArrM41168.length, bArrM41168);
                            byte[] bArrM41169 = AbstractC18100.m41166(this.f32655, false);
                            this.f54035.mo3552(bArrM41169.length, bArrM41169);
                            byte[] bArrM411610 = AbstractC18100.m41166(this.f54036, false);
                            this.f54035.mo3552(bArrM411610.length, bArrM411610);
                            byte[] bArrM411611 = AbstractC18100.m41166(this.f32650, false);
                            this.f54035.mo3552(bArrM411611.length, bArrM411611);
                            byte[] bArrM411612 = AbstractC18100.m41166(bArrM40471, false);
                            this.f54035.mo3552(bArrM411612.length, bArrM411612);
                            InterfaceC5005 interfaceC5005 = this.f54035;
                            byte[] bArr3 = this.f54034;
                            interfaceC5005.mo3552(bArr3.length, bArr3);
                            this.f54033 = this.f54035.mo3553();
                            byte[] bArr4 = this.f54036;
                            int i3 = ((bArr4[0] << 24) & (-16777216)) | ((bArr4[1] << 16) & 16711680) | ((bArr4[2] << 8) & 65280) | (bArr4[3] & 255);
                            boolean zM41168 = m41168(C20764.m46879(4, i3, bArr4), this.f54036, bArrM40472, i3 + 4);
                            this.f32651 = 0;
                            return zM41168;
                        } catch (Throwable th) {
                            C20764.m46890(bArrMo27605);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        C20764.m46890(bArrMo27605);
                        throw th2;
                    }
                }
            }
        }
        return false;
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ܽ */
    public final int mo20902() {
        return this.f32651;
    }
}
