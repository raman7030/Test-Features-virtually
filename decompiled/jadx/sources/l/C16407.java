package l;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8691 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16407 implements Iterable, Comparator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f50479;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC1591 f50480;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f50481 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50478 = 0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AbstractC1591) obj).f5636 - ((AbstractC1591) obj2).f5636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16407 m38661(C1403 c1403) {
        C16407 c16407 = new C16407();
        Iterator it = iterator();
        while (true) {
            C10764 c10764 = (C10764) it;
            if (!c10764.hasNext()) {
                return c16407;
            }
            c16407.m38665(((AbstractC1591) c10764.next()).mo5437(c1403));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38663(AbstractC1591 abstractC1591) {
        return abstractC1591.f5634 == this;
    }

    public final AbstractC1591 getFirst() {
        return this.f50480;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m38664() {
        return this.f50478;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m38660(AbstractC1591 abstractC1591) {
        if (abstractC1591.f5636 <= 0) {
            int i = this.f50481;
            abstractC1591.f5636 = i;
            this.f50481 = i + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38662(AbstractC1591 abstractC1591, AbstractC1591 abstractC1592) {
        if (abstractC1591.f5634 == this) {
            m38660(abstractC1592);
            abstractC1592.f5634 = this;
            this.f50478++;
            abstractC1592.f5639 = abstractC1591.f5639;
            abstractC1592.f5631 = abstractC1591;
            AbstractC1591 abstractC1593 = abstractC1591.f5639;
            if (abstractC1593 == null) {
                this.f50479 = abstractC1592;
            } else {
                abstractC1593.f5631 = abstractC1592;
            }
            abstractC1591.f5639 = abstractC1592;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38666(AbstractC1591 abstractC1591, AbstractC1591 abstractC1592) {
        if (abstractC1591.f5634 == this) {
            m38660(abstractC1592);
            abstractC1592.f5634 = this;
            this.f50478++;
            abstractC1592.f5631 = abstractC1591.f5631;
            abstractC1592.f5639 = abstractC1591;
            AbstractC1591 abstractC1593 = abstractC1591.f5631;
            if (abstractC1593 == null) {
                this.f50480 = abstractC1592;
            } else {
                abstractC1593.f5639 = abstractC1592;
            }
            abstractC1591.f5631 = abstractC1592;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38665(AbstractC1591 abstractC1591) {
        m38660(abstractC1591);
        abstractC1591.f5634 = this;
        this.f50478++;
        if (this.f50480 == null) {
            this.f50479 = abstractC1591;
            this.f50480 = abstractC1591;
            abstractC1591.f5639 = null;
            abstractC1591.f5631 = null;
            return;
        }
        abstractC1591.f5639 = null;
        AbstractC1591 abstractC1592 = this.f50479;
        abstractC1591.f5631 = abstractC1592;
        abstractC1592.f5639 = abstractC1591;
        this.f50479 = abstractC1591;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10764(this, this.f50480);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38667(AbstractC1591 abstractC1591) {
        if (abstractC1591.f5634 == this) {
            this.f50478--;
            abstractC1591.f5634 = null;
            AbstractC1591 abstractC1592 = abstractC1591.f5631;
            if (abstractC1592 == null) {
                this.f50480 = abstractC1591.f5639;
            } else {
                abstractC1592.f5639 = abstractC1591.f5639;
            }
            AbstractC1591 abstractC1593 = abstractC1591.f5639;
            if (abstractC1593 == null) {
                this.f50479 = abstractC1592;
            } else {
                abstractC1593.f5631 = abstractC1592;
            }
            abstractC1591.f5631 = null;
            abstractC1591.f5639 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38668(AbstractC1591 abstractC1591, AbstractC1591 abstractC1592) {
        if (abstractC1591.f5634 == this) {
            m38660(abstractC1592);
            abstractC1592.f5634 = this;
            abstractC1592.f5639 = abstractC1591.f5639;
            abstractC1592.f5631 = abstractC1591.f5631;
            AbstractC1591 abstractC1593 = abstractC1591.f5639;
            if (abstractC1593 != null) {
                abstractC1593.f5631 = abstractC1592;
            } else {
                this.f50479 = abstractC1592;
            }
            AbstractC1591 abstractC1594 = abstractC1591.f5631;
            if (abstractC1594 != null) {
                abstractC1594.f5639 = abstractC1592;
            } else {
                this.f50480 = abstractC1592;
            }
            abstractC1591.f5639 = null;
            abstractC1591.f5631 = null;
            abstractC1591.f5634 = null;
        }
    }

    public final String toString() {
        if (this.f50478 == 0) {
            return "[Empty]";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterator();
        while (true) {
            C10764 c10764 = (C10764) it;
            if (c10764.hasNext()) {
                AbstractC1591 abstractC1591 = (AbstractC1591) c10764.next();
                if (abstractC1591.f5638 == EnumC7690.LABEL) {
                    sb.append("\n");
                }
                sb.append(abstractC1591);
                sb.append("\n");
            } else {
                return sb.toString();
            }
        }
    }
}
