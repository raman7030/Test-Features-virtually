package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P6LY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11826 implements InterfaceC21214 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f32995;

    /* JADX INFO: renamed from: ۧ */
    public final C13167 f32996;

    /* JADX INFO: renamed from: ܽ */
    public final C14487 f32997 = new C14487();

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C7802 f32998;

    public C11826(C7802 c7802, C13167 c13167) {
        this.f32998 = c7802;
        this.f32996 = c13167;
        this.f32995 = new ArrayList(c7802.f20483.size());
        Iterator it = c7802.f20483.iterator();
        while (it.hasNext()) {
            this.f32995.add(((InterfaceC9813) it.next()).create());
        }
        Iterator it2 = c7802.f20484.iterator();
        while (it2.hasNext()) {
            this.f32997.m33137(((InterfaceC6461) it2.next()).mo10903(this));
        }
    }

    @Override // p067l.InterfaceC21214
    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap mo27091(AbstractC2555 abstractC2555, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = this.f32995.iterator();
        while (it.hasNext()) {
            ((InterfaceC3107) it.next()).mo5288(abstractC2555, str, linkedHashMap);
        }
        return linkedHashMap;
    }

    @Override // p067l.InterfaceC21214
    /* JADX INFO: renamed from: ֫ */
    public final C13167 mo27092() {
        return this.f32996;
    }

    @Override // p067l.InterfaceC21214
    /* JADX INFO: renamed from: ֫ */
    public final void mo27093(AbstractC2555 abstractC2555) {
        this.f32997.m33139(abstractC2555);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m27095(AbstractC2555 abstractC2555) {
        this.f32997.m33138(abstractC2555);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27094(AbstractC2555 abstractC2555) {
        this.f32997.m33136(abstractC2555);
    }
}
