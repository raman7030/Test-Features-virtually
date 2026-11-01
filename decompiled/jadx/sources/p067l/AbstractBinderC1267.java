package p067l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۡ֫ */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1267 extends Binder implements InterfaceC0952 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC0952 m24244(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0952)) {
            return (InterfaceC0952) iInterfaceQueryLocalInterface;
        }
        return new C1302(iBinder);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC1862 c1547 = null;
        switch (i) {
            case 1:
                mo9432(parcel.readString(), (Bundle) C1617.m38964(parcel, Bundle.CREATOR), (C1735) C1617.m38964(parcel, C1735.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo9439 = mo9439((KeyEvent) C1617.m38964(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo9439 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1862)) {
                        c1547 = (InterfaceC1862) iInterfaceQueryLocalInterface;
                    } else {
                        c1547 = new C1547(strongBinder);
                    }
                }
                mo9437(c1547);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC1862)) {
                        c1547 = (InterfaceC1862) iInterfaceQueryLocalInterface2;
                    } else {
                        c1547 = new C1547(strongBinder2);
                    }
                }
                mo9450(c1547);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo9442 = mo9442();
                parcel2.writeNoException();
                parcel2.writeInt(zMo9442 ? 1 : 0);
                return true;
            case 6:
                String packageName = getPackageName();
                parcel2.writeNoException();
                parcel2.writeString(packageName);
                return true;
            case 7:
                String tag = getTag();
                parcel2.writeNoException();
                parcel2.writeString(tag);
                return true;
            case 8:
                PendingIntent pendingIntentMo9463 = mo9463();
                parcel2.writeNoException();
                C1617.m38965(parcel2, pendingIntentMo9463, 1);
                return true;
            case 9:
                long jMo9466 = mo9466();
                parcel2.writeNoException();
                parcel2.writeLong(jMo9466);
                return true;
            case 10:
                C1875 c1875Mo9440 = mo9440();
                parcel2.writeNoException();
                C1617.m38965(parcel2, c1875Mo9440, 1);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readString();
                mo9428(i3, i4);
                parcel2.writeNoException();
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo9446(i5, i6);
                parcel2.writeNoException();
                return true;
            case 13:
                mo9456();
                parcel2.writeNoException();
                return true;
            case 14:
                mo9448((Bundle) C1617.m38964(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo9459((Bundle) C1617.m38964(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                mo9447((Uri) C1617.m38964(parcel, Uri.CREATOR), (Bundle) C1617.m38964(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo9429(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                pause();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                mo9465();
                parcel2.writeNoException();
                return true;
            case 23:
                mo9451();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo9435((C1687) C1617.m38964(parcel, C1687.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo9431((Bundle) C1617.m38964(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                C1372 c1372Mo9464 = mo9464();
                parcel2.writeNoException();
                C1617.m38965(parcel2, c1372Mo9464, 1);
                return true;
            case 28:
                C1805 c1805Mo9458 = mo9458();
                parcel2.writeNoException();
                C1617.m38965(parcel2, c1805Mo9458, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo9452 = mo9452();
                parcel2.writeNoException();
                if (charSequenceMo9452 != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceMo9452, parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 31:
                Bundle bundleMo9425 = mo9425();
                parcel2.writeNoException();
                C1617.m38965(parcel2, bundleMo9425, 1);
                return true;
            case 32:
                mo9443();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo9444();
                parcel2.writeNoException();
                return true;
            case 34:
                mo9455((Bundle) C1617.m38964(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                mo9457((Bundle) C1617.m38964(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                mo9430((Uri) C1617.m38964(parcel, Uri.CREATOR), (Bundle) C1617.m38964(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo9441 = mo9441();
                parcel2.writeNoException();
                parcel2.writeInt(iMo9441);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo9427(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo9449((C1509) C1617.m38964(parcel, C1509.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo9434((C1509) C1617.m38964(parcel, C1509.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo9433((C1509) C1617.m38964(parcel, C1509.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo9445(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                mo9461();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo9438(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo9460 = mo9460();
                parcel2.writeNoException();
                parcel2.writeInt(iMo9460);
                return true;
            case 48:
                mo9454(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo9426(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo9453 = mo9453();
                parcel2.writeNoException();
                C1617.m38965(parcel2, bundleMo9453, 1);
                return true;
            case 51:
                mo9436((C1687) C1617.m38964(parcel, C1687.CREATOR), (Bundle) C1617.m38964(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
