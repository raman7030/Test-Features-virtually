package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23267 implements Iterator {
    public int a = 0;
    public final /* synthetic */ C15610 b;

    public C23267(C15610 c15610) {
        this.b = c15610;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a < this.b.c.size()) {
            C15610 name = this.b.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
