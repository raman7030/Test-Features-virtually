package p067l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J55P */
/* JADX INFO: loaded from: classes.dex */
public final class C24743 extends AbstractC22062 {

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC23250 f78341 = new C18037();

    /* JADX INFO: renamed from: ᩶ */
    public final C22180 f78342;

    /* JADX INFO: renamed from: ᩸ */
    public final int f78343;

    /* JADX INFO: renamed from: ᩹ */
    public final C14645 f78344;

    public C24743(C14645 c14645, int i, C22180 c22180) {
        this.f78344 = c14645;
        this.f78343 = i;
        this.f78342 = c22180;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC23250 interfaceC23250;
        String type;
        C20168 c20168M13859 = this.f78344.m33504().m13859(this.f78343);
        int iM45627 = c20168M13859.m45627();
        C22180 c22180 = this.f78342;
        int iMo6075 = c22180.mo6075();
        InterfaceC23250[] interfaceC23250Arr = new InterfaceC23250[iMo6075];
        InterfaceC23250 interfaceC23251 = f78341;
        Arrays.fill(interfaceC23250Arr, interfaceC23251);
        C18155 c18155 = c22180.f70174;
        C2614 c2614 = new C2614(c18155.mo5852(), c18155.m41355(), new C16025(this, c20168M13859, c20168M13859.m45635()));
        int i = 0;
        if (!EnumC17248.STATIC.m39032(c18155.f54219)) {
            interfaceC23250Arr[0] = new C19379(this);
            i = 1;
        }
        while (c2614.hasNext()) {
            interfaceC23250Arr[i] = (InterfaceC23250) c2614.next();
            i++;
        }
        if (i < iMo6075) {
            int i2 = iMo6075 - 1;
            while (true) {
                i--;
                if (i <= -1 || ((type = (interfaceC23250 = interfaceC23250Arr[i]).getType()) != null && ((type.equals("J") || type.equals("D")) && (i2 = i2 - 1) == i))) {
                    break;
                }
                interfaceC23250Arr[i2] = interfaceC23250;
                interfaceC23250Arr[i] = interfaceC23251;
                i2--;
            }
        }
        int iM45631 = c20168M13859.m45631();
        c20168M13859.m45626();
        return new C18708(this, this.f78344, iM45631, iM45627, interfaceC23250Arr);
    }

    @Override // p067l.AbstractC22062
    /* JADX INFO: renamed from: ۧ */
    public final Iterator mo20070() {
        C20168 c20168M13859 = this.f78344.m33504().m13859(this.f78343);
        c20168M13859.m45621();
        return new C16025(this, c20168M13859, c20168M13859.m45635());
    }
}
