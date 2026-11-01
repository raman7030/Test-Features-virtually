package p067l;

import bin.p000mt.plus.R;
import java.io.File;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ܶ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17073 implements InterfaceC9934, InterfaceC21354, InterfaceC9544, InterfaceC22339, InterfaceC2653 {
    /* JADX INFO: renamed from: ֫ */
    public static void m38721(Class cls, Hashtable hashtable, String str, Class cls2, String str2) {
        hashtable.put(str, cls.getName());
        hashtable.put(str2, cls2.getName());
    }

    @Override // p067l.InterfaceC2653
    public void accept(Object obj) {
        C17425.m39671((File) obj);
    }

    @Override // p067l.InterfaceC21354
    /* JADX INFO: renamed from: ֫ */
    public void mo38722() {
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38720(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    @Override // p067l.InterfaceC9934
    public void invoke(Object obj) {
        ((InterfaceC3443) obj).getClass();
    }

    @Override // p067l.InterfaceC9544
    /* JADX INFO: renamed from: ֫ */
    public CharSequence mo9168(C4360 c4360) {
        C20660 c20660 = (C20660) c4360;
        int i = c20660.m13265().getInt(c20660.m9037(), 0);
        boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        String[] strArrSplit = c20660.m9012().getString(R.string.MT_Protector).split("\\|");
        if (strArrSplit.length != 4) {
            throw new IllegalArgumentException(Arrays.toString(strArrSplit));
        }
        StringBuilder sb = new StringBuilder();
        if (zArr[0]) {
            sb.append(strArrSplit[1]);
        } else {
            sb.append(strArrSplit[0]);
        }
        sb.append(", ");
        if (zArr[1]) {
            sb.append(strArrSplit[3]);
        } else {
            sb.append(strArrSplit[2]);
        }
        return sb.toString();
    }

    @Override // p067l.InterfaceC22339
    /* JADX INFO: renamed from: ۧ */
    public Object mo14676() {
        return new LinkedHashMap();
    }
}
