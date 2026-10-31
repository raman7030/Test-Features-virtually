package l;

import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C21082 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m47981(InterfaceC17889 interfaceC17889) {
        String str;
        HashMap map = new HashMap();
        map.put("name", interfaceC17889.getName());
        map.put("isFile", Boolean.valueOf(interfaceC17889.mo36969()));
        map.put("isLink", Boolean.valueOf(interfaceC17889.mo36978()));
        map.put("recyclable", Boolean.valueOf(C18965.m43781(interfaceC17889.mo24433())));
        if (interfaceC17889.mo36978()) {
            map.put("linkPath", interfaceC17889.mo36977());
        }
        if (interfaceC17889.mo36969()) {
            map.put("size", Long.valueOf(interfaceC17889.getSize()));
        } else {
            map.put("size", -1);
        }
        int i = C6970.f21484;
        map.put(MotionUtils.EASING_TYPE_PATH, interfaceC17889.isDirectory() ? interfaceC17889.mo36980() : interfaceC17889.getPath());
        map.put("mime", interfaceC17889.mo36971());
        map.put("time", C17283.m40576(interfaceC17889.getTime()));
        if (interfaceC17889.isDirectory()) {
            str = C19883.f64181.f64251;
        } else {
            str = interfaceC17889.mo36973().m7317().f64251;
        }
        map.put("typeIcon", str);
        C14730 c14730M18838 = C6970.m18838(interfaceC17889);
        if (c14730M18838 != null) {
            map.put("dynamicIconHint", c14730M18838);
        }
        return map;
    }
}
