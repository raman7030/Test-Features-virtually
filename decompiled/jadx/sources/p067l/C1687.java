package p067l;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܿ֫ */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes4.dex */
public final class C1687 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1652();

    /* JADX INFO: renamed from: ᩸ */
    public final int f55380;

    /* JADX INFO: renamed from: ᩹ */
    public final float f55381;

    public C1687(float f, int i) {
        this.f55380 = i;
        this.f55381 = f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f55380);
        sb.append(" rating=");
        float f = this.f55381;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f55380;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55380);
        parcel.writeFloat(this.f55381);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1687 m42233(Rating rating) {
        float f;
        C1687 c1687 = null;
        if (rating != null) {
            int iM43781 = C1722.m43781(rating);
            if (!C1722.m43785(rating)) {
                switch (iM43781) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c1687 = new C1687(-1.0f, iM43781);
                        break;
                }
            } else {
                switch (iM43781) {
                    case 1:
                        c1687 = new C1687(C1722.m43786(rating) ? 1.0f : 0.0f, 1);
                        break;
                    case 2:
                        c1687 = new C1687(C1722.m43783(rating) ? 1.0f : 0.0f, 2);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM43784 = C1722.m43784(rating);
                        if (iM43781 == 3) {
                            f = 3.0f;
                        } else if (iM43781 == 4) {
                            f = 4.0f;
                        } else if (iM43781 == 5) {
                            f = 5.0f;
                        }
                        if (fM43784 >= 0.0f && fM43784 <= f) {
                            c1687 = new C1687(fM43784, iM43781);
                        }
                        break;
                    case 6:
                        float fM43776 = C1722.m43776(rating);
                        if (fM43776 >= 0.0f && fM43776 <= 100.0f) {
                            c1687 = new C1687(fM43776, 6);
                        }
                        break;
                }
            }
            c1687.getClass();
        }
        return c1687;
    }
}
