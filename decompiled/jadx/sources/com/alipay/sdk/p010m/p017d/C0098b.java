package com.alipay.sdk.p010m.p017d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0098b implements InterfaceC0089b {

    /* JADX INFO: renamed from: a */
    public static final String f440a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* JADX INFO: renamed from: b */
    public static final int f441b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f442c = 2;

    /* JADX INFO: renamed from: com.alipay.sdk.m.d.b$b */
    /* JADX INFO: compiled from: N673 */
    public final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f443a;

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingQueue f444b;

        public b() {
            this.f443a = false;
            this.f444b = new LinkedBlockingQueue();
        }

        /* JADX INFO: renamed from: a */
        public IBinder m558a() {
            if (this.f443a) {
                throw new IllegalStateException();
            }
            this.f443a = true;
            return (IBinder) this.f444b.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f444b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.d.b$c */
    /* JADX INFO: compiled from: N673 */
    public final class c implements IInterface {

        /* JADX INFO: renamed from: a */
        public IBinder f445a;

        public c(IBinder iBinder) {
            this.f445a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f445a;
        }

        /* JADX INFO: renamed from: d */
        public String m559d() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f445a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean m560e() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f445a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        b bVar = new b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, bVar, 1)) {
            try {
                return new c(bVar.m558a()).m559d();
            } catch (Exception unused) {
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }
}
