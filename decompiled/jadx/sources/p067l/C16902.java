package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1G9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16902 implements InterfaceC8186 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [l.۠ܳܽ] */
    @Override // p067l.InterfaceC8186
    /* JADX INFO: renamed from: ֫ */
    public final void mo6237(final C20337 c20337, C12210 c12210, C20635 c20635) throws C3870 {
        int i;
        c20337.m45913(true);
        C19964 c19964M46637 = c20635.m46637("format");
        if (c19964M46637 == null) {
            i = 65535;
        } else if (c19964M46637.m45304().isEmpty()) {
            i = 0;
        } else {
            int i2 = 0;
            for (String str : c19964M46637.m45304().split("\\|")) {
                str.getClass();
                switch (str) {
                    case "fraction":
                        i2 |= 128;
                        break;
                    case "dimension":
                        i2 |= 64;
                        break;
                    case "reference":
                        i2 |= 1;
                        break;
                    case "string":
                        i2 |= 2;
                        break;
                    case "enum":
                        i2 |= 65536;
                        break;
                    case "boolean":
                        i2 |= 8;
                        break;
                    case "color":
                        i2 |= 16;
                        break;
                    case "flags":
                        i2 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                        break;
                    case "float":
                        i2 |= 32;
                        break;
                    case "integer":
                        i2 |= 4;
                        break;
                }
            }
            if ((i2 & 65536) != 0 && (i2 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                throw new C3870("Cannot define flag and enum at the same time", c19964M46637);
            }
            i = i2;
        }
        c20337.m45905(i, 16, 16777216);
        C14301 c14301 = (C14301) c12210.m28185("idTypeNameMap-" + c20337.m45918().mo14722(), (C10198) new Function() { // from class: l.۠ܳܽ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C21678 c21678M23897 = c20337.m45918().m23897();
                if (c21678M23897 == null) {
                    return null;
                }
                return c21678M23897.m48938();
            }
        });
        C21678 c21678M23897 = c20337.m45918().m23897();
        int iMo14722 = c21678M23897 != null ? (c21678M23897.m48939().mo14722() << 24) | (c21678M23897.mo5199() << 16) : 0;
        C9091 c9091 = new C9091();
        Iterator itM46631 = C20635.m46631(c20635);
        while (itM46631.hasNext()) {
            C20635 c20636 = (C20635) itM46631.next();
            String strM46644 = c20636.m46644();
            if (strM46644.equals("flag") || strM46644.equals("enum")) {
                C19964 c19964M46642 = c20636.m46642("name");
                C19964 c19964M46643 = c20636.m46642(C0226b.f1011d);
                String strM45304 = c19964M46642.m45304();
                String strM45305 = c19964M46643.m45304();
                Integer numM15679 = C6845.m15679(strM45304);
                if (numM15679 == null) {
                    numM15679 = c14301 == null ? null : (Integer) c14301.get(strM45304);
                    if (numM15679 != null) {
                        numM15679 = Integer.valueOf(numM15679.intValue() | iMo14722);
                    }
                }
                if (numM15679 == null) {
                    throw new C3870("Unknown name: ".concat(strM45304), c19964M46642);
                }
                if (C11774.m27013(strM45305, c9091)) {
                    c20337.m45905(c9091.f24647, c9091.f24648, numM15679.intValue());
                } else {
                    throw new C3870("Value must be integer", c19964M46643);
                }
            } else {
                C6845.m15680(c20337, c12210, c20636).m15877(C6845.m15678(c20636, c9091));
            }
        }
    }
}
