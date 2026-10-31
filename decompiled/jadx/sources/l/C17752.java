package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17752 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f54305;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23396 f54306;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f54307;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f54308;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f54309;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17752(C23396 c23396, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC1000 runnableC1000) {
        super(main, R.string.MT_Protector);
        this.f54306 = c23396;
        this.f54309 = view;
        this.f54305 = checkBox;
        this.f54307 = checkBox2;
        this.f54308 = runnableC1000;
        if (c23396.f75152) {
            FrameLayout frameLayoutM31286 = m31286();
            frameLayoutM31286.setVisibility(0);
            frameLayoutM31286.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        C23396 c23396 = this.f54306;
        String strTrim = m31260().trim();
        if (strTrim.isEmpty()) {
            m31262();
            return;
        }
        long jM40575 = C17283.m40575(strTrim);
        if (jM40575 < 0) {
            m31263(R.string.MT_Protector);
            return;
        }
        try {
            C17721.m41503(c23396.f75155.m38991(), EnumC16309.MODIFY_DIRECTORY_LINKED);
            boolean z = false;
            boolean z2 = c23396.f75152 && this.f54305.isChecked();
            if (c23396.f75152 && this.f54307.isChecked()) {
                z = true;
            }
            if (c23396.f75154 || z2 || z || jM40575 != ((InterfaceC17889) c23396.f75153.get(0)).getTime()) {
                new C17046(c23396, jM40575, z2, z, this.f54308).m20274();
            }
            m31262();
        } catch (C1637 e) {
            c23396.f75155.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
