package p067l;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩹ᩳ */
/* JADX INFO: compiled from: OB8N */
/* JADX INFO: loaded from: classes.dex */
public final class C1955 extends AbstractC1920 {
    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Intent mo5143(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C13045.m29867(strArr, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C13045.m29865(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ۧ */
    public final C1605 mo51408(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C13045.m29867(strArr, "input");
        if (strArr.length == 0) {
            return new C1605(C17597.f52590);
        }
        for (String str : strArr) {
            if (C0886.m5543(context, str) != 0) {
                return null;
            }
        }
        int iM4538 = C2845.m4538(strArr.length);
        if (iM4538 < 16) {
            iM4538 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM4538);
        for (String str2 : strArr) {
            C17402 c17402 = new C17402(str2, Boolean.TRUE);
            linkedHashMap.put(c17402.m39624(), c17402.m39625());
        }
        return new C1605(linkedHashMap);
    }

    @Override // p067l.AbstractC1920
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5144(Intent intent, int i) {
        if (i != -1) {
            return C17597.f52590;
        }
        if (intent == null) {
            return C17597.f52590;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C17597.f52590;
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : stringArrayExtra) {
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Iterator it = arrayList2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList3 = new ArrayList(Math.min(C4187.m8472((Iterable) arrayList2), C4187.m8472((Iterable) arrayList)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList3.add(new C17402(it.next(), it2.next()));
        }
        return C2845.m4540(arrayList3);
    }
}
