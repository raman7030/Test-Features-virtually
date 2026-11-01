package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 37SW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12002 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f33459;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ AbstractC5375 f33460;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ String f33461;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C7978 f33462;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ View f33463;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f33464;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f33465;

    public C12002(C7978 c7978, AbstractActivityC5549 abstractActivityC5549, AbstractC5375 abstractC5375, View view, Runnable runnable, String str, String str2) {
        this.f33462 = c7978;
        this.f33465 = abstractActivityC5549;
        this.f33460 = abstractC5375;
        this.f33463 = view;
        this.f33464 = runnable;
        this.f33461 = str;
        this.f33459 = str2;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22245(this.f33465, R.string.MT_Protector, 100, new Runnable() { // from class: l.۫ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C12002.m27486(this.f39529);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27486(C12002 c12002) {
        c12002.f26234.m33952((Runnable) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f33462.f20974 = this.f33460.mo11749();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C14853 c14853 = this.f26234;
        if (c14853 == null || !c14853.m33960()) {
            AbstractActivityC5549 abstractActivityC5549 = this.f33465;
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46715(this.f33463);
            String strM16224 = C7050.m16224(R.string.MT_Protector);
            final Runnable runnable = this.f33464;
            c20671BuildDialog.m46735(strM16224, new DialogInterface.OnClickListener() { // from class: l.۬ۜ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            c20671BuildDialog.m46719(C7050.m16224(R.string.MT_Protector), (DialogInterface.OnClickListener) null);
            DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            C7978 c7978 = this.f33462;
            c7978.f20975 = dialogInterfaceC2564M46732;
            c7978.f20969.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, c7978.f20974.m48660()));
            c7978.f20976.setAdapter((SpinnerAdapter) new C21438(abstractActivityC5549, c7978.f20974.m48659()));
            String str = this.f33461;
            if (str == null) {
                Spinner spinner = c7978.f20969;
                c7978.f20972 = 0;
                spinner.setSelection(0);
            } else {
                Spinner spinner2 = c7978.f20969;
                int iM18474 = C7978.m18474(c7978, str);
                c7978.f20972 = iM18474;
                spinner2.setSelection(iM18474);
            }
            String str2 = this.f33459;
            if (str2 == null) {
                Spinner spinner3 = c7978.f20976;
                c7978.f20977 = 0;
                spinner3.setSelection(0);
            } else {
                Spinner spinner4 = c7978.f20976;
                int iM18469 = C7978.m18469(c7978, str2);
                c7978.f20977 = iM18469;
                spinner4.setSelection(iM18469);
            }
            C10884.m25071(c7978.f20975);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C14853 c14853 = this.f26234;
        if (c14853 == null || !c14853.m33960()) {
            this.f33465.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
