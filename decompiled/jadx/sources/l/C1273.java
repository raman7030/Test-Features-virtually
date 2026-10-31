package l;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB8W */
/* JADX INFO: loaded from: classes2.dex */
public final class C1273 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C11233.m27805(parcel, "inParcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        C11233.m27799(parcelable);
        return new C8329((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8329[i];
    }
}
