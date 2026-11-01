package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C24944 extends C10192 {

    /* JADX INFO: renamed from: ܳ */
    public C6169 f79651;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C23603 f79652;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24944(C23603 c23603, EnumC22423 enumC22423, EnumC2483... enumC2483Arr) {
        super(c23603, enumC22423, enumC2483Arr);
        this.f79652 = c23603;
    }

    @Override // p067l.C10192, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22380(EnumC2483 enumC2483, String str) {
        if (!this.f44742.contains(enumC2483)) {
            return false;
        }
        mo22379(str == null ? null : C23603.m52414(this.f79652, str));
        return true;
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4317 mo25022(String str) {
        m54814();
        return this.f79651.m13966(str);
    }

    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4317 mo25025(InterfaceC22097 interfaceC22097) {
        m54814();
        return this.f79651.m13971(interfaceC22097);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ᩳܳ۠] */
    @Override // p067l.AbstractC12875
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo25026() {
        final List listSingletonList;
        C6169 c6169 = this.f79651;
        Set setM13970 = c6169 != null ? c6169.m13970() : Collections.EMPTY_SET;
        if (!setM13970.isEmpty()) {
            listSingletonList = Collections.singletonList(setM13970);
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        if (this.f28258 == null) {
            return listSingletonList;
        }
        final ?? r1 = new Iterable() { // from class: l.ᩳܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C16226(this.f59582);
            }
        };
        return new Iterable() { // from class: l.ܿܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C23428.m52115(Arrays.asList(listSingletonList, r1), new C9982(9));
            }
        };
    }

    @Override // p067l.C10192, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22381(InterfaceC22097 interfaceC22097) {
        if (this.f79651 == null) {
            m54814();
        }
        return this.f79651.m13969(interfaceC22097);
    }

    @Override // p067l.C10192, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo22379(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
                if (C18743.exists(interfaceC22097, new EnumC16060[0]) && !C18743.isDirectory(interfaceC22097, new EnumC16060[0])) {
                    String string = interfaceC22097.getFileName().toString();
                    int iLastIndexOf = string.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        String strSubstring = string.substring(iLastIndexOf);
                        strSubstring.getClass();
                        if (strSubstring.equals(".jar") || strSubstring.equals(".jmod")) {
                        }
                    }
                    throw new IllegalArgumentException(interfaceC22097.toString());
                }
            }
        }
        super.mo22379(iterable);
        this.f79651 = null;
    }

    @Override // p067l.AbstractC15635, p067l.AbstractC12875
    /* JADX INFO: renamed from: ֫ */
    public final void mo25023(Iterable iterable, String str) {
        C12826.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC22097 interfaceC22097 = (InterfaceC22097) it.next();
            AbstractC15635.m35525(interfaceC22097);
            arrayList.add(interfaceC22097);
        }
        m54814();
        C18238 c18238M13966 = this.f79651.m13966(str);
        if (c18238M13966 == null) {
            c18238M13966 = new C18238(this.f79652, this, this.f44741.getName() + "[" + str + "]", str, arrayList, true);
            this.f79651.m13968(c18238M13966);
        } else {
            c18238M13966.f54448 = arrayList;
            this.f79651.m13972(c18238M13966);
        }
        c18238M13966.f54450 = true;
        this.f44740 = true;
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m54814() {
        if (this.f79651 != null) {
            return;
        }
        this.f79651 = new C6169(this.f79652);
        Iterator it = mo25026().iterator();
        while (it.hasNext()) {
            for (InterfaceC4317 interfaceC4317 : (Set) it.next()) {
                if (interfaceC4317 instanceof C18238) {
                    C18238 c18238 = (C18238) interfaceC4317;
                    if (!this.f79651.f15489.containsKey(c18238.f54451)) {
                        this.f79651.m13968(c18238);
                    }
                }
            }
        }
    }
}
