package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15781 extends AbstractC16864 {

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC22429 f45677;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15781(ActivityC22429 activityC22429) {
        super(activityC22429);
        this.f45677 = activityC22429;
        m38421(R.string.MT_Protector);
        m38418(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m35848() {
        EditText editTextM38415 = m38415(0);
        ActivityC22429 activityC22429 = this.f45677;
        editTextM38415.setText(EnumC9242.m21285(activityC22429.f70775.f60051.f36738));
        m38415(1).setText(activityC22429.f70775.f60051.f36744.m53168());
        m38415(2).setText(activityC22429.f70775.f60051.f36740 != null ? activityC22429.f70775.f60051.f36740.m34777(" ") : "");
        m38415(3).setText(activityC22429.f70775.f60051.f36739 != null ? activityC22429.f70775.f60051.f36739.m30317() : "");
        m38423();
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        int value;
        String[] strArrSplit;
        String[] strArrSplit2;
        ActivityC22429 activityC22429 = this.f45677;
        try {
            String string = m38415(0).getText().toString();
            if (string.equals("") || (strArrSplit2 = ActivityC22429.f70769.split(string)) == null) {
                value = 0;
            } else {
                value = 0;
                for (String str : strArrSplit2) {
                    value |= EnumC9242.m21287(str).getValue();
                }
            }
            activityC22429.f70775.f60051.f36738 = value;
            activityC22429.f70775.f60051.f36744 = C23994.m53164(m38415(1).getText().toString(), activityC22429.f70775.f60057);
            ArrayList arrayList = new ArrayList();
            String string2 = m38415(2).getText().toString();
            if (!string2.equals("") && (strArrSplit = ActivityC22429.f70769.split(string2)) != null) {
                for (String str2 : strArrSplit) {
                    if (!str2.equals("")) {
                        arrayList.add(C23994.m53164(str2, activityC22429.f70775.f60057));
                    }
                }
            }
            activityC22429.f70775.f60051.f36740 = arrayList.size() > 0 ? C15276.m34775(activityC22429.f70775.f60057, arrayList) : null;
            String strTrim = m38415(3).getText().toString().trim();
            if (!strTrim.equals("")) {
                activityC22429.f70775.f60051.f36739 = C13266.m30314(strTrim, activityC22429.f70775.f60057);
            } else {
                activityC22429.f70775.f60051.f36739 = null;
            }
            ActivityC22429.f70770 = true;
            C22682.m50793(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C22682.m50793(R.string.MT_Protector);
            return false;
        }
    }
}
