package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩺᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1WK */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24410 implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f77299 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m53840(AbstractC15692 abstractC15692) {
        if (this.f77299 == null) {
            this.f77299 = new ArrayList();
        }
        this.f77299.add(abstractC15692);
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public AbstractC24410 mo56469clone() {
        try {
            AbstractC24410 abstractC24410 = (AbstractC24410) super.clone();
            ArrayList arrayList = this.f77299;
            if (arrayList != null) {
                abstractC24410.f77299 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abstractC24410.f77299.add((InterfaceC13682) arrayList.get(i));
                }
            }
            return abstractC24410;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
