package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩺֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAP3 */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnClickListenerC23890 implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C12096 f75872;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12096 f75873;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16903 f75874;

    /* JADX INFO: renamed from: ᩸ */
    public C10748 f75875 = C10748.m24758();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC4244 f75876;

    public ViewOnClickListenerC23890(C16903 c16903, C12096 c12096, C12096 c12097, InterfaceC4244 interfaceC4244) {
        this.f75874 = c16903;
        this.f75872 = c12096;
        this.f75873 = c12097;
        this.f75876 = interfaceC4244;
    }

    @Override // android.view.View.OnClickListener
    @InterfaceC1080
    public void onClick(View view) {
        C12962 c12962M38465 = this.f75874.m38465();
        C12096 c12096 = this.f75872;
        boolean zHasFocus = c12096.hasFocus();
        C10748 c10748 = this.f75875;
        C12096 c12097 = this.f75873;
        if ((zHasFocus || c12097.hasFocus()) && c12962M38465.mo29723()) {
            if (!c12096.hasFocus()) {
                c12096 = c12097;
            }
            if (c12962M38465.mo15922() || !c10748.m24763()) {
                c12962M38465.mo15921(view, c12096);
                return;
            }
            return;
        }
        if (c12962M38465.mo15922() || !c10748.m24763()) {
            c12962M38465.mo15920(view, this.f75876);
        }
    }

    @Override // android.view.View.OnLongClickListener
    @InterfaceC1080
    public boolean onLongClick(View view) {
        C12962 c12962M38464 = this.f75874.m38464();
        if (c12962M38464 == null) {
            return false;
        }
        C12096 c12096 = this.f75872;
        boolean zHasFocus = c12096.hasFocus();
        C12096 c12097 = this.f75873;
        if ((zHasFocus || c12097.hasFocus()) && c12962M38464.mo29723()) {
            if (!c12096.hasFocus()) {
                c12096 = c12097;
            }
            c12962M38464.mo15921(view, c12096);
            return true;
        }
        c12962M38464.mo15920(view, this.f75876);
        return true;
    }
}
