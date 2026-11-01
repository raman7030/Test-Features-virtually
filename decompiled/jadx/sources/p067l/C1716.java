package p067l;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩹ */
/* JADX INFO: compiled from: C5QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1716 {

    /* JADX INFO: renamed from: ۧ */
    public final C1419 f57049 = new C1419(10);

    /* JADX INFO: renamed from: ֫ */
    public final C1012 f57048 = new C1012();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f57050 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public final HashSet f57051 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final void m43457(View view) {
        C1012 c1012 = this.f57048;
        if (c1012.containsKey(view)) {
            return;
        }
        c1012.put(view, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m43460(View view) {
        return this.f57048.containsKey(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43458(View view, View view2) {
        C1012 c1012 = this.f57048;
        if (!c1012.containsKey(view) || !c1012.containsKey(view2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) c1012.getOrDefault(view, null);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f57049.mo18732();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c1012.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m43461(View view) {
        return (List) this.f57048.getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m43463(View view) {
        C1012 c1012 = this.f57048;
        int size = c1012.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) c1012.m12521(i);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1012.m12522(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m43462(View view) {
        C1012 c1012 = this.f57048;
        int size = c1012.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c1012.m12521(i);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43456() {
        C1012 c1012 = this.f57048;
        int size = c1012.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c1012.m12521(i);
            if (arrayList != null) {
                arrayList.clear();
                this.f57049.mo18733(arrayList);
            }
        }
        c1012.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m43459() {
        ArrayList arrayList = this.f57050;
        arrayList.clear();
        HashSet hashSet = this.f57051;
        hashSet.clear();
        C1012 c1012 = this.f57048;
        int size = c1012.size();
        for (int i = 0; i < size; i++) {
            m43455(c1012.m12522(i), arrayList, hashSet);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43455(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f57048.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m43455(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
