package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17341 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53112 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14518 f53113;

    public C17341(C14518 c14518) {
        this.f53113 = c14518;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53112 < this.f53113.f44501;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C14518 c14518 = this.f53113;
        String[] strArr = c14518.f44499;
        int i = this.f53112;
        String str = strArr[i];
        String str2 = c14518.f44500[i];
        if (str == null) {
            str = "";
        }
        C18047 c18047 = new C18047(str2, str, c14518);
        this.f53112++;
        return c18047;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f53112 - 1;
        this.f53112 = i;
        C14518.m34669(this.f53113, i);
    }
}
