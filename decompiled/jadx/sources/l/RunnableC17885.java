package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public class RunnableC17885 extends C14356 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 f54617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f54618;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f54619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2609 f54620;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Illegal instructions before constructor call */
    public RunnableC17885(C20002 c20002, AbstractC5698 abstractC5698, C2609 c2609) {
        this.f54618 = c20002;
        AbstractC5698 abstractC5699 = c20002.f64760;
        super(c20002, abstractC5699.f17559 == EnumC1296.f4571 ? abstractC5699.m16071() : (C14163) abstractC5699);
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            AbstractC5698 abstractC56910 = abstractC5698.f17561;
            if (abstractC56910.f17559 == EnumC1296.f4568) {
                this.f54619 = abstractC56910;
            } else {
                this.f54619 = abstractC5698;
            }
        } else {
            this.f54619 = abstractC5698;
        }
        this.f54620 = c2609;
        this.f54617 = c20002.f64755;
    }

    public void run() {
        AbstractC5698 abstractC5698;
        C20002 c20002 = this.f54618;
        InterfaceC18278 interfaceC18278 = c20002.f64755;
        C20661 c20661 = c20002.f64770;
        try {
            c20002.f64755 = this.f54617;
            C18837 c18837 = new C18837();
            for (C2609 c2609 = this.f54620; c2609.m8249(); c2609 = c2609.f8241) {
                c18837.m43511(m34258((C2363) c2609.f8240));
            }
            C2609 c2609M43517 = c18837.m43517();
            Iterator it = c2609M43517.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                abstractC5698 = this.f54619;
                if (!zHasNext) {
                    break;
                }
                C16384 c16384 = (C16384) it.next();
                if (c16384.f26338.f13890 == c20661.f66448.f13890) {
                    abstractC5698.f17563 |= 18014398509613056L;
                    AbstractC8624 abstractC8624M38580 = c16384.m38580(c20002.f64785.f18832);
                    if (abstractC8624M38580 instanceof C17796) {
                        C17796 c17796 = (C17796) abstractC8624M38580;
                        if (c17796.f26338 == c20661.f66469 && ((Integer) c17796.f54417).intValue() != 0) {
                            abstractC5698.f17563 |= 36028797018963968L;
                        }
                    }
                }
            }
            if (abstractC5698.m16088()) {
                abstractC5698.m16086(c2609M43517);
            } else {
                abstractC5698.m16066(c2609M43517);
            }
            c20002.f64755 = interfaceC18278;
        } catch (Throwable th) {
            c20002.f64755 = interfaceC18278;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" ClassReader annotate ");
        AbstractC5698 abstractC5698 = this.f54619;
        sb.append(abstractC5698.f17561);
        sb.append(".");
        sb.append(abstractC5698);
        sb.append(" with ");
        sb.append(this.f54620);
        return sb.toString();
    }
}
