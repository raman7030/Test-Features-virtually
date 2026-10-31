package com.rosan.dhizuku.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface IDhizukuRemoteProcess extends IInterface {
    public static final String DESCRIPTOR = "com.rosan.dhizuku.aidl.IDhizukuRemoteProcess";

    public class Default implements IDhizukuRemoteProcess {
        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public boolean alive() {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public void destroy() {
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public int exitValue() {
            return 0;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public ParcelFileDescriptor getErrorStream() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public ParcelFileDescriptor getInputStream() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public ParcelFileDescriptor getOutputStream() {
            return null;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public int waitFor() {
            return 0;
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
        public boolean waitForTimeout(long j, String str) {
            return false;
        }
    }

    boolean alive();

    void destroy();

    int exitValue();

    ParcelFileDescriptor getErrorStream();

    ParcelFileDescriptor getInputStream();

    ParcelFileDescriptor getOutputStream();

    int waitFor();

    boolean waitForTimeout(long j, String str);

    public abstract class Stub extends Binder implements IDhizukuRemoteProcess {
        public static final int TRANSACTION_alive = 6;
        public static final int TRANSACTION_destroy = 5;
        public static final int TRANSACTION_exitValue = 4;
        public static final int TRANSACTION_getErrorStream = 3;
        public static final int TRANSACTION_getInputStream = 2;
        public static final int TRANSACTION_getOutputStream = 1;
        public static final int TRANSACTION_waitFor = 7;
        public static final int TRANSACTION_waitForTimeout = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IDhizukuRemoteProcess.DESCRIPTOR);
        }

        public static IDhizukuRemoteProcess asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IDhizukuRemoteProcess.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IDhizukuRemoteProcess)) {
                return (IDhizukuRemoteProcess) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IDhizukuRemoteProcess.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IDhizukuRemoteProcess.DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    ParcelFileDescriptor outputStream = getOutputStream();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, outputStream, 1);
                    return true;
                case 2:
                    ParcelFileDescriptor inputStream = getInputStream();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, inputStream, 1);
                    return true;
                case 3:
                    ParcelFileDescriptor errorStream = getErrorStream();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, errorStream, 1);
                    return true;
                case 4:
                    int iExitValue = exitValue();
                    parcel2.writeNoException();
                    parcel2.writeInt(iExitValue);
                    return true;
                case 5:
                    destroy();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean zAlive = alive();
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlive ? 1 : 0);
                    return true;
                case 7:
                    int iWaitFor = waitFor();
                    parcel2.writeNoException();
                    parcel2.writeInt(iWaitFor);
                    return true;
                case 8:
                    boolean zWaitForTimeout = waitForTimeout(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWaitForTimeout ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public class Proxy implements IDhizukuRemoteProcess {
            public IBinder mRemote;

            public String getInterfaceDescriptor() {
                return IDhizukuRemoteProcess.DESCRIPTOR;
            }

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public ParcelFileDescriptor getOutputStream() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public ParcelFileDescriptor getInputStream() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public ParcelFileDescriptor getErrorStream() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public int exitValue() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public void destroy() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public boolean alive() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public int waitFor() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.rosan.dhizuku.aidl.IDhizukuRemoteProcess
            public boolean waitForTimeout(long j, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IDhizukuRemoteProcess.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
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
