package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: l.۠֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9846 extends AbstractC23258 {

    /* JADX INFO: renamed from: ֫ */
    public final C13870 f27315;

    /* JADX INFO: renamed from: ۧ */
    public final C2469 f27316;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC22588 f27317;

    /* JADX INFO: renamed from: ܽ */
    public final String f27318;

    /* JADX INFO: renamed from: ܿ */
    public final Object f27319;

    /* JADX INFO: renamed from: ᩳ */
    public final String f27320;

    @Override // p067l.AbstractC23258
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23258 mo23107(String str, InterfaceC17797 interfaceC17797) {
        return this;
    }

    public C9846(Object obj, String str, String str2, C2469 c2469, EnumC22588 enumC22588) {
        Collection collectionM8475;
        C13045.m29867(obj, C0226b.f1011d);
        C13045.m29867(str, "tag");
        C13045.m29867(c2469, "logger");
        C13045.m29867(enumC22588, "verificationMode");
        this.f27319 = obj;
        this.f27320 = str;
        this.f27318 = str2;
        this.f27316 = c2469;
        this.f27317 = enumC22588;
        String strM51798 = AbstractC23258.m51798(obj, str2);
        C13045.m29867(strM51798, "message");
        C13870 c13870 = new C13870(strM51798);
        StackTraceElement[] stackTrace = c13870.getStackTrace();
        C13045.m29865(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C19768.m44906(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collectionM8475 = C10893.f30179;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collectionM8475 = C24108.m53361(stackTrace);
            } else if (length == 1) {
                collectionM8475 = C4187.m8475(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collectionM8475 = arrayList;
            }
        }
        Object[] array = collectionM8475.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c13870.setStackTrace((StackTraceElement[]) array);
        this.f27315 = c13870;
    }

    @Override // p067l.AbstractC23258
    /* JADX INFO: renamed from: ֫ */
    public final Object mo23106() throws C13870 {
        int i = C3140.f5728[this.f27317.ordinal()];
        if (i == 1) {
            throw this.f27315;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new C10698();
        }
        String strM51798 = AbstractC23258.m51798(this.f27319, this.f27318);
        this.f27316.getClass();
        C13045.m29867(this.f27320, "tag");
        C13045.m29867(strM51798, "message");
        return null;
    }
}
