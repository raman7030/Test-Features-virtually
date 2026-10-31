package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes3.dex */
public final class C8662 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15716 f26428;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8662(C15716 c15716, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, R.string.MT_Protector);
        this.f26428 = c15716;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (strTrim.isEmpty()) {
            strTrim = "/sdcard/MT2";
        }
        String strM38319 = C16293.m38319(strTrim);
        String strMo23554 = C16293.m38327().mo23554();
        if (!C16293.m38330(strM38319)) {
            m31251("Permission denied");
            return;
        }
        String strMo23555 = C16293.m38327().mo23554();
        int i = ViewOnClickListenerC2040.f6808;
        String string = ApplicationC20075.f65008.getString("extract_apk_path", null);
        if (string != null) {
            if (string.startsWith(strMo23554 + "/") || string.equals(strMo23554)) {
                StringBuilder sbM15339 = C5368.m15339(strMo23555);
                sbM15339.append(string.substring(strMo23554.length()));
                ApplicationC20075.f65008.edit().putString("extract_apk_path", sbM15339.toString()).apply();
            }
        }
        String string2 = ApplicationC20075.f65008.getString("inject_log_path", null);
        if (string2 != null) {
            String strMo23556 = C16293.f50120.mo23554();
            if (string2.startsWith("[SDCARD]/") || string2.equals("[SDCARD]")) {
                string2 = C20087.m46305(8, string2, C5368.m15339(strMo23556));
            }
            if (string2.startsWith(strMo23554 + "/") || string2.equals(strMo23554)) {
                StringBuilder sbM153310 = C5368.m15339(strMo23555);
                sbM153310.append(string2.substring(strMo23554.length()));
                String string3 = sbM153310.toString();
                if (string3.startsWith(strMo23556)) {
                    string3 = "[SDCARD]" + string3.substring(strMo23556.length());
                }
                ApplicationC20075.f65008.edit().putString("inject_log_path", string3).apply();
            }
        }
        C15716 c15716 = this.f26428;
        c15716.m11313().edit().putString(c15716.m6911(), strM38319).apply();
        m31262();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ۘ */
    public final void mo7756() {
        C15716 c15716 = this.f26428;
        c15716.m11313().edit().remove(c15716.m6911()).apply();
        C16293.m38328("/sdcard/MT2");
    }
}
