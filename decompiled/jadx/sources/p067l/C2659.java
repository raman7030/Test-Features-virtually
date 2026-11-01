package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2659 {

    /* JADX INFO: renamed from: ֫ */
    public final C21545 f4447;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f4448;

    public C2659(C19247 c19247) {
        C21545 c21545 = new C21545();
        this.f4448 = c19247;
        this.f4447 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20766 m4096(String str, boolean z) throws C5276 {
        String str2;
        C19247 c19247 = this.f4448;
        String strM43850 = C19247.m43850(str, c19247.m43852(), MotionUtils.EASING_TYPE_PATH);
        C11872 c11872M43856 = c19247.m43856(strM43850);
        try {
            AbstractC17043 abstractC17043M43857 = c19247.m43857(strM43850);
            m4093(m4086(abstractC17043M43857), strM43850);
            String parent = abstractC17043M43857.getParent();
            if (!z) {
                C20766 c20766M4087 = m4087(strM43850, parent);
                c11872M43856.close();
                return c20766M4087;
            }
            C9385 c9385M43852 = c19247.m43852();
            do {
                c9385M43852.m21857(strM43850);
                str2 = c9385M43852.f25641;
                if (parent != null) {
                    c9385M43852.m21857(parent);
                }
                c9385M43852.m21855(strM43850);
                AbstractC17043 abstractC17043M43858 = c19247.m43857(strM43850);
                c19247.m43855(abstractC17043M43858, new C10707(strM43850, str2));
                m4093(m4086(abstractC17043M43858), strM43850);
                m4095(abstractC17043M43858, c9385M43852, strM43850);
                c9385M43852 = c19247.m43852();
            } while (!str2.equals(c9385M43852.f25641));
            c9385M43852.m21857(strM43850);
            if (parent != null) {
                c9385M43852.m21857(parent);
            }
            c9385M43852.m21855(strM43850);
            AbstractC17043 abstractC17043M43859 = c19247.m43857(strM43850);
            c19247.m43855(abstractC17043M43859, new C10707(strM43850, c9385M43852.f25641));
            m4093(m4086(abstractC17043M43859), strM43850);
            C20766 c20766M4088 = m4088(abstractC17043M43859, c9385M43852, strM43850);
            c11872M43856.close();
            return c20766M4088;
        } catch (Throwable th) {
            try {
                c11872M43856.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: ֫ */
    private C20766 m4087(String str, String str2) throws C5276 {
        C19247 c19247;
        String str3;
        EnumC15032 enumC15032;
        C9385 c9385M43852;
        String str4;
        boolean z;
        C5276 c5276M4081;
        ?? r6;
        JSONArray jSONArray;
        do {
            c19247 = this.f4448;
            C9385 c9385M43853 = c19247.m43852();
            c9385M43853.m21857(str);
            str3 = c9385M43853.f25641;
            if (str2 != null) {
                c9385M43853.m21857(str2);
            }
            c9385M43853.m21855(str);
            AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
            c19247.m43855(abstractC17043M43857, new C10707(str, str3));
            m4093(m4086(abstractC17043M43857), str);
            enumC15032 = EnumC15032.DELETE_EMPTY_DIRECTORY;
            m4085(abstractC17043M43857, enumC15032, str3, "delete_directory");
            c9385M43852 = c19247.m43852();
            str4 = c9385M43852.f25641;
        } while (!str3.equals(str4));
        AbstractC17043 abstractC17043M43858 = c19247.m43857(str);
        c19247.m43855(abstractC17043M43858, new C10707(str, str4));
        m4093(m4086(abstractC17043M43858), str);
        EnumC6986 enumC6986M4085 = m4085(abstractC17043M43858, enumC15032, str4, "delete_directory");
        String str5 = enumC6986M4085 == EnumC6986.ATOMIC ? "atomic" : "best_effort";
        JSONArray jSONArrayArray = JSON.array();
        try {
            abstractC17043M43858.mo25509().mo10737();
        } catch (C23750 e) {
            C6013 c6013M4084 = m4084(str, EnumC5645.DIRECTORY, enumC6986M4085);
            if (c6013M4084.f15058) {
                m4089(jSONArrayArray, "The backend reported an error after the directory disappeared.");
            } else {
                boolean z2 = c6013M4084.f15059;
                boolean z3 = c6013M4084.f15060;
                C5276 c5276M4083 = m4083(e);
                String str6 = c9385M43852.f25641;
                z = z3;
                c5276M4081 = m4081(c5276M4083, str, str6, str5, z2, z3, jSONArrayArray, 0, 0, str, "delete_directory", z);
                r6 = z2;
            }
            if (r6 == 0) {
                try {
                    this.f4447.getClass();
                    C19553.m44409();
                    C16114.m36693(str);
                    C18211.m41420();
                    jSONArray = jSONArrayArray;
                } catch (RuntimeException unused) {
                    jSONArray = jSONArrayArray;
                    m4089(jSONArray, "Directory change notification could not be completed.");
                }
            } else {
                this.f4447.getClass();
                C19553.m44409();
                C16114.m36693(str);
                C18211.m41420();
                jSONArray = jSONArrayArray;
            }
            if (c5276M4081 == null) {
                throw m4081(c5276M4081, str, c9385M43852.f25641, str5, r6, z, jSONArray, 0, 0, str, m4077(c5276M4081, "operation", "delete_directory"), z);
            }
            return new C20766(0, r6, new JSONArray(jSONArray), str);
        }
        c5276M4081 = null;
        r6 = 1;
        z = true;
        if (r6 == 0 || !z) {
            this.f4447.getClass();
            C19553.m44409();
            C16114.m36693(str);
            C18211.m41420();
        }
        jSONArray = jSONArrayArray;
        if (c5276M4081 == null) {
            throw m4081(c5276M4081, str, c9385M43852.f25641, str5, r6, z, jSONArray, 0, 0, str, m4077(c5276M4081, "operation", "delete_directory"), z);
        }
        return new C20766(0, r6, new JSONArray(jSONArray), str);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m4095(AbstractC17043 abstractC17043, C9385 c9385, String str) throws C5276 {
        String str2 = c9385.f25641;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C4672(abstractC17043));
        while (!arrayDeque.isEmpty()) {
            C4672 c4672 = (C4672) arrayDeque.peek();
            boolean z = c4672.f10509;
            AbstractC17043 abstractC17044 = c4672.f10506;
            if (!z) {
                String strMo25505 = abstractC17044.mo25505();
                c9385.m21857(strMo25505);
                c9385.m21855(strMo25505);
                C14362 c14362M4086 = c4672.f10508;
                if (c14362M4086 == null) {
                    c14362M4086 = m4086(abstractC17044);
                }
                EnumC5645 enumC5645M32962 = c14362M4086.m32962();
                EnumC5645 enumC5645 = EnumC5645.MISSING;
                C19247 c19247 = this.f4448;
                if (enumC5645M32962 == enumC5645) {
                    if (strMo25505.equals(str)) {
                        c19247.getClass();
                        throw C19247.m43851(str);
                    }
                    arrayDeque.pop();
                } else {
                    if (c14362M4086.m32962() != EnumC5645.DIRECTORY) {
                        throw m4080(strMo25505, c14362M4086.m32962());
                    }
                    m4085(abstractC17044, EnumC15032.DELETE_EMPTY_DIRECTORY, str2, "preflight_delete_directory");
                    c19247.getClass();
                    try {
                        C4672.m9903(c4672, abstractC17044.mo25509().mo10728(c14362M4086), str, str2);
                    } catch (C23750 e) {
                        throw C19247.m43849(e);
                    }
                }
            } else if (c4672.f10507 >= c4672.f10505.size()) {
                arrayDeque.pop();
            } else {
                List list = c4672.f10505;
                int i = c4672.f10507;
                c4672.f10507 = i + 1;
                String strM4094 = m4094(c4672, (C14362) list.get(i), str, str2);
                c9385.m21857(strM4094);
                c9385.m21855(strM4094);
                C14362 c14362 = (C14362) c4672.f10505.get(c4672.f10507 - 1);
                AbstractC17043 abstractC17043M32959 = c14362.m32959();
                int i2 = C17411.f52045[c14362.m32962().ordinal()];
                if (i2 == 2) {
                    arrayDeque.push(new C4672(abstractC17043M32959, c14362, 0));
                } else if (i2 == 3 || i2 == 4) {
                    m4085(abstractC17043M32959, EnumC15032.DELETE_FILE_OR_LINK, str2, "preflight_delete_file");
                } else if (i2 == 5) {
                    throw m4080(strM4094, c14362.m32962());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r19v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [l.֡ۡۜ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ֫ */
    private C20766 m4088(AbstractC17043 abstractC17043, C9385 c9385, String str) throws C5276 {
        C20095 c20095;
        boolean z;
        C20095 c20096;
        ?? r8;
        ?? r7;
        C5276 c5276M4081;
        C20095 c20097;
        ?? r12;
        ?? r11;
        ?? r9;
        ?? r10;
        ?? r13;
        ?? r14;
        ?? r15 = str;
        ?? Array = JSON.array();
        C20095 c20098 = new C20095();
        int i = 1;
        c20098.f62186 = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C4672(abstractC17043));
        while (!arrayDeque.isEmpty()) {
            try {
                C4672 c4672 = (C4672) arrayDeque.peek();
                if (!c4672.f10509) {
                    try {
                        m4092(c4672, r15, c9385, c20098);
                        if (!c4672.f10509) {
                            arrayDeque.pop();
                        }
                    } catch (C5276 e) {
                        e = e;
                        ?? r23 = r15;
                        r15 = Array;
                        Array = r23;
                        c20095 = c20098;
                        z = true;
                        String str2 = c9385.f25641;
                        if (c20095.f62187 == null) {
                            c20095.f62187 = m4077(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                            c20095.f62189 = m4077(e, "operation", "delete_tree");
                            c20095.f62186 = z;
                            c20095.f62188 = false;
                        }
                        c20096 = c20095;
                        c5276M4081 = m4081(e, str, str2, "non_atomic", C20095.m45521(c20095), c20095.f62186, r15, c20095.f62185, c20095.f62184, c20095.f62187, c20095.f62189, c20095.f62188);
                        r7 = Array;
                        r8 = r15;
                        if (C20095.m45521(c20096)) {
                            try {
                                this.f4447.getClass();
                                C19553.m44409();
                                C16114.m36693(str);
                                C18211.m41420();
                            } catch (RuntimeException unused) {
                                m4089((JSONArray) r8, "Directory change notification could not be completed.");
                            }
                        }
                        if (c5276M4081 == null) {
                            C20095 c20099 = c20096;
                            throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c20099), c20099.f62186, r8, c20099.f62185, c20099.f62184, c20099.f62187, c20099.f62189, c20099.f62188);
                        }
                        C20095 c200910 = c20096;
                        return new C20766(c200910.f62185, c200910.f62184, new JSONArray((JSONArray) r8), r7);
                    }
                } else {
                    if (c4672.f10507 < c4672.f10505.size()) {
                        List list = c4672.f10505;
                        int i2 = c4672.f10507;
                        c4672.f10507 = i2 + 1;
                        String strM4094 = m4094(c4672, (C14362) list.get(i2), r15, c9385.f25641);
                        c9385.m21857(strM4094);
                        c9385.m21855(strM4094);
                        AbstractC17043 abstractC17043M32959 = ((C14362) c4672.f10505.get(c4672.f10507 - i)).m32959();
                        try {
                            C14362 c14362M4086 = m4086(abstractC17043M32959);
                            int i3 = C17411.f52045[c14362M4086.m32962().ordinal()];
                            if (i3 == 2) {
                                c20097 = c20098;
                                r13 = Array;
                                r14 = r15;
                                arrayDeque.push(new C4672(abstractC17043M32959));
                            } else if (i3 == 3 || i3 == 4) {
                                try {
                                    c20097 = c20098;
                                    r12 = Array;
                                    r11 = r15;
                                    try {
                                        m4090(str, strM4094, abstractC17043M32959, c14362M4086.m32962(), c9385, c20097, r12);
                                        r14 = r11;
                                        r13 = r12;
                                    } catch (C5276 e2) {
                                        e = e2;
                                        Array = r11;
                                        r15 = r12;
                                        c20098 = c20097;
                                        c20095 = c20098;
                                        z = true;
                                        String str3 = c9385.f25641;
                                        if (c20095.f62187 == null) {
                                            c20095.f62187 = m4077(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                            c20095.f62189 = m4077(e, "operation", "delete_tree");
                                            c20095.f62186 = z;
                                            c20095.f62188 = false;
                                        }
                                        c20096 = c20095;
                                        c5276M4081 = m4081(e, str, str3, "non_atomic", C20095.m45521(c20095), c20095.f62186, r15, c20095.f62185, c20095.f62184, c20095.f62187, c20095.f62189, c20095.f62188);
                                        r7 = Array;
                                        r8 = r15;
                                        if (C20095.m45521(c20096)) {
                                            this.f4447.getClass();
                                            C19553.m44409();
                                            C16114.m36693(str);
                                            C18211.m41420();
                                        }
                                        if (c5276M4081 == null) {
                                            C20095 c200911 = c20096;
                                            throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c200911), c200911.f62186, r8, c200911.f62185, c200911.f62184, c200911.f62187, c200911.f62189, c200911.f62188);
                                        }
                                        C20095 c200912 = c20096;
                                        return new C20766(c200912.f62185, c200912.f62184, new JSONArray((JSONArray) r8), r7);
                                    }
                                } catch (C5276 e3) {
                                    e = e3;
                                    c20097 = c20098;
                                    r12 = Array;
                                    r11 = r15;
                                    Array = r11;
                                    r15 = r12;
                                    c20098 = c20097;
                                    c20095 = c20098;
                                    z = true;
                                    String str4 = c9385.f25641;
                                    if (c20095.f62187 == null) {
                                        c20095.f62187 = m4077(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                        c20095.f62189 = m4077(e, "operation", "delete_tree");
                                        c20095.f62186 = z;
                                        c20095.f62188 = false;
                                    }
                                    c20096 = c20095;
                                    c5276M4081 = m4081(e, str, str4, "non_atomic", C20095.m45521(c20095), c20095.f62186, r15, c20095.f62185, c20095.f62184, c20095.f62187, c20095.f62189, c20095.f62188);
                                    r7 = Array;
                                    r8 = r15;
                                    if (C20095.m45521(c20096)) {
                                        this.f4447.getClass();
                                        C19553.m44409();
                                        C16114.m36693(str);
                                        C18211.m41420();
                                    }
                                    if (c5276M4081 == null) {
                                        C20095 c200913 = c20096;
                                        throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c200913), c200913.f62186, r8, c200913.f62185, c200913.f62184, c200913.f62187, c200913.f62189, c200913.f62188);
                                    }
                                    C20095 c200914 = c20096;
                                    return new C20766(c200914.f62185, c200914.f62184, new JSONArray((JSONArray) r8), r7);
                                }
                            } else {
                                if (i3 == 5) {
                                    throw m4082(m4080(strM4094, c14362M4086.m32962()), str, c9385.f25641, c20098, strM4094, "delete_file", true, false, (JSONArray) Array, false);
                                }
                                c20095 = c20098;
                                r11 = 1;
                                ?? r24 = r15;
                                r9 = Array;
                                r10 = r24;
                                r12 = r12;
                            }
                            r10 = r14;
                            r9 = r13;
                            c20095 = c20097;
                            r11 = 1;
                            r12 = r13;
                        } catch (C5276 e4) {
                            c20097 = c20098;
                            r12 = Array;
                            r11 = r15;
                            Array = r11;
                            r15 = r12;
                            c20098 = c20097;
                            throw m4082(e4, str, c9385.f25641, c20098, strM4094, "stat_entry", !C20095.m45521(c20097), true, (JSONArray) r15, false);
                        }
                    } else {
                        try {
                            ?? r25 = r15;
                            r15 = Array;
                            Array = r25;
                            z = true;
                            r11 = 1;
                            c20095 = c20098;
                            try {
                                m4091(str, c4672.f10506, c9385, c20098, r15);
                                arrayDeque.pop();
                                r10 = Array;
                                r9 = r15;
                                r12 = r12;
                            } catch (C5276 e5) {
                                e = e5;
                                String str5 = c9385.f25641;
                                if (c20095.f62187 == null) {
                                    c20095.f62187 = m4077(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                    c20095.f62189 = m4077(e, "operation", "delete_tree");
                                    c20095.f62186 = z;
                                    c20095.f62188 = false;
                                }
                                c20096 = c20095;
                                c5276M4081 = m4081(e, str, str5, "non_atomic", C20095.m45521(c20095), c20095.f62186, r15, c20095.f62185, c20095.f62184, c20095.f62187, c20095.f62189, c20095.f62188);
                                r7 = Array;
                                r8 = r15;
                                if (C20095.m45521(c20096)) {
                                    this.f4447.getClass();
                                    C19553.m44409();
                                    C16114.m36693(str);
                                    C18211.m41420();
                                }
                                if (c5276M4081 == null) {
                                    C20095 c200915 = c20096;
                                    throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c200915), c200915.f62186, r8, c200915.f62185, c200915.f62184, c200915.f62187, c200915.f62189, c200915.f62188);
                                }
                                C20095 c200916 = c20096;
                                return new C20766(c200916.f62185, c200916.f62184, new JSONArray((JSONArray) r8), r7);
                            }
                        } catch (C5276 e6) {
                            e = e6;
                            c20095 = c20098;
                            z = true;
                            String str6 = c9385.f25641;
                            if (c20095.f62187 == null) {
                                c20095.f62187 = m4077(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                c20095.f62189 = m4077(e, "operation", "delete_tree");
                                c20095.f62186 = z;
                                c20095.f62188 = false;
                            }
                            c20096 = c20095;
                            c5276M4081 = m4081(e, str, str6, "non_atomic", C20095.m45521(c20095), c20095.f62186, r15, c20095.f62185, c20095.f62184, c20095.f62187, c20095.f62189, c20095.f62188);
                            r7 = Array;
                            r8 = r15;
                            if (C20095.m45521(c20096)) {
                                this.f4447.getClass();
                                C19553.m44409();
                                C16114.m36693(str);
                                C18211.m41420();
                            }
                            if (c5276M4081 == null) {
                                C20095 c200917 = c20096;
                                throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c200917), c200917.f62186, r8, c200917.f62185, c200917.f62184, c200917.f62187, c200917.f62189, c200917.f62188);
                            }
                            C20095 c200918 = c20096;
                            return new C20766(c200918.f62185, c200918.f62184, new JSONArray((JSONArray) r8), r7);
                        }
                    }
                    c20098 = c20095;
                    i = 1;
                    ?? r26 = r9;
                    r15 = r10;
                    Array = r26;
                }
            } catch (C5276 e7) {
                e = e7;
                c20095 = c20098;
                z = true;
                ?? r27 = r15;
                r15 = Array;
                Array = r27;
            }
        }
        ?? r28 = r15;
        r8 = Array;
        r7 = r28;
        c5276M4081 = null;
        c20096 = c20098;
        if (C20095.m45521(c20096)) {
            this.f4447.getClass();
            C19553.m44409();
            C16114.m36693(str);
            C18211.m41420();
        }
        if (c5276M4081 == null) {
            C20095 c200919 = c20096;
            throw m4081(c5276M4081, str, c9385.f25641, "non_atomic", C20095.m45521(c200919), c200919.f62186, r8, c200919.f62185, c200919.f62184, c200919.f62187, c200919.f62189, c200919.f62188);
        }
        C20095 c2009110 = c20096;
        return new C20766(c2009110.f62185, c2009110.f62184, new JSONArray((JSONArray) r8), r7);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4092(C4672 c4672, String str, C9385 c9385, C20095 c20095) throws C5276 {
        AbstractC17043 abstractC17043 = c4672.f10506;
        String strMo25505 = abstractC17043.mo25505();
        c9385.m21857(strMo25505);
        String str2 = c9385.f25641;
        c9385.m21855(strMo25505);
        try {
            C14362 c14362M4086 = m4086(abstractC17043);
            EnumC5645 enumC5645M32962 = c14362M4086.m32962();
            EnumC5645 enumC5645 = EnumC5645.MISSING;
            C19247 c19247 = this.f4448;
            if (enumC5645M32962 == enumC5645) {
                if (strMo25505.equals(str) && c20095.f62184 == 0 && c20095.f62185 == 0) {
                    c19247.getClass();
                    throw C19247.m43851(str);
                }
                return;
            }
            if (c14362M4086.m32962() != EnumC5645.DIRECTORY) {
                throw m4082(m4080(strMo25505, c14362M4086.m32962()), str, c9385.f25641, c20095, strMo25505, "stat_directory", true, false, JSON.array(), false);
            }
            m4085(abstractC17043, EnumC15032.DELETE_EMPTY_DIRECTORY, str2, "delete_directory");
            try {
                c19247.getClass();
                try {
                    C4672.m9903(c4672, abstractC17043.mo25509().mo10738(), str, str2);
                } catch (C23750 e) {
                    throw C19247.m43849(e);
                }
            } catch (C5276 e2) {
                throw m4082(e2, str, c9385.f25641, c20095, strMo25505, "list_directory", !C20095.m45521(c20095), true, JSON.array(), false);
            }
        } catch (C5276 e3) {
            throw m4082(e3, str, c9385.f25641, c20095, strMo25505, "stat_directory", !C20095.m45521(c20095), true, JSON.array(), false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4090(String str, String str2, AbstractC17043 abstractC17043, EnumC5645 enumC5645, C9385 c9385, C20095 c20095, JSONArray jSONArray) throws C5276 {
        EnumC6986 enumC6986M4085 = m4085(abstractC17043, EnumC15032.DELETE_FILE_OR_LINK, c9385.f25641, "delete_file");
        try {
            abstractC17043.mo25509().mo10736();
            c20095.f62185++;
        } catch (C23750 e) {
            C6013 c6013M4084 = m4084(str2, enumC5645, enumC6986M4085);
            if (c6013M4084.f15058) {
                c20095.f62185++;
                m4089(jSONArray, "The backend reported an error after a file or link disappeared.");
            } else {
                C5276 c5276M4083 = m4083(e);
                String str3 = c9385.f25641;
                boolean z = c6013M4084.f15060;
                throw m4082(c5276M4083, str, str3, c20095, str2, "delete_file", z, z, jSONArray, c6013M4084.f15059);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4091(String str, AbstractC17043 abstractC17043, C9385 c9385, C20095 c20095, JSONArray jSONArray) throws C5276 {
        String strMo25505 = abstractC17043.mo25505();
        try {
            C14362 c14362M4086 = m4086(abstractC17043);
            if (c14362M4086.m32962() == EnumC5645.MISSING) {
                return;
            }
            if (c14362M4086.m32962() != EnumC5645.DIRECTORY) {
                throw m4082(m4080(strMo25505, c14362M4086.m32962()), str, c9385.f25641, c20095, strMo25505, "delete_directory", true, false, jSONArray, false);
            }
            EnumC6986 enumC6986M4085 = m4085(abstractC17043, EnumC15032.DELETE_EMPTY_DIRECTORY, c9385.f25641, "delete_directory");
            try {
                abstractC17043.mo25509().mo10737();
                c20095.f62184++;
            } catch (C23750 e) {
                C6013 c6013M4084 = m4084(strMo25505, EnumC5645.DIRECTORY, enumC6986M4085);
                if (c6013M4084.f15058) {
                    c20095.f62184++;
                    m4089(jSONArray, "The backend reported an error after a directory disappeared.");
                } else {
                    C5276 c5276M4083 = m4083(e);
                    String str2 = c9385.f25641;
                    boolean z = c6013M4084.f15060;
                    throw m4082(c5276M4083, str, str2, c20095, strMo25505, "delete_directory", z, z, jSONArray, c6013M4084.f15059);
                }
            }
        } catch (C5276 e2) {
            throw m4082(e2, str, c9385.f25641, c20095, strMo25505, "stat_directory", !C20095.m45521(c20095), true, jSONArray, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14362 m4086(AbstractC17043 abstractC17043) throws C5276 {
        try {
            return abstractC17043.mo25509().mo10732();
        } catch (C23750 e) {
            this.f4448.getClass();
            throw C19247.m43849(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C6013 m4084(String str, EnumC5645 enumC5645, EnumC6986 enumC6986) {
        C14362 c14362Mo10732;
        try {
            c14362Mo10732 = this.f4448.m43857(str).mo25509().mo10732();
        } catch (RuntimeException | C23750 unused) {
            c14362Mo10732 = null;
        }
        if (c14362Mo10732 != null && c14362Mo10732.m32962() == EnumC5645.MISSING) {
            return new C6013(true, true, true);
        }
        if (c14362Mo10732 != null && c14362Mo10732.m32962() == enumC5645) {
            return new C6013(false, true, false);
        }
        boolean z = enumC6986 == EnumC6986.ATOMIC;
        return new C6013(false, z, !z);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4093(C14362 c14362, String str) throws C5276 {
        int i = C17411.f52045[c14362.m32962().ordinal()];
        C19247 c19247 = this.f4448;
        if (i == 1) {
            c19247.getClass();
            throw C19247.m43851(str);
        }
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_DIRECTORY", "The requested delete root is not a directory.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links are not accepted as directory delete roots.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general directory tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5276 m4080(String str, EnumC5645 enumC5645) {
        EnumC5645 enumC5646 = EnumC5645.LINK;
        C19247 c19247 = this.f4448;
        if (enumC5645 == enumC5646) {
            c19247.getClass();
            return C19247.m43848("FILE_IS_SYMLINK", "A directory changed into a symbolic link during deletion.", str, enumC5645);
        }
        if (enumC5645 == EnumC5645.OTHER) {
            c19247.getClass();
            return C19247.m43848("FILE_UNSUPPORTED_TYPE", "The directory tree contains an unsupported special node.", str, enumC5645);
        }
        c19247.getClass();
        return C19247.m43848("FILE_NOT_DIRECTORY", "A directory changed type during deletion.", str, enumC5645);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC6986 m4085(AbstractC17043 abstractC17043, EnumC15032 enumC15032, String str, String str2) throws C5276 {
        EnumC6986 enumC6986Mo10729 = abstractC17043.mo25509().mo10729(enumC15032);
        if (enumC6986Mo10729 != EnumC6986.UNSUPPORTED) {
            return enumC6986Mo10729;
        }
        throw m4079("FILE_BACKEND_UNSUPPORTED", "The file backend does not support the required checked delete operation.", abstractC17043.mo25505(), str, str2, "unsupported", (String) null, JSON.array(), abstractC17043.mo25505(), str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m4094(C4672 c4672, C14362 c14362, String str, String str2) throws C5276 {
        String strMo25505 = c14362.m32959().mo25505();
        try {
            if (C14059.m31907(strMo25505, MotionUtils.EASING_TYPE_PATH).equals(strMo25505)) {
                String strSubstring = "/";
                if ("/".equals(strMo25505)) {
                    strSubstring = null;
                } else {
                    int iLastIndexOf = strMo25505.lastIndexOf(47);
                    if (iLastIndexOf != 0) {
                        strSubstring = strMo25505.substring(0, iLastIndexOf);
                    }
                }
                if (C12826.equals(strSubstring, c4672.f10506.mo25505()) && C14059.m31906(strMo25505, str)) {
                    return strMo25505;
                }
            }
            throw m4079("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo25505, "list_directory");
        } catch (C5276 unused) {
            throw m4079("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo25505, "list_directory");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5276 m4083(C23750 c23750) {
        this.f4448.getClass();
        C5276 c5276M43849 = C19247.m43849(c23750);
        return c23750.m52799() != EnumC23080.IO_ERROR ? c5276M43849 : C5276.m11407("FILE_DIRECTORY_DELETE_FAILED", "Failed to permanently delete a directory tree node.", "warning", (JSONArray) null, new JSONObject(c5276M43849.f12412));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m4082(C5276 c5276, String str, String str2, C20095 c20095, String str3, String str4, boolean z, boolean z2, JSONArray jSONArray, boolean z3) {
        c20095.f62187 = str3;
        c20095.f62189 = str4;
        c20095.f62186 = z;
        c20095.f62188 = z2;
        c20095.f62190 |= z3;
        return m4081(c5276, str, str2, "non_atomic", C20095.m45521(c20095), z, jSONArray, c20095.f62185, c20095.f62184, str3, str4, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m4081(C5276 c5276, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, int i2, String str4, String str5, boolean z3) {
        JSONObject jSONObject = c5276.f12412;
        JSONArray jSONArray2 = c5276.f12407;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("deletedFiles", i);
        jSONObject2.put("deletedDirectories", i2);
        jSONObject2.put("failedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failureStage", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("safeToRetry", z3);
        boolean z4 = "non_atomic".equals(str3) && (i > 0 || i2 > 0 || z);
        String str6 = z4 ? "FILE_DIRECTORY_DELETE_PARTIAL" : c5276.f12413;
        if (c5276.f12410 || z4) {
            return C5276.m11407(str6, c5276.getMessage(), "warning", jSONArray2, jSONObject2);
        }
        return C5276.m11411(str6, c5276.getMessage(), c5276.f12414, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m4079(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", false).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("deletedFiles", 0).add("deletedDirectories", 0).add("failedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failureStage", JSON.value(str9)).add("safeToRetry", false);
        return ("FILE_STORAGE_ERROR".equals(str) || "FILE_DIRECTORY_DELETE_FAILED".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C5276.m11411(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m4077(C5276 c5276, String str, String str2) {
        JSONValue jSONValue = c5276.f12412.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? str2 : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4089(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }
}
