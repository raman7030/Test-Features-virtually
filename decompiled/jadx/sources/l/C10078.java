package l;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: l.ۤۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8TX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10078 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10659 f30363;

    public C10078(C10659 c10659) {
        this.f30363 = c10659;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.f30363.m26750(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
