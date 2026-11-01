package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D7S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19201 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f57388 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static C19201 m43689(ArrayList arrayList) {
        C19201 c19201 = new C19201();
        c19201.f57388.addAll(arrayList);
        return c19201;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43691(C17859 c17859) {
        this.f57388.add(c17859);
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m43692() {
        return this.f57388;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m43694() {
        return this.f57388.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43690() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f57388;
            if (i < arrayList.size()) {
                if (i != 0) {
                    sb.append('\n');
                }
                sb.append(((C17859) arrayList.get(i)).m40550());
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m43693() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f57388.iterator();
        while (it.hasNext()) {
            C21332 c21332M40552 = ((C17859) it.next()).m40552();
            if (c21332M40552 != null) {
                arrayList.add(c21332M40552);
            }
        }
        return arrayList;
    }
}
