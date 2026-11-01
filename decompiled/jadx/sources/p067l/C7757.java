package p067l;

import bin.p000mt.plugin.api.p002ui.PluginEditText;
import bin.p000mt.plus.R;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ۚ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes3.dex */
public final class C7757 extends AbstractDialogInterfaceOnClickListenerC4106 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C17143 f20357;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ String f20358;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7757(C17143 c17143, AbstractActivityC5549 abstractActivityC5549, String str) {
        super(abstractActivityC5549, "srepr");
        this.f20357 = c17143;
        this.f20358 = str;
        m8250(R.string.MT_Protector);
        C1567 c1567 = new C1567(c17143.f51047, null, R.style.MT_Protector);
        c1567.setText(R.string.MT_Protector);
        m8251(c1567);
        C12096 c12096M16514 = m8253().m16514();
        c12096M16514.mo27932((CharSequence) str);
        c12096M16514.m32381(PluginEditText.SYNTAX_REGEX_REPLACEMENT, true);
        c12096M16514.m27948(131073);
        c12096M16514.m32541("$0\\n");
        m8258();
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC4106
    /* JADX INFO: renamed from: ܿ */
    public final void mo8256() {
        C17143 c17143 = this.f20357;
        String strM8255 = m8255();
        try {
            C15269.m34740((C13259) null, strM8255);
            if (!strM8255.equals(this.f20358)) {
                c17143.m38820();
                ApplicationC21448.f67649.edit().putString("srep", strM8255).apply();
                m8254();
            }
            m8249();
        } catch (PatternSyntaxException e) {
            C17143.m38812(c17143, e);
        }
    }
}
