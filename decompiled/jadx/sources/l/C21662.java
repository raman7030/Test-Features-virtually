package l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21662 extends C6139 {
    public static final Parcelable.Creator CREATOR = new C15310();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f69515;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f69515.size());
        HashSet hashSet = this.f69515;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C21662(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f69515 = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f69515, strArr);
    }

    public C21662() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
