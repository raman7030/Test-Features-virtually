package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IC7P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3750 {

    /* JADX INFO: renamed from: ۧ */
    public static final C14260 f7966 = C14260.m32769(C9566.m22274("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: ܽ */
    public static final C14260 f7968 = C14260.m32769(C9566.m22274("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: ᩳ */
    public static final C14260 f7970 = C14260.m32769(C9566.m22274("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: ܿ */
    public static final C14260 f7969 = C14260.m32769(C9566.m22274("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: ܳ */
    public static final C14260 f7967 = C14260.m32769(C9566.m22274("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: ۜ */
    public static final C14260 f7963 = C14260.m32769(C9566.m22274("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: ᩷ */
    public static final C14260 f7971 = C14260.m32769(C9566.m22274("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: ۢ */
    public static final C14260 f7965 = C14260.m32769(C9566.m22274("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: ֫ */
    public static final C14930 f7962 = new C14930("accessFlags");

    /* JADX INFO: renamed from: ᩻ */
    public static final C14930 f7972 = new C14930("name");

    /* JADX INFO: renamed from: ۡ */
    public static final C14930 f7964 = new C14930(C0226b.f1011d);

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7238(C8050 c8050) {
        C8050 c8051 = new C8050(f7966, EnumC13415.SYSTEM);
        c8051.m18704(new C9391(f7964, new C9371(c8050)));
        c8051.mo22326();
        return c8051;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7239(C14260 c14260) {
        C8050 c8050 = new C8050(f7968, EnumC13415.SYSTEM);
        c8050.m18704(new C9391(f7964, c14260));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7243(C23648 c23648) {
        C8050 c8050 = new C8050(f7970, EnumC13415.SYSTEM);
        c8050.m18704(new C9391(f7964, c23648));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7241(C14930 c14930, int i) {
        C8050 c8050 = new C8050(f7969, EnumC13415.SYSTEM);
        AbstractC15405 abstractC15405 = c14930;
        if (c14930 == null) {
            abstractC15405 = C20967.f65872;
        }
        c8050.m18704(new C9391(f7972, abstractC15405));
        c8050.m18704(new C9391(f7962, C4873.m10335(i)));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7242(C15600 c15600) {
        C12920 c12920M7244 = m7244((InterfaceC12548) c15600);
        C8050 c8050 = new C8050(f7967, EnumC13415.SYSTEM);
        c8050.m18704(new C9391(f7964, c12920M7244));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8050 m7240(C14930 c14930) {
        C8050 c8050 = new C8050(f7963, EnumC13415.SYSTEM);
        String string = c14930.getString();
        int length = string.length();
        ArrayList arrayList = new ArrayList(20);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (string.charAt(i) == 'L') {
                while (i2 < length) {
                    char cCharAt = string.charAt(i2);
                    if (cCharAt == ';') {
                        i2++;
                        break;
                    }
                    if (cCharAt == '<') {
                        break;
                    }
                    i2++;
                }
            } else {
                while (i2 < length && string.charAt(i2) != 'L') {
                    i2++;
                }
            }
            arrayList.add(string.substring(i, i2));
            i = i2;
        }
        int size = arrayList.size();
        C4202 c4202 = new C4202(size);
        for (int i3 = 0; i3 < size; i3++) {
            c4202.mo14144(i3, (AbstractC15405) new C14930((String) arrayList.get(i3)));
        }
        c4202.mo22326();
        c8050.m18704(new C9391(f7964, new C12920(c4202)));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C8050 m7246(C14930 c14930) {
        C8050 c8050 = new C8050(f7971, EnumC13415.SYSTEM);
        c8050.m18704(new C9391(f7964, c14930));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C8050 m7245(InterfaceC12548 interfaceC12548) {
        C12920 c12920M7244 = m7244(interfaceC12548);
        C8050 c8050 = new C8050(f7965, EnumC13415.SYSTEM);
        c8050.m18704(new C9391(f7964, c12920M7244));
        c8050.mo22326();
        return c8050;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12920 m7244(InterfaceC12548 interfaceC12548) {
        int size = interfaceC12548.size();
        C4202 c4202 = new C4202(size);
        for (int i = 0; i < size; i++) {
            c4202.mo14144(i, (AbstractC15405) C14260.m32769(interfaceC12548.getType(i)));
        }
        c4202.mo22326();
        return new C12920(c4202);
    }
}
