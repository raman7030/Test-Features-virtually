package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.᩻֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: QA0A */
/* JADX INFO: loaded from: classes.dex */
public final class C23354 extends AbstractC3577 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f75030;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f75031;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f75032;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f75033;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f75034;

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ᩳ */
    public final String mo6372() {
        return "SMB";
    }

    public C23354(int i) {
        super(i);
        this.f75031 = "";
        this.f75034 = 445;
        this.f75030 = "";
        this.f75033 = "";
        this.f75032 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23354(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "7");
        AbstractC3577.m10941(jSONObject, "ip", "6");
        AbstractC3577.m10937(jSONObject, "hs", "8");
        AbstractC3577.m10937(jSONObject, "mt", "9");
        this.f75031 = "";
        this.f75034 = 445;
        this.f75030 = "";
        this.f75033 = "";
        this.f75032 = "";
        this.f75031 = jSONObject.getString("1");
        this.f75034 = jSONObject.getInt("2");
        this.f75030 = jSONObject.getString("3");
        this.f75033 = jSONObject.getString("4");
        this.f75032 = jSONObject.getString("5");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final String mo6365() {
        StringBuilder sb = new StringBuilder("smb://");
        sb.append(this.f75033);
        if (!TextUtils.isEmpty(this.f75030)) {
            sb.append(":");
            sb.append(this.f75030);
        }
        sb.append("@");
        sb.append(this.f75031);
        if (this.f75034 != 445) {
            sb.append(":");
            sb.append(this.f75034);
        }
        return sb.toString();
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject jSONObjectMo6369 = super.mo6369();
        jSONObjectMo6369.put("1", this.f75031);
        jSONObjectMo6369.put("2", this.f75034);
        jSONObjectMo6369.put("3", this.f75030);
        jSONObjectMo6369.put("4", this.f75033);
        jSONObjectMo6369.put("5", this.f75032);
        return jSONObjectMo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܽ */
    public final String mo6370() {
        String str = "smb://" + this.f75033 + "@" + this.f75031;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C23354) {
            C23354 c23354 = (C23354) abstractC3577;
            this.f75031 = c23354.f75031;
            this.f75034 = c23354.f75034;
            this.f75030 = c23354.f75030;
            this.f75033 = c23354.f75033;
            this.f75032 = c23354.f75032;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23354.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C23354 c23354 = (C23354) obj;
        return this.f75034 == c23354.f75034 && C11003.equals(this.f75031, c23354.f75031) && C11003.equals(this.f75030, c23354.f75030) && C11003.equals(this.f75033, c23354.f75033) && C11003.equals(this.f75032, c23354.f75032);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C11003.hashCode(this.f75032) + C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f75031) + this.f75034) * 31, 31, this.f75030), 31, this.f75033);
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C12771(i, clone());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18663 m51762(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            return C17456.m40825().mo6358();
        }
        if (!str2.equals("guest") || !TextUtils.isEmpty(str3)) {
            C18560 c18560 = new C18560(str, str2, str3, EnumC3743.USER);
            C17456 c17456M40825 = C17456.m40825();
            c17456M40825.getClass();
            return new C16750(c17456M40825, c18560);
        }
        return C17456.m40825().m6359();
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64202;
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("smb@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* JADX INFO: renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m51764(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51766(AbstractActivityC3346 abstractActivityC3346) {
        m51764(abstractActivityC3346, new C23354(-1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51764(final AbstractActivityC3346 abstractActivityC3346, C23354 c23354) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText3 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText4 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText5 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        EditText editText6 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText7 = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        ((TextInputLayout) viewM10216.findViewById(R.id.MT_Protector)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ۧ֡᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19122.m44145(abstractActivityC3346, new C17004(editText, editText2, editText7));
            }
        });
        C4988 c4988M14473 = C4988.m14473(abstractActivityC3346, (TextView) viewM10216.findViewById(R.id.MT_Protector), c23354);
        textView.setText(C4925.m14327(c23354.f11356 == -1 ? R.string.MT_Protector : R.string.MT_Protector).concat(" SMB"));
        editText.setText(c23354.f75031);
        editText2.setText(String.valueOf(c23354.f75034));
        editText3.setText(c23354.f75030);
        editText4.setText(c23354.f75033);
        editText5.setText(c23354.f75032);
        editText6.setText(c23354.f11354);
        editText7.setText(c23354.f11359);
        c2978.setChecked(c23354.f11358);
        c2979.setChecked(c23354.f11349);
        c2979.setOnCheckedChangeListener(new C1845(1));
        int i = 2;
        AbstractC3577.m10935(editText, editText7, new C5901(i, editText3));
        AbstractC3577.m10935(editText3, editText7, new C4098(i, editText));
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44442(R.string.MT_Protector, null);
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44428(false);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
        C5088.m14637(dialogInterfaceC0206M44438);
        C4925.m14329(editText);
        final C16298 c16298 = new C16298(editText, editText2, editText3, editText4, editText5, editText6, editText7, c2978, c2979, c4988M14473);
        dialogInterfaceC0206M44438.m1447().setOnClickListener(new ViewOnClickListenerC12033(c16298, c23354, dialogInterfaceC0206M44438, 1));
        dialogInterfaceC0206M44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ֡᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23354 c23355 = (C23354) c16298.get();
                if (c23355 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC3347 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC3347, c23355)) {
                    new C14181(abstractActivityC3347, c23355, editText4).m20274();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23354 m51763(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, C2978 c2978, C2978 c2979, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText)) {
            return null;
        }
        C23354 c23354 = new C23354(-1);
        c23354.f75031 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText2.getText().toString());
        } catch (NumberFormatException unused) {
            i = 445;
        }
        c23354.f75034 = i;
        c23354.f75030 = editText3.getText().toString();
        c23354.f75033 = editText4.getText().toString();
        c23354.f75032 = editText5.getText().toString();
        c23354.f11354 = editText6.getText().toString();
        c23354.f11359 = AbstractC3577.m10933(editText7, TextUtils.isEmpty(c23354.f75030) ? c23354.f75031 : c23354.f75030);
        c23354.f11358 = c2978.isChecked();
        c23354.f11349 = c2979.isChecked();
        c23354.m10945(c4988);
        return c23354;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51765(C16298 c16298, C23354 c23354, DialogInterfaceC0206 dialogInterfaceC0206) {
        C23354 c23355 = (C23354) c16298.get();
        if (c23355 == null) {
            return;
        }
        if (c23354.f11356 == -1) {
            C23354 c23356 = new C23354(AbstractC3577.m10943());
            c23356.mo6368(c23355);
            C12749.m31039(c23356);
        } else {
            c23354.mo6368(c23355);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
