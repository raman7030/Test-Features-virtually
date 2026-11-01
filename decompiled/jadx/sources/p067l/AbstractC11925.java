package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: V4OW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11925 {

    /* JADX INFO: renamed from: ֫ */
    public final C5651 f33190;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC16617 f33191;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f33193 = null;

    /* JADX INFO: renamed from: ᩳ */
    public int f33194 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f33192 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3721(C12556 c12556, C13936 c13936);

    public AbstractC11925(C5651 c5651, EnumC16617 enumC16617) {
        this.f33190 = c5651;
        this.f33191 = enumC16617;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo16104(int i) {
        ArrayList arrayList = this.f33192;
        if (arrayList.size() > 0) {
            EnumC16617 enumC16617 = this.f33191;
            int i2 = enumC16617.f48854 - 1;
            int iM16566 = (i + i2) & (~i2);
            this.f33194 = iM16566;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC7230 abstractC7230 = (AbstractC7230) arrayList.get(i3);
                int i4 = enumC16617.f48854 - 1;
                iM16566 = abstractC7230.m16566((iM16566 + i4) & (~i4), i3);
            }
            return iM16566;
        }
        this.f33194 = 0;
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m27253() {
        return this.f33192;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7230 m27254(AbstractC7230 abstractC7230) {
        HashMap map = this.f33193;
        ArrayList<AbstractC7230> arrayList = this.f33192;
        if (map == null) {
            this.f33193 = new HashMap();
            for (AbstractC7230 abstractC7231 : arrayList) {
                this.f33193.put(abstractC7231, abstractC7231);
            }
        }
        AbstractC7230 abstractC7232 = (AbstractC7230) this.f33193.get(abstractC7230);
        if (abstractC7232 != null) {
            return abstractC7232;
        }
        this.f33193.put(abstractC7230, abstractC7230);
        arrayList.add(abstractC7230);
        return abstractC7230;
    }
}
