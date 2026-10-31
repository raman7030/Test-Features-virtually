package l;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4729 extends AbstractList {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3318 f15013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f15014;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractViewOnClickListenerC12490[] f15015;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m13846(AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490) {
        int i = 0;
        for (int i2 = 0; i2 < this.f15015.length; i2++) {
            if (i2 == 2 && !this.f15014.isEmpty()) {
                int size = this.f15014.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12491 = (AbstractViewOnClickListenerC12490) this.f15014.get(i3);
                    int iMo15528 = abstractViewOnClickListenerC12491.mo15528();
                    if (iMo15528 != 0) {
                        if (abstractViewOnClickListenerC12491 == abstractViewOnClickListenerC12490) {
                            return i;
                        }
                        i += iMo15528;
                    }
                }
            }
            AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12492 = this.f15015[i2];
            int iMo15529 = abstractViewOnClickListenerC12492.mo15528();
            if (iMo15529 != 0) {
                if (abstractViewOnClickListenerC12492 == abstractViewOnClickListenerC12490) {
                    return i;
                }
                i += iMo15529;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized AbstractC17429 m13847(int i) {
        if (this.f15013.f10398.f53287 == i) {
            return this.f15013.f10398;
        }
        int size = this.f15014.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5435 c5435 = (C5435) this.f15014.get(i2);
            if (c5435.f53287 == i) {
                return c5435;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized int m13848() {
        int iMo15528;
        iMo15528 = 0;
        for (AbstractViewOnClickListenerC12490 abstractViewOnClickListenerC12490 : this.f15015) {
            iMo15528 += abstractViewOnClickListenerC12490.mo15528();
        }
        int size = this.f15014.size();
        for (int i = 0; i < size; i++) {
            iMo15528 += ((C5435) this.f15014.get(i)).mo15528();
        }
        return iMo15528;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m13849() {
        this.f15013.f10398.m40770();
        this.f15014.clear();
        C2096.m6954(new C20252(this));
    }

    public C4729(C3318 c3318) {
        this.f15013 = c3318;
        C4918 c4918 = c3318.f10392;
        C11003.requireNonNull(c4918);
        C23968 c23968 = c3318.f10398;
        C11003.requireNonNull(c23968);
        C5935 c5935 = c3318.f10393;
        C11003.requireNonNull(c5935);
        C19547 c19547 = c3318.f10396;
        C11003.requireNonNull(c19547);
        C0684 c0684 = c3318.f10400;
        C11003.requireNonNull(c0684);
        C16870 c16870 = c3318.f10391;
        C11003.requireNonNull(c16870);
        this.f15015 = new AbstractViewOnClickListenerC12490[]{c4918, c23968, c5935, c19547, c0684, c16870};
        this.f15014 = new ArrayList();
        m13849();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13845(C4729 c4729, C13900 c13900) {
        C3318 c3318 = c4729.f15013;
        C5435 c5435 = new C5435(c3318.f10389, c3318, c13900);
        c5435.m40770();
        c4729.f15014.add(c5435);
    }

    @Override // java.util.AbstractList, java.util.List
    public final synchronized AbstractViewOnClickListenerC12490 get(int i) {
        if (i >= 2) {
            int i2 = i - 2;
            if (i2 < this.f15014.size()) {
                return (AbstractViewOnClickListenerC12490) this.f15014.get(i2);
            }
            i -= this.f15014.size();
        }
        return this.f15015[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15014.size() + this.f15015.length;
    }
}
