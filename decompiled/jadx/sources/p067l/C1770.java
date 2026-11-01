package p067l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴۧ */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C1770 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1035();

    /* JADX INFO: renamed from: ۙ */
    public final CharSequence f62367;

    /* JADX INFO: renamed from: ᩶ */
    public final int f62368;

    /* JADX INFO: renamed from: ᩸ */
    public final String f62369;

    /* JADX INFO: renamed from: ᩹ */
    public final Bundle f62370;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1770(Parcel parcel) {
        this.f62369 = parcel.readString();
        this.f62367 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f62368 = parcel.readInt();
        this.f62370 = parcel.readBundle(C2015.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f62369);
        TextUtils.writeToParcel(this.f62367, parcel, i);
        parcel.writeInt(this.f62368);
        parcel.writeBundle(this.f62370);
    }

    /* JADX INFO: renamed from: ֫ */
    public final PlaybackState.CustomAction m45588() {
        PlaybackState.CustomAction.Builder builderM24774 = C1280.m24774(this.f62369, this.f62367, this.f62368);
        C1280.m24782(builderM24774, this.f62370);
        return C1280.m24775(builderM24774);
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f62367) + ", mIcon=" + this.f62368 + ", mExtras=" + this.f62370;
    }
}
