package p067l;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98SV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2426 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ܺ */
    public static final float[] f3734 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: ֫ */
    public final C19862 f3735;

    /* JADX INFO: renamed from: ۜ */
    public long f3736;

    /* JADX INFO: renamed from: ۡ */
    public final C3236 f3737;

    /* JADX INFO: renamed from: ۢ */
    public final C19203 f3738;

    /* JADX INFO: renamed from: ۧ */
    public String f3739;

    /* JADX INFO: renamed from: ܳ */
    public final boolean[] f3740 = new boolean[4];

    /* JADX INFO: renamed from: ܽ */
    public boolean f3741;

    /* JADX INFO: renamed from: ܿ */
    public long f3742;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC20790 f3743;

    /* JADX INFO: renamed from: ᩷ */
    public final C7792 f3744;

    /* JADX INFO: renamed from: ᩻ */
    public C20533 f3745;

    public C2426(C3236 c3236) {
        this.f3737 = c3236;
        C19862 c19862 = new C19862();
        c19862.f60367 = new byte[128];
        this.f3735 = c19862;
        this.f3742 = -9223372036854775807L;
        this.f3744 = new C7792(178);
        this.f3738 = new C19203();
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        C18058.m41113(this.f3740);
        this.f3735.m45104();
        C20533 c20533 = this.f3745;
        if (c20533 != null) {
            c20533.m46354();
        }
        C7792 c7792 = this.f3744;
        if (c7792 != null) {
            c7792.m18036();
        }
        this.f3736 = 0L;
        this.f3742 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f3739 = c20672.m46738();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 2);
        this.f3743 = interfaceC20790Mo5732;
        this.f3745 = new C20533(interfaceC20790Mo5732);
        this.f3737.m5587(interfaceC23116, c20672);
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f3742 = j;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        C19862 c19862;
        C7792 c7792;
        int i;
        float f;
        C23877.m52958(this.f3745);
        C23877.m52958(this.f3743);
        int iM43731 = c19203.m43731();
        int iM43729 = c19203.m43729();
        byte[] bArrM43728 = c19203.m43728();
        this.f3736 += (long) c19203.m43703();
        this.f3743.mo10500(c19203.m43703(), c19203);
        while (true) {
            int iM41105 = C18058.m41105(iM43731, iM43729, bArrM43728, this.f3740);
            c19862 = this.f3735;
            c7792 = this.f3744;
            if (iM41105 == iM43729) {
                break;
            }
            int i2 = iM41105 + 3;
            int i3 = c19203.m43728()[i2] & 255;
            int i4 = iM41105 - iM43731;
            if (!this.f3741) {
                if (i4 > 0) {
                    c19862.m45105(iM43731, iM41105, bArrM43728);
                }
                if (c19862.m45106(i3, i4 < 0 ? -i4 : 0)) {
                    InterfaceC20790 interfaceC20790 = this.f3743;
                    int i5 = c19862.f60370;
                    String str = this.f3739;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(c19862.f60367, c19862.f60369);
                    C17861 c17861 = new C17861(bArrCopyOf, bArrCopyOf.length);
                    c17861.m40562(i5);
                    c17861.m40562(4);
                    c17861.m40561();
                    c17861.m40566(8);
                    if (c17861.m40567()) {
                        c17861.m40566(4);
                        c17861.m40566(3);
                    }
                    int iM40558 = c17861.m40558(4);
                    if (iM40558 == 15) {
                        int iM40559 = c17861.m40558(8);
                        int iM405510 = c17861.m40558(8);
                        if (iM405510 == 0) {
                            C21334.m48351("Invalid aspect ratio");
                            f = 1.0f;
                        } else {
                            f = iM40559 / iM405510;
                        }
                    } else if (iM40558 < 7) {
                        f = f3734[iM40558];
                    } else {
                        C21334.m48351("Invalid aspect ratio");
                        f = 1.0f;
                    }
                    int i6 = 2;
                    if (c17861.m40567()) {
                        c17861.m40566(2);
                        c17861.m40566(1);
                        if (c17861.m40567()) {
                            c17861.m40566(15);
                            c17861.m40561();
                            c17861.m40566(15);
                            c17861.m40561();
                            c17861.m40566(15);
                            c17861.m40561();
                            c17861.m40566(3);
                            c17861.m40566(11);
                            c17861.m40561();
                            c17861.m40566(15);
                            c17861.m40561();
                            i6 = 2;
                        }
                    }
                    if (c17861.m40558(i6) != 0) {
                        C21334.m48351("Unhandled video object layer shape");
                    }
                    c17861.m40561();
                    int iM405511 = c17861.m40558(16);
                    c17861.m40561();
                    if (c17861.m40567()) {
                        if (iM405511 == 0) {
                            C21334.m48351("Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = iM405511 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            c17861.m40566(i7);
                        }
                    }
                    c17861.m40561();
                    int iM405512 = c17861.m40558(13);
                    c17861.m40561();
                    int iM405513 = c17861.m40558(13);
                    c17861.m40561();
                    c17861.m40561();
                    C3601 c3601 = new C3601();
                    c3601.m6701(str);
                    c3601.m6694("video/mp2t");
                    c3601.m6697("video/mp4v-es");
                    c3601.m6685(iM405512);
                    c3601.m6689(iM405513);
                    c3601.m6692(f);
                    c3601.m6678(Collections.singletonList(bArrCopyOf));
                    interfaceC20790.mo10503(c3601.m6672());
                    this.f3741 = true;
                }
            }
            this.f3745.m46355(iM43731, iM41105, bArrM43728);
            if (c7792 != null) {
                if (i4 > 0) {
                    c7792.m18033(iM43731, iM41105, bArrM43728);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (c7792.m18035(i)) {
                    int iM41106 = C18058.m41106(c7792.f20434, c7792.f20432);
                    String str2 = C5792.f14228;
                    byte[] bArr = c7792.f20432;
                    C19203 c19204 = this.f3738;
                    c19204.m43708(iM41106, bArr);
                    this.f3737.m5586(this.f3742, c19204);
                }
                if (i3 == 178 && c19203.m43728()[iM41105 + 2] == 1) {
                    c7792.m18037(i3);
                }
            }
            int i9 = iM43729 - iM41105;
            this.f3745.m46357(this.f3736 - ((long) i9), i9, this.f3741);
            this.f3745.m46356(i3, this.f3742);
            iM43731 = i2;
        }
        if (!this.f3741) {
            c19862.m45105(iM43731, iM43729, bArrM43728);
        }
        this.f3745.m46355(iM43731, iM43729, bArrM43728);
        if (c7792 != null) {
            c7792.m18033(iM43731, iM43729, bArrM43728);
        }
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
        C23877.m52958(this.f3745);
        if (z) {
            this.f3745.m46357(this.f3736, 0, this.f3741);
            this.f3745.m46354();
        }
    }
}
