package l;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܰ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes4.dex */
public final class C13813 extends AbstractC12383 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16616 f41191;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayList f41192;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6053 f41193;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f41194;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C22301 f41195;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5660 f41196;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3917 f41197;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1676 f41198;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f41199;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23026 f41200;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9438 f41201;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8482 f41202;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C19460 f41203;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7279 f41204;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C7279 f41205;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22986 f41206;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C11678 f41207;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f41208;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f41209;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4622 f41210;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6759 f41211;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33154(EnumC4662 enumC4662, long j) {
        if (m33158(enumC4662)) {
            this.f41197.m11951(j, "There may be at most one  \"{0}\" attribute in the attributes table of a \"{1}\" structure.", enumC4662.m13646(), this.f37148.name());
            throw null;
        }
    }

    public C13813(C3917 c3917, C22301 c22301) {
        super(new C3046(c3917), c3917, 0);
        this.f41199 = ".class";
        C22986 c22986 = new C22986();
        c22986.f74008 = new C6491(null, null);
        c22986.f74006 = new C6491(null, null);
        this.f41206 = c22986;
        this.f41192 = new ArrayList();
        this.f41208 = new ArrayList();
        this.f41204 = null;
        this.f41205 = null;
        this.f41196 = null;
        this.f37148 = EnumC3251.class_file;
        this.f41197 = c3917;
        this.f41193 = new C6053();
        this.f41195 = c22301;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33164() {
        if (this.f41205 != null) {
            EnumC10932[] enumC10932Arr = {EnumC10932.f32942, EnumC10932.f32920};
            C3046 c3046 = this.f37150;
            ArrayList arrayListM9321 = c3046.m9321(enumC10932Arr);
            Object[] objArr = {Integer.valueOf(arrayListM9321.size())};
            C3917 c3917 = this.f41197;
            c3917.m45778("relinkBSMs: %d items", objArr);
            Iterator it = arrayListM9321.iterator();
            while (it.hasNext()) {
                C17863 c17863 = (C17863) ((C15869) it.next()).f49042;
                C9582 c9582M41837 = c17863.m41837();
                boolean zM41838 = c17863.m41838();
                C15869 c15869 = (C15869) c17863.f7866;
                if (zM41838 & (c15869.f49042 == null)) {
                    c17863.f7866 = c3046.m9311(c15869.f20943);
                }
                if (c9582M41837 != null && c9582M41837.mo18355()) {
                    int i = c9582M41837.f20943;
                    if (i < 0 || i > this.f41205.size()) {
                        c3917.mo2245("Bad bootstrap method attribute index {0}", Integer.valueOf(i));
                        c9582M41837.f20943 = i;
                    } else {
                        c17863.m41836((C9582) this.f41205.get(i), i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33145(Collection collection, C9582 c9582) {
        if (collection.isEmpty()) {
            return -1;
        }
        C9582[] c9582Arr = (C9582[]) C5378.toArray(collection, new C8170());
        for (int i = 0; i < c9582Arr.length; i++) {
            if (c9582.m24460(c9582Arr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1676 m33148(long j) {
        if (m33158(EnumC4662.f14787)) {
            this.f41197.mo11949(j, "Record attribute repeated", new Object[0]);
        }
        C1676 c1676 = new C1676(this);
        this.f41198 = c1676;
        return c1676;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33165() {
        this.f41198 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14499 m33159(int i, C15869 c15869, C15869 c158610) {
        C14499 c14499;
        final C20686 c20686 = new C20686(c15869, c158610);
        Supplier supplier = new Supplier() { // from class: l.᩹۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addFieldIfAbsent]:  #");
                C20686 c20687 = c20686;
                sb.append(((C15869) ((C6491) c20687.f7866).f20042).f20943);
                sb.append(":#");
                sb.append(((C15869) ((C6491) c20687.f7866).f20043).f20943);
                return sb.toString();
            }
        };
        C3917 c3917 = this.f41197;
        c3917.m45762(supplier);
        Iterator it = this.f41192.iterator();
        do {
            if (!it.hasNext()) {
                c14499 = null;
                break;
            }
            c14499 = (C14499) it.next();
        } while (!c14499.m34596().equals(c20686));
        if (c14499 != null) {
            return c14499;
        }
        c3917.m45778(" [ClassData.addFieldIfAbsent]:  new field.", new Object[0]);
        return m33150(i, c20686);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14499 m33150(int i, final C20686 c20686) {
        this.f41197.m45762(new Supplier() { // from class: l.ۗ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addField]:  #");
                C20686 c20687 = c20686;
                sb.append(((C15869) ((C6491) c20687.f7866).f20042).f20943);
                sb.append(":#");
                sb.append(((C15869) ((C6491) c20687.f7866).f20043).f20943);
                return sb.toString();
            }
        });
        C14499 c14499 = new C14499(this, i, c20686);
        this.f41192.add(c14499);
        return c14499;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11678 m33149(int i, final C15869 c15869, final C15869 c158610) {
        this.f41207 = null;
        this.f41197.m45762(new Supplier() { // from class: l.ۚ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return " [ClassData.StartMethod]:  #" + c15869.f20943 + ":#" + c158610.f20943;
            }
        });
        C11678 c11678 = new C11678(this.f37150, (C3917) m30112(), i);
        c11678.f34800 = null;
        c11678.f34801 = null;
        c11678.f34794 = null;
        c11678.f34797 = null;
        c11678.f34796 = null;
        c11678.f34799 = this;
        c11678.f37148 = EnumC3251.method_info;
        c11678.f34793 = c15869;
        c11678.f34798 = c158610;
        if (EnumC6073.m16936(i)) {
            c11678.m30108();
        }
        this.f41207 = c11678;
        this.f41208.add(c11678);
        return this.f41207;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33151(int i, final C15869 c15869, final C15869 c158610, final C15869 c158611) {
        this.f41197.m45762(new Supplier() { // from class: l.ۙ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addInnerClass (with indexes: Name (" + c15869.toString() + "), Inner (" + c158610.toString() + "), Outer (" + c158611.toString() + ").";
            }
        });
        if (this.f41204 == null) {
            this.f41204 = new C7279(this.f37150, EnumC4662.f14796);
        }
        C7279 c7279 = this.f41204;
        C20851 c20851 = new C20851();
        c20851.f67508 = i;
        c20851.f67507 = c15869;
        c20851.f67509 = c158610;
        c20851.f67506 = c158611;
        c7279.m19535(c20851);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33156(final C9582 c9582) {
        if (this.f41205 == null) {
            this.f41205 = new C7279(this.f37150, EnumC4662.f14804);
        }
        this.f41205.m19535(c9582);
        this.f41197.m45762(new Supplier() { // from class: l.᩶۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addBootstrapMethod: ".concat(c9582.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33161(C15869 c15869) {
        this.f41197.m45778("addNestHost", new Object[0]);
        this.f41203 = new C19460(this.f37150, EnumC4662.f14799, c15869);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33163(ArrayList arrayList) {
        this.f41197.m45778("addNestMembers", new Object[0]);
        this.f41202 = new C8482(this.f37150, EnumC4662.f14798, arrayList);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33166(ArrayList arrayList) {
        this.f41197.m45778("addPermittedSubclasses", new Object[0]);
        this.f41200 = new C23026(this.f37150, EnumC4662.f14811, arrayList);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33160(ArrayList arrayList) {
        this.f41197.m45778("addLoadableDescriptors", new Object[0]);
        this.f41210 = new C4622(this.f37150, EnumC4662.f14802, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33157(C15869 c15869, C15869 c158610) {
        this.f41197.m45778("addEnclosingMethod", new Object[0]);
        this.f41191 = new C16616(this.f37150, c15869, c158610);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33162() {
        C22986 c22986 = this.f41206;
        C15869 c15869M51138 = c22986.m51138();
        C6491 c6491 = c22986.f74008;
        C6491 c6492 = c22986.f74006;
        C3046 c3046 = this.f37150;
        if (c15869M51138 == null) {
            c3046.getClass();
            C15869 c15869M9314 = c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32947, c3046.m9312("java/lang/Object")));
            if (c6492.f20043 != null) {
                c6492.f20043 = c15869M9314;
            } else {
                c6491.f20043 = c15869M9314;
            }
        }
        c3046.m9328();
        Object obj = c6491.f20042;
        if (obj != null) {
            c6491.f20042 = c3046.m9329((C15869) obj);
        }
        Object obj2 = c6491.f20043;
        if (obj2 != null) {
            c6491.f20043 = c3046.m9329((C15869) obj2);
        }
        Object obj3 = c6492.f20042;
        if (obj3 != null) {
            c6492.f20042 = c3046.m9329((C15869) obj3);
        }
        Object obj4 = c6492.f20043;
        if (obj4 != null) {
            c6492.f20043 = c3046.m9329((C15869) obj4);
        }
        c22986.m51136(c3046);
        c3046.m9324();
        c3046.m9330();
        C7279 c7279 = new C7279(c3046, EnumC4662.f14793);
        c7279.m19536(C5378.stream(this.f41192).map(new C15224()));
        int i = 1;
        m33146(c7279, this.f37144, this.f37146);
        C7279 c72710 = this.f41205;
        C3917 c3917 = this.f41197;
        if (c72710 != null) {
            List list = C5378.stream(c3046.m9310(EnumC10932.f32920, EnumC10932.f32942)).map(new C14375(i)).toList();
            if (C5378.stream(list).anyMatch(new C13108())) {
                c3917.m45778("numberBSM: %d items", Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    C9582 c9582 = (C9582) list.get(i3);
                    int iM33145 = m33145(arrayList, c9582);
                    if (iM33145 != -1) {
                        c9582.f20943 = iM33145;
                    } else {
                        if (m33145(this.f41205, c9582) == -1) {
                            c3917.mo2245("Invoke dynamic \"{0}\" has undefined method attribute index", c9582.toString());
                        } else {
                            c9582.f20943 = i2;
                            i2++;
                        }
                        arrayList.add(c9582);
                    }
                }
                this.f41205.m19534(arrayList);
            }
        }
        try {
            this.f41194 = c22986.m51135();
            if (c3917.m45768()) {
                c3917.m45778("ClassFileName = " + this.f41194, new Object[0]);
                c3917.m45778("this_class    = " + c22986.m51139(), new Object[0]);
                c3917.m45778("super_class   = " + c22986.m51138(), new Object[0]);
                c3917.m45778("-- Constant Pool ---", new Object[0]);
                c3917.m45778("--------------------", new Object[0]);
                c3046.m9334();
                c3917.m45778("--------------------", new Object[0]);
                c3917.m45778("-- Inner Classes ---", new Object[0]);
                c3917.m45778("--------------------", new Object[0]);
                m33147();
                c3917.m45778("--------------------", new Object[0]);
            }
        } catch (Throwable th) {
            c3917.m45762(new Supplier() { // from class: l.᩸۫ۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "check name:" + th;
                }
            });
            c3917.mo11946("Class name isn't defined", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33155(C5660 c5660) {
        c5660.m15976();
        this.f41196 = c5660;
        this.f41194 = "module-info";
        C3046 c3046 = this.f37150;
        c3046.getClass();
        C15869 c15869M9314 = c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32947, c3046.m9312("module-info")));
        C22986 c22986 = this.f41206;
        c22986.m51137(c15869M9314);
        c3046.m9328();
        c22986.m51137(c3046.m9329(c22986.m51139()));
        c3046.m9324();
        m33146((C6759[]) new C7279[]{this.f37144, this.f37146});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33146(C6759... c6759Arr) {
        for (C6759 c6759 : c6759Arr) {
            if (c6759 != null) {
                if (c6759 instanceof C7279) {
                    C5378.stream(((C7279) c6759).getElements()).map(new C12403()).forEach(new Consumer() { // from class: l.֨۫ۚ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void n(Object obj) {
                            ((InterfaceC12218) obj).mo14394(this.f4067.f37150);
                        }
                    });
                } else {
                    c6759.mo14394(this.f37150);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m33147() {
        C7279<C20851> c7279 = this.f41204;
        C3917 c3917 = this.f41197;
        if (c7279 != null) {
            int i = 1;
            for (C20851 c20851 : c7279) {
                StringBuilder sb = new StringBuilder(" InnerClass[");
                sb.append(i);
                sb.append("]: (");
                sb.append(EnumC6073.m16951(c20851.f67508, EnumC20185.INNER_CLASS));
                sb.append("), ");
                c3917.m45775(sb.toString(), new Object[0]);
                c3917.m45775("Name:  " + c20851.f67507.toString() + " ", new Object[0]);
                c3917.m45775("InnerClass_info:  " + c20851.f67509.toString() + " ", new Object[0]);
                c3917.m45778("OuterClass_info:  " + c20851.f67506.toString() + " ", new Object[0]);
                i++;
            }
            return;
        }
        c3917.m45778("<< NO INNER CLASSES >>", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33152(InterfaceC0408 interfaceC0408) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        C5868 c5868;
        C6053 c6053;
        C6053 c6054 = (C6053) interfaceC0408;
        c6054.m16887(-889275714);
        C22301 c22301 = this.f41195;
        c6054.m16889(c22301.m50038());
        c6054.m16889(c22301.m50045());
        this.f37150.m9318(c6054);
        c6054.m16889(this.f37140);
        C22986 c22986 = this.f41206;
        c6054.m16889(c22986.m51139().f20943);
        c6054.m16889(c22986.m51138().f20943);
        ArrayList arrayList = this.f41209;
        if (arrayList != null) {
            c6054.m16889(arrayList.size());
            Iterator it = this.f41209.iterator();
            while (it.hasNext()) {
                c6054.m16889(((C6739) it.next()).f20943);
            }
        } else {
            c6054.m16889(0);
        }
        ArrayList arrayList2 = this.f41192;
        if (arrayList2 != null) {
            c6054.m16889(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C14499) it2.next()).m34593(c6054);
            }
        } else {
            c6054.m16889(0);
        }
        ArrayList<C11678> arrayList3 = this.f41208;
        if (arrayList3 != null) {
            c6054.m16889(arrayList3.size());
            for (C11678 c11678 : arrayList3) {
                c6054.m16889(c11678.f37140);
                c6054.m16889(c11678.f34793.f20943);
                c6054.m16889(c11678.f34798.f20943);
                C5868 c5868M30107 = c11678.m30107(c11678.f34800, c11678.f37149, c11678.f37147, c11678.f37141, c11678.f34801, c11678.f34795, c11678.f34796);
                C10267 c10267 = c11678.f34794;
                if (c10267 != null) {
                    c5868M30107.m16430(c10267);
                }
                C10267 c10268 = c11678.f34797;
                if (c10268 != null) {
                    c5868M30107.m16430(c10268);
                }
                c5868M30107.m16429(c6054);
            }
            c = 6;
            c2 = 5;
            c3 = 4;
            c4 = 2;
        } else {
            c = 6;
            c2 = 5;
            c3 = 4;
            c4 = 2;
            c6054.m16889(0);
        }
        C5660 c5660 = this.f41196;
        if (c5660 != null) {
            C7279 c7279 = this.f37146;
            C7279 c72710 = this.f37144;
            C6759[] c6759Arr = new C6759[3];
            c6759Arr[0] = c7279;
            c6759Arr[1] = c72710;
            c6759Arr[c4] = c5660;
            c5868 = new C5868();
            for (int i = 0; i < 3; i++) {
                C6759 c6759 = c6759Arr[i];
                if (c6759 != null) {
                    c5868.m16430(c6759);
                }
            }
            c6053 = c6054;
        } else {
            C6759 c67510 = this.f41211;
            C9438 c9438 = this.f41201;
            C1676 c1676 = this.f41198;
            C7279 c72711 = this.f41204;
            C6759 c67511 = this.f37149;
            C6759 c67512 = this.f37147;
            C19460 c19460 = this.f37141;
            C7279 c72712 = this.f37146;
            C7279 c72713 = this.f37144;
            C7279 c72714 = this.f37142;
            C7279 c72715 = this.f37143;
            C7279 c72716 = this.f41205;
            C19460 c19461 = this.f41203;
            C8482 c8482 = this.f41202;
            C23026 c23026 = this.f41200;
            C16616 c16616 = this.f41191;
            C4622 c4622 = this.f41210;
            C6759[] c6759Arr2 = new C6759[17];
            c6759Arr2[0] = c67510;
            c6759Arr2[1] = c9438;
            c6759Arr2[c4] = c1676;
            c6759Arr2[3] = c72711;
            c6759Arr2[c3] = c67511;
            c6759Arr2[c2] = c67512;
            c6759Arr2[c] = c19460;
            c6759Arr2[7] = c72712;
            c6759Arr2[8] = c72713;
            c6759Arr2[9] = c72714;
            c6759Arr2[10] = c72715;
            c6759Arr2[11] = c72716;
            c6759Arr2[12] = c19461;
            c6759Arr2[13] = c8482;
            c6759Arr2[14] = c23026;
            c6759Arr2[15] = c16616;
            c6759Arr2[16] = c4622;
            c5868 = new C5868();
            for (int i2 = 0; i2 < 17; i2++) {
                C6759 c67513 = c6759Arr2[i2];
                if (c67513 != null) {
                    c5868.m16430(c67513);
                }
            }
            c6053 = c6054;
        }
        c5868.m16429(c6053);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33153(InterfaceC1134 interfaceC1134) throws IOException {
        C6053 c6053 = this.f41193;
        try {
            DataOutputStream dataOutputStreamMo1967 = interfaceC1134.mo1967();
            try {
                c6053.m16885(dataOutputStreamMo1967);
                m33152(c6053);
                if (dataOutputStreamMo1967 != null) {
                    dataOutputStreamMo1967.close();
                }
            } catch (Throwable th) {
                if (dataOutputStreamMo1967 != null) {
                    try {
                        dataOutputStreamMo1967.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            boolean z = interfaceC1134 instanceof AbstractC3957;
            C3917 c3917 = this.f41197;
            if (z) {
                c3917.mo11946("Cannot write to {0}", ((AbstractC3957) interfaceC1134).mo1970());
            } else {
                c3917.mo11946("Cannot write to {0}", "output stream");
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33158(EnumC4662 enumC4662) {
        switch (C10287.f30992[enumC4662.ordinal()]) {
            case 1:
                return this.f37141 != null;
            case 2:
                return this.f41211 != null;
            case 3:
                return this.f41201 != null;
            case 4:
                return this.f41203 != null;
            case 5:
                C8482 c8482 = this.f41202;
                return (c8482 == null || c8482.f56247.size() == 0) ? false : true;
            case 6:
                C23026 c23026 = this.f41200;
                return (c23026 == null || c23026.f56247.size() == 0) ? false : true;
            case 7:
                C4622 c4622 = this.f41210;
                return (c4622 == null || c4622.f56247.size() == 0) ? false : true;
            case 8:
                return this.f41198 != null;
            case 9:
                return this.f41191 != null;
            default:
                throw new IllegalStateException(C19462.m44858("Unexpected attribute: ", enumC4662.m13646(), " in ", this.f37148.name()));
        }
    }
}
