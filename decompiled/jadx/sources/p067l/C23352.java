package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAQ7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23352 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f74448;

    /* JADX INFO: renamed from: ۧ */
    public List f74449 = Collections.EMPTY_LIST;

    public C23352() {
        this.f74448 = C11164.m25781() && !C11765.m26993();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52010() {
        if (this.f74448) {
            this.f74449 = C19210.m43747();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52011(AbstractC17043 abstractC17043, EnumC17868 enumC17868) {
        C3787 c3787M7404 = C3787.m7404(abstractC17043, enumC17868);
        if (c3787M7404 == null) {
            return;
        }
        m52013(c3787M7404);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52012(AbstractC17043 abstractC17043, EnumC17868 enumC17868, AbstractC17043 abstractC17044, EnumC17868 enumC17869) {
        C3787 c3787M7404 = C3787.m7404(abstractC17043, enumC17868);
        C3787 c3787M7405 = C3787.m7404(abstractC17044, enumC17869);
        if (c3787M7404 == null && c3787M7405 == null) {
            return;
        }
        m52013(c3787M7404, c3787M7405);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m52013(C3787... c3787Arr) {
        C12505 c12505M52009;
        String strM26416;
        C12505 c12505M520010;
        if (this.f74448) {
            HashSet<C12505> hashSet = new HashSet(c3787Arr.length);
            HashSet<C12505> hashSet2 = new HashSet(c3787Arr.length);
            for (C3787 c3787 : c3787Arr) {
                if (c3787 != null) {
                    String strM49051 = c3787.f8107;
                    EnumC17868 enumC17868 = c3787.f8108;
                    if (enumC17868.f53347) {
                        ArrayList arrayList = C19210.f57404;
                        try {
                            strM49051 = C21759.m49051(strM49051);
                        } catch (IOException unused) {
                        }
                    }
                    String strM52831 = C23770.m52831(strM49051);
                    if (C19210.m43752(C18524.m42109(strM52831, new String[0])) && (c12505M52009 = m52009(strM52831)) != null && !c12505M52009.f35052) {
                        hashSet.add(c12505M52009);
                        if (enumC17868.f53348 && (strM26416 = C11419.m26416(strM52831)) != null && (c12505M520010 = m52009(strM26416)) != null && !c12505M520010.f35052 && !c12505M520010.equals(c12505M52009)) {
                            hashSet2.add(c12505M520010);
                        }
                    }
                }
            }
            hashSet2.removeAll(hashSet);
            if (hashSet.isEmpty()) {
                return;
            }
            for (C12505 c12505 : hashSet) {
                C11164.m25762(c12505);
                c12505.f35052 = true;
            }
            for (C12505 c12506 : hashSet2) {
                C11164.m25762(c12506);
                c12506.f35052 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C12505 m52009(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith("/")) {
            lowerCase = lowerCase.concat("/");
        }
        for (C12505 c12505 : this.f74449) {
            if (lowerCase.startsWith(c12505.f35050)) {
                return c12505;
            }
        }
        return null;
    }
}
