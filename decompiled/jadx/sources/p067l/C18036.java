package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D9TI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18036 implements InterfaceC12916 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C19378 f53854;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC17043 f53855;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC19370 f53856;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ArrayList f53857;

    @Override // p067l.InterfaceC12916
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo12627() {
        return C4198.m8510(this);
    }

    public C18036(C19378 c19378, ArrayList arrayList, InterfaceC19370 interfaceC19370, AbstractC17043 abstractC17043) {
        this.f53854 = c19378;
        this.f53857 = arrayList;
        this.f53856 = interfaceC19370;
        this.f53855 = abstractC17043;
    }

    @Override // p067l.InterfaceC12916
    public final InputStream getInputStream() throws IOException {
        ArrayList arrayList = this.f53857;
        boolean zIsEmpty = arrayList.isEmpty();
        AbstractC17043 abstractC17043 = this.f53855;
        if (zIsEmpty) {
            this.f53854.f57855.m23504(this.f53856, abstractC17043, false, (InterfaceC7717) new C12673());
        }
        InputStream inputStreamMo29987 = abstractC17043.mo29987();
        arrayList.add(inputStreamMo29987);
        return inputStreamMo29987;
    }

    @Override // p067l.InterfaceC12916
    public final long length() {
        return this.f53856.getSize();
    }
}
