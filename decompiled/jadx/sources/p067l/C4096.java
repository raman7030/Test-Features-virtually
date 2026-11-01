package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9KH */
/* JADX INFO: loaded from: classes2.dex */
public final class C4096 extends AbstractC7468 implements Iterable {

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f9024;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f9025;

    public C4096() {
        throw null;
    }

    public C4096(ArrayList arrayList, byte[] bArr) {
        super(AbstractC13503.f37964);
        this.f9024 = arrayList;
        this.f9025 = bArr;
    }

    public C4096(ArrayList arrayList) {
        super(AbstractC13503.f37964);
        this.f9024 = arrayList;
    }

    @Override // p067l.AbstractC7468
    public final Object getValue() {
        return new ArrayList(this.f9024);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f9024).iterator();
    }

    public final AbstractC7468 get(int i) {
        return (AbstractC7468) this.f9024.get(i);
    }
}
