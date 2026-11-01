package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8V1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4648 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public C5318 f10445;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f10446;

    /* JADX INFO: renamed from: ܽ */
    public int f10447;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f10448 = new ArrayList(1);

    public AbstractC4648(boolean z) {
        this.f10446 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9837(C5318 c5318) {
        for (int i = 0; i < this.f10447; i++) {
            ((InterfaceC2830) this.f10448.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9839(C5318 c5318) {
        this.f10445 = c5318;
        for (int i = 0; i < this.f10447; i++) {
            ((InterfaceC2830) this.f10448.get(i)).mo4515(c5318, this.f10446);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m9840(int i) {
        C5318 c5318 = this.f10445;
        String str = C5792.f14228;
        for (int i2 = 0; i2 < this.f10447; i2++) {
            ((InterfaceC2830) this.f10448.get(i2)).mo4514(c5318, this.f10446, i);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public Map mo8131() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m9838() {
        C5318 c5318 = this.f10445;
        String str = C5792.f14228;
        for (int i = 0; i < this.f10447; i++) {
            ((InterfaceC2830) this.f10448.get(i)).mo4513(c5318, this.f10446);
        }
        this.f10445 = null;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        interfaceC2830.getClass();
        ArrayList arrayList = this.f10448;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
        this.f10447++;
    }
}
