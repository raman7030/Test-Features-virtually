package p067l;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes5.dex */
public class C17305 extends AbstractC5907 {

    /* JADX INFO: renamed from: ۤ֫ */
    public C8331 f51607;

    /* JADX INFO: renamed from: ۫֫ */
    public AbstractDialogInterfaceOnClickListenerC14580 f51608;

    public C17305(Context context) {
        super(context);
        m39219();
    }

    public C17305(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m39219();
    }

    public C17305(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m39219();
    }

    public C17305(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m39219();
    }

    /* JADX INFO: renamed from: ۢ֫ */
    private void m39219() {
        AbstractActivityC5549 abstractActivityC5549 = (AbstractActivityC5549) C7453.m17221(m9012());
        if (abstractActivityC5549 != null) {
            this.f51607 = ViewOnClickListenerC20541.m46366(abstractActivityC5549, new C19368(this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39218(C17305 c17305, String str) {
        if (c17305.f51608 != null) {
            if (str.length() > 1 && str.endsWith("/")) {
                str = C17073.m38720(1, 0, str);
            }
            c17305.f51608.m33336((CharSequence) str);
            c17305.f51608.m33328();
        }
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        C10601 c10601 = new C10601(this, abstractActivityC5549);
        c10601.m33350((CharSequence) m9035().toString());
        c10601.m33354(1000);
        c10601.m33336((CharSequence) m13265().getString(m9037(), "/sdcard/MT2"));
        c10601.m33365(6);
        c10601.m33330();
        c10601.m33328();
        this.f51608 = c10601;
        if (this.f51607 != null) {
            Button buttonM33361 = c10601.m33361();
            buttonM33361.setVisibility(0);
            buttonM33361.setOnClickListener(new ViewOnClickListenerC4111(3, this));
        }
        this.f51608.m33352(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39217(C17305 c17305) {
        c17305.f51607.m38698(0, R.string.MT_Protector, c17305.f51608.m33346(), (String) null, (String[]) null, (Bundle) null);
    }
}
