package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩺᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24482 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f77484a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C17204 f77485b;

    public C24482(C17204 c17204) {
        this.f77485b = c17204;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77484a < this.f77485b.f51208c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f77484a < this.f77485b.f51208c.size()) {
            C17204 name = this.f77485b.getName(this.f77484a);
            this.f77484a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
