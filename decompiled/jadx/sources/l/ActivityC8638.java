package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAHS */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC8638 extends AbstractActivityC1606 {
    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public String mo121() {
        return "FullEditorPreferences";
    }

    public ActivityC8638() {
        super(R.xml.MT_Protector);
    }

    @Override // l.AbstractActivityC1606
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5466(C7705 c7705, C2095 c2095, Object obj) {
        boolean zBooleanValue;
        String str;
        C7055 c7055M49240 = c7705.m49240();
        String strM6911 = c2095.m6911();
        strM6911.getClass();
        switch (strM6911) {
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
        c7055M49240.m10700((CharSequence) str).m6931(zBooleanValue);
        return true;
    }

    @Override // l.AbstractActivityC1606
    /* JADX INFO: renamed from: ֫ */
    public void mo5465(C7705 c7705, C7055 c7055) {
        if (!((C1410) c7055.m10700("edit_show_line_numbers")).m49256()) {
            c7055.m10700("edit_fixed_line_numbers").m6931(false);
        }
        if (!((C1410) c7055.m10700("edit_show_blank_symbol")).m49256()) {
            c7055.m10700("hide_single_space").m6931(false);
        }
        if (((C1410) c7055.m10700("symbol_input")).m49256()) {
            return;
        }
        c7055.m10700("custom_symbols").m6931(false);
    }
}
