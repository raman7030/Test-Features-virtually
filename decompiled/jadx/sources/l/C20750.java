package l;

import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩷۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C20750 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f66803;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5850 f66804;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23489 f66805;

    static {
        ApplicationC12518.m30701(149);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C20750(String str, ViewOnClickListenerC5850 viewOnClickListenerC5850, C23489 c23489) {
        int i = 312871909;
        int i2 = C2520.f8000;
        int i3 = C3683.f11629;
        this.f66803 = str;
        this.f66804 = viewOnClickListenerC5850;
        this.f66805 = c23489;
        int iM6981 = (C2105.m6981("ܳۛ") ^ i2) * (-105);
        int i4 = ((iM6981 ^ i3) * 6391) ^ 912969296;
        int i5 = 1818157012;
        while (true) {
            i = (iM6981 ^ i5) ^ (i4 & (((i ^ i3) * 901) >> 31));
            switch (i) {
                case -1493164412:
                case 758212545:
                    C21923.m49329();
                    throw new RuntimeException();
                case -1008528121:
                case -435206509:
                    if (C3432.f10845 < 0) {
                        iM6981 = C0630.m2566("ܳ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29277)) ^ 2008061142;
                        i5 = 251026164;
                    } else {
                        iM6981 = (C2105.m6981("ᩴ۟") ^ i2) * q.h;
                        i4 = ((iM6981 ^ i3) * 28929) ^ (-733619430);
                        i5 = -160731503;
                    }
                    break;
                case -949294638:
                case 429270630:
                    if (!C2126.f7087) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15885)) ^ 813088864;
                        i5 = 1401196631;
                    } else {
                        iM6981 = C0630.m2566("ܳ᩺") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-29277)) ^ 2008061142;
                        i5 = 251026164;
                    }
                    break;
                case -718318823:
                case 469215994:
                    C0237.m1481();
                    if (C1711.m5736() > 0) {
                        iM6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((iM6981 ^ i2) * (-15885)) ^ 813088864;
                        i5 = 1401196631;
                    } else {
                        iM6981 = C2105.m6981("֡ᩳ") ^ i3;
                        i4 = ((iM6981 ^ i2) * 19143) ^ 256294105;
                        i5 = 310923148;
                    }
                    break;
                case -705289328:
                case 96517071:
                    if (C3019.f9544 >= 0) {
                        iM6981 = C0630.m2566("᩶ۚ") ^ i2;
                        i4 = ((iM6981 ^ i3) * 951) ^ (-1908081448);
                        i5 = -1873782390;
                    } else {
                        iM6981 = (C2105.m6981("۫ܿ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((iM6981 ^ i3) * (-26661)) ^ 492279398;
                        i5 = 559138221;
                    }
                    break;
                case -93232450:
                case 1120247666:
                    C2958.m9034();
                    AbstractC2021.m6574();
                    iM6981 = C2105.m6981("᩺᩸") ^ i3;
                    i4 = ((iM6981 ^ i2) * (-15885)) ^ 813088864;
                    i5 = 1401196631;
                    break;
                default:
                    return;
            }
        }
    }
}
