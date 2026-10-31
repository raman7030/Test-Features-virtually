package l;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public final class C19807 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63960 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63961 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45546(Bundle bundle) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f63961;
            if (i >= arrayList.size()) {
                return;
            }
            if (C11807.m28868((Bundle) arrayList.get(i), bundle)) {
                return;
            }
            i++;
        }
    }
}
