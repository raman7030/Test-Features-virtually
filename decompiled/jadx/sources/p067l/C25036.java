package p067l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C25036 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public static final byte[] f79921 = {-17, -69, -65};

    /* JADX INFO: renamed from: ۧ */
    public static int m54968(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("local") && !c4697.m9971() && c4697.m9966() == 1 && c4697.m9961().mo39135();
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(final C4697 c4697) {
        Main mainM9965 = c4697.m9965();
        final InterfaceC19370 interfaceC19370M9961 = c4697.m9961();
        View viewM12252 = mainM9965.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView2 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner1);
        TextView textView3 = (TextView) viewM12252.findViewById(R.id.text1);
        final C12096 c12096 = (C12096) viewM12252.findViewById(R.id.MT_Protector);
        final Spinner spinner2 = (Spinner) viewM12252.findViewById(R.id.spinner2);
        TextView textView4 = (TextView) viewM12252.findViewById(R.id.textCharset);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        final C12096 c12097 = (C12096) viewM12252.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.checkBoxText1);
        TextView textView5 = (TextView) viewM12252.findViewById(R.id.textSeparatorPolicy);
        final Spinner spinner3 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView6 = (TextView) viewM12252.findViewById(R.id.text2);
        final CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        checkBox3.setText(mainM9965.getResources().getQuantityString(R.plurals.MT_Protector, 1));
        textView.setText(interfaceC19370M9961.getName());
        textView2.setText(C24158.m53419(interfaceC19370M9961.getSize()));
        c12097.m32576(2);
        c12097.mo27932((CharSequence) (interfaceC19370M9961.getName() + ".{D}"));
        spinner2.setAdapter((SpinnerAdapter) new C21438(mainM9965, Arrays.asList("B", "KB", "MB", "GB")));
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC4622(1, mainM9965, editText));
        final C21704 c21704 = new C21704();
        c21704.m48991();
        checkBox3.setChecked(c21704.f68345);
        spinner.setSelection(c21704.f68347);
        m54969(c21704, textView3, c12096, spinner2, textView4, editText, viewFindViewById, checkBox, textView5, spinner3, checkBox2);
        RunnableC7622 runnableC7622 = new RunnableC7622(mainM9965, interfaceC19370M9961.getSize(), spinner, c12096, spinner2, textView6);
        runnableC7622.run();
        spinner.setOnItemSelectedListener(new C17008(c21704, c12096, spinner2, editText, checkBox, spinner3, checkBox2, mainM9965, textView3, textView4, viewFindViewById, textView5, runnableC7622));
        c12096.m32377(new C23045(runnableC7622));
        spinner2.setOnItemSelectedListener(new C23715(runnableC7622));
        C20671 c20671BuildDialog = mainM9965.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.֨ᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25036.m54965(c12097, c21704, c12096, spinner2, editText, checkBox, spinner3, checkBox2, checkBox3, dialogInterfaceC2564M21200, c4697, interfaceC19370M9961);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[Catch: Exception -> 0x00d3, PHI: r4
      0x0055: PHI (r4v8 java.lang.String) = (r4v7 java.lang.String), (r4v12 java.lang.String) binds: [B:45:0x008e, B:31:0x0052] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00d3, blocks: (B:8:0x0010, B:10:0x0014, B:13:0x001a, B:14:0x001f, B:17:0x0023, B:20:0x0028, B:21:0x002d, B:24:0x0033, B:28:0x003c, B:30:0x004e, B:33:0x0055, B:34:0x0059, B:35:0x005e, B:38:0x0062, B:40:0x006e, B:42:0x0078, B:44:0x008a), top: B:70:0x0010 }] */
    /* JADX INFO: renamed from: ֫ */
    public static void m54965(C12096 c12096, C21704 c21704, C12096 c12097, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2, CheckBox checkBox3, DialogInterfaceC2564 dialogInterfaceC2564, C4697 c4697, InterfaceC19370 interfaceC19370) {
        String strTrim;
        if (c12096.m32590() == 0) {
            c12096.requestFocus();
            return;
        }
        try {
            m54970(c21704, c12097, spinner, editText, checkBox, spinner2, checkBox2);
            try {
                int i = c21704.f68347;
                if (i == 0) {
                    if (c21704.f68341 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 1) {
                    if (c21704.f68342 <= 0) {
                        throw new NumberFormatException();
                    }
                } else if (i == 2) {
                    int i2 = c21704.f68343;
                    if (i2 < 1 || i2 > 999999999) {
                        throw new NumberFormatException();
                    }
                    strTrim = editText.getText().toString().trim();
                    if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                        Charset.forName(strTrim);
                    }
                } else if (i == 3) {
                    if (C16318.m37122(c21704.f68353).isEmpty()) {
                        C22682.m50793(R.string.MT_Protector);
                        c12097.requestFocus();
                        return;
                    } else {
                        strTrim = editText.getText().toString().trim();
                        if (!strTrim.isEmpty() && !"UTF-8-BOM".equalsIgnoreCase(strTrim)) {
                            Charset.forName(strTrim);
                        }
                    }
                }
                c21704.f68345 = checkBox3.isChecked();
                c21704.m48992();
                dialogInterfaceC2564.dismiss();
                String string = c12096.m32500().toString();
                if (!string.contains("{D}")) {
                    string = string.concat("{D}");
                }
                int i3 = C16723.f49313;
                C3313 c3313 = new C3313(C9633.class);
                c3313.m5789(c4697);
                c3313.m5777("file", interfaceC19370.getPath());
                c3313.m5776("arguments", c21704);
                c3313.m5777("pattern", string);
                c3313.m5772();
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    C22682.m50793(R.string.MT_Protector);
                } else {
                    if ((e instanceof IllegalCharsetNameException) || (e instanceof UnsupportedCharsetException)) {
                        C22682.m50795((CharSequence) e.toString());
                        editText.selectAll();
                        editText.requestFocus();
                        return;
                    }
                    C22682.m50795((CharSequence) e.toString());
                }
                c12097.m27922();
                c12097.requestFocus();
            }
        } catch (Exception e2) {
            if (e2 instanceof NumberFormatException) {
                C22682.m50793(R.string.MT_Protector);
            } else {
                C22682.m50795((CharSequence) e2.toString());
            }
            c12097.m27922();
            c12097.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m54969(C21704 c21704, TextView textView, C12096 c12096, Spinner spinner, TextView textView2, EditText editText, View view, CheckBox checkBox, TextView textView3, Spinner spinner2, CheckBox checkBox2) {
        int i = c21704.f68347;
        spinner.setVisibility(i == 0 ? 0 : 8);
        textView2.setVisibility(c21704.m48990() ? 0 : 8);
        editText.setVisibility(c21704.m48990() ? 0 : 8);
        view.setVisibility(c21704.m48990() ? 0 : 8);
        checkBox.setVisibility(i == 2 ? 0 : 8);
        textView3.setVisibility(i == 3 ? 0 : 8);
        spinner2.setVisibility(i == 3 ? 0 : 8);
        checkBox2.setVisibility(i == 3 ? 0 : 8);
        editText.setText(c21704.f68351);
        if (i == 0) {
            m54964(c12096);
            textView.setText(R.string.MT_Protector);
            c12096.mo27932((CharSequence) String.valueOf(c21704.f68341));
            spinner.setSelection(c21704.f68348);
        } else if (i == 1) {
            m54964(c12096);
            textView.setText(R.string.MT_Protector);
            c12096.mo27932((CharSequence) String.valueOf(c21704.f68342));
        } else if (i == 2) {
            m54964(c12096);
            textView.setText(R.string.MT_Protector);
            c12096.mo27932((CharSequence) String.valueOf(c21704.f68343));
            checkBox.setText(R.string.MT_Protector);
            checkBox.setChecked(c21704.f68346);
        } else {
            c12096.m27948(524289);
            c12096.m27919(new InputFilter[0]);
            c12096.m27916(true);
            textView.setText(R.string.MT_Protector);
            c12096.mo27932((CharSequence) c21704.f68353);
            int i2 = c21704.f68349;
            spinner2.setSelection((i2 == 0 || i2 == 1 || i2 == 2) ? i2 : 0);
            checkBox2.setText(R.string.MT_Protector);
            checkBox2.setChecked(c21704.f68344);
            c12096.mo27941(c12096.m32590());
        }
        if (i != 3) {
            checkBox2.setChecked(c21704.f68344);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54964(C12096 c12096) {
        c12096.m27948(2);
        c12096.m27919(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c12096.m27916(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54967(C21704 c21704, C12096 c12096, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        try {
            m54970(c21704, c12096, spinner, editText, checkBox, spinner2, checkBox2);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m54970(C21704 c21704, C12096 c12096, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        int i = c21704.f68347;
        if (i == 0) {
            c21704.f68341 = Integer.parseInt(c12096.m32500().toString());
            c21704.f68348 = spinner.getSelectedItemPosition();
            return;
        }
        if (i == 1) {
            c21704.f68342 = Integer.parseInt(c12096.m32500().toString());
            return;
        }
        if (i == 2) {
            c21704.f68343 = Integer.parseInt(c12096.m32500().toString());
            c21704.f68346 = checkBox.isChecked();
            c21704.f68351 = editText.getText().toString();
        } else if (i == 3) {
            c21704.f68353 = c12096.m32500().toString();
            int selectedItemPosition = spinner2.getSelectedItemPosition();
            if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2) {
                selectedItemPosition = 0;
            }
            c21704.f68349 = selectedItemPosition;
            c21704.f68344 = checkBox2.isChecked();
            c21704.f68351 = editText.getText().toString();
        }
    }
}
