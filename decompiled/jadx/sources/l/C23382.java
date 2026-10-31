package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8FO */
/* JADX INFO: loaded from: classes.dex */
public final class C23382 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f75123;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f75124;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f75125;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f75126;

    public C23382(C6449 c6449, String str, String str2, List list, String str3) {
        this.f75123 = c6449.m17809(str);
        this.f75124 = c6449.m17809(str2);
        this.f75125 = new int[list.size()];
        this.f75126 = c6449.m17809(str3);
        for (int i = 0; i < list.size(); i++) {
            this.f75125[i] = c6449.m17809(((CharSequence) list.get(i)).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23382.class == obj.getClass()) {
            C23382 c23382 = (C23382) obj;
            if (this.f75123 == c23382.f75123 && this.f75124 == c23382.f75124 && this.f75126 == c23382.f75126 && Arrays.equals(this.f75125, c23382.f75125)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f75125) + (((this.f75123 * 31) + this.f75124) * 31)) * 31) + this.f75126;
    }
}
