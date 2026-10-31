package l;

import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۗ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3484 implements InterfaceC0397, AdapterView.OnItemClickListener, InterfaceC21524 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f11034;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18222 f11035;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23655 f11036;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f11037;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f11038;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f11039;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11040;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f11041;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f11042;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f11043;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11044;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f11045 = new ForegroundColorSpan(C21943.f70257);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f11046;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f11047;

    public C3484(C6306 c6306) {
        this.f11034 = c6306;
        C18222 c18222 = new C18222(c6306.requireContext(), 255);
        this.f11035 = c18222;
        c18222.m42454(this);
        c6306.f19506.m30341((InterfaceC21524) this);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e5 A[Catch: EOFException -> 0x028f, TRY_LEAVE, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01f5 A[Catch: EOFException -> 0x028f, TRY_ENTER, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0215  */
    /* JADX WARN: Code duplicated, block: B:133:0x0219 A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0230 A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:137:0x023e A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:141:0x026a A[Catch: EOFException -> 0x028f, TryCatch #0 {EOFException -> 0x028f, blocks: (B:124:0x01ce, B:126:0x01e5, B:129:0x01f5, B:133:0x0219, B:135:0x0230, B:137:0x023e, B:139:0x0264, B:140:0x0269, B:141:0x026a, B:142:0x026f), top: B:150:0x01ce }] */
    /* JADX WARN: Code duplicated, block: B:148:0x028f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    @Override // l.InterfaceC0397
    /* JADX INFO: renamed from: ֫ */
    public final void mo1091(ArrayList arrayList) {
        char c;
        char c2;
        String strMo26557;
        C10540 c10540;
        int i;
        int i2;
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        C6306 c6306 = this.f11034;
        c6306.f19506.m30318(arrayList);
        int iM30444 = c6306.f19506.m30444();
        int iM30448 = c6306.f19506.m30448();
        if (iM30444 > iM30448) {
            iM30448 = iM30444;
            iM30444 = iM30448;
        }
        InterfaceC7785 interfaceC7785M30436 = c6306.f19506.m30436();
        if (iM30444 != iM30448) {
            String strMo26558 = interfaceC7785M30436.mo26557(iM30444, iM30448);
            if (strMo26558.matches("L[^\\s;()]+;")) {
                this.f11044 = 0;
                this.f11042 = strMo26558;
                m10665(arrayList, iM30444, iM30448);
                return;
            }
        }
        Object objMo7979 = c6306.f19501.mo7979();
        if (objMo7979 instanceof C23655) {
            int iM51120 = C22975.m51120(iM30444, interfaceC7785M30436);
            int iM51112 = C22975.m51112(iM30444, interfaceC7785M30436);
            if (iM51112 >= iM30448) {
                String strMo26559 = interfaceC7785M30436.mo26557(iM51120, iM51112);
                C12164 c12164Matcher = C6306.f19497.matcher((CharSequence) strMo26559);
                if (c12164Matcher.matches()) {
                    this.f11044 = 3;
                    this.f11037 = c12164Matcher.group(3);
                    this.f11040 = c12164Matcher.start(3) + iM51120;
                    this.f11036 = (C23655) objMo7979;
                    m10665(arrayList, c12164Matcher.start(3) + iM51120, c12164Matcher.end(3) + iM51120);
                    return;
                }
                C12164 c12164Matcher2 = C6306.f19499.matcher((CharSequence) strMo26559);
                if (c12164Matcher2.matches()) {
                    for (int i7 = 1; i7 <= 3; i7++) {
                        int iStart = c12164Matcher2.start(i7) + iM51120;
                        int iEnd = c12164Matcher2.end(i7) + iM51120;
                        if (iStart <= iM30444 && iM30448 <= iEnd) {
                            this.f11044 = 3;
                            this.f11037 = c12164Matcher2.group(i7);
                            this.f11040 = iStart;
                            this.f11036 = (C23655) objMo7979;
                            m10665(arrayList, iStart, iEnd);
                            return;
                        }
                    }
                }
            }
        }
        char c3 = '-';
        char c4 = '>';
        if (iM30444 > 0) {
            while (true) {
                iM30444--;
                if (iM30444 < 0) {
                    break;
                }
                char cCharAt2 = interfaceC7785M30436.charAt(iM30444);
                if (" \t\n\r,(){}[]:;\"'".indexOf(cCharAt2) != -1) {
                    iM30444++;
                    break;
                }
                if (cCharAt2 == '>' && iM30444 > 0 && interfaceC7785M30436.charAt(iM30444 - 1) == '-') {
                    iM30444--;
                    break;
                }
            }
            if (iM30444 == -1) {
                iM30444 = 0;
            }
        }
        while (true) {
            c = ' ';
            if (iM30448 >= interfaceC7785M30436.length()) {
                break;
            }
            char cCharAt3 = interfaceC7785M30436.charAt(iM30448);
            if (cCharAt3 == ';') {
                iM30448++;
                break;
            }
            if (cCharAt3 == ' ' || cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '(' || cCharAt3 == ':') {
                break;
            } else {
                iM30448++;
            }
        }
        while (iM30444 < iM30448) {
            char cCharAt4 = interfaceC7785M30436.charAt(iM30444);
            if (cCharAt4 != 'F') {
                char c5 = 'L';
                if (cCharAt4 == 'L') {
                    String strMo265510 = interfaceC7785M30436.mo26557(iM30444, iM30448);
                    if (strMo265510.matches("L[^\\s;]+;")) {
                        this.f11044 = 0;
                        this.f11042 = strMo265510;
                        m10665(arrayList, iM30444, iM30448);
                        return;
                    }
                    return;
                }
                if (cCharAt4 != 'S' && cCharAt4 != 'V' && cCharAt4 != 'Z' && cCharAt4 != 'I' && cCharAt4 != 'J') {
                    switch (cCharAt4) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            if (interfaceC7785M30436.charAt(iM30444) == c3 && (i6 = iM30444 + 1) < interfaceC7785M30436.length() && interfaceC7785M30436.charAt(i6) == c4) {
                                this.f11046 = iM30444 + 2;
                                c2 = 1;
                            } else {
                                this.f11046 = iM30444;
                                c2 = 0;
                            }
                            int i8 = iM30444;
                            int i9 = 0;
                            while (true) {
                                int i10 = i8 - 1;
                                if (i10 >= 0) {
                                    char cCharAt5 = interfaceC7785M30436.charAt(i10);
                                    if (c2 == 0) {
                                        if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                            i8 = i10;
                                        } else if (cCharAt5 == '>' && i10 > 0) {
                                            i8 -= 2;
                                            if (interfaceC7785M30436.charAt(i8) == '-') {
                                                c2 = 1;
                                            }
                                        }
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (c2 != 1) {
                                        if (c2 == 2) {
                                            if (cCharAt5 != c && cCharAt5 != '\t' && cCharAt5 != '\n' && cCharAt5 != '\r') {
                                                strMo26557 = (cCharAt5 == c5 && (i10 <= 0 || " \n\r\t,}".indexOf(interfaceC7785M30436.charAt(i8 + (-2))) != -1)) ? interfaceC7785M30436.mo26557(i10, i9) : null;
                                            }
                                            if (strMo26557 != null) {
                                                c10540 = new C10540(interfaceC7785M30436, iM30444);
                                                try {
                                                    c10540.m26469();
                                                    i = this.f11046;
                                                    c10540.m26470(":( \t\n\r");
                                                    i2 = c10540.f31646;
                                                    c10540.m26469();
                                                    if (c10540.f31646 < interfaceC7785M30436.length()) {
                                                        int i11 = c10540.f31646;
                                                        c10540.f31646 = i11 + 1;
                                                        cCharAt = interfaceC7785M30436.charAt(i11);
                                                        if (cCharAt == ':') {
                                                            c10540.m26469();
                                                            int i12 = c10540.f31646;
                                                            c10540.m26470(" \t\n\r");
                                                            int i13 = c10540.f31646;
                                                            this.f11044 = 1;
                                                            this.f11042 = strMo26557;
                                                            this.f11041 = interfaceC7785M30436.mo26557(i, i2);
                                                            this.f11039 = interfaceC7785M30436.mo26557(i12, i13);
                                                            m10665(arrayList, this.f11046, i13);
                                                            return;
                                                        }
                                                        if (cCharAt == '(') {
                                                            c10540.m26469();
                                                            i3 = c10540.f31646;
                                                            c10540.m26470(") \t\n\r");
                                                            i4 = c10540.f31646;
                                                            c10540.m26469();
                                                            if (c10540.f31646 < interfaceC7785M30436.length()) {
                                                                i5 = c10540.f31646;
                                                                c10540.f31646 = i5 + 1;
                                                                if (interfaceC7785M30436.charAt(i5) == ')') {
                                                                    c10540.m26469();
                                                                    int i14 = c10540.f31646;
                                                                    c10540.m26470(" \t\n\r");
                                                                    int i15 = c10540.f31646;
                                                                    this.f11044 = 2;
                                                                    this.f11042 = strMo26557;
                                                                    this.f11047 = interfaceC7785M30436.mo26557(i, i2);
                                                                    this.f11043 = interfaceC7785M30436.mo26557(i3, i4);
                                                                    this.f11038 = interfaceC7785M30436.mo26557(i14, i15);
                                                                    m10665(arrayList, this.f11046, i15);
                                                                    return;
                                                                }
                                                            }
                                                            throw new EOFException();
                                                        }
                                                        return;
                                                    }
                                                    throw new EOFException();
                                                } catch (EOFException unused) {
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        i8 = i10;
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                        i8 = i10;
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (cCharAt5 == ';') {
                                        c2 = 2;
                                        c5 = 'L';
                                        i9 = i8;
                                        i8 = i10;
                                    }
                                }
                                if (strMo26557 != null) {
                                    c10540 = new C10540(interfaceC7785M30436, iM30444);
                                    c10540.m26469();
                                    i = this.f11046;
                                    c10540.m26470(":( \t\n\r");
                                    i2 = c10540.f31646;
                                    c10540.m26469();
                                    if (c10540.f31646 < interfaceC7785M30436.length()) {
                                        int i16 = c10540.f31646;
                                        c10540.f31646 = i16 + 1;
                                        cCharAt = interfaceC7785M30436.charAt(i16);
                                        if (cCharAt == ':') {
                                            c10540.m26469();
                                            int i17 = c10540.f31646;
                                            c10540.m26470(" \t\n\r");
                                            int i18 = c10540.f31646;
                                            this.f11044 = 1;
                                            this.f11042 = strMo26557;
                                            this.f11041 = interfaceC7785M30436.mo26557(i, i2);
                                            this.f11039 = interfaceC7785M30436.mo26557(i17, i18);
                                            m10665(arrayList, this.f11046, i18);
                                            return;
                                        }
                                        if (cCharAt == '(') {
                                            c10540.m26469();
                                            i3 = c10540.f31646;
                                            c10540.m26470(") \t\n\r");
                                            i4 = c10540.f31646;
                                            c10540.m26469();
                                            if (c10540.f31646 < interfaceC7785M30436.length()) {
                                                i5 = c10540.f31646;
                                                c10540.f31646 = i5 + 1;
                                                if (interfaceC7785M30436.charAt(i5) == ')') {
                                                    c10540.m26469();
                                                    int i19 = c10540.f31646;
                                                    c10540.m26470(" \t\n\r");
                                                    int i110 = c10540.f31646;
                                                    this.f11044 = 2;
                                                    this.f11042 = strMo26557;
                                                    this.f11047 = interfaceC7785M30436.mo26557(i, i2);
                                                    this.f11043 = interfaceC7785M30436.mo26557(i3, i4);
                                                    this.f11038 = interfaceC7785M30436.mo26557(i19, i110);
                                                    m10665(arrayList, this.f11046, i110);
                                                    return;
                                                }
                                            }
                                            throw new EOFException();
                                        }
                                        return;
                                    }
                                    throw new EOFException();
                                }
                                return;
                            }
                    }
                }
            }
            iM30444++;
            c3 = '-';
            c = ' ';
            c4 = '>';
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.᩶᩷ۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10665(ArrayList arrayList, int i, int i2) {
        C6306 c6306 = this.f11034;
        C1869 c1869M30375 = c6306.f19506.m30375();
        c1869M30375.f6373 = true;
        c1869M30375.f6375 = i;
        c1869M30375.f6374 = i2;
        c6306.f19506.invalidate();
        arrayList.add(new C4895(this, new InterfaceC13041() { // from class: l.᩶᩷ۢ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                C3484.m10666(this.f65881, (C12392) obj);
            }
        }, c1869M30375));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10666(C3484 c3484, C12392 c12392) {
        C19287 c19287;
        C18222 c18222 = c3484.f11035;
        ForegroundColorSpan foregroundColorSpan = c3484.f11045;
        C6306 c6306 = c3484.f11034;
        if (c6306.f19523) {
            int i = 3;
            if (c3484.f11044 != 3) {
                String strM36561 = C15472.m36561(1, 1, c3484.f11042);
                String strM30046 = c6306.f19514.m30046(strM36561);
                if (!c6306.f19514.m30058(strM30046)) {
                    ((ActivityC17169) c6306.requireActivity()).m10221("Class not found: " + strM36561.replace('/', '.'), false);
                    return;
                }
                int i2 = c3484.f11044;
                if (i2 == 1) {
                    c19287 = new C19287(7);
                    c19287.f60684 = 0;
                    c19287.f60685 = c3484.f11041.length();
                    c19287.f60681 = c3484.f11041;
                    c19287.f60683 = c3484.f11039;
                } else if (i2 == 2) {
                    c19287 = new C19287(3);
                    c19287.f60684 = 0;
                    c19287.f60685 = c3484.f11047.length();
                    c19287.f60681 = c3484.f11047;
                    c19287.f60683 = c3484.f11038;
                    c19287.f60679 = c3484.f11043;
                } else {
                    c19287 = null;
                }
                ((ActivityC17169) c6306.requireActivity()).m40343(strM30046, c19287);
                c6306.f19514.m30026(strM30046);
                return;
            }
            int iM52184 = c3484.f11036.m52184();
            int iM52180 = c3484.f11036.m52180();
            ArrayList arrayList = new ArrayList();
            String strMo26557 = c12392.m30436().mo26557(iM52184, iM52180);
            C12164 c12164Matcher = C6306.f19497.matcher((CharSequence) strMo26557);
            while (c12164Matcher.find()) {
                if (c3484.f11037.equals(c12164Matcher.group(i))) {
                    String strTrim = c12164Matcher.group().trim();
                    int iStart = c12164Matcher.start(i) + iM52184;
                    C13361 c13361 = new C13361("[" + (c12392.m30420(iStart) + 1) + "]  " + strTrim);
                    c13361.m32372(iStart);
                    if (iStart == c3484.f11040) {
                        c13361.setSpan(foregroundColorSpan, 0, c13361.length(), 17);
                    }
                    arrayList.add(c13361);
                    i = 3;
                }
            }
            C12164 c12164Matcher2 = C6306.f19499.matcher((CharSequence) strMo26557);
            while (c12164Matcher2.find()) {
                for (int i3 = 1; i3 <= 3; i3++) {
                    if (c3484.f11037.equals(c12164Matcher2.group(i3))) {
                        String strTrim2 = c12164Matcher2.group().trim();
                        if (strTrim2.length() > 200) {
                            strTrim2 = C6554.m18061(200, strTrim2);
                        }
                        int iStart2 = c12164Matcher2.start(i3) + iM52184;
                        C13361 c13362 = new C13361("[" + (c12392.m30420(iStart2) + 1) + "]  " + strTrim2);
                        c13362.m32372(iStart2);
                        if (iStart2 == c3484.f11040) {
                            c13362.setSpan(foregroundColorSpan, 0, c13362.length(), 17);
                        }
                        int iIndexOf = c12164Matcher2.group().indexOf(46) - TextUtils.indexOf((CharSequence) c13362, '.');
                        int iStart3 = (c12164Matcher2.start(i3) - c12164Matcher2.start()) - iIndexOf;
                        int iEnd = (c12164Matcher2.end(i3) - c12164Matcher2.start()) - iIndexOf;
                        if (iEnd <= c13362.length()) {
                            c13362.setSpan(new StyleSpan(1), iStart3, iEnd, 17);
                        }
                        arrayList.add(c13362);
                    }
                }
            }
            Collections.sort(arrayList);
            c18222.m42455(arrayList);
            c18222.m42457(c12392, c12392.m30444());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C18222 c18222 = this.f11035;
        C13361 c13361 = (C13361) c18222.m42452(i);
        C6306 c6306 = this.f11034;
        c6306.f19506.m30516();
        c6306.f19506.mo25919(c13361.m32371());
        c6306.f19506.m30430(false);
        c18222.m42453();
    }

    @Override // l.InterfaceC21524
    /* JADX INFO: renamed from: ֫ */
    public final void mo1090() {
        this.f11035.m42453();
    }
}
