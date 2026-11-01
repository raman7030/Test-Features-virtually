package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10166 extends AbstractC10818 {

    /* JADX INFO: renamed from: ۙ */
    public final C14645 f28124;

    /* JADX INFO: renamed from: ᩶ */
    public int f28125 = -1;

    /* JADX INFO: renamed from: ᩸ */
    public final int f28126;

    /* JADX INFO: renamed from: ᩹ */
    public final int f28127;

    public C10166(C14645 c14645, int i) {
        this.f28124 = c14645;
        this.f28127 = i;
        C3460 c3460M33503 = c14645.m33503(7);
        if (c3460M33503 != null && i < c3460M33503.m6187()) {
            this.f28126 = (i * 4) + c3460M33503.m6188();
            return;
        }
        throw new C6599(null, "Call site index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC6227
    public final String getName() {
        return String.format("call_site_%d", Integer.valueOf(this.f28127));
    }

    @Override // p067l.InterfaceC6227
    public final int getIndex() {
        return this.f28127;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC20980 mo14105() {
        if (m23671().mo24527() < 3) {
            throw new C17034(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        InterfaceC12262 interfaceC12262Mo24528 = m23671().mo24528();
        if (interfaceC12262Mo24528.mo4670() != 22) {
            throw new C17034(null, "Invalid encoded value type (%d) for the first item in call site %d", Integer.valueOf(interfaceC12262Mo24528.mo4670()), Integer.valueOf(this.f28127));
        }
        return ((InterfaceC12973) interfaceC12262Mo24528).getValue();
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۢ */
    public final List mo14102() {
        ArrayList arrayList = new ArrayList();
        AbstractC17366 abstractC17366M23671 = m23671();
        if (abstractC17366M23671.mo24527() < 3) {
            throw new C17034(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        if (abstractC17366M23671.mo24527() != 3) {
            abstractC17366M23671.mo24530();
            abstractC17366M23671.mo24530();
            abstractC17366M23671.mo24530();
            for (InterfaceC12262 interfaceC12262Mo24528 = abstractC17366M23671.mo24528(); interfaceC12262Mo24528 != null; interfaceC12262Mo24528 = abstractC17366M23671.mo24528()) {
                arrayList.add(interfaceC12262Mo24528);
            }
        }
        return arrayList;
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ܺ */
    public final String mo14104() {
        AbstractC17366 abstractC17366M23671 = m23671();
        if (abstractC17366M23671.mo24527() < 3) {
            throw new C17034(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC17366M23671.mo24530();
        InterfaceC12262 interfaceC12262Mo24528 = abstractC17366M23671.mo24528();
        if (interfaceC12262Mo24528.mo4670() != 23) {
            throw new C17034(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC12262Mo24528.mo4670()), Integer.valueOf(this.f28127));
        }
        return ((InterfaceC19007) interfaceC12262Mo24528).getValue();
    }

    @Override // p067l.InterfaceC6227
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2873 mo14103() {
        AbstractC17366 abstractC17366M23671 = m23671();
        if (abstractC17366M23671.mo24527() < 3) {
            throw new C17034(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC17366M23671.mo24530();
        abstractC17366M23671.mo24530();
        InterfaceC12262 interfaceC12262Mo24528 = abstractC17366M23671.mo24528();
        if (interfaceC12262Mo24528.mo4670() != 21) {
            throw new C17034(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC12262Mo24528.mo4670()), Integer.valueOf(this.f28127));
        }
        return ((InterfaceC18336) interfaceC12262Mo24528).getValue();
    }

    /* JADX INFO: renamed from: ֡ */
    private AbstractC17366 m23671() {
        int i = this.f28125;
        C14645 c14645 = this.f28124;
        if (i < 0) {
            this.f28125 = c14645.m33504().mo13855(this.f28126);
        }
        return AbstractC17366.m39361(c14645, this.f28125);
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f28127;
        if (i >= 0) {
            C3460 c3460M33503 = this.f28124.m33503(7);
            if (i < (c3460M33503 == null ? 0 : c3460M33503.m6187())) {
                return;
            }
        }
        throw new C3544("callsite@" + i);
    }
}
