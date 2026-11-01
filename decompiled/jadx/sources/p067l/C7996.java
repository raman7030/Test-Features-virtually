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

/* JADX INFO: renamed from: l.ۛ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: O1JS */
/* JADX INFO: loaded from: classes3.dex */
public class C7996 extends ComponentCallbacksC11117 implements InterfaceC16897, InterfaceC10193 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f21009;

    /* JADX INFO: renamed from: ۙ */
    public C12828 f21010;

    /* JADX INFO: renamed from: ۤ */
    public C5946 f21011;

    /* JADX INFO: renamed from: ۫ */
    public Stack f21012;

    /* JADX INFO: renamed from: ۬ */
    public C14849 f21013;

    /* JADX INFO: renamed from: ᩶ */
    public C12828 f21014;

    /* JADX INFO: renamed from: ᩸ */
    public C12020 f21015;

    /* JADX INFO: renamed from: ᩹ */
    public C20856 f21016;

    public C7996() {
        super(R.layout.MT_Protector);
        this.f21012 = new Stack();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C12020 c12020 = new C12020(this);
        this.f21015 = c12020;
        c12020.m35378((InterfaceC16897) this);
        this.f21015.m35377((InterfaceC10193) this);
        C5946 c5946 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        this.f21011 = c5946;
        c5946.m13347().m4066(this, new InterfaceC3326() { // from class: l.֡۟᩷
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C7996.m18519(this.f4375, (C20856) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18519(C7996 c7996, C20856 c20856) {
        c7996.f21016 = c20856;
        Bundle arguments = c7996.getArguments();
        if (arguments != null && arguments.containsKey("dataFile")) {
            c7996.f21010 = (C12828) arguments.getSerializable("dataFile");
            c7996.f21014 = (C12828) arguments.getSerializable("configFile");
            c7996.f21009 = true;
        } else {
            c7996.f21010 = new C12828(c20856.m47150(), "search");
            c7996.f21014 = new C12828(c20856.m47150(), "searchCfg");
            c7996.f21009 = false;
            c7996.f21011.m13322(c7996, new C9057(c7996));
        }
        Stack stack = c7996.f21012;
        stack.clear();
        if (c7996.f21010.m29398()) {
            try {
                C14677 c14677M33572 = C14677.m33572(c7996.f21010.m29399());
                if (c14677M33572.readInt() == -2021510030) {
                    int i = c14677M33572.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        stack.push(new C3263(c14677M33572));
                    }
                    if (!stack.isEmpty()) {
                        C14677 c14677M33573 = C14677.m33572(c7996.f21014.m29399());
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
        c7996.m18523();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18520(C7996 c7996, Object[] objArr) {
        if (c7996.f21009) {
            return;
        }
        C3263 c3263 = (C3263) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Stack stack = c7996.f21012;
        if (!zBooleanValue) {
            stack.clear();
        }
        stack.push(c3263);
        c7996.m18529();
        c7996.m18523();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f21013 = c14849;
        c14849.setTag("RecyclerView2");
        this.f21013.setAdapter(this.f21015);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onResume() {
        super.onResume();
        this.f21015.notifyDataSetChanged();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f21013.setAdapter(null);
        this.f21013 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public void m18529() {
        C11996 c11996M45308 = C19965.m45308(-2021510030);
        Stack stack = this.f21012;
        c11996M45308.writeInt(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((C3263) it.next()).m5676(c11996M45308);
        }
        try {
            this.f21010.m29394(c11996M45308.m27447());
        } catch (IOException unused) {
        }
        m18526();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m18526() {
        Stack stack = this.f21012;
        if (stack.isEmpty()) {
            this.f21014.m29395();
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
            this.f21014.m29394(c11996M45308.m27447());
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m18527(C7996 c7996) {
        c7996.f21012.clear();
        c7996.f21010.m29395();
        c7996.f21014.m29395();
        c7996.m18523();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m18523() {
        if (this.f21015 == null) {
            return;
        }
        Stack stack = this.f21012;
        this.f21015.m35371(2, stack.isEmpty() ? Collections.EMPTY_SET : ((C3263) stack.peek()).m5674());
        this.f21015.m35397();
    }

    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(final C18498 c18498) {
        C20856 c20856;
        final boolean zM42050 = c18498.m42050();
        if (zM42050 && (c20856 = this.f21016) != null && !c20856.m47134(c18498.m42048())) {
            return false;
        }
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        if (zM42050) {
            c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۚ۟᩷
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C7996.m18518(this.f19169, c18498, zM42050, menuItem);
                return true;
            }
        });
        this.f21013.suppressLayout(true);
        c1898.m50635((InterfaceC1233) new C17714(6, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18518(C7996 c7996, C18498 c18498, boolean z, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c7996.f21011.m13341(c18498.m42048());
            return;
        }
        C3263 c3263 = (C3263) c7996.f21012.peek();
        if (z) {
            if (c3263.m5675(c18498.m42048()) == null) {
                return;
            }
            c18498.m42043();
            c3263.m5678(c18498.m42048());
        } else if (c3263.m5673(c18498.m42048(), new RunnableC14306(2, c18498)) == 0) {
            return;
        }
        c7996.m18529();
        c7996.f21015.m27517();
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        C20856 c20856 = this.f21016;
        if (c20856 == null || c20856.m47134(c18498.m42048())) {
            ((ActivityC18686) requireActivity()).m42599(c18498.m42048(), (C20699) null);
            this.f21016.m47114(c18498.m42048());
            if (((C3263) this.f21012.peek()).f6342.add(c18498.m42048())) {
                C7050.m16213(new RunnableC11064(2, this, c18498), 200L);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m18517(C7996 c7996, C18498 c18498) {
        c7996.f21015.notifyItemChanged(c18498.m42047());
        c7996.m18526();
    }
}
