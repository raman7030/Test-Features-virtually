package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public final class C16089 extends AbstractC9741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19619 f49577;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21735 f49578;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f49579;

    public C16089(AbstractC19619 abstractC19619, String str, AbstractC21735 abstractC21735) {
        this.f49577 = abstractC19619;
        this.f49579 = str;
        this.f49578 = abstractC21735;
    }

    @Override // l.AbstractC9741
    /* JADX INFO: renamed from: ֫ */
    public final void mo8405(Object obj) throws Exception {
        AbstractC19619 abstractC19619 = this.f49577;
        HashMap map = abstractC19619.f63342;
        String str = this.f49579;
        Integer num = (Integer) map.get(str);
        AbstractC21735 abstractC21735 = this.f49578;
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC21735 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        abstractC19619.f63344.add(str);
        try {
            abstractC19619.mo28542(num.intValue(), abstractC21735, obj);
        } catch (Exception e) {
            abstractC19619.f63344.remove(str);
            throw e;
        }
    }

    @Override // l.AbstractC9741
    /* JADX INFO: renamed from: ֫ */
    public final void mo8404() {
        this.f49577.m45060(this.f49579);
    }
}
