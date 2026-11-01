package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۧᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C12991 implements InterfaceC7884 {

    /* JADX INFO: renamed from: ֫ */
    public final C4273 f36547;

    /* JADX INFO: renamed from: ۧ */
    public final Class f36548;

    public C12991(Class cls, Class cls2, String str) {
        C4273 c4273 = new C4273(cls, cls2, str);
        this.f36548 = c4273.f9495.getReturnType();
        this.f36547 = c4273;
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public Object mo18207(AbstractC6285 abstractC6285) {
        return this.f36547.m8682(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public Object mo18213(AbstractC21296 abstractC21296) {
        return this.f36547.m8688(abstractC21296);
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
    /* JADX INFO: renamed from: ֫ */
    public Object mo18206(int i, AbstractC6285 abstractC6285) {
        return this.f36547.m8681(i, abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public Object mo18214(AbstractC21296 abstractC21296, int i) {
        return this.f36547.m8683(abstractC21296, i);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public void mo18211(AbstractC21296 abstractC21296, int i, Object obj) {
        this.f36547.m8685(abstractC21296, i, obj);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public void mo18215(AbstractC21296 abstractC21296, Object obj) {
        this.f36547.m8686(abstractC21296, obj);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18216(AbstractC6285 abstractC6285) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18218(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final int mo18220(AbstractC6285 abstractC6285) {
        return this.f36547.m8687(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܿ */
    public final int mo18219(AbstractC21296 abstractC21296) {
        return this.f36547.m8689(abstractC21296);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18210(AbstractC21296 abstractC21296) {
        this.f36547.m8684(abstractC21296);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15830 mo18208() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15830 mo18221(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15830 mo18209(AbstractC21296 abstractC21296, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
