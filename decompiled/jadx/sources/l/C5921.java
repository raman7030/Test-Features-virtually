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

/* JADX INFO: renamed from: l.ۛ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public class C5921 extends ComponentCallbacksC9205 implements InterfaceC15287, InterfaceC8233 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f18155;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11005 f18156;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3764 f18157;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Stack f18158;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13132 f18159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11005 f18160;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10155 f18161;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19452 f18162;

    public C5921() {
        super(R.layout.MT_Protector);
        this.f18158 = new Stack();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10155 c10155 = new C10155(this);
        this.f18161 = c10155;
        c10155.m33259((InterfaceC15287) this);
        this.f18161.m33258((InterfaceC8233) this);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f18157 = c3764;
        c3764.m11411().m1668(this, new InterfaceC1008() { // from class: l.֡۟᩷
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo1617(Object obj) {
                C5921.m16593(this.f1597, (C19452) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16593(C5921 c5921, C19452 c19452) {
        c5921.f18162 = c19452;
        Bundle arguments = c5921.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c5921.f18156 = (C11005) arguments.getSerializable("dataFile");
            c5921.f18160 = (C11005) arguments.getSerializable("configFile");
            c5921.f18155 = true;
        } else {
            c5921.f18156 = new C11005(c19452.m44854(), "search");
            c5921.f18160 = new C11005(c19452.m44854(), "searchCfg");
            c5921.f18155 = false;
            c5921.f18157.m11386(c5921, new C7037(c5921));
        }
        Stack stack = c5921.f18158;
        stack.clear();
        if (c5921.f18156.m27336()) {
            try {
                C12951 c12951M31485 = C12951.m31485(c5921.f18156.m27337());
                if (c12951M31485.readInt() == -2021510030) {
                    int i = c12951M31485.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C0941(c12951M31485));
                    }
                    if (!stack.isEmpty()) {
                        C12951 c12951M31486 = C12951.m31485(c5921.f18160.m27337());
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
        c5921.m16597();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16594(C5921 c5921, Object[] objArr) {
        if (c5921.f18155) {
            return;
        }
        C0941 c0941 = (C0941) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c5921.f18158;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c0941);
        c5921.m16603();
        c5921.m16597();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector);
        this.f18159 = c13132;
        c13132.setTag("RecyclerView2");
        this.f18159.setAdapter(this.f18161);
    }

    @Override // l.ComponentCallbacksC9205
    public final void onResume() {
        super.onResume();
        this.f18161.notifyDataSetChanged();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18159.setAdapter(null);
        this.f18159 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m16603() {
        C10130 c10130M43030 = C18515.m43030(-2021510030);
        Stack stack = this.f18158;
        c10130M43030.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C0941) it.next()).m3357(c10130M43030);
        }
        try {
            this.f18156.m27332(c10130M43030.m25427());
        } catch (IOException unused) {
        }
        m16600();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m16600() {
        Stack stack = this.f18158;
        if (stack.isEmpty()) {
            this.f18160.m27333();
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
            this.f18160.m27332(c10130M43030.m25427());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m16601(C5921 c5921) {
        c5921.f18158.clear();
        c5921.f18156.m27333();
        c5921.f18160.m27333();
        c5921.m16597();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m16597() {
        if (this.f18161 == null) {
            return;
        }
        Stack stack = this.f18158;
        this.f18161.m33252(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C0941) stack.peek()).m3355());
        this.f18161.m33278();
    }

    @Override // l.InterfaceC8233
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo16605(final C16971 c16971) {
        C19452 c19452;
        final boolean zM39807 = c16971.m39807();
        if (zM39807 && (c19452 = this.f18162) != null && !c19452.m44838(c16971.m39805())) {
            return false;
        }
        C21282 c21282 = new C21282(requireContext(), c16971.m39802(), 0);
        if (zM39807) {
            c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c21282.m48304().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c21282.m48302(new InterfaceC14930() { // from class: l.ۚ۟᩷
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C5921.m16592(this.f16329, c16971, zM39807, menuItem);
                return true;
            }
        });
        this.f18159.suppressLayout(true);
        c21282.m48301((InterfaceC7875) new C16146(6, this));
        c21282.m48305();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16592(C5921 c5921, C16971 c16971, boolean z, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c5921.f18157.m11405(c16971.m39805());
            return;
        }
        C0941 c0941 = (C0941) c5921.f18158.peek();
        if (z) {
            if (c0941.m3356(c16971.m39805()) == null) {
                return;
            }
            c16971.m39800();
            c0941.m3359(c16971.m39805());
        } else if (c0941.m3354(c16971.m39805(), new RunnableC12560(2, c16971)) == 0) {
            return;
        }
        c5921.m16603();
        c5921.f18161.m25498();
    }

    @Override // l.InterfaceC15287
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo16606(C16971 c16971) {
        C19452 c19452 = this.f18162;
        if (c19452 == null || c19452.m44838(c16971.m39805())) {
            ((ActivityC17169) requireActivity()).m40354(c16971.m39805(), (C19287) null);
            this.f18162.m44818(c16971.m39805());
            if (((C0941) this.f18158.peek()).f3565.add(c16971.m39805())) {
                C4925.m14316(new RunnableC9149(2, this, c16971), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16591(C5921 c5921, C16971 c16971) {
        c5921.f18161.notifyItemChanged(c16971.m39804());
        c5921.m16600();
    }
}
