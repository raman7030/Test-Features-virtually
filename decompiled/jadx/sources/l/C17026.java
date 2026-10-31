package l;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17026 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16320();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52198;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float f52199;

    public C17026(float f, int i) {
        this.f52198 = i;
        this.f52199 = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f52198);
        sb.append(" rating=");
        float f = this.f52199;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f52198;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52198);
        parcel.writeFloat(this.f52199);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17026 m39988(Rating rating) {
        float f;
        C17026 c17026 = null;
        if (rating != null) {
            int iM41536 = C17732.m41536(rating);
            if (!C17732.m41540(rating)) {
                switch (iM41536) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c17026 = new C17026(-1.0f, iM41536);
                        break;
                }
            } else {
                switch (iM41536) {
                    case 1:
                        c17026 = new C17026(C17732.m41541(rating) ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        c17026 = new C17026(C17732.m41538(rating) ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM41539 = C17732.m41539(rating);
                        if (iM41536 == 3) {
                            f = 3.0f;
                        } else if (iM41536 == 4) {
                            f = 4.0f;
                        } else if (iM41536 == 5) {
                            f = 5.0f;
                        }
                        if (fM41539 >= 0.0f && fM41539 <= f) {
                            c17026 = new C17026(fM41539, iM41536);
                        }
                        break;
                    case 6:
                        float fM41531 = C17732.m41531(rating);
                        if (fM41531 >= 0.0f && fM41531 <= 100.0f) {
                            c17026 = new C17026(fM41531, 6);
                        }
                        break;
                }
            }
            c17026.getClass();
        }
        return c17026;
    }
}
