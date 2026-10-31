package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6PC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8213 extends AbstractC23747 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Map f25291;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25292;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f25293;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25294;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25295;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25296;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f25297;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f25298;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25299;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f25300;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25301;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f25302;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f25303;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f25304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f25305;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25306;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f25307;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25308;

    static {
        HashMap map = new HashMap();
        map.put("f'", 1);
        map.put("rf'", 3);
        C15942.m37720(map, "fr'", 3, 5, "f\"");
        map.put("rf\"", 7);
        map.put("fr\"", 7);
        map.put("f'''", 9);
        map.put("rf'''", 11);
        C15942.m37720(map, "fr'''", 11, 13, "f\"\"\"");
        map.put("rf\"\"\"", 15);
        map.put("fr\"\"\"", 15);
        map.put("t'", 2);
        map.put("rt'", 4);
        C15942.m37720(map, "tr'", 4, 6, "t\"");
        map.put("rt\"", 8);
        map.put("tr\"", 8);
        map.put("t'''", 10);
        map.put("rt'''", 12);
        C15942.m37720(map, "tr'''", 12, 14, "t\"\"\"");
        map.put("rt\"\"\"", 16);
        map.put("tr\"\"\"", 16);
        f25291 = C20195.unmodifiableMap(map);
    }

    public AbstractC8213(InterfaceC23125 interfaceC23125) {
        super(interfaceC23125);
        this.f25298 = "";
        this.f25306 = new ArrayDeque();
        this.f25299 = new ArrayDeque();
        this.f25297 = 0;
        this.f25295 = 0;
        this.f25302 = 0;
        this.f25301 = new ArrayDeque();
        this.f25292 = new ArrayDeque();
        this.f25305 = "";
        this.f25304 = 0;
        this.f25296 = 0;
        this.f25294 = new ArrayDeque();
        this.f25300 = false;
        this.f25308 = false;
        this.f25303 = false;
        this.f25293 = null;
        this.f25307 = null;
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        int i = this.f25297;
        ArrayDeque arrayDeque = this.f25299;
        if (i != -1) {
            m21749();
            ArrayDeque arrayDeque2 = this.f25306;
            if (arrayDeque2.isEmpty()) {
                arrayDeque2.push(0);
                if (this.f25293.getType() == 11) {
                    m21749();
                }
                String str = this.f25298;
                if (!str.isEmpty()) {
                    C13952 c13952 = new C13952(this.f76882, 1, 1, 0, 0);
                    c13952.m33390(str);
                    c13952.m33393(0);
                    c13952.m33391(-1);
                    m21741(c13952);
                }
                while (this.f25293.getType() != -1) {
                    if (this.f25293.mo2050() == 0) {
                        if (this.f25293.getType() != 102) {
                            if (this.f25297 != 104 || m21743(((InterfaceC0463) arrayDeque.peekLast()).getText()) == 0) {
                                break;
                                break;
                            }
                            m21746("first statement indented");
                            m21739(2, " ERROR: first statement indented", this.f25293);
                            break;
                        }
                        C13952 c13953 = new C13952(this.f25293);
                        c13953.m33389(1);
                        m21741(c13953);
                    } else {
                        m21741(this.f25293);
                    }
                    m21749();
                }
            }
            int type = this.f25293.getType();
            ArrayDeque arrayDeque3 = this.f25294;
            if (type == -1) {
                int i2 = this.f25295;
                if (i2 > 0) {
                    if (i2 != 3 && i2 != 102) {
                        m21739(IShizukuService.Stub.TRANSACTION_attachUserService, (String) null, this.f25307);
                    }
                    m21745(0);
                }
                m21741(this.f25293);
            } else if (type == 6 || type == 9) {
                String text = this.f25293.getText();
                if (text.length() >= 2) {
                    text = text.substring(text.length() - 2);
                }
                text.getClass();
                if (text.equals("{{")) {
                    m21744(14, 1, "{");
                } else if (text.equals("}}")) {
                    m21744(17, 1, l.d);
                }
                m21741(this.f25293);
            } else if (type == 58) {
                if (!arrayDeque3.isEmpty() && ((Integer) this.f25301.peek()).intValue() == 0) {
                    C13952 c13954 = new C13952(this.f25293);
                    c13954.m33396(19);
                    c13954.m33390(":");
                    c13954.m33394(c13954.mo2054());
                    this.f25293 = c13954;
                    int type2 = this.f25307.getType();
                    if (type2 == 6 || type2 == 9) {
                        C13952 c13955 = new C13952(this.f25307);
                        c13955.m33390("=" + c13955.getText());
                        c13955.m33395(c13955.mo2054() - 1);
                        c13955.m33391(c13955.mo2049() - 1);
                        this.f25307 = c13955;
                    } else {
                        m21741(this.f25293);
                        m21738(this.f25304, 0, "=");
                    }
                }
                m21741(this.f25293);
            } else if (type != 102) {
                if (type != 106) {
                    switch (type) {
                        case 12:
                        case 13:
                        case 14:
                            this.f25302++;
                            m21741(this.f25293);
                            break;
                        case 15:
                        case 16:
                        case 17:
                            this.f25302--;
                            m21741(this.f25293);
                            break;
                        default:
                            m21741(this.f25293);
                            break;
                    }
                } else {
                    m21746("token recognition error at: '" + this.f25293.getText() + "'");
                    m21741(this.f25293);
                }
            } else if (!arrayDeque3.isEmpty()) {
                m21741(this.f25293);
            } else if (this.f25302 <= 0) {
                InterfaceC0463 c13956 = new C13952(this.f25293);
                boolean z = this.f25307.getType() == 104;
                if (z) {
                    m21749();
                }
                int type3 = this.f25307.getType();
                if (type3 != 102 && type3 != 103) {
                    m21741(c13956);
                    if (z) {
                        int iM21743 = this.f25307.getType() == -1 ? 0 : m21743(this.f25293.getText());
                        if (iM21743 != -1) {
                            m21741(this.f25293);
                            m21745(iM21743);
                        } else {
                            m21746("inconsistent use of tabs and spaces in indentation");
                            m21739(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent use of tabs and spaces in indentation"), this.f25307);
                        }
                    } else {
                        m21745(0);
                    }
                } else {
                    C13952 c13957 = new C13952(c13956);
                    c13957.m33389(1);
                    m21741(c13957);
                    if (z) {
                        m21741(this.f25293);
                    }
                }
            } else {
                C13952 c13958 = new C13952(this.f25293);
                c13958.m33389(1);
                m21741(c13958);
            }
            if (!arrayDeque3.isEmpty() && this.f25307.getType() == 17) {
                int type4 = this.f25293.getType();
                if (type4 == 17) {
                    String str2 = this.f25305;
                    C2569 c2569 = ((C9625) this).f29175;
                    C9625 c9625 = new C9625(new C3980(new C11837(str2, new RunnableC6802(c2569)), c2569), c2569);
                    c9625.m43458();
                    C8919 c8919 = new C8919(c9625, c2569);
                    C15973 c15973 = new C15973(c8919, c2569);
                    c15973.m43458();
                    c15973.m4188();
                    if (c15973.m24574() != 0) {
                        c8919.mo6201(0);
                        C15973 c15974 = new C15973(c8919, c2569);
                        c15974.m43458();
                        c15974.m4290();
                        if (c15974.m24574() != 0) {
                            m21739(this.f25304, "", this.f25307);
                        }
                    }
                } else if (type4 == 19) {
                    m21739(this.f25304, "", this.f25307);
                }
            }
        }
        return (InterfaceC0463) arrayDeque.pollFirst();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21747(int i) {
        this.f76889.m41111(this.f76881);
        this.f76881 = i;
        this.f25294.push(Integer.valueOf(this.f25296));
        this.f25296 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m21749() {
        InterfaceC0463 interfaceC0463NextToken;
        int type;
        ArrayDeque arrayDeque;
        InterfaceC0463 interfaceC0463NextToken2 = this.f25307;
        if (interfaceC0463NextToken2 == null) {
            interfaceC0463NextToken2 = super.nextToken();
        }
        this.f25293 = interfaceC0463NextToken2;
        int type2 = interfaceC0463NextToken2.getType();
        ArrayDeque arrayDeque2 = this.f25294;
        if (type2 != -1) {
            if (type2 != 106) {
                switch (type2) {
                    case 5:
                        this.f25304 = 6;
                        m21737();
                        break;
                    case 6:
                    case 9:
                        String text = this.f25293.getText();
                        if (text.length() >= 2) {
                            text = text.substring(text.length() - 2);
                        }
                        text.getClass();
                        switch (text) {
                            case ""{":
                            case "'{":
                            case "\{":
                                m21744(14, 0, "{");
                                break;
                        }
                        int type3 = this.f25293.getType();
                        if (type3 != 6 && type3 != 9) {
                            type = this.f25293.getType();
                            arrayDeque = this.f25301;
                            if (type == 19 && type != 58) {
                                if (type == 102) {
                                    m21740(this.f25293.getText());
                                    C13952 c13952 = new C13952(this.f25293);
                                    c13952.m33389(1);
                                    this.f25293 = c13952;
                                    break;
                                } else {
                                    switch (type) {
                                        case 12:
                                        case 13:
                                            m21740(this.f25293.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() + 1));
                                            break;
                                        case 14:
                                            this.f25292.push("{");
                                            arrayDeque.push(0);
                                            m21747(0);
                                            break;
                                        case 15:
                                        case 16:
                                            m21740(this.f25293.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() - 1));
                                            break;
                                        case 17:
                                            int i = this.f25296;
                                            if (i == 0) {
                                                m21748();
                                                m21742();
                                                break;
                                            } else {
                                                switch (i) {
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                        m21748();
                                                        m21748();
                                                        m21742();
                                                        break;
                                                    default:
                                                        m21746("f-string: single '}' is not allowed");
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            m21740(this.f25293.getText());
                                            break;
                                    }
                                }
                            } else {
                                m21740(this.f25293.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m21747(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m21747(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m21747(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m21747(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m21747(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m21747(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m21747(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m21747(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m21747(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m21747(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m21747(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m21747(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m21747(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m21747(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m21747(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m21747(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                    case 10:
                        m21748();
                        break;
                    case 8:
                        this.f25304 = 9;
                        m21737();
                        break;
                    default:
                        if (!arrayDeque2.isEmpty()) {
                            type = this.f25293.getType();
                            arrayDeque = this.f25301;
                            if (type == 19) {
                                m21740(this.f25293.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m21747(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m21747(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m21747(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m21747(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m21747(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m21747(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m21747(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m21747(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m21747(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m21747(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m21747(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m21747(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m21747(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m21747(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m21747(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m21747(32);
                                            break;
                                    }
                                }
                            } else {
                                m21740(this.f25293.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m21747(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m21747(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m21747(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m21747(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m21747(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m21747(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m21747(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m21747(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m21747(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m21747(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m21747(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m21747(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m21747(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m21747(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m21747(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m21747(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } else if (!arrayDeque2.isEmpty()) {
            m21746("unterminated interpolated string literal");
        }
        if (this.f25293.getType() == -1) {
            interfaceC0463NextToken = this.f25293;
        } else {
            interfaceC0463NextToken = super.nextToken();
        }
        this.f25307 = interfaceC0463NextToken;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21745(int i) {
        int iIntValue = ((Integer) this.f25306.peek()).intValue();
        if (i > iIntValue) {
            m21739(2, (String) null, this.f25307);
            this.f25306.push(Integer.valueOf(i));
            return;
        }
        while (i < iIntValue) {
            this.f25306.pop();
            iIntValue = ((Integer) this.f25306.peek()).intValue();
            if (i <= iIntValue) {
                m21739(3, (String) null, this.f25307);
            } else {
                m21746("inconsistent dedent");
                m21739(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent dedent"), this.f25307);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m21743(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '\t') {
                this.f25308 = true;
                i += 8 - (i % 8);
            } else if (c == '\f') {
                i = 0;
            } else if (c == ' ') {
                this.f25300 = true;
                i++;
            }
        }
        if (!this.f25308 || !this.f25300 || this.f25303) {
            return i;
        }
        this.f25303 = true;
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21740(String str) {
        this.f25292.push(((String) this.f25292.pop()) + str);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m21737() {
        Integer num = (Integer) f25291.get(this.f25293.getText().toLowerCase());
        if (num != null) {
            m21747(num.intValue());
            return;
        }
        m21746("internal error: unknown interpolated string literal prefix: " + this.f25293.getText());
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m21742() {
        this.f25301.pop();
        this.f25305 = C16014.m37867((String) this.f25292.pop(), l.d);
        if (this.f25292.isEmpty()) {
            return;
        }
        StringBuilder sbM15339 = C5368.m15339((String) this.f25292.pop());
        sbM15339.append(this.f25305);
        this.f25292.push(sbM15339.toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21744(int i, int i2, String str) {
        String strM36561 = C15472.m36561(1, 0, this.f25293.getText());
        C13952 c13952 = new C13952(this.f25293);
        c13952.m33390(strM36561);
        c13952.m33394(c13952.mo2053() - 1);
        m21741(c13952);
        m21738(i, i2, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21738(int i, int i2, String str) {
        C13952 c13952 = new C13952(this.f25293);
        c13952.m33396(i);
        c13952.m33390(str);
        c13952.m33389(i2);
        c13952.m33391(c13952.mo2049() + 1);
        c13952.m33395(c13952.mo2054() + 1);
        c13952.m33394(c13952.mo2054());
        this.f25293 = c13952;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21748() {
        m52395();
        this.f25296 = ((Integer) this.f25294.pop()).intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21739(int i, String str, InterfaceC0463 interfaceC0463) {
        C13952 c13952 = new C13952(interfaceC0463);
        c13952.m33396(i);
        c13952.m33389(0);
        c13952.m33394(interfaceC0463.mo2054() - 1);
        if (str == null) {
            str = "<" + C1157.f4189.m36285(i) + ">";
        }
        c13952.m33390(str);
        m21741(c13952);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21741(InterfaceC0463 interfaceC0463) {
        this.f25297 = interfaceC0463.getType();
        if (interfaceC0463.mo2050() == 0) {
            this.f25295 = this.f25297;
        }
        this.f25299.addLast(interfaceC0463);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21746(String str) {
        m43461().mo1935(this, Integer.valueOf(this.f25293.getType()), this.f25293.getLine(), this.f25293.mo2049(), C20094.m46315(" LEXER ERROR: ", str), (C2581) null);
    }
}
