package l;

import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.᩵ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5KK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19547 extends AbstractViewOnClickListenerC12490 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Set f63206;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C5242 f63205 = new C5242();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C5242 f63204 = new C5242();

    /* JADX WARN: Illegal instructions before constructor call */
    public C19547(Main main, C3318 c3318) {
        String strM14327 = C4925.m14327(R.string.MT_Protector);
        super(main, strM14327, strM14327, c3318);
        this.f63206 = C20195.synchronizedSet(Collections.newSetFromMap(new IdentityHashMap()));
        if (C19890.f64278) {
            m44963();
        }
        C9068.m23406(main, new C9669(0, this, c3318));
        f63204.m1668(main, new C23620(1, this, c3318));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44962(C19547 c19547, C3318 c3318) {
        if (C19890.f64278) {
            c19547.m44963();
            c3318.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44961(C19547 c19547, C3318 c3318) {
        if (C19890.f64278) {
            c19547.m44963();
            c3318.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ܽ */
    public final int mo15528() {
        if (C19890.f64278) {
            return super.mo15528();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44963() {
        ArrayList arrayList = this.f37525;
        arrayList.clear();
        C6951 c6951M23422 = C9068.m23422();
        int iM18793 = c6951M23422.m18793();
        for (int i = 0; i < iM18793; i++) {
            arrayList.add(new C4024(this, this.f34527, c6951M23422.m18789(i)));
        }
    }

    @Override // l.AbstractViewOnClickListenerC12490
    /* JADX INFO: renamed from: ֫ */
    public final void mo2774(AbstractViewOnLongClickListenerC14606 abstractViewOnLongClickListenerC14606, int i) {
        C18841 c18841 = (C18841) abstractViewOnLongClickListenerC14606;
        C4024 c4024 = (C4024) this.f37525.get(i);
        c18841.f59428 = c4024;
        C10402 c10402 = c18841.f44704;
        TextView textView = c18841.f44700;
        c18841.f44703.setText(c4024.f12771.m39592());
        C17534 c17534M39598 = c4024.f12771.m39598();
        if (c17534M39598 == null) {
            textView.setText(c4024.f12771.m39588());
        } else {
            AbstractC3577 abstractC3577M31047 = C12749.m31047(c17534M39598.m40974());
            if (abstractC3577M31047 == null) {
                textView.setText("error " + c4024.f12771.m39588());
            } else {
                textView.setText(abstractC3577M31047.mo6371() + c4024.f12771.m39588());
            }
        }
        c10402.setTag(c4024.f12771);
        c10402.m26232(c4024.m12101());
        if (c4024.f12771.m39598() == null && c4024.f12771.m39597() == null) {
            C16828 c16828 = c4024.f12771;
            if (this.f63206.add(c16828)) {
                C1802.f6208.execute(new RunnableC16017(this, c16828.m39588(), c18841, c16828, 0));
            }
        }
        c18841.itemView.setOnClickListener(c4024);
        this.f37526.m10148((AbstractViewOnLongClickListenerC14606) c18841);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44960(final C19547 c19547, final String str, final C18841 c18841, final C16828 c16828) {
        C19883 c19883M7317;
        Set set = c19547.f63206;
        try {
            try {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
                if (!abstractC15440M39866.mo23120()) {
                    c19883M7317 = C2204.m7292(str, true).m7317();
                } else {
                    c19883M7317 = C20844.f67485.mo11258(new C9555(abstractC15440M39866));
                }
            } catch (RuntimeException unused) {
                c19883M7317 = C2204.m7292(str, true).m7317();
            }
            final C19883 c19883 = c19883M7317;
            C4925.m14315(new Runnable() { // from class: l.ۖܶܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8247.getClass();
                    C16828 c16829 = c16828;
                    if (str.equals(c16829.m39588())) {
                        C19883 c19884 = c19883;
                        c16829.m39584(c19884);
                        C18841 c18842 = c18841;
                        C4024 c4024 = c18842.f59428;
                        C10402 c10402 = c18842.f44704;
                        if (c4024 != null && c18842.f59428.f12771 == c16829 && c10402.getTag() == c16829) {
                            c10402.m26232(c19884.f64248);
                        }
                    }
                }
            });
        } finally {
            set.remove(c16828);
        }
    }
}
