package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6699 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23190 f20807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f20808;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f20809;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f20810;

    public C6699() {
        throw null;
    }

    public C6699(C23190 c23190, ArrayList arrayList, C8353 c8353, int i) {
        this.f20807 = c23190;
        this.f20810 = arrayList;
        this.f20809 = c8353;
        this.f20808 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6699)) {
            return false;
        }
        C6699 c6699 = (C6699) obj;
        return this.f20808 == c6699.f20808 && C11003.equals(this.f20807, c6699.f20807) && C11003.equals(this.f20810, c6699.f20810) && C11003.equals(this.f20809, c6699.f20809);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f20809) + ((C11003.hashCode(this.f20810) + ((C11003.hashCode(this.f20807) + (this.f20808 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20807, this.f20810, this.f20809, Integer.valueOf(this.f20808)};
        String[] strArrSplit = "group;supportedTrackIndices;representativeFormat;logicalIndex".length() == 0 ? new String[0] : "group;supportedTrackIndices;representativeFormat;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6699.class, sb, "[");
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
    public final C23190 m18247() {
        return this.f20807;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m18248() {
        return this.f20810;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m18249() {
        return this.f20808;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8353 m18250() {
        return this.f20809;
    }
}
