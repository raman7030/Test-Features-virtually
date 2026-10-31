package l;

/* JADX INFO: renamed from: l.᩹ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1G7 */
/* JADX INFO: loaded from: classes.dex */
public final class C22412 implements InterfaceC0345, InterfaceC21830 {
    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public void mo3430(InterfaceC9505 interfaceC9505) {
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ܳ */
    public void mo3431() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50341(String str) {
        System.out.println(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[PHI: r3
      0x0113: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v7 int) binds: [B:105:0x0111, B:102:0x010a, B:100:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ed  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50337(int i, CharSequence charSequence) {
        int iCharCount;
        boolean z;
        boolean z2;
        int i2 = i;
        if (i2 <= 1) {
            return 0;
        }
        int i3 = -1;
        boolean z3 = false;
        while (true) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i2);
            iCharCount = i2 - Character.charCount(iCodePointBefore);
            if (iCodePointBefore <= 127) {
                if (z3) {
                    return i3;
                }
            } else if (19968 > iCodePointBefore || iCodePointBefore > 40869) {
                if (iCodePointBefore == 65533) {
                    if (z3) {
                        return i3;
                    }
                } else if (!C13835.m33198(iCodePointBefore) || iCodePointBefore == 65039) {
                    if (iCodePointBefore != 8205) {
                        if (iCodePointBefore == 8419 && iCharCount >= 1) {
                            int i4 = iCharCount - 1;
                            char cCharAt = charSequence.charAt(i4);
                            if (cCharAt == 65039 && iCharCount >= 2) {
                                int i5 = iCharCount - 2;
                                char cCharAt2 = charSequence.charAt(i5);
                                int i6 = C6075.f18642;
                                if (('0' <= cCharAt2 && cCharAt2 <= '9') || cCharAt2 == '#' || cCharAt2 == '*') {
                                    if (!z3) {
                                        return i5;
                                    }
                                }
                            } else {
                                int i7 = C6075.f18642;
                                if (('0' <= cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') {
                                    if (!z3) {
                                        return i4;
                                    }
                                }
                            }
                            return i3;
                        }
                        if (iCodePointBefore != 65039) {
                            z = false;
                        } else {
                            if (iCharCount > 0) {
                                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount);
                                int i8 = C6075.f18642;
                                if ((48 <= iCodePointBefore && iCodePointBefore <= 57) || iCodePointBefore == 35 || iCodePointBefore == 42 || C6075.m16981(iCodePointBefore)) {
                                    iCharCount -= Character.charCount(iCodePointBefore);
                                    z = true;
                                } else if (z3) {
                                }
                                return i3;
                            }
                            if (z3) {
                                return i3;
                            }
                        }
                        if (iCharCount >= 2) {
                            if (127462 <= iCodePointBefore && iCodePointBefore <= 127487) {
                                int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount);
                                if (127462 <= iCodePointBefore2 && iCodePointBefore2 <= 127487) {
                                    iCharCount -= 2;
                                }
                            } else if (iCodePointBefore == 917631) {
                                int i9 = iCharCount;
                                while (true) {
                                    int iCodePointBefore3 = Character.codePointBefore(charSequence, i9);
                                    if (917536 > iCodePointBefore3 || iCodePointBefore3 > 917630) {
                                        if (iCodePointBefore3 == 127988) {
                                            i9 -= 2;
                                            z2 = true;
                                        }
                                        if (z2) {
                                            iCharCount = i9;
                                        }
                                    } else {
                                        i9 -= 2;
                                        if (i9 < 2) {
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                        iCharCount = i9;
                                    }
                                }
                            } else if (127995 <= iCodePointBefore && iCodePointBefore <= 127999) {
                                if (C6075.m16981(Character.codePointBefore(charSequence, iCharCount))) {
                                    iCharCount -= 2;
                                    z = true;
                                }
                            } else if (C6075.m16981(iCodePointBefore)) {
                                z = true;
                            }
                        } else if (C6075.m16981(iCodePointBefore)) {
                            z = true;
                        }
                        if (z) {
                            if (iCharCount >= 3 && charSequence.charAt(iCharCount - 1) == 8205) {
                                z3 = true;
                                int i10 = iCharCount;
                                i2 = iCharCount - 1;
                                i3 = i10;
                            }
                        } else if (z3) {
                            return i3;
                        }
                        return iCharCount;
                    }
                    if (z3) {
                        return i3;
                    }
                } else if (z3) {
                    return i3;
                }
            } else if (z3) {
                return i3;
            }
        }
        return iCharCount;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC19383 mo3429(int i, int i2) {
        return new C19714();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50342(InterfaceC9167 interfaceC9167, AbstractC11347 abstractC11347) {
        int i = 0;
        AbstractC11347 abstractC11347M28087 = abstractC11347;
        while (abstractC11347M28087 != null) {
            AbstractC11347 abstractC11347M28085 = abstractC11347M28087.m28085();
            int iMo10981 = abstractC11347M28085 != null ? abstractC11347M28085.mo10981() : 0;
            AbstractC11347 abstractC11347M28093 = abstractC11347M28087.m28093();
            interfaceC9167.mo16112(abstractC11347M28087, i);
            if (abstractC11347M28085 != null && !abstractC11347M28087.m28094()) {
                if (iMo10981 == abstractC11347M28085.mo10981()) {
                    abstractC11347M28087 = abstractC11347M28085.m28087(abstractC11347M28087.m28092());
                } else if (abstractC11347M28093 == null) {
                    i--;
                    abstractC11347M28087 = abstractC11347M28085;
                } else {
                    abstractC11347M28087 = abstractC11347M28093;
                }
            }
            if (abstractC11347M28087.mo10981() > 0) {
                abstractC11347M28087 = abstractC11347M28087.m28087(0);
                i++;
            } else {
                while (abstractC11347M28087.m28093() == null && i > 0) {
                    interfaceC9167.mo16111(abstractC11347M28087, i);
                    abstractC11347M28087 = abstractC11347M28087.m28085();
                    i--;
                }
                interfaceC9167.mo16111(abstractC11347M28087, i);
                if (abstractC11347M28087 == abstractC11347) {
                    return;
                } else {
                    abstractC11347M28087 = abstractC11347M28087.m28093();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IndexOutOfBoundsException m50343(int i, int i2) {
        return new IndexOutOfBoundsException(C18307.m42646("index=", i, i2, ", length="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2808 m50338(InterfaceC16233 interfaceC16233, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC16233, "<this>");
        C11233.m27805(interfaceC11791, "completion");
        if (interfaceC16233 instanceof AbstractC2808) {
            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
        }
        InterfaceC14801 context = interfaceC11791.getContext();
        return context == C23974.f77731 ? new C21153(interfaceC16233, interfaceC11791) : new C9864(interfaceC11791, context, interfaceC16233);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b A[DONT_INVERT, EDGE_INSN: B:33:0x004b->B:105:0x0102 BREAK  A[LOOP:0: B:6:0x0007->B:109:0x010b]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00d0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50336(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        boolean zM16981;
        int iCodePointAt;
        boolean z;
        if (i >= i2 - 1) {
            return i2;
        }
        int i5 = -1;
        boolean z2 = false;
        while (true) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt > 127) {
                if (19968 <= cCharAt && cCharAt <= 40869) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (cCharAt == 65533) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (C13835.m33198(cCharAt)) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                if (cCharAt == 8205) {
                    if (z2) {
                        break;
                    }
                    return i + 1;
                }
                int iCodePointAt2 = Character.codePointAt(charSequence, i);
                int iCharCount = Character.charCount(iCodePointAt2) + i;
                int i6 = i2 - iCharCount;
                if (i6 >= 2) {
                    if (127462 <= iCodePointAt2 && iCodePointAt2 <= 127487) {
                        int iCodePointAt3 = Character.codePointAt(charSequence, iCharCount);
                        if (127462 <= iCodePointAt3 && iCodePointAt3 <= 127487) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    } else if (iCodePointAt2 == 127988) {
                        int i7 = i6;
                        int i8 = iCharCount;
                        while (true) {
                            int iCodePointAt4 = Character.codePointAt(charSequence, i8);
                            if (917536 > iCodePointAt4 || iCodePointAt4 > 917630) {
                                if (iCodePointAt4 == 917631) {
                                    i7 -= 2;
                                    i8 += 2;
                                    z = true;
                                }
                                if (z) {
                                    iCharCount = i8;
                                    i6 = i7;
                                }
                            } else {
                                i7 -= 2;
                                i8 += 2;
                                if (i7 < 2) {
                                }
                            }
                            z = false;
                            if (z) {
                                iCharCount = i8;
                                i6 = i7;
                            }
                        }
                    } else {
                        zM16981 = C6075.m16981(iCodePointAt2);
                        if (zM16981 && 127995 <= (iCodePointAt = Character.codePointAt(charSequence, iCharCount)) && iCodePointAt <= 127999) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    }
                    zM16981 = false;
                } else {
                    zM16981 = C6075.m16981(iCodePointAt2);
                }
                if (i6 >= 1 && charSequence.charAt(iCharCount) == 65039) {
                    iCharCount++;
                    i6--;
                    zM16981 = true;
                }
                if (!zM16981) {
                    if (z2) {
                        break;
                    }
                } else if (i6 >= 3 && charSequence.charAt(iCharCount) == 8205) {
                    i = iCharCount + 1;
                    z2 = true;
                    i5 = iCharCount;
                }
                return iCharCount;
            }
            int i9 = C6075.f18642;
            if ((('0' <= cCharAt && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*') && (i3 = i + 1) < i2) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 != 65039 || (i4 = i + 2) >= i2 || charSequence.charAt(i4) != 8419) {
                    if (cCharAt2 != 8419) {
                        if (!z2) {
                            break;
                        }
                        return i + 1;
                    }
                    if (z2) {
                        break;
                    }
                    return i + 2;
                }
                if (z2) {
                    break;
                }
                return i + 3;
            }
            if (!z2) {
                break;
            }
            return i + 1;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11791 m50340(InterfaceC19763 interfaceC19763, Object obj, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC19763, "<this>");
        C11233.m27805(interfaceC11791, "completion");
        if (interfaceC19763 instanceof AbstractC2808) {
            return ((AbstractC2808) interfaceC19763).mo8682(obj, interfaceC11791);
        }
        InterfaceC14801 context = interfaceC11791.getContext();
        return context == C23974.f77731 ? new C9158(interfaceC19763, obj, interfaceC11791) : new C16212(interfaceC11791, context, interfaceC19763, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11791 m50339(InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC11791, "<this>");
        AbstractC19036 abstractC19036 = interfaceC11791 instanceof AbstractC19036 ? (AbstractC19036) interfaceC11791 : null;
        return abstractC19036 != null ? abstractC19036.m43887() : interfaceC11791;
    }
}
