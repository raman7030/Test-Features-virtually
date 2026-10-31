package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C0424 extends C14190 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f1890;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashSet f1889 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1887 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f1888 = false;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        mo10758(c6262.f19397);
        m1964(c6262.f19396, c6262);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1964(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        if (abstractC5698 != null) {
            EnumC1296 enumC1296 = abstractC5698.f17559;
            EnumC1296 enumC1297 = EnumC1296.f4582;
            if (enumC1296 == enumC1297) {
                C15240 c15240 = this.f1890;
                C1755 c1755M39519 = c15240.f46778.f41160.m39519((AbstractC19810) abstractC5698);
                if (c1755M39519 != null) {
                    C14397 c14397M7266 = c15240.f46757.m7266();
                    try {
                        c15240.f46757.m7284(c1755M39519.f6075.f4745);
                        mo10758(c1755M39519.f6074);
                        return;
                    } finally {
                        c15240.f46757.m7284(c14397M7266.m34390());
                    }
                }
                if (abstractC5698.f17559 == enumC1297) {
                    m1965(abstractC5698, abstractC5144, C2609.m8239());
                    return;
                }
                return;
            }
        }
        if (abstractC5698 == null || abstractC5698.f17559 != EnumC1296.f4579) {
            this.f1888 = true;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        m1964(c7673.f23697, c7673);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        mo10758(c16432.f50542);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1429(C23901 c23901) {
        mo10758(c23901.f77274);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C2609 c2609M8239 = C2609.m8239();
        AbstractC12612 abstractC12612 = c5557.f17184;
        if (abstractC12612 != null) {
            c2609M8239 = c2609M8239.m8246(abstractC12612);
        }
        C2609 c2609 = c5557.f17183;
        if (c2609 != null) {
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                c2609M8239 = c2609M8239.m8246((AbstractC5144) it.next());
            }
        }
        m1965(c5557.f17186, c5557, c2609M8239);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1965(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144, C2609 c2609) {
        if ((abstractC5698.f17563 & 1073741824) != 0) {
            return;
        }
        HashSet hashSet = this.f1889;
        if (hashSet.contains(abstractC5698)) {
            this.f1887 = true;
            this.f1890.m36091((C14163) abstractC5698, (InterfaceC3109) abstractC5144);
            return;
        }
        if (abstractC5698.f17560.mo12948()) {
            return;
        }
        try {
            hashSet.add(abstractC5698);
            if (abstractC5698.f17560.m12913(EnumC9454.CLASS)) {
                if (c2609.m8249()) {
                    m33860(c2609);
                } else {
                    C19955 c19955 = (C19955) abstractC5698.f17560;
                    AbstractC4308 abstractC4308 = c19955.f64618;
                    if (abstractC4308 != null && c19955.f64620 != null) {
                        m1964(abstractC4308.f13890, abstractC5144);
                        Iterator it = c19955.f64620.iterator();
                        while (it.hasNext()) {
                            m1964(((AbstractC4308) it.next()).f13890, abstractC5144);
                        }
                    }
                    this.f1888 = true;
                    return;
                }
                AbstractC5698 abstractC5699 = abstractC5698.f17561;
                if (abstractC5699.f17559 == EnumC1296.f4582) {
                    m1964(abstractC5699, abstractC5144);
                }
            }
        } finally {
            hashSet.remove(abstractC5698);
        }
    }

    public C0424(C15240 c15240) {
        this.f1890 = c15240;
    }
}
