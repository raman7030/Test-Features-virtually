package com.rosan.dhizuku.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.rosan.dhizuku.aidl.IDhizuku;
import com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuServiceConnections {
    public static final IDhizukuUserServiceConnection iDhizukuUserServiceConnection = new BinderC06001();
    public static final Map map = new HashMap();
    public static final Map services = new HashMap();

    /* JADX INFO: renamed from: com.rosan.dhizuku.api.DhizukuServiceConnections$1 */
    public class BinderC06001 extends IDhizukuUserServiceConnection.Stub {
        @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
        public void connected(final Bundle bundle, IBinder iBinder) {
            onServiceConnected(bundle, iBinder);
            try {
                iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.rosan.dhizuku.api.DhizukuServiceConnections$1$$ExternalSyntheticLambda0
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f$0.lambda$connected$0(bundle);
                    }
                }, 0);
            } catch (RemoteException unused) {
            }
        }

        public void onServiceConnected(Bundle bundle, IBinder iBinder) {
            ComponentName componentName = new DhizukuUserServiceArgs(bundle).getComponentName();
            String strFlattenToString = componentName.flattenToString();
            DhizukuServiceConnections.services.put(strFlattenToString, iBinder);
            DhizukuServiceConnection dhizukuServiceConnection = (DhizukuServiceConnection) DhizukuServiceConnections.map.get(strFlattenToString);
            if (dhizukuServiceConnection == null) {
                return;
            }
            dhizukuServiceConnection.onServiceConnected(componentName, iBinder);
        }

        @Override // com.rosan.dhizuku.aidl.IDhizukuUserServiceConnection
        /* JADX INFO: renamed from: died, reason: merged with bridge method [inline-methods] */
        public void lambda$connected$0(Bundle bundle) {
            ComponentName componentName = new DhizukuUserServiceArgs(bundle).getComponentName();
            String strFlattenToString = componentName.flattenToString();
            DhizukuServiceConnections.services.remove(strFlattenToString);
            DhizukuServiceConnection dhizukuServiceConnection = (DhizukuServiceConnection) DhizukuServiceConnections.map.get(strFlattenToString);
            if (dhizukuServiceConnection == null) {
                return;
            }
            dhizukuServiceConnection.onServiceDisconnected(componentName);
        }
    }

    public static void start(IDhizuku iDhizuku, DhizukuUserServiceArgs dhizukuUserServiceArgs) {
        if (((IBinder) services.get(dhizukuUserServiceArgs.getComponentName().flattenToString())) == null) {
            iDhizuku.bindUserService(iDhizukuUserServiceConnection, dhizukuUserServiceArgs.build());
        }
    }

    public static void stop(IDhizuku iDhizuku, DhizukuUserServiceArgs dhizukuUserServiceArgs) {
        iDhizuku.unbindUserService(dhizukuUserServiceArgs.build());
    }

    public static void bind(IDhizuku iDhizuku, DhizukuUserServiceArgs dhizukuUserServiceArgs, ServiceConnection serviceConnection) {
        ComponentName componentName = dhizukuUserServiceArgs.getComponentName();
        String strFlattenToString = componentName.flattenToString();
        Map map2 = map;
        DhizukuServiceConnection dhizukuServiceConnection = (DhizukuServiceConnection) map2.get(strFlattenToString);
        if (dhizukuServiceConnection == null) {
            dhizukuServiceConnection = new DhizukuServiceConnection();
            map2.put(strFlattenToString, dhizukuServiceConnection);
        }
        dhizukuServiceConnection.add(serviceConnection);
        IBinder iBinder = (IBinder) services.get(strFlattenToString);
        if (iBinder == null) {
            iDhizuku.bindUserService(iDhizukuUserServiceConnection, dhizukuUserServiceArgs.build());
        } else {
            serviceConnection.onServiceConnected(componentName, iBinder);
        }
    }

    public static void unbind(IDhizuku iDhizuku, ServiceConnection serviceConnection) {
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            DhizukuServiceConnection dhizukuServiceConnection = (DhizukuServiceConnection) entry.getValue();
            if (dhizukuServiceConnection == null) {
                arrayList.add(str);
            } else {
                dhizukuServiceConnection.remove(serviceConnection);
                if (dhizukuServiceConnection.isEmpty()) {
                    arrayList.add(str);
                }
            }
        }
        for (String str2 : arrayList) {
            map.remove(str2);
            stop(iDhizuku, new DhizukuUserServiceArgs(ComponentName.unflattenFromString(str2)));
        }
    }
}
