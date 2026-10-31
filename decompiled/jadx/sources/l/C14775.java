package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5BGM */
/* JADX INFO: loaded from: classes5.dex */
public final class C14775 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC3779 f45118;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f45119;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14775(EnumC3779 enumC3779, ArrayList arrayList) {
        int iM35146 = m35146(arrayList);
        AbstractC3073 abstractC3073 = (AbstractC3073) arrayList.get(0);
        super(iM35146, (abstractC3073.mo3385() * arrayList.size()) + m35146(arrayList));
        if (enumC3779 == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f45119 = arrayList;
        this.f45118 = enumC3779;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35146(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC3073) arrayList.get(0)).m9392());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return this.f45118;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C14775.class.getName());
        sb.append(this.f45119);
        return sb.toString();
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        Iterator it = this.f45119.iterator();
        while (it.hasNext()) {
            ((AbstractC3073) it.next()).mo2863(c1662);
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        StringBuilder sbM32307 = C13325.m32307(100, "{");
        boolean z = true;
        for (AbstractC3073 abstractC3073 : this.f45119) {
            if (z) {
                z = false;
            } else {
                sbM32307.append(", ");
            }
            sbM32307.append(abstractC3073.mo2864());
        }
        sbM32307.append(l.d);
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m35147() {
        return this.f45119;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        ArrayList arrayList = this.f45119;
        int size = arrayList.size();
        if (c18241.m42506()) {
            c18241.m42501(0, m9391() + " " + mo2862().mo2463());
            c18241.m42501(4, "  size: ".concat(C14712.m35008(size)));
        }
        c18241.m42514(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3073) it.next()).mo3384(c1662, c18241);
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        int iM9392 = m9392() + i;
        boolean z = true;
        int i2 = -1;
        int iM9393 = -1;
        for (AbstractC3073 abstractC3073 : this.f45119) {
            int iMo3385 = abstractC3073.mo3385();
            if (z) {
                iM9393 = abstractC3073.m9392();
                i2 = iMo3385;
                z = false;
            } else {
                if (iMo3385 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC3073.m9392() != iM9393) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM9392 = abstractC3073.m9388(c4484, iM9392) + iMo3385;
        }
    }
}
