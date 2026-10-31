package l;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5FU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18707 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3890();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f59143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f59144;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f59145;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bundle f59146;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C18707(Parcel parcel) {
        this.f59145 = parcel.readString();
        this.f59143 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f59144 = parcel.readInt();
        this.f59146 = parcel.readBundle(C23645.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59145);
        TextUtils.writeToParcel(this.f59143, parcel, i);
        parcel.writeInt(this.f59144);
        parcel.writeBundle(this.f59146);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final PlaybackState.CustomAction m43322() {
        PlaybackState.CustomAction.Builder builderM22804 = C8829.m22804(this.f59145, this.f59143, this.f59144);
        C8829.m22812(builderM22804, this.f59146);
        return C8829.m22805(builderM22804);
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f59143) + ", mIcon=" + this.f59144 + ", mExtras=" + this.f59146;
    }
}
