package com.umeng.analytics.pro;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.umeng.analytics.pro.a */
/* JADX INFO: compiled from: NAPL */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0642a extends IInterface {
    /* JADX INFO: renamed from: a */
    String mo2112a(String str);

    /* JADX INFO: renamed from: a */
    boolean mo2113a();

    /* JADX INFO: renamed from: b */
    String mo2114b();

    /* JADX INFO: renamed from: b */
    String mo2115b(String str);

    /* JADX INFO: renamed from: c */
    String mo2116c(String str);

    /* JADX INFO: renamed from: d */
    String mo2117d(String str);

    /* JADX INFO: renamed from: e */
    String mo2118e(String str);

    /* JADX INFO: renamed from: com.umeng.analytics.pro.a$a */
    /* JADX INFO: compiled from: NAPL */
    public abstract class a extends Binder implements InterfaceC0642a {

        /* JADX INFO: renamed from: a */
        public static final int f2208a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f2209b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f2210c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f2211d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f2212e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f2213f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f2214g = 7;

        /* JADX INFO: renamed from: h */
        public static final String f2215h = "com.coolpad.deviceidsupport.IDeviceIdManager";

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public a() {
            attachInterface(this, f2215h);
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0642a m2119a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f2215h);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0642a)) {
                return (InterfaceC0642a) iInterfaceQueryLocalInterface;
            }
            return new C2412a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString(f2215h);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(f2215h);
                    String strMo2112a = mo2112a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2112a);
                    return true;
                case 2:
                    parcel.enforceInterface(f2215h);
                    String strMo2115b = mo2115b(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2115b);
                    return true;
                case 3:
                    parcel.enforceInterface(f2215h);
                    String strMo2116c = mo2116c(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2116c);
                    return true;
                case 4:
                    parcel.enforceInterface(f2215h);
                    String strMo2117d = mo2117d(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2117d);
                    return true;
                case 5:
                    parcel.enforceInterface(f2215h);
                    String strMo2118e = mo2118e(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2118e);
                    return true;
                case 6:
                    parcel.enforceInterface(f2215h);
                    boolean zMo2113a = mo2113a();
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo2113a ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(f2215h);
                    String strMo2114b = mo2114b();
                    parcel2.writeNoException();
                    parcel2.writeString(strMo2114b);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: com.umeng.analytics.pro.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NAPL */
        public class C2412a implements InterfaceC0642a {

            /* JADX INFO: renamed from: a */
            public IBinder f2216a;

            /* JADX INFO: renamed from: c */
            public String m2120c() {
                return a.f2215h;
            }

            public C2412a(IBinder iBinder) {
                this.f2216a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2216a;
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: a */
            public String mo2112a(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    parcelObtain.writeString(str);
                    this.f2216a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: b */
            public String mo2115b(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    parcelObtain.writeString(str);
                    this.f2216a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: c */
            public String mo2116c(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    parcelObtain.writeString(str);
                    this.f2216a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: d */
            public String mo2117d(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    parcelObtain.writeString(str);
                    this.f2216a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: e */
            public String mo2118e(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    parcelObtain.writeString(str);
                    this.f2216a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: a */
            public boolean mo2113a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    this.f2216a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.umeng.analytics.pro.InterfaceC0642a
            /* JADX INFO: renamed from: b */
            public String mo2114b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f2215h);
                    this.f2216a.transact(7, parcelObtain, parcelObtain2, 0);
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
