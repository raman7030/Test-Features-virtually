package l;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15517 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Set f47421;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Set f47419 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.CONSTRUCTOR));

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Set f47420 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.FIELD, EnumC23258.ENUM_CONSTANT));

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f47422 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.METHOD));

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Set f47423 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.PACKAGE));

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Set f47424 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.MODULE));

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f47425 = C20195.unmodifiableSet(EnumSet.of(EnumC23258.CLASS, EnumC23258.ENUM, EnumC23258.INTERFACE, EnumC23258.RECORD, EnumC23258.ANNOTATION_TYPE));

    static {
        Object[] objArr = {EnumC23258.RECORD_COMPONENT};
        HashSet hashSet = new HashSet(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
        }
        f47421 = C20195.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36585(List list) {
        return m36584(list, f47419);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36586(List list) {
        return m36584(list, f47422);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36584(Iterable iterable, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC11970 interfaceC11970 = (InterfaceC11970) it.next();
            if (set.contains(interfaceC11970.mo952())) {
                arrayList.add((InterfaceC11970) InterfaceC14085.class.cast(interfaceC11970));
            }
        }
        return arrayList;
    }
}
