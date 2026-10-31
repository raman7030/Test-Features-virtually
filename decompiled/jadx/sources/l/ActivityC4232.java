package l;

import android.content.Context;
import android.os.Bundle;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11SZ */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC4232 extends AbstractActivityC1606 implements InterfaceC20657 {

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f13723;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C2095 f13724;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C2095 f13725;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f13726;

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "TerminalPreferences";
    }

    public ActivityC4232() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC1606, l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13723 = C2956.m9012() != ViewOnLayoutChangeListenerC7738.class;
    }

    @Override // l.AbstractActivityC1606
    /* JADX INFO: renamed from: ֫ */
    public final void mo5465(C7705 c7705, C7055 c7055) {
        C2095 c2095M10700 = c7055.m10700("term_start_path");
        C11003.requireNonNull(c2095M10700);
        C2095 c2095M10701 = c7055.m10700("term_create_session_as_root");
        C11003.requireNonNull(c2095M10701);
        C2095 c2095M10702 = c7055.m10700("term_double_confirm_to_exit");
        C11003.requireNonNull(c2095M10702);
        C2095 c2095M10703 = c7055.m10700("terminal_su2_help");
        C11003.requireNonNull(c2095M10703);
        this.f13724 = c2095M10703;
        C2095 c2095M10704 = c7055.m10700("term_ex");
        C11003.requireNonNull(c2095M10704);
        this.f13725 = c2095M10704;
        if (this.f13723) {
            c2095M10700.m6924(false);
            c2095M10701.m6924(false);
        } else {
            c2095M10700.mo6894((CharSequence) ApplicationC20075.f65010.getString("term_start_path", "/sdcard"));
            c2095M10702.m6924(false);
        }
        m12731();
    }

    @Override // l.AbstractActivityC1606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5466(C7705 c7705, C2095 c2095, Object obj) {
        if (!(c2095 instanceof C6845)) {
            return false;
        }
        c2095.mo6894((CharSequence) obj.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m12731() {
        C7549 c7549M6880 = C2094.m6880();
        C2800 c2800M12703 = C4211.m12703();
        this.f13726 = true;
        if (c7549M6880 != null) {
            String str = c7549M6880.f23328;
            this.f13724.m6924(true);
            if (c2800M12703 == null) {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector, str, "unknown"));
                this.f13726 = false;
                return;
            } else if (c2800M12703.f8741 > c7549M6880.f23330) {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector, str, c2800M12703.f8740));
                return;
            } else {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector, str, c2800M12703.f8740));
                return;
            }
        }
        this.f13724.m6924(false);
        this.f13725.m6930(R.string.MT_Protector);
    }

    @Override // l.InterfaceC20657
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo12732() {
        if (this.f13726) {
            C7549 c7549M6880 = C2094.m6880();
            C2800 c2800M12703 = C4211.m12703();
            if (c2800M12703 == null) {
                C21374.m48457(R.string.MT_Protector);
            } else if (c7549M6880 != null && c7549M6880.f23330 >= c2800M12703.f8741) {
                ActivityC10717.m26893((Context) this, C23986.m52813(), true);
            } else {
                C4211.m12705((AbstractActivityC3346) this, (Runnable) new RunnableC1126(5, this), true);
            }
        }
    }
}
