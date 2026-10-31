package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: l.ۛܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6109 extends Binder implements InterfaceC11754 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11754 m17026(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC11754)) {
            return (InterfaceC11754) iInterfaceQueryLocalInterface;
        }
        return new C10343(iBinder);
    }
}
