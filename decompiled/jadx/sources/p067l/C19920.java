package p067l;

import android.widget.TextView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩴۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5L3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19920 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC20591 f60486;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.ۖۖۡ] */
    public C19920(ViewOnClickListenerC20591 viewOnClickListenerC20591, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f60486 = viewOnClickListenerC20591;
        m33359(C7050.m16203(R.string.MT_Protector, 10));
        m33343();
        m33369(C23223.f72980);
        final TextView textViewM33341 = m33341();
        textViewM33341.setVisibility(8);
        m33335(new C5838(new Runnable() { // from class: l.ۖۖۡ
            @Override // java.lang.Runnable
            public final void run() {
                C19920 c19920 = this.f10095;
                int iM16521 = c19920.f60486.f63654.m16521();
                TextView textView = textViewM33341;
                if (iM16521 > 0) {
                    try {
                        if (Integer.parseInt(c19920.m33346()) <= 10) {
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

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        C7179 c7179 = this.f60486.f63654;
        String strM33346 = m33346();
        if (strM33346.isEmpty()) {
            m33348();
            return;
        }
        try {
            int i = Integer.parseInt(strM33346);
            if (i < 0) {
                throw new NumberFormatException();
            }
            while (c7179.f18755.m5407() > i) {
                c7179.f18755.m5405();
            }
            c7179.f18755.m5408();
            C7179.m16503(c7179);
            c7179.m16520();
            m33348();
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
