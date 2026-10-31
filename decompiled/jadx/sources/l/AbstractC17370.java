package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5I2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17370 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f53181;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f53182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC1828 f53183;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5651();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5652(C18076 c18076, String str);

    /* JADX INFO: renamed from: ֫ */
    public boolean mo21345(String str) {
        return false;
    }

    public AbstractC17370(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        this(abstractActivityC3346, z, "filter_record", "filter_match_case", "filter_regex", "filter_exactly_match");
    }

    public AbstractC17370(AbstractActivityC3346 abstractActivityC3346, boolean z, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f53182 = arrayList;
        this.f53181 = abstractActivityC3346;
        C4554 c4554 = new C4554(abstractActivityC3346);
        C4554 c4555 = new C4554(abstractActivityC3346);
        C4554 c4556 = new C4554(abstractActivityC3346);
        C16664 c16664 = new C16664(this, abstractActivityC3346, str, z ? R.string.MT_Protector : -1, c4555, c4556, c4554, abstractActivityC3346);
        c16664.m6052(R.string.MT_Protector);
        this.f53183 = c16664;
        c4555.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۧ۬ܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.f33141.f53183.m6055().m14609(z2);
            }
        });
        c4554.setText(R.string.MT_Protector);
        c4554.setTag(str2);
        c4554.setChecked(ApplicationC20075.f65008.getBoolean(str2, false));
        c4555.setText(R.string.MT_Protector);
        c4555.setTag(str3);
        c4555.setChecked(ApplicationC20075.f65008.getBoolean(str3, false));
        c4556.setText(R.string.MT_Protector);
        c4556.setTag(str4);
        c4556.setChecked(ApplicationC20075.f65008.getBoolean(str4, false));
        c16664.m6053(c4554);
        c16664.m6053(c4555);
        c16664.m6053(c4556);
        arrayList.add(c4554);
        arrayList.add(c4555);
        arrayList.add(c4556);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40705(C3122 c3122) {
        this.f53183.m6054(c3122, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40704(int i, boolean z) {
        C4554 c4554 = new C4554(this.f53181);
        c4554.setText(i);
        c4554.setChecked(z);
        this.f53182.add(c4554);
        this.f53183.m6054(c4554, 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40707() {
        this.f53183.m6060();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40706(int i) {
        int i2;
        ArrayList arrayList = this.f53182;
        if (i >= 0 && (i2 = i + 3) < arrayList.size()) {
            return ((C4554) arrayList.get(i2)).isChecked();
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Index: ", ", Size: ");
        sbM32308.append(arrayList.size() - 3);
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }
}
