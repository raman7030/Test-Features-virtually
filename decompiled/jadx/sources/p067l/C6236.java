package p067l;

import android.text.SpannableString;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ۘܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 469I */
/* JADX INFO: loaded from: classes2.dex */
public final class C6236 {

    /* JADX INFO: renamed from: ֫ */
    public C18344 f15740;

    /* JADX INFO: renamed from: ۜ */
    public String f15741;

    /* JADX INFO: renamed from: ۧ */
    public String f15742;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C20318 f15747;

    /* JADX INFO: renamed from: ܿ */
    public int f15745 = 0;

    /* JADX INFO: renamed from: ܳ */
    public C25051 f15743 = new C25051();

    /* JADX INFO: renamed from: ܽ */
    public C3768 f15744 = new C3768(1);

    /* JADX INFO: renamed from: ᩳ */
    public C13259 f15746 = C13259.m30304("(-?[0-9]+(\\.[0-9]*)?)[dimps]?");

    public C6236(C20318 c20318) {
        this.f15747 = c20318;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final void m14150(C18344 c18344, String str) {
        int i;
        String lowerCase;
        C3016 c3016;
        String lowerCase2;
        int iIndexOf;
        C20318 c20318 = this.f15747;
        this.f15742 = c20318.f62757.m40200();
        boolean zEquals = c18344.equals(this.f15740);
        C25051<SpannableString> c25051 = this.f15743;
        if (!zEquals) {
            this.f15740 = c18344;
            this.f15745 = 0;
            c25051.clear();
        }
        str.getClass();
        String str2 = null;
        if (str.startsWith("@") || str.startsWith("?")) {
            int iIndexOf2 = str.indexOf(47);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15742);
            sb.append(":");
            boolean z = str.indexOf(sb.toString()) == 1;
            C3768 c3768 = this.f15744;
            if (iIndexOf2 == -1) {
                boolean zStartsWith = str.startsWith("?");
                int i2 = zStartsWith ? 1 : 2;
                if (this.f15745 != i2) {
                    this.f15745 = i2;
                    c25051.clear();
                    if (!zStartsWith || !this.f15740.f54787.equals("id")) {
                        InterfaceC11799 interfaceC11799M32841 = c20318.f62768.m32841();
                        if (interfaceC11799M32841 != null) {
                            m14149(interfaceC11799M32841, zStartsWith);
                        }
                        if (interfaceC11799M32841 == null || !interfaceC11799M32841.mo25314()) {
                            m14149(C12981.m29762(), zStartsWith);
                        }
                        c25051.sort(c3768);
                    }
                }
            } else {
                String strSubstring = z ? str.substring(this.f15742.length() + 2, iIndexOf2) : str.substring(1, iIndexOf2);
                int i3 = iIndexOf2 + 1;
                String lowerCase3 = str.substring(i3).toLowerCase();
                if (lowerCase3.isEmpty()) {
                    i3 = -1;
                }
                int i4 = z ? 3 : 4;
                if (this.f15745 == i4) {
                    if (!strSubstring.equals(this.f15741)) {
                    }
                    i = i3;
                    str2 = lowerCase3;
                } else {
                    this.f15745 = i4;
                }
                this.f15741 = strSubstring;
                c25051.clear();
                InterfaceC11799 interfaceC11799M32842 = c20318.f62768.m32841();
                if (z && (interfaceC11799M32842 == null || !interfaceC11799M32842.mo25314())) {
                    interfaceC11799M32842 = C12981.m29762();
                }
                String strM25286 = strSubstring.equals("attr") ? "?" : "@";
                if (z) {
                    strM25286 = C10965.m25286(C7470.m17248(strM25286), this.f15742, ":");
                }
                String strM53357 = C24104.m53357(strM25286, strSubstring, "/");
                int i5 = z ? 1 : 127;
                m14148(interfaceC11799M32842, i5, strM53357);
                if (z) {
                    m14148(c20318.f62768.m32841(), i5, strM53357);
                }
                c25051.sort(c3768);
                i = i3;
                str2 = lowerCase3;
            }
            lowerCase = str.toLowerCase();
            c3016 = new C3016();
            for (SpannableString spannableString : c25051) {
                spannableString.removeSpan(c20318.f62763);
                spannableString.removeSpan(c20318.f62762);
                lowerCase2 = spannableString.toString().toLowerCase();
                if (lowerCase2.startsWith(lowerCase)) {
                    c3016.m5102(spannableString, 0);
                    spannableString.setSpan(c20318.f62763, 0, lowerCase.length(), 33);
                } else if (i == -1 && (iIndexOf = lowerCase2.indexOf(str2, i)) != -1) {
                    c3016.m5102(spannableString, iIndexOf);
                    spannableString.setSpan(c20318.f62763, 0, i, 33);
                    spannableString.setSpan(c20318.f62762, iIndexOf, str2.length() + iIndexOf, 33);
                }
            }
            c20318.f62758.clear();
            c3016.m5103(c20318.f62758);
            if (c20318.f62758.size() == 1 || !((SpannableString) c20318.f62758.get(0)).toString().equals(str)) {
            }
            c20318.f62758.clear();
            return;
        }
        this.f15745 = 0;
        c25051.clear();
        C18344 c18345 = this.f15740;
        if ((c18345.f54790 & 65536) != 0) {
            for (C16332 c16332 : c18345.f54789) {
                c25051.m54984(new SpannableString(c16332.f47990));
            }
        }
        if ((this.f15740.f54790 & 8) != 0) {
            c25051.m54984(new SpannableString("true"));
            c25051.m54984(new SpannableString("false"));
        }
        if ((this.f15740.f54790 & 64) != 0) {
            C13929 c13929Matcher = this.f15746.matcher((CharSequence) str);
            if (c13929Matcher.matches()) {
                String strGroup = c13929Matcher.group(1);
                boolean zContains = this.f15740.f54787.toLowerCase().contains(TextBundle.TEXT_ENTRY);
                if (zContains) {
                    c25051.m54984(new SpannableString(C17588.m40053(strGroup, "sp")));
                }
                c25051.m54984(new SpannableString(C17588.m40053(strGroup, "dp")));
                c25051.m54984(new SpannableString(C17588.m40053(strGroup, "in")));
                c25051.m54984(new SpannableString(C17588.m40053(strGroup, "mm")));
                c25051.m54984(new SpannableString(C17588.m40053(strGroup, "pt")));
                c25051.m54984(new SpannableString(C17588.m40053(strGroup, "px")));
                if (!zContains) {
                    c25051.m54984(new SpannableString(C17588.m40053(strGroup, "sp")));
                }
            }
        }
        i = -1;
        lowerCase = str.toLowerCase();
        c3016 = new C3016();
        while (r2.hasNext()) {
            spannableString.removeSpan(c20318.f62763);
            spannableString.removeSpan(c20318.f62762);
            lowerCase2 = spannableString.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                c3016.m5102(spannableString, 0);
                spannableString.setSpan(c20318.f62763, 0, lowerCase.length(), 33);
            } else if (i == -1) {
            }
        }
        c20318.f62758.clear();
        c3016.m5103(c20318.f62758);
        if (c20318.f62758.size() == 1) {
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
    /* JADX INFO: renamed from: ֫ */
    private void m14149(InterfaceC11799 interfaceC11799, boolean z) {
        Iterator it;
        Iterator it2;
        boolean z2;
        C25051 c25051;
        byte b;
        boolean zEquals;
        C6236 c6236;
        Iterator it3 = interfaceC11799.mo23906().iterator();
        C6236 c6237 = this;
        while (it3.hasNext()) {
            InterfaceC6434 interfaceC6434 = (InterfaceC6434) it3.next();
            boolean z3 = interfaceC6434.mo14722() == 1;
            Iterator it4 = interfaceC6434.mo14714().iterator();
            while (it4.hasNext()) {
                String typeName = ((InterfaceC3080) it4.next()).getTypeName();
                C25051 c25052 = c6237.f15743;
                if (z) {
                    if (typeName.equals("attr")) {
                        if (z3) {
                            c25052.m54984(new SpannableString(C10965.m25286(new StringBuilder("?"), c6237.f15742, ":attr/")));
                        } else {
                            c25052.m54984(new SpannableString("?attr/"));
                        }
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                } else if (!typeName.equals("attr")) {
                    C18344 c18344 = c6237.f15740;
                    int i = c18344.f54790;
                    String str = c18344.f54787;
                    if (str.equals(typeName)) {
                        it = it3;
                        it2 = it4;
                        z2 = z3;
                        c25051 = c25052;
                    } else {
                        int i2 = i & 1;
                        if (i2 != 0 || i == 0) {
                            it = it3;
                            it2 = it4;
                            c25051 = c25052;
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
                                    b = C0698cb.f2569k;
                                    break;
                                case "resource":
                                    b = C0698cb.f2570l;
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
                                                    if (!str.contains(AbstractC18164.LOG_TAG)) {
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
                                    c6236 = this;
                                    sb.append(c6236.f15742);
                                    sb.append(":");
                                    sb.append(typeName);
                                    sb.append("/");
                                    c25051.m54984(new SpannableString(sb.toString()));
                                } else {
                                    c6236 = this;
                                    c25051.m54984(new SpannableString(C6988.m16053("@", typeName, "/")));
                                }
                                c6237 = c6236;
                            } else {
                                c6237 = this;
                            }
                            it3 = it;
                            it4 = it2;
                            z3 = z2;
                        } else {
                            it = it3;
                            it2 = it4;
                            z2 = z3;
                            c25051 = c25052;
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
                            c6237 = this;
                        } else {
                            if (z2) {
                                StringBuilder sb2 = new StringBuilder("@");
                                c6236 = this;
                                sb2.append(c6236.f15742);
                                sb2.append(":");
                                sb2.append(typeName);
                                sb2.append("/");
                                c25051.m54984(new SpannableString(sb2.toString()));
                            } else {
                                c6236 = this;
                                c25051.m54984(new SpannableString(C6988.m16053("@", typeName, "/")));
                            }
                            c6237 = c6236;
                        }
                        it3 = it;
                        it4 = it2;
                        z3 = z2;
                    }
                    zEquals = true;
                    if (zEquals) {
                        c6237 = this;
                    } else {
                        if (z2) {
                            StringBuilder sb3 = new StringBuilder("@");
                            c6236 = this;
                            sb3.append(c6236.f15742);
                            sb3.append(":");
                            sb3.append(typeName);
                            sb3.append("/");
                            c25051.m54984(new SpannableString(sb3.toString()));
                        } else {
                            c6236 = this;
                            c25051.m54984(new SpannableString(C6988.m16053("@", typeName, "/")));
                        }
                        c6237 = c6236;
                    }
                    it3 = it;
                    it4 = it2;
                    z3 = z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14148(InterfaceC11799 interfaceC11799, int i, String str) {
        InterfaceC22528 interfaceC22528Mo4717;
        if (interfaceC11799 == null) {
            return;
        }
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(this.f15741)) {
                        int iMo5207 = interfaceC3080.mo5207();
                        for (int i2 = 0; i2 < iMo5207; i2++) {
                            for (InterfaceC9116 interfaceC9116 : interfaceC3080.mo5201()) {
                                if (interfaceC9116.mo4718(i2) && (interfaceC22528Mo4717 = interfaceC9116.mo4717(i2)) != null) {
                                    StringBuilder sbM17248 = C7470.m17248(str);
                                    sbM17248.append(interfaceC22528Mo4717.mo31468());
                                    this.f15743.m54984(new SpannableString(sbM17248.toString()));
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
