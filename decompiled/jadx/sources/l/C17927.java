package l;

import android.app.Activity;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C17927 extends Thread {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f54755;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54756;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f54757;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16287 f54758;

    static {
        ApplicationC12518.m30701(137);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C17927(String str, int i, Activity activity, C16287 c16287) {
        int i2 = -508962005;
        int i3 = C3683.f11629;
        int i4 = C2958.f9394;
        this.f54755 = str;
        this.f54756 = i;
        this.f54757 = activity;
        this.f54758 = c16287;
        int iM2566 = (C0630.m2566("ۡۜ") ^ i3) * 59;
        int i5 = ((iM2566 ^ i4) * 27635) ^ 1835599798;
        int i6 = -1747379577;
        while (true) {
            i2 = (iM2566 ^ i6) ^ (i5 & (((i2 ^ i4) * (-22843)) >> 31));
            switch (i2) {
                case -2037328315:
                case 142046120:
                    C1294.m4372();
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM2566 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM2566 = C0630.m2566("ۚ᩶") ^ i3;
                        i5 = ((iM2566 ^ i4) * 11121) ^ 1902356255;
                        i6 = -2040749420;
                    }
                    break;
                case -2032221157:
                case -201718038:
                    if (C2520.f8000 < 0) {
                        iM2566 = (C0630.m2566("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM2566 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM2566 = C0630.m2566("ۙ᩺") ^ i3;
                        i5 = ((iM2566 ^ i4) * 11839) ^ (-795867318);
                        i6 = -445270304;
                    }
                    break;
                case -1724089604:
                case 1926991269:
                    if (C3683.f11629 < 0) {
                        iM2566 = (C0630.m2566("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM2566 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM2566 = (C0630.m2566("ۙᩳ") ^ i3) * (-57);
                        i5 = ((iM2566 ^ i4) * (-29131)) ^ 529987807;
                        i6 = 188264890;
                    }
                    break;
                case -1321724403:
                case 1843324428:
                    return;
                case -855966411:
                case 237534108:
                    if (C1420.f5096 <= 0) {
                        iM2566 = C0630.m2566("ۨۡ") ^ i4;
                        i5 = ((iM2566 ^ i3) * (-8145)) ^ 446227680;
                        i6 = 1941098539;
                    } else {
                        iM2566 = (i4 - C2105.m6981("᩻ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM2566 ^ i3) * 19603) ^ 239935948;
                        i6 = -227548162;
                    }
                    break;
                case -123892349:
                case 301111756:
                    RunnableC1108.m3790();
                    C1294.m4372();
                    throw new RuntimeException();
                default:
                    AbstractC2021.m6574();
                    iM2566 = C0630.m2566("ۙ᩺") ^ i3;
                    i5 = ((iM2566 ^ i4) * 11839) ^ (-795867318);
                    i6 = -445270304;
                    break;
            }
        }
    }
}
