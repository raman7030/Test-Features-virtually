package p067l;

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
import bin.p000mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩷֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: QB4F */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21895 {

    /* JADX INFO: renamed from: ֡ */
    public EditText f68846;

    /* JADX INFO: renamed from: ֨ */
    public TextInputLayout f68847;

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f68848;

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList f68849;

    /* JADX INFO: renamed from: ۗ */
    public String[] f68850;

    /* JADX INFO: renamed from: ۘ */
    public TextView f68851;

    /* JADX INFO: renamed from: ۙ */
    public Spinner f68852;

    /* JADX INFO: renamed from: ۚ */
    public TextView f68853;

    /* JADX INFO: renamed from: ۜ */
    public EditText f68854;

    /* JADX INFO: renamed from: ۠ */
    public EnumC8483 f68855;

    /* JADX INFO: renamed from: ۡ */
    public Spinner f68856;

    /* JADX INFO: renamed from: ۢ */
    public final EnumC8483[] f68857 = {EnumC8483.ZIP, EnumC8483.SEVEN_ZIP, EnumC8483.TAR, EnumC8483.TAR_GZIP, EnumC8483.TAR_XZ, EnumC8483.TAR_ZSTD, EnumC8483.TAR_BZIP2, EnumC8483.TAR_LZ4, EnumC8483.GZIP, EnumC8483.XZ, EnumC8483.ZSTD, EnumC8483.BZIP2, EnumC8483.LZ4};

    /* JADX INFO: renamed from: ۧ */
    public C0990 f68858;

    /* JADX INFO: renamed from: ܳ */
    public C0990 f68859;

    /* JADX INFO: renamed from: ܶ */
    public String[] f68860;

    /* JADX INFO: renamed from: ܺ */
    public C21438 f68861;

    /* JADX INFO: renamed from: ܽ */
    public C0990 f68862;

    /* JADX INFO: renamed from: ܿ */
    public DialogInterfaceC2564 f68863;

    /* JADX INFO: renamed from: ᩳ */
    public C0990 f68864;

    /* JADX INFO: renamed from: ᩴ */
    public Spinner f68865;

    /* JADX INFO: renamed from: ᩵ */
    public String[] f68866;

    /* JADX INFO: renamed from: ᩶ */
    public Spinner f68867;

    /* JADX INFO: renamed from: ᩷ */
    public String f68868;

    /* JADX INFO: renamed from: ᩸ */
    public EditText f68869;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f68870;

    /* JADX INFO: renamed from: ᩻ */
    public String f68871;

    /* JADX INFO: renamed from: ۘ */
    public abstract void mo49387();

    public AbstractC21895(AbstractActivityC5549 abstractActivityC5549) {
        ArrayList arrayList = new ArrayList();
        this.f68849 = arrayList;
        this.f68848 = abstractActivityC5549;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.setKeepScreenOn(true);
        this.f68854 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        this.f68856 = (Spinner) viewM12252.findViewById(R.id.spinner1);
        this.f68851 = (TextView) viewM12252.findViewById(R.id.textView3);
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner2);
        this.f68865 = spinner;
        this.f68853 = (TextView) viewM12252.findViewById(R.id.textView4);
        TextInputLayout textInputLayout = (TextInputLayout) viewM12252.findViewById(R.id.MT_Protector);
        this.f68847 = textInputLayout;
        EditText editText = (EditText) viewM12252.findViewById(R.id.editText2);
        this.f68846 = editText;
        this.f68870 = (TextView) viewM12252.findViewById(R.id.textView5);
        this.f68869 = (EditText) viewM12252.findViewById(R.id.editText3);
        this.f68867 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
        this.f68852 = (Spinner) viewM12252.findViewById(R.id.MT_Protector);
        this.f68859 = (C0990) viewM12252.findViewById(R.id.switch1);
        this.f68864 = (C0990) viewM12252.findViewById(R.id.switch2);
        this.f68858 = (C0990) viewM12252.findViewById(R.id.switch3);
        this.f68862 = (C0990) viewM12252.findViewById(R.id.switch4);
        String[] stringArray = abstractActivityC5549.getResources().getStringArray(R.array.MT_Protector);
        this.f68850 = stringArray;
        this.f68860 = (String[]) Arrays.copyOfRange(stringArray, 0, stringArray.length - 1);
        this.f68866 = (String[]) Arrays.copyOfRange(stringArray, 1, stringArray.length - 1);
        Collections.addAll(arrayList, stringArray);
        C21438 c21438 = new C21438(abstractActivityC5549, arrayList);
        this.f68861 = c21438;
        spinner.setAdapter((SpinnerAdapter) c21438);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46729(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        this.f68863 = dialogInterfaceC2564M46732;
        C7204.m16545(dialogInterfaceC2564M46732);
        textInputLayout.setEndIconMode(-1);
        textInputLayout.setEndIconDrawable(R.drawable.MT_Protector);
        textInputLayout.setEndIconOnClickListener(new ViewOnClickListenerC18617(this, abstractActivityC5549));
        editText.addTextChangedListener(new C12507(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49363(AbstractC21895 abstractC21895, AbstractActivityC5549 abstractActivityC5549) {
        List listM28249 = C12248.m28249();
        if (listM28249.isEmpty()) {
            abstractActivityC5549.startActivity(new Intent(abstractActivityC5549, (Class<?>) ActivityC5542.class));
            return;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) C7480.stream(listM28249).map(new C5270(1)).toArray(new C3789());
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46724(charSequenceArr, new DialogInterfaceOnClickListenerC5347(1, abstractC21895, listM28249));
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46734(R.string.MT_Protector, new DialogInterfaceOnClickListenerC23805(2, abstractActivityC5549));
        c20671BuildDialog.m46732();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49362(AbstractC21895 abstractC21895, List list, int i) {
        abstractC21895.f68846.setText(((C14259) list.get(i)).f40605);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49385(String str, String str2) {
        this.f68871 = str;
        this.f68868 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ */
    public void m49379() {
        String str;
        EditText editText = this.f68854;
        Editable text = editText.getText();
        boolean z = ((ForegroundColorSpan[]) text.getSpans(0, text.length(), ForegroundColorSpan.class)).length > 0;
        String string = text.toString();
        if (!z) {
            EnumC8483 enumC8483 = this.f68855;
            if (enumC8483.f22772) {
                str = this.f68868.toLowerCase() + this.f68855.f22771;
            } else {
                str = enumC8483.f22771;
            }
            if (string.toLowerCase().endsWith(str)) {
                this.f68871 = string.substring(0, string.length() - str.length());
            }
        }
        EnumC8483 enumC8483M49394 = m49394();
        C0990 c0990 = this.f68858;
        if (c0990.getVisibility() == 0 && c0990.isChecked()) {
            editText.setEnabled(false);
            SpannableString spannableString = new SpannableString(C7050.m16224(R.string.MT_Protector) + enumC8483M49394.f22771);
            spannableString.setSpan(new ForegroundColorSpan(C23223.f72969), 0, spannableString.length() - enumC8483M49394.f22771.length(), 17);
            editText.setText(spannableString);
        } else {
            editText.setEnabled(true);
            if (enumC8483M49394.f22772) {
                editText.setText(this.f68871 + this.f68868 + enumC8483M49394.f22771);
            } else {
                editText.setText(this.f68871 + enumC8483M49394.f22771);
            }
            editText.setSelection(0, this.f68871.length());
            editText.requestFocus();
        }
        this.f68855 = enumC8483M49394;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49384(int i, boolean z, boolean z2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f68871);
        EnumC8483 enumC8483 = EnumC8483.ZIP;
        this.f68855 = enumC8483;
        sb.append(enumC8483.f22771);
        String string = sb.toString();
        EditText editText = this.f68854;
        editText.setText(string);
        final boolean z3 = i == 1 && !z;
        if (!z3) {
            C0990 c0990 = this.f68858;
            c0990.setVisibility(0);
            c0990.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨۚܳ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
                    AbstractC21895.m49361(this.f37351);
                }
            });
        }
        int i2 = z2 ? 0 : 8;
        C0990 c0991 = this.f68862;
        c0991.setVisibility(i2);
        c0991.setChecked(ApplicationC21448.f67649.getBoolean("dcaw", false));
        boolean z4 = ApplicationC21448.f67649.getBoolean("dcds", false);
        C0990 c0992 = this.f68864;
        c0992.setChecked(z4);
        AbstractActivityC5549 abstractActivityC5549 = this.f68848;
        c0992.setText(abstractActivityC5549.getResources().getQuantityString(R.plurals.MT_Protector, i));
        C17870 c17870 = new C17870(this, this.f68848, this.f68857, z, i);
        Spinner spinner = this.f68856;
        spinner.setAdapter((SpinnerAdapter) c17870);
        C21438 c21438 = new C21438(abstractActivityC5549, Arrays.asList(abstractActivityC5549.getString(R.string.MT_Protector), "10 MB", "25 MB", "50 MB", "100 MB", abstractActivityC5549.getString(R.string.MT_Protector)));
        Spinner spinner2 = this.f68867;
        spinner2.setAdapter((SpinnerAdapter) c21438);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f68869.setEnabled(atomicBoolean.get());
        C19212 c19212 = new C19212(abstractActivityC5549, Arrays.asList("KB", "MB", "GB"), atomicBoolean);
        Spinner spinner3 = this.f68852;
        spinner3.setAdapter((SpinnerAdapter) c19212);
        spinner3.setSelection(1);
        spinner3.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩺ۚܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return !atomicBoolean.get();
            }
        });
        spinner2.setOnItemSelectedListener(new C18541(this, atomicBoolean, c19212));
        C15858 c15858 = new C15858(this);
        if (z3 && ApplicationC21448.f67649.getBoolean("ccsa2", false)) {
            str = "ccf2";
            str2 = "ccl2";
        } else {
            str = "ccf";
            str2 = "ccl";
        }
        spinner.setOnItemSelectedListener(c15858);
        int i3 = ApplicationC21448.f67649.getInt(str, 0);
        int i4 = i3 >= this.f68857.length ? 0 : i3;
        spinner.setSelection(i4);
        c15858.onItemSelected(null, null, i4, 0L);
        int i5 = ApplicationC21448.f67649.getInt(str2, 3);
        ArrayList arrayList = this.f68849;
        if (arrayList.size() == this.f68866.length) {
            i5--;
        }
        int size = arrayList.size();
        this.f68865.setSelection(size == 0 ? 0 : Math.max(0, Math.min(i5, size - 1)));
        this.f68859.setChecked(ApplicationC21448.f67649.getBoolean("ccef", false));
        m49379();
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f68863;
        dialogInterfaceC2564.m3862();
        dialogInterfaceC2564.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۚܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43689.mo49387();
            }
        });
        dialogInterfaceC2564.m3849(new DialogInterface.OnDismissListener() { // from class: l.۟ۚܳ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC21895.m49364(this.f25212, z3);
            }
        });
        C7050.m16226(editText);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49361(AbstractC21895 abstractC21895) {
        abstractC21895.m49379();
        SpinnerAdapter adapter = abstractC21895.f68856.getAdapter();
        if (adapter instanceof BaseAdapter) {
            ((BaseAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49364(AbstractC21895 abstractC21895, boolean z) {
        String[] strArr = abstractC21895.f68866;
        ArrayList arrayList = abstractC21895.f68849;
        Spinner spinner = abstractC21895.f68865;
        C0990 c0990 = abstractC21895.f68859;
        Spinner spinner2 = abstractC21895.f68856;
        ApplicationC21448.f67649.edit().putBoolean("dcaw", abstractC21895.f68862.isChecked()).putBoolean("dcds", abstractC21895.f68864.isChecked()).apply();
        InterfaceC14770 interfaceC14770Edit = ApplicationC21448.f67649.edit();
        if (z && abstractC21895.m49394().f22772) {
            InterfaceC14770 interfaceC14770Mo27875 = interfaceC14770Edit.putBoolean("ccsa2", true).mo27875(spinner2.getSelectedItemPosition(), "ccf2");
            int selectedItemPosition = spinner.getSelectedItemPosition();
            if (arrayList.size() == strArr.length) {
                selectedItemPosition++;
            }
            interfaceC14770Mo27875.mo27875(selectedItemPosition, "ccl2").putBoolean("ccef", c0990.isChecked()).apply();
            return;
        }
        if (z) {
            interfaceC14770Edit.putBoolean("ccsa2", false);
        }
        InterfaceC14770 interfaceC14770Mo27876 = interfaceC14770Edit.mo27875(spinner2.getSelectedItemPosition(), "ccf");
        int selectedItemPosition2 = spinner.getSelectedItemPosition();
        if (arrayList.size() == strArr.length) {
            selectedItemPosition2++;
        }
        interfaceC14770Mo27876.mo27875(selectedItemPosition2, "ccl").putBoolean("ccef", c0990.isChecked()).apply();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49383() {
        this.f68863.dismiss();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m49391() {
        return this.f68854.getText().toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC8483 m49394() {
        return this.f68857[this.f68856.getSelectedItemPosition()];
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m49397() {
        return this.f68865.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m49392() {
        int selectedItemPosition = this.f68865.getSelectedItemPosition();
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

    /* JADX INFO: renamed from: ᩳ */
    public final int m49396() {
        Spinner spinner = this.f68865;
        if (spinner.isEnabled()) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m49390() {
        return this.f68858.isChecked();
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m49389() {
        C0990 c0990 = this.f68862;
        return c0990.getVisibility() == 0 && c0990.isChecked();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m49365(int i, C10844 c10844) {
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
                    c10844.m24999();
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
        c10844.m24983(i4);
        c10844.m24992(i2);
        return z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m49395() {
        return this.f68847.getVisibility() == 0 ? this.f68846.getText().toString() : "";
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m49388() {
        double d;
        EditText editText = this.f68869;
        if (editText.getVisibility() == 0) {
            int selectedItemPosition = this.f68867.getSelectedItemPosition();
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
                    int selectedItemPosition2 = this.f68852.getSelectedItemPosition();
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

    /* JADX INFO: renamed from: ᩻ */
    public final EditText m49398() {
        return this.f68869;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m49393() {
        C0990 c0990 = this.f68859;
        return c0990.getVisibility() == 0 && !m49395().isEmpty() && c0990.isChecked();
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m49386() {
        return this.f68864.isChecked();
    }
}
