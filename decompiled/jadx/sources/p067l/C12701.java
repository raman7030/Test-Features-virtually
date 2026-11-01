package p067l;

import android.app.Activity;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۧ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4FN */
/* JADX INFO: loaded from: classes.dex */
public final class C12701 extends Thread {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f35637;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Activity f35638;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C9552 f35639;

    static {
        ApplicationC14266.m56479(87);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public native void run();

    public C12701(Activity activity, C9552 c9552, String str) {
        int i = -49267410;
        int i2 = C0967.f81910;
        int i3 = C0877.f81843;
        this.f35637 = str;
        this.f35638 = activity;
        this.f35639 = c9552;
        int iM55680 = C0873.m55680("۠ۜ") ^ i2;
        int i4 = ((iM55680 ^ i3) * (-13721)) ^ 1170807474;
        int i5 = -705768682;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * (-4711)) >> 31));
            switch (i) {
                case -2108030105:
                case -648715940:
                    if (C0892.f81851) {
                        iM55680 = C0873.m55680("ᩴۡ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 12605) ^ 1302023309;
                        i5 = -1875207275;
                    } else {
                        iM55680 = (i2 - C0946.m55979("᩵ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i3) * 27277) ^ (-66620979);
                        i5 = 934331725;
                    }
                    break;
                case -1694554195:
                case 1115159954:
                    C0930.m55885();
                    if (C1017.f81942 < 0) {
                        iM55680 = (i2 - C0946.m55979("᩵ᩴ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM55680 ^ i3) * 27277) ^ (-66620979);
                        i5 = 934331725;
                    } else {
                        iM55680 = (C0946.m55979("ܶܶ") ^ i2) * (-29);
                        i4 = ((iM55680 ^ i3) * 5997) ^ 352343747;
                        i5 = 613369193;
                    }
                    break;
                case -1639785721:
                case -904984869:
                    return;
                case -1426000203:
                case 463300908:
                    C1046.m56302();
                    if (RunnableC1014.f81941 > 0) {
                        iM55680 = (C0946.m55979("ܶܶ") ^ i2) * (-29);
                        i4 = ((iM55680 ^ i3) * 5997) ^ 352343747;
                        i5 = 613369193;
                    } else {
                        iM55680 = C0946.m55979("ᩴ۠") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27259)) ^ 1615543430;
                        i5 = 347277148;
                    }
                    break;
                case -704158753:
                case 1581957310:
                    if (C0989.m56095() <= 0) {
                        iM55680 = C0873.m55680("᩺ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-26613)) ^ (-1710874133);
                        i5 = 1461269624;
                    } else {
                        iM55680 = C0873.m55680("᩹ᩳ") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-9645)) ^ 928870965;
                        i5 = 1145263068;
                    }
                    break;
                case -259275109:
                case 183106645:
                    C1025.m56230();
                    throw new RuntimeException();
                default:
                    RunnableC0938.m55938();
                    C0898.m55800();
                    iM55680 = (C0946.m55979("ܶܶ") ^ i2) * (-29);
                    i4 = ((iM55680 ^ i3) * 5997) ^ 352343747;
                    i5 = 613369193;
                    break;
            }
        }
    }
}
