package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.json.JSONObject;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ܳᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16358 extends AbstractC5769 {

    /* JADX INFO: renamed from: ֫֫ */
    public String f48060;

    /* JADX INFO: renamed from: ۜ֫ */
    public String f48061;

    /* JADX INFO: renamed from: ۢ֫ */
    public String f48062;

    /* JADX INFO: renamed from: ۧ֫ */
    public String f48063;

    /* JADX INFO: renamed from: ܳ֫ */
    public String f48064;

    /* JADX INFO: renamed from: ܽ֫ */
    public String f48065;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f48066;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f48067;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f48068;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f48069;

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo12921() {
        return true;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ᩳ */
    public final String mo8545() {
        return "SFTP";
    }

    public C16358(int i) {
        super(i);
        this.f48063 = "";
        this.f48068 = 22;
        this.f48062 = "root";
        this.f48061 = "";
        this.f48066 = "";
        this.f48064 = "";
        this.f48069 = false;
        this.f48060 = C0233a.f1077D;
        this.f48067 = -1;
        this.f48065 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16358(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC5769.m12918(jSONObject, "rk", "3");
        AbstractC5769.m12918(jSONObject, "ip", "8");
        AbstractC5769.m12914(jSONObject, "hs", C0655am.f2320av);
        AbstractC5769.m12914(jSONObject, "mt", "b");
        this.f48063 = "";
        this.f48068 = 22;
        this.f48062 = "root";
        this.f48061 = "";
        this.f48066 = "";
        this.f48064 = "";
        this.f48069 = false;
        this.f48060 = C0233a.f1077D;
        this.f48067 = -1;
        this.f48065 = "";
        this.f48063 = jSONObject.getString("1");
        this.f48068 = jSONObject.getInt("2");
        this.f48062 = jSONObject.getString("4");
        this.f48061 = jSONObject.getString("5");
        this.f48066 = jSONObject.getString("6");
        this.f48064 = jSONObject.getString(C0655am.f2278aF, "");
        this.f48069 = jSONObject.getBoolean("7");
        this.f48060 = jSONObject.getString("9");
        if (jSONObject.contains("e")) {
            this.f48067 = jSONObject.getInt("e");
            this.f48065 = jSONObject.getString("f", "");
        }
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final String mo8538() {
        if (this.f48068 == 22) {
            return "sftp://" + this.f48062 + "@" + this.f48063;
        }
        return "sftp://" + this.f48062 + "@" + this.f48063 + ":" + this.f48068;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo8542() {
        JSONObject jSONObjectMo8542 = super.mo8542();
        jSONObjectMo8542.put("1", this.f48063);
        jSONObjectMo8542.put("2", this.f48068);
        jSONObjectMo8542.put("4", this.f48062);
        jSONObjectMo8542.put("5", this.f48061);
        jSONObjectMo8542.put("6", this.f48066);
        jSONObjectMo8542.put(C0655am.f2278aF, this.f48064);
        jSONObjectMo8542.put("7", this.f48069);
        jSONObjectMo8542.put("9", this.f48060);
        int i = this.f48067;
        if (i != -1) {
            jSONObjectMo8542.put("e", i);
            jSONObjectMo8542.put("f", this.f48065);
        }
        return jSONObjectMo8542;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C4547 m37165() {
        C4547 c4547M47490 = C21054.m47490(this.f48067, this.f48065);
        int i = this.f48067;
        int i2 = c4547M47490.f14161;
        if (i != i2) {
            this.f48067 = i2;
        }
        return c4547M47490;
    }

    @Override // p067l.AbstractC5769
    public final String getName() {
        return this.f14164;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܽ */
    public final String mo8543() {
        String str = "sftp://" + this.f48062 + "@" + this.f48063;
        return str.endsWith("/") ? C17073.m38720(1, 0, str) : str;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8541(AbstractC5769 abstractC5769) {
        super.mo8541(abstractC5769);
        if (abstractC5769 instanceof C16358) {
            C16358 c16358 = (C16358) abstractC5769;
            this.f48063 = c16358.f48063;
            this.f48068 = c16358.f48068;
            this.f48062 = c16358.f48062;
            this.f48061 = c16358.f48061;
            this.f48066 = c16358.f48066;
            this.f48064 = c16358.f48064;
            this.f48069 = c16358.f48069;
            this.f48060 = c16358.f48060;
            this.f48067 = c16358.f48067;
            this.f48065 = c16358.f48065;
        }
    }

    @Override // p067l.AbstractC5769
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16358.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C16358 c16358 = (C16358) obj;
        return this.f48068 == c16358.f48068 && this.f48069 == c16358.f48069 && C12826.equals(this.f48063, c16358.f48063) && C12826.equals(this.f48062, c16358.f48062) && C12826.equals(this.f48061, c16358.f48061) && C12826.equals(this.f48066, c16358.f48066) && C12826.equals(this.f48064, c16358.f48064) && C12826.equals(this.f48060, c16358.f48060) && Integer.valueOf(this.f48067).equals(Integer.valueOf(c16358.f48067)) && C12826.equals(this.f48065, c16358.f48065);
    }

    @Override // p067l.AbstractC5769
    public final int hashCode() {
        return C12826.hashCode(this.f48065) + ((C21720.m49003((C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003((C21720.m49003(super.hashCode() * 31, 31, this.f48063) + this.f48068) * 31, 31, this.f48062), 31, this.f48061), 31, this.f48066), 31, this.f48064) + (this.f48069 ? 1231 : 1237)) * 31, 31, this.f48060) + this.f48067) * 31);
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5375 mo8539(int i) {
        return new C20383(i, clone());
    }

    @Override // p067l.AbstractC5769
    public final C21265 getIcon() {
        return C21265.f66818;
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ܿ */
    public final String mo8544() {
        return C10965.m25286(new StringBuilder("sftp@"), this.f14164, " ");
    }

    @Override // p067l.AbstractC5769
    /* JADX INFO: renamed from: ֫ */
    public final void mo8540(AbstractActivityC5549 abstractActivityC5549) {
        m37162(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37164(AbstractActivityC5549 abstractActivityC5549) {
        m37162(abstractActivityC5549, new C16358(-1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37162(final AbstractActivityC5549 abstractActivityC5549, final C16358 c16358) {
        C4547 c4547M33134;
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C20641 c20641 = (C20641) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText8 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        EditText editText9 = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0992 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        C0990 c0993 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM12252.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.۫ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText10 = editText;
                final EditText editText11 = editText2;
                final EditText editText12 = editText8;
                C22395.m50286(abstractActivityC5549, new InterfaceC1489() { // from class: l.۟ۘ᩻
                    @Override // p067l.InterfaceC1489
                    public final void accept(Object obj) {
                        C8983 c8983 = (C8983) obj;
                        editText10.setText(c8983.m20753());
                        editText11.setText(String.valueOf(c8983.m20755()));
                        editText12.setText(c8983.m20754());
                    }
                });
            }
        });
        int i = c16358.f48067;
        if (i != -1) {
            c4547M33134 = C14486.m33134(i);
            if (c4547M33134 == null) {
                c4547M33134 = C14486.m33126(c16358.f48065);
            }
        } else {
            c4547M33134 = null;
        }
        c20641.m46660(c4547M33134);
        c20641.setPadding(c20641.getPaddingLeft(), c20641.getPaddingTop() + C13076.m29939(6.0f), c20641.getPaddingRight(), c20641.getPaddingBottom());
        View viewFindViewById = viewM12252.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM12252.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM12252.findViewById(R.id.textInputLayout4);
        C7110 c7110M16377 = C7110.m16377(abstractActivityC5549, (TextView) viewM12252.findViewById(R.id.MT_Protector), c16358);
        textView.setText(C7050.m16224(c16358.f14161 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SFTP"));
        editText.setText(c16358.f48063);
        editText2.setText(String.valueOf(c16358.f48068));
        editText3.setText(c16358.f48062);
        editText4.setText(c16358.f48061);
        editText5.setText(c16358.f48066);
        editText6.setText(c16358.f48064);
        c0991.setChecked(c16358.f14163);
        c0992.setChecked(c16358.f14154);
        c0993.setChecked(c16358.f14155);
        c0992.setOnCheckedChangeListener(new C4122(1));
        AbstractC5769.m12913(editText9, abstractActivityC5549);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۤۘ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                View view = viewFindViewById2;
                View view2 = viewFindViewById3;
                if (z) {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(0);
                }
            }
        };
        onCheckedChangeListener.onCheckedChanged(c0990, c16358.f48069);
        c0990.setChecked(c16358.f48069);
        c0990.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c16358.f14159);
        editText8.setText(c16358.f14164);
        editText9.setText(c16358.f48060);
        AbstractC5769.m12911(editText, editText8);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46736(R.string.MT_Protector, null);
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46722(false);
        final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
        C7204.m16545(dialogInterfaceC2564M46732);
        if (abstractActivityC5549 instanceof Main) {
            Main main = (Main) abstractActivityC5549;
            C7350 c7350M131 = main.m131();
            C8331 c8331M129 = main.m129();
            c7350M131.m4065((InterfaceC24784) dialogInterfaceC2564M46732);
            c7350M131.mo4067((Object) null);
            c7350M131.m4066(dialogInterfaceC2564M46732, new InterfaceC3326() { // from class: l.ۛۘ᩻
                @Override // p067l.InterfaceC3326
                /* JADX INFO: renamed from: ֫ */
                public final void mo4017(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C4289(abstractActivityC5549, str, editText5).m22250();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC12926(1, c8331M129));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C7050.m16226(editText);
        final C13265 c13265 = new C13265(editText, editText3, c0990, editText5, editText4, editText9, editText2, editText6, editText7, editText8, c20641, c0991, c0992, c0993, c7110M16377);
        dialogInterfaceC2564M46732.m3860().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16358.m37163(c13265, c16358, dialogInterfaceC2564M46732);
            }
        });
        dialogInterfaceC2564M46732.m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16358 c16359 = (C16358) c13265.get();
                if (c16359 == null) {
                    return;
                }
                AbstractActivityC5549 abstractActivityC55410 = abstractActivityC5549;
                if (C8381.m19540(abstractActivityC55410, c16359)) {
                    new C19041(abstractActivityC55410, c16359).m22250();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16358 m37161(EditText editText, EditText editText2, C0990 c0990, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, C20641 c20641, C0990 c0991, C0990 c0992, C0990 c0993, C7110 c7110) {
        int i;
        if (!AbstractC5769.m12919(editText) || !AbstractC5769.m12916(editText2, R.string.MT_Protector)) {
            return null;
        }
        if (c0990.isChecked()) {
            if (!AbstractC5769.m12916(editText3, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC5769.m12916(editText4, R.string.MT_Protector)) {
            return null;
        }
        if (!AbstractC5769.m12915(editText5)) {
            return null;
        }
        C16358 c16358 = new C16358(-1);
        c16358.f48063 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText6.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c16358.f48068 = i;
        c16358.f48062 = editText2.getText().toString();
        c16358.f48061 = editText4.getText().toString();
        c16358.f48066 = editText3.getText().toString();
        c16358.f48064 = editText7.getText().toString();
        if (c16358.f48066.length() > 20480) {
            c16358.f48066 = c16358.f48066.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c16358.f48069 = c0990.isChecked();
        c16358.f14159 = editText8.getText().toString();
        c16358.f14164 = AbstractC5769.m12910(editText9, c16358.f48063);
        c16358.f48060 = AbstractC5769.m12910(editText5, C0233a.f1077D);
        C4547 c4547M46659 = c20641.m46659();
        if (c4547M46659 != null) {
            c16358.f48067 = c4547M46659.f14161;
            c16358.f48065 = c4547M46659.mo8538();
        }
        c16358.f14163 = c0991.isChecked();
        c16358.f14154 = c0992.isChecked();
        c16358.f14155 = c0993.isChecked();
        c16358.m12922(c7110);
        return c16358;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37163(C13265 c13265, C16358 c16358, DialogInterfaceC2564 dialogInterfaceC2564) {
        C16358 c16359 = (C16358) c13265.get();
        if (c16359 == null) {
            return;
        }
        if (c16358.f14161 == -1) {
            C16358 c163510 = new C16358(AbstractC5769.m12920());
            c163510.mo8541(c16359);
            C14486.m33123(c163510);
        } else {
            c16358.mo8541(c16359);
            C14486.m33116();
        }
        dialogInterfaceC2564.dismiss();
    }
}
