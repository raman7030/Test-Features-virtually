package p067l;

/* JADX INFO: renamed from: l.ܳᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public class C16342 implements InterfaceC7884 {

    /* JADX INFO: renamed from: ֫ */
    public final C2479 f48019;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f48020;

    /* JADX INFO: renamed from: ܽ */
    public final C19025 f48021;

    /* JADX INFO: renamed from: ܿ */
    public final Class f48022;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f48023;

    public C16342(C2479 c2479, String str, Class cls, Class cls2, String str2) {
        boolean z = c2479.m3549() != null;
        this.f48023 = z;
        boolean zM3546 = c2479.m3546();
        this.f48020 = zM3546;
        C19025 c19025 = new C19025(str, cls, cls2, str2, z, zM3546);
        this.f48019 = c2479;
        this.f48022 = c19025.f56721.getReturnType();
        this.f48021 = c19025;
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public Object mo18207(AbstractC6285 abstractC6285) {
        return this.f48021.m43221(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public Object mo18213(AbstractC21296 abstractC21296) {
        return this.f48021.m43225(abstractC21296);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public Object mo18217(AbstractC6285 abstractC6285) {
        return mo18207(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public void mo18212(AbstractC21296 abstractC21296, Object obj) {
        this.f48021.m43223(abstractC21296, obj);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18206(int i, AbstractC6285 abstractC6285) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18214(AbstractC21296 abstractC21296, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18211(AbstractC21296 abstractC21296, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final void mo18215(AbstractC21296 abstractC21296, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo18216(AbstractC6285 abstractC6285) {
        boolean z = this.f48020;
        C19025 c19025 = this.f48021;
        if (!z) {
            boolean z2 = this.f48023;
            C2479 c2479 = this.f48019;
            if (z2) {
                return c19025.m43224(abstractC6285) == c2479.getNumber();
            }
            return !mo18207(abstractC6285).equals(c2479.m3523());
        }
        return c19025.m43227(abstractC6285);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo18218(AbstractC21296 abstractC21296) {
        boolean z = this.f48020;
        C19025 c19025 = this.f48021;
        if (!z) {
            boolean z2 = this.f48023;
            C2479 c2479 = this.f48019;
            if (z2) {
                return c19025.m43226(abstractC21296) == c2479.getNumber();
            }
            return !mo18213(abstractC21296).equals(c2479.m3523());
        }
        return c19025.m43228(abstractC21296);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final int mo18220(AbstractC6285 abstractC6285) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܿ */
    public final int mo18219(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18210(AbstractC21296 abstractC21296) {
        this.f48021.m43222(abstractC21296);
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15830 mo18208() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC15830 mo18221(AbstractC21296 abstractC21296) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18209(AbstractC21296 abstractC21296, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }
}
