package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C22405 {
    /* JADX INFO: renamed from: ֫ */
    public static HashMap m50311(InterfaceC19370 interfaceC19370) {
        String str;
        HashMap map = new HashMap();
        map.put("name", interfaceC19370.getName());
        map.put("isFile", Boolean.valueOf(interfaceC19370.mo39135()));
        map.put("isLink", Boolean.valueOf(interfaceC19370.mo39144()));
        map.put("recyclable", Boolean.valueOf(C20393.m46048(interfaceC19370.mo26445())));
        if (interfaceC19370.mo39144()) {
            map.put("linkPath", interfaceC19370.mo39143());
        }
        if (interfaceC19370.mo39135()) {
            map.put("size", Long.valueOf(interfaceC19370.getSize()));
        } else {
            map.put("size", -1);
        }
        int i = C8993.f24364;
        map.put(MotionUtils.EASING_TYPE_PATH, interfaceC19370.isDirectory() ? interfaceC19370.mo39146() : interfaceC19370.getPath());
        map.put("mime", interfaceC19370.mo39137());
        map.put("time", C18794.m42827(interfaceC19370.getTime()));
        if (interfaceC19370.isDirectory()) {
            str = C21265.f66817.f66887;
        } else {
            str = interfaceC19370.mo39139().m9396().f66887;
        }
        map.put("typeIcon", str);
        C16368 c16368M20792 = C8993.m20792(interfaceC19370);
        if (c16368M20792 != null) {
            map.put("dynamicIconHint", c16368M20792);
        }
        return map;
    }
}
