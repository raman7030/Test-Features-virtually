package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.datepicker.UtcDates;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܺ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC17736 {
    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public InterfaceC16847 trySplit() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static Optional m40312n(C18189 c18189) {
        if (c18189 == null) {
            return null;
        }
        if (c18189.isPresent()) {
            return Optional.of(c18189.get());
        }
        return Optional.empty();
    }

    /* JADX INFO: renamed from: j */
    public static C18189 m40308j(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return C18189.m41402of(optional.get());
        }
        return C18189.empty();
    }

    /* JADX INFO: renamed from: k */
    public static C6790 m40309k(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C6790.f17582c;
        }
        return new C6790(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۠ۛᩴ] */
    /* JADX INFO: renamed from: a */
    public static C9967 m40299a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        C12826.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: l.۠ۛᩴ
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC17736.m40299a(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static C14166 m40311m(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return C14166.f40405c;
        }
        return new C14166(optionalLong.getAsLong());
    }

    /* JADX INFO: renamed from: i */
    public static String m40307i(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: l */
    public static C19531 m40310l(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C19531.f59472c;
        }
        return new C19531(optionalInt.getAsInt());
    }

    /* JADX INFO: renamed from: s */
    public static String m40317s(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = C0184a.f880h;
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: h */
    public static String m40306h(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    /* JADX INFO: renamed from: o */
    public static OptionalDouble m40313o(C6790 c6790) {
        if (c6790 == null) {
            return null;
        }
        boolean z = c6790.f17583a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c6790.f17584b);
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: renamed from: p */
    public static OptionalInt m40314p(C19531 c19531) {
        if (c19531 == null) {
            return null;
        }
        boolean z = c19531.f59473a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c19531.f59474b);
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: renamed from: q */
    public static OptionalLong m40315q(C14166 c14166) {
        if (c14166 == null) {
            return null;
        }
        boolean z = c14166.f40406a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(c14166.f40407b);
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m40303e(InterfaceC6338 interfaceC6338, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.ERA;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(interfaceC6338);
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC4997 m40316r(InterfaceC4524 interfaceC4524) {
        C12826.requireNonNull(interfaceC4524, "temporal");
        return (InterfaceC4997) C12826.requireNonNullElse((InterfaceC4997) interfaceC4524.mo6950T(AbstractC7877.f20680b), C10361.f28676c);
    }

    /* JADX INFO: renamed from: c */
    public static int m40301c(InterfaceC6338 interfaceC6338, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.ERA) {
            return interfaceC6338.getValue();
        }
        return AbstractC7877.m18193a(interfaceC6338, interfaceC11901);
    }

    /* JADX INFO: renamed from: d */
    public static long m40302d(InterfaceC6338 interfaceC6338, InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.ERA) {
            return interfaceC6338.getValue();
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return interfaceC11901.mo3652C(interfaceC6338);
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC4997 m40318t(String str) {
        ConcurrentMapC12768 concurrentMapC12768 = AbstractC7068.f18414a;
        C12826.requireNonNull(str, "id");
        while (true) {
            ConcurrentMapC12768 concurrentMapC12769 = AbstractC7068.f18414a;
            InterfaceC4997 interfaceC4997 = (InterfaceC4997) concurrentMapC12769.get(str);
            if (interfaceC4997 == null) {
                interfaceC4997 = (InterfaceC4997) AbstractC7068.f18415b.get(str);
            }
            if (interfaceC4997 != null) {
                return interfaceC4997;
            }
            if (concurrentMapC12769.get("ISO") != null) {
                for (InterfaceC4997 interfaceC4998 : ServiceLoader.load(InterfaceC4997.class)) {
                    if (str.equals(interfaceC4998.mo10584k()) || str.equals(interfaceC4998.mo10585o())) {
                        return interfaceC4998;
                    }
                }
                throw new C17796("Unknown chronology: " + str);
            }
            C21091 c21091 = C21091.f66261l;
            c21091.getClass();
            AbstractC7068.m16285n(c21091, "Hijrah-umalqura");
            C23772 c23772 = C23772.f75602c;
            c23772.getClass();
            AbstractC7068.m16285n(c23772, "Japanese");
            C5727 c5727 = C5727.f14028c;
            c5727.getClass();
            AbstractC7068.m16285n(c5727, "Minguo");
            C19749 c19749 = C19749.f60075c;
            c19749.getClass();
            AbstractC7068.m16285n(c19749, "ThaiBuddhist");
            try {
                for (AbstractC7068 abstractC7068 : Arrays.asList(new AbstractC7068[0])) {
                    if (!abstractC7068.mo10584k().equals("ISO")) {
                        AbstractC7068.m16285n(abstractC7068, abstractC7068.mo10584k());
                    }
                }
                C10361 c10361 = C10361.f28676c;
                c10361.getClass();
                AbstractC7068.m16285n(c10361, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m40304f(InterfaceC6338 interfaceC6338, C10500 c10500) {
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.ERAS;
        }
        return AbstractC7877.m18195c(interfaceC6338, c10500);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m40305g(InterfaceC10124 interfaceC10124, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC10124.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC17499.f52319a) {
            AbstractC17499.m39858a(interfaceC10124.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        C12826.requireNonNull(consumer);
        return interfaceC10124.tryAdvance((DoubleConsumer) new C13496(consumer, 0));
    }

    /* JADX INFO: renamed from: b */
    public static void m40300b(InterfaceC10124 interfaceC10124, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC10124.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC17499.f52319a) {
                AbstractC17499.m39858a(interfaceC10124.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            C12826.requireNonNull(consumer);
            interfaceC10124.forEachRemaining((DoubleConsumer) new C13496(consumer, 0));
        }
    }

    public boolean tryAdvance(Object obj) {
        C12826.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        C12826.requireNonNull(obj);
    }
}
