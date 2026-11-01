package p067l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۖܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4876 implements InterfaceC20299 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f11122;

    public C4876(IBinder iBinder) {
        this.f11122 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11122;
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10343(String str, boolean z, boolean z2, boolean z3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            parcelObtain.writeInt(z3 ? 1 : 0);
            this.f11122.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f11122.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo10346() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f11122.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ᩳ */
    public final String mo10355(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܳ */
    public final String mo10350(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo10348(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܿ */
    public final int[] mo10354(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo10352(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo10345(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f11122.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ۧ */
    public final int mo10347(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܳ */
    public final String mo10349(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֫ */
    public final int[] mo10344(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ᩳ */
    public final int[] mo10356(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܽ */
    public final int[] mo10351(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ܿ */
    public final void mo10353(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f11122.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC20299
    /* JADX INFO: renamed from: ֨ */
    public final int mo10342() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f11122.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
