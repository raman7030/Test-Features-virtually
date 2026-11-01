package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import net.p069sf.sevenzipjbinding.ISequentialInStream;
import net.p069sf.sevenzipjbinding.impl.OutItem;
import net.p069sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.۫ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C14142 implements InterfaceC6847 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ ArrayList f40171;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ long f40172;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC17043 f40173;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f40174;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12131 f40175;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C4045 f40176;

    @Override // p067l.InterfaceC6847
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C21600.m48802(this, i, outItemFactory);
    }

    public C14142(C12131 c12131, long j, AbstractC17043 abstractC17043, ArrayList arrayList, String str, C4045 c4045) {
        this.f40175 = c12131;
        this.f40172 = j;
        this.f40173 = abstractC17043;
        this.f40171 = arrayList;
        this.f40174 = str;
        this.f40176 = c4045;
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ֨֫ */
    public final C21171 mo11906() {
        ArrayList arrayList = this.f40171;
        AbstractC17043 abstractC17043 = this.f40173;
        long j = this.f40172;
        if (j != -1) {
            return new C21171(abstractC17043, j, new C6766(arrayList));
        }
        arrayList.add(abstractC17043);
        return new C21171(abstractC17043);
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ۘ */
    public final String mo11908() {
        return this.f40174;
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ᩳ */
    public final C5506 mo11909(int i) {
        return new C5506((C9467) this.f40176.f8893.get(i));
    }

    @Override // p067l.InterfaceC6847
    public final ISequentialInStream getStream(int i) {
        C9467 c9467 = (C9467) this.f40176.f8893.get(i);
        if (c9467.f25915) {
            return null;
        }
        C12131 c12131 = this.f40175;
        c12131.m13472(R.string.MT_Protector);
        c12131.mo13456(c9467.f25908);
        return new C6418(c9467.f25907);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f40175.mo3924();
    }

    @Override // p067l.InterfaceC6847
    /* JADX INFO: renamed from: ֫ */
    public final void mo11907(int i) {
        this.f40175.mo13474(i);
    }
}
