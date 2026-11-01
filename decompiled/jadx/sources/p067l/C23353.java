package p067l;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes.dex */
public final class C23353 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC23116 f74453;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC16646 f74455;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC20790 f74456;

    /* JADX INFO: renamed from: ܳ */
    public int f74452 = 0;

    /* JADX INFO: renamed from: ܿ */
    public long f74454 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f74451 = -1;

    /* JADX INFO: renamed from: ֫ */
    public long f74450 = -1;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return C5248.m11320(interfaceC10375);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f74453 = interfaceC23116;
        this.f74456 = interfaceC23116.mo5732(0, 1);
        interfaceC23116.mo5734();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f74452 = j == 0 ? 0 : 4;
        InterfaceC16646 interfaceC16646 = this.f74455;
        if (interfaceC16646 != null) {
            interfaceC16646.mo23240(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int iM12979;
        C23877.m52958(this.f74456);
        String str = C5792.f14228;
        int i = this.f74452;
        if (i == 0) {
            C23877.m52960(interfaceC10375.getPosition() == 0);
            int i2 = this.f74451;
            if (i2 != -1) {
                interfaceC10375.mo24040(i2);
                this.f74452 = 4;
                return 0;
            }
            if (!C5248.m11320(interfaceC10375)) {
                throw C10998.m25387("Unsupported or unrecognized wav file type.", (Throwable) null);
            }
            interfaceC10375.mo24040((int) (interfaceC10375.mo24039() - interfaceC10375.getPosition()));
            this.f74452 = 1;
            return 0;
        }
        long jM43717 = -1;
        if (i == 1) {
            C19203 c19203 = new C19203(8);
            C6589 c6589M15073 = C6589.m15073(interfaceC10375, c19203);
            if (c6589M15073.f17015 != 1685272116) {
                interfaceC10375.mo24036();
            } else {
                interfaceC10375.mo24030(8);
                c19203.m43730(0);
                interfaceC10375.mo24031(0, 8, c19203.m43728());
                jM43717 = c19203.m43717();
                interfaceC10375.mo24040(((int) c6589M15073.f17016) + 8);
            }
            this.f74454 = jM43717;
            this.f74452 = 2;
            return 0;
        }
        if (i == 2) {
            C21342 c21342M11321 = C5248.m11321(interfaceC10375);
            int i3 = c21342M11321.f67295;
            if (i3 == 17) {
                this.f74455 = new C9942(this.f74453, this.f74456, c21342M11321);
            } else if (i3 == 6) {
                this.f74455 = new C22683(this.f74453, this.f74456, c21342M11321, "audio/g711-alaw", -1);
            } else if (i3 == 7) {
                this.f74455 = new C22683(this.f74453, this.f74456, c21342M11321, "audio/g711-mlaw", -1);
            } else {
                int i4 = c21342M11321.f67290;
                if (i3 == 1) {
                    iM12979 = C5792.m12979(i4, ByteOrder.LITTLE_ENDIAN);
                } else {
                    if (i3 != 3) {
                        if (i3 == 65534) {
                            iM12979 = C5792.m12979(i4, ByteOrder.LITTLE_ENDIAN);
                        }
                    } else if (i4 == 32) {
                        iM12979 = 4;
                    }
                    iM12979 = 0;
                }
                if (iM12979 == 0) {
                    throw C10998.m25388("Unsupported WAV format type: " + i3);
                }
                this.f74455 = new C22683(this.f74453, this.f74456, c21342M11321, "audio/raw", iM12979);
            }
            this.f74452 = 3;
            return 0;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException();
            }
            C23877.m52960(this.f74450 != -1);
            long position = this.f74450 - interfaceC10375.getPosition();
            InterfaceC16646 interfaceC16646 = this.f74455;
            interfaceC16646.getClass();
            return interfaceC16646.mo23241(interfaceC10375, position) ? -1 : 0;
        }
        Pair pairM11322 = C5248.m11322(interfaceC10375);
        this.f74451 = ((Long) pairM11322.first).intValue();
        long jLongValue = ((Long) pairM11322.second).longValue();
        long j = this.f74454;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        this.f74450 = ((long) this.f74451) + jLongValue;
        long length = interfaceC10375.getLength();
        if (length != -1 && this.f74450 > length) {
            C21334.m48351("Data exceeds input length: " + this.f74450 + ", " + length);
            this.f74450 = length;
        }
        InterfaceC16646 interfaceC16647 = this.f74455;
        interfaceC16647.getClass();
        interfaceC16647.mo23239(this.f74451, this.f74450);
        this.f74452 = 4;
        return 0;
    }
}
