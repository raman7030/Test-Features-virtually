package l;

/* JADX INFO: renamed from: l.ܽ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C16515 extends Thread {

    /* JADX INFO: renamed from: ۟ۨܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f50748;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50749;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50750;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5850 f50751;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6556 f50752;

    static {
        ApplicationC12518.m30701(124);
        f50748 = new short[]{3068, 23120, 23163, 23120, 23135, 23158, 23053, 23058, 23125, 23111, 23057, 23058, 23040};
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C16515(String str, String str2, ViewOnClickListenerC5850 viewOnClickListenerC5850, C6556 c6556) {
        int i = 1295845137;
        int i2 = C0422.f1886;
        int i3 = C3019.f9544;
        this.f50749 = str;
        this.f50750 = str2;
        this.f50751 = viewOnClickListenerC5850;
        this.f50752 = c6556;
        int iM2566 = (C0630.m2566("ۡ֡") ^ i2) * 123;
        int i4 = ((iM2566 ^ i3) * (-24249)) ^ 1727502971;
        int i5 = -2121411737;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i3) * 26203) >> 31));
            switch (i) {
                case -1528032118:
                case -1377154639:
                    if (C0630.f2410 <= 0) {
                        iM2566 = (C0630.m2566("ۙ᩺") ^ i2) * 51;
                        i4 = ((iM2566 ^ i3) * 18425) ^ (-1800198234);
                        i5 = 26002542;
                    } else {
                        iM2566 = C2105.m6981("ۛۛ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 31379) ^ 1342387245;
                        i5 = -395462735;
                    }
                    break;
                case -1485101490:
                case -507869286:
                    return;
                case -1138088000:
                case -1077704487:
                    ViewOnClickListenerC1958.m6429();
                    C0050.m940();
                    iM2566 = (i2 - C0630.m2566("ۧ᩹")) * (-33);
                    i4 = ((iM2566 ^ i3) * (-4455)) ^ 1195352376;
                    i5 = 350679286;
                    break;
                case -618732634:
                case -584209561:
                    C3911.m11924();
                    C3663.m11168();
                    throw new RuntimeException();
                case -142649042:
                case 895390136:
                    if (C5695.f17556 >= 0) {
                        iM2566 = (C0630.m2566("۟᩵") + i3) * 75;
                        i4 = ((iM2566 ^ i2) * 14033) ^ (-6721206);
                        i5 = 582203170;
                    } else {
                        iM2566 = (i2 - C0630.m2566("ۧ᩹")) * (-33);
                        i4 = ((iM2566 ^ i3) * (-4455)) ^ 1195352376;
                        i5 = 350679286;
                    }
                    break;
                case 536408106:
                case 2025798780:
                    if (RunnableC1937.f6483 >= 0) {
                        iM2566 = (i2 - C2105.m6981("֨᩻")) * (-121);
                        i4 = ((iM2566 ^ i3) * (-5405)) ^ 1577368813;
                        i5 = -1648316984;
                    } else {
                        iM2566 = (C2105.m6981("ۛۨ") ^ i3) * 127;
                        i4 = ((iM2566 ^ i2) * (-7493)) ^ 243347650;
                        i5 = 1149033901;
                    }
                    break;
                default:
                    C22628.m50615();
                    if (C0050.f910 >= 0) {
                        iM2566 = (C0630.m2566("ۙ᩺") ^ i2) * 51;
                        i4 = ((iM2566 ^ i3) * 18425) ^ (-1800198234);
                        i5 = 26002542;
                    } else {
                        iM2566 = (C0630.m2566("۟᩵") + i3) * 75;
                        i4 = ((iM2566 ^ i2) * 14033) ^ (-6721206);
                        i5 = 582203170;
                    }
                    break;
            }
        }
    }
}
