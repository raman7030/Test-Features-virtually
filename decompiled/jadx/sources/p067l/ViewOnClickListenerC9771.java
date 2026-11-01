package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC9771 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֫֫ */
    public final CheckBox f26979;

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f26980;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f26981;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC14100 f26982;

    /* JADX INFO: renamed from: ۟ */
    public String f26983;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f26984;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Spinner f26985;

    /* JADX INFO: renamed from: ۨ */
    public final C12096 f26986;

    /* JADX INFO: renamed from: ۫ */
    public final CheckBox f26987;

    /* JADX INFO: renamed from: ۬ */
    public Set f26988;

    /* JADX INFO: renamed from: ܰ */
    public boolean f26989;

    /* JADX INFO: renamed from: ܽ֫ */
    public final View f26990;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C5946 f26991;

    /* JADX INFO: renamed from: ᩶ */
    public final C7179 f26992;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC18686 f26993;

    /* JADX INFO: renamed from: ᩹ */
    public C24523 f26994;

    /* JADX INFO: renamed from: ᩺ */
    public final CheckBox f26995;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC9771(ComponentCallbacksC11117 componentCallbacksC11117, String str) {
        String strConcat = str;
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        this.f26982 = interfaceC14100;
        ActivityC18686 activityC18686 = (ActivityC18686) componentCallbacksC11117.requireActivity();
        this.f26993 = activityC18686;
        this.f26991 = (C5946) new C6874(activityC18686).m15765(C5946.class);
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        this.f26990 = viewM12252;
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f26992 = c7179;
        c7179.m16509(C4605.m9734(), (String) null);
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.editText2);
        this.f26986 = c12096;
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        this.f26985 = spinner;
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f26979 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f26984 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f26995 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f26987 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f26980 = checkBox5;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC14100.getString("arsc_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c12096.mo27932((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c12096.mo27932((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC14100.getInt("arsc_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(interfaceC14100.getBoolean("dex_search_sub", true));
        checkBox2.setChecked(interfaceC14100.getBoolean("dex_search_match_case", false));
        checkBox3.setChecked(interfaceC14100.getBoolean("dex_search_regex", false));
        checkBox4.setChecked(interfaceC14100.getBoolean("dex_search_hex", true));
        checkBox5.setChecked(interfaceC14100.getBoolean("dex_search_exactly_match", true));
        this.f26994 = new C24523(this);
        m22794();
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f38986.m22794();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m22794() {
        CheckBox checkBox = this.f26995;
        this.f26992.m16516(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22798(C3263 c3263) {
        this.f26989 = true;
        this.f26988 = c3263.m5674();
        this.f26983 = c3263.m5680();
        this.f26979.setVisibility(8);
        C12096 c12096 = this.f26986;
        c12096.mo27932((CharSequence) c12096.getContext().getString(R.string.MT_Protector));
        c12096.setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22797() {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(this.f26993);
        c20671.m46715(this.f26990);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f26981 = dialogInterfaceC2564M21200;
        dialogInterfaceC2564M21200.m3860().setOnClickListener(this);
        C7179 c7179 = this.f26992;
        c7179.requestFocus();
        C7050.m16226(c7179.m16514());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f26992.m16511(i == 0 || i == 2);
        CheckBox checkBox = this.f26980;
        CheckBox checkBox2 = this.f26987;
        CheckBox checkBox3 = this.f26995;
        CheckBox checkBox4 = this.f26984;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        } else if (i == 2) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(0);
        } else if (i == 3) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        } else if (i == 4) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        }
        m22794();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iM27008;
        String str;
        String strConcat;
        String strSubstring;
        C7179 c7179 = this.f26992;
        String string = c7179.m16518().toString();
        if (string.isEmpty()) {
            this.f26981.dismiss();
            return;
        }
        String string2 = this.f26986.m32500().toString();
        int selectedItemPosition = this.f26985.getSelectedItemPosition();
        boolean zIsChecked = this.f26979.isChecked();
        boolean zIsChecked2 = this.f26984.isChecked();
        boolean zIsChecked3 = this.f26995.isChecked();
        boolean zIsChecked4 = this.f26987.isChecked();
        boolean zIsChecked5 = this.f26980.isChecked();
        if (selectedItemPosition == 0) {
            if (zIsChecked3) {
                try {
                    C13259.m30304(string);
                } catch (Exception e) {
                    C22682.m50795((CharSequence) e.getMessage());
                    c7179.requestFocus();
                    return;
                }
            }
            iM27008 = 0;
        } else if (selectedItemPosition != 1) {
            if (selectedItemPosition != 2) {
                if (selectedItemPosition != 3) {
                    if (selectedItemPosition == 4) {
                        boolean zStartsWith = string.startsWith("#");
                        if (zStartsWith) {
                            zStartsWith = C11774.m27012(string.substring(1));
                        }
                        if (!zStartsWith) {
                            C22682.m50795((CharSequence) C7050.m16224(R.string.MT_Protector).concat(" (#RRGGBB, #AARRGGBB...)"));
                            c7179.requestFocus();
                            return;
                        }
                        iM27008 = C11774.m27016(string.substring(1));
                    }
                } else if (zIsChecked4) {
                    if (string.startsWith("0x")) {
                        strSubstring = string.substring(2);
                    } else {
                        strSubstring = string.substring(2);
                    }
                    if (!C11774.m27014(strSubstring)) {
                        C22682.m50793(R.string.MT_Protector);
                        c7179.requestFocus();
                        return;
                    }
                    iM27008 = C11774.m27008(strSubstring);
                } else {
                    iM27008 = Integer.parseInt(string);
                }
            } else if (zIsChecked3) {
                C13259.m30304(string);
            }
            iM27008 = 0;
        } else if (zIsChecked4) {
            if (!string.startsWith("0x") || string.startsWith("0X")) {
                strSubstring = string.substring(2);
            } else {
                strSubstring = string;
            }
            if (!C11774.m27014(strSubstring)) {
                C22682.m50793(R.string.MT_Protector);
                c7179.requestFocus();
                return;
            }
            iM27008 = C11774.m27008(strSubstring);
        } else {
            try {
                iM27008 = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                C22682.m50793(R.string.MT_Protector);
                c7179.requestFocus();
                return;
            }
        }
        c7179.m16517();
        InterfaceC14770 interfaceC14770Edit = this.f26982.edit();
        if (!this.f26989) {
            interfaceC14770Edit.putString("arsc_search_path", string2);
        }
        interfaceC14770Edit.mo27875(selectedItemPosition, "arsc_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f26981.dismiss();
        ViewOnClickListenerC9771 viewOnClickListenerC9771 = (ViewOnClickListenerC9771) this.f26994.f77675;
        C20856 c20856 = (C20856) viewOnClickListenerC9771.f26991.m13347().m4060();
        C12826.requireNonNull(c20856);
        C24164 c24164 = new C24164(viewOnClickListenerC9771.f26993);
        c24164.m53440(R.string.MT_Protector);
        c24164.m53431(C7050.m16203(R.string.MT_Protector, 0));
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        C15805 c15805 = new C15805(viewOnClickListenerC9771, c24164);
        if (!viewOnClickListenerC9771.f26989) {
            if (string2.startsWith("/")) {
                strConcat = string2.substring(1);
            } else {
                if (string2.length() <= 0 || string2.endsWith("/")) {
                    str = string2;
                } else {
                    strConcat = string2.concat("/");
                }
                C17817.m40438(c20856, string, str, iM27008, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c15805, null);
                return;
            }
            str = strConcat;
            C17817.m40438(c20856, string, str, iM27008, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c15805, null);
            return;
        }
        String strConcat2 = viewOnClickListenerC9771.f26983;
        if (strConcat2.startsWith("/")) {
            strConcat2 = strConcat2.substring(1);
        } else if (strConcat2.length() > 0 && !strConcat2.endsWith("/")) {
            strConcat2 = strConcat2.concat("/");
        }
        C17817.m40438(c20856, string, strConcat2, iM27008, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c15805, viewOnClickListenerC9771.f26988);
    }
}
