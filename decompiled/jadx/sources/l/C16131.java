package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16131 extends AbstractC4843 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2727 f49697;

    public C16131(C2727 c2727) {
        this.f49697 = c2727;
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ܽ */
    public final int mo12419() {
        return this.f49697.f10850;
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12412(int i, int i2) {
        return this.f49697.f10851[(i << 1) + i2];
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final int mo12411(Object obj) {
        return this.f49697.m10495(obj);
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ۧ */
    public final int mo12417(Object obj) {
        return this.f49697.m10496(obj);
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ۧ */
    public final Map mo12418() {
        return this.f49697;
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final void mo12416(Object obj, Object obj2) {
        this.f49697.put(obj, obj2);
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final void mo12415(int i) {
        this.f49697.m10500(i);
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final void mo12414() {
        this.f49697.clear();
    }

    @Override // l.AbstractC4843
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12413(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f49697.f10851;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
