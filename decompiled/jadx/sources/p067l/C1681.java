package p067l;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ܽ᩹ */
/* JADX INFO: compiled from: S6AR */
/* JADX INFO: loaded from: classes4.dex */
public final class C1681 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float fM43564 = C1717.m43564((View) obj);
        float fM43565 = C1717.m43564((View) obj2);
        if (fM43564 > fM43565) {
            return -1;
        }
        return fM43564 < fM43565 ? 1 : 0;
    }
}
