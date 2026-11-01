package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19075 extends AbstractC16864 {

    /* JADX INFO: renamed from: ۜ */
    public int f56916;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ ActivityC22429 f56917;

    /* JADX INFO: renamed from: ᩻ */
    public C15568 f56918;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19075(ActivityC22429 activityC22429) {
        super(activityC22429);
        this.f56917 = activityC22429;
        m38418(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        m38415(3).setInputType(2);
        m38421(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43347(int i, C15568 c15568) {
        this.f56916 = i;
        this.f56918 = c15568;
        m38415(0).setText(EnumC9242.m21292(c15568.f44484));
        EditText editTextM38415 = m38415(1);
        C23324 c23324 = c15568.f44483;
        editTextM38415.setText(c23324.f73398.m30317());
        m38415(2).setText(c23324.f73397.m33398());
        C6322 c6322 = c15568.f44485;
        if (c6322 != null) {
            m38415(3).setText(String.valueOf(c6322.f16385));
        } else {
            m38420(3).setVisibility(8);
        }
        m38423();
        m38419().setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m43348() {
        this.f56916 = -1;
        this.f56918 = null;
        m38415(0).setText("public");
        m38415(1).setText("newMethod");
        m38415(2).setText("()V");
        m38415(3).setText("0");
        m38423();
        m38419().setText(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        int value;
        String[] strArrSplit;
        int value2;
        String[] strArrSplit2;
        int i = this.f56916;
        ActivityC22429 activityC22429 = this.f56917;
        if (i == -1) {
            String strTrim = m38415(0).getText().toString().trim();
            try {
                if (strTrim.equals("") || (strArrSplit = ActivityC22429.f70769.split(strTrim)) == null) {
                    value = 0;
                } else {
                    value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC9242.m21287(str).getValue();
                    }
                }
                String[] strArrSplit3 = ActivityC22429.f70768.split(m38415(2).getText().toString());
                if (strArrSplit3[strArrSplit3.length - 1].equals("")) {
                    C22682.m50795((CharSequence) "No Return Type Exception");
                    return false;
                }
                C23324 c23324M51947 = C23324.m51947(activityC22429.f70775.f60057, activityC22429.f70775.f60051.m29923(), C14606.m33395(activityC22429.f70775.f60057, C23994.m53164(strArrSplit3[strArrSplit3.length - 1], activityC22429.f70775.f60057), C14381.m32983(strArrSplit3[strArrSplit3.length - 2], activityC22429.f70775.f60057)), C13266.m30314(m38415(1).getText().toString(), activityC22429.f70775.f60057));
                int i2 = Integer.parseInt(m38415(3).getText().toString().trim());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C11056(EnumC25097.f80112));
                activityC22429.f70775.f60051.m29924().m22221(new C15568(c23324M51947, value, ((activityC22429.f70775.f60051.f36738 & EnumC9242.INTERFACE.getValue()) == 0 && (EnumC9242.ABSTRACT.getValue() & value) == 0) ? C6322.m14453(activityC22429.f70775.f60057, i2, arrayList) : null));
                activityC22429.m50393();
            } catch (Exception unused) {
                C22682.m50793(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean zM35419 = this.f56918.m35419();
            String strTrim2 = m38415(0).getText().toString().trim();
            if (zM35419) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC2483.f3919, " ").trim();
            }
            try {
                if (strTrim2.equals("") || (strArrSplit2 = ActivityC22429.f70769.split(strTrim2)) == null) {
                    value2 = 0;
                } else {
                    value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC9242.m21287(str2).getValue();
                    }
                }
                String[] strArrSplit4 = ActivityC22429.f70768.split(m38415(2).getText().toString());
                if (strArrSplit4[strArrSplit4.length - 1].equals("")) {
                    C22682.m50795((CharSequence) "No Return Type Exception");
                    return false;
                }
                try {
                    this.f56918 = new C15568(C23324.m51947(activityC22429.f70775.f60057, activityC22429.f70775.f60051.m29923(), C14606.m33395(activityC22429.f70775.f60057, C23994.m53164(strArrSplit4[strArrSplit4.length - 1], activityC22429.f70775.f60057), C14381.m32983(strArrSplit4[strArrSplit4.length - 2], activityC22429.f70775.f60057)), C13266.m30314(m38415(1).getText().toString(), activityC22429.f70775.f60057)), value2, this.f56918.f44485);
                    if (zM35419) {
                        activityC22429.f70775.f60051.m29924().m22217(this.f56916, this.f56918);
                        activityC22429.f70775.f60069.set(this.f56916, this.f56918);
                    } else {
                        activityC22429.f70775.f60051.m29924().m22224(this.f56916, this.f56918);
                        activityC22429.f70775.f60067.set(this.f56916, this.f56918);
                    }
                    try {
                        C6322 c6322 = this.f56918.f44485;
                        if (c6322 != null) {
                            c6322.f16385 = Integer.parseInt(m38415(3).getText().toString().trim());
                        }
                        ActivityC22429.f70770 = true;
                    } catch (Exception unused2) {
                        C22682.m50795((CharSequence) "Register Count Error");
                        return false;
                    }
                } catch (Exception unused3) {
                    C22682.m50795((CharSequence) "Method Name Or Descriptor Error");
                }
            } catch (Exception unused4) {
                C22682.m50793(R.string.MT_Protector);
            }
        }
        activityC22429.f70774.notifyDataSetChanged();
        return true;
    }
}
