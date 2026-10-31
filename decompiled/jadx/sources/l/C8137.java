package l;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8137 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC21275 f25113;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6726 m21607(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C23659 c23659;
        C17309 c17309;
        C11233.m27805(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C14923.m35369(sidecarDisplayFeature, this.f25113).mo21142("Type must be either TYPE_FOLD or TYPE_HINGE", C19427.f62847).mo21142("Feature bounds must not be 0", C0375.f1791).mo21142("TYPE_FOLD must have 0 area", C5315.f16568).mo21142("Feature be pinned to either left or top", C1081.f3948).mo21141();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c23659 = C23659.f76650;
        } else {
            if (type != 2) {
                return null;
            }
            c23659 = C23659.f76651;
        }
        int iM43349 = C18721.m43349(sidecarDeviceState);
        if (iM43349 == 0 || iM43349 == 1) {
            return null;
        }
        if (iM43349 != 2) {
            c17309 = C17309.f53017;
            if (iM43349 != 3 && iM43349 == 4) {
                return null;
            }
        } else {
            c17309 = C17309.f53018;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C11233.m27803(rect, "feature.rect");
        return new C6726(new C5046(rect), c23659, c17309);
    }

    public C8137(int i) {
        EnumC21275 enumC21275 = EnumC21275.QUIET;
        C11233.m27805(enumC21275, "verificationMode");
        this.f25113 = enumC21275;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17473 m21608(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C17473(C8969.f27244);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C18721.m43348(sidecarDeviceState2, C18721.m43349(sidecarDeviceState));
        return new C17473(m21606(C18721.m43347(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21604(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C11233.m27802(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        return m21605(C18721.m43347(sidecarWindowLayoutInfo), C18721.m43347(sidecarWindowLayoutInfo2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21605(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (m21603((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21603(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C11233.m27802(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C11233.m27802(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m21606(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6726 c6726M21607 = m21607((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c6726M21607 != null) {
                arrayList.add(c6726M21607);
            }
        }
        return arrayList;
    }
}
