package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7FP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20687 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47299(String str, C14335 c14335) {
        C23508 c23508;
        C14335 c14335M47301 = m47301(c14335);
        if (str.isEmpty() || c14335M47301 == null) {
            m47302(str);
            return;
        }
        ArrayList arrayListM47296 = m47296();
        Iterator it = arrayListM47296.iterator();
        do {
            if (!it.hasNext()) {
                c23508 = null;
                break;
            }
            c23508 = (C23508) it.next();
        } while (!c23508.f75458.equals(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c23508 != null) {
            c23508.f75459 = c14335M47301;
            c23508.f75457 = jCurrentTimeMillis;
        } else {
            arrayListM47296.add(new C23508(str, c14335M47301, jCurrentTimeMillis));
        }
        if (arrayListM47296.size() > 100) {
            Collections.sort(arrayListM47296, new C17864());
            while (arrayListM47296.size() > 100) {
                C18473.m42953(arrayListM47296, 1);
            }
        }
        m47300(arrayListM47296);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14335 m47297(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList<C23508> arrayListM47296 = m47296();
        for (C23508 c23508 : arrayListM47296) {
            if (c23508.f75458.equals(str)) {
                C14335 c14335M47301 = m47301(c23508.f75459);
                if (c14335M47301 == null) {
                    return null;
                }
                c23508.f75457 = System.currentTimeMillis();
                m47300(arrayListM47296);
                return c14335M47301;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m47302(String str) {
        if (str.isEmpty()) {
            return;
        }
        ArrayList arrayListM47296 = m47296();
        for (int i = 0; i < arrayListM47296.size(); i++) {
            if (((C23508) arrayListM47296.get(i)).f75458.equals(str)) {
                arrayListM47296.remove(i);
                m47300(arrayListM47296);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C14335 m47301(C14335 c14335) {
        int i = C17158.f52563[c14335.m34209().ordinal()];
        if (i == 1) {
            return new C14335(EnumC6575.OFF, -1, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new IncompatibleClassChangeError();
            }
            if (c14335.m34208() != null && !c14335.m34208().isEmpty()) {
                return new C14335(EnumC6575.FILE, -1, c14335.m34208());
            }
        } else if (c14335.m34207() >= 0) {
            return new C14335(EnumC6575.TRACK, c14335.m34207(), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47296() {
        byte[] bArrMo18253;
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
            if (interfaceC12344 != null && (bArrMo18253 = interfaceC12344.mo18253("vsts", (byte[]) null)) != null && bArrMo18253.length != 0) {
                C12951 c12951M31485 = C12951.m31485(bArrMo18253);
                c12951M31485.m31490(1699025495);
                int i = c12951M31485.readByte() & 255;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(C23508.m51947(c12951M31485));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            arrayList.clear();
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47300(ArrayList arrayList) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        if (interfaceC12344 == null) {
            return;
        }
        C10130 c10130M43030 = C18515.m43030(1699025495);
        c10130M43030.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23508 c23508 = (C23508) it.next();
            c10130M43030.m25439(c23508.f75458);
            int i = C17158.f52563[c23508.f75459.m34209().ordinal()];
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        throw new IncompatibleClassChangeError();
                    }
                } else {
                    continue;
                }
            }
            c10130M43030.writeByte(i2);
            c10130M43030.writeInt(c23508.f75459.m34207());
            c10130M43030.m25424(c23508.f75459.m34208());
            c10130M43030.m25431(c23508.f75457);
        }
        interfaceC12344.edit().mo25855("vsts", c10130M43030.m25427()).apply();
    }
}
