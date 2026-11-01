package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20060 extends AbstractC3947 {
    public C20060() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        return c4697.m9964("local") && !c4697.m9971();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        boolean z;
        boolean z2;
        c4697.m9955("local");
        List listM9957 = c4697.m9957();
        int i = 0;
        if (listM9957.size() == 1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(0);
            String name = interfaceC19370.getName();
            String lowerCase = name.toLowerCase();
            boolean z3 = interfaceC19370.mo39135() && lowerCase.endsWith(".bak");
            int length = interfaceC19370.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length == -1) {
                length = name.length();
            } else if (lowerCase.endsWith(".rename") || lowerCase.endsWith(".apk.1")) {
                int length2 = name.length();
                int i2 = length;
                length = length2;
                i = i2;
            }
            C11343 c11343 = new C11343(c4697.m9965(), c4697, name, interfaceC19370);
            c11343.m33344(R.string.MT_Protector);
            c11343.m33336((CharSequence) interfaceC19370.getName());
            c11343.m33365(6);
            c11343.m33330();
            c11343.m33332(i, length);
            if (z3) {
                c11343.m33333(R.string.MT_Protector, new ViewOnClickListenerC21073(interfaceC19370, c4697, c11343, 2), (ViewOnLongClickListenerC24753) null);
            } else {
                c11343.m33333(android.R.string.paste, new ViewOnClickListenerC9910(2, c11343), new ViewOnLongClickListenerC24753(c11343));
            }
            c11343.m33352(!z3);
            return;
        }
        ArrayList arrayList = new ArrayList(listM9957);
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String strMo39137 = ((InterfaceC19370) it.next()).mo39137();
            if (strMo39137.equals("application/vnd.android.package-archive")) {
                if (i != 0) {
                    z2 = i;
                    z = true;
                    Main mainM9965 = c4697.m9965();
                    new C4637(this, mainM9965, arrayList, z, z2, c4697, arrayList, mainM9965).m16937();
                }
                z4 = true;
            } else if (!strMo39137.startsWith("image/")) {
                continue;
            } else {
                if (z4) {
                    z = z4;
                    z2 = 1;
                    Main mainM9966 = c4697.m9965();
                    new C4637(this, mainM9966, arrayList, z, z2, c4697, arrayList, mainM9966).m16937();
                }
                i = 1;
            }
        }
        z = z4;
        z2 = i;
        Main mainM9967 = c4697.m9965();
        new C4637(this, mainM9967, arrayList, z, z2, c4697, arrayList, mainM9967).m16937();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45421(C20060 c20060, C4697 c4697, ArrayList arrayList) {
        String[] strArr = (String[]) C7480.stream(arrayList).map(new C20002(1)).toArray(new C7337(1));
        String[] strArr2 = (String[]) C7480.stream(arrayList).map(new C14008(1)).toArray(new C8660());
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C5978.class);
        c3313.m5789(c4697);
        c3313.m5780("oldNames", strArr);
        c3313.m5780("newNames", strArr2);
        c3313.m5777(MotionUtils.EASING_TYPE_PATH, c4697.m9974());
        c3313.m5772();
    }
}
