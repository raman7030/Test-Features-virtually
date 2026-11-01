package p067l;

import android.net.Uri;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I73O */
/* JADX INFO: loaded from: classes2.dex */
public final class C2442 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f3770;

    /* JADX INFO: renamed from: ۧ */
    public final Uri f3771;

    /* JADX INFO: renamed from: ܽ */
    public final String f3772;

    /* JADX INFO: renamed from: ܿ */
    public final String f3773;

    /* JADX INFO: renamed from: ᩳ */
    public final C5318 f3774;

    public C2442(String str, String str2, byte[] bArr, Uri uri, C5318 c5318) {
        this.f3772 = str;
        this.f3773 = str2;
        this.f3770 = bArr;
        this.f3771 = uri;
        this.f3774 = c5318;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2442)) {
            return false;
        }
        C2442 c2442 = (C2442) obj;
        return C12826.equals(this.f3772, c2442.f3772) && C12826.equals(this.f3773, c2442.f3773) && C12826.equals(this.f3770, c2442.f3770) && C12826.equals(this.f3771, c2442.f3771) && C12826.equals(this.f3774, c2442.f3774);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f3774) + ((C12826.hashCode(this.f3771) + ((C12826.hashCode(this.f3770) + C21720.m49003(C12826.hashCode(this.f3772) * 31, 31, this.f3773)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f3772, this.f3773, this.f3770, this.f3771, this.f3774};
        String[] strArrSplit = "identity;stableKey;body;finalUri;originalSpec".length() == 0 ? new String[0] : "identity;stableKey;body;finalUri;originalSpec".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2442.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m3429() {
        return this.f3770;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C5318 m3430() {
        return this.f3774;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Uri m3431() {
        return this.f3771;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m3432() {
        return this.f3772;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m3433() {
        return this.f3773;
    }
}
