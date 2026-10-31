package com.rosan.dhizuku.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuServiceConnection {
    public final Handler handler = new Handler(Looper.getMainLooper());
    public final List connections = new ArrayList();

    public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
        this.handler.post(new Runnable() { // from class: com.rosan.dhizuku.api.DhizukuServiceConnection$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceConnected$0(componentName, iBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceConnected$0(ComponentName componentName, IBinder iBinder) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
        }
    }

    public void onServiceDisconnected(final ComponentName componentName) {
        this.handler.post(new Runnable() { // from class: com.rosan.dhizuku.api.DhizukuServiceConnection$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$onServiceDisconnected$1(componentName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onServiceDisconnected$1(ComponentName componentName) {
        Iterator it = this.connections.iterator();
        while (it.hasNext()) {
            ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
        }
    }

    public void add(ServiceConnection serviceConnection) {
        this.connections.add(serviceConnection);
    }

    public void remove(ServiceConnection serviceConnection) {
        this.connections.remove(serviceConnection);
    }

    public boolean isEmpty() {
        return this.connections.isEmpty();
    }
}
