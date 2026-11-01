package p067l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7141 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C9823 f18646;

    /* JADX INFO: renamed from: ۧ */
    public List f18647 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo16419(C4459 c4459);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo16421(String str);

    public AbstractC7141(C9823 c9823) {
        this.f18646 = c9823;
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4459(LayoutInflater.from(this.f18646.getContext()).inflate(R.layout.MT_Protector, viewGroup, false));
    }

    @Override // p067l.AbstractC21283
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C4459 c4459, int i) {
        final InterfaceC3621 interfaceC3621 = this.f18646.f27181;
        if (interfaceC3621 == null) {
            return;
        }
        if (i == 0) {
            mo16419(c4459);
            return;
        }
        final C20553 c20553 = (C20553) this.f18647.get(i - 1);
        final C15020 c15020M53834 = c20553.f63549.m53834();
        boolean z = interfaceC3621.mo6812().f38562.get(c15020M53834) != null && c20553.f63549.m53837(c20553.f63550);
        c4459.f10014.setText(c20553.f63551);
        c4459.f10013.setVisibility(z ? 0 : 4);
        c4459.itemView.setOnClickListener(new View.OnClickListener() { // from class: l.֡֨ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC3621 interfaceC3622 = interfaceC3621;
                if (interfaceC3622.mo6821(29)) {
                    C8315 c8315Mo31081 = interfaceC3622.mo6812().mo31081();
                    C20553 c20554 = c20553;
                    interfaceC3622.mo6801(c8315Mo31081.mo19202(new C14350(c15020M53834, AbstractC16192.m36873of((Object) Integer.valueOf(c20554.f63550)))).mo19200(c20554.f63549.m53836(), false).mo19204());
                    String str = c20554.f63551;
                    AbstractC7141 abstractC7141 = this.f3788;
                    abstractC7141.mo16421(str);
                    abstractC7141.f18646.f27197.dismiss();
                }
            }
        });
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        if (this.f18647.isEmpty()) {
            return 0;
        }
        return this.f18647.size() + 1;
    }
}
