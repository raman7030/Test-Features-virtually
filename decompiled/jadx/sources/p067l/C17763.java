package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺ᩸ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5II */
/* JADX INFO: loaded from: classes4.dex */
public final class C17763 extends C5995 {

    /* JADX INFO: renamed from: ۡ */
    public ArrayList f53052;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f53053;

    /* JADX INFO: renamed from: ֫ */
    public final void m40365(AbstractC11059 abstractC11059) {
        this.f53053.add(abstractC11059);
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ܽ */
    public final void mo13445(int i, C13366 c13366) {
        m40365(new C22459(c13366));
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ֫ */
    public final void mo13439(int i, String str) {
        if (this.f53052 == null) {
            this.f53052 = new ArrayList();
        }
        while (this.f53052.size() <= i) {
            this.f53052.add(null);
        }
        this.f53052.set(i, str);
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ۧ */
    public final void mo13443(int i, C13366 c13366) {
        C25140 c25140 = new C25140(c13366);
        c25140.f80472 = i;
        m40365(c25140);
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ֫ */
    public final void mo13441(int i, C13366 c13366, String str, String str2, String str3) {
        m40365(new C11730(c13366));
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ֫ */
    public final void mo13440(int i, C13366 c13366) {
        m40365(new C19105(c13366));
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ۧ */
    public final void mo13444(C13366 c13366) {
        m40365(new C9047(c13366));
    }

    @Override // p067l.C5995
    /* JADX INFO: renamed from: ֫ */
    public final void mo13442(C13366 c13366) {
        m40365(new C16422(c13366));
    }
}
