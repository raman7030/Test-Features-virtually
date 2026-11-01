package p067l;

import android.widget.EditText;
import bin.p000mt.plus.R;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܽ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18404 extends AbstractC16864 {

    /* JADX INFO: renamed from: ۖ */
    public HashSet f54950;

    /* JADX INFO: renamed from: ۘ */
    public boolean f54951;

    /* JADX INFO: renamed from: ۜ */
    public boolean f54952;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ActivityC22429 f54953;

    /* JADX INFO: renamed from: ۢ */
    public int f54954;

    /* JADX INFO: renamed from: ܺ */
    public boolean f54955;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f54956;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f54957;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18404(ActivityC22429 activityC22429) {
        super(activityC22429);
        this.f54953 = activityC22429;
        HashSet hashSet = new HashSet();
        this.f54950 = hashSet;
        this.f54957 = false;
        this.f54955 = false;
        this.f54951 = true;
        this.f54956 = true;
        m38418(R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector, R.string.MT_Protector);
        hashSet.add("Ljava/lang/String;");
        hashSet.add("C");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("I");
        hashSet.add("S");
        hashSet.add("J");
        hashSet.add("D");
        hashSet.add("F");
        m38421(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41907(int i, C24286 c24286) {
        if (this.f54956) {
            this.f54956 = false;
            m38415(0).addTextChangedListener(new C4323(this));
            m38415(2).addTextChangedListener(new C13041(this));
        }
        this.f54954 = i;
        boolean zM53616 = c24286.m53616();
        C19971 c19971 = c24286.f76932;
        this.f54952 = zM53616;
        m38415(0).setText(EnumC9242.m21289(c24286.f76931));
        m38415(1).setText(c19971.f60619.m30317());
        m38415(2).setText(c19971.f60618.m53168());
        String strValueOf = null;
        if (this.f54952 && c24286.m53615()) {
            AbstractC17958[] abstractC17958Arr = this.f54953.f70775.f60051.m29922().m34414().f22284;
            AbstractC17958 abstractC17958 = i < abstractC17958Arr.length ? abstractC17958Arr[i] : null;
            if (abstractC17958 == null) {
                m38420(3).setVisibility(8);
            } else {
                EditText editTextM38415 = m38415(3);
                switch (C17122.f50585[abstractC17958.mo7664().ordinal()]) {
                    case 1:
                        strValueOf = !((C24426) abstractC17958).f77335 ? "false" : "true";
                        break;
                    case 2:
                        strValueOf = String.valueOf((int) ((C15708) abstractC17958).f45519);
                        break;
                    case 3:
                        strValueOf = String.valueOf(((C9674) abstractC17958).f26648);
                        break;
                    case 4:
                        strValueOf = String.valueOf(((C3877) abstractC17958).f8406);
                        break;
                    case 5:
                        strValueOf = String.valueOf(((C15946) abstractC17958).f46158);
                        break;
                    case 6:
                        strValueOf = String.valueOf(((C24664) abstractC17958).f78038);
                        break;
                    case 7:
                        strValueOf = String.valueOf(((C8571) abstractC17958).f23048);
                        break;
                    case 8:
                        strValueOf = String.valueOf((int) ((C10583) abstractC17958).f29309);
                        break;
                    case 9:
                        strValueOf = ((C17287) abstractC17958).f51525.m30317();
                        break;
                }
                editTextM38415.setText(strValueOf);
                m38420(3).setVisibility(0);
            }
        } else {
            m38415(3).setText((CharSequence) null);
            m38420(3).setVisibility(8);
        }
        m38423();
        m38419().setText(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC16864
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6304() {
        String[] strArrSplit;
        String[] strArrSplit2;
        int i = this.f54954;
        int i2 = 0;
        ActivityC22429 activityC22429 = this.f54953;
        if (i == -1) {
            String strTrim = m38415(0).getText().toString().trim();
            try {
                if (!strTrim.equals("") && (strArrSplit = ActivityC22429.f70769.split(strTrim)) != null) {
                    int value = 0;
                    for (String str : strArrSplit) {
                        value |= EnumC9242.m21287(str).getValue();
                    }
                    i2 = value;
                }
                activityC22429.f70775.f60051.m29924().m22222(new C24286(C19971.m45319(activityC22429.f70775.f60057, activityC22429.f70775.f60051.m29923(), C23994.m53164(m38415(2).getText().toString().trim(), activityC22429.f70775.f60057), C13266.m30314(m38415(1).getText().toString(), activityC22429.f70775.f60057)), i2));
                ActivityC22429.f70770 = true;
                activityC22429.m50399();
            } catch (Exception unused) {
                C22682.m50793(R.string.MT_Protector);
                return false;
            }
        } else {
            boolean z = this.f54952;
            String strTrim2 = m38415(0).getText().toString().trim();
            if (z) {
                if (!strTrim2.contains("static")) {
                    strTrim2 = "static ".concat(strTrim2);
                }
            } else if (strTrim2.contains("static")) {
                strTrim2 = strTrim2.replace("static", "").replace(EnumC2483.f3919, " ").trim();
            }
            try {
                if (!strTrim2.equals("") && (strArrSplit2 = ActivityC22429.f70769.split(strTrim2)) != null) {
                    int value2 = 0;
                    for (String str2 : strArrSplit2) {
                        value2 |= EnumC9242.m21287(str2).getValue();
                    }
                    i2 = value2;
                }
                C24286 c24286 = new C24286(C19971.m45319(activityC22429.f70775.f60057, activityC22429.f70775.f60051.m29923(), C23994.m53164(m38415(2).getText().toString().trim(), activityC22429.f70775.f60057), C13266.m30314(m38415(1).getText().toString(), activityC22429.f70775.f60057)), i2);
                if (z) {
                    activityC22429.f70775.f60051.m29924().m22219(this.f54954, c24286, m38415(3).getText().toString());
                    activityC22429.f70775.f60053.set(this.f54954, c24286);
                } else {
                    activityC22429.f70775.f60051.m29924().m22218(this.f54954, c24286);
                    activityC22429.f70775.f60052.set(this.f54954, c24286);
                }
                ActivityC22429.f70770 = true;
            } catch (Exception unused2) {
                C22682.m50793(R.string.MT_Protector);
                return false;
            }
        }
        activityC22429.f70774.notifyDataSetChanged();
        return true;
    }
}
