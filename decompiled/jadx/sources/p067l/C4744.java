package p067l;

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
public final class C4744 extends AbstractC15599 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C4744 f10749 = new C4744();

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9714(C11996 c11996) {
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9717(boolean z) {
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ܽ */
    public final String mo9725() {
        return "local";
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo9707(AbstractActivityC5549 abstractActivityC5549, InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory()) {
            return null;
        }
        return interfaceC19370.mo26445().mo29987();
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 mo9709(String str) {
        boolean zEndsWith = str.endsWith("/");
        if (zEndsWith) {
            str = C17073.m38720(1, 0, str);
        }
        C11450 c11450 = new C11450(C18524.m42109(str, new String[0]));
        if (c11450.isDirectory() != zEndsWith) {
            return null;
        }
        return c11450;
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final void mo9710(MessageDigest messageDigest) {
        messageDigest.update("local".getBytes());
    }

    @Override // p067l.AbstractC15599
    /* JADX INFO: renamed from: ֫ */
    public final ArrayList mo9708(String str, boolean z) {
        String str2;
        if (C17452.m39788()) {
            return new ArrayList();
        }
        final String strM41972 = AbstractC18422.m41972(str);
        List listMo25500 = C18524.m42109(strM41972, new String[0]).mo25500(z);
        final ArrayList arrayList = new ArrayList(listMo25500.size() + 1);
        if (listMo25500.isEmpty()) {
            if (strM41972.equals("/")) {
                String[] strArr = {"/system", "/system_ext", "/etc", "/sdcard", "/storage", "/data", "/cust", "/mnt", "/proc", "/product", "/vendor"};
                for (int i = 0; i < 11; i++) {
                    AbstractC17043 abstractC17043M42109 = C18524.m42109(strArr[i], new String[0]);
                    if (abstractC17043M42109.mo25094()) {
                        arrayList.add(new C11450(abstractC17043M42109));
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                AbstractC17043 abstractC17043 = C17853.f53287;
                sb.append(abstractC17043.getParent());
                sb.append("/");
                if (strM41972.equalsIgnoreCase(sb.toString())) {
                    arrayList.add(new C11450(abstractC17043));
                    String name = abstractC17043.getName();
                    if (name.equals("0")) {
                        str2 = "999";
                    } else {
                        str2 = name.equals("999") ? "0" : null;
                    }
                    if (str2 != null) {
                        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682(str2);
                        if (abstractC17043M38682.mo25094()) {
                            arrayList.add(new C11450(abstractC17043M38682));
                        }
                    }
                } else if (strM41972.equalsIgnoreCase("/storage/")) {
                    AbstractC17043 abstractC17043M421010 = C18524.m42109("/storage/emulated", new String[0]);
                    if (abstractC17043M421010.mo25094()) {
                        arrayList.add(new C11450(abstractC17043M421010));
                    }
                } else if (strM41972.equalsIgnoreCase("/data/")) {
                    AbstractC17043 abstractC17043M421011 = C18524.m42109("/data/app", new String[0]);
                    if (abstractC17043M421011.mo25094()) {
                        arrayList.add(new C11450(abstractC17043M421011));
                    }
                    if (C23770.m52834().mo4998()) {
                        AbstractC17043 abstractC17043M421012 = C18524.m42109("/data/local", new String[0]);
                        if (abstractC17043M421012.mo25094()) {
                            arrayList.add(new C11450(abstractC17043M421012));
                        }
                    }
                } else if (strM41972.equalsIgnoreCase("/data/local/")) {
                    if (C23770.m52834().mo4998()) {
                        AbstractC17043 abstractC17043M421013 = C18524.m42109("/data/local/tmp", new String[0]);
                        if (abstractC17043M421013.mo25094()) {
                            arrayList.add(new C11450(abstractC17043M421013));
                        }
                    }
                } else if (C11567.m26633("/data/app/", strM41972)) {
                    int i2 = 1;
                    C7480.stream(C7050.m16217().getInstalledPackages(0)).map(new C21878(2)).filter(new Predicate() { // from class: l.ۡۧ᩻
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C20697.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo55838negate() {
                            return C20697.$default$negate(this);
                        }

                        /* JADX INFO: renamed from: or */
                        public /* synthetic */ Predicate m24837or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            String str3 = (String) obj;
                            int length = str3.length();
                            String str4 = strM41972;
                            return length > str4.length() && C11567.m26633(str4, str3);
                        }
                    }).map(new C7977(i2, strM41972)).distinct().map(new C6263(i2, strM41972)).filter(new C2430(2)).map(new C7929(3)).forEach(new Consumer() { // from class: l.ܺۧ᩻
                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj) {
                            arrayList.add((C11450) obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }
                    });
                }
            }
        } else {
            Iterator it = listMo25500.iterator();
            while (it.hasNext()) {
                arrayList.add(new C11450((AbstractC17043) it.next()));
            }
        }
        if (!strM41972.equalsIgnoreCase("/storage/")) {
            return arrayList;
        }
        synchronized (C20278.class) {
            Iterator it2 = C20278.m45810().iterator();
            while (it2.hasNext()) {
                arrayList.add(new C11450((C6196) it2.next()));
            }
        }
        return arrayList;
    }
}
