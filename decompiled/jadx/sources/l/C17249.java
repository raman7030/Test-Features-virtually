package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17249 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f52880;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f52881;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4549 f52882;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19357 f52884;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f52879 = new HashSet();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f52883 = new HashMap();

    public C17249(AbstractC15440 abstractC15440, C4549 c4549, boolean z, boolean z2, InterfaceC5276 interfaceC5276) throws Exception {
        boolean z3;
        this.f52882 = c4549;
        this.f52881 = z;
        ArrayList<C12918> arrayList = new ArrayList();
        C18090 c18090 = new C18090(abstractC15440.m36526("base.apk"));
        try {
            C3545 entry = c18090.getEntry("classes.dex");
            if (entry != null) {
                int i = 0;
                byte[] bArrM1795 = C0349.m1795(c18090.m42189(entry), 0);
                byte[] bArrCopyOf = Arrays.copyOf(bArrM1795, 20);
                C23881 c23881M7785 = C2405.m7785(bArrCopyOf);
                if (!c23881M7785.m52607()) {
                    throw new C19401(C1575.m5392(c23881M7785, R.string.MT_Protector));
                }
                if (C2732.m8478(c23881M7785.m52602(), bArrCopyOf)) {
                    z3 = true;
                } else {
                    for (int length = bArrM1795.length / 2; length < bArrM1795.length; length++) {
                        bArrM1795[length] = (byte) (bArrM1795[length] / 2);
                    }
                    z3 = false;
                }
                C12918 c12918M31381 = C12918.m31381(bArrM1795);
                c12918M31381.m31387("classes.dex");
                arrayList.add(c12918M31381);
                int i2 = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("classes");
                    i2++;
                    sb.append(i2);
                    sb.append(".dex");
                    String string = sb.toString();
                    C3545 entry2 = c18090.getEntry(string);
                    if (entry2 == null) {
                        break;
                    }
                    byte[] bArrM1796 = C0349.m1795(c18090.m42189(entry2), 0);
                    if (!z3) {
                        for (int length2 = bArrM1796.length / 2; length2 < bArrM1796.length; length2++) {
                            bArrM1796[length2] = (byte) (bArrM1796[length2] / 2);
                        }
                    }
                    C12918 c12918M31382 = C12918.m31381(bArrM1796);
                    c12918M31382.m31387(string);
                    arrayList.add(c12918M31382);
                }
                c18090.close();
                c4549.m13377(abstractC15440.mo23554(), z, z2);
                C19357 c19357 = new C19357(((C12918) arrayList.get(0)).mo27437());
                this.f52884 = c19357;
                this.f52880 = c19357.f68942.m46805();
                interfaceC5276.mo3578();
                Iterator it = arrayList.iterator();
                int iM31408 = 0;
                while (it.hasNext()) {
                    iM31408 += ((C12918) it.next()).m31408();
                }
                int i3 = -1;
                for (C12918 c12918 : arrayList) {
                    HashSet hashSet = new HashSet();
                    for (C7980 c7980 : (AbstractC18605) c12918.mo27438()) {
                        i++;
                        int i4 = (i * 100) / iM31408;
                        if (i4 != i3) {
                            interfaceC5276.mo3581(i4);
                            i3 = i4;
                        }
                        if (!this.f52884.f68942.m46805().containsKey(c7980.getType())) {
                            this.f52884.m44606((InterfaceC8566) c7980);
                            hashSet.add(c7980.getType());
                            if (interfaceC5276.mo1526()) {
                                return;
                            }
                        }
                    }
                    this.f52883.put((String) c12918.m31395(), hashSet);
                }
                return;
            }
            throw new IOException("classes.dex not found");
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
