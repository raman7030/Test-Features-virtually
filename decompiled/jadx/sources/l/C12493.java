package l;

import android.net.Uri;
import android.os.Parcel;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۫ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U170 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12493 implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Uri f37530;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f37531;

    public C12493(Uri uri) {
        this.f37530 = uri;
        Parcel parcelObtain = Parcel.obtain();
        uri.writeToParcel(parcelObtain, 0);
        this.f37531 = parcelObtain.marshall();
        parcelObtain.recycle();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Uri m30660() {
        if (this.f37530 == null) {
            Parcel parcelObtain = Parcel.obtain();
            byte[] bArr = this.f37531;
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            this.f37530 = (Uri) Uri.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f37530;
    }

    public final String toString() {
        return this.f37530.toString();
    }
}
