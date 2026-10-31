package l;

import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18468 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19174 f57266;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ۖۖۡ] */
    public C18468(ViewOnClickListenerC19174 viewOnClickListenerC19174, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f57266 = viewOnClickListenerC19174;
        m31273(C4925.m14306(R.string.MT_Protector, 10));
        m31257();
        m31283(C21943.f70269);
        final TextView textViewM31255 = m31255();
        textViewM31255.setVisibility(8);
        m31249(new C3651(new Runnable() { // from class: l.ۖۖۡ
            @Override // java.lang.Runnable
            public final void run() {
                C18468 c18468 = this.f7307;
                int iM14614 = c18468.f57266.f60423.m14614();
                TextView textView = textViewM31255;
                if (iM14614 > 0) {
                    try {
                        if (Integer.parseInt(c18468.m31260()) <= 10) {
                            textView.setVisibility(0);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                textView.setVisibility(8);
            }
        }));
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        C5062 c5062 = this.f57266.f60423;
        String strM31260 = m31260();
        if (strM31260.isEmpty()) {
            m31262();
            return;
        }
        try {
            int i = Integer.parseInt(strM31260);
            if (i < 0) {
                throw new NumberFormatException();
            }
            while (c5062.f15919.m3093() > i) {
                c5062.f15919.m3091();
            }
            c5062.f15919.m3094();
            C5062.m14596(c5062);
            c5062.m14613();
            m31262();
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
