package p067l;

import android.graphics.Point;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢܺܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14T3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11581 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 f32257;

    /* JADX INFO: renamed from: ۧ */
    public Point f32258;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC11581 mo3910(AbstractC11581 abstractC11581);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3912(StringBuilder sb, int i);

    /* JADX INFO: renamed from: ֫ */
    public void mo3913(ArrayList arrayList) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3914(C11996 c11996);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3915(C22310 c22310);

    public AbstractC11581(AbstractC11581 abstractC11581) {
        this.f32257 = abstractC11581;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC11581 m26651(AbstractC11581 abstractC11581, C14677 c14677) {
        AbstractC11581 c16689;
        int iM33588 = c14677.m33588();
        switch (iM33588) {
            case 20224:
                c16689 = new C16689(c14677);
                break;
            case 20225:
                c16689 = new C3673(abstractC11581, c14677);
                break;
            case 20226:
                c16689 = new C10379(abstractC11581, c14677);
                break;
            case 20227:
                c16689 = new C4621(abstractC11581, c14677);
                break;
            case 20228:
                c16689 = new C13811(abstractC11581, c14677);
                break;
            case 20229:
                c16689 = new C6356(abstractC11581, c14677);
                break;
            case 20230:
                c16689 = new C2608(abstractC11581, c14677);
                break;
            case 20231:
                c16689 = new C20715(abstractC11581, c14677);
                break;
            default:
                c16689 = null;
                break;
        }
        if (c16689 != null) {
            return c16689;
        }
        throw new RuntimeException(C20778.m46922(iM33588, "Unknown syntax item type: "));
    }

    /* JADX INFO: renamed from: ֫ */
    public C16689 mo26652() {
        return this.f32257.mo26652();
    }
}
