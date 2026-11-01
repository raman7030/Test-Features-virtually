package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.۫۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC14051 implements Runnable, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᩹ܽۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f82168;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Main f39618;

    /* JADX INFO: renamed from: ᩸ */
    public String f39619;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f39620;

    static {
        ApplicationC14266.m56479(96);
        f82168 = new short[]{3615, 7820, 7837, 7839, 7831, 7837, 7835, 7833, -27238, 19126, -27381, 19459, 17781, -27079, -30302, 30111, 27828, 26744, 7857, 7848, 25949, 27386, 18580, -7683, -26079, -30360, 31970, 7875, 7875, 7875, 7837, 7826, 7832, 7822, 7827, 7829, 7832, 7890, 7829, 7826, 7816, 7833, 7826, 7816, 7890, 7837, 7839, 7816, 7829, 7827, 7826, 7890, 7850, 7861, 7865, 7851, 7890, 7816, 7812, 7816, 7816, 7833, 7812, 7816, 7891, 7820, 7824, 7837, 7829, 7826, 17828, 18900, 30111, 18900, 31899, -26960, 20487, 19549, 26744, 17669, -27359, 30394, -7696, 20721, -28377, -26960, 31611, 20490, 19659, 31564, 7838, 7829, 7826, 7890, 7825, 7816, 7890, 7820, 7824, 7817, 7823, 7838, 7829, 7826, 7890, 7825, 7816, 7890, 7820, 7824, 7817, 7823, 7890, 7839, 7837, 7826, 7837, 7822, 7813, 7837, 7826, 7832, 7822, 7827, 7829, 7832, 7890, 7829, 7826, 7816, 7833, 7826, 7816, 7890, 7837, 7839, 7816, 7829, 7827, 7826, 7890, 7864, 7865, 7856, 7865, 7848, 7865};
    }

    /* JADX INFO: renamed from: ֫ */
    private native void m31884(Object obj);

    @Override // android.content.DialogInterface.OnDismissListener
    public native void onDismiss(DialogInterface dialogInterface);

    public RunnableC14051(Main main) {
        this.f39618 = main;
    }

    @Override // java.lang.Runnable
    public final void run() {
        onDismiss(null);
    }
}
