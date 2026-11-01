package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.᩶֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21244 implements InterfaceC2878 {

    /* JADX INFO: renamed from: ᩸ */
    public long f66777;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC16192 f66778;

    public C21244(List list, List list2) {
        int i = AbstractC16192.f47662;
        C4123 c4123 = new C4123();
        C23877.m52957(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            c4123.m18184(new C23255((InterfaceC2878) list.get(i2), (List) list2.get(i2)));
        }
        this.f66778 = c4123.m8329();
        this.f66777 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۜ */
    public final long mo4633() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            AbstractC16192 abstractC16192 = this.f66778;
            if (i >= abstractC16192.size()) {
                break;
            }
            C23255 c23255 = (C23255) abstractC16192.get(i);
            long jMo4633 = c23255.mo4633();
            if ((c23255.m51797().contains(1) || c23255.m51797().contains(2) || c23255.m51797().contains(4)) && jMo4633 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4633);
            }
            if (jMo4633 != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jMo4633);
            }
            i++;
        }
        if (jMin != C14849.FOREVER_NS) {
            this.f66777 = jMin;
            return jMin;
        }
        if (jMin2 == C14849.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        long j = this.f66777;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final long mo4634() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            AbstractC16192 abstractC16192 = this.f66778;
            if (i >= abstractC16192.size()) {
                break;
            }
            long jMo4634 = ((C23255) abstractC16192.get(i)).mo4634();
            if (jMo4634 != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo4634);
            }
            i++;
        }
        if (jMin == C14849.FOREVER_NS) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ۧ */
    public final void mo4635(long j) {
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f66778;
            if (i >= abstractC16192.size()) {
                return;
            }
            ((C23255) abstractC16192.get(i)).mo4635(j);
            i++;
        }
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4632(C13268 c13268) {
        boolean zMo4632;
        boolean z = false;
        do {
            long jMo4634 = mo4634();
            if (jMo4634 == Long.MIN_VALUE) {
                return z;
            }
            int i = 0;
            zMo4632 = false;
            while (true) {
                AbstractC16192 abstractC16192 = this.f66778;
                if (i >= abstractC16192.size()) {
                    break;
                }
                long jMo4635 = ((C23255) abstractC16192.get(i)).mo4634();
                boolean z2 = jMo4635 != Long.MIN_VALUE && jMo4635 <= c13268.f37251;
                if (jMo4635 == jMo4634 || z2) {
                    zMo4632 |= ((C23255) abstractC16192.get(i)).mo4632(c13268);
                }
                i++;
            }
            z |= zMo4632;
        } while (zMo4632);
        return z;
    }

    @Override // p067l.InterfaceC2878
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4631() {
        int i = 0;
        while (true) {
            AbstractC16192 abstractC16192 = this.f66778;
            if (i >= abstractC16192.size()) {
                return false;
            }
            if (((C23255) abstractC16192.get(i)).mo4631()) {
                return true;
            }
            i++;
        }
    }
}
