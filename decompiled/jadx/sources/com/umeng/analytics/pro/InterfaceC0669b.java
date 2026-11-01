package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.umeng.analytics.pro.b */
/* JADX INFO: compiled from: OBLV */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0669b extends IInterface {
    /* JADX INFO: renamed from: a */
    String mo2314a();

    /* JADX INFO: renamed from: a */
    String mo2315a(String str);

    /* JADX INFO: renamed from: b */
    String mo2316b(String str);

    /* JADX INFO: renamed from: com.umeng.analytics.pro.b$a */
    /* JADX INFO: compiled from: OBLV */
    public abstract class a extends Binder implements InterfaceC0669b {

        /* JADX INFO: renamed from: a */
        public static final int f2453a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2454b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f2455c = 3;

        /* JADX INFO: renamed from: d */
        public static final String f2456d = "com.samsung.android.deviceidservice.IDeviceIdService";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0669b m2317a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0669b)) {
                return (InterfaceC0669b) iInterfaceQueryLocalInterface;
            }
            return new C2413a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strMo2314a = mo2314a();
                parcel2.writeNoException();
                parcel2.writeString(strMo2314a);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strMo2315a = mo2315a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo2315a);
                return true;
            }
            if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            String strMo2316b = mo2316b(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo2316b);
            return true;
        }

        /* JADX INFO: renamed from: com.umeng.analytics.pro.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OBLV */
        public class C2413a implements InterfaceC0669b {

            /* JADX INFO: renamed from: a */
            public IBinder f2457a;

            /* JADX INFO: renamed from: b */
            public String m2318b() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            public C2413a(IBinder iBinder) {
                this.f2457a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2457a;
            }

            @Override // com.umeng.analytics.pro.InterfaceC0669b
            /* JADX INFO: renamed from: a */
            public String mo2314a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f2457a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0669b
            /* JADX INFO: renamed from: a */
            public String mo2315a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.f2457a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0669b
            /* JADX INFO: renamed from: b */
            public String mo2316b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.f2457a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
