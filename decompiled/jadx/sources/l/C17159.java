package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17159 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f52564 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f52565 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f52566;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f52567;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17159 f52568;

    public C17159(C17159 c17159, String str, String str2) {
        this.f52568 = c17159;
        this.f52566 = str;
        this.f52567 = str2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m40257() {
        return this.f52566;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m40256() {
        return this.f52567;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m40251() {
        return C20195.unmodifiableList(this.f52564);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m40254() {
        return C20195.unmodifiableList(this.f52565);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m40255() {
        return this.f52564;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10810 m40252(String str) {
        for (C10810 c10810 : this.f52565) {
            if (c10810.f32527.equals(str)) {
                return c10810;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40253(final Comparator comparator) {
        Comparator comparator2 = new Comparator() { // from class: l.ܽۛۡ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C17159) obj).f52566, ((C17159) obj2).f52566);
            }
        };
        ArrayList arrayList = this.f52564;
        Collections.sort(arrayList, comparator2);
        Collections.sort(this.f52565, new Comparator() { // from class: l.ᩳۛۡ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return comparator.compare(((C10810) obj).f32527, ((C10810) obj2).f32527);
            }
        });
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C17159) arrayList.get(i)).m40253(comparator);
        }
    }
}
