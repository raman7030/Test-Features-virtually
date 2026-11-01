package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6065 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f15250;

    /* JADX INFO: renamed from: ܳ */
    public C15419 f15251;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ String f15252;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16792 f15253;

    public C6065(C16792 c16792, String str, boolean z) {
        this.f15253 = c16792;
        this.f15252 = str;
        this.f15250 = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۖۤ᩻] */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ?? r0 = new Runnable() { // from class: l.ۖۤ᩻
            @Override // java.lang.Runnable
            public final void run() {
                this.f10682.m22249();
            }
        };
        C16792 c16792 = this.f15253;
        c16792.f49489 = r0;
        m22248(c16792.f49483, 200);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C15419 c15419M50828 = C22711.m50828(this.f15252);
        this.f15251 = c15419M50828;
        if ((c15419M50828.f44089 == EnumC8890.DIRECTORY) != this.f15250) {
            throw new IllegalArgumentException("Selected rule target type has changed");
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C16792 c16792 = this.f15253;
        if (c16792.m38057()) {
            C16792.m38046(c16792, this.f15251, true);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f15253.m38057()) {
            C22682.m50793(exc instanceof IOException ? R.string.MT_Protector : R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C16792 c16792 = this.f15253;
        c16792.f49487 = false;
        m22249();
        c16792.f49489 = null;
    }
}
