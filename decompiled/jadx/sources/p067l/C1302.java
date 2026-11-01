package p067l;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ۢ֫ */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes3.dex */
public final class C1302 implements InterfaceC0952 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f31016;

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9439(KeyEvent keyEvent) {
        throw null;
    }

    public C1302(IBinder iBinder) {
        this.f31016 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31016;
    }

    @Override // p067l.InterfaceC0952
    /* JADX INFO: renamed from: ֫ */
    public final void mo9437(InterfaceC1862 interfaceC1862) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC1862);
            this.f31016.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
