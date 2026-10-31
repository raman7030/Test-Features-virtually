package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11986 implements InterfaceC10058 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12552 f35879;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f35880;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f35881;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f35882;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f35883;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f35884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f35885;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f35886;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f35887;

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25240() {
        return false;
    }

    public C11986() {
        C12552 c12552 = new C12552();
        m29290("bufferForPlaybackMs", 1000, 0, "0");
        m29290("bufferForPlaybackAfterRebufferMs", 2000, 0, "0");
        m29290("minBufferMs", 50000, 1000, "bufferForPlaybackMs");
        m29290("minBufferMs", 50000, 2000, "bufferForPlaybackAfterRebufferMs");
        m29290("maxBufferMs", 50000, 50000, "minBufferMs");
        m29290("backBufferDurationMs", 0, 0, "0");
        this.f35879 = c12552;
        long j = 50000;
        this.f35887 = C3603.m11014(j);
        this.f35882 = C3603.m11014(j);
        this.f35885 = C3603.m11014(1000);
        this.f35883 = C3603.m11014(2000);
        this.f35880 = -1;
        this.f35881 = C3603.m11014(0);
        this.f35884 = new HashMap();
        this.f35886 = -1L;
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ֫ */
    public final void mo25239(C13830 c13830) {
        long id = Thread.currentThread().getId();
        long j = this.f35886;
        C22632.m50633("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.f35886 = id;
        HashMap map = this.f35884;
        if (!map.containsKey(c13830)) {
            map.put(c13830, new C6341(0));
        }
        C6341 c6341 = (C6341) map.get(c13830);
        c6341.getClass();
        int i = this.f35880;
        if (i == -1) {
            i = 13107200;
        }
        c6341.f19647 = i;
        c6341.f19646 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ֫ */
    public final void mo25238(C12174 c12174, InterfaceC9731[] interfaceC9731Arr) {
        C13830 c13830 = c12174.f36309;
        HashMap map = this.f35884;
        C6341 c6341 = (C6341) map.get(c13830);
        c6341.getClass();
        int iMax = this.f35880;
        if (iMax == -1) {
            int length = interfaceC9731Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    InterfaceC9731 interfaceC9731 = interfaceC9731Arr[i];
                    if (interfaceC9731 != null) {
                        switch (interfaceC9731.mo2388().f39853) {
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
        c6341.f19647 = iMax;
        boolean zIsEmpty = map.isEmpty();
        C12552 c12552 = this.f35879;
        if (zIsEmpty) {
            c12552.m30788();
        } else {
            c12552.m30782(m29291());
        }
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ܽ */
    public final C12552 mo25245() {
        return this.f35879;
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ۧ */
    public final long mo25242() {
        return this.f35881;
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25244(C12174 c12174) {
        C6341 c6341 = (C6341) this.f35884.get(c12174.f36309);
        c6341.getClass();
        boolean z = this.f35879.m30786() >= m29291();
        float f = c12174.f36308;
        long j = this.f35882;
        long jMin = this.f35887;
        if (f > 1.0f) {
            jMin = Math.min(C3603.m11015(jMin, f), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = c12174.f36307;
        if (j2 < jMax) {
            c6341.f19646 = !z;
            if (z && j2 < 500000) {
                C19956.m46037("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z) {
            c6341.f19646 = false;
        }
        return c6341.f19646;
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25241(C12174 c12174) {
        long jM11038 = C3603.m11038(c12174.f36307, c12174.f36308);
        long jMin = c12174.f36311 ? this.f35883 : this.f35885;
        long j = c12174.f36310;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jM11038 >= jMin || this.f35879.m30786() >= m29291();
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo25247() {
        Iterator it = this.f35884.values().iterator();
        while (it.hasNext()) {
            if (((C6341) it.next()).f19646) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m29291() {
        Iterator it = this.f35884.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C6341) it.next()).f19647;
        }
        return i;
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ۧ */
    public final void mo25243(C13830 c13830) {
        HashMap map = this.f35884;
        if (map.remove(c13830) != null) {
            boolean zIsEmpty = map.isEmpty();
            C12552 c12552 = this.f35879;
            if (zIsEmpty) {
                c12552.m30788();
            } else {
                c12552.m30782(m29291());
            }
        }
        if (map.isEmpty()) {
            this.f35886 = -1L;
        }
    }

    @Override // l.InterfaceC10058
    /* JADX INFO: renamed from: ܽ */
    public final void mo25246(C13830 c13830) {
        HashMap map = this.f35884;
        if (map.remove(c13830) != null) {
            boolean zIsEmpty = map.isEmpty();
            C12552 c12552 = this.f35879;
            if (zIsEmpty) {
                c12552.m30788();
            } else {
                c12552.m30782(m29291());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29290(String str, int i, int i2, String str2) {
        C22632.m50630(str + " cannot be less than " + str2, i >= i2);
    }
}
