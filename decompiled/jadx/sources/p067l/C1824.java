package p067l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C1824 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f66597 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f66598 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m47857(Bundle bundle) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f66598;
            if (i >= arrayList.size()) {
                return;
            }
            if (C13590.m30917((Bundle) arrayList.get(i), bundle)) {
                return;
            }
            i++;
        }
    }
}
