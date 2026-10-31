package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: l.ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16589 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C18001 c18001 = new C18001();
        c18001.f56148 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        return c18001;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C18001[i];
    }
}
