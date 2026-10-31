package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩺ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22723 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC5790 f73417 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f73415 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f73412 = 120;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f73414 = 120;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f73416 = 250;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f73413 = 250;

    /* JADX INFO: renamed from: ۜ */
    public abstract void mo20593();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo20595();

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo20596(AbstractC3255 abstractC3255);

    /* JADX INFO: renamed from: ᩻ */
    public abstract boolean mo20599();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m50790() {
        return this.f73416;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50789(long j) {
        this.f73416 = j;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m50788() {
        return this.f73412;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50782(long j) {
        this.f73412 = j;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m50787() {
        return this.f73414;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50792(long j) {
        this.f73414 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m50791() {
        return this.f73413;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50786(long j) {
        this.f73413 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50784(InterfaceC5790 interfaceC5790) {
        this.f73417 = interfaceC5790;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m50780(AbstractC3255 abstractC3255) {
        int i = abstractC3255.mFlags;
        if (!abstractC3255.isInvalid() && (i & 4) == 0) {
            abstractC3255.getOldPosition();
            abstractC3255.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50783(AbstractC3255 abstractC3255) {
        InterfaceC5790 interfaceC5790 = this.f73417;
        if (interfaceC5790 != null) {
            C13132 c13132 = ((C13550) interfaceC5790).f40439;
            abstractC3255.setIsRecyclable(true);
            if (abstractC3255.mShadowedHolder != null && abstractC3255.mShadowingHolder == null) {
                abstractC3255.mShadowedHolder = null;
            }
            abstractC3255.mShadowingHolder = null;
            if (abstractC3255.shouldBeKeptAsChild() || c13132.removeAnimatingView(abstractC3255.itemView) || !abstractC3255.isTmpDetached()) {
                return;
            }
            c13132.removeDetachedView(abstractC3255.itemView, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50785(C4234 c4234) {
        boolean zMo20599 = mo20599();
        if (c4234 != null) {
            if (!zMo20599) {
                c4234.mo12733();
                return zMo20599;
            }
            this.f73415.add(c4234);
        }
        return zMo20599;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo20591(AbstractC3255 abstractC3255, List list) {
        return !((AbstractC11722) this).f34979 || abstractC3255.isInvalid();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50781() {
        ArrayList arrayList = this.f73415;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC10024) arrayList.get(i)).mo12733();
        }
        arrayList.clear();
    }
}
