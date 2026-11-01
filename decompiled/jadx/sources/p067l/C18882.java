package p067l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K6X0 */
/* JADX INFO: loaded from: classes5.dex */
public class C18882 implements InterfaceC2696, InterfaceC10354 {
    /* JADX INFO: renamed from: ۧ */
    public static String m42971(int i) {
        return C19768.m44906(i, "http://127.0.0.1:", "/mcp");
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo31420(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo31421(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo31422(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo31424(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo31425(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo31427(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo31428(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo31429(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo31430(EnumC19222 enumC19222) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo31431(EnumC19222 enumC19222) {
        throw null;
    }

    @Override // p067l.InterfaceC10354
    /* JADX INFO: renamed from: ֫ */
    public void mo13645(CharSequence charSequence, C5660 c5660, C20438 c20438) {
        String string = charSequence.toString();
        C11535 c11535 = new C11535();
        if (c5660.m12610()) {
            c11535.m26595();
        } else {
            c11535.m26594(Integer.valueOf(c5660.m12609()));
        }
        c20438.append((CharSequence) new C22264(c11535).m50088(string));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m42969() {
        ArrayList arrayList = new ArrayList();
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                    for (InetAddress inetAddress : Collections.list(networkInterface.getInetAddresses())) {
                        if ((inetAddress instanceof Inet4Address) && !inetAddress.isLoopbackAddress()) {
                            arrayList.add(inetAddress.getHostAddress());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m42970(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m42969().iterator();
        while (it.hasNext()) {
            arrayList.add("http://" + ((String) it.next()) + ":" + i + "/mcp");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m42972(EnumC19222 enumC19222) {
        switch (enumC19222.ordinal()) {
            case 0:
            case 1:
                mo31430(enumC19222);
                break;
            case 2:
                mo31431(enumC19222);
                break;
            case 3:
            case 4:
                mo31421(enumC19222);
                break;
            case 5:
            case 6:
            case 7:
                mo31427(enumC19222);
                break;
            case 8:
                mo31428(enumC19222);
                break;
            case 9:
                mo31420(enumC19222);
                break;
            case 10:
            case 11:
                mo31429(enumC19222);
                break;
            case 12:
                mo31424(enumC19222);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                mo31425(enumC19222);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                mo31422(enumC19222);
                break;
        }
    }
}
