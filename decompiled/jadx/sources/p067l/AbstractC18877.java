package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18877 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f56364;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f56365;

    /* JADX INFO: renamed from: ܽ */
    public AbstractDialogInterfaceOnClickListenerC4106 f56366;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7881();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7882(C19548 c19548, String str);

    /* JADX INFO: renamed from: ֫ */
    public boolean mo23311(String str) {
        return false;
    }

    public AbstractC18877(AbstractActivityC5549 abstractActivityC5549, boolean z) {
        this(abstractActivityC5549, z, "filter_record", "filter_match_case", "filter_regex", "filter_exactly_match");
    }

    public AbstractC18877(AbstractActivityC5549 abstractActivityC5549, boolean z, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f56365 = arrayList;
        this.f56364 = abstractActivityC5549;
        C1068 c1068 = new C1068(abstractActivityC5549);
        C1068 c1069 = new C1068(abstractActivityC5549);
        C1068 c10610 = new C1068(abstractActivityC5549);
        C18206 c18206 = new C18206(this, abstractActivityC5549, str, z ? R.string.MT_Protector : -1, c1069, c10610, c1068, abstractActivityC5549);
        c18206.m8250(R.string.MT_Protector);
        this.f56366 = c18206;
        c1069.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧ۬ܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f36134.f56366.m8253().m16516(z2);
            }
        });
        c1068.setText(R.string.MT_Protector);
        c1068.setTag(str2);
        c1068.setChecked(ApplicationC21448.f67649.getBoolean(str2, false));
        c1069.setText(R.string.MT_Protector);
        c1069.setTag(str3);
        c1069.setChecked(ApplicationC21448.f67649.getBoolean(str3, false));
        c10610.setText(R.string.MT_Protector);
        c10610.setTag(str4);
        c10610.setChecked(ApplicationC21448.f67649.getBoolean(str4, false));
        c18206.m8251(c1068);
        c18206.m8251(c1069);
        c18206.m8251(c10610);
        arrayList.add(c1068);
        arrayList.add(c1069);
        arrayList.add(c10610);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42956(C0997 c0997) {
        this.f56366.m8252(c0997, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42955(int i, boolean z) {
        C1068 c1068 = new C1068(this.f56364);
        c1068.setText(i);
        c1068.setChecked(z);
        this.f56365.add(c1068);
        this.f56366.m8252(c1068, 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42958() {
        this.f56366.m8258();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42957(int i) {
        int i2;
        ArrayList arrayList = this.f56365;
        if (i >= 0 && (i2 = i + 3) < arrayList.size()) {
            return ((C1068) arrayList.get(i2)).isChecked();
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Index: ", ", Size: ");
        sbM34408.append(arrayList.size() - 3);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }
}
