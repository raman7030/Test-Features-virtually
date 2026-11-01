package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.۠ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10100 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f28021;

    /* JADX INFO: renamed from: ۧ */
    public final int f28022;

    /* JADX INFO: renamed from: ܽ */
    public final C24181 f28023;

    /* JADX INFO: renamed from: ᩳ */
    public final IdentityHashMap f28024;

    public C10100() {
        throw null;
    }

    public C10100(IdentityHashMap identityHashMap, int i, C24181 c24181, long j) {
        this.f28024 = identityHashMap;
        this.f28022 = i;
        this.f28023 = c24181;
        this.f28021 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10100)) {
            return false;
        }
        C10100 c10100 = (C10100) obj;
        return this.f28022 == c10100.f28022 && this.f28021 == c10100.f28021 && C12826.equals(this.f28024, c10100.f28024) && C12826.equals(this.f28023, c10100.f28023);
    }

    public final int hashCode() {
        int i = this.f28022 * 31;
        long j = this.f28021;
        return C12826.hashCode(this.f28023) + ((C12826.hashCode(this.f28024) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28024, Integer.valueOf(this.f28022), this.f28023, Long.valueOf(this.f28021)};
        String[] strArrSplit = "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".length() == 0 ? new String[0] : "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10100.class, sb, "[");
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
    public final long m23565() {
        return this.f28021;
    }

    /* JADX INFO: renamed from: ܳ */
    public final IdentityHashMap m23566() {
        return this.f28024;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m23567() {
        return this.f28022;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C24181 m23568() {
        return this.f28023;
    }
}
