package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۖܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2638 implements InterfaceC18866 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f8328;

    public C2638(IBinder iBinder) {
        this.f8328 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8328;
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo8299(String str, boolean z, boolean z2, boolean z3) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            parcelObtain.writeInt(z3 ? 1 : 0);
            this.f8328.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    public final void exit() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] mo8302() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo8311(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo8306(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo8304(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] mo8310(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] mo8308(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] mo8301(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeByteArray(bArr);
            this.f8328.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo8303(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo8305(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] mo8300(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] mo8312(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] mo8307(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createIntArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo8309(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f8328.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC18866
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int mo8298() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            this.f8328.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
