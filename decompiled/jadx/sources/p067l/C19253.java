package p067l;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BGD */
/* JADX INFO: loaded from: classes4.dex */
public final class C19253 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ HashMap f57535;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj == this;
    }

    public C19253(HashMap map) {
        this.f57535 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC15405 abstractC15405 = (AbstractC15405) obj;
        AbstractC15405 abstractC15406 = (AbstractC15405) obj2;
        HashMap map = this.f57535;
        int iIntValue = ((Integer) map.get(abstractC15406)).intValue() - ((Integer) map.get(abstractC15405)).intValue();
        return iIntValue == 0 ? abstractC15405.compareTo(abstractC15406) : iIntValue;
    }
}
