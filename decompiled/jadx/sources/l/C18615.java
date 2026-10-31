package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C18615 extends AbstractC1661 {
    public C18615() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        boolean z;
        boolean z2;
        c2450.m7907("local");
        List listM7909 = c2450.m7909();
        int i = 0;
        if (listM7909.size() == 1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(0);
            String name = interfaceC17889.getName();
            String lowerCase = name.toLowerCase();
            boolean z3 = interfaceC17889.mo36969() && lowerCase.endsWith(".bak");
            int length = interfaceC17889.isDirectory() ? name.length() : name.lastIndexOf(46);
            if (length == -1) {
                length = name.length();
            } else if (lowerCase.endsWith(".rename") || lowerCase.endsWith(".apk.1")) {
                int length2 = name.length();
                int i2 = length;
                length = length2;
                i = i2;
            }
            C9443 c9443 = new C9443(c2450.m7917(), c2450, name, interfaceC17889);
            c9443.m31258(R.string.MT_Protector);
            c9443.m31250((CharSequence) interfaceC17889.getName());
            c9443.m31279(6);
            c9443.m31244();
            c9443.m31246(i, length);
            if (z3) {
                c9443.m31247(R.string.MT_Protector, new ViewOnClickListenerC19680(interfaceC17889, c2450, c9443, 2), (ViewOnLongClickListenerC23553) null);
            } else {
                c9443.m31247(android.R.string.paste, new ViewOnClickListenerC7935(2, c9443), new ViewOnLongClickListenerC23553(c9443));
            }
            c9443.m31266(!z3);
            return;
        }
        ArrayList arrayList = new ArrayList(listM7909);
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            String strMo36971 = ((InterfaceC17889) it.next()).mo36971();
            if (strMo36971.equals("application/vnd.android.package-archive")) {
                if (i != 0) {
                    z2 = i;
                    z = true;
                    Main mainM7917 = c2450.m7917();
                    new C2387(this, mainM7917, arrayList, z, z2, c2450, arrayList, mainM7917).m15027();
                }
                z4 = true;
            } else if (!strMo36971.startsWith("image/")) {
                continue;
            } else {
                if (z4) {
                    z = z4;
                    z2 = 1;
                    Main mainM7918 = c2450.m7917();
                    new C2387(this, mainM7918, arrayList, z, z2, c2450, arrayList, mainM7918).m15027();
                }
                i = 1;
            }
        }
        z = z4;
        z2 = i;
        Main mainM7919 = c2450.m7917();
        new C2387(this, mainM7919, arrayList, z, z2, c2450, arrayList, mainM7919).m15027();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43156(C18615 c18615, C2450 c2450, ArrayList arrayList) {
        String[] strArr = (String[]) C5378.stream(arrayList).map(new C18554(1)).toArray(new C5228(1));
        String[] strArr2 = (String[]) C5378.stream(arrayList).map(new C12247(1)).toArray(new C6620());
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C3798.class);
        c0994.m3486(c2450);
        c0994.m3477("oldNames", strArr);
        c0994.m3477("newNames", strArr2);
        c0994.m3474(MotionUtils.EASING_TYPE_PATH, c2450.m7926());
        c0994.m3469();
    }
}
