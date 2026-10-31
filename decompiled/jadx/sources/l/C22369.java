package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22369 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3319 f72479;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f72480;

    public C22369(C3319 c3319, CharSequence charSequence) {
        this.f72480 = charSequence;
        this.f72479 = c3319;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C3319.m10157(this.f72479, this.f72480);
    }

    public final String toString() {
        C6847 c6847M18531 = C6847.m18531(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        c6847M18531.m18534(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
