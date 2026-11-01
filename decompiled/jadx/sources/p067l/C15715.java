package p067l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܰ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H9RQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15715 implements IBinder {

    /* JADX INFO: renamed from: ܿ */
    public final IBinder f45534;

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return null;
    }

    public C15715(IBinder iBinder) {
        C12826.requireNonNull(iBinder);
        this.f45534 = iBinder;
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = !C24433.m53918() && C24433.m53922() >= 13;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IShizukuService.Stub.DESCRIPTOR);
            parcelObtain.writeStrongBinder(this.f45534);
            parcelObtain.writeInt(i);
            if (z) {
                parcelObtain.writeInt(i2);
            }
            parcelObtain.appendFrom(parcel, 0, parcel.dataSize());
            if (z) {
                try {
                    C24433.m53912().asBinder().transact(1, parcelObtain, parcel2, 0);
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } else {
                try {
                    C24433.m53912().asBinder().transact(1, parcelObtain, parcel2, i2);
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            }
            parcelObtain.recycle();
            return true;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.f45534.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return this.f45534.pingBinder();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.f45534.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f45534.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f45534.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.f45534.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f45534.unlinkToDeath(deathRecipient, i);
    }
}
