package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰ᩹ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14112 extends AbstractC15252 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f42591;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14112(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f42591 = activityC21107;
        m36260(R.string.MT_Protector);
        m36257(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33722() {
        EditText editTextM36254 = m36254(0);
        ActivityC21107 activityC21107 = this.f42591;
        editTextM36254.setText(EnumC7233.m19336(activityC21107.f68093.f56834.f33738));
        m36254(1).setText(activityC21107.f68093.f56834.f33744.m50835());
        m36254(2).setText(activityC21107.f68093.f56834.f33740 != null ? activityC21107.f68093.f56834.f33740.m32665(" ") : "");
        m36254(3).setText(activityC21107.f68093.f56834.f33739 != null ? activityC21107.f68093.f56834.f33739.m28273() : "");
        m36262();
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        int value;
        String[] strArrSplit;
        String[] strArrSplit2;
        ActivityC21107 activityC21107 = this.f42591;
        try {
            String string = m36254(0).getText().toString();
            if (string.equals("") || (strArrSplit2 = ActivityC21107.f68087.split(string)) == null) {
                value = 0;
            } else {
                value = 0;
                for (String str : strArrSplit2) {
                    value |= EnumC7233.m19338(str).getValue();
                }
            }
            activityC21107.f68093.f56834.f33738 = value;
            activityC21107.f68093.f56834.f33744 = C22755.m50831(m36254(1).getText().toString(), activityC21107.f68093.f56840);
            ArrayList arrayList = new ArrayList();
            String string2 = m36254(2).getText().toString();
            if (!string2.equals("") && (strArrSplit = ActivityC21107.f68087.split(string2)) != null) {
                for (String str2 : strArrSplit) {
                    if (!str2.equals("")) {
                        arrayList.add(C22755.m50831(str2, activityC21107.f68093.f56840));
                    }
                }
            }
            activityC21107.f68093.f56834.f33740 = arrayList.size() > 0 ? C13582.m32663(activityC21107.f68093.f56840, arrayList) : null;
            String strTrim = m36254(3).getText().toString().trim();
            if (!strTrim.equals("")) {
                activityC21107.f68093.f56834.f33739 = C11467.m28270(strTrim, activityC21107.f68093.f56840);
            } else {
                activityC21107.f68093.f56834.f33739 = null;
            }
            ActivityC21107.f68088 = true;
            C21374.m48457(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C21374.m48457(R.string.MT_Protector);
            return false;
        }
    }
}
