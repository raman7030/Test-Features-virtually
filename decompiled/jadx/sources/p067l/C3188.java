package p067l;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3188 implements InterfaceC7212 {

    /* JADX INFO: renamed from: ֫ */
    public final Messenger f6126;

    public C3188(Messenger messenger) {
        this.f6126 = messenger;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5487() throws RemoteException {
        m5486(2, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5488(String str, List list, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", null);
        if (list != null) {
            bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        m5486(3, bundle2);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5486(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        this.f6126.send(messageObtain);
    }
}
