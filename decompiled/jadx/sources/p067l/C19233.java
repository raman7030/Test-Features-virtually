package p067l;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AUS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19233 extends AbstractC19904 {

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC20575 f57486;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f57487;

    /* JADX INFO: renamed from: ᩻ */
    public final Type f57488;

    public C19233(Class cls, C17476 c17476) {
        super(cls, c17476);
        Type type = c17476.f52261;
        Class cls2 = c17476.f52254;
        if (cls2.isArray()) {
            this.f57488 = cls2.getComponentType();
            this.f57487 = true;
        } else {
            this.f57488 = C20831.m47044(type);
            this.f57487 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:118:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0237  */
    /* JADX WARN: Code duplicated, block: B:123:0x023f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0242  */
    /* JADX WARN: Code duplicated, block: B:126:0x024b  */
    /* JADX WARN: Code duplicated, block: B:136:0x027a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0290  */
    /* JADX WARN: Code duplicated, block: B:141:0x0299  */
    /* JADX WARN: Code duplicated, block: B:143:0x029f  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:148:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x0231 A[EDGE_INSN: B:165:0x0231->B:119:0x0231 BREAK  A[LOOP:1: B:115:0x0220->B:160:0x02de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    @Override // p067l.AbstractC19904
    /* JADX INFO: renamed from: ֫ */
    public final void mo19780(C13351 c13351, Object obj, Type type, Map map) {
        C3292 c3292;
        List arrayList;
        C3292 c3293;
        C17476 c17476;
        InterfaceC20575 interfaceC20575;
        Type c20160;
        Type type2;
        C3292 c3294;
        InterfaceC20575 interfaceC20575M54235;
        C3292 c3295;
        C3292 c3296;
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char c;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        C3292 c3297;
        C3292 c3298;
        int i7;
        InterfaceC20575 interfaceC20576;
        int i8;
        C9327 c9327 = c13351.f37485;
        C24597 c24597 = c13351.f37492;
        int i9 = c9327.f25382;
        if (i9 == 8 || (i9 == 4 && c9327.m21602().length() == 0)) {
            mo19779(obj, null);
            c9327.m21606();
            return;
        }
        boolean z = this.f57487;
        Type type3 = this.f57488;
        if (z) {
            C3292 c3299 = new C3292();
            c3299.m5736(type3);
            c3292 = c3299;
            arrayList = c3299;
        } else {
            c3292 = null;
            arrayList = new ArrayList();
        }
        C15879 c15879 = c13351.f37493;
        C17476 c17477 = this.f60448;
        c13351.m30483(c15879, obj, c17477.f52263);
        InterfaceC20575 interfaceC20577 = this.f57486;
        if (type instanceof ParameterizedType) {
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type3;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls != null) {
                    interfaceC20576 = interfaceC20577;
                    int length = cls.getTypeParameters().length;
                    c17476 = c17477;
                    i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            int i10 = length;
                            Class cls2 = cls;
                            if (cls.getTypeParameters()[i8].getName().equals(typeVariable.getName())) {
                                break;
                            }
                            i8++;
                            cls = cls2;
                            length = i10;
                        }
                    }
                    if (i8 != -1) {
                        type2 = parameterizedType.getActualTypeArguments()[i8];
                        if (!type2.equals(type3)) {
                            interfaceC20575M54235 = c24597.m54235(type2);
                        }
                        c3296 = c3292;
                    } else {
                        type2 = type3;
                    }
                    interfaceC20575M54235 = interfaceC20576;
                    c3296 = c3292;
                } else {
                    c17476 = c17477;
                    interfaceC20576 = interfaceC20577;
                }
                i8 = -1;
                if (i8 != -1) {
                    type2 = parameterizedType.getActualTypeArguments()[i8];
                    if (!type2.equals(type3)) {
                        interfaceC20575M54235 = c24597.m54235(type2);
                    }
                    c3296 = c3292;
                } else {
                    type2 = type3;
                }
                interfaceC20575M54235 = interfaceC20576;
                c3296 = c3292;
            } else {
                c17476 = c17477;
                interfaceC20575 = interfaceC20577;
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType2 = (ParameterizedType) type3;
                    Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type4 = actualTypeArguments[0];
                        if (type4 instanceof TypeVariable) {
                            TypeVariable typeVariable2 = (TypeVariable) type4;
                            ParameterizedType parameterizedType3 = (ParameterizedType) type;
                            Class cls3 = parameterizedType3.getRawType() instanceof Class ? (Class) parameterizedType3.getRawType() : null;
                            if (cls3 != null) {
                                int length2 = cls3.getTypeParameters().length;
                                c3298 = c3292;
                                i7 = 0;
                                while (true) {
                                    if (i7 < length2) {
                                        int i11 = length2;
                                        Class cls4 = cls3;
                                        if (cls3.getTypeParameters()[i7].getName().equals(typeVariable2.getName())) {
                                            break;
                                        }
                                        i7++;
                                        cls3 = cls4;
                                        length2 = i11;
                                    }
                                }
                                c3297 = c3298;
                                if (i7 != -1) {
                                    actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                    c20160 = new C20160(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                    c3295 = c3298;
                                }
                            } else {
                                c3298 = c3292;
                            }
                            i7 = -1;
                            c3297 = c3298;
                            if (i7 != -1) {
                                actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                c20160 = new C20160(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                c3295 = c3298;
                            }
                        } else {
                            c3297 = c3292;
                        }
                        c20160 = type3;
                        c3295 = c3297;
                    } else {
                        c3297 = c3292;
                        c20160 = type3;
                        c3295 = c3297;
                    }
                    type2 = c20160;
                    c3294 = c3295;
                    interfaceC20575M54235 = interfaceC20575;
                    c3296 = c3294;
                } else {
                    c3293 = c3292;
                    type2 = type3;
                    c3294 = c3293;
                    interfaceC20575M54235 = interfaceC20575;
                    c3296 = c3294;
                }
            }
        } else {
            c3293 = c3292;
            c17476 = c17477;
            interfaceC20575 = interfaceC20577;
            if ((type3 instanceof TypeVariable) && (type instanceof Class)) {
                Class cls5 = (Class) type;
                TypeVariable typeVariable3 = (TypeVariable) type3;
                cls5.getTypeParameters();
                int length3 = cls5.getTypeParameters().length;
                int i12 = 0;
                while (true) {
                    if (i12 < length3) {
                        TypeVariable typeVariable4 = cls5.getTypeParameters()[i12];
                        if (typeVariable4.getName().equals(typeVariable3.getName())) {
                            Type[] bounds = typeVariable4.getBounds();
                            if (bounds.length == 1) {
                                c20160 = bounds[0];
                                c3295 = c3293;
                                type2 = c20160;
                                c3294 = c3295;
                            }
                            interfaceC20575M54235 = interfaceC20575;
                            c3296 = c3294;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            type2 = type3;
            c3294 = c3293;
            interfaceC20575M54235 = interfaceC20575;
            c3296 = c3294;
        }
        if (interfaceC20575M54235 == null) {
            interfaceC20575M54235 = c24597.m54235(type2);
            this.f57486 = interfaceC20575M54235;
        }
        int i13 = c9327.f25382;
        String str = c9327.f25380;
        int i14 = c9327.f25384;
        if (i13 == 14) {
            char c2 = c9327.f25388;
            if (c2 == '[') {
                int i15 = c9327.f25377 + 1;
                c9327.f25377 = i15;
                c9327.f25388 = i15 >= i14 ? (char) 26 : str.charAt(i15);
                c9327.f25382 = 14;
            } else if (c2 == '{') {
                int i16 = c9327.f25377 + 1;
                c9327.f25377 = i16;
                c9327.f25388 = i16 >= i14 ? (char) 26 : str.charAt(i16);
                c9327.f25382 = 12;
            } else {
                if (c2 == '\"') {
                    c9327.m21624();
                } else if (c2 == ']') {
                    int i17 = c9327.f25377 + 1;
                    c9327.f25377 = i17;
                    c9327.f25388 = i17 >= i14 ? (char) 26 : str.charAt(i17);
                    i = 15;
                    c9327.f25382 = 15;
                } else {
                    i = 15;
                    c9327.m21606();
                }
                i2 = 0;
                while (true) {
                    i3 = c9327.f25382;
                    if (i3 == 16) {
                        c9327.m21606();
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        arrayList.add(interfaceC20575M54235.mo7431(c13351, type2, Integer.valueOf(i2)));
                        if (c13351.f37487 == 1) {
                            c13351.m30486((Collection) arrayList);
                        }
                        if (c9327.f25382 == 16) {
                            c = c9327.f25388;
                            if (c == '[') {
                                i6 = c9327.f25377 + 1;
                                c9327.f25377 = i6;
                                if (i6 >= i14) {
                                    cCharAt3 = 26;
                                } else {
                                    cCharAt3 = str.charAt(i6);
                                }
                                c9327.f25388 = cCharAt3;
                                c9327.f25382 = 14;
                            } else if (c == '{') {
                                i5 = c9327.f25377 + 1;
                                c9327.f25377 = i5;
                                if (i5 >= i14) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                c9327.f25388 = cCharAt2;
                                c9327.f25382 = 12;
                            } else if (c == '\"') {
                                c9327.m21624();
                            } else {
                                c9327.m21606();
                            }
                        }
                        i2++;
                        i = 15;
                    }
                    c17476 = c17476;
                }
                if (c9327.f25388 == ',') {
                    i4 = c9327.f25377 + 1;
                    c9327.f25377 = i4;
                    if (i4 >= i14) {
                        cCharAt = 26;
                    } else {
                        cCharAt = str.charAt(i4);
                    }
                    c9327.f25388 = cCharAt;
                    c9327.f25382 = 16;
                } else {
                    c9327.m21606();
                }
            }
            i = 15;
            i2 = 0;
            while (true) {
                i3 = c9327.f25382;
                if (i3 == 16) {
                    c9327.m21606();
                } else {
                    if (i3 == i) {
                        break;
                        break;
                    }
                    arrayList.add(interfaceC20575M54235.mo7431(c13351, type2, Integer.valueOf(i2)));
                    if (c13351.f37487 == 1) {
                        c13351.m30486((Collection) arrayList);
                    }
                    if (c9327.f25382 == 16) {
                        c = c9327.f25388;
                        if (c == '[') {
                            i6 = c9327.f25377 + 1;
                            c9327.f25377 = i6;
                            if (i6 >= i14) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str.charAt(i6);
                            }
                            c9327.f25388 = cCharAt3;
                            c9327.f25382 = 14;
                        } else if (c == '{') {
                            i5 = c9327.f25377 + 1;
                            c9327.f25377 = i5;
                            if (i5 >= i14) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            c9327.f25388 = cCharAt2;
                            c9327.f25382 = 12;
                        } else if (c == '\"') {
                            c9327.m21624();
                        } else {
                            c9327.m21606();
                        }
                    }
                    i2++;
                    i = 15;
                }
                c17476 = c17476;
            }
            if (c9327.f25388 == ',') {
                i4 = c9327.f25377 + 1;
                c9327.f25377 = i4;
                if (i4 >= i14) {
                    cCharAt = 26;
                } else {
                    cCharAt = str.charAt(i4);
                }
                c9327.f25388 = cCharAt;
                c9327.f25382 = 16;
            } else {
                c9327.m21606();
            }
        } else if (i13 == 12) {
            arrayList.add(interfaceC20575M54235.mo7431(c13351, type2, 0));
        } else {
            String strConcat = "exepct '[', but ".concat(C21370.m48416(i13));
            if (type != null) {
                strConcat = strConcat + ", type : " + type;
            }
            throw new C16702(strConcat);
        }
        c13351.m30490(c15879);
        Object obj2 = arrayList;
        if (z) {
            Object array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) type3, arrayList.size()));
            c3296.m5739(array);
            obj2 = array;
        }
        if (obj == null) {
            map.put(c17476.f52263, obj2);
        } else {
            mo19779(obj, obj2);
        }
    }
}
