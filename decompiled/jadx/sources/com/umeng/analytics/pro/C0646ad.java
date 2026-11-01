package com.umeng.analytics.pro;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ad */
/* JADX INFO: compiled from: BBLZ */
/* JADX INFO: loaded from: classes.dex */
public class C0646ad implements InterfaceC0730z {

    /* JADX INFO: renamed from: a */
    public static final String f2230a = "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";

    /* JADX INFO: renamed from: b */
    public static final int f2231b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f2232c = 2;

    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        a aVar = new a();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.m2136a()).m2137a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.ad$a */
    /* JADX INFO: compiled from: BBLZ */
    public final class a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f2233a;

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingQueue f2234b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public a() {
            this.f2233a = false;
            this.f2234b = new LinkedBlockingQueue();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f2234b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public IBinder m2136a() {
            if (this.f2233a) {
                throw new IllegalStateException();
            }
            this.f2233a = true;
            return (IBinder) this.f2234b.poll(5L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.ad$b */
    /* JADX INFO: compiled from: BBLZ */
    public final class b implements IInterface {

        /* JADX INFO: renamed from: a */
        public IBinder f2235a;

        public b(IBinder iBinder) {
            this.f2235a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f2235a;
        }

        /* JADX INFO: renamed from: a */
        public String m2137a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f2235a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m2138b() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                this.f2235a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
