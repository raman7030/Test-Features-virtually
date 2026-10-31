package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11095 extends AbstractC9597 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f33302;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33305;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11095 f33306 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11095 f33304 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f33303 = new ArrayList();

    public C11095(int i, int i2) {
        this.f33305 = i;
        this.f33302 = i2;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ֫ */
    public final int mo14555() {
        return this.f33305;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ܽ */
    public final int mo14557() {
        return this.f33302 - this.f33305;
    }

    @Override // l.InterfaceC5038
    /* JADX INFO: renamed from: ۧ */
    public final List mo14556() {
        return this.f33303;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11095 m27530(int i) {
        int i2 = this.f33302;
        ArrayList arrayList = this.f33303;
        C11095 c11095 = new C11095();
        c11095.f33306 = null;
        c11095.f33304 = null;
        c11095.f33303 = new ArrayList();
        c11095.f33305 = i;
        c11095.f33302 = i2;
        arrayList.getClass();
        c11095.f33303 = new ArrayList(arrayList);
        this.f33302 = i;
        C11095 c11096 = this.f33304;
        c11096.f33306 = c11095;
        c11095.f33304 = c11096;
        c11095.f33306 = this;
        this.f33304 = c11095;
        return c11095;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27531(C11095 c11095) {
        C11095 c11096 = this.f33306;
        c11096.f33304 = c11095;
        c11095.f33306 = c11096;
        c11095.f33304 = this;
        this.f33306 = c11095;
    }
}
