package l;

import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۖۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2338 implements InterfaceC4454 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Set f7500;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9394 f7501;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f7502;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public Handler f7503;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f7504;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile HandlerC17154 f7505;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C15742 f7506;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f7507;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10805 f7508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17319 f7509;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f7510;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f7511;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10805 f7512;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7276 f7513;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set f7514;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22798 f7515;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Looper f7516;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C13830 f7517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UUID f7518;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f7519;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f7520;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f7521;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC11058 f7522;

    public C2338(UUID uuid, C19373 c19373, C17319 c17319, HashMap map, boolean z, int[] iArr, boolean z2, C23135 c23135, long j) {
        uuid.getClass();
        C22632.m50630("Use C.CLEARKEY_UUID instead", !C23875.f77201.equals(uuid));
        this.f7518 = uuid;
        this.f7515 = c19373;
        this.f7509 = c17319;
        this.f7510 = map;
        this.f7519 = z;
        this.f7521 = iArr;
        this.f7502 = z2;
        this.f7522 = c23135;
        this.f7501 = new C9394();
        this.f7506 = new C15742(this);
        this.f7520 = new ArrayList();
        this.f7500 = Collections.newSetFromMap(new IdentityHashMap());
        this.f7514 = Collections.newSetFromMap(new IdentityHashMap());
        this.f7511 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7628(byte[] bArr) {
        C22632.m50634(this.f7520.isEmpty());
        this.f7507 = bArr;
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7630() {
        m7609(true);
        int i = this.f7504;
        this.f7504 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f7513 == null) {
            InterfaceC7276 interfaceC7276Mo44635 = this.f7515.mo44635(this.f7518);
            this.f7513 = interfaceC7276Mo44635;
            interfaceC7276Mo44635.mo19520(new C17860(this));
        } else {
            if (this.f7511 == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f7520;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C10805) arrayList.get(i2)).mo1470((C15036) null);
                i2++;
            }
        }
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7626() {
        m7609(true);
        int i = this.f7504 - 1;
        this.f7504 = i;
        if (i != 0) {
            return;
        }
        if (this.f7511 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f7520);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C10805) arrayList.get(i2)).mo1472((C15036) null);
            }
        }
        AbstractC20151 it = AbstractC6079.copyOf((Collection) this.f7500).iterator();
        while (it.hasNext()) {
            ((C20683) it.next()).mo36563();
        }
        m7619();
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19977 mo7629(C15036 c15036, final C8353 c8353) {
        C22632.m50634(this.f7504 > 0);
        C22632.m50632(this.f7516);
        final C20683 c20683 = new C20683(this, c15036);
        Handler handler = this.f7503;
        handler.getClass();
        handler.post(new Runnable() { // from class: l.ۜۛ֫
            @Override // java.lang.Runnable
            public final void run() {
                C20683.m47295(c20683, c8353);
            }
        });
        return c20683;
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0220 mo7625(C15036 c15036, C8353 c8353) {
        m7609(false);
        C22632.m50634(this.f7504 > 0);
        C22632.m50632(this.f7516);
        return m7605(this.f7516, c15036, c8353, true);
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo7624(C8353 c8353) {
        m7609(false);
        InterfaceC7276 interfaceC7276 = this.f7513;
        interfaceC7276.getClass();
        int iMo19529 = interfaceC7276.mo19529();
        C19643 c19643 = c8353.f25602;
        if (c19643 == null) {
            int iM24807 = C9786.m24807(c8353.f25614);
            int i = 0;
            while (true) {
                int[] iArr = this.f7521;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM24807) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f7507 == null) {
            UUID uuid = this.f7518;
            if (m7603(c19643, uuid, true).isEmpty()) {
                if (c19643.f63389 == 1 && c19643.m45153(0).m43701(C23875.f77201)) {
                    C19956.m46037("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c19643.f63386;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iMo19529;
    }

    @Override // l.InterfaceC4454
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7627(Looper looper, C13830 c13830) {
        synchronized (this) {
            Looper looper2 = this.f7516;
            if (looper2 == null) {
                this.f7516 = looper;
                this.f7503 = new Handler(looper);
            } else {
                C22632.m50634(looper2 == looper);
                this.f7503.getClass();
            }
        }
        this.f7517 = c13830;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 m7605(Looper looper, C15036 c15036, C8353 c8353, boolean z) {
        ArrayList arrayListM7603;
        if (this.f7505 == null) {
            this.f7505 = new HandlerC17154(this, looper);
        }
        C19643 c19643 = c8353.f25602;
        int i = 0;
        C10805 c10805 = null;
        if (c19643 == null) {
            int iM24807 = C9786.m24807(c8353.f25614);
            InterfaceC7276 interfaceC7276 = this.f7513;
            interfaceC7276.getClass();
            if (interfaceC7276.mo19529() != 2 || !C1797.f6195) {
                int[] iArr = this.f7521;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iM24807) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC7276.mo19529() != 1) {
                    C10805 c10806 = this.f7512;
                    if (c10806 == null) {
                        C10805 c10805M7608 = m7608(AbstractC14545.of(), true, (C15036) null, z);
                        this.f7520.add(c10805M7608);
                        this.f7512 = c10805M7608;
                    } else {
                        c10806.mo1470((C15036) null);
                    }
                    return this.f7512;
                }
            }
            return null;
        }
        if (this.f7507 == null) {
            arrayListM7603 = m7603(c19643, this.f7518, false);
            if (arrayListM7603.isEmpty()) {
                C14331 c14331 = new C14331("Media does not support uuid: " + this.f7518);
                C19956.m46034("DRM error", c14331);
                if (c15036 != null) {
                    c15036.m35564(c14331);
                }
                return new C10099(new C19272(6003, c14331));
            }
        } else {
            arrayListM7603 = null;
        }
        if (!this.f7519) {
            c10805 = this.f7508;
        } else {
            for (C10805 c10807 : this.f7520) {
                if (C11003.equals(c10807.f32506, arrayListM7603)) {
                    c10805 = c10807;
                    break;
                }
            }
        }
        if (c10805 == null) {
            C10805 c10805M7609 = m7608((List) arrayListM7603, false, c15036, z);
            if (!this.f7519) {
                this.f7508 = c10805M7609;
            }
            this.f7520.add(c10805M7609);
            return c10805M7609;
        }
        c10805.mo1470(c15036);
        return c10805;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10805 m7608(List list, boolean z, C15036 c15036, boolean z2) {
        C10805 c10805M7607 = m7607(list, z, c15036);
        boolean zM7610 = m7610(c10805M7607);
        long j = this.f7511;
        Set set = this.f7514;
        if (zM7610 && !set.isEmpty()) {
            AbstractC20151 it = AbstractC6079.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((InterfaceC0220) it.next()).mo1472(null);
            }
            c10805M7607.mo1472(c15036);
            if (j != -9223372036854775807L) {
                c10805M7607.mo1472((C15036) null);
            }
            c10805M7607 = m7607(list, z, c15036);
        }
        if (m7610(c10805M7607) && z2) {
            Set set2 = this.f7500;
            if (!set2.isEmpty()) {
                AbstractC20151 it2 = AbstractC6079.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((C20683) it2.next()).mo36563();
                }
                if (!set.isEmpty()) {
                    AbstractC20151 it3 = AbstractC6079.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC0220) it3.next()).mo1472(null);
                    }
                }
                c10805M7607.mo1472(c15036);
                if (j != -9223372036854775807L) {
                    c10805M7607.mo1472((C15036) null);
                }
                return m7607(list, z, c15036);
            }
        }
        return c10805M7607;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7610(InterfaceC0220 interfaceC0220) {
        C10805 c10805 = (C10805) interfaceC0220;
        if (c10805.getState() != 1) {
            return false;
        }
        C19272 error = c10805.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || C12920.m31428(cause);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10805 m7607(List list, boolean z, C15036 c15036) {
        this.f7513.getClass();
        boolean z2 = this.f7502 | z;
        InterfaceC7276 interfaceC7276 = this.f7513;
        byte[] bArr = this.f7507;
        Looper looper = this.f7516;
        looper.getClass();
        C13830 c13830 = this.f7517;
        c13830.getClass();
        C10805 c10805 = new C10805(this.f7518, interfaceC7276, this.f7501, this.f7506, list, z2, z, bArr, this.f7510, this.f7509, looper, this.f7522, c13830);
        c10805.mo1470(c15036);
        if (this.f7511 != -9223372036854775807L) {
            c10805.mo1470((C15036) null);
        }
        return c10805;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m7619() {
        if (this.f7513 != null && this.f7504 == 0 && this.f7520.isEmpty() && this.f7500.isEmpty()) {
            InterfaceC7276 interfaceC7276 = this.f7513;
            interfaceC7276.getClass();
            interfaceC7276.mo19519();
            this.f7513 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m7609(boolean z) {
        if (z && this.f7516 == null) {
            C19956.m46036("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f7516;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            C19956.m46036("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f7516.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m7603(C19643 c19643, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c19643.f63389);
        for (int i = 0; i < c19643.f63389; i++) {
            C18937 c18937M45153 = c19643.m45153(i);
            if ((c18937M45153.m43701(uuid) || (C23875.f77200.equals(uuid) && c18937M45153.m43701(C23875.f77201))) && (c18937M45153.f59729 != null || z)) {
                arrayList.add(c18937M45153);
            }
        }
        return arrayList;
    }
}
