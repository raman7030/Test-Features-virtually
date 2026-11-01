package p067l;

import android.content.Context;
import android.os.Bundle;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SZ */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC6391 extends AbstractActivityC3895 implements InterfaceC22001 {

    /* JADX INFO: renamed from: ۜۧ */
    public boolean f16536;

    /* JADX INFO: renamed from: ۢۧ */
    public C4360 f16537;

    /* JADX INFO: renamed from: ᩷ۧ */
    public C4360 f16538;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f16539;

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "TerminalPreferences";
    }

    public ActivityC6391() {
        super(R.xml.MT_Protector);
    }

    @Override // p067l.AbstractActivityC3895, p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16536 = C5178.m11080() != ViewOnLayoutChangeListenerC9723.class;
    }

    @Override // p067l.AbstractActivityC3895
    /* JADX INFO: renamed from: ֫ */
    public final void mo7695(C9692 c9692, C9074 c9074) {
        C4360 c4360M12695 = c9074.m12695("term_start_path");
        C12826.requireNonNull(c4360M12695);
        C4360 c4360M12696 = c9074.m12695("term_create_session_as_root");
        C12826.requireNonNull(c4360M12696);
        C4360 c4360M12697 = c9074.m12695("term_double_confirm_to_exit");
        C12826.requireNonNull(c4360M12697);
        C4360 c4360M12698 = c9074.m12695("terminal_su2_help");
        C12826.requireNonNull(c4360M12698);
        this.f16537 = c4360M12698;
        C4360 c4360M12699 = c9074.m12695("term_ex");
        C12826.requireNonNull(c4360M12699);
        this.f16538 = c4360M12699;
        if (this.f16536) {
            c4360M12695.m9050(false);
            c4360M12696.m9050(false);
        } else {
            c4360M12695.mo9020((CharSequence) ApplicationC21448.f67650.getString("term_start_path", "/sdcard"));
            c4360M12697.m9050(false);
        }
        m14607();
    }

    @Override // p067l.AbstractActivityC3895
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7696(C9692 c9692, C4360 c4360, Object obj) {
        if (!(c4360 instanceof C8874)) {
            return false;
        }
        c4360.mo9020((CharSequence) obj.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m14607() {
        C9543 c9543M9006 = C4359.m9006();
        C5030 c5030M14579 = C6371.m14579();
        this.f16539 = true;
        if (c9543M9006 != null) {
            String str = c9543M9006.f26240;
            this.f16537.m9050(true);
            if (c5030M14579 == null) {
                this.f16538.mo9020((CharSequence) getString(R.string.MT_Protector, str, "unknown"));
                this.f16539 = false;
                return;
            } else if (c5030M14579.f11535 > c9543M9006.f26242) {
                this.f16538.mo9020((CharSequence) getString(R.string.MT_Protector, str, c5030M14579.f11534));
                return;
            } else {
                this.f16538.mo9020((CharSequence) getString(R.string.MT_Protector, str, c5030M14579.f11534));
                return;
            }
        }
        this.f16537.m9050(false);
        this.f16538.m9056(R.string.MT_Protector);
    }

    @Override // p067l.InterfaceC22001
    /* JADX INFO: renamed from: ܽ */
    public final void mo14608() {
        if (this.f16539) {
            C9543 c9543M9006 = C4359.m9006();
            C5030 c5030M14579 = C6371.m14579();
            if (c5030M14579 == null) {
                C22682.m50793(R.string.MT_Protector);
            } else if (c9543M9006 != null && c9543M9006.f26242 >= c5030M14579.f11535) {
                ActivityC12554.m28933((Context) this, C25165.m55219(), true);
            } else {
                C6371.m14581((AbstractActivityC5549) this, (Runnable) new RunnableC3439(5, this), true);
            }
        }
    }
}
