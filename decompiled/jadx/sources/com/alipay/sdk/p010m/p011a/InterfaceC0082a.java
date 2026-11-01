package com.alipay.sdk.p010m.p011a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.alipay.sdk.m.a.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0082a extends IInterface {

    /* JADX INFO: renamed from: com.alipay.sdk.m.a.a$a */
    /* JADX INFO: compiled from: N673 */
    public abstract class a extends Binder implements InterfaceC0082a {

        /* JADX INFO: renamed from: com.alipay.sdk.m.a.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: N673 */
        public class C2407a implements InterfaceC0082a {

            /* JADX INFO: renamed from: a */
            public IBinder f287a;

            public C2407a(IBinder iBinder) {
                this.f287a = iBinder;
            }

            /* JADX INFO: renamed from: a */
            public String m442a(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f287a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f287a;
            }
        }

        /* JADX INFO: renamed from: a */
        public static InterfaceC0082a m441a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0082a)) ? new C2407a(iBinder) : (InterfaceC0082a) iInterfaceQueryLocalInterface;
        }
    }
}
