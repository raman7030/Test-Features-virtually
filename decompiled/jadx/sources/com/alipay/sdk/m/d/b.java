package com.alipay.sdk.m.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b implements com.alipay.sdk.m.c.b {
    public static final String a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
    public static final int b = 1;
    public static final int c = 2;

    /* JADX INFO: renamed from: com.alipay.sdk.m.d.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public final class ServiceConnectionC0013b implements ServiceConnection {
        public boolean a;
        public final LinkedBlockingQueue b;

        public ServiceConnectionC0013b() {
            this.a = false;
            this.b = new LinkedBlockingQueue();
        }

        public IBinder a() {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return (IBinder) this.b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: N673 */
    public final class c implements IInterface {
        public IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String d() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean e() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        ServiceConnectionC0013b serviceConnectionC0013b = new ServiceConnectionC0013b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, serviceConnectionC0013b, 1)) {
            try {
                return new c(serviceConnectionC0013b.a()).d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0013b);
            }
        }
        return null;
    }
}
