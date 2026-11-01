package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21281 implements InterfaceC20213 {

    /* JADX INFO: renamed from: ֫ */
    public int f66940;

    /* JADX INFO: renamed from: ۡ */
    public Object f66942;

    /* JADX INFO: renamed from: ۢ */
    public String f66943;

    /* JADX INFO: renamed from: ۧ */
    public final C23292 f66944;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f66945;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f66946;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC21281 f66949;

    /* JADX INFO: renamed from: ᩻ */
    public String f66950;

    /* JADX INFO: renamed from: ܿ */
    public C18200 f66947 = new C18200();

    /* JADX INFO: renamed from: ᩳ */
    public C18871 f66948 = new C18871();

    /* JADX INFO: renamed from: ۜ */
    public C18200 f66941 = new C18200();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo11125(InterfaceC10825 interfaceC10825);

    public AbstractC21281(C23292 c23292, int i, int i2) {
        this.f66944 = c23292;
        this.f66945 = new ArrayList(i);
        this.f66946 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m48106() {
        return this.f66950;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48103(String str) {
        this.f66950 = this.f66944.m51876(str);
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m48101() {
        return this.f66943;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48108(String str) {
        this.f66943 = this.f66944.m51876(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48105(AbstractC21281 abstractC21281) {
        this.f66949 = abstractC21281;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48102() {
        return this.f66940;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48093(int i) {
        this.f66940 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C18871 m48110() {
        return this.f66948;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48094(String str) {
        this.f66948.add(this.f66944.m51876(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48099(AbstractC21281 abstractC21281) {
        this.f66947.add(abstractC21281);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C18200 m48111() {
        return this.f66941;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48096(C5187 c5187) {
        this.f66941.add(c5187);
    }

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList m48109() {
        return this.f66945;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48097(C11893 c11893) {
        this.f66945.add(c11893);
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m48107() {
        return this.f66946;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48098(C14574 c14574) {
        this.f66946.add(c14574);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m48100(boolean z, boolean z2, boolean z3, boolean z4, InterfaceC10825 interfaceC10825) {
        AbstractC21281 abstractC21281;
        AbstractC21281 abstractC21282;
        if (z) {
            mo11125(interfaceC10825);
        }
        if (z2 && (abstractC21282 = this.f66949) != null) {
            abstractC21282.m48100(true, true, z3, false, interfaceC10825);
        }
        if (z3) {
            if (!z2 && (abstractC21281 = this.f66949) != null) {
                abstractC21281.m48100(false, false, true, false, interfaceC10825);
            }
            C18200 c18200 = this.f66947;
            int size = c18200.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC21281) c18200.get(i)).m48100(true, false, true, false, interfaceC10825);
            }
        }
        if (z4) {
            C18200 c18201 = this.f66941;
            int size2 = c18201.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AbstractC21281) c18201.get(i2)).m48100(true, false, false, true, interfaceC10825);
            }
        }
    }

    @Override // p067l.InterfaceC20213
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14965() {
        return this.f66942;
    }

    @Override // p067l.InterfaceC20213
    /* JADX INFO: renamed from: ֫ */
    public final void mo14967(Object obj) {
        this.f66942 = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48104(InterfaceC4790 interfaceC4790) {
        ArrayList arrayList = this.f66945;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6528) arrayList.get(i)).mo14970(this, interfaceC4790);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48095(InterfaceC4790 interfaceC4790) {
        ArrayList arrayList = this.f66946;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6528) arrayList.get(i)).mo14970(this, interfaceC4790);
        }
    }
}
