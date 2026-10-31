package l;

import android.text.Selection;

/* JADX INFO: renamed from: l.۫᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public final class C12683 implements InterfaceC7702 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10567 f38200;

    public C12683(C10567 c10567) {
        this.f38200 = c10567;
    }

    @Override // l.InterfaceC7702
    /* JADX INFO: renamed from: ֫ */
    public final void mo20618(C5089 c5089) {
        C10567 c10567 = this.f38200;
        c10567.getClass();
        if (c5089.m14642() >= 0 && c5089.m14640() >= 0) {
            c10567.setSelection(c5089.m14642(), c5089.m14640());
            return;
        }
        if (c5089.m14642() < 0) {
            c10567.removeSpan(Selection.SELECTION_START);
        } else {
            c10567.setSpan(Selection.SELECTION_START, Math.min(c5089.m14642(), c10567.length()), Math.min(c5089.m14642(), c10567.length()), 34);
        }
        if (c5089.m14640() < 0) {
            c10567.removeSpan(Selection.SELECTION_END);
        } else {
            c10567.setSpan(Selection.SELECTION_END, Math.min(c5089.m14640(), c10567.length()), Math.min(c5089.m14640(), c10567.length()), 34);
        }
    }

    @Override // l.InterfaceC7702
    /* JADX INFO: renamed from: ֫ */
    public final void mo20619(C10776 c10776, int i, int i2, C13409 c13409) {
        this.f38200.m26540(i, i2, c13409, 0, c13409.length(), c10776);
    }
}
