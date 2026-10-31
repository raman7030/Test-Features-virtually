package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8SJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15331 extends AbstractC5455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f46988;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f46989;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f46990;

    public C15331(long j, long j2, List list) {
        this.f46990 = j;
        this.f46989 = j2;
        this.f46988 = C20195.unmodifiableList(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15331 m36362(C17714 c17714, long j, C9248 c9248) {
        ?? r5;
        long j2;
        c17714.m41479();
        boolean z = (c17714.m41456() & 128) != 0;
        ?? arrayList = Collections.EMPTY_LIST;
        if (z) {
            r5 = arrayList;
            j2 = -9223372036854775807L;
        } else {
            int iM41456 = c17714.m41456();
            boolean z2 = (iM41456 & 64) != 0;
            boolean z3 = (iM41456 & 32) != 0;
            boolean z4 = (iM41456 & 16) != 0;
            long jM10194 = (!z2 || z4) ? -9223372036854775807L : C3338.m10194(j, c17714);
            if (!z2) {
                int iM41457 = c17714.m41456();
                arrayList = new ArrayList(iM41457);
                for (int i = 0; i < iM41457; i++) {
                    c17714.m41456();
                    c9248.m23734(!z4 ? C3338.m10194(j, c17714) : -9223372036854775807L);
                    arrayList.add(new C8277());
                }
            }
            if (z3) {
                c17714.m41456();
                c17714.m41479();
            }
            c17714.m41464();
            c17714.m41456();
            c17714.m41456();
            r5 = arrayList;
            j2 = jM10194;
        }
        return new C15331(j2, c9248.m23734(j2), r5);
    }

    @Override // l.AbstractC5455
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f46990);
        sb.append(", programSplicePlaybackPositionUs= ");
        return C15942.m37718(sb, this.f46989, " }");
    }
}
