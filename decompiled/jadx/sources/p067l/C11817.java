package p067l;

import android.content.DialogInterface;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p035m.C0168b;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAJ9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11817 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC19370 f32979;

    /* JADX INFO: renamed from: ۫ */
    public AbstractC18422 f32980;

    /* JADX INFO: renamed from: ۬ */
    public AbstractC18422 f32981;

    public C11817() {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        if (!c4697.m9964("local") && !c4697.m9964("zip") && !c4697.m9964(C0168b.f616k)) {
            return false;
        }
        if (c4697.m9966() == 2) {
            return true;
        }
        C18107 c18107M9967 = c4697.m9967();
        return c18107M9967.m41261("local") || c18107M9967.m41261("zip") || c18107M9967.m41261(C0168b.f616k);
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        String name;
        String name2;
        if (c4697.m9966() == 2) {
            List listM9957 = c4697.m9957();
            this.f32979 = (InterfaceC19370) listM9957.get(0);
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM9957.get(1);
            AbstractC18422 abstractC18422M9970 = c4697.m9970();
            this.f32980 = abstractC18422M9970;
            this.f32981 = abstractC18422M9970;
            C18107 c18107M9969 = c4697.m9969();
            InterfaceC19370 interfaceC19371 = this.f32979;
            m27085(c18107M9969, interfaceC19371, interfaceC19370, interfaceC19371.getPath(), interfaceC19370.getPath(), true);
            return;
        }
        C18107 c18107M9967 = c4697.m9967();
        this.f32979 = c4697.m9961();
        InterfaceC19370 interfaceC19370M41251 = c18107M9967.m41251();
        this.f32981 = c4697.m9970();
        this.f32980 = c18107M9967.m41270();
        boolean zM41290 = c4697.m9969().m41290();
        if (this.f32979.getName().equals(interfaceC19370M41251.getName())) {
            int i = R.string.MT_Protector;
            String strM16203 = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, this.f32979.getName());
            if (!zM41290) {
                i = R.string.MT_Protector;
            }
            name2 = C7050.m16203(i, interfaceC19370M41251.getName());
            name = strM16203;
        } else {
            name = this.f32979.getName();
            name2 = interfaceC19370M41251.getName();
        }
        if (zM41290) {
            m27085(c4697.m9969(), this.f32979, interfaceC19370M41251, name, name2, false);
        } else {
            m27085(c4697.m9969(), interfaceC19370M41251, this.f32979, name2, name, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27085(final C18107 c18107, InterfaceC19370 interfaceC19370, InterfaceC19370 interfaceC19371, String str, String str2, boolean z) {
        View viewM12252 = c18107.m41282().m12252(R.layout.MT_Protector);
        final EditText editText = (EditText) viewM12252.findViewById(R.id.MT_Protector);
        final EditText editText2 = (EditText) viewM12252.findViewById(R.id.editText2);
        ((TextView) viewM12252.findViewById(R.id.MT_Protector)).setText(m7840());
        final C16509 c16509 = new C16509();
        c16509.f48526 = interfaceC19370;
        c16509.f48527 = interfaceC19371;
        c16509.f48528 = str;
        c16509.f48529 = str2;
        if (z && interfaceC19370.getTime() > interfaceC19371.getTime()) {
            InterfaceC19370 interfaceC19372 = c16509.f48526;
            c16509.f48526 = c16509.f48527;
            c16509.f48527 = interfaceC19372;
            String str3 = c16509.f48528;
            c16509.f48528 = c16509.f48529;
            c16509.f48529 = str3;
        }
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C4345.m8962(c16509.f48528, c16509.f48529, editText, editText2);
        Main mainM41282 = c18107.m41282();
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(mainM41282);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֡֡ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C11817.m27084(this.f3747, c18107, c16509);
            }
        });
        c20671.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46734(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671.m46732().m3861().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ֡ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16509 c165010 = c16509;
                InterfaceC19370 interfaceC19373 = c165010.f48526;
                c165010.f48526 = c165010.f48527;
                c165010.f48527 = interfaceC19373;
                String str4 = c165010.f48528;
                String str5 = c165010.f48529;
                c165010.f48528 = str5;
                c165010.f48529 = str4;
                C4345.m8962(str5, str4, editText, editText2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27084(C11817 c11817, C18107 c18107, C16509 c16509) {
        AbstractC18422 abstractC18422;
        AbstractC18422 abstractC18423;
        InterfaceC19370 interfaceC19370 = c16509.f48526;
        InterfaceC19370 interfaceC19371 = c16509.f48527;
        if (interfaceC19370 == c11817.f32979) {
            abstractC18422 = c11817.f32981;
            abstractC18423 = c11817.f32980;
        } else {
            abstractC18422 = c11817.f32980;
            abstractC18423 = c11817.f32981;
        }
        abstractC18422.mo17065(interfaceC19370);
        abstractC18423.mo17065(interfaceC19371);
        AbstractC17043 abstractC17043M54158 = C24556.m54158(c18107, c11817.m7840(), "txt");
        int i = C16723.f49313;
        C3313 c3313 = new C3313(C13828.class);
        c3313.m5777("saveAsPath", abstractC17043M54158.mo25505());
        c3313.m5777("inputPath1", interfaceC19370.getPath());
        c3313.m5777("inputPath2", interfaceC19371.getPath());
        if (interfaceC19370 instanceof C14387) {
            c3313.m5777("zipPath1", ((C12574) abstractC18422).m28981());
        } else if (interfaceC19370 instanceof AbstractC18707) {
            c3313.m5779("statelessVisitor1", abstractC18422.mo8217().m35469());
        } else if (!(interfaceC19370 instanceof C11450)) {
            throw new RuntimeException();
        }
        if (interfaceC19371 instanceof C14387) {
            c3313.m5777("zipPath2", ((C12574) abstractC18423).m28981());
        } else if (interfaceC19371 instanceof AbstractC18707) {
            c3313.m5779("statelessVisitor2", abstractC18423.mo8217().m35469());
        } else if (!(interfaceC19371 instanceof C11450)) {
            throw new RuntimeException();
        }
        c3313.m5772();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27083(HashMap map, C19561 c19561, String str, boolean z) throws IOException {
        C16207 c16207M44455 = c19561.m44455();
        String str2 = str.substring(1) + "/";
        for (C5738 c5738 : c19561.m44469()) {
            if (!c5738.isDirectory()) {
                if (c5738.m12789()) {
                    throw new IOException("Comparing encrypted files is not supported");
                }
                if (c5738.getName().startsWith(str2)) {
                    String strSubstring = c5738.getName().substring(str2.length());
                    map.put(strSubstring, new C3098(strSubstring, c5738.getSize(), z ? Long.valueOf(c5738.getSize()) : new C24695(c5738), c16207M44455, c5738));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27081(HashMap map, AbstractC17043 abstractC17043, boolean z, String str, C13828 c13828) {
        Object c9804;
        Object c21205;
        if (c13828.mo3924()) {
            return;
        }
        for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
            if (abstractC17044.mo25087()) {
                StringBuilder sbM17248 = C7470.m17248(str);
                sbM17248.append(abstractC17044.getName());
                sbM17248.append("/");
                String string = sbM17248.toString();
                if (z) {
                    map.put(string, new C22546(0L, abstractC17044, string));
                }
                m27081(map, abstractC17044, z, string, c13828);
            } else {
                StringBuilder sbM17249 = C7470.m17248(str);
                sbM17249.append(abstractC17044.getName());
                String string2 = sbM17249.toString();
                if (abstractC17044.mo29972()) {
                    c9804 = new C22546(abstractC17044.mo25101(), abstractC17044, string2);
                } else {
                    String strM38677 = abstractC17044.m38677();
                    if (strM38677 != null) {
                        c21205 = new C23216(string2, strM38677);
                    } else {
                        try {
                            C6452 c6452M27078 = m27078(abstractC17044);
                            char c = c6452M27078.f16678;
                            if (c == '-' || c == 'd') {
                                c9804 = new C22546(abstractC17044.mo25101(), abstractC17044, string2);
                            } else {
                                c21205 = new C21205(string2, c6452M27078);
                            }
                        } catch (IOException e) {
                            c9804 = new C9804(string2, e);
                        }
                    }
                    c9804 = c21205;
                }
                map.put(string2, c9804);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6452 m27078(AbstractC17043 abstractC17043) throws IOException {
        if (abstractC17043.mo29978()) {
            C19136 c19136M29989 = abstractC17043.mo29986().m29989();
            char cM29221 = C12710.m29221(c19136M29989.m43535());
            if (cM29221 != 'l') {
                return new C6452((cM29221 == 'b' || cM29221 == 'c') ? c19136M29989.m43528() : 0L, cM29221);
            }
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to resolve special link target: ")));
        }
        if (!abstractC17043.mo38688()) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to inspect special file: ")));
        }
        try {
            StructStat structStatLstat = Os.lstat(abstractC17043.mo38689().mo25495());
            char cM29222 = C12710.m29221(structStatLstat.st_mode);
            if (cM29222 != 'l') {
                return new C6452((cM29222 == 'b' || cM29222 == 'c') ? structStatLstat.st_rdev : 0L, cM29222);
            }
            throw new IOException("Unable to resolve special link target: " + abstractC17043.mo25505());
        } catch (ErrnoException e) {
            throw new IOException(C6316.m14442(abstractC17043, new StringBuilder("Unable to inspect special file: ")), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m27086(String str) {
        C11996 c11996 = new C11996();
        c11996.writeByte(77);
        c11996.writeByte(84);
        c11996.writeByte(0);
        c11996.writeByte(76);
        c11996.writeByte(73);
        c11996.writeByte(78);
        c11996.writeByte(75);
        c11996.writeByte(1);
        c11996.writeByte(78);
        c11996.writeByte(79);
        c11996.writeByte(84);
        c11996.writeByte(2);
        c11996.writeByte(69);
        c11996.writeByte(88);
        c11996.writeByte(73);
        c11996.writeByte(83);
        c11996.writeByte(84);
        c11996.writeByte(83);
        c11996.writeByte(3);
        c11996.m27459(str);
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27079(HashMap map, AbstractC5375 abstractC5375, String str, boolean z, String str2, C13828 c13828) {
        if (c13828.mo3924()) {
            return;
        }
        for (InterfaceC19370 interfaceC19370 : abstractC5375.mo9708(str, true)) {
            if (interfaceC19370.isDirectory()) {
                StringBuilder sbM17248 = C7470.m17248(str2);
                sbM17248.append(interfaceC19370.getName());
                sbM17248.append("/");
                String string = sbM17248.toString();
                if (z) {
                    map.put(string, new C5111(abstractC5375, interfaceC19370, string, 0L));
                }
                m27079(map, abstractC5375, interfaceC19370.getPath(), z, string, c13828);
            } else {
                StringBuilder sbM17249 = C7470.m17248(str2);
                sbM17249.append(interfaceC19370.getName());
                String string2 = sbM17249.toString();
                map.put(string2, new C5111(abstractC5375, interfaceC19370, string2, interfaceC19370.getSize()));
            }
        }
    }
}
