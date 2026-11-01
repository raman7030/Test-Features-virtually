package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܺᩳ */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public final class C1640 extends AbstractC1325 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC1815 f52740;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC1920 f52741;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f52742;

    public C1640(AbstractC1815 abstractC1815, String str, AbstractC1920 abstractC1920) {
        this.f52740 = abstractC1815;
        this.f52742 = str;
        this.f52741 = abstractC1920;
    }

    @Override // p067l.AbstractC1325
    /* JADX INFO: renamed from: ֫ */
    public final void mo10451(Object obj) throws Exception {
        AbstractC1815 abstractC1815 = this.f52740;
        HashMap map = abstractC1815.f65963;
        String str = this.f52742;
        Integer num = (Integer) map.get(str);
        AbstractC1920 abstractC1920 = this.f52741;
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
        this.f52740.m47356(this.f52742);
    }
}
