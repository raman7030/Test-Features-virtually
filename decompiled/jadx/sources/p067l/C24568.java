package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩻֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes.dex */
public final class C24568 {

    /* JADX INFO: renamed from: ֫ */
    public C8475 f77783 = new C8475(0);

    /* JADX INFO: renamed from: ۧ */
    public static C24568 m54167() {
        return new C24568();
    }

    public final C24568 clone() {
        C8475 c8475 = new C8475(0);
        if (this.f77783.f22744 == null) {
            c8475.f22744 = null;
        } else {
            c8475.f22744 = new ArrayList(this.f77783.f22744);
        }
        if (this.f77783.f22741 == null) {
            c8475.f22741 = null;
        } else {
            c8475.f22741 = new ArrayList(this.f77783.f22741);
        }
        if (this.f77783.f22742 == null) {
            c8475.f22742 = null;
        } else {
            c8475.f22742 = new ArrayList(this.f77783.f22742);
        }
        if (this.f77783.f22745 == null) {
            c8475.f22745 = null;
        } else {
            c8475.f22745 = new ArrayList(this.f77783.f22745);
        }
        if (this.f77783.f22743 == null) {
            c8475.f22743 = null;
        } else {
            c8475.f22743 = new ArrayList(this.f77783.f22743);
        }
        C24568 c24568 = new C24568();
        c24568.f77783 = c8475;
        return c24568;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8475 m54168() {
        C8475 c8475 = new C8475(0);
        if (this.f77783.f22744 == null) {
            c8475.f22744 = Collections.EMPTY_LIST;
        } else {
            c8475.f22744 = C21562.unmodifiableList(new ArrayList(this.f77783.f22744));
        }
        if (this.f77783.f22741 == null) {
            c8475.f22741 = Collections.EMPTY_LIST;
        } else {
            c8475.f22741 = C21562.unmodifiableList(new ArrayList(this.f77783.f22741));
        }
        if (this.f77783.f22742 == null) {
            c8475.f22742 = Collections.EMPTY_LIST;
        } else {
            c8475.f22742 = C21562.unmodifiableList(new ArrayList(this.f77783.f22742));
        }
        if (this.f77783.f22745 == null) {
            c8475.f22745 = Collections.EMPTY_LIST;
        } else {
            c8475.f22745 = C21562.unmodifiableList(new ArrayList(this.f77783.f22745));
        }
        if (this.f77783.f22743 == null) {
            c8475.f22743 = Collections.EMPTY_LIST;
            return c8475;
        }
        c8475.f22743 = C21562.unmodifiableList(new ArrayList(this.f77783.f22743));
        return c8475;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54172(C8475 c8475) {
        if (!c8475.f22744.isEmpty()) {
            if (this.f77783.f22744 == null) {
                this.f77783.f22744 = new ArrayList();
            }
            this.f77783.f22744.addAll(c8475.f22744);
        }
        if (!c8475.f22741.isEmpty()) {
            if (this.f77783.f22741 == null) {
                this.f77783.f22741 = new ArrayList();
            }
            this.f77783.f22741.addAll(c8475.f22741);
        }
        if (!c8475.f22742.isEmpty()) {
            if (this.f77783.f22742 == null) {
                this.f77783.f22742 = new ArrayList();
            }
            this.f77783.f22742.addAll(c8475.f22742);
        }
        if (!c8475.f22745.isEmpty()) {
            if (this.f77783.f22745 == null) {
                this.f77783.f22745 = new ArrayList();
            }
            this.f77783.f22745.addAll(c8475.f22745);
        }
        if (c8475.f22743.isEmpty()) {
            return;
        }
        if (this.f77783.f22743 == null) {
            this.f77783.f22743 = new ArrayList();
        }
        this.f77783.f22743.addAll(c8475.f22743);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54174(long j) {
        if (this.f77783.f22744 == null) {
            this.f77783.f22744 = new ArrayList();
        }
        this.f77783.f22744.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54169(int i) {
        if (this.f77783.f22741 == null) {
            this.f77783.f22741 = new ArrayList();
        }
        this.f77783.f22741.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54170(long j) {
        if (this.f77783.f22742 == null) {
            this.f77783.f22742 = new ArrayList();
        }
        this.f77783.f22742.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54171(AbstractC7962 abstractC7962) {
        if (this.f77783.f22745 == null) {
            this.f77783.f22745 = new ArrayList();
        }
        this.f77783.f22745.add(abstractC7962);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54173(C11158 c11158) {
        if (this.f77783.f22743 == null) {
            this.f77783.f22743 = new ArrayList();
        }
        this.f77783.f22743.add(c11158);
    }
}
