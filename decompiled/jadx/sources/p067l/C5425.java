package p067l;

import java.util.ArrayList;
import net.p069sf.sevenzipjbinding.ISequentialInStream;
import net.p069sf.sevenzipjbinding.impl.OutItem;
import net.p069sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ۗۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5425 implements InterfaceC6847 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ String f12918;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC17043 f12919;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ long f12920;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ ArrayList f12921;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14812 f12922;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4045 f12923;

    @Override // p067l.InterfaceC6847
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C21600.m48802(this, i, outItemFactory);
    }

    public C5425(C14812 c14812, long j, AbstractC17043 abstractC17043, ArrayList arrayList, String str, C4045 c4045) {
        this.f12922 = c14812;
        this.f12920 = j;
        this.f12919 = abstractC17043;
        this.f12921 = arrayList;
        this.f12918 = str;
        this.f12923 = c4045;
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ֨֫ */
    public final C21171 mo11906() {
        ArrayList arrayList = this.f12921;
        AbstractC17043 abstractC17043 = this.f12919;
        long j = this.f12920;
        if (j != -1) {
            return new C21171(abstractC17043, j, new C6766(arrayList));
        }
        arrayList.add(abstractC17043);
        return new C21171(abstractC17043);
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ۘ */
    public final String mo11908() {
        return this.f12918;
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ᩳ */
    public final C5506 mo11909(int i) {
        return new C5506((C9467) this.f12923.f8893.get(i));
    }

    @Override // p067l.InterfaceC6847
    public final ISequentialInStream getStream(int i) {
        C9467 c9467 = (C9467) this.f12923.f8893.get(i);
        if (c9467.f25915) {
            return null;
        }
        this.f12922.mo13456(c9467.f25908);
        return new C6418(c9467.f25907);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f12922.mo3924();
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ֫ */
    public final void mo11907(int i) {
        this.f12922.m52469(i);
    }
}
