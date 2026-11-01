package p067l;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4441 extends AbstractC20674 implements InterfaceC5921 {

    /* JADX INFO: renamed from: ۜ */
    public List f9964 = new ArrayList();

    /* JADX INFO: renamed from: ۡ */
    public String f9965;

    /* JADX INFO: renamed from: ۢ */
    public Boolean f9966;

    /* JADX INFO: renamed from: ܺ */
    public EnumC5782 f9967;

    /* JADX INFO: renamed from: ᩷ */
    public Matrix f9968;

    @Override // p067l.InterfaceC5921
    public final List getChildren() {
        return this.f9964;
    }

    @Override // p067l.InterfaceC5921
    /* JADX INFO: renamed from: ֫ */
    public final void mo9276(C7262 c7262) throws C20555 {
        if (c7262 instanceof C15169) {
            this.f9964.add(c7262);
            return;
        }
        throw new C20555("Gradient elements cannot contain " + c7262 + " elements.");
    }
}
