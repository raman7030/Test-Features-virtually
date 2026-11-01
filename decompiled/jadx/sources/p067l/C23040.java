package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plugin.api.p002ui.PluginEditText;
import bin.p000mt.plus.R;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.᩸ᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes.dex */
public final class C23040 implements InterfaceC21029 {
    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22410(EditText editText, TextView textView, Button button, C12962 c12962) {
        button.setTag(R.id.MT_Protector, c12962);
        mo22409(editText, textView, button);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22409(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        textView.setVisibility(8);
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final void mo22408(final Button button, final ActivityC2822 activityC2822) {
        C23710 c23710 = (C23710) button.getTag(R.id.MT_Protector);
        JSONObject jSONObject = c23710 == null ? new JSONObject() : c23710.mo29726();
        View viewM12252 = activityC2822.m12252(R.layout.MT_Protector);
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12097 = (C12096) viewM12252.findViewById(R.id.editText2);
        final C0990 c0990 = (C0990) viewM12252.findViewById(R.id.switch1);
        final C0990 c0991 = (C0990) viewM12252.findViewById(R.id.switch2);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        final C12096 c12098 = (C12096) viewM12252.findViewById(R.id.editText3);
        spinner.setAdapter((SpinnerAdapter) new C21438(activityC2822, new String[]{activityC2822.getString(R.string.MT_Protector), activityC2822.getString(R.string.MT_Protector), activityC2822.getString(R.string.MT_Protector), activityC2822.getString(R.string.MT_Protector), activityC2822.getString(R.string.MT_Protector)}));
        c0991.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ᩳܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c12096.m32381(z ? PluginEditText.SYNTAX_REGEX : null, true);
                c12097.m32381(z ? PluginEditText.SYNTAX_REGEX_REPLACEMENT : null, true);
            }
        });
        c12096.mo27932((CharSequence) jSONObject.getString(C0655am.f2320av));
        c12097.mo27932((CharSequence) jSONObject.getString("b"));
        c0990.setChecked(jSONObject.getBoolean(C0655am.f2278aF));
        int i = jSONObject.getInt("d");
        if (i < 0 || i > 4) {
            i = 0;
        }
        spinner.setSelection(i);
        int i2 = jSONObject.getInt("e");
        c12098.mo27932((CharSequence) (i2 <= 0 ? "" : String.valueOf(i2)));
        c0991.setChecked(jSONObject.getBoolean("f", true));
        C20671 c20671BuildDialog = activityC2822.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12096 c12099 = c12096;
                String string = c12099.m32500().toString();
                C12096 c120910 = c12097;
                String string2 = c120910.m32500().toString();
                boolean zIsChecked = c0990.isChecked();
                boolean zIsChecked2 = c0991.isChecked();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                C12096 c120911 = c12098;
                String string3 = c120911.m32500().toString();
                if (string.isEmpty()) {
                    C22682.m50793(R.string.MT_Protector);
                    c12099.requestFocus();
                    return;
                }
                ActivityC2822 activityC2823 = activityC2822;
                if (zIsChecked2) {
                    try {
                        try {
                            C15269.m34740(C13259.m30304(string), string2);
                        } catch (Exception e) {
                            activityC2823.m12259(e, (DialogInterface.OnDismissListener) null);
                            c120910.m27922();
                            c120910.requestFocus();
                            return;
                        }
                    } catch (Exception e2) {
                        activityC2823.m12259(e2, (DialogInterface.OnDismissListener) null);
                        c12099.m27922();
                        c12099.requestFocus();
                        return;
                    }
                }
                try {
                    int i3 = string3.isEmpty() ? 0 : Integer.parseInt(string3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0655am.f2320av, string);
                    jSONObject2.put("b", string2);
                    jSONObject2.put(C0655am.f2278aF, zIsChecked);
                    jSONObject2.put("d", selectedItemPosition);
                    jSONObject2.put("e", i3);
                    jSONObject2.put("f", zIsChecked2);
                    button.setTag(R.id.MT_Protector, new C23710(jSONObject2));
                    dialogInterfaceC2564M21200.dismiss();
                } catch (Exception e3) {
                    activityC2823.m12259(e3, (DialogInterface.OnDismissListener) null);
                    c120911.m27922();
                    c120911.requestFocus();
                }
            }
        });
    }

    @Override // p067l.InterfaceC21029
    /* JADX INFO: renamed from: ֫ */
    public final C12962 mo22407(int i, EditText editText, Button button) {
        C12962 c12962 = (C12962) button.getTag(R.id.MT_Protector);
        if (c12962 != null) {
            return c12962;
        }
        ActivityC2822.m4493(button);
        return null;
    }
}
