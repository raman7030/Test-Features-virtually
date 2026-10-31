package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۚۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C76R */
/* JADX INFO: loaded from: classes2.dex */
public final class C5189 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f16267;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18595 f16268;

    public C5189(AbstractActivityC3346 abstractActivityC3346, InterfaceC18595 interfaceC18595) {
        this.f16267 = abstractActivityC3346;
        this.f16268 = interfaceC18595;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14952() {
        C19258 c19258BuildDialog = this.f16267.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44418(R.array.MT_Protector, new DialogInterfaceOnClickListenerC6848(1, this));
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14946(final C5189 c5189, int i) {
        if (i >= 0 && i <= 3) {
            c5189.f16268.mo32374(i);
            return;
        }
        if (i == 4) {
            String strM14941 = m14941(ApplicationC20075.f65008.getString("smint", null));
            String strM14942 = m14941(ApplicationC20075.f65008.getString("smaxt", null));
            if (strM14941 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                strM14941 = C17283.m40572(calendar.getTimeInMillis());
            }
            m14945(c5189.f16267, R.string.MT_Protector, strM14941, strM14942, true, new C8073(c5189));
            return;
        }
        if (i == 5) {
            m14944(c5189.f16267, R.string.MT_Protector, ApplicationC20075.f65008.getString("smins", null), ApplicationC20075.f65008.getString("smaxs", null), ApplicationC20075.f65008.getInt("ssun", 1), true, new C14127(c5189));
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = c5189.f16267;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        final C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = {(RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.MT_Protector), (RadioButton) viewM10216.findViewById(R.id.radioButton3)};
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("skc", false));
        final int i2 = ApplicationC20075.f65008.getInt("skt", 0);
        final int[] iArr = {i2};
        if (i2 < 0 || i2 >= 4) {
            iArr[0] = 0;
        }
        ViewOnClickListenerC9110 viewOnClickListenerC9110 = new ViewOnClickListenerC9110(1, radioButtonArr, iArr);
        radioButtonArr[iArr[0]].setChecked(true);
        for (int i3 = 0; i3 < 4; i3++) {
            radioButtonArr[i3].setOnClickListener(viewOnClickListenerC9110);
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۜܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C5189.m14948(this.f20326, c5062, iArr, i2, checkBox);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
        C4925.m14329(c5062.m14607());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long[] m14949(int i, long j) {
        long timeInMillis;
        long timeInMillis2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i == 0) {
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 1) {
            calendar.set(7, calendar.getFirstDayOfWeek());
            long timeInMillis3 = calendar.getTimeInMillis();
            calendar.add(5, 7);
            timeInMillis2 = calendar.getTimeInMillis();
            timeInMillis = timeInMillis3;
        } else if (i == 2) {
            calendar.set(5, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(2, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 3) {
            calendar.set(6, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(1, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else {
            throw new IllegalArgumentException();
        }
        return new long[]{timeInMillis, timeInMillis2};
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14951(C5189 c5189, long j, long j2) {
        InterfaceC18595 interfaceC18595 = c5189.f16268;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C13132.FOREVER_NS;
        }
        interfaceC18595.mo32377(j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14945(AbstractActivityC3346 abstractActivityC3346, int i, String str, String str2, final boolean z, final InterfaceC0249 interfaceC0249) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(i);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText = textInputLayout.getEditText();
        C11003.requireNonNull(editText);
        final EditText editText2 = textInputLayout2.getEditText();
        C11003.requireNonNull(editText2);
        editText.setText(str);
        editText2.setText(str2);
        editText.addTextChangedListener(new C1524(false));
        editText2.addTextChangedListener(new C1524(false));
        editText.addTextChangedListener(new C3778(textInputLayout));
        editText2.addTextChangedListener(new C3778(textInputLayout2));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        final DialogInterfaceC0206 dialogInterfaceC0206M16343 = C5834.m16343(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText3 = editText;
                String strTrim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String strTrim2 = editText4.getText().toString().trim();
                boolean zIsEmpty = strTrim.isEmpty();
                TextInputLayout textInputLayout3 = textInputLayout;
                if (zIsEmpty && strTrim2.isEmpty()) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector));
                    return;
                }
                long jM14950 = strTrim.isEmpty() ? -1L : C5189.m14950(strTrim);
                if (!strTrim.isEmpty() && jM14950 < 0) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector));
                    return;
                }
                long jM14951 = strTrim2.isEmpty() ? -1L : C5189.m14950(strTrim2);
                if (!strTrim2.isEmpty() && jM14951 < 0) {
                    editText4.requestFocus();
                    textInputLayout2.setError(C4925.m14327(R.string.MT_Protector));
                } else if (jM14950 != -1 && jM14951 != -1 && jM14950 >= jM14951) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector));
                } else {
                    if (z) {
                        ApplicationC20075.f65008.edit().putString("smint", strTrim).putString("smaxt", strTrim2).apply();
                    }
                    interfaceC0249.mo1507(jM14950, jM14951);
                    dialogInterfaceC0206M16343.dismiss();
                }
            }
        });
        dialogInterfaceC0206M16343.m1448().setOnClickListener(new ViewOnClickListenerC16391(editText2, editText));
        C4925.m14329(editText);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14941(String str) {
        if (str == null || str.isEmpty() || m14950(str) >= 0) {
            return str;
        }
        long jM40575 = C17283.m40575(str);
        if (jM40575 < 0 || !C17283.m40576(jM40575).equals(str)) {
            return null;
        }
        return C17283.m40572(jM40575);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m14950(String str) {
        long jM40570 = C17283.m40570(str);
        if (jM40570 < 0 || !C17283.m40572(jM40570).equals(str)) {
            return -1L;
        }
        return jM40570;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14942(Main main, long j, long j2, C11505 c11505) {
        m14945(main, R.string.MT_Protector, j == -1 ? "" : C17283.m40572(j), j2 != -1 ? C17283.m40572(j2) : "", false, c11505);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14947(C5189 c5189, long j, long j2) {
        InterfaceC18595 interfaceC18595 = c5189.f16268;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C13132.FOREVER_NS;
        }
        interfaceC18595.mo32375(j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14944(AbstractActivityC3346 abstractActivityC3346, int i, String str, String str2, int i2, final boolean z, final InterfaceC19301 interfaceC19301) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C2367(abstractActivityC3346, Arrays.asList("B", "KB", "MB", "GB")));
        editText.setText(str);
        editText2.setText(str2);
        spinner.setSelection(i2);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        final DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                long j2;
                long j3;
                long j4;
                EditText editText3 = editText;
                String strTrim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String strTrim2 = editText4.getText().toString().trim();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                long j5 = 1 << (selectedItemPosition * 10);
                if (strTrim.isEmpty() && strTrim2.isEmpty()) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                if (strTrim.isEmpty()) {
                    j2 = -1;
                } else {
                    try {
                        j = Long.parseLong(strTrim);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                    j2 = j * j5;
                }
                if (!strTrim.isEmpty() && j2 < 0) {
                    editText3.requestFocus();
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                if (strTrim2.isEmpty()) {
                    j4 = -1;
                } else {
                    try {
                        j3 = Long.parseLong(strTrim2);
                    } catch (NumberFormatException unused2) {
                        j3 = -1;
                    }
                    j4 = j3 * j5;
                }
                if (!strTrim2.isEmpty() && j4 < 0) {
                    editText4.requestFocus();
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                if ((j2 != -1 ? j2 : 0L) >= (j4 == -1 ? C13132.FOREVER_NS : j4)) {
                    C21374.m48457(R.string.MT_Protector);
                    return;
                }
                if (z) {
                    ApplicationC20075.f65008.edit().putString("smins", strTrim).putString("smaxs", strTrim2).mo25853(selectedItemPosition, "ssun").apply();
                }
                interfaceC19301.mo33424(j2, j4);
                dialogInterfaceC0206M19253.dismiss();
            }
        });
        C4925.m14329(editText);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14943(Main main, long j, long j2, C13970 c13970) {
        int i;
        if (j != -1 || j2 != -1) {
            int i2 = 3;
            while (true) {
                if (i2 <= 0) {
                    i = 0;
                    break;
                }
                long j3 = 1 << (i2 * 10);
                if ((j == -1 || j % j3 == 0) && (j2 == -1 || j2 % j3 == 0)) {
                    i = i2;
                    break;
                }
                i2--;
            }
        } else {
            i = 1;
        }
        long j4 = 1 << (i * 10);
        m14944(main, R.string.MT_Protector, j == -1 ? "" : Long.toString(j / j4), j2 == -1 ? "" : Long.toString(j2 / j4), i, false, c13970);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14948(C5189 c5189, C5062 c5062, int[] iArr, int i, CheckBox checkBox) {
        InterfaceC7397 interfaceC7397;
        c5062.m14610();
        if (iArr[0] != i) {
            ApplicationC20075.f65008.edit().mo25853(iArr[0], "skt").apply();
        }
        ApplicationC20075.f65008.edit().putBoolean("skc", checkBox.isChecked()).apply();
        final String string = c5062.m14611().toString();
        if (string.isEmpty()) {
            return;
        }
        final boolean zIsChecked = checkBox.isChecked();
        int i2 = iArr[0];
        if (i2 == 0) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ۢۜܳ
                @Override // l.InterfaceC7397
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.contains(str2) : C9679.m24616((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 1) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ۡۜܳ
                @Override // l.InterfaceC7397
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return !str.contains(str2);
                    }
                    return !C9679.m24616((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 2) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ܺۜܳ
                @Override // l.InterfaceC7397
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.startsWith(str2) : C9679.m24619(str2, str);
                }
            };
        } else if (i2 == 3) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ܳۜܳ
                @Override // l.InterfaceC7397
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.endsWith(str2) : C9679.m24617((CharSequence) str2, str);
                }
            };
        } else {
            throw new IllegalArgumentException();
        }
        c5189.f16268.mo32376(interfaceC7397);
    }
}
