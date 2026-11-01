package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.amazonaws.mobileconnectors.p060s3.transferutility.TransferUtilityOptions;
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
public final class C14271 {

    /* JADX INFO: renamed from: ֫ */
    public final List f40655;

    /* JADX INFO: renamed from: ۜ */
    public final List f40656;

    /* JADX INFO: renamed from: ۢ */
    public final ConcurrentMapC12768 f40657;

    /* JADX INFO: renamed from: ۧ */
    public final List f40658;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f40659;

    /* JADX INFO: renamed from: ܽ */
    public final C21688 f40660;

    /* JADX INFO: renamed from: ܿ */
    public final C22989 f40661;

    /* JADX INFO: renamed from: ᩳ */
    public final List f40662;

    /* JADX INFO: renamed from: ᩷ */
    public final ThreadLocal f40663;

    /* JADX INFO: renamed from: ᩻ */
    public final C15631 f40664;

    /* JADX INFO: renamed from: ܺ */
    public static final C22989 f40654 = C22989.f72289;

    /* JADX INFO: renamed from: ۡ */
    public static final EnumC10248 f40653 = EnumC10248.f28384;

    /* JADX INFO: renamed from: ۘ */
    public static final EnumC2911 f40652 = EnumC2911.f5027;

    /* JADX INFO: renamed from: ۖ */
    public static final EnumC2911 f40651 = EnumC2911.f5026;

    /* JADX INFO: renamed from: ֫ */
    public final Object m32798(String str) {
        boolean z;
        C18020 c18020M41001 = C18020.m41001(TransferUtilityOptions.class);
        Object obj = null;
        if (str == null) {
            return null;
        }
        C18691 c18691 = new C18691(new StringReader(str));
        EnumC17663 enumC17663 = EnumC17663.LEGACY_STRICT;
        c18691.m42637(enumC17663);
        EnumC17663 enumC17663M42640 = c18691.m42640();
        if (c18691.m42640() == enumC17663) {
            c18691.m42637(EnumC17663.LENIENT);
        }
        try {
            try {
                try {
                    c18691.m42643();
                    z = false;
                    try {
                        AbstractC10288 abstractC10288M32800 = m32800(c18020M41001);
                        Object objMo5173 = abstractC10288M32800.mo5173(c18691);
                        Class clsM12392 = C5595.m12392(c18020M41001.m41004());
                        if (objMo5173 != null && !clsM12392.isInstance(objMo5173)) {
                            throw new ClassCastException("Type adapter '" + abstractC10288M32800 + "' returned wrong type; requested " + c18020M41001.m41004() + " but got instance of " + objMo5173.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        c18691.m42637(enumC17663M42640);
                        obj = objMo5173;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new C16322(e);
                        }
                        c18691.m42637(enumC17663M42640);
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (c18691.m42643() != EnumC16008.END_DOCUMENT) {
                            throw new C16322("JSON document was not fully consumed.");
                        }
                    } catch (C8633 e3) {
                        throw new C16322(e3);
                    } catch (IOException e4) {
                        throw new C15611(e4);
                    }
                }
                return obj;
            } catch (Throwable th) {
                c18691.m42637(enumC17663M42640);
                throw th;
            }
        } catch (IOException e5) {
            throw new C16322(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new C16322(e7);
        }
    }

    public C14271() {
        C5594 c5594 = C5594.f13555;
        Map map = Collections.EMPTY_MAP;
        EnumC22359 enumC22359 = EnumC22359.f70562;
        List list = Collections.EMPTY_LIST;
        this.f40663 = new ThreadLocal();
        this.f40657 = new ConcurrentMapC12768();
        C21688 c21688 = new C21688();
        this.f40660 = c21688;
        this.f40659 = true;
        this.f40661 = f40654;
        this.f40655 = list;
        this.f40658 = list;
        this.f40656 = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C23188.f72843);
        arrayList.add(C11530.m26590(f40652));
        arrayList.add(c5594);
        arrayList.addAll(list);
        arrayList.add(C23188.f72842);
        arrayList.add(C23188.f72858);
        arrayList.add(C23188.f72844);
        arrayList.add(C23188.f72860);
        arrayList.add(C23188.f72861);
        AbstractC10288 abstractC10288 = C23188.f72852;
        arrayList.add(C23188.m51658(Long.TYPE, Long.class, abstractC10288));
        arrayList.add(C23188.m51658(Double.TYPE, Double.class, new C23659()));
        arrayList.add(C23188.m51658(Float.TYPE, Float.class, new C21648()));
        arrayList.add(C24940.m54807(f40651));
        arrayList.add(C23188.f72854);
        arrayList.add(C23188.f72838);
        arrayList.add(C23188.m51659(AtomicLong.class, new C6895(abstractC10288).m23905()));
        arrayList.add(C23188.m51659(AtomicLongArray.class, new C5554(abstractC10288).m23905()));
        arrayList.add(C23188.f72848);
        arrayList.add(C23188.f72846);
        arrayList.add(C23188.f72859);
        arrayList.add(C23188.f72862);
        arrayList.add(C23188.m51659(BigDecimal.class, C23188.f72856));
        arrayList.add(C23188.m51659(BigInteger.class, C23188.f72855));
        arrayList.add(C23188.m51659(C15651.class, C23188.f72837));
        arrayList.add(C23188.f72850);
        arrayList.add(C23188.f72840);
        arrayList.add(C23188.f72849);
        arrayList.add(C23188.f72839);
        arrayList.add(C23188.f72845);
        arrayList.add(C23188.f72857);
        arrayList.add(C23188.f72851);
        arrayList.add(C12280.f34298);
        arrayList.add(C23188.f72847);
        if (C12657.f35543) {
            arrayList.add(C12657.f35545);
            arrayList.add(C12657.f35542);
            arrayList.add(C12657.f35544);
        }
        arrayList.add(C23679.f75382);
        arrayList.add(C23188.f72853);
        arrayList.add(new C6915(c21688));
        arrayList.add(new C19576(c21688));
        C15631 c15631 = new C15631(c21688);
        this.f40664 = c15631;
        arrayList.add(c15631);
        arrayList.add(C23188.f72841);
        arrayList.add(new C7506(c21688, f40653, c5594, c15631));
        this.f40662 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m32797(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 m32800(C18020 c18020) {
        boolean z;
        C12826.requireNonNull(c18020, "type must not be null");
        ConcurrentMapC12768 concurrentMapC12768 = this.f40657;
        AbstractC10288 abstractC10288 = (AbstractC10288) concurrentMapC12768.get(c18020);
        if (abstractC10288 != null) {
            return abstractC10288;
        }
        ThreadLocal threadLocal = this.f40663;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC10288 abstractC10289 = (AbstractC10288) map.get(c18020);
            if (abstractC10289 != null) {
                return abstractC10289;
            }
            z = false;
        }
        try {
            C14941 c14941 = new C14941();
            map.put(c18020, c14941);
            Iterator it = this.f40662.iterator();
            AbstractC10288 abstractC10288Mo10810 = null;
            while (it.hasNext()) {
                abstractC10288Mo10810 = ((InterfaceC16992) it.next()).mo10810(this, c18020);
                if (abstractC10288Mo10810 != null) {
                    c14941.m34193(abstractC10288Mo10810);
                    map.put(c18020, abstractC10288Mo10810);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC10288Mo10810 != null) {
                if (z) {
                    concurrentMapC12768.putAll(map);
                }
                return abstractC10288Mo10810;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + c18020);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 m32799(InterfaceC16992 interfaceC16992, C18020 c18020) {
        C12826.requireNonNull(interfaceC16992, "skipPast must not be null");
        C12826.requireNonNull(c18020, "type must not be null");
        C15631 c15631 = this.f40664;
        if (c15631.m35523(interfaceC16992, c18020)) {
            interfaceC16992 = c15631;
        }
        boolean z = false;
        for (InterfaceC16992 interfaceC16993 : this.f40662) {
            if (z) {
                AbstractC10288 abstractC10288Mo10810 = interfaceC16993.mo10810(this, c18020);
                if (abstractC10288Mo10810 != null) {
                    return abstractC10288Mo10810;
                }
            } else if (interfaceC16993 == interfaceC16992) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c18020);
        }
        return m32800(c18020);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32802(Object obj, Class cls, C24726 c24726) {
        AbstractC10288 abstractC10288M32800 = m32800(C18020.m41002((Type) cls));
        EnumC17663 enumC17663M54384 = c24726.m54384();
        if (c24726.m54384() == EnumC17663.LEGACY_STRICT) {
            c24726.m54379(EnumC17663.LENIENT);
        }
        boolean zM54382 = c24726.m54382();
        boolean zM54392 = c24726.m54392();
        c24726.m54381(this.f40659);
        c24726.m54387(false);
        try {
            try {
                abstractC10288M32800.mo5174(c24726, obj);
                c24726.m54379(enumC17663M54384);
                c24726.m54381(zM54382);
                c24726.m54387(zM54392);
            } catch (IOException e) {
                throw new C15611(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c24726.m54379(enumC17663M54384);
            c24726.m54381(zM54382);
            c24726.m54387(zM54392);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32803(AbstractC24329 abstractC24329, C24726 c24726) {
        EnumC17663 enumC17663M54384 = c24726.m54384();
        boolean zM54382 = c24726.m54382();
        boolean zM54392 = c24726.m54392();
        c24726.m54381(this.f40659);
        c24726.m54387(false);
        if (c24726.m54384() == EnumC17663.LEGACY_STRICT) {
            c24726.m54379(EnumC17663.LENIENT);
        }
        try {
            try {
                try {
                    C23188.f72836.mo5174(c24726, abstractC24329);
                    c24726.m54379(enumC17663M54384);
                    c24726.m54381(zM54382);
                    c24726.m54387(zM54392);
                } catch (IOException e) {
                    throw new C15611(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c24726.m54379(enumC17663M54384);
            c24726.m54381(zM54382);
            c24726.m54387(zM54392);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24726 m32801(Writer writer) {
        C24726 c24726 = new C24726(writer);
        c24726.m54380(this.f40661);
        c24726.m54381(this.f40659);
        c24726.m54379(EnumC17663.LEGACY_STRICT);
        c24726.m54387(false);
        return c24726;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f40662 + ",instanceCreators:" + this.f40660 + C0249l.f1198d;
    }
}
