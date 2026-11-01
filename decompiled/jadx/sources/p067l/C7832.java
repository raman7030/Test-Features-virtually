package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8RT */
/* JADX INFO: loaded from: classes2.dex */
public final class C7832 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC16716 f20525;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21775 f20526;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC12878 f20528;

    /* JADX INFO: renamed from: ᩻ */
    public C11915 f20531;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f20529 = new HashMap();

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f20530 = new HashMap();

    /* JADX INFO: renamed from: ܳ */
    public boolean f20527 = true;

    public C7832(InterfaceC21775 interfaceC21775, C11915 c11915) {
        this.f20526 = interfaceC21775;
        this.f20531 = c11915;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10770 m18092(int i) {
        InterfaceC8205 interfaceC8205;
        InterfaceC8205 interfaceC8206;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f20530;
        InterfaceC10770 interfaceC10770 = (InterfaceC10770) map.get(numValueOf);
        if (interfaceC10770 != null) {
            return interfaceC10770;
        }
        Integer numValueOf2 = Integer.valueOf(i);
        HashMap map2 = this.f20529;
        InterfaceC8205 interfaceC8207 = (InterfaceC8205) map2.get(numValueOf2);
        if (interfaceC8207 == null) {
            final InterfaceC16716 interfaceC16716 = this.f20525;
            interfaceC16716.getClass();
            if (i == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC10770.class);
                interfaceC8205 = new InterfaceC8205() { // from class: l.ۙ֫ۧ
                    @Override // p067l.InterfaceC8205
                    public final Object get() {
                        return C23925.m52992(clsAsSubclass, interfaceC16716);
                    }
                };
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC10770.class);
                        interfaceC8206 = new InterfaceC8205() { // from class: l.۫֫ۧ
                            @Override // p067l.InterfaceC8205
                            public final Object get() {
                                try {
                                    return (InterfaceC10770) clsAsSubclass2.getConstructor(null).newInstance(null);
                                } catch (Exception e) {
                                    throw new IllegalStateException(e);
                                }
                            }
                        };
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException(C20778.m46922(i, "Unrecognized contentType: "));
                        }
                        interfaceC8206 = new InterfaceC8205() { // from class: l.ۤ֫ۧ
                            @Override // p067l.InterfaceC8205
                            public final Object get() {
                                return C7832.m18091(this.f33058, interfaceC16716);
                            }
                        };
                    }
                    interfaceC8207 = interfaceC8206;
                } else {
                    final Class clsAsSubclass3 = C12123.class.asSubclass(InterfaceC10770.class);
                    interfaceC8205 = new InterfaceC8205() { // from class: l.۬֫ۧ
                        @Override // p067l.InterfaceC8205
                        public final Object get() {
                            return C23925.m52992(clsAsSubclass3, interfaceC16716);
                        }
                    };
                }
                map2.put(Integer.valueOf(i), interfaceC8207);
            } else {
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC10770.class);
                interfaceC8205 = new InterfaceC8205() { // from class: l.ۗ֫ۧ
                    @Override // p067l.InterfaceC8205
                    public final Object get() {
                        return C23925.m52992(clsAsSubclass4, interfaceC16716);
                    }
                };
            }
            interfaceC8207 = interfaceC8205;
            map2.put(Integer.valueOf(i), interfaceC8207);
        }
        InterfaceC10770 interfaceC10771 = (InterfaceC10770) interfaceC8207.get();
        InterfaceC12878 interfaceC12878 = this.f20528;
        if (interfaceC12878 != null) {
            interfaceC10771.mo24809(interfaceC12878);
        }
        interfaceC10771.mo24808(this.f20531);
        interfaceC10771.mo24810(this.f20527);
        interfaceC10771.mo24807();
        map.put(Integer.valueOf(i), interfaceC10771);
        return interfaceC10771;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18096(InterfaceC16716 interfaceC16716) {
        if (interfaceC16716 != this.f20525) {
            this.f20525 = interfaceC16716;
            this.f20529.clear();
            this.f20530.clear();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18097(boolean z) {
        this.f20527 = z;
        this.f20526.mo20000(z);
        Iterator it = this.f20530.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC10770) it.next()).mo24810(z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18094(C11915 c11915) {
        this.f20531 = c11915;
        this.f20526.mo19999(c11915);
        Iterator it = this.f20530.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC10770) it.next()).mo24808(c11915);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18093() {
        this.f20526.mo19998();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18095(InterfaceC12878 interfaceC12878) {
        this.f20528 = interfaceC12878;
        Iterator it = this.f20530.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC10770) it.next()).mo24809(interfaceC12878);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18098() {
        InterfaceC21775 interfaceC21775 = this.f20526;
        if (interfaceC21775 instanceof C20434) {
            ((C20434) interfaceC21775).m46118();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C16289 m18091(C7832 c7832, InterfaceC16716 interfaceC16716) {
        return new C16289(interfaceC16716, c7832.f20526);
    }
}
