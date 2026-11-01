package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8HK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13926 implements InterfaceC15266 {

    /* JADX INFO: renamed from: ᩶ */
    public static final AbstractC12093 f39288 = AbstractC12093.m27883().m27888(new C6406(6));

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16192 f39289;

    /* JADX INFO: renamed from: ᩹ */
    public final long[] f39290;

    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    public C13926(List list) {
        if (list.size() == 1) {
            C14596 c14596 = (C14596) C10810.m24921((Collection) list);
            long j = c14596.f41683;
            AbstractC16192 abstractC16192 = c14596.f41680;
            long j2 = c14596.f41681;
            j = j == -9223372036854775807L ? 0L : j;
            if (j2 == -9223372036854775807L) {
                this.f39289 = AbstractC16192.m36873of((Object) abstractC16192);
                this.f39290 = new long[]{j};
                return;
            } else {
                this.f39289 = AbstractC16192.m36874of((Object) abstractC16192, (Object) AbstractC16192.m36872of());
                this.f39290 = new long[]{j, j2 + j};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f39290 = jArr;
        Arrays.fill(jArr, C14849.FOREVER_NS);
        ArrayList arrayList = new ArrayList();
        AbstractC16192 abstractC16192M36880 = AbstractC16192.m36880(f39288, list);
        int i = 0;
        for (int i2 = 0; i2 < abstractC16192M36880.size(); i2++) {
            C14596 c14597 = (C14596) abstractC16192M36880.get(i2);
            long j3 = c14597.f41683;
            long j4 = c14597.f41681;
            AbstractC16192 abstractC16193 = c14597.f41680;
            j3 = j3 == -9223372036854775807L ? 0L : j3;
            long j5 = j3 + j4;
            if (i != 0) {
                int i3 = i - 1;
                long j6 = this.f39290[i3];
                if (j6 < j3) {
                    this.f39290[i] = j3;
                    arrayList.add(abstractC16193);
                    i++;
                } else if (j6 == j3 && ((AbstractC16192) arrayList.get(i3)).isEmpty()) {
                    arrayList.set(i3, abstractC16193);
                } else {
                    C21334.m48351("Truncating unsupported overlapping cues.");
                    this.f39290[i3] = j3;
                    arrayList.set(i3, abstractC16193);
                }
            } else {
                this.f39290[i] = j3;
                arrayList.add(abstractC16193);
                i++;
            }
            if (j4 != -9223372036854775807L) {
                this.f39290[i] = j5;
                arrayList.add(AbstractC16192.m36872of());
                i++;
            }
        }
        this.f39289 = AbstractC16192.copyOf((Collection) arrayList);
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6891(long j) {
        int iM12988 = C5792.m12988(this.f39290, j, false);
        if (iM12988 < this.f39289.size()) {
            return iM12988;
        }
        return -1;
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final int mo6890() {
        return this.f39289.size();
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ֫ */
    public final long mo6892(int i) {
        C23877.m52957(i < this.f39289.size());
        return this.f39290[i];
    }

    @Override // p067l.InterfaceC15266
    /* JADX INFO: renamed from: ܽ */
    public final List mo6893(long j) {
        int iM13012 = C5792.m13012(this.f39290, j, false);
        return iM13012 == -1 ? AbstractC16192.m36872of() : (AbstractC16192) this.f39289.get(iM13012);
    }
}
