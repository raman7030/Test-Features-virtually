package p067l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֨ᩳ */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0905 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C13045.m29867(parcel, "inParcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        C13045.m29861(parcelable);
        return new C1255((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1255[i];
    }
}
