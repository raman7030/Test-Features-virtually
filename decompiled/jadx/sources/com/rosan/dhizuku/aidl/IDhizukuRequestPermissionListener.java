package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IDhizukuRequestPermissionListener extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener";

    public class Default implements IDhizukuRequestPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
        public void onRequestPermission(int i) {
        }
    }

    void onRequestPermission(int i);

    public abstract class Stub extends Binder implements IDhizukuRequestPermissionListener {
        public static final int TRANSACTION_onRequestPermission = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizukuRequestPermissionListener.DESCRIPTOR);
        }

        public static IDhizukuRequestPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDhizukuRequestPermissionListener.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDhizukuRequestPermissionListener)) {
                return (IDhizukuRequestPermissionListener) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizukuRequestPermissionListener.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizukuRequestPermissionListener.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onRequestPermission(parcel.readInt());
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public class Proxy implements IDhizukuRequestPermissionListener {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizukuRequestPermissionListener.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRequestPermissionListener
            public void onRequestPermission(int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRequestPermissionListener.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
