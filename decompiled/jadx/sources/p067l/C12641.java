package p067l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۧۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes4.dex */
public final class C12641 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f35495;

    /* JADX INFO: renamed from: ۜ */
    public final int f35496;

    /* JADX INFO: renamed from: ۧ */
    public final String f35497;

    /* JADX INFO: renamed from: ܳ */
    public final int f35498;

    /* JADX INFO: renamed from: ܽ */
    public final float f35499;

    /* JADX INFO: renamed from: ܿ */
    public final int f35500;

    /* JADX INFO: renamed from: ᩳ */
    public final int f35501;

    /* JADX INFO: renamed from: ᩻ */
    public final String f35502;

    public C12641(int i, int i2, int i3, int i4, float f, String str, String str2, int i5) {
        this.f35496 = i;
        this.f35501 = i2;
        this.f35495 = i3;
        this.f35498 = i4;
        this.f35499 = f;
        this.f35497 = str;
        this.f35502 = str2;
        this.f35500 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12641)) {
            return false;
        }
        C12641 c12641 = (C12641) obj;
        return this.f35496 == c12641.f35496 && this.f35501 == c12641.f35501 && this.f35495 == c12641.f35495 && this.f35498 == c12641.f35498 && this.f35500 == c12641.f35500 && this.f35499 == c12641.f35499 && C12826.equals(this.f35497, c12641.f35497) && C12826.equals(this.f35502, c12641.f35502);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f35502) + C21720.m49003((Float.floatToIntBits(this.f35499) + (((((((((this.f35496 * 31) + this.f35501) * 31) + this.f35495) * 31) + this.f35498) * 31) + this.f35500) * 31)) * 31, 31, this.f35497);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f35496), Integer.valueOf(this.f35501), Integer.valueOf(this.f35495), Integer.valueOf(this.f35498), Float.valueOf(this.f35499), this.f35497, this.f35502, Integer.valueOf(this.f35500)};
        String[] strArrSplit = "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".length() == 0 ? new String[0] : "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C12641.class, sb, "[");
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
    public final int m29069() {
        return this.f35500;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Bundle m29070() {
        Bundle bundle = new Bundle();
        bundle.putInt("schema", 1);
        bundle.putInt("width", this.f35496);
        bundle.putInt("height", this.f35501);
        bundle.putInt("average_bitrate", this.f35495);
        bundle.putInt("peak_bitrate", this.f35498);
        bundle.putFloat("frame_rate", this.f35499);
        bundle.putString("codecs", this.f35497);
        bundle.putString("sample_mime_type", this.f35502);
        bundle.putInt("matching_ordinal", this.f35500);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m29068(C12641 c12641, C10307 c10307) {
        return c12641.f35496 == c10307.f28547 && c12641.f35501 == c10307.f28523 && c12641.f35495 == c10307.f28537 && c12641.f35498 == c10307.f28529 && Float.compare(c12641.f35499, c10307.f28510) == 0 && TextUtils.equals(c12641.f35497, c10307.f28533) && TextUtils.equals(c12641.f35502, c10307.f28528);
    }
}
