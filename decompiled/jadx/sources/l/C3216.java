package l;

import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ۗۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C3216 implements InterfaceC4712 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f10111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f10112;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f10113;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f10114;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13093 f10115;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1764 f10116;

    @Override // l.InterfaceC4712
    public final /* synthetic */ OutItem getItemInformation(int i, OutItemFactory outItemFactory) {
        return C20235.m46482(this, i, outItemFactory);
    }

    public C3216(C13093 c13093, long j, AbstractC15440 abstractC15440, ArrayList arrayList, String str, C1764 c1764) {
        this.f10115 = c13093;
        this.f10113 = j;
        this.f10112 = abstractC15440;
        this.f10114 = arrayList;
        this.f10111 = str;
        this.f10116 = c1764;
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C19783 mo9859() {
        ArrayList arrayList = this.f10114;
        AbstractC15440 abstractC15440 = this.f10112;
        long j = this.f10113;
        if (j != -1) {
            return new C19783(abstractC15440, j, new C4627(arrayList));
        }
        arrayList.add(abstractC15440);
        return new C19783(abstractC15440);
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String mo9861() {
        return this.f10111;
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3301 mo9862(int i) {
        return new C3301((C7469) this.f10116.f6117.get(i));
    }

    @Override // l.InterfaceC4712
    public final ISequentialInStream getStream(int i) {
        C7469 c7469 = (C7469) this.f10116.f6117.get(i);
        if (c7469.f23002) {
            return null;
        }
        this.f10115.mo11520(c7469.f22995);
        return new C4260(c7469.f22994);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f10115.mo1526();
    }

    @Override // l.InterfaceC4712
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9860(int i) {
        this.f10115.m50129(i);
    }
}
