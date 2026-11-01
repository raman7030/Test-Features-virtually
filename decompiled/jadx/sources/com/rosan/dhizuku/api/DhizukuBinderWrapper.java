package com.rosan.dhizuku.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.FileDescriptor;
import p067l.C12826;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuBinderWrapper implements IBinder {
    public IBinder target;

    @Override // android.os.IBinder
    public IInterface queryLocalInterface(String str) {
        return null;
    }

    public DhizukuBinderWrapper(IBinder iBinder) {
        C12826.requireNonNull(iBinder);
        this.target = iBinder;
    }

    @Override // android.os.IBinder
    public String getInterfaceDescriptor() {
        return this.target.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public boolean pingBinder() {
        return this.target.pingBinder();
    }

    @Override // android.os.IBinder
    public boolean isBinderAlive() {
        return this.target.isBinderAlive();
    }

    @Override // android.os.IBinder
    public void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.target.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.target.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        return Dhizuku.remoteTransact(this.target, i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.target.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.target.unlinkToDeath(deathRecipient, i);
    }
}
