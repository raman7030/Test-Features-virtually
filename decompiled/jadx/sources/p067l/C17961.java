package p067l;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17961 implements Iterable, Comparator {

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC3880 f53651;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC3880 f53652;

    /* JADX INFO: renamed from: ᩹ */
    public int f53653 = 1;

    /* JADX INFO: renamed from: ۙ */
    public int f53650 = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AbstractC3880) obj).f8415 - ((AbstractC3880) obj2).f8415;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17961 m40877(C3702 c3702) {
        C17961 c17961 = new C17961();
        Iterator it = iterator();
        while (true) {
            C12598 c12598 = (C12598) it;
            if (!c12598.hasNext()) {
                return c17961;
            }
            c17961.m40881(((AbstractC3880) c12598.next()).mo7667(c3702));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40879(AbstractC3880 abstractC3880) {
        return abstractC3880.f8413 == this;
    }

    public final AbstractC3880 getFirst() {
        return this.f53652;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m40880() {
        return this.f53650;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m40876(AbstractC3880 abstractC3880) {
        if (abstractC3880.f8415 <= 0) {
            int i = this.f53653;
            abstractC3880.f8415 = i;
            this.f53653 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40878(AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        if (abstractC3880.f8413 == this) {
            m40876(abstractC3881);
            abstractC3881.f8413 = this;
            this.f53650++;
            abstractC3881.f8418 = abstractC3880.f8418;
            abstractC3881.f8410 = abstractC3880;
            AbstractC3880 abstractC3882 = abstractC3880.f8418;
            if (abstractC3882 == null) {
                this.f53651 = abstractC3881;
            } else {
                abstractC3882.f8410 = abstractC3881;
            }
            abstractC3880.f8418 = abstractC3881;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40882(AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        if (abstractC3880.f8413 == this) {
            m40876(abstractC3881);
            abstractC3881.f8413 = this;
            this.f53650++;
            abstractC3881.f8410 = abstractC3880.f8410;
            abstractC3881.f8418 = abstractC3880;
            AbstractC3880 abstractC3882 = abstractC3880.f8410;
            if (abstractC3882 == null) {
                this.f53652 = abstractC3881;
            } else {
                abstractC3882.f8418 = abstractC3881;
            }
            abstractC3880.f8410 = abstractC3881;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40881(AbstractC3880 abstractC3880) {
        m40876(abstractC3880);
        abstractC3880.f8413 = this;
        this.f53650++;
        if (this.f53652 == null) {
            this.f53651 = abstractC3880;
            this.f53652 = abstractC3880;
            abstractC3880.f8418 = null;
            abstractC3880.f8410 = null;
            return;
        }
        abstractC3880.f8418 = null;
        AbstractC3880 abstractC3881 = this.f53651;
        abstractC3880.f8410 = abstractC3881;
        abstractC3881.f8418 = abstractC3880;
        this.f53651 = abstractC3880;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C12598(this, this.f53652);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40883(AbstractC3880 abstractC3880) {
        if (abstractC3880.f8413 == this) {
            this.f53650--;
            abstractC3880.f8413 = null;
            AbstractC3880 abstractC3881 = abstractC3880.f8410;
            if (abstractC3881 == null) {
                this.f53652 = abstractC3880.f8418;
            } else {
                abstractC3881.f8418 = abstractC3880.f8418;
            }
            AbstractC3880 abstractC3882 = abstractC3880.f8418;
            if (abstractC3882 == null) {
                this.f53651 = abstractC3881;
            } else {
                abstractC3882.f8410 = abstractC3881;
            }
            abstractC3880.f8410 = null;
            abstractC3880.f8418 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40884(AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        if (abstractC3880.f8413 == this) {
            m40876(abstractC3881);
            abstractC3881.f8413 = this;
            abstractC3881.f8418 = abstractC3880.f8418;
            abstractC3881.f8410 = abstractC3880.f8410;
            AbstractC3880 abstractC3882 = abstractC3880.f8418;
            if (abstractC3882 != null) {
                abstractC3882.f8410 = abstractC3881;
            } else {
                this.f53651 = abstractC3881;
            }
            AbstractC3880 abstractC3883 = abstractC3880.f8410;
            if (abstractC3883 != null) {
                abstractC3883.f8418 = abstractC3881;
            } else {
                this.f53652 = abstractC3881;
            }
            abstractC3880.f8418 = null;
            abstractC3880.f8410 = null;
            abstractC3880.f8413 = null;
        }
    }

    public final String toString() {
        if (this.f53650 == 0) {
            return "[Empty]";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (true) {
            C12598 c12598 = (C12598) it;
            if (c12598.hasNext()) {
                AbstractC3880 abstractC3880 = (AbstractC3880) c12598.next();
                if (abstractC3880.f8417 == EnumC9677.LABEL) {
                    sb.append("\n");
                }
                sb.append(abstractC3880);
                sb.append("\n");
            } else {
                return sb.toString();
            }
        }
    }
}
