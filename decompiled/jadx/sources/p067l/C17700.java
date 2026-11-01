package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 590L */
/* JADX INFO: loaded from: classes4.dex */
public final class C17700 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f52864;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f52865;

    /* JADX INFO: renamed from: ܳ */
    public final int f52866;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f52867;

    /* JADX INFO: renamed from: ܿ */
    public C17700 f52868;

    /* JADX INFO: renamed from: ᩳ */
    public final char f52869;

    /* JADX INFO: renamed from: ᩻ */
    public C17700 f52870;

    public C17700(ArrayList arrayList, char c, boolean z, boolean z2, C17700 c17700) {
        this.f52867 = arrayList;
        this.f52869 = c;
        this.f52865 = z;
        this.f52864 = z2;
        this.f52870 = c17700;
        this.f52866 = arrayList.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40234() {
        return this.f52865;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40232() {
        return this.f52864;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40236() {
        return this.f52866;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C14625 m40235() {
        return (C14625) C20013.m45383(this.f52867, 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m40233(int i) {
        ArrayList arrayList = this.f52867;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(arrayList.size() - i, arrayList.size());
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m40231(int i) {
        ArrayList arrayList = this.f52867;
        if (i < 1 || i > arrayList.size()) {
            throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i);
        }
        return arrayList.subList(0, i);
    }
}
