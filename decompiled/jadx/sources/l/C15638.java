package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes4.dex */
public final class C15638 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48134;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48135;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IntentFilter f48136;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f48137;

    public C15638(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f48136 = intentFilter;
        this.f48137 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(128, "Receiver{");
        sbM32307.append(this.f48137);
        sbM32307.append(" filter=");
        sbM32307.append(this.f48136);
        if (this.f48135) {
            sbM32307.append(" DEAD");
        }
        sbM32307.append(l.d);
        return sbM32307.toString();
    }
}
