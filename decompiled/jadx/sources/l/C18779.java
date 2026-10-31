package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18779 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC1139 abstractC1139 = (AbstractC1139) obj;
        AbstractC1139 abstractC11310 = (AbstractC1139) obj2;
        if (abstractC1139.m3888() != abstractC11310.m3888()) {
            return abstractC1139.m3888() ? -1 : 1;
        }
        if (abstractC1139.m3888()) {
            return abstractC1139.m3898().compareTo(abstractC11310.m3898());
        }
        if (abstractC1139.m3879() != abstractC11310.m3879()) {
            return !abstractC1139.m3879() ? -1 : 1;
        }
        if (!abstractC1139.m3879()) {
            return abstractC1139.m3898().compareTo(abstractC11310.m3898());
        }
        if (abstractC1139.m3908() != abstractC11310.m3908()) {
            return !abstractC1139.m3908() ? -1 : 1;
        }
        return abstractC1139.m3898().compareTo(abstractC11310.m3898());
    }
}
