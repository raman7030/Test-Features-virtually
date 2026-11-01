package p067l;

import android.view.View;
import bin.p000mt.plus.R;
import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15857 extends AbstractC7141 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C9823 f45932;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15857(C9823 c9823) {
        super(c9823);
        this.f45932 = c9823;
    }

    @Override // p067l.AbstractC7141
    /* JADX INFO: renamed from: ֫ */
    public final void mo16419(C4459 c4459) {
        c4459.f10014.setText(R.string.MT_Protector);
        InterfaceC3621 interfaceC3621 = this.f45932.f27181;
        interfaceC3621.getClass();
        c4459.f10013.setVisibility(m35993(interfaceC3621.mo6812()) ? 4 : 0);
        c4459.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9823 c9823 = this.f55358.f45932;
                if (c9823.f27181 == null || !c9823.f27181.mo6821(29)) {
                    return;
                }
                C13680 c13680Mo6812 = c9823.f27181.mo6812();
                InterfaceC3621 interfaceC3622 = c9823.f27181;
                String str = C5792.f14228;
                interfaceC3622.mo6801(c13680Mo6812.mo31081().mo19199(1).mo19200(1, false).mo19204());
                c9823.f27244.m38950(1, c9823.getResources().getString(R.string.MT_Protector));
                c9823.f27197.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m35993(C13680 c13680) {
        for (int i = 0; i < this.f18647.size(); i++) {
            if (c13680.f38562.containsKey(((C20553) this.f18647.get(i)).f63549.m53834())) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC7141
    /* JADX INFO: renamed from: ۧ */
    public final void mo16421(String str) {
        this.f45932.f27244.m38950(1, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m35994(List list) {
        this.f18647 = list;
        C9823 c9823 = this.f45932;
        InterfaceC3621 interfaceC3621 = c9823.f27181;
        interfaceC3621.getClass();
        C13680 c13680Mo6812 = interfaceC3621.mo6812();
        if (((AbstractCollection) list).isEmpty()) {
            c9823.f27244.m38950(1, c9823.getResources().getString(R.string.MT_Protector));
            return;
        }
        if (!m35993(c13680Mo6812)) {
            c9823.f27244.m38950(1, c9823.getResources().getString(R.string.MT_Protector));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C20553 c20553 = (C20553) list.get(i);
            if (c20553.f63549.m53837(c20553.f63550)) {
                c9823.f27244.m38950(1, c20553.f63551);
                return;
            }
        }
    }
}
