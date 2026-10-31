package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶ۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1V7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19900 implements InterfaceC18776 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f64305;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Object f64307;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f64308;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22016 f64309;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC19900 f64314;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f64315;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C16658 f64312 = new C16658();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17364 f64313 = new C17364();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16658 f64306 = new C16658();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9073(InterfaceC8898 interfaceC8898);

    public AbstractC19900(C22016 c22016, int i, int i2) {
        this.f64309 = c22016;
        this.f64310 = new ArrayList(i);
        this.f64311 = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m45794() {
        return this.f64315;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45791(String str) {
        this.f64315 = this.f64309.m49540(str);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m45789() {
        return this.f64308;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45796(String str) {
        this.f64308 = this.f64309.m49540(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45793(AbstractC19900 abstractC19900) {
        this.f64314 = abstractC19900;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m45790() {
        return this.f64305;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45781(int i) {
        this.f64305 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17364 m45798() {
        return this.f64313;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45782(String str) {
        this.f64313.add(this.f64309.m49540(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45787(AbstractC19900 abstractC19900) {
        this.f64312.add(abstractC19900);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C16658 m45799() {
        return this.f64306;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45784(C2966 c2966) {
        this.f64306.add(c2966);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45797() {
        return this.f64310;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45785(C10022 c10022) {
        this.f64310.add(c10022);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45795() {
        return this.f64311;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45786(C12843 c12843) {
        this.f64311.add(c12843);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45788(boolean z, boolean z2, boolean z3, boolean z4, InterfaceC8898 interfaceC8898) {
        AbstractC19900 abstractC19900;
        AbstractC19900 abstractC19901;
        if (z) {
            mo9073(interfaceC8898);
        }
        if (z2 && (abstractC19901 = this.f64314) != null) {
            abstractC19901.m45788(true, true, z3, false, interfaceC8898);
        }
        if (z3) {
            if (!z2 && (abstractC19900 = this.f64314) != null) {
                abstractC19900.m45788(false, false, true, false, interfaceC8898);
            }
            C16658 c16658 = this.f64312;
            int size = c16658.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC19900) c16658.get(i)).m45788(true, false, true, false, interfaceC8898);
            }
        }
        if (z4) {
            C16658 c16659 = this.f64306;
            int size2 = c16659.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((AbstractC19900) c16659.get(i2)).m45788(true, false, false, true, interfaceC8898);
            }
        }
    }

    @Override // l.InterfaceC18776
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13101() {
        return this.f64307;
    }

    @Override // l.InterfaceC18776
    /* JADX INFO: renamed from: ֫ */
    public final void mo13103(Object obj) {
        this.f64307 = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45792(InterfaceC2548 interfaceC2548) {
        ArrayList arrayList = this.f64310;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4377) arrayList.get(i)).mo13106(this, interfaceC2548);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45783(InterfaceC2548 interfaceC2548) {
        ArrayList arrayList = this.f64311;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC4377) arrayList.get(i)).mo13106(this, interfaceC2548);
        }
    }
}
