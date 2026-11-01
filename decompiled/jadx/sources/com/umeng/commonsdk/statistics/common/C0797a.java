package com.umeng.commonsdk.statistics.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.umeng.commonsdk.utils.C0830b;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a */
/* JADX INFO: compiled from: 051X */
/* JADX INFO: loaded from: classes.dex */
public class C0797a {

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$a */
    /* JADX INFO: compiled from: 051X */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final String f3373a;

        /* JADX INFO: renamed from: b */
        public final boolean f3374b;

        public a(String str, boolean z) {
            this.f3373a = str;
            this.f3374b = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public String m3005b() {
            return this.f3373a;
        }

        /* JADX INFO: renamed from: a */
        public boolean m3006a() {
            return this.f3374b;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m3001a(Context context) {
        try {
            a aVarM3003c = m3003c(context);
            if (aVarM3003c != null && !aVarM3003c.m3006a()) {
                return aVarM3003c.m3005b();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m3002b(Context context) {
        try {
            a aVarM3003c = m3003c(context);
            if (aVarM3003c == null) {
                return null;
            }
            return aVarM3003c.m3005b();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static a m3003c(Context context) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper() || C0830b.m3304a().m3305a(context, "com.android.vending", 0) == null) {
            return null;
        }
        b bVar = new b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.m3007a());
                    boolean zM3009a = cVar.m3009a(true);
                    a aVar = new a(zM3009a ? "" : cVar.m3008a(), zM3009a);
                    context.unbindService(bVar);
                    return aVar;
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

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$b */
    /* JADX INFO: compiled from: 051X */
    public final class b implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public boolean f3375a;

        /* JADX INFO: renamed from: b */
        public final LinkedBlockingQueue f3376b;

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public b() {
            this.f3375a = false;
            this.f3376b = new LinkedBlockingQueue(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f3376b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public IBinder m3007a() {
            if (this.f3375a) {
                throw new IllegalStateException();
            }
            this.f3375a = true;
            return (IBinder) this.f3376b.take();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.a$c */
    /* JADX INFO: compiled from: 051X */
    public final class c implements IInterface {

        /* JADX INFO: renamed from: a */
        public IBinder f3377a;

        public c(IBinder iBinder) {
            this.f3377a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3377a;
        }

        /* JADX INFO: renamed from: a */
        public String m3008a() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f3377a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m3009a(boolean z) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.f3377a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
