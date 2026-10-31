package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C11177 implements InterfaceC5804 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2004 f33546;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class f33547;

    public C11177(Class cls, Class cls2, String str) {
        C2004 c2004 = new C2004(cls, cls2, str);
        this.f33547 = c2004.f6708.getReturnType();
        this.f33546 = c2004;
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public Object mo16282(AbstractC4121 abstractC4121) {
        return this.f33546.m6540(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public Object mo16288(AbstractC19916 abstractC19916) {
        return this.f33546.m6546(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo16292(AbstractC4121 abstractC4121) {
        return mo16282(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        mo16285(abstractC19916);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo16290(abstractC19916, it.next());
        }
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public Object mo16281(int i, AbstractC4121 abstractC4121) {
        return this.f33546.m6539(i, abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public Object mo16289(AbstractC19916 abstractC19916, int i) {
        return this.f33546.m6541(abstractC19916, i);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        this.f33546.m6543(abstractC19916, i, obj);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public void mo16290(AbstractC19916 abstractC19916, Object obj) {
        this.f33546.m6544(abstractC19916, obj);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16291(AbstractC4121 abstractC4121) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16293(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16295(AbstractC4121 abstractC4121) {
        return this.f33546.m6545(abstractC4121);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܿ */
    public final int mo16294(AbstractC19916 abstractC19916) {
        return this.f33546.m6547(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16285(AbstractC19916 abstractC19916) {
        this.f33546.m6542(abstractC19916);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC14165 mo16283() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14165 mo16296(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC14165 mo16284(AbstractC19916 abstractC19916, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
