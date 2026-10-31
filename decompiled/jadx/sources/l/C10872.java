package l;

import android.app.Activity;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C10872 extends Thread {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32660;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Activity f32661;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7558 f32662;

    static {
        ApplicationC12518.m30701(87);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C10872(Activity activity, C7558 c7558, String str) {
        int i = -49267410;
        int i2 = C2520.f8000;
        int i3 = C0714.f2697;
        this.f32660 = str;
        this.f32661 = activity;
        this.f32662 = c7558;
        int iM2566 = C0630.m2566("۠ۜ") ^ i2;
        int i4 = ((iM2566 ^ i3) * (-13721)) ^ 1170807474;
        int i5 = -705768682;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i3) * (-4711)) >> 31));
            switch (i) {
                case -2108030105:
                case -648715940:
                    if (C1005.f3721) {
                        iM2566 = C0630.m2566("ᩴۡ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 12605) ^ 1302023309;
                        i5 = -1875207275;
                    } else {
                        iM2566 = (i2 - C2105.m6981("᩵ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i3) * 27277) ^ (-66620979);
                        i5 = 934331725;
                    }
                    break;
                case -1694554195:
                case 1115159954:
                    C1773.m5908();
                    if (C3537.f11231 < 0) {
                        iM2566 = (i2 - C2105.m6981("᩵ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM2566 ^ i3) * 27277) ^ (-66620979);
                        i5 = 934331725;
                    } else {
                        iM2566 = (C2105.m6981("ܶܶ") ^ i2) * (-29);
                        i4 = ((iM2566 ^ i3) * 5997) ^ 352343747;
                        i5 = 613369193;
                    }
                    break;
                case -1639785721:
                case -904984869:
                    return;
                case -1426000203:
                case 463300908:
                    C4117.m12364();
                    if (RunnableC3474.f10992 > 0) {
                        iM2566 = (C2105.m6981("ܶܶ") ^ i2) * (-29);
                        i4 = ((iM2566 ^ i3) * 5997) ^ 352343747;
                        i5 = 613369193;
                    } else {
                        iM2566 = C2105.m6981("ᩴ۠") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27259)) ^ 1615543430;
                        i5 = 347277148;
                    }
                    break;
                case -704158753:
                case 1581957310:
                    if (C2958.m9034() <= 0) {
                        iM2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-26613)) ^ (-1710874133);
                        i5 = 1461269624;
                    } else {
                        iM2566 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-9645)) ^ 928870965;
                        i5 = 1145263068;
                    }
                    break;
                case -259275109:
                case 183106645:
                    C3683.m11222();
                    throw new RuntimeException();
                default:
                    RunnableC1937.m6387();
                    C1128.m3851();
                    iM2566 = (C2105.m6981("ܶܶ") ^ i2) * (-29);
                    i4 = ((iM2566 ^ i3) * 5997) ^ 352343747;
                    i5 = 613369193;
                    break;
            }
        }
    }
}
