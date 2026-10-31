package moe.shizuku.server;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IShizukuApplication extends IInterface {

    public class Default implements IShizukuApplication {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void bindApplication(Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void dispatchRequestPermissionResult(int i, Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuApplication
        public void showPermissionConfirmation(int i, int i2, String str, int i3) {
        }
    }

    void bindApplication(Bundle bundle);

    void dispatchRequestPermissionResult(int i, Bundle bundle);

    void showPermissionConfirmation(int i, int i2, String str, int i3);

    public abstract class Stub extends Binder implements IShizukuApplication {
        public static final String DESCRIPTOR = "moe.shizuku.server.IShizukuApplication";
        public static final int TRANSACTION_bindApplication = 2;
        public static final int TRANSACTION_dispatchRequestPermissionResult = 3;
        public static final int TRANSACTION_showPermissionConfirmation = 10001;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShizukuApplication asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IShizukuApplication)) {
                return (IShizukuApplication) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                bindApplication(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                dispatchRequestPermissionResult(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i != 10001) {
                if (i == 1598968902) {
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface(DESCRIPTOR);
            showPermissionConfirmation(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }

        public class Proxy implements IShizukuApplication {
            public static IShizukuApplication sDefaultImpl;
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

            @Override // moe.shizuku.server.IShizukuApplication
            public void bindApplication(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().bindApplication(bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuApplication
            public void dispatchRequestPermissionResult(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().dispatchRequestPermissionResult(i, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuApplication
            public void showPermissionConfirmation(int i, int i2, String str, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i3);
                    if (!this.mRemote.transact(Stub.TRANSACTION_showPermissionConfirmation, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().showPermissionConfirmation(i, i2, str, i3);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IShizukuApplication iShizukuApplication) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iShizukuApplication == null) {
                return false;
            }
            Proxy.sDefaultImpl = iShizukuApplication;
            return true;
        }

        public static IShizukuApplication getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
