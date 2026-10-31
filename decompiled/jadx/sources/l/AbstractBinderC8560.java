package l;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8560 extends Binder implements InterfaceC2210 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2210 m22275(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC2210)) {
            return (InterfaceC2210) iInterfaceQueryLocalInterface;
        }
        return new C9266(iBinder);
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
        InterfaceC20555 c14203 = null;
        switch (i) {
            case 1:
                mo7349(parcel.readString(), (Bundle) C15614.m36798(parcel, Bundle.CREATOR), (C18001) C15614.m36798(parcel, C18001.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo7356 = mo7356((KeyEvent) C15614.m36798(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo7356 ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC20555)) {
                        c14203 = (InterfaceC20555) iInterfaceQueryLocalInterface;
                    } else {
                        c14203 = new C14203(strongBinder);
                    }
                }
                mo7354(c14203);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 != null && (iInterfaceQueryLocalInterface2 instanceof InterfaceC20555)) {
                        c14203 = (InterfaceC20555) iInterfaceQueryLocalInterface2;
                    } else {
                        c14203 = new C14203(strongBinder2);
                    }
                }
                mo7367(c14203);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo7359 = mo7359();
                parcel2.writeNoException();
                parcel2.writeInt(zMo7359 ? 1 : 0);
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
                PendingIntent pendingIntentMo7380 = mo7380();
                parcel2.writeNoException();
                C15614.m36799(parcel2, pendingIntentMo7380, 1);
                return true;
            case 9:
                long jMo7383 = mo7383();
                parcel2.writeNoException();
                parcel2.writeLong(jMo7383);
                return true;
            case 10:
                C20824 c20824Mo7357 = mo7357();
                parcel2.writeNoException();
                C15614.m36799(parcel2, c20824Mo7357, 1);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readString();
                mo7345(i3, i4);
                parcel2.writeNoException();
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo7363(i5, i6);
                parcel2.writeNoException();
                return true;
            case 13:
                mo7373();
                parcel2.writeNoException();
                return true;
            case 14:
                mo7365((Bundle) C15614.m36798(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                mo7376((Bundle) C15614.m36798(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                mo7364((Uri) C15614.m36798(parcel, Uri.CREATOR), (Bundle) C15614.m36798(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo7346(parcel.readLong());
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
                mo7382();
                parcel2.writeNoException();
                return true;
            case 23:
                mo7368();
                parcel2.writeNoException();
                return true;
            case 24:
                seekTo(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo7352((C17026) C15614.m36798(parcel, C17026.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo7348((Bundle) C15614.m36798(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 27:
                C10677 c10677Mo7381 = mo7381();
                parcel2.writeNoException();
                C15614.m36799(parcel2, c10677Mo7381, 1);
                return true;
            case 28:
                C19413 c19413Mo7375 = mo7375();
                parcel2.writeNoException();
                C15614.m36799(parcel2, c19413Mo7375, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo7369 = mo7369();
                parcel2.writeNoException();
                if (charSequenceMo7369 != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceMo7369, parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 31:
                Bundle bundleMo7342 = mo7342();
                parcel2.writeNoException();
                C15614.m36799(parcel2, bundleMo7342, 1);
                return true;
            case 32:
                mo7360();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo7361();
                parcel2.writeNoException();
                return true;
            case 34:
                mo7372((Bundle) C15614.m36798(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 35:
                mo7374((Bundle) C15614.m36798(parcel, Bundle.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 36:
                mo7347((Uri) C15614.m36798(parcel, Uri.CREATOR), (Bundle) C15614.m36798(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo7358 = mo7358();
                parcel2.writeNoException();
                parcel2.writeInt(iMo7358);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo7344(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo7366((C13455) C15614.m36798(parcel, C13455.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo7351((C13455) C15614.m36798(parcel, C13455.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo7350((C13455) C15614.m36798(parcel, C13455.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo7362(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                mo7378();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo7355(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo7377 = mo7377();
                parcel2.writeNoException();
                parcel2.writeInt(iMo7377);
                return true;
            case 48:
                mo7371(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo7343(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo7370 = mo7370();
                parcel2.writeNoException();
                C15614.m36799(parcel2, bundleMo7370, 1);
                return true;
            case 51:
                mo7353((C17026) C15614.m36798(parcel, C17026.CREATOR), (Bundle) C15614.m36798(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
