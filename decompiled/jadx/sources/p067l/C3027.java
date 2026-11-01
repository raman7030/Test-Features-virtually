package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֡᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97M */
/* JADX INFO: loaded from: classes3.dex */
public class C3027 extends AbstractC8202 {

    /* JADX INFO: renamed from: ۘ֫ */
    public String f5403;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f5404 = true;

    /* JADX INFO: renamed from: ۖ֫ */
    public ArrayList f5402 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79720;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16224(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        HashSet hashSet = new HashSet();
        try {
            ArrayList<C22549> arrayList = (ArrayList) m13465("infos");
            C20689 c20689 = new C20689(arrayList.size());
            c20689.m46753(new C5564(2, this));
            for (C22549 c22549 : arrayList) {
                c20689.m46754(1);
                mo13456(c22549.m50525());
                hashSet.add(c22549.m50529());
                AbstractC17043 abstractC17043M50526 = c22549.m50526();
                hashSet.remove(c22549.m50529());
                if (this.f5404) {
                    String str = this.f5403;
                    ArrayList arrayList2 = this.f5402;
                    if (str == null) {
                        this.f5403 = abstractC17043M50526.getParent();
                        arrayList2.add(abstractC17043M50526.getName());
                    } else if (str.equals(abstractC17043M50526.getParent())) {
                        arrayList2.add(abstractC17043M50526.getName());
                    } else {
                        this.f5404 = false;
                    }
                }
                if (mo3924()) {
                    C18736 c18736M42768 = C18736.m42768();
                    C23219.m51751(hashSet);
                    return c18736M42768;
                }
            }
            C18736 c18736M13481 = m13481();
            C23219.m51751(hashSet);
            return c18736M13481;
        } catch (Throwable th) {
            C23219.m51751(hashSet);
            throw th;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773() && m13478(c18107)) {
            c18107.m41267();
            if (this.f5404) {
                boolean zM41261 = c18108.m41261("local");
                ArrayList arrayList = this.f5402;
                if (zM41261 && m13461(c18108)) {
                    c18108.m41226((Collection) arrayList);
                    c18108.m41259(this.f5403, true);
                } else {
                    c18107.m41226((Collection) arrayList);
                    c18107.m41259(this.f5403, true);
                }
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
