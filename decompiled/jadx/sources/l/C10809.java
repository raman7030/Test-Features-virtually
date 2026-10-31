package l;

import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes4.dex */
public final class C10809 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f32519;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f32520;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f32521;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f32522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f32523;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f32524;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f32525;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f32526;

    public C10809(int i, int i2, int i3, int i4, float f, String str, String str2, int i5) {
        this.f32520 = i;
        this.f32525 = i2;
        this.f32519 = i3;
        this.f32522 = i4;
        this.f32523 = f;
        this.f32521 = str;
        this.f32526 = str2;
        this.f32524 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10809)) {
            return false;
        }
        C10809 c10809 = (C10809) obj;
        return this.f32520 == c10809.f32520 && this.f32525 == c10809.f32525 && this.f32519 == c10809.f32519 && this.f32522 == c10809.f32522 && this.f32524 == c10809.f32524 && this.f32523 == c10809.f32523 && C11003.equals(this.f32521, c10809.f32521) && C11003.equals(this.f32526, c10809.f32526);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f32526) + C20361.m46680((Float.floatToIntBits(this.f32523) + (((((((((this.f32520 * 31) + this.f32525) * 31) + this.f32519) * 31) + this.f32522) * 31) + this.f32524) * 31)) * 31, 31, this.f32521);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f32520), Integer.valueOf(this.f32525), Integer.valueOf(this.f32519), Integer.valueOf(this.f32522), Float.valueOf(this.f32523), this.f32521, this.f32526, Integer.valueOf(this.f32524)};
        String[] strArrSplit = "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".length() == 0 ? new String[0] : "width;height;averageBitrate;peakBitrate;frameRate;codecs;sampleMimeType;matchingOrdinal".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10809.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27024() {
        return this.f32524;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle m27025() {
        Bundle bundle = new Bundle();
        bundle.putInt("schema", 1);
        bundle.putInt("width", this.f32520);
        bundle.putInt("height", this.f32525);
        bundle.putInt("average_bitrate", this.f32519);
        bundle.putInt("peak_bitrate", this.f32522);
        bundle.putFloat("frame_rate", this.f32523);
        bundle.putString("codecs", this.f32521);
        bundle.putString("sample_mime_type", this.f32526);
        bundle.putInt("matching_ordinal", this.f32524);
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27023(C10809 c10809, C8353 c8353) {
        return c10809.f32520 == c8353.f25633 && c10809.f32525 == c8353.f25609 && c10809.f32519 == c8353.f25623 && c10809.f32522 == c8353.f25615 && Float.compare(c10809.f32523, c8353.f25596) == 0 && TextUtils.equals(c10809.f32521, c8353.f25619) && TextUtils.equals(c10809.f32526, c8353.f25614);
    }
}
