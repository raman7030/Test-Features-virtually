package l;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9442 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (Build.VERSION.SDK_INT < 24) {
            C8736 c8736 = new C8736(parcel);
            c8736.f26596 = parcel.readInt();
            c8736.f26598 = parcel.readInt();
            c8736.f26597 = parcel.readParcelable(null);
            return c8736;
        }
        return new C8736(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24) {
            C8736 c8736 = new C8736(parcel);
            c8736.f26596 = parcel.readInt();
            c8736.f26598 = parcel.readInt();
            c8736.f26597 = parcel.readParcelable(null);
            return c8736;
        }
        return new C8736(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8736[i];
    }
}
