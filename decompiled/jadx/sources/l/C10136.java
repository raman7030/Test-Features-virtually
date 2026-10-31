package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10136 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f30498;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30499;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5902 f30500;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f30501;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f30502;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f30503;

    public C10136(C5902 c5902, AbstractActivityC3346 abstractActivityC3346, AbstractC3163 abstractC3163, View view, Runnable runnable, String str, String str2) {
        this.f30500 = c5902;
        this.f30503 = abstractActivityC3346;
        this.f30498 = abstractC3163;
        this.f30501 = view;
        this.f30502 = runnable;
        this.f30499 = str;
        this.f30497 = str2;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20269(this.f30503, R.string.MT_Protector, 100, new Runnable() { // from class: l.۫ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C10136.m25467(this.f36512);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25467(C10136 c10136) {
        c10136.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f30500.f18119 = this.f30498.mo9705();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C13136 c13136 = this.f23322;
        if (c13136 == null || !c13136.m31868()) {
            AbstractActivityC3346 abstractActivityC3346 = this.f30503;
            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
            c19258BuildDialog.m44421(this.f30501);
            String strM14327 = C4925.m14327(R.string.MT_Protector);
            final Runnable runnable = this.f30502;
            c19258BuildDialog.m44441(strM14327, new DialogInterface.OnClickListener() { // from class: l.۬ۜ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            c19258BuildDialog.m44425(C4925.m14327(R.string.MT_Protector), (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            C5902 c5902 = this.f30500;
            c5902.f18120 = dialogInterfaceC0206M44438;
            c5902.f18114.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, c5902.f18119.m46344()));
            c5902.f18121.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, c5902.f18119.m46343()));
            String str = this.f30499;
            if (str == null) {
                Spinner spinner = c5902.f18114;
                c5902.f18117 = 0;
                spinner.setSelection(0);
            } else {
                Spinner spinner2 = c5902.f18114;
                int iM16548 = C5902.m16548(c5902, str);
                c5902.f18117 = iM16548;
                spinner2.setSelection(iM16548);
            }
            String str2 = this.f30497;
            if (str2 == null) {
                Spinner spinner3 = c5902.f18121;
                c5902.f18122 = 0;
                spinner3.setSelection(0);
            } else {
                Spinner spinner4 = c5902.f18121;
                int iM16543 = C5902.m16543(c5902, str2);
                c5902.f18122 = iM16543;
                spinner4.setSelection(iM16543);
            }
            C8960.m23097(c5902.f18120);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C13136 c13136 = this.f23322;
        if (c13136 == null || !c13136.m31868()) {
            this.f30503.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
