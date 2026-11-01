package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.۠֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9803 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f27123;

    /* JADX INFO: renamed from: ۢ */
    public C3097 f27128;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f27129;

    /* JADX INFO: renamed from: ܺ */
    public final C15976 f27131;

    /* JADX INFO: renamed from: ܽ */
    public String f27132;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC20790 f27133;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f27134;

    /* JADX INFO: renamed from: ᩴ */
    public long f27135;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f27136;

    /* JADX INFO: renamed from: ۜ */
    public final boolean[] f27126 = new boolean[3];

    /* JADX INFO: renamed from: ۘ */
    public final C7792 f27125 = new C7792(7);

    /* JADX INFO: renamed from: ᩻ */
    public final C7792 f27137 = new C7792(8);

    /* JADX INFO: renamed from: ۡ */
    public final C7792 f27127 = new C7792(6);

    /* JADX INFO: renamed from: ܳ */
    public long f27130 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۖ */
    public final C19203 f27124 = new C19203();

    public C9803(C15976 c15976, boolean z, boolean z2) {
        this.f27131 = c15976;
        this.f27123 = z;
        this.f27129 = z2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f27135 = 0L;
        this.f27136 = false;
        this.f27130 = -9223372036854775807L;
        C18058.m41113(this.f27126);
        this.f27125.m18036();
        this.f27137.m18036();
        this.f27127.m18036();
        this.f27131.m36315();
        C3097 c3097 = this.f27128;
        if (c3097 != null) {
            c3097.m5255();
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f27132 = c20672.m46738();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 2);
        this.f27133 = interfaceC20790Mo5732;
        this.f27128 = new C3097(interfaceC20790Mo5732, this.f27123, this.f27129);
        this.f27131.m36318(interfaceC23116, c20672);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f27130 = j;
        this.f27136 = ((i & 2) != 0) | this.f27136;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫ */
    private void m22889(long j, int i, long j2) {
        if (!this.f27134 || this.f27128.m5253()) {
            this.f27125.m18037(i);
            this.f27137.m18037(i);
        }
        this.f27127.m18037(i);
        this.f27128.m5250(i, j, j2, this.f27136);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫ */
    private void m22888(int i, int i2, byte[] bArr) {
        if (!this.f27134 || this.f27128.m5253()) {
            this.f27125.m18033(i, i2, bArr);
            this.f27137.m18033(i, i2, bArr);
        }
        this.f27127.m18033(i, i2, bArr);
        this.f27128.m5249(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ֫ */
    private void m22887(int i, int i2, long j, long j2) {
        boolean z = this.f27134;
        C15976 c15976 = this.f27131;
        if (!z || this.f27128.m5253()) {
            C7792 c7792 = this.f27125;
            c7792.m18035(i2);
            C7792 c7793 = this.f27137;
            c7793.m18035(i2);
            if (!this.f27134) {
                if (c7792.m18034() && c7793.m18034()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(c7792.f20432, c7792.f20434));
                    arrayList.add(Arrays.copyOf(c7793.f20432, c7793.f20434));
                    C12695 c12695M41117 = C18058.m41117(3, c7792.f20434, c7792.f20432);
                    int i3 = c12695M41117.f35628;
                    C19400 c19400 = new C19400(c7793.f20432, 4, c7793.f20434);
                    int iM44177 = c19400.m44177();
                    int iM44178 = c19400.m44177();
                    c19400.m44174();
                    C3977 c3977 = new C3977(iM44177, iM44178, c19400.m44176());
                    int i4 = c12695M41117.f35633;
                    int i5 = c12695M41117.f35627;
                    int i6 = c12695M41117.f35624;
                    int i7 = C19322.f57686;
                    String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    InterfaceC20790 interfaceC20790 = this.f27133;
                    C3601 c3601 = new C3601();
                    c3601.m6701(this.f27132);
                    c3601.m6694("video/mp2t");
                    c3601.m6697("video/avc");
                    c3601.m6677(str);
                    c3601.m6685(c12695M41117.f35618);
                    c3601.m6689(c12695M41117.f35625);
                    C8966 c8966 = new C8966();
                    c8966.m20709(c12695M41117.f35631);
                    c8966.m20708(c12695M41117.f35629);
                    c8966.m20711(c12695M41117.f35630);
                    c8966.m20710(c12695M41117.f35626 + 8);
                    c8966.m20706(c12695M41117.f35619 + 8);
                    c3601.m6680(c8966.m20705());
                    c3601.m6692(c12695M41117.f35632);
                    c3601.m6678((List) arrayList);
                    c3601.m6684(i3);
                    interfaceC20790.mo10503(c3601.m6672());
                    this.f27134 = true;
                    c15976.m36316(i3);
                    this.f27128.m5252(c12695M41117);
                    this.f27128.m5251(c3977);
                    c7792.m18036();
                    c7793.m18036();
                }
            } else if (c7792.m18034()) {
                C12695 c12695M41118 = C18058.m41117(3, c7792.f20434, c7792.f20432);
                c15976.m36316(c12695M41118.f35628);
                this.f27128.m5252(c12695M41118);
                c7792.m18036();
            } else if (c7793.m18034()) {
                C19400 c19401 = new C19400(c7793.f20432, 4, c7793.f20434);
                int iM44179 = c19401.m44177();
                int iM441710 = c19401.m44177();
                c19401.m44174();
                this.f27128.m5251(new C3977(iM44179, iM441710, c19401.m44176()));
                c7793.m18036();
            }
        }
        C7792 c7794 = this.f27127;
        if (c7794.m18035(i2)) {
            int iM41106 = C18058.m41106(c7794.f20434, c7794.f20432);
            byte[] bArr = c7794.f20432;
            C19203 c19203 = this.f27124;
            c19203.m43708(iM41106, bArr);
            c19203.m43730(4);
            c15976.m36317(j2, c19203);
        }
        if (this.f27128.m5254(j, i, this.f27134)) {
            this.f27136 = false;
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        int i;
        int i2;
        C23877.m52958(this.f27133);
        String str = C5792.f14228;
        int iM43731 = c19203.m43731();
        int iM43729 = c19203.m43729();
        byte[] bArrM43728 = c19203.m43728();
        this.f27135 += (long) c19203.m43703();
        this.f27133.mo10500(c19203.m43703(), c19203);
        while (true) {
            int iM41105 = C18058.m41105(iM43731, iM43729, bArrM43728, this.f27126);
            if (iM41105 == iM43729) {
                m22888(iM43731, iM43729, bArrM43728);
                return;
            }
            int i3 = bArrM43728[iM41105 + 3] & C0684bo.f2505j;
            if (iM41105 <= 0 || bArrM43728[iM41105 - 1] != 0) {
                i = iM41105;
                i2 = 3;
            } else {
                i = iM41105 - 1;
                i2 = 4;
            }
            int i4 = i - iM43731;
            if (i4 > 0) {
                m22888(iM43731, i, bArrM43728);
            }
            int i5 = iM43729 - i;
            long j = this.f27135 - ((long) i5);
            m22887(i5, i4 < 0 ? -i4 : 0, j, this.f27130);
            m22889(j, i3, this.f27130);
            iM43731 = i + i2;
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        C23877.m52958(this.f27133);
        String str = C5792.f14228;
        if (z) {
            this.f27131.m36319();
            m22887(0, 0, this.f27135, this.f27130);
            m22889(this.f27135, 9, this.f27130);
            m22887(0, 0, this.f27135, this.f27130);
        }
    }
}
