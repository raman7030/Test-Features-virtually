package l;

import android.content.Context;

/* JADX INFO: renamed from: l.᩷᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21208 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f68338;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f68339 = InterfaceC16427.f50519;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC14164 f68340;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f68341;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4979 f68342;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68343;

    public C21208(Context context, C4979 c4979) {
        this.f68341 = context.getApplicationContext();
        this.f68342 = c4979;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48154() {
        this.f68343 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48153(InterfaceC16427 interfaceC16427) {
        this.f68339 = interfaceC16427;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1451 m48152() {
        C22632.m50634(!this.f68338);
        if (this.f68340 == null) {
            this.f68340 = new C0745();
        }
        C1451 c1451 = new C1451(this);
        this.f68338 = true;
        return c1451;
    }
}
