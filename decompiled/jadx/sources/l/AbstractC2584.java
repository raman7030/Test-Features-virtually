package l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2584 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19518 f8174;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo2057(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2058(Object obj, C17175 c17175, AbstractC3995 abstractC3995);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo2059();

    public AbstractC2584(C19518 c19518) {
        this.f8174 = c19518;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) throws IOException {
        if (obj == null) {
            c23525.m51981();
            return;
        }
        c23525.m51987();
        try {
            Iterator it = this.f8174.f63082.iterator();
            while (it.hasNext()) {
                ((AbstractC3995) it.next()).mo12041(c23525, obj);
            }
            c23525.m51986();
        } catch (IllegalAccessException e) {
            int i = C13438.f40152;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        Object objMo2059 = mo2059();
        Map map = this.f8174.f63081;
        try {
            c17175.m40402();
            while (c17175.m40404()) {
                AbstractC3995 abstractC3995 = (AbstractC3995) map.get(c17175.m40396());
                if (abstractC3995 == null) {
                    c17175.m40409();
                } else {
                    mo2058(objMo2059, c17175, abstractC3995);
                }
            }
            c17175.m40410();
            return mo2057(objMo2059);
        } catch (IllegalAccessException e) {
            int i = C13438.f40152;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C14682(e2);
        }
    }
}
