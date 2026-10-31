package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8HK */
/* JADX INFO: loaded from: classes4.dex */
public final class C12161 implements InterfaceC13571 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AbstractC10232 f36277 = AbstractC10232.m25861().m25866(new C4248(6));

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f36278;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long[] f36279;

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    public C12161(List list) {
        if (list.size() == 1) {
            C12866 c12866 = (C12866) C8882.m22950((Collection) list);
            long j = c12866.f38639;
            AbstractC14545 abstractC14545 = c12866.f38636;
            long j2 = c12866.f38637;
            j = j == -9223372036854775807L ? 0L : j;
            if (j2 == -9223372036854775807L) {
                this.f36278 = AbstractC14545.of((Object) abstractC14545);
                this.f36279 = new long[]{j};
                return;
            } else {
                this.f36278 = AbstractC14545.of((Object) abstractC14545, (Object) AbstractC14545.of());
                this.f36279 = new long[]{j, j2 + j};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f36279 = jArr;
        Arrays.fill(jArr, C13132.FOREVER_NS);
        ArrayList arrayList = new ArrayList();
        AbstractC14545 abstractC14545M34731 = AbstractC14545.m34731(f36277, list);
        int i = 0;
        for (int i2 = 0; i2 < abstractC14545M34731.size(); i2++) {
            C12866 c12867 = (C12866) abstractC14545M34731.get(i2);
            long j3 = c12867.f38639;
            long j4 = c12867.f38637;
            AbstractC14545 abstractC14546 = c12867.f38636;
            j3 = j3 == -9223372036854775807L ? 0L : j3;
            long j5 = j3 + j4;
            if (i != 0) {
                int i3 = i - 1;
                long j6 = this.f36279[i3];
                if (j6 < j3) {
                    this.f36279[i] = j3;
                    arrayList.add(abstractC14546);
                    i++;
                } else if (j6 == j3 && ((AbstractC14545) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, abstractC14546);
                } else {
                    C19956.m46037("Truncating unsupported overlapping cues.");
                    this.f36279[i3] = j3;
                    arrayList.set(i3, abstractC14546);
                }
            } else {
                this.f36279[i] = j3;
                arrayList.add(abstractC14546);
                i++;
            }
            if (j4 != -9223372036854775807L) {
                this.f36279[i] = j5;
                arrayList.add(AbstractC14545.of());
                i++;
            }
        }
        this.f36278 = AbstractC14545.copyOf((Collection) arrayList);
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4659(long j) {
        int iM11012 = C3603.m11012(this.f36279, j, false);
        if (iM11012 < this.f36278.size()) {
            return iM11012;
        }
        return -1;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final int mo4658() {
        return this.f36278.size();
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫ */
    public final long mo4660(int i) {
        C22632.m50631(i < this.f36278.size());
        return this.f36279[i];
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ܽ */
    public final List mo4661(long j) {
        int iM11036 = C3603.m11036(this.f36279, j, false);
        return iM11036 == -1 ? AbstractC14545.of() : (AbstractC14545) this.f36278.get(iM11036);
    }
}
