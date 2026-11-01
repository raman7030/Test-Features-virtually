package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes3.dex */
public final class C2771 extends C15854 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16852 f4666;

    /* JADX INFO: renamed from: ܽ */
    public HashSet f4665 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public boolean f4663 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f4664 = false;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        mo12739(c8320.f22261);
        m4340(c8320.f22260, c8320);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4340(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257) {
        if (abstractC7783 != null) {
            EnumC3600 enumC3600 = abstractC7783.f20405;
            EnumC3600 enumC3601 = EnumC3600.f7354;
            if (enumC3600 == enumC3601) {
                C16852 c16852 = this.f4666;
                C4036 c4036M41755 = c16852.f49902.f44238.m41755((AbstractC21195) abstractC7783);
                if (c4036M41755 != null) {
                    C16051 c16051M9345 = c16852.f49881.m9345();
                    try {
                        c16852.f49881.m9363(c4036M41755.f8851.f7516);
                        mo12739(c4036M41755.f8850);
                        return;
                    } finally {
                        c16852.f49881.m9363(c16051M9345.m36524());
                    }
                }
                if (abstractC7783.f20405 == enumC3601) {
                    m4341(abstractC7783, abstractC7257, C4848.m10283());
                    return;
                }
                return;
            }
        }
        if (abstractC7783 == null || abstractC7783.f20405 != EnumC3600.f7351) {
            this.f4664 = true;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        m4340(c9661.f26611, c9661);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        mo12739(c17985.f53722);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3842(C25084 c25084) {
        mo12739(c25084.f80025);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C4848 c4848M10283 = C4848.m10283();
        AbstractC14355 abstractC14355 = c7650.f20025;
        if (abstractC14355 != null) {
            c4848M10283 = c4848M10283.m10290(abstractC14355);
        }
        C4848 c4848 = c7650.f20024;
        if (c4848 != null) {
            Iterator it = c4848.iterator();
            while (it.hasNext()) {
                c4848M10283 = c4848M10283.m10290((AbstractC7257) it.next());
            }
        }
        m4341(c7650.f20027, c7650, c4848M10283);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4341(AbstractC7783 abstractC7783, AbstractC7257 abstractC7257, C4848 c4848) {
        if ((abstractC7783.f20409 & 1073741824) != 0) {
            return;
        }
        HashSet hashSet = this.f4665;
        if (hashSet.contains(abstractC7783)) {
            this.f4663 = true;
            this.f4666.m38252((C15828) abstractC7783, (InterfaceC5323) abstractC7257);
            return;
        }
        if (abstractC7783.f20406.mo14812()) {
            return;
        }
        try {
            hashSet.add(abstractC7783);
            if (abstractC7783.f20406.m14777(EnumC11353.CLASS)) {
                if (c4848.m10293()) {
                    m35992(c4848);
                } else {
                    C21333 c21333 = (C21333) abstractC7783.f20406;
                    AbstractC6462 abstractC6462 = c21333.f67259;
                    if (abstractC6462 != null && c21333.f67261 != null) {
                        m4340(abstractC6462.f16705, abstractC7257);
                        Iterator it = c21333.f67261.iterator();
                        while (it.hasNext()) {
                            m4340(((AbstractC6462) it.next()).f16705, abstractC7257);
                        }
                    }
                    this.f4664 = true;
                    return;
                }
                AbstractC7783 abstractC7784 = abstractC7783.f20407;
                if (abstractC7784.f20405 == EnumC3600.f7354) {
                    m4340(abstractC7784, abstractC7257);
                }
            }
        } finally {
            hashSet.remove(abstractC7783);
        }
    }

    public C2771(C16852 c16852) {
        this.f4666 = c16852;
    }
}
