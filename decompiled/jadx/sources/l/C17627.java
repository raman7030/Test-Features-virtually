package l;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C5QQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17627 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11631 f53856 = new C11631(10);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3432 f53855 = new C3432();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53857 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f53858 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41211(View view) {
        C3432 c3432 = this.f53855;
        if (c3432.containsKey(view)) {
            return;
        }
        c3432.put(view, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41214(View view) {
        return this.f53855.containsKey(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41212(View view, View view2) {
        C3432 c3432 = this.f53855;
        if (!c3432.containsKey(view) || !c3432.containsKey(view2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) c3432.getOrDefault(view, null);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f53856.mo16806();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c3432.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m41215(View view) {
        return (List) this.f53855.getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41217(View view) {
        C3432 c3432 = this.f53855;
        int size = c3432.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) c3432.m10498(i);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c3432.m10499(i));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m41216(View view) {
        C3432 c3432 = this.f53855;
        int size = c3432.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c3432.m10498(i);
            if (arrayList != null && arrayList.contains(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41210() {
        C3432 c3432 = this.f53855;
        int size = c3432.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c3432.m10498(i);
            if (arrayList != null) {
                arrayList.clear();
                this.f53856.mo16807(arrayList);
            }
        }
        c3432.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m41213() {
        ArrayList arrayList = this.f53857;
        arrayList.clear();
        HashSet hashSet = this.f53858;
        hashSet.clear();
        C3432 c3432 = this.f53855;
        int size = c3432.size();
        for (int i = 0; i < size; i++) {
            m41209(c3432.m10499(i), arrayList, hashSet);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41209(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f53855.getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m41209(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
