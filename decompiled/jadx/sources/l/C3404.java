package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 261X */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3404 implements Comparator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10769;

    public /* synthetic */ C3404(int i) {
        this.f10769 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10769) {
            case 0:
                return ((InterfaceC7099) obj).mo18742().compareTo(((InterfaceC7099) obj2).mo18742());
            case 1:
                return ((AbstractC15440) obj).m36517().compareToIgnoreCase(((AbstractC15440) obj2).m36517());
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
