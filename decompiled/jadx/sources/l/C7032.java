package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21677 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f21678;

    public C7032(String str) {
        this.f21678 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19001(String... strArr) {
        for (String str : strArr) {
            Iterator it = this.f21677.iterator();
            while (it.hasNext()) {
                if (((C7032) it.next()).f21678.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19002() {
        if (m19001("name")) {
            return this.f21677.size() == 1 || m19001("ExtendedData", "Point", "MultiGeometry", "Polygon");
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19000() {
        for (C7032 c7032 : this.f21677) {
            String str = c7032.f21678;
            if (!str.equals("name") && !str.equals("unknown") && !str.equals("visibility") && !str.equals("GroundOverlay")) {
                if (str.equals("Placemark")) {
                    if (!c7032.m19002()) {
                        return false;
                    }
                } else if (!str.equals("Folder") || !c7032.m19000()) {
                    return false;
                }
            }
        }
        return true;
    }
}
