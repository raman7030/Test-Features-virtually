package l;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC8517 extends Handler {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f26032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f26033;

    public HandlerC8517(C19101 c19101) {
        this.f26032 = new WeakReference(c19101);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f26033;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f26032;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        C23645.m52135(data);
        InterfaceC0755 interfaceC0755 = (InterfaceC0755) weakReference2.get();
        Messenger messenger = (Messenger) this.f26033.get();
        try {
            int i = message.what;
            if (i == 1) {
                C23645.m52135(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                interfaceC0755.mo2895();
                return;
            }
            if (i == 2) {
                interfaceC0755.mo2893();
                return;
            }
            if (i == 3) {
                Bundle bundle = data.getBundle("data_options");
                C23645.m52135(bundle);
                C23645.m52135(data.getBundle("data_notify_children_changed_options"));
                String string = data.getString("data_media_item_id");
                data.getParcelableArrayList("data_media_item_list");
                interfaceC0755.mo2894(messenger, string, bundle);
                return;
            }
            message.toString();
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC0755.mo2893();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22209(Messenger messenger) {
        this.f26033 = new WeakReference(messenger);
    }
}
