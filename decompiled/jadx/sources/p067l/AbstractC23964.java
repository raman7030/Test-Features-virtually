package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23964 {

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC7871 f76140 = null;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f76138 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public long f76135 = 120;

    /* JADX INFO: renamed from: ܳ */
    public long f76137 = 120;

    /* JADX INFO: renamed from: ܿ */
    public long f76139 = 250;

    /* JADX INFO: renamed from: ۧ */
    public long f76136 = 250;

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo22573();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo22575();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo22576(AbstractC5462 abstractC5462);

    /* JADX INFO: renamed from: ᩻ */
    public abstract boolean mo22579();

    /* JADX INFO: renamed from: ܿ */
    public final long m53116() {
        return this.f76139;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53115(long j) {
        this.f76139 = j;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m53114() {
        return this.f76135;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53108(long j) {
        this.f76135 = j;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m53113() {
        return this.f76137;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m53118(long j) {
        this.f76137 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m53117() {
        return this.f76136;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53112(long j) {
        this.f76136 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53110(InterfaceC7871 interfaceC7871) {
        this.f76140 = interfaceC7871;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m53106(AbstractC5462 abstractC5462) {
        int i = abstractC5462.mFlags;
        if (!abstractC5462.isInvalid() && (i & 4) == 0) {
            abstractC5462.getOldPosition();
            abstractC5462.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53109(AbstractC5462 abstractC5462) {
        InterfaceC7871 interfaceC7871 = this.f76140;
        if (interfaceC7871 != null) {
            C14849 c14849 = ((C15246) interfaceC7871).f43509;
            abstractC5462.setIsRecyclable(true);
            if (abstractC5462.mShadowedHolder != null && abstractC5462.mShadowingHolder == null) {
                abstractC5462.mShadowedHolder = null;
            }
            abstractC5462.mShadowingHolder = null;
            if (abstractC5462.shouldBeKeptAsChild() || c14849.removeAnimatingView(abstractC5462.itemView) || !abstractC5462.isTmpDetached()) {
                return;
            }
            c14849.removeDetachedView(abstractC5462.itemView, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53111(C6393 c6393) {
        boolean zMo22579 = mo22579();
        if (c6393 != null) {
            if (!zMo22579) {
                c6393.mo14609();
                return zMo22579;
            }
            this.f76138.add(c6393);
        }
        return zMo22579;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo22571(AbstractC5462 abstractC5462, List list) {
        return !((AbstractC13509) this).f37979 || abstractC5462.isInvalid();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53107() {
        ArrayList arrayList = this.f76138;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC11895) arrayList.get(i)).mo14609();
        }
        arrayList.clear();
    }
}
