package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: renamed from: l.֡ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2863 extends Binder implements InterfaceC7558 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f4947 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            return true;
        }
        if (i == 1) {
            boolean zMo17476 = ((BinderC22981) this).mo17476();
            parcel2.writeNoException();
            parcel2.writeInt(zMo17476 ? 1 : 0);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                ((BinderC22981) this).exit();
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }
        ServiceC23651 serviceC23651 = ((BinderC22981) this).f72271;
        String[] strArr = null;
        if (serviceC23651.f75275 != null) {
            String message = serviceC23651.f75275.getMessage();
            if (message == null || message.isEmpty()) {
                message = serviceC23651.f75275.toString();
            }
            String stackTraceString = Log.getStackTraceString(serviceC23651.f75275);
            serviceC23651.f75275 = null;
            strArr = new String[]{message, stackTraceString};
        }
        parcel2.writeNoException();
        parcel2.writeStringArray(strArr);
        return true;
    }
}
