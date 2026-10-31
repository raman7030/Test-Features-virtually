package l;

import android.content.DialogInterface;
import android.os.PowerManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܽܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16700 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f51267;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51268;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f51269;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51270;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f51271;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Set f51272;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f51273;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51274;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f51275;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f51276;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10235 f51277;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 f51278;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f51279;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final View f51280;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f51281;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5062 f51282;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f51283;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20296 f51284;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f51285;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC16700(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        String strConcat = str;
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f51285 = interfaceC12344;
        ActivityC17169 activityC17169 = (ActivityC17169) componentCallbacksC9205.requireActivity();
        this.f51283 = activityC17169;
        this.f51278 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        View viewM10216 = activityC17169.m10216(R.layout.MT_Protector);
        this.f51280 = viewM10216;
        C5062 c5062 = (C5062) viewM10216.findViewById(R.id.MT_Protector);
        this.f51282 = c5062;
        c5062.m14602(C2353.m7663(), (String) null);
        C10235 c10235 = (C10235) viewM10216.findViewById(R.id.editText2);
        this.f51277 = c10235;
        View viewFindViewById = viewM10216.findViewById(R.id.MT_Protector);
        this.f51275 = viewFindViewById;
        CheckBox checkBox = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f51276 = checkBox;
        c10235.m30313(new C7612(this));
        Spinner spinner = (Spinner) viewM10216.findViewById(R.id.spinner);
        this.f51281 = spinner;
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f51279 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f51274 = checkBox3;
        CheckBox checkBox4 = (CheckBox) viewM10216.findViewById(R.id.checkBox2);
        this.f51271 = checkBox4;
        CheckBox checkBox5 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f51270 = checkBox5;
        CheckBox checkBox6 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f51268 = checkBox6;
        String strConcat2 = "/";
        if (strConcat == null) {
            String string = interfaceC12344.getString("dex_search_path", null);
            if (string != null && !string.isEmpty()) {
                strConcat2 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c10235.mo25910((CharSequence) strConcat2);
        } else {
            if (str.isEmpty()) {
                strConcat = "/";
            } else if (!strConcat.endsWith("/")) {
                strConcat = strConcat.concat("/");
            }
            c10235.mo25910((CharSequence) strConcat);
        }
        spinner.setSelection(interfaceC12344.getInt("dex_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_sub", true));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox4.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox5.setChecked(interfaceC12344.getBoolean("dex_search_hex", true));
        checkBox6.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", true));
        this.f51284 = new C20296(this);
        checkBox.setChecked(interfaceC12344.getBoolean("dseb", false));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C22870.m50970(this.f19021.f51285, "dseb", z);
            }
        });
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC9841(7, this));
        m39256();
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f35346.m39256();
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39254(ViewOnClickListenerC16700 viewOnClickListenerC16700) {
        C1884 c1884 = new C1884(viewOnClickListenerC16700.f51283, -1);
        c1884.m31258(R.string.MT_Protector);
        c1884.m31273(C4925.m14306(R.string.MT_Protector, "com/gms/\nandroidx/"));
        c1884.m31250((CharSequence) ApplicationC20075.f65008.getString("dsel", ""));
        c1884.m31270();
        c1884.m31266(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m39256() {
        CheckBox checkBox = this.f51271;
        this.f51282.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39264(C0941 c0941) {
        this.f51267 = true;
        this.f51272 = c0941.m3355();
        this.f51273 = c0941.m3361();
        this.f51279.setVisibility(8);
        C10235 c10235 = this.f51277;
        c10235.mo25910((CharSequence) c10235.getContext().getString(R.string.MT_Protector));
        c10235.setEnabled(false);
        this.f51275.setEnabled(false);
        this.f51276.setEnabled(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39263() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f51283);
        c19258.m44421(this.f51280);
        DialogInterfaceC0206 dialogInterfaceC0206M19253 = C7187.m19253(c19258, R.string.MT_Protector, (DialogInterface.OnClickListener) null, R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f51269 = dialogInterfaceC0206M19253;
        dialogInterfaceC0206M19253.m1447().setOnClickListener(this);
        C5062 c5062 = this.f51282;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f51282.m14604(i == 0 || i == 4);
        CheckBox checkBox = this.f51268;
        CheckBox checkBox2 = this.f51270;
        CheckBox checkBox3 = this.f51271;
        CheckBox checkBox4 = this.f51274;
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
        m39256();
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
        InterfaceC13049 interfaceC13049Edit;
        ViewOnClickListenerC16700 viewOnClickListenerC16700;
        C11057 c11057;
        C12366 c12366;
        C13961 c13961;
        String strConcat;
        C5062 c5062 = this.f51282;
        String string = c5062.m14611().toString();
        if (string.isEmpty()) {
            this.f51269.dismiss();
            return;
        }
        String string2 = this.f51277.m30436().toString();
        int selectedItemPosition = this.f51281.getSelectedItemPosition();
        boolean zIsChecked = this.f51279.isChecked();
        boolean zIsChecked2 = this.f51274.isChecked();
        boolean zIsChecked3 = this.f51271.isChecked();
        boolean zIsChecked4 = this.f51270.isChecked();
        boolean zIsChecked5 = this.f51268.isChecked();
        if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2 && selectedItemPosition != 3 && selectedItemPosition != 4) {
            if (selectedItemPosition != 5) {
                i = 0;
            } else if (zIsChecked4) {
                char c = 4;
                String strSubstring = (string.startsWith("0x") || string.startsWith("0X")) ? string.substring(2) : string;
                if (C9896.m24999(strSubstring)) {
                    char[] charArray = strSubstring.toCharArray();
                    int length = charArray.length;
                    int i2 = 0;
                    long jM24989 = 0;
                    while (i2 < length) {
                        jM24989 = (jM24989 << c) | ((long) C9896.m24989(charArray[i2]));
                        i2++;
                        charArray = charArray;
                        length = length;
                        c = 4;
                    }
                    i = 0;
                    j = jM24989;
                } else {
                    C21374.m48457(R.string.MT_Protector);
                    c5062.requestFocus();
                    return;
                }
            } else {
                try {
                    j = Long.parseLong(string);
                    i = 0;
                } catch (NumberFormatException unused) {
                    C21374.m48457(R.string.MT_Protector);
                    c5062.requestFocus();
                    return;
                }
            }
            c5062.m14610();
            interfaceC13049Edit = this.f51285.edit();
            if (!this.f51267) {
                interfaceC13049Edit.putString("dex_search_path", string2);
            }
            interfaceC13049Edit.mo25853(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
            this.f51269.dismiss();
            viewOnClickListenerC16700 = (ViewOnClickListenerC16700) this.f51284.f65551;
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C4925.m14335().getSystemService("power")).newWakeLock(1, C4925.m14337().concat(":DexPlus"));
            wakeLockNewWakeLock.acquire();
            C22933 c22933 = new C22933(viewOnClickListenerC16700.f51283);
            c22933.m51049(R.string.MT_Protector);
            Object[] objArr = new Object[1];
            objArr[i] = Integer.valueOf(i);
            c22933.m51040(C4925.m14306(R.string.MT_Protector, objArr));
            c22933.mo49542((Runnable) null);
            c22933.mo49547();
            c11057 = new C11057(viewOnClickListenerC16700, c22933, wakeLockNewWakeLock);
            c12366 = (C12366) viewOnClickListenerC16700.f51278.m11419().m1662();
            C11003.requireNonNull(c12366);
            if (viewOnClickListenerC16700.f51267) {
                strConcat = viewOnClickListenerC16700.f51273;
                if (strConcat.startsWith("/")) {
                    strConcat = strConcat.substring(1);
                } else if (strConcat.length() > 0 && !strConcat.endsWith("/")) {
                    strConcat = strConcat.concat("/");
                }
                String str = strConcat;
                Set set = viewOnClickListenerC16700.f51272;
                C11003.requireNonNull(set);
                C6180.m17088(c12366, string, str, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC4469) c11057, (Predicate) new C3379(0, set));
                return;
            }
            if (viewOnClickListenerC16700.f51275.isEnabled() || !viewOnClickListenerC16700.f51276.isChecked()) {
                c13961 = null;
            } else {
                int i3 = 0;
                List list = (List) C22311.stream(ApplicationC20075.f65008.getString("dsel", "").split("\n")).map(new C17576(3)).filter(new C23134(i3)).collect(C22976.toList());
                if (list.isEmpty()) {
                    c13961 = null;
                } else {
                    c13961 = new C13961(i3, list);
                }
            }
            if (string2.startsWith("/")) {
                string2 = string2.substring(1);
            } else if (string2.length() > 0 && !string2.endsWith("/")) {
                string2 = string2.concat("/");
            }
            C6180.m17088(c12366, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c11057, c13961);
        }
        i = 0;
        if (zIsChecked3) {
            try {
                C11459.m28260(string);
            } catch (Exception e) {
                C21374.m48459((CharSequence) e.getMessage());
                c5062.requestFocus();
                return;
            }
        }
        j = 0;
        c5062.m14610();
        interfaceC13049Edit = this.f51285.edit();
        if (!this.f51267) {
            interfaceC13049Edit.putString("dex_search_path", string2);
        }
        interfaceC13049Edit.mo25853(selectedItemPosition, "dex_search_type").putBoolean("dex_search_sub", zIsChecked).putBoolean("dex_search_match_case", zIsChecked2).putBoolean("dex_search_regex", zIsChecked3).putBoolean("dex_search_hex", zIsChecked4).putBoolean("dex_search_exactly_match", zIsChecked5).apply();
        this.f51269.dismiss();
        viewOnClickListenerC16700 = (ViewOnClickListenerC16700) this.f51284.f65551;
        PowerManager.WakeLock wakeLockNewWakeLock2 = ((PowerManager) C4925.m14335().getSystemService("power")).newWakeLock(1, C4925.m14337().concat(":DexPlus"));
        wakeLockNewWakeLock2.acquire();
        C22933 c22934 = new C22933(viewOnClickListenerC16700.f51283);
        c22934.m51049(R.string.MT_Protector);
        Object[] objArr2 = new Object[1];
        objArr2[i] = Integer.valueOf(i);
        c22934.m51040(C4925.m14306(R.string.MT_Protector, objArr2));
        c22934.mo49542((Runnable) null);
        c22934.mo49547();
        c11057 = new C11057(viewOnClickListenerC16700, c22934, wakeLockNewWakeLock2);
        c12366 = (C12366) viewOnClickListenerC16700.f51278.m11419().m1662();
        C11003.requireNonNull(c12366);
        if (viewOnClickListenerC16700.f51267) {
            strConcat = viewOnClickListenerC16700.f51273;
            if (strConcat.startsWith("/")) {
                strConcat = strConcat.substring(1);
            } else if (strConcat.length() > 0) {
                strConcat = strConcat.concat("/");
            }
            String str2 = strConcat;
            Set set2 = viewOnClickListenerC16700.f51272;
            C11003.requireNonNull(set2);
            C6180.m17088(c12366, string, str2, j, selectedItemPosition, true, zIsChecked2, zIsChecked3, zIsChecked5, (InterfaceC4469) c11057, (Predicate) new C3379(0, set2));
            return;
        }
        if (viewOnClickListenerC16700.f51275.isEnabled()) {
            c13961 = null;
        } else {
            c13961 = null;
        }
        if (string2.startsWith("/")) {
            string2 = string2.substring(1);
        } else if (string2.length() > 0) {
            string2 = string2.concat("/");
        }
        C6180.m17088(c12366, string, string2, j, selectedItemPosition, zIsChecked, zIsChecked2, zIsChecked3, zIsChecked5, c11057, c13961);
    }
}
