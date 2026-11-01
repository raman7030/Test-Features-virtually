package p067l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۤܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8IT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12207 implements InterfaceC8640 {

    /* JADX INFO: renamed from: ֫ */
    public C10307 f34116;

    /* JADX INFO: renamed from: ۜ */
    public final C7101 f34117;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC18698 f34118;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayDeque f34119;

    /* JADX INFO: renamed from: ܽ */
    public Executor f34120;

    /* JADX INFO: renamed from: ܿ */
    public long f34121;

    /* JADX INFO: renamed from: ᩳ */
    public Surface f34122;

    /* JADX INFO: renamed from: ᩷ */
    public final C13807 f34123;

    /* JADX INFO: renamed from: ᩻ */
    public InterfaceC23865 f34124;

    @Override // p067l.InterfaceC8640
    public final boolean isInitialized() {
        return true;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10816() {
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10828(C10307 c10307) {
        return true;
    }

    public C12207(C7101 c7101, InterfaceC17980 interfaceC17980) {
        this.f34117 = c7101;
        c7101.m16347(interfaceC17980);
        this.f34123 = new C13807(new C14218(this), c7101);
        this.f34119 = new ArrayDeque();
        this.f34116 = new C3601().m6672();
        this.f34121 = -9223372036854775807L;
        this.f34118 = InterfaceC18698.f55838;
        this.f34120 = new ExecutorC22936();
        this.f34124 = new C23606();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۢ */
    public final void mo10832() {
        this.f34117.m16353();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10840() {
        this.f34117.m16355();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10825(InterfaceC18698 interfaceC18698, Executor executor) {
        this.f34118 = interfaceC18698;
        this.f34120 = executor;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10839() {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۧ */
    public final void mo10833(boolean z) {
        if (z) {
            this.f34117.m16354();
        }
        this.f34123.m31458();
        this.f34119.clear();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10829(boolean z) {
        return this.f34117.m16348(z);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ᩻ */
    public final void mo10841() {
        this.f34123.m31464();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo10834() {
        return this.f34123.m31463();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ܿ */
    public final Surface mo10838() {
        Surface surface = this.f34122;
        C23877.m52958(surface);
        return surface;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10826(InterfaceC23865 interfaceC23865) {
        this.f34124 = interfaceC23865;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10817(float f) {
        this.f34117.m16349(f);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10822(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10819(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10821(Surface surface, C18532 c18532) {
        this.f34122 = surface;
        this.f34117.m16346(surface);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۡ */
    public final void mo10831() {
        this.f34122 = null;
        this.f34117.m16346((Surface) null);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10818(int i) {
        this.f34117.m16350(i);
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10824(C10307 c10307, long j, int i, List list) {
        C23877.m52960(list.isEmpty());
        int i2 = c10307.f28547;
        int i3 = c10307.f28523;
        C10307 c10308 = this.f34116;
        int i4 = c10308.f28547;
        C13807 c13807 = this.f34123;
        if (i2 != i4 || i3 != c10308.f28523) {
            c13807.m31459(i2, i3);
        }
        float f = c10307.f28510;
        if (f != this.f34116.f28510) {
            this.f34117.m16344(f);
        }
        this.f34116 = c10307;
        if (j != this.f34121) {
            c13807.m31460(i, j);
            this.f34121 = j;
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ۜ */
    public final void mo10830() {
        this.f34117.m16343();
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10827(long j, InterfaceC16015 interfaceC16015) {
        this.f34119.add(interfaceC16015);
        this.f34123.m31461(j);
        this.f34120.execute(new Runnable() { // from class: l.᩶ܳۧ
            @Override // java.lang.Runnable
            public final void run() {
                this.f68089.f34118.mo27042();
            }
        });
        return true;
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ֫ */
    public final void mo10820(long j, long j2) {
        try {
            this.f34123.m31462(j, j2);
        } catch (C19735 e) {
            throw new C24733(e, this.f34116);
        }
    }

    @Override // p067l.InterfaceC8640
    /* JADX INFO: renamed from: ܽ */
    public final void mo10837(boolean z) {
        this.f34117.m16351(z);
    }
}
