package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IDhizukuClient extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizukuClient";

    public class Default implements IDhizukuClient {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuClient
        public int getVersionCode() {
            return 0;
        }
    }

    int getVersionCode();

    public abstract class Stub extends Binder implements IDhizukuClient {
        public static final int TRANSACTION_getVersionCode = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizukuClient.DESCRIPTOR);
        }

        public static IDhizukuClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDhizukuClient.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDhizukuClient)) {
                return (IDhizukuClient) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizukuClient.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizukuClient.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int versionCode = getVersionCode();
                parcel2.writeNoException();
                parcel2.writeInt(versionCode);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IDhizukuClient {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizukuClient.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuClient
            public int getVersionCode() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuClient.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
