package p067l;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵ۜ */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes5.dex */
public final class C1799 implements InterfaceC0953 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnKeyListenerC1099 f63925;

    public C1799(ViewOnKeyListenerC1099 viewOnKeyListenerC1099) {
        this.f63925 = viewOnKeyListenerC1099;
    }

    @Override // p067l.InterfaceC0953
    /* JADX INFO: renamed from: ֫ */
    public final void mo3515(C0994 c0994, MenuItem menuItem) {
        this.f63925.f19032.removeCallbacksAndMessages(c0994);
    }

    @Override // p067l.InterfaceC0953
    /* JADX INFO: renamed from: ֫ */
    public final void mo3516(C0994 c0994, C1134 c1134) {
        ViewOnKeyListenerC1099 viewOnKeyListenerC1099 = this.f63925;
        Handler handler = viewOnKeyListenerC1099.f19032;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1099.f19029;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0994 == ((C0854) arrayList.get(i)).f4286) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC1764(this, i2 < arrayList.size() ? (C0854) arrayList.get(i2) : null, c1134, c0994), c0994, SystemClock.uptimeMillis() + 200);
    }
}
