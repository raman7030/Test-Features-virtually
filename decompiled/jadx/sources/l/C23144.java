package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AHA */
/* JADX INFO: loaded from: classes.dex */
public final class C23144 extends AbstractC1661 implements Function {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f74404;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f74405;

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean zStartsWith;
        C16560 c16560 = (C16560) obj;
        String strM39058 = c16560.m39058();
        if (strM39058.equals(this.f74405)) {
            C21374.m48457(R.string.MT_Protector);
            return Boolean.FALSE;
        }
        boolean zMo13919 = c16560.m39044().mo6020().mo13919();
        Set setM13205 = C4459.m13205(zMo13919);
        for (InterfaceC17889 interfaceC17889 : this.f74404) {
            if (interfaceC17889.isDirectory()) {
                String str = interfaceC17889.getPath() + "/";
                if (zMo13919) {
                    zStartsWith = C9679.m24619(str, strM39058);
                } else {
                    zStartsWith = strM39058.startsWith(str);
                }
                if (zStartsWith) {
                    c16560.m39056().m10221(C4925.m14306(R.string.MT_Protector, interfaceC17889.getName()), false);
                    return Boolean.FALSE;
                }
            }
            setM13205.add(interfaceC17889.getName());
        }
        for (InterfaceC17889 interfaceC178810 : c16560.m39028()) {
            if (setM13205.contains(interfaceC178810.getName())) {
                C21374.m48459((CharSequence) (C4925.m14327(R.string.MT_Protector) + ": " + interfaceC178810.getName()));
                return Boolean.FALSE;
            }
        }
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C6211.class);
        c0994.m3478(this.f74404);
        c0994.m3480(c16560);
        c0994.m3481(c16560.m39044());
        c0994.m3474("targetPath", strM39058);
        c0994.m3469();
        return Boolean.TRUE;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(b.k);
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        this.f74404 = c2450.m7909();
        this.f74405 = c2450.m7926();
        c2450.m7921().m38996(R.string.MT_Protector, this);
    }
}
