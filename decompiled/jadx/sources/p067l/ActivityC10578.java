package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAHS */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10578 extends AbstractActivityC3895 {
    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public String mo119() {
        return "FullEditorPreferences";
    }

    public ActivityC10578() {
        super(R.xml.MT_Protector);
    }

    @Override // p067l.AbstractActivityC3895
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7696(C9692 c9692, C4360 c4360, Object obj) {
        boolean zBooleanValue;
        String str;
        C9074 c9074M51591 = c9692.m51591();
        String strM9037 = c4360.m9037();
        strM9037.getClass();
        switch (strM9037) {
            case "symbol_input":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "custom_symbols";
                break;
            case "edit_show_line_numbers":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "edit_fixed_line_numbers";
                break;
            case "edit_show_blank_symbol":
                zBooleanValue = ((Boolean) obj).booleanValue();
                str = "hide_single_space";
                break;
            default:
                return false;
        }
        c9074M51591.m12695((CharSequence) str).m9057(zBooleanValue);
        return true;
    }

    @Override // p067l.AbstractActivityC3895
    /* JADX INFO: renamed from: ֫ */
    public void mo7695(C9692 c9692, C9074 c9074) {
        if (!((C3709) c9074.m12695("edit_show_line_numbers")).m51608()) {
            c9074.m12695("edit_fixed_line_numbers").m9057(false);
        }
        if (!((C3709) c9074.m12695("edit_show_blank_symbol")).m51608()) {
            c9074.m12695("hide_single_space").m9057(false);
        }
        if (((C3709) c9074.m12695("symbol_input")).m51608()) {
            return;
        }
        c9074.m12695("custom_symbols").m9057(false);
    }
}
