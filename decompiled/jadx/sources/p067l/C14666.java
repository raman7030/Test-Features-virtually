package p067l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۬ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 65PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14666 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C5279();

    /* JADX INFO: renamed from: ۗ */
    public final int f41852;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f41853;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f41854;

    /* JADX INFO: renamed from: ۟ */
    public final String f41855;

    /* JADX INFO: renamed from: ۤ */
    public final int f41856;

    /* JADX INFO: renamed from: ۨ */
    public final boolean f41857;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f41858;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f41859;

    /* JADX INFO: renamed from: ܰ */
    public final String f41860;

    /* JADX INFO: renamed from: ᩶ */
    public final int f41861;

    /* JADX INFO: renamed from: ᩸ */
    public final Bundle f41862;

    /* JADX INFO: renamed from: ᩹ */
    public final String f41863;

    /* JADX INFO: renamed from: ᩺ */
    public Bundle f41864;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C14666(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f41863 = componentCallbacksC11117.getClass().getName();
        this.f41855 = componentCallbacksC11117.mWho;
        this.f41859 = componentCallbacksC11117.mFromLayout;
        this.f41852 = componentCallbacksC11117.mFragmentId;
        this.f41861 = componentCallbacksC11117.mContainerId;
        this.f41860 = componentCallbacksC11117.mTag;
        this.f41857 = componentCallbacksC11117.mRetainInstance;
        this.f41854 = componentCallbacksC11117.mRemoving;
        this.f41853 = componentCallbacksC11117.mDetached;
        this.f41862 = componentCallbacksC11117.mArguments;
        this.f41858 = componentCallbacksC11117.mHidden;
        this.f41856 = componentCallbacksC11117.mMaxState.ordinal();
    }

    public C14666(Parcel parcel) {
        this.f41863 = parcel.readString();
        this.f41855 = parcel.readString();
        this.f41859 = parcel.readInt() != 0;
        this.f41852 = parcel.readInt();
        this.f41861 = parcel.readInt();
        this.f41860 = parcel.readString();
        this.f41857 = parcel.readInt() != 0;
        this.f41854 = parcel.readInt() != 0;
        this.f41853 = parcel.readInt() != 0;
        this.f41862 = parcel.readBundle();
        this.f41858 = parcel.readInt() != 0;
        this.f41864 = parcel.readBundle();
        this.f41856 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(128, "FragmentState{");
        sbM34407.append(this.f41863);
        sbM34407.append(" (");
        sbM34407.append(this.f41855);
        sbM34407.append(")}:");
        if (this.f41859) {
            sbM34407.append(" fromLayout");
        }
        int i = this.f41861;
        if (i != 0) {
            sbM34407.append(" id=0x");
            sbM34407.append(Integer.toHexString(i));
        }
        String str = this.f41860;
        if (str != null && !str.isEmpty()) {
            sbM34407.append(" tag=");
            sbM34407.append(str);
        }
        if (this.f41857) {
            sbM34407.append(" retainInstance");
        }
        if (this.f41854) {
            sbM34407.append(" removing");
        }
        if (this.f41853) {
            sbM34407.append(" detached");
        }
        if (this.f41858) {
            sbM34407.append(" hidden");
        }
        return sbM34407.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41863);
        parcel.writeString(this.f41855);
        parcel.writeInt(this.f41859 ? 1 : 0);
        parcel.writeInt(this.f41852);
        parcel.writeInt(this.f41861);
        parcel.writeString(this.f41860);
        parcel.writeInt(this.f41857 ? 1 : 0);
        parcel.writeInt(this.f41854 ? 1 : 0);
        parcel.writeInt(this.f41853 ? 1 : 0);
        parcel.writeBundle(this.f41862);
        parcel.writeInt(this.f41858 ? 1 : 0);
        parcel.writeBundle(this.f41864);
        parcel.writeInt(this.f41856);
    }
}
