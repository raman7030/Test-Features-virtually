package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8943 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C4697 f24235;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f24236 = new ArrayList(2);

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC5375 f24237;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ArrayList f24238;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
    }

    public C8943(C22355 c22355, C4697 c4697, AbstractC5375 abstractC5375, ArrayList arrayList) {
        this.f24235 = c4697;
        this.f24237 = abstractC5375;
        this.f24238 = arrayList;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f24235.m9965(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws Exception {
        ArrayList arrayList = this.f24238;
        InterfaceC19370 interfaceC19370 = (InterfaceC19370) arrayList.get(0);
        InterfaceC19370 interfaceC19371 = (InterfaceC19370) arrayList.get(1);
        String path = interfaceC19370.getPath();
        String path2 = interfaceC19371.getPath();
        String strM26403 = C11419.m26403(interfaceC19370.getParent(), System.currentTimeMillis() + ".tmp");
        AbstractC5375 abstractC5375 = this.f24237;
        String strMo11753 = abstractC5375.mo11753(strM26403);
        abstractC5375.mo11728(path, strMo11753);
        String strM26414 = C11419.m26414(strMo11753);
        ArrayList arrayList2 = this.f24236;
        arrayList2.add(strM26414);
        try {
            abstractC5375.mo11728(path2, path);
            arrayList2.add(C11419.m26414(path));
            try {
                abstractC5375.mo11728(strMo11753, path2);
                arrayList2.add(C11419.m26414(path2));
                arrayList2.remove(C11419.m26414(strMo11753));
            } catch (Exception e) {
                if (abstractC5375.mo11740(path, path2)) {
                    arrayList2.remove(C11419.m26414(path));
                    if (abstractC5375.mo11740(strMo11753, path)) {
                        arrayList2.remove(C11419.m26414(strMo11753));
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            if (abstractC5375.mo11740(strMo11753, path)) {
                arrayList2.remove(C11419.m26414(strMo11753));
            }
            throw e2;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f24235.m9965().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
        ArrayList arrayList = this.f24236;
        if (!arrayList.isEmpty()) {
            C4697 c4697 = this.f24235;
            c4697.m9954();
            c4697.m9956(arrayList);
            c4697.m9953();
        }
        C17127.m38755(this.f24237.mo11732());
    }
}
