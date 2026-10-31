package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10056 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3454 f30232;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC14993 f30233;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f30235 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f30236 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f30234 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo1313(C10720 c10720, C12172 c12172);

    public AbstractC10056(C3454 c3454, EnumC14993 enumC14993) {
        this.f30232 = c3454;
        this.f30233 = enumC14993;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo14223(int i) {
        ArrayList arrayList = this.f30234;
        if (arrayList.size() > 0) {
            EnumC14993 enumC14993 = this.f30233;
            int i2 = enumC14993.f45741 - 1;
            int iM14658 = (i + i2) & (~i2);
            this.f30236 = iM14658;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC5116 abstractC5116 = (AbstractC5116) arrayList.get(i3);
                int i4 = enumC14993.f45741 - 1;
                iM14658 = abstractC5116.m14658((iM14658 + i4) & (~i4), i3);
            }
            return iM14658;
        }
        this.f30236 = 0;
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m25236() {
        return this.f30234;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5116 m25237(AbstractC5116 abstractC5116) {
        HashMap map = this.f30235;
        ArrayList<AbstractC5116> arrayList = this.f30234;
        if (map == null) {
            this.f30235 = new HashMap();
            for (AbstractC5116 abstractC5117 : arrayList) {
                this.f30235.put(abstractC5117, abstractC5117);
            }
        }
        AbstractC5116 abstractC5118 = (AbstractC5116) this.f30235.get(abstractC5116);
        if (abstractC5118 != null) {
            return abstractC5118;
        }
        this.f30235.put(abstractC5116, abstractC5116);
        arrayList.add(abstractC5116);
        return abstractC5116;
    }
}
