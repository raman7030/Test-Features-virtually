package p067l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: renamed from: l.ۖܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0970 {

    /* JADX INFO: renamed from: ֫ */
    public BroadcastReceiver f10957;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f10958;

    /* JADX INFO: renamed from: ۧ */
    public abstract IntentFilter mo10218();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo10219();

    public AbstractC0970(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110) {
        this.f10958 = layoutInflaterFactory2C1110;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m10220() {
        m10217();
        IntentFilter intentFilterMo10218 = mo10218();
        if (intentFilterMo10218.countActions() == 0) {
            return;
        }
        if (this.f10957 == null) {
            this.f10957 = new C1635(this);
        }
        this.f10958.f19660.registerReceiver(this.f10957, intentFilterMo10218);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10217() {
        BroadcastReceiver broadcastReceiver = this.f10957;
        if (broadcastReceiver != null) {
            try {
                this.f10958.f19660.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f10957 = null;
        }
    }
}
