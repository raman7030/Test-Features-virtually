package l;

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
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6058 implements TextWatcher {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f18561;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13113 f18562;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16560 f18563;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EditText f18566;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Main f18567;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f18568;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f18560 = {2, 4, 8, 16};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f18559 = {32, 40, 64, 8};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10292[] f18565 = {new C10292(this, 0, "MD5", new C1119()), new C10292(this, 1, "SHA1", new C8175()), new C10292(this, 2, "SHA256", new C15229()), new C10292(this, 3, "CRC32", new C21581())};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f18564 = ApplicationC20075.f65008.getBoolean("fsuc", false);

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16901(C16560 c16560, InterfaceC17889 interfaceC17889) {
        new C6058(c16560, interfaceC17889);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16907(final Button button, final C16560 c16560, final InterfaceC17889 interfaceC17889) {
        button.setOnClickListener(new ViewOnClickListenerC2531(0, c16560, interfaceC17889));
        button.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۚ۫ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C6058.m16897(button, c16560, interfaceC17889);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16897(Button button, C16560 c16560, InterfaceC17889 interfaceC17889) {
        Activity activityM15313 = C5350.m15313(button.getContext());
        C11003.requireNonNull(activityM15313);
        m16898((AbstractActivityC3346) activityM15313, new RunnableC19719(3, c16560, interfaceC17889));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16909(C16560 c16560, InterfaceC17889 interfaceC17889) {
        new C6058(c16560, interfaceC17889);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16898(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        int i = 1;
        CharSequence[] charSequenceArr = {"MD5", "SHA1", "SHA256", "CRC32"};
        int i2 = ApplicationC20075.f65008.getInt("fsf", 0);
        final boolean[] zArr = new boolean[4];
        for (int i3 = 0; i3 < 4; i3++) {
            zArr[i3] = (f18560[i3] & i2) == 0;
        }
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44431(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩶۫ܳ
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                zArr[i4] = z;
            }
        });
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258BuildDialog, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206M19253.m1447().setOnClickListener(new ViewOnClickListenerC20254(zArr, dialogInterfaceC0206M19253, runnable, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16902(boolean[] zArr, DialogInterfaceC0206 dialogInterfaceC0206, Runnable runnable) {
        int i = 1;
        if (!zArr[0] && !zArr[1] && !zArr[2] && !zArr[3]) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        if (zArr.length == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (!zArr[i2]) {
                    i = f18560[i2] | i;
                }
            }
            ApplicationC20075.f65008.edit().mo25853(i, "fsf").apply();
            dialogInterfaceC0206.dismiss();
            runnable.run();
            return;
        }
        throw new IllegalArgumentException("Unexpected checksum item count");
    }

    public C6058(C16560 c16560, InterfaceC17889 interfaceC17889) {
        this.f18567 = c16560.m39056();
        this.f18563 = c16560;
        this.f18561 = interfaceC17889;
        C13113 c13113 = new C13113(ApplicationC20075.f65008.getInt("fsf", 0));
        this.f18562 = c13113;
        RunnableC22286 runnableC22286 = new RunnableC22286(0, this);
        int[] iArrM31780 = c13113.m31780();
        if (iArrM31780.length == 0) {
            runnableC22286.run();
        } else {
            new C3236(this, iArrM31780, runnableC22286).m20274();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16899(final C6058 c6058) {
        Main main = c6058.f18567;
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        editText.setText(c6058.f18561.getName());
        editText.setKeyListener(null);
        C10292[] c10292Arr = c6058.f18565;
        c10292Arr[0].m26049(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM10216);
        c10292Arr[1].m26049(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM10216);
        c10292Arr[2].m26049(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM10216);
        c10292Arr[3].m26049(R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, viewM10216);
        c6058.f18566 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        c6058.f18568 = (TextView) viewM10216.findViewById(R.id.textView1);
        c6058.f18566.addTextChangedListener(c6058);
        int i = 0;
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC3942(i, c6058));
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC18759(i, c6058));
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        Button buttonM1448 = c19258BuildDialog.m44438().m1448();
        ViewGroup viewGroup = (ViewGroup) buttonM1448.getParent();
        int iIndexOfChild = viewGroup.indexOfChild(buttonM1448);
        CheckBox checkBox = (CheckBox) main.m10216(R.layout.MT_Protector);
        checkBox.setText(R.string.MT_Protector);
        viewGroup.removeViewAt(iIndexOfChild);
        viewGroup.addView(checkBox, iIndexOfChild);
        checkBox.setChecked(c6058.f18564);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩵۫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C6058.m16900(this.f62938, z);
            }
        });
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16913(C6058 c6058) {
        String strM14330 = C4925.m14330();
        if (strM14330 != null) {
            String strReplaceAll = strM14330.replaceAll("[\\s:]", "");
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
            c6058.f18566.setText(c6058.f18564 ? strReplaceAll.toUpperCase() : strReplaceAll.toLowerCase());
            c6058.f18566.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16900(C6058 c6058, boolean z) {
        c6058.f18564 = z;
        C22870.m50970(ApplicationC20075.f65008, "fsuc", z);
        for (C10292 c10292 : c6058.f18565) {
            if (c6058.f18562.m31782(c10292.f31001)) {
                EditText editText = c10292.f31004;
                String string = editText.getText().toString();
                editText.setText(c6058.f18564 ? string.toUpperCase() : string.toLowerCase());
            }
        }
        String string2 = c6058.f18566.getText().toString();
        c6058.f18566.setText(c6058.f18564 ? string2.toUpperCase() : string2.toLowerCase());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m16914(C6058 c6058) {
        int i = ApplicationC20075.f65008.getInt("fsf", 0);
        C13113 c13113 = c6058.f18562;
        c13113.m31778(i);
        for (C10292 c10292 : c6058.f18565) {
            c10292.m26048();
        }
        c6058.afterTextChanged(c6058.f18566.getText());
        RunnableC8301 runnableC8301 = new RunnableC8301(3, c6058);
        int[] iArrM31780 = c13113.m31780();
        if (iArrM31780.length == 0) {
            runnableC8301.run();
        } else {
            new C3236(c6058, iArrM31780, runnableC8301).m20274();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16908(C6058 c6058) {
        for (C10292 c10292 : c6058.f18565) {
            c10292.m26048();
        }
        c6058.afterTextChanged(c6058.f18566.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strTrim = editable.toString().trim();
        if (!strTrim.isEmpty()) {
            C10292[] c10292Arr = this.f18565;
            int length = c10292Arr.length;
            int i = 0;
            while (true) {
                int[] iArr = f18559;
                C13113 c13113 = this.f18562;
                if (i < length) {
                    C10292 c10292 = c10292Arr[i];
                    int length2 = strTrim.length();
                    int i2 = c10292.f31001;
                    String str = c10292.f31000;
                    if (length2 == iArr[i2]) {
                        String strM31781 = c13113.m31781(i2);
                        if (!c13113.m31782(c10292.f31001) || strM31781 == null) {
                            this.f18568.setText(str.concat(" ?"));
                            this.f18568.setTextColor(C21943.f70293);
                            return;
                        } else if (strTrim.equalsIgnoreCase(strM31781)) {
                            this.f18568.setText(str.concat(" √"));
                            this.f18568.setTextColor(C21943.f70291);
                            return;
                        } else {
                            this.f18568.setText(str.concat(" ×"));
                            this.f18568.setTextColor(C21943.f70293);
                            return;
                        }
                    }
                    i++;
                } else {
                    if (strTrim.length() > 8) {
                        for (C10292 c10293 : c10292Arr) {
                            int i3 = c10293.f31001;
                            String strM31782 = c13113.m31781(i3);
                            if (c13113.m31782(i3) && strM31782 != null && strTrim.length() < iArr[i3] && C9679.m24619(strTrim, strM31782)) {
                                this.f18568.setText(c10293.f31000.concat(" ≈"));
                                this.f18568.setTextColor(C21943.f70291);
                                return;
                            }
                        }
                    }
                    this.f18568.setText("?");
                    this.f18568.setTextColor(C21943.f70257);
                    return;
                }
            }
        } else {
            this.f18568.setText((CharSequence) null);
        }
    }
}
