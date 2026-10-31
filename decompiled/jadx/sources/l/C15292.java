package l;

import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1G9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15292 implements InterfaceC6121 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [l.۠ܳܽ] */
    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫ */
    public final void mo3995(final C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int i;
        c18906.m43647(true);
        C18514 c18514M44343 = c19220.m44343("format");
        if (c18514M44343 == null) {
            i = 65535;
        } else if (c18514M44343.m43026().isEmpty()) {
            i = 0;
        } else {
            int i2 = 0;
            for (String str : c18514M44343.m43026().split("\\|")) {
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
                throw new C1580("Cannot define flag and enum at the same time", c18514M44343);
            }
            i = i2;
        }
        c18906.m43639(i, 16, 16777216);
        C12555 c12555 = (C12555) c10355.m26158("idTypeNameMap-" + c18906.m43652().mo12858(), (C8238) new Function() { // from class: l.۠ܳܽ
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
                C20317 c20317M21927 = c18906.m43652().m21927();
                if (c20317M21927 == null) {
                    return null;
                }
                return c20317M21927.m46615();
            }
        });
        C20317 c20317M21927 = c18906.m43652().m21927();
        int iMo12858 = c20317M21927 != null ? (c20317M21927.m46616().mo12858() << 24) | (c20317M21927.mo2870() << 16) : 0;
        C7073 c7073 = new C7073();
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            C19220 c19221 = (C19220) itM44337.next();
            String strM44350 = c19221.m44350();
            if (strM44350.equals("flag") || strM44350.equals("enum")) {
                C18514 c18514M44348 = c19221.m44348("name");
                C18514 c18514M44349 = c19221.m44348(b.d);
                String strM43026 = c18514M44348.m43026();
                String strM43027 = c18514M44349.m43026();
                Integer numM13803 = C4710.m13803(strM43026);
                if (numM13803 == null) {
                    numM13803 = c12555 == null ? null : (Integer) c12555.get(strM43026);
                    if (numM13803 != null) {
                        numM13803 = Integer.valueOf(numM13803.intValue() | iMo12858);
                    }
                }
                if (numM13803 == null) {
                    throw new C1580("Unknown name: ".concat(strM43026), c18514M44348);
                }
                if (C9896.m24998(strM43027, c7073)) {
                    c18906.m43639(c7073.f21766, c7073.f21767, numM13803.intValue());
                } else {
                    throw new C1580("Value must be integer", c18514M44349);
                }
            } else {
                C4710.m13804(c18906, c10355, c19221).m13997(C4710.m13802(c19221, c7073));
            }
        }
    }
}
