package p067l;

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
public final class C4590 implements InterfaceC6601 {

    /* JADX INFO: renamed from: ֡ */
    public final Set f10291;

    /* JADX INFO: renamed from: ֨ */
    public final C11296 f10292;

    /* JADX INFO: renamed from: ۖ */
    public final boolean f10293;

    /* JADX INFO: renamed from: ۘ */
    public Handler f10294;

    /* JADX INFO: renamed from: ۚ */
    public int f10295;

    /* JADX INFO: renamed from: ۜ */
    public volatile HandlerC18671 f10296;

    /* JADX INFO: renamed from: ۠ */
    public final C17329 f10297;

    /* JADX INFO: renamed from: ۡ */
    public byte[] f10298;

    /* JADX INFO: renamed from: ۢ */
    public C12637 f10299;

    /* JADX INFO: renamed from: ۧ */
    public final C18828 f10300;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f10301;

    /* JADX INFO: renamed from: ܶ */
    public final long f10302;

    /* JADX INFO: renamed from: ܺ */
    public C12637 f10303;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC9283 f10304;

    /* JADX INFO: renamed from: ܿ */
    public final Set f10305;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC24035 f10306;

    /* JADX INFO: renamed from: ᩴ */
    public Looper f10307;

    /* JADX INFO: renamed from: ᩵ */
    public C15512 f10308;

    /* JADX INFO: renamed from: ᩶ */
    public final UUID f10309;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f10310;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f10311;

    /* JADX INFO: renamed from: ᩹ */
    public final int[] f10312;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC12878 f10313;

    public C4590(UUID uuid, C20780 c20780, C18828 c18828, HashMap map, boolean z, int[] iArr, boolean z2, C24356 c24356, long j) {
        uuid.getClass();
        C23877.m52956("Use C.CLEARKEY_UUID instead", !C25059.f79953.equals(uuid));
        this.f10309 = uuid;
        this.f10306 = c20780;
        this.f10300 = c18828;
        this.f10301 = map;
        this.f10310 = z;
        this.f10312 = iArr;
        this.f10293 = z2;
        this.f10313 = c24356;
        this.f10292 = new C11296();
        this.f10297 = new C17329(this);
        this.f10311 = new ArrayList();
        this.f10291 = Collections.newSetFromMap(new IdentityHashMap());
        this.f10305 = Collections.newSetFromMap(new IdentityHashMap());
        this.f10302 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9699(byte[] bArr) {
        C23877.m52960(this.f10311.isEmpty());
        this.f10298 = bArr;
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ۧ */
    public final void mo9701() {
        m9680(true);
        int i = this.f10295;
        this.f10295 = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f10304 == null) {
            InterfaceC9283 interfaceC9283Mo46929 = this.f10306.mo46929(this.f10309);
            this.f10304 = interfaceC9283Mo46929;
            interfaceC9283Mo46929.mo21487(new C19342(this));
        } else {
            if (this.f10302 == -9223372036854775807L) {
                return;
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f10311;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C12637) arrayList.get(i2)).mo3883((C16658) null);
                i2++;
            }
        }
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ֫ */
    public final void mo9697() {
        m9680(true);
        int i = this.f10295 - 1;
        this.f10295 = i;
        if (i != 0) {
            return;
        }
        if (this.f10302 != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f10311);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C12637) arrayList.get(i2)).mo3885((C16658) null);
            }
        }
        AbstractC21520 it = AbstractC8146.copyOf((Collection) this.f10291).iterator();
        while (it.hasNext()) {
            ((C22025) it.next()).mo38722();
        }
        m9690();
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21354 mo9700(C16658 c16658, final C10307 c10307) {
        C23877.m52960(this.f10295 > 0);
        C23877.m52958(this.f10307);
        final C22025 c22025 = new C22025(this, c16658);
        Handler handler = this.f10294;
        handler.getClass();
        handler.post(new Runnable() { // from class: l.ۜۛ֫
            @Override // java.lang.Runnable
            public final void run() {
                C22025.m49622(c22025, c10307);
            }
        });
        return c22025;
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2577 mo9696(C16658 c16658, C10307 c10307) {
        m9680(false);
        C23877.m52960(this.f10295 > 0);
        C23877.m52958(this.f10307);
        return m9676(this.f10307, c16658, c10307, true);
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ֫ */
    public final int mo9695(C10307 c10307) {
        m9680(false);
        InterfaceC9283 interfaceC9283 = this.f10304;
        interfaceC9283.getClass();
        int iMo21496 = interfaceC9283.mo21496();
        C21037 c21037 = c10307.f28516;
        if (c21037 == null) {
            int iM26822 = C11669.m26822(c10307.f28528);
            int i = 0;
            while (true) {
                int[] iArr = this.f10312;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iM26822) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f10298 == null) {
            UUID uuid = this.f10309;
            if (m9674(c21037, uuid, true).isEmpty()) {
                if (c21037.f66012 == 1 && c21037.m47449(0).m45967(C25059.f79953)) {
                    C21334.m48351("DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c21037.f66009;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iMo21496;
    }

    @Override // p067l.InterfaceC6601
    /* JADX INFO: renamed from: ֫ */
    public final void mo9698(Looper looper, C15512 c15512) {
        synchronized (this) {
            Looper looper2 = this.f10307;
            if (looper2 == null) {
                this.f10307 = looper;
                this.f10294 = new Handler(looper);
            } else {
                C23877.m52960(looper2 == looper);
                this.f10294.getClass();
            }
        }
        this.f10308 = c15512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC2577 m9676(Looper looper, C16658 c16658, C10307 c10307, boolean z) {
        ArrayList arrayListM9674;
        if (this.f10296 == null) {
            this.f10296 = new HandlerC18671(this, looper);
        }
        C21037 c21037 = c10307.f28516;
        int i = 0;
        C12637 c12637 = null;
        if (c21037 == null) {
            int iM26822 = C11669.m26822(c10307.f28528);
            InterfaceC9283 interfaceC9283 = this.f10304;
            interfaceC9283.getClass();
            if (interfaceC9283.mo21496() != 2 || !C4076.f8974) {
                int[] iArr = this.f10312;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iM26822) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC9283.mo21496() != 1) {
                    C12637 c12638 = this.f10303;
                    if (c12638 == null) {
                        C12637 c12637M9679 = m9679(AbstractC16192.m36872of(), true, (C16658) null, z);
                        this.f10311.add(c12637M9679);
                        this.f10303 = c12637M9679;
                    } else {
                        c12638.mo3883((C16658) null);
                    }
                    return this.f10303;
                }
            }
            return null;
        }
        if (this.f10298 == null) {
            arrayListM9674 = m9674(c21037, this.f10309, false);
            if (arrayListM9674.isEmpty()) {
                C15988 c15988 = new C15988("Media does not support uuid: " + this.f10309);
                C21334.m48348("DRM error", c15988);
                if (c16658 != null) {
                    c16658.m37721(c15988);
                }
                return new C11966(new C20684(6003, c15988));
            }
        } else {
            arrayListM9674 = null;
        }
        if (!this.f10310) {
            c12637 = this.f10299;
        } else {
            for (C12637 c12639 : this.f10311) {
                if (C12826.equals(c12639.f35482, arrayListM9674)) {
                    c12637 = c12639;
                    break;
                }
            }
        }
        if (c12637 == null) {
            C12637 c12637M96710 = m9679((List) arrayListM9674, false, c16658, z);
            if (!this.f10310) {
                this.f10299 = c12637M96710;
            }
            this.f10311.add(c12637M96710);
            return c12637M96710;
        }
        c12637.mo3883(c16658);
        return c12637;
    }

    /* JADX INFO: renamed from: ֫ */
    private C12637 m9679(List list, boolean z, C16658 c16658, boolean z2) {
        C12637 c12637M9678 = m9678(list, z, c16658);
        boolean zM9681 = m9681(c12637M9678);
        long j = this.f10302;
        Set set = this.f10305;
        if (zM9681 && !set.isEmpty()) {
            AbstractC21520 it = AbstractC8146.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((InterfaceC2577) it.next()).mo3885(null);
            }
            c12637M9678.mo3885(c16658);
            if (j != -9223372036854775807L) {
                c12637M9678.mo3885((C16658) null);
            }
            c12637M9678 = m9678(list, z, c16658);
        }
        if (m9681(c12637M9678) && z2) {
            Set set2 = this.f10291;
            if (!set2.isEmpty()) {
                AbstractC21520 it2 = AbstractC8146.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((C22025) it2.next()).mo38722();
                }
                if (!set.isEmpty()) {
                    AbstractC21520 it3 = AbstractC8146.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC2577) it3.next()).mo3885(null);
                    }
                }
                c12637M9678.mo3885(c16658);
                if (j != -9223372036854775807L) {
                    c12637M9678.mo3885((C16658) null);
                }
                return m9678(list, z, c16658);
            }
        }
        return c12637M9678;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m9681(InterfaceC2577 interfaceC2577) {
        C12637 c12637 = (C12637) interfaceC2577;
        if (c12637.getState() != 1) {
            return false;
        }
        C20684 error = c12637.getError();
        error.getClass();
        Throwable cause = error.getCause();
        return (cause instanceof ResourceBusyException) || C14647.m33514(cause);
    }

    /* JADX INFO: renamed from: ֫ */
    private C12637 m9678(List list, boolean z, C16658 c16658) {
        this.f10304.getClass();
        boolean z2 = this.f10293 | z;
        InterfaceC9283 interfaceC9283 = this.f10304;
        byte[] bArr = this.f10298;
        Looper looper = this.f10307;
        looper.getClass();
        C15512 c15512 = this.f10308;
        c15512.getClass();
        C12637 c12637 = new C12637(this.f10309, interfaceC9283, this.f10292, this.f10297, list, z2, z, bArr, this.f10301, this.f10300, looper, this.f10313, c15512);
        c12637.mo3883(c16658);
        if (this.f10302 != -9223372036854775807L) {
            c12637.mo3883((C16658) null);
        }
        return c12637;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m9690() {
        if (this.f10304 != null && this.f10295 == 0 && this.f10311.isEmpty() && this.f10291.isEmpty()) {
            InterfaceC9283 interfaceC9283 = this.f10304;
            interfaceC9283.getClass();
            interfaceC9283.mo21486();
            this.f10304 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m9680(boolean z) {
        if (z && this.f10307 == null) {
            C21334.m48350("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f10307;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            C21334.m48350("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f10307.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m9674(C21037 c21037, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c21037.f66012);
        for (int i = 0; i < c21037.f66012; i++) {
            C20366 c20366M47449 = c21037.m47449(i);
            if ((c20366M47449.m45967(uuid) || (C25059.f79952.equals(uuid) && c20366M47449.m45967(C25059.f79953))) && (c20366M47449.f62960 != null || z)) {
                arrayList.add(c20366M47449);
            }
        }
        return arrayList;
    }
}
