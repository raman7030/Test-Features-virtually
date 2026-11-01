package p067l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩵ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20970 implements InterfaceC7558 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f65875;

    public C20970(IBinder iBinder) {
        this.f65875 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f65875;
    }

    @Override // p067l.InterfaceC7558
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo17476() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f65875.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC7558
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f65875.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
