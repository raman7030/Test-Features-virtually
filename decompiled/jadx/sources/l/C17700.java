package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17700 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m41433(C15996 c15996) {
        String strM40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        boolean z = false;
        if (strM40234 == null || strM40234.isEmpty()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        String strM39731 = AbstractC16891.m39731(strM40234);
        ArrayList arrayListMo7637 = C2499.f7958.mo7637(strM39731, C17315.m40631());
        if (arrayListMo7637.isEmpty() && !C16999.m39866(strM39731, new String[0]).mo23120()) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector, new Object[0]));
        }
        if (!C17315.m40629()) {
            C5378.removeIf(arrayListMo7637, new C16288());
        }
        C9087 c9087M38052 = C16141.m38052(strM39731);
        if (c9087M38052 == null) {
            String strM40235 = C17140.m40234(c15996, "sortMethod");
            String strM40236 = C17140.m40234(c15996, "sortReverse");
            if (strM40235 == null && strM40236 == null) {
                c9087M38052 = new C9087(0, false);
            } else {
                if (strM40235 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "sortMethod"));
                }
                if (strM40236 == null) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "sortReverse"));
                }
                try {
                    int iM38053 = C16141.m38053(strM40235);
                    try {
                        if ("true".equals(strM40236)) {
                            z = true;
                        } else if (!"false".equals(strM40236)) {
                            throw C6411.m17739((RuntimeException) new IllegalArgumentException("invalid boolean"));
                        }
                        c9087M38052 = new C9087(iM38053, z);
                    } catch (RuntimeException unused) {
                        return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "sortReverse"));
                    }
                } catch (RuntimeException unused2) {
                    return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector, "sortMethod"));
                }
            }
        }
        C7489.m20119(arrayListMo7637, c9087M38052.f27538, c9087M38052.f27539);
        ArrayList arrayList = new ArrayList(arrayListMo7637.size());
        Iterator it = arrayListMo7637.iterator();
        while (it.hasNext()) {
            arrayList.add(C21082.m47981((InterfaceC17889) it.next()));
        }
        HashMap map = new HashMap();
        map.put(MotionUtils.EASING_TYPE_PATH, strM39731);
        map.put("files", arrayList);
        return C2884.m8817(map);
    }
}
