package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩻֫ */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2002 extends Binder implements InterfaceC1862 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                ((BinderC1757) this).m45193();
                return true;
            case 2:
                mo16445();
                return true;
            case 3:
                ((BinderC1757) this).mo35999((C1805) C1162.m19745(parcel, C1805.CREATOR));
                return true;
            case 4:
                mo16442((C1372) C1162.m19745(parcel, C1372.CREATOR));
                return true;
            case 5:
                parcel.createTypedArrayList(C1385.CREATOR);
                mo16446();
                return true;
            case 6:
                mo16447();
                return true;
            case 7:
                mo16444();
                return true;
            case 8:
                mo16443((C1875) C1162.m19745(parcel, C1875.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                ((BinderC1757) this).m45191();
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                ((BinderC1757) this).m45194();
                return true;
            case 12:
                parcel.readInt();
                ((BinderC1757) this).m45192();
                return true;
            case 13:
                ((BinderC1757) this).m45190();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
