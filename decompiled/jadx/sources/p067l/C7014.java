package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public class C7014 {

    /* JADX INFO: renamed from: ۧ */
    public EnumC21767 f18274;

    /* JADX INFO: renamed from: ܳ */
    public EnumC23778 f18275;

    /* JADX INFO: renamed from: ܽ */
    public final ComponentCallbacksC11117 f18276;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f18273 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet f18279 = new HashSet();

    /* JADX INFO: renamed from: ᩳ */
    public boolean f18278 = false;

    /* JADX INFO: renamed from: ܿ */
    public boolean f18277 = false;

    /* JADX INFO: renamed from: ۜ */
    public void mo16139() {
    }

    public C7014(EnumC21767 enumC21767, EnumC23778 enumC23778, ComponentCallbacksC11117 componentCallbacksC11117, C2017 c2017) {
        this.f18274 = enumC21767;
        this.f18275 = enumC23778;
        this.f18276 = componentCallbacksC11117;
        c2017.m54629(new C23108(this));
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC21767 m16143() {
        return this.f18274;
    }

    /* JADX INFO: renamed from: ܿ */
    public final EnumC23778 m16144() {
        return this.f18275;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ComponentCallbacksC11117 m16145() {
        return this.f18276;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16135() {
        if (this.f18278) {
            return;
        }
        this.f18278 = true;
        HashSet hashSet = this.f18279;
        if (hashSet.isEmpty()) {
            mo16140();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((C2017) it.next()).m54628();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m16142() {
        return this.f18278;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f18274 + "} {mLifecycleImpact = " + this.f18275 + "} {mFragment = " + this.f18276 + C0249l.f1198d;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16137(EnumC21767 enumC21767, EnumC23778 enumC23778) {
        int i = C10367.f28696[enumC23778.ordinal()];
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f18276;
        if (i == 1) {
            if (this.f18274 == EnumC21767.REMOVED) {
                if (AbstractC7291.m16763(2)) {
                    C12826.toString(componentCallbacksC11117);
                    C12826.toString(this.f18275);
                }
                this.f18274 = EnumC21767.VISIBLE;
                this.f18275 = EnumC23778.ADDING;
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC7291.m16763(2)) {
                C12826.toString(componentCallbacksC11117);
                C12826.toString(this.f18274);
                C12826.toString(this.f18275);
            }
            this.f18274 = EnumC21767.REMOVED;
            this.f18275 = EnumC23778.REMOVING;
            return;
        }
        if (i == 3 && this.f18274 != EnumC21767.REMOVED) {
            if (AbstractC7291.m16763(2)) {
                C12826.toString(componentCallbacksC11117);
                C12826.toString(this.f18274);
                C12826.toString(enumC21767);
            }
            this.f18274 = enumC21767;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16136(Runnable runnable) {
        this.f18273.add(runnable);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16141(C2017 c2017) {
        mo16139();
        this.f18279.add(c2017);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16138(C2017 c2017) {
        HashSet hashSet = this.f18279;
        if (hashSet.remove(c2017) && hashSet.isEmpty()) {
            mo16140();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m16146() {
        return this.f18277;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo16140() {
        if (this.f18277) {
            return;
        }
        if (AbstractC7291.m16763(2)) {
            toString();
        }
        this.f18277 = true;
        Iterator it = this.f18273.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
