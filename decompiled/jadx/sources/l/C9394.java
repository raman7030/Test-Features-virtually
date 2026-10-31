package l;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9394 implements InterfaceC5989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10805 f28529;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f28530 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24226(C10805 c10805) {
        this.f28530.add(c10805);
        if (this.f28529 != null) {
            return;
        }
        this.f28529 = c10805;
        c10805.m27021();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24223() {
        this.f28529 = null;
        HashSet hashSet = this.f28530;
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC4628 abstractC4628ListIterator = abstractC14545CopyOf.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            ((C10805) abstractC4628ListIterator.next()).m27022();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24224(Exception exc, boolean z) {
        this.f28529 = null;
        HashSet hashSet = this.f28530;
        AbstractC14545 abstractC14545CopyOf = AbstractC14545.copyOf((Collection) hashSet);
        hashSet.clear();
        AbstractC4628 abstractC4628ListIterator = abstractC14545CopyOf.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            ((C10805) abstractC4628ListIterator.next()).m27019(exc, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24225(C10805 c10805) {
        HashSet hashSet = this.f28530;
        hashSet.remove(c10805);
        if (this.f28529 == c10805) {
            this.f28529 = null;
            if (hashSet.isEmpty()) {
                return;
            }
            C10805 c10806 = (C10805) hashSet.iterator().next();
            this.f28529 = c10806;
            c10806.m27021();
        }
    }
}
