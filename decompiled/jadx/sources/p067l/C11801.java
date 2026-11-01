package p067l;

import android.text.TextUtils;
import bin.p000mt.plus.Main;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.IInStream;
import net.p069sf.sevenzipjbinding.SevenZip;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۢ᩻ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB38 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11801 {
    /* JADX INFO: renamed from: ֫ */
    public static IInArchive m27051(AbstractC17043 abstractC17043, Consumer consumer) throws Throwable {
        IInStream c6418;
        if (!C5095.m10851()) {
            throw new SevenZipException(C5095.m10852());
        }
        C25211 c25211 = new C25211(C12248.m28241(abstractC17043.mo25505()), consumer);
        IInArchive iInArchiveM55292 = null;
        try {
            if (abstractC17043.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                c6418 = m27053(abstractC17043, consumer);
            } else if (abstractC17043.getName().matches(".*\\.part[0-9]+\\.rar")) {
                String name = abstractC17043.getName();
                if (!name.toLowerCase().endsWith(".part1.rar")) {
                    AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                    if (abstractC17043M38682.mo25094()) {
                        abstractC17043 = abstractC17043M38682;
                    }
                }
                c6418 = c25211.getStream(abstractC17043.mo25505());
            } else {
                consumer.m45213n(abstractC17043);
                c6418 = new C6418(abstractC17043);
            }
            try {
                iInArchiveM55292 = SevenZip.m55292((C6418) c6418, c25211);
                iInArchiveM55292.addAutoCloseable(c6418);
                iInArchiveM55292.addAutoCloseable(c25211);
                iInArchiveM55292.setFileName(abstractC17043.getName());
                iInArchiveM55292.setFileSize(abstractC17043.mo25101());
                iInArchiveM55292.setFileTime(abstractC17043.mo25091());
                return iInArchiveM55292;
            } catch (Throwable th) {
                th = th;
                C2700.m4192(iInArchiveM55292);
                C2700.m4192(c6418);
                C2700.m4192(c25211);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c6418 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27052(Main main, AbstractC17043 abstractC17043, final InterfaceC22530 interfaceC22530) {
        Closeable c6418;
        if (!C5095.m10851()) {
            throw new SevenZipException(C5095.m10852());
        }
        C9118 c9118 = new C9118(main, interfaceC22530);
        c9118.m6243(C12248.m28241(abstractC17043.mo25505()));
        c9118.m6240(new BooleanSupplier() { // from class: l.ܿ᩻ᩳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return interfaceC22530.mo3924();
            }
        });
        while (true) {
            try {
                if (abstractC17043.getName().matches("(?i)(?s).*\\.7z\\.(?:00[1-9]|0[1-9][0-9]|[1-9][0-9]{2})")) {
                    c6418 = m27053(abstractC17043, new Consumer() { // from class: l.ܳ᩻ᩳ
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj) {
                            interfaceC22530.mo20392((AbstractC17043) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }
                    });
                } else if (abstractC17043.getName().matches(".*\\.part[0-9]+\\.rar")) {
                    String name = abstractC17043.getName();
                    if (!name.toLowerCase().endsWith(".part1.rar")) {
                        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(name.substring(0, name.toLowerCase().lastIndexOf(".part")) + ".part1.rar");
                        if (abstractC17043M38682.mo25094()) {
                            abstractC17043 = abstractC17043M38682;
                        }
                    }
                    c6418 = c9118.getStream(abstractC17043.mo25505());
                } else {
                    interfaceC22530.mo20392(abstractC17043);
                    c6418 = new C6418(abstractC17043);
                }
                try {
                    try {
                        IInArchive iInArchiveM55292 = SevenZip.m55292((C6418) c6418, c9118);
                        iInArchiveM55292.setFileName(abstractC17043.getName());
                        iInArchiveM55292.setFileSize(abstractC17043.mo25101());
                        iInArchiveM55292.setFileTime(abstractC17043.mo25091());
                        iInArchiveM55292.addAutoCloseable(c6418);
                        iInArchiveM55292.addAutoCloseable(c9118);
                        if (c9118.m6245()) {
                            String strM6242 = c9118.m6242();
                            if (!TextUtils.isEmpty(strM6242)) {
                                C12248.m28246(abstractC17043.mo25505(), strM6242);
                            }
                        }
                        if (c9118.m6246()) {
                            C23775.m52843(c9118.m6242(), abstractC17043.mo25505());
                        }
                        interfaceC22530.mo20393(iInArchiveM55292);
                        return;
                    } catch (SevenZipException e) {
                        if (c9118.mo6244()) {
                            interfaceC22530.mo20394();
                            C2700.m4192(c6418);
                            c9118.m47231();
                            c9118.close();
                            return;
                        }
                        if (interfaceC22530.mo3924()) {
                            throw e;
                        }
                        if (c9118.m6245()) {
                            if (c9118.m6241()) {
                                C23775.m52842();
                            }
                            c9118.m6243(null);
                            try {
                                C2700.m4192(c6418);
                                c9118.m47231();
                            } catch (Throwable th) {
                                c9118.close();
                                throw th;
                            }
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        C2700.m4192(null);
                    } else {
                        C2700.m4192(c6418);
                        c9118.m47231();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6418 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6418 m27053(AbstractC17043 abstractC17043, Consumer consumer) {
        int i;
        AbstractC17043 abstractC17043M38694 = abstractC17043.m38694();
        if (abstractC17043M38694 == null) {
            return new C6418(abstractC17043);
        }
        ArrayList arrayList = new ArrayList();
        C6517 c6517 = new C6517();
        String name = abstractC17043.getName();
        int i2 = Integer.parseInt(name.substring(name.length() - 3));
        String strM38720 = C17073.m38720(3, 0, name);
        int i3 = 1;
        while (true) {
            i = 2;
            if (i3 > 999) {
                break;
            }
            if (i3 != i2) {
                AbstractC17043 abstractC17043M38684 = abstractC17043M38694.m38684(String.format(Locale.ENGLISH, "%s%03d", strM38720, Integer.valueOf(i3)));
                if (!abstractC17043M38684.mo25093()) {
                    if (i3 >= i2) {
                        break;
                    }
                    arrayList.clear();
                    c6517.clear();
                    break;
                }
                c6517.add(abstractC17043M38684.mo25101());
                arrayList.add(abstractC17043M38684);
            } else {
                c6517.add(abstractC17043.mo25101());
                arrayList.add(abstractC17043);
            }
            i3++;
        }
        if (c6517.size() <= 1) {
            consumer.m45213n(abstractC17043);
            return new C6418(abstractC17043);
        }
        c6517.m14951();
        arrayList.trimToSize();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            consumer.m45213n((AbstractC17043) it.next());
        }
        return new C6418(C2489.m3601(C21267.m48028(name, c6517.m19004(), new C17714(i, arrayList))));
    }
}
