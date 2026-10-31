package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0457 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2018;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21625 f2019;

    public C0457(C21625 c21625) {
        this.f2019 = c21625;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2018 < this.f2019.f69418;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f2018;
        this.f2018 = i + 1;
        C1163 c1163 = new C1163(this.f2019);
        if (!c1163.m3964(i)) {
            return null;
        }
        C19509 c19509 = new C19509();
        c19509.f63050 = new C15859();
        c19509.f63051 = c1163.m3963();
        c19509.f63049 = c1163.m3959();
        for (int i2 = 0; i2 < c1163.m3961(); i2++) {
            c19509.f63050.add(c1163.m3962(i2));
        }
        return c19509;
    }
}
