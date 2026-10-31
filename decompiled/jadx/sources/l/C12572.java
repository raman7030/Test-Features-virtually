package l;

/* JADX INFO: renamed from: l.۫ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4KD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12572 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f37886;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f37887;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f37888;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f37889 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37890;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final char[] f37891;

    public C12572(String str) {
        this.f37891 = str.toCharArray();
        this.f37887 = str.length();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m30815() {
        int i;
        int i2;
        int i3;
        char[] cArr;
        char c;
        do {
            i = this.f37889;
            i2 = this.f37887;
            if (i >= i2) {
                return false;
            }
            i3 = i + 1;
            this.f37889 = i3;
            cArr = this.f37891;
            c = cArr[i];
            if (c == '\n') {
                break;
            }
        } while (c != '\r');
        if (i3 >= i2) {
            return true;
        }
        char c2 = cArr[i3];
        if (c2 != '\n' && c2 != '\r') {
            return true;
        }
        this.f37889 = i + 2;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30816() {
        String string;
        while (true) {
            int i = this.f37889;
            int i2 = this.f37887;
            if (i >= i2) {
                return false;
            }
            int i3 = i + 1;
            this.f37889 = i3;
            char[] cArr = this.f37891;
            char c = cArr[i];
            if (c == '\"') {
                this.f37890 = i3;
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i4 = this.f37889;
                    string = null;
                    if (i4 >= i2) {
                        break;
                    }
                    int i5 = i4 + 1;
                    this.f37889 = i5;
                    char c2 = cArr[i4];
                    if (c2 != '\n') {
                        if (c2 == '\"') {
                            this.f37886 = i4;
                            string = sb.toString();
                            break;
                        }
                        if (c2 != '\\') {
                            sb.append(c2);
                        } else {
                            if (i5 == i2) {
                                break;
                            }
                            int i6 = i4 + 2;
                            this.f37889 = i6;
                            char c3 = cArr[i5];
                            if (c3 != '\"' && c3 != '\'') {
                                if (c3 != 'U') {
                                    if (c3 != '\\') {
                                        if (c3 == 'b') {
                                            sb.append('\b');
                                        } else if (c3 == 'f') {
                                            sb.append('\f');
                                        } else if (c3 == 'n') {
                                            sb.append('\n');
                                        } else if (c3 == 'r') {
                                            sb.append('\r');
                                        } else if (c3 == 't') {
                                            sb.append('\t');
                                        } else if (c3 != 'u') {
                                            m30815();
                                            break;
                                        }
                                    }
                                }
                                if (i2 - i6 < 4) {
                                    this.f37889 = i2;
                                    break;
                                }
                                String str = new String(cArr, i6, 4);
                                this.f37889 += 4;
                                try {
                                    sb.append((char) Integer.parseInt(str, 16));
                                } catch (NumberFormatException unused) {
                                    m30815();
                                }
                            }
                            sb.append(c3);
                        }
                    } else {
                        break;
                    }
                }
                this.f37888 = string;
                if (string != null) {
                    return true;
                }
            } else if (c != '#') {
                if (c == '\'' && i3 < i2) {
                    int i7 = i + 2;
                    this.f37889 = i7;
                    if (cArr[i3] == '\\') {
                        if (i7 != i2) {
                            this.f37889 = i + 3;
                            char c4 = cArr[i7];
                            if (c4 == 'u' || c4 == 'U') {
                                int i8 = i + 7;
                                this.f37889 = i8;
                                if (i8 > i2) {
                                    this.f37889 = i2;
                                }
                            }
                        }
                    }
                    int i9 = this.f37889;
                    if (i9 != i2) {
                        this.f37889 = i9 + 1;
                        if (cArr[i9] != '\'') {
                            m30816();
                        }
                    }
                }
            } else if (!m30815()) {
                return false;
            }
        }
    }
}
