package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48T4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11382 extends AbstractC22111 {

    /* JADX INFO: renamed from: ۧ */
    public int f31765;

    /* JADX INFO: renamed from: ܳ */
    public final C19203 f31766;

    /* JADX INFO: renamed from: ܽ */
    public boolean f31767;

    /* JADX INFO: renamed from: ܿ */
    public final C19203 f31768;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f31769;

    /* JADX INFO: renamed from: ᩻ */
    public int f31770;

    public C11382(InterfaceC20790 interfaceC20790) {
        super(interfaceC20790);
        this.f31766 = new C19203(C18058.f53916);
        this.f31768 = new C19203(4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26335(C19203 c19203) throws C8699 {
        int iM43702 = c19203.m43702();
        int i = (iM43702 >> 4) & 15;
        int i2 = iM43702 & 15;
        if (i2 != 7) {
            throw new C8699(C20778.m46922(i2, "Video format not supported: "));
        }
        this.f31765 = i;
        return i != 5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26334(long j, C19203 c19203) {
        int iM43702 = c19203.m43702();
        long jM43714 = (((long) c19203.m43714()) * 1000) + j;
        InterfaceC20790 interfaceC20790 = this.f69964;
        if (iM43702 == 0 && !this.f31767) {
            C19203 c19204 = new C19203(new byte[c19203.m43703()]);
            c19203.m43707(0, c19203.m43703(), c19204.m43728());
            C9310 c9310M21550 = C9310.m21550(c19204);
            this.f31770 = c9310M21550.f25308;
            C3601 c3601 = new C3601();
            c3601.m6694("video/x-flv");
            c3601.m6697("video/avc");
            c3601.m6677(c9310M21550.f25312);
            c3601.m6685(c9310M21550.f25311);
            c3601.m6689(c9310M21550.f25316);
            c3601.m6692(c9310M21550.f25307);
            c3601.m6678((List) c9310M21550.f25306);
            interfaceC20790.mo10503(c3601.m6672());
            this.f31767 = true;
            return false;
        }
        if (iM43702 == 1 && this.f31767) {
            int i = this.f31765 == 1 ? 1 : 0;
            if (this.f31769 || i != 0) {
                C19203 c19205 = this.f31768;
                byte[] bArrM43728 = c19205.m43728();
                bArrM43728[0] = 0;
                bArrM43728[1] = 0;
                bArrM43728[2] = 0;
                int i2 = 4 - this.f31770;
                int i3 = 0;
                while (c19203.m43703() > 0) {
                    c19203.m43707(i2, this.f31770, c19205.m43728());
                    c19205.m43730(0);
                    int iM43738 = c19205.m43738();
                    C19203 c19206 = this.f31766;
                    c19206.m43730(0);
                    interfaceC20790.mo10500(4, c19206);
                    interfaceC20790.mo10500(iM43738, c19203);
                    i3 = i3 + 4 + iM43738;
                }
                this.f69964.mo10502(jM43714, i, i3, 0, null);
                this.f31769 = true;
                return true;
            }
        }
        return false;
    }
}
