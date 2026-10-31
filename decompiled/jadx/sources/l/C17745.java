package l;

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
public final class C17745 extends AbstractC18451 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19157 f54294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f54295;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Type f54296;

    public C17745(Class cls, C15896 c15896) {
        super(cls, c15896);
        Type type = c15896.f49121;
        Class cls2 = c15896.f49114;
        if (cls2.isArray()) {
            this.f54296 = cls2.getComponentType();
            this.f54295 = true;
        } else {
            this.f54296 = C19426.m44750(type);
            this.f54295 = false;
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
    @Override // l.AbstractC18451
    /* JADX INFO: renamed from: ֫ */
    public final void mo17833(C11556 c11556, Object obj, Type type, Map map) {
        C0972 c0972;
        List arrayList;
        C0972 c0973;
        C15896 c15896;
        InterfaceC19157 interfaceC19157;
        Type c18720;
        Type type2;
        C0972 c0974;
        InterfaceC19157 interfaceC19157M51838;
        C0972 c0975;
        C0972 c0976;
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
        C0972 c0977;
        C0972 c0978;
        int i7;
        InterfaceC19157 interfaceC19158;
        int i8;
        C7322 c7322 = c11556.f34488;
        C23389 c23389 = c11556.f34495;
        int i9 = c7322.f22491;
        if (i9 == 8 || (i9 == 4 && c7322.m19634().length() == 0)) {
            mo17832(obj, null);
            c7322.m19638();
            return;
        }
        boolean z = this.f54295;
        Type type3 = this.f54296;
        if (z) {
            C0972 c0979 = new C0972();
            c0979.m3433(type3);
            c0972 = c0979;
            arrayList = c0979;
        } else {
            c0972 = null;
            arrayList = new ArrayList();
        }
        C14216 c14216 = c11556.f34496;
        C15896 c15897 = this.f57230;
        c11556.m28437(c14216, obj, c15897.f49123);
        InterfaceC19157 interfaceC19159 = this.f54294;
        if (type instanceof ParameterizedType) {
            if (type3 instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type3;
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = parameterizedType.getRawType() instanceof Class ? (Class) parameterizedType.getRawType() : null;
                if (cls != null) {
                    interfaceC19158 = interfaceC19159;
                    int length = cls.getTypeParameters().length;
                    c15896 = c15897;
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
                            interfaceC19157M51838 = c23389.m51838(type2);
                        }
                        c0976 = c0972;
                    } else {
                        type2 = type3;
                    }
                    interfaceC19157M51838 = interfaceC19158;
                    c0976 = c0972;
                } else {
                    c15896 = c15897;
                    interfaceC19158 = interfaceC19159;
                }
                i8 = -1;
                if (i8 != -1) {
                    type2 = parameterizedType.getActualTypeArguments()[i8];
                    if (!type2.equals(type3)) {
                        interfaceC19157M51838 = c23389.m51838(type2);
                    }
                    c0976 = c0972;
                } else {
                    type2 = type3;
                }
                interfaceC19157M51838 = interfaceC19158;
                c0976 = c0972;
            } else {
                c15896 = c15897;
                interfaceC19157 = interfaceC19159;
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
                                c0978 = c0972;
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
                                c0977 = c0978;
                                if (i7 != -1) {
                                    actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                    c18720 = new C18720(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                    c0975 = c0978;
                                }
                            } else {
                                c0978 = c0972;
                            }
                            i7 = -1;
                            c0977 = c0978;
                            if (i7 != -1) {
                                actualTypeArguments[0] = parameterizedType3.getActualTypeArguments()[i7];
                                c18720 = new C18720(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                                c0975 = c0978;
                            }
                        } else {
                            c0977 = c0972;
                        }
                        c18720 = type3;
                        c0975 = c0977;
                    } else {
                        c0977 = c0972;
                        c18720 = type3;
                        c0975 = c0977;
                    }
                    type2 = c18720;
                    c0974 = c0975;
                    interfaceC19157M51838 = interfaceC19157;
                    c0976 = c0974;
                } else {
                    c0973 = c0972;
                    type2 = type3;
                    c0974 = c0973;
                    interfaceC19157M51838 = interfaceC19157;
                    c0976 = c0974;
                }
            }
        } else {
            c0973 = c0972;
            c15896 = c15897;
            interfaceC19157 = interfaceC19159;
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
                                c18720 = bounds[0];
                                c0975 = c0973;
                                type2 = c18720;
                                c0974 = c0975;
                            }
                            interfaceC19157M51838 = interfaceC19157;
                            c0976 = c0974;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            type2 = type3;
            c0974 = c0973;
            interfaceC19157M51838 = interfaceC19157;
            c0976 = c0974;
        }
        if (interfaceC19157M51838 == null) {
            interfaceC19157M51838 = c23389.m51838(type2);
            this.f54294 = interfaceC19157M51838;
        }
        int i13 = c7322.f22491;
        String str = c7322.f22489;
        int i14 = c7322.f22493;
        if (i13 == 14) {
            char c2 = c7322.f22497;
            if (c2 == '[') {
                int i15 = c7322.f22486 + 1;
                c7322.f22486 = i15;
                c7322.f22497 = i15 >= i14 ? (char) 26 : str.charAt(i15);
                c7322.f22491 = 14;
            } else if (c2 == '{') {
                int i16 = c7322.f22486 + 1;
                c7322.f22486 = i16;
                c7322.f22497 = i16 >= i14 ? (char) 26 : str.charAt(i16);
                c7322.f22491 = 12;
            } else {
                if (c2 == '\"') {
                    c7322.m19656();
                } else if (c2 == ']') {
                    int i17 = c7322.f22486 + 1;
                    c7322.f22486 = i17;
                    c7322.f22497 = i17 >= i14 ? (char) 26 : str.charAt(i17);
                    i = 15;
                    c7322.f22491 = 15;
                } else {
                    i = 15;
                    c7322.m19638();
                }
                i2 = 0;
                while (true) {
                    i3 = c7322.f22491;
                    if (i3 == 16) {
                        c7322.m19638();
                    } else {
                        if (i3 == i) {
                            break;
                        }
                        arrayList.add(interfaceC19157M51838.mo5204(c11556, type2, Integer.valueOf(i2)));
                        if (c11556.f34490 == 1) {
                            c11556.m28440((Collection) arrayList);
                        }
                        if (c7322.f22491 == 16) {
                            c = c7322.f22497;
                            if (c == '[') {
                                i6 = c7322.f22486 + 1;
                                c7322.f22486 = i6;
                                if (i6 >= i14) {
                                    cCharAt3 = 26;
                                } else {
                                    cCharAt3 = str.charAt(i6);
                                }
                                c7322.f22497 = cCharAt3;
                                c7322.f22491 = 14;
                            } else if (c == '{') {
                                i5 = c7322.f22486 + 1;
                                c7322.f22486 = i5;
                                if (i5 >= i14) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i5);
                                }
                                c7322.f22497 = cCharAt2;
                                c7322.f22491 = 12;
                            } else if (c == '\"') {
                                c7322.m19656();
                            } else {
                                c7322.m19638();
                            }
                        }
                        i2++;
                        i = 15;
                    }
                    c15896 = c15896;
                }
                if (c7322.f22497 == ',') {
                    i4 = c7322.f22486 + 1;
                    c7322.f22486 = i4;
                    if (i4 >= i14) {
                        cCharAt = 26;
                    } else {
                        cCharAt = str.charAt(i4);
                    }
                    c7322.f22497 = cCharAt;
                    c7322.f22491 = 16;
                } else {
                    c7322.m19638();
                }
            }
            i = 15;
            i2 = 0;
            while (true) {
                i3 = c7322.f22491;
                if (i3 == 16) {
                    c7322.m19638();
                } else {
                    if (i3 == i) {
                        break;
                        break;
                    }
                    arrayList.add(interfaceC19157M51838.mo5204(c11556, type2, Integer.valueOf(i2)));
                    if (c11556.f34490 == 1) {
                        c11556.m28440((Collection) arrayList);
                    }
                    if (c7322.f22491 == 16) {
                        c = c7322.f22497;
                        if (c == '[') {
                            i6 = c7322.f22486 + 1;
                            c7322.f22486 = i6;
                            if (i6 >= i14) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str.charAt(i6);
                            }
                            c7322.f22497 = cCharAt3;
                            c7322.f22491 = 14;
                        } else if (c == '{') {
                            i5 = c7322.f22486 + 1;
                            c7322.f22486 = i5;
                            if (i5 >= i14) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i5);
                            }
                            c7322.f22497 = cCharAt2;
                            c7322.f22491 = 12;
                        } else if (c == '\"') {
                            c7322.m19656();
                        } else {
                            c7322.m19638();
                        }
                    }
                    i2++;
                    i = 15;
                }
                c15896 = c15896;
            }
            if (c7322.f22497 == ',') {
                i4 = c7322.f22486 + 1;
                c7322.f22486 = i4;
                if (i4 >= i14) {
                    cCharAt = 26;
                } else {
                    cCharAt = str.charAt(i4);
                }
                c7322.f22497 = cCharAt;
                c7322.f22491 = 16;
            } else {
                c7322.m19638();
            }
        } else if (i13 == 12) {
            arrayList.add(interfaceC19157M51838.mo5204(c11556, type2, 0));
        } else {
            String strConcat = "exepct '[', but ".concat(C19993.m46101(i13));
            if (type != null) {
                strConcat = strConcat + ", type : " + type;
            }
            throw new C15082(strConcat);
        }
        c11556.m28444(c14216);
        Object obj2 = arrayList;
        if (z) {
            Object array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) type3, arrayList.size()));
            c0976.m3436(array);
            obj2 = array;
        }
        if (obj == null) {
            map.put(c15896.f49123, obj2);
        } else {
            mo17832(obj, obj2);
        }
    }
}
