package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۘܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71WO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC6217 extends Binder implements InterfaceC20299 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f15677 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("bin.mt.dstr.ipc.IDecryptorAidlInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("bin.mt.dstr.ipc.IDecryptorAidlInterface");
            return true;
        }
        switch (i) {
            case 1:
                boolean zMo10343 = ((BinderC8899) this).mo10343(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(zMo10343 ? 1 : 0);
                return true;
            case 2:
                ((BinderC8899) this).exit();
                parcel2.writeNoException();
                return true;
            case 3:
                String[] strArrMo10346 = ((BinderC8899) this).mo10346();
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrMo10346);
                return true;
            case 4:
                String strMo10355 = ((BinderC8899) this).mo10355(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo10355);
                return true;
            case 5:
                String strMo10350 = ((BinderC8899) this).mo10350(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strMo10350);
                return true;
            case 6:
                byte[] bArrMo10348 = ((BinderC8899) this).mo10348(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo10348);
                return true;
            case 7:
                int[] iArrMo10354 = ((BinderC8899) this).mo10354(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10354);
                return true;
            case 8:
                int[] iArrMo10352 = ((BinderC8899) this).mo10352(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10352);
                return true;
            case 9:
                int[] iArrMo10345 = ((BinderC8899) this).mo10345(parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10345);
                return true;
            case 10:
                int iMo10347 = ((BinderC8899) this).mo10347(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo10347);
                return true;
            case 11:
                String strMo10349 = ((BinderC8899) this).mo10349(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strMo10349);
                return true;
            case 12:
                int[] iArrMo10344 = ((BinderC8899) this).mo10344(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10344);
                return true;
            case 13:
                int[] iArrMo10356 = ((BinderC8899) this).mo10356(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10356);
                return true;
            case 14:
                int[] iArrMo10351 = ((BinderC8899) this).mo10351(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrMo10351);
                return true;
            case 15:
                C16944.m38524(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                int i3 = ((BinderC8899) this).f24114.f52642;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
