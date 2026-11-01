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

/* JADX INFO: renamed from: l.֫ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C4209 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f9257;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f9258;

    /* JADX INFO: renamed from: ܳ֫ */
    public String f9259;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f9260;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f9261;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f9262;

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return "FTP";
    }

    public C4209(int i) {
        super(i);
        this.f9258 = "";
        this.f9261 = 21;
        this.f9259 = "anonymous";
        this.f9262 = "";
        this.f9257 = C0233a.f1077D;
        this.f9260 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4209(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "4");
        AbstractC5769.m12918(jSONObject, "ip", "7");
        AbstractC5769.m12914(jSONObject, "hs", C0655am.f2320av);
        AbstractC5769.m12914(jSONObject, "mt", "b");
        this.f9258 = "";
        this.f9261 = 21;
        this.f9259 = "anonymous";
        this.f9262 = "";
        this.f9257 = C0233a.f1077D;
        this.f9260 = true;
        this.f9258 = jSONObject.getString("2");
        this.f9261 = jSONObject.getInt("3");
        this.f9259 = jSONObject.getString("5");
        this.f9262 = jSONObject.getString("6");
        this.f9257 = jSONObject.getString("8");
        this.f9260 = jSONObject.getBoolean("9");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        if (this.f9261 == 21) {
            return "ftp://" + this.f9259 + "@" + this.f9258;
        }
        return "ftp://" + this.f9259 + "@" + this.f9258 + ":" + this.f9261;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("2", this.f9258);
        jSONObjectMo8542.put("3", this.f9261);
        jSONObjectMo8542.put("5", this.f9259);
        jSONObjectMo8542.put("6", this.f9262);
        jSONObjectMo8542.put("8", this.f9257);
        jSONObjectMo8542.put("9", this.f9260);
        return jSONObjectMo8542;
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        String str = "ftp://" + this.f9259 + "@" + this.f9258;
        return str.endsWith("/") ? C17073.m38720(1, 0, str) : str;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C4209) {
            C4209 c4209 = (C4209) abstractC5769;
            this.f9258 = c4209.f9258;
            this.f9261 = c4209.f9261;
            this.f9259 = c4209.f9259;
            this.f9262 = c4209.f9262;
            this.f9257 = c4209.f9257;
            this.f9260 = c4209.f9260;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4209.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C4209 c4209 = (C4209) obj;
        return this.f9261 == c4209.f9261 && this.f9260 == c4209.f9260 && C12826.equals(this.f9258, c4209.f9258) && C12826.equals(this.f9259, c4209.f9259) && C12826.equals(this.f9262, c4209.f9262) && C12826.equals(this.f9257, c4209.f9257);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return C21720.m49003(C21720.m49003(C21720.m49003((C21720.m49003(super.hashCode() * 31, 31, this.f9258) + this.f9261) * 31, 31, this.f9259), 31, this.f9262), 31, this.f9257) + (this.f9260 ? 1231 : 1237);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C6891(i, clone());
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66857;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        return C10965.m25286(new StringBuilder("ftp@"), this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m8535(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m8537(AbstractActivityC5549 abstractActivityC5549) {
        m8535(abstractActivityC5549, new C4209(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8535(final AbstractActivityC5549 abstractActivityC5549, final C4209 c4209) {
        View viewM12252;
        if (abstractActivityC5549.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        } else {
            viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0992 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c4209);
        View view = viewM12252;
        textView.setText(C7050.m16224(c4209.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTP"));
        editText.setText(c4209.f9258);
        editText2.setText(String.valueOf(c4209.f9261));
        editText3.setText(c4209.f9259.equals("anonymous") ? "" : c4209.f9259);
        editText4.setText(c4209.f9262);
        editText5.setText(c4209.f14159);
        editText6.setText(c4209.f14164);
        editText7.setText(c4209.f9257);
        radioButton.setChecked(c4209.f9260);
        radioButton2.setChecked(!c4209.f9260);
        c0990.setChecked(c4209.f14163);
        c0991.setChecked(c4209.f14154);
        c0992.setChecked(c4209.f14155);
        c0991.setOnCheckedChangeListener(new C4122(1));
        AbstractC5769.m12913(editText7, abstractActivityC5549);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۤۡ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton3 = radioButton;
                if (compoundButton == radioButton3) {
                    radioButton3 = radioButton2;
                }
                if (radioButton3.isChecked() == z) {
                    radioButton3.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        view.findViewById(R.id.MT_Protector).setVisibility(8);
        AbstractC5769.m12911(editText, editText6);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(view);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        C7050.m16226(editText);
        final C8037 c8037 = new C8037(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, c0990, c0991, c0992, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.ۨۡ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4209.m8536(c8037, c4209, dialogInterfaceC2564M46732);
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۡ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4209 c42010 = (C4209) c8037.get();
                if (c42010 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c42010)) {
                    new C15412(abstractActivityC55410, c42010).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4209 m8534(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, C0990 c0990, C0990 c0991, C0990 c0992, C7110 c7110) {
        int i;
        if (!AbstractC5769.m12919(editText) || !AbstractC5769.m12915(editText2)) {
            return null;
        }
        C4209 c4209 = new C4209(-1);
        c4209.f9258 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c4209.f9261 = i;
        c4209.f9259 = AbstractC5769.m12910(editText4, "anonymous");
        c4209.f9262 = editText5.getText().toString();
        c4209.f14159 = editText6.getText().toString();
        c4209.f14164 = AbstractC5769.m12910(editText7, c4209.f9258);
        c4209.f9257 = AbstractC5769.m12910(editText2, C0233a.f1077D);
        c4209.f9260 = radioButton.isChecked();
        c4209.f14163 = c0990.isChecked();
        c4209.f14154 = c0991.isChecked();
        c4209.f14155 = c0992.isChecked();
        c4209.m12922(c7110);
        return c4209;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m8536(C8037 c8037, C4209 c4209, DialogInterfaceC2564 dialogInterfaceC2564) {
        C4209 c42010 = (C4209) c8037.get();
        if (c42010 == null) {
            return;
        }
        if (c4209.f14161 == -1) {
            C4209 c42011 = new C4209(AbstractC5769.m12920());
            c42011.mo8541(c42010);
            C14486.m33123(c42011);
        } else {
            c4209.mo8541(c42010);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }
}
