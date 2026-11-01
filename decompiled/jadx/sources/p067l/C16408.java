package p067l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܳ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public class C16408 extends ComponentCallbacksC11117 implements InterfaceC16897, InterfaceC10193 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f48223;

    /* JADX INFO: renamed from: ۙ */
    public C14121 f48224;

    /* JADX INFO: renamed from: ۤ */
    public C5946 f48225;

    /* JADX INFO: renamed from: ۫ */
    public Stack f48226;

    /* JADX INFO: renamed from: ۬ */
    public C14849 f48227;

    /* JADX INFO: renamed from: ᩶ */
    public C12828 f48228;

    /* JADX INFO: renamed from: ᩸ */
    public C19091 f48229;

    /* JADX INFO: renamed from: ᩹ */
    public C12828 f48230;

    public C16408() {
        super(R.layout.MT_Protector);
        this.f48226 = new Stack();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19091 c19091 = new C19091(this);
        this.f48229 = c19091;
        c19091.m35378((InterfaceC16897) this);
        this.f48229.m35377((InterfaceC10193) this);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f48225 = c5946;
        c5946.m13355().m4066(this, new InterfaceC3326() { // from class: l.᩹ۜۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C16408.m37277(this.f74540, (C14121) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۙۜۢ] */
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
    /* JADX INFO: renamed from: ֫ */
    public static void m37277(final C16408 c16408, C14121 c14121) {
        c16408.f48224 = c14121;
        Bundle arguments = c16408.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c16408.f48228 = (C12828) arguments.getSerializable("dataFile");
            c16408.f48230 = (C12828) arguments.getSerializable("configFile");
            c16408.f48223 = true;
        } else {
            c16408.f48228 = new C12828(c14121.m32105(), "search");
            c16408.f48230 = new C12828(c14121.m32105(), "searchCfg");
            c16408.f48223 = false;
            c16408.f48225.m13324(c16408, (C6627) new InterfaceC21477() { // from class: l.ۙۜۢ
                @Override // p067l.InterfaceC21477
                /* JADX INFO: renamed from: ֫ */
                public final void mo15100(Object obj) {
                    C16408.m37280(this.f17087, (Object[]) obj);
                }
            });
        }
        Stack stack = c16408.f48226;
        stack.clear();
        if (c16408.f48228.m29398()) {
            try {
                C14677 c14677M33572 = C14677.m33572(c16408.f48228.m29399());
                if (c14677M33572.readInt() == -2021510030) {
                    int i = c14677M33572.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C3263(c14677M33572));
                    }
                    if (!stack.isEmpty()) {
                        C14677 c14677M33573 = C14677.m33572(c16408.f48230.m29399());
                        int i3 = c14677M33573.readInt();
                        if (i3 == -2021510029) {
                            HashSet hashSet = ((C3263) stack.peek()).f6342;
                            int i4 = c14677M33573.readInt();
                            for (int i5 = 0; i5 < i4; i5++) {
                                hashSet.add(c14677M33573.m33593());
                            }
                        } else if (i3 == -2021510028) {
                            int iM33581 = c14677M33573.m33581();
                            for (int i6 = 0; i6 < iM33581; i6++) {
                                HashSet hashSet2 = ((C3263) stack.get(i6)).f6342;
                                int i7 = c14677M33573.readInt();
                                for (int i8 = 0; i8 < i7; i8++) {
                                    hashSet2.add(c14677M33573.m33593());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        c16408.m37283();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37280(C16408 c16408, Object[] objArr) {
        if (c16408.f48223) {
            return;
        }
        C3263 c3263 = (C3263) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c16408.f48226;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c3263);
        c16408.m37291();
        c16408.m37283();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f48227 = c14849;
        c14849.setTag("RecyclerView2");
        this.f48227.setAdapter(this.f48229);
        this.f48225.m13333(getViewLifecycleOwner(), new C21736(this));
        this.f48225.m13335(getViewLifecycleOwner(), new C22721(this));
        this.f48225.m13344(getViewLifecycleOwner(), new C8072(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m37273(C13607 c13607, boolean z) {
        if (this.f48224 == null) {
            C14121 c14121 = (C14121) this.f48225.m13355().m4060();
            C12826.requireNonNull(c14121);
            this.f48224 = c14121;
        }
        new C11992(this, (ActivityC18686) requireActivity(), z, c13607).m22250();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        this.f48229.notifyDataSetChanged();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f48227.setAdapter(null);
        this.f48227 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37275(C16408 c16408, C3263 c3263) {
        c16408.f48226.push(c3263);
        c16408.m37291();
        c16408.m37283();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m37291() {
        C11996 c11996M45308 = C19965.m45308(-2021510030);
        Stack stack = this.f48226;
        c11996M45308.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C3263) it.next()).m5676(c11996M45308);
        }
        try {
            this.f48228.m29394(c11996M45308.m27447());
        } catch (IOException unused) {
        }
        m37287();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m37287() {
        Stack stack = this.f48226;
        if (stack.isEmpty()) {
            this.f48230.m29395();
            return;
        }
        C11996 c11996M45308 = C19965.m45308(-2021510028);
        c11996M45308.mo15113(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            HashSet hashSet = ((C3263) it.next()).f6342;
            c11996M45308.writeInt(hashSet.size());
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c11996M45308.m27459((String) it2.next());
            }
        }
        try {
            this.f48230.m29394(c11996M45308.m27447());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m37289(C16408 c16408) {
        c16408.f48226.clear();
        c16408.f48228.m29395();
        c16408.f48230.m29395();
        c16408.m37283();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m37283() {
        if (this.f48229 == null) {
            return;
        }
        Stack stack = this.f48226;
        this.f48229.m35371(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C3263) stack.peek()).m5674());
        this.f48229.m35397();
    }

    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(final C18498 c18498) {
        final C24375 c24375;
        C14121 c14121;
        final boolean zM42050 = c18498.m42050();
        if (zM42050 && (c14121 = this.f48224) != null && !c14121.m32119(c18498.m42048())) {
            return false;
        }
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        if (zM42050) {
            c24375 = new C24375(c1898, c18498.m42048(), true);
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c24375 = null;
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۗۜۢ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C16408.m37279(this.f12434, c24375, c18498, zM42050, menuItem);
                return true;
            }
        });
        this.f48227.suppressLayout(true);
        c1898.m50635(new InterfaceC1233() { // from class: l.۬ۜۢ
            @Override // p067l.InterfaceC1233
            /* JADX INFO: renamed from: ֫ */
            public final void mo8467(C1898 c1899) {
                this.f41887.f48227.suppressLayout(false);
            }
        });
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37279(C16408 c16408, C24375 c24375, C18498 c18498, boolean z, MenuItem menuItem) {
        if (c24375 == null || !c24375.m53728(menuItem)) {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                c16408.f48225.m13319(c18498.m42048());
                return;
            }
            C3263 c3263 = (C3263) c16408.f48226.peek();
            if (z) {
                if (c3263.m5675(c18498.m42048()) == null) {
                    return;
                }
                c18498.m42043();
                c3263.m5678(c18498.m42048());
            } else if (c3263.m5673(c18498.m42048(), new RunnableC14306(2, c18498)) == 0) {
                return;
            }
            c16408.m37291();
            c16408.f48229.m43370();
        }
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        C14121 c14121 = this.f48224;
        if (c14121 == null || c14121.m32119(c18498.m42048())) {
            ((ActivityC18686) requireActivity()).m42588(c18498.m42048(), (C20699) null);
            this.f48224.m32087(c18498.m42048());
            if (((C3263) this.f48226.peek()).f6342.add(c18498.m42048())) {
                C7050.m16213(new RunnableC21380(0, this, c18498), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37278(C16408 c16408, C18498 c18498) {
        c16408.f48229.notifyItemChanged(c18498.m42047());
        c16408.m37287();
    }
}
