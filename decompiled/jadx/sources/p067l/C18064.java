package p067l;

/* JADX INFO: renamed from: l.ܽ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C18064 extends Thread {

    /* JADX INFO: renamed from: ۟ۨܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f82260;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f53927;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f53928;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC7928 f53929;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8599 f53930;

    static {
        ApplicationC14266.m56479(124);
        f82260 = new short[]{3068, 23120, 23163, 23120, 23135, 23158, 23053, 23058, 23125, 23111, 23057, 23058, 23040};
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C18064(String str, String str2, ViewOnClickListenerC7928 viewOnClickListenerC7928, C8599 c8599) {
        int i = 1295845137;
        int i2 = C0863.f81833;
        int i3 = C0992.f81922;
        this.f53927 = str;
        this.f53928 = str2;
        this.f53929 = viewOnClickListenerC7928;
        this.f53930 = c8599;
        int iM55680 = (C0873.m55680("ۡ֡") ^ i2) * 123;
        int i4 = ((iM55680 ^ i3) * (-24249)) ^ 1727502971;
        int i5 = -2121411737;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * 26203) >> 31));
            switch (i) {
                case -1528032118:
                case -1377154639:
                    if (C0873.f81841 <= 0) {
                        iM55680 = (C0873.m55680("ۙ᩺") ^ i2) * 51;
                        i4 = ((iM55680 ^ i3) * 18425) ^ (-1800198234);
                        i5 = 26002542;
                    } else {
                        iM55680 = C0946.m55979("ۛۛ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 31379) ^ 1342387245;
                        i5 = -395462735;
                    }
                    break;
                case -1485101490:
                case -507869286:
                    return;
                case -1138088000:
                case -1077704487:
                    ViewOnClickListenerC0939.m55941();
                    C0845.m55584();
                    iM55680 = (i2 - C0873.m55680("ۧ᩹")) * (-33);
                    i4 = ((iM55680 ^ i3) * (-4455)) ^ 1195352376;
                    i5 = 350679286;
                    break;
                case -618732634:
                case -584209561:
                    C1036.m56257();
                    C1024.m56209();
                    throw new RuntimeException();
                case -142649042:
                case 895390136:
                    if (C1124.f82007 >= 0) {
                        iM55680 = (C0873.m55680("۟᩵") + i3) * 75;
                        i4 = ((iM55680 ^ i2) * 14033) ^ (-6721206);
                        i5 = 582203170;
                    } else {
                        iM55680 = (i2 - C0873.m55680("ۧ᩹")) * (-33);
                        i4 = ((iM55680 ^ i3) * (-4455)) ^ 1195352376;
                        i5 = 350679286;
                    }
                    break;
                case 536408106:
                case 2025798780:
                    if (RunnableC0938.f81886 >= 0) {
                        iM55680 = (i2 - C0946.m55979("֨᩻")) * (-121);
                        i4 = ((iM55680 ^ i3) * (-5405)) ^ 1577368813;
                        i5 = -1648316984;
                    } else {
                        iM55680 = (C0946.m55979("ۛۨ") ^ i3) * 127;
                        i4 = ((iM55680 ^ i2) * (-7493)) ^ 243347650;
                        i5 = 1149033901;
                    }
                    break;
                default:
                    C1964.m56597();
                    if (C0845.f81821 >= 0) {
                        iM55680 = (C0873.m55680("ۙ᩺") ^ i2) * 51;
                        i4 = ((iM55680 ^ i3) * 18425) ^ (-1800198234);
                        i5 = 26002542;
                    } else {
                        iM55680 = (C0873.m55680("۟᩵") + i3) * 75;
                        i4 = ((iM55680 ^ i2) * 14033) ^ (-6721206);
                        i5 = 582203170;
                    }
                    break;
            }
        }
    }
}
