package l;

import com.alipay.sdk.m.y.l;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.۫ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C12524 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f37631;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f37632;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f37634;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f37635;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20328 f37636;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21697 f37637;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f37638;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f37639;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13955 f37640;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C21697 f37630 = C21697.f69584;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC8291 f37629 = EnumC8291.f25474;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f37628 = EnumC0571.f2252;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f37627 = EnumC0571.f2251;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m30726(String str) {
        boolean z;
        C16469 c16469M38775 = C16469.m38775(TransferUtilityOptions.class);
        Object obj = null;
        if (str == null) {
            return null;
        }
        C17175 c17175 = new C17175(new StringReader(str));
        EnumC16093 enumC16093 = EnumC16093.LEGACY_STRICT;
        c17175.m40392(enumC16093);
        EnumC16093 enumC16093M40395 = c17175.m40395();
        if (c17175.m40395() == enumC16093) {
            c17175.m40392(EnumC16093.LENIENT);
        }
        try {
            try {
                try {
                    c17175.m40398();
                    z = false;
                    try {
                        AbstractC8333 abstractC8333M30728 = m30728(c16469M38775);
                        Object objMo2844 = abstractC8333M30728.mo2844(c17175);
                        Class clsM10353 = C3395.m10353(c16469M38775.m38778());
                        if (objMo2844 != null && !clsM10353.isInstance(objMo2844)) {
                            throw new ClassCastException("Type adapter '" + abstractC8333M30728 + "' returned wrong type; requested " + c16469M38775.m38778() + " but got instance of " + objMo2844.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        c17175.m40392(enumC16093M40395);
                        obj = objMo2844;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new C14682(e);
                        }
                        c17175.m40392(enumC16093M40395);
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (c17175.m40398() != EnumC14352.END_DOCUMENT) {
                            throw new C14682("JSON document was not fully consumed.");
                        }
                    } catch (C6592 e3) {
                        throw new C14682(e3);
                    } catch (IOException e4) {
                        throw new C13934(e4);
                    }
                }
                return obj;
            } catch (Throwable th) {
                c17175.m40392(enumC16093M40395);
                throw th;
            }
        } catch (IOException e5) {
            throw new C14682(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new C14682(e7);
        }
    }

    public C12524() {
        C3394 c3394 = C3394.f10748;
        Map map = Collections.EMPTY_MAP;
        EnumC21034 enumC21034 = EnumC21034.f67876;
        List list = Collections.EMPTY_LIST;
        this.f37639 = new ThreadLocal();
        this.f37633 = new ConcurrentMapC10942();
        C20328 c20328 = new C20328();
        this.f37636 = c20328;
        this.f37635 = true;
        this.f37637 = f37630;
        this.f37631 = list;
        this.f37634 = list;
        this.f37632 = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C21906.f70129);
        arrayList.add(C9640.m24576(f37628));
        arrayList.add(c3394);
        arrayList.addAll(list);
        arrayList.add(C21906.f70128);
        arrayList.add(C21906.f70144);
        arrayList.add(C21906.f70130);
        arrayList.add(C21906.f70146);
        arrayList.add(C21906.f70147);
        AbstractC8333 abstractC8333 = C21906.f70138;
        arrayList.add(C21906.m49305(Long.TYPE, Long.class, abstractC8333));
        arrayList.add(C21906.m49305(Double.TYPE, Double.class, new C22402()));
        arrayList.add(C21906.m49305(Float.TYPE, Float.class, new C20286()));
        arrayList.add(C23750.m52398(f37627));
        arrayList.add(C21906.f70140);
        arrayList.add(C21906.f70124);
        arrayList.add(C21906.m49306(AtomicLong.class, new C4763(abstractC8333).m21935()));
        arrayList.add(C21906.m49306(AtomicLongArray.class, new C3352(abstractC8333).m21935()));
        arrayList.add(C21906.f70134);
        arrayList.add(C21906.f70132);
        arrayList.add(C21906.f70145);
        arrayList.add(C21906.f70148);
        arrayList.add(C21906.m49306(BigDecimal.class, C21906.f70142));
        arrayList.add(C21906.m49306(BigInteger.class, C21906.f70141));
        arrayList.add(C21906.m49306(C13976.class, C21906.f70123));
        arrayList.add(C21906.f70136);
        arrayList.add(C21906.f70126);
        arrayList.add(C21906.f70135);
        arrayList.add(C21906.f70125);
        arrayList.add(C21906.f70131);
        arrayList.add(C21906.f70143);
        arrayList.add(C21906.f70137);
        arrayList.add(C10429.f31334);
        arrayList.add(C21906.f70133);
        if (C10826.f32567) {
            arrayList.add(C10826.f32569);
            arrayList.add(C10826.f32566);
            arrayList.add(C10826.f32568);
        }
        arrayList.add(C22423.f72655);
        arrayList.add(C21906.f70139);
        arrayList.add(new C4784(c20328));
        arrayList.add(new C18106(c20328));
        C13955 c13955 = new C13955(c20328);
        this.f37640 = c13955;
        arrayList.add(c13955);
        arrayList.add(C21906.f70127);
        arrayList.add(new C5406(c20328, f37629, c3394, c13955));
        this.f37638 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30725(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 m30728(C16469 c16469) {
        boolean z;
        C11003.requireNonNull(c16469, "type must not be null");
        ConcurrentMapC10942 concurrentMapC10942 = this.f37633;
        AbstractC8333 abstractC8333 = (AbstractC8333) concurrentMapC10942.get(c16469);
        if (abstractC8333 != null) {
            return abstractC8333;
        }
        ThreadLocal threadLocal = this.f37639;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC8333 abstractC8334 = (AbstractC8333) map.get(c16469);
            if (abstractC8334 != null) {
                return abstractC8334;
            }
            z = false;
        }
        try {
            C13229 c13229 = new C13229();
            map.put(c16469, c13229);
            Iterator it = this.f37638.iterator();
            AbstractC8333 abstractC8333Mo8743 = null;
            while (it.hasNext()) {
                abstractC8333Mo8743 = ((InterfaceC15387) it.next()).mo8743(this, c16469);
                if (abstractC8333Mo8743 != null) {
                    c13229.m32095(abstractC8333Mo8743);
                    map.put(c16469, abstractC8333Mo8743);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC8333Mo8743 != null) {
                if (z) {
                    concurrentMapC10942.putAll(map);
                }
                return abstractC8333Mo8743;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + c16469);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 m30727(InterfaceC15387 interfaceC15387, C16469 c16469) {
        C11003.requireNonNull(interfaceC15387, "skipPast must not be null");
        C11003.requireNonNull(c16469, "type must not be null");
        C13955 c13955 = this.f37640;
        if (c13955.m33404(interfaceC15387, c16469)) {
            interfaceC15387 = c13955;
        }
        boolean z = false;
        for (InterfaceC15387 interfaceC15388 : this.f37638) {
            if (z) {
                AbstractC8333 abstractC8333Mo8743 = interfaceC15388.mo8743(this, c16469);
                if (abstractC8333Mo8743 != null) {
                    return abstractC8333Mo8743;
                }
            } else if (interfaceC15388 == interfaceC15387) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c16469);
        }
        return m30728(c16469);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30730(Object obj, Class cls, C23525 c23525) {
        AbstractC8333 abstractC8333M30728 = m30728(C16469.m38776((Type) cls));
        EnumC16093 enumC16093M51982 = c23525.m51982();
        if (c23525.m51982() == EnumC16093.LEGACY_STRICT) {
            c23525.m51977(EnumC16093.LENIENT);
        }
        boolean zM51980 = c23525.m51980();
        boolean zM51990 = c23525.m51990();
        c23525.m51979(this.f37635);
        c23525.m51985(false);
        try {
            try {
                abstractC8333M30728.mo2845(c23525, obj);
                c23525.m51977(enumC16093M51982);
                c23525.m51979(zM51980);
                c23525.m51985(zM51990);
            } catch (IOException e) {
                throw new C13934(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c23525.m51977(enumC16093M51982);
            c23525.m51979(zM51980);
            c23525.m51985(zM51990);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30731(AbstractC23107 abstractC23107, C23525 c23525) {
        EnumC16093 enumC16093M51982 = c23525.m51982();
        boolean zM51980 = c23525.m51980();
        boolean zM51990 = c23525.m51990();
        c23525.m51979(this.f37635);
        c23525.m51985(false);
        if (c23525.m51982() == EnumC16093.LEGACY_STRICT) {
            c23525.m51977(EnumC16093.LENIENT);
        }
        try {
            try {
                try {
                    C21906.f70122.mo2845(c23525, abstractC23107);
                    c23525.m51977(enumC16093M51982);
                    c23525.m51979(zM51980);
                    c23525.m51985(zM51990);
                } catch (IOException e) {
                    throw new C13934(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c23525.m51977(enumC16093M51982);
            c23525.m51979(zM51980);
            c23525.m51985(zM51990);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23525 m30729(Writer writer) {
        C23525 c23525 = new C23525(writer);
        c23525.m51978(this.f37637);
        c23525.m51979(this.f37635);
        c23525.m51977(EnumC16093.LEGACY_STRICT);
        c23525.m51985(false);
        return c23525;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f37638 + ",instanceCreators:" + this.f37636 + l.d;
    }
}
