package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C8404 {

    /* JADX INFO: renamed from: ֫ */
    public final RunnableC15109 f22537;

    /* JADX INFO: renamed from: ۧ */
    public final View f22538;

    /* JADX INFO: renamed from: ܽ */
    public boolean f22539;

    public C8404(View view, RunnableC15109 runnableC15109) {
        this.f22538 = view;
        this.f22537 = runnableC15109;
        view.setVisibility(8);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8404.m19571(this.f34745);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19573() {
        return this.f22539;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19571(C8404 c8404) {
        if (c8404.f22539) {
            c8404.f22539 = false;
            c8404.f22538.setVisibility(8);
            c8404.f22537.run();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19572() {
        if (this.f22539) {
            return;
        }
        this.f22539 = true;
        this.f22538.setVisibility(0);
        this.f22537.run();
    }
}
