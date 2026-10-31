package l;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H52M */
/* JADX INFO: loaded from: classes3.dex */
public final class C5987 extends AbstractC10988 implements InterfaceC16053 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f18424 = EnumC0841.f3126;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractCollection f18425;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        return mo3975().f3315;
    }

    public C5987(ArrayList arrayList) {
        super(f18424);
        if (arrayList == null) {
            this.f18425 = AbstractC14545.of();
        } else {
            this.f18425 = C7470.m20014(arrayList, new C10221(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.InterfaceC17301
    /* JADX INFO: renamed from: ۙ */
    public final List mo8107() {
        return this.f18425;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // l.AbstractC7479, l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public final int mo3974() {
        return (this.f18425.size() * 4) + 2;
    }

    @Override // l.AbstractC7479
    /* JADX INFO: renamed from: ۫ */
    public final EnumC3664 mo1791() {
        return f18424.f3316;
    }
}
