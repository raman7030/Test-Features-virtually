package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collection;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1EW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9607 extends C18244 {
    @Override // p067l.C18244, p067l.InterfaceC24950
    /* JADX INFO: renamed from: ֫ */
    public final void mo17410(InterfaceC15641 interfaceC15641, InterfaceC22528 interfaceC22528, C16232 c16232, C19586 c19586) {
        String str;
        String strM26400;
        InterfaceC22528 interfaceC22528Mo4717;
        if (!interfaceC22528.mo31474()) {
            throw new RuntimeException();
        }
        if (interfaceC22528.mo31471() == 0 || interfaceC22528.getValue().mo7249() != 16777216 || !interfaceC22528.getValue().mo7250()) {
            super.mo17410(interfaceC15641, interfaceC22528, c16232, c19586);
            return;
        }
        interfaceC15641.mo3702("attr");
        interfaceC15641.mo3699("name", interfaceC22528.mo31468());
        int value = interfaceC22528.getValue().getValue();
        InterfaceC9116 interfaceC9116Mo5206 = null;
        if (value != 65535) {
            ArrayList arrayList = new ArrayList();
            if ((value & 1) != 0) {
                arrayList.add(Name.REFER);
            }
            if ((value & 2) != 0) {
                arrayList.add("string");
            }
            if ((value & 4) != 0) {
                arrayList.add("integer");
            }
            if ((value & 8) != 0) {
                arrayList.add(ClassTransform.BOOLEAN);
            }
            if ((value & 16) != 0) {
                arrayList.add(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
            }
            if ((value & 32) != 0) {
                arrayList.add(ClassTransform.FLOAT);
            }
            if ((value & 64) != 0) {
                arrayList.add("dimension");
            }
            if ((value & 128) != 0) {
                arrayList.add("fraction");
            }
            if ((65536 & value) != 0) {
                str = "enum";
                arrayList.add("enum");
            } else {
                str = null;
            }
            if ((value & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                arrayList.add("flags");
                str = "flag";
            }
            interfaceC15641.mo3699("format", C11567.m26626((Collection) arrayList, '|'));
        } else {
            str = null;
        }
        C11540.m26606(interfaceC15641, interfaceC22528, c19586);
        int iMo31471 = interfaceC22528.mo31471() - 1;
        InterfaceC3080 type = interfaceC22528.mo31469().getType("id");
        int i = 0;
        if (type != null && type.mo5200() != 0) {
            interfaceC9116Mo5206 = type.mo5206(0);
        }
        int iMo14722 = interfaceC22528.mo31469().mo14722() << 24;
        if (type != null) {
            iMo14722 |= type.mo5199() << 16;
        }
        while (i < iMo31471) {
            i++;
            InterfaceC3751 value2 = interfaceC22528.getValue(i);
            if (str == null || (value2.mo7247() != 16 && value2.mo7247() != 17)) {
                C18244.m41506(interfaceC15641, value2, c16232);
            } else {
                if (interfaceC9116Mo5206 == null || (value2.mo7249() & (-65536)) != iMo14722 || (interfaceC22528Mo4717 = interfaceC9116Mo5206.mo4717(value2.mo7249() & 65535)) == null) {
                    strM26400 = C11419.m26400(value2.mo7249());
                } else {
                    strM26400 = interfaceC22528Mo4717.mo31468();
                }
                interfaceC15641.mo3702(str);
                interfaceC15641.mo3699("name", strM26400);
                interfaceC15641.mo3699(C0226b.f1011d, C11540.m26599(c16232, value2).toString());
                interfaceC15641.mo3698(str);
            }
        }
        interfaceC15641.mo3698("attr");
    }
}
