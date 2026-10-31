package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1WK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23192 implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f74556 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51444(AbstractC14019 abstractC14019) {
        if (this.f74556 == null) {
            this.f74556 = new ArrayList();
        }
        this.f74556.add(abstractC14019);
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC23192 mo28082clone() {
        try {
            AbstractC23192 abstractC23192 = (AbstractC23192) super.clone();
            ArrayList arrayList = this.f74556;
            if (arrayList != null) {
                abstractC23192.f74556 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC23192.f74556.add((InterfaceC11904) arrayList.get(i));
                }
            }
            return abstractC23192;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
