package p067l;

import java.util.AbstractList;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C6863 extends AbstractList {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C5522 f17844;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f17845;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractViewOnClickListenerC14239[] f17846;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m15726(AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239) {
        int i = 0;
        for (int i2 = 0; i2 < this.f17846.length; i2++) {
            if (i2 == 2 && !this.f17845.isEmpty()) {
                int size = this.f17845.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC142310 = (AbstractViewOnClickListenerC14239) this.f17845.get(i3);
                    int iMo17439 = abstractViewOnClickListenerC142310.mo17439();
                    if (iMo17439 != 0) {
                        if (abstractViewOnClickListenerC142310 == abstractViewOnClickListenerC14239) {
                            return i;
                        }
                        i += iMo17439;
                    }
                }
            }
            AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC142311 = this.f17846[i2];
            int iMo174310 = abstractViewOnClickListenerC142311.mo17439();
            if (iMo174310 != 0) {
                if (abstractViewOnClickListenerC142311 == abstractViewOnClickListenerC14239) {
                    return i;
                }
                i += iMo174310;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized AbstractC18933 m15727(int i) {
        if (this.f17844.f13207.f56474 == i) {
            return this.f17844.f13207;
        }
        int size = this.f17845.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7534 c7534 = (C7534) this.f17845.get(i2);
            if (c7534.f56474 == i) {
                return c7534;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized int m15728() {
        int iMo17439;
        iMo17439 = 0;
        for (AbstractViewOnClickListenerC14239 abstractViewOnClickListenerC14239 : this.f17846) {
            iMo17439 += abstractViewOnClickListenerC14239.mo17439();
        }
        int size = this.f17845.size();
        for (int i = 0; i < size; i++) {
            iMo17439 += ((C7534) this.f17845.get(i)).mo17439();
        }
        return iMo17439;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m15729() {
        this.f17844.f13207.m43027();
        this.f17845.clear();
        C4361.m9080(new C21616(this));
    }

    public C6863(C5522 c5522) {
        this.f17844 = c5522;
        C7043 c7043 = c5522.f13201;
        C12826.requireNonNull(c7043);
        C25148 c25148 = c5522.f13207;
        C12826.requireNonNull(c25148);
        C8009 c8009 = c5522.f13202;
        C12826.requireNonNull(c8009);
        C20946 c20946 = c5522.f13205;
        C12826.requireNonNull(c20946);
        C3019 c3019 = c5522.f13209;
        C12826.requireNonNull(c3019);
        C18402 c18402 = c5522.f13200;
        C12826.requireNonNull(c18402);
        this.f17846 = new AbstractViewOnClickListenerC14239[]{c7043, c25148, c8009, c20946, c3019, c18402};
        this.f17845 = new ArrayList();
        m15729();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15725(C6863 c6863, C15579 c15579) {
        C5522 c5522 = c6863.f17844;
        C7534 c7534 = new C7534(c5522.f13198, c5522, c15579);
        c7534.m43027();
        c6863.f17845.add(c7534);
    }

    @Override // java.util.AbstractList, java.util.List
    public final synchronized AbstractViewOnClickListenerC14239 get(int i) {
        if (i >= 2) {
            int i2 = i - 2;
            if (i2 < this.f17845.size()) {
                return (AbstractViewOnClickListenerC14239) this.f17845.get(i2);
            }
            i -= this.f17845.size();
        }
        return this.f17846[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17845.size() + this.f17846.length;
    }
}
