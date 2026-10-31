package moe.shizuku.server;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public interface IRemoteProcess extends IInterface {

    public class Default implements IRemoteProcess {
        @Override // moe.shizuku.server.IRemoteProcess
        public boolean alive() {
            return false;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public void destroy() {
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public int exitValue() {
            return 0;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getErrorStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getInputStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public ParcelFileDescriptor getOutputStream() {
            return null;
        }

        @Override // moe.shizuku.server.IRemoteProcess
        public int waitFor() {
            return 0;
        }

        @Override // moe.shizuku.server.IRemoteProcess
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

    public abstract class Stub extends Binder implements IRemoteProcess {
        public static final String DESCRIPTOR = "moe.shizuku.server.IRemoteProcess";
        public static final int TRANSACTION_alive = 7;
        public static final int TRANSACTION_destroy = 6;
        public static final int TRANSACTION_exitValue = 5;
        public static final int TRANSACTION_getErrorStream = 3;
        public static final int TRANSACTION_getInputStream = 2;
        public static final int TRANSACTION_getOutputStream = 1;
        public static final int TRANSACTION_waitFor = 4;
        public static final int TRANSACTION_waitForTimeout = 8;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteProcess asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IRemoteProcess)) {
                return (IRemoteProcess) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor outputStream = getOutputStream();
                    parcel2.writeNoException();
                    if (outputStream != null) {
                        parcel2.writeInt(1);
                        outputStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor inputStream = getInputStream();
                    parcel2.writeNoException();
                    if (inputStream != null) {
                        parcel2.writeInt(1);
                        inputStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    ParcelFileDescriptor errorStream = getErrorStream();
                    parcel2.writeNoException();
                    if (errorStream != null) {
                        parcel2.writeInt(1);
                        errorStream.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iWaitFor = waitFor();
                    parcel2.writeNoException();
                    parcel2.writeInt(iWaitFor);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iExitValue = exitValue();
                    parcel2.writeNoException();
                    parcel2.writeInt(iExitValue);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    destroy();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAlive = alive();
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlive ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zWaitForTimeout = waitForTimeout(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWaitForTimeout ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        public class Proxy implements IRemoteProcess {
            public static IRemoteProcess sDefaultImpl;
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

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getOutputStream() {
                ParcelFileDescriptor outputStream;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        outputStream = Stub.getDefaultImpl().getOutputStream();
                    } else {
                        parcelObtain2.readException();
                        outputStream = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return outputStream;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getInputStream() {
                ParcelFileDescriptor inputStream;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        inputStream = Stub.getDefaultImpl().getInputStream();
                    } else {
                        parcelObtain2.readException();
                        inputStream = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return inputStream;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public ParcelFileDescriptor getErrorStream() {
                ParcelFileDescriptor errorStream;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        errorStream = Stub.getDefaultImpl().getErrorStream();
                    } else {
                        parcelObtain2.readException();
                        errorStream = parcelObtain2.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return errorStream;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public int waitFor() {
                int iWaitFor;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iWaitFor = Stub.getDefaultImpl().waitFor();
                    } else {
                        parcelObtain2.readException();
                        iWaitFor = parcelObtain2.readInt();
                    }
                    return iWaitFor;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public int exitValue() {
                int iExitValue;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iExitValue = Stub.getDefaultImpl().exitValue();
                    } else {
                        parcelObtain2.readException();
                        iExitValue = parcelObtain2.readInt();
                    }
                    return iExitValue;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public void destroy() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().destroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public boolean alive() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().alive();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IRemoteProcess
            public boolean waitForTimeout(long j, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().waitForTimeout(j, str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemoteProcess iRemoteProcess) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteProcess == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteProcess;
            return true;
        }

        public static IRemoteProcess getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
