package p067l;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8126 implements TextWatcher {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC19370 f21417;

    /* JADX INFO: renamed from: ۙ */
    public final C14831 f21418;

    /* JADX INFO: renamed from: ۤ */
    public final C18107 f21419;

    /* JADX INFO: renamed from: ᩶ */
    public EditText f21422;

    /* JADX INFO: renamed from: ᩸ */
    public final Main f21423;

    /* JADX INFO: renamed from: ᩹ */
    public TextView f21424;

    /* JADX INFO: renamed from: ۨ */
    public static final int[] f21416 = {2, 4, 8, 16};

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f21415 = {32, 40, 64, 8};

    /* JADX INFO: renamed from: ۬ */
    public final C12150[] f21421 = {new C12150(this, 0, "MD5", new C3432()), new C12150(this, 1, "SHA1", new C10138()), new C12150(this, 2, "SHA256", new C16842()), new C12150(this, 3, "CRC32", new C22879())};

    /* JADX INFO: renamed from: ۫ */
    public boolean f21420 = ApplicationC21448.f67649.getBoolean("fsuc", false);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18830(C18107 c18107, InterfaceC19370 interfaceC19370) {
        new C8126(c18107, interfaceC19370);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18836(final Button button, final C18107 c18107, final InterfaceC19370 interfaceC19370) {
        button.setOnClickListener(new ViewOnClickListenerC4774(0, c18107, interfaceC19370));
        button.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۚ۫ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C8126.m18826(button, c18107, interfaceC19370);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18826(Button button, C18107 c18107, InterfaceC19370 interfaceC19370) {
        Activity activityM17221 = C7453.m17221(button.getContext());
        C12826.requireNonNull(activityM17221);
        m18827((AbstractActivityC5549) activityM17221, new RunnableC21110(3, c18107, interfaceC19370));
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m18838(C18107 c18107, InterfaceC19370 interfaceC19370) {
        new C8126(c18107, interfaceC19370);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18827(AbstractActivityC5549 abstractActivityC5549, Runnable runnable) {
        int i = 1;
        CharSequence[] charSequenceArr = {"MD5", "SHA1", "SHA256", "CRC32"};
        int i2 = ApplicationC21448.f67649.getInt("fsf", 0);
        final boolean[] zArr = new boolean[4];
        for (int i3 = 0; i3 < 4; i3++) {
            zArr[i3] = (f21416[i3] & i2) == 0;
        }
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46725(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩶۫ܳ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                zArr[i4] = z;
            }
        });
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC2564M21200.m3860().setOnClickListener(new ViewOnClickListenerC21618(zArr, dialogInterfaceC2564M21200, runnable, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18831(boolean[] zArr, DialogInterfaceC2564 dialogInterfaceC2564, Runnable runnable) {
        int i = 1;
        if (!zArr[0] && !zArr[1] && !zArr[2] && !zArr[3]) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (zArr.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (!zArr[i2]) {
                    i = f21416[i2] | i;
                }
            }
            ApplicationC21448.f67649.edit().mo27875(i, "fsf").apply();
            dialogInterfaceC2564.dismiss();
            runnable.run();
            return;
        }
        throw new IllegalArgumentException("Unexpected checksum item count");
    }

    public C8126(C18107 c18107, InterfaceC19370 interfaceC19370) {
        this.f21423 = c18107.m41282();
        this.f21419 = c18107;
        this.f21417 = interfaceC19370;
        C14831 c14831 = new C14831(ApplicationC21448.f67649.getInt("fsf", 0));
        this.f21418 = c14831;
        RunnableC23549 runnableC23549 = new RunnableC23549(0, this);
        int[] iArrM33871 = c14831.m33871();
        if (iArrM33871.length == 0) {
            runnableC23549.run();
        } else {
            new C5444(this, iArrM33871, runnableC23549).m22250();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18828(final C8126 c8126) {
        Main main = c8126.f21423;
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        editText.setText(c8126.f21417.getName());
        editText.setKeyListener(null);
        C12150[] c12150Arr = c8126.f21421;
        c12150Arr[0].m28073(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM12252);
        c12150Arr[1].m28073(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM12252);
        c12150Arr[2].m28073(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM12252);
        c12150Arr[3].m28073(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM12252);
        c8126.f21422 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        c8126.f21424 = (TextView) viewM12252.findViewById(R.id.textView1);
        c8126.f21422.addTextChangedListener(c8126);
        int i = 0;
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC6115(i, c8126));
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC20197(i, c8126));
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM3861 = c20671BuildDialog.m46732().m3861();
        ViewGroup viewGroup = (ViewGroup) buttonM3861.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM3861);
        CheckBox checkBox = (CheckBox) main.m12252(R.layout.MT_Protector);
        checkBox.setText(R.string.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setChecked(c8126.f21420);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩵۫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C8126.m18829(this.f65555, z);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m18842(C8126 c8126) {
        String strM16227 = C7050.m16227();
        if (strM16227 != null) {
            String strReplaceAll = strM16227.replaceAll("[\\s:]", "");
            String[] strArr = {"sha256", "sha1", "md5", "crc32", "sha256sum", "sha1sum", "md5sum", "crc32sum"};
            if (strReplaceAll.indexOf(58) != -1) {
                String lowerCase = strReplaceAll.toLowerCase();
                for (int i = 0; i < 8; i++) {
                    String str = strArr[i];
                    if (lowerCase.startsWith(str)) {
                        strReplaceAll = strReplaceAll.substring(str.length());
                        break;
                    }
                }
            }
            c8126.f21422.setText(c8126.f21420 ? strReplaceAll.toUpperCase() : strReplaceAll.toLowerCase());
            c8126.f21422.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18829(C8126 c8126, boolean z) {
        c8126.f21420 = z;
        C24104.m53360(ApplicationC21448.f67649, "fsuc", z);
        for (C12150 c12150 : c8126.f21421) {
            if (c8126.f21418.m33873(c12150.f33964)) {
                EditText editText = c12150.f33967;
                String string = editText.getText().toString();
                editText.setText(c8126.f21420 ? string.toUpperCase() : string.toLowerCase());
            }
        }
        String string2 = c8126.f21422.getText().toString();
        c8126.f21422.setText(c8126.f21420 ? string2.toUpperCase() : string2.toLowerCase());
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m18843(C8126 c8126) {
        int i = ApplicationC21448.f67649.getInt("fsf", 0);
        C14831 c14831 = c8126.f21418;
        c14831.m33869(i);
        for (C12150 c12150 : c8126.f21421) {
            c12150.m28072();
        }
        c8126.afterTextChanged(c8126.f21422.getText());
        RunnableC10258 runnableC10258 = new RunnableC10258(3, c8126);
        int[] iArrM33871 = c14831.m33871();
        if (iArrM33871.length == 0) {
            runnableC10258.run();
        } else {
            new C5444(c8126, iArrM33871, runnableC10258).m22250();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m18837(C8126 c8126) {
        for (C12150 c12150 : c8126.f21421) {
            c12150.m28072();
        }
        c8126.afterTextChanged(c8126.f21422.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strTrim = editable.toString().trim();
        if (!strTrim.isEmpty()) {
            C12150[] c12150Arr = this.f21421;
            int length = c12150Arr.length;
            int i = 0;
            while (true) {
                int[] iArr = f21415;
                C14831 c14831 = this.f21418;
                if (i < length) {
                    C12150 c12150 = c12150Arr[i];
                    int length2 = strTrim.length();
                    int i2 = c12150.f33964;
                    String str = c12150.f33963;
                    if (length2 == iArr[i2]) {
                        String strM33872 = c14831.m33872(i2);
                        if (!c14831.m33873(c12150.f33964) || strM33872 == null) {
                            this.f21424.setText(str.concat(" ?"));
                            this.f21424.setTextColor(C23223.f73004);
                            return;
                        } else if (strTrim.equalsIgnoreCase(strM33872)) {
                            this.f21424.setText(str.concat(" √"));
                            this.f21424.setTextColor(C23223.f73002);
                            return;
                        } else {
                            this.f21424.setText(str.concat(" ×"));
                            this.f21424.setTextColor(C23223.f73004);
                            return;
                        }
                    }
                    i++;
                } else {
                    if (strTrim.length() > 8) {
                        for (C12150 c12151 : c12150Arr) {
                            int i3 = c12151.f33964;
                            String strM33873 = c14831.m33872(i3);
                            if (c14831.m33873(i3) && strM33873 != null && strTrim.length() < iArr[i3] && C11567.m26633(strTrim, strM33873)) {
                                this.f21424.setText(c12151.f33963.concat(" ≈"));
                                this.f21424.setTextColor(C23223.f73002);
                                return;
                            }
                        }
                    }
                    this.f21424.setText("?");
                    this.f21424.setTextColor(C23223.f72969);
                    return;
                }
            }
        } else {
            this.f21424.setText((CharSequence) null);
        }
    }
}
