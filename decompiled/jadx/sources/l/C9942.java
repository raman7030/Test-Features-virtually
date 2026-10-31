package l;

import android.content.DialogInterface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9942 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC17889 f30022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f30023;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f30024;

    public C9942() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (!c2450.m7916("local") && !c2450.m7916("zip") && !c2450.m7916(b.k)) {
            return false;
        }
        if (c2450.m7918() == 2) {
            return true;
        }
        C16560 c16560M7919 = c2450.m7919();
        return c16560M7919.m39035("local") || c16560M7919.m39035("zip") || c16560M7919.m39035(b.k);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        String name;
        String name2;
        if (c2450.m7918() == 2) {
            List listM7909 = c2450.m7909();
            this.f30022 = (InterfaceC17889) listM7909.get(0);
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM7909.get(1);
            AbstractC16891 abstractC16891M7922 = c2450.m7922();
            this.f30023 = abstractC16891M7922;
            this.f30024 = abstractC16891M7922;
            C16560 c16560M7921 = c2450.m7921();
            InterfaceC17889 interfaceC178810 = this.f30022;
            m25068(c16560M7921, interfaceC178810, interfaceC17889, interfaceC178810.getPath(), interfaceC17889.getPath(), true);
            return;
        }
        C16560 c16560M7919 = c2450.m7919();
        this.f30022 = c2450.m7913();
        InterfaceC17889 interfaceC17889M39025 = c16560M7919.m39025();
        this.f30024 = c2450.m7922();
        this.f30023 = c16560M7919.m39044();
        boolean zM39064 = c2450.m7921().m39064();
        if (this.f30022.getName().equals(interfaceC17889M39025.getName())) {
            int i = R.string.MT_Protector;
            String strM14306 = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, this.f30022.getName());
            if (!zM39064) {
                i = R.string.MT_Protector;
            }
            name2 = C4925.m14306(i, interfaceC17889M39025.getName());
            name = strM14306;
        } else {
            name = this.f30022.getName();
            name2 = interfaceC17889M39025.getName();
        }
        if (zM39064) {
            m25068(c2450.m7921(), this.f30022, interfaceC17889M39025, name, name2, false);
        } else {
            m25068(c2450.m7921(), interfaceC17889M39025, this.f30022, name2, name, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25068(final C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC17889 interfaceC178810, String str, String str2, boolean z) {
        View viewM10216 = c16560.m39056().m10216(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM10216.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM10216.findViewById(R.id.editText2);
        ((TextView) viewM10216.findViewById(R.id.MT_Protector)).setText(m5610());
        final C14879 c14879 = new C14879();
        c14879.f45411 = interfaceC17889;
        c14879.f45412 = interfaceC178810;
        c14879.f45413 = str;
        c14879.f45414 = str2;
        if (z && interfaceC17889.getTime() > interfaceC178810.getTime()) {
            InterfaceC17889 interfaceC178811 = c14879.f45411;
            c14879.f45411 = c14879.f45412;
            c14879.f45412 = interfaceC178811;
            String str3 = c14879.f45413;
            c14879.f45413 = c14879.f45414;
            c14879.f45414 = str3;
        }
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c14879.f45413, c14879.f45414, editText, editText2);
        Main mainM39056 = c16560.m39056();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(mainM39056);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡֡ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C9942.m25067(this.f972, c16560, c14879);
            }
        });
        c19258.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ֡ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14879 c148710 = c14879;
                InterfaceC17889 interfaceC178812 = c148710.f45411;
                c148710.f45411 = c148710.f45412;
                c148710.f45412 = interfaceC178812;
                String str4 = c148710.f45413;
                String str5 = c148710.f45414;
                c148710.f45413 = str5;
                c148710.f45414 = str4;
                C2079.m6836(str5, str4, editText, editText2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25067(C9942 c9942, C16560 c16560, C14879 c14879) {
        AbstractC16891 abstractC16891;
        AbstractC16891 abstractC16892;
        InterfaceC17889 interfaceC17889 = c14879.f45411;
        InterfaceC17889 interfaceC178810 = c14879.f45412;
        if (interfaceC17889 == c9942.f30022) {
            abstractC16891 = c9942.f30024;
            abstractC16892 = c9942.f30023;
        } else {
            abstractC16891 = c9942.f30023;
            abstractC16892 = c9942.f30024;
        }
        abstractC16891.mo15162(interfaceC17889);
        abstractC16892.mo15162(interfaceC178810);
        AbstractC15440 abstractC15440M51761 = C23346.m51761(c16560, c9942.m5610(), "txt");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C12058.class);
        c0994.m3474("saveAsPath", abstractC15440M51761.mo23554());
        c0994.m3474("inputPath1", interfaceC17889.getPath());
        c0994.m3474("inputPath2", interfaceC178810.getPath());
        if (interfaceC17889 instanceof C12645) {
            c0994.m3474("zipPath1", ((C10738) abstractC16891).m26937());
        } else if (interfaceC17889 instanceof AbstractC17191) {
            c0994.m3476("statelessVisitor1", abstractC16891.mo6020().m33350());
        } else if (!(interfaceC17889 instanceof C9555)) {
            throw new RuntimeException();
        }
        if (interfaceC178810 instanceof C12645) {
            c0994.m3474("zipPath2", ((C10738) abstractC16892).m26937());
        } else if (interfaceC178810 instanceof AbstractC17191) {
            c0994.m3476("statelessVisitor2", abstractC16892.mo6020().m33350());
        } else if (!(interfaceC178810 instanceof C9555)) {
            throw new RuntimeException();
        }
        c0994.m3469();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25066(HashMap map, C18090 c18090, String str, boolean z) throws IOException {
        C14561 c14561M42196 = c18090.m42196();
        String str2 = str.substring(1) + "/";
        for (C3545 c3545 : c18090.m42210()) {
            if (!c3545.isDirectory()) {
                if (c3545.m10808()) {
                    throw new IOException("Comparing encrypted files is not supported");
                }
                if (c3545.getName().startsWith(str2)) {
                    String strSubstring = c3545.getName().substring(str2.length());
                    map.put(strSubstring, new C0768(strSubstring, c3545.getSize(), z ? Long.valueOf(c3545.getSize()) : new C23492(c3545), c14561M42196, c3545));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25064(HashMap map, AbstractC15440 abstractC15440, boolean z, String str, C12058 c12058) {
        Object c7824;
        Object c19820;
        if (c12058.mo1526()) {
            return;
        }
        for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
            if (abstractC15441.mo23113()) {
                StringBuilder sbM15339 = C5368.m15339(str);
                sbM15339.append(abstractC15441.getName());
                sbM15339.append("/");
                String string = sbM15339.toString();
                if (z) {
                    map.put(string, new C21231(0L, abstractC15441, string));
                }
                m25064(map, abstractC15441, z, string, c12058);
            } else {
                StringBuilder sbM153310 = C5368.m15339(str);
                sbM153310.append(abstractC15441.getName());
                String string2 = sbM153310.toString();
                if (abstractC15441.mo27911()) {
                    c7824 = new C21231(abstractC15441.mo23127(), abstractC15441, string2);
                } else {
                    String strM36519 = abstractC15441.m36519();
                    if (strM36519 != null) {
                        c19820 = new C21936(string2, strM36519);
                    } else {
                        try {
                            C4297 c4297M25061 = m25061(abstractC15441);
                            char c = c4297M25061.f13863;
                            if (c == '-' || c == 'd') {
                                c7824 = new C21231(abstractC15441.mo23127(), abstractC15441, string2);
                            } else {
                                c19820 = new C19820(string2, c4297M25061);
                            }
                        } catch (IOException e) {
                            c7824 = new C7824(string2, e);
                        }
                    }
                    c7824 = c19820;
                }
                map.put(string2, c7824);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4297 m25061(AbstractC15440 abstractC15440) throws IOException {
        if (abstractC15440.mo27917()) {
            C17642 c17642M27928 = abstractC15440.mo27925().m27928();
            char cM27176 = C10881.m27176(c17642M27928.m41289());
            if (cM27176 != 'l') {
                return new C4297((cM27176 == 'b' || cM27176 == 'c') ? c17642M27928.m41282() : 0L, cM27176);
            }
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to resolve special link target: ")));
        }
        if (!abstractC15440.mo36530()) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to inspect special file: ")));
        }
        try {
            StructStat structStatLstat = Os.lstat(abstractC15440.mo36531().mo23544());
            char cM27177 = C10881.m27176(structStatLstat.st_mode);
            if (cM27177 != 'l') {
                return new C4297((cM27177 == 'b' || cM27177 == 'c') ? structStatLstat.st_rdev : 0L, cM27177);
            }
            throw new IOException("Unable to resolve special link target: " + abstractC15440.mo23554());
        } catch (ErrnoException e) {
            throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Unable to inspect special file: ")), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m25069(String str) {
        C10130 c10130 = new C10130();
        c10130.writeByte(77);
        c10130.writeByte(84);
        c10130.writeByte(0);
        c10130.writeByte(76);
        c10130.writeByte(73);
        c10130.writeByte(78);
        c10130.writeByte(75);
        c10130.writeByte(1);
        c10130.writeByte(78);
        c10130.writeByte(79);
        c10130.writeByte(84);
        c10130.writeByte(2);
        c10130.writeByte(69);
        c10130.writeByte(88);
        c10130.writeByte(73);
        c10130.writeByte(83);
        c10130.writeByte(84);
        c10130.writeByte(83);
        c10130.writeByte(3);
        c10130.m25439(str);
        return c10130.m25444();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25062(HashMap map, AbstractC3163 abstractC3163, String str, boolean z, String str2, C12058 c12058) {
        if (c12058.mo1526()) {
            return;
        }
        for (InterfaceC17889 interfaceC17889 : abstractC3163.mo7637(str, true)) {
            if (interfaceC17889.isDirectory()) {
                StringBuilder sbM15339 = C5368.m15339(str2);
                sbM15339.append(interfaceC17889.getName());
                sbM15339.append("/");
                String string = sbM15339.toString();
                if (z) {
                    map.put(string, new C2886(abstractC3163, interfaceC17889, string, 0L));
                }
                m25062(map, abstractC3163, interfaceC17889.getPath(), z, string, c12058);
            } else {
                StringBuilder sbM153310 = C5368.m15339(str2);
                sbM153310.append(interfaceC17889.getName());
                String string2 = sbM153310.toString();
                map.put(string2, new C2886(abstractC3163, interfaceC17889, string2, interfaceC17889.getSize()));
            }
        }
    }
}
