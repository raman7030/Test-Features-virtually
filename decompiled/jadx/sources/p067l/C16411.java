package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BGM */
/* JADX INFO: loaded from: classes5.dex */
public final class C16411 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final EnumC5960 f48232;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f48233;

    /* JADX WARN: Illegal instructions before constructor call */
    public C16411(EnumC5960 enumC5960, ArrayList arrayList) {
        int iM37293 = m37293(arrayList);
        AbstractC5289 abstractC5289 = (AbstractC5289) arrayList.get(0);
        super(iM37293, (abstractC5289.mo5704() * arrayList.size()) + m37293(arrayList));
        if (enumC5960 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f48233 = arrayList;
        this.f48232 = enumC5960;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37293(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC5289) arrayList.get(0)).m11434());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return this.f48232;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C16411.class.getName());
        sb.append(this.f48233);
        return sb.toString();
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        Iterator it = this.f48233.iterator();
        while (it.hasNext()) {
            ((AbstractC5289) it.next()).mo5192(c3948);
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        StringBuilder sbM34407 = C15033.m34407(100, "{");
        boolean z = true;
        for (AbstractC5289 abstractC5289 : this.f48233) {
            if (z) {
                z = false;
            } else {
                sbM34407.append(", ");
            }
            sbM34407.append(abstractC5289.mo5193());
        }
        sbM34407.append(C0249l.f1198d);
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ۡ */
    public final List m37294() {
        return this.f48233;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        ArrayList arrayList = this.f48233;
        int size = arrayList.size();
        if (c19705.m44765()) {
            c19705.m44760(0, m11433() + " " + mo5191().mo4819());
            c19705.m44760(4, "  size: ".concat(C16351.m37155(size)));
        }
        c19705.m44773(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC5289) it.next()).mo5703(c3948, c19705);
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        int iM11434 = m11434() + i;
        boolean z = true;
        int i2 = -1;
        int iM11435 = -1;
        for (AbstractC5289 abstractC5289 : this.f48233) {
            int iMo5704 = abstractC5289.mo5704();
            if (z) {
                iM11435 = abstractC5289.m11434();
                i2 = iMo5704;
                z = false;
            } else {
                if (iMo5704 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC5289.m11434() != iM11435) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM11434 = abstractC5289.m11430(c6630, iM11434) + iMo5704;
        }
    }
}
