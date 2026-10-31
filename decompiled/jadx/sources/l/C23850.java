package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C23850 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f77171 = {-17, -69, -65};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52559(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923() && c2450.m7918() == 1 && c2450.m7913().mo36969();
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        Main mainM7917 = c2450.m7917();
        final InterfaceC17889 interfaceC17889M7913 = c2450.m7913();
        View viewM10216 = mainM7917.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner1);
        TextView textView3 = (TextView) viewM10216.findViewById(R.id.text1);
        final C10235 c10235 = (C10235) viewM10216.findViewById(R.id.MT_Protector);
        final Spinner spinner2 = (Spinner) viewM10216.findViewById(R.id.spinner2);
        TextView textView4 = (TextView) viewM10216.findViewById(R.id.textCharset);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        final C10235 c10236 = (C10235) viewM10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.checkBoxText1);
        TextView textView5 = (TextView) viewM10216.findViewById(R.id.textSeparatorPolicy);
        final Spinner spinner3 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM10216.findViewById(R.id.text2);
        final CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        checkBox3.setText(mainM7917.getResources().getQuantityString(R.plurals.MT_Protector, 1));
        textView.setText(interfaceC17889M7913.getName());
        textView2.setText(C22927.m51028(interfaceC17889M7913.getSize()));
        c10236.m30512(2);
        c10236.mo25910((CharSequence) (interfaceC17889M7913.getName() + ".{D}"));
        spinner2.setAdapter((SpinnerAdapter) new C20065(mainM7917, Arrays.asList("B", "KB", "MB", "GB")));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC2371(1, mainM7917, editText));
        final C20344 c20344 = new C20344();
        c20344.m46668();
        checkBox3.setChecked(c20344.f65669);
        spinner.setSelection(c20344.f65671);
        m52560(c20344, textView3, c10235, spinner2, textView4, editText, viewFindViewById, checkBox, textView5, spinner3, checkBox2);
        RunnableC5527 runnableC5527 = new RunnableC5527(mainM7917, interfaceC17889M7913.getSize(), spinner, c10235, spinner2, textView6);
        runnableC5527.run();
        spinner.setOnItemSelectedListener(new C15403(c20344, c10235, spinner2, editText, checkBox, spinner3, checkBox2, mainM7917, textView3, textView4, viewFindViewById, textView5, runnableC5527));
        c10235.m30313(new C21755(runnableC5527));
        spinner2.setOnItemSelectedListener(new C22460(runnableC5527));
        C19258 c19258BuildDialog = mainM7917.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23850.m52556(c10236, c20344, c10235, spinner2, editText, checkBox, spinner3, checkBox2, checkBox3, dialogInterfaceC0206M19253, c2450, interfaceC17889M7913);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: Exception -> 0x00d3, PHI: r4
      0x0055: PHI (r4v8 java.lang.String) = (r4v7 java.lang.String), (r4v12 java.lang.String) binds: [B:45:0x008e, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:8:0x0010, B:10:0x0014, B:13:0x001a, B:14:0x001f, B:17:0x0023, B:20:0x0028, B:21:0x002d, B:24:0x0033, B:28:0x003c, B:30:0x004e, B:33:0x0055, B:34:0x0059, B:35:0x005e, B:38:0x0062, B:40:0x006e, B:42:0x0078, B:44:0x008a), top: B:70:0x0010 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52556(C10235 c10235, C20344 c20344, C10235 c10236, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, CheckBox checkBox3, DialogInterfaceC0206 dialogInterfaceC0206, C2450 c2450, InterfaceC17889 interfaceC17889) {
        String strTrim;
        if (c10235.m30526() == 0) {
            c10235.requestFocus();
            return;
        }
        try {
            m52561(c20344, c10236, spinner, editText, checkBox, spinner2, checkBox2);
            try {
                int i = c20344.f65671;
                if (i == 0) {
                    if (c20344.f65665 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 1) {
                    if (c20344.f65666 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 2) {
                    int i2 = c20344.f65667;
                    if (i2 < 1 || i2 > 999999999) {
                        throw new NumberFormatException();
                    }
                    strTrim = editText.getText().toString().trim();
                    if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                        Charset.forName(strTrim);
                    }
                } else if (i == 3) {
                    if (C14677.m34975(c20344.f65677).isEmpty()) {
                        C21374.m48457(R.string.MT_Protector);
                        c10236.requestFocus();
                        return;
                    } else {
                        strTrim = editText.getText().toString().trim();
                        if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                            Charset.forName(strTrim);
                        }
                    }
                }
                c20344.f65669 = checkBox3.isChecked();
                c20344.m46669();
                dialogInterfaceC0206.dismiss();
                String string = c10235.m30436().toString();
                if (!string.contains("{D}")) {
                    string = string.concat("{D}");
                }
                int i3 = C15104.f46193;
                C0994 c0994 = new C0994(C7643.class);
                c0994.m3486(c2450);
                c0994.m3474("file", interfaceC17889.getPath());
                c0994.m3473("arguments", c20344);
                c0994.m3474("pattern", string);
                c0994.m3469();
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    C21374.m48457(R.string.MT_Protector);
                } else {
                    if ((e instanceof IllegalCharsetNameException) || (e instanceof UnsupportedCharsetException)) {
                        C21374.m48459((CharSequence) e.toString());
                        editText.selectAll();
                        editText.requestFocus();
                        return;
                    }
                    C21374.m48459((CharSequence) e.toString());
                }
                c10236.m25900();
                c10236.requestFocus();
            }
        } catch (Exception e2) {
            if (e2 instanceof NumberFormatException) {
                C21374.m48457(R.string.MT_Protector);
            } else {
                C21374.m48459((CharSequence) e2.toString());
            }
            c10236.m25900();
            c10236.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52560(C20344 c20344, TextView textView, C10235 c10235, Spinner spinner, TextView textView2, EditText editText, View view, CheckBox checkBox, TextView textView3, Spinner spinner2, CheckBox checkBox2) {
        int i = c20344.f65671;
        spinner.setVisibility(i == 0 ? 0 : 8);
        textView2.setVisibility(c20344.m46667() ? 0 : 8);
        editText.setVisibility(c20344.m46667() ? 0 : 8);
        view.setVisibility(c20344.m46667() ? 0 : 8);
        checkBox.setVisibility(i == 2 ? 0 : 8);
        textView3.setVisibility(i == 3 ? 0 : 8);
        spinner2.setVisibility(i == 3 ? 0 : 8);
        checkBox2.setVisibility(i == 3 ? 0 : 8);
        editText.setText(c20344.f65675);
        if (i == 0) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65665));
            spinner.setSelection(c20344.f65672);
        } else if (i == 1) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65666));
        } else if (i == 2) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65667));
            checkBox.setText(R.string.MT_Protector);
            checkBox.setChecked(c20344.f65670);
        } else {
            c10235.m25926(524289);
            c10235.m25897(new InputFilter[0]);
            c10235.m25894(true);
            textView.setText(R.string.MT_Protector);
            c10235.mo25910((CharSequence) c20344.f65677);
            int i2 = c20344.f65673;
            spinner2.setSelection((i2 == 0 || i2 == 1 || i2 == 2) ? i2 : 0);
            checkBox2.setText(R.string.MT_Protector);
            checkBox2.setChecked(c20344.f65668);
            c10235.mo25919(c10235.m30526());
        }
        if (i != 3) {
            checkBox2.setChecked(c20344.f65668);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52555(C10235 c10235) {
        c10235.m25926(2);
        c10235.m25897(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c10235.m25894(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52558(C20344 c20344, C10235 c10235, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        try {
            m52561(c20344, c10235, spinner, editText, checkBox, spinner2, checkBox2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52561(C20344 c20344, C10235 c10235, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        int i = c20344.f65671;
        if (i == 0) {
            c20344.f65665 = Integer.parseInt(c10235.m30436().toString());
            c20344.f65672 = spinner.getSelectedItemPosition();
            return;
        }
        if (i == 1) {
            c20344.f65666 = Integer.parseInt(c10235.m30436().toString());
            return;
        }
        if (i == 2) {
            c20344.f65667 = Integer.parseInt(c10235.m30436().toString());
            c20344.f65670 = checkBox.isChecked();
            c20344.f65675 = editText.getText().toString();
        } else if (i == 3) {
            c20344.f65677 = c10235.m30436().toString();
            int selectedItemPosition = spinner2.getSelectedItemPosition();
            if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2) {
                selectedItemPosition = 0;
            }
            c20344.f65673 = selectedItemPosition;
            c20344.f65668 = checkBox2.isChecked();
            c20344.f65675 = editText.getText().toString();
        }
    }
}
