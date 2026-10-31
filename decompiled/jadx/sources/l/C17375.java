package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K6X0 */
/* JADX INFO: loaded from: classes5.dex */
public class C17375 implements InterfaceC0345, InterfaceC8402 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m40719(int i) {
        return C18307.m42645(i, "http://127.0.0.1:", "/mcp");
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo29360(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ۡ */
    public void mo29361(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ۢ */
    public void mo29362(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo29364(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo29365(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo29367(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ܿ */
    public void mo29368(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo29369(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo29370(EnumC17734 enumC17734) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public void mo29371(EnumC17734 enumC17734) {
        throw null;
    }

    @Override // l.InterfaceC8402
    /* JADX INFO: renamed from: ֫ */
    public void mo11709(CharSequence charSequence, C3463 c3463, C19012 c19012) {
        String string = charSequence.toString();
        C9645 c9645 = new C9645();
        if (c3463.m10602()) {
            c9645.m24581();
        } else {
            c9645.m24580(Integer.valueOf(c3463.m10601()));
        }
        c19012.append((CharSequence) new C20934(c9645).m47758(string));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m40717() {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m40718(int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m40717().iterator();
        while (it.hasNext()) {
            arrayList.add("http://" + ((String) it.next()) + ":" + i + "/mcp");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m40720(EnumC17734 enumC17734) {
        switch (enumC17734.ordinal()) {
            case 0:
            case 1:
                mo29370(enumC17734);
                break;
            case 2:
                mo29371(enumC17734);
                break;
            case 3:
            case 4:
                mo29361(enumC17734);
                break;
            case 5:
            case 6:
            case 7:
                mo29367(enumC17734);
                break;
            case 8:
                mo29368(enumC17734);
                break;
            case 9:
                mo29360(enumC17734);
                break;
            case 10:
            case 11:
                mo29369(enumC17734);
                break;
            case 12:
                mo29364(enumC17734);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                mo29365(enumC17734);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                mo29362(enumC17734);
                break;
        }
    }
}
