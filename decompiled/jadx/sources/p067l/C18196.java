package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4XC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18196 implements InterfaceC9915 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C24902 f54325;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ArrayList f54326;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19736 f54327;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC10348[] f54328;

    @Override // p067l.InterfaceC7233
    /* JADX INFO: renamed from: ֫ */
    public final C19736 mo13240(C19736 c19736, C23089 c23089) {
        return c19736;
    }

    public C18196(C19736 c19736, C24902 c24902, AbstractC10348[] abstractC10348Arr, ArrayList arrayList) {
        this.f54327 = c19736;
        this.f54325 = c24902;
        this.f54328 = abstractC10348Arr;
        this.f54326 = arrayList;
    }

    @Override // p067l.InterfaceC3209
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo5549(C19736 c19736) {
        if (this.f54327 != c19736) {
            return c19736;
        }
        C9737 c9737 = new C9737(this.f54328, this.f54325.f79528);
        this.f54326.add(c9737);
        return c9737;
    }
}
