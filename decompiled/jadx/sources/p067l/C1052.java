package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩺ */
/* JADX INFO: compiled from: E9O4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1052 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewGroup f16572;

    /* JADX INFO: renamed from: ᩹ */
    public int f16573;

    public C1052(ViewGroup viewGroup) {
        this.f16572 = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16573 < this.f16572.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f16573;
        this.f16573 = i + 1;
        View childAt = this.f16572.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f16573 - 1;
        this.f16573 = i;
        this.f16572.removeViewAt(i);
    }
}
