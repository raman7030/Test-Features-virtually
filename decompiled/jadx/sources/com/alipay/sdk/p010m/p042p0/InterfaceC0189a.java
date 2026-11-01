package com.alipay.sdk.p010m.p042p0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.alipay.sdk.m.p0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0189a extends IInterface {
    /* JADX INFO: renamed from: a */
    String mo914a();

    /* JADX INFO: renamed from: a */
    String mo915a(String str);

    /* JADX INFO: renamed from: b */
    String mo916b(String str);

    /* JADX INFO: renamed from: com.alipay.sdk.m.p0.a$a */
    /* JADX INFO: compiled from: N673 */
    public abstract class a extends Binder implements InterfaceC0189a {

        /* JADX INFO: renamed from: a */
        public static final String f885a = "com.samsung.android.deviceidservice.IDeviceIdService";

        /* JADX INFO: renamed from: b */
        public static final int f886b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f887c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f888d = 3;

        public a() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0189a m917a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0189a)) ? new C2410a(iBinder) : (InterfaceC0189a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strMo914a = mo914a();
                parcel2.writeNoException();
                parcel2.writeString(strMo914a);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String strMo916b = mo916b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo916b);
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                return true;
            }
            parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            String strMo915a = mo915a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeString(strMo915a);
            return true;
        }

        /* JADX INFO: renamed from: com.alipay.sdk.m.p0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: N673 */
        public class C2410a implements InterfaceC0189a {

            /* JADX INFO: renamed from: a */
            public IBinder f889a;

            public C2410a(IBinder iBinder) {
                this.f889a = iBinder;
            }

            @Override // com.alipay.sdk.p010m.p042p0.InterfaceC0189a
            /* JADX INFO: renamed from: a */
            public String mo914a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.f889a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f889a;
            }

            @Override // com.alipay.sdk.p010m.p042p0.InterfaceC0189a
            /* JADX INFO: renamed from: b */
            public String mo916b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.f889a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: d */
            public String m918d() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            @Override // com.alipay.sdk.p010m.p042p0.InterfaceC0189a
            /* JADX INFO: renamed from: a */
            public String mo915a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    parcelObtain.writeString(str);
                    this.f889a.transact(3, parcelObtain, parcelObtain2, 0);
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
