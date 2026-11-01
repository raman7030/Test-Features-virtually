package p067l;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4824 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final C20918 f10966;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo4437(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo4438(Object obj, C18691 c18691, AbstractC6165 abstractC6165);

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo4439();

    public AbstractC4824(C20918 c20918) {
        this.f10966 = c20918;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) throws IOException {
        if (obj == null) {
            c24726.m54383();
            return;
        }
        c24726.m54389();
        try {
            Iterator it = this.f10966.f65702.iterator();
            while (it.hasNext()) {
                ((AbstractC6165) it.next()).mo13961(c24726, obj);
            }
            c24726.m54388();
        } catch (IllegalAccessException e) {
            int i = C15140.f43223;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        Object objMo4439 = mo4439();
        Map map = this.f10966.f65701;
        try {
            c18691.m42647();
            while (c18691.m42649()) {
                AbstractC6165 abstractC6165 = (AbstractC6165) map.get(c18691.m42641());
                if (abstractC6165 == null) {
                    c18691.m42654();
                } else {
                    mo4438(objMo4439, c18691, abstractC6165);
                }
            }
            c18691.m42655();
            return mo4437(objMo4439);
        } catch (IllegalAccessException e) {
            int i = C15140.f43223;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new C16322(e2);
        }
    }
}
