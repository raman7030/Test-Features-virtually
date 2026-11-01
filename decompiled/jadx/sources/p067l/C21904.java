package p067l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21904 {

    /* JADX INFO: renamed from: ֫ */
    public int f68912 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f68913;

    public C21904(ArrayList arrayList) {
        this.f68913 = arrayList;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m49445() {
        return this.f68912 < this.f68913.size();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C7325 m49446() {
        if (!m49445()) {
            throw new NoSuchElementException();
        }
        int i = this.f68912;
        this.f68912 = i + 1;
        return (C7325) this.f68913.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m49444() {
        return new ArrayList(this.f68913);
    }
}
