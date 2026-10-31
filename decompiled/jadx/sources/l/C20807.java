package l;

import android.content.ContextWrapper;

/* JADX INFO: renamed from: l.᩷ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes4.dex */
public final class C20807 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C10929 f67368;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67369;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8812 f67370;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f67373;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18045 f67367 = C18045.f56239;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15160 f67372 = InterfaceC23628.f76567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21512 f67371 = InterfaceC6695.f20806;

    public C20807(ContextWrapper contextWrapper) {
        this.f67373 = contextWrapper;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47623(InterfaceC0053[] interfaceC0053Arr) {
        this.f67370 = new C8812(interfaceC0053Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8106 m47622() {
        C22632.m50634(!this.f67369);
        this.f67369 = true;
        if (this.f67370 == null) {
            this.f67370 = new C8812(new InterfaceC0053[0]);
        }
        if (this.f67368 == null) {
            this.f67368 = new C10929(this.f67373);
        }
        return new C8106(this);
    }
}
