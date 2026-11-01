package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩴ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes4.dex */
public final class C19894 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C20565 c20565 = new C20565(parcel);
        c20565.f63575 = parcel.readInt();
        return c20565;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C20565[i];
    }
}
