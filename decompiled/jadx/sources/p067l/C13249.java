package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13249 implements InterfaceC7884 {

    /* JADX INFO: renamed from: ֫ */
    public final C2479 f37216;

    /* JADX INFO: renamed from: ۧ */
    public final C21728 f37217;

    public C13249(C2479 c2479, Class cls) {
        this.f37216 = c2479;
        this.f37217 = ((AbstractC6285) AbstractC6285.m14275(AbstractC6285.m14276(cls, "getDefaultInstance", new Class[0]), (Object) null, new Object[0])).internalGetMapFieldReflection(c2479.getNumber()).mo7260();
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18206(int i, AbstractC6285 abstractC6285) {
        return abstractC6285.internalGetMapFieldReflection(this.f37216.getNumber()).mo7259().get(i);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final int mo18220(AbstractC6285 abstractC6285) {
        return abstractC6285.internalGetMapFieldReflection(this.f37216.getNumber()).mo7259().size();
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18214(AbstractC21296 abstractC21296, int i) {
        return abstractC21296.internalGetMapFieldReflection(this.f37216.getNumber()).mo7259().get(i);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܿ */
    public final int mo18219(AbstractC21296 abstractC21296) {
        return abstractC21296.internalGetMapFieldReflection(this.f37216.getNumber()).mo7259().size();
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18210(AbstractC21296 abstractC21296) {
        ((ArrayList) abstractC21296.internalGetMutableMapFieldReflection(this.f37216.getNumber()).mo7261()).clear();
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18211(AbstractC21296 abstractC21296, int i, Object obj) {
        List listMo7261 = abstractC21296.internalGetMutableMapFieldReflection(this.f37216.getNumber()).mo7261();
        InterfaceC24548 interfaceC24548Build = (InterfaceC24548) obj;
        if (interfaceC24548Build == null) {
            interfaceC24548Build = null;
        } else {
            C21728 c21728 = this.f37217;
            if (!c21728.getClass().isInstance(interfaceC24548Build)) {
                interfaceC24548Build = c21728.toBuilder().mergeFrom(interfaceC24548Build).build();
            }
        }
        ((ArrayList) listMo7261).set(i, interfaceC24548Build);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final void mo18215(AbstractC21296 abstractC21296, Object obj) {
        List listMo7261 = abstractC21296.internalGetMutableMapFieldReflection(this.f37216.getNumber()).mo7261();
        InterfaceC24548 interfaceC24548Build = (InterfaceC24548) obj;
        if (interfaceC24548Build == null) {
            interfaceC24548Build = null;
        } else {
            C21728 c21728 = this.f37217;
            if (!c21728.getClass().isInstance(interfaceC24548Build)) {
                interfaceC24548Build = c21728.toBuilder().mergeFrom(interfaceC24548Build).build();
            }
        }
        ((ArrayList) listMo7261).add(interfaceC24548Build);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18207(AbstractC6285 abstractC6285) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo18220(abstractC6285); i++) {
            arrayList.add(mo18206(i, abstractC6285));
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18213(AbstractC21296 abstractC21296) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo18219(abstractC21296); i++) {
            arrayList.add(mo18214(abstractC21296, i));
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public final Object mo18217(AbstractC6285 abstractC6285) {
        return mo18207(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18212(AbstractC21296 abstractC21296, Object obj) {
        mo18210(abstractC21296);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo18215(abstractC21296, it.next());
        }
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18216(AbstractC6285 abstractC6285) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18218(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18208() {
        this.f37217.getClass();
        throw null;
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15830 mo18221(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18209(AbstractC21296 abstractC21296, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
    }
}
