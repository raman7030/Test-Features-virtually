package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D76O */
/* JADX INFO: loaded from: classes.dex */
public final class C22531 implements InterfaceC1795 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16611 f72904;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f72905;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17178 f72906;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f72907;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f72908;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50529(C17178 c17178, ArrayList arrayList, C16611 c16611, long j) {
        this.f72906 = c17178;
        this.f72905 = arrayList;
        this.f72904 = c16611;
        this.f72907 = j;
        this.f72908 = null;
    }

    @Override // l.InterfaceC1795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5981(EnumC0841 enumC0841, long j) {
        if (j != this.f72907) {
            return true;
        }
        if (this.f72908 == null) {
            this.f72908 = this.f72904.f51043.getType() + "->" + C8751.m22638(this.f72904);
        }
        this.f72905.add(new C18298("dex", "resource_id", "dex_method", this.f72908, enumC0841.f3315 + " " + this.f72906.f52650, null, null, null, null, null, null));
        return this.f72905.size() < this.f72906.f52647;
    }
}
