package p067l;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: l.᩸֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8S4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22545 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ֫ */
    public String f71106;

    /* JADX INFO: renamed from: ۖ */
    public long f71107;

    /* JADX INFO: renamed from: ۜ */
    public C16508 f71109;

    /* JADX INFO: renamed from: ۧ */
    public boolean f71112;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC20790 f71115;

    /* JADX INFO: renamed from: ᩷ */
    public final C15976 f71118;

    /* JADX INFO: renamed from: ܳ */
    public final boolean[] f71113 = new boolean[3];

    /* JADX INFO: renamed from: ۘ */
    public final C7792 f71108 = new C7792(32);

    /* JADX INFO: renamed from: ۡ */
    public final C7792 f71110 = new C7792(33);

    /* JADX INFO: renamed from: ܿ */
    public final C7792 f71116 = new C7792(34);

    /* JADX INFO: renamed from: ᩻ */
    public final C7792 f71119 = new C7792(39);

    /* JADX INFO: renamed from: ܺ */
    public final C7792 f71114 = new C7792(40);

    /* JADX INFO: renamed from: ᩳ */
    public long f71117 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۢ */
    public final C19203 f71111 = new C19203();

    public C22545(C15976 c15976) {
        this.f71118 = c15976;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f71107 = 0L;
        this.f71117 = -9223372036854775807L;
        C18058.m41113(this.f71113);
        this.f71108.m18036();
        this.f71110.m18036();
        this.f71116.m18036();
        this.f71119.m18036();
        this.f71114.m18036();
        this.f71118.m36315();
        C16508 c16508 = this.f71109;
        if (c16508 != null) {
            c16508.m37463();
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f71106 = c20672.m46738();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 2);
        this.f71115 = interfaceC20790Mo5732;
        this.f71109 = new C16508(interfaceC20790Mo5732);
        this.f71118.m36318(interfaceC23116, c20672);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f71117 = j;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ۧ */
    private void m50517(int i, int i2, long j, long j2) {
        this.f71109.m37464(i, i2, j, j2, this.f71112);
        if (!this.f71112) {
            this.f71108.m18037(i2);
            this.f71110.m18037(i2);
            this.f71116.m18037(i2);
        }
        this.f71119.m18037(i2);
        this.f71114.m18037(i2);
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: ֫ */
    private void m50516(int i, int i2, byte[] bArr) {
        this.f71109.m37465(i, i2, bArr);
        if (!this.f71112) {
            this.f71108.m18033(i, i2, bArr);
            this.f71110.m18033(i, i2, bArr);
            this.f71116.m18033(i, i2, bArr);
        }
        this.f71119.m18033(i, i2, bArr);
        this.f71114.m18033(i, i2, bArr);
    }

    @RequiresNonNull({"output", "sampleReader"})
    /* JADX INFO: renamed from: ֫ */
    private void m50515(int i, int i2, long j, long j2) {
        this.f71109.m37466(j, i, this.f71112);
        boolean z = this.f71112;
        C15976 c15976 = this.f71118;
        if (!z) {
            C7792 c7792 = this.f71108;
            c7792.m18035(i2);
            C7792 c7793 = this.f71110;
            c7793.m18035(i2);
            C7792 c7794 = this.f71116;
            c7794.m18035(i2);
            if (c7792.m18034() && c7793.m18034() && c7794.m18034()) {
                String str = this.f71106;
                int i3 = c7792.f20434;
                byte[] bArr = new byte[c7793.f20434 + i3 + c7794.f20434];
                System.arraycopy(c7792.f20432, 0, bArr, 0, i3);
                System.arraycopy(c7793.f20432, 0, bArr, c7792.f20434, c7793.f20434);
                System.arraycopy(c7794.f20432, 0, bArr, c7792.f20434 + c7793.f20434, c7794.f20434);
                String strM44015 = null;
                C13169 c13169M41112 = C18058.m41112(c7793.f20432, 3, c7793.f20434, (C9145) null);
                C5122 c5122 = c13169M41112.f37010;
                if (c5122 != null) {
                    strM44015 = C19322.m44015(c5122.f12038, c5122.f12039, c5122.f12037, c5122.f12034, c5122.f12036, c5122.f12035);
                }
                C3601 c3601 = new C3601();
                c3601.m6701(str);
                c3601.m6694("video/mp2t");
                c3601.m6697("video/hevc");
                c3601.m6677(strM44015);
                c3601.m6685(c13169M41112.f37004);
                c3601.m6689(c13169M41112.f37005);
                c3601.m6687(c13169M41112.f37015);
                c3601.m6712(c13169M41112.f37009);
                C8966 c8966 = new C8966();
                c8966.m20709(c13169M41112.f37013);
                c8966.m20708(c13169M41112.f37011);
                c8966.m20711(c13169M41112.f37012);
                c8966.m20710(c13169M41112.f37008 + 8);
                c8966.m20706(c13169M41112.f37003 + 8);
                c3601.m6680(c8966.m20705());
                c3601.m6692(c13169M41112.f37006);
                c3601.m6684(c13169M41112.f37014);
                c3601.m6706(c13169M41112.f37007 + 1);
                c3601.m6678(Collections.singletonList(bArr));
                C10307 c10307M6672 = c3601.m6672();
                int i4 = c10307M6672.f28531;
                this.f71115.mo10503(c10307M6672);
                C6194.m14036(i4 != -1);
                c15976.m36316(i4);
                this.f71112 = true;
            }
        }
        C7792 c7795 = this.f71119;
        boolean zM18035 = c7795.m18035(i2);
        C19203 c19203 = this.f71111;
        if (zM18035) {
            c19203.m43708(C18058.m41106(c7795.f20434, c7795.f20432), c7795.f20432);
            c19203.m43724(5);
            c15976.m36317(j2, c19203);
        }
        C7792 c7796 = this.f71114;
        if (c7796.m18035(i2)) {
            c19203.m43708(C18058.m41106(c7796.f20434, c7796.f20432), c7796.f20432);
            c19203.m43724(5);
            c15976.m36317(j2, c19203);
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        int i;
        int i2;
        C23877.m52958(this.f71115);
        String str = C5792.f14228;
        while (c19203.m43703() > 0) {
            int iM43731 = c19203.m43731();
            int iM43729 = c19203.m43729();
            byte[] bArrM43728 = c19203.m43728();
            this.f71107 += (long) c19203.m43703();
            this.f71115.mo10500(c19203.m43703(), c19203);
            while (iM43731 < iM43729) {
                int iM41105 = C18058.m41105(iM43731, iM43729, bArrM43728, this.f71113);
                if (iM41105 == iM43729) {
                    m50516(iM43731, iM43729, bArrM43728);
                    return;
                }
                int i3 = (bArrM43728[iM41105 + 3] & 126) >> 1;
                if (iM41105 <= 0 || bArrM43728[iM41105 - 1] != 0) {
                    i = iM41105;
                    i2 = 3;
                } else {
                    i = iM41105 - 1;
                    i2 = 4;
                }
                int i4 = i - iM43731;
                if (i4 > 0) {
                    m50516(iM43731, i, bArrM43728);
                }
                int i5 = iM43729 - i;
                long j = this.f71107 - ((long) i5);
                m50515(i5, i4 < 0 ? -i4 : 0, j, this.f71117);
                m50517(i5, i3, j, this.f71117);
                iM43731 = i + i2;
            }
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        C23877.m52958(this.f71115);
        String str = C5792.f14228;
        if (z) {
            this.f71118.m36319();
            m50515(0, 0, this.f71107, this.f71117);
            m50517(0, 48, this.f71107, this.f71117);
        }
    }
}
