package p067l;

import java.math.BigInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩻᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7YF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25121 extends AbstractC18100 {

    /* JADX INFO: renamed from: ֡ */
    public int f80376;

    /* JADX INFO: renamed from: ֨ */
    public byte[] f80377;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC5952 f80378;

    /* JADX INFO: renamed from: ۘ */
    public byte[] f80379;

    /* JADX INFO: renamed from: ۚ */
    public int f80380;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f80381;

    /* JADX INFO: renamed from: ۠ */
    public C10054 f80382;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f80383;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f80384;

    /* JADX INFO: renamed from: ܶ */
    public int f80385;

    /* JADX INFO: renamed from: ܺ */
    public C17823 f80386;

    /* JADX INFO: renamed from: ᩴ */
    public byte[] f80387;

    /* JADX INFO: renamed from: ᩵ */
    public String f80388;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f80389;

    /* JADX INFO: renamed from: ᩸ */
    public int f80390;

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ֫ */
    public final void mo20900(C9383 c9383, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C14392 {
        int i;
        this.f80383 = bArr;
        this.f80384 = bArr2;
        this.f80389 = bArr3;
        this.f80381 = bArr4;
        try {
            InterfaceC5005 interfaceC5005 = (InterfaceC5005) Class.forName(c9383.m21829(this.f80388)).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
            this.f54035 = interfaceC5005;
            interfaceC5005.init();
            C17823 c17823 = new C17823();
            this.f80386 = c17823;
            this.f80382 = new C10054(c17823);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(c9383.m21829("dh")).asSubclass(InterfaceC5952.class);
                this.f80380 = Integer.parseInt(c9383.m21829("dhgex_min"));
                this.f80376 = Integer.parseInt(c9383.m21829("dhgex_max"));
                int i2 = Integer.parseInt(c9383.m21829("dhgex_preferred"));
                this.f80385 = i2;
                int i3 = this.f80380;
                if (i3 <= 0 || (i = this.f80376) <= 0 || i2 <= 0 || i2 < i3 || i2 > i) {
                    throw new C14392("Invalid DHGEX sizes: min=" + this.f80380 + " max=" + this.f80376 + " preferred=" + this.f80385);
                }
                InterfaceC5952 interfaceC5952 = (InterfaceC5952) clsAsSubclass.getDeclaredConstructor(null).newInstance(null);
                this.f80378 = interfaceC5952;
                interfaceC5952.init();
                this.f80382.m23425();
                this.f80386.m40448((byte) 34);
                this.f80386.m40459(this.f80380);
                this.f80386.m40459(this.f80385);
                this.f80386.m40459(this.f80376);
                c9383.m21845(this.f80382);
                c9383.f25608.m49100().getClass();
                this.f80390 = 31;
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
        int i = this.f80390;
        if (i == 31) {
            c17823.m40464();
            c17823.m40447();
            if (c17823.m40447() != 31) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f80377 = c17823.m40468();
            this.f80387 = c17823.m40468();
            int iBitLength = new BigInteger(1, this.f80377).bitLength();
            if (iBitLength >= this.f80380 && iBitLength <= this.f80376) {
                this.f80378.mo13365(this.f80377);
                this.f80378.mo13361(this.f80387);
                this.f80379 = this.f80378.mo13362();
                this.f80382.m23425();
                this.f80386.m40448(UTF8.S_CS3);
                this.f80386.m40467(this.f80379);
                this.f54037.m21845(this.f80382);
                this.f54037.f25608.m49100().getClass();
                this.f80390 = 33;
                return true;
            }
        } else if (i == 33) {
            c17823.m40464();
            c17823.m40447();
            if (c17823.m40447() != 33) {
                this.f54037.f25608.m49100().getClass();
                return false;
            }
            this.f54036 = c17823.m40471();
            byte[] bArrM40468 = c17823.m40468();
            byte[] bArrM40471 = c17823.m40471();
            this.f80378.mo13363(bArrM40468);
            this.f80378.getClass();
            this.f54034 = AbstractC18100.m41165(AbstractC18100.m41164(this.f80378.mo13364()), true);
            byte[] bArrM41166 = AbstractC18100.m41166(this.f80384, false);
            this.f54035.mo3552(bArrM41166.length, bArrM41166);
            byte[] bArrM41167 = AbstractC18100.m41166(this.f80383, false);
            this.f54035.mo3552(bArrM41167.length, bArrM41167);
            byte[] bArrM41168 = AbstractC18100.m41166(this.f80381, false);
            this.f54035.mo3552(bArrM41168.length, bArrM41168);
            byte[] bArrM41169 = AbstractC18100.m41166(this.f80389, false);
            this.f54035.mo3552(bArrM41169.length, bArrM41169);
            byte[] bArrM411610 = AbstractC18100.m41166(this.f54036, false);
            this.f54035.mo3552(bArrM411610.length, bArrM411610);
            this.f54035.mo3552(4, AbstractC18100.m41163(this.f80380));
            this.f54035.mo3552(4, AbstractC18100.m41163(this.f80385));
            this.f54035.mo3552(4, AbstractC18100.m41163(this.f80376));
            byte[] bArrM41165 = AbstractC18100.m41165(this.f80377, false);
            this.f54035.mo3552(bArrM41165.length, bArrM41165);
            byte[] bArrM411611 = AbstractC18100.m41165(this.f80387, false);
            this.f54035.mo3552(bArrM411611.length, bArrM411611);
            byte[] bArrM411612 = AbstractC18100.m41165(this.f80379, false);
            this.f54035.mo3552(bArrM411612.length, bArrM411612);
            byte[] bArrM411613 = AbstractC18100.m41165(bArrM40468, false);
            this.f54035.mo3552(bArrM411613.length, bArrM411613);
            InterfaceC5005 interfaceC5005 = this.f54035;
            byte[] bArr = this.f54034;
            interfaceC5005.mo3552(bArr.length, bArr);
            this.f54033 = this.f54035.mo3553();
            byte[] bArr2 = this.f54036;
            int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
            boolean zM41168 = m41168(C20764.m46879(4, i2, bArr2), this.f54036, bArrM40471, i2 + 4);
            this.f80390 = 0;
            return zM41168;
        }
        return false;
    }

    @Override // p067l.AbstractC18100
    /* JADX INFO: renamed from: ܽ */
    public final int mo20902() {
        return this.f80390;
    }
}
