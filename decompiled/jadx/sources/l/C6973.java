package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6973 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f21499;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f21503;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21501 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21500 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f21502 = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedReader bufferedReader = this.f21499;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    public C6973(BufferedReader bufferedReader) {
        this.f21499 = bufferedReader;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m18861() {
        if (this.f21500 < this.f21503.length()) {
            return this.f21503.codePointAt(this.f21500);
        }
        return 10;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m18849(int i) {
        if (this.f21500 + i < this.f21503.length()) {
            return this.f21503.charAt(this.f21500 + i);
        }
        return '\n';
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18853() {
        while (this.f21500 < this.f21503.length() && C3395.m10355(m18861())) {
            m18860();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18856(char c) {
        if (this.f21500 >= this.f21503.length()) {
            throw new C23906(this, "Expected '" + c + "'", true);
        }
        if (m18859() == c) {
            return;
        }
        throw new C23906(this, "Expected '" + c + "'", false);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18860() {
        try {
            this.f21500 += Character.charCount(this.f21503.codePointAt(this.f21500));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C23906(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private char m18859() {
        try {
            String str = this.f21503;
            int i = this.f21500;
            this.f21500 = i + 1;
            return str.charAt(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C23906(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m18854() throws IOException {
        char cCharAt;
        this.f21500 = 0;
        loop0: while (true) {
            this.f21501++;
            String line = this.f21499.readLine();
            this.f21503 = line;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C3395.m10355(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        return this.f21503 != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18862(C12596 c12596) throws IOException {
        C21085 c21085;
        AbstractC17556 c11207;
        Object objM18851;
        String[] strArr;
        char cCharAt;
        loop0: while (true) {
            String line = this.f21499.readLine();
            this.f21503 = line;
            this.f21501++;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C3395.m10355(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        while (this.f21503 != null) {
            m18853();
            String strM18852 = m18852(false);
            m18853();
            if (strM18852.endsWith("package-info")) {
                m18854();
            } else {
                if (strM18852.endsWith("-") && m18849(0) == ">".charAt(0)) {
                    m18859();
                    strM18852 = C15472.m36561(1, 0, strM18852);
                } else {
                    m18853();
                    if (m18849(0) == '-' && m18849(1) == '>') {
                        m18859();
                        m18859();
                    }
                }
                m18853();
                String strM18853 = m18852(false);
                m18853();
                char c = ':';
                m18856(':');
                C23179 c23179M30861 = c12596.m30861(strM18853, strM18852);
                m18853();
                if (this.f21503.length() != this.f21500) {
                    throw new C23906(this, "Expected end of line", false);
                }
                if (m18854()) {
                    C14733 c14733 = null;
                    C14733 c14734 = null;
                    C21085 c21086 = null;
                    while (C3395.m10355(m18861())) {
                        m18853();
                        Object objM18852 = m18851();
                        if (objM18852 == null) {
                            c21085 = null;
                        } else {
                            if (!(objM18852 instanceof C21085)) {
                                throw new C23906(this, String.format("Invalid obfuscated line number range (%s).", objM18852), false);
                            }
                            m18853();
                            m18856(c);
                            c21085 = (C21085) objM18852;
                        }
                        m18853();
                        String strM18854 = m18852(true);
                        boolean z = false;
                        while (this.f21500 < this.f21503.length() && C3395.m10355(m18861())) {
                            z = z || m18861() != 65279;
                            m18860();
                        }
                        if (!z) {
                            throw new C23906(this, "Expected whitespace", true);
                        }
                        int i2 = this.f21500;
                        m18857(true);
                        while (m18849(0) == '.') {
                            m18859();
                            m18857(true);
                        }
                        String strSubstring = this.f21503.substring(i2, this.f21500);
                        HashMap map = this.f21502;
                        if (map.containsKey(strSubstring)) {
                            strSubstring = (String) map.get(strSubstring);
                        } else {
                            map.put(strSubstring, strSubstring);
                        }
                        m18853();
                        if (m18849(0) == '(') {
                            m18859();
                            m18853();
                            if (m18849(0) == ')') {
                                strArr = new String[0];
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(m18852(true));
                                m18853();
                                while (m18849(0) != ')') {
                                    m18853();
                                    m18856(',');
                                    m18853();
                                    linkedList.add(m18852(true));
                                }
                                strArr = (String[]) linkedList.toArray(new String[0]);
                            }
                            m18856(')');
                            c11207 = new C16850(strSubstring, strM18854, strArr);
                        } else {
                            c11207 = new C11207(strSubstring, strM18854);
                        }
                        m18853();
                        if (m18849(0) == ':') {
                            m18859();
                            m18853();
                            objM18851 = m18851();
                            if (objM18851 == null) {
                                throw new C23906(this, "No number follows the colon after the method signature.", false);
                            }
                        } else {
                            objM18851 = null;
                        }
                        if (c21085 == null && objM18851 != null) {
                            throw new C23906(this, "No mapping for original range " + objM18851 + ".", false);
                        }
                        m18853();
                        m18856('-');
                        m18856('>');
                        m18853();
                        int i3 = this.f21500;
                        m18857(true);
                        while (m18849(0) == '.') {
                            m18859();
                            m18857(true);
                        }
                        String strSubstring2 = this.f21503.substring(i3, this.f21500);
                        if (map.containsKey(strSubstring2)) {
                            strSubstring2 = (String) map.get(strSubstring2);
                        } else {
                            map.put(strSubstring2, strSubstring2);
                        }
                        if (c11207 instanceof C16850) {
                            c23179M30861.m51422(c21085, (C16850) c11207, objM18851, strSubstring2);
                        }
                        if (c14734 != null) {
                            boolean zEquals = c14734.f44997.f53664.equals(strSubstring2);
                            boolean zEquals2 = C11003.equals(c21086, c21085);
                            if ((!zEquals || c21086 == null || !zEquals2) && (c14733 == null || !c14733.f44998.equals(c14734.f44998))) {
                                c23179M30861.m51421(c14734);
                                c14733 = c14734;
                            }
                        }
                        c14734 = new C14733(c11207, strSubstring2);
                        if (this.f21503.length() != this.f21500) {
                            throw new C23906(this, "Expected end of line", false);
                        }
                        if (!m18854()) {
                            c21086 = c21085;
                            break;
                        } else {
                            c21086 = c21085;
                            c = ':';
                        }
                    }
                    if (c14734 != null) {
                        boolean z2 = c14733 == null || !c14733.f44998.equals(c14734.f44998);
                        if (c21086 == null || z2) {
                            c23179M30861.m51421(c14734);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18857(boolean z) {
        boolean z2;
        if (z && m18849(0) == '<') {
            m18859();
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C19993.m46100(m18861()) && m18861() != 63) {
            throw new C23906(this, "Identifier expected", false);
        }
        m18860();
        while (true) {
            if (!C19993.m46100(m18861()) && m18861() != 63) {
                break;
            } else {
                m18860();
            }
        }
        if (z2) {
            m18856('>');
        }
        if (C19993.m46100(m18861())) {
            throw new C23906(this, "End of identifier expected (was 0x" + Integer.toHexString(m18861()) + MotionUtils.EASING_TYPE_FORMAT_END, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m18852(boolean z) {
        int i = this.f21500;
        m18857(false);
        while (m18849(0) == '.') {
            m18859();
            m18857(false);
        }
        if (z) {
            while (m18849(0) == '[') {
                m18859();
                m18856(']');
            }
        }
        String strSubstring = this.f21503.substring(i, this.f21500);
        HashMap map = this.f21502;
        if (map.containsKey(strSubstring)) {
            return (String) map.get(strSubstring);
        }
        map.put(strSubstring, strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m18851() {
        char cM18849 = m18849(0);
        if ('0' > cM18849 || cM18849 > '9') {
            return null;
        }
        int iM18858 = m18858();
        m18853();
        if (m18849(0) != ':') {
            return Integer.valueOf(iM18858);
        }
        m18856(':');
        m18853();
        return new C21085(iM18858, m18858());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m18858() {
        char cM18849;
        char cM188410 = m18849(0);
        if ('0' > cM188410 || cM188410 > '9') {
            throw new C23906(this, "Number expected", false);
        }
        int numericValue = 0;
        do {
            numericValue = (numericValue * 10) + Character.getNumericValue(m18859());
            cM18849 = m18849(0);
            if ('0' > cM18849) {
                break;
            }
        } while (cM18849 <= '9');
        return numericValue;
    }
}
