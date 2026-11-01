package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6PC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10174 extends AbstractC24937 {

    /* JADX INFO: renamed from: ܰ */
    public static final Map f28201;

    /* JADX INFO: renamed from: ֡ */
    public ArrayDeque f28202;

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC2808 f28203;

    /* JADX INFO: renamed from: ۗ */
    public ArrayDeque f28204;

    /* JADX INFO: renamed from: ۙ */
    public int f28205;

    /* JADX INFO: renamed from: ۚ */
    public int f28206;

    /* JADX INFO: renamed from: ۛ */
    public int f28207;

    /* JADX INFO: renamed from: ۠ */
    public String f28208;

    /* JADX INFO: renamed from: ۤ */
    public ArrayDeque f28209;

    /* JADX INFO: renamed from: ۨ */
    public boolean f28210;

    /* JADX INFO: renamed from: ۫ */
    public ArrayDeque f28211;

    /* JADX INFO: renamed from: ۬ */
    public int f28212;

    /* JADX INFO: renamed from: ܶ */
    public boolean f28213;

    /* JADX INFO: renamed from: ᩵ */
    public int f28214;

    /* JADX INFO: renamed from: ᩶ */
    public String f28215;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayDeque f28216;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC2808 f28217;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f28218;

    static {
        HashMap map = new HashMap();
        map.put("f'", 1);
        map.put("rf'", 3);
        C17520.m39895(map, "fr'", 3, 5, "f\"");
        map.put("rf\"", 7);
        map.put("fr\"", 7);
        map.put("f'''", 9);
        map.put("rf'''", 11);
        C17520.m39895(map, "fr'''", 11, 13, "f\"\"\"");
        map.put("rf\"\"\"", 15);
        map.put("fr\"\"\"", 15);
        map.put("t'", 2);
        map.put("rt'", 4);
        C17520.m39895(map, "tr'", 4, 6, "t\"");
        map.put("rt\"", 8);
        map.put("tr\"", 8);
        map.put("t'''", 10);
        map.put("rt'''", 12);
        C17520.m39895(map, "tr'''", 12, 14, "t\"\"\"");
        map.put("rt\"\"\"", 16);
        map.put("tr\"\"\"", 16);
        f28201 = C21562.unmodifiableMap(map);
    }

    public AbstractC10174(InterfaceC24346 interfaceC24346) {
        super(interfaceC24346);
        this.f28208 = "";
        this.f28216 = new ArrayDeque();
        this.f28209 = new ArrayDeque();
        this.f28207 = 0;
        this.f28205 = 0;
        this.f28212 = 0;
        this.f28211 = new ArrayDeque();
        this.f28202 = new ArrayDeque();
        this.f28215 = "";
        this.f28214 = 0;
        this.f28206 = 0;
        this.f28204 = new ArrayDeque();
        this.f28210 = false;
        this.f28218 = false;
        this.f28213 = false;
        this.f28203 = null;
        this.f28217 = null;
    }

    @Override // p067l.AbstractC24937, p067l.InterfaceC3479
    public final InterfaceC2808 nextToken() {
        int i = this.f28207;
        ArrayDeque arrayDeque = this.f28209;
        if (i != -1) {
            m23718();
            ArrayDeque arrayDeque2 = this.f28216;
            if (arrayDeque2.isEmpty()) {
                arrayDeque2.push(0);
                if (this.f28203.getType() == 11) {
                    m23718();
                }
                String str = this.f28208;
                if (!str.isEmpty()) {
                    C15628 c15628 = new C15628(this.f79634, 1, 1, 0, 0);
                    c15628.m35509(str);
                    c15628.m35512(0);
                    c15628.m35510(-1);
                    m23710(c15628);
                }
                while (this.f28203.getType() != -1) {
                    if (this.f28203.mo4430() == 0) {
                        if (this.f28203.getType() != 102) {
                            if (this.f28207 != 104 || m23712(((InterfaceC2808) arrayDeque.peekLast()).getText()) == 0) {
                                break;
                                break;
                            }
                            m23715("first statement indented");
                            m23708(2, " ERROR: first statement indented", this.f28203);
                            break;
                        }
                        C15628 c15629 = new C15628(this.f28203);
                        c15629.m35508(1);
                        m23710(c15629);
                    } else {
                        m23710(this.f28203);
                    }
                    m23718();
                }
            }
            int type = this.f28203.getType();
            ArrayDeque arrayDeque3 = this.f28204;
            if (type == -1) {
                int i2 = this.f28205;
                if (i2 > 0) {
                    if (i2 != 3 && i2 != 102) {
                        m23708(IShizukuService.Stub.TRANSACTION_attachUserService, (String) null, this.f28217);
                    }
                    m23714(0);
                }
                m23710(this.f28203);
            } else if (type == 6 || type == 9) {
                String text = this.f28203.getText();
                if (text.length() >= 2) {
                    text = text.substring(text.length() - 2);
                }
                text.getClass();
                if (text.equals("{{")) {
                    m23713(14, 1, "{");
                } else if (text.equals("}}")) {
                    m23713(17, 1, C0249l.f1198d);
                }
                m23710(this.f28203);
            } else if (type == 58) {
                if (!arrayDeque3.isEmpty() && ((Integer) this.f28211.peek()).intValue() == 0) {
                    C15628 c156210 = new C15628(this.f28203);
                    c156210.m35515(19);
                    c156210.m35509(":");
                    c156210.m35513(c156210.mo4434());
                    this.f28203 = c156210;
                    int type2 = this.f28217.getType();
                    if (type2 == 6 || type2 == 9) {
                        C15628 c156211 = new C15628(this.f28217);
                        c156211.m35509("=" + c156211.getText());
                        c156211.m35514(c156211.mo4434() - 1);
                        c156211.m35510(c156211.mo4429() - 1);
                        this.f28217 = c156211;
                    } else {
                        m23710(this.f28203);
                        m23707(this.f28214, 0, "=");
                    }
                }
                m23710(this.f28203);
            } else if (type != 102) {
                if (type != 106) {
                    switch (type) {
                        case 12:
                        case 13:
                        case 14:
                            this.f28212++;
                            m23710(this.f28203);
                            break;
                        case 15:
                        case 16:
                        case 17:
                            this.f28212--;
                            m23710(this.f28203);
                            break;
                        default:
                            m23710(this.f28203);
                            break;
                    }
                } else {
                    m23715("token recognition error at: '" + this.f28203.getText() + "'");
                    m23710(this.f28203);
                }
            } else if (!arrayDeque3.isEmpty()) {
                m23710(this.f28203);
            } else if (this.f28212 <= 0) {
                InterfaceC2808 c156212 = new C15628(this.f28203);
                boolean z = this.f28217.getType() == 104;
                if (z) {
                    m23718();
                }
                int type3 = this.f28217.getType();
                if (type3 != 102 && type3 != 103) {
                    m23710(c156212);
                    if (z) {
                        int iM23712 = this.f28217.getType() == -1 ? 0 : m23712(this.f28203.getText());
                        if (iM23712 != -1) {
                            m23710(this.f28203);
                            m23714(iM23712);
                        } else {
                            m23715("inconsistent use of tabs and spaces in indentation");
                            m23708(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent use of tabs and spaces in indentation"), this.f28217);
                        }
                    } else {
                        m23714(0);
                    }
                } else {
                    C15628 c156213 = new C15628(c156212);
                    c156213.m35508(1);
                    m23710(c156213);
                    if (z) {
                        m23710(this.f28203);
                    }
                }
            } else {
                C15628 c156214 = new C15628(this.f28203);
                c156214.m35508(1);
                m23710(c156214);
            }
            if (!arrayDeque3.isEmpty() && this.f28217.getType() == 17) {
                int type4 = this.f28203.getType();
                if (type4 == 17) {
                    String str2 = this.f28215;
                    C4810 c4810 = ((C11516) this).f32123;
                    C11516 c11516 = new C11516(new C6151(new C13618(str2, new RunnableC8833(c4810)), c4810), c4810);
                    c11516.m45727();
                    C10845 c10845 = new C10845(c11516, c4810);
                    C17549 c17549 = new C17549(c10845, c4810);
                    c17549.m45727();
                    c17549.m6432();
                    if (c17549.m26588() != 0) {
                        c10845.mo8403(0);
                        C17549 c175410 = new C17549(c10845, c4810);
                        c175410.m45727();
                        c175410.m6534();
                        if (c175410.m26588() != 0) {
                            m23708(this.f28214, "", this.f28217);
                        }
                    }
                } else if (type4 == 19) {
                    m23708(this.f28214, "", this.f28217);
                }
            }
        }
        return (InterfaceC2808) arrayDeque.pollFirst();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m23716(int i) {
        this.f79641.m43357(this.f79633);
        this.f79633 = i;
        this.f28204.push(Integer.valueOf(this.f28206));
        this.f28206 = i;
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
    /* JADX INFO: renamed from: ᩵ */
    private void m23718() {
        InterfaceC2808 interfaceC2808NextToken;
        int type;
        ArrayDeque arrayDeque;
        InterfaceC2808 interfaceC2808NextToken2 = this.f28217;
        if (interfaceC2808NextToken2 == null) {
            interfaceC2808NextToken2 = super.nextToken();
        }
        this.f28203 = interfaceC2808NextToken2;
        int type2 = interfaceC2808NextToken2.getType();
        ArrayDeque arrayDeque2 = this.f28204;
        if (type2 != -1) {
            if (type2 != 106) {
                switch (type2) {
                    case 5:
                        this.f28214 = 6;
                        m23706();
                        break;
                    case 6:
                    case 9:
                        String text = this.f28203.getText();
                        if (text.length() >= 2) {
                            text = text.substring(text.length() - 2);
                        }
                        text.getClass();
                        switch (text) {
                            case ""{":
                            case "'{":
                            case "\{":
                                m23713(14, 0, "{");
                                break;
                        }
                        int type3 = this.f28203.getType();
                        if (type3 != 6 && type3 != 9) {
                            type = this.f28203.getType();
                            arrayDeque = this.f28211;
                            if (type == 19 && type != 58) {
                                if (type == 102) {
                                    m23709(this.f28203.getText());
                                    C15628 c15628 = new C15628(this.f28203);
                                    c15628.m35508(1);
                                    this.f28203 = c15628;
                                    break;
                                } else {
                                    switch (type) {
                                        case 12:
                                        case 13:
                                            m23709(this.f28203.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() + 1));
                                            break;
                                        case 14:
                                            this.f28202.push("{");
                                            arrayDeque.push(0);
                                            m23716(0);
                                            break;
                                        case 15:
                                        case 16:
                                            m23709(this.f28203.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() - 1));
                                            break;
                                        case 17:
                                            int i = this.f28206;
                                            if (i == 0) {
                                                m23717();
                                                m23711();
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
                                                        m23717();
                                                        m23717();
                                                        m23711();
                                                        break;
                                                    default:
                                                        m23715("f-string: single '}' is not allowed");
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            m23709(this.f28203.getText());
                                            break;
                                    }
                                }
                            } else {
                                m23709(this.f28203.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m23716(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m23716(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m23716(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m23716(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m23716(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m23716(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m23716(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m23716(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m23716(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m23716(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m23716(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m23716(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m23716(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m23716(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m23716(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m23716(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                    case 10:
                        m23717();
                        break;
                    case 8:
                        this.f28214 = 9;
                        m23706();
                        break;
                    default:
                        if (!arrayDeque2.isEmpty()) {
                            type = this.f28203.getType();
                            arrayDeque = this.f28211;
                            if (type == 19) {
                                m23709(this.f28203.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m23716(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m23716(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m23716(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m23716(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m23716(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m23716(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m23716(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m23716(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m23716(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m23716(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m23716(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m23716(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m23716(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m23716(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m23716(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m23716(32);
                                            break;
                                    }
                                }
                            } else {
                                m23709(this.f28203.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m23716(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m23716(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m23716(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m23716(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m23716(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m23716(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m23716(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m23716(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m23716(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m23716(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m23716(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m23716(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m23716(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m23716(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m23716(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m23716(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } else if (!arrayDeque2.isEmpty()) {
            m23715("unterminated interpolated string literal");
        }
        if (this.f28203.getType() == -1) {
            interfaceC2808NextToken = this.f28203;
        } else {
            interfaceC2808NextToken = super.nextToken();
        }
        this.f28217 = interfaceC2808NextToken;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m23714(int i) {
        int iIntValue = ((Integer) this.f28216.peek()).intValue();
        if (i > iIntValue) {
            m23708(2, (String) null, this.f28217);
            this.f28216.push(Integer.valueOf(i));
            return;
        }
        while (i < iIntValue) {
            this.f28216.pop();
            iIntValue = ((Integer) this.f28216.peek()).intValue();
            if (i <= iIntValue) {
                m23708(3, (String) null, this.f28217);
            } else {
                m23715("inconsistent dedent");
                m23708(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent dedent"), this.f28217);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m23712(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '\t') {
                this.f28218 = true;
                i += 8 - (i % 8);
            } else if (c == '\f') {
                i = 0;
            } else if (c == ' ') {
                this.f28210 = true;
                i++;
            }
        }
        if (!this.f28218 || !this.f28210 || this.f28213) {
            return i;
        }
        this.f28213 = true;
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23709(String str) {
        this.f28202.push(((String) this.f28202.pop()) + str);
    }

    /* JADX INFO: renamed from: ֡ */
    private void m23706() {
        Integer num = (Integer) f28201.get(this.f28203.getText().toLowerCase());
        if (num != null) {
            m23716(num.intValue());
            return;
        }
        m23715("internal error: unknown interpolated string literal prefix: " + this.f28203.getText());
    }

    /* JADX INFO: renamed from: ۘ */
    private void m23711() {
        this.f28211.pop();
        this.f28215 = C17588.m40053((String) this.f28202.pop(), C0249l.f1198d);
        if (this.f28202.isEmpty()) {
            return;
        }
        StringBuilder sbM17248 = C7470.m17248((String) this.f28202.pop());
        sbM17248.append(this.f28215);
        this.f28202.push(sbM17248.toString());
    }

    /* JADX INFO: renamed from: ۧ */
    private void m23713(int i, int i2, String str) {
        String strM38720 = C17073.m38720(1, 0, this.f28203.getText());
        C15628 c15628 = new C15628(this.f28203);
        c15628.m35509(strM38720);
        c15628.m35513(c15628.mo4433() - 1);
        m23710(c15628);
        m23707(i, i2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23707(int i, int i2, String str) {
        C15628 c15628 = new C15628(this.f28203);
        c15628.m35515(i);
        c15628.m35509(str);
        c15628.m35508(i2);
        c15628.m35510(c15628.mo4429() + 1);
        c15628.m35514(c15628.mo4434() + 1);
        c15628.m35513(c15628.mo4434());
        this.f28203 = c15628;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m23717() {
        m54804();
        this.f28206 = ((Integer) this.f28204.pop()).intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23708(int i, String str, InterfaceC2808 interfaceC2808) {
        C15628 c15628 = new C15628(interfaceC2808);
        c15628.m35515(i);
        c15628.m35508(0);
        c15628.m35513(interfaceC2808.mo4434() - 1);
        if (str == null) {
            str = "<" + C3468.f6958.m38446(i) + ">";
        }
        c15628.m35509(str);
        m23710(c15628);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23710(InterfaceC2808 interfaceC2808) {
        this.f28207 = interfaceC2808.getType();
        if (interfaceC2808.mo4430() == 0) {
            this.f28205 = this.f28207;
        }
        this.f28209.addLast(interfaceC2808);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m23715(String str) {
        m45730().mo4327(this, Integer.valueOf(this.f28203.getType()), this.f28203.getLine(), this.f28203.mo4429(), C21466.m48631(" LEXER ERROR: ", str), (C4821) null);
    }
}
