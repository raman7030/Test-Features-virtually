package l;

/* JADX INFO: renamed from: l.᩻ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes.dex */
public class C23538 extends C8722 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9428 f75589;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23538(C9428 c9428) {
        super(c9428.f28604);
        this.f75589 = c9428;
        this.f26554 = c9428.firstEntry();
    }

    @Override // l.C8722
    /* JADX INFO: renamed from: ᩳ */
    public final void mo22543() {
        C14156 c14156M33770 = this.f26553.m33770();
        this.f26553 = c14156M33770;
        C9428 c9428 = this.f75589;
        if (c9428.f28610 || c14156M33770 == null || Integer.compare(c14156M33770.f17057, c9428.f28609) >= 0) {
            return;
        }
        this.f26553 = null;
    }

    @Override // l.C8722
    /* JADX INFO: renamed from: ܽ */
    public final void mo22542() {
        C14156 c14156M33775 = this.f26554.m33775();
        this.f26554 = c14156M33775;
        C9428 c9428 = this.f75589;
        if (c9428.f28607 || c14156M33775 == null || Integer.compare(c14156M33775.f17057, c9428.f28608) < 0) {
            return;
        }
        this.f26554 = null;
    }
}
