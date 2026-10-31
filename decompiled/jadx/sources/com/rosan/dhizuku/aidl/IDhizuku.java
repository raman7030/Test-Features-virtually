package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IDhizuku extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizuku";

    public class Default implements IDhizuku {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public void bindUserService(IDhizukuUserServiceConnection iDhizukuUserServiceConnection, Bundle bundle) {
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public String[] getDelegatedScopes(String str) {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public int getVersionCode() {
            return 0;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public String getVersionName() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public boolean isPermissionGranted() {
            return false;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public IDhizukuRemoteProcess remoteProcess(String[] strArr, String[] strArr2, String str) {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public void setDelegatedScopes(String str, String[] strArr) {
        }

        @Override // com.rosan.dhizuku.aidl.IDhizuku
        public void unbindUserService(Bundle bundle) {
        }
    }

    void bindUserService(IDhizukuUserServiceConnection iDhizukuUserServiceConnection, Bundle bundle);

    String[] getDelegatedScopes(String str);

    int getVersionCode();

    String getVersionName();

    boolean isPermissionGranted();

    IDhizukuRemoteProcess remoteProcess(String[] strArr, String[] strArr2, String str);

    void setDelegatedScopes(String str, String[] strArr);

    void unbindUserService(Bundle bundle);

    public abstract class Stub extends Binder implements IDhizuku {
        public static final int TRANSACTION_bindUserService = 13;
        public static final int TRANSACTION_getDelegatedScopes = 16;
        public static final int TRANSACTION_getVersionCode = 1;
        public static final int TRANSACTION_getVersionName = 2;
        public static final int TRANSACTION_isPermissionGranted = 3;
        public static final int TRANSACTION_remoteProcess = 12;
        public static final int TRANSACTION_setDelegatedScopes = 17;
        public static final int TRANSACTION_unbindUserService = 14;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizuku.DESCRIPTOR);
        }

        public static IDhizuku asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDhizuku.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDhizuku)) {
                return (IDhizuku) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizuku.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizuku.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int versionCode = getVersionCode();
                parcel2.writeNoException();
                parcel2.writeInt(versionCode);
            } else if (i == 2) {
                String versionName = getVersionName();
                parcel2.writeNoException();
                parcel2.writeString(versionName);
            } else if (i == 3) {
                boolean zIsPermissionGranted = isPermissionGranted();
                parcel2.writeNoException();
                parcel2.writeInt(zIsPermissionGranted ? 1 : 0);
            } else if (i == 16) {
                String[] delegatedScopes = getDelegatedScopes(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(delegatedScopes);
            } else if (i != 17) {
                switch (i) {
                    case 12:
                        IDhizukuRemoteProcess iDhizukuRemoteProcessRemoteProcess = remoteProcess(parcel.createStringArray(), parcel.createStringArray(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStrongInterface(iDhizukuRemoteProcessRemoteProcess);
                        break;
                    case 13:
                        bindUserService(IDhizukuUserServiceConnection.Stub.asInterface(parcel.readStrongBinder()), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 14:
                        unbindUserService((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                setDelegatedScopes(parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
            }
            return true;
        }

        public class Proxy implements IDhizuku {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizuku.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public int getVersionCode() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public String getVersionName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public boolean isPermissionGranted() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public IDhizukuRemoteProcess remoteProcess(String[] strArr, String[] strArr2, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return IDhizukuRemoteProcess.Stub.asInterface(parcelObtain2.readStrongBinder());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public void bindUserService(IDhizukuUserServiceConnection iDhizukuUserServiceConnection, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iDhizukuUserServiceConnection);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public void unbindUserService(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public String[] getDelegatedScopes(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizuku
            public void setDelegatedScopes(String str, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizuku.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
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
