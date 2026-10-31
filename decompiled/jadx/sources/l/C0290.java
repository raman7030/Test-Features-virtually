package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0290 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f1644;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f1645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f1646;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f1647;

    public /* synthetic */ C0290(int i, String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z);
    }

    public C0290(String str, String str2, String str3, boolean z) {
        this.f1644 = str;
        this.f1647 = str2;
        this.f1646 = str3;
        this.f1645 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0290)) {
            return false;
        }
        C0290 c0290 = (C0290) obj;
        return this.f1645 == c0290.f1645 && C11003.equals(this.f1644, c0290.f1644) && C11003.equals(this.f1647, c0290.f1647) && C11003.equals(this.f1646, c0290.f1646);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f1646) + C20361.m46680(C20361.m46680((this.f1645 ? 1231 : 1237) * 31, 31, this.f1644), 31, this.f1647);
    }

    public final String toString() {
        Object[] objArr = {this.f1644, this.f1647, this.f1646, Boolean.valueOf(this.f1645)};
        String[] strArrSplit = "pattern;search;replace;regex".length() == 0 ? new String[0] : "pattern;search;replace;regex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0290.class, sb, "[");
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
    public static C0290 m1640(C12951 c12951) {
        return new C0290(c12951.m31506(), c12951.m31506(), c12951.m31506(), c12951.readByte() != 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1645(C10130 c10130) {
        c10130.m25439(this.f1644);
        c10130.m25439(this.f1647);
        c10130.m25439(this.f1646);
        c10130.writeByte(this.f1645 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m1644() {
        String str = this.f1644;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace('\n', ' '));
        String str2 = this.f1647;
        if (!str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) str2.replace('\n', ' ')).append((CharSequence) "] > [").append((CharSequence) this.f1646.replace('\n', ' ')).append((CharSequence) "]");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), str.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), str.length(), spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
