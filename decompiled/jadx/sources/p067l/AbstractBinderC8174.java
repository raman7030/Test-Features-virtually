package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ۛܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8174 extends Binder implements InterfaceC13539 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC13539 m18957(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC13539)) {
            return (InterfaceC13539) iInterfaceQueryLocalInterface;
        }
        return new C12198(iBinder);
    }
}
