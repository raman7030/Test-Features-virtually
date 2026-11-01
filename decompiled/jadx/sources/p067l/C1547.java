package p067l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܳ֫ */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1547 implements InterfaceC1862 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f45956;

    public C1547(IBinder iBinder) {
        this.f45956 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45956;
    }

    @Override // p067l.InterfaceC1862
    /* JADX INFO: renamed from: ۘ */
    public final void mo16445() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f45956.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC1862
    /* JADX INFO: renamed from: ֫ */
    public final void mo35999(C1805 c1805) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c1805 != null) {
                parcelObtain.writeInt(1);
                c1805.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f45956.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC1862
    /* JADX INFO: renamed from: ֫ */
    public final void mo16442(C1372 c1372) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c1372 != null) {
                parcelObtain.writeInt(1);
                c1372.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f45956.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
