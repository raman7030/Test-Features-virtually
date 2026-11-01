package p067l;

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
public final class C10102 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC22588 f28026;

    /* JADX INFO: renamed from: ֫ */
    public final C8761 m23575(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C24854 c24854;
        C18819 c18819;
        C13045.m29867(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C16551.m37521(sidecarDisplayFeature, this.f28026).mo23107("Type must be either TYPE_FOLD or TYPE_HINGE", C20832.f65460).mo23107("Feature bounds must not be 0", C2725.f4570).mo23107("TYPE_FOLD must have 0 area", C7420.f19405).mo23107("Feature be pinned to either left or top", C3396.f6719).mo23106();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c24854 = C24854.f79396;
        } else {
            if (type != 2) {
                return null;
            }
            c24854 = C24854.f79397;
        }
        int iM45616 = C20161.m45616(sidecarDeviceState);
        if (iM45616 == 0 || iM45616 == 1) {
            return null;
        }
        if (iM45616 != 2) {
            c18819 = C18819.f56198;
            if (iM45616 != 3 && iM45616 == 4) {
                return null;
            }
        } else {
            c18819 = C18819.f56199;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C13045.m29865(rect, "feature.rect");
        return new C8761(new C7164(rect), c24854, c18819);
    }

    public C10102(int i) {
        EnumC22588 enumC22588 = EnumC22588.QUIET;
        C13045.m29867(enumC22588, "verificationMode");
        this.f28026 = enumC22588;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18975 m23576(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C18975(C10893.f30179);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C20161.m45615(sidecarDeviceState2, C20161.m45616(sidecarDeviceState));
        return new C18975(m23574(C20161.m45614(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23572(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C13045.m29864(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        return m23573(C20161.m45614(sidecarWindowLayoutInfo), C20161.m45614(sidecarWindowLayoutInfo2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23573(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (m23571((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23571(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C13045.m29864(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C13045.m29864(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m23574(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8761 c8761M23575 = m23575((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c8761M23575 != null) {
                arrayList.add(c8761M23575);
            }
        }
        return arrayList;
    }
}
