package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15164 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC20811 f46326;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f46327;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11197 f46328;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f46329;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f46330;

    public /* synthetic */ C15164(C11197 c11197, List list, boolean z, EnumC20811 enumC20811, String str, int i) {
        this(c11197, list, z, enumC20811, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15164)) {
            return false;
        }
        C15164 c15164 = (C15164) obj;
        return this.f46329 == c15164.f46329 && C11003.equals(this.f46328, c15164.f46328) && C11003.equals(this.f46330, c15164.f46330) && C11003.equals(this.f46326, c15164.f46326) && C11003.equals(this.f46327, c15164.f46327);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f46327) + ((C11003.hashCode(this.f46326) + ((C11003.hashCode(this.f46330) + ((C11003.hashCode(this.f46328) + ((this.f46329 ? 1231 : 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f46328, this.f46330, Boolean.valueOf(this.f46329), this.f46326, this.f46327};
        String[] strArrSplit = "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".length() == 0 ? new String[0] : "mediaItem;subtitleMatches;subtitleMatchesResolved;externalSubtitleMode;externalSubtitlePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C15164.class, sb, "[");
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
    public final EnumC20811 m35864() {
        return this.f46326;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m35865() {
        return this.f46330;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m35866() {
        return this.f46327;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11197 m35867() {
        return this.f46328;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m35868() {
        return this.f46329;
    }

    public C15164(C11197 c11197, List list, boolean z, EnumC20811 enumC20811, String str) {
        List listUnmodifiableList = C20195.unmodifiableList(new ArrayList(list));
        this.f46328 = c11197;
        this.f46330 = listUnmodifiableList;
        this.f46329 = z;
        this.f46326 = enumC20811;
        this.f46327 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15164 m35863(C11197 c11197, List list, boolean z) {
        return new C15164(c11197, list, z, EnumC20811.NONE, null);
    }
}
