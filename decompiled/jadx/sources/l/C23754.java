package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C23754 extends C8232 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3999 f76899;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f76900;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23754(C22343 c22343, EnumC21101 enumC21101, EnumC0121... enumC0121Arr) {
        super(c22343, enumC21101, enumC0121Arr);
        this.f76900 = c22343;
    }

    @Override // l.C8232, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        mo20400(str == null ? null : C22343.m50075(this.f76900, str));
        return true;
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) {
        m52405();
        return this.f76899.m12046(str);
    }

    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        m52405();
        return this.f76899.m12051(interfaceC20758);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ᩳܳ۠] */
    @Override // l.AbstractC11055
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo23052() {
        final List listSingletonList;
        C3999 c3999 = this.f76899;
        Set setM12050 = c3999 != null ? c3999.m12050() : Collections.EMPTY_SET;
        if (!setM12050.isEmpty()) {
            listSingletonList = Collections.singletonList(setM12050);
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        if (this.f25348 == null) {
            return listSingletonList;
        }
        final ?? r1 = new Iterable() { // from class: l.ᩳܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C14581(this.f56369);
            }
        };
        return new Iterable() { // from class: l.ܿܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C22159.m49777(Arrays.asList(listSingletonList, r1), new C8011(9));
            }
        };
    }

    @Override // l.C8232, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        if (this.f76899 == null) {
            m52405();
        }
        return this.f76899.m12049(interfaceC20758);
    }

    @Override // l.C8232, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
                if (C17229.exists(interfaceC20758, new EnumC14406[0]) && !C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
                    String string = interfaceC20758.getFileName().toString();
                    int iLastIndexOf = string.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        String strSubstring = string.substring(iLastIndexOf);
                        strSubstring.getClass();
                        if (strSubstring.equals(".jar") || strSubstring.equals(".jmod")) {
                        }
                    }
                    throw new IllegalArgumentException(interfaceC20758.toString());
                }
            }
        }
        super.mo20400(iterable);
        this.f76899 = null;
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* JADX INFO: renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) {
        C11003.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
            AbstractC13959.m33406(interfaceC20758);
            arrayList.add(interfaceC20758);
        }
        m52405();
        C16698 c16698M12046 = this.f76899.m12046(str);
        if (c16698M12046 == null) {
            c16698M12046 = new C16698(this.f76900, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true);
            this.f76899.m12048(c16698M12046);
        } else {
            c16698M12046.f51263 = arrayList;
            this.f76899.m12052(c16698M12046);
        }
        c16698M12046.f51265 = true;
        this.f41660 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52405() {
        if (this.f76899 != null) {
            return;
        }
        this.f76899 = new C3999(this.f76900);
        Iterator it = mo23052().iterator();
        while (it.hasNext()) {
            for (InterfaceC2050 interfaceC2050 : (Set) it.next()) {
                if (interfaceC2050 instanceof C16698) {
                    C16698 c16698 = (C16698) interfaceC2050;
                    if (!this.f76899.f12673.containsKey(c16698.f51266)) {
                        this.f76899.m12048(c16698);
                    }
                }
            }
        }
    }
}
