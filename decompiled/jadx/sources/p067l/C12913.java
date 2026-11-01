package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C12913 extends AbstractC11489 {

    /* JADX INFO: renamed from: ֫ */
    public int f36304;

    /* JADX INFO: renamed from: ܿ */
    public int f36307;

    /* JADX INFO: renamed from: ᩳ */
    public C12913 f36308 = null;

    /* JADX INFO: renamed from: ܽ */
    public C12913 f36306 = null;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f36305 = new ArrayList();

    public C12913(int i, int i2) {
        this.f36307 = i;
        this.f36304 = i2;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ֫ */
    public final int mo16459() {
        return this.f36307;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ܽ */
    public final int mo16461() {
        return this.f36304 - this.f36307;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ۧ */
    public final List mo16460() {
        return this.f36305;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12913 m29592(int i) {
        int i2 = this.f36304;
        ArrayList arrayList = this.f36305;
        C12913 c12913 = new C12913();
        c12913.f36308 = null;
        c12913.f36306 = null;
        c12913.f36305 = new ArrayList();
        c12913.f36307 = i;
        c12913.f36304 = i2;
        arrayList.getClass();
        c12913.f36305 = new ArrayList(arrayList);
        this.f36304 = i;
        C12913 c12914 = this.f36306;
        c12914.f36308 = c12913;
        c12913.f36306 = c12914;
        c12913.f36308 = this;
        this.f36306 = c12913;
        return c12913;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29593(C12913 c12913) {
        C12913 c12914 = this.f36308;
        c12914.f36306 = c12913;
        c12913.f36308 = c12914;
        c12913.f36306 = this;
        this.f36308 = c12913;
    }
}
