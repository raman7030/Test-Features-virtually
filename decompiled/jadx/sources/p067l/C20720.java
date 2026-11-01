package p067l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20720 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ CheckBox f63954;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C9990 f63955;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ CheckBox f63956;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ RunnableC22455 f63957;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ View f63958;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20720(C9990 c9990, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC22455 runnableC22455) {
        super(main, R.string.MT_Protector);
        this.f63955 = c9990;
        this.f63958 = view;
        this.f63954 = checkBox;
        this.f63956 = checkBox2;
        this.f63957 = runnableC22455;
        if (c9990.f27670) {
            FrameLayout frameLayoutM33372 = m33372();
            frameLayoutM33372.setVisibility(0);
            frameLayoutM33372.addView(view);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (strTrim.isEmpty()) {
            m33348();
            return;
        }
        long jM42826 = C18794.m42826(strTrim);
        if (jM42826 < 0) {
            m33349(R.string.MT_Protector);
            return;
        }
        C9990 c9990 = this.f63955;
        boolean z = c9990.f27670 && this.f63954.isChecked();
        boolean z2 = c9990.f27670 && this.f63956.isChecked();
        if (c9990.f27672 || z || z2 || jM42826 != ((InterfaceC19370) c9990.f27671.get(0)).getTime()) {
            C9990.m23301(c9990, this.f63957, jM42826, z, z2);
        }
        m33348();
    }
}
