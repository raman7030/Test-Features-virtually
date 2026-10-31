package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4243 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f13755;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f13756;

    public C4243(ViewGroup viewGroup) {
        this.f13755 = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13756 < this.f13755.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f13756;
        this.f13756 = i + 1;
        View childAt = this.f13755.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f13756 - 1;
        this.f13756 = i;
        this.f13755.removeViewAt(i);
    }
}
