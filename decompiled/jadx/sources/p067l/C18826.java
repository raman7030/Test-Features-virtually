package p067l;

import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18826 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ BitSet f56208;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f56209;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22180 f56210;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f56211;

    public /* synthetic */ C18826(C22180 c22180, int i, int i2, BitSet bitSet) {
        this.f56210 = c22180;
        this.f56211 = i;
        this.f56209 = i2;
        this.f56208 = bitSet;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C22180 c22180 = this.f56210;
        C14645 c14645 = c22180.f70171;
        int i = this.f56211;
        return new C16143(c22180, c14645, i, this.f56209, this.f56208, i);
    }
}
