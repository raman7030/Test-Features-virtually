package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J7QK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13148 {

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7783 f36935;

    /* JADX INFO: renamed from: ᩻ */
    public static final C4848 f36930 = C4848.m10276of((Object) null);

    /* JADX INFO: renamed from: ܳ */
    public static final C4848 f36929 = C4848.m10276of((Object) null);

    /* JADX INFO: renamed from: ֫ */
    public C4848 f36931 = f36930;

    /* JADX INFO: renamed from: ܿ */
    public C4848 f36934 = C4848.m10283();

    /* JADX INFO: renamed from: ܽ */
    public C4848 f36933 = C4848.m10283();

    /* JADX INFO: renamed from: ۧ */
    public C4848 f36932 = C4848.m10283();

    public C13148(AbstractC7783 abstractC7783) {
        this.f36935 = abstractC7783;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4848 m30084() {
        C4848 c4848 = this.f36931;
        return (c4848 == f36929 || c4848 == f36930) ? C4848.m10283() : c4848;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C4848 m30092() {
        return this.f36934;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C4848 m30088() {
        return this.f36933;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m30078() {
        return this.f36932;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m30086(C4848 c4848) {
        C1446.m31704(m30095() || this.f36931 == f36930);
        c4848.getClass();
        this.f36931 = c4848;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m30083(C4848 c4848) {
        c4848.getClass();
        this.f36934 = c4848;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m30094(C4848 c4848) {
        c4848.getClass();
        this.f36933 = c4848;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m30090(C4848 c4848) {
        c4848.getClass();
        this.f36932 = c4848;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30080(C13148 c13148) {
        c13148.getClass();
        C4848 c4848M10283 = c13148.f36931;
        if (c4848M10283 == f36929 || c4848M10283 == f36930) {
            c4848M10283 = C4848.m10283();
        }
        m30086(c4848M10283);
        AbstractC7783 abstractC7783 = this.f36935;
        if ((abstractC7783.mo18003() & 2147483648L) != 0) {
            C1446.m31704(c13148.f36935.f20405 == EnumC3600.f7343);
            C20271 c20271 = new C20271();
            for (C8552 c8552 : c13148.f36934) {
                if (!c8552.f53587.f33002.m26202()) {
                    c20271.m45777(c8552);
                }
            }
            m30083(c20271.m45783());
        } else {
            m30083(c13148.f36934);
        }
        if (abstractC7783.f20405 == EnumC3600.f7354) {
            m30094(c13148.f36933);
            m30090(c13148.f36932);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m30082() {
        this.f36931 = f36929;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m30087() {
        return this.f36934.isEmpty();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m30095() {
        return this.f36931 == f36929;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30079(C4848 c4848) {
        C4848 c4848M10283 = this.f36931;
        if (c4848M10283 == f36929 || c4848M10283 == f36930) {
            c4848M10283 = C4848.m10283();
        }
        this.f36931 = c4848M10283;
        if (c4848.isEmpty()) {
            return;
        }
        if (this.f36931.isEmpty()) {
            this.f36931 = c4848;
            return;
        }
        C4848 c4849 = this.f36931;
        c4849.getClass();
        this.f36931 = c4848.m10292(c4849);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m30093(C4848 c4848) {
        if (c4848.isEmpty()) {
            return;
        }
        if (this.f36934.isEmpty()) {
            this.f36934 = c4848;
            return;
        }
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C8552 c8552 = (C8552) it.next();
            if (!this.f36934.contains(c8552)) {
                this.f36934 = this.f36934.m10286(c8552);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30089(C4848 c4848) {
        if (c4848.isEmpty()) {
            return;
        }
        if (this.f36933.isEmpty()) {
            this.f36933 = c4848;
            return;
        }
        C4848 c4849 = this.f36933;
        c4849.getClass();
        this.f36933 = c4848.m10292(c4849);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30085(C4848 c4848) {
        if (c4848.isEmpty()) {
            return;
        }
        if (this.f36932.isEmpty()) {
            this.f36932 = c4848;
            return;
        }
        C4848 c4849 = this.f36932;
        c4849.getClass();
        this.f36932 = c4848.m10292(c4849);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m30091() {
        return this.f36931 == f36930 || m30095() || this.f36931.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m30077(C4848 c4848, C17939 c17939) {
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C17939 c179310 = (C17939) it.next();
            if (c179310 != c17939) {
                c20271.m45777(c179310);
            }
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30081(C17939 c17939) {
        if (this.f36931.contains(c17939)) {
            this.f36931 = m30077(this.f36931, c17939);
            return;
        }
        for (C17939 c179310 : this.f36931) {
            boolean zM40800 = c179310.m40800();
            C4848 c4848 = c179310.f53589;
            if (zM40800 && !c4848.isEmpty()) {
                C24293 c24293 = (C24293) c4848.get(0);
                if (((C5771) c24293.f76952).f20408.mo28204(C0226b.f1011d)) {
                    Object obj = c24293.f76953;
                    if (obj instanceof C3858) {
                        AbstractC10564[] abstractC10564Arr = ((C3858) obj).f8345;
                        if (abstractC10564Arr.length != 0) {
                            AbstractC10564 abstractC10564 = abstractC10564Arr[0];
                            if ((abstractC10564 instanceof C17939) && abstractC10564.f29256 == c17939.f29256) {
                                this.f36931 = m30077(this.f36931, c179310);
                            }
                        }
                    }
                }
            }
        }
    }
}
