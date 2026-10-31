package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵ۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAHS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19309 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f60724;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8019 f60725;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f60726;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21134 f60727;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f60728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19309(C8019 c8019, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC21134 runnableC21134) {
        super(main, R.string.MT_Protector);
        this.f60725 = c8019;
        this.f60728 = view;
        this.f60724 = checkBox;
        this.f60726 = checkBox2;
        this.f60727 = runnableC21134;
        if (c8019.f24756) {
            FrameLayout frameLayoutM31286 = m31286();
            frameLayoutM31286.setVisibility(0);
            frameLayoutM31286.addView(view);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
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
        C8019 c8019 = this.f60725;
        boolean z = c8019.f24756 && this.f60724.isChecked();
        boolean z2 = c8019.f24756 && this.f60726.isChecked();
        if (c8019.f24758 || z || z2 || jM40575 != ((InterfaceC17889) c8019.f24757.get(0)).getTime()) {
            C8019.m21335(c8019, this.f60727, jM40575, z, z2);
        }
        m31262();
    }
}
