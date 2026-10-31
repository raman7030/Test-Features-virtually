package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۜܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6875 extends AbstractC3577 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f21242;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f21243;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f21244;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f21245;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f21246;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f21247;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f21248;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f21249;

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo10944() {
        return true;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        return "FTPS";
    }

    public C6875(int i) {
        super(i);
        this.f21246 = "";
        this.f21245 = 21;
        this.f21243 = "anonymous";
        this.f21247 = "";
        this.f21242 = a.D;
        this.f21248 = true;
        this.f21244 = true;
        this.f21249 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6875(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "4");
        AbstractC3577.m10941(jSONObject, "ip", "7");
        AbstractC3577.m10937(jSONObject, "hs", "b");
        AbstractC3577.m10937(jSONObject, "mt", am.aF);
        this.f21246 = "";
        this.f21245 = 21;
        this.f21243 = "anonymous";
        this.f21247 = "";
        this.f21242 = a.D;
        this.f21248 = true;
        this.f21244 = true;
        this.f21249 = true;
        this.f21246 = jSONObject.getString("2");
        this.f21245 = jSONObject.getInt("3");
        this.f21243 = jSONObject.getString("5");
        this.f21247 = jSONObject.getString("6");
        this.f21242 = jSONObject.getString("8");
        this.f21248 = jSONObject.getBoolean("9");
        this.f21244 = jSONObject.getBoolean(am.av);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        if (this.f21245 == 21) {
            return "ftps://" + this.f21243 + "@" + this.f21246;
        }
        return "ftps://" + this.f21243 + "@" + this.f21246 + ":" + this.f21245;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("2", this.f21246);
        jSONObjectMo6369.put("3", this.f21245);
        jSONObjectMo6369.put("5", this.f21243);
        jSONObjectMo6369.put("6", this.f21247);
        jSONObjectMo6369.put("8", this.f21242);
        jSONObjectMo6369.put("9", this.f21248);
        jSONObjectMo6369.put(am.av, this.f21244);
        return jSONObjectMo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        String str = "ftps://" + this.f21243 + "@" + this.f21246;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C6875) {
            C6875 c6875 = (C6875) abstractC3577;
            this.f21246 = c6875.f21246;
            this.f21245 = c6875.f21245;
            this.f21243 = c6875.f21243;
            this.f21247 = c6875.f21247;
            this.f21242 = c6875.f21242;
            this.f21248 = c6875.f21248;
            this.f21244 = c6875.f21244;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6875.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6875 c6875 = (C6875) obj;
        return this.f21245 == c6875.f21245 && this.f21248 == c6875.f21248 && this.f21244 == c6875.f21244 && this.f21249 == c6875.f21249 && C11003.equals(this.f21246, c6875.f21246) && C11003.equals(this.f21243, c6875.f21243) && C11003.equals(this.f21247, c6875.f21247) && C11003.equals(this.f21242, c6875.f21242);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return ((((C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f21246) + this.f21245) * 31, 31, this.f21243), 31, this.f21247), 31, this.f21242) + (this.f21248 ? 1231 : 1237)) * 31) + (this.f21244 ? 1231 : 1237)) * 31) + (this.f21249 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C4758(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64239;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("ftps@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m18611(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18613(AbstractActivityC3346 abstractActivityC3346) {
        m18611(abstractActivityC3346, new C6875(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18611(final AbstractActivityC3346 abstractActivityC3346, C6875 c6875) {
        View viewM10216;
        if (abstractActivityC3346.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        } else {
            viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM10216.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM10216.findViewById(R.id.radioButton4);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c29710 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C4988 c4988M14473 = C4988.m14473(abstractActivityC3346, (TextView) viewM10216.findViewById(R.id.MT_Protector), c6875);
        View view = viewM10216;
        textView.setText(C4925.m14327(c6875.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTPS"));
        editText.setText(c6875.f21246);
        editText2.setText(String.valueOf(c6875.f21245));
        editText3.setText(c6875.f21243.equals("anonymous") ? "" : c6875.f21243);
        editText4.setText(c6875.f21247);
        editText5.setText(c6875.f11354);
        editText6.setText(c6875.f11359);
        editText7.setText(c6875.f21242);
        radioButton.setChecked(c6875.f21248);
        radioButton2.setChecked(!c6875.f21248);
        radioButton3.setChecked(c6875.f21244);
        radioButton4.setChecked(!c6875.f21244);
        c2978.setChecked(c6875.f11358);
        c2979.setChecked(c6875.f11349);
        c29710.setChecked(c6875.f11350);
        c2979.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10936(editText7, abstractActivityC3346);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܽܺ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton;
                if (compoundButton == radioButton5) {
                    radioButton5 = radioButton2;
                }
                if (radioButton5.isChecked() == z) {
                    radioButton5.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳܺ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton3;
                RadioButton radioButton6 = compoundButton == radioButton5 ? radioButton4 : radioButton5;
                if (radioButton6.isChecked() == z) {
                    radioButton6.setChecked(!z);
                    boolean zIsChecked = radioButton5.isChecked();
                    EditText editText8 = editText2;
                    if (zIsChecked) {
                        if (editText8.getText().toString().equals("990")) {
                            editText8.setText("21");
                        }
                    } else if (editText8.getText().toString().equals("21")) {
                        editText8.setText("990");
                    }
                }
            }
        };
        radioButton3.setOnCheckedChangeListener(onCheckedChangeListener2);
        radioButton4.setOnCheckedChangeListener(onCheckedChangeListener2);
        AbstractC3577.m10934(editText, editText6);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(view);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        C4925.m14329(editText);
        final C17458 c17458 = new C17458(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, radioButton3, c2978, c2979, c29710, c4988M14473);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC0705(c17458, c6875, dialogInterfaceC0206M44438));
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܳܺ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6875 c6876 = (C6875) c17458.get();
                if (c6876 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c6876)) {
                    new C23808(abstractActivityC3347, c6876).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6875 m18610(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, RadioButton radioButton2, C2978 c2978, C2978 c2979, C2978 c29710, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10938(editText2)) {
            return null;
        }
        C6875 c6875 = new C6875(-1);
        c6875.f21246 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c6875.f21245 = i;
        c6875.f21243 = AbstractC3577.m10933(editText4, "anonymous");
        c6875.f21247 = editText5.getText().toString();
        c6875.f11354 = editText6.getText().toString();
        c6875.f11359 = AbstractC3577.m10933(editText7, c6875.f21246);
        c6875.f21242 = AbstractC3577.m10933(editText2, a.D);
        c6875.f21248 = radioButton.isChecked();
        c6875.f21244 = radioButton2.isChecked();
        c6875.f11358 = c2978.isChecked();
        c6875.f11349 = c2979.isChecked();
        c6875.f11350 = c29710.isChecked();
        c6875.m10945(c4988);
        return c6875;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18612(C17458 c17458, C6875 c6875, DialogInterfaceC0206 dialogInterfaceC0206) {
        C6875 c6876 = (C6875) c17458.get();
        if (c6876 == null) {
            return;
        }
        if (c6875.f11356 == -1) {
            C6875 c6877 = new C6875(AbstractC3577.m10943());
            c6877.mo6368(c6876);
            C12749.m31039(c6877);
        } else {
            c6875.mo6368(c6876);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
