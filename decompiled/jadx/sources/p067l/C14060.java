package p067l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.security.CodeSource;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.۫ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: V6B4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14060 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC13035 f39643;

    /* JADX INFO: renamed from: ۧ */
    public C23623 f39644;

    /* JADX INFO: renamed from: ܽ */
    public PrintWriter f39645;

    /* JADX INFO: renamed from: ᩳ */
    public PrintWriter f39646;

    public C14060(PrintWriter printWriter) {
        this.f39645 = printWriter;
        this.f39646 = printWriter;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31912(C14040 c14040) {
        String strM52448 = this.f39644.m52448((AbstractC6664) c14040);
        String strM52449 = this.f39644.m52448((AbstractC6664) C8300.f22004);
        if (!strM52448.startsWith(strM52449)) {
            strM52448 = C17588.m40053(strM52449, strM52448);
        }
        this.f39644.m52451(strM52448);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC14730 m31910(String[] strArr) {
        EnumC14730 enumC14730;
        boolean z;
        C5127 c5127 = new C5127();
        int i = C13625.f38343;
        c5127.m10907(InterfaceC13035.class, (InterfaceC21221) new C6249());
        c5127.m10908(C23623.f75174, this.f39646);
        c5127.m10908(C23623.f75176, this.f39645);
        C23623 c23623M52439 = C23623.m52439(c5127);
        this.f39644 = c23623M52439;
        if (strArr.length == 0) {
            try {
                EnumC2483.f3916.mo3579(new C5343(c23623M52439), "-help");
            } catch (C4496 unused) {
            }
            enumC14730 = EnumC14730.CMDERR;
        } else {
            try {
                ArrayList arrayListM45522 = C20096.m45522(C4848.m10282((Object[]) strArr));
                C17412 c17412 = (C17412) c5127.m10905(C17412.f52046);
                if (c17412 == null) {
                    c17412 = new C17412(c5127);
                }
                c17412.m39641(arrayListM45522);
                if (this.f39644.f75180 > 0) {
                    enumC14730 = EnumC14730.CMDERR;
                } else {
                    C13565 c13565M30871 = C13565.m30871(c5127);
                    if (c13565M30871.m30879("stdout")) {
                        this.f39644.m52462();
                        this.f39644.m52450(new PrintWriter((OutputStream) System.out, true));
                    }
                    if (c13565M30871.m30883("nonBatchMode") && System.getProperty("nonBatchMode") == null) {
                        c5127.m10907(C4908.class, (InterfaceC21221) new C11614());
                    }
                    InterfaceC13035 interfaceC13035M4104 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
                    this.f39643 = interfaceC13035M4104;
                    if (interfaceC13035M4104 instanceof C2660) {
                        interfaceC13035M4104 = ((C2660) interfaceC13035M4104).m4104();
                    }
                    if (interfaceC13035M4104 instanceof AbstractC22343) {
                        AbstractC22343 abstractC22343 = (AbstractC22343) interfaceC13035M4104;
                        abstractC22343.mo30985(c5127);
                        boolean zMo30987 = true;
                        for (Map.Entry entry : c17412.m39644().entrySet()) {
                            try {
                                zMo30987 &= abstractC22343.mo30987((EnumC2483) entry.getKey(), (String) entry.getValue());
                            } catch (IllegalArgumentException e) {
                                C23623 c23623 = abstractC22343.f70531;
                                String strM3589 = ((EnumC2483) entry.getKey()).m3589();
                                String message = e.getMessage();
                                C14040 c14040 = C8300.f21997;
                                c23623.m9355(new C14040("compiler", "illegal.argument.for.option", strM3589, message));
                                zMo30987 = false;
                            }
                        }
                        z = zMo30987;
                    } else {
                        z = true;
                    }
                    String strM30872 = c13565M30871.m30872("showClass");
                    if (strM30872 != null) {
                        if (strM30872.equals("showClass")) {
                            strM30872 = "com.sun.tools.javac.Main";
                        }
                        PrintWriter printWriterM52447 = this.f39644.m52447(EnumC22953.NOTICE);
                        printWriterM52447.println("javac: show class: ".concat(strM30872));
                        URL resource = C14060.class.getResource("/" + strM30872.replace('.', '/') + ".class");
                        if (resource != null) {
                            printWriterM52447.println(EnumC2483.f3919 + resource);
                        }
                        try {
                            InputStream resourceAsStream = C14060.class.getResourceAsStream("/" + strM30872.replace('.', '/') + ".class");
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
                                DigestInputStream digestInputStream = new DigestInputStream(resourceAsStream, messageDigest);
                                try {
                                    while (digestInputStream.read(new byte[8192]) > 0) {
                                    }
                                    byte[] bArrDigest = messageDigest.digest();
                                    digestInputStream.close();
                                    StringBuilder sb = new StringBuilder();
                                    for (byte b : bArrDigest) {
                                        sb.append(String.format("%02x", Byte.valueOf(b)));
                                    }
                                    printWriterM52447.println("  SHA-256 checksum: " + ((Object) sb));
                                    if (resourceAsStream != null) {
                                        resourceAsStream.close();
                                    }
                                } catch (Throwable th) {
                                    try {
                                        digestInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                if (resourceAsStream == null) {
                                    throw th3;
                                }
                                try {
                                    resourceAsStream.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (IOException | NoSuchAlgorithmException e2) {
                            printWriterM52447.println("  cannot compute digest: " + e2);
                        }
                    }
                    if (!(c17412.m39649() & z) || this.f39644.f75180 > 0) {
                        enumC14730 = EnumC14730.CMDERR;
                    } else if (c17412.m39645()) {
                        enumC14730 = EnumC14730.OK;
                    } else {
                        if (c13565M30871.m30879("debug.completionDeps")) {
                            C18063.m41119(c5127);
                        }
                        C16559 c16559 = (C16559) C16559.m37531(c5127);
                        c16559.m37532(c17412.m39647());
                        InterfaceC13035 interfaceC13035 = this.f39643;
                        EnumC2483 enumC2483 = EnumC2483.f3906;
                        if (interfaceC13035.mo4099(enumC2483.f3990) == 1) {
                            this.f39643.mo4107(C4848.m10276of((Object) EnumC12720.m29246(c5127).m29253()).iterator(), enumC2483.f3990);
                        }
                        C6684 c6684M15204 = C6684.m15204(c5127);
                        C4848 c4848M39646 = c17412.m39646();
                        if (!c4848M39646.isEmpty()) {
                            c16559.m37533(c4848M39646);
                        }
                        if (c13565M30871.m30873(EnumC2483.f3915) != null) {
                            c6684M15204.f17290 = c6684M15204.f17290.m10290(this.f39644.m52447(EnumC22953.NOTICE));
                        }
                        c13565M30871.m30879("printArgsToFile");
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                c6684M15204.m15223(c17412.m39648(), c17412.m39640(), C4848.m10283());
                                                HashSet hashSet = this.f39644.f75188;
                                                if (hashSet != null) {
                                                    if (hashSet.isEmpty()) {
                                                        this.f39644.m52451("all expected diagnostics found");
                                                        enumC14730 = EnumC14730.OK;
                                                    } else {
                                                        this.f39644.m52451("expected diagnostic keys not found: " + this.f39644.f75188);
                                                        enumC14730 = EnumC14730.ERROR;
                                                    }
                                                } else {
                                                    enumC14730 = c6684M15204.m15234() == 0 ? EnumC14730.OK : EnumC14730.ERROR;
                                                }
                                            } catch (Throwable th5) {
                                                c6684M15204.m15220();
                                                throw th5;
                                            }
                                        } catch (C18438 e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (C12995 e4) {
                                        this.f39644.m52460(EnumC16916.JAVAC, "msg.proc.annotation.uncaught.exception", new Object[0]);
                                        e4.getCause().printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
                                        enumC14730 = EnumC14730.SYSERR;
                                    }
                                } catch (Throwable th6) {
                                    if (c6684M15204.m15234() == 0 || c13565M30871.m30879("dev")) {
                                        m31911(th6);
                                    }
                                    enumC14730 = EnumC14730.ABNORMAL;
                                }
                            } catch (C24769 e5) {
                                this.f39644.m52451(e5.getMessage());
                                if (e5.getCause() != null && c13565M30871.m30879("dev")) {
                                    e5.getCause().printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
                                }
                                enumC14730 = EnumC14730.SYSERR;
                            }
                        } catch (IllegalAccessError e6) {
                            if (m31909(e6)) {
                                m31911((Throwable) e6);
                            }
                            enumC14730 = EnumC14730.ABNORMAL;
                        } catch (OutOfMemoryError e7) {
                            e = e7;
                            this.f39644.m52460(EnumC16916.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
                            enumC14730 = EnumC14730.SYSERR;
                        } catch (StackOverflowError e8) {
                            e = e8;
                            this.f39644.m52460(EnumC16916.JAVAC, "msg.resource", new Object[0]);
                            e.printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
                            enumC14730 = EnumC14730.SYSERR;
                        }
                        c6684M15204.m15220();
                    }
                }
            } catch (FileNotFoundException e9) {
                e = e9;
                String message2 = e.getMessage();
                C14040 c14041 = C8300.f21997;
                m31912(new C14040("compiler", "file.not.found", message2));
                enumC14730 = EnumC14730.SYSERR;
            } catch (NoSuchFileException e10) {
                e = e10;
                String message3 = e.getMessage();
                C14040 c14042 = C8300.f21997;
                m31912(new C14040("compiler", "file.not.found", message3));
                enumC14730 = EnumC14730.SYSERR;
            } catch (IOException e11) {
                this.f39644.m52460(EnumC16916.JAVAC, "msg.io", new Object[0]);
                e11.printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
                enumC14730 = EnumC14730.SYSERR;
            } catch (C6014 e12) {
                C14040 c14043 = C8300.f21997;
                m31912(new C14040("compiler", "unmatched.quote", e12.f15061));
                this.f39644.m52460(EnumC16916.JAVAC, "msg.usage", "javac");
                enumC14730 = EnumC14730.CMDERR;
            }
        }
        EnumC14730 enumC14731 = enumC14730;
        try {
            InterfaceC13035 interfaceC13036 = this.f39643;
            if (interfaceC13036 != null) {
                interfaceC13036.close();
            }
        } catch (IOException e13) {
            m31911(e13);
        }
        return enumC14731;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m31909(IllegalAccessError illegalAccessError) {
        Matcher matcher = Pattern.compile("(?i)(?<=tried to access class )([a-z_$][a-z\\d_$]*\\.)*[a-z_$][a-z\\d_$]*").matcher(illegalAccessError.getMessage());
        if (matcher.find()) {
            try {
                Class<?> cls = Class.forName(matcher.group(0));
                if (C14060.class.getClassLoader() != cls.getClassLoader()) {
                    CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                    CodeSource codeSource2 = C14060.class.getProtectionDomain().getCodeSource();
                    if (codeSource != null && codeSource2 != null) {
                        C23623 c23623 = this.f39644;
                        URL location = codeSource.getLocation();
                        URL location2 = codeSource2.getLocation();
                        C14040 c14040 = C8300.f21997;
                        c23623.m52459(new C14040("compiler", "two.class.loaders.2", location, location2));
                    } else {
                        this.f39644.m52459(C8300.f22078);
                    }
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31911(Throwable th) {
        this.f39644.m52460(EnumC16916.JAVAC, "msg.bug", C6684.m15209());
        th.printStackTrace(this.f39644.m52447(EnumC22953.NOTICE));
    }
}
