package p067l;

/* JADX INFO: renamed from: l.۠ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77Y0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9975 extends AbstractC18100 {

    /* JADX INFO: renamed from: ֡ */
    public String f27626;

    /* JADX INFO: renamed from: ۖ */
    public C17823 f27627;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC11040 f27628;

    /* JADX INFO: renamed from: ۚ */
    public int f27629;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f27630;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f27631;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f27632;

    /* JADX INFO: renamed from: ܺ */
    public byte[] f27633;

    /* JADX INFO: renamed from: ᩴ */
    public int f27634;

    /* JADX INFO: renamed from: ᩵ */
    public C10054 f27635;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f27636;

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C14392 {
        this.f27633 = bArr;
        this.f27631 = bArr2;
        this.f27636 = bArr3;
        this.f27630 = bArr4;
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(c9383.m21829(this.f27626)).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f54035 = interfaceC5005;
            interfaceC5005.init();
            C17823 c17823 = new C17823();
            this.f27627 = c17823;
            C10054 c10054 = new C10054(c17823);
            this.f27635 = c10054;
            c10054.m23425();
            this.f27627.m40448((byte) 30);
            try {
                InterfaceC11040 interfaceC11040 = (InterfaceC11040) Class.forName(c9383.m21829("ecdh-sha2-nistp")).asSubclass(InterfaceC11040.class).getDeclaredConstructor(null).newInstance(null);
                this.f27628 = interfaceC11040;
                interfaceC11040.mo25447(this.f27634);
                byte[] q = this.f27628.getQ();
                this.f27632 = q;
                this.f27627.m40470(q);
                if (bArr == null) {
                    return;
                }
                c9383.m21845(this.f27635);
                c9383.f25608.m49100().getClass();
                this.f27629 = 31;
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
        if (this.f27629 == 31) {
            c17823.m40464();
            c17823.m40447();
            if (c17823.m40447() != 31) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f54036 = c17823.m40471();
            byte[] bArrM40471 = c17823.m40471();
            byte[][] bArrM20158 = C8713.m20158(bArrM40471);
            if (this.f27628.mo25449(bArrM20158[0], bArrM20158[1])) {
                this.f54034 = AbstractC18100.m41165(AbstractC18100.m41164(this.f27628.mo25448(bArrM20158[0], bArrM20158[1])), true);
                byte[] bArrM40472 = c17823.m40471();
                byte[] bArrM41166 = AbstractC18100.m41166(this.f27631, false);
                this.f54035.mo3552(bArrM41166.length, bArrM41166);
                byte[] bArrM41167 = AbstractC18100.m41166(this.f27633, false);
                this.f54035.mo3552(bArrM41167.length, bArrM41167);
                byte[] bArrM41168 = AbstractC18100.m41166(this.f27630, false);
                this.f54035.mo3552(bArrM41168.length, bArrM41168);
                byte[] bArrM41169 = AbstractC18100.m41166(this.f27636, false);
                this.f54035.mo3552(bArrM41169.length, bArrM41169);
                byte[] bArrM411610 = AbstractC18100.m41166(this.f54036, false);
                this.f54035.mo3552(bArrM411610.length, bArrM411610);
                byte[] bArrM411611 = AbstractC18100.m41166(this.f27632, false);
                this.f54035.mo3552(bArrM411611.length, bArrM411611);
                byte[] bArrM411612 = AbstractC18100.m41166(bArrM40471, false);
                this.f54035.mo3552(bArrM411612.length, bArrM411612);
                InterfaceC5005 interfaceC5005 = this.f54035;
                byte[] bArr = this.f54034;
                interfaceC5005.mo3552(bArr.length, bArr);
                this.f54033 = this.f54035.mo3553();
                byte[] bArr2 = this.f54036;
                int i = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
                boolean zM41168 = m41168(C20764.m46879(4, i, bArr2), this.f54036, bArrM40472, i + 4);
                this.f27629 = 0;
                return zM41168;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ܽ */
    public final int mo20902() {
        return this.f27629;
    }
}
