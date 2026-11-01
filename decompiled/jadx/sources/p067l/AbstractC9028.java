package p067l;

/* JADX INFO: renamed from: l.ۜ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7V1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9028 extends AbstractC18100 {

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC5952 f24493;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f24494;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f24495;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f24496;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f24497;

    /* JADX INFO: renamed from: ܺ */
    public C17823 f24498;

    /* JADX INFO: renamed from: ᩴ */
    public C10054 f24499;

    /* JADX INFO: renamed from: ᩵ */
    public int f24500;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f24501;

    /* JADX INFO: renamed from: ܳ */
    public abstract String mo8932();

    /* JADX INFO: renamed from: ܿ */
    public abstract byte[] mo8933();

    /* JADX INFO: renamed from: ᩳ */
    public abstract byte[] mo8934();

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C14392 {
        this.f24496 = bArr;
        this.f24497 = bArr2;
        this.f24501 = bArr3;
        this.f24495 = bArr4;
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(c9383.m21829(mo8932())).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f54035 = interfaceC5005;
            interfaceC5005.init();
            C17823 c17823 = new C17823();
            this.f24498 = c17823;
            this.f24499 = new C10054(c17823);
            try {
                InterfaceC5952 interfaceC5952 = (InterfaceC5952) Class.forName(c9383.m21829("dh")).asSubclass(InterfaceC5952.class).getDeclaredConstructor(null).newInstance(null);
                this.f24493 = interfaceC5952;
                interfaceC5952.init();
                this.f24493.mo13365(mo8933());
                this.f24493.mo13361(mo8934());
                this.f24494 = this.f24493.mo13362();
                this.f24499.m23425();
                this.f24498.m40448((byte) 30);
                this.f24498.m40467(this.f24494);
                if (bArr == null) {
                    return;
                }
                c9383.m21845(this.f24499);
                c9383.f25608.m49100().getClass();
                this.f24500 = 31;
            } catch (Exception e) {
                throw new C14392(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C14392(e2.toString(), e2);
        }
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20901(C17823 c17823) throws C14392 {
        if (this.f24500 != 31) {
            return false;
        }
        c17823.m40464();
        c17823.m40447();
        if (c17823.m40447() != 31) {
            this.f54037.f25608.m49100().getClass();
            return false;
        }
        this.f54036 = c17823.m40471();
        byte[] bArrM40468 = c17823.m40468();
        byte[] bArrM40471 = c17823.m40471();
        this.f24493.mo13363(bArrM40468);
        this.f24493.getClass();
        this.f54034 = AbstractC18100.m41165(AbstractC18100.m41164(this.f24493.mo13364()), true);
        byte[] bArrM41166 = AbstractC18100.m41166(this.f24497, false);
        this.f54035.mo3552(bArrM41166.length, bArrM41166);
        byte[] bArrM41167 = AbstractC18100.m41166(this.f24496, false);
        this.f54035.mo3552(bArrM41167.length, bArrM41167);
        byte[] bArrM41168 = AbstractC18100.m41166(this.f24495, false);
        this.f54035.mo3552(bArrM41168.length, bArrM41168);
        byte[] bArrM41169 = AbstractC18100.m41166(this.f24501, false);
        this.f54035.mo3552(bArrM41169.length, bArrM41169);
        byte[] bArrM411610 = AbstractC18100.m41166(this.f54036, false);
        this.f54035.mo3552(bArrM411610.length, bArrM411610);
        byte[] bArrM41165 = AbstractC18100.m41165(this.f24494, false);
        this.f54035.mo3552(bArrM41165.length, bArrM41165);
        byte[] bArrM411611 = AbstractC18100.m41165(bArrM40468, false);
        this.f54035.mo3552(bArrM411611.length, bArrM411611);
        InterfaceC5005 interfaceC5005 = this.f54035;
        byte[] bArr = this.f54034;
        interfaceC5005.mo3552(bArr.length, bArr);
        this.f54033 = this.f54035.mo3553();
        byte[] bArr2 = this.f54036;
        int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
        boolean zM41168 = m41168(C20764.m46879(4, i, bArr2), this.f54036, bArrM40471, i + 4);
        this.f24500 = 0;
        return zM41168;
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ܽ */
    public final int mo20902() {
        return this.f24500;
    }
}
