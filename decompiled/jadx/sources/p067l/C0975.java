package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۖᩳ */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes2.dex */
public final class C0975 extends AbstractC1325 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC1815 f11203;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC1920 f11204;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f11205;

    public C0975(AbstractC1815 abstractC1815, String str, AbstractC1920 abstractC1920) {
        this.f11203 = abstractC1815;
        this.f11205 = str;
        this.f11204 = abstractC1920;
    }

    @Override // p067l.AbstractC1325
    /* JADX INFO: renamed from: ֫ */
    public final void mo10451(Object obj) throws Exception {
        AbstractC1815 abstractC1815 = this.f11203;
        HashMap map = abstractC1815.f65963;
        String str = this.f11205;
        Integer num = (Integer) map.get(str);
        AbstractC1920 abstractC1920 = this.f11204;
        if (num == null) {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1920 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
        abstractC1815.f65965.add(str);
        try {
            abstractC1815.mo30590(num.intValue(), abstractC1920, obj);
        } catch (Exception e) {
            abstractC1815.f65965.remove(str);
            throw e;
        }
    }

    @Override // p067l.AbstractC1325
    /* JADX INFO: renamed from: ֫ */
    public final void mo10450() {
        this.f11203.m47356(this.f11205);
    }
}
