package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: OBLV */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    String a();

    String a(String str);

    String b(String str);

    /* JADX INFO: compiled from: OBLV */
    public abstract class a extends Binder implements b {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final String d = "com.samsung.android.deviceidservice.IDeviceIdService";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof b)) {
                return (b) iInterfaceQueryLocalInterface;
            }
            return new C0034a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strA2 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA2);
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
            String strB = b(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strB);
            return true;
        }

        /* JADX INFO: renamed from: com.umeng.analytics.pro.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: OBLV */
        public class C0034a implements b {
            public IBinder a;

            public String b() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            public C0034a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // com.umeng.analytics.pro.b
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.b
            public String a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.b
            public String b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.a.transact(3, parcelObtain, parcelObtain2, 0);
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
