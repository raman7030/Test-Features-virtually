package p067l;

/* JADX INFO: renamed from: l.᩷᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7UY */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22440 extends AbstractC18100 {

    /* JADX INFO: renamed from: ֡ */
    public String f70795;

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC2657 f70796;

    /* JADX INFO: renamed from: ۖ */
    public C17823 f70797;

    /* JADX INFO: renamed from: ۘ */
    public String f70798;

    /* JADX INFO: renamed from: ۚ */
    public int f70799;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f70800;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f70801;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f70802;

    /* JADX INFO: renamed from: ܺ */
    public byte[] f70803;

    /* JADX INFO: renamed from: ᩴ */
    public int f70804;

    /* JADX INFO: renamed from: ᩵ */
    public C10054 f70805;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f70806;

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C14392 {
        this.f70803 = bArr;
        this.f70801 = bArr2;
        this.f70806 = bArr3;
        this.f70800 = bArr4;
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(c9383.m21829(this.f70795)).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f54035 = interfaceC5005;
            interfaceC5005.init();
            C17823 c17823 = new C17823();
            this.f70797 = c17823;
            C10054 c10054 = new C10054(c17823);
            this.f70805 = c10054;
            c10054.m23425();
            this.f70797.m40448((byte) 30);
            try {
                InterfaceC2657 interfaceC2657 = (InterfaceC2657) Class.forName(c9383.m21829("xdh")).asSubclass(InterfaceC2657.class).getDeclaredConstructor(null).newInstance(null);
                this.f70796 = interfaceC2657;
                interfaceC2657.mo4072(this.f70804, this.f70798);
                byte[] q = this.f70796.getQ();
                this.f70802 = q;
                this.f70797.m40470(q);
                if (bArr == null) {
                    return;
                }
                c9383.m21845(this.f70805);
                c9383.f25608.m49100().getClass();
                this.f70799 = 31;
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
        if (this.f70799 == 31) {
            c17823.m40464();
            c17823.m40447();
            if (c17823.m40447() != 31) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f54036 = c17823.m40471();
            byte[] bArrM40471 = c17823.m40471();
            if (this.f70796.mo4074(bArrM40471)) {
                this.f54034 = AbstractC18100.m41165(AbstractC18100.m41164(this.f70796.mo4073(bArrM40471)), true);
                byte[] bArrM40472 = c17823.m40471();
                byte[] bArrM41166 = AbstractC18100.m41166(this.f70801, false);
                this.f54035.mo3552(bArrM41166.length, bArrM41166);
                byte[] bArrM41167 = AbstractC18100.m41166(this.f70803, false);
                this.f54035.mo3552(bArrM41167.length, bArrM41167);
                byte[] bArrM41168 = AbstractC18100.m41166(this.f70800, false);
                this.f54035.mo3552(bArrM41168.length, bArrM41168);
                byte[] bArrM41169 = AbstractC18100.m41166(this.f70806, false);
                this.f54035.mo3552(bArrM41169.length, bArrM41169);
                byte[] bArrM411610 = AbstractC18100.m41166(this.f54036, false);
                this.f54035.mo3552(bArrM411610.length, bArrM411610);
                byte[] bArrM411611 = AbstractC18100.m41166(this.f70802, false);
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
                this.f70799 = 0;
                return zM41168;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ܽ */
    public final int mo20902() {
        return this.f70799;
    }
}
