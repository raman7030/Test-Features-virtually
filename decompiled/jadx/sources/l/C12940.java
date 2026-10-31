package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۬ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 65PU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12940 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3063();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f38808;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f38809;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f38810;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f38811;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f38812;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f38813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f38814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f38815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f38816;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f38817;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f38818;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f38819;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Bundle f38820;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C12940(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f38819 = componentCallbacksC9205.getClass().getName();
        this.f38811 = componentCallbacksC9205.mWho;
        this.f38815 = componentCallbacksC9205.mFromLayout;
        this.f38808 = componentCallbacksC9205.mFragmentId;
        this.f38817 = componentCallbacksC9205.mContainerId;
        this.f38816 = componentCallbacksC9205.mTag;
        this.f38813 = componentCallbacksC9205.mRetainInstance;
        this.f38810 = componentCallbacksC9205.mRemoving;
        this.f38809 = componentCallbacksC9205.mDetached;
        this.f38818 = componentCallbacksC9205.mArguments;
        this.f38814 = componentCallbacksC9205.mHidden;
        this.f38812 = componentCallbacksC9205.mMaxState.ordinal();
    }

    public C12940(Parcel parcel) {
        this.f38819 = parcel.readString();
        this.f38811 = parcel.readString();
        this.f38815 = parcel.readInt() != 0;
        this.f38808 = parcel.readInt();
        this.f38817 = parcel.readInt();
        this.f38816 = parcel.readString();
        this.f38813 = parcel.readInt() != 0;
        this.f38810 = parcel.readInt() != 0;
        this.f38809 = parcel.readInt() != 0;
        this.f38818 = parcel.readBundle();
        this.f38814 = parcel.readInt() != 0;
        this.f38820 = parcel.readBundle();
        this.f38812 = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(128, "FragmentState{");
        sbM32307.append(this.f38819);
        sbM32307.append(" (");
        sbM32307.append(this.f38811);
        sbM32307.append(")}:");
        if (this.f38815) {
            sbM32307.append(" fromLayout");
        }
        int i = this.f38817;
        if (i != 0) {
            sbM32307.append(" id=0x");
            sbM32307.append(Integer.toHexString(i));
        }
        String str = this.f38816;
        if (str != null && !str.isEmpty()) {
            sbM32307.append(" tag=");
            sbM32307.append(str);
        }
        if (this.f38813) {
            sbM32307.append(" retainInstance");
        }
        if (this.f38810) {
            sbM32307.append(" removing");
        }
        if (this.f38809) {
            sbM32307.append(" detached");
        }
        if (this.f38814) {
            sbM32307.append(" hidden");
        }
        return sbM32307.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38819);
        parcel.writeString(this.f38811);
        parcel.writeInt(this.f38815 ? 1 : 0);
        parcel.writeInt(this.f38808);
        parcel.writeInt(this.f38817);
        parcel.writeString(this.f38816);
        parcel.writeInt(this.f38813 ? 1 : 0);
        parcel.writeInt(this.f38810 ? 1 : 0);
        parcel.writeInt(this.f38809 ? 1 : 0);
        parcel.writeBundle(this.f38818);
        parcel.writeInt(this.f38814 ? 1 : 0);
        parcel.writeBundle(this.f38820);
        parcel.writeInt(this.f38812);
    }
}
