package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16939 extends AbstractC7553 {

    /* JADX INFO: renamed from: ֫ */
    public final List f50114;

    /* JADX INFO: renamed from: ۧ */
    public final long f50115;

    /* JADX INFO: renamed from: ܽ */
    public final long f50116;

    public C16939(long j, long j2, List list) {
        this.f50116 = j;
        this.f50115 = j2;
        this.f50114 = C21562.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫ */
    public static C16939 m38520(C19203 c19203, long j, C11157 c11157) {
        ?? r5;
        long j2;
        c19203.m43725();
        boolean z = (c19203.m43702() & 128) != 0;
        ?? arrayList = Collections.EMPTY_LIST;
        if (z) {
            r5 = arrayList;
            j2 = -9223372036854775807L;
        } else {
            int iM43702 = c19203.m43702();
            boolean z2 = (iM43702 & 64) != 0;
            boolean z3 = (iM43702 & 32) != 0;
            boolean z4 = (iM43702 & 16) != 0;
            long jM12230 = (!z2 || z4) ? -9223372036854775807L : C5541.m12230(j, c19203);
            if (!z2) {
                int iM43703 = c19203.m43702();
                arrayList = new ArrayList(iM43703);
                for (int i = 0; i < iM43703; i++) {
                    c19203.m43702();
                    c11157.m25735(!z4 ? C5541.m12230(j, c19203) : -9223372036854775807L);
                    arrayList.add(new C10235());
                }
            }
            if (z3) {
                c19203.m43702();
                c19203.m43725();
            }
            c19203.m43710();
            c19203.m43702();
            c19203.m43702();
            r5 = arrayList;
            j2 = jM12230;
        }
        return new C16939(j2, c11157.m25735(j2), r5);
    }

    @Override // p067l.AbstractC7553
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f50116);
        sb.append(", programSplicePlaybackPositionUs= ");
        return C17520.m39893(sb, this.f50115, " }");
    }
}
