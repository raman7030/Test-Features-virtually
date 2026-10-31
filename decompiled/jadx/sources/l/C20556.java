package l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66231 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66232;

    public C20556(ArrayList arrayList) {
        this.f66232 = arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47121() {
        return this.f66231 < this.f66232.size();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5215 m47122() {
        if (!m47121()) {
            throw new NoSuchElementException();
        }
        int i = this.f66231;
        this.f66231 = i + 1;
        return (C5215) this.f66232.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m47120() {
        return new ArrayList(this.f66232);
    }
}
