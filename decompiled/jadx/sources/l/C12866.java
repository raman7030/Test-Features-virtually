package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12866 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f38636;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38637;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f38638;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f38639;

    public C12866(long j, long j2, List list) {
        this.f38636 = AbstractC14545.copyOf((Collection) list);
        this.f38639 = j;
        this.f38637 = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f38638 = j3;
    }
}
