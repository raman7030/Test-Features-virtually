package p067l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۢۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11215 {

    /* JADX INFO: renamed from: ۧ */
    public int f31151;

    /* JADX INFO: renamed from: ܳ */
    public int f31152;

    /* JADX INFO: renamed from: ܿ */
    public C11215 f31154;

    /* JADX INFO: renamed from: ᩳ */
    public C11215 f31155;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C10544 f31156;

    /* JADX INFO: renamed from: ܽ */
    public LinkedList f31153 = new LinkedList();

    /* JADX INFO: renamed from: ֫ */
    public int f31150 = -1;

    public C11215(C10544 c10544, int i, int i2) {
        this.f31156 = c10544;
        this.f31154 = null;
        this.f31155 = null;
        this.f31152 = i;
        this.f31151 = i2;
        this.f31154 = null;
        this.f31155 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25904(C11215 c11215) {
        C11215 c11216 = this.f31154;
        c11216.f31155 = c11215;
        c11215.f31154 = c11216;
        this.f31154 = c11215;
        c11215.f31155 = this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11215 m25903(int i) {
        C11215 c11215 = new C11215(this.f31156, i, this.f31151);
        c11215.f31150 = this.f31150;
        c11215.f31153.addAll(this.f31153);
        C11215 c11216 = this.f31155;
        c11216.f31154 = c11215;
        c11215.f31155 = c11216;
        this.f31155 = c11215;
        c11215.f31154 = this;
        this.f31151 = i;
        return c11215;
    }
}
