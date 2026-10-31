package l;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6295 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f19457;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1607 f19458;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f19459;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14306 f19460;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295(C1607 c1607, Main main, boolean z, CheckBox checkBox, ViewGroup viewGroup, String str, RunnableC14306 runnableC14306) {
        super(main, R.string.MT_Protector);
        this.f19458 = c1607;
        this.f19457 = z;
        this.f19459 = checkBox;
        this.f19461 = str;
        this.f19460 = runnableC14306;
        if (z) {
            if (!c1607.f5663) {
                checkBox.setVisibility(8);
            }
            Main mainM39056 = c1607.f5665.m39056();
            CheckBox checkBox2 = (CheckBox) mainM39056.m10216(R.layout.MT_Protector);
            viewGroup.addView(checkBox2);
            C10025.m25194(mainM39056, checkBox2, str);
        }
        if (c1607.f5663 || z) {
            FrameLayout frameLayoutM31286 = m31286();
            frameLayoutM31286.setVisibility(0);
            frameLayoutM31286.addView(viewGroup);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        C1607 c1607 = this.f19458;
        String strTrim = m31260().trim();
        if (strTrim.isEmpty()) {
            m31262();
            return;
        }
        final long jM40575 = C17283.m40575(strTrim);
        if (jM40575 < 0) {
            m31263(R.string.MT_Protector);
            return;
        }
        try {
            C17721.m41504(c1607.f5664, EnumC16309.MODIFY_FILE);
            final boolean z = c1607.f5663 && this.f19459.isChecked();
            if (c1607.f5668 || z || jM40575 != ((C12645) c1607.f5666.get(0)).getTime()) {
                boolean z2 = this.f19457;
                final RunnableC14306 runnableC14306 = this.f19460;
                if (z2) {
                    C10025.m25197(new InterfaceC12846() { // from class: l.ۤ᩶᩻
                        @Override // l.InterfaceC12846
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // l.InterfaceC12846
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo3777(Exception exc) {
                            return false;
                        }

                        @Override // l.InterfaceC12846
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo3776(C11667 c11667, boolean z3) {
                            C1607.m5467(this.f31559.f19458, runnableC14306, jM40575, z, c11667, z3);
                        }
                    }, c1607.f5665.m39056(), this.f19461);
                } else {
                    C1607.m5467(c1607, runnableC14306, jM40575, z, null, false);
                }
            }
            m31262();
        } catch (C1637 e) {
            c1607.f5665.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
