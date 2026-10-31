package l;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes5.dex */
public class C15716 extends AbstractC3723 {

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C6273 f48467;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC12849 f48468;

    public C15716(Context context) {
        super(context);
        m37050();
    }

    public C15716(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37050();
    }

    public C15716(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m37050();
    }

    public C15716(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m37050();
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m37050() {
        AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) C5350.m15313(m6886());
        if (abstractActivityC3346 != null) {
            this.f48467 = ViewOnClickListenerC19121.m44072(abstractActivityC3346, new C17887(this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37049(C15716 c15716, String str) {
        if (c15716.f48468 != null) {
            if (str.length() > 1 && str.endsWith("/")) {
                str = C15472.m36561(1, 0, str);
            }
            c15716.f48468.m31250((CharSequence) str);
            c15716.f48468.m31242();
        }
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        C8662 c8662 = new C8662(this, abstractActivityC3346);
        c8662.m31264((CharSequence) m6909().toString());
        c8662.m31268(1000);
        c8662.m31250((CharSequence) m11313().getString(m6911(), "/sdcard/MT2"));
        c8662.m31279(6);
        c8662.m31244();
        c8662.m31242();
        this.f48468 = c8662;
        if (this.f48467 != null) {
            Button buttonM31275 = c8662.m31275();
            buttonM31275.setVisibility(0);
            buttonM31275.setOnClickListener(new ViewOnClickListenerC1833(3, this));
        }
        this.f48468.m31266(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37048(C15716 c15716) {
        c15716.f48467.m36540(0, R.string.MT_Protector, c15716.f48468.m31260(), (String) null, (String[]) null, (Bundle) null);
    }
}
