package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;

/* JADX INFO: renamed from: l.ܳ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C16058 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C6001 f47259;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ Runnable f47260;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
    }

    public C16058(C6001 c6001, Runnable runnable) {
        this.f47259 = c6001;
        this.f47260 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C6001.m13512(this.f47259);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        final C6001 c6001 = this.f47259;
        ((C8683) c6001.f15041.getAdapter()).m20113();
        c6001.f15041.scrollToPosition(0);
        c6001.f15045.m3862();
        Button buttonM3861 = c6001.f15045.m3861();
        if (buttonM3861 != null) {
            buttonM3861.setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ۠ܿ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C6001.m13507(c6001, view);
                }
            });
        }
        Button buttonM3859 = c6001.f15045.m3859();
        if (buttonM3859 != null) {
            if (c6001.f15043.m18087()) {
                if (ApplicationC21448.f67649.getBoolean("show_install_file_transfer", false)) {
                    buttonM3859.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ۠ܿ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C6001.m13509(this.f56026.f47259, false);
                        }
                    });
                } else {
                    buttonM3859.setVisibility(8);
                    C6001.m13509(c6001, true);
                }
            } else {
                buttonM3859.setVisibility(8);
            }
        }
        Runnable runnable = this.f47260;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f47259.f15040.m12259(exc, (DialogInterface.OnDismissListener) null);
    }
}
