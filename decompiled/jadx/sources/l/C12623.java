package l;

import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۫᩵᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12623 extends AbstractC19902 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f38040;

    public C12623(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f38040 = viewOnClickListenerC19121;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        ViewOnClickListenerC10507 viewOnClickListenerC10507 = (ViewOnClickListenerC10507) abstractC3255;
        C11233.m27805(viewOnClickListenerC10507, "holder");
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f38040;
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) viewOnClickListenerC19121.f60259.get(i);
        C11233.m27805(interfaceC17889, "<set-?>");
        viewOnClickListenerC10507.f31517 = interfaceC17889;
        viewOnClickListenerC10507.m26407().setText(interfaceC17889.getName());
        if (interfaceC17889.mo36983()) {
            viewOnClickListenerC10507.m26407().setTextColor(C21943.f70291);
        } else {
            viewOnClickListenerC10507.m26407().setTextColor(C21943.f70275);
        }
        if (interfaceC17889.mo36982()) {
            viewOnClickListenerC10507.m26410().setText("");
        } else {
            String strM40573 = C17283.m40573(interfaceC17889.getTime(), (viewOnClickListenerC19121.f60246 & 1) != 0, true);
            if (interfaceC17889.mo24437()) {
                strM40573 = C22870.m50967(strM40573, EnumC0121.f1143, C22927.m51020(interfaceC17889.getSize()));
            }
            viewOnClickListenerC10507.m26410().setText(strM40573);
        }
        C11813 icon = interfaceC17889.getIcon();
        if (icon != null) {
            viewOnClickListenerC10507.m26408().setImageDrawable(icon.m28878());
        }
        viewOnClickListenerC19121.f60264.m41440(viewOnClickListenerC10507);
        ViewOnClickListenerC19121.m44096(viewOnClickListenerC19121, viewOnClickListenerC10507);
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C11233.m27805(viewGroup, "parent");
        return new ViewOnClickListenerC10507(this.f38040, viewGroup);
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f38040.f60259.size();
    }
}
