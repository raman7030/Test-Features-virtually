package p067l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BJP */
/* JADX INFO: loaded from: classes.dex */
public final class C24291 extends AbstractC9539 {
    public C24291(List list) {
        this.f26224.addAll(list);
        this.f26225 = this.f26224.size();
    }

    public C24291(AbstractC22481... abstractC22481Arr) {
        this(Arrays.asList(abstractC22481Arr));
    }

    @Override // p067l.AbstractC22481
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5092(C21199 c21199, C21199 c211910) {
        for (int i = this.f26225 - 1; i >= 0; i--) {
            if (!((AbstractC22481) this.f26224.get(i)).mo5092(c21199, c211910)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C21869.m49322(this.f26224, "");
    }
}
