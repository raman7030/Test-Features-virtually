package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14193 extends AbstractC5022 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f42845;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14193(C7844 c7844) {
        super(c7844);
        this.f42845 = c7844;
    }

    @Override // l.AbstractC5022
    /* JADX INFO: renamed from: ֫ */
    public final void mo14515(C2200 c2200) {
        c2200.f7229.setText(R.string.MT_Protector);
        InterfaceC1318 interfaceC1318 = this.f42845.f24265;
        interfaceC1318.getClass();
        c2200.f7228.setVisibility(m33861(interfaceC1318.mo4580()) ? 4 : 0);
        c2200.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7844 c7844 = this.f52178.f42845;
                if (c7844.f24265 == null || !c7844.f24265.mo4589(29)) {
                    return;
                }
                C11902 c11902Mo4580 = c7844.f24265.mo4580();
                InterfaceC1318 interfaceC1319 = c7844.f24265;
                String str = C3603.f11424;
                interfaceC1319.mo4569(c11902Mo4580.mo29029().mo17261(1).mo17262(1, false).mo17266());
                c7844.f24328.m36789(1, c7844.getResources().getString(R.string.MT_Protector));
                c7844.f24281.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m33861(C11902 c11902) {
        for (int i = 0; i < this.f15815.size(); i++) {
            if (c11902.f35552.containsKey(((C19134) this.f15815.get(i)).f60317.m51438())) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC5022
    /* JADX INFO: renamed from: ۧ */
    public final void mo14517(String str) {
        this.f42845.f24328.m36789(1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33862(List list) {
        this.f15815 = list;
        C7844 c7844 = this.f42845;
        InterfaceC1318 interfaceC1318 = c7844.f24265;
        interfaceC1318.getClass();
        C11902 c11902Mo4580 = interfaceC1318.mo4580();
        if (((AbstractCollection) list).isEmpty()) {
            c7844.f24328.m36789(1, c7844.getResources().getString(R.string.MT_Protector));
            return;
        }
        if (!m33861(c11902Mo4580)) {
            c7844.f24328.m36789(1, c7844.getResources().getString(R.string.MT_Protector));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C19134 c19134 = (C19134) list.get(i);
            if (c19134.f60317.m51441(c19134.f60318)) {
                c7844.f24328.m36789(1, c19134.f60319);
                return;
            }
        }
    }
}
