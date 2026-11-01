package p067l;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.umeng.analytics.pro.C0655am;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֡֫ */
/* JADX INFO: compiled from: N5R1 */
/* JADX INFO: loaded from: classes2.dex */
public class ResultReceiverC0847 extends ResultReceiver {

    /* JADX INFO: renamed from: ᩸ */
    public WeakReference f3799;

    public ResultReceiverC0847(C0882 c0882) {
        super(null);
        this.f3799 = new WeakReference(c0882);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C0882 c0882 = (C0882) this.f3799.get();
        if (c0882 == null || bundle == null) {
            return;
        }
        synchronized (c0882.f5693) {
            c0882.f5694.m36711(AbstractBinderC1267.m24244(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
            C1560 c1560 = c0882.f5694;
            InterfaceC8422 interfaceC8422M12796 = null;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(C15127.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable(C0655am.f2320av);
                    if (!(parcelable instanceof C5740)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC8422M12796 = ((C5740) parcelable).m12796();
                }
            } catch (RuntimeException unused) {
            }
            c1560.m36712(interfaceC8422M12796);
            c0882.m5327();
        }
    }
}
