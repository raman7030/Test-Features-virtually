package p067l;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JAK2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8352 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ boolean f22328;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C3896 f22329;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ CheckBox f22330;

    /* JADX INFO: renamed from: ܽ֫ */
    public final /* synthetic */ RunnableC15965 f22331;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ String f22332;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8352(C3896 c3896, Main main, boolean z, CheckBox checkBox, ViewGroup viewGroup, String str, RunnableC15965 runnableC15965) {
        super(main, R.string.MT_Protector);
        this.f22329 = c3896;
        this.f22328 = z;
        this.f22330 = checkBox;
        this.f22332 = str;
        this.f22331 = runnableC15965;
        if (z) {
            if (!c3896.f8443) {
                checkBox.setVisibility(8);
            }
            Main mainM41282 = c3896.f8445.m41282();
            CheckBox checkBox2 = (CheckBox) mainM41282.m12252(R.layout.MT_Protector);
            viewGroup.addView(checkBox2);
            C11896.m27211(mainM41282, checkBox2, str);
        }
        if (c3896.f8443 || z) {
            FrameLayout frameLayoutM33372 = m33372();
            frameLayoutM33372.setVisibility(0);
            frameLayoutM33372.addView(viewGroup);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        C3896 c3896 = this.f22329;
        String strTrim = m33346().trim();
        if (strTrim.isEmpty()) {
            m33348();
            return;
        }
        final long jM42826 = C18794.m42826(strTrim);
        if (jM42826 < 0) {
            m33349(R.string.MT_Protector);
            return;
        }
        try {
            C19210.m43750(c3896.f8444, EnumC17868.MODIFY_FILE);
            final boolean z = c3896.f8443 && this.f22330.isChecked();
            if (c3896.f8448 || z || jM42826 != ((C14387) c3896.f8446.get(0)).getTime()) {
                boolean z2 = this.f22328;
                final RunnableC15965 runnableC15965 = this.f22331;
                if (z2) {
                    C11896.m27214(new InterfaceC14577() { // from class: l.ۤ᩶᩻
                        @Override // p067l.InterfaceC14577
                        public final /* synthetic */ void onCanceled() {
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final /* synthetic */ boolean mo6050(Exception exc) {
                            return false;
                        }

                        @Override // p067l.InterfaceC14577
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo6049(C13457 c13457, boolean z3) {
                            C3896.m7697(this.f34523.f22329, runnableC15965, jM42826, z, c13457, z3);
                        }
                    }, c3896.f8445.m41282(), this.f22332);
                } else {
                    C3896.m7697(c3896, runnableC15965, jM42826, z, null, false);
                }
            }
            m33348();
        } catch (C3924 e) {
            c3896.f8445.m41282().m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
