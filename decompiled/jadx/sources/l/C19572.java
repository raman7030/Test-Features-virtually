package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩵ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67BH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19572 implements InterfaceC5460 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f63257;

    public C19572(IBinder iBinder) {
        this.f63257 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f63257;
    }

    @Override // l.InterfaceC5460
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo15565() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f63257.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC5460
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IJavaHookProbeAidlInterface");
            this.f63257.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
