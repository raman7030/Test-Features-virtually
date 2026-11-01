package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.util.List;

/* JADX INFO: renamed from: l.ܺ᩹᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 35GV */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC17799 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public final List f53146;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17043 f53147;

    /* JADX INFO: renamed from: ۛ */
    public final CheckBox f53148;

    /* JADX INFO: renamed from: ۤ */
    public final CheckBox f53149;

    /* JADX INFO: renamed from: ۨ */
    public final Spinner f53150;

    /* JADX INFO: renamed from: ۫ */
    public final CheckBox f53151;

    /* JADX INFO: renamed from: ۬ */
    public final CheckBox f53152;

    /* JADX INFO: renamed from: ᩶ */
    public final CheckBox f53153;

    /* JADX INFO: renamed from: ᩸ */
    public final C7179 f53154;

    /* JADX INFO: renamed from: ᩹ */
    public final DialogInterfaceC2564 f53155;

    /* JADX INFO: renamed from: ᩺ */
    public final C18107 f53156;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AbstractViewOnClickListenerC17799(C18107 c18107, AbstractC17043 abstractC17043, List list, final Runnable runnable) {
        this.f53156 = c18107;
        this.f53147 = abstractC17043;
        this.f53146 = list;
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        if (list != null) {
            ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(R.string.MT_Protector);
        }
        viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        viewM12252.findViewById(R.id.editText2).setVisibility(8);
        this.f53154 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        this.f53150 = spinner;
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f53149 = checkBox;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f53148 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f53152 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f53151 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f53153 = checkBox5;
        spinner.setSelection(ApplicationC21448.f67649.getInt("axml_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("axml_search_match_case", false));
        checkBox2.setChecked(ApplicationC21448.f67649.getBoolean("axml_search_regex", false));
        checkBox3.setChecked(ApplicationC21448.f67649.getBoolean("axml_search_hex", true));
        checkBox4.setChecked(ApplicationC21448.f67649.getBoolean("axml_search_id2name", true));
        checkBox5.setChecked(ApplicationC21448.f67649.getBoolean("axml_search_exactly_match", true));
        checkBox2.setOnCheckedChangeListener(new C3890(1, this));
        m40411();
        C20671 c20671BuildDialog = c18107.m41282().buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩻᩹᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46713(new DialogInterface.OnCancelListener() { // from class: l.ۜ᩹᩻
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f53155 = c20671BuildDialog.m46709();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m40411() {
        CheckBox checkBox = this.f53148;
        this.f53154.m16516(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40416() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f53155;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(this);
        dialogInterfaceC2564.m3861().setOnClickListener(new ViewOnClickListenerC18257(3, this));
        C7179 c7179 = this.f53154;
        c7179.requestFocus();
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m40412(AbstractViewOnClickListenerC17799 abstractViewOnClickListenerC17799) {
        abstractViewOnClickListenerC17799.f53156.m41282().m12253(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C13929 c13929Matcher;
        int i;
        C13929 c13929;
        int iM27008;
        C7179 c7179 = this.f53154;
        String string = c7179.m16518().toString();
        boolean zIsEmpty = string.isEmpty();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f53155;
        if (zIsEmpty) {
            dialogInterfaceC2564.dismiss();
            return;
        }
        int selectedItemPosition = this.f53150.getSelectedItemPosition();
        if (selectedItemPosition != 0 || C24414.m53850()) {
            boolean zIsChecked = this.f53149.isChecked();
            boolean zIsChecked2 = this.f53148.isChecked();
            boolean zIsChecked3 = this.f53152.isChecked();
            boolean zIsChecked4 = this.f53151.isChecked();
            boolean zIsChecked5 = this.f53153.isChecked();
            if (selectedItemPosition == 0 || selectedItemPosition == 1) {
                try {
                    c13929Matcher = C5275.m11401(string, zIsChecked2, zIsChecked).matcher((CharSequence) "");
                } catch (Exception e) {
                    C22682.m50795((CharSequence) e.getMessage());
                    c7179.requestFocus();
                    return;
                }
            } else {
                c13929Matcher = null;
                if (selectedItemPosition == 2) {
                    if (zIsChecked3) {
                        if (!string.startsWith("0x") || string.startsWith("0X")) {
                            string = string.substring(2);
                        }
                        if (!C11774.m27014(string)) {
                            C22682.m50793(R.string.MT_Protector);
                            c7179.requestFocus();
                            return;
                        }
                        iM27008 = C11774.m27008(string);
                    } else {
                        try {
                            iM27008 = Integer.parseInt(string);
                        } catch (NumberFormatException unused) {
                            C22682.m50793(R.string.MT_Protector);
                            c7179.requestFocus();
                            return;
                        }
                    }
                } else if (selectedItemPosition == 3) {
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
                } else {
                    if (selectedItemPosition == 4) {
                        if (zIsChecked3) {
                            if (!string.startsWith("0x")) {
                                string = string.substring(2);
                            } else {
                                string = string.substring(2);
                            }
                            if (!C11774.m27014(string)) {
                                C22682.m50793(R.string.MT_Protector);
                                c7179.requestFocus();
                                return;
                            }
                            iM27008 = C11774.m27008(string);
                        } else {
                            iM27008 = Integer.parseInt(string);
                        }
                    }
                    c7179.m16517();
                    ApplicationC21448.f67649.edit().mo27875(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                    dialogInterfaceC2564.dismiss();
                    new C11095(this, selectedItemPosition, c13929, zIsChecked5, i, zIsChecked4).m22250();
                    return;
                }
                i = iM27008;
                c13929 = null;
                c7179.m16517();
                ApplicationC21448.f67649.edit().mo27875(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
                dialogInterfaceC2564.dismiss();
                new C11095(this, selectedItemPosition, c13929, zIsChecked5, i, zIsChecked4).m22250();
                return;
            }
            c13929 = c13929Matcher;
            i = 0;
            c7179.m16517();
            ApplicationC21448.f67649.edit().mo27875(selectedItemPosition, "axml_search_type").putBoolean("axml_search_match_case", zIsChecked).putBoolean("axml_search_regex", zIsChecked2).putBoolean("axml_search_hex", zIsChecked3).putBoolean("axml_search_id2name", zIsChecked4).putBoolean("axml_search_exactly_match", zIsChecked5).apply();
            dialogInterfaceC2564.dismiss();
            new C11095(this, selectedItemPosition, c13929, zIsChecked5, i, zIsChecked4).m22250();
            return;
        }
        this.f53156.m41282().m12253(R.string.MT_Protector, R.string.MT_Protector, false);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f53154.m16511(i == 0 || i == 1);
        CheckBox checkBox = this.f53153;
        CheckBox checkBox2 = this.f53151;
        CheckBox checkBox3 = this.f53152;
        CheckBox checkBox4 = this.f53148;
        CheckBox checkBox5 = this.f53149;
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
        m40411();
    }
}
