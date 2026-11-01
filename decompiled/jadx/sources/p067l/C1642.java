package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܺ᩵ */
/* JADX INFO: compiled from: J5WP */
/* JADX INFO: loaded from: classes4.dex */
public final class C1642 extends AbstractC1082 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C0977 f52863;

    public C1642(C0977 c0977) {
        this.f52863 = c0977;
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ܽ */
    public final int mo14309() {
        return this.f52863.f13653;
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14302(int i, int i2) {
        return this.f52863.f13654[(i << 1) + i2];
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final int mo14301(Object obj) {
        return this.f52863.m12518(obj);
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ۧ */
    public final int mo14307(Object obj) {
        return this.f52863.m12519(obj);
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ۧ */
    public final Map mo14308() {
        return this.f52863;
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final void mo14306(Object obj, Object obj2) {
        this.f52863.put(obj, obj2);
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final void mo14305(int i) {
        this.f52863.m12523(i);
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final void mo14304() {
        this.f52863.clear();
    }

    @Override // p067l.AbstractC1082
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14303(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f52863.f13654;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}
