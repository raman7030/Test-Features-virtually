package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5II */
/* JADX INFO: loaded from: classes4.dex */
public final class C16198 extends C3816 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f49886;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f49887;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38153(AbstractC9144 abstractC9144) {
        this.f49887.add(abstractC9144);
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ܽ */
    public final void mo11509(int i, C11572 c11572) {
        m38153(new C21139(c11572));
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ֫ */
    public final void mo11503(int i, String str) {
        if (this.f49886 == null) {
            this.f49886 = new ArrayList();
        }
        while (this.f49886.size() <= i) {
            this.f49886.add(null);
        }
        this.f49886.set(i, str);
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ۧ */
    public final void mo11507(int i, C11572 c11572) {
        C23960 c23960 = new C23960(c11572);
        c23960.f77720 = i;
        m38153(c23960);
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ֫ */
    public final void mo11505(int i, C11572 c11572, String str, String str2, String str3) {
        m38153(new C9850(c11572));
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ֫ */
    public final void mo11504(int i, C11572 c11572) {
        m38153(new C17610(c11572));
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ۧ */
    public final void mo11508(C11572 c11572) {
        m38153(new C7027(c11572));
    }

    @Override // l.C3816
    /* JADX INFO: renamed from: ֫ */
    public final void mo11506(C11572 c11572) {
        m38153(new C14787(c11572));
    }
}
