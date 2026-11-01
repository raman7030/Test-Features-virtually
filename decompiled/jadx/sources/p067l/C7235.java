package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4RU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7235 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public int f18872;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC10588 f18873;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC10588[] f18874;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC10588 f18875;

    public final int size() {
        return this.f18872;
    }

    public final AbstractC10588 getFirst() {
        return this.f18875;
    }

    public final AbstractC10588 getLast() {
        return this.f18873;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16576(AbstractC17054 abstractC17054) {
        for (AbstractC10588 abstractC10588 = this.f18875; abstractC10588 != null; abstractC10588 = abstractC10588.f29319) {
            abstractC10588.mo5551(abstractC17054);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2540(this);
    }

    public final AbstractC10588[] toArray() {
        AbstractC10588 abstractC10588 = this.f18875;
        AbstractC10588[] abstractC10588Arr = new AbstractC10588[this.f18872];
        int i = 0;
        while (abstractC10588 != null) {
            abstractC10588Arr[i] = abstractC10588;
            abstractC10588.f29316 = i;
            abstractC10588 = abstractC10588.f29319;
            i++;
        }
        return abstractC10588Arr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m16580(AbstractC10588 abstractC10588, AbstractC10588 abstractC10589) {
        AbstractC10588 abstractC105810 = abstractC10588.f29319;
        abstractC10589.f29319 = abstractC105810;
        if (abstractC105810 != null) {
            abstractC105810.f29320 = abstractC10589;
        } else {
            this.f18873 = abstractC10589;
        }
        AbstractC10588 abstractC105811 = abstractC10588.f29320;
        abstractC10589.f29320 = abstractC105811;
        if (abstractC105811 != null) {
            abstractC105811.f29319 = abstractC10589;
        } else {
            this.f18875 = abstractC10589;
        }
        AbstractC10588[] abstractC10588Arr = this.f18874;
        if (abstractC10588Arr != null) {
            int i = abstractC10588.f29316;
            abstractC10588Arr[i] = abstractC10589;
            abstractC10589.f29316 = i;
        } else {
            abstractC10589.f29316 = 0;
        }
        abstractC10588.f29316 = -1;
        abstractC10588.f29320 = null;
        abstractC10588.f29319 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16574(AbstractC10588 abstractC10588) {
        this.f18872++;
        AbstractC10588 abstractC10589 = this.f18873;
        if (abstractC10589 == null) {
            this.f18875 = abstractC10588;
            this.f18873 = abstractC10588;
        } else {
            abstractC10589.f29319 = abstractC10588;
            abstractC10588.f29320 = abstractC10589;
        }
        this.f18873 = abstractC10588;
        this.f18874 = null;
        abstractC10588.f29316 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16575(AbstractC10588 abstractC10588, AbstractC10588 abstractC10589) {
        this.f18872++;
        AbstractC10588 abstractC105810 = abstractC10588.f29319;
        if (abstractC105810 == null) {
            this.f18873 = abstractC10589;
        } else {
            abstractC105810.f29320 = abstractC10589;
        }
        abstractC10588.f29319 = abstractC10589;
        abstractC10589.f29319 = abstractC105810;
        abstractC10589.f29320 = abstractC10588;
        this.f18874 = null;
        abstractC10589.f29316 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16579(AbstractC10588 abstractC10588, AbstractC10588 abstractC10589) {
        this.f18872++;
        AbstractC10588 abstractC105810 = abstractC10588.f29320;
        if (abstractC105810 == null) {
            this.f18875 = abstractC10589;
        } else {
            abstractC105810.f29319 = abstractC10589;
        }
        abstractC10588.f29320 = abstractC10589;
        abstractC10589.f29319 = abstractC10588;
        abstractC10589.f29320 = abstractC105810;
        this.f18874 = null;
        abstractC10589.f29316 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16578(AbstractC10588 abstractC10588) {
        this.f18872--;
        AbstractC10588 abstractC10589 = abstractC10588.f29319;
        AbstractC10588 abstractC105810 = abstractC10588.f29320;
        if (abstractC10589 == null) {
            if (abstractC105810 == null) {
                this.f18875 = null;
                this.f18873 = null;
            } else {
                abstractC105810.f29319 = null;
                this.f18873 = abstractC105810;
            }
        } else if (abstractC105810 == null) {
            this.f18875 = abstractC10589;
            abstractC10589.f29320 = null;
        } else {
            abstractC105810.f29319 = abstractC10589;
            abstractC10589.f29320 = abstractC105810;
        }
        this.f18874 = null;
        abstractC10588.f29316 = -1;
        abstractC10588.f29320 = null;
        abstractC10588.f29319 = null;
    }

    public final void clear() {
        this.f18872 = 0;
        this.f18875 = null;
        this.f18873 = null;
        this.f18874 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16577() {
        for (AbstractC10588 abstractC10588 = this.f18875; abstractC10588 != null; abstractC10588 = abstractC10588.f29319) {
            if (abstractC10588 instanceof C23329) {
                ((C23329) abstractC10588).m51954();
            }
        }
    }
}
