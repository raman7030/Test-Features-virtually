package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes3.dex */
public final class C3019 extends AbstractViewOnClickListenerC14239 {

    /* JADX INFO: renamed from: ۛ */
    public static final AbstractC17043 f5396;

    /* JADX INFO: renamed from: ۨ */
    public static final AbstractC17043 f5397;

    /* JADX INFO: renamed from: ۤ */
    public List f5398;

    /* JADX INFO: renamed from: ֫ */
    public static void m5111(C3019 c3019, C21126 c21126, C21126 c21127) {
        c3019.getClass();
        int bindingAdapterPosition = c21126.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c21127.getBindingAdapterPosition();
        C5522 c5522 = c3019.f40549;
        int iM12179 = (bindingAdapterPosition - c5522.m12179(c3019)) - 1;
        int iM121710 = (bindingAdapterPosition2 - c5522.m12179(c3019)) - 1;
        ArrayList arrayList = c3019.f40548;
        C8123.m18819(iM12179, iM121710, arrayList);
        c5522.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        String[] strArr = (String[]) C7480.stream(arrayList).map(new C9055()).toArray(new C22467());
        int i = C17344.f51730;
        C4081.m8188(new RunnableC10813(2, strArr), C17344.class, 1000L);
    }

    static {
        AbstractC17043 abstractC17043M38684 = C17853.f53285.m38684("projects");
        f5397 = abstractC17043M38684;
        f5396 = C17853.f53283.m38672().m38684("projects");
        if (abstractC17043M38684.mo25093()) {
            abstractC17043M38684.mo25503();
            abstractC17043M38684.mo25497();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3019(Main main, C5522 c5522) {
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        super(main, strM16224, strM16224, c5522);
        this.f5398 = Collections.EMPTY_LIST;
        m5112();
        main.m130().m26066(new RunnableC23763(2, this));
        main.getLifecycle().mo21806(new InterfaceC18749() { // from class: l.ۢ᩸ܳ
            @Override // p067l.InterfaceC18749
            /* JADX INFO: renamed from: ֫ */
            public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
                if (enumC24133 == EnumC24133.ON_RESUME) {
                    this.f32776.m5114();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m5114() {
        if (m5112()) {
            this.f40549.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m5112() {
        boolean z;
        List listM39327 = C17344.m39327(f5397, f5396);
        if (this.f5398.size() != listM39327.size() || !this.f5398.containsAll(listM39327)) {
            this.f5398 = listM39327;
            ArrayList arrayList = this.f40548;
            if (arrayList.isEmpty()) {
                z = true;
            } else {
                arrayList.clear();
                z = false;
            }
            Iterator it = listM39327.iterator();
            while (it.hasNext()) {
                arrayList.add(new C20455(this, this.f37526, (AbstractC17043) it.next()));
            }
            if (!z || !arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractViewOnClickListenerC14239
    /* JADX INFO: renamed from: ֫ */
    public final void mo5113(AbstractViewOnLongClickListenerC16250 abstractViewOnLongClickListenerC16250, int i) {
        C21126 c21126 = (C21126) abstractViewOnLongClickListenerC16250;
        C20455 c20455 = (C20455) this.f40548.get(i);
        c21126.f66394 = c20455;
        c21126.f47809.setText(c20455.f63179);
        c21126.f47806.setText(c20455.f63177);
        c21126.f47810.m28261(c20455.f63181);
        c21126.itemView.setOnClickListener(c20455);
        this.f40549.m12184((AbstractViewOnLongClickListenerC16250) c21126);
    }
}
