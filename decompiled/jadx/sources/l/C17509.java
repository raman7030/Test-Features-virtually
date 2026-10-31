package l;

import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17509 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53481 = 17;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f53482;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40897(AbstractC5144 abstractC5144, C2609 c2609) {
        if (abstractC5144 == null) {
            return 0;
        }
        final HashMap map = new HashMap();
        C19846.forEach(c2609, new Consumer() { // from class: l.ᩳᩳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                HashMap map2 = map;
                map2.put((AbstractC5698) obj, Integer.valueOf(map2.size()));
            }
        });
        C17509 c17509 = new C17509(map);
        abstractC5144.mo988(c17509);
        return c17509.f53481;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40899(Object obj) {
        this.f53481 = C11003.hashCode(obj) + (this.f53481 * 31);
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        Object objMo12915;
        if (abstractC5144 == null) {
            return;
        }
        AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC5144);
        AbstractC4308 abstractC4308 = abstractC5144M19471.f16086;
        if (abstractC4308 != null && (objMo12915 = abstractC4308.mo12915()) != null) {
            m40899(objMo12915);
        } else {
            m40899(abstractC5144M19471.mo989());
            abstractC5144M19471.mo988(this);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1427(C23342 c23342) {
        m40899(c23342.f74997);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        Integer num;
        AbstractC5698 abstractC5698 = c7673.f23697;
        if (abstractC5698 != null && (num = (Integer) this.f53482.get(abstractC5698)) != null) {
            m40899(num);
        } else {
            m40899(abstractC5698);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        m40899(c6262.f19396);
        mo10758(c6262.f19397);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        C13843.computeIfAbsent(this.f53482, c9378.f28489, new C18915(1, this));
        super.mo1392(c9378);
    }

    public C17509(HashMap map) {
        this.f53482 = map;
    }
}
