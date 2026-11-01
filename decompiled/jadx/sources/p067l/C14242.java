package p067l;

import android.net.Uri;
import android.os.Parcel;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U170 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14242 implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public transient Uri f40553;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f40554;

    public C14242(Uri uri) {
        this.f40553 = uri;
        Parcel parcelObtain = Parcel.obtain();
        uri.writeToParcel(parcelObtain, 0);
        this.f40554 = parcelObtain.marshall();
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Uri m32725() {
        if (this.f40553 == null) {
            Parcel parcelObtain = Parcel.obtain();
            byte[] bArr = this.f40554;
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            this.f40553 = (Uri) Uri.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f40553;
    }

    public final String toString() {
        return this.f40553.toString();
    }
}
