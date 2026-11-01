package p067l;

/* JADX INFO: renamed from: l.᩹ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1G7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23669 implements InterfaceC2696, InterfaceC23116 {
    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public void mo5733(InterfaceC11402 interfaceC11402) {
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public void mo5734() {
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52681(String str) {
        System.out.println(str);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0113 A[PHI: r3
      0x0113: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v7 int) binds: [B:105:0x0111, B:102:0x010a, B:100:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x00ed  */
    /* JADX INFO: renamed from: ֫ */
    public static int m52677(int i, CharSequence charSequence) {
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
                } else if (!C15517.m35316(iCodePointBefore) || iCodePointBefore == 65039) {
                    if (iCodePointBefore != 8205) {
                        if (iCodePointBefore == 8419 && iCharCount >= 1) {
                            int i4 = iCharCount - 1;
                            char cCharAt = charSequence.charAt(i4);
                            if (cCharAt == 65039 && iCharCount >= 2) {
                                int i5 = iCharCount - 2;
                                char cCharAt2 = charSequence.charAt(i5);
                                int i6 = C8142.f21498;
                                if (('0' <= cCharAt2 && cCharAt2 <= '9') || cCharAt2 == '#' || cCharAt2 == '*') {
                                    if (!z3) {
                                        return i5;
                                    }
                                }
                            } else {
                                int i7 = C8142.f21498;
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
                                int i8 = C8142.f21498;
                                if ((48 <= iCodePointBefore && iCodePointBefore <= 57) || iCodePointBefore == 35 || iCodePointBefore == 42 || C8142.m18910(iCodePointBefore)) {
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
                                if (C8142.m18910(Character.codePointBefore(charSequence, iCharCount))) {
                                    iCharCount -= 2;
                                    z = true;
                                }
                            } else if (C8142.m18910(iCodePointBefore)) {
                                z = true;
                            }
                        } else if (C8142.m18910(iCodePointBefore)) {
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

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20790 mo5732(int i, int i2) {
        return new C21105();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52682(InterfaceC11081 interfaceC11081, AbstractC13152 abstractC13152) {
        int i = 0;
        AbstractC13152 abstractC13152M30131 = abstractC13152;
        while (abstractC13152M30131 != null) {
            AbstractC13152 abstractC13152M30129 = abstractC13152M30131.m30129();
            int iMo12957 = abstractC13152M30129 != null ? abstractC13152M30129.mo12957() : 0;
            AbstractC13152 abstractC13152M30137 = abstractC13152M30131.m30137();
            interfaceC11081.mo18031(abstractC13152M30131, i);
            if (abstractC13152M30129 != null && !abstractC13152M30131.m30138()) {
                if (iMo12957 == abstractC13152M30129.mo12957()) {
                    abstractC13152M30131 = abstractC13152M30129.m30131(abstractC13152M30131.m30136());
                } else if (abstractC13152M30137 == null) {
                    i--;
                    abstractC13152M30131 = abstractC13152M30129;
                } else {
                    abstractC13152M30131 = abstractC13152M30137;
                }
            }
            if (abstractC13152M30131.mo12957() > 0) {
                abstractC13152M30131 = abstractC13152M30131.m30131(0);
                i++;
            } else {
                while (abstractC13152M30131.m30137() == null && i > 0) {
                    interfaceC11081.mo18030(abstractC13152M30131, i);
                    abstractC13152M30131 = abstractC13152M30131.m30129();
                    i--;
                }
                interfaceC11081.mo18030(abstractC13152M30131, i);
                if (abstractC13152M30131 == abstractC13152) {
                    return;
                } else {
                    abstractC13152M30131 = abstractC13152M30131.m30137();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static IndexOutOfBoundsException m52683(int i, int i2) {
        return new IndexOutOfBoundsException(C19768.m44907("index=", i, i2, ", length="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5038 m52678(InterfaceC17797 interfaceC17797, InterfaceC13575 interfaceC13575) {
        C13045.m29867(interfaceC17797, "<this>");
        C13045.m29867(interfaceC13575, "completion");
        if (interfaceC17797 instanceof AbstractC5038) {
            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
        }
        InterfaceC16436 context = interfaceC13575.getContext();
        return context == C25154.f80484 ? new C22473(interfaceC17797, interfaceC13575) : new C11744(interfaceC13575, context, interfaceC17797);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b A[DONT_INVERT, EDGE_INSN: B:33:0x004b->B:105:0x0102 BREAK  A[LOOP:0: B:6:0x0007->B:109:0x010b]] */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00d0  */
    /* JADX INFO: renamed from: ֫ */
    public static int m52676(int i, int i2, CharSequence charSequence) {
        int i3;
        int i4;
        boolean zM18910;
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
                if (C15517.m35316(cCharAt)) {
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
                        zM18910 = C8142.m18910(iCodePointAt2);
                        if (zM18910 && 127995 <= (iCodePointAt = Character.codePointAt(charSequence, iCharCount)) && iCodePointAt <= 127999) {
                            iCharCount += 2;
                            i6 -= 2;
                        }
                    }
                    zM18910 = false;
                } else {
                    zM18910 = C8142.m18910(iCodePointAt2);
                }
                if (i6 >= 1 && charSequence.charAt(iCharCount) == 65039) {
                    iCharCount++;
                    i6--;
                    zM18910 = true;
                }
                if (!zM18910) {
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
            int i9 = C8142.f21498;
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
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC13575 m52680(InterfaceC21152 interfaceC21152, Object obj, InterfaceC13575 interfaceC13575) {
        C13045.m29867(interfaceC21152, "<this>");
        C13045.m29867(interfaceC13575, "completion");
        if (interfaceC21152 instanceof AbstractC5038) {
            return ((AbstractC5038) interfaceC21152).mo10743(obj, interfaceC13575);
        }
        InterfaceC16436 context = interfaceC13575.getContext();
        return context == C25154.f80484 ? new C11073(interfaceC21152, obj, interfaceC13575) : new C17777(interfaceC13575, context, interfaceC21152, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC13575 m52679(InterfaceC13575 interfaceC13575) {
        C13045.m29867(interfaceC13575, "<this>");
        AbstractC20461 abstractC20461 = interfaceC13575 instanceof AbstractC20461 ? (AbstractC20461) interfaceC13575 : null;
        return abstractC20461 != null ? abstractC20461.m46156() : interfaceC13575;
    }
}
