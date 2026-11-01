package p067l;

/* JADX INFO: renamed from: l.ܿ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C18735 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f56011;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC7928 f56012;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22011 f56013;

    static {
        ApplicationC14266.m56479(131);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C18735(String str, ViewOnClickListenerC7928 viewOnClickListenerC7928, C22011 c22011) {
        int i = 503003278;
        int i2 = ServiceConnectionC1013.f81940;
        int i3 = RunnableC1014.f81941;
        this.f56011 = str;
        this.f56012 = viewOnClickListenerC7928;
        this.f56013 = c22011;
        int iM55680 = C0873.m55680("ۧܶ") ^ i2;
        int i4 = ((iM55680 ^ i3) * 13643) ^ (-1086468455);
        int i5 = -734860322;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * (-8327)) >> 31));
            switch (i) {
                case -1700463086:
                case 1115400222:
                    C0917.m55854();
                    throw new RuntimeException();
                case -1322757288:
                case -333274725:
                    C1024.m56209();
                    if (C1003.f81929 > 0) {
                        iM55680 = (i3 - C0873.m55680("ۘ֫")) * (-9);
                        i4 = ((iM55680 ^ i2) * (-27243)) ^ (-2133597804);
                        i5 = 861103143;
                    } else {
                        iM55680 = C0946.m55979("۟֫") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-7967)) ^ (-282550820);
                        i5 = -1755663594;
                    }
                    break;
                case -1114306191:
                case 1359168763:
                    C1404.m56468();
                    ServiceConnectionC1013.m56157();
                    iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                    i4 = ((iM55680 ^ i3) * (-12385)) ^ 727455665;
                    i5 = 1985213084;
                    break;
                case -563026873:
                case 2074975434:
                    C0898.m55800();
                    if (!C0937.f81884) {
                        iM55680 = (i3 - C0873.m55680("ۘ֫")) * (-9);
                        i4 = ((iM55680 ^ i2) * (-27243)) ^ (-2133597804);
                        i5 = 861103143;
                    } else {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12385)) ^ 727455665;
                        i5 = 1985213084;
                    }
                    break;
                case 56493688:
                case 1393976717:
                    return;
                case 1486929879:
                case 2049512236:
                    C0877.m55696();
                    if (C0863.f81833 > 0) {
                        iM55680 = C0946.m55979("ܶᩴ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-12385)) ^ 727455665;
                        i5 = 1985213084;
                    } else {
                        iM55680 = (C0873.m55680("᩺۠") ^ i3) * (-23);
                        i4 = ((iM55680 ^ i2) * (-26683)) ^ 340037564;
                        i5 = -2100119973;
                    }
                    break;
                default:
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("ۘۜ") ^ i2;
                        i4 = ((iM55680 ^ i3) * (-2317)) ^ (-353280000);
                        i5 = -1763820200;
                    } else {
                        iM55680 = (i3 - C0946.m55979("۠ܰ")) * (-29);
                        i4 = ((iM55680 ^ i2) * (-32035)) ^ (-1683570946);
                        i5 = -350114289;
                    }
                    break;
            }
        }
    }
}
