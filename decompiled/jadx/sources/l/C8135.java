package l;

import com.alipay.sdk.m.y.l;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.۠ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8135 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f25108;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f25109;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22951 f25110;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f25111;

    public C8135() {
        throw null;
    }

    public C8135(IdentityHashMap identityHashMap, int i, C22951 c22951, long j) {
        this.f25111 = identityHashMap;
        this.f25109 = i;
        this.f25110 = c22951;
        this.f25108 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8135)) {
            return false;
        }
        C8135 c8135 = (C8135) obj;
        return this.f25109 == c8135.f25109 && this.f25108 == c8135.f25108 && C11003.equals(this.f25111, c8135.f25111) && C11003.equals(this.f25110, c8135.f25110);
    }

    public final int hashCode() {
        int i = this.f25109 * 31;
        long j = this.f25108;
        return C11003.hashCode(this.f25110) + ((C11003.hashCode(this.f25111) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25111, Integer.valueOf(this.f25109), this.f25110, Long.valueOf(this.f25108)};
        String[] strArrSplit = "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".length() == 0 ? new String[0] : "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8135.class, sb, "[");
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
    public final long m21597() {
        return this.f25108;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap m21598() {
        return this.f25111;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m21599() {
        return this.f25109;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22951 m21600() {
        return this.f25110;
    }
}
