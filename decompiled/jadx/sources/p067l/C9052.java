package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C9052 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f24558 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public final String f24559;

    public C9052(String str) {
        this.f24559 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20958(String... strArr) {
        for (String str : strArr) {
            Iterator it = this.f24558.iterator();
            while (it.hasNext()) {
                if (((C9052) it.next()).f24559.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m20959() {
        if (m20958("name")) {
            return this.f24558.size() == 1 || m20958("ExtendedData", "Point", "MultiGeometry", "Polygon");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20957() {
        for (C9052 c9052 : this.f24558) {
            String str = c9052.f24559;
            if (!str.equals("name") && !str.equals("unknown") && !str.equals("visibility") && !str.equals("GroundOverlay")) {
                if (str.equals("Placemark")) {
                    if (!c9052.m20959()) {
                        return false;
                    }
                } else if (!str.equals("Folder") || !c9052.m20957()) {
                    return false;
                }
            }
        }
        return true;
    }
}
