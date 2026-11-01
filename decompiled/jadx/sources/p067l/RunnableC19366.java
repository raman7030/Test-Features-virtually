package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC19366 extends C16012 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC19740 f57814;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C21378 f57815;

    /* JADX INFO: renamed from: ۫ */
    public final AbstractC7783 f57816;

    /* JADX INFO: renamed from: ۬ */
    public final C4848 f57817;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC19366(C21378 c21378, AbstractC7783 abstractC7783, C4848 c4848) {
        this.f57815 = c21378;
        AbstractC7783 abstractC7784 = c21378.f67402;
        super(c21378, abstractC7784.f20405 == EnumC3600.f7343 ? abstractC7784.m17990() : (C15828) abstractC7784);
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            AbstractC7783 abstractC7785 = abstractC7783.f20407;
            if (abstractC7785.f20405 == EnumC3600.f7340) {
                this.f57816 = abstractC7785;
            } else {
                this.f57816 = abstractC7783;
            }
        } else {
            this.f57816 = abstractC7783;
        }
        this.f57817 = c4848;
        this.f57814 = c21378.f67397;
    }

    public void run() {
        AbstractC7783 abstractC7783;
        C21378 c21378 = this.f57815;
        InterfaceC19740 interfaceC19740 = c21378.f67397;
        C22004 c22004 = c21378.f67412;
        try {
            c21378.f67397 = this.f57814;
            C20271 c20271 = new C20271();
            for (C4848 c4848 = this.f57817; c4848.m10293(); c4848 = c4848.f11035) {
                c20271.m45777(m36391((C4614) c4848.f11034));
            }
            C4848 c4848M45783 = c20271.m45783();
            Iterator it = c4848M45783.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                abstractC7783 = this.f57816;
                if (!zHasNext) {
                    break;
                }
                C17939 c17939 = (C17939) it.next();
                if (c17939.f29256.f16705 == c22004.f69130.f16705) {
                    abstractC7783.f20409 |= 18014398509613056L;
                    AbstractC10564 abstractC10564M40797 = c17939.m40797(c21378.f67427.f21690);
                    if (abstractC10564M40797 instanceof C19281) {
                        C19281 c19281 = (C19281) abstractC10564M40797;
                        if (c19281.f29256 == c22004.f69151 && ((Integer) c19281.f57613).intValue() != 0) {
                            abstractC7783.f20409 |= 36028797018963968L;
                        }
                    }
                }
            }
            if (abstractC7783.m18007()) {
                abstractC7783.m18005(c4848M45783);
            } else {
                abstractC7783.m17985(c4848M45783);
            }
            c21378.f67397 = interfaceC19740;
        } catch (Throwable th) {
            c21378.f67397 = interfaceC19740;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader annotate ");
        AbstractC7783 abstractC7783 = this.f57816;
        sb.append(abstractC7783.f20407);
        sb.append(".");
        sb.append(abstractC7783);
        sb.append(" with ");
        sb.append(this.f57817);
        return sb.toString();
    }
}
