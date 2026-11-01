package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.۫ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes3.dex */
public final class C14132 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24190 f40125;

    public C14132(C24190 c24190) {
        this.f40125 = c24190;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C24190 c24190 = this.f40125;
            if (i < c24190.f76679) {
                if (c24190.f76682.f44184) {
                    return new C8097(c24190, (i * c24190.f76680) + c24190.f76681);
                }
                return new C12121(c24190, (i * c24190.f76680) + c24190.f76681);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40125.f76679;
    }
}
