package l;

import java.math.BigInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩻᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7YF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23940 extends AbstractC16553 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f77624;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public byte[] f77625;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC3771 f77626;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f77627;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f77628;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f77629;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C8087 f77630;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f77631;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f77632;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f77633;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C16261 f77634;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f77635;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f77636;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f77637;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f77638;

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫ */
    public final void mo18943(C7381 c7381, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws C12651 {
        int i;
        this.f77631 = bArr;
        this.f77632 = bArr2;
        this.f77637 = bArr3;
        this.f77629 = bArr4;
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(c7381.m19856(this.f77636)).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f50857 = interfaceC2774;
            interfaceC2774.init();
            C16261 c16261 = new C16261();
            this.f77634 = c16261;
            this.f77630 = new C8087(c16261);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(c7381.m19856("dh")).asSubclass(InterfaceC3771.class);
                this.f77628 = Integer.parseInt(c7381.m19856("dhgex_min"));
                this.f77624 = Integer.parseInt(c7381.m19856("dhgex_max"));
                int i2 = Integer.parseInt(c7381.m19856("dhgex_preferred"));
                this.f77633 = i2;
                int i3 = this.f77628;
                if (i3 <= 0 || (i = this.f77624) <= 0 || i2 <= 0 || i2 < i3 || i2 > i) {
                    throw new C12651("Invalid DHGEX sizes: min=" + this.f77628 + " max=" + this.f77624 + " preferred=" + this.f77633);
                }
                InterfaceC3771 interfaceC3771 = (InterfaceC3771) clsAsSubclass.getDeclaredConstructor(null).newInstance(null);
                this.f77626 = interfaceC3771;
                interfaceC3771.init();
                this.f77630.m21457();
                this.f77634.m38234((byte) 34);
                this.f77634.m38245(this.f77628);
                this.f77634.m38245(this.f77633);
                this.f77634.m38245(this.f77624);
                c7381.m19872(this.f77630);
                c7381.f22696.m46777().getClass();
                this.f77638 = 31;
            } catch (Exception e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18944(C16261 c16261) throws C12651 {
        int i = this.f77638;
        if (i == 31) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 31) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f77625 = c16261.m38254();
            this.f77635 = c16261.m38254();
            int iBitLength = new BigInteger(1, this.f77625).bitLength();
            if (iBitLength >= this.f77628 && iBitLength <= this.f77624) {
                this.f77626.mo11429(this.f77625);
                this.f77626.mo11425(this.f77635);
                this.f77627 = this.f77626.mo11426();
                this.f77630.m21457();
                this.f77634.m38234(UTF8.S_CS3);
                this.f77634.m38253(this.f77627);
                this.f50859.m19872(this.f77630);
                this.f50859.f22696.m46777().getClass();
                this.f77638 = 33;
                return true;
            }
        } else if (i == 33) {
            c16261.m38250();
            c16261.m38233();
            if (c16261.m38233() != 33) {
                this.f50859.f22696.m46777().getClass();
                return false;
            }
            this.f50858 = c16261.m38257();
            byte[] bArrM38254 = c16261.m38254();
            byte[] bArrM38257 = c16261.m38257();
            this.f77626.mo11427(bArrM38254);
            this.f77626.getClass();
            this.f50856 = AbstractC16553.m38939(AbstractC16553.m38938(this.f77626.mo11428()), true);
            byte[] bArrM38940 = AbstractC16553.m38940(this.f77632, false);
            this.f50857.mo1151(bArrM38940.length, bArrM38940);
            byte[] bArrM38941 = AbstractC16553.m38940(this.f77631, false);
            this.f50857.mo1151(bArrM38941.length, bArrM38941);
            byte[] bArrM38942 = AbstractC16553.m38940(this.f77629, false);
            this.f50857.mo1151(bArrM38942.length, bArrM38942);
            byte[] bArrM38943 = AbstractC16553.m38940(this.f77637, false);
            this.f50857.mo1151(bArrM38943.length, bArrM38943);
            byte[] bArrM38944 = AbstractC16553.m38940(this.f50858, false);
            this.f50857.mo1151(bArrM38944.length, bArrM38944);
            this.f50857.mo1151(4, AbstractC16553.m38937(this.f77628));
            this.f50857.mo1151(4, AbstractC16553.m38937(this.f77633));
            this.f50857.mo1151(4, AbstractC16553.m38937(this.f77624));
            byte[] bArrM38939 = AbstractC16553.m38939(this.f77625, false);
            this.f50857.mo1151(bArrM38939.length, bArrM38939);
            byte[] bArrM389310 = AbstractC16553.m38939(this.f77635, false);
            this.f50857.mo1151(bArrM389310.length, bArrM389310);
            byte[] bArrM389311 = AbstractC16553.m38939(this.f77627, false);
            this.f50857.mo1151(bArrM389311.length, bArrM389311);
            byte[] bArrM389312 = AbstractC16553.m38939(bArrM38254, false);
            this.f50857.mo1151(bArrM389312.length, bArrM389312);
            InterfaceC2774 interfaceC2774 = this.f50857;
            byte[] bArr = this.f50856;
            interfaceC2774.mo1151(bArr.length, bArr);
            this.f50855 = this.f50857.mo1152();
            byte[] bArr2 = this.f50858;
            int i2 = ((bArr2[0] << 24) & (-16777216)) | ((bArr2[1] << 16) & 16711680) | ((bArr2[2] << 8) & 65280) | (bArr2[3] & 255);
            boolean zM38942 = m38942(C19356.m44585(4, i2, bArr2), this.f50858, bArrM38257, i2 + 4);
            this.f77638 = 0;
            return zM38942;
        }
        return false;
    }

    @Override // l.AbstractC16553
    /* JADX INFO: renamed from: ܽ */
    public final int mo18945() {
        return this.f77638;
    }
}
