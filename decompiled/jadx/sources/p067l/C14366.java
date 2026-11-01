package p067l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۫᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14366 extends AbstractC21283 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC20541 f41066;

    public C14366(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        this.f41066 = viewOnClickListenerC20541;
    }

    @Override // p067l.AbstractC21283
    public final void onBindViewHolder(AbstractC5462 abstractC5462, int i) {
        ViewOnClickListenerC12355 viewOnClickListenerC12355 = (ViewOnClickListenerC12355) abstractC5462;
        C13045.m29867(viewOnClickListenerC12355, "holder");
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f41066;
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) viewOnClickListenerC20541.f63491.get(i);
        C13045.m29867(interfaceC19370, "<set-?>");
        viewOnClickListenerC12355.f34479 = interfaceC19370;
        viewOnClickListenerC12355.m28440().setText(interfaceC19370.getName());
        if (interfaceC19370.mo39149()) {
            viewOnClickListenerC12355.m28440().setTextColor(C23223.f73002);
        } else {
            viewOnClickListenerC12355.m28440().setTextColor(C23223.f72986);
        }
        if (interfaceC19370.mo39148()) {
            viewOnClickListenerC12355.m28443().setText("");
        } else {
            String strM42824 = C18794.m42824(interfaceC19370.getTime(), (viewOnClickListenerC20541.f63478 & 1) != 0, true);
            if (interfaceC19370.mo26449()) {
                strM42824 = C24104.m53357(strM42824, EnumC2483.f3919, C24158.m53411(interfaceC19370.getSize()));
            }
            viewOnClickListenerC12355.m28443().setText(strM42824);
        }
        C13596 icon = interfaceC19370.getIcon();
        if (icon != null) {
            viewOnClickListenerC12355.m28441().setImageDrawable(icon.m30927());
        }
        viewOnClickListenerC20541.f63496.m43686(viewOnClickListenerC12355);
        ViewOnClickListenerC20541.m46390(viewOnClickListenerC20541, viewOnClickListenerC12355);
    }

    @Override // p067l.AbstractC21283
    public final AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13045.m29867(viewGroup, "parent");
        return new ViewOnClickListenerC12355(this.f41066, viewGroup);
    }

    @Override // p067l.AbstractC21283
    public final int getItemCount() {
        return this.f41066.f63491.size();
    }
}
