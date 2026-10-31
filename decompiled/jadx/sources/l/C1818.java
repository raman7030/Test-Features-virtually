package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1818 extends AbstractC5366 implements Iterable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f6244;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f6245;

    public C1818() {
        throw null;
    }

    public C1818(ArrayList arrayList, byte[] bArr) {
        super(AbstractC11716.f34964);
        this.f6244 = arrayList;
        this.f6245 = bArr;
    }

    public C1818(ArrayList arrayList) {
        super(AbstractC11716.f34964);
        this.f6244 = arrayList;
    }

    @Override // l.AbstractC5366
    public final Object getValue() {
        return new ArrayList(this.f6244);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f6244).iterator();
    }

    public final AbstractC5366 get(int i) {
        return (AbstractC5366) this.f6244.get(i);
    }
}
