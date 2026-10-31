package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9911 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C21200();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f29980;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C9911(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f29980 = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f29980);
    }
}
