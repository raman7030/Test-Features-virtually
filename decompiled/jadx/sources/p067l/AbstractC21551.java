package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩶۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21551 implements InterfaceC16855 {

    /* JADX INFO: renamed from: ֫ */
    public final Map f67967;

    /* JADX INFO: renamed from: ۧ */
    public int f67968 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final String f67969;

    /* JADX INFO: renamed from: ᩳ */
    public final int f67970;

    public AbstractC21551(Map map, int i, String str) {
        this.f67969 = str;
        this.f67970 = i;
        this.f67967 = map;
    }

    @Override // p067l.InterfaceC16855
    public final String name() {
        return this.f67969;
    }

    @Override // p067l.InterfaceC16855
    public final int start() {
        return this.f67970;
    }

    @Override // p067l.InterfaceC16855
    public final int end() {
        return this.f67968;
    }

    @Override // p067l.InterfaceC16855
    public Map attributes() {
        return this.f67967;
    }

    @Override // p067l.InterfaceC16855
    public final boolean isClosed() {
        return this.f67968 > -1;
    }
}
