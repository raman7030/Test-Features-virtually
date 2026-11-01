package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C19190 {
    /* JADX INFO: renamed from: ֫ */
    public final C10196 m43679(C17571 c17571) {
        String strM42479 = C18658.m42479(c17571, MotionUtils.EASING_TYPE_PATH);
        boolean z = false;
        if (strM42479 == null || strM42479.isEmpty()) {
            return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        String strM41972 = AbstractC18422.m41972(strM42479);
        ArrayList arrayListMo9708 = C4744.f10749.mo9708(strM41972, C18825.m42882());
        if (arrayListMo9708.isEmpty() && !C18524.m42109(strM41972, new String[0]).mo25094()) {
            return C5109.m10885(EnumC3490.NOT_FOUND, C7050.m16203(R.string.MT_Protector, new Object[0]));
        }
        if (!C18825.m42880()) {
            C7480.removeIf(arrayListMo9708, new C17848());
        }
        C11005 c11005M40244 = C17709.m40244(strM41972);
        if (c11005M40244 == null) {
            String strM424710 = C18658.m42479(c17571, "sortMethod");
            String strM424711 = C18658.m42479(c17571, "sortReverse");
            if (strM424710 == null && strM424711 == null) {
                c11005M40244 = new C11005(0, false);
            } else {
                if (strM424710 == null) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "sortMethod"));
                }
                if (strM424711 == null) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "sortReverse"));
                }
                try {
                    int iM40245 = C17709.m40245(strM424710);
                    try {
                        if ("true".equals(strM424711)) {
                            z = true;
                        } else if (!"false".equals(strM424711)) {
                            throw C8461.m19686((RuntimeException) new IllegalArgumentException("invalid boolean"));
                        }
                        c11005M40244 = new C11005(iM40245, z);
                    } catch (RuntimeException unused) {
                        return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "sortReverse"));
                    }
                } catch (RuntimeException unused2) {
                    return C5109.m10885(EnumC3490.BAD_REQUEST, C7050.m16203(R.string.MT_Protector, "sortMethod"));
                }
            }
        }
        C9486.m22095(arrayListMo9708, c11005M40244.f30475, c11005M40244.f30476);
        ArrayList arrayList = new ArrayList(arrayListMo9708.size());
        Iterator it = arrayListMo9708.iterator();
        while (it.hasNext()) {
            arrayList.add(C22405.m50311((InterfaceC19370) it.next()));
        }
        HashMap map = new HashMap();
        map.put(MotionUtils.EASING_TYPE_PATH, strM41972);
        map.put("files", arrayList);
        return C5109.m10884(map);
    }
}
