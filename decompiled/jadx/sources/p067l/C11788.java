package p067l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11788 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C22517();

    /* JADX INFO: renamed from: ᩸ */
    public final Bundle f32938;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C11788(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f32938 = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f32938);
    }
}
