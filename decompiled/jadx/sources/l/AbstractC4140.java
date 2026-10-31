package l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4140 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f13111;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashSet f13112 = new HashSet();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18957 f13113;

    /* JADX INFO: renamed from: ֫ */
    public abstract Iterable mo8464(AbstractC19810 abstractC19810);

    public AbstractC4140(C18957 c18957, boolean z) {
        this.f13113 = c18957;
        int i = C2609.f8239;
        this.f13111 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m12422(AbstractC19810 abstractC19810, C2609 c2609) {
        if (abstractC19810 == null || !this.f13112.add(abstractC19810)) {
            return c2609;
        }
        if (this.f13111) {
            C18957 c18957 = this.f13113;
            c2609 = m12422(c18957.f59789.m17562(abstractC19810.f17560).f13890, c2609);
            Iterator it = c18957.f59789.m17510(abstractC19810.f17560).iterator();
            while (it.hasNext()) {
                c2609 = m12422(((AbstractC4308) it.next()).f13890, c2609);
            }
        }
        return c2609.m8246(mo8464(abstractC19810));
    }
}
