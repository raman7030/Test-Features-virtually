package l;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܳ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes5.dex */
public class C14772 extends ComponentCallbacksC9205 implements InterfaceC15287, InterfaceC8233 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f45109;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12366 f45110;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3764 f45111;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Stack f45112;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13132 f45113;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11005 f45114;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17595 f45115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11005 f45116;

    public C14772() {
        super(R.layout.MT_Protector);
        this.f45112 = new Stack();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17595 c17595 = new C17595(this);
        this.f45115 = c17595;
        c17595.m33259((InterfaceC15287) this);
        this.f45115.m33258((InterfaceC8233) this);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f45111 = c3764;
        c3764.m11419().m1668(this, new InterfaceC1008() { // from class: l.᩹ۜۢ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                C14772.m35130(this.f71818, (C12366) obj);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35130(final C14772 c14772, C12366 c12366) {
        c14772.f45110 = c12366;
        Bundle arguments = c14772.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c14772.f45114 = (C11005) arguments.getSerializable("dataFile");
            c14772.f45116 = (C11005) arguments.getSerializable("configFile");
            c14772.f45109 = true;
        } else {
            c14772.f45114 = new C11005(c12366.m30044(), "search");
            c14772.f45116 = new C11005(c12366.m30044(), "searchCfg");
            c14772.f45109 = false;
            c14772.f45111.m11388(c14772, (C4481) new InterfaceC20106() { // from class: l.ۙۜۢ
                @Override // l.InterfaceC20106
                /* JADX INFO: renamed from: ֫ */
                public final void mo13218(Object obj) {
                    C14772.m35133(this.f14260, (Object[]) obj);
                }
            });
        }
        Stack stack = c14772.f45112;
        stack.clear();
        if (c14772.f45114.m27336()) {
            try {
                C12951 c12951M31485 = C12951.m31485(c14772.f45114.m27337());
                if (c12951M31485.readInt() == -2021510030) {
                    int i = c12951M31485.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C0941(c12951M31485));
                    }
                    if (!stack.isEmpty()) {
                        C12951 c12951M31486 = C12951.m31485(c14772.f45116.m27337());
                        int i3 = c12951M31486.readInt();
                        if (i3 == -2021510029) {
                            HashSet hashSet = ((C0941) stack.peek()).f3565;
                            int i4 = c12951M31486.readInt();
                            for (int i5 = 0; i5 < i4; i5++) {
                                hashSet.add(c12951M31486.m31506());
                            }
                        } else if (i3 == -2021510028) {
                            int iM31494 = c12951M31486.m31494();
                            for (int i6 = 0; i6 < iM31494; i6++) {
                                HashSet hashSet2 = ((C0941) stack.get(i6)).f3565;
                                int i7 = c12951M31486.readInt();
                                for (int i8 = 0; i8 < i7; i8++) {
                                    hashSet2.add(c12951M31486.m31506());
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        c14772.m35136();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35133(C14772 c14772, Object[] objArr) {
        if (c14772.f45109) {
            return;
        }
        C0941 c0941 = (C0941) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c14772.f45112;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c0941);
        c14772.m35144();
        c14772.m35136();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector);
        this.f45113 = c13132;
        c13132.setTag("RecyclerView2");
        this.f45113.setAdapter(this.f45115);
        this.f45111.m11397(getViewLifecycleOwner(), new C20378(this));
        this.f45111.m11399(getViewLifecycleOwner(), new C21415(this));
        this.f45111.m11408(getViewLifecycleOwner(), new C6001(7, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m35126(C11825 c11825, boolean z) {
        if (this.f45110 == null) {
            C12366 c12366 = (C12366) this.f45111.m11419().m1662();
            C11003.requireNonNull(c12366);
            this.f45110 = c12366;
        }
        new C10126(this, (ActivityC17169) requireActivity(), z, c11825).m20274();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        this.f45115.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f45113.setAdapter(null);
        this.f45113 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35128(C14772 c14772, C0941 c0941) {
        c14772.f45112.push(c0941);
        c14772.m35144();
        c14772.m35136();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m35144() {
        C10130 c10130M43030 = C18515.m43030(-2021510030);
        Stack stack = this.f45112;
        c10130M43030.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C0941) it.next()).m3357(c10130M43030);
        }
        try {
            this.f45114.m27332(c10130M43030.m25427());
        } catch (IOException unused) {
        }
        m35140();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m35140() {
        Stack stack = this.f45112;
        if (stack.isEmpty()) {
            this.f45116.m27333();
            return;
        }
        C10130 c10130M43030 = C18515.m43030(-2021510028);
        c10130M43030.mo13231(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            HashSet hashSet = ((C0941) it.next()).f3565;
            c10130M43030.writeInt(hashSet.size());
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                c10130M43030.m25439((String) it2.next());
            }
        }
        try {
            this.f45116.m27332(c10130M43030.m25427());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m35142(C14772 c14772) {
        c14772.f45112.clear();
        c14772.f45114.m27333();
        c14772.f45116.m27333();
        c14772.m35136();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m35136() {
        if (this.f45115 == null) {
            return;
        }
        Stack stack = this.f45112;
        this.f45115.m33252(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C0941) stack.peek()).m3355());
        this.f45115.m33278();
    }

    @Override // l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16605(final C16971 c16971) {
        final C23155 c23155;
        C12366 c12366;
        final boolean zM39807 = c16971.m39807();
        if (zM39807 && (c12366 = this.f45110) != null && !c12366.m30058(c16971.m39805())) {
            return false;
        }
        C21282 c21282 = new C21282(requireContext(), c16971.m39802(), 0);
        if (zM39807) {
            c23155 = new C23155(c21282, c16971.m39805(), true);
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        } else {
            c23155 = null;
        }
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۗۜۢ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C14772.m35132(this.f9631, c23155, c16971, zM39807, menuItem);
                return true;
            }
        });
        this.f45113.suppressLayout(true);
        c21282.m48301(new InterfaceC7875() { // from class: l.۬ۜۢ
            @Override // l.InterfaceC7875
            /* JADX INFO: renamed from: ֫ */
            public final void mo6265(C21282 c21283) {
                this.f38843.f45113.suppressLayout(false);
            }
        });
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35132(C14772 c14772, C23155 c23155, C16971 c16971, boolean z, MenuItem menuItem) {
        if (c23155 == null || !c23155.m51333(menuItem)) {
            if (menuItem.getItemId() == R.string.MT_Protector) {
                c14772.f45111.m11383(c16971.m39805());
                return;
            }
            C0941 c0941 = (C0941) c14772.f45112.peek();
            if (z) {
                if (c0941.m3356(c16971.m39805()) == null) {
                    return;
                }
                c16971.m39800();
                c0941.m3359(c16971.m39805());
            } else if (c0941.m3354(c16971.m39805(), new RunnableC12560(2, c16971)) == 0) {
                return;
            }
            c14772.m35144();
            c14772.f45115.m41124();
        }
    }

    @Override // l.InterfaceC15287
    /* JADX INFO: renamed from: ۧ */
    public final void mo16606(C16971 c16971) {
        C12366 c12366 = this.f45110;
        if (c12366 == null || c12366.m30058(c16971.m39805())) {
            ((ActivityC17169) requireActivity()).m40343(c16971.m39805(), (C19287) null);
            this.f45110.m30026(c16971.m39805());
            if (((C0941) this.f45112.peek()).f3565.add(c16971.m39805())) {
                C4925.m14316(new RunnableC20004(0, this, c16971), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35131(C14772 c14772, C16971 c16971) {
        c14772.f45115.notifyItemChanged(c16971.m39804());
        c14772.m35140();
    }
}
