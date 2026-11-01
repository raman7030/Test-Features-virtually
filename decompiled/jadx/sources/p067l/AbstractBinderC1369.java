package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ۧ */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC1369 extends Binder implements InterfaceC1649 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC1649 m28715(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1649.f53213);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1649)) {
            return (InterfaceC1649) iInterfaceQueryLocalInterface;
        }
        return new C0914(iBinder);
    }
}
