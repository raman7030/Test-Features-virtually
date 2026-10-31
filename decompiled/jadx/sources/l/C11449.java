package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11449 implements InterfaceC5804 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 f34220;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20370 f34221;

    public C11449(C0117 c0117, Class cls) {
        this.f34220 = c0117;
        this.f34221 = ((AbstractC4121) AbstractC4121.m12386(AbstractC4121.m12387(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).internalGetMapFieldReflection(c0117.getNumber()).mo5017();
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16281(int i, AbstractC4121 abstractC4121) {
        return abstractC4121.internalGetMapFieldReflection(this.f34220.getNumber()).mo5016().get(i);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16295(AbstractC4121 abstractC4121) {
        return abstractC4121.internalGetMapFieldReflection(this.f34220.getNumber()).mo5016().size();
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16289(AbstractC19916 abstractC19916, int i) {
        return abstractC19916.internalGetMapFieldReflection(this.f34220.getNumber()).mo5016().get(i);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܿ */
    public final int mo16294(AbstractC19916 abstractC19916) {
        return abstractC19916.internalGetMapFieldReflection(this.f34220.getNumber()).mo5016().size();
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16285(AbstractC19916 abstractC19916) {
        ((ArrayList) abstractC19916.internalGetMutableMapFieldReflection(this.f34220.getNumber()).mo5018()).clear();
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        List listMo5018 = abstractC19916.internalGetMutableMapFieldReflection(this.f34220.getNumber()).mo5018();
        InterfaceC23338 interfaceC23338Build = (InterfaceC23338) obj;
        if (interfaceC23338Build == null) {
            interfaceC23338Build = null;
        } else {
            C20370 c20370 = this.f34221;
            if (!c20370.getClass().isInstance(interfaceC23338Build)) {
                interfaceC23338Build = c20370.toBuilder().mergeFrom(interfaceC23338Build).build();
            }
        }
        ((ArrayList) listMo5018).set(i, interfaceC23338Build);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final void mo16290(AbstractC19916 abstractC19916, Object obj) {
        List listMo5018 = abstractC19916.internalGetMutableMapFieldReflection(this.f34220.getNumber()).mo5018();
        InterfaceC23338 interfaceC23338Build = (InterfaceC23338) obj;
        if (interfaceC23338Build == null) {
            interfaceC23338Build = null;
        } else {
            C20370 c20370 = this.f34221;
            if (!c20370.getClass().isInstance(interfaceC23338Build)) {
                interfaceC23338Build = c20370.toBuilder().mergeFrom(interfaceC23338Build).build();
            }
        }
        ((ArrayList) listMo5018).add(interfaceC23338Build);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16282(AbstractC4121 abstractC4121) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo16295(abstractC4121); i++) {
            arrayList.add(mo16281(i, abstractC4121));
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16288(AbstractC19916 abstractC19916) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo16294(abstractC19916); i++) {
            arrayList.add(mo16289(abstractC19916, i));
        }
        return C20195.unmodifiableList(arrayList);
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
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16291(AbstractC4121 abstractC4121) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16293(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14165 mo16283() {
        this.f34221.getClass();
        throw null;
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14165 mo16296(AbstractC19916 abstractC19916) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14165 mo16284(AbstractC19916 abstractC19916, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
    }
}
