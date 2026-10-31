package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17578 extends AbstractC15252 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53726;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f53727;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13889 f53728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17578(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f53727 = activityC21107;
        m36257(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        m36254(3).setInputType(2);
        m36260(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41101(int i, C13889 c13889) {
        this.f53726 = i;
        this.f53728 = c13889;
        m36254(0).setText(EnumC7233.m19343(c13889.f41403));
        EditText editTextM36254 = m36254(1);
        C22050 c22050 = c13889.f41402;
        editTextM36254.setText(c22050.f70681.m28273());
        m36254(2).setText(c22050.f70680.m31312());
        C4160 c4160 = c13889.f41404;
        if (c4160 != null) {
            m36254(3).setText(String.valueOf(c4160.f13572));
        } else {
            m36259(3).setVisibility(8);
        }
        m36262();
        m36258().setText(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41102() {
        this.f53726 = -1;
        this.f53728 = null;
        m36254(0).setText("public");
        m36254(1).setText("newMethod");
        m36254(2).setText("()V");
        m36254(3).setText("0");
        m36262();
        m36258().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        int value;
        String[] strArrSplit;
        int value2;
        String[] strArrSplit2;
        int i = this.f53726;
        ActivityC21107 activityC21107 = this.f53727;
        if (i == -1) {
            String strTrim = m36254(0).getText().toString().trim();
            try {
                if (strTrim.equals("") || (strArrSplit = ActivityC21107.f68087.split(strTrim)) == null) {
                    value = 0;
                } else {
                    value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC7233.m19338(str).getValue();
                    }
                }
                String[] strArrSplit3 = ActivityC21107.f68086.split(m36254(2).getText().toString());
                if (strArrSplit3[strArrSplit3.length - 1].equals("")) {
                    C21374.m48459((CharSequence) "No Return Type Exception");
                    return false;
                }
                C22050 c22050M49611 = C22050.m49611(activityC21107.f68093.f56840, activityC21107.f68093.f56834.m27862(), C12877.m31309(activityC21107.f68093.f56840, C22755.m50831(strArrSplit3[strArrSplit3.length - 1], activityC21107.f68093.f56840), C12639.m30905(strArrSplit3[strArrSplit3.length - 2], activityC21107.f68093.f56840)), C11467.m28270(m36254(1).getText().toString(), activityC21107.f68093.f56840));
                int i2 = Integer.parseInt(m36254(3).getText().toString().trim());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C9141(EnumC23915.f77361));
                activityC21107.f68093.f56834.m27863().m20245(new C13889(c22050M49611, value, ((activityC21107.f68093.f56834.f33738 & EnumC7233.INTERFACE.getValue()) == 0 && (EnumC7233.ABSTRACT.getValue() & value) == 0) ? C4160.m12579(activityC21107.f68093.f56840, i2, arrayList) : null));
                activityC21107.m48063();
            } catch (Exception unused) {
                C21374.m48457(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean zM33300 = this.f53728.m33300();
            String strTrim2 = m36254(0).getText().toString().trim();
            if (zM33300) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC0121.f1143, " ").trim();
            }
            try {
                if (strTrim2.equals("") || (strArrSplit2 = ActivityC21107.f68087.split(strTrim2)) == null) {
                    value2 = 0;
                } else {
                    value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC7233.m19338(str2).getValue();
                    }
                }
                String[] strArrSplit4 = ActivityC21107.f68086.split(m36254(2).getText().toString());
                if (strArrSplit4[strArrSplit4.length - 1].equals("")) {
                    C21374.m48459((CharSequence) "No Return Type Exception");
                    return false;
                }
                try {
                    this.f53728 = new C13889(C22050.m49611(activityC21107.f68093.f56840, activityC21107.f68093.f56834.m27862(), C12877.m31309(activityC21107.f68093.f56840, C22755.m50831(strArrSplit4[strArrSplit4.length - 1], activityC21107.f68093.f56840), C12639.m30905(strArrSplit4[strArrSplit4.length - 2], activityC21107.f68093.f56840)), C11467.m28270(m36254(1).getText().toString(), activityC21107.f68093.f56840)), value2, this.f53728.f41404);
                    if (zM33300) {
                        activityC21107.f68093.f56834.m27863().m20241(this.f53726, this.f53728);
                        activityC21107.f68093.f56852.set(this.f53726, this.f53728);
                    } else {
                        activityC21107.f68093.f56834.m27863().m20248(this.f53726, this.f53728);
                        activityC21107.f68093.f56850.set(this.f53726, this.f53728);
                    }
                    try {
                        C4160 c4160 = this.f53728.f41404;
                        if (c4160 != null) {
                            c4160.f13572 = Integer.parseInt(m36254(3).getText().toString().trim());
                        }
                        ActivityC21107.f68088 = true;
                    } catch (Exception unused2) {
                        C21374.m48459((CharSequence) "Register Count Error");
                        return false;
                    }
                } catch (Exception unused3) {
                    C21374.m48459((CharSequence) "Method Name Or Descriptor Error");
                }
            } catch (Exception unused4) {
                C21374.m48457(R.string.MT_Protector);
            }
        }
        activityC21107.f68092.notifyDataSetChanged();
        return true;
    }
}
