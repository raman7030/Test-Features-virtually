package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9DK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19519 extends AbstractC7468 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final HashSet f59444;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f59445;

    public C19519() {
        throw null;
    }

    public C19519(HashSet hashSet, byte[] bArr) {
        super(AbstractC13503.f37967);
        this.f59444 = hashSet;
        this.f59445 = bArr;
    }

    @Override // p067l.AbstractC7468
    public final Object getValue() {
        return new HashSet(this.f59444);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.f59444).iterator();
    }
}
