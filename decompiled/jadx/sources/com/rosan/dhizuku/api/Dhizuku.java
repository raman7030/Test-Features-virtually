package com.rosan.dhizuku.api;

import android.annotation.SuppressLint;
import android.app.ActivityThread;
import android.app.admin.DevicePolicyManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.rosan.dhizuku.aidl.IDhizuku;
import com.rosan.dhizuku.shared.DhizukuVariables;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Dhizuku {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @SuppressLint({"StaticFieldLeak"})
    public static Context mContext;

    @SuppressLint({"StaticFieldLeak"})
    public static ComponentName mOwnerComponent;
    public static IDhizuku remote;

    public static ComponentName getOwnerComponent(Context context) {
        return getOwnerComponent((DevicePolicyManager) context.getSystemService("device_policy"));
    }

    public static ComponentName getOwnerComponent(DevicePolicyManager devicePolicyManager) {
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        ComponentName componentName = null;
        if (activeAdmins == null) {
            return null;
        }
        for (ComponentName componentName2 : activeAdmins) {
            String packageName = componentName2.getPackageName();
            if (devicePolicyManager.isDeviceOwnerApp(packageName)) {
                return componentName2;
            }
            if (devicePolicyManager.isProfileOwnerApp(packageName)) {
                componentName = componentName2;
            }
        }
        return componentName;
    }

    public static boolean init() {
        if (mContext == null) {
            mContext = ActivityThread.currentActivityThread().getApplication();
        }
        return init(mContext);
    }

    public static boolean init(Context context) {
        final IBinder binder;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        IDhizuku iDhizuku = remote;
        if (iDhizuku != null && iDhizuku.asBinder().pingBinder() && (devicePolicyManager.isDeviceOwnerApp(getOwnerPackageName()) || devicePolicyManager.isProfileOwnerApp(getOwnerPackageName()))) {
            return true;
        }
        ComponentName ownerComponent = getOwnerComponent(context);
        mOwnerComponent = ownerComponent;
        if (ownerComponent != null) {
            Uri uriBuild = new Uri.Builder().scheme("content").authority(DhizukuVariables.getProviderAuthorityName(getOwnerPackageName())).build();
            Bundle bundle = new Bundle();
            bundle.putBinder("client", new DhizukuClient().asBinder());
            try {
                Bundle bundleCall = context.getContentResolver().call(uriBuild, "client", (String) null, bundle);
                if (bundleCall != null && (binder = bundleCall.getBinder(DhizukuVariables.PARAM_DHIZUKU_BINDER)) != null) {
                    remote = IDhizuku.Stub.asInterface(binder);
                    try {
                        binder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.rosan.dhizuku.api.Dhizuku$$ExternalSyntheticLambda0
                            @Override // android.os.IBinder.DeathRecipient
                            public final void binderDied() {
                                Dhizuku.lambda$init$0(binder);
                            }
                        }, 0);
                    } catch (RemoteException unused) {
                    }
                    mContext = context;
                    return true;
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public static /* synthetic */ void lambda$init$0(IBinder iBinder) {
        if (remote.asBinder() != iBinder) {
            return;
        }
        remote = null;
    }

    public static IDhizuku requireServer() {
        IDhizuku iDhizuku = remote;
        if (iDhizuku != null && iDhizuku.asBinder().pingBinder()) {
            return remote;
        }
        Context context = mContext;
        if (context == null || !init(context)) {
            throw new IllegalStateException("binder haven't been received");
        }
        return remote;
    }

    public static int getVersionCode() {
        try {
            return requireServer().getVersionCode();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getVersionName() {
        try {
            return requireServer().getVersionName();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getOwnerPackageName() {
        return getOwnerComponent().getPackageName();
    }

    public static ComponentName getOwnerComponent() {
        return mOwnerComponent;
    }

    public static boolean isPermissionGranted() {
        try {
            return requireServer().isPermissionGranted();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static void requestPermission(DhizukuRequestPermissionListener dhizukuRequestPermissionListener) {
        requestPermission(mContext, dhizukuRequestPermissionListener);
    }

    public static void requestPermission(Context context, DhizukuRequestPermissionListener dhizukuRequestPermissionListener) {
        Bundle bundle = new Bundle();
        bundle.putInt(DhizukuVariables.PARAM_CLIENT_UID, context.getApplicationInfo().uid);
        bundle.putBinder(DhizukuVariables.PARAM_CLIENT_REQUEST_PERMISSION_BINDER, dhizukuRequestPermissionListener.asBinder());
        String ownerPackageName = getOwnerPackageName();
        try {
            context.startActivity(new Intent(DhizukuVariables.getActionRequestPermission(ownerPackageName)).setPackage(ownerPackageName).putExtras(bundle).putExtra("bundle", bundle).addFlags(268468224));
        } catch (ActivityNotFoundException unused) {
            try {
                dhizukuRequestPermissionListener.onRequestPermission(-1);
            } catch (RemoteException unused2) {
            }
        }
    }

    public static boolean remoteTransact(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.writeInterfaceToken(DhizukuVariables.BINDER_DESCRIPTOR);
                parcelObtain.writeStrongBinder(iBinder);
                parcelObtain.writeInt(i);
                parcelObtain.writeInt(i2);
                parcelObtain.appendFrom(parcel, 0, parcel.dataSize());
                boolean zTransact = requireServer().asBinder().transact(11, parcelObtain, parcel2, 0);
                parcelObtain.recycle();
                return zTransact;
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static IBinder binderWrapper(IBinder iBinder) {
        return new DhizukuBinderWrapper(iBinder);
    }

    public static DhizukuRemoteProcess newProcess(String[] strArr, String[] strArr2, File file) {
        try {
            return new DhizukuRemoteProcess(requireServer().remoteProcess(strArr, strArr2, file != null ? file.getPath() : null));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static void startUserService(DhizukuUserServiceArgs dhizukuUserServiceArgs) {
        try {
            DhizukuServiceConnections.start(requireServer(), dhizukuUserServiceArgs);
        } catch (RemoteException unused) {
        }
    }

    public static void stopUserService(DhizukuUserServiceArgs dhizukuUserServiceArgs) {
        try {
            DhizukuServiceConnections.stop(requireServer(), dhizukuUserServiceArgs);
        } catch (RemoteException unused) {
        }
    }

    public static boolean bindUserService(DhizukuUserServiceArgs dhizukuUserServiceArgs, ServiceConnection serviceConnection) {
        try {
            DhizukuServiceConnections.bind(requireServer(), dhizukuUserServiceArgs, serviceConnection);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static boolean unbindUserService(ServiceConnection serviceConnection) {
        try {
            DhizukuServiceConnections.unbind(requireServer(), serviceConnection);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static String[] getDelegatedScopes() {
        try {
            return requireServer().getDelegatedScopes(mContext.getPackageName());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setDelegatedScopes(String[] strArr) {
        try {
            requireServer().setDelegatedScopes(mContext.getPackageName(), strArr);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
