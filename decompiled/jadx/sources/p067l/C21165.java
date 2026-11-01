package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1Y0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21165 {
    /* JADX INFO: renamed from: ֫ */
    public static void m47772(Main main, InterfaceC19370 interfaceC19370, String str, InterfaceC20494 interfaceC20494) {
        int iLastIndexOf;
        String name = interfaceC19370.mo26445().m38650(true).getName();
        if (interfaceC19370.isDirectory() || (iLastIndexOf = name.lastIndexOf(46)) == -1) {
            iLastIndexOf = name.length();
        }
        C6412 c6412 = new C6412(main, str, interfaceC20494);
        c6412.m33344(R.string.MT_Protector);
        c6412.m33336((CharSequence) name);
        c6412.m33330();
        c6412.m33365(6);
        c6412.m33332(0, iLastIndexOf);
        c6412.m33352(true);
    }
}
