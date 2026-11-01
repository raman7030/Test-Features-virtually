package p067l;

import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19009 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public int f56671 = 17;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f56672;

    /* JADX INFO: renamed from: ֫ */
    public static int m43155(AbstractC7257 abstractC7257, C4848 c4848) {
        if (abstractC7257 == null) {
            return 0;
        }
        final HashMap map = new HashMap();
        C21230.forEach(c4848, new Consumer() { // from class: l.ᩳᩳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                HashMap map2 = map;
                map2.put((AbstractC7783) obj, Integer.valueOf(map2.size()));
            }
        });
        C19009 c19009 = new C19009(map);
        abstractC7257.mo3382(c19009);
        return c19009.f56671;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m43157(Object obj) {
        this.f56671 = C12826.hashCode(obj) + (this.f56671 * 31);
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        Object objMo14779;
        if (abstractC7257 == null) {
            return;
        }
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        AbstractC6462 abstractC6462 = abstractC7257M21437.f18925;
        if (abstractC6462 != null && (objMo14779 = abstractC6462.mo14779()) != null) {
            m43157(objMo14779);
        } else {
            m43157(abstractC7257M21437.mo3383());
            abstractC7257M21437.mo3382(this);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3840(C24552 c24552) {
        m43157(c24552.f77744);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        Integer num;
        AbstractC7783 abstractC7783 = c9661.f26611;
        if (abstractC7783 != null && (num = (Integer) this.f56672.get(abstractC7783)) != null) {
            m43157(num);
        } else {
            m43157(abstractC7783);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        m43157(c8320.f22260);
        mo12739(c8320.f22261);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3805(C11281 c11281) {
        C15525.computeIfAbsent(this.f56672, c11281.f31438, new C20345(1, this));
        super.mo3805(c11281);
    }

    public C19009(HashMap map) {
        this.f56672 = map;
    }
}
