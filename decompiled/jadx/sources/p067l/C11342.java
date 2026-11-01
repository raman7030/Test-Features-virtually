package p067l;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11342 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 24) {
            C10671 c10671 = new C10671(parcel);
            c10671.f29521 = parcel.readInt();
            c10671.f29523 = parcel.readInt();
            c10671.f29522 = parcel.readParcelable(null);
            return c10671;
        }
        return new C10671(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24) {
            C10671 c10671 = new C10671(parcel);
            c10671.f29521 = parcel.readInt();
            c10671.f29523 = parcel.readInt();
            c10671.f29522 = parcel.readParcelable(null);
            return c10671;
        }
        return new C10671(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C10671[i];
    }
}
