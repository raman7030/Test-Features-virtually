package p067l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41J */
/* JADX INFO: loaded from: classes4.dex */
public final class C17116 {

    /* JADX INFO: renamed from: ܳ */
    public static final Set f50553;

    /* JADX INFO: renamed from: ֫ */
    public static final Set f50551 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.CONSTRUCTOR));

    /* JADX INFO: renamed from: ۧ */
    public static final Set f50552 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.FIELD, EnumC24473.ENUM_CONSTANT));

    /* JADX INFO: renamed from: ܽ */
    public static final Set f50554 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.METHOD));

    /* JADX INFO: renamed from: ܿ */
    public static final Set f50555 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.PACKAGE));

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f50556 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.MODULE));

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f50557 = C21562.unmodifiableSet(EnumSet.of(EnumC24473.CLASS, EnumC24473.ENUM, EnumC24473.INTERFACE, EnumC24473.RECORD, EnumC24473.ANNOTATION_TYPE));

    static {
        Object[] objArr = {EnumC24473.RECORD_COMPONENT};
        HashSet hashSet = new HashSet(1);
        Object obj = objArr[0];
        C12826.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
        }
        f50553 = C21562.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38744(List list) {
        return m38743(list, f50551);
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m38745(List list) {
        return m38743(list, f50554);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38743(Iterable iterable, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC13745 interfaceC13745 = (InterfaceC13745) it.next();
            if (set.contains(interfaceC13745.mo3347())) {
                arrayList.add((InterfaceC13745) InterfaceC15755.class.cast(interfaceC13745));
            }
        }
        return arrayList;
    }
}
