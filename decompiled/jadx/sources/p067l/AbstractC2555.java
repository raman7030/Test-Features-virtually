package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E1HX */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2555 {

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC2555 f4219 = null;

    /* JADX INFO: renamed from: ֫ */
    public AbstractC2555 f4214 = null;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC2555 f4215 = null;

    /* JADX INFO: renamed from: ܿ */
    public AbstractC2555 f4218 = null;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC2555 f4217 = null;

    /* JADX INFO: renamed from: ܳ */
    public ArrayList f4216 = null;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3758(InterfaceC11944 interfaceC11944);

    /* JADX INFO: renamed from: ᩻ */
    public String mo3769() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC2555 m3765() {
        return this.f4217;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC2555 m3767() {
        return this.f4218;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC2555 m3754() {
        return this.f4214;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC2555 m3762() {
        return this.f4215;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC2555 mo3768() {
        return this.f4219;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo3766(AbstractC2555 abstractC2555) {
        this.f4219 = abstractC2555;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m3756(AbstractC2555 abstractC2555) {
        abstractC2555.m3761();
        abstractC2555.mo3766(this);
        AbstractC2555 abstractC2556 = this.f4215;
        if (abstractC2556 != null) {
            abstractC2556.f4217 = abstractC2555;
            abstractC2555.f4218 = abstractC2556;
        } else {
            this.f4214 = abstractC2555;
        }
        this.f4215 = abstractC2555;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3759(C15668 c15668) {
        c15668.m3761();
        c15668.f4219 = this;
        AbstractC2555 abstractC2555 = this.f4214;
        if (abstractC2555 != null) {
            abstractC2555.f4218 = c15668;
            c15668.f4217 = abstractC2555;
            this.f4214 = c15668;
        } else {
            this.f4214 = c15668;
            this.f4215 = c15668;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m3761() {
        AbstractC2555 abstractC2555 = this.f4218;
        if (abstractC2555 != null) {
            abstractC2555.f4217 = this.f4217;
        } else {
            AbstractC2555 abstractC2556 = this.f4219;
            if (abstractC2556 != null) {
                abstractC2556.f4214 = this.f4217;
            }
        }
        AbstractC2555 abstractC2557 = this.f4217;
        if (abstractC2557 != null) {
            abstractC2557.f4218 = abstractC2555;
        } else {
            AbstractC2555 abstractC2558 = this.f4219;
            if (abstractC2558 != null) {
                abstractC2558.f4215 = abstractC2555;
            }
        }
        this.f4219 = null;
        this.f4217 = null;
        this.f4218 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3763(AbstractC2555 abstractC2555) {
        abstractC2555.m3761();
        AbstractC2555 abstractC2556 = this.f4217;
        abstractC2555.f4217 = abstractC2556;
        if (abstractC2556 != null) {
            abstractC2556.f4218 = abstractC2555;
        }
        abstractC2555.f4218 = this;
        this.f4217 = abstractC2555;
        AbstractC2555 abstractC2557 = this.f4219;
        abstractC2555.f4219 = abstractC2557;
        if (abstractC2555.f4217 == null) {
            abstractC2557.f4215 = abstractC2555;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3757(C5909 c5909) {
        c5909.m3761();
        AbstractC2555 abstractC2555 = this.f4218;
        c5909.f4218 = abstractC2555;
        if (abstractC2555 != null) {
            abstractC2555.f4217 = c5909;
        }
        c5909.f4217 = this;
        this.f4218 = c5909;
        AbstractC2555 abstractC2556 = this.f4219;
        c5909.f4219 = abstractC2556;
        if (c5909.f4218 == null) {
            abstractC2556.f4214 = c5909;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m3764() {
        ArrayList arrayList = this.f4216;
        return arrayList != null ? C21562.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3755(List list) {
        if (list.isEmpty()) {
            this.f4216 = null;
        } else {
            this.f4216 = new ArrayList(list);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3760(C21332 c21332) {
        if (this.f4216 == null) {
            this.f4216 = new ArrayList();
        }
        this.f4216.add(c21332);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        return C10965.m25286(sb, mo3769(), C0249l.f1198d);
    }
}
