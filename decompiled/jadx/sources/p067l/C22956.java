package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4UI */
/* JADX INFO: loaded from: classes5.dex */
public final class C22956 extends C8203 {
    public static final Parcelable.Creator CREATOR = new C16919();

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f72219;

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f72219.size());
        HashSet hashSet = this.f72219;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C22956(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f72219 = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f72219, strArr);
    }

    public C22956() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
