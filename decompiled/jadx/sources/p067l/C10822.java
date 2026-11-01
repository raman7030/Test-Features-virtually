package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10822 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final String f29987;

    public C10822(String str) {
        this.f29987 = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C11493(this);
    }
}
