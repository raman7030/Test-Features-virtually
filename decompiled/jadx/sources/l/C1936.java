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

/* JADX INFO: renamed from: l.֫ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AGE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1936 extends AbstractC3577 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f6477;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f6478;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f6479;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f6480;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f6481;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f6482;

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo6372() {
        return "FTP";
    }

    public C1936(int i) {
        super(i);
        this.f6478 = "";
        this.f6481 = 21;
        this.f6479 = "anonymous";
        this.f6482 = "";
        this.f6477 = a.D;
        this.f6480 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1936(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "4");
        AbstractC3577.m10941(jSONObject, "ip", "7");
        AbstractC3577.m10937(jSONObject, "hs", am.av);
        AbstractC3577.m10937(jSONObject, "mt", "b");
        this.f6478 = "";
        this.f6481 = 21;
        this.f6479 = "anonymous";
        this.f6482 = "";
        this.f6477 = a.D;
        this.f6480 = true;
        this.f6478 = jSONObject.getString("2");
        this.f6481 = jSONObject.getInt("3");
        this.f6479 = jSONObject.getString("5");
        this.f6482 = jSONObject.getString("6");
        this.f6477 = jSONObject.getString("8");
        this.f6480 = jSONObject.getBoolean("9");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo6365() {
        if (this.f6481 == 21) {
            return "ftp://" + this.f6479 + "@" + this.f6478;
        }
        return "ftp://" + this.f6479 + "@" + this.f6478 + ":" + this.f6481;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("2", this.f6478);
        jSONObjectMo6369.put("3", this.f6481);
        jSONObjectMo6369.put("5", this.f6479);
        jSONObjectMo6369.put("6", this.f6482);
        jSONObjectMo6369.put("8", this.f6477);
        jSONObjectMo6369.put("9", this.f6480);
        return jSONObjectMo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo6370() {
        String str = "ftp://" + this.f6479 + "@" + this.f6478;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C1936) {
            C1936 c1936 = (C1936) abstractC3577;
            this.f6478 = c1936.f6478;
            this.f6481 = c1936.f6481;
            this.f6479 = c1936.f6479;
            this.f6482 = c1936.f6482;
            this.f6477 = c1936.f6477;
            this.f6480 = c1936.f6480;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1936.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C1936 c1936 = (C1936) obj;
        return this.f6481 == c1936.f6481 && this.f6480 == c1936.f6480 && C11003.equals(this.f6478, c1936.f6478) && C11003.equals(this.f6479, c1936.f6479) && C11003.equals(this.f6482, c1936.f6482) && C11003.equals(this.f6477, c1936.f6477);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f6478) + this.f6481) * 31, 31, this.f6479), 31, this.f6482), 31, this.f6477) + (this.f6480 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 mo6366(int i) {
        return new C4758(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64221;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("ftp@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m6362(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m6364(AbstractActivityC3346 abstractActivityC3346) {
        m6362(abstractActivityC3346, new C1936(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6362(final AbstractActivityC3346 abstractActivityC3346, final C1936 c1936) {
        View viewM10216;
        if (abstractActivityC3346.getResources().getBoolean(R.bool.MT_Protector)) {
            viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        } else {
            viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        }
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText7 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        final RadioButton radioButton2 = (RadioButton) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c29710 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C4988 c4988M14473 = C4988.m14473(abstractActivityC3346, (TextView) viewM10216.findViewById(R.id.MT_Protector), c1936);
        View view = viewM10216;
        textView.setText(C4925.m14327(c1936.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" FTP"));
        editText.setText(c1936.f6478);
        editText2.setText(String.valueOf(c1936.f6481));
        editText3.setText(c1936.f6479.equals("anonymous") ? "" : c1936.f6479);
        editText4.setText(c1936.f6482);
        editText5.setText(c1936.f11354);
        editText6.setText(c1936.f11359);
        editText7.setText(c1936.f6477);
        radioButton.setChecked(c1936.f6480);
        radioButton2.setChecked(!c1936.f6480);
        c2978.setChecked(c1936.f11358);
        c2979.setChecked(c1936.f11349);
        c29710.setChecked(c1936.f11350);
        c2979.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10936(editText7, abstractActivityC3346);
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
        AbstractC3577.m10934(editText, editText6);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(view);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        C4925.m14329(editText);
        final C5964 c5964 = new C5964(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, c2978, c2979, c29710, c4988M14473);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۨۡ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1936.m6363(c5964, c1936, dialogInterfaceC0206M44438);
            }
        });
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۡ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C1936 c1937 = (C1936) c5964.get();
                if (c1937 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c1937)) {
                    new C13724(abstractActivityC3347, c1937).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1936 m6361(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, C2978 c2978, C2978 c2979, C2978 c29710, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10938(editText2)) {
            return null;
        }
        C1936 c1936 = new C1936(-1);
        c1936.f6478 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c1936.f6481 = i;
        c1936.f6479 = AbstractC3577.m10933(editText4, "anonymous");
        c1936.f6482 = editText5.getText().toString();
        c1936.f11354 = editText6.getText().toString();
        c1936.f11359 = AbstractC3577.m10933(editText7, c1936.f6478);
        c1936.f6477 = AbstractC3577.m10933(editText2, a.D);
        c1936.f6480 = radioButton.isChecked();
        c1936.f11358 = c2978.isChecked();
        c1936.f11349 = c2979.isChecked();
        c1936.f11350 = c29710.isChecked();
        c1936.m10945(c4988);
        return c1936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6363(C5964 c5964, C1936 c1936, DialogInterfaceC0206 dialogInterfaceC0206) {
        C1936 c1937 = (C1936) c5964.get();
        if (c1937 == null) {
            return;
        }
        if (c1936.f11356 == -1) {
            C1936 c1938 = new C1936(AbstractC3577.m10943());
            c1938.mo6368(c1937);
            C12749.m31039(c1938);
        } else {
            c1936.mo6368(c1937);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
