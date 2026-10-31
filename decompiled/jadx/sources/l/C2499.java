package l;

import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AHU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2499 extends AbstractC13921 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C2499 f7958 = new C2499();

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7646(boolean z) {
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ܽ */
    public final String mo7654() {
        return "local";
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory()) {
            return null;
        }
        return interfaceC17889.mo24433().mo27926();
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        boolean zEndsWith = str.endsWith("/");
        if (zEndsWith) {
            str = C15472.m36561(1, 0, str);
        }
        C9555 c9555 = new C9555(C16999.m39866(str, new String[0]));
        if (c9555.isDirectory() != zEndsWith) {
            return null;
        }
        return c9555;
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("local".getBytes());
    }

    @Override // l.AbstractC13921
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String str2;
        if (C15871.m37616()) {
            return new ArrayList();
        }
        final String strM39731 = AbstractC16891.m39731(str);
        List listMo23549 = C16999.m39866(strM39731, new String[0]).mo23549(z);
        final ArrayList arrayList = new ArrayList(listMo23549.size() + 1);
        if (listMo23549.isEmpty()) {
            if (strM39731.equals("/")) {
                String[] strArr = {"/system", "/system_ext", "/etc", "/sdcard", "/storage", "/data", "/cust", "/mnt", "/proc", "/product", "/vendor"};
                for (int i = 0; i < 11; i++) {
                    AbstractC15440 abstractC15440M39866 = C16999.m39866(strArr[i], new String[0]);
                    if (abstractC15440M39866.mo23120()) {
                        arrayList.add(new C9555(abstractC15440M39866));
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                AbstractC15440 abstractC15440 = C16293.f50120;
                sb.append(abstractC15440.getParent());
                sb.append("/");
                if (strM39731.equalsIgnoreCase(sb.toString())) {
                    arrayList.add(new C9555(abstractC15440));
                    String name = abstractC15440.getName();
                    if (name.equals("0")) {
                        str2 = "999";
                    } else {
                        str2 = name.equals("999") ? "0" : null;
                    }
                    if (str2 != null) {
                        AbstractC15440 abstractC15440M36524 = abstractC15440.m36524(str2);
                        if (abstractC15440M36524.mo23120()) {
                            arrayList.add(new C9555(abstractC15440M36524));
                        }
                    }
                } else if (strM39731.equalsIgnoreCase("/storage/")) {
                    AbstractC15440 abstractC15440M39867 = C16999.m39866("/storage/emulated", new String[0]);
                    if (abstractC15440M39867.mo23120()) {
                        arrayList.add(new C9555(abstractC15440M39867));
                    }
                } else if (strM39731.equalsIgnoreCase("/data/")) {
                    AbstractC15440 abstractC15440M39868 = C16999.m39866("/data/app", new String[0]);
                    if (abstractC15440M39868.mo23120()) {
                        arrayList.add(new C9555(abstractC15440M39868));
                    }
                    if (C22518.m50492().mo2658()) {
                        AbstractC15440 abstractC15440M39869 = C16999.m39866("/data/local", new String[0]);
                        if (abstractC15440M39869.mo23120()) {
                            arrayList.add(new C9555(abstractC15440M39869));
                        }
                    }
                } else if (strM39731.equalsIgnoreCase("/data/local/")) {
                    if (C22518.m50492().mo2658()) {
                        AbstractC15440 abstractC15440M398610 = C16999.m39866("/data/local/tmp", new String[0]);
                        if (abstractC15440M398610.mo23120()) {
                            arrayList.add(new C9555(abstractC15440M398610));
                        }
                    }
                } else if (C9679.m24619("/data/app/", strM39731)) {
                    int i2 = 1;
                    C5378.stream(C4925.m14320().getInstalledPackages(0)).map(new C20528(2)).filter(new Predicate() { // from class: l.ۡۧ᩻
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19285.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo4928negate() {
                            return C19285.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19285.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            String str3 = (String) obj;
                            int length = str3.length();
                            String str4 = strM39731;
                            return length > str4.length() && C9679.m24619(str4, str3);
                        }
                    }).map(new C5901(i2, strM39731)).distinct().map(new C4098(i2, strM39731)).filter(new C0065(2)).map(new C5851(3)).forEach(new Consumer() { // from class: l.ܺۧ᩻
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            arrayList.add((C9555) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }
                    });
                }
            }
        } else {
            Iterator it = listMo23549.iterator();
            while (it.hasNext()) {
                arrayList.add(new C9555((AbstractC15440) it.next()));
            }
        }
        if (!strM39731.equalsIgnoreCase("/storage/")) {
            return arrayList;
        }
        synchronized (C18844.class) {
            Iterator it2 = C18844.m43544().iterator();
            while (it2.hasNext()) {
                arrayList.add(new C9555((C4027) it2.next()));
            }
        }
        return arrayList;
    }
}
