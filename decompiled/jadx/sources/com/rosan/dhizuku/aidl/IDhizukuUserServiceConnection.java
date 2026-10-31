package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IDhizukuUserServiceConnection extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection";

    public class Default implements IDhizukuUserServiceConnection {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
        public void connected(Bundle bundle, IBinder iBinder) {
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
        public void died(Bundle bundle) {
        }
    }

    void connected(Bundle bundle, IBinder iBinder);

    void died(Bundle bundle);

    public abstract class Stub extends Binder implements IDhizukuUserServiceConnection {
        public static final int TRANSACTION_connected = 1;
        public static final int TRANSACTION_died = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizukuUserServiceConnection.DESCRIPTOR);
        }

        public static IDhizukuUserServiceConnection asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDhizukuUserServiceConnection.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDhizukuUserServiceConnection)) {
                return (IDhizukuUserServiceConnection) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizukuUserServiceConnection.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizukuUserServiceConnection.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                connected((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readStrongBinder());
            } else if (i == 2) {
                died((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        public class Proxy implements IDhizukuUserServiceConnection {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizukuUserServiceConnection.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
            public void connected(Bundle bundle, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuUserServiceConnection.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
            public void died(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuUserServiceConnection.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    public class _Parcel {
        public static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void writeTypedObject(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
