package p067l;

import android.app.Activity;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ᩳ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C19406 extends Thread {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f57952;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f57953;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Activity f57954;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17847 f57955;

    static {
        ApplicationC14266.m56479(137);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C19406(String str, int i, Activity activity, C17847 c17847) {
        int i2 = -508962005;
        int i3 = C1025.f81947;
        int i4 = C0989.f81920;
        this.f57952 = str;
        this.f57953 = i;
        this.f57954 = activity;
        this.f57955 = c17847;
        int iM55680 = (C0873.m55680("ۡۜ") ^ i3) * 59;
        int i5 = ((iM55680 ^ i4) * 27635) ^ 1835599798;
        int i6 = -1747379577;
        while (true) {
            i2 = (iM55680 ^ i6) ^ (i5 & (((i2 ^ i4) * (-22843)) >> 31));
            switch (i2) {
                case -2037328315:
                case 142046120:
                    C0906.m55809();
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM55680 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM55680 = C0873.m55680("ۚ᩶") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11121) ^ 1902356255;
                        i6 = -2040749420;
                    }
                    break;
                case -2032221157:
                case -201718038:
                    if (C0967.f81910 < 0) {
                        iM55680 = (C0873.m55680("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM55680 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM55680 = C0873.m55680("ۙ᩺") ^ i3;
                        i5 = ((iM55680 ^ i4) * 11839) ^ (-795867318);
                        i6 = -445270304;
                    }
                    break;
                case -1724089604:
                case 1926991269:
                    if (C1025.f81947 < 0) {
                        iM55680 = (C0873.m55680("᩺ۚ") ^ i4) * 9;
                        i5 = ((iM55680 ^ i3) * (-15655)) ^ (-288320268);
                        i6 = -794688506;
                    } else {
                        iM55680 = (C0873.m55680("ۙᩳ") ^ i3) * (-57);
                        i5 = ((iM55680 ^ i4) * (-29131)) ^ 529987807;
                        i6 = 188264890;
                    }
                    break;
                case -1321724403:
                case 1843324428:
                    return;
                case -855966411:
                case 237534108:
                    if (C0912.f81867 <= 0) {
                        iM55680 = C0873.m55680("ۨۡ") ^ i4;
                        i5 = ((iM55680 ^ i3) * (-8145)) ^ 446227680;
                        i6 = 1941098539;
                    } else {
                        iM55680 = (i4 - C0946.m55979("᩻ᩴ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((iM55680 ^ i3) * 19603) ^ 239935948;
                        i6 = -227548162;
                    }
                    break;
                case -123892349:
                case 301111756:
                    RunnableC0897.m55784();
                    C0906.m55809();
                    throw new RuntimeException();
                default:
                    AbstractC0942.m55971();
                    iM55680 = C0873.m55680("ۙ᩺") ^ i3;
                    i5 = ((iM55680 ^ i4) * 11839) ^ (-795867318);
                    i6 = -445270304;
                    break;
            }
        }
    }
}
