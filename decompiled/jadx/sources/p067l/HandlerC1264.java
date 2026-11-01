package p067l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۡ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC1264 extends Handler {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f28947;

    /* JADX INFO: renamed from: ۧ */
    public WeakReference f28948;

    public HandlerC1264(C1789 c1789) {
        this.f28947 = new WeakReference(c1789);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f28948;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f28947;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        C2015.m54538(data);
        InterfaceC0879 interfaceC0879 = (InterfaceC0879) weakReference2.get();
        Messenger messenger = (Messenger) this.f28948.get();
        try {
            int i = message.what;
            if (i == 1) {
                C2015.m54538(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                interfaceC0879.mo5224();
                return;
            }
            if (i == 2) {
                interfaceC0879.mo5222();
                return;
            }
            if (i == 3) {
                Bundle bundle = data.getBundle("data_options");
                C2015.m54538(bundle);
                C2015.m54538(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                interfaceC0879.mo5223(messenger, string, bundle);
                return;
            }
            message.toString();
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC0879.mo5222();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24177(Messenger messenger) {
        this.f28948 = new WeakReference(messenger);
    }
}
