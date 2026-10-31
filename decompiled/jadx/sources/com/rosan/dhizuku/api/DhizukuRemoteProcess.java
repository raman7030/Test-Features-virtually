package com.rosan.dhizuku.api;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.rosan.dhizuku.aidl.IDhizukuRemoteProcess;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import l.C11003;

/* JADX INFO: loaded from: classes.dex */
public class DhizukuRemoteProcess extends Process {
    public static final String TAG = "DhizukuRemoteProcess";
    public InputStream errorStream;
    public InputStream inputStream;
    public OutputStream outputStream;
    public IDhizukuRemoteProcess remote;

    public DhizukuRemoteProcess(IDhizukuRemoteProcess iDhizukuRemoteProcess) {
        C11003.requireNonNull(iDhizukuRemoteProcess);
        this.remote = iDhizukuRemoteProcess;
        try {
            iDhizukuRemoteProcess.asBinder().linkToDeath(new IBinder.DeathRecipient() { // from class: com.rosan.dhizuku.api.DhizukuRemoteProcess$$ExternalSyntheticLambda0
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    this.f$0.lambda$new$0();
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.remote = null;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            return outputStream;
        }
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.remote.getOutputStream());
            this.outputStream = autoCloseOutputStream;
            return autoCloseOutputStream;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            return inputStream;
        }
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.remote.getInputStream());
            this.inputStream = autoCloseInputStream;
            return autoCloseInputStream;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        InputStream inputStream = this.errorStream;
        if (inputStream != null) {
            return inputStream;
        }
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.remote.getErrorStream());
            this.errorStream = autoCloseInputStream;
            return autoCloseInputStream;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public int exitValue() {
        try {
            return this.remote.exitValue();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public void destroy() {
        try {
            this.remote.destroy();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public boolean isAlive() {
        try {
            return this.remote.alive();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public int waitFor() {
        try {
            return this.remote.waitFor();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.lang.Process
    public boolean waitFor(long j, TimeUnit timeUnit) {
        try {
            return this.remote.waitForTimeout(j, timeUnit.toString());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
