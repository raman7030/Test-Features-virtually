package com.alipay.sdk.p010m.p054v0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.alipay.sdk.m.v0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0232a extends IInterface {
    /* JADX INFO: renamed from: a */
    String mo1083a();

    /* JADX INFO: renamed from: a */
    String mo1084a(String str);

    /* JADX INFO: renamed from: b */
    String mo1085b();

    /* JADX INFO: renamed from: b */
    String mo1086b(String str);

    /* JADX INFO: renamed from: c */
    boolean mo1087c();

    /* JADX INFO: renamed from: c */
    boolean mo1088c(String str);

    /* JADX INFO: renamed from: com.alipay.sdk.m.v0.a$a */
    /* JADX INFO: compiled from: N673 */
    public abstract class a extends Binder implements InterfaceC0232a {

        /* JADX INFO: renamed from: a */
        public static final String f1066a = "com.zui.deviceidservice.IDeviceidInterface";

        /* JADX INFO: renamed from: b */
        public static final int f1067b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f1068c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f1069d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f1070e = 4;

        /* JADX INFO: renamed from: f */
        public static final int f1071f = 5;

        /* JADX INFO: renamed from: g */
        public static final int f1072g = 6;

        public a() {
            attachInterface(this, f1066a);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0232a m1089a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f1066a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0232a)) ? new C2411a(iBinder) : (InterfaceC0232a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        /* JADX INFO: renamed from: com.alipay.sdk.m.v0.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: N673 */
        public class C2411a implements InterfaceC0232a {

            /* JADX INFO: renamed from: a */
            public IBinder f1073a;

            public C2411a(IBinder iBinder) {
                this.f1073a = iBinder;
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: a */
            public String mo1083a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    this.f1073a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1073a;
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: b */
            public String mo1085b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    this.f1073a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: c */
            public boolean mo1087c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    this.f1073a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: d */
            public String m1090d() {
                return a.f1066a;
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: a */
            public String mo1084a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    parcelObtain.writeString(str);
                    this.f1073a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: b */
            public String mo1086b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    parcelObtain.writeString(str);
                    this.f1073a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.alipay.sdk.p010m.p054v0.InterfaceC0232a
            /* JADX INFO: renamed from: c */
            public boolean mo1088c(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f1066a);
                    parcelObtain.writeString(str);
                    this.f1073a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(f1066a);
                        String strMo1083a = mo1083a();
                        parcel2.writeNoException();
                        parcel2.writeString(strMo1083a);
                        return true;
                    case 2:
                        parcel.enforceInterface(f1066a);
                        String strMo1085b = mo1085b();
                        parcel2.writeNoException();
                        parcel2.writeString(strMo1085b);
                        return true;
                    case 3:
                        parcel.enforceInterface(f1066a);
                        boolean zMo1087c = mo1087c();
                        parcel2.writeNoException();
                        parcel2.writeInt(zMo1087c ? 1 : 0);
                        return true;
                    case 4:
                        parcel.enforceInterface(f1066a);
                        String strMo1086b = mo1086b(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strMo1086b);
                        return true;
                    case 5:
                        parcel.enforceInterface(f1066a);
                        String strMo1084a = mo1084a(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(strMo1084a);
                        return true;
                    case 6:
                        parcel.enforceInterface(f1066a);
                        boolean zMo1088c = mo1088c(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(zMo1088c ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(f1066a);
            return true;
        }
    }
}
