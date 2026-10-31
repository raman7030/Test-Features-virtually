package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: l.ܳ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14404 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f44166;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f44167;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
    }

    public C14404(C3822 c3822, Runnable runnable) {
        this.f44166 = c3822;
        this.f44167 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C3822.m11576(this.f44166);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        final C3822 c3822 = this.f44166;
        ((C6644) c3822.f12234.getAdapter()).m18161();
        c3822.f12234.scrollToPosition(0);
        c3822.f12238.m1449();
        Button buttonM1448 = c3822.f12238.m1448();
        if (buttonM1448 != null) {
            buttonM1448.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ۠ܿ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3822.m11571(c3822, view);
                }
            });
        }
        Button buttonM1446 = c3822.f12238.m1446();
        if (buttonM1446 != null) {
            if (c3822.f12236.m16168()) {
                if (ApplicationC20075.f65008.getBoolean("show_install_file_transfer", false)) {
                    buttonM1446.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۠ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3822.m11573(this.f52844.f44166, false);
                        }
                    });
                } else {
                    buttonM1446.setVisibility(8);
                    C3822.m11573(c3822, true);
                }
            } else {
                buttonM1446.setVisibility(8);
            }
        }
        Runnable runnable = this.f44167;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f44166.f12233.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
