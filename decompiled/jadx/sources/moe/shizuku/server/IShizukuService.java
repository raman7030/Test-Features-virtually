package moe.shizuku.server;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IShizukuService extends IInterface {

    public class Default implements IShizukuService {
        @Override // moe.shizuku.server.IShizukuService
        public int addUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle) {
            return 0;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuService
        public void attachApplication(IShizukuApplication iShizukuApplication, Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public void attachUserService(IBinder iBinder, Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public int checkPermission(String str) {
            return 0;
        }

        @Override // moe.shizuku.server.IShizukuService
        public boolean checkSelfPermission() {
            return false;
        }

        @Override // moe.shizuku.server.IShizukuService
        public void dispatchPackageChanged(Intent intent) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public void dispatchPermissionConfirmationResult(int i, int i2, int i3, Bundle bundle) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public void exit() {
        }

        @Override // moe.shizuku.server.IShizukuService
        public int getFlagsForUid(int i, int i2) {
            return 0;
        }

        @Override // moe.shizuku.server.IShizukuService
        public String getSELinuxContext() {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuService
        public String getSystemProperty(String str, String str2) {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuService
        public int getUid() {
            return 0;
        }

        @Override // moe.shizuku.server.IShizukuService
        public int getVersion() {
            return 0;
        }

        @Override // moe.shizuku.server.IShizukuService
        public boolean isHidden(int i) {
            return false;
        }

        @Override // moe.shizuku.server.IShizukuService
        public IRemoteProcess newProcess(String[] strArr, String[] strArr2, String str) {
            return null;
        }

        @Override // moe.shizuku.server.IShizukuService
        public int removeUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle) {
            return 0;
        }

        @Override // moe.shizuku.server.IShizukuService
        public void requestPermission(int i) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public void setSystemProperty(String str, String str2) {
        }

        @Override // moe.shizuku.server.IShizukuService
        public boolean shouldShowRequestPermissionRationale() {
            return false;
        }

        @Override // moe.shizuku.server.IShizukuService
        public void updateFlagsForUid(int i, int i2, int i3) {
        }
    }

    int addUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle);

    void attachApplication(IShizukuApplication iShizukuApplication, Bundle bundle);

    void attachUserService(IBinder iBinder, Bundle bundle);

    int checkPermission(String str);

    boolean checkSelfPermission();

    void dispatchPackageChanged(Intent intent);

    void dispatchPermissionConfirmationResult(int i, int i2, int i3, Bundle bundle);

    void exit();

    int getFlagsForUid(int i, int i2);

    String getSELinuxContext();

    String getSystemProperty(String str, String str2);

    int getUid();

    int getVersion();

    boolean isHidden(int i);

    IRemoteProcess newProcess(String[] strArr, String[] strArr2, String str);

    int removeUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle);

    void requestPermission(int i);

    void setSystemProperty(String str, String str2);

    boolean shouldShowRequestPermissionRationale();

    void updateFlagsForUid(int i, int i2, int i3);

    public abstract class Stub extends Binder implements IShizukuService {
        public static final String DESCRIPTOR = "moe.shizuku.server.IShizukuService";
        public static final int TRANSACTION_addUserService = 12;
        public static final int TRANSACTION_attachApplication = 18;
        public static final int TRANSACTION_attachUserService = 102;
        public static final int TRANSACTION_checkPermission = 5;
        public static final int TRANSACTION_checkSelfPermission = 16;
        public static final int TRANSACTION_dispatchPackageChanged = 103;
        public static final int TRANSACTION_dispatchPermissionConfirmationResult = 105;
        public static final int TRANSACTION_exit = 101;
        public static final int TRANSACTION_getFlagsForUid = 106;
        public static final int TRANSACTION_getSELinuxContext = 9;
        public static final int TRANSACTION_getSystemProperty = 10;
        public static final int TRANSACTION_getUid = 4;
        public static final int TRANSACTION_getVersion = 3;
        public static final int TRANSACTION_isHidden = 104;
        public static final int TRANSACTION_newProcess = 8;
        public static final int TRANSACTION_removeUserService = 13;
        public static final int TRANSACTION_requestPermission = 15;
        public static final int TRANSACTION_setSystemProperty = 11;
        public static final int TRANSACTION_shouldShowRequestPermissionRationale = 17;
        public static final int TRANSACTION_updateFlagsForUid = 107;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IShizukuService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IShizukuService)) {
                return (IShizukuService) iInterfaceQueryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface(DESCRIPTOR);
                int uid = getUid();
                parcel2.writeNoException();
                parcel2.writeInt(uid);
                return true;
            }
            if (i == 5) {
                parcel.enforceInterface(DESCRIPTOR);
                int iCheckPermission = checkPermission(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iCheckPermission);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    IRemoteProcess iRemoteProcessNewProcess = newProcess(parcel.createStringArray(), parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(iRemoteProcessNewProcess != null ? iRemoteProcessNewProcess.asBinder() : null);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    String sELinuxContext = getSELinuxContext();
                    parcel2.writeNoException();
                    parcel2.writeString(sELinuxContext);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    String systemProperty = getSystemProperty(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(systemProperty);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    setSystemProperty(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iAddUserService = addUserService(IShizukuServiceConnection.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iAddUserService);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRemoveUserService = removeUserService(IShizukuServiceConnection.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iRemoveUserService);
                    return true;
                default:
                    switch (i) {
                        case 15:
                            parcel.enforceInterface(DESCRIPTOR);
                            requestPermission(parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case 16:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zCheckSelfPermission = checkSelfPermission();
                            parcel2.writeNoException();
                            parcel2.writeInt(zCheckSelfPermission ? 1 : 0);
                            return true;
                        case 17:
                            parcel.enforceInterface(DESCRIPTOR);
                            boolean zShouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale();
                            parcel2.writeNoException();
                            parcel2.writeInt(zShouldShowRequestPermissionRationale ? 1 : 0);
                            return true;
                        case 18:
                            parcel.enforceInterface(DESCRIPTOR);
                            attachApplication(IShizukuApplication.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 101:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    exit();
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_attachUserService /* 102 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    attachUserService(parcel.readStrongBinder(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                    parcel2.writeNoException();
                                    return true;
                                case TRANSACTION_dispatchPackageChanged /* 103 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    dispatchPackageChanged(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
                                    return true;
                                case TRANSACTION_isHidden /* 104 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    boolean zIsHidden = isHidden(parcel.readInt());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(zIsHidden ? 1 : 0);
                                    return true;
                                case TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    dispatchPermissionConfirmationResult(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                                    return true;
                                case TRANSACTION_getFlagsForUid /* 106 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    int flagsForUid = getFlagsForUid(parcel.readInt(), parcel.readInt());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(flagsForUid);
                                    return true;
                                case TRANSACTION_updateFlagsForUid /* 107 */:
                                    parcel.enforceInterface(DESCRIPTOR);
                                    updateFlagsForUid(parcel.readInt(), parcel.readInt(), parcel.readInt());
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    return super.onTransact(i, parcel, parcel2, i2);
                            }
                    }
            }
        }

        public class Proxy implements IShizukuService {
            public static IShizukuService sDefaultImpl;
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

            @Override // moe.shizuku.server.IShizukuService
            public int getVersion() {
                int version;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        version = Stub.getDefaultImpl().getVersion();
                    } else {
                        parcelObtain2.readException();
                        version = parcelObtain2.readInt();
                    }
                    return version;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public int getUid() {
                int uid;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        uid = Stub.getDefaultImpl().getUid();
                    } else {
                        parcelObtain2.readException();
                        uid = parcelObtain2.readInt();
                    }
                    return uid;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public int checkPermission(String str) {
                int iCheckPermission;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iCheckPermission = Stub.getDefaultImpl().checkPermission(str);
                    } else {
                        parcelObtain2.readException();
                        iCheckPermission = parcelObtain2.readInt();
                    }
                    return iCheckPermission;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public IRemoteProcess newProcess(String[] strArr, String[] strArr2, String str) {
                IRemoteProcess iRemoteProcessAsInterface;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStringArray(strArr);
                    parcelObtain.writeStringArray(strArr2);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iRemoteProcessAsInterface = Stub.getDefaultImpl().newProcess(strArr, strArr2, str);
                    } else {
                        parcelObtain2.readException();
                        iRemoteProcessAsInterface = IRemoteProcess.Stub.asInterface(parcelObtain2.readStrongBinder());
                    }
                    return iRemoteProcessAsInterface;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public String getSELinuxContext() {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getSELinuxContext();
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public String getSystemProperty(String str, String str2) {
                String string;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        string = Stub.getDefaultImpl().getSystemProperty(str, str2);
                    } else {
                        parcelObtain2.readException();
                        string = parcelObtain2.readString();
                    }
                    return string;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void setSystemProperty(String str, String str2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().setSystemProperty(str, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public int addUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle) {
                int iAddUserService;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iShizukuServiceConnection != null ? iShizukuServiceConnection.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iAddUserService = Stub.getDefaultImpl().addUserService(iShizukuServiceConnection, bundle);
                    } else {
                        parcelObtain2.readException();
                        iAddUserService = parcelObtain2.readInt();
                    }
                    return iAddUserService;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public int removeUserService(IShizukuServiceConnection iShizukuServiceConnection, Bundle bundle) {
                int iRemoveUserService;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iShizukuServiceConnection != null ? iShizukuServiceConnection.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        iRemoveUserService = Stub.getDefaultImpl().removeUserService(iShizukuServiceConnection, bundle);
                    } else {
                        parcelObtain2.readException();
                        iRemoveUserService = parcelObtain2.readInt();
                    }
                    return iRemoveUserService;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void requestPermission(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().requestPermission(i);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public boolean checkSelfPermission() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().checkSelfPermission();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public boolean shouldShowRequestPermissionRationale() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().shouldShowRequestPermissionRationale();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void attachApplication(IShizukuApplication iShizukuApplication, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iShizukuApplication != null ? iShizukuApplication.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().attachApplication(iShizukuApplication, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void exit() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(101, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().exit();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void attachUserService(IBinder iBinder, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(Stub.TRANSACTION_attachUserService, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().attachUserService(iBinder, bundle);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void dispatchPackageChanged(Intent intent) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (intent != null) {
                        parcelObtain.writeInt(1);
                        intent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(Stub.TRANSACTION_dispatchPackageChanged, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().dispatchPackageChanged(intent);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public boolean isHidden(int i) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(Stub.TRANSACTION_isHidden, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isHidden(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void dispatchPermissionConfirmationResult(int i, int i2, int i3, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(Stub.TRANSACTION_dispatchPermissionConfirmationResult, parcelObtain, null, 1) || Stub.getDefaultImpl() == null) {
                        return;
                    }
                    Stub.getDefaultImpl().dispatchPermissionConfirmationResult(i, i2, i3, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public int getFlagsForUid(int i, int i2) {
                int flagsForUid;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    if (!this.mRemote.transact(Stub.TRANSACTION_getFlagsForUid, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        flagsForUid = Stub.getDefaultImpl().getFlagsForUid(i, i2);
                    } else {
                        parcelObtain2.readException();
                        flagsForUid = parcelObtain2.readInt();
                    }
                    return flagsForUid;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // moe.shizuku.server.IShizukuService
            public void updateFlagsForUid(int i, int i2, int i3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    if (!this.mRemote.transact(Stub.TRANSACTION_updateFlagsForUid, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().updateFlagsForUid(i, i2, i3);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IShizukuService iShizukuService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iShizukuService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iShizukuService;
            return true;
        }

        public static IShizukuService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }
    }
}
