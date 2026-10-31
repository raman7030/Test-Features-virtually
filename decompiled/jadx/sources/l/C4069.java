package l;

import android.text.SpannableString;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۘܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4069 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16809 f12926;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f12927;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f12928;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18886 f12933;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12931 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23866 f12929 = new C23866();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1473 f12930 = new C1473(1);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11459 f12932 = C11459.m28260("(-?[0-9]+(\\.[0-9]*)?)[dimps]?");

    public C4069(C18886 c18886) {
        this.f12933 = c18886;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12229(C16809 c16809, String str) {
        int i;
        String lowerCase;
        C0681 c0681;
        String lowerCase2;
        int iIndexOf;
        C18886 c18886 = this.f12933;
        this.f12928 = c18886.f59528.m38009();
        boolean zEquals = c16809.equals(this.f12926);
        C23866<SpannableString> c23866 = this.f12929;
        if (!zEquals) {
            this.f12926 = c16809;
            this.f12931 = 0;
            c23866.clear();
        }
        str.getClass();
        String str2 = null;
        if (str.startsWith("@") || str.startsWith("?")) {
            int iIndexOf2 = str.indexOf(47);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f12928);
            sb.append(":");
            boolean z = str.indexOf(sb.toString()) == 1;
            C1473 c1473 = this.f12930;
            if (iIndexOf2 == -1) {
                boolean zStartsWith = str.startsWith("?");
                int i2 = zStartsWith ? 1 : 2;
                if (this.f12931 != i2) {
                    this.f12931 = i2;
                    c23866.clear();
                    if (!zStartsWith || !this.f12926.f51605.equals("id")) {
                        InterfaceC9922 interfaceC9922M30769 = c18886.f59539.m30769();
                        if (interfaceC9922M30769 != null) {
                            m12228(interfaceC9922M30769, zStartsWith);
                        }
                        if (interfaceC9922M30769 == null || !interfaceC9922M30769.mo23369()) {
                            m12228(C11166.m27700(), zStartsWith);
                        }
                        c23866.sort(c1473);
                    }
                }
            } else {
                String strSubstring = z ? str.substring(this.f12928.length() + 2, iIndexOf2) : str.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                String lowerCase3 = str.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f12931 == i4) {
                    if (!strSubstring.equals(this.f12927)) {
                    }
                    i = i3;
                    str2 = lowerCase3;
                } else {
                    this.f12931 = i4;
                }
                this.f12927 = strSubstring;
                c23866.clear();
                InterfaceC9922 interfaceC9922M307610 = c18886.f59539.m30769();
                if (z && (interfaceC9922M307610 == null || !interfaceC9922M307610.mo23369())) {
                    interfaceC9922M307610 = C11166.m27700();
                }
                String strM23341 = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strM23341 = C9045.m23341(C5368.m15339(strM23341), this.f12928, ":");
                }
                String strM50967 = C22870.m50967(strM23341, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m12227(interfaceC9922M307610, i5, strM50967);
                if (z) {
                    m12227(c18886.f59539.m30769(), i5, strM50967);
                }
                c23866.sort(c1473);
                i = i3;
                str2 = lowerCase3;
            }
            lowerCase = str.toLowerCase();
            c0681 = new C0681();
            for (SpannableString spannableString : c23866) {
                spannableString.removeSpan(c18886.f59534);
                spannableString.removeSpan(c18886.f59533);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c0681.m2763(spannableString, 0);
                    spannableString.setSpan(c18886.f59534, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(str2, i)) != -1) {
                    c0681.m2763(spannableString, iIndexOf);
                    spannableString.setSpan(c18886.f59534, 0, i, 33);
                    spannableString.setSpan(c18886.f59533, iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
            c18886.f59529.clear();
            c0681.m2764(c18886.f59529);
            if (c18886.f59529.size() == 1 || !((SpannableString) c18886.f59529.get(0)).toString().equals(str)) {
            }
            c18886.f59529.clear();
            return;
        }
        this.f12931 = 0;
        c23866.clear();
        C16809 c168010 = this.f12926;
        if ((c168010.f51608 & 65536) != 0) {
            for (C14692 c14692 : c168010.f51607) {
                c23866.m52575(new SpannableString(c14692.f44875));
            }
        }
        if ((this.f12926.f51608 & 8) != 0) {
            c23866.m52575(new SpannableString("true"));
            c23866.m52575(new SpannableString("false"));
        }
        if ((this.f12926.f51608 & 64) != 0) {
            C12164 c12164Matcher = this.f12932.matcher((CharSequence) str);
            if (c12164Matcher.matches()) {
                String strGroup = c12164Matcher.group(1);
                boolean zContains = this.f12926.f51605.toLowerCase().contains(TextBundle.TEXT_ENTRY);
                if (zContains) {
                    c23866.m52575(new SpannableString(C16014.m37867(strGroup, "sp")));
                }
                c23866.m52575(new SpannableString(C16014.m37867(strGroup, "dp")));
                c23866.m52575(new SpannableString(C16014.m37867(strGroup, "in")));
                c23866.m52575(new SpannableString(C16014.m37867(strGroup, "mm")));
                c23866.m52575(new SpannableString(C16014.m37867(strGroup, "pt")));
                c23866.m52575(new SpannableString(C16014.m37867(strGroup, "px")));
                if (!zContains) {
                    c23866.m52575(new SpannableString(C16014.m37867(strGroup, "sp")));
                }
            }
        }
        i = -1;
        lowerCase = str.toLowerCase();
        c0681 = new C0681();
        while (r2.hasNext()) {
            spannableString.removeSpan(c18886.f59534);
            spannableString.removeSpan(c18886.f59533);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c0681.m2763(spannableString, 0);
                spannableString.setSpan(c18886.f59534, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        c18886.f59529.clear();
        c0681.m2764(c18886.f59529);
        if (c18886.f59529.size() == 1) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:143:0x021c  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:309:0x0436 A[PHI: r16 r17 r18 r22
      0x0436: PHI (r16v3 java.util.Iterator) = 
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v2 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
      (r16v4 java.util.Iterator)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r17v1 l.᩻ᩳܿ) = 
      (r17v0 l.᩻ᩳܿ)
      (r17v0 l.᩻ᩳܿ)
      (r17v0 l.᩻ᩳܿ)
      (r17v0 l.᩻ᩳܿ)
      (r17v0 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
      (r17v2 l.᩻ᩳܿ)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r18v3 boolean) = 
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v2 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
      (r18v4 boolean)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]
      0x0436: PHI (r22v4 java.util.Iterator) = 
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v3 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
      (r22v5 java.util.Iterator)
     binds: [B:166:0x0276, B:156:0x0250, B:307:0x0433, B:300:0x0420, B:231:0x0374, B:295:0x0413, B:292:0x040e, B:287:0x03fd, B:283:0x03f3, B:280:0x03ee, B:277:0x03e9, B:274:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0445  */
    /* JADX WARN: Code duplicated, block: B:315:0x0449  */
    /* JADX WARN: Code duplicated, block: B:317:0x044f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0475  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12228(InterfaceC9922 interfaceC9922, boolean z) {
        Iterator it;
        Iterator it2;
        boolean z2;
        C23866 c23866;
        byte b;
        boolean zEquals;
        C4069 c4069;
        Iterator it3 = interfaceC9922.mo21936().iterator();
        C4069 c40610 = this;
        while (it3.hasNext()) {
            InterfaceC4277 interfaceC4277 = (InterfaceC4277) it3.next();
            boolean z3 = interfaceC4277.mo12858() == 1;
            Iterator it4 = interfaceC4277.mo12850().iterator();
            while (it4.hasNext()) {
                String typeName = ((InterfaceC0748) it4.next()).getTypeName();
                C23866 c23867 = c40610.f12929;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z3) {
                            c23867.m52575(new SpannableString(C9045.m23341(new StringBuilder("?"), c40610.f12928, ":attr/")));
                        } else {
                            c23867.m52575(new SpannableString("?attr/"));
                        }
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                } else if (!typeName.equals("attr")) {
                    C16809 c16809 = c40610.f12926;
                    int i = c16809.f51608;
                    String str = c16809.f51605;
                    if (str.equals(typeName)) {
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        c23866 = c23867;
                    } else {
                        int i2 = i & 1;
                        if (i2 != 0 || i == 0) {
                            it = it3;
                            it2 = it4;
                            c23866 = c23867;
                            switch (str) {
                                case "layout_above":
                                    b = 0;
                                    break;
                                case "layout_below":
                                    b = 1;
                                    break;
                                case "labelFor":
                                    b = 2;
                                    break;
                                case "entries":
                                    b = 3;
                                    break;
                                case "bitmap":
                                    b = 4;
                                    break;
                                case "button":
                                    b = 5;
                                    break;
                                case "keyboardLayout":
                                    b = 6;
                                    break;
                                case "hand_minute":
                                    b = 7;
                                    break;
                                case "toScene":
                                    b = 8;
                                    break;
                                case "layout":
                                    b = 9;
                                    break;
                                case "entryValues":
                                    b = 10;
                                    break;
                                case "drawable":
                                    b = 11;
                                    break;
                                case "tabStripLeft":
                                    b = 12;
                                    break;
                                case "defaultValue":
                                    b = cb.k;
                                    break;
                                case "resource":
                                    b = cb.f77931l;
                                    break;
                                case "id":
                                    b = 15;
                                    break;
                                case "dial":
                                    b = 16;
                                    break;
                                case "hand_hour":
                                    b = 17;
                                    break;
                                case "fromScene":
                                    b = 18;
                                    break;
                                case "thumb":
                                    b = 19;
                                    break;
                                case "checkMark":
                                    b = 20;
                                    break;
                                case "tabStripRight":
                                    b = 21;
                                    break;
                                case "windowContentOverlay":
                                    b = 22;
                                    break;
                                case "animation":
                                    b = 23;
                                    break;
                                case "windowFrame":
                                    b = 24;
                                    break;
                                case "tickMark":
                                    b = 25;
                                    break;
                                case "interpolator":
                                    b = 26;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            z2 = z3;
                            switch (b) {
                                case 0:
                                case 1:
                                case 2:
                                case 15:
                                    zEquals = typeName.equals("id");
                                    break;
                                case 3:
                                case 10:
                                case 13:
                                    zEquals = typeName.equals("array");
                                    break;
                                case 4:
                                case 5:
                                case 7:
                                case 11:
                                case 12:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 24:
                                case 25:
                                    if (!typeName.equals("drawable") && !typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) && !typeName.equals("mipmap")) {
                                        zEquals = false;
                                        break;
                                    }
                                    break;
                                case 6:
                                    zEquals = typeName.equals("raw");
                                    break;
                                case 8:
                                case 9:
                                case 18:
                                    zEquals = typeName.equals("layout");
                                    break;
                                case 14:
                                    zEquals = typeName.equals(DocumentReader.RESERVED);
                                    break;
                                case 23:
                                case 26:
                                    if (!typeName.equals("anim") && !typeName.equals("animator")) {
                                        zEquals = false;
                                        break;
                                    }
                                    break;
                                default:
                                    if (!str.endsWith("Id") && !str.startsWith("layout_to") && !str.startsWith("layout_align")) {
                                        if (!str.equals("style") && !str.contains("Appearance") && !str.contains("Style") && !str.contains("Theme")) {
                                            if (!str.startsWith("background") && !str.startsWith("textCheckMark") && !str.startsWith("divider") && !str.startsWith("textSelectHandle") && !str.contains("Background") && !str.contains("Drawable") && !str.contains("Indicator") && !str.contains("Divider") && !str.contains("Overlay") && !str.contains("Icon") && !str.contains("Thumb") && !str.contains("Track") && !str.contains("Arrow") && !str.endsWith("Banner")) {
                                                if (!str.equals("transition")) {
                                                    if (!str.contains(AbstractC16620.LOG_TAG)) {
                                                        if (!str.contains("Layout")) {
                                                            if (!str.equals("animation") && !str.contains("Animation") && !str.contains("Animator")) {
                                                                if (str.startsWith("interpolator")) {
                                                                    if (!typeName.equals("anim") && !typeName.equals("animator") && !typeName.equals("interpolator")) {
                                                                        zEquals = false;
                                                                        break;
                                                                    }
                                                                }
                                                            } else if (!typeName.equals("anim") && !typeName.equals("animator")) {
                                                                zEquals = false;
                                                                break;
                                                            }
                                                        } else {
                                                            zEquals = typeName.equals("layout");
                                                            break;
                                                        }
                                                    } else {
                                                        zEquals = typeName.equals(DocumentReader.RESERVED);
                                                        break;
                                                    }
                                                } else {
                                                    zEquals = typeName.equals("transition");
                                                    break;
                                                }
                                            } else if (!typeName.equals("drawable") && !typeName.equals(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) && !typeName.equals("mipmap")) {
                                                zEquals = false;
                                                break;
                                            }
                                        } else {
                                            zEquals = typeName.equals("style");
                                            break;
                                        }
                                    } else {
                                        zEquals = typeName.equals("id");
                                        break;
                                    }
                                    break;
                            }
                            if (zEquals) {
                                if (z2) {
                                    StringBuilder sb = new StringBuilder("@");
                                    c4069 = this;
                                    sb.append(c4069.f12928);
                                    sb.append(":");
                                    sb.append(typeName);
                                    sb.append("/");
                                    c23866.m52575(new SpannableString(sb.toString()));
                                } else {
                                    c4069 = this;
                                    c23866.m52575(new SpannableString(C4860.m14172("@", typeName, "/")));
                                }
                                c40610 = c4069;
                            } else {
                                c40610 = this;
                            }
                            it3 = it;
                            it4 = it2;
                            z3 = z2;
                        } else {
                            it = it3;
                            it2 = it4;
                            z2 = z3;
                            c23866 = c23867;
                        }
                        switch (typeName) {
                            case "fraction":
                                if ((i & 128) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "string":
                                if ((i & 2) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "raw":
                                zEquals = str.equals("keyboardLayout");
                                break;
                            case "xml":
                                zEquals = str.equals("resource");
                                break;
                            case "bool":
                                if ((i & 8) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "menu":
                                zEquals = str.contains("menu");
                                break;
                            case "color":
                                if ((i & 16) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "dimen":
                                if ((i & 64) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            case "integer":
                                if ((i & 4) == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                            default:
                                if (i2 == 0) {
                                    zEquals = false;
                                    break;
                                }
                                break;
                        }
                        if (zEquals) {
                            c40610 = this;
                        } else {
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder("@");
                                c4069 = this;
                                sb2.append(c4069.f12928);
                                sb2.append(":");
                                sb2.append(typeName);
                                sb2.append("/");
                                c23866.m52575(new SpannableString(sb2.toString()));
                            } else {
                                c4069 = this;
                                c23866.m52575(new SpannableString(C4860.m14172("@", typeName, "/")));
                            }
                            c40610 = c4069;
                        }
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                    zEquals = true;
                    if (zEquals) {
                        c40610 = this;
                    } else {
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder("@");
                            c4069 = this;
                            sb3.append(c4069.f12928);
                            sb3.append(":");
                            sb3.append(typeName);
                            sb3.append("/");
                            c23866.m52575(new SpannableString(sb3.toString()));
                        } else {
                            c4069 = this;
                            c23866.m52575(new SpannableString(C4860.m14172("@", typeName, "/")));
                        }
                        c40610 = c4069;
                    }
                    it3 = it;
                    it4 = it2;
                    z3 = z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12227(InterfaceC9922 interfaceC9922, int i, String str) {
        InterfaceC21211 interfaceC21211Mo2346;
        if (interfaceC9922 == null) {
            return;
        }
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(this.f12927)) {
                        int iMo2878 = interfaceC0748.mo2878();
                        for (int i2 = 0; i2 < iMo2878; i2++) {
                            for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2872()) {
                                if (interfaceC7099.mo2347(i2) && (interfaceC21211Mo2346 = interfaceC7099.mo2346(i2)) != null) {
                                    StringBuilder sbM15339 = C5368.m15339(str);
                                    sbM15339.append(interfaceC21211Mo2346.mo29406());
                                    this.f12929.m52575(new SpannableString(sbM15339.toString()));
                                    break;
                                }
                            }
                        }
                        return;
                    }
                }
                return;
            }
        }
    }
}
