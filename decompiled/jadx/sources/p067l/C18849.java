package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C18849 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f56296 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C16166 f56297;

    public C18849(C16166 c16166) {
        this.f56297 = c16166;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56296 < this.f56297.f47607;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C16166 c16166 = this.f56297;
        String[] strArr = c16166.f47605;
        int i = this.f56296;
        String str = strArr[i];
        String str2 = c16166.f47606[i];
        if (str == null) {
            str = "";
        }
        C19520 c19520 = new C19520(str2, str, c16166);
        this.f56296++;
        return c19520;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f56296 - 1;
        this.f56296 = i;
        C16166.m36811(this.f56297, i);
    }
}
