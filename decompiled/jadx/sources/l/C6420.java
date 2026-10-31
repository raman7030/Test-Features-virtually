package l;

import com.alipay.sdk.m.n.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6420 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f19862;

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4107(String str) {
        List list;
        C11233.m27805(str, "filterText");
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f19862;
        if (C11233.m27802((Object) viewOnClickListenerC19121.f60238, (Object) str)) {
            return;
        }
        viewOnClickListenerC19121.f60238 = str;
        if (str.length() == 0) {
            list = viewOnClickListenerC19121.f60262;
        } else {
            List list2 = viewOnClickListenerC19121.f60262;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
                if (!interfaceC17889.mo36982()) {
                    String name = interfaceC17889.getName();
                    C11233.m27803(name, "getName(...)");
                    if (C3016.m9237((CharSequence) name, (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list = arrayList;
        }
        viewOnClickListenerC19121.f60259 = list;
        viewOnClickListenerC19121.f60264.m41442(false);
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        C11233.m27805(enumC14419, c.a);
        if (enumC14419.m34451()) {
            return;
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f19862;
        if (viewOnClickListenerC19121.f60238.length() > 0) {
            viewOnClickListenerC19121.f60238 = "";
            viewOnClickListenerC19121.f60259 = viewOnClickListenerC19121.f60262;
            viewOnClickListenerC19121.f60264.m41442(false);
        }
    }

    public C6420(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f19862 = viewOnClickListenerC19121;
    }
}
