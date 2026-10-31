package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.۫ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C12388 implements InterfaceC4712 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f37154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f37155;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f37156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f37157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10272 f37158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1764 f37159;

    @Override // l.InterfaceC4712
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C20235.m46482(this, i, outItemFactory);
    }

    public C12388(C10272 c10272, long j, AbstractC15440 abstractC15440, ArrayList arrayList, String str, C1764 c1764) {
        this.f37158 = c10272;
        this.f37155 = j;
        this.f37156 = abstractC15440;
        this.f37154 = arrayList;
        this.f37157 = str;
        this.f37159 = c1764;
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ֨֫ */
    public final C19783 mo9859() {
        ArrayList arrayList = this.f37154;
        AbstractC15440 abstractC15440 = this.f37156;
        long j = this.f37155;
        if (j != -1) {
            return new C19783(abstractC15440, j, new C4627(arrayList));
        }
        arrayList.add(abstractC15440);
        return new C19783(abstractC15440);
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ۘ */
    public final String mo9861() {
        return this.f37157;
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ᩳ */
    public final C3301 mo9862(int i) {
        return new C3301((C7469) this.f37159.f6117.get(i));
    }

    @Override // l.InterfaceC4712
    public final ISequentialInStream getStream(int i) {
        C7469 c7469 = (C7469) this.f37159.f6117.get(i);
        if (c7469.f23002) {
            return null;
        }
        C10272 c10272 = this.f37158;
        c10272.m11536(R.string.MT_Protector);
        c10272.mo11520(c7469.f22995);
        return new C4260(c7469.f22994);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f37158.mo1526();
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ֫ */
    public final void mo9860(int i) {
        this.f37158.mo11538(i);
    }
}
