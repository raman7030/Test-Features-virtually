package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 71Y3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18762 {

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f56062;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f56063;

    /* JADX INFO: renamed from: ܽ */
    public final C6692 f56064;

    /* JADX INFO: renamed from: ᩳ */
    public final C20765 f56066;

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f56061 = new HashSet();

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f56065 = new HashMap();

    public C18762(AbstractC17043 abstractC17043, C6692 c6692, boolean z, boolean z2, InterfaceC7383 interfaceC7383) throws Exception {
        boolean z3;
        this.f56064 = c6692;
        this.f56063 = z;
        ArrayList<C14645> arrayList = new ArrayList();
        C19561 c19561 = new C19561(abstractC17043.m38684("base.apk"));
        try {
            C5738 entry = c19561.getEntry("classes.dex");
            if (entry != null) {
                int i = 0;
                byte[] bArrM4194 = C2700.m4194(c19561.m44448(entry), 0);
                byte[] bArrCopyOf = Arrays.copyOf(bArrM4194, 20);
                C25065 c25065M9848 = C4654.m9848(bArrCopyOf);
                if (!c25065M9848.m55016()) {
                    throw new C20807(C3865.m7621(c25065M9848, R.string.MT_Protector));
                }
                if (C4965.m10525(c25065M9848.m55011(), bArrCopyOf)) {
                    z3 = true;
                } else {
                    for (int length = bArrM4194.length / 2; length < bArrM4194.length; length++) {
                        bArrM4194[length] = (byte) (bArrM4194[length] / 2);
                    }
                    z3 = false;
                }
                C14645 c14645M33467 = C14645.m33467(bArrM4194);
                c14645M33467.m33473("classes.dex");
                arrayList.add(c14645M33467);
                int i2 = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("classes");
                    i2++;
                    sb.append(i2);
                    sb.append(".dex");
                    String string = sb.toString();
                    C5738 entry2 = c19561.getEntry(string);
                    if (entry2 == null) {
                        break;
                    }
                    byte[] bArrM4195 = C2700.m4194(c19561.m44448(entry2), 0);
                    if (!z3) {
                        for (int length2 = bArrM4195.length / 2; length2 < bArrM4195.length; length2++) {
                            bArrM4195[length2] = (byte) (bArrM4195[length2] / 2);
                        }
                    }
                    C14645 c14645M33468 = C14645.m33467(bArrM4195);
                    c14645M33468.m33473(string);
                    arrayList.add(c14645M33468);
                }
                c19561.close();
                c6692.m15265(abstractC17043.mo25505(), z, z2);
                C20765 c20765 = new C20765(((C14645) arrayList.get(0)).mo29499());
                this.f56066 = c20765;
                this.f56062 = c20765.f71640.m49128();
                interfaceC7383.mo5865();
                Iterator it = arrayList.iterator();
                int iM33494 = 0;
                while (it.hasNext()) {
                    iM33494 += ((C14645) it.next()).m33494();
                }
                int i3 = -1;
                for (C14645 c14645 : arrayList) {
                    HashSet hashSet = new HashSet();
                    for (C9952 c9952 : (AbstractC20050) c14645.mo29500()) {
                        i++;
                        int i4 = (i * 100) / iM33494;
                        if (i4 != i3) {
                            interfaceC7383.mo5868(i4);
                            i3 = i4;
                        }
                        if (!this.f56066.f71640.m49128().containsKey(c9952.getType())) {
                            this.f56066.m46900((InterfaceC10509) c9952);
                            hashSet.add(c9952.getType());
                            if (interfaceC7383.mo3924()) {
                                return;
                            }
                        }
                    }
                    this.f56065.put((String) c14645.m33481(), hashSet);
                }
                return;
            }
            throw new IOException("classes.dex not found");
        } catch (Throwable th) {
            try {
                c19561.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
