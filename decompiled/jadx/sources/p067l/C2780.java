package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: l.֡۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2780 extends AbstractC3451 {

    /* JADX INFO: renamed from: ֨ */
    public final ArrayList f4692;

    /* JADX INFO: renamed from: ۠ */
    public boolean f4693;

    @Override // p067l.AbstractC3451
    /* JADX INFO: renamed from: ֫ */
    public final C2780 mo4359() {
        return this;
    }

    public C2780() {
        super(true);
        this.f4692 = new ArrayList();
        this.f4693 = false;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList m4364() {
        return this.f4692;
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m4361() {
        C20216 c20216 = C16861.f49921;
        ArrayList<AbstractC3451> arrayList = this.f4692;
        Collections.sort(arrayList, c20216);
        for (AbstractC3451 abstractC3451 : arrayList) {
            if (abstractC3451.m6129()) {
                abstractC3451.mo4359().m4361();
            }
        }
    }

    @Override // p067l.AbstractC3451
    /* JADX INFO: renamed from: ۧ */
    public final C7475 mo4363() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m4362() {
        if (this.f4693) {
            return true;
        }
        for (AbstractC3451 abstractC3451 : this.f4692) {
            if (abstractC3451.m6129() && abstractC3451.mo4359().m4362()) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC3451
    /* JADX INFO: renamed from: ֫ */
    public final void mo4360(CountDownLatch countDownLatch) {
        this.f6895 = countDownLatch;
        Iterator it = this.f4692.iterator();
        while (it.hasNext()) {
            ((AbstractC3451) it.next()).mo4360(countDownLatch);
        }
    }
}
