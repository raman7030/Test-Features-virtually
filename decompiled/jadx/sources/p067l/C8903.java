package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ۜܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8903 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f24119;

    /* JADX INFO: renamed from: ۜ֫ */
    public String f24120;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f24121;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f24122;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f24123;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f24124;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f24125;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f24126;

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo12921() {
        return true;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return "FTPS";
    }

    public C8903(int i) {
        super(i);
        this.f24123 = "";
        this.f24122 = 21;
        this.f24120 = "anonymous";
        this.f24124 = "";
        this.f24119 = C0233a.f1077D;
        this.f24125 = true;
        this.f24121 = true;
        this.f24126 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8903(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "4");
        AbstractC5769.m12918(jSONObject, "ip", "7");
        AbstractC5769.m12914(jSONObject, "hs", "b");
        AbstractC5769.m12914(jSONObject, "mt", C0655am.f2278aF);
        this.f24123 = "";
        this.f24122 = 21;
        this.f24120 = "anonymous";
        this.f24124 = "";
        this.f24119 = C0233a.f1077D;
        this.f24125 = true;
        this.f24121 = true;
        this.f24126 = true;
        this.f24123 = jSONObject.getString("2");
        this.f24122 = jSONObject.getInt("3");
        this.f24120 = jSONObject.getString("5");
        this.f24124 = jSONObject.getString("6");
        this.f24119 = jSONObject.getString("8");
        this.f24125 = jSONObject.getBoolean("9");
        this.f24121 = jSONObject.getBoolean(C0655am.f2320av);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        if (this.f24122 == 21) {
            return "ftps://" + this.f24120 + "@" + this.f24123;
        }
        return "ftps://" + this.f24120 + "@" + this.f24123 + ":" + this.f24122;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("2", this.f24123);
        jSONObjectMo8542.put("3", this.f24122);
        jSONObjectMo8542.put("5", this.f24120);
        jSONObjectMo8542.put("6", this.f24124);
        jSONObjectMo8542.put("8", this.f24119);
        jSONObjectMo8542.put("9", this.f24125);
        jSONObjectMo8542.put(C0655am.f2320av, this.f24121);
        return jSONObjectMo8542;
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        String str = "ftps://" + this.f24120 + "@" + this.f24123;
        return str.endsWith("/") ? C17073.m38720(1, 0, str) : str;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C8903) {
            C8903 c8903 = (C8903) abstractC5769;
            this.f24123 = c8903.f24123;
            this.f24122 = c8903.f24122;
            this.f24120 = c8903.f24120;
            this.f24124 = c8903.f24124;
            this.f24119 = c8903.f24119;
            this.f24125 = c8903.f24125;
            this.f24121 = c8903.f24121;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8903.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C8903 c8903 = (C8903) obj;
        return this.f24122 == c8903.f24122 && this.f24125 == c8903.f24125 && this.f24121 == c8903.f24121 && this.f24126 == c8903.f24126 && C12826.equals(this.f24123, c8903.f24123) && C12826.equals(this.f24120, c8903.f24120) && C12826.equals(this.f24124, c8903.f24124) && C12826.equals(this.f24119, c8903.f24119);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return ((((C21720.m49003(C21720.m49003(C21720.m49003((C21720.m49003(super.hashCode() * 31, 31, this.f24123) + this.f24122) * 31, 31, this.f24120), 31, this.f24124), 31, this.f24119) + (this.f24125 ? 1231 : 1237)) * 31) + (this.f24121 ? 1231 : 1237)) * 31) + (this.f24126 ? 1231 : 1237);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C6891(i, clone());
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66875;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        return C10965.m25286(new StringBuilder("ftps@"), this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m20560(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m20562(AbstractActivityC5549 abstractActivityC5549) {
        m20560(abstractActivityC5549, new C8903(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20560(final AbstractActivityC5549 abstractActivityC5549, C8903 c8903) {
        View viewM12252;
        if (abstractActivityC5549.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        } else {
            viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton3 = (RadioButton) viewM12252.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) viewM12252.findViewById(R.id.radioButton4);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0992 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c8903);
        View view = viewM12252;
        textView.setText(C7050.m16224(c8903.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTPS"));
        editText.setText(c8903.f24123);
        editText2.setText(String.valueOf(c8903.f24122));
        editText3.setText(c8903.f24120.equals("anonymous") ? "" : c8903.f24120);
        editText4.setText(c8903.f24124);
        editText5.setText(c8903.f14159);
        editText6.setText(c8903.f14164);
        editText7.setText(c8903.f24119);
        radioButton.setChecked(c8903.f24125);
        radioButton2.setChecked(!c8903.f24125);
        radioButton3.setChecked(c8903.f24121);
        radioButton4.setChecked(!c8903.f24121);
        c0990.setChecked(c8903.f14163);
        c0991.setChecked(c8903.f14154);
        c0992.setChecked(c8903.f14155);
        c0991.setOnCheckedChangeListener(new C4122(1));
        AbstractC5769.m12913(editText7, abstractActivityC5549);
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
        AbstractC5769.m12911(editText, editText6);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(view);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        C7050.m16226(editText);
        final C18961 c18961 = new C18961(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, radioButton3, c0990, c0991, c0992, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new ViewOnClickListenerC3039(c18961, c8903, dialogInterfaceC2564M46732));
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܳܺ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8903 c8904 = (C8903) c18961.get();
                if (c8904 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c8904)) {
                    new C24996(abstractActivityC55410, c8904).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8903 m20559(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, RadioButton radioButton2, C0990 c0990, C0990 c0991, C0990 c0992, C7110 c7110) {
        int i;
        if (!AbstractC5769.m12919(editText) || !AbstractC5769.m12915(editText2)) {
            return null;
        }
        C8903 c8903 = new C8903(-1);
        c8903.f24123 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c8903.f24122 = i;
        c8903.f24120 = AbstractC5769.m12910(editText4, "anonymous");
        c8903.f24124 = editText5.getText().toString();
        c8903.f14159 = editText6.getText().toString();
        c8903.f14164 = AbstractC5769.m12910(editText7, c8903.f24123);
        c8903.f24119 = AbstractC5769.m12910(editText2, C0233a.f1077D);
        c8903.f24125 = radioButton.isChecked();
        c8903.f24121 = radioButton2.isChecked();
        c8903.f14163 = c0990.isChecked();
        c8903.f14154 = c0991.isChecked();
        c8903.f14155 = c0992.isChecked();
        c8903.m12922(c7110);
        return c8903;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m20561(C18961 c18961, C8903 c8903, DialogInterfaceC2564 dialogInterfaceC2564) {
        C8903 c8904 = (C8903) c18961.get();
        if (c8904 == null) {
            return;
        }
        if (c8903.f14161 == -1) {
            C8903 c8905 = new C8903(AbstractC5769.m12920());
            c8905.mo8541(c8904);
            C14486.m33123(c8905);
        } else {
            c8903.mo8541(c8904);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }
}
