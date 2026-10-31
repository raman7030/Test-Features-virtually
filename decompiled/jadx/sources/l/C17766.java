package l;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BGD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17766 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f54341;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public C17766(HashMap map) {
        this.f54341 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC13717 abstractC13717 = (AbstractC13717) obj;
        AbstractC13717 abstractC13718 = (AbstractC13717) obj2;
        HashMap map = this.f54341;
        int iIntValue = ((Integer) map.get(abstractC13718)).intValue() - ((Integer) map.get(abstractC13717)).intValue();
        return iIntValue == 0 ? abstractC13717.compareTo(abstractC13718) : iIntValue;
    }
}
