package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C19794 extends AbstractC11077 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C6383 f60204;

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final void mo20984(AbstractC7257 abstractC7257, AbstractC7257 abstractC7258, boolean z) {
        C4848 c4848Mo14802;
        C4848 c4848Mo14803;
        C20530 c20530 = (C20530) abstractC7257;
        C20530 c20531 = (C20530) abstractC7258;
        if (z) {
            return;
        }
        if (c20530.f63428 != null) {
            if (c20531.f63428.f20024.m10293()) {
                c4848Mo14802 = ((AbstractC14355) c20531.f63428.f20024.get(0)).f18925.mo14802();
            } else {
                c4848Mo14802 = c20531.f63428.f20025.f18925.mo14802();
            }
            if (c20530.f63428.f20024.m10293()) {
                c4848Mo14803 = ((AbstractC14355) c20530.f63428.f20024.get(0)).f18925.mo14802();
            } else {
                c4848Mo14803 = c20530.f63428.f20025.f18925.mo14802();
            }
        } else {
            c4848Mo14802 = c20531.f18925.mo14802();
            c4848Mo14803 = c20530.f18925.mo14802();
        }
        Iterator it = c4848Mo14802.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C6383 c6383 = this.f60204;
            if (zHasNext) {
                if (!c6383.f16519.m19490((AbstractC6462) it.next(), (AbstractC6462) c4848Mo14803.f11034)) {
                    return;
                } else {
                    c4848Mo14803 = c4848Mo14803.f11035;
                }
            } else {
                c6383.f16516.m9364(c20530.f63429, C15675.f45429);
                return;
            }
        }
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20985(AbstractC7257 abstractC7257) {
        C20530 c20530 = (C20530) abstractC7257;
        if (!c20530.f63429.m16617(EnumC19998.f60745) || C9268.m21415(c20530)) {
            return false;
        }
        return c20530.f63428 == null || this.f60204.f16513;
    }

    @Override // p067l.AbstractC11077
    /* JADX INFO: renamed from: ۧ */
    public final C4848 mo20986(AbstractC7257 abstractC7257) {
        C20530 c20530 = (C20530) abstractC7257;
        if (c20530.f63429.m16617(EnumC19998.f60745)) {
            C20530 c20531 = (C20530) this.f60204.f16518.mo10751((AbstractC7257) c20530, (Object) null);
            ((C17985) c20531.f63429).f53721 = C4848.m10283();
            return C4848.m10276of((Object) c20531);
        }
        return C4848.m10276of((Object) c20530);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19794(C6383 c6383) {
        super(c6383, EnumC13089.DIAMOND, EnumC19998.f60772);
        this.f60204 = c6383;
    }
}
