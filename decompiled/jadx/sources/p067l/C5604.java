package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5604 implements Comparator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f13576;

    public /* synthetic */ C5604(int i) {
        this.f13576 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13576) {
            case 0:
                return ((InterfaceC9116) obj).mo20692().compareTo(((InterfaceC9116) obj2).mo20692());
            case 1:
                return ((AbstractC17043) obj).m38675().compareToIgnoreCase(((AbstractC17043) obj2).m38675());
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str.equalsIgnoreCase(str2)) {
                    return 0;
                }
                if (str.equalsIgnoreCase("type-info")) {
                    return -1;
                }
                if (str2.equalsIgnoreCase("type-info")) {
                    return 1;
                }
                return str.compareToIgnoreCase(str2);
        }
    }
}
