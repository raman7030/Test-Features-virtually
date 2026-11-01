package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8470 implements InterfaceC18755 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ViewOnClickListenerC20541 f22734;

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo6353(String str) {
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6351(String str) {
        List list;
        C13045.m29867(str, "filterText");
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f22734;
        if (C13045.m29864((Object) viewOnClickListenerC20541.f63470, (Object) str)) {
            return;
        }
        viewOnClickListenerC20541.f63470 = str;
        if (str.length() == 0) {
            list = viewOnClickListenerC20541.f63494;
        } else {
            List list2 = viewOnClickListenerC20541.f63494;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                InterfaceC19370 interfaceC19370 = (InterfaceC19370) obj;
                if (!interfaceC19370.mo39148()) {
                    String name = interfaceC19370.getName();
                    C13045.m29865(name, "getName(...)");
                    if (C5235.m11295((CharSequence) name, (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC20541.f63491 = list;
        viewOnClickListenerC20541.f63496.m43688(false);
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6352(EnumC16072 enumC16072) {
        C13045.m29867(enumC16072, C0172c.f705a);
        if (enumC16072.m36584()) {
            return;
        }
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f22734;
        if (viewOnClickListenerC20541.f63470.length() > 0) {
            viewOnClickListenerC20541.f63470 = "";
            viewOnClickListenerC20541.f63491 = viewOnClickListenerC20541.f63494;
            viewOnClickListenerC20541.f63496.m43688(false);
        }
    }

    public C8470(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        this.f22734 = viewOnClickListenerC20541;
    }
}
