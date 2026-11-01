package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19240 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ CheckBox f57499;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C24604 f57500;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ CheckBox f57501;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ RunnableC3319 f57502;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ View f57503;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19240(C24604 c24604, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC3319 runnableC3319) {
        super(main, R.string.MT_Protector);
        this.f57500 = c24604;
        this.f57503 = view;
        this.f57499 = checkBox;
        this.f57501 = checkBox2;
        this.f57502 = runnableC3319;
        if (c24604.f77898) {
            FrameLayout frameLayoutM33372 = m33372();
            frameLayoutM33372.setVisibility(0);
            frameLayoutM33372.addView(view);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        C24604 c24604 = this.f57500;
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
        try {
            C19210.m43749(c24604.f77901.m41217(), EnumC17868.MODIFY_DIRECTORY_LINKED);
            boolean z = false;
            boolean z2 = c24604.f77898 && this.f57499.isChecked();
            if (c24604.f77898 && this.f57501.isChecked()) {
                z = true;
            }
            if (c24604.f77900 || z2 || z || jM42826 != ((InterfaceC19370) c24604.f77899.get(0)).getTime()) {
                new C18569(c24604, jM42826, z2, z, this.f57502).m22250();
            }
            m33348();
        } catch (C3924 e) {
            c24604.f77901.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
