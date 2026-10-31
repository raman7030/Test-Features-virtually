package l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۡ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public class C9174 extends AbstractC19737 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f27776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f27777;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4172 f27778;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC19695 f27779;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f27780;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC18325 f27781;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC19031 f27782;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f27783;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC1412 f27784;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f27785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27786;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC23969 f27787;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC11081 f27788;

    public C9174(ConcurrentMapC14754 concurrentMapC14754) {
        EnumC1412 enumC1412 = concurrentMapC14754.f45055;
        EnumC1412 enumC1413 = concurrentMapC14754.f45068;
        AbstractC11081 abstractC11081 = concurrentMapC14754.f45053;
        AbstractC11081 abstractC11082 = concurrentMapC14754.f45059;
        long j = concurrentMapC14754.f45057;
        long j2 = concurrentMapC14754.f45048;
        long j3 = concurrentMapC14754.f45067;
        InterfaceC19695 interfaceC19695 = concurrentMapC14754.f45064;
        int i = concurrentMapC14754.f45065;
        InterfaceC4172 interfaceC4172 = concurrentMapC14754.f45052;
        AbstractC18325 abstractC18325 = concurrentMapC14754.f45061;
        AbstractC19031 abstractC19031 = concurrentMapC14754.f45066;
        this.f27783 = enumC1412;
        this.f27784 = enumC1413;
        this.f27776 = abstractC11081;
        this.f27788 = abstractC11082;
        this.f27777 = j;
        this.f27785 = j2;
        this.f27780 = j3;
        this.f27779 = interfaceC19695;
        this.f27786 = i;
        this.f27778 = interfaceC4172;
        this.f27781 = (abstractC18325 == AbstractC18325.m42705() || abstractC18325 == C2803.f8751) ? null : abstractC18325;
        this.f27782 = abstractC19031;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2803 m23582() {
        char c;
        char c2;
        C2803 c2803M8652 = C2803.m8652();
        EnumC1412 enumC1412 = c2803M8652.f8762;
        C4025.m12114(enumC1412, "Key strength was already set to %s", enumC1412 == null);
        EnumC1412 enumC1413 = this.f27783;
        enumC1413.getClass();
        c2803M8652.f8762 = enumC1413;
        EnumC1412 enumC1414 = c2803M8652.f8753;
        C4025.m12114(enumC1414, "Value strength was already set to %s", enumC1414 == null);
        EnumC1412 enumC1415 = this.f27784;
        enumC1415.getClass();
        c2803M8652.f8753 = enumC1415;
        AbstractC11081 abstractC11081 = c2803M8652.f8763;
        C4025.m12114(abstractC11081, "key equivalence was already set to %s", abstractC11081 == null);
        AbstractC11081 abstractC11082 = this.f27776;
        abstractC11082.getClass();
        c2803M8652.f8763 = abstractC11082;
        AbstractC11081 abstractC11083 = c2803M8652.f8760;
        C4025.m12114(abstractC11083, "value equivalence was already set to %s", abstractC11083 == null);
        AbstractC11081 abstractC11084 = this.f27788;
        abstractC11084.getClass();
        c2803M8652.f8760 = abstractC11084;
        c2803M8652.m8655(this.f27786);
        C4025.m12116(c2803M8652.f8755 == null);
        InterfaceC4172 interfaceC4172 = this.f27778;
        interfaceC4172.getClass();
        c2803M8652.f8755 = interfaceC4172;
        c2803M8652.f8757 = false;
        long j = this.f27777;
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long j2 = c2803M8652.f8761;
            c = 1;
            c2 = 0;
            C4025.m12113(j2, "expireAfterWrite was already set to %s ns", j2 == -1);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(C10375.m26179("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
            }
            c2803M8652.f8761 = timeUnit.toNanos(j);
        } else {
            c = 1;
            c2 = 0;
        }
        long j3 = this.f27785;
        if (j3 > 0) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            long j4 = c2803M8652.f8758;
            C4025.m12113(j4, "expireAfterAccess was already set to %s ns", j4 == -1);
            if (!(j3 >= 0)) {
                Object[] objArr = new Object[2];
                objArr[c2] = Long.valueOf(j3);
                objArr[c] = timeUnit2;
                throw new IllegalArgumentException(C10375.m26179("duration cannot be negative: %s %s", objArr));
            }
            c2803M8652.f8758 = timeUnit2.toNanos(j3);
        }
        EnumC16207 enumC16207 = EnumC16207.INSTANCE;
        long j5 = this.f27780;
        InterfaceC19695 interfaceC19695 = this.f27779;
        if (interfaceC19695 != enumC16207) {
            c2803M8652.m8657(interfaceC19695);
            if (j5 != -1) {
                c2803M8652.m8659(j5);
            }
        } else if (j5 != -1) {
            c2803M8652.m8656(j5);
        }
        AbstractC18325 abstractC18325 = this.f27781;
        if (abstractC18325 != null) {
            C4025.m12116(c2803M8652.f8756 == null);
            c2803M8652.f8756 = abstractC18325;
        }
        return c2803M8652;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f27787 = m23582().m8654();
    }

    private Object readResolve() {
        return this.f27787;
    }

    @Override // l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13120() {
        return this.f27787;
    }
}
