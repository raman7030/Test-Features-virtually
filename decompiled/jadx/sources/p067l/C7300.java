package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۚۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C76R */
/* JADX INFO: loaded from: classes2.dex */
public final class C7300 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f19108;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20041 f19109;

    public C7300(AbstractActivityC5549 abstractActivityC5549, InterfaceC20041 interfaceC20041) {
        this.f19108 = abstractActivityC5549;
        this.f19109 = interfaceC20041;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16862() {
        C20671 c20671BuildDialog = this.f19108.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46712(R.array.MT_Protector, new DialogInterfaceOnClickListenerC8877(1, this));
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16856(final C7300 c7300, int i) {
        if (i >= 0 && i <= 3) {
            c7300.f19109.mo34475(i);
            return;
        }
        if (i == 4) {
            String strM16851 = m16851(ApplicationC21448.f67649.getString("smint", null));
            String strM16852 = m16851(ApplicationC21448.f67649.getString("smaxt", null));
            if (strM16851 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                strM16851 = C18794.m42823(calendar.getTimeInMillis());
            }
            m16855(c7300.f19108, R.string.MT_Protector, strM16851, strM16852, true, new C10041(c7300));
            return;
        }
        if (i == 5) {
            m16854(c7300.f19108, R.string.MT_Protector, ApplicationC21448.f67649.getString("smins", null), ApplicationC21448.f67649.getString("smaxs", null), ApplicationC21448.f67649.getInt("ssun", 1), true, new C15795(c7300));
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC5549 abstractActivityC5549 = c7300.f19108;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        final C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        final CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        RadioButton[] radioButtonArr = {(RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.MT_Protector), (RadioButton) viewM12252.findViewById(R.id.radioButton3)};
        checkBox.setChecked(ApplicationC21448.f67649.getBoolean("skc", false));
        final int i2 = ApplicationC21448.f67649.getInt("skt", 0);
        final int[] iArr = {i2};
        if (i2 < 0 || i2 >= 4) {
            iArr[0] = 0;
        }
        ViewOnClickListenerC11027 viewOnClickListenerC11027 = new ViewOnClickListenerC11027(1, radioButtonArr, iArr);
        radioButtonArr[iArr[0]].setChecked(true);
        for (int i3 = 0; i3 < 4; i3++) {
            radioButtonArr[i3].setOnClickListener(viewOnClickListenerC11027);
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۜۜܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C7300.m16858(this.f23203, c7179, iArr, i2, checkBox);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
        C7050.m16226(c7179.m16514());
    }

    /* JADX INFO: renamed from: ֫ */
    public static long[] m16859(int i, long j) {
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

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m16861(C7300 c7300, long j, long j2) {
        InterfaceC20041 interfaceC20041 = c7300.f19109;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C14849.FOREVER_NS;
        }
        interfaceC20041.mo34478(j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16855(AbstractActivityC5549 abstractActivityC5549, int i, String str, String str2, final boolean z, final InterfaceC2605 interfaceC2605) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(i);
        final TextInputLayout textInputLayout = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText = textInputLayout.getEditText();
        C12826.requireNonNull(editText);
        final EditText editText2 = textInputLayout2.getEditText();
        C12826.requireNonNull(editText2);
        editText.setText(str);
        editText2.setText(str2);
        editText.addTextChangedListener(new C3817(false));
        editText2.addTextChangedListener(new C3817(false));
        editText.addTextChangedListener(new C5959(textInputLayout));
        editText2.addTextChangedListener(new C5959(textInputLayout2));
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        final DialogInterfaceC2564 dialogInterfaceC2564M18268 = C7913.m18268(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M18268.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۜܳ
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
                    textInputLayout3.setError(C7050.m16224(R.string.MT_Protector));
                    return;
                }
                long jM16860 = strTrim.isEmpty() ? -1L : C7300.m16860(strTrim);
                if (!strTrim.isEmpty() && jM16860 < 0) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C7050.m16224(R.string.MT_Protector));
                    return;
                }
                long jM16861 = strTrim2.isEmpty() ? -1L : C7300.m16860(strTrim2);
                if (!strTrim2.isEmpty() && jM16861 < 0) {
                    editText4.requestFocus();
                    textInputLayout2.setError(C7050.m16224(R.string.MT_Protector));
                } else if (jM16860 != -1 && jM16861 != -1 && jM16860 >= jM16861) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C7050.m16224(R.string.MT_Protector));
                } else {
                    if (z) {
                        ApplicationC21448.f67649.edit().putString("smint", strTrim).putString("smaxt", strTrim2).apply();
                    }
                    interfaceC2605.mo3905(jM16860, jM16861);
                    dialogInterfaceC2564M18268.dismiss();
                }
            }
        });
        dialogInterfaceC2564M18268.m3861().setOnClickListener(new ViewOnClickListenerC17946(editText2, editText));
        C7050.m16226(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m16851(String str) {
        if (str == null || str.isEmpty() || m16860(str) >= 0) {
            return str;
        }
        long jM42826 = C18794.m42826(str);
        if (jM42826 < 0 || !C18794.m42827(jM42826).equals(str)) {
            return null;
        }
        return C18794.m42823(jM42826);
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m16860(String str) {
        long jM42821 = C18794.m42821(str);
        if (jM42821 < 0 || !C18794.m42823(jM42821).equals(str)) {
            return -1L;
        }
        return jM42821;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16852(Main main, long j, long j2, C13303 c13303) {
        m16855(main, R.string.MT_Protector, j == -1 ? "" : C18794.m42823(j), j2 != -1 ? C18794.m42823(j2) : "", false, c13303);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16857(C7300 c7300, long j, long j2) {
        InterfaceC20041 interfaceC20041 = c7300.f19109;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C14849.FOREVER_NS;
        }
        interfaceC20041.mo34476(j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16854(AbstractActivityC5549 abstractActivityC5549, int i, String str, String str2, int i2, final boolean z, final InterfaceC20712 interfaceC20712) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(i);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C4618(abstractActivityC5549, Arrays.asList("B", "KB", "MB", "GB")));
        editText.setText(str);
        editText2.setText(str2);
        spinner.setSelection(i2);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        final DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۜܳ
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
                    C22682.m50793(R.string.MT_Protector);
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
                    C22682.m50793(R.string.MT_Protector);
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
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                if ((j2 != -1 ? j2 : 0L) >= (j4 == -1 ? C14849.FOREVER_NS : j4)) {
                    C22682.m50793(R.string.MT_Protector);
                    return;
                }
                if (z) {
                    ApplicationC21448.f67649.edit().putString("smins", strTrim).putString("smaxs", strTrim2).mo27875(selectedItemPosition, "ssun").apply();
                }
                interfaceC20712.mo35544(j2, j4);
                dialogInterfaceC2564M21200.dismiss();
            }
        });
        C7050.m16226(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16853(Main main, long j, long j2, C15646 c15646) {
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
        m16854(main, R.string.MT_Protector, j == -1 ? "" : Long.toString(j / j4), j2 == -1 ? "" : Long.toString(j2 / j4), i, false, c15646);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m16858(C7300 c7300, C7179 c7179, int[] iArr, int i, CheckBox checkBox) {
        InterfaceC1209 interfaceC1209;
        c7179.m16517();
        if (iArr[0] != i) {
            ApplicationC21448.f67649.edit().mo27875(iArr[0], "skt").apply();
        }
        ApplicationC21448.f67649.edit().putBoolean("skc", checkBox.isChecked()).apply();
        final String string = c7179.m16518().toString();
        if (string.isEmpty()) {
            return;
        }
        final boolean zIsChecked = checkBox.isChecked();
        int i2 = iArr[0];
        if (i2 == 0) {
            interfaceC1209 = new InterfaceC1209() { // from class: l.ۢۜܳ
                @Override // p067l.InterfaceC1209
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo14675(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.contains(str2) : C11567.m26630((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 1) {
            interfaceC1209 = new InterfaceC1209() { // from class: l.ۡۜܳ
                @Override // p067l.InterfaceC1209
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo14675(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    if (z) {
                        return !str.contains(str2);
                    }
                    return !C11567.m26630((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 2) {
            interfaceC1209 = new InterfaceC1209() { // from class: l.ܺۜܳ
                @Override // p067l.InterfaceC1209
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo14675(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.startsWith(str2) : C11567.m26633(str2, str);
                }
            };
        } else if (i2 == 3) {
            interfaceC1209 = new InterfaceC1209() { // from class: l.ܳۜܳ
                @Override // p067l.InterfaceC1209
                /* JADX INFO: renamed from: ֫ */
                public final boolean mo14675(String str) {
                    boolean z = zIsChecked;
                    String str2 = string;
                    return z ? str.endsWith(str2) : C11567.m26631((CharSequence) str2, str);
                }
            };
        } else {
            throw new IllegalArgumentException();
        }
        c7300.f19109.mo34477(interfaceC1209);
    }
}
