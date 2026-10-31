package l;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C0863 implements InterfaceC5097 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Messenger f3353;

    public C0863(Messenger messenger) {
        this.f3353 = messenger;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3173() throws RemoteException {
        m3172(2, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3174(String str, List list, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        m3172(3, bundle2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3172(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        this.f3353.send(messageObtain);
    }
}
