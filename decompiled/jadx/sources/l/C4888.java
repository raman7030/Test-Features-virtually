package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public class C4888 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC20411 f15439;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC22527 f15440;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 f15441;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f15438 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet f15444 = new HashSet();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f15443 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f15442 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void mo14242() {
    }

    public C4888(EnumC20411 enumC20411, EnumC22527 enumC22527, ComponentCallbacksC9205 componentCallbacksC9205, C23686 c23686) {
        this.f15439 = enumC20411;
        this.f15440 = enumC22527;
        this.f15441 = componentCallbacksC9205;
        c23686.m52226(new C21822(this));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC20411 m14246() {
        return this.f15439;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC22527 m14247() {
        return this.f15440;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ComponentCallbacksC9205 m14248() {
        return this.f15441;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14238() {
        if (this.f15443) {
            return;
        }
        this.f15443 = true;
        HashSet hashSet = this.f15444;
        if (hashSet.isEmpty()) {
            mo14243();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((C23686) it.next()).m52225();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m14245() {
        return this.f15443;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f15439 + "} {mLifecycleImpact = " + this.f15440 + "} {mFragment = " + this.f15441 + l.d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14240(EnumC20411 enumC20411, EnumC22527 enumC22527) {
        int i = C8416.f25782[enumC22527.ordinal()];
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f15441;
        if (i == 1) {
            if (this.f15439 == EnumC20411.REMOVED) {
                if (AbstractC5180.m14853(2)) {
                    C11003.toString(componentCallbacksC9205);
                    C11003.toString(this.f15440);
                }
                this.f15439 = EnumC20411.VISIBLE;
                this.f15440 = EnumC22527.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC5180.m14853(2)) {
                C11003.toString(componentCallbacksC9205);
                C11003.toString(this.f15439);
                C11003.toString(this.f15440);
            }
            this.f15439 = EnumC20411.REMOVED;
            this.f15440 = EnumC22527.REMOVING;
            return;
        }
        if (i == 3 && this.f15439 != EnumC20411.REMOVED) {
            if (AbstractC5180.m14853(2)) {
                C11003.toString(componentCallbacksC9205);
                C11003.toString(this.f15439);
                C11003.toString(enumC20411);
            }
            this.f15439 = enumC20411;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14239(Runnable runnable) {
        this.f15438.add(runnable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14244(C23686 c23686) {
        mo14242();
        this.f15444.add(c23686);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14241(C23686 c23686) {
        HashSet hashSet = this.f15444;
        if (hashSet.remove(c23686) && hashSet.isEmpty()) {
            mo14243();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m14249() {
        return this.f15442;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo14243() {
        if (this.f15442) {
            return;
        }
        if (AbstractC5180.m14853(2)) {
            toString();
        }
        this.f15442 = true;
        Iterator it = this.f15438.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
