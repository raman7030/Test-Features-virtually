package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Set;

/* JADX INFO: renamed from: l.۟᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7788 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f24062;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f24063;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f24064;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f24065;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f24066;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f24067;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f24068;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10235 f24069;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f24070;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f24071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24072;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final View f24073;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 f24074;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5062 f24075;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f24076;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23310 f24077;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CheckBox f24078;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC7788(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        String strConcat = str;
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f24065 = interfaceC12344;
        ActivityC17169 activityC17169 = (ActivityC17169) componentCallbacksC9205.requireActivity();
        this.f24076 = activityC17169;
        this.f24074 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        this.f24073 = viewM10216;
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f24075 = c5062;
        c5062.m14602(C2353.m7663(), (String) null);
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.editText2);
        this.f24069 = c10235;
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        this.f24068 = spinner;
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f24062 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f24067 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f24078 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f24070 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f24063 = checkBox5;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC12344.getString("arsc_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c10235.mo25910((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c10235.mo25910((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC12344.getInt("arsc_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_sub", true));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox4.setChecked(interfaceC12344.getBoolean("dex_search_hex", true));
        checkBox5.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", true));
        this.f24077 = new C23310(this);
        m20813();
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f35975.m20813();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m20813() {
        CheckBox checkBox = this.f24078;
        this.f24075.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20817(C0941 c0941) {
        this.f24072 = true;
        this.f24071 = c0941.m3355();
        this.f24066 = c0941.m3361();
        this.f24062.setVisibility(8);
        C10235 c10235 = this.f24069;
        c10235.mo25910((CharSequence) c10235.getContext().getString(R.string.MT_Protector));
        c10235.setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20816() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f24076);
        c19258.m44421(this.f24073);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f24064 = dialogInterfaceC0206M19253;
        dialogInterfaceC0206M19253.m1447().setOnClickListener(this);
        C5062 c5062 = this.f24075;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f24075.m14604(i == 0 || i == 2);
        CheckBox checkBox = this.f24063;
        CheckBox checkBox2 = this.f24070;
        CheckBox checkBox3 = this.f24078;
        CheckBox checkBox4 = this.f24067;
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
        m20813();
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
        int iM24993;
        String str;
        String strConcat;
        String strSubstring;
        C5062 c5062 = this.f24075;
        String string = c5062.m14611().toString();
        if (string.isEmpty()) {
            this.f24064.dismiss();
            return;
        }
        String string2 = this.f24069.m30436().toString();
        int selectedItemPosition = this.f24068.getSelectedItemPosition();
        boolean zIsChecked = this.f24062.isChecked();
        boolean zIsChecked2 = this.f24067.isChecked();
        boolean zIsChecked3 = this.f24078.isChecked();
        boolean zIsChecked4 = this.f24070.isChecked();
        boolean zIsChecked5 = this.f24063.isChecked();
        if (selectedItemPosition == 0) {
            if (zIsChecked3) {
                try {
                    C11459.m28260(string);
                } catch (Exception e) {
                    C21374.m48459((CharSequence) e.getMessage());
                    c5062.requestFocus();
                    return;
                }
            }
            iM24993 = 0;
        } else if (selectedItemPosition != 1) {
            if (selectedItemPosition != 2) {
                if (selectedItemPosition != 3) {
                    if (selectedItemPosition == 4) {
                        boolean zStartsWith = string.startsWith("#");
                        if (zStartsWith) {
                            zStartsWith = C9896.m24997(string.substring(1));
                        }
                        if (!zStartsWith) {
                            C21374.m48459((CharSequence) C4925.m14327(R.string.MT_Protector).concat(" (#RRGGBB, #AARRGGBB...)"));
                            c5062.requestFocus();
                            return;
                        }
                        iM24993 = C9896.m25001(string.substring(1));
                    }
                } else if (zIsChecked4) {
                    if (string.startsWith("0x")) {
                        strSubstring = string.substring(2);
                    } else {
                        strSubstring = string.substring(2);
                    }
                    if (!C9896.m24999(strSubstring)) {
                        C21374.m48457(R.string.MT_Protector);
                        c5062.requestFocus();
                        return;
                    }
                    iM24993 = C9896.m24993(strSubstring);
                } else {
                    iM24993 = Integer.parseInt(string);
                }
            } else if (zIsChecked3) {
                C11459.m28260(string);
            }
            iM24993 = 0;
        } else if (zIsChecked4) {
            if (!string.startsWith("0x") || string.startsWith("0X")) {
                strSubstring = string.substring(2);
            } else {
                strSubstring = string;
            }
            if (!C9896.m24999(strSubstring)) {
                C21374.m48457(R.string.MT_Protector);
                c5062.requestFocus();
                return;
            }
            iM24993 = C9896.m24993(strSubstring);
        } else {
            try {
                iM24993 = Integer.parseInt(string);
            } catch (NumberFormatException unused) {
                C21374.m48457(R.string.MT_Protector);
                c5062.requestFocus();
                return;
            }
        }
        c5062.m14610();
        InterfaceC13049 interfaceC13049Edit = this.f24065.edit();
        if (!this.f24072) {
            interfaceC13049Edit.putString("arsc_search_path", string2);
        }
        interfaceC13049Edit.mo25853(selectedItemPosition, "arsc_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f24064.dismiss();
        ViewOnClickListenerC7788 viewOnClickListenerC7788 = (ViewOnClickListenerC7788) this.f24077.f74928;
        C19452 c19452 = (C19452) viewOnClickListenerC7788.f24074.m11411().m1662();
        C11003.requireNonNull(c19452);
        C22933 c22933 = new C22933(viewOnClickListenerC7788.f24076);
        c22933.m51049(R.string.MT_Protector);
        c22933.m51040(C4925.m14306(R.string.MT_Protector, 0));
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        C14137 c14137 = new C14137(viewOnClickListenerC7788, c22933);
        if (!viewOnClickListenerC7788.f24072) {
            if (string2.startsWith("/")) {
                strConcat = string2.substring(1);
            } else {
                if (string2.length() <= 0 || string2.endsWith("/")) {
                    str = string2;
                } else {
                    strConcat = string2.concat("/");
                }
                C16254.m38224(c19452, string, str, iM24993, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c14137, null);
                return;
            }
            str = strConcat;
            C16254.m38224(c19452, string, str, iM24993, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c14137, null);
            return;
        }
        String strConcat2 = viewOnClickListenerC7788.f24066;
        if (strConcat2.startsWith("/")) {
            strConcat2 = strConcat2.substring(1);
        } else if (strConcat2.length() > 0 && !strConcat2.endsWith("/")) {
            strConcat2 = strConcat2.concat("/");
        }
        C16254.m38224(c19452, string, strConcat2, iM24993, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, c14137, viewOnClickListenerC7788.f24071);
    }
}
