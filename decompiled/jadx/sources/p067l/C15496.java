package p067l;

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
public final class C15496 extends AbstractC14137 {

    /* JADX INFO: renamed from: ֡ */
    public C18160 f44269;

    /* JADX INFO: renamed from: ֨ */
    public ArrayList f44270;

    /* JADX INFO: renamed from: ۖ */
    public C8121 f44271;

    /* JADX INFO: renamed from: ۗ */
    public String f44272;

    /* JADX INFO: renamed from: ۘ */
    public C23563 f44273;

    /* JADX INFO: renamed from: ۙ */
    public C7748 f44274;

    /* JADX INFO: renamed from: ۚ */
    public final C6091 f44275;

    /* JADX INFO: renamed from: ۛ */
    public C3961 f44276;

    /* JADX INFO: renamed from: ۠ */
    public String f44277;

    /* JADX INFO: renamed from: ۤ */
    public C24252 f44278;

    /* JADX INFO: renamed from: ۨ */
    public C11338 f44279;

    /* JADX INFO: renamed from: ۫ */
    public C10430 f44280;

    /* JADX INFO: renamed from: ۬ */
    public C20863 f44281;

    /* JADX INFO: renamed from: ܶ */
    public C9286 f44282;

    /* JADX INFO: renamed from: ܺ */
    public C9286 f44283;

    /* JADX INFO: renamed from: ᩴ */
    public C24214 f44284;

    /* JADX INFO: renamed from: ᩵ */
    public C13467 f44285;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f44286;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f44287;

    /* JADX INFO: renamed from: ᩹ */
    public C6761 f44288;

    /* JADX INFO: renamed from: ᩺ */
    public C8792 f44289;

    /* JADX INFO: renamed from: ֫ */
    public final void m35271(EnumC6799 enumC6799, long j) {
        if (m35275(enumC6799)) {
            this.f44275.m13871(j, "There may be at most one  \"{0}\" attribute in the attributes table of a \"{1}\" structure.", enumC6799.m15521(), this.f40165.name());
            throw null;
        }
    }

    public C15496(C6091 c6091, C23563 c23563) {
        super(new C5263(c6091), c6091, 0);
        this.f44277 = ".class";
        C24214 c24214 = new C24214();
        c24214.f76743 = new C8537(null, null);
        c24214.f76741 = new C8537(null, null);
        this.f44284 = c24214;
        this.f44270 = new ArrayList();
        this.f44286 = new ArrayList();
        this.f44282 = null;
        this.f44283 = null;
        this.f44274 = null;
        this.f40165 = EnumC5458.class_file;
        this.f44275 = c6091;
        this.f44271 = new C8121();
        this.f44273 = c23563;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m35281() {
        if (this.f44283 != null) {
            EnumC12758[] enumC12758Arr = {EnumC12758.f35920, EnumC12758.f35898};
            C5263 c5263 = this.f40167;
            ArrayList arrayListM11363 = c5263.m11363(enumC12758Arr);
            Object[] objArr = {Integer.valueOf(arrayListM11363.size())};
            C6091 c6091 = this.f44275;
            c6091.m48090("relinkBSMs: %d items", objArr);
            Iterator it = arrayListM11363.iterator();
            while (it.hasNext()) {
                C19345 c19345 = (C19345) ((C17450) it.next()).f52180;
                C11475 c11475M44084 = c19345.m44084();
                boolean zM44085 = c19345.m44085();
                C17450 c17450 = (C17450) c19345.f10654;
                if (zM44085 & (c17450.f52180 == null)) {
                    c19345.f10654 = c5263.m11353(c17450.f23817);
                }
                if (c11475M44084 != null && c11475M44084.mo20303()) {
                    int i = c11475M44084.f23817;
                    if (i < 0 || i > this.f44283.size()) {
                        c6091.mo4612("Bad bootstrap method attribute index {0}", Integer.valueOf(i));
                        c11475M44084.f23817 = i;
                    } else {
                        c19345.m44083((C11475) this.f44283.get(i), i);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m35262(Collection collection, C11475 c11475) {
        if (collection.isEmpty()) {
            return -1;
        }
        C11475[] c11475Arr = (C11475[]) C7480.toArray(collection, new C10133());
        for (int i = 0; i < c11475Arr.length; i++) {
            if (c11475.m26472(c11475Arr[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3961 m35265(long j) {
        if (m35275(EnumC6799.f17617)) {
            this.f44275.mo13869(j, "Record attribute repeated", new Object[0]);
        }
        C3961 c3961 = new C3961(this);
        this.f44276 = c3961;
        return c3961;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35282() {
        this.f44276 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16148 m35276(int i, C17450 c17450, C17450 c17451) {
        C16148 c16148;
        final C22028 c22028 = new C22028(c17450, c17451);
        Supplier supplier = new Supplier() { // from class: l.᩹۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addFieldIfAbsent]:  #");
                C22028 c22029 = c22028;
                sb.append(((C17450) ((C8537) c22029.f10654).f22916).f23817);
                sb.append(":#");
                sb.append(((C17450) ((C8537) c22029.f10654).f22917).f23817);
                return sb.toString();
            }
        };
        C6091 c6091 = this.f44275;
        c6091.m48074(supplier);
        Iterator it = this.f44270.iterator();
        do {
            if (!it.hasNext()) {
                c16148 = null;
                break;
            }
            c16148 = (C16148) it.next();
        } while (!c16148.m36737().equals(c22028));
        if (c16148 != null) {
            return c16148;
        }
        c6091.m48090(" [ClassData.addFieldIfAbsent]:  new field.", new Object[0]);
        return m35267(i, c22028);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16148 m35267(int i, final C22028 c22028) {
        this.f44275.m48074(new Supplier() { // from class: l.ۗ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                StringBuilder sb = new StringBuilder(" [ClassData.addField]:  #");
                C22028 c22029 = c22028;
                sb.append(((C17450) ((C8537) c22029.f10654).f22916).f23817);
                sb.append(":#");
                sb.append(((C17450) ((C8537) c22029.f10654).f22917).f23817);
                return sb.toString();
            }
        });
        C16148 c16148 = new C16148(this, i, c22028);
        this.f44270.add(c16148);
        return c16148;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13467 m35266(int i, final C17450 c17450, final C17450 c17451) {
        this.f44285 = null;
        this.f44275.m48074(new Supplier() { // from class: l.ۚ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return " [ClassData.StartMethod]:  #" + c17450.f23817 + ":#" + c17451.f23817;
            }
        });
        C13467 c13467 = new C13467(this.f40167, (C6091) m32176(), i);
        c13467.f37799 = null;
        c13467.f37800 = null;
        c13467.f37793 = null;
        c13467.f37796 = null;
        c13467.f37795 = null;
        c13467.f37798 = this;
        c13467.f40165 = EnumC5458.method_info;
        c13467.f37792 = c17450;
        c13467.f37797 = c17451;
        if (EnumC8140.m18865(i)) {
            c13467.m32172();
        }
        this.f44285 = c13467;
        this.f44286.add(c13467);
        return this.f44285;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35268(int i, final C17450 c17450, final C17450 c17451, final C17450 c17452) {
        this.f44275.m48074(new Supplier() { // from class: l.ۙ۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addInnerClass (with indexes: Name (" + c17450.toString() + "), Inner (" + c17451.toString() + "), Outer (" + c17452.toString() + ").";
            }
        });
        if (this.f44282 == null) {
            this.f44282 = new C9286(this.f40167, EnumC6799.f17626);
        }
        C9286 c9286 = this.f44282;
        C22185 c22185 = new C22185();
        c22185.f70190 = i;
        c22185.f70189 = c17450;
        c22185.f70191 = c17451;
        c22185.f70188 = c17452;
        c9286.m21502(c22185);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35273(final C11475 c11475) {
        if (this.f44283 == null) {
            this.f44283 = new C9286(this.f40167, EnumC6799.f17634);
        }
        this.f44283.m21502(c11475);
        this.f44275.m48074(new Supplier() { // from class: l.᩶۫ۚ
            @Override // java.util.function.Supplier
            public final Object get() {
                return "addBootstrapMethod: ".concat(c11475.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35278(C17450 c17450) {
        this.f44275.m48090("addNestHost", new Object[0]);
        this.f44281 = new C20863(this.f40167, EnumC6799.f17629, c17450);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35280(ArrayList arrayList) {
        this.f44275.m48090("addNestMembers", new Object[0]);
        this.f44280 = new C10430(this.f40167, EnumC6799.f17628, arrayList);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35283(ArrayList arrayList) {
        this.f44275.m48090("addPermittedSubclasses", new Object[0]);
        this.f44278 = new C24252(this.f40167, EnumC6799.f17641, arrayList);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35277(ArrayList arrayList) {
        this.f44275.m48090("addLoadableDescriptors", new Object[0]);
        this.f44288 = new C6761(this.f40167, EnumC6799.f17632, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35274(C17450 c17450, C17450 c17451) {
        this.f44275.m48090("addEnclosingMethod", new Object[0]);
        this.f44269 = new C18160(this.f40167, c17450, c17451);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35279() {
        C24214 c24214 = this.f44284;
        C17450 c17450M53531 = c24214.m53531();
        C8537 c8537 = c24214.f76743;
        C8537 c8538 = c24214.f76741;
        C5263 c5263 = this.f40167;
        if (c17450M53531 == null) {
            c5263.getClass();
            C17450 c17450M11356 = c5263.m11356((AbstractC4711) new C18674(EnumC12758.f35925, c5263.m11354("java/lang/Object")));
            if (c8538.f22917 != null) {
                c8538.f22917 = c17450M11356;
            } else {
                c8537.f22917 = c17450M11356;
            }
        }
        c5263.m11370();
        Object obj = c8537.f22916;
        if (obj != null) {
            c8537.f22916 = c5263.m11371((C17450) obj);
        }
        Object obj2 = c8537.f22917;
        if (obj2 != null) {
            c8537.f22917 = c5263.m11371((C17450) obj2);
        }
        Object obj3 = c8538.f22916;
        if (obj3 != null) {
            c8538.f22916 = c5263.m11371((C17450) obj3);
        }
        Object obj4 = c8538.f22917;
        if (obj4 != null) {
            c8538.f22917 = c5263.m11371((C17450) obj4);
        }
        c24214.m53529(c5263);
        c5263.m11366();
        c5263.m11372();
        C9286 c9286 = new C9286(c5263, EnumC6799.f17623);
        c9286.m21503(C7480.stream(this.f44270).map(new C16837()));
        int i = 1;
        m35263(c9286, this.f40161, this.f40163);
        C9286 c9287 = this.f44283;
        C6091 c6091 = this.f44275;
        if (c9287 != null) {
            List list = C7480.stream(c5263.m11352(EnumC12758.f35898, EnumC12758.f35920)).map(new C16030(i)).toList();
            if (C7480.stream(list).anyMatch(new C14826())) {
                c6091.m48090("numberBSM: %d items", Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    C11475 c11475 = (C11475) list.get(i3);
                    int iM35262 = m35262(arrayList, c11475);
                    if (iM35262 != -1) {
                        c11475.f23817 = iM35262;
                    } else {
                        if (m35262(this.f44283, c11475) == -1) {
                            c6091.mo4612("Invoke dynamic \"{0}\" has undefined method attribute index", c11475.toString());
                        } else {
                            c11475.f23817 = i2;
                            i2++;
                        }
                        arrayList.add(c11475);
                    }
                }
                this.f44283.m21501(arrayList);
            }
        }
        try {
            this.f44272 = c24214.m53528();
            if (c6091.m48080()) {
                c6091.m48090("ClassFileName = " + this.f44272, new Object[0]);
                c6091.m48090("this_class    = " + c24214.m53532(), new Object[0]);
                c6091.m48090("super_class   = " + c24214.m53531(), new Object[0]);
                c6091.m48090("-- Constant Pool ---", new Object[0]);
                c6091.m48090("--------------------", new Object[0]);
                c5263.m11376();
                c6091.m48090("--------------------", new Object[0]);
                c6091.m48090("-- Inner Classes ---", new Object[0]);
                c6091.m48090("--------------------", new Object[0]);
                m35264();
                c6091.m48090("--------------------", new Object[0]);
            }
        } catch (Throwable th) {
            c6091.m48074(new Supplier() { // from class: l.᩸۫ۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "check name:" + th;
                }
            });
            c6091.mo13866("Class name isn't defined", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35272(C7748 c7748) {
        c7748.m17905();
        this.f44274 = c7748;
        this.f44272 = "module-info";
        C5263 c5263 = this.f40167;
        c5263.getClass();
        C17450 c17450M11356 = c5263.m11356((AbstractC4711) new C18674(EnumC12758.f35925, c5263.m11354("module-info")));
        C24214 c24214 = this.f44284;
        c24214.m53530(c17450M11356);
        c5263.m11370();
        c24214.m53530(c5263.m11371(c24214.m53532()));
        c5263.m11366();
        m35263((C8792[]) new C9286[]{this.f40161, this.f40163});
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35263(C8792... c8792Arr) {
        for (C8792 c8792 : c8792Arr) {
            if (c8792 != null) {
                if (c8792 instanceof C9286) {
                    C7480.stream(((C9286) c8792).getElements()).map(new C14156()).forEach(new Consumer() { // from class: l.֨۫ۚ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C24719.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* JADX INFO: renamed from: accept */
                        public final void m45213n(Object obj) {
                            ((InterfaceC13980) obj).mo16297(this.f6838.f40167);
                        }
                    });
                } else {
                    c8792.mo16297(this.f40167);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m35264() {
        C9286<C22185> c9286 = this.f44282;
        C6091 c6091 = this.f44275;
        if (c9286 != null) {
            int i = 1;
            for (C22185 c22185 : c9286) {
                StringBuilder sb = new StringBuilder(" InnerClass[");
                sb.append(i);
                sb.append("]: (");
                sb.append(EnumC8140.m18880(c22185.f70190, EnumC21552.INNER_CLASS));
                sb.append("), ");
                c6091.m48087(sb.toString(), new Object[0]);
                c6091.m48087("Name:  " + c22185.f70189.toString() + " ", new Object[0]);
                c6091.m48087("InnerClass_info:  " + c22185.f70191.toString() + " ", new Object[0]);
                c6091.m48090("OuterClass_info:  " + c22185.f70188.toString() + " ", new Object[0]);
                i++;
            }
            return;
        }
        c6091.m48090("<< NO INNER CLASSES >>", new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35269(InterfaceC2756 interfaceC2756) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        C7945 c7945;
        C8121 c8121;
        C8121 c8122 = (C8121) interfaceC2756;
        c8122.m18816(-889275714);
        C23563 c23563 = this.f44273;
        c8122.m18818(c23563.m52368());
        c8122.m18818(c23563.m52375());
        this.f40167.m11360(c8122);
        c8122.m18818(this.f40157);
        C24214 c24214 = this.f44284;
        c8122.m18818(c24214.m53532().f23817);
        c8122.m18818(c24214.m53531().f23817);
        ArrayList arrayList = this.f44287;
        if (arrayList != null) {
            c8122.m18818(arrayList.size());
            Iterator it = this.f44287.iterator();
            while (it.hasNext()) {
                c8122.m18818(((C8773) it.next()).f23817);
            }
        } else {
            c8122.m18818(0);
        }
        ArrayList arrayList2 = this.f44270;
        if (arrayList2 != null) {
            c8122.m18818(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C16148) it2.next()).m36734(c8122);
            }
        } else {
            c8122.m18818(0);
        }
        ArrayList<C13467> arrayList3 = this.f44286;
        if (arrayList3 != null) {
            c8122.m18818(arrayList3.size());
            for (C13467 c13467 : arrayList3) {
                c8122.m18818(c13467.f40157);
                c8122.m18818(c13467.f37792.f23817);
                c8122.m18818(c13467.f37797.f23817);
                C7945 c7945M32171 = c13467.m32171(c13467.f37799, c13467.f40166, c13467.f40164, c13467.f40158, c13467.f37800, c13467.f37794, c13467.f37795);
                C12126 c12126 = c13467.f37793;
                if (c12126 != null) {
                    c7945M32171.m18356(c12126);
                }
                C12126 c12127 = c13467.f37796;
                if (c12127 != null) {
                    c7945M32171.m18356(c12127);
                }
                c7945M32171.m18355(c8122);
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
            c8122.m18818(0);
        }
        C7748 c7748 = this.f44274;
        if (c7748 != null) {
            C9286 c9286 = this.f40163;
            C9286 c9287 = this.f40161;
            C8792[] c8792Arr = new C8792[3];
            c8792Arr[0] = c9286;
            c8792Arr[1] = c9287;
            c8792Arr[c4] = c7748;
            c7945 = new C7945();
            for (int i = 0; i < 3; i++) {
                C8792 c8792 = c8792Arr[i];
                if (c8792 != null) {
                    c7945.m18356(c8792);
                }
            }
            c8121 = c8122;
        } else {
            C8792 c8793 = this.f44289;
            C11338 c11338 = this.f44279;
            C3961 c3961 = this.f44276;
            C9286 c9288 = this.f44282;
            C8792 c8794 = this.f40166;
            C8792 c8795 = this.f40164;
            C20863 c20863 = this.f40158;
            C9286 c9289 = this.f40163;
            C9286 c92810 = this.f40161;
            C9286 c92811 = this.f40159;
            C9286 c92812 = this.f40160;
            C9286 c92813 = this.f44283;
            C20863 c20864 = this.f44281;
            C10430 c10430 = this.f44280;
            C24252 c24252 = this.f44278;
            C18160 c18160 = this.f44269;
            C6761 c6761 = this.f44288;
            C8792[] c8792Arr2 = new C8792[17];
            c8792Arr2[0] = c8793;
            c8792Arr2[1] = c11338;
            c8792Arr2[c4] = c3961;
            c8792Arr2[3] = c9288;
            c8792Arr2[c3] = c8794;
            c8792Arr2[c2] = c8795;
            c8792Arr2[c] = c20863;
            c8792Arr2[7] = c9289;
            c8792Arr2[8] = c92810;
            c8792Arr2[9] = c92811;
            c8792Arr2[10] = c92812;
            c8792Arr2[11] = c92813;
            c8792Arr2[12] = c20864;
            c8792Arr2[13] = c10430;
            c8792Arr2[14] = c24252;
            c8792Arr2[15] = c18160;
            c8792Arr2[16] = c6761;
            c7945 = new C7945();
            for (int i2 = 0; i2 < 17; i2++) {
                C8792 c8796 = c8792Arr2[i2];
                if (c8796 != null) {
                    c7945.m18356(c8796);
                }
            }
            c8121 = c8122;
        }
        c7945.m18355(c8121);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35270(InterfaceC3446 interfaceC3446) throws IOException {
        C8121 c8121 = this.f44271;
        try {
            DataOutputStream dataOutputStreamMo4343 = interfaceC3446.mo4343();
            try {
                c8121.m18814(dataOutputStreamMo4343);
                m35269(c8121);
                if (dataOutputStreamMo4343 != null) {
                    dataOutputStreamMo4343.close();
                }
            } catch (Throwable th) {
                if (dataOutputStreamMo4343 != null) {
                    try {
                        dataOutputStreamMo4343.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            boolean z = interfaceC3446 instanceof AbstractC6129;
            C6091 c6091 = this.f44275;
            if (z) {
                c6091.mo13866("Cannot write to {0}", ((AbstractC6129) interfaceC3446).mo4346());
            } else {
                c6091.mo13866("Cannot write to {0}", "output stream");
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35275(EnumC6799 enumC6799) {
        switch (C12145.f33955[enumC6799.ordinal()]) {
            case 1:
                return this.f40158 != null;
            case 2:
                return this.f44289 != null;
            case 3:
                return this.f44279 != null;
            case 4:
                return this.f44281 != null;
            case 5:
                C10430 c10430 = this.f44280;
                return (c10430 == null || c10430.f59449.size() == 0) ? false : true;
            case 6:
                C24252 c24252 = this.f44278;
                return (c24252 == null || c24252.f59449.size() == 0) ? false : true;
            case 7:
                C6761 c6761 = this.f44288;
                return (c6761 == null || c6761.f59449.size() == 0) ? false : true;
            case 8:
                return this.f44276 != null;
            case 9:
                return this.f44269 != null;
            default:
                throw new IllegalStateException(C20865.m47154("Unexpected attribute: ", enumC6799.m15521(), " in ", this.f40165.name()));
        }
    }
}
