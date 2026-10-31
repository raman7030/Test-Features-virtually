package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BJP */
/* JADX INFO: loaded from: classes.dex */
public final class C23067 extends AbstractC7545 {
    public C23067(List list) {
        this.f23311.addAll(list);
        this.f23312 = this.f23311.size();
    }

    public C23067(AbstractC21162... abstractC21162Arr) {
        this(Arrays.asList(abstractC21162Arr));
    }

    @Override // l.AbstractC21162
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2753(C19814 c19814, C19814 c19815) {
        for (int i = this.f23312 - 1; i >= 0; i--) {
            if (!((AbstractC21162) this.f23311.get(i)).mo2753(c19814, c19815)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C20519.m46999(this.f23311, "");
    }
}
