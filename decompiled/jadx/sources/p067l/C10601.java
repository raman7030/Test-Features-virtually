package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes3.dex */
public final class C10601 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C17305 f29353;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10601(C17305 c17305, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, R.string.MT_Protector);
        this.f29353 = c17305;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (strTrim.isEmpty()) {
            strTrim = "/sdcard/MT2";
        }
        String strM40534 = C17853.m40534(strTrim);
        String strMo25505 = C17853.m40542().mo25505();
        if (!C17853.m40545(strM40534)) {
            m33337("Permission denied");
            return;
        }
        String strMo25506 = C17853.m40542().mo25505();
        int i = ViewOnClickListenerC4308.f9591;
        String string = ApplicationC21448.f67649.getString("extract_apk_path", null);
        if (string != null) {
            if (string.startsWith(strMo25505 + "/") || string.equals(strMo25505)) {
                StringBuilder sbM17248 = C7470.m17248(strMo25506);
                sbM17248.append(string.substring(strMo25505.length()));
                ApplicationC21448.f67649.edit().putString("extract_apk_path", sbM17248.toString()).apply();
            }
        }
        String string2 = ApplicationC21448.f67649.getString("inject_log_path", null);
        if (string2 != null) {
            String strMo25507 = C17853.f53287.mo25505();
            if (string2.startsWith("[SDCARD]/") || string2.equals("[SDCARD]")) {
                string2 = C21459.m48621(8, string2, C7470.m17248(strMo25507));
            }
            if (string2.startsWith(strMo25505 + "/") || string2.equals(strMo25505)) {
                StringBuilder sbM17249 = C7470.m17248(strMo25506);
                sbM17249.append(string2.substring(strMo25505.length()));
                String string3 = sbM17249.toString();
                if (string3.startsWith(strMo25507)) {
                    string3 = "[SDCARD]" + string3.substring(strMo25507.length());
                }
                ApplicationC21448.f67649.edit().putString("inject_log_path", string3).apply();
            }
        }
        C17305 c17305 = this.f29353;
        c17305.m13265().edit().putString(c17305.m9037(), strM40534).apply();
        m33348();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۘ */
    public final void mo9819() {
        C17305 c17305 = this.f29353;
        c17305.m13265().edit().remove(c17305.m9037()).apply();
        C17853.m40543("/sdcard/MT2");
    }
}
