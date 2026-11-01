package p067l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.system.Os;

/* JADX INFO: renamed from: l.ܰۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F993 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC15304 extends Binder implements InterfaceC9270 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f43687 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.shell.IShizukuCommand");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.shell.IShizukuCommand");
            return true;
        }
        if (i == 1) {
            int i3 = Os.getuid();
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else if (i == 2) {
            BinderC17197 binderC17197 = (BinderC17197) this;
            Bundle bundleMo21448 = binderC17197.mo21448(parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(1);
            bundleMo21448.writeToParcel(parcel2, 1);
        } else if (i == 16777115) {
            System.exit(0);
            parcel2.writeNoException();
        } else {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }
}
