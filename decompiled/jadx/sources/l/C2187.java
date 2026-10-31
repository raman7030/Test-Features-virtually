package l;

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
public final class C2187 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f7190;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f7191;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2123 f7192;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f7193;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7194;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20765 f7195;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7196;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f7197 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7198;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7199;

    public C2187(boolean z, ViewOnClickListenerC19121 viewOnClickListenerC19121, C16773 c16773, C20765 c20765, int i, InterfaceC2123 interfaceC2123, boolean z2) {
        this.f7198 = z;
        this.f7191 = viewOnClickListenerC19121;
        this.f7193 = c16773;
        this.f7195 = c20765;
        this.f7199 = i;
        this.f7192 = interfaceC2123;
        this.f7194 = z2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m7206() {
        List list = this.f7190;
        if (list != null) {
            return list;
        }
        C11233.m27804("tempItems");
        throw null;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        if (this.f7198) {
            return;
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
        C12346 c12346 = viewOnClickListenerC19121.f60243;
        if (c12346 == null) {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
        if (c12346.m29962()) {
            return;
        }
        C12346 c12347 = viewOnClickListenerC19121.f60243;
        if (c12347 != null) {
            c12347.postDelayed(new RunnableC9306(1, this, viewOnClickListenerC19121), 300L);
        } else {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7205(C2187 c2187, ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        if (c2187.f7197) {
            C12346 c12346 = viewOnClickListenerC19121.f60243;
            if (c12346 != null) {
                c12346.m29958(true);
            } else {
                C11233.m27804("swipeRefreshLayout");
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
    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        List list;
        HashMap map;
        Collator collator;
        boolean zM12003;
        String strM46315;
        HashMap map2;
        int iM20112;
        boolean zM20122;
        Comparator c11723;
        int i = Build.VERSION.SDK_INT;
        C16773 c16773 = this.f7193;
        if (i >= 30) {
            C20050 c20050 = C12993.f38911;
            String strM39741 = c16773.m39741();
            C11233.m27803(strM39741, "getPath(...)");
            C20050.m46239(strM39741);
        }
        List listMo6012 = c16773.mo6012();
        C11233.m27803(listMo6012, "list(...)");
        this.f7190 = listMo6012;
        if (i >= 30) {
            C20050 c20051 = C12993.f38911;
            C20050.m46239("");
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
        try {
            if (viewOnClickListenerC19121.f60249 != 0) {
                if (!viewOnClickListenerC19121.f60250.isEmpty() || !viewOnClickListenerC19121.f60248.isEmpty()) {
                    InterfaceC17664 interfaceC17664Stream = C5378.stream(m7206());
                    final C8537 c8537 = new C8537(viewOnClickListenerC19121);
                    Object objCollect = interfaceC17664Stream.filter(new Predicate() { // from class: l.ܺ֡᩷
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
                            return ((Boolean) c8537.invoke(obj)).booleanValue();
                        }
                    }).collect(C22976.toList());
                    C11233.m27803(objCollect, "collect(...)");
                    list = (List) objCollect;
                }
                map = new HashMap();
                collator = Collator.getInstance();
                zM12003 = C3962.m12003(m7206());
                for (InterfaceC17889 interfaceC17889 : m7206()) {
                    map.put(interfaceC17889.getName(), new C10312(collator, interfaceC17889.getName(), zM12003));
                }
                strM46315 = C20094.m46315("local:", c16773.m39742());
                map2 = C19890.f64282;
                if (map2.containsKey(strM46315)) {
                    Object obj = map2.get(strM46315);
                    C11233.m27799(obj);
                    int iIntValue = ((Number) obj).intValue();
                    iM20112 = C7489.m20112(iIntValue);
                    zM20122 = C7489.m20122(iIntValue);
                } else {
                    iM20112 = viewOnClickListenerC19121.f60239;
                    zM20122 = viewOnClickListenerC19121.f60241;
                }
                if (iM20112 != 0) {
                    c11723 = new C11723(map, zM20122);
                } else if (iM20112 != 1) {
                    c11723 = new C12428(map, zM20122, true);
                } else if (iM20112 != 2) {
                    c11723 = new C23011(map, zM20122);
                } else {
                    if (iM20112 == 3) {
                        throw new RuntimeException();
                    }
                    c11723 = new C13838(map, zM20122);
                }
                Collections.sort(m7206(), c11723);
                if (this.f7198 || !C16560.m38972(m7206(), viewOnClickListenerC19121.f60262)) {
                }
                this.f7196 = true;
                return;
            }
            InterfaceC17664 interfaceC17664Stream2 = C5378.stream(m7206());
            final C20532 c20532 = new C20532();
            Object objCollect2 = interfaceC17664Stream2.filter(new Predicate() { // from class: l.ۢ֡᩷
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
                public final boolean test(Object obj2) {
                    return ((Boolean) c20532.invoke(obj2)).booleanValue();
                }
            }).collect(C22976.toList());
            C11233.m27803(objCollect2, "collect(...)");
            list = (List) objCollect2;
            Collections.sort(m7206(), c11723);
        } catch (IllegalArgumentException e) {
            if (zM12003) {
                throw e;
            }
            map.clear();
            for (InterfaceC17889 interfaceC178810 : m7206()) {
                map.put(interfaceC178810.getName(), new C10312(collator, interfaceC178810.getName(), true));
            }
            Collections.sort(m7206(), c11723);
        }
        this.f7190 = list;
        map = new HashMap();
        collator = Collator.getInstance();
        zM12003 = C3962.m12003(m7206());
        while (r5.hasNext()) {
            map.put(interfaceC17889.getName(), new C10312(collator, interfaceC17889.getName(), zM12003));
        }
        strM46315 = C20094.m46315("local:", c16773.m39742());
        map2 = C19890.f64282;
        if (map2.containsKey(strM46315)) {
            Object obj2 = map2.get(strM46315);
            C11233.m27799(obj2);
            int iIntValue2 = ((Number) obj2).intValue();
            iM20112 = C7489.m20112(iIntValue2);
            zM20122 = C7489.m20122(iIntValue2);
        } else {
            iM20112 = viewOnClickListenerC19121.f60239;
            zM20122 = viewOnClickListenerC19121.f60241;
        }
        if (iM20112 != 0) {
            c11723 = new C11723(map, zM20122);
        } else if (iM20112 != 1) {
            c11723 = new C12428(map, zM20122, true);
        } else if (iM20112 != 2) {
            c11723 = new C23011(map, zM20122);
        } else {
            if (iM20112 == 3) {
                throw new RuntimeException();
            }
            c11723 = new C13838(map, zM20122);
        }
        if (this.f7198) {
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f7197 = false;
        if (this.f7195.mo19832().m33028(EnumC13728.CREATED)) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
            if (viewOnClickListenerC19121.f60245.get() != this.f7199) {
                return;
            }
            if (!this.f7198 || this.f7196) {
                ViewOnClickListenerC19121.m44094(viewOnClickListenerC19121, m7206());
                InterfaceC2123 interfaceC2123 = this.f7192;
                if (interfaceC2123 != null) {
                    interfaceC2123.mo4049();
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f7197 = false;
        if (this.f7195.mo19832().m33028(EnumC13728.CREATED)) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f7191;
            if (viewOnClickListenerC19121.f60245.get() != this.f7199) {
                return;
            }
            viewOnClickListenerC19121.m10223(exc, (DialogInterface.OnDismissListener) null);
            if (this.f7194) {
                List list = Collections.EMPTY_LIST;
                C11233.m27803(list, "emptyList(...)");
                ViewOnClickListenerC19121.m44094(viewOnClickListenerC19121, list);
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346 = this.f7191.f60243;
        if (c12346 != null) {
            c12346.m29958(false);
        } else {
            C11233.m27804("swipeRefreshLayout");
            throw null;
        }
    }
}
