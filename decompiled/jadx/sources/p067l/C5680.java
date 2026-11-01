package p067l;

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
public final class C5680 implements InterfaceC2746, AdapterView.OnItemClickListener, InterfaceC22825 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ C8362 f13839;

    /* JADX INFO: renamed from: ۗ */
    public C19687 f13840;

    /* JADX INFO: renamed from: ۙ */
    public C24850 f13841;

    /* JADX INFO: renamed from: ۛ */
    public String f13842;

    /* JADX INFO: renamed from: ۟ */
    public String f13843;

    /* JADX INFO: renamed from: ۤ */
    public String f13844;

    /* JADX INFO: renamed from: ۨ */
    public int f13845;

    /* JADX INFO: renamed from: ۫ */
    public String f13846;

    /* JADX INFO: renamed from: ۬ */
    public String f13847;

    /* JADX INFO: renamed from: ܰ */
    public String f13848;

    /* JADX INFO: renamed from: ᩶ */
    public int f13849;

    /* JADX INFO: renamed from: ᩸ */
    public ForegroundColorSpan f13850 = new ForegroundColorSpan(C23223.f72969);

    /* JADX INFO: renamed from: ᩹ */
    public int f13851;

    /* JADX INFO: renamed from: ᩺ */
    public String f13852;

    public C5680(C8362 c8362) {
        this.f13839 = c8362;
        C19687 c19687 = new C19687(c8362.requireContext(), 255);
        this.f13840 = c19687;
        c19687.m44715(this);
        c8362.f22377.m32405((InterfaceC22825) this);
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
    @Override // p067l.InterfaceC2746
    /* JADX INFO: renamed from: ֫ */
    public final void mo3487(ArrayList arrayList) {
        char c;
        char c2;
        String strMo28590;
        C12386 c12386;
        int i;
        int i2;
        char cCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        C8362 c8362 = this.f13839;
        c8362.f22377.m32382(arrayList);
        int iM32508 = c8362.f22377.m32508();
        int iM32512 = c8362.f22377.m32512();
        if (iM32508 > iM32512) {
            iM32512 = iM32508;
            iM32508 = iM32512;
        }
        InterfaceC9768 interfaceC9768M32500 = c8362.f22377.m32500();
        if (iM32508 != iM32512) {
            String strMo28591 = interfaceC9768M32500.mo28590(iM32508, iM32512);
            if (strMo28591.matches("L[^\\s;()]+;")) {
                this.f13849 = 0;
                this.f13847 = strMo28591;
                m12660(arrayList, iM32508, iM32512);
                return;
            }
        }
        Object objMo10027 = c8362.f22372.mo10027();
        if (objMo10027 instanceof C24850) {
            int iM53512 = C24204.m53512(iM32508, interfaceC9768M32500);
            int iM53504 = C24204.m53504(iM32508, interfaceC9768M32500);
            if (iM53504 >= iM32512) {
                String strMo28592 = interfaceC9768M32500.mo28590(iM53512, iM53504);
                C13929 c13929Matcher = C8362.f22368.matcher((CharSequence) strMo28592);
                if (c13929Matcher.matches()) {
                    this.f13849 = 3;
                    this.f13842 = c13929Matcher.group(3);
                    this.f13845 = c13929Matcher.start(3) + iM53512;
                    this.f13841 = (C24850) objMo10027;
                    m12660(arrayList, c13929Matcher.start(3) + iM53512, c13929Matcher.end(3) + iM53512);
                    return;
                }
                C13929 c13929Matcher2 = C8362.f22370.matcher((CharSequence) strMo28592);
                if (c13929Matcher2.matches()) {
                    for (int i7 = 1; i7 <= 3; i7++) {
                        int iStart = c13929Matcher2.start(i7) + iM53512;
                        int iEnd = c13929Matcher2.end(i7) + iM53512;
                        if (iStart <= iM32508 && iM32512 <= iEnd) {
                            this.f13849 = 3;
                            this.f13842 = c13929Matcher2.group(i7);
                            this.f13845 = iStart;
                            this.f13841 = (C24850) objMo10027;
                            m12660(arrayList, iStart, iEnd);
                            return;
                        }
                    }
                }
            }
        }
        char c3 = '-';
        char c4 = '>';
        if (iM32508 > 0) {
            while (true) {
                iM32508--;
                if (iM32508 < 0) {
                    break;
                }
                char cCharAt2 = interfaceC9768M32500.charAt(iM32508);
                if (" \t\n\r,(){}[]:;\"'".indexOf(cCharAt2) != -1) {
                    iM32508++;
                    break;
                }
                if (cCharAt2 == '>' && iM32508 > 0 && interfaceC9768M32500.charAt(iM32508 - 1) == '-') {
                    iM32508--;
                    break;
                }
            }
            if (iM32508 == -1) {
                iM32508 = 0;
            }
        }
        while (true) {
            c = ' ';
            if (iM32512 >= interfaceC9768M32500.length()) {
                break;
            }
            char cCharAt3 = interfaceC9768M32500.charAt(iM32512);
            if (cCharAt3 == ';') {
                iM32512++;
                break;
            }
            if (cCharAt3 == ' ' || cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '(' || cCharAt3 == ':') {
                break;
            } else {
                iM32512++;
            }
        }
        while (iM32508 < iM32512) {
            char cCharAt4 = interfaceC9768M32500.charAt(iM32508);
            if (cCharAt4 != 'F') {
                char c5 = 'L';
                if (cCharAt4 == 'L') {
                    String strMo28593 = interfaceC9768M32500.mo28590(iM32508, iM32512);
                    if (strMo28593.matches("L[^\\s;]+;")) {
                        this.f13849 = 0;
                        this.f13847 = strMo28593;
                        m12660(arrayList, iM32508, iM32512);
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
                            if (interfaceC9768M32500.charAt(iM32508) == c3 && (i6 = iM32508 + 1) < interfaceC9768M32500.length() && interfaceC9768M32500.charAt(i6) == c4) {
                                this.f13851 = iM32508 + 2;
                                c2 = 1;
                            } else {
                                this.f13851 = iM32508;
                                c2 = 0;
                            }
                            int i8 = iM32508;
                            int i9 = 0;
                            while (true) {
                                int i10 = i8 - 1;
                                if (i10 >= 0) {
                                    char cCharAt5 = interfaceC9768M32500.charAt(i10);
                                    if (c2 == 0) {
                                        if (cCharAt5 == c || cCharAt5 == '\t' || cCharAt5 == '\n' || cCharAt5 == '\r') {
                                            i8 = i10;
                                        } else if (cCharAt5 == '>' && i10 > 0) {
                                            i8 -= 2;
                                            if (interfaceC9768M32500.charAt(i8) == '-') {
                                                c2 = 1;
                                            }
                                        }
                                        c = ' ';
                                        c5 = 'L';
                                    } else if (c2 != 1) {
                                        if (c2 == 2) {
                                            if (cCharAt5 != c && cCharAt5 != '\t' && cCharAt5 != '\n' && cCharAt5 != '\r') {
                                                strMo28590 = (cCharAt5 == c5 && (i10 <= 0 || " \n\r\t,}".indexOf(interfaceC9768M32500.charAt(i8 + (-2))) != -1)) ? interfaceC9768M32500.mo28590(i10, i9) : null;
                                            }
                                            if (strMo28590 != null) {
                                                c12386 = new C12386(interfaceC9768M32500, iM32508);
                                                try {
                                                    c12386.m28502();
                                                    i = this.f13851;
                                                    c12386.m28503(":( \t\n\r");
                                                    i2 = c12386.f34610;
                                                    c12386.m28502();
                                                    if (c12386.f34610 < interfaceC9768M32500.length()) {
                                                        int i11 = c12386.f34610;
                                                        c12386.f34610 = i11 + 1;
                                                        cCharAt = interfaceC9768M32500.charAt(i11);
                                                        if (cCharAt == ':') {
                                                            c12386.m28502();
                                                            int i12 = c12386.f34610;
                                                            c12386.m28503(" \t\n\r");
                                                            int i13 = c12386.f34610;
                                                            this.f13849 = 1;
                                                            this.f13847 = strMo28590;
                                                            this.f13846 = interfaceC9768M32500.mo28590(i, i2);
                                                            this.f13844 = interfaceC9768M32500.mo28590(i12, i13);
                                                            m12660(arrayList, this.f13851, i13);
                                                            return;
                                                        }
                                                        if (cCharAt == '(') {
                                                            c12386.m28502();
                                                            i3 = c12386.f34610;
                                                            c12386.m28503(") \t\n\r");
                                                            i4 = c12386.f34610;
                                                            c12386.m28502();
                                                            if (c12386.f34610 < interfaceC9768M32500.length()) {
                                                                i5 = c12386.f34610;
                                                                c12386.f34610 = i5 + 1;
                                                                if (interfaceC9768M32500.charAt(i5) == ')') {
                                                                    c12386.m28502();
                                                                    int i14 = c12386.f34610;
                                                                    c12386.m28503(" \t\n\r");
                                                                    int i15 = c12386.f34610;
                                                                    this.f13849 = 2;
                                                                    this.f13847 = strMo28590;
                                                                    this.f13852 = interfaceC9768M32500.mo28590(i, i2);
                                                                    this.f13848 = interfaceC9768M32500.mo28590(i3, i4);
                                                                    this.f13843 = interfaceC9768M32500.mo28590(i14, i15);
                                                                    m12660(arrayList, this.f13851, i15);
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
                                if (strMo28590 != null) {
                                    c12386 = new C12386(interfaceC9768M32500, iM32508);
                                    c12386.m28502();
                                    i = this.f13851;
                                    c12386.m28503(":( \t\n\r");
                                    i2 = c12386.f34610;
                                    c12386.m28502();
                                    if (c12386.f34610 < interfaceC9768M32500.length()) {
                                        int i16 = c12386.f34610;
                                        c12386.f34610 = i16 + 1;
                                        cCharAt = interfaceC9768M32500.charAt(i16);
                                        if (cCharAt == ':') {
                                            c12386.m28502();
                                            int i17 = c12386.f34610;
                                            c12386.m28503(" \t\n\r");
                                            int i18 = c12386.f34610;
                                            this.f13849 = 1;
                                            this.f13847 = strMo28590;
                                            this.f13846 = interfaceC9768M32500.mo28590(i, i2);
                                            this.f13844 = interfaceC9768M32500.mo28590(i17, i18);
                                            m12660(arrayList, this.f13851, i18);
                                            return;
                                        }
                                        if (cCharAt == '(') {
                                            c12386.m28502();
                                            i3 = c12386.f34610;
                                            c12386.m28503(") \t\n\r");
                                            i4 = c12386.f34610;
                                            c12386.m28502();
                                            if (c12386.f34610 < interfaceC9768M32500.length()) {
                                                i5 = c12386.f34610;
                                                c12386.f34610 = i5 + 1;
                                                if (interfaceC9768M32500.charAt(i5) == ')') {
                                                    c12386.m28502();
                                                    int i19 = c12386.f34610;
                                                    c12386.m28503(" \t\n\r");
                                                    int i110 = c12386.f34610;
                                                    this.f13849 = 2;
                                                    this.f13847 = strMo28590;
                                                    this.f13852 = interfaceC9768M32500.mo28590(i, i2);
                                                    this.f13848 = interfaceC9768M32500.mo28590(i3, i4);
                                                    this.f13843 = interfaceC9768M32500.mo28590(i19, i110);
                                                    m12660(arrayList, this.f13851, i110);
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
            iM32508++;
            c3 = '-';
            c = ' ';
            c4 = '>';
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.᩶᩷ۢ] */
    /* JADX INFO: renamed from: ֫ */
    private void m12660(ArrayList arrayList, int i, int i2) {
        C8362 c8362 = this.f13839;
        C4145 c4145M32439 = c8362.f22377.m32439();
        c4145M32439.f9154 = true;
        c4145M32439.f9156 = i;
        c4145M32439.f9155 = i2;
        c8362.f22377.invalidate();
        arrayList.add(new C7021(this, new InterfaceC1489() { // from class: l.᩶᩷ۢ
            @Override // p067l.InterfaceC1489
            public final void accept(Object obj) {
                C5680.m12661(this.f68556, (C14146) obj);
            }
        }, c4145M32439));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12661(C5680 c5680, C14146 c14146) {
        C20699 c20699;
        C19687 c19687 = c5680.f13840;
        ForegroundColorSpan foregroundColorSpan = c5680.f13850;
        C8362 c8362 = c5680.f13839;
        if (c8362.f22394) {
            int i = 3;
            if (c5680.f13849 != 3) {
                String strM38720 = C17073.m38720(1, 1, c5680.f13847);
                String strM32107 = c8362.f22385.m32107(strM38720);
                if (!c8362.f22385.m32119(strM32107)) {
                    ((ActivityC18686) c8362.requireActivity()).m12257("Class not found: " + strM38720.replace('/', '.'), false);
                    return;
                }
                int i2 = c5680.f13849;
                if (i2 == 1) {
                    c20699 = new C20699(7);
                    c20699.f63914 = 0;
                    c20699.f63915 = c5680.f13846.length();
                    c20699.f63911 = c5680.f13846;
                    c20699.f63913 = c5680.f13844;
                } else if (i2 == 2) {
                    c20699 = new C20699(3);
                    c20699.f63914 = 0;
                    c20699.f63915 = c5680.f13852.length();
                    c20699.f63911 = c5680.f13852;
                    c20699.f63913 = c5680.f13843;
                    c20699.f63909 = c5680.f13848;
                } else {
                    c20699 = null;
                }
                ((ActivityC18686) c8362.requireActivity()).m42588(strM32107, c20699);
                c8362.f22385.m32087(strM32107);
                return;
            }
            int iM54587 = c5680.f13841.m54587();
            int iM54583 = c5680.f13841.m54583();
            ArrayList arrayList = new ArrayList();
            String strMo28590 = c14146.m32500().mo28590(iM54587, iM54583);
            C13929 c13929Matcher = C8362.f22368.matcher((CharSequence) strMo28590);
            while (c13929Matcher.find()) {
                if (c5680.f13842.equals(c13929Matcher.group(i))) {
                    String strTrim = c13929Matcher.group().trim();
                    int iStart = c13929Matcher.start(i) + iM54587;
                    C15067 c15067 = new C15067("[" + (c14146.m32484(iStart) + 1) + "]  " + strTrim);
                    c15067.m34473(iStart);
                    if (iStart == c5680.f13845) {
                        c15067.setSpan(foregroundColorSpan, 0, c15067.length(), 17);
                    }
                    arrayList.add(c15067);
                    i = 3;
                }
            }
            C13929 c13929Matcher2 = C8362.f22370.matcher((CharSequence) strMo28590);
            while (c13929Matcher2.find()) {
                for (int i3 = 1; i3 <= 3; i3++) {
                    if (c5680.f13842.equals(c13929Matcher2.group(i3))) {
                        String strTrim2 = c13929Matcher2.group().trim();
                        if (strTrim2.length() > 200) {
                            strTrim2 = C8597.m20011(200, strTrim2);
                        }
                        int iStart2 = c13929Matcher2.start(i3) + iM54587;
                        C15067 c15068 = new C15067("[" + (c14146.m32484(iStart2) + 1) + "]  " + strTrim2);
                        c15068.m34473(iStart2);
                        if (iStart2 == c5680.f13845) {
                            c15068.setSpan(foregroundColorSpan, 0, c15068.length(), 17);
                        }
                        int iIndexOf = c13929Matcher2.group().indexOf(46) - TextUtils.indexOf((CharSequence) c15068, '.');
                        int iStart3 = (c13929Matcher2.start(i3) - c13929Matcher2.start()) - iIndexOf;
                        int iEnd = (c13929Matcher2.end(i3) - c13929Matcher2.start()) - iIndexOf;
                        if (iEnd <= c15068.length()) {
                            c15068.setSpan(new StyleSpan(1), iStart3, iEnd, 17);
                        }
                        arrayList.add(c15068);
                    }
                }
            }
            Collections.sort(arrayList);
            c19687.m44716(arrayList);
            c19687.m44718(c14146, c14146.m32508());
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C19687 c19687 = this.f13840;
        C15067 c15067 = (C15067) c19687.m44713(i);
        C8362 c8362 = this.f13839;
        c8362.f22377.m32580();
        c8362.f22377.mo27941(c15067.m34472());
        c8362.f22377.m32494(false);
        c19687.m44714();
    }

    @Override // p067l.InterfaceC22825
    /* JADX INFO: renamed from: ֫ */
    public final void mo3486() {
        this.f13840.m44714();
    }
}
