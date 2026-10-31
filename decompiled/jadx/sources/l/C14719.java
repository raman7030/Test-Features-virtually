package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* JADX INFO: renamed from: l.ܳᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AFL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14719 extends AbstractC3577 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f44947;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f44948;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public String f44949;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f44950;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f44951;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f44952;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f44953;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f44954;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f44955;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f44956;

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo10944() {
        return true;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        return "SFTP";
    }

    public C14719(int i) {
        super(i);
        this.f44950 = "";
        this.f44955 = 22;
        this.f44949 = "root";
        this.f44948 = "";
        this.f44953 = "";
        this.f44951 = "";
        this.f44956 = false;
        this.f44947 = a.D;
        this.f44954 = -1;
        this.f44952 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14719(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "3");
        AbstractC3577.m10941(jSONObject, "ip", "8");
        AbstractC3577.m10937(jSONObject, "hs", am.av);
        AbstractC3577.m10937(jSONObject, "mt", "b");
        this.f44950 = "";
        this.f44955 = 22;
        this.f44949 = "root";
        this.f44948 = "";
        this.f44953 = "";
        this.f44951 = "";
        this.f44956 = false;
        this.f44947 = a.D;
        this.f44954 = -1;
        this.f44952 = "";
        this.f44950 = jSONObject.getString("1");
        this.f44955 = jSONObject.getInt("2");
        this.f44949 = jSONObject.getString("4");
        this.f44948 = jSONObject.getString("5");
        this.f44953 = jSONObject.getString("6");
        this.f44951 = jSONObject.getString(am.aF, "");
        this.f44956 = jSONObject.getBoolean("7");
        this.f44947 = jSONObject.getString("9");
        if (jSONObject.contains("e")) {
            this.f44954 = jSONObject.getInt("e");
            this.f44952 = jSONObject.getString("f", "");
        }
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        if (this.f44955 == 22) {
            return "sftp://" + this.f44949 + "@" + this.f44950;
        }
        return "sftp://" + this.f44949 + "@" + this.f44950 + ":" + this.f44955;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("1", this.f44950);
        jSONObjectMo6369.put("2", this.f44955);
        jSONObjectMo6369.put("4", this.f44949);
        jSONObjectMo6369.put("5", this.f44948);
        jSONObjectMo6369.put("6", this.f44953);
        jSONObjectMo6369.put(am.aF, this.f44951);
        jSONObjectMo6369.put("7", this.f44956);
        jSONObjectMo6369.put("9", this.f44947);
        int i = this.f44954;
        if (i != -1) {
            jSONObjectMo6369.put("e", i);
            jSONObjectMo6369.put("f", this.f44952);
        }
        return jSONObjectMo6369;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2292 m35018() {
        C2292 c2292M45193 = C19660.m45193(this.f44954, this.f44952);
        int i = this.f44954;
        int i2 = c2292M45193.f11356;
        if (i != i2) {
            this.f44954 = i2;
        }
        return c2292M45193;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        String str = "sftp://" + this.f44949 + "@" + this.f44950;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C14719) {
            C14719 c14719 = (C14719) abstractC3577;
            this.f44950 = c14719.f44950;
            this.f44955 = c14719.f44955;
            this.f44949 = c14719.f44949;
            this.f44948 = c14719.f44948;
            this.f44953 = c14719.f44953;
            this.f44951 = c14719.f44951;
            this.f44956 = c14719.f44956;
            this.f44947 = c14719.f44947;
            this.f44954 = c14719.f44954;
            this.f44952 = c14719.f44952;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14719.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14719 c14719 = (C14719) obj;
        return this.f44955 == c14719.f44955 && this.f44956 == c14719.f44956 && C11003.equals(this.f44950, c14719.f44950) && C11003.equals(this.f44949, c14719.f44949) && C11003.equals(this.f44948, c14719.f44948) && C11003.equals(this.f44953, c14719.f44953) && C11003.equals(this.f44951, c14719.f44951) && C11003.equals(this.f44947, c14719.f44947) && Integer.valueOf(this.f44954).equals(Integer.valueOf(c14719.f44954)) && C11003.equals(this.f44952, c14719.f44952);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C11003.hashCode(this.f44952) + ((C20361.m46680((C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f44950) + this.f44955) * 31, 31, this.f44949), 31, this.f44948), 31, this.f44953), 31, this.f44951) + (this.f44956 ? 1231 : 1237)) * 31, 31, this.f44947) + this.f44954) * 31);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C18954(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64182;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("sftp@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m35015(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35017(AbstractActivityC3346 abstractActivityC3346) {
        m35015(abstractActivityC3346, new C14719(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35015(final AbstractActivityC3346 abstractActivityC3346, final C14719 c14719) {
        C2292 c2292M31050;
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        C19226 c19226 = (C19226) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText8 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText9 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c29710 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c29711 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM10216.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.۫ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText10 = editText;
                final EditText editText11 = editText2;
                final EditText editText12 = editText8;
                C21071.m47956(abstractActivityC3346, new InterfaceC13041() { // from class: l.۟ۘ᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C6959 c6959 = (C6959) obj;
                        editText10.setText(c6959.m18799());
                        editText11.setText(String.valueOf(c6959.m18801()));
                        editText12.setText(c6959.m18800());
                    }
                });
            }
        });
        int i = c14719.f44954;
        if (i != -1) {
            c2292M31050 = C12749.m31050(i);
            if (c2292M31050 == null) {
                c2292M31050 = C12749.m31042(c14719.f44952);
            }
        } else {
            c2292M31050 = null;
        }
        c19226.m44366(c2292M31050);
        c19226.setPadding(c19226.getPaddingLeft(), c19226.getPaddingTop() + C11266.m27878(6.0f), c19226.getPaddingRight(), c19226.getPaddingBottom());
        View viewFindViewById = viewM10216.findViewById(R.id.button1);
        final View viewFindViewById2 = viewM10216.findViewById(R.id.MT_Protector);
        final View viewFindViewById3 = viewM10216.findViewById(R.id.textInputLayout4);
        C4988 c4988M14473 = C4988.m14473(abstractActivityC3346, (TextView) viewM10216.findViewById(R.id.MT_Protector), c14719);
        textView.setText(C4925.m14327(c14719.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SFTP"));
        editText.setText(c14719.f44950);
        editText2.setText(String.valueOf(c14719.f44955));
        editText3.setText(c14719.f44949);
        editText4.setText(c14719.f44948);
        editText5.setText(c14719.f44953);
        editText6.setText(c14719.f44951);
        c2979.setChecked(c14719.f11358);
        c29710.setChecked(c14719.f11349);
        c29711.setChecked(c14719.f11350);
        c29710.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10936(editText9, abstractActivityC3346);
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
        onCheckedChangeListener.onCheckedChanged(c2978, c14719.f44956);
        c2978.setChecked(c14719.f44956);
        c2978.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c14719.f11354);
        editText8.setText(c14719.f11359);
        editText9.setText(c14719.f44947);
        AbstractC3577.m10934(editText, editText8);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        if (abstractActivityC3346 instanceof Main) {
            Main main = (Main) abstractActivityC3346;
            C5242 c5242M133 = main.m133();
            C6273 c6273M131 = main.m131();
            c5242M133.m1667((InterfaceC23586) dialogInterfaceC0206M44438);
            c5242M133.mo1669((Object) null);
            c5242M133.m1668(dialogInterfaceC0206M44438, new InterfaceC1008() { // from class: l.ۛۘ᩻
                @Override // l.InterfaceC1008
                /* JADX INFO: renamed from: ֫ */
                public final void mo1617(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C2020(abstractActivityC3346, str, editText5).m20274();
                    }
                }
            });
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC11108(1, c6273M131));
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.0f);
        }
        C4925.m14329(editText);
        final C11465 c11465 = new C11465(editText, editText3, c2978, editText5, editText4, editText9, editText2, editText6, editText7, editText8, c19226, c2979, c29710, c29711, c4988M14473);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14719.m35016(c11465, c14719, dialogInterfaceC0206M44438);
            }
        });
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14719 c147110 = (C14719) c11465.get();
                if (c147110 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c147110)) {
                    new C17542(abstractActivityC3347, c147110).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14719 m35014(EditText editText, EditText editText2, C2978 c2978, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, C19226 c19226, C2978 c2979, C2978 c29710, C2978 c29711, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10939(editText2, R.string.MT_Protector)) {
            return null;
        }
        if (c2978.isChecked()) {
            if (!AbstractC3577.m10939(editText3, R.string.MT_Protector)) {
                return null;
            }
        } else if (!AbstractC3577.m10939(editText4, R.string.MT_Protector)) {
            return null;
        }
        if (!AbstractC3577.m10938(editText5)) {
            return null;
        }
        C14719 c14719 = new C14719(-1);
        c14719.f44950 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText6.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c14719.f44955 = i;
        c14719.f44949 = editText2.getText().toString();
        c14719.f44948 = editText4.getText().toString();
        c14719.f44953 = editText3.getText().toString();
        c14719.f44951 = editText7.getText().toString();
        if (c14719.f44953.length() > 20480) {
            c14719.f44953 = c14719.f44953.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c14719.f44956 = c2978.isChecked();
        c14719.f11354 = editText8.getText().toString();
        c14719.f11359 = AbstractC3577.m10933(editText9, c14719.f44950);
        c14719.f44947 = AbstractC3577.m10933(editText5, a.D);
        C2292 c2292M44365 = c19226.m44365();
        if (c2292M44365 != null) {
            c14719.f44954 = c2292M44365.f11356;
            c14719.f44952 = c2292M44365.mo6365();
        }
        c14719.f11358 = c2979.isChecked();
        c14719.f11349 = c29710.isChecked();
        c14719.f11350 = c29711.isChecked();
        c14719.m10945(c4988);
        return c14719;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35016(C11465 c11465, C14719 c14719, DialogInterfaceC0206 dialogInterfaceC0206) {
        C14719 c147110 = (C14719) c11465.get();
        if (c147110 == null) {
            return;
        }
        if (c14719.f11356 == -1) {
            C14719 c147111 = new C14719(AbstractC3577.m10943());
            c147111.mo6368(c147110);
            C12749.m31039(c147111);
        } else {
            c14719.mo6368(c147110);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
