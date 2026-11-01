package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20216 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC3451 abstractC3451 = (AbstractC3451) obj;
        AbstractC3451 abstractC3452 = (AbstractC3451) obj2;
        if (abstractC3451.m6129() != abstractC3452.m6129()) {
            return abstractC3451.m6129() ? -1 : 1;
        }
        if (abstractC3451.m6129()) {
            return abstractC3451.m6139().compareTo(abstractC3452.m6139());
        }
        if (abstractC3451.m6120() != abstractC3452.m6120()) {
            return !abstractC3451.m6120() ? -1 : 1;
        }
        if (!abstractC3451.m6120()) {
            return abstractC3451.m6139().compareTo(abstractC3452.m6139());
        }
        if (abstractC3451.m6149() != abstractC3452.m6149()) {
            return !abstractC3451.m6149() ? -1 : 1;
        }
        return abstractC3451.m6139().compareTo(abstractC3452.m6139());
    }
}
