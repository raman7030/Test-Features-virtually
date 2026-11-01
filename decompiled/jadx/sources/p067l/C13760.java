package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C13760 implements InterfaceC11927 {

    /* JADX INFO: renamed from: ֫ */
    public final C14298 f38889;

    /* JADX INFO: renamed from: ۜ */
    public final int f38890;

    /* JADX INFO: renamed from: ۧ */
    public final long f38891;

    /* JADX INFO: renamed from: ܳ */
    public final long f38892;

    /* JADX INFO: renamed from: ܽ */
    public final long f38893;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f38894;

    /* JADX INFO: renamed from: ᩳ */
    public final long f38895;

    /* JADX INFO: renamed from: ᩷ */
    public long f38896;

    /* JADX INFO: renamed from: ᩻ */
    public final long f38897;

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27257() {
        return false;
    }

    public C13760() {
        C14298 c14298 = new C14298();
        m31345("bufferForPlaybackMs", 1000, 0, "0");
        m31345("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        m31345("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        m31345("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        m31345("maxBufferMs", 50000, 50000, "minBufferMs");
        m31345("backBufferDurationMs", 0, 0, "0");
        this.f38889 = c14298;
        long j = 50000;
        this.f38897 = C5792.m12990(j);
        this.f38892 = C5792.m12990(j);
        this.f38895 = C5792.m12990(1000);
        this.f38893 = C5792.m12990(2000);
        this.f38890 = -1;
        this.f38891 = C5792.m12990(0);
        this.f38894 = new HashMap();
        this.f38896 = -1L;
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ֫ */
    public final void mo27256(C15512 c15512) {
        long id = Thread.currentThread().getId();
        long j = this.f38896;
        C23877.m52959("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f38896 = id;
        HashMap map = this.f38894;
        if (!map.containsKey(c15512)) {
            map.put(c15512, new C8395(0));
        }
        C8395 c8395 = (C8395) map.get(c15512);
        c8395.getClass();
        int i = this.f38890;
        if (i == -1) {
            i = 13107200;
        }
        c8395.f22519 = i;
        c8395.f22518 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ֫ */
    public final void mo27255(C13938 c13938, InterfaceC11617[] interfaceC11617Arr) {
        C15512 c15512 = c13938.f39320;
        HashMap map = this.f38894;
        C8395 c8395 = (C8395) map.get(c15512);
        c8395.getClass();
        int iMax = this.f38890;
        if (iMax == -1) {
            int length = interfaceC11617Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    InterfaceC11617 interfaceC11617 = interfaceC11617Arr[i];
                    if (interfaceC11617 != null) {
                        switch (interfaceC11617.mo4759().f42920) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        c8395.f22519 = iMax;
        boolean zIsEmpty = map.isEmpty();
        C14298 c14298 = this.f38889;
        if (zIsEmpty) {
            c14298.m32862();
        } else {
            c14298.m32856(m31346());
        }
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ܽ */
    public final C14298 mo27262() {
        return this.f38889;
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ۧ */
    public final long mo27259() {
        return this.f38891;
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo27261(C13938 c13938) {
        C8395 c8395 = (C8395) this.f38894.get(c13938.f39320);
        c8395.getClass();
        boolean z = this.f38889.m32860() >= m31346();
        float f = c13938.f39319;
        long j = this.f38892;
        long jMin = this.f38897;
        if (f > 1.0f) {
            jMin = Math.min(C5792.m12991(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c13938.f39318;
        if (j2 < jMax) {
            c8395.f22518 = !z;
            if (z && j2 < 500000) {
                C21334.m48351("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c8395.f22518 = false;
        }
        return c8395.f22518;
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27258(C13938 c13938) {
        long jM13014 = C5792.m13014(c13938.f39318, c13938.f39319);
        long jMin = c13938.f39322 ? this.f38893 : this.f38895;
        long j = c13938.f39321;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jM13014 >= jMin || this.f38889.m32860() >= m31346();
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27264() {
        Iterator it = this.f38894.values().iterator();
        while (it.hasNext()) {
            if (((C8395) it.next()).f22518) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m31346() {
        Iterator it = this.f38894.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C8395) it.next()).f22519;
        }
        return i;
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ۧ */
    public final void mo27260(C15512 c15512) {
        HashMap map = this.f38894;
        if (map.remove(c15512) != null) {
            boolean zIsEmpty = map.isEmpty();
            C14298 c14298 = this.f38889;
            if (zIsEmpty) {
                c14298.m32862();
            } else {
                c14298.m32856(m31346());
            }
        }
        if (map.isEmpty()) {
            this.f38896 = -1L;
        }
    }

    @Override // p067l.InterfaceC11927
    /* JADX INFO: renamed from: ܽ */
    public final void mo27263(C15512 c15512) {
        HashMap map = this.f38894;
        if (map.remove(c15512) != null) {
            boolean zIsEmpty = map.isEmpty();
            C14298 c14298 = this.f38889;
            if (zIsEmpty) {
                c14298.m32862();
            } else {
                c14298.m32856(m31346());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31345(String str, int i, int i2, String str2) {
        C23877.m52956(str + " cannot be less than " + str2, i >= i2);
    }
}
