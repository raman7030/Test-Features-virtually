package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1JW */
/* JADX INFO: loaded from: classes3.dex */
public final class C8202 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f25209 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21700(AbstractActivityC3346 abstractActivityC3346, int i) {
        C1146 c1146;
        ArrayList arrayList = this.f25209;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                c1146 = null;
                break;
            }
            c1146 = (C1146) it.next();
        } while (c1146.f4158 != i);
        if (c1146 == null) {
            c1146 = new C1146(i);
            arrayList.add(c1146);
        }
        if (c1146.f4159 == null) {
            c1146.f4159 = abstractActivityC3346.m10216(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m21699(int i) {
        for (C1146 c1146 : this.f25209) {
            if (c1146.f4158 == i) {
                View view = c1146.f4159;
                if (view == null) {
                    break;
                }
                c1146.f4159 = null;
                return view;
            }
        }
        return null;
    }
}
