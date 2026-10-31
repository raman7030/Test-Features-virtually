package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14203 implements InterfaceC20555 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f42866;

    public C14203(IBinder iBinder) {
        this.f42866 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f42866;
    }

    @Override // l.InterfaceC20555
    /* JADX INFO: renamed from: ۘ */
    public final void mo14541() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f42866.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC20555
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33867(C19413 c19413) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c19413 != null) {
                parcelObtain.writeInt(1);
                c19413.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f42866.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC20555
    /* JADX INFO: renamed from: ֫ */
    public final void mo14538(C10677 c10677) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c10677 != null) {
                parcelObtain.writeInt(1);
                c10677.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f42866.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
