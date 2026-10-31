package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2685 extends AbstractC9741 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19619 f8409;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21735 f8410;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f8411;

    public C2685(AbstractC19619 abstractC19619, String str, AbstractC21735 abstractC21735) {
        this.f8409 = abstractC19619;
        this.f8411 = str;
        this.f8410 = abstractC21735;
    }

    @Override // l.AbstractC9741
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8405(Object obj) throws Exception {
        AbstractC19619 abstractC19619 = this.f8409;
        HashMap map = abstractC19619.f63342;
        String str = this.f8411;
        Integer num = (Integer) map.get(str);
        AbstractC21735 abstractC21735 = this.f8410;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8404() {
        this.f8409.m45060(this.f8411);
    }
}
