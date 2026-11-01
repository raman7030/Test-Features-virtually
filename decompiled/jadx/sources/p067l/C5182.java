package p067l;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C5182 {

    /* JADX INFO: renamed from: ۡ */
    public final C15512 f12197;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC2830 f12198;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20664 f12202;

    /* JADX INFO: renamed from: ܿ */
    public boolean f12203;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC20879 f12204;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC6523 f12205;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC3549 f12201 = new C7573();

    /* JADX INFO: renamed from: ܳ */
    public final IdentityHashMap f12200 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩻ */
    public final HashMap f12206 = new HashMap();

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f12196 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f12195 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f12199 = new HashSet();

    public C5182(InterfaceC6523 interfaceC6523, InterfaceC20879 interfaceC20879, InterfaceC20664 interfaceC20664, C15512 c15512) {
        this.f12197 = c15512;
        this.f12205 = interfaceC6523;
        this.f12204 = interfaceC20879;
        this.f12202 = interfaceC20664;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11106(List list, InterfaceC3549 interfaceC3549) {
        ArrayList arrayList = this.f12196;
        m11095(0, arrayList.size());
        return m11105(arrayList.size(), list, interfaceC3549);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11105(int i, List list, InterfaceC3549 interfaceC3549) {
        if (!list.isEmpty()) {
            this.f12201 = interfaceC3549;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C21276 c21276 = (C21276) list.get(i2 - i);
                ArrayList arrayList = this.f12196;
                if (i2 > 0) {
                    C21276 c21277 = (C21276) arrayList.get(i2 - 1);
                    c21276.f66928 = c21277.f66931.m54589().mo15987() + c21277.f66928;
                } else {
                    c21276.f66928 = 0;
                }
                c21276.f66929 = false;
                c21276.f66927.clear();
                int iMo15987 = c21276.f66931.m54589().mo15987();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((C21276) arrayList.get(i3)).f66928 += iMo15987;
                }
                arrayList.add(i2, c21276);
                this.f12206.put(c21276.f66930, c21276);
                if (this.f12203) {
                    m11099(c21276);
                    if (this.f12200.isEmpty()) {
                        this.f12199.add(c21276);
                    } else {
                        C23287 c23287 = (C23287) this.f12195.get(c21276);
                        if (c23287 != null) {
                            c23287.f73278.mo13820(c23287.f73276);
                        }
                    }
                }
            }
        }
        return m11102();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11103(int i, int i2, List list) {
        ArrayList arrayList = this.f12196;
        C23877.m52957(i >= 0 && i <= i2 && i2 <= arrayList.size());
        C23877.m52957(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C21276) arrayList.get(i3)).f66931.mo11867((C13010) list.get(i3 - i));
        }
        return m11102();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m11115() {
        return this.f12203;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11104(int i, int i2, InterfaceC3549 interfaceC3549) {
        C23877.m52957(i >= 0 && i <= i2 && i2 <= this.f12196.size());
        this.f12201 = interfaceC3549;
        m11095(i, i2);
        return m11102();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11107(InterfaceC3549 interfaceC3549) {
        int size = this.f12196.size();
        if (interfaceC3549.getLength() != size) {
            interfaceC3549 = interfaceC3549.mo6324().mo6327(size);
        }
        this.f12201 = interfaceC3549;
        return m11102();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m11113() {
        return this.f12196.size();
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC6974 m11114() {
        C23877.m52957(this.f12196.size() >= 0);
        this.f12201 = null;
        return m11102();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11109(InterfaceC2830 interfaceC2830) {
        C23877.m52960(!this.f12203);
        this.f12198 = interfaceC2830;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12196;
            if (i < arrayList.size()) {
                C21276 c21276 = (C21276) arrayList.get(i);
                m11099(c21276);
                this.f12199.add(c21276);
                i++;
            } else {
                this.f12203 = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19487 m11108(C17474 c17474, InterfaceC23016 interfaceC23016, long j) {
        Object obj = c17474.f52252;
        int i = AbstractC20466.f63205;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C17474 c17474M39841 = c17474.m39841(pair.second);
        C21276 c21276 = (C21276) this.f12206.get(obj2);
        c21276.getClass();
        this.f12199.add(c21276);
        C23287 c23287 = (C23287) this.f12195.get(c21276);
        if (c23287 != null) {
            c23287.f73278.mo13815(c23287.f73276);
        }
        c21276.f66927.add(c17474M39841);
        C19487 c19487Mo11861 = c21276.f66931.mo11861(c17474M39841, interfaceC23016, j);
        this.f12200.put(c19487Mo11861, c21276);
        m11101();
        return c19487Mo11861;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11110(InterfaceC11441 interfaceC11441) {
        IdentityHashMap identityHashMap = this.f12200;
        C21276 c21276 = (C21276) identityHashMap.remove(interfaceC11441);
        c21276.getClass();
        c21276.f66931.mo11866(interfaceC11441);
        c21276.f66927.remove(((C19487) interfaceC11441).f59375);
        if (!identityHashMap.isEmpty()) {
            m11101();
        }
        m11097(c21276);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m11112() {
        HashMap map = this.f12195;
        for (C23287 c23287 : map.values()) {
            try {
                c23287.f73278.mo13819(c23287.f73276);
            } catch (RuntimeException e) {
                C21334.m48348("Failed to release child source.", e);
            }
            InterfaceC6076 interfaceC6076 = c23287.f73278;
            C22617 c22617 = c23287.f73277;
            interfaceC6076.mo13817((InterfaceC16803) c22617);
            c23287.f73278.mo13818((InterfaceC22695) c22617);
        }
        map.clear();
        this.f12199.clear();
        this.f12203 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6974 m11102() {
        ArrayList arrayList = this.f12196;
        if (arrayList.isEmpty()) {
            return AbstractC6974.f18145;
        }
        int iMo15987 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            C21276 c21276 = (C21276) arrayList.get(i);
            c21276.f66928 = iMo15987;
            iMo15987 += c21276.f66931.m54589().mo15987();
        }
        return new C15239(arrayList, this.f12201);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3549 m11111() {
        return this.f12201;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m11101() {
        Iterator it = this.f12199.iterator();
        while (it.hasNext()) {
            C21276 c21276 = (C21276) it.next();
            if (c21276.f66927.isEmpty()) {
                C23287 c23287 = (C23287) this.f12195.get(c21276);
                if (c23287 != null) {
                    c23287.f73278.mo13820(c23287.f73276);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11095(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f12196;
            C21276 c21276 = (C21276) arrayList.remove(i3);
            this.f12206.remove(c21276.f66930);
            int i4 = -c21276.f66931.m54589().mo15987();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C21276) arrayList.get(i5)).f66928 += i4;
            }
            c21276.f66929 = true;
            if (this.f12203) {
                m11097(c21276);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۖۧۧ, l.ۢۗ֫] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۧ */
    private void m11099(C21276 c21276) {
        C24851 c24851 = c21276.f66931;
        ?? r1 = new InterfaceC4735() { // from class: l.ۢۗ֫
            @Override // p067l.InterfaceC4735
            /* JADX INFO: renamed from: ֫ */
            public final void mo5358(AbstractC11185 abstractC11185, AbstractC6974 abstractC6974) {
                ((C21315) this.f31206.f12205).m48329();
            }
        };
        C22617 c22617 = new C22617(this, c21276);
        this.f12195.put(c21276, new C23287(c24851, r1, c22617));
        String str = C5792.f14228;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c24851.mo13813(new Handler(looperMyLooper, null), (InterfaceC16803) c22617);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c24851.mo13814(new Handler(looperMyLooper2, null), (InterfaceC22695) c22617);
        c24851.mo13816((InterfaceC4735) r1, this.f12198, this.f12197);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m11097(C21276 c21276) {
        if (c21276.f66929 && c21276.f66927.isEmpty()) {
            C23287 c23287 = (C23287) this.f12195.remove(c21276);
            c23287.getClass();
            C22617 c22617 = c23287.f73277;
            InterfaceC6076 interfaceC6076 = c23287.f73278;
            interfaceC6076.mo13819(c23287.f73276);
            interfaceC6076.mo13817((InterfaceC16803) c22617);
            interfaceC6076.mo13818((InterfaceC22695) c22617);
            this.f12199.remove(c21276);
        }
    }
}
