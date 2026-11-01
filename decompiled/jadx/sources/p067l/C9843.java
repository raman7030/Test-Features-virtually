package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98O4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9843 implements InterfaceC16803, InterfaceC22695 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC22585 f27306;

    /* JADX INFO: renamed from: ᩶ */
    public C10099 f27307;

    /* JADX INFO: renamed from: ᩸ */
    public C16658 f27308;

    /* JADX INFO: renamed from: ᩹ */
    public final Object f27309;

    public C9843(AbstractC22585 abstractC22585, Object obj) {
        this.f27306 = abstractC22585;
        this.f27307 = abstractC22585.m25806((C17474) null);
        this.f27308 = abstractC22585.m25802((C17474) null);
        this.f27309 = obj;
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23098(int i, C17474 c17474, C12782 c12782, C8758 c8758, int i2) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            c10099.getClass();
            c10099.m23563(new C7417(c10099, c12782, c8758M23091, i2));
        }
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ۧ */
    public final void mo23102(int i, C17474 c17474, C12782 c12782, C8758 c8758) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            c10099.getClass();
            c10099.m23563(new C2722(c10099, c12782, c8758M23091));
        }
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23097(int i, C17474 c17474, C12782 c12782, C8758 c8758) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            c10099.getClass();
            c10099.m23563(new C20829(c10099, c12782, c8758M23091));
        }
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23099(int i, C17474 c17474, C12782 c12782, C8758 c8758, IOException iOException, boolean z) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            c10099.getClass();
            c10099.m23563(new C20158(c10099, c12782, c8758M23091, iOException, z));
        }
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ֫ */
    public final void mo23096(int i, C17474 c17474, C8758 c8758) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            C17474 c17475 = c10099.f28019;
            c17475.getClass();
            c10099.m23563(new C24692(c10099, c17475, c8758M23091));
        }
    }

    @Override // p067l.InterfaceC16803
    /* JADX INFO: renamed from: ۧ */
    public final void mo23101(int i, C17474 c17474, C8758 c8758) {
        if (m23092(i, c17474)) {
            C10099 c10099 = this.f27307;
            C8758 c8758M23091 = m23091(c8758, c17474);
            c10099.getClass();
            c10099.m23563(new C14496(c10099, c8758M23091));
        }
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23094(int i, C17474 c17474, int i2) {
        if (m23092(i, c17474)) {
            this.f27308.m37719(i2);
        }
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23093(int i, C17474 c17474) {
        if (m23092(i, c17474)) {
            this.f27308.m37718();
        }
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ֫ */
    public final void mo23095(int i, C17474 c17474, Exception exc) {
        if (m23092(i, c17474)) {
            this.f27308.m37721(exc);
        }
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ۧ */
    public final void mo23100(int i, C17474 c17474) {
        if (m23092(i, c17474)) {
            this.f27308.m37723();
        }
    }

    @Override // p067l.InterfaceC22695
    /* JADX INFO: renamed from: ܽ */
    public final void mo23103(int i, C17474 c17474) {
        if (m23092(i, c17474)) {
            this.f27308.m37724();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m23092(int i, C17474 c17474) {
        C17474 c17474Mo11863;
        Object obj = this.f27309;
        AbstractC22585 abstractC22585 = this.f27306;
        if (c17474 != null) {
            c17474Mo11863 = abstractC22585.mo11863(obj, c17474);
            if (c17474Mo11863 == null) {
                return false;
            }
        } else {
            c17474Mo11863 = null;
        }
        int iMo50616 = abstractC22585.mo50616(i, obj);
        C10099 c10099 = this.f27307;
        if (c10099.f28020 != iMo50616 || !C12826.equals(c10099.f28019, c17474Mo11863)) {
            this.f27307 = abstractC22585.m25805(iMo50616, c17474Mo11863);
        }
        C16658 c16658 = this.f27308;
        if (c16658.f48938 == iMo50616 && C12826.equals(c16658.f48937, c17474Mo11863)) {
            return true;
        }
        this.f27308 = abstractC22585.m25801(iMo50616, c17474Mo11863);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private C8758 m23091(C8758 c8758, C17474 c17474) {
        long j = c8758.f23739;
        AbstractC22585 abstractC22585 = this.f27306;
        Object obj = this.f27309;
        long jMo50617 = abstractC22585.mo50617(j, obj);
        long j2 = c8758.f23737;
        long jMo50618 = abstractC22585.mo50617(j2, obj);
        return (jMo50617 == j && jMo50618 == j2) ? c8758 : new C8758(c8758.f23736, c8758.f23742, c8758.f23741, c8758.f23738, c8758.f23740, jMo50617, jMo50618);
    }
}
