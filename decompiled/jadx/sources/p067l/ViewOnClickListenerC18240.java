package p067l;

import android.content.DialogInterface;
import android.os.PowerManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.p000mt.plus.R;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC18240 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f54452;

    /* JADX INFO: renamed from: ۗ */
    public final CheckBox f54453;

    /* JADX INFO: renamed from: ۙ */
    public DialogInterfaceC2564 f54454;

    /* JADX INFO: renamed from: ۛ */
    public final CheckBox f54455;

    /* JADX INFO: renamed from: ۟ */
    public final CheckBox f54456;

    /* JADX INFO: renamed from: ۤ */
    public Set f54457;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f54458;

    /* JADX INFO: renamed from: ۨ */
    public final CheckBox f54459;

    /* JADX INFO: renamed from: ۫ */
    public final View f54460;

    /* JADX INFO: renamed from: ۬ */
    public final CheckBox f54461;

    /* JADX INFO: renamed from: ܰ */
    public final C12096 f54462;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C5946 f54463;

    /* JADX INFO: renamed from: ܽ֫ */
    public final CheckBox f54464;

    /* JADX INFO: renamed from: ܿ֫ */
    public final View f54465;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final Spinner f54466;

    /* JADX INFO: renamed from: ᩶ */
    public final C7179 f54467;

    /* JADX INFO: renamed from: ᩸ */
    public final ActivityC18686 f54468;

    /* JADX INFO: renamed from: ᩹ */
    public C21658 f54469;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC14100 f54470;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC18240(ComponentCallbacksC11117 componentCallbacksC11117, String str) {
        String strConcat = str;
        InterfaceC14100 interfaceC14100 = ApplicationC21448.f67649;
        this.f54470 = interfaceC14100;
        ActivityC18686 activityC18686 = (ActivityC18686) componentCallbacksC11117.requireActivity();
        this.f54468 = activityC18686;
        this.f54463 = (C5946) new C6874(activityC18686).m15765(C5946.class);
        View viewM12252 = activityC18686.m12252(R.layout.MT_Protector);
        this.f54465 = viewM12252;
        C7179 c7179 = (C7179) viewM12252.findViewById(R.id.MT_Protector);
        this.f54467 = c7179;
        c7179.m16509(C4605.m9734(), (String) null);
        C12096 c12096 = (C12096) viewM12252.findViewById(R.id.editText2);
        this.f54462 = c12096;
        View viewFindViewById = viewM12252.findViewById(R.id.MT_Protector);
        this.f54460 = viewFindViewById;
        CheckBox checkBox = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f54461 = checkBox;
        c12096.m32377(new C9603(this));
        Spinner spinner = (Spinner) viewM12252.findViewById(R.id.spinner);
        this.f54466 = spinner;
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f54464 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f54459 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM12252.findViewById(R.id.checkBox2);
        this.f54456 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f54455 = checkBox5;
        CheckBox checkBox6 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f54453 = checkBox6;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC14100.getString("dex_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c12096.mo27932((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c12096.mo27932((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC14100.getInt("dex_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox2.setChecked(interfaceC14100.getBoolean("dex_search_sub", true));
        checkBox3.setChecked(interfaceC14100.getBoolean("dex_search_match_case", false));
        checkBox4.setChecked(interfaceC14100.getBoolean("dex_search_regex", false));
        checkBox5.setChecked(interfaceC14100.getBoolean("dex_search_hex", true));
        checkBox6.setChecked(interfaceC14100.getBoolean("dex_search_exactly_match", true));
        this.f54469 = new C21658(this);
        checkBox.setChecked(interfaceC14100.getBoolean("dseb", false));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C24104.m53360(this.f21882.f54470, "dseb", z);
            }
        });
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC11722(7, this));
        m41492();
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f38351.m41492();
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41490(ViewOnClickListenerC18240 viewOnClickListenerC18240) {
        C4159 c4159 = new C4159(viewOnClickListenerC18240.f54468, -1);
        c4159.m33344(R.string.MT_Protector);
        c4159.m33359(C7050.m16203(R.string.MT_Protector, "com/gms/\nandroidx/"));
        c4159.m33336((CharSequence) ApplicationC21448.f67649.getString("dsel", ""));
        c4159.m33356();
        c4159.m33352(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m41492() {
        CheckBox checkBox = this.f54456;
        this.f54467.m16516(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41500(C3263 c3263) {
        this.f54452 = true;
        this.f54457 = c3263.m5674();
        this.f54458 = c3263.m5680();
        this.f54464.setVisibility(8);
        C12096 c12096 = this.f54462;
        c12096.mo27932((CharSequence) c12096.getContext().getString(R.string.MT_Protector));
        c12096.setEnabled(false);
        this.f54460.setEnabled(false);
        this.f54461.setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41499() {
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(this.f54468);
        c20671.m46715(this.f54465);
        DialogInterfaceC2564 dialogInterfaceC2564M21200 = C9199.m21200(c20671, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f54454 = dialogInterfaceC2564M21200;
        dialogInterfaceC2564M21200.m3860().setOnClickListener(this);
        C7179 c7179 = this.f54467;
        c7179.requestFocus();
        C7050.m16226(c7179.m16514());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f54467.m16511(i == 0 || i == 4);
        CheckBox checkBox = this.f54453;
        CheckBox checkBox2 = this.f54455;
        CheckBox checkBox3 = this.f54456;
        CheckBox checkBox4 = this.f54459;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox.setVisibility(0);
            checkBox2.setVisibility(8);
        } else if (i == 5) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        }
        m41492();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x019e  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fa  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        long j;
        InterfaceC14770 interfaceC14770Edit;
        ViewOnClickListenerC18240 viewOnClickListenerC18240;
        C12877 c12877;
        C14121 c14121;
        C15637 c15637;
        String strConcat;
        C7179 c7179 = this.f54467;
        String string = c7179.m16518().toString();
        if (string.isEmpty()) {
            this.f54454.dismiss();
            return;
        }
        String string2 = this.f54462.m32500().toString();
        int selectedItemPosition = this.f54466.getSelectedItemPosition();
        boolean zIsChecked = this.f54464.isChecked();
        boolean zIsChecked2 = this.f54459.isChecked();
        boolean zIsChecked3 = this.f54456.isChecked();
        boolean zIsChecked4 = this.f54455.isChecked();
        boolean zIsChecked5 = this.f54453.isChecked();
        if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2 && selectedItemPosition != 3 && selectedItemPosition != 4) {
            if (selectedItemPosition != 5) {
                i = 0;
            } else if (zIsChecked4) {
                char c = 4;
                String strSubstring = (string.startsWith("0x") || string.startsWith("0X")) ? string.substring(2) : string;
                if (C11774.m27014(strSubstring)) {
                    char[] charArray = strSubstring.toCharArray();
                    int length = charArray.length;
                    int i2 = 0;
                    long jM27004 = 0;
                    while (i2 < length) {
                        jM27004 = (jM27004 << c) | ((long) C11774.m27004(charArray[i2]));
                        i2++;
                        charArray = charArray;
                        length = length;
                        c = 4;
                    }
                    i = 0;
                    j = jM27004;
                } else {
                    C22682.m50793(R.string.MT_Protector);
                    c7179.requestFocus();
                    return;
                }
            } else {
                try {
                    j = Long.parseLong(string);
                    i = 0;
                } catch (NumberFormatException unused) {
                    C22682.m50793(R.string.MT_Protector);
                    c7179.requestFocus();
                    return;
                }
            }
            c7179.m16517();
            interfaceC14770Edit = this.f54470.edit();
            if (!this.f54452) {
                interfaceC14770Edit.putString("dex_search_path", string2);
            }
            interfaceC14770Edit.mo27875(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
            this.f54454.dismiss();
            viewOnClickListenerC18240 = (ViewOnClickListenerC18240) this.f54469.f68226;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C7050.m16232().getSystemService("power")).newWakeLock(1, C7050.m16234().concat(":DexPlus"));
            wakeLockNewWakeLock.acquire();
            C24164 c24164 = new C24164(viewOnClickListenerC18240.f54468);
            c24164.m53440(R.string.MT_Protector);
            Object[] objArr = new Object[1];
            objArr[i] = Integer.valueOf(i);
            c24164.m53431(C7050.m16203(R.string.MT_Protector, objArr));
            c24164.mo51878((Runnable) null);
            c24164.mo51883();
            c12877 = new C12877(viewOnClickListenerC18240, c24164, wakeLockNewWakeLock);
            c14121 = (C14121) viewOnClickListenerC18240.f54463.m13355().m4060();
            C12826.requireNonNull(c14121);
            if (viewOnClickListenerC18240.f54452) {
                strConcat = viewOnClickListenerC18240.f54458;
                if (strConcat.startsWith("/")) {
                    strConcat = strConcat.substring(1);
                } else if (strConcat.length() > 0 && !strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                String str = strConcat;
                Set set = viewOnClickListenerC18240.f54457;
                C12826.requireNonNull(set);
                C8242.m19020(c14121, string, str, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC6616) c12877, (Predicate) new C5580(0, set));
                return;
            }
            if (viewOnClickListenerC18240.f54460.isEnabled() || !viewOnClickListenerC18240.f54461.isChecked()) {
                c15637 = null;
            } else {
                int i3 = 0;
                List list = (List) C23573.stream(ApplicationC21448.f67649.getString("dsel", "").split("\n")).map(new C19073(3)).filter(new C24355(i3)).collect(C24205.toList());
                if (list.isEmpty()) {
                    c15637 = null;
                } else {
                    c15637 = new C15637(i3, list);
                }
            }
            if (string2.startsWith("/")) {
                string2 = string2.substring(1);
            } else if (string2.length() > 0 && !string2.endsWith("/")) {
                string2 = string2.concat("/");
            }
            C8242.m19020(c14121, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c12877, c15637);
        }
        i = 0;
        if (zIsChecked3) {
            try {
                C13259.m30304(string);
            } catch (Exception e) {
                C22682.m50795((CharSequence) e.getMessage());
                c7179.requestFocus();
                return;
            }
        }
        j = 0;
        c7179.m16517();
        interfaceC14770Edit = this.f54470.edit();
        if (!this.f54452) {
            interfaceC14770Edit.putString("dex_search_path", string2);
        }
        interfaceC14770Edit.mo27875(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f54454.dismiss();
        viewOnClickListenerC18240 = (ViewOnClickListenerC18240) this.f54469.f68226;
        PowerManager.WakeLock wakeLockNewWakeLock2 = ((PowerManager) C7050.m16232().getSystemService("power")).newWakeLock(1, C7050.m16234().concat(":DexPlus"));
        wakeLockNewWakeLock2.acquire();
        C24164 c24165 = new C24164(viewOnClickListenerC18240.f54468);
        c24165.m53440(R.string.MT_Protector);
        Object[] objArr2 = new Object[1];
        objArr2[i] = Integer.valueOf(i);
        c24165.m53431(C7050.m16203(R.string.MT_Protector, objArr2));
        c24165.mo51878((Runnable) null);
        c24165.mo51883();
        c12877 = new C12877(viewOnClickListenerC18240, c24165, wakeLockNewWakeLock2);
        c14121 = (C14121) viewOnClickListenerC18240.f54463.m13355().m4060();
        C12826.requireNonNull(c14121);
        if (viewOnClickListenerC18240.f54452) {
            strConcat = viewOnClickListenerC18240.f54458;
            if (strConcat.startsWith("/")) {
                strConcat = strConcat.substring(1);
            } else if (strConcat.length() > 0) {
                strConcat = strConcat.concat("/");
            }
            String str2 = strConcat;
            Set set2 = viewOnClickListenerC18240.f54457;
            C12826.requireNonNull(set2);
            C8242.m19020(c14121, string, str2, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC6616) c12877, (Predicate) new C5580(0, set2));
            return;
        }
        if (viewOnClickListenerC18240.f54460.isEnabled()) {
            c15637 = null;
        } else {
            c15637 = null;
        }
        if (string2.startsWith("/")) {
            string2 = string2.substring(1);
        } else if (string2.length() > 0) {
            string2 = string2.concat("/");
        }
        C8242.m19020(c14121, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c12877, c15637);
    }
}
