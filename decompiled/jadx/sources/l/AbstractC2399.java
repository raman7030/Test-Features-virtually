package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8V1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2399 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3104 f7653;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f7654;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7655;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f7656 = new ArrayList(1);

    public AbstractC2399(boolean z) {
        this.f7654 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7774(C3104 c3104) {
        for (int i = 0; i < this.f7655; i++) {
            ((InterfaceC0486) this.f7656.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7776(C3104 c3104) {
        this.f7653 = c3104;
        for (int i = 0; i < this.f7655; i++) {
            ((InterfaceC0486) this.f7656.get(i)).mo2148(c3104, this.f7654);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m7777(int i) {
        C3104 c3104 = this.f7653;
        String str = C3603.f11424;
        for (int i2 = 0; i2 < this.f7655; i2++) {
            ((InterfaceC0486) this.f7656.get(i2)).mo2147(c3104, this.f7654, i);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public Map mo5936() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m7775() {
        C3104 c3104 = this.f7653;
        String str = C3603.f11424;
        for (int i = 0; i < this.f7655; i++) {
            ((InterfaceC0486) this.f7656.get(i)).mo2146(c3104, this.f7654);
        }
        this.f7653 = null;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        ArrayList arrayList = this.f7656;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        this.f7655++;
    }
}
