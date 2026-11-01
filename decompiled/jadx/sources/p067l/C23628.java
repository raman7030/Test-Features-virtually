package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23628 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5523 f75205;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ CharSequence f75206;

    public C23628(C5523 c5523, CharSequence charSequence) {
        this.f75206 = charSequence;
        this.f75205 = c5523;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C5523.m12193(this.f75205, this.f75206);
    }

    public final String toString() {
        C8876 c8876M20480 = C8876.m20480(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c8876M20480.m20483(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
