package l;

import android.text.TextUtils;
import bin.mt.plus.Main;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۢ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9924 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IInArchive m25034(AbstractC15440 abstractC15440, Consumer consumer) throws Throwable {
        IInStream c4260;
        if (!C2868.m8784()) {
            throw new SevenZipException(C2868.m8785());
        }
        C24034 c24034 = new C24034(C10395.m26212(abstractC15440.mo23554()), consumer);
        IInArchive iInArchiveM52886 = null;
        try {
            if (abstractC15440.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                c4260 = m25036(abstractC15440, consumer);
            } else if (abstractC15440.getName().matches(".*\\.part[0-9]+\\.rar")) {
                String name = abstractC15440.getName();
                if (!name.toLowerCase().endsWith(".part1.rar")) {
                    AbstractC15440 abstractC15440M36524 = abstractC15440.m36524(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                    if (abstractC15440M36524.mo23120()) {
                        abstractC15440 = abstractC15440M36524;
                    }
                }
                c4260 = c24034.getStream(abstractC15440.mo23554());
            } else {
                consumer.n(abstractC15440);
                c4260 = new C4260(abstractC15440);
            }
            try {
                iInArchiveM52886 = SevenZip.m52886((C4260) c4260, c24034);
                iInArchiveM52886.addAutoCloseable(c4260);
                iInArchiveM52886.addAutoCloseable(c24034);
                iInArchiveM52886.setFileName(abstractC15440.getName());
                iInArchiveM52886.setFileSize(abstractC15440.mo23127());
                iInArchiveM52886.setFileTime(abstractC15440.mo23117());
                return iInArchiveM52886;
            } catch (Throwable th) {
                th = th;
                C0349.m1793(iInArchiveM52886);
                C0349.m1793(c4260);
                C0349.m1793(c24034);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c4260 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25035(Main main, AbstractC15440 abstractC15440, final InterfaceC21213 interfaceC21213) {
        Closeable c4260;
        if (!C2868.m8784()) {
            throw new SevenZipException(C2868.m8785());
        }
        C7101 c7101 = new C7101(main, interfaceC21213);
        c7101.m4001(C10395.m26212(abstractC15440.mo23554()));
        c7101.m3998(new BooleanSupplier() { // from class: l.ܿ᩻ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return interfaceC21213.mo1526();
            }
        });
        while (true) {
            try {
                if (abstractC15440.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                    c4260 = m25036(abstractC15440, new Consumer() { // from class: l.ܳ᩻ᩳ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            interfaceC21213.mo18443((AbstractC15440) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }
                    });
                } else if (abstractC15440.getName().matches(".*\\.part[0-9]+\\.rar")) {
                    String name = abstractC15440.getName();
                    if (!name.toLowerCase().endsWith(".part1.rar")) {
                        AbstractC15440 abstractC15440M36524 = abstractC15440.m36524(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                        if (abstractC15440M36524.mo23120()) {
                            abstractC15440 = abstractC15440M36524;
                        }
                    }
                    c4260 = c7101.getStream(abstractC15440.mo23554());
                } else {
                    interfaceC21213.mo18443(abstractC15440);
                    c4260 = new C4260(abstractC15440);
                }
                try {
                    try {
                        IInArchive iInArchiveM52886 = SevenZip.m52886((C4260) c4260, c7101);
                        iInArchiveM52886.setFileName(abstractC15440.getName());
                        iInArchiveM52886.setFileSize(abstractC15440.mo23127());
                        iInArchiveM52886.setFileTime(abstractC15440.mo23117());
                        iInArchiveM52886.addAutoCloseable(c4260);
                        iInArchiveM52886.addAutoCloseable(c7101);
                        if (c7101.m4003()) {
                            String strM4000 = c7101.m4000();
                            if (!TextUtils.isEmpty(strM4000)) {
                                C10395.m26217(abstractC15440.mo23554(), strM4000);
                            }
                        }
                        if (c7101.m4004()) {
                            C22523.m50501(c7101.m4000(), abstractC15440.mo23554());
                        }
                        interfaceC21213.mo18444(iInArchiveM52886);
                        return;
                    } catch (SevenZipException e) {
                        if (c7101.mo4002()) {
                            interfaceC21213.mo18445();
                            C0349.m1793(c4260);
                            c7101.m44933();
                            c7101.close();
                            return;
                        }
                        if (interfaceC21213.mo1526()) {
                            throw e;
                        }
                        if (c7101.m4003()) {
                            if (c7101.m3999()) {
                                C22523.m50500();
                            }
                            c7101.m4001(null);
                            try {
                                C0349.m1793(c4260);
                                c7101.m44933();
                            } catch (Throwable th) {
                                c7101.close();
                                throw th;
                            }
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        C0349.m1793(null);
                    } else {
                        C0349.m1793(c4260);
                        c7101.m44933();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c4260 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4260 m25036(AbstractC15440 abstractC15440, Consumer consumer) {
        int i;
        AbstractC15440 abstractC15440M36536 = abstractC15440.m36536();
        if (abstractC15440M36536 == null) {
            return new C4260(abstractC15440);
        }
        ArrayList arrayList = new ArrayList();
        C4365 c4365 = new C4365();
        String name = abstractC15440.getName();
        int i2 = Integer.parseInt(name.substring(name.length() - 3));
        String strM36561 = C15472.m36561(3, 0, name);
        int i3 = 1;
        while (true) {
            i = 2;
            if (i3 > 999) {
                break;
            }
            if (i3 != i2) {
                AbstractC15440 abstractC15440M36526 = abstractC15440M36536.m36526(String.format(Locale.ENGLISH, "%s%03d", strM36561, Integer.valueOf(i3)));
                if (!abstractC15440M36526.mo23119()) {
                    if (i3 >= i2) {
                        break;
                    }
                    arrayList.clear();
                    c4365.clear();
                    break;
                }
                c4365.add(abstractC15440M36526.mo23127());
                arrayList.add(abstractC15440M36526);
            } else {
                c4365.add(abstractC15440.mo23127());
                arrayList.add(abstractC15440);
            }
            i3++;
        }
        if (c4365.size() <= 1) {
            consumer.n(abstractC15440);
            return new C4260(abstractC15440);
        }
        c4365.m13087();
        arrayList.trimToSize();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            consumer.n((AbstractC15440) it.next());
        }
        return new C4260(C0127.m1200(C19885.m45717(name, c4365.m17072(), new C16146(i, arrayList))));
    }
}
