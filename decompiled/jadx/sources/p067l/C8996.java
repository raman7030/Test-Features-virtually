package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8996 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final BufferedReader f24379;

    /* JADX INFO: renamed from: ᩹ */
    public String f24383;

    /* JADX INFO: renamed from: ᩶ */
    public int f24381 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f24380 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f24382 = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedReader bufferedReader = this.f24379;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    public C8996(BufferedReader bufferedReader) {
        this.f24379 = bufferedReader;
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m20815() {
        if (this.f24380 < this.f24383.length()) {
            return this.f24383.codePointAt(this.f24380);
        }
        return 10;
    }

    /* JADX INFO: renamed from: ֫ */
    private char m20803(int i) {
        if (this.f24380 + i < this.f24383.length()) {
            return this.f24383.charAt(this.f24380 + i);
        }
        return '\n';
    }

    /* JADX INFO: renamed from: ۖ */
    private void m20807() {
        while (this.f24380 < this.f24383.length() && C5595.m12394(m20815())) {
            m20814();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m20810(char c) {
        if (this.f24380 >= this.f24383.length()) {
            throw new C25089(this, "Expected '" + c + "'", true);
        }
        if (m20813() == c) {
            return;
        }
        throw new C25089(this, "Expected '" + c + "'", false);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m20814() {
        try {
            this.f24380 += Character.charCount(this.f24383.codePointAt(this.f24380));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C25089(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private char m20813() {
        try {
            String str = this.f24383;
            int i = this.f24380;
            this.f24380 = i + 1;
            return str.charAt(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C25089(this, "Unexpected end of line", false);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m20808() throws IOException {
        char cCharAt;
        this.f24380 = 0;
        loop0: while (true) {
            this.f24381++;
            String line = this.f24379.readLine();
            this.f24383 = line;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C5595.m12394(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        return this.f24383 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20816(C14340 c14340) throws IOException {
        C22408 c22408;
        AbstractC19054 c13020;
        Object objM20805;
        String[] strArr;
        char cCharAt;
        loop0: while (true) {
            String line = this.f24379.readLine();
            this.f24383 = line;
            this.f24381++;
            if (line == null) {
                break;
            }
            if (line != null) {
                for (int i = 0; i < line.length() && (cCharAt = line.charAt(i)) != '#'; i++) {
                    if (!C5595.m12394(cCharAt)) {
                        break loop0;
                    }
                }
            }
        }
        while (this.f24383 != null) {
            m20807();
            String strM20806 = m20806(false);
            m20807();
            if (strM20806.endsWith("package-info")) {
                m20808();
            } else {
                if (strM20806.endsWith("-") && m20803(0) == ">".charAt(0)) {
                    m20813();
                    strM20806 = C17073.m38720(1, 0, strM20806);
                } else {
                    m20807();
                    if (m20803(0) == '-' && m20803(1) == '>') {
                        m20813();
                        m20813();
                    }
                }
                m20807();
                String strM20807 = m20806(false);
                m20807();
                char c = ':';
                m20810(':');
                C24398 c24398M32938 = c14340.m32938(strM20807, strM20806);
                m20807();
                if (this.f24383.length() != this.f24380) {
                    throw new C25089(this, "Expected end of line", false);
                }
                if (m20808()) {
                    C16371 c16371 = null;
                    C16371 c16372 = null;
                    C22408 c22409 = null;
                    while (C5595.m12394(m20815())) {
                        m20807();
                        Object objM20806 = m20805();
                        if (objM20806 == null) {
                            c22408 = null;
                        } else {
                            if (!(objM20806 instanceof C22408)) {
                                throw new C25089(this, String.format("Invalid obfuscated line number range (%s).", objM20806), false);
                            }
                            m20807();
                            m20810(c);
                            c22408 = (C22408) objM20806;
                        }
                        m20807();
                        String strM20808 = m20806(true);
                        boolean z = false;
                        while (this.f24380 < this.f24383.length() && C5595.m12394(m20815())) {
                            z = z || m20815() != 65279;
                            m20814();
                        }
                        if (!z) {
                            throw new C25089(this, "Expected whitespace", true);
                        }
                        int i2 = this.f24380;
                        m20811(true);
                        while (m20803(0) == '.') {
                            m20813();
                            m20811(true);
                        }
                        String strSubstring = this.f24383.substring(i2, this.f24380);
                        HashMap map = this.f24382;
                        if (map.containsKey(strSubstring)) {
                            strSubstring = (String) map.get(strSubstring);
                        } else {
                            map.put(strSubstring, strSubstring);
                        }
                        m20807();
                        if (m20803(0) == '(') {
                            m20813();
                            m20807();
                            if (m20803(0) == ')') {
                                strArr = new String[0];
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(m20806(true));
                                m20807();
                                while (m20803(0) != ')') {
                                    m20807();
                                    m20810(',');
                                    m20807();
                                    linkedList.add(m20806(true));
                                }
                                strArr = (String[]) linkedList.toArray(new String[0]);
                            }
                            m20810(')');
                            c13020 = new C18383(strSubstring, strM20808, strArr);
                        } else {
                            c13020 = new C13020(strSubstring, strM20808);
                        }
                        m20807();
                        if (m20803(0) == ':') {
                            m20813();
                            m20807();
                            objM20805 = m20805();
                            if (objM20805 == null) {
                                throw new C25089(this, "No number follows the colon after the method signature.", false);
                            }
                        } else {
                            objM20805 = null;
                        }
                        if (c22408 == null && objM20805 != null) {
                            throw new C25089(this, "No mapping for original range " + objM20805 + ".", false);
                        }
                        m20807();
                        m20810('-');
                        m20810('>');
                        m20807();
                        int i3 = this.f24380;
                        m20811(true);
                        while (m20803(0) == '.') {
                            m20813();
                            m20811(true);
                        }
                        String strSubstring2 = this.f24383.substring(i3, this.f24380);
                        if (map.containsKey(strSubstring2)) {
                            strSubstring2 = (String) map.get(strSubstring2);
                        } else {
                            map.put(strSubstring2, strSubstring2);
                        }
                        if (c13020 instanceof C18383) {
                            c24398M32938.m53818(c22408, (C18383) c13020, objM20805, strSubstring2);
                        }
                        if (c16372 != null) {
                            boolean zEquals = c16372.f48110.f56854.equals(strSubstring2);
                            boolean zEquals2 = C12826.equals(c22409, c22408);
                            if ((!zEquals || c22409 == null || !zEquals2) && (c16371 == null || !c16371.f48111.equals(c16372.f48111))) {
                                c24398M32938.m53817(c16372);
                                c16371 = c16372;
                            }
                        }
                        c16372 = new C16371(c13020, strSubstring2);
                        if (this.f24383.length() != this.f24380) {
                            throw new C25089(this, "Expected end of line", false);
                        }
                        if (!m20808()) {
                            c22409 = c22408;
                            break;
                        } else {
                            c22409 = c22408;
                            c = ':';
                        }
                    }
                    if (c16372 != null) {
                        boolean z2 = c16371 == null || !c16371.f48111.equals(c16372.f48111);
                        if (c22409 == null || z2) {
                            c24398M32938.m53817(c16372);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m20811(boolean z) {
        boolean z2;
        if (z && m20803(0) == '<') {
            m20813();
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C21370.m48415(m20815()) && m20815() != 63) {
            throw new C25089(this, "Identifier expected", false);
        }
        m20814();
        while (true) {
            if (!C21370.m48415(m20815()) && m20815() != 63) {
                break;
            } else {
                m20814();
            }
        }
        if (z2) {
            m20810('>');
        }
        if (C21370.m48415(m20815())) {
            throw new C25089(this, "End of identifier expected (was 0x" + Integer.toHexString(m20815()) + MotionUtils.EASING_TYPE_FORMAT_END, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m20806(boolean z) {
        int i = this.f24380;
        m20811(false);
        while (m20803(0) == '.') {
            m20813();
            m20811(false);
        }
        if (z) {
            while (m20803(0) == '[') {
                m20813();
                m20810(']');
            }
        }
        String strSubstring = this.f24383.substring(i, this.f24380);
        HashMap map = this.f24382;
        if (map.containsKey(strSubstring)) {
            return (String) map.get(strSubstring);
        }
        map.put(strSubstring, strSubstring);
        return strSubstring;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m20805() {
        char cM20803 = m20803(0);
        if ('0' > cM20803 || cM20803 > '9') {
            return null;
        }
        int iM20812 = m20812();
        m20807();
        if (m20803(0) != ':') {
            return Integer.valueOf(iM20812);
        }
        m20810(':');
        m20807();
        return new C22408(iM20812, m20812());
    }

    /* JADX INFO: renamed from: ܳ */
    private int m20812() {
        char cM20803;
        char cM20804 = m20803(0);
        if ('0' > cM20804 || cM20804 > '9') {
            throw new C25089(this, "Number expected", false);
        }
        int numericValue = 0;
        do {
            numericValue = (numericValue * 10) + Character.getNumericValue(m20813());
            cM20803 = m20803(0);
            if ('0' > cM20803) {
                break;
            }
        } while (cM20803 <= '9');
        return numericValue;
    }
}
