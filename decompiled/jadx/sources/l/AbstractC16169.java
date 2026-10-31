package l;

import com.alipay.sdk.m.p.a;
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
public abstract /* synthetic */ class AbstractC16169 {
    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public InterfaceC15234 trySplit() {
        return null;
    }

    public static Optional n(C16646 c16646) {
        if (c16646 == null) {
            return null;
        }
        if (c16646.isPresent()) {
            return Optional.of(c16646.get());
        }
        return Optional.empty();
    }

    public static C16646 j(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return C16646.of(optional.get());
        }
        return C16646.empty();
    }

    public static C4652 k(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C4652.c;
        }
        return new C4652(optionalDouble.getAsDouble());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.۠ۛᩴ] */
    public static C7995 a(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        C11003.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: l.۠ۛᩴ
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC16169.a(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    public static C12413 m(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return C12413.c;
        }
        return new C12413(optionalLong.getAsLong());
    }

    public static String i(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static C18058 l(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return C18058.c;
        }
        return new C18058(optionalInt.getAsInt());
    }

    public static String s(Object obj, Object obj2) {
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
        cArr[length] = a.h;
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static String h(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone(UtcDates.UTC);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static OptionalDouble o(C4652 c4652) {
        if (c4652 == null) {
            return null;
        }
        boolean z = c4652.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c4652.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt p(C18058 c18058) {
        if (c18058 == null) {
            return null;
        }
        boolean z = c18058.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(c18058.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong q(C12413 c12413) {
        if (c12413 == null) {
            return null;
        }
        boolean z = c12413.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(c12413.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static boolean e(InterfaceC4176 interfaceC4176, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.ERA;
        }
        return interfaceC10030 != null && interfaceC10030.l(interfaceC4176);
    }

    public static InterfaceC2765 r(InterfaceC2268 interfaceC2268) {
        C11003.requireNonNull(interfaceC2268, "temporal");
        return (InterfaceC2765) C11003.requireNonNullElse((InterfaceC2765) interfaceC2268.T(AbstractC5796.b), C8409.c);
    }

    public static int c(InterfaceC4176 interfaceC4176, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.ERA) {
            return interfaceC4176.getValue();
        }
        return AbstractC5796.a(interfaceC4176, interfaceC10030);
    }

    public static long d(InterfaceC4176 interfaceC4176, InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.ERA) {
            return interfaceC4176.getValue();
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(interfaceC4176);
    }

    public static InterfaceC2765 t(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = AbstractC4944.a;
        C11003.requireNonNull(str, "id");
        while (true) {
            ConcurrentMapC10942 concurrentMapC10943 = AbstractC4944.a;
            InterfaceC2765 interfaceC2765 = (InterfaceC2765) concurrentMapC10943.get(str);
            if (interfaceC2765 == null) {
                interfaceC2765 = (InterfaceC2765) AbstractC4944.b.get(str);
            }
            if (interfaceC2765 != null) {
                return interfaceC2765;
            }
            if (concurrentMapC10943.get("ISO") != null) {
                for (InterfaceC2765 interfaceC2766 : ServiceLoader.load(InterfaceC2765.class)) {
                    if (str.equals(interfaceC2766.k()) || str.equals(interfaceC2766.o())) {
                        return interfaceC2766;
                    }
                }
                throw new C16232("Unknown chronology: " + str);
            }
            C19699 c19699 = C19699.f77966l;
            c19699.getClass();
            AbstractC4944.n(c19699, "Hijrah-umalqura");
            C22520 c22520 = C22520.c;
            c22520.getClass();
            AbstractC4944.n(c22520, "Japanese");
            C3533 c3533 = C3533.c;
            c3533.getClass();
            AbstractC4944.n(c3533, "Minguo");
            C18287 c18287 = C18287.c;
            c18287.getClass();
            AbstractC4944.n(c18287, "ThaiBuddhist");
            try {
                for (AbstractC4944 abstractC4944 : Arrays.asList(new AbstractC4944[0])) {
                    if (!abstractC4944.k().equals("ISO")) {
                        AbstractC4944.n(abstractC4944, abstractC4944.k());
                    }
                }
                C8409 c8409 = C8409.c;
                c8409.getClass();
                AbstractC4944.n(c8409, "ISO");
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object f(InterfaceC4176 interfaceC4176, C8556 c8556) {
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.ERAS;
        }
        return AbstractC5796.c(interfaceC4176, c8556);
    }

    public static boolean g(InterfaceC8160 interfaceC8160, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC8160.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC15920.a) {
            AbstractC15920.a(interfaceC8160.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        C11003.requireNonNull(consumer);
        return interfaceC8160.tryAdvance((DoubleConsumer) new C11708(consumer, 0));
    }

    public static void b(InterfaceC8160 interfaceC8160, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC8160.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC15920.a) {
                AbstractC15920.a(interfaceC8160.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            C11003.requireNonNull(consumer);
            interfaceC8160.forEachRemaining((DoubleConsumer) new C11708(consumer, 0));
        }
    }

    public boolean tryAdvance(Object obj) {
        C11003.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        C11003.requireNonNull(obj);
    }
}
