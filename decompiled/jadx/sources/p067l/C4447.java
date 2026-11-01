package p067l;

import android.content.DialogInterface;
import android.os.Build;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4447 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۖ */
    public List f9975;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ ViewOnClickListenerC20541 f9976;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ InterfaceC4387 f9977;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C18310 f9978;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f9979;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C22103 f9980;

    /* JADX INFO: renamed from: ܺ */
    public boolean f9981;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f9982 = true;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f9983;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ int f9984;

    public C4447(boolean z, ViewOnClickListenerC20541 viewOnClickListenerC20541, C18310 c18310, C22103 c22103, int i, InterfaceC4387 interfaceC4387, boolean z2) {
        this.f9983 = z;
        this.f9976 = viewOnClickListenerC20541;
        this.f9978 = c18310;
        this.f9980 = c22103;
        this.f9984 = i;
        this.f9977 = interfaceC4387;
        this.f9979 = z2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final List m9285() {
        List list = this.f9975;
        if (list != null) {
            return list;
        }
        C13045.m29866("tempItems");
        throw null;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        if (this.f9983) {
            return;
        }
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f9976;
        C14102 c14102 = viewOnClickListenerC20541.f63475;
        if (c14102 == null) {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
        if (c14102.m32022()) {
            return;
        }
        C14102 c14103 = viewOnClickListenerC20541.f63475;
        if (c14103 != null) {
            c14103.postDelayed(new RunnableC11213(1, this, viewOnClickListenerC20541), 300L);
        } else {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m9284(C4447 c4447, ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        if (c4447.f9982) {
            C14102 c14102 = viewOnClickListenerC20541.f63475;
            if (c14102 != null) {
                c14102.m32018(true);
            } else {
                C13045.m29866("swipeRefreshLayout");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b1 A[LOOP:0: B:18:0x00ab->B:20:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:30:0x0100  */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        List list;
        HashMap map;
        Collator collator;
        boolean zM13924;
        String strM48631;
        HashMap map2;
        int iM22088;
        boolean zM22098;
        Comparator c13510;
        int i = Build.VERSION.SDK_INT;
        C18310 c18310 = this.f9978;
        if (i >= 30) {
            C21424 c21424 = C14717.f41957;
            String strM41982 = c18310.m41982();
            C13045.m29865(strM41982, "getPath(...)");
            C21424.m48555(strM41982);
        }
        List listMo8209 = c18310.mo8209();
        C13045.m29865(listMo8209, "list(...)");
        this.f9975 = listMo8209;
        if (i >= 30) {
            C21424 c21425 = C14717.f41957;
            C21424.m48555("");
        }
        ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f9976;
        try {
            if (viewOnClickListenerC20541.f63481 != 0) {
                if (!viewOnClickListenerC20541.f63482.isEmpty() || !viewOnClickListenerC20541.f63480.isEmpty()) {
                    InterfaceC19157 interfaceC19157Stream = C7480.stream(m9285());
                    final C10482 c10482 = new C10482(viewOnClickListenerC20541);
                    Object objCollect = interfaceC19157Stream.filter(new Predicate() { // from class: l.ܺ֡᩷
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
                        public /* synthetic */ Predicate m38915or(Predicate predicate) {
                            return C20697.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((Boolean) c10482.invoke(obj)).booleanValue();
                        }
                    }).collect(C24205.toList());
                    C13045.m29865(objCollect, "collect(...)");
                    list = (List) objCollect;
                }
                map = new HashMap();
                collator = Collator.getInstance();
                zM13924 = C6134.m13924(m9285());
                for (InterfaceC19370 interfaceC19370 : m9285()) {
                    map.put(interfaceC19370.getName(), new C12169(collator, interfaceC19370.getName(), zM13924));
                }
                strM48631 = C21466.m48631("local:", c18310.m41983());
                map2 = C21272.f66918;
                if (map2.containsKey(strM48631)) {
                    Object obj = map2.get(strM48631);
                    C13045.m29861(obj);
                    int iIntValue = ((Number) obj).intValue();
                    iM22088 = C9486.m22088(iIntValue);
                    zM22098 = C9486.m22098(iIntValue);
                } else {
                    iM22088 = viewOnClickListenerC20541.f63471;
                    zM22098 = viewOnClickListenerC20541.f63473;
                }
                if (iM22088 != 0) {
                    c13510 = new C13510(map, zM22098);
                } else if (iM22088 != 1) {
                    c13510 = new C14180(map, zM22098, true);
                } else if (iM22088 != 2) {
                    c13510 = new C24238(map, zM22098);
                } else {
                    if (iM22088 == 3) {
                        throw new RuntimeException();
                    }
                    c13510 = new C15520(map, zM22098);
                }
                Collections.sort(m9285(), c13510);
                if (this.f9983 || !C18107.m41198(m9285(), viewOnClickListenerC20541.f63494)) {
                }
                this.f9981 = true;
                return;
            }
            InterfaceC19157 interfaceC19157Stream2 = C7480.stream(m9285());
            final C21882 c21882 = new C21882();
            Object objCollect2 = interfaceC19157Stream2.filter(new Predicate() { // from class: l.ۢ֡᩷
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
                public /* synthetic */ Predicate m25712or(Predicate predicate) {
                    return C20697.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((Boolean) c21882.invoke(obj2)).booleanValue();
                }
            }).collect(C24205.toList());
            C13045.m29865(objCollect2, "collect(...)");
            list = (List) objCollect2;
            Collections.sort(m9285(), c13510);
        } catch (IllegalArgumentException e) {
            if (zM13924) {
                throw e;
            }
            map.clear();
            for (InterfaceC19370 interfaceC19371 : m9285()) {
                map.put(interfaceC19371.getName(), new C12169(collator, interfaceC19371.getName(), true));
            }
            Collections.sort(m9285(), c13510);
        }
        this.f9975 = list;
        map = new HashMap();
        collator = Collator.getInstance();
        zM13924 = C6134.m13924(m9285());
        while (r5.hasNext()) {
            map.put(interfaceC19370.getName(), new C12169(collator, interfaceC19370.getName(), zM13924));
        }
        strM48631 = C21466.m48631("local:", c18310.m41983());
        map2 = C21272.f66918;
        if (map2.containsKey(strM48631)) {
            Object obj2 = map2.get(strM48631);
            C13045.m29861(obj2);
            int iIntValue2 = ((Number) obj2).intValue();
            iM22088 = C9486.m22088(iIntValue2);
            zM22098 = C9486.m22098(iIntValue2);
        } else {
            iM22088 = viewOnClickListenerC20541.f63471;
            zM22098 = viewOnClickListenerC20541.f63473;
        }
        if (iM22088 != 0) {
            c13510 = new C13510(map, zM22098);
        } else if (iM22088 != 1) {
            c13510 = new C14180(map, zM22098, true);
        } else if (iM22088 != 2) {
            c13510 = new C24238(map, zM22098);
        } else {
            if (iM22088 == 3) {
                throw new RuntimeException();
            }
            c13510 = new C15520(map, zM22098);
        }
        if (this.f9983) {
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f9982 = false;
        if (this.f9980.mo21805().m35142(EnumC15415.CREATED)) {
            ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f9976;
            if (viewOnClickListenerC20541.f63477.get() != this.f9984) {
                return;
            }
            if (!this.f9983 || this.f9981) {
                ViewOnClickListenerC20541.m46388(viewOnClickListenerC20541, m9285());
                InterfaceC4387 interfaceC4387 = this.f9977;
                if (interfaceC4387 != null) {
                    interfaceC4387.mo6293();
                }
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f9982 = false;
        if (this.f9980.mo21805().m35142(EnumC15415.CREATED)) {
            ViewOnClickListenerC20541 viewOnClickListenerC20541 = this.f9976;
            if (viewOnClickListenerC20541.f63477.get() != this.f9984) {
                return;
            }
            viewOnClickListenerC20541.m12259(exc, (DialogInterface.OnDismissListener) null);
            if (this.f9979) {
                List list = Collections.EMPTY_LIST;
                C13045.m29865(list, "emptyList(...)");
                ViewOnClickListenerC20541.m46388(viewOnClickListenerC20541, list);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C14102 c14102 = this.f9976.f63475;
        if (c14102 != null) {
            c14102.m32018(false);
        } else {
            C13045.m29866("swipeRefreshLayout");
            throw null;
        }
    }
}
