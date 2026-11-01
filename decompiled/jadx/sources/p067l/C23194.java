package p067l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸᩻ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes2.dex */
public class C23194 extends ComponentCallbacksC11117 implements InterfaceC16897, InterfaceC10193 {

    /* JADX INFO: renamed from: ۗ */
    public C5946 f72871;

    /* JADX INFO: renamed from: ۙ */
    public C14849 f72872;

    /* JADX INFO: renamed from: ᩶ */
    public List f72873;

    /* JADX INFO: renamed from: ᩸ */
    public C7771 f72874;

    /* JADX INFO: renamed from: ᩹ */
    public C14121 f72875;

    public C23194() {
        super(R.layout.MT_Protector);
        this.f72873 = Collections.EMPTY_LIST;
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72871 = (C5946) new C6874(requireActivity()).m15765(C5946.class);
        C7771 c7771 = new C7771(this);
        this.f72874 = c7771;
        c7771.m35378((InterfaceC16897) this);
        this.f72874.m35377((InterfaceC10193) this);
        this.f72871.m13355().m4066(this, new C15941(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ۘ᩻ۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51670(final C23194 c23194, C14121 c14121) {
        c23194.f72875 = c14121;
        c14121.m32101(c23194, new C3984(c23194, 2));
        c14121.m32102(c23194, (C6430) new InterfaceC3326() { // from class: l.ۘ᩻ۢ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                C23194.m51669(this.f16633, (Set) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51668(C23194 c23194, List list) {
        c23194.f72873 = list;
        c23194.f72874.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51669(C23194 c23194, Set set) {
        HashSet hashSetM35392 = c23194.f72874.m35392();
        c23194.f72874.m35371(1, set);
        c23194.f72874.m35374(hashSetM35392);
        c23194.f72874.notifyDataSetChanged();
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onViewCreated(View view, Bundle bundle) {
        C14849 c14849 = (C14849) view.findViewById(R.id.MT_Protector);
        this.f72872 = c14849;
        c14849.setTag("RecyclerView1");
        this.f72872.setAdapter(this.f72874);
    }

    @Override // p067l.ComponentCallbacksC11117
    public final void onDestroyView() {
        super.onDestroyView();
        this.f72872.setAdapter(null);
        this.f72872 = null;
    }

    @Override // p067l.InterfaceC16897
    /* JADX INFO: renamed from: ۧ */
    public final void mo18532(C18498 c18498) {
        String strM42048 = c18498.m42048();
        C7050.m16213(new RunnableC24698(2, this, strM42048), 500L);
        ((ActivityC18686) requireActivity()).m42588(strM42048, (C20699) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m51667(C23194 c23194, String str) {
        C14121 c14121 = c23194.f72875;
        if (c14121 != null) {
            c14121.m32087(str);
        }
    }

    @Override // p067l.InterfaceC10193
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18531(final C18498 c18498) {
        if (!c18498.m42050()) {
            return false;
        }
        C1898 c1898 = new C1898(requireContext(), c18498.m42045(), 0);
        final C24375 c24375 = new C24375(c1898, c18498.m42048(), true);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50638().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c1898.m50636(new InterfaceC1583() { // from class: l.ۖ᩻ۢ
            @Override // p067l.InterfaceC1583
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C23194.m51671(this.f11921, c24375, c18498, menuItem);
                return true;
            }
        });
        this.f72872.suppressLayout(true);
        c1898.m50635(new C5171(6, this));
        c1898.m50639();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51671(C23194 c23194, C24375 c24375, C18498 c18498, MenuItem menuItem) {
        if (c24375.m53728(menuItem)) {
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            c23194.f72871.m13319(c18498.m42048());
            return;
        }
        ActivityC18686 activityC18686 = (ActivityC18686) c23194.requireActivity();
        try {
            String strM32115 = c23194.f72875.m32115(c18498.m42048());
            String strM42607 = activityC18686.m42607(c18498.m42048());
            C4345 c4345M8965 = C4345.m8965();
            c4345M8965.m8968(R.string.MT_Protector, strM32115);
            c4345M8965.m8972(R.string.MT_Protector, strM42607);
            c4345M8965.m8975(".smali");
            c4345M8965.m8966();
            c4345M8965.m8973(c18498.m42048());
            c4345M8965.m8967(R.string.MT_Protector);
            c4345M8965.m8974(c18498.m42044());
            c4345M8965.m8969(C11419.m26414(c18498.m42048()) + ".smali");
            c4345M8965.m8971(activityC18686);
        } catch (IOException e) {
            activityC18686.m12259(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
