package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC23376 extends Binder implements InterfaceC20555 {
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
                ((BinderC18438) this).m42920();
                return true;
            case 2:
                mo14541();
                return true;
            case 3:
                ((BinderC18438) this).mo33867((C19413) C6443.m17798(parcel, C19413.CREATOR));
                return true;
            case 4:
                mo14538((C10677) C6443.m17798(parcel, C10677.CREATOR));
                return true;
            case 5:
                parcel.createTypedArrayList(C10946.CREATOR);
                mo14542();
                return true;
            case 6:
                mo14543();
                return true;
            case 7:
                mo14540();
                return true;
            case 8:
                mo14539((C20824) C6443.m17798(parcel, C20824.CREATOR));
                return true;
            case 9:
                parcel.readInt();
                ((BinderC18438) this).m42918();
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                ((BinderC18438) this).m42921();
                return true;
            case 12:
                parcel.readInt();
                ((BinderC18438) this).m42919();
                return true;
            case 13:
                ((BinderC18438) this).m42917();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
