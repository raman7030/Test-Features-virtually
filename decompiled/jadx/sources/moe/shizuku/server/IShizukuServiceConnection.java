package moe.shizuku.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IShizukuServiceConnection extends IInterface {

    public class Default implements IShizukuServiceConnection {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuServiceConnection
        public void connected(IBinder iBinder) {
        }

        @Override // moe.shizuku.server.IShizukuServiceConnection
        public void died() {
        }
    }

    void connected(IBinder iBinder);

    void died();

    public abstract class Stub extends Binder implements IShizukuServiceConnection {
        public static final String DESCRIPTOR = "moe.shizuku.server.IShizukuServiceConnection";
        public static final int TRANSACTION_connected = 1;
        public static final int TRANSACTION_died = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShizukuServiceConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IShizukuServiceConnection)) {
                return (IShizukuServiceConnection) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                connected(parcel.readStrongBinder());
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                died();
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IShizukuServiceConnection {
            public static IShizukuServiceConnection sDefaultImpl;
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // moe.shizuku.server.IShizukuServiceConnection
            public void connected(IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().connected(iBinder);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuServiceConnection
            public void died() {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().died();
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IShizukuServiceConnection iShizukuServiceConnection) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iShizukuServiceConnection == null) {
                return false;
            }
            Proxy.sDefaultImpl = iShizukuServiceConnection;
            return true;
        }

        public static IShizukuServiceConnection getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
