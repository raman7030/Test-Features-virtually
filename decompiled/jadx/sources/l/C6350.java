package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C6350 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC13405 f19665;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f19666;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f19667;

    public C6350(View view, RunnableC13405 runnableC13405) {
        this.f19666 = view;
        this.f19665 = runnableC13405;
        view.setVisibility(8);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6350.m17631(this.f31775);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17633() {
        return this.f19667;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17631(C6350 c6350) {
        if (c6350.f19667) {
            c6350.f19667 = false;
            c6350.f19666.setVisibility(8);
            c6350.f19665.run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17632() {
        if (this.f19667) {
            return;
        }
        this.f19667 = true;
        this.f19666.setVisibility(0);
        this.f19665.run();
    }
}
