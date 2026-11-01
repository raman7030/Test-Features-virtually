package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۢܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11576 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C22305();

    /* JADX INFO: renamed from: ۗ */
    public final String f32245;

    /* JADX INFO: renamed from: ۙ */
    public final String f32246;

    /* JADX INFO: renamed from: ᩶ */
    public final String f32247;

    /* JADX INFO: renamed from: ᩸ */
    public final String f32248;

    /* JADX INFO: renamed from: ᩹ */
    public final C12917 f32249;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C11576(C18280 c18280) {
        this.f32246 = c18280.f54573;
        this.f32248 = c18280.f54578;
        this.f32247 = c18280.f54576;
        this.f32245 = c18280.f54580;
        this.f32249 = c18280.f54579;
    }

    public C11576(Parcel parcel) {
        String string = parcel.readString();
        C12826.requireNonNull(string);
        this.f32246 = string;
        String string2 = parcel.readString();
        C12826.requireNonNull(string2);
        this.f32248 = string2;
        String string3 = parcel.readString();
        C12826.requireNonNull(string3);
        this.f32247 = string3;
        String string4 = parcel.readString();
        C12826.requireNonNull(string4);
        this.f32245 = string4;
        String string5 = parcel.readString();
        C12917 c12917 = new C12917();
        c12917.m29595(string5);
        this.f32249 = c12917;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32246);
        parcel.writeString(this.f32248);
        parcel.writeString(this.f32247);
        parcel.writeString(this.f32245);
        parcel.writeString(this.f32249.m29594());
    }
}
