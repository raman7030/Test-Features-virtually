package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩷֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20546 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EditText f66169;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TextInputLayout f66170;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f66171;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66172;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String[] f66173;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public TextView f66174;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Spinner f66175;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public TextView f66176;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EditText f66177;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC6434 f66178;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Spinner f66179;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC6434[] f66180 = {EnumC6434.ZIP, EnumC6434.SEVEN_ZIP, EnumC6434.TAR, EnumC6434.TAR_GZIP, EnumC6434.TAR_XZ, EnumC6434.TAR_ZSTD, EnumC6434.TAR_BZIP2, EnumC6434.TAR_LZ4, EnumC6434.GZIP, EnumC6434.XZ, EnumC6434.ZSTD, EnumC6434.BZIP2, EnumC6434.LZ4};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2978 f66181;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2978 f66182;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String[] f66183;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C20065 f66184;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2978 f66185;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f66186;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2978 f66187;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Spinner f66188;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String[] f66189;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Spinner f66190;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f66191;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EditText f66192;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f66193;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f66194;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public abstract void mo47064();

    public AbstractC20546(AbstractActivityC3346 abstractActivityC3346) {
        ArrayList arrayList = new ArrayList();
        this.f66172 = arrayList;
        this.f66171 = abstractActivityC3346;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.setKeepScreenOn(true);
        this.f66177 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        this.f66179 = (Spinner) viewM10216.findViewById(R.id.spinner1);
        this.f66174 = (TextView) viewM10216.findViewById(R.id.textView3);
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner2);
        this.f66188 = spinner;
        this.f66176 = (TextView) viewM10216.findViewById(R.id.textView4);
        TextInputLayout textInputLayout = (TextInputLayout) viewM10216.findViewById(R.id.MT_Protector);
        this.f66170 = textInputLayout;
        EditText editText = (EditText) viewM10216.findViewById(R.id.editText2);
        this.f66169 = editText;
        this.f66193 = (TextView) viewM10216.findViewById(R.id.textView5);
        this.f66192 = (EditText) viewM10216.findViewById(R.id.editText3);
        this.f66190 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
        this.f66175 = (Spinner) viewM10216.findViewById(R.id.MT_Protector);
        this.f66182 = (C2978) viewM10216.findViewById(R.id.switch1);
        this.f66187 = (C2978) viewM10216.findViewById(R.id.switch2);
        this.f66181 = (C2978) viewM10216.findViewById(R.id.switch3);
        this.f66185 = (C2978) viewM10216.findViewById(R.id.switch4);
        String[] stringArray = abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector);
        this.f66173 = stringArray;
        this.f66183 = (String[]) Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.f66189 = (String[]) Arrays.copyOfRange(stringArray, 1, stringArray.length - 1);
        Collections.addAll(arrayList, stringArray);
        C20065 c20065 = new C20065(abstractActivityC3346, arrayList);
        this.f66184 = c20065;
        spinner.setAdapter((SpinnerAdapter) c20065);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44435(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        this.f66186 = dialogInterfaceC0206M44438;
        C5088.m14637(dialogInterfaceC0206M44438);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC17097(this, abstractActivityC3346));
        editText.addTextChangedListener(new C10668(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47040(AbstractC20546 abstractC20546, AbstractActivityC3346 abstractActivityC3346) {
        List listM26220 = C10395.m26220();
        if (listM26220.isEmpty()) {
            abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) ActivityC3339.class));
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(listM26220).map(new C3053(1)).toArray(new C1495());
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44430(charSequenceArr, new DialogInterfaceOnClickListenerC3134(1, abstractC20546, listM26220));
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44440(R.string.MT_Protector, new DialogInterfaceOnClickListenerC22555(2, abstractActivityC3346));
        c19258BuildDialog.m44438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47039(AbstractC20546 abstractC20546, List list, int i) {
        abstractC20546.f66169.setText(((C12511) list.get(i)).f37581);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47062(String str, String str2) {
        this.f66194 = str;
        this.f66191 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m47056() {
        String str;
        EditText editText = this.f66177;
        Editable text = editText.getText();
        boolean z = ((ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class)).length > 0;
        String string = text.toString();
        if (!z) {
            EnumC6434 enumC6434 = this.f66178;
            if (enumC6434.f19900) {
                str = this.f66191.toLowerCase() + this.f66178.f19899;
            } else {
                str = enumC6434.f19899;
            }
            if (string.toLowerCase().endsWith(str)) {
                this.f66194 = string.substring(0, string.length() - str.length());
            }
        }
        EnumC6434 enumC6434M47071 = m47071();
        C2978 c2978 = this.f66181;
        if (c2978.getVisibility() == 0 && c2978.isChecked()) {
            editText.setEnabled(false);
            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector) + enumC6434M47071.f19899);
            spannableString.setSpan(new ForegroundColorSpan(C21943.f70257), 0, spannableString.length() - enumC6434M47071.f19899.length(), 17);
            editText.setText(spannableString);
        } else {
            editText.setEnabled(true);
            if (enumC6434M47071.f19900) {
                editText.setText(this.f66194 + this.f66191 + enumC6434M47071.f19899);
            } else {
                editText.setText(this.f66194 + enumC6434M47071.f19899);
            }
            editText.setSelection(0, this.f66194.length());
            editText.requestFocus();
        }
        this.f66178 = enumC6434M47071;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47061(int i, boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66194);
        EnumC6434 enumC6434 = EnumC6434.ZIP;
        this.f66178 = enumC6434;
        sb.append(enumC6434.f19899);
        String string = sb.toString();
        EditText editText = this.f66177;
        editText.setText(string);
        final boolean z3 = i == 1 && !z;
        if (!z3) {
            C2978 c2978 = this.f66181;
            c2978.setVisibility(0);
            c2978.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨۚܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    AbstractC20546.m47038(this.f34354);
                }
            });
        }
        int i2 = z2 ? 0 : 8;
        C2978 c2979 = this.f66185;
        c2979.setVisibility(i2);
        c2979.setChecked(ApplicationC20075.f65008.getBoolean("dcaw", false));
        boolean z4 = ApplicationC20075.f65008.getBoolean("dcds", false);
        C2978 c29710 = this.f66187;
        c29710.setChecked(z4);
        AbstractActivityC3346 abstractActivityC3346 = this.f66171;
        c29710.setText(abstractActivityC3346.getResources().getQuantityString(R.plurals.MT_Protector, i));
        C16311 c16311 = new C16311(this, this.f66171, this.f66180, z, i);
        Spinner spinner = this.f66179;
        spinner.setAdapter((SpinnerAdapter) c16311);
        C20065 c20065 = new C20065(abstractActivityC3346, Arrays.asList(abstractActivityC3346.getString(R.string.MT_Protector), "10 MB", "25 MB", "50 MB", "100 MB", abstractActivityC3346.getString(R.string.MT_Protector)));
        Spinner spinner2 = this.f66190;
        spinner2.setAdapter((SpinnerAdapter) c20065);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f66192.setEnabled(atomicBoolean.get());
        C17723 c17723 = new C17723(abstractActivityC3346, Arrays.asList("KB", "MB", "GB"), atomicBoolean);
        Spinner spinner3 = this.f66175;
        spinner3.setAdapter((SpinnerAdapter) c17723);
        spinner3.setSelection(1);
        spinner3.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩺ۚܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !atomicBoolean.get();
            }
        });
        spinner2.setOnItemSelectedListener(new C17017(this, atomicBoolean, c17723));
        C14194 c14194 = new C14194(this);
        if (z3 && ApplicationC20075.f65008.getBoolean("ccsa2", false)) {
            str = "ccf2";
            str2 = "ccl2";
        } else {
            str = "ccf";
            str2 = "ccl";
        }
        spinner.setOnItemSelectedListener(c14194);
        int i3 = ApplicationC20075.f65008.getInt(str, 0);
        int i4 = i3 >= this.f66180.length ? 0 : i3;
        spinner.setSelection(i4);
        c14194.onItemSelected(null, null, i4, 0L);
        int i5 = ApplicationC20075.f65008.getInt(str2, 3);
        ArrayList arrayList = this.f66172;
        if (arrayList.size() == this.f66189.length) {
            i5--;
        }
        int size = arrayList.size();
        this.f66188.setSelection(size == 0 ? 0 : Math.max(0, Math.min(i5, size - 1)));
        this.f66182.setChecked(ApplicationC20075.f65008.getBoolean("ccef", false));
        m47056();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f66186;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۚܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40612.mo47064();
            }
        });
        dialogInterfaceC0206.m1436(new DialogInterface.OnDismissListener() { // from class: l.۟ۚܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC20546.m47041(this.f22323, z3);
            }
        });
        C4925.m14329(editText);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47038(AbstractC20546 abstractC20546) {
        abstractC20546.m47056();
        SpinnerAdapter adapter = abstractC20546.f66179.getAdapter();
        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47041(AbstractC20546 abstractC20546, boolean z) {
        String[] strArr = abstractC20546.f66189;
        ArrayList arrayList = abstractC20546.f66172;
        Spinner spinner = abstractC20546.f66188;
        C2978 c2978 = abstractC20546.f66182;
        Spinner spinner2 = abstractC20546.f66179;
        ApplicationC20075.f65008.edit().putBoolean("dcaw", abstractC20546.f66185.isChecked()).putBoolean("dcds", abstractC20546.f66187.isChecked()).apply();
        InterfaceC13049 interfaceC13049Edit = ApplicationC20075.f65008.edit();
        if (z && abstractC20546.m47071().f19900) {
            InterfaceC13049 interfaceC13049Mo25853 = interfaceC13049Edit.putBoolean("ccsa2", true).mo25853(spinner2.getSelectedItemPosition(), "ccf2");
            int selectedItemPosition = spinner.getSelectedItemPosition();
            if (arrayList.size() == strArr.length) {
                selectedItemPosition++;
            }
            interfaceC13049Mo25853.mo25853(selectedItemPosition, "ccl2").putBoolean("ccef", c2978.isChecked()).apply();
            return;
        }
        if (z) {
            interfaceC13049Edit.putBoolean("ccsa2", false);
        }
        InterfaceC13049 interfaceC13049Mo25854 = interfaceC13049Edit.mo25853(spinner2.getSelectedItemPosition(), "ccf");
        int selectedItemPosition2 = spinner.getSelectedItemPosition();
        if (arrayList.size() == strArr.length) {
            selectedItemPosition2++;
        }
        interfaceC13049Mo25854.mo25853(selectedItemPosition2, "ccl").putBoolean("ccef", c2978.isChecked()).apply();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47060() {
        this.f66186.dismiss();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m47068() {
        return this.f66177.getText().toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC6434 m47071() {
        return this.f66180[this.f66179.getSelectedItemPosition()];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m47074() {
        return this.f66188.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m47069() {
        int selectedItemPosition = this.f66188.getSelectedItemPosition();
        if (selectedItemPosition == 0) {
            return 0;
        }
        if (selectedItemPosition == 1) {
            return 1;
        }
        if (selectedItemPosition == 2) {
            return 3;
        }
        if (selectedItemPosition == 3) {
            return 5;
        }
        if (selectedItemPosition == 4) {
            return 7;
        }
        if (selectedItemPosition == 5) {
            return 9;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47073() {
        Spinner spinner = this.f66188;
        if (spinner.isEnabled()) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m47067() {
        return this.f66181.isChecked();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m47066() {
        C2978 c2978 = this.f66185;
        return c2978.getVisibility() == 0 && c2978.isChecked();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47042(int i, C8918 c8918) {
        int i2;
        boolean z;
        int i3 = 0;
        int i4 = -1;
        if (i != 0) {
            z = true;
            if (i != 1) {
                if (i == 2) {
                    i4 = 3;
                } else if (i == 4) {
                    i4 = 9;
                } else if (i == 5) {
                    i4 = 10;
                } else if (i == 6) {
                    c8918.m23025();
                    i2 = 8;
                }
                i3 = 8;
            } else {
                i3 = 8;
                i4 = 1;
            }
            i2 = i3;
            z = false;
        } else {
            i2 = i3;
            z = false;
        }
        c8918.m23009(i4);
        c8918.m23018(i2);
        return z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m47072() {
        return this.f66170.getVisibility() == 0 ? this.f66169.getText().toString() : "";
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m47065() {
        double d;
        EditText editText = this.f66192;
        if (editText.getVisibility() == 0) {
            int selectedItemPosition = this.f66190.getSelectedItemPosition();
            if (selectedItemPosition == 1) {
                return 10485760L;
            }
            if (selectedItemPosition == 2) {
                return 26214400L;
            }
            if (selectedItemPosition == 3) {
                return 52428800L;
            }
            if (selectedItemPosition == 4) {
                return 104857600L;
            }
            if (selectedItemPosition == 5) {
                String string = editText.getText().toString();
                if (string.isEmpty()) {
                    return -2L;
                }
                try {
                    double d2 = Double.parseDouble(string);
                    int selectedItemPosition2 = this.f66175.getSelectedItemPosition();
                    if (selectedItemPosition2 == 0) {
                        d = 1024.0d;
                    } else {
                        if (selectedItemPosition2 != 1) {
                            if (selectedItemPosition2 == 2) {
                                d = 1.073741824E9d;
                            }
                            return (long) d2;
                        }
                        d = 1048576.0d;
                    }
                    d2 *= d;
                    return (long) d2;
                } catch (NumberFormatException unused) {
                    return -1L;
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EditText m47075() {
        return this.f66192;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m47070() {
        C2978 c2978 = this.f66182;
        return c2978.getVisibility() == 0 && !m47072().isEmpty() && c2978.isChecked();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m47063() {
        return this.f66187.isChecked();
    }
}
