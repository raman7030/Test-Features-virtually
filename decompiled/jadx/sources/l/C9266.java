package l;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9266 implements InterfaceC2210 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f28068;

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7356(KeyEvent keyEvent) {
        throw null;
    }

    public C9266(IBinder iBinder) {
        this.f28068 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f28068;
    }

    @Override // l.InterfaceC2210
    /* JADX INFO: renamed from: ֫ */
    public final void mo7354(InterfaceC20555 interfaceC20555) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC20555);
            this.f28068.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
