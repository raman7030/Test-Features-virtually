package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۨܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37E8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13599 extends AbstractC11588 {

    /* JADX INFO: renamed from: ֫ۧ */
    public String f38254;

    /* JADX INFO: renamed from: ۗ֫ */
    public EnumC8234 f38255;

    /* JADX INFO: renamed from: ۙ֫ */
    public int f38256;

    /* JADX INFO: renamed from: ۛ֫ */
    public AbstractC21279 f38257;

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f38258;

    /* JADX INFO: renamed from: ۤ֫ */
    public AbstractC13599 f38259;

    /* JADX INFO: renamed from: ۧۧ */
    public AbstractC13599 f38260;

    /* JADX INFO: renamed from: ۨ֫ */
    public ArrayList f38261;

    /* JADX INFO: renamed from: ۫֫ */
    public String f38262;

    /* JADX INFO: renamed from: ۬֫ */
    public ArrayList f38263;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f38264;

    /* JADX INFO: renamed from: ܳۧ */
    public ArrayList f38265;

    /* JADX INFO: renamed from: ܽۧ */
    public C12102 f38266;

    /* JADX INFO: renamed from: ܿۧ */
    public ArrayList f38267;

    /* JADX INFO: renamed from: ᩳۧ */
    public C8925 f38268;

    /* JADX INFO: renamed from: ᩺֫ */
    public ArrayList f38269;

    /* JADX INFO: renamed from: ֫ */
    public boolean mo20569(DataInputStream dataInputStream, EnumC6799 enumC6799, int i) {
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo20570(int i) {
    }

    public AbstractC13599(AbstractC13599 abstractC13599) {
        super(abstractC13599.f32274);
        this.f38254 = "";
        this.f38262 = null;
        this.f38258 = false;
        this.f38264 = false;
        this.f38255 = EnumC8234.DEFAULT_STATE;
        this.f38257 = abstractC13599.f38257;
        this.f38259 = abstractC13599;
        this.f38266 = abstractC13599.f38266;
    }

    public AbstractC13599(AbstractC21279 abstractC21279) {
        super(abstractC21279.m48092());
        this.f38254 = "";
        this.f38262 = null;
        this.f38258 = false;
        this.f38264 = false;
        this.f38255 = EnumC8234.DEFAULT_STATE;
        this.f38257 = abstractC21279;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final String m30957() {
        String strM40053 = this.f38258 ? C17588.m40053(EnumC16818.f49584.m38127(), " ") : "";
        if (!this.f38264) {
            return strM40053;
        }
        StringBuilder sbM17248 = C7470.m17248(strM40053);
        sbM17248.append(EnumC16818.f49564.m38127() + " ");
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: ֨ */
    public final EnumC8234 m30951() {
        return this.f38255;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24245(EnumC8234 enumC8234) {
        this.f38255 = enumC8234;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10015(List... listArr) {
        for (List<C8493> list : listArr) {
            if (list != null) {
                for (C8493 c8493 : list) {
                    c8493.m26661(this);
                    c8493.mo5334();
                    m26681();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30954(StringBuilder sb, String str, String str2, int i, int i2, int i3) {
        C8537 c8537;
        C8925 c8925 = this.f38268;
        if (c8925 != null) {
            c8537 = c8925.m20619(new Function() { // from class: l.۬ܽ֨
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(this.f42658.f38266.m27990(((Integer) obj).intValue()));
                }
            });
        } else {
            c8537 = new C8537("", "");
        }
        if (this.f32275) {
            sb.append('#');
            sb.append(i);
            sb.append(":#");
            sb.append(i2);
            sb.append((String) c8537.f22916);
            if (i3 != -1) {
                sb.append(" = #");
                sb.append(i3);
            }
            sb.append(str2);
            if (this.f32292) {
                m26668(sb.toString());
            } else {
                m26675(mo8555(), sb.toString());
                m26668(" // ");
                String name = this.f38259.f38266.getName(i);
                String name2 = this.f38259.f38266.getName(i2);
                Object obj = c8537.f22917;
                if (str == null) {
                    str = "";
                }
                m26668(String.format("%s:%s%s%s", name, name2, obj, str));
            }
        } else {
            sb.append(this.f38259.f38266.getName(i));
            sb.append(':');
            sb.append(this.f38259.f38266.getName(i2));
            sb.append((String) c8537.f22917);
            if (str != null) {
                sb.append(str);
            }
            m26668(((Object) sb) + str2);
        }
        m26681();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30953(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38263 = new ArrayList(unsignedShort);
        this.f38257.m48090(String.format("%s - Attributes[%d]", this.f38254, Integer.valueOf(unsignedShort)), new Object[0]);
        for (int i = 0; i < unsignedShort; i++) {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            String strM27987 = this.f38259.f38266.m27987(unsignedShort2, new C20002(7));
            this.f38257.m48090(String.format("Attribute#%d name[%d]=\"%s\"", Integer.valueOf(i), Integer.valueOf(unsignedShort2), strM27987), new Object[0]);
            EnumC6799 enumC6799M15517 = EnumC6799.m15517(strM27987);
            int i2 = dataInputStream.readInt();
            C22576 c22576 = new C22576(this.f38257, enumC6799M15517);
            this.f38263.add(c22576);
            int i3 = C12258.f34269[enumC6799M15517.ordinal()];
            boolean z = this.f32301;
            switch (i3) {
                case 1:
                    if (i2 != 0) {
                        if (z) {
                            this.f38257.m48082().mo34699("{0}: Invalid attribute length #{1}", enumC6799M15517.m15522(), Integer.valueOf(i2));
                        } else {
                            throw new C6526(this.f38257.m48082(), "{0}: Invalid attribute length #{1}", enumC6799M15517.m15522(), Integer.valueOf(i2));
                        }
                    }
                    this.f38258 = true;
                    break;
                case 2:
                    if (i2 != 0) {
                        if (z) {
                            this.f38257.m48082().mo34699("{0}: Invalid attribute length #{1}", enumC6799M15517.m15522(), Integer.valueOf(i2));
                        } else {
                            throw new C6526(this.f38257.m48082(), "{0}: Invalid attribute length #{1}", enumC6799M15517.m15522(), Integer.valueOf(i2));
                        }
                    }
                    this.f38264 = true;
                    break;
                case 3:
                case 4:
                    short s = dataInputStream.readShort();
                    ArrayList arrayList = new ArrayList(s);
                    boolean z2 = enumC6799M15517 == EnumC6799.f17620;
                    for (int i4 = 0; i4 < s; i4++) {
                        C8493 c8493 = new C8493(this.f38259, z2);
                        c8493.mo19750(dataInputStream);
                        arrayList.add(c8493);
                    }
                    if (z2) {
                        this.f38261 = arrayList;
                    } else {
                        this.f38267 = arrayList;
                    }
                    break;
                case 5:
                case 6:
                    short s2 = dataInputStream.readShort();
                    ArrayList arrayList2 = new ArrayList(s2);
                    boolean z3 = enumC6799M15517 == EnumC6799.f17646;
                    for (int i5 = 0; i5 < s2; i5++) {
                        C9595 c9595 = new C9595(this.f38259, z3);
                        c9595.mo19750(dataInputStream);
                        arrayList2.add(c9595);
                    }
                    if (z3) {
                        this.f38269 = arrayList2;
                    } else {
                        this.f38265 = arrayList2;
                    }
                    break;
                case 7:
                    mo20570(unsignedShort2);
                    c22576.m50604(unsignedShort2, i2, dataInputStream);
                    break;
                default:
                    if (!mo20569(dataInputStream, enumC6799M15517, i2)) {
                        c22576.m50604(unsignedShort2, i2, dataInputStream);
                    } else {
                        c22576.m50606(unsignedShort2);
                        c22576.m50603(i2);
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m30952(final EnumC6799 enumC6799) {
        return C7480.stream(this.f38263).filter(new Predicate() { // from class: l.۫ܽ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m32794or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C22576) obj).m50605().equals(enumC6799);
            }
        }).toList();
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m30956(String str) {
        int length;
        int iM26670;
        if (this.f32284) {
            length = str.length() + (m26683() * 2) + 7;
            iM26670 = m26670();
        } else {
            length = str.length() + (m26683() * 2) + 7;
            iM26670 = m26670() * 2;
        }
        return (length - iM26670) - m26670();
    }

    /* JADX INFO: renamed from: ۠ */
    public final String m30955() {
        if (this.f38262 == null) {
            this.f38262 = this.f32275 ? "default { " : " default { ";
        }
        return this.f38262;
    }
}
