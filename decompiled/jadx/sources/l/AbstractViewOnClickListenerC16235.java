package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC16235 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List f49977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f49978;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49979;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49980;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Spinner f49981;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f49982;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f49983;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f49984;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5062 f49985;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f49986;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16560 f49987;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AbstractViewOnClickListenerC16235(C16560 c16560, AbstractC15440 abstractC15440, List list, final Runnable runnable) {
        this.f49987 = c16560;
        this.f49978 = abstractC15440;
        this.f49977 = list;
        View viewM10216 = c16560.m39056().m10216(R.layout.MT_Protector);
        if (list != null) {
            ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM10216.findViewById(R.id.editText2).setVisibility(8);
        this.f49985 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        this.f49981 = spinner;
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f49980 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f49979 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f49983 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f49982 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f49984 = checkBox5;
        spinner.setSelection(ApplicationC20075.f65008.getInt("axml_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_match_case", false));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_regex", false));
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_hex", true));
        checkBox4.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_id2name", true));
        checkBox5.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_exactly_match", true));
        checkBox2.setOnCheckedChangeListener(new C1601(1, this));
        m38199();
        C19258 c19258BuildDialog = c16560.m39056().buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩹᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۜ᩹᩻
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f49986 = c19258BuildDialog.m44415();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m38199() {
        CheckBox checkBox = this.f49979;
        this.f49985.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38204() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f49986;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1448().setOnClickListener(new ViewOnClickListenerC16718(3, this));
        C5062 c5062 = this.f49985;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38200(AbstractViewOnClickListenerC16235 abstractViewOnClickListenerC16235) {
        abstractViewOnClickListenerC16235.f49987.m39056().m10217(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12164 c12164Matcher;
        int i;
        C12164 c12164;
        int iM24993;
        C5062 c5062 = this.f49985;
        String string = c5062.m14611().toString();
        boolean zIsEmpty = string.isEmpty();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f49986;
        if (zIsEmpty) {
            dialogInterfaceC0206.dismiss();
            return;
        }
        int selectedItemPosition = this.f49981.getSelectedItemPosition();
        if (selectedItemPosition != 0 || C23196.m51454()) {
            boolean zIsChecked = this.f49980.isChecked();
            boolean zIsChecked2 = this.f49979.isChecked();
            boolean zIsChecked3 = this.f49983.isChecked();
            boolean zIsChecked4 = this.f49982.isChecked();
            boolean zIsChecked5 = this.f49984.isChecked();
            if (selectedItemPosition == 0 || selectedItemPosition == 1) {
                try {
                    c12164Matcher = C3058.m9359(string, zIsChecked2, zIsChecked).matcher((CharSequence) "");
                } catch (Exception e) {
                    C21374.m48459((CharSequence) e.getMessage());
                    c5062.requestFocus();
                    return;
                }
            } else {
                c12164Matcher = null;
                if (selectedItemPosition == 2) {
                    if (zIsChecked3) {
                        if (!string.startsWith("0x") || string.startsWith("0X")) {
                            string = string.substring(2);
                        }
                        if (!C9896.m24999(string)) {
                            C21374.m48457(R.string.MT_Protector);
                            c5062.requestFocus();
                            return;
                        }
                        iM24993 = C9896.m24993(string);
                    } else {
                        try {
                            iM24993 = Integer.parseInt(string);
                        } catch (NumberFormatException unused) {
                            C21374.m48457(R.string.MT_Protector);
                            c5062.requestFocus();
                            return;
                        }
                    }
                } else if (selectedItemPosition == 3) {
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
                } else {
                    if (selectedItemPosition == 4) {
                        if (zIsChecked3) {
                            if (!string.startsWith("0x")) {
                                string = string.substring(2);
                            } else {
                                string = string.substring(2);
                            }
                            if (!C9896.m24999(string)) {
                                C21374.m48457(R.string.MT_Protector);
                                c5062.requestFocus();
                                return;
                            }
                            iM24993 = C9896.m24993(string);
                        } else {
                            iM24993 = Integer.parseInt(string);
                        }
                    }
                    c5062.m14610();
                    ApplicationC20075.f65008.edit().mo25853(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                    dialogInterfaceC0206.dismiss();
                    new C9181(this, selectedItemPosition, c12164, zIsChecked5, i, zIsChecked4).m20274();
                    return;
                }
                i = iM24993;
                c12164 = null;
                c5062.m14610();
                ApplicationC20075.f65008.edit().mo25853(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                dialogInterfaceC0206.dismiss();
                new C9181(this, selectedItemPosition, c12164, zIsChecked5, i, zIsChecked4).m20274();
                return;
            }
            c12164 = c12164Matcher;
            i = 0;
            c5062.m14610();
            ApplicationC20075.f65008.edit().mo25853(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
            dialogInterfaceC0206.dismiss();
            new C9181(this, selectedItemPosition, c12164, zIsChecked5, i, zIsChecked4).m20274();
            return;
        }
        this.f49987.m39056().m10217(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f49985.m14604(i == 0 || i == 1);
        CheckBox checkBox = this.f49984;
        CheckBox checkBox2 = this.f49982;
        CheckBox checkBox3 = this.f49983;
        CheckBox checkBox4 = this.f49979;
        CheckBox checkBox5 = this.f49980;
        if (i == 0) {
            checkBox5.setVisibility(0);
            checkBox4.setVisibility(0);
            checkBox2.setVisibility(0);
            checkBox3.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1) {
            checkBox5.setVisibility(0);
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(0);
        } else if (i == 2) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 3) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 4) {
            checkBox5.setVisibility(8);
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        }
        m38199();
    }
}
