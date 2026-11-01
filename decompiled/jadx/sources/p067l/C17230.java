package p067l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܺۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X32D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17230 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f51274;

    /* JADX INFO: renamed from: ۧ */
    public boolean f51275;

    /* JADX INFO: renamed from: ܽ */
    public final IntentFilter f51276;

    /* JADX INFO: renamed from: ᩳ */
    public final BroadcastReceiver f51277;

    public C17230(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f51276 = intentFilter;
        this.f51277 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(128, "Receiver{");
        sbM34407.append(this.f51277);
        sbM34407.append(" filter=");
        sbM34407.append(this.f51276);
        if (this.f51275) {
            sbM34407.append(" DEAD");
        }
        sbM34407.append(C0249l.f1198d);
        return sbM34407.toString();
    }
}
