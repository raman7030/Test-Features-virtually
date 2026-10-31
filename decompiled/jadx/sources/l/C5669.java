package l;

import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۚ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final class C5669 extends AbstractDialogInterfaceOnClickListenerC1828 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f17510;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f17511;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5669(C15545 c15545, AbstractActivityC3346 abstractActivityC3346, String str) {
        super(abstractActivityC3346, "srepr");
        this.f17510 = c15545;
        this.f17511 = str;
        m6052(R.string.MT_Protector);
        C14615 c14615 = new C14615(c15545.f47915, null, R.style.MT_Protector);
        c14615.setText(R.string.MT_Protector);
        m6053(c14615);
        C10235 c10235M14607 = m6055().m14607();
        c10235M14607.mo25910((CharSequence) str);
        c10235M14607.m30317(PluginEditText.SYNTAX_REGEX_REPLACEMENT, true);
        c10235M14607.m25926(131073);
        c10235M14607.m30477("$0\\n");
        m6060();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* JADX INFO: renamed from: ܿ */
    public final void mo6058() {
        C15545 c15545 = this.f17510;
        String strM6057 = m6057();
        try {
            C13574.m32628((C11459) null, strM6057);
            if (!strM6057.equals(this.f17511)) {
                c15545.m36659();
                ApplicationC20075.f65008.edit().putString("srep", strM6057).apply();
                m6056();
            }
            m6051();
        } catch (PatternSyntaxException e) {
            C15545.m36651(c15545, e);
        }
    }
}
