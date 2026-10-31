package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16872 extends AbstractC15252 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f51771;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f51772;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51773;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f51774;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f51775;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51776;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51777;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16872(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f51774 = activityC21107;
        HashSet hashSet = new HashSet();
        this.f51771 = hashSet;
        this.f51778 = false;
        this.f51776 = false;
        this.f51772 = true;
        this.f51777 = true;
        m36257(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        hashSet.add("Ljava/lang/String;");
        hashSet.add("C");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("I");
        hashSet.add("S");
        hashSet.add("J");
        hashSet.add("D");
        hashSet.add("F");
        m36260(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39671(int i, C23062 c23062) {
        if (this.f51777) {
            this.f51777 = false;
            m36254(0).addTextChangedListener(new C2056(this));
            m36254(2).addTextChangedListener(new C11229(this));
        }
        this.f51775 = i;
        boolean zM51223 = c23062.m51223();
        C18522 c18522 = c23062.f74187;
        this.f51773 = zM51223;
        m36254(0).setText(EnumC7233.m19340(c23062.f74186));
        m36254(1).setText(c18522.f57398.m28273());
        m36254(2).setText(c18522.f57397.m50835());
        String strValueOf = null;
        if (this.f51773 && c23062.m51222()) {
            AbstractC16404[] abstractC16404Arr = this.f51774.f68093.f56834.m27861().m32314().f19421;
            AbstractC16404 abstractC16404 = i < abstractC16404Arr.length ? abstractC16404Arr[i] : null;
            if (abstractC16404 == null) {
                m36259(3).setVisibility(8);
            } else {
                EditText editTextM36254 = m36254(3);
                switch (C15523.f47453[abstractC16404.mo5435().ordinal()]) {
                    case 1:
                        strValueOf = !((C23209) abstractC16404).f74592 ? "false" : "true";
                        break;
                    case 2:
                        strValueOf = String.valueOf((int) ((C14036) abstractC16404).f42436);
                        break;
                    case 3:
                        strValueOf = String.valueOf(((C7687) abstractC16404).f23735);
                        break;
                    case 4:
                        strValueOf = String.valueOf(((C1588) abstractC16404).f5627);
                        break;
                    case 5:
                        strValueOf = String.valueOf(((C14287) abstractC16404).f43066);
                        break;
                    case 6:
                        strValueOf = String.valueOf(((C23460) abstractC16404).f75291);
                        break;
                    case 7:
                        strValueOf = String.valueOf(((C6527) abstractC16404).f20170);
                        break;
                    case 8:
                        strValueOf = String.valueOf((int) ((C8644) abstractC16404).f26391);
                        break;
                    case 9:
                        strValueOf = ((C15698) abstractC16404).f48387.m28273();
                        break;
                }
                editTextM36254.setText(strValueOf);
                m36259(3).setVisibility(0);
            }
        } else {
            m36254(3).setText((CharSequence) null);
            m36259(3).setVisibility(8);
        }
        m36262();
        m36258().setText(R.string.MT_Protector);
    }

    @Override // l.AbstractC15252
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4060() {
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = this.f51775;
        int i2 = 0;
        ActivityC21107 activityC21107 = this.f51774;
        if (i == -1) {
            String strTrim = m36254(0).getText().toString().trim();
            try {
                if (!strTrim.equals("") && (strArrSplit = ActivityC21107.f68087.split(strTrim)) != null) {
                    int value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC7233.m19338(str).getValue();
                    }
                    i2 = value;
                }
                activityC21107.f68093.f56834.m27863().m20246(new C23062(C18522.m43041(activityC21107.f68093.f56840, activityC21107.f68093.f56834.m27862(), C22755.m50831(m36254(2).getText().toString().trim(), activityC21107.f68093.f56840), C11467.m28270(m36254(1).getText().toString(), activityC21107.f68093.f56840)), i2));
                ActivityC21107.f68088 = true;
                activityC21107.m48069();
            } catch (Exception unused) {
                C21374.m48457(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean z = this.f51773;
            String strTrim2 = m36254(0).getText().toString().trim();
            if (z) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC0121.f1143, " ").trim();
            }
            try {
                if (!strTrim2.equals("") && (strArrSplit2 = ActivityC21107.f68087.split(strTrim2)) != null) {
                    int value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC7233.m19338(str2).getValue();
                    }
                    i2 = value2;
                }
                C23062 c23062 = new C23062(C18522.m43041(activityC21107.f68093.f56840, activityC21107.f68093.f56834.m27862(), C22755.m50831(m36254(2).getText().toString().trim(), activityC21107.f68093.f56840), C11467.m28270(m36254(1).getText().toString(), activityC21107.f68093.f56840)), i2);
                if (z) {
                    activityC21107.f68093.f56834.m27863().m20243(this.f51775, c23062, m36254(3).getText().toString());
                    activityC21107.f68093.f56836.set(this.f51775, c23062);
                } else {
                    activityC21107.f68093.f56834.m27863().m20242(this.f51775, c23062);
                    activityC21107.f68093.f56835.set(this.f51775, c23062);
                }
                ActivityC21107.f68088 = true;
            } catch (Exception unused2) {
                C21374.m48457(R.string.MT_Protector);
                return false;
            }
        }
        activityC21107.f68092.notifyDataSetChanged();
        return true;
    }
}
