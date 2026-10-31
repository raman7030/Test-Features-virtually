package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19008 implements InterfaceC20419 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f59898;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f59901;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f59897 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C4191 f59896 = new C4191(new C5688());

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C4191 f59895 = new C4191(new C16014(6));

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C10045 f59900 = new C10045();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59899 = true;

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final synchronized InterfaceC1368[] mo18051(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr = f59897;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        int iM45749 = C19893.m45749((list == null || list.isEmpty()) ? null : (String) list.get(0));
        if (iM45749 != -1) {
            m43848(arrayList, iM45749);
        }
        int iM45748 = C19893.m45748(uri);
        if (iM45748 != -1 && iM45748 != iM45749) {
            m43848(arrayList, iM45748);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iM45749 && i2 != iM45748) {
                m43848(arrayList, i2);
            }
        }
        return (InterfaceC1368[]) arrayList.toArray(new InterfaceC1368[0]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43849() {
        this.f59901 = true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43850() {
        this.f59902 = 1;
    }

    @Override // l.InterfaceC20419
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18050(boolean z) {
        synchronized (this) {
            this.f59899 = z;
        }
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18049(C10045 c10045) {
        synchronized (this) {
            this.f59900 = c10045;
        }
        return this;
    }

    @Override // l.InterfaceC20419
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20419 mo18048() {
        synchronized (this) {
        }
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43848(ArrayList arrayList, int i) {
        switch (i) {
            case 0:
                arrayList.add(new C16289());
                break;
            case 1:
                arrayList.add(new C16995());
                break;
            case 2:
                arrayList.add(new C23345(this.f59901 ? 2 : 0));
                break;
            case 3:
                arrayList.add(new C22204(this.f59901 ? 2 : 0));
                break;
            case 4:
                InterfaceC1368 interfaceC1368M12640 = f59896.m12640(0);
                if (interfaceC1368M12640 != null) {
                    arrayList.add(interfaceC1368M12640);
                } else {
                    arrayList.add(new C17950());
                }
                break;
            case 5:
                arrayList.add(new C14421());
                break;
            case 6:
                arrayList.add(new C13920(this.f59900, this.f59899 ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C17058(this.f59901 ? 2 : 0));
                break;
            case 8:
                arrayList.add(new C12825(this.f59900, this.f59899 ? 0 : 32, null, AbstractC14545.of()));
                arrayList.add(new C13530(this.f59900, this.f59899 ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C3694());
                break;
            case 10:
                arrayList.add(new C16435());
                break;
            case 11:
                if (this.f59898 == null) {
                    this.f59898 = AbstractC14545.of();
                }
                arrayList.add(new C15729(1, !this.f59899 ? 1 : 0, this.f59900, new C9248(0L), new C20524(0, this.f59898)));
                break;
            case 12:
                arrayList.add(new C22080());
                break;
            case 14:
                arrayList.add(new C15832(this.f59902));
                break;
            case 15:
                InterfaceC1368 interfaceC1368M12641 = f59895.m12640(new Object[0]);
                if (interfaceC1368M12641 != null) {
                    arrayList.add(interfaceC1368M12641);
                }
                break;
            case 16:
                arrayList.add(new C13031(1 ^ (this.f59899 ? 1 : 0), this.f59900));
                break;
            case 17:
                arrayList.add(new C19923());
                break;
            case 18:
                arrayList.add(new C12202());
                break;
            case 19:
                arrayList.add(new C1722());
                break;
            case 20:
                arrayList.add(new C8778());
                break;
            case 21:
                arrayList.add(new C7387());
                break;
        }
    }
}
