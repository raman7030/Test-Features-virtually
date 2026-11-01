package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18676 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f55747 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f55748 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public String f55749;

    /* JADX INFO: renamed from: ܿ */
    public String f55750;

    /* JADX INFO: renamed from: ᩳ */
    public C18676 f55751;

    public C18676(C18676 c18676, String str, String str2) {
        this.f55751 = c18676;
        this.f55749 = str;
        this.f55750 = str2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m42502() {
        return this.f55749;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m42501() {
        return this.f55750;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m42496() {
        return C21562.unmodifiableList(this.f55747);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m42499() {
        return C21562.unmodifiableList(this.f55748);
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m42500() {
        return this.f55747;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12642 m42497(String str) {
        for (C12642 c12642 : this.f55748) {
            if (c12642.f35503.equals(str)) {
                return c12642;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42498(final Comparator comparator) {
        Comparator comparator2 = new Comparator() { // from class: l.ܽۛۡ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C18676) obj).f55749, ((C18676) obj2).f55749);
            }
        };
        ArrayList arrayList = this.f55747;
        Collections.sort(arrayList, comparator2);
        Collections.sort(this.f55748, new Comparator() { // from class: l.ᩳۛۡ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C12642) obj).f35503, ((C12642) obj2).f35503);
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C18676) arrayList.get(i)).m42498(comparator);
        }
    }
}
