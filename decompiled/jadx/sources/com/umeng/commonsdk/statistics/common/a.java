package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: 051X */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: 051X */
    public final class C0041a {
        public final String a;
        public final boolean b;

        public C0041a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.a;
        }

        public boolean a() {
            return this.b;
        }
    }

    public static String a(Context context) {
        try {
            C0041a c0041aC = c(context);
            if (c0041aC != null && !c0041aC.a()) {
                return c0041aC.b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String b(Context context) {
        try {
            C0041a c0041aC = c(context);
            if (c0041aC == null) {
                return null;
            }
            return c0041aC.b();
        } catch (Exception unused) {
            return null;
        }
    }

    public static C0041a c(Context context) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper() || com.umeng.commonsdk.utils.b.a().a(context, "com.android.vending", 0) == null) {
            return null;
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.a());
                    boolean zA = cVar.a(true);
                    C0041a c0041a = new C0041a(zA ? "" : cVar.a(), zA);
                    context.unbindService(bVar);
                    return c0041a;
                } catch (Exception e) {
                    throw e;
                }
            }
            throw new IOException("Google Play connection failed");
        } catch (Throwable th) {
            context.unbindService(bVar);
            throw th;
        }
    }

    /* JADX INFO: compiled from: 051X */
    public final class b implements ServiceConnection {
        public boolean a;
        public final LinkedBlockingQueue b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public b() {
            this.a = false;
            this.b = new LinkedBlockingQueue(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public IBinder a() {
            if (this.a) {
                throw new IllegalStateException();
            }
            this.a = true;
            return (IBinder) this.b.take();
        }
    }

    /* JADX INFO: compiled from: 051X */
    public final class c implements IInterface {
        public IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public boolean a(boolean z) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
