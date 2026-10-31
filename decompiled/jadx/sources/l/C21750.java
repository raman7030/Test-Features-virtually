package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩸ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes.dex */
public final class C21750 implements InterfaceC19634 {
    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20431(EditText editText, TextView textView, Button button, C11146 c11146) {
        button.setTag(R.id.MT_Protector, c11146);
        mo20430(editText, textView, button);
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20430(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final void mo20429(final Button button, final ActivityC0477 activityC0477) {
        C22455 c22455 = (C22455) button.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c22455 == null ? new JSONObject() : c22455.mo27664();
        View viewM10216 = activityC0477.m10216(R.layout.MT_Protector);
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10236 = (C10235) viewM10216.findViewById(R.id.editText2);
        final C2978 c2978 = (C2978) viewM10216.findViewById(R.id.switch1);
        final C2978 c2979 = (C2978) viewM10216.findViewById(R.id.switch2);
        final Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        final C10235 c10237 = (C10235) viewM10216.findViewById(R.id.editText3);
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC0477, new String[]{activityC0477.getString(R.string.MT_Protector), activityC0477.getString(R.string.MT_Protector), activityC0477.getString(R.string.MT_Protector), activityC0477.getString(R.string.MT_Protector), activityC0477.getString(R.string.MT_Protector)}));
        c2979.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ᩳܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c10235.m30317(z ? PluginEditText.SYNTAX_REGEX : null, true);
                c10236.m30317(z ? PluginEditText.SYNTAX_REGEX_REPLACEMENT : null, true);
            }
        });
        c10235.mo25910((CharSequence) jSONObject.getString(am.av));
        c10236.mo25910((CharSequence) jSONObject.getString("b"));
        c2978.setChecked(jSONObject.getBoolean(am.aF));
        int i = jSONObject.getInt("d");
        if (i < 0 || i > 4) {
            i = 0;
        }
        spinner.setSelection(i);
        int i2 = jSONObject.getInt("e");
        c10237.mo25910((CharSequence) (i2 <= 0 ? "" : String.valueOf(i2)));
        c2979.setChecked(jSONObject.getBoolean("f", true));
        C19258 c19258BuildDialog = activityC0477.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10235 c10238 = c10235;
                String string = c10238.m30436().toString();
                C10235 c10239 = c10236;
                String string2 = c10239.m30436().toString();
                boolean zIsChecked = c2978.isChecked();
                boolean zIsChecked2 = c2979.isChecked();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                C10235 c102310 = c10237;
                String string3 = c102310.m30436().toString();
                if (string.isEmpty()) {
                    C21374.m48457(R.string.MT_Protector);
                    c10238.requestFocus();
                    return;
                }
                ActivityC0477 activityC0478 = activityC0477;
                if (zIsChecked2) {
                    try {
                        try {
                            C13574.m32628(C11459.m28260(string), string2);
                        } catch (Exception e) {
                            activityC0478.m10223(e, (DialogInterface.OnDismissListener) null);
                            c10239.m25900();
                            c10239.requestFocus();
                            return;
                        }
                    } catch (Exception e2) {
                        activityC0478.m10223(e2, (DialogInterface.OnDismissListener) null);
                        c10238.m25900();
                        c10238.requestFocus();
                        return;
                    }
                }
                try {
                    int i3 = string3.isEmpty() ? 0 : Integer.parseInt(string3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(am.av, string);
                    jSONObject2.put("b", string2);
                    jSONObject2.put(am.aF, zIsChecked);
                    jSONObject2.put("d", selectedItemPosition);
                    jSONObject2.put("e", i3);
                    jSONObject2.put("f", zIsChecked2);
                    button.setTag(R.id.MT_Protector, new C22455(jSONObject2));
                    dialogInterfaceC0206M19253.dismiss();
                } catch (Exception e3) {
                    activityC0478.m10223(e3, (DialogInterface.OnDismissListener) null);
                    c102310.m25900();
                    c102310.requestFocus();
                }
            }
        });
    }

    @Override // l.InterfaceC19634
    /* JADX INFO: renamed from: ֫ */
    public final C11146 mo20428(int i, EditText editText, Button button) {
        C11146 c11146 = (C11146) button.getTag(R.id.MT_Protector);
        if (c11146 != null) {
            return c11146;
        }
        ActivityC0477.m2112(button);
        return null;
    }
}
