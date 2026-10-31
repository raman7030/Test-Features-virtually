package l;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۨ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11396 implements InterfaceC16602 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12806[] f34093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12806[] f34094;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f34095;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f34096;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f34091 = {'t', 'r', 'u', 'e'};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f34090 = {'f', 'a', 'l', 's', 'e'};

    public C11396(Class cls) {
        EnumC4500 enumC4500Naming;
        String strTypeName;
        String strTypeKey;
        int modifiers = cls.getModifiers();
        this.f34092 = 0;
        InterfaceC12261 interfaceC12261 = (InterfaceC12261) cls.getAnnotation(InterfaceC12261.class);
        if (interfaceC12261 != null) {
            this.f34092 = EnumC20837.m47652(interfaceC12261.serialzeFeatures());
            strTypeName = interfaceC12261.typeName();
            if (strTypeName.length() == 0) {
                strTypeName = null;
                strTypeKey = null;
            } else {
                strTypeKey = null;
                for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    InterfaceC12261 interfaceC12262 = (InterfaceC12261) superclass.getAnnotation(InterfaceC12261.class);
                    if (interfaceC12262 == null) {
                        break;
                    }
                    strTypeKey = interfaceC12262.typeKey();
                    if (strTypeKey.length() != 0) {
                        break;
                    }
                }
                for (Class<?> cls2 : cls.getInterfaces()) {
                    InterfaceC12261 interfaceC12263 = (InterfaceC12261) cls2.getAnnotation(InterfaceC12261.class);
                    if (interfaceC12263 != null) {
                        strTypeKey = interfaceC12263.typeKey();
                        if (strTypeKey.length() != 0) {
                            break;
                        }
                    }
                }
                if (strTypeKey != null && strTypeKey.length() == 0) {
                    strTypeKey = null;
                }
            }
            enumC4500Naming = interfaceC12261.naming();
            if (enumC4500Naming == EnumC4500.CamelCase) {
                enumC4500Naming = null;
            }
        } else {
            enumC4500Naming = null;
            strTypeName = null;
            strTypeKey = null;
        }
        this.f34095 = strTypeName;
        this.f34096 = strTypeKey;
        ArrayList arrayListM44739 = C19426.m44739(cls, modifiers, interfaceC12261, false, enumC4500Naming);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM44739.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12806((C15896) it.next()));
        }
        C12806[] c12806Arr = (C12806[]) arrayList.toArray(new C12806[arrayList.size()]);
        this.f34093 = c12806Arr;
        String[] strArrOrders = interfaceC12261 != null ? interfaceC12261.orders() : null;
        if (strArrOrders != null && strArrOrders.length != 0) {
            ArrayList arrayListM447310 = C19426.m44739(cls, modifiers, interfaceC12261, true, enumC4500Naming);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListM447310.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C12806((C15896) it2.next()));
            }
            this.f34094 = (C12806[]) arrayList2.toArray(new C12806[arrayList2.size()]);
            return;
        }
        C12806[] c12806Arr2 = new C12806[c12806Arr.length];
        System.arraycopy(c12806Arr, 0, c12806Arr2, 0, c12806Arr.length);
        Arrays.sort(c12806Arr2);
        if (Arrays.equals(c12806Arr2, c12806Arr)) {
            this.f34094 = c12806Arr;
        } else {
            this.f34094 = c12806Arr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x016f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x018a A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0194 A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a2 A[EDGE_INSN: B:119:0x01a2->B:120:0x01a3 BREAK  A[LOOP:2: B:114:0x018e->B:453:?]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab A[Catch: all -> 0x054c, Exception -> 0x0550, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0550, all -> 0x054c, blocks: (B:97:0x015d, B:122:0x01ab, B:136:0x01ec), top: B:433:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x01be A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_ENTER, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01c9 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x01d7 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:134:0x01e7 A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01ec A[Catch: all -> 0x054c, Exception -> 0x0550, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0550, all -> 0x054c, blocks: (B:97:0x015d, B:122:0x01ab, B:136:0x01ec), top: B:433:0x015d }] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fd A[Catch: all -> 0x0178, Exception -> 0x0180, TRY_ENTER, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0204 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x020b A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:150:0x021b A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:153:0x022a A[EDGE_INSN: B:153:0x022a->B:154:0x022c BREAK  A[LOOP:3: B:148:0x0215->B:456:?], PHI: r2 r31
      0x022a: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v47 java.lang.Object) binds: [B:138:0x01f7, B:454:0x022a] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r31v2 boolean) = (r31v1 boolean), (r31v16 boolean) binds: [B:138:0x01f7, B:454:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0238  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x023e A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0243 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0245 A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:163:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x024c A[Catch: all -> 0x0178, Exception -> 0x0180, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:169:0x025e A[Catch: all -> 0x0178, Exception -> 0x0180, LOOP:4: B:167:0x0258->B:169:0x025e, LOOP_END, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:171:0x026e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0273  */
    /* JADX WARN: Code duplicated, block: B:174:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x028e  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a0 A[Catch: all -> 0x0178, Exception -> 0x0180, LOOP:5: B:184:0x029a->B:186:0x02a0, LOOP_END, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:101:0x016a, B:105:0x0171, B:113:0x018a, B:114:0x018e, B:116:0x0194, B:127:0x01be, B:141:0x01fd, B:143:0x0204, B:145:0x020b, B:147:0x0211, B:148:0x0215, B:150:0x021b, B:160:0x023e, B:162:0x0245, B:164:0x024c, B:166:0x0252, B:167:0x0258, B:169:0x025e, B:176:0x0279, B:183:0x0294, B:184:0x029a, B:186:0x02a0, B:178:0x0280, B:180:0x0287, B:130:0x01c9, B:132:0x01d7, B:134:0x01e7), top: B:441:0x016a }] */
    /* JADX WARN: Code duplicated, block: B:189:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:263:0x0391  */
    /* JADX WARN: Code duplicated, block: B:266:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x03d8 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:292:0x03e1 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:295:0x03f7 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:296:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:298:0x03ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0401 A[Catch: all -> 0x0383, Exception -> 0x038a, TRY_LEAVE, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:193:0x02ca, B:195:0x02da, B:197:0x02e5, B:199:0x02e9, B:202:0x02ee, B:204:0x02f1, B:268:0x039d, B:270:0x03a1, B:274:0x03a9, B:276:0x03ad, B:284:0x03c1, B:286:0x03c5, B:278:0x03b1, B:280:0x03b5, B:290:0x03d8, B:292:0x03e1, B:293:0x03e4, B:295:0x03f7, B:299:0x0401, B:206:0x02f5, B:208:0x02fb, B:210:0x0306, B:212:0x030a, B:215:0x030f, B:217:0x0312, B:220:0x031a, B:222:0x0322, B:224:0x032d, B:226:0x0331, B:229:0x0338, B:231:0x033b, B:233:0x0340, B:234:0x0345, B:236:0x034d, B:238:0x0358, B:240:0x035c, B:243:0x0363, B:245:0x0366, B:247:0x036b, B:249:0x0370, B:251:0x0374), top: B:437:0x02ca }] */
    /* JADX WARN: Code duplicated, block: B:307:0x0418  */
    /* JADX WARN: Code duplicated, block: B:309:0x041c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x041e A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0425  */
    /* JADX WARN: Code duplicated, block: B:313:0x0427 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x0429 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:316:0x0434 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0444 A[Catch: all -> 0x040e, Exception -> 0x0413, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x044a  */
    /* JADX WARN: Code duplicated, block: B:321:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:347:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x04aa A[Catch: all -> 0x040e, Exception -> 0x0413, TRY_LEAVE, TryCatch #14 {Exception -> 0x0413, all -> 0x040e, blocks: (B:301:0x0407, B:310:0x041e, B:311:0x0421, B:314:0x0429, B:316:0x0434, B:317:0x0437, B:325:0x0458, B:330:0x0464, B:332:0x046a, B:334:0x046e, B:335:0x0470, B:337:0x0478, B:338:0x047b, B:339:0x0484, B:341:0x0489, B:344:0x0494, B:345:0x049d, B:348:0x04aa, B:318:0x0444), top: B:439:0x0407 }] */
    /* JADX WARN: Code duplicated, block: B:352:0x04b3 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:354:0x04bc A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:358:0x04c5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:359:0x04cb A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:361:0x04d1 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:362:0x04d5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:363:0x04db A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:365:0x04e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:366:0x04e5 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:368:0x04ee A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:370:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:371:0x0501  */
    /* JADX WARN: Code duplicated, block: B:373:0x0504 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:374:0x0508 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:375:0x050d A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:376:0x0519 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:377:0x051d A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:378:0x0523 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:380:0x052d, B:350:0x04ae, B:352:0x04b3, B:354:0x04bc, B:357:0x04c0, B:358:0x04c5, B:359:0x04cb, B:361:0x04d1, B:362:0x04d5, B:363:0x04db, B:366:0x04e5, B:368:0x04ee, B:373:0x0504, B:374:0x0508, B:375:0x050d, B:376:0x0519, B:377:0x051d, B:378:0x0523, B:389:0x0562, B:394:0x0573, B:395:0x0577, B:397:0x057d, B:398:0x058a, B:400:0x058f, B:402:0x0598, B:403:0x059e, B:405:0x05a7, B:406:0x05aa), top: B:445:0x052d }] */
    /* JADX WARN: Code duplicated, block: B:431:0x05dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[LOOP:2: B:114:0x018e->B:453:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[LOOP:3: B:148:0x0215->B:456:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:39:0x0080, B:41:0x0089, B:42:0x008c, B:44:0x0097, B:46:0x00a0, B:47:0x00a6, B:50:0x00b3, B:53:0x00ba, B:55:0x00c1, B:57:0x00c5, B:69:0x00f0, B:71:0x00f4, B:72:0x00f8, B:74:0x00fe, B:78:0x010e, B:80:0x0117, B:84:0x0121, B:88:0x012b, B:92:0x0135, B:59:0x00c9, B:64:0x00da, B:66:0x00e1, B:67:0x00e9, B:63:0x00d3), top: B:435:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) throws Throwable {
        IdentityHashMap identityHashMap;
        C12806[] c12806Arr;
        C14485 c14485;
        C5751 c5752;
        String str;
        String str2;
        String name;
        char cM21139;
        boolean z;
        boolean z2;
        Class cls;
        ArrayList arrayList;
        Class cls2;
        String str3;
        Class cls3;
        long j;
        Object objM31114;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objValueOf;
        String str4;
        boolean z7;
        Object obj3;
        ArrayList arrayList2;
        C15896 c15896;
        String str5;
        Object obj4;
        C11396 c11396;
        Object obj5;
        String string;
        boolean z8;
        Object obj6;
        String str6;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z9;
        Object objValueOf2;
        Iterator it;
        Object objM22845;
        Iterator it2;
        String strM5941;
        Iterator it3;
        boolean z10;
        int i6;
        Iterator it4;
        C14485 c14486;
        C11396 c11397 = this;
        C5751 c5753 = c5751;
        Object obj7 = obj;
        C6725 c6725 = c5753.f17696;
        if (obj7 == null) {
            c6725.m18296();
            return;
        }
        C14485 c14487 = c5753.f17704;
        if ((c14487 == null || (c14487.f44376 & EnumC20837.DisableCircularReferenceDetect.f67472) == 0) && (identityHashMap = c5753.f17697) != null && identityHashMap.containsKey(obj7)) {
            c5751.m16192(obj);
            return;
        }
        int i7 = c6725.f20878;
        if ((EnumC20837.SortField.f67472 & i7) != 0) {
            c12806Arr = c11397.f34094;
        } else {
            c12806Arr = c11397.f34093;
        }
        C14485 c14488 = c5753.f17704;
        if ((i7 & EnumC20837.DisableCircularReferenceDetect.f67472) == 0) {
            c5753.f17704 = new C14485(c14488, obj7, obj2, c11397.f34092);
            if (c5753.f17697 == null) {
                c5753.f17697 = new IdentityHashMap();
            }
            c5753.f17697.put(obj7, c5753.f17704);
        }
        int i8 = c11397.f34092;
        int i9 = EnumC20837.BeanToArray.f67472;
        boolean z11 = ((i8 & i9) == 0 && (c6725.f20878 & i9) == 0) ? false : true;
        char c = z11 ? '[' : '{';
        char c2 = z11 ? ']' : '}';
        try {
            int i10 = c6725.f20880 + 1;
            if (i10 > c6725.f20879.length) {
                c6725.m18300(i10);
            }
            c6725.f20879[c6725.f20880] = c;
            c6725.f20880 = i10;
            if (c12806Arr.length > 0 && (c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                c5751.m16193();
                c5751.m16194();
            }
            int i11 = c11397.f34092;
            int i12 = EnumC20837.WriteClassName.f67472;
            int i13 = i11 & i12;
            String str7 = c11397.f34096;
            if (i13 == 0) {
                int i14 = c6725.f20878;
                if ((i12 & i14) == 0 || (type == null && (i14 & EnumC20837.NotWriteRootClassName.f67472) != 0 && ((c14486 = c5753.f17704) == null || c14486.f44379 == null))) {
                    cM21139 = 0;
                } else if (obj.getClass() != type) {
                    if (str7 != null) {
                        str2 = str7;
                    } else {
                        c5753.f17702.getClass();
                        str2 = "@type";
                    }
                    c6725.m18299(str2, false);
                    name = c11397.f34095;
                    if (name == null) {
                        name = obj.getClass().getName();
                    }
                    c5753.m16189(name);
                    cM21139 = ',';
                } else {
                    cM21139 = 0;
                }
            } else if (obj.getClass() != type) {
                if (str7 != null) {
                    str2 = str7;
                } else {
                    c5753.f17702.getClass();
                    str2 = "@type";
                }
                c6725.m18299(str2, false);
                name = c11397.f34095;
                if (name == null) {
                    name = obj.getClass().getName();
                }
                c5753.m16189(name);
                cM21139 = ',';
            } else {
                cM21139 = 0;
            }
            ArrayList arrayList3 = c5753.f17699;
            if (arrayList3 != null) {
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    cM21139 = ((AbstractC7867) it5.next()).m21139(c5753, obj7, cM21139);
                }
            }
            boolean z12 = cM21139 == ',';
            int i15 = c6725.f20878;
            boolean z13 = (EnumC20837.QuoteFieldNames.f67472 & i15) != 0 && (EnumC20837.UseSingleQuotes.f67472 & i15) == 0;
            boolean z14 = (EnumC20837.UseSingleQuotes.f67472 & i15) != 0;
            boolean z15 = (i15 & EnumC20837.NotWriteDefaultValue.f67472) != 0;
            ArrayList arrayList4 = c5753.f17705;
            ArrayList arrayList5 = c5753.f17706;
            boolean z16 = z12;
            ArrayList arrayList6 = c5753.f17695;
            ArrayList arrayList7 = c5753.f17698;
            char c3 = c2;
            int i16 = 0;
            int i17 = 0;
            while (i16 < c12806Arr.length) {
                try {
                    try {
                        C12806 c12806 = c12806Arr[i16];
                        C12806[] c12806Arr2 = c12806Arr;
                        C15896 c15897 = c12806.f38443;
                        int i18 = i16;
                        Class cls4 = c15897.f49114;
                        boolean z17 = z14;
                        Field field = c15897.f49124;
                        boolean z18 = z13;
                        String str8 = c15897.f49123;
                        try {
                            boolean z19 = z15;
                            if ((c6725.f20878 & EnumC20837.SkipTransientField.f67472) != 0 && field != null) {
                                try {
                                    if (!c15897.f49122) {
                                        if (str7 != null) {
                                            if (arrayList7 == null) {
                                                z = true;
                                                break;
                                            }
                                            it4 = arrayList7.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    z = true;
                                                    break;
                                                } else if (!((InterfaceC17308) it4.next()).m40620()) {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                z2 = c15897.f49115;
                                                cls = Boolean.TYPE;
                                                arrayList = arrayList7;
                                                cls2 = Long.TYPE;
                                                str3 = str7;
                                                cls3 = Integer.TYPE;
                                                j = 0;
                                                if (z2) {
                                                    objM31114 = null;
                                                    if (cls4 == cls3) {
                                                        i6 = field.getInt(obj7);
                                                        z10 = false;
                                                    } else {
                                                        if (cls4 == cls2) {
                                                            j = field.getLong(obj7);
                                                            z3 = true;
                                                            i = 0;
                                                            z4 = false;
                                                            z5 = false;
                                                        } else if (cls4 == cls) {
                                                            z10 = field.getBoolean(obj7);
                                                            i6 = 0;
                                                        } else {
                                                            objM31114 = field.get(obj7);
                                                        }
                                                        if (arrayList4 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM31114 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM31114 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM31114 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it3 = arrayList4.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    z6 = true;
                                                                    break;
                                                                } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                                    z6 = false;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z6 = true;
                                                            break;
                                                        }
                                                        if (z6) {
                                                            if (arrayList5 != null) {
                                                                if (z3) {
                                                                    if (cls4 == cls3) {
                                                                        objM31114 = Integer.valueOf(i);
                                                                    } else if (cls4 == cls2) {
                                                                        objM31114 = Long.valueOf(j);
                                                                    } else if (cls4 == cls) {
                                                                        objM31114 = Boolean.valueOf(z4);
                                                                    }
                                                                    z5 = true;
                                                                }
                                                                it2 = arrayList5.iterator();
                                                                strM5941 = str8;
                                                                while (it2.hasNext()) {
                                                                    strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                                }
                                                                objValueOf = objM31114;
                                                                str4 = strM5941;
                                                            } else {
                                                                objValueOf = objM31114;
                                                                str4 = str8;
                                                            }
                                                            if (arrayList6 != null) {
                                                                if (z3) {
                                                                    Object obj8 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj8;
                                                                } else {
                                                                    Object obj9 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj9;
                                                                }
                                                                it = arrayList6.iterator();
                                                                objM22845 = objValueOf2;
                                                                while (it.hasNext()) {
                                                                    objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                                }
                                                                z7 = z9;
                                                                objValueOf = objM22845;
                                                                obj3 = objValueOf2;
                                                            } else {
                                                                z7 = z5;
                                                                obj3 = objValueOf;
                                                            }
                                                            arrayList2 = arrayList4;
                                                            if (z7) {
                                                                c15896 = c15897;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c6725.f20880 + 1;
                                                                    if (i5 > c6725.f20879.length) {
                                                                        c6725.m18300(i5);
                                                                    }
                                                                    c6725.f20879[c6725.f20880] = ',';
                                                                    c6725.f20880 = i5;
                                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                        c5751.m16194();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c6725.m18299(str4, true);
                                                                    }
                                                                    c5752 = c5751;
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    c5752 = c5751;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                        c5752.m16188(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr = c12806.f38439;
                                                                                int length = cArr.length;
                                                                                i4 = c6725.f20880 + length;
                                                                                if (i4 > c6725.f20879.length) {
                                                                                    c6725.m18300(i4);
                                                                                }
                                                                                System.arraycopy(cArr, 0, c6725.f20879, c6725.f20880, length);
                                                                                c6725.f20880 = i4;
                                                                            } else {
                                                                                c12806.m31115(c5752);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c11396 = this;
                                                                                int i19 = c12806.f38442 | c11396.f34092;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c6725.f20878;
                                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c6725.m18297(str5);
                                                                                    } else {
                                                                                        c6725.m18297(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18302(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18298(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c11396 = this;
                                                                                if (c15896.f49120) {
                                                                                    c12806.m31116(c5752, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18302(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18298(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c6725.m18296();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            c12806.m31116(c5752, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c11396 = this;
                                                                z16 = true;
                                                            } else {
                                                                c15896 = c15897;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c6725.f20880 + 1;
                                                                    if (i5 > c6725.f20879.length) {
                                                                        c6725.m18300(i5);
                                                                    }
                                                                    c6725.f20879[c6725.f20880] = ',';
                                                                    c6725.f20880 = i5;
                                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                        c5751.m16194();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c6725.m18299(str4, true);
                                                                    }
                                                                    c5752 = c5751;
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    c5752 = c5751;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                        c5752.m16188(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr2 = c12806.f38439;
                                                                                int length2 = cArr2.length;
                                                                                i4 = c6725.f20880 + length2;
                                                                                if (i4 > c6725.f20879.length) {
                                                                                    c6725.m18300(i4);
                                                                                }
                                                                                System.arraycopy(cArr2, 0, c6725.f20879, c6725.f20880, length2);
                                                                                c6725.f20880 = i4;
                                                                            } else {
                                                                                c12806.m31115(c5752);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c11396 = this;
                                                                                int i110 = c12806.f38442 | c11396.f34092;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c6725.f20878;
                                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c6725.m18297(str5);
                                                                                    } else {
                                                                                        c6725.m18297(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18302(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18298(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c11396 = this;
                                                                                if (c15896.f49120) {
                                                                                    c12806.m31116(c5752, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18302(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18298(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c6725.m18296();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            c12806.m31116(c5752, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c11396 = this;
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        c5752 = c5751;
                                                    }
                                                    z5 = false;
                                                    z4 = z10;
                                                    i = i6;
                                                    z3 = true;
                                                    if (arrayList4 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM31114 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM31114 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM31114 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                z6 = true;
                                                                break;
                                                            } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                                z6 = false;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z6 = true;
                                                        break;
                                                    }
                                                    if (z6) {
                                                        if (arrayList5 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM31114 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM31114 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM31114 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it2 = arrayList5.iterator();
                                                            strM5941 = str8;
                                                            while (it2.hasNext()) {
                                                                strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                            }
                                                            objValueOf = objM31114;
                                                            str4 = strM5941;
                                                        } else {
                                                            objValueOf = objM31114;
                                                            str4 = str8;
                                                        }
                                                        if (arrayList6 != null) {
                                                            if (z3) {
                                                                Object obj10 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj10;
                                                            } else {
                                                                Object obj11 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj11;
                                                            }
                                                            it = arrayList6.iterator();
                                                            objM22845 = objValueOf2;
                                                            while (it.hasNext()) {
                                                                objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                            }
                                                            z7 = z9;
                                                            objValueOf = objM22845;
                                                            obj3 = objValueOf2;
                                                        } else {
                                                            z7 = z5;
                                                            obj3 = objValueOf;
                                                        }
                                                        arrayList2 = arrayList4;
                                                        if (z7) {
                                                            c15896 = c15897;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c6725.f20880 + 1;
                                                                if (i5 > c6725.f20879.length) {
                                                                    c6725.m18300(i5);
                                                                }
                                                                c6725.f20879[c6725.f20880] = ',';
                                                                c6725.f20880 = i5;
                                                                if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                    c5751.m16194();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c6725.m18299(str4, true);
                                                                }
                                                                c5752 = c5751;
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                c5752 = c5751;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr3 = c12806.f38439;
                                                                            int length3 = cArr3.length;
                                                                            i4 = c6725.f20880 + length3;
                                                                            if (i4 > c6725.f20879.length) {
                                                                                c6725.m18300(i4);
                                                                            }
                                                                            System.arraycopy(cArr3, 0, c6725.f20879, c6725.f20880, length3);
                                                                            c6725.f20880 = i4;
                                                                        } else {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c11396 = this;
                                                                            int i111 = c12806.f38442 | c11396.f34092;
                                                                            if (obj4 == 0) {
                                                                                i2 = c6725.f20878;
                                                                                i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c6725.m18297(str5);
                                                                                } else {
                                                                                    c6725.m18297(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18302(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18298(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            if (c15896.f49120) {
                                                                                c12806.m31116(c5752, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18302(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18298(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c6725.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c6725.m18296();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        c12806.m31116(c5752, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c11396 = this;
                                                            z16 = true;
                                                        } else {
                                                            c15896 = c15897;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c6725.f20880 + 1;
                                                                if (i5 > c6725.f20879.length) {
                                                                    c6725.m18300(i5);
                                                                }
                                                                c6725.f20879[c6725.f20880] = ',';
                                                                c6725.f20880 = i5;
                                                                if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                    c5751.m16194();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c6725.m18299(str4, true);
                                                                }
                                                                c5752 = c5751;
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                c5752 = c5751;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr4 = c12806.f38439;
                                                                            int length4 = cArr4.length;
                                                                            i4 = c6725.f20880 + length4;
                                                                            if (i4 > c6725.f20879.length) {
                                                                                c6725.m18300(i4);
                                                                            }
                                                                            System.arraycopy(cArr4, 0, c6725.f20879, c6725.f20880, length4);
                                                                            c6725.f20880 = i4;
                                                                        } else {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c11396 = this;
                                                                            int i112 = c12806.f38442 | c11396.f34092;
                                                                            if (obj4 == 0) {
                                                                                i2 = c6725.f20878;
                                                                                i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c6725.m18297(str5);
                                                                                } else {
                                                                                    c6725.m18297(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18302(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18298(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            if (c15896.f49120) {
                                                                                c12806.m31116(c5752, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18302(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18298(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c6725.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c6725.m18296();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        c12806.m31116(c5752, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c11396 = this;
                                                            z16 = true;
                                                        }
                                                    }
                                                    c11396 = this;
                                                    c5752 = c5751;
                                                } else {
                                                    objM31114 = c12806.m31114(obj7);
                                                }
                                                z3 = false;
                                                i = 0;
                                                z4 = false;
                                                z5 = true;
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM31114 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM31114 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM31114 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM31114 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM31114 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM31114 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM5941 = str8;
                                                        while (it2.hasNext()) {
                                                            strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                        }
                                                        objValueOf = objM31114;
                                                        str4 = strM5941;
                                                    } else {
                                                        objValueOf = objM31114;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3) {
                                                            Object obj12 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj12;
                                                        } else {
                                                            Object obj13 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj13;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM22845 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM22845;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7) {
                                                        c15896 = c15897;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c6725.f20880 + 1;
                                                            if (i5 > c6725.f20879.length) {
                                                                c6725.m18300(i5);
                                                            }
                                                            c6725.f20879[c6725.f20880] = ',';
                                                            c6725.f20880 = i5;
                                                            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                c5751.m16194();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c6725.m18299(str4, true);
                                                            }
                                                            c5752 = c5751;
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            c5752 = c5751;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c12806.m31115(c5752);
                                                                }
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr5 = c12806.f38439;
                                                                        int length5 = cArr5.length;
                                                                        i4 = c6725.f20880 + length5;
                                                                        if (i4 > c6725.f20879.length) {
                                                                            c6725.m18300(i4);
                                                                        }
                                                                        System.arraycopy(cArr5, 0, c6725.f20879, c6725.f20880, length5);
                                                                        c6725.f20880 = i4;
                                                                    } else {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c11396 = this;
                                                                        int i113 = c12806.f38442 | c11396.f34092;
                                                                        if (obj4 == 0) {
                                                                            i2 = c6725.f20878;
                                                                            i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                            if ((i2 & i3) == 0) {
                                                                                c6725.m18297(str5);
                                                                            } else {
                                                                                c6725.m18297(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c6725.m18302(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c6725.m18298(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        if (c15896.f49120) {
                                                                            c12806.m31116(c5752, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18302(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18298(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c6725.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c6725.m18296();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    c12806.m31116(c5752, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        z16 = true;
                                                    } else {
                                                        c15896 = c15897;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c6725.f20880 + 1;
                                                            if (i5 > c6725.f20879.length) {
                                                                c6725.m18300(i5);
                                                            }
                                                            c6725.f20879[c6725.f20880] = ',';
                                                            c6725.f20880 = i5;
                                                            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                c5751.m16194();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c6725.m18299(str4, true);
                                                            }
                                                            c5752 = c5751;
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            c5752 = c5751;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c12806.m31115(c5752);
                                                                }
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr6 = c12806.f38439;
                                                                        int length6 = cArr6.length;
                                                                        i4 = c6725.f20880 + length6;
                                                                        if (i4 > c6725.f20879.length) {
                                                                            c6725.m18300(i4);
                                                                        }
                                                                        System.arraycopy(cArr6, 0, c6725.f20879, c6725.f20880, length6);
                                                                        c6725.f20880 = i4;
                                                                    } else {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c11396 = this;
                                                                        int i114 = c12806.f38442 | c11396.f34092;
                                                                        if (obj4 == 0) {
                                                                            i2 = c6725.f20878;
                                                                            i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                            if ((i2 & i3) == 0) {
                                                                                c6725.m18297(str5);
                                                                            } else {
                                                                                c6725.m18297(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c6725.m18302(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c6725.m18298(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        if (c15896.f49120) {
                                                                            c12806.m31116(c5752, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18302(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18298(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c6725.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c6725.m18296();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    c12806.m31116(c5752, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        z16 = true;
                                                    }
                                                }
                                                c11396 = this;
                                                c5752 = c5751;
                                            }
                                            arrayList6 = arrayList6;
                                            arrayList5 = arrayList5;
                                            arrayList2 = arrayList4;
                                            c11396 = this;
                                            c5752 = c5751;
                                        } else {
                                            if (arrayList7 == null) {
                                                z = true;
                                                break;
                                            }
                                            it4 = arrayList7.iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    z = true;
                                                    break;
                                                } else if (!((InterfaceC17308) it4.next()).m40620()) {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                            if (z) {
                                                z2 = c15897.f49115;
                                                cls = Boolean.TYPE;
                                                arrayList = arrayList7;
                                                cls2 = Long.TYPE;
                                                str3 = str7;
                                                cls3 = Integer.TYPE;
                                                j = 0;
                                                if (z2) {
                                                    objM31114 = null;
                                                    if (cls4 == cls3) {
                                                        i6 = field.getInt(obj7);
                                                        z10 = false;
                                                    } else {
                                                        if (cls4 == cls2) {
                                                            j = field.getLong(obj7);
                                                            z3 = true;
                                                            i = 0;
                                                            z4 = false;
                                                            z5 = false;
                                                        } else if (cls4 == cls) {
                                                            z10 = field.getBoolean(obj7);
                                                            i6 = 0;
                                                        } else {
                                                            objM31114 = field.get(obj7);
                                                        }
                                                        if (arrayList4 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM31114 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM31114 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM31114 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it3 = arrayList4.iterator();
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    z6 = true;
                                                                    break;
                                                                } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                                    z6 = false;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            z6 = true;
                                                            break;
                                                        }
                                                        if (z6) {
                                                            if (arrayList5 != null) {
                                                                if (z3) {
                                                                    if (cls4 == cls3) {
                                                                        objM31114 = Integer.valueOf(i);
                                                                    } else if (cls4 == cls2) {
                                                                        objM31114 = Long.valueOf(j);
                                                                    } else if (cls4 == cls) {
                                                                        objM31114 = Boolean.valueOf(z4);
                                                                    }
                                                                    z5 = true;
                                                                }
                                                                it2 = arrayList5.iterator();
                                                                strM5941 = str8;
                                                                while (it2.hasNext()) {
                                                                    strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                                }
                                                                objValueOf = objM31114;
                                                                str4 = strM5941;
                                                            } else {
                                                                objValueOf = objM31114;
                                                                str4 = str8;
                                                            }
                                                            if (arrayList6 != null) {
                                                                if (z3) {
                                                                    Object obj14 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj14;
                                                                } else {
                                                                    Object obj15 = objValueOf;
                                                                    z9 = z5;
                                                                    objValueOf2 = obj15;
                                                                }
                                                                it = arrayList6.iterator();
                                                                objM22845 = objValueOf2;
                                                                while (it.hasNext()) {
                                                                    objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                                }
                                                                z7 = z9;
                                                                objValueOf = objM22845;
                                                                obj3 = objValueOf2;
                                                            } else {
                                                                z7 = z5;
                                                                obj3 = objValueOf;
                                                            }
                                                            arrayList2 = arrayList4;
                                                            if (z7) {
                                                                c15896 = c15897;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c6725.f20880 + 1;
                                                                    if (i5 > c6725.f20879.length) {
                                                                        c6725.m18300(i5);
                                                                    }
                                                                    c6725.f20879[c6725.f20880] = ',';
                                                                    c6725.f20880 = i5;
                                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                        c5751.m16194();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c6725.m18299(str4, true);
                                                                    }
                                                                    c5752 = c5751;
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    c5752 = c5751;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                        c5752.m16188(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr7 = c12806.f38439;
                                                                                int length7 = cArr7.length;
                                                                                i4 = c6725.f20880 + length7;
                                                                                if (i4 > c6725.f20879.length) {
                                                                                    c6725.m18300(i4);
                                                                                }
                                                                                System.arraycopy(cArr7, 0, c6725.f20879, c6725.f20880, length7);
                                                                                c6725.f20880 = i4;
                                                                            } else {
                                                                                c12806.m31115(c5752);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c11396 = this;
                                                                                int i115 = c12806.f38442 | c11396.f34092;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c6725.f20878;
                                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c6725.m18297(str5);
                                                                                    } else {
                                                                                        c6725.m18297(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18302(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18298(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c11396 = this;
                                                                                if (c15896.f49120) {
                                                                                    c12806.m31116(c5752, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18302(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18298(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c6725.m18296();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            c12806.m31116(c5752, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c11396 = this;
                                                                z16 = true;
                                                            } else {
                                                                c15896 = c15897;
                                                                str5 = "";
                                                                obj4 = objValueOf;
                                                                if (z7) {
                                                                }
                                                                if (!z16) {
                                                                    i5 = c6725.f20880 + 1;
                                                                    if (i5 > c6725.f20879.length) {
                                                                        c6725.m18300(i5);
                                                                    }
                                                                    c6725.f20879[c6725.f20880] = ',';
                                                                    c6725.f20880 = i5;
                                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                        c5751.m16194();
                                                                    }
                                                                }
                                                                if (str4 != str8) {
                                                                    if (!z11) {
                                                                        c6725.m18299(str4, true);
                                                                    }
                                                                    c5752 = c5751;
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    c5752 = c5751;
                                                                    if (obj3 != obj4) {
                                                                        if (!z11) {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                        c5752.m16188(obj4);
                                                                    } else {
                                                                        if (z11) {
                                                                            if (z18) {
                                                                                char[] cArr8 = c12806.f38439;
                                                                                int length8 = cArr8.length;
                                                                                i4 = c6725.f20880 + length8;
                                                                                if (i4 > c6725.f20879.length) {
                                                                                    c6725.m18300(i4);
                                                                                }
                                                                                System.arraycopy(cArr8, 0, c6725.f20879, c6725.f20880, length8);
                                                                                c6725.f20880 = i4;
                                                                            } else {
                                                                                c12806.m31115(c5752);
                                                                            }
                                                                        }
                                                                        if (z3) {
                                                                        }
                                                                        if (!z11) {
                                                                            if (cls4 == String.class) {
                                                                                c11396 = this;
                                                                                int i116 = c12806.f38442 | c11396.f34092;
                                                                                if (obj4 == 0) {
                                                                                    i2 = c6725.f20878;
                                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                    if ((i2 & i3) == 0) {
                                                                                        c6725.m18297(str5);
                                                                                    } else {
                                                                                        c6725.m18297(str5);
                                                                                    }
                                                                                } else {
                                                                                    str6 = (String) obj6;
                                                                                    if (z17) {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18302(str6);
                                                                                    } else {
                                                                                        obj6 = obj4;
                                                                                        c6725.m18298(str6, (char) 0, true);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c11396 = this;
                                                                                if (c15896.f49120) {
                                                                                    c12806.m31116(c5752, obj4);
                                                                                } else if (obj4 != 0) {
                                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                        string = ((Enum) obj5).toString();
                                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                            z8 = true;
                                                                                        } else {
                                                                                            z8 = false;
                                                                                        }
                                                                                        if (z8) {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18302(string);
                                                                                        } else {
                                                                                            obj5 = obj4;
                                                                                            obj5 = obj4;
                                                                                            c6725.m18298(string, (char) 0, false);
                                                                                        }
                                                                                    } else {
                                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                                    }
                                                                                } else {
                                                                                    c6725.m18296();
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            c12806.m31116(c5752, obj4);
                                                                        }
                                                                        z16 = true;
                                                                    }
                                                                }
                                                                c11396 = this;
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        c5752 = c5751;
                                                    }
                                                    z5 = false;
                                                    z4 = z10;
                                                    i = i6;
                                                    z3 = true;
                                                    if (arrayList4 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM31114 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM31114 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM31114 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                z6 = true;
                                                                break;
                                                            } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                                z6 = false;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        z6 = true;
                                                        break;
                                                    }
                                                    if (z6) {
                                                        if (arrayList5 != null) {
                                                            if (z3) {
                                                                if (cls4 == cls3) {
                                                                    objM31114 = Integer.valueOf(i);
                                                                } else if (cls4 == cls2) {
                                                                    objM31114 = Long.valueOf(j);
                                                                } else if (cls4 == cls) {
                                                                    objM31114 = Boolean.valueOf(z4);
                                                                }
                                                                z5 = true;
                                                            }
                                                            it2 = arrayList5.iterator();
                                                            strM5941 = str8;
                                                            while (it2.hasNext()) {
                                                                strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                            }
                                                            objValueOf = objM31114;
                                                            str4 = strM5941;
                                                        } else {
                                                            objValueOf = objM31114;
                                                            str4 = str8;
                                                        }
                                                        if (arrayList6 != null) {
                                                            if (z3) {
                                                                Object obj16 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj16;
                                                            } else {
                                                                Object obj17 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj17;
                                                            }
                                                            it = arrayList6.iterator();
                                                            objM22845 = objValueOf2;
                                                            while (it.hasNext()) {
                                                                objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                            }
                                                            z7 = z9;
                                                            objValueOf = objM22845;
                                                            obj3 = objValueOf2;
                                                        } else {
                                                            z7 = z5;
                                                            obj3 = objValueOf;
                                                        }
                                                        arrayList2 = arrayList4;
                                                        if (z7) {
                                                            c15896 = c15897;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c6725.f20880 + 1;
                                                                if (i5 > c6725.f20879.length) {
                                                                    c6725.m18300(i5);
                                                                }
                                                                c6725.f20879[c6725.f20880] = ',';
                                                                c6725.f20880 = i5;
                                                                if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                    c5751.m16194();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c6725.m18299(str4, true);
                                                                }
                                                                c5752 = c5751;
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                c5752 = c5751;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr9 = c12806.f38439;
                                                                            int length9 = cArr9.length;
                                                                            i4 = c6725.f20880 + length9;
                                                                            if (i4 > c6725.f20879.length) {
                                                                                c6725.m18300(i4);
                                                                            }
                                                                            System.arraycopy(cArr9, 0, c6725.f20879, c6725.f20880, length9);
                                                                            c6725.f20880 = i4;
                                                                        } else {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c11396 = this;
                                                                            int i117 = c12806.f38442 | c11396.f34092;
                                                                            if (obj4 == 0) {
                                                                                i2 = c6725.f20878;
                                                                                i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c6725.m18297(str5);
                                                                                } else {
                                                                                    c6725.m18297(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18302(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18298(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            if (c15896.f49120) {
                                                                                c12806.m31116(c5752, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18302(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18298(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c6725.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c6725.m18296();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        c12806.m31116(c5752, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c11396 = this;
                                                            z16 = true;
                                                        } else {
                                                            c15896 = c15897;
                                                            str5 = "";
                                                            obj4 = objValueOf;
                                                            if (z7) {
                                                            }
                                                            if (!z16) {
                                                                i5 = c6725.f20880 + 1;
                                                                if (i5 > c6725.f20879.length) {
                                                                    c6725.m18300(i5);
                                                                }
                                                                c6725.f20879[c6725.f20880] = ',';
                                                                c6725.f20880 = i5;
                                                                if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                    c5751.m16194();
                                                                }
                                                            }
                                                            if (str4 != str8) {
                                                                if (!z11) {
                                                                    c6725.m18299(str4, true);
                                                                }
                                                                c5752 = c5751;
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                c5752 = c5751;
                                                                if (obj3 != obj4) {
                                                                    if (!z11) {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                    c5752.m16188(obj4);
                                                                } else {
                                                                    if (z11) {
                                                                        if (z18) {
                                                                            char[] cArr10 = c12806.f38439;
                                                                            int length10 = cArr10.length;
                                                                            i4 = c6725.f20880 + length10;
                                                                            if (i4 > c6725.f20879.length) {
                                                                                c6725.m18300(i4);
                                                                            }
                                                                            System.arraycopy(cArr10, 0, c6725.f20879, c6725.f20880, length10);
                                                                            c6725.f20880 = i4;
                                                                        } else {
                                                                            c12806.m31115(c5752);
                                                                        }
                                                                    }
                                                                    if (z3) {
                                                                    }
                                                                    if (!z11) {
                                                                        if (cls4 == String.class) {
                                                                            c11396 = this;
                                                                            int i118 = c12806.f38442 | c11396.f34092;
                                                                            if (obj4 == 0) {
                                                                                i2 = c6725.f20878;
                                                                                i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                if ((i2 & i3) == 0) {
                                                                                    c6725.m18297(str5);
                                                                                } else {
                                                                                    c6725.m18297(str5);
                                                                                }
                                                                            } else {
                                                                                str6 = (String) obj6;
                                                                                if (z17) {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18302(str6);
                                                                                } else {
                                                                                    obj6 = obj4;
                                                                                    c6725.m18298(str6, (char) 0, true);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c11396 = this;
                                                                            if (c15896.f49120) {
                                                                                c12806.m31116(c5752, obj4);
                                                                            } else if (obj4 != 0) {
                                                                                if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                    string = ((Enum) obj5).toString();
                                                                                    if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                        z8 = true;
                                                                                    } else {
                                                                                        z8 = false;
                                                                                    }
                                                                                    if (z8) {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18302(string);
                                                                                    } else {
                                                                                        obj5 = obj4;
                                                                                        obj5 = obj4;
                                                                                        c6725.m18298(string, (char) 0, false);
                                                                                    }
                                                                                } else {
                                                                                    c6725.writeInt(((Enum) obj4).ordinal());
                                                                                }
                                                                            } else {
                                                                                c6725.m18296();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        c12806.m31116(c5752, obj4);
                                                                    }
                                                                    z16 = true;
                                                                }
                                                            }
                                                            c11396 = this;
                                                            z16 = true;
                                                        }
                                                    }
                                                    c11396 = this;
                                                    c5752 = c5751;
                                                } else {
                                                    objM31114 = c12806.m31114(obj7);
                                                }
                                                z3 = false;
                                                i = 0;
                                                z4 = false;
                                                z5 = true;
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM31114 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM31114 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM31114 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3) {
                                                            if (cls4 == cls3) {
                                                                objM31114 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM31114 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM31114 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM5941 = str8;
                                                        while (it2.hasNext()) {
                                                            strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                        }
                                                        objValueOf = objM31114;
                                                        str4 = strM5941;
                                                    } else {
                                                        objValueOf = objM31114;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3) {
                                                            Object obj18 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj18;
                                                        } else {
                                                            Object obj19 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj19;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM22845 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM22845;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7) {
                                                        c15896 = c15897;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c6725.f20880 + 1;
                                                            if (i5 > c6725.f20879.length) {
                                                                c6725.m18300(i5);
                                                            }
                                                            c6725.f20879[c6725.f20880] = ',';
                                                            c6725.f20880 = i5;
                                                            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                c5751.m16194();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c6725.m18299(str4, true);
                                                            }
                                                            c5752 = c5751;
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            c5752 = c5751;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c12806.m31115(c5752);
                                                                }
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr11 = c12806.f38439;
                                                                        int length11 = cArr11.length;
                                                                        i4 = c6725.f20880 + length11;
                                                                        if (i4 > c6725.f20879.length) {
                                                                            c6725.m18300(i4);
                                                                        }
                                                                        System.arraycopy(cArr11, 0, c6725.f20879, c6725.f20880, length11);
                                                                        c6725.f20880 = i4;
                                                                    } else {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c11396 = this;
                                                                        int i119 = c12806.f38442 | c11396.f34092;
                                                                        if (obj4 == 0) {
                                                                            i2 = c6725.f20878;
                                                                            i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                            if ((i2 & i3) == 0) {
                                                                                c6725.m18297(str5);
                                                                            } else {
                                                                                c6725.m18297(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c6725.m18302(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c6725.m18298(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        if (c15896.f49120) {
                                                                            c12806.m31116(c5752, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18302(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18298(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c6725.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c6725.m18296();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    c12806.m31116(c5752, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        z16 = true;
                                                    } else {
                                                        c15896 = c15897;
                                                        str5 = "";
                                                        obj4 = objValueOf;
                                                        if (z7) {
                                                        }
                                                        if (!z16) {
                                                            i5 = c6725.f20880 + 1;
                                                            if (i5 > c6725.f20879.length) {
                                                                c6725.m18300(i5);
                                                            }
                                                            c6725.f20879[c6725.f20880] = ',';
                                                            c6725.f20880 = i5;
                                                            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                c5751.m16194();
                                                            }
                                                        }
                                                        if (str4 != str8) {
                                                            if (!z11) {
                                                                c6725.m18299(str4, true);
                                                            }
                                                            c5752 = c5751;
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            c5752 = c5751;
                                                            if (obj3 != obj4) {
                                                                if (!z11) {
                                                                    c12806.m31115(c5752);
                                                                }
                                                                c5752.m16188(obj4);
                                                            } else {
                                                                if (z11) {
                                                                    if (z18) {
                                                                        char[] cArr12 = c12806.f38439;
                                                                        int length12 = cArr12.length;
                                                                        i4 = c6725.f20880 + length12;
                                                                        if (i4 > c6725.f20879.length) {
                                                                            c6725.m18300(i4);
                                                                        }
                                                                        System.arraycopy(cArr12, 0, c6725.f20879, c6725.f20880, length12);
                                                                        c6725.f20880 = i4;
                                                                    } else {
                                                                        c12806.m31115(c5752);
                                                                    }
                                                                }
                                                                if (z3) {
                                                                }
                                                                if (!z11) {
                                                                    if (cls4 == String.class) {
                                                                        c11396 = this;
                                                                        int i1110 = c12806.f38442 | c11396.f34092;
                                                                        if (obj4 == 0) {
                                                                            i2 = c6725.f20878;
                                                                            i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                            if ((i2 & i3) == 0) {
                                                                                c6725.m18297(str5);
                                                                            } else {
                                                                                c6725.m18297(str5);
                                                                            }
                                                                        } else {
                                                                            str6 = (String) obj6;
                                                                            if (z17) {
                                                                                obj6 = obj4;
                                                                                c6725.m18302(str6);
                                                                            } else {
                                                                                obj6 = obj4;
                                                                                c6725.m18298(str6, (char) 0, true);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c11396 = this;
                                                                        if (c15896.f49120) {
                                                                            c12806.m31116(c5752, obj4);
                                                                        } else if (obj4 != 0) {
                                                                            if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                string = ((Enum) obj5).toString();
                                                                                if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                    z8 = true;
                                                                                } else {
                                                                                    z8 = false;
                                                                                }
                                                                                if (z8) {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18302(string);
                                                                                } else {
                                                                                    obj5 = obj4;
                                                                                    obj5 = obj4;
                                                                                    c6725.m18298(string, (char) 0, false);
                                                                                }
                                                                            } else {
                                                                                c6725.writeInt(((Enum) obj4).ordinal());
                                                                            }
                                                                        } else {
                                                                            c6725.m18296();
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    c12806.m31116(c5752, obj4);
                                                                }
                                                                z16 = true;
                                                            }
                                                        }
                                                        c11396 = this;
                                                        z16 = true;
                                                    }
                                                }
                                                c11396 = this;
                                                c5752 = c5751;
                                            }
                                            arrayList6 = arrayList6;
                                            arrayList5 = arrayList5;
                                            arrayList2 = arrayList4;
                                            c11396 = this;
                                            c5752 = c5751;
                                        }
                                    }
                                    arrayList = arrayList7;
                                    str3 = str7;
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList5;
                                    arrayList2 = arrayList4;
                                    c11396 = this;
                                    c5752 = c5751;
                                } catch (Exception e) {
                                    e = e;
                                    c14485 = c14488;
                                    c5752 = c5751;
                                    str = "write javaBean error, fastjson version 1.1.72";
                                    if (obj2 != null) {
                                        str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                    }
                                    throw new C15082(str, e);
                                } catch (Throwable th) {
                                    th = th;
                                    c14485 = c14488;
                                    c5752 = c5751;
                                    c5752.f17704 = c14485;
                                    throw th;
                                }
                            } else {
                                if (str7 != null || !str7.equals(str8)) {
                                    if (arrayList7 == null) {
                                        z = true;
                                        break;
                                    }
                                    it4 = arrayList7.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z = true;
                                            break;
                                        } else if (!((InterfaceC17308) it4.next()).m40620()) {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        z2 = c15897.f49115;
                                        cls = Boolean.TYPE;
                                        arrayList = arrayList7;
                                        cls2 = Long.TYPE;
                                        str3 = str7;
                                        cls3 = Integer.TYPE;
                                        j = 0;
                                        if (z2) {
                                            objM31114 = null;
                                            if (cls4 == cls3) {
                                                i6 = field.getInt(obj7);
                                                z10 = false;
                                            } else {
                                                if (cls4 == cls2) {
                                                    j = field.getLong(obj7);
                                                    z3 = true;
                                                    i = 0;
                                                    z4 = false;
                                                    z5 = false;
                                                } else if (cls4 == cls) {
                                                    z10 = field.getBoolean(obj7);
                                                    i6 = 0;
                                                } else {
                                                    objM31114 = field.get(obj7);
                                                }
                                                if (arrayList4 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM31114 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM31114 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM31114 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it3 = arrayList4.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            z6 = true;
                                                            break;
                                                        } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                            z6 = false;
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    z6 = true;
                                                    break;
                                                }
                                                if (z6) {
                                                    if (arrayList5 != null) {
                                                        if (z3 && !z5) {
                                                            if (cls4 == cls3) {
                                                                objM31114 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objM31114 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objM31114 = Boolean.valueOf(z4);
                                                            }
                                                            z5 = true;
                                                        }
                                                        it2 = arrayList5.iterator();
                                                        strM5941 = str8;
                                                        while (it2.hasNext()) {
                                                            strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                        }
                                                        objValueOf = objM31114;
                                                        str4 = strM5941;
                                                    } else {
                                                        objValueOf = objM31114;
                                                        str4 = str8;
                                                    }
                                                    if (arrayList6 != null) {
                                                        if (z3 || z5) {
                                                            Object obj110 = objValueOf;
                                                            z9 = z5;
                                                            objValueOf2 = obj110;
                                                        } else {
                                                            if (cls4 == cls3) {
                                                                objValueOf2 = Integer.valueOf(i);
                                                            } else if (cls4 == cls2) {
                                                                objValueOf2 = Long.valueOf(j);
                                                            } else if (cls4 == cls) {
                                                                objValueOf2 = Boolean.valueOf(z4);
                                                            } else {
                                                                Object obj111 = objValueOf;
                                                                z9 = z5;
                                                                objValueOf2 = obj111;
                                                            }
                                                            z9 = true;
                                                        }
                                                        it = arrayList6.iterator();
                                                        objM22845 = objValueOf2;
                                                        while (it.hasNext()) {
                                                            objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                        }
                                                        z7 = z9;
                                                        objValueOf = objM22845;
                                                        obj3 = objValueOf2;
                                                    } else {
                                                        z7 = z5;
                                                        obj3 = objValueOf;
                                                    }
                                                    arrayList2 = arrayList4;
                                                    if (z7 || objValueOf != null) {
                                                        c15896 = c15897;
                                                        str5 = "";
                                                    } else {
                                                        try {
                                                            c15896 = c15897;
                                                            int i20 = c15897.f49119 | c11397.f34092;
                                                            int i21 = c6725.f20878;
                                                            int i22 = i20 | i21;
                                                            str5 = "";
                                                            if (cls4 != Boolean.class) {
                                                                if (cls4 == String.class) {
                                                                    int i23 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                    int i24 = EnumC20837.WriteMapNullValue.f67472 | i23;
                                                                    if (z11 || (i22 & i24) != 0 || (i24 & i21) != 0) {
                                                                        if ((i22 & i23) != 0 || (i21 & i23) != 0) {
                                                                            obj4 = str5;
                                                                        }
                                                                        if (z7 || obj4 == null || !z19 || (((cls4 != Byte.TYPE && cls4 != Short.TYPE && cls4 != cls3 && cls4 != cls2 && cls4 != Float.TYPE && cls4 != Double.TYPE) || !(obj4 instanceof Number) || ((Number) obj4).byteValue() != 0) && (cls4 != cls || !(obj4 instanceof Boolean) || ((Boolean) obj4).booleanValue()))) {
                                                                            if (!z16) {
                                                                                i5 = c6725.f20880 + 1;
                                                                                if (i5 > c6725.f20879.length) {
                                                                                    c6725.m18300(i5);
                                                                                }
                                                                                c6725.f20879[c6725.f20880] = ',';
                                                                                c6725.f20880 = i5;
                                                                                if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                                                    c5751.m16194();
                                                                                }
                                                                            }
                                                                            if (str4 != str8) {
                                                                                if (!z11) {
                                                                                    c6725.m18299(str4, true);
                                                                                }
                                                                                c5752 = c5751;
                                                                                try {
                                                                                    c5752.m16188(obj4);
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                    c14485 = c14488;
                                                                                    str = "write javaBean error, fastjson version 1.1.72";
                                                                                    if (obj2 != null) {
                                                                                        try {
                                                                                            str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                                                                        } catch (Throwable th2) {
                                                                                            th = th2;
                                                                                            c5752.f17704 = c14485;
                                                                                            throw th;
                                                                                        }
                                                                                    }
                                                                                    throw new C15082(str, e);
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    c14485 = c14488;
                                                                                    c5752.f17704 = c14485;
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                c5752 = c5751;
                                                                                if (obj3 != obj4) {
                                                                                    if (!z11) {
                                                                                        c12806.m31115(c5752);
                                                                                    }
                                                                                    c5752.m16188(obj4);
                                                                                } else {
                                                                                    if (z11) {
                                                                                        if (z18) {
                                                                                            char[] cArr13 = c12806.f38439;
                                                                                            int length13 = cArr13.length;
                                                                                            i4 = c6725.f20880 + length13;
                                                                                            if (i4 > c6725.f20879.length) {
                                                                                                c6725.m18300(i4);
                                                                                            }
                                                                                            System.arraycopy(cArr13, 0, c6725.f20879, c6725.f20880, length13);
                                                                                            c6725.f20880 = i4;
                                                                                        } else {
                                                                                            c12806.m31115(c5752);
                                                                                        }
                                                                                    }
                                                                                    if (z3 || z7) {
                                                                                        if (!z11) {
                                                                                            if (cls4 == String.class) {
                                                                                                c11396 = this;
                                                                                                int i1111 = c12806.f38442 | c11396.f34092;
                                                                                                if (obj4 == 0) {
                                                                                                    i2 = c6725.f20878;
                                                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                                                    if ((i2 & i3) == 0 || (i1111 & i3) != 0) {
                                                                                                        c6725.m18297(str5);
                                                                                                    } else {
                                                                                                        c6725.m18296();
                                                                                                    }
                                                                                                } else {
                                                                                                    str6 = (String) obj6;
                                                                                                    if (z17) {
                                                                                                        obj6 = obj4;
                                                                                                        c6725.m18302(str6);
                                                                                                    } else {
                                                                                                        obj6 = obj4;
                                                                                                        c6725.m18298(str6, (char) 0, true);
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                c11396 = this;
                                                                                                if (c15896.f49120) {
                                                                                                    c12806.m31116(c5752, obj4);
                                                                                                } else if (obj4 != 0) {
                                                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                                                        string = ((Enum) obj5).toString();
                                                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                                            z8 = true;
                                                                                                        } else {
                                                                                                            z8 = false;
                                                                                                        }
                                                                                                        if (z8) {
                                                                                                            obj5 = obj4;
                                                                                                            obj5 = obj4;
                                                                                                            c6725.m18302(string);
                                                                                                        } else {
                                                                                                            obj5 = obj4;
                                                                                                            obj5 = obj4;
                                                                                                            c6725.m18298(string, (char) 0, false);
                                                                                                        }
                                                                                                    } else {
                                                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                                                    }
                                                                                                } else {
                                                                                                    c6725.m18296();
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c11396 = this;
                                                                                            c12806.m31116(c5752, obj4);
                                                                                        }
                                                                                    } else if (cls4 == cls3) {
                                                                                        int i25 = i;
                                                                                        if (i25 == Integer.MIN_VALUE) {
                                                                                            c6725.write("-2147483648");
                                                                                        } else {
                                                                                            int i26 = 0;
                                                                                            while ((i25 < 0 ? -i25 : i25) > C6725.f20873[i26]) {
                                                                                                i26++;
                                                                                            }
                                                                                            int i27 = i26 + 1;
                                                                                            if (i25 < 0) {
                                                                                                i27 = i26 + 2;
                                                                                            }
                                                                                            int i28 = c6725.f20880 + i27;
                                                                                            if (i28 > c6725.f20879.length) {
                                                                                                c6725.m18300(i28);
                                                                                            }
                                                                                            C6725.m18295(i25, i28, c6725.f20879);
                                                                                            c6725.f20880 = i28;
                                                                                        }
                                                                                    } else if (cls4 == cls2) {
                                                                                        c6725.m18301(j);
                                                                                    } else if (cls4 == cls) {
                                                                                        if (z4) {
                                                                                            c6725.write(f34091, 0, 4);
                                                                                        } else {
                                                                                            c6725.write(f34090, 0, 5);
                                                                                        }
                                                                                    }
                                                                                    z16 = true;
                                                                                }
                                                                            }
                                                                            c11396 = this;
                                                                            z16 = true;
                                                                        }
                                                                    }
                                                                } else if (Number.class.isAssignableFrom(cls4)) {
                                                                    int i29 = EnumC20837.WriteNullNumberAsZero.f67472;
                                                                    int i30 = EnumC20837.WriteMapNullValue.f67472 | i29;
                                                                    if (z11 || (i22 & i30) != 0 || (i30 & c6725.f20878) != 0) {
                                                                        if ((i22 & i29) != 0 || (c6725.f20878 & i29) != 0) {
                                                                            objValueOf = Integer.valueOf(i17);
                                                                        }
                                                                    }
                                                                } else if (Collection.class.isAssignableFrom(cls4)) {
                                                                    int i31 = EnumC20837.WriteNullListAsEmpty.f67472;
                                                                    int i32 = EnumC20837.WriteMapNullValue.f67472 | i31;
                                                                    if (z11 || (i22 & i32) != 0 || (i32 & c6725.f20878) != 0) {
                                                                        if ((i22 & i31) != 0 || (c6725.f20878 & i31) != 0) {
                                                                            objValueOf = Collections.EMPTY_LIST;
                                                                        }
                                                                    }
                                                                } else if (!z11 && !c12806.f38440) {
                                                                    if (!((EnumC20837.WriteMapNullValue.f67472 & c6725.f20878) != 0)) {
                                                                    }
                                                                }
                                                            } else {
                                                                int i33 = EnumC20837.WriteNullBooleanAsFalse.f67472;
                                                                int i34 = EnumC20837.WriteMapNullValue.f67472 | i33;
                                                                if (z11 || (i22 & i34) != 0 || (i34 & i21) != 0) {
                                                                    if ((i22 & i33) != 0 || (i21 & i33) != 0) {
                                                                        objValueOf = Boolean.FALSE;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            c5752 = c5751;
                                                            c14485 = c14488;
                                                            str = "write javaBean error, fastjson version 1.1.72";
                                                            if (obj2 != null) {
                                                                str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                                            }
                                                            throw new C15082(str, e);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c5752 = c5751;
                                                            c14485 = c14488;
                                                            c5752.f17704 = c14485;
                                                            throw th;
                                                        }
                                                    }
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c6725.f20880 + 1;
                                                        if (i5 > c6725.f20879.length) {
                                                            c6725.m18300(i5);
                                                        }
                                                        c6725.f20879[c6725.f20880] = ',';
                                                        c6725.f20880 = i5;
                                                        if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                            c5751.m16194();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c6725.m18299(str4, true);
                                                        }
                                                        c5752 = c5751;
                                                        c5752.m16188(obj4);
                                                    } else {
                                                        c5752 = c5751;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c12806.m31115(c5752);
                                                            }
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr14 = c12806.f38439;
                                                                    int length14 = cArr14.length;
                                                                    i4 = c6725.f20880 + length14;
                                                                    if (i4 > c6725.f20879.length) {
                                                                        c6725.m18300(i4);
                                                                    }
                                                                    System.arraycopy(cArr14, 0, c6725.f20879, c6725.f20880, length14);
                                                                    c6725.f20880 = i4;
                                                                } else {
                                                                    c12806.m31115(c5752);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c11396 = this;
                                                                    int i1112 = c12806.f38442 | c11396.f34092;
                                                                    if (obj4 == 0) {
                                                                        i2 = c6725.f20878;
                                                                        i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                        if ((i2 & i3) == 0) {
                                                                            c6725.m18297(str5);
                                                                        } else {
                                                                            c6725.m18297(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c6725.m18302(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c6725.m18298(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    if (c15896.f49120) {
                                                                        c12806.m31116(c5752, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18302(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18298(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c6725.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c6725.m18296();
                                                                    }
                                                                }
                                                            } else {
                                                                c11396 = this;
                                                                c12806.m31116(c5752, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c11396 = this;
                                                    z16 = true;
                                                }
                                                c11396 = this;
                                                c5752 = c5751;
                                            }
                                            z5 = false;
                                            z4 = z10;
                                            i = i6;
                                            z3 = true;
                                            if (arrayList4 != null) {
                                                if (z3) {
                                                    if (cls4 == cls3) {
                                                        objM31114 = Integer.valueOf(i);
                                                    } else if (cls4 == cls2) {
                                                        objM31114 = Long.valueOf(j);
                                                    } else if (cls4 == cls) {
                                                        objM31114 = Boolean.valueOf(z4);
                                                    }
                                                    z5 = true;
                                                }
                                                it3 = arrayList4.iterator();
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                        z6 = true;
                                                        break;
                                                    } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                        z6 = false;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                z6 = true;
                                                break;
                                            }
                                            if (z6) {
                                                if (arrayList5 != null) {
                                                    if (z3) {
                                                        if (cls4 == cls3) {
                                                            objM31114 = Integer.valueOf(i);
                                                        } else if (cls4 == cls2) {
                                                            objM31114 = Long.valueOf(j);
                                                        } else if (cls4 == cls) {
                                                            objM31114 = Boolean.valueOf(z4);
                                                        }
                                                        z5 = true;
                                                    }
                                                    it2 = arrayList5.iterator();
                                                    strM5941 = str8;
                                                    while (it2.hasNext()) {
                                                        strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                    }
                                                    objValueOf = objM31114;
                                                    str4 = strM5941;
                                                } else {
                                                    objValueOf = objM31114;
                                                    str4 = str8;
                                                }
                                                if (arrayList6 != null) {
                                                    if (z3) {
                                                        Object obj112 = objValueOf;
                                                        z9 = z5;
                                                        objValueOf2 = obj112;
                                                    } else {
                                                        Object obj113 = objValueOf;
                                                        z9 = z5;
                                                        objValueOf2 = obj113;
                                                    }
                                                    it = arrayList6.iterator();
                                                    objM22845 = objValueOf2;
                                                    while (it.hasNext()) {
                                                        objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                    }
                                                    z7 = z9;
                                                    objValueOf = objM22845;
                                                    obj3 = objValueOf2;
                                                } else {
                                                    z7 = z5;
                                                    obj3 = objValueOf;
                                                }
                                                arrayList2 = arrayList4;
                                                if (z7) {
                                                    c15896 = c15897;
                                                    str5 = "";
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c6725.f20880 + 1;
                                                        if (i5 > c6725.f20879.length) {
                                                            c6725.m18300(i5);
                                                        }
                                                        c6725.f20879[c6725.f20880] = ',';
                                                        c6725.f20880 = i5;
                                                        if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                            c5751.m16194();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c6725.m18299(str4, true);
                                                        }
                                                        c5752 = c5751;
                                                        c5752.m16188(obj4);
                                                    } else {
                                                        c5752 = c5751;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c12806.m31115(c5752);
                                                            }
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr15 = c12806.f38439;
                                                                    int length15 = cArr15.length;
                                                                    i4 = c6725.f20880 + length15;
                                                                    if (i4 > c6725.f20879.length) {
                                                                        c6725.m18300(i4);
                                                                    }
                                                                    System.arraycopy(cArr15, 0, c6725.f20879, c6725.f20880, length15);
                                                                    c6725.f20880 = i4;
                                                                } else {
                                                                    c12806.m31115(c5752);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c11396 = this;
                                                                    int i1113 = c12806.f38442 | c11396.f34092;
                                                                    if (obj4 == 0) {
                                                                        i2 = c6725.f20878;
                                                                        i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                        if ((i2 & i3) == 0) {
                                                                            c6725.m18297(str5);
                                                                        } else {
                                                                            c6725.m18297(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c6725.m18302(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c6725.m18298(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    if (c15896.f49120) {
                                                                        c12806.m31116(c5752, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18302(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18298(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c6725.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c6725.m18296();
                                                                    }
                                                                }
                                                            } else {
                                                                c11396 = this;
                                                                c12806.m31116(c5752, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c11396 = this;
                                                    z16 = true;
                                                } else {
                                                    c15896 = c15897;
                                                    str5 = "";
                                                    obj4 = objValueOf;
                                                    if (z7) {
                                                    }
                                                    if (!z16) {
                                                        i5 = c6725.f20880 + 1;
                                                        if (i5 > c6725.f20879.length) {
                                                            c6725.m18300(i5);
                                                        }
                                                        c6725.f20879[c6725.f20880] = ',';
                                                        c6725.f20880 = i5;
                                                        if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                            c5751.m16194();
                                                        }
                                                    }
                                                    if (str4 != str8) {
                                                        if (!z11) {
                                                            c6725.m18299(str4, true);
                                                        }
                                                        c5752 = c5751;
                                                        c5752.m16188(obj4);
                                                    } else {
                                                        c5752 = c5751;
                                                        if (obj3 != obj4) {
                                                            if (!z11) {
                                                                c12806.m31115(c5752);
                                                            }
                                                            c5752.m16188(obj4);
                                                        } else {
                                                            if (z11) {
                                                                if (z18) {
                                                                    char[] cArr16 = c12806.f38439;
                                                                    int length16 = cArr16.length;
                                                                    i4 = c6725.f20880 + length16;
                                                                    if (i4 > c6725.f20879.length) {
                                                                        c6725.m18300(i4);
                                                                    }
                                                                    System.arraycopy(cArr16, 0, c6725.f20879, c6725.f20880, length16);
                                                                    c6725.f20880 = i4;
                                                                } else {
                                                                    c12806.m31115(c5752);
                                                                }
                                                            }
                                                            if (z3) {
                                                            }
                                                            if (!z11) {
                                                                if (cls4 == String.class) {
                                                                    c11396 = this;
                                                                    int i1114 = c12806.f38442 | c11396.f34092;
                                                                    if (obj4 == 0) {
                                                                        i2 = c6725.f20878;
                                                                        i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                        if ((i2 & i3) == 0) {
                                                                            c6725.m18297(str5);
                                                                        } else {
                                                                            c6725.m18297(str5);
                                                                        }
                                                                    } else {
                                                                        str6 = (String) obj6;
                                                                        if (z17) {
                                                                            obj6 = obj4;
                                                                            c6725.m18302(str6);
                                                                        } else {
                                                                            obj6 = obj4;
                                                                            c6725.m18298(str6, (char) 0, true);
                                                                        }
                                                                    }
                                                                } else {
                                                                    c11396 = this;
                                                                    if (c15896.f49120) {
                                                                        c12806.m31116(c5752, obj4);
                                                                    } else if (obj4 != 0) {
                                                                        if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                            string = ((Enum) obj5).toString();
                                                                            if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                                z8 = true;
                                                                            } else {
                                                                                z8 = false;
                                                                            }
                                                                            if (z8) {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18302(string);
                                                                            } else {
                                                                                obj5 = obj4;
                                                                                obj5 = obj4;
                                                                                c6725.m18298(string, (char) 0, false);
                                                                            }
                                                                        } else {
                                                                            c6725.writeInt(((Enum) obj4).ordinal());
                                                                        }
                                                                    } else {
                                                                        c6725.m18296();
                                                                    }
                                                                }
                                                            } else {
                                                                c11396 = this;
                                                                c12806.m31116(c5752, obj4);
                                                            }
                                                            z16 = true;
                                                        }
                                                    }
                                                    c11396 = this;
                                                    z16 = true;
                                                }
                                            }
                                            c11396 = this;
                                            c5752 = c5751;
                                        } else {
                                            objM31114 = c12806.m31114(obj7);
                                        }
                                        z3 = false;
                                        i = 0;
                                        z4 = false;
                                        z5 = true;
                                        if (arrayList4 != null) {
                                            if (z3) {
                                                if (cls4 == cls3) {
                                                    objM31114 = Integer.valueOf(i);
                                                } else if (cls4 == cls2) {
                                                    objM31114 = Long.valueOf(j);
                                                } else if (cls4 == cls) {
                                                    objM31114 = Boolean.valueOf(z4);
                                                }
                                                z5 = true;
                                            }
                                            it3 = arrayList4.iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    z6 = true;
                                                    break;
                                                } else if (!((InterfaceC18014) it3.next()).apply()) {
                                                    z6 = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z6 = true;
                                            break;
                                        }
                                        if (z6) {
                                            if (arrayList5 != null) {
                                                if (z3) {
                                                    if (cls4 == cls3) {
                                                        objM31114 = Integer.valueOf(i);
                                                    } else if (cls4 == cls2) {
                                                        objM31114 = Long.valueOf(j);
                                                    } else if (cls4 == cls) {
                                                        objM31114 = Boolean.valueOf(z4);
                                                    }
                                                    z5 = true;
                                                }
                                                it2 = arrayList5.iterator();
                                                strM5941 = str8;
                                                while (it2.hasNext()) {
                                                    strM5941 = ((InterfaceC1786) it2.next()).m5941();
                                                }
                                                objValueOf = objM31114;
                                                str4 = strM5941;
                                            } else {
                                                objValueOf = objM31114;
                                                str4 = str8;
                                            }
                                            if (arrayList6 != null) {
                                                if (z3) {
                                                    Object obj114 = objValueOf;
                                                    z9 = z5;
                                                    objValueOf2 = obj114;
                                                } else {
                                                    Object obj115 = objValueOf;
                                                    z9 = z5;
                                                    objValueOf2 = obj115;
                                                }
                                                it = arrayList6.iterator();
                                                objM22845 = objValueOf2;
                                                while (it.hasNext()) {
                                                    objM22845 = ((InterfaceC8842) it.next()).m22845();
                                                }
                                                z7 = z9;
                                                objValueOf = objM22845;
                                                obj3 = objValueOf2;
                                            } else {
                                                z7 = z5;
                                                obj3 = objValueOf;
                                            }
                                            arrayList2 = arrayList4;
                                            if (z7) {
                                                c15896 = c15897;
                                                str5 = "";
                                                obj4 = objValueOf;
                                                if (z7) {
                                                }
                                                if (!z16) {
                                                    i5 = c6725.f20880 + 1;
                                                    if (i5 > c6725.f20879.length) {
                                                        c6725.m18300(i5);
                                                    }
                                                    c6725.f20879[c6725.f20880] = ',';
                                                    c6725.f20880 = i5;
                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                        c5751.m16194();
                                                    }
                                                }
                                                if (str4 != str8) {
                                                    if (!z11) {
                                                        c6725.m18299(str4, true);
                                                    }
                                                    c5752 = c5751;
                                                    c5752.m16188(obj4);
                                                } else {
                                                    c5752 = c5751;
                                                    if (obj3 != obj4) {
                                                        if (!z11) {
                                                            c12806.m31115(c5752);
                                                        }
                                                        c5752.m16188(obj4);
                                                    } else {
                                                        if (z11) {
                                                            if (z18) {
                                                                char[] cArr17 = c12806.f38439;
                                                                int length17 = cArr17.length;
                                                                i4 = c6725.f20880 + length17;
                                                                if (i4 > c6725.f20879.length) {
                                                                    c6725.m18300(i4);
                                                                }
                                                                System.arraycopy(cArr17, 0, c6725.f20879, c6725.f20880, length17);
                                                                c6725.f20880 = i4;
                                                            } else {
                                                                c12806.m31115(c5752);
                                                            }
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (!z11) {
                                                            if (cls4 == String.class) {
                                                                c11396 = this;
                                                                int i1115 = c12806.f38442 | c11396.f34092;
                                                                if (obj4 == 0) {
                                                                    i2 = c6725.f20878;
                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                    if ((i2 & i3) == 0) {
                                                                        c6725.m18297(str5);
                                                                    } else {
                                                                        c6725.m18297(str5);
                                                                    }
                                                                } else {
                                                                    str6 = (String) obj6;
                                                                    if (z17) {
                                                                        obj6 = obj4;
                                                                        c6725.m18302(str6);
                                                                    } else {
                                                                        obj6 = obj4;
                                                                        c6725.m18298(str6, (char) 0, true);
                                                                    }
                                                                }
                                                            } else {
                                                                c11396 = this;
                                                                if (c15896.f49120) {
                                                                    c12806.m31116(c5752, obj4);
                                                                } else if (obj4 != 0) {
                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                        string = ((Enum) obj5).toString();
                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                            z8 = true;
                                                                        } else {
                                                                            z8 = false;
                                                                        }
                                                                        if (z8) {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c6725.m18302(string);
                                                                        } else {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c6725.m18298(string, (char) 0, false);
                                                                        }
                                                                    } else {
                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                    }
                                                                } else {
                                                                    c6725.m18296();
                                                                }
                                                            }
                                                        } else {
                                                            c11396 = this;
                                                            c12806.m31116(c5752, obj4);
                                                        }
                                                        z16 = true;
                                                    }
                                                }
                                                c11396 = this;
                                                z16 = true;
                                            } else {
                                                c15896 = c15897;
                                                str5 = "";
                                                obj4 = objValueOf;
                                                if (z7) {
                                                }
                                                if (!z16) {
                                                    i5 = c6725.f20880 + 1;
                                                    if (i5 > c6725.f20879.length) {
                                                        c6725.m18300(i5);
                                                    }
                                                    c6725.f20879[c6725.f20880] = ',';
                                                    c6725.f20880 = i5;
                                                    if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                                                        c5751.m16194();
                                                    }
                                                }
                                                if (str4 != str8) {
                                                    if (!z11) {
                                                        c6725.m18299(str4, true);
                                                    }
                                                    c5752 = c5751;
                                                    c5752.m16188(obj4);
                                                } else {
                                                    c5752 = c5751;
                                                    if (obj3 != obj4) {
                                                        if (!z11) {
                                                            c12806.m31115(c5752);
                                                        }
                                                        c5752.m16188(obj4);
                                                    } else {
                                                        if (z11) {
                                                            if (z18) {
                                                                char[] cArr18 = c12806.f38439;
                                                                int length18 = cArr18.length;
                                                                i4 = c6725.f20880 + length18;
                                                                if (i4 > c6725.f20879.length) {
                                                                    c6725.m18300(i4);
                                                                }
                                                                System.arraycopy(cArr18, 0, c6725.f20879, c6725.f20880, length18);
                                                                c6725.f20880 = i4;
                                                            } else {
                                                                c12806.m31115(c5752);
                                                            }
                                                        }
                                                        if (z3) {
                                                        }
                                                        if (!z11) {
                                                            if (cls4 == String.class) {
                                                                c11396 = this;
                                                                int i1116 = c12806.f38442 | c11396.f34092;
                                                                if (obj4 == 0) {
                                                                    i2 = c6725.f20878;
                                                                    i3 = EnumC20837.WriteNullStringAsEmpty.f67472;
                                                                    if ((i2 & i3) == 0) {
                                                                        c6725.m18297(str5);
                                                                    } else {
                                                                        c6725.m18297(str5);
                                                                    }
                                                                } else {
                                                                    str6 = (String) obj6;
                                                                    if (z17) {
                                                                        obj6 = obj4;
                                                                        c6725.m18302(str6);
                                                                    } else {
                                                                        obj6 = obj4;
                                                                        c6725.m18298(str6, (char) 0, true);
                                                                    }
                                                                }
                                                            } else {
                                                                c11396 = this;
                                                                if (c15896.f49120) {
                                                                    c12806.m31116(c5752, obj4);
                                                                } else if (obj4 != 0) {
                                                                    if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
                                                                        string = ((Enum) obj5).toString();
                                                                        if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                                                                            z8 = true;
                                                                        } else {
                                                                            z8 = false;
                                                                        }
                                                                        if (z8) {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c6725.m18302(string);
                                                                        } else {
                                                                            obj5 = obj4;
                                                                            obj5 = obj4;
                                                                            c6725.m18298(string, (char) 0, false);
                                                                        }
                                                                    } else {
                                                                        c6725.writeInt(((Enum) obj4).ordinal());
                                                                    }
                                                                } else {
                                                                    c6725.m18296();
                                                                }
                                                            }
                                                        } else {
                                                            c11396 = this;
                                                            c12806.m31116(c5752, obj4);
                                                        }
                                                        z16 = true;
                                                    }
                                                }
                                                c11396 = this;
                                                z16 = true;
                                            }
                                        }
                                        c11396 = this;
                                        c5752 = c5751;
                                    }
                                    arrayList6 = arrayList6;
                                    arrayList5 = arrayList5;
                                    arrayList2 = arrayList4;
                                    c11396 = this;
                                    c5752 = c5751;
                                }
                                arrayList = arrayList7;
                                str3 = str7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList2 = arrayList4;
                                c11396 = this;
                                c5752 = c5751;
                            }
                            try {
                                i16 = i18 + 1;
                                i17 = 0;
                                obj7 = obj;
                                c12806Arr = c12806Arr2;
                                z14 = z17;
                                z13 = z18;
                                z15 = z19;
                                arrayList7 = arrayList;
                                str7 = str3;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList4 = arrayList2;
                                C11396 c11398 = c11396;
                                c5753 = c5752;
                                c11397 = c11398;
                            } catch (Exception e4) {
                                e = e4;
                                c14485 = c14488;
                                str = "write javaBean error, fastjson version 1.1.72";
                                if (obj2 != null) {
                                    str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                                }
                                throw new C15082(str, e);
                            } catch (Throwable th5) {
                                th = th5;
                                c14485 = c14488;
                                c5752.f17704 = c14485;
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        c5752 = c5753;
                    } catch (Throwable th7) {
                        th = th7;
                        c5752 = c5753;
                    }
                } catch (Exception e7) {
                    e = e7;
                    c14485 = c14488;
                    c5752 = c5753;
                    str = "write javaBean error, fastjson version 1.1.72";
                    if (obj2 != null) {
                        str = "write javaBean error, fastjson version 1.1.72, fieldName : " + obj2;
                    }
                    throw new C15082(str, e);
                } catch (Throwable th8) {
                    th = th8;
                    c14485 = c14488;
                    c5752 = c5753;
                    c5752.f17704 = c14485;
                    throw th;
                }
            }
            C12806[] c12806Arr3 = c12806Arr;
            c5752 = c5753;
            ArrayList arrayList8 = c5752.f17694;
            if (arrayList8 != null) {
                char cM1092 = z16 ? ',' : (char) 0;
                Iterator it6 = arrayList8.iterator();
                while (it6.hasNext()) {
                    cM1092 = ((AbstractC0105) it6.next()).m1092(c5752, obj, cM1092);
                }
            }
            if (c12806Arr3.length > 0 && (c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                c5751.m16187();
                c5751.m16194();
            }
            int i35 = c6725.f20880 + 1;
            if (i35 > c6725.f20879.length) {
                c6725.m18300(i35);
            }
            c6725.f20879[c6725.f20880] = c3;
            c6725.f20880 = i35;
            c5752.f17704 = c14488;
        } catch (Exception e8) {
            e = e8;
            c14485 = c14488;
        } catch (Throwable th9) {
            th = th9;
            c14485 = c14488;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m28160(Object obj) {
        C12806[] c12806Arr = this.f34094;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c12806Arr.length);
        for (C12806 c12806 : c12806Arr) {
            linkedHashMap.put(c12806.f38443.f49123, c12806.m31114(obj));
        }
        return linkedHashMap;
    }
}
