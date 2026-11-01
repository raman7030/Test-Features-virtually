package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14553 {

    /* JADX INFO: renamed from: ܿ */
    public static final SecureRandom f41509;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f41510;

    /* JADX INFO: renamed from: ֫ */
    public final C25053 f41511;

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f41512;

    /* JADX INFO: renamed from: ܽ */
    public final C19247 f41513;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f41509 = secureRandom;
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        f41510 = C16111.m36665(bArr);
    }

    public C14553(C19247 c19247) {
        C25053 c25053 = new C25053();
        this.f41512 = new LinkedHashMap(16, 0.75f, true);
        this.f41513 = c19247;
        this.f41511 = c25053;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17234 m33277(String str, String str2, boolean z) throws C5276 {
        C19247 c19247 = this.f41513;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(str, c9385M43852, "sourcePath");
        String strM43850 = C19247.m43850(str2, c9385M43852, "destinationPath");
        if (strM43844.equals(strM43850)) {
            throw m33233("FILE_INVALID_PATH", "Source and destination must have different normalized absolute paths.", strM43844, strM43850, c9385M43852.f25641, "prepare", "same_path", false, null, true, JSON.array());
        }
        C11872 c11872M43854 = c19247.m43854(Arrays.asList(strM43844, strM43850));
        try {
            C17234 c17234M33243 = m33243(c9385M43852, strM43844, strM43850, z);
            c11872M43854.close();
            return c17234M33243;
        } catch (Throwable th) {
            try {
                c11872M43854.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6507 m33274(String str, boolean z, final C22797 c22797) throws C5276 {
        C19247 c19247 = this.f41513;
        C9385 c9385M43852 = c19247.m43852();
        String strM43850 = C19247.m43850(str, c9385M43852, "localPath");
        C11872 c11872M43856 = c19247.m43856(strM43850);
        try {
            try {
                C6507 c6507M33236 = m33236(strM43850, z, new InterfaceC5166() { // from class: l.ܳۖۜ
                    @Override // p067l.InterfaceC5166
                    /* JADX INFO: renamed from: ֫ */
                    public final C7177 mo11035(AbstractC17043 abstractC17043) {
                        return C14553.m33237(c22797, abstractC17043);
                    }

                    @Override // p067l.InterfaceC5166
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ void mo11036(C9385 c9385) {
                    }
                }, c9385M43852);
                c11872M43856.close();
                return c6507M33236;
            } catch (C5276 e) {
                throw m33235(e, strM43850, c9385M43852.f25641);
            }
        } catch (Throwable th) {
            try {
                c11872M43856.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2482 m33273(String str, boolean z, C9385 c9385, InterfaceC20589 interfaceC20589) throws C5276 {
        this.f41513.getClass();
        String strM43850 = C19247.m43850(str, c9385, MotionUtils.EASING_TYPE_PATH);
        if (!strM43850.equals(str)) {
            throw C5276.m11406("The claimed file path must be normalized and absolute.", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return new C2482(m33236(strM43850, z, new C24611(this, interfaceC20589, strM43850, c9385), c9385));
        } catch (C5276 e) {
            throw m33235(e, strM43850, c9385.f25641);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11042 m33276(String str, C23467 c23467) throws C5276 {
        C19247 c19247 = this.f41513;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(str, c9385M43852, "localPath");
        C11872 c11872M43853 = c19247.m43853(strM43844);
        try {
            try {
                AbstractC17043 abstractC17043M43857 = c19247.m43857(strM43844);
                C14362 c14362M33240 = m33240(abstractC17043M43857.mo25509());
                m33269(c14362M33240, strM43844);
                if (c14362M33240.m32961() > 9007199254740991L) {
                    throw m33234("FILE_STORAGE_ERROR", "The local source size exceeds the supported JSON integer range.", strM43844, c9385M43852.f25641, "source_stat", "size_out_of_range", false, null, true, JSON.array(), null, null);
                }
                C22601 c22601 = new C22601(this, strM43844, abstractC17043M43857, c14362M33240);
                c22601.f71336 = true;
                try {
                    C11042 c11042M31941 = C14079.m31941(c23467.f74730, c23467.f74731, c23467.f74732, c22601);
                    C22601.m50648(c22601);
                    c22601.f71336 = false;
                    c11872M43853.close();
                    return c11042M31941;
                } catch (Throwable th) {
                    c22601.f71336 = false;
                    throw th;
                }
            } catch (C5276 e) {
                throw m33235(e, strM43844, c9385M43852.f25641);
            }
        } catch (Throwable th2) {
            try {
                c11872M43853.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0258  */
    /* JADX WARN: Code duplicated, block: B:155:0x0261 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0263  */
    /* JADX WARN: Code duplicated, block: B:157:0x026c  */
    /* JADX WARN: Code duplicated, block: B:163:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:174:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x030a  */
    /* JADX WARN: Code duplicated, block: B:186:0x031f A[LOOP:1: B:184:0x0319->B:186:0x031f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x035f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0368  */
    /* JADX WARN: Code duplicated, block: B:192:0x0371  */
    /* JADX WARN: Code duplicated, block: B:194:0x0383  */
    /* JADX INFO: renamed from: ֫ */
    private C17234 m33243(C9385 c9385, String str, String str2, boolean z) throws C5276, C23750 {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2;
        boolean z3;
        String str8;
        boolean z4;
        boolean z5;
        String str9;
        boolean z6;
        String str10;
        String str11;
        boolean z7;
        String str12;
        C5276 c5276;
        boolean z8;
        C5276 c5276M33233;
        String simpleName;
        C5276 c5277;
        String str13;
        String str14;
        boolean z9;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str15;
        String str16;
        String str17;
        JSONArray jSONArray2;
        EnumC18385 enumC18385M43292;
        EnumC18385 enumC18385M43297;
        C14553 c14553 = this;
        C19247 c19247 = c14553.f41513;
        AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
        C14362 c14362M33240 = c14553.m33240(abstractC17043M43857.mo25509());
        c14553.m33269(c14362M33240, str);
        if (c14362M33240.m32961() > 9007199254740991L) {
            throw m33233("FILE_STORAGE_ERROR", "The source size exceeds the supported JSON integer range.", str, str2, c9385.f25641, "source_stat", "size_out_of_range", false, null, true, JSON.array());
        }
        JSONArray jSONArrayArray = JSON.array();
        C10530 c10530M33239 = m33239(str2, str, z, c9385, jSONArrayArray);
        AbstractC12351 abstractC12351 = c10530M33239.f29137;
        String str18 = c10530M33239.f29139;
        AbstractC17043 abstractC17043 = c10530M33239.f29138;
        String strMo25505 = abstractC17043.mo25505();
        C3153 c3153 = c10530M33239.f29140;
        String str19 = c3153.f5774;
        String str20 = c9385.f25641;
        String str21 = "copy_to_temp";
        RuntimeException runtimeException = null;
        long jM33228 = 0;
        String str22 = str19;
        try {
            try {
                m33248(str, str2, abstractC12351, c3153, str20, jSONArrayArray);
                jM33228 = m33228(abstractC17043M43857, abstractC17043);
                str3 = str20;
                while (true) {
                    try {
                        C9385 c9385M43852 = c19247.m43852();
                        String str23 = c9385M43852.f25641;
                        try {
                            try {
                                str21 = "pre_publish_validation";
                                c9385M43852.m21856(str);
                                c9385M43852.m21857(str2);
                                c9385M43852.m21857(str18);
                                c9385M43852.m21855(str2);
                                AbstractC17043 abstractC17043M43858 = c19247.m43857(str);
                                AbstractC12351 abstractC12351Mo25509 = abstractC17043M43858.mo25509();
                                c10530M33239.m24266(c9385M43852.f25641);
                                AbstractC17043 abstractC17044 = c10530M33239.f29135;
                                AbstractC12351 abstractC12352 = c10530M33239.f29137;
                                AbstractC17043 abstractC17045 = c10530M33239.f29138;
                                AbstractC12351 abstractC12353 = c10530M33239.f29143;
                                c14553.m33269(c14553.m33240(abstractC12351Mo25509), str);
                                C14362 c14362M33241 = c14553.m33240(abstractC12352);
                                c14553.m33255(c14362M33241, str2);
                                if (!z) {
                                    try {
                                        try {
                                            if (c14362M33241.m32962() != EnumC5645.MISSING) {
                                                str16 = str23;
                                                jSONArray2 = jSONArrayArray;
                                                try {
                                                    try {
                                                        try {
                                                            throw m33233("FILE_ALREADY_EXISTS", "The destination appeared before publication and overwrite is false.", str, str2, c9385M43852.f25641, "pre_publish_destination", "already_exists", false, str22, true, jSONArrayArray);
                                                        } catch (IOException e) {
                                                            e = e;
                                                            jSONArrayArray = jSONArray2;
                                                            str5 = str16;
                                                            str8 = str22;
                                                            z4 = false;
                                                            str9 = str8;
                                                            z6 = z4;
                                                            str10 = str5;
                                                            str12 = str21;
                                                            z7 = false;
                                                            if (z6) {
                                                                simpleName = e.getClass().getSimpleName();
                                                                c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                            } else {
                                                                c5276M33233 = m33233("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                            }
                                                            c5276 = c5276M33233;
                                                            z8 = z6;
                                                            str6 = str9;
                                                            c5277 = c5276;
                                                            str13 = str6;
                                                            m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                                                            if (runtimeException != null) {
                                                                throw runtimeException;
                                                            }
                                                            if (c5277 != null) {
                                                                str14 = c5277.f12413;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                    z9 = false;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject = c5277.f12412;
                                                                jSONArray = c5277.f12407;
                                                                str15 = c5277.f12414;
                                                                for (JSONObject.Member member : jSONObject) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                if (c5277.f12410) {
                                                                    throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    } catch (C5276 e3) {
                                                        e = e3;
                                                        jSONArrayArray = jSONArray2;
                                                        str6 = str22;
                                                        z3 = false;
                                                        z5 = false;
                                                        z7 = z5;
                                                        boolean z10 = z3;
                                                        c5276 = e;
                                                        z8 = z10;
                                                        c5277 = c5276;
                                                        str13 = str6;
                                                        m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                                                        if (runtimeException != null) {
                                                            throw runtimeException;
                                                        }
                                                        if (c5277 != null) {
                                                            str14 = c5277.f12413;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                z9 = false;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject2 = c5277.f12412;
                                                            jSONArray = c5277.f12407;
                                                            str15 = c5277.f12414;
                                                            while (r3.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                            if (c5277.f12410) {
                                                                throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                                                    }
                                                } catch (IOException e4) {
                                                    e = e4;
                                                } catch (RuntimeException e5) {
                                                    e = e5;
                                                    jSONArrayArray = jSONArray2;
                                                }
                                            }
                                        } catch (RuntimeException e6) {
                                            e = e6;
                                            str16 = str23;
                                            jSONArray2 = jSONArrayArray;
                                        }
                                        jSONArrayArray = jSONArray2;
                                    } catch (IOException e7) {
                                        e = e7;
                                        str16 = str23;
                                        jSONArray2 = jSONArrayArray;
                                    } catch (C5276 e8) {
                                        e = e8;
                                        jSONArray2 = jSONArrayArray;
                                    }
                                    str17 = str22;
                                    str22 = str17;
                                    str4 = str16;
                                    str7 = str22;
                                    z2 = false;
                                    str9 = str7;
                                    z6 = z2;
                                    str10 = str4;
                                    str11 = str21;
                                    z7 = false;
                                    if (m33272(e)) {
                                        if (z6) {
                                            simpleName = e.getClass().getSimpleName();
                                            c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                        } else {
                                            c5276M33233 = m33233("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                        }
                                        c5276 = c5276M33233;
                                        z8 = z6;
                                        str6 = str9;
                                        c5277 = c5276;
                                        str13 = str6;
                                    } else {
                                        c5277 = null;
                                        str13 = str9;
                                        runtimeException = e;
                                        z8 = z6;
                                    }
                                }
                                str16 = str23;
                                try {
                                    m33249(str, str2, c14553.m33240(abstractC12353), c9385M43852.f25641, jSONArrayArray);
                                    boolean z11 = c14362M33241.m32962() == EnumC5645.REGULAR;
                                    C3153 c3153M33266 = m33266(abstractC12353, z11);
                                    String str24 = c3153M33266.f5774;
                                    try {
                                        str9 = str24;
                                        try {
                                            try {
                                                m33248(str, str2, abstractC12352, c3153M33266, c9385M43852.f25641, jSONArrayArray);
                                                C19056 c19056 = new C19056();
                                                try {
                                                    try {
                                                        enumC18385M43292 = c19056.m43292(z11 ? abstractC17044 : abstractC17043M43858);
                                                    } catch (RuntimeException unused) {
                                                        enumC18385M43292 = EnumC18385.FAILED;
                                                    }
                                                    if (c9385M43852.f25641.equals(c19247.m43852().f25641)) {
                                                        if (enumC18385M43292 != EnumC18385.SUCCESS) {
                                                            m33247(jSONArrayArray, z11 ? "Existing destination mode, owner, or group metadata could not be fully captured." : "Source mode, owner, or group metadata could not be fully captured.");
                                                            c19056 = null;
                                                        }
                                                        try {
                                                            str21 = "publish";
                                                            boolean z12 = z11;
                                                            jSONArrayArray = jSONArrayArray;
                                                            try {
                                                                m33254(str2, abstractC17045, abstractC12353, abstractC17044, abstractC12352, c3153M33266, jM33228, c9385M43852.f25641);
                                                                try {
                                                                    try {
                                                                        str21 = "restore_metadata";
                                                                        AbstractC17043 abstractC17043M43859 = c19247.m43857(str2);
                                                                        if (c19056 != null) {
                                                                            try {
                                                                                enumC18385M43297 = c19056.m43297(abstractC17043M43859);
                                                                            } catch (RuntimeException unused2) {
                                                                                enumC18385M43297 = EnumC18385.FAILED;
                                                                            }
                                                                            if (enumC18385M43297 != EnumC18385.SUCCESS) {
                                                                                m33247(jSONArrayArray, z12 ? "Existing destination mode, owner, or group metadata could not be fully restored." : "Source mode, owner, or group metadata could not be fully applied to the destination.");
                                                                            }
                                                                        }
                                                                        if (!z12) {
                                                                            try {
                                                                                C18524.m42113(abstractC17043M43859);
                                                                            } catch (RuntimeException unused3) {
                                                                                m33247(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                            }
                                                                        }
                                                                        m33258(abstractC17043M43859, c14362M33240.m32960(), jSONArrayArray);
                                                                        z8 = true;
                                                                        c5277 = null;
                                                                        str13 = str9;
                                                                        z7 = true;
                                                                        break;
                                                                    } catch (RuntimeException e9) {
                                                                        e = e9;
                                                                        str11 = str21;
                                                                        str10 = str16;
                                                                        z6 = true;
                                                                        z7 = true;
                                                                        if (m33272(e)) {
                                                                            c5277 = null;
                                                                            str13 = str9;
                                                                            runtimeException = e;
                                                                            z8 = z6;
                                                                        } else {
                                                                            if (z6) {
                                                                                simpleName = e.getClass().getSimpleName();
                                                                                c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                            } else {
                                                                                c5276M33233 = m33233("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                            }
                                                                            c5276 = c5276M33233;
                                                                            z8 = z6;
                                                                            str6 = str9;
                                                                            c5277 = c5276;
                                                                            str13 = str6;
                                                                        }
                                                                    }
                                                                } catch (IOException e10) {
                                                                    e = e10;
                                                                    str12 = str21;
                                                                    str10 = str16;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                    if (z6) {
                                                                        simpleName = e.getClass().getSimpleName();
                                                                        c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                    } else {
                                                                        c5276M33233 = m33233("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                    }
                                                                    c5276 = c5276M33233;
                                                                    z8 = z6;
                                                                    str6 = str9;
                                                                    c5277 = c5276;
                                                                    str13 = str6;
                                                                } catch (C5276 e11) {
                                                                    e = e11;
                                                                    z3 = true;
                                                                    z5 = true;
                                                                    str6 = str9;
                                                                    z7 = z5;
                                                                    boolean z13 = z3;
                                                                    c5276 = e;
                                                                    z8 = z13;
                                                                    c5277 = c5276;
                                                                    str13 = str6;
                                                                }
                                                            } catch (IOException e12) {
                                                                e = e12;
                                                                str5 = str16;
                                                                str8 = str9;
                                                                z4 = true;
                                                                str9 = str8;
                                                                z6 = z4;
                                                                str10 = str5;
                                                                str12 = str21;
                                                                z7 = false;
                                                            } catch (RuntimeException e13) {
                                                                e = e13;
                                                                str4 = str16;
                                                                str7 = str9;
                                                                z2 = true;
                                                                str9 = str7;
                                                                z6 = z2;
                                                                str10 = str4;
                                                                str11 = str21;
                                                                z7 = false;
                                                            } catch (C5276 e14) {
                                                                e = e14;
                                                                z3 = true;
                                                                str6 = str9;
                                                                z5 = false;
                                                                z7 = z5;
                                                                boolean z14 = z3;
                                                                c5276 = e;
                                                                z8 = z14;
                                                                c5277 = c5276;
                                                                str13 = str6;
                                                                m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                                                                if (runtimeException != null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (c5277 != null) {
                                                                    str14 = c5277.f12413;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                        z9 = false;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = c5277.f12412;
                                                                    jSONArray = c5277.f12407;
                                                                    str15 = c5277.f12414;
                                                                    while (r3.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                    if (c5277.f12410) {
                                                                        throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                                                            }
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (RuntimeException e16) {
                                                            e = e16;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (C5276 e17) {
                                                            e = e17;
                                                            jSONArrayArray = jSONArrayArray;
                                                        }
                                                    } else {
                                                        c14553 = this;
                                                        str3 = str16;
                                                        str22 = str9;
                                                    }
                                                } catch (IOException e18) {
                                                    e = e18;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str22 = str9;
                                                    str5 = str16;
                                                    str8 = str22;
                                                    z4 = false;
                                                } catch (C5276 e19) {
                                                    e = e19;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str6 = str9;
                                                    z3 = false;
                                                    z5 = false;
                                                    z7 = z5;
                                                    boolean z15 = z3;
                                                    c5276 = e;
                                                    z8 = z15;
                                                    c5277 = c5276;
                                                    str13 = str6;
                                                    m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                                                    if (runtimeException != null) {
                                                        throw runtimeException;
                                                    }
                                                    if (c5277 != null) {
                                                        str14 = c5277.f12413;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                            z9 = false;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject4 = c5277.f12412;
                                                        jSONArray = c5277.f12407;
                                                        str15 = c5277.f12414;
                                                        while (r3.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                        if (c5277.f12410) {
                                                            throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                                                }
                                            } catch (RuntimeException e20) {
                                                e = e20;
                                                jSONArrayArray = jSONArrayArray;
                                                str17 = str9;
                                                str22 = str17;
                                                str4 = str16;
                                                str7 = str22;
                                                z2 = false;
                                            }
                                        } catch (IOException e21) {
                                            e = e21;
                                        } catch (C5276 e22) {
                                            e = e22;
                                        }
                                    } catch (IOException e23) {
                                        e = e23;
                                        str9 = str24;
                                    } catch (RuntimeException e24) {
                                        e = e24;
                                        jSONArrayArray = jSONArrayArray;
                                        str22 = str24;
                                        str17 = str22;
                                    } catch (C5276 e25) {
                                        e = e25;
                                        str9 = str24;
                                    }
                                } catch (IOException e26) {
                                    e = e26;
                                    jSONArrayArray = jSONArrayArray;
                                    str5 = str16;
                                    str8 = str22;
                                    z4 = false;
                                    str9 = str8;
                                    z6 = z4;
                                    str10 = str5;
                                    str12 = str21;
                                    z7 = false;
                                    if (z6) {
                                        simpleName = e.getClass().getSimpleName();
                                        c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                    } else {
                                        c5276M33233 = m33233("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                    }
                                    c5276 = c5276M33233;
                                    z8 = z6;
                                    str6 = str9;
                                    c5277 = c5276;
                                    str13 = str6;
                                    m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                                    if (runtimeException != null) {
                                        throw runtimeException;
                                    }
                                    if (c5277 != null) {
                                        str14 = c5277.f12413;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject5 = c5277.f12412;
                                        jSONArray = c5277.f12407;
                                        str15 = c5277.f12414;
                                        while (r3.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                        if (c5277.f12410) {
                                            throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                        }
                                        throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                                    }
                                    return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                                } catch (RuntimeException e27) {
                                    e = e27;
                                    jSONArrayArray = jSONArrayArray;
                                }
                            } catch (RuntimeException e28) {
                                e = e28;
                                str16 = str23;
                            }
                        } catch (IOException e29) {
                            e = e29;
                            str16 = str23;
                        }
                    } catch (IOException e30) {
                        e = e30;
                        str5 = str3;
                        str22 = str22;
                        str8 = str22;
                        z4 = false;
                        str9 = str8;
                        z6 = z4;
                        str10 = str5;
                        str12 = str21;
                        z7 = false;
                        if (z6) {
                            simpleName = e.getClass().getSimpleName();
                            c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                        } else {
                            c5276M33233 = m33233("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                        }
                        c5276 = c5276M33233;
                        z8 = z6;
                        str6 = str9;
                        c5277 = c5276;
                        str13 = str6;
                        m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        if (c5277 != null) {
                            str14 = c5277.f12413;
                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            jSONObjectObject = JSON.object();
                            JSONObject<JSONObject.Member> jSONObject6 = c5277.f12412;
                            jSONArray = c5277.f12407;
                            str15 = c5277.f12414;
                            while (r3.hasNext()) {
                                jSONObjectObject.put(member.getName(), member.getValue());
                            }
                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                            if (c5277.f12410) {
                                throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                            }
                            throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
                        }
                        return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
                    } catch (RuntimeException e31) {
                        e = e31;
                        str4 = str3;
                        str22 = str22;
                    }
                    str9 = str8;
                    z6 = z4;
                    str10 = str5;
                    str12 = str21;
                    z7 = false;
                    if (z6) {
                        simpleName = e.getClass().getSimpleName();
                        c5276M33233 = m33233("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                    } else {
                        c5276M33233 = m33233("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                    }
                    c5276 = c5276M33233;
                    z8 = z6;
                    str6 = str9;
                    c5277 = c5276;
                    str13 = str6;
                }
            } catch (C5276 e32) {
                e = e32;
                jSONArrayArray = jSONArrayArray;
            }
        } catch (IOException e33) {
            e = e33;
            str3 = str20;
        } catch (RuntimeException e34) {
            e = e34;
            str3 = str20;
        }
        m33250(strMo25505, str2, z8, jSONArrayArray, runtimeException);
        if (runtimeException != null) {
            throw runtimeException;
        }
        if (c5277 != null) {
            str14 = c5277.f12413;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14) || (z8 && (z7 || !"atomic".equals(str13)))) {
                z9 = false;
            } else {
                z9 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject7 = c5277.f12412;
            jSONArray = c5277.f12407;
            str15 = c5277.f12414;
            while (r3.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
            if (c5277.f12410) {
                throw C5276.m11407(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
            }
            throw C5276.m11411(str14, c5277.getMessage(), str15, jSONArray, jSONObjectObject);
        }
        return new C17234(str, str2, new JSONArray(jSONArrayArray), jM33228);
    }

    /* JADX WARN: Code duplicated, block: B:238:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:250:0x043c  */
    /* JADX WARN: Code duplicated, block: B:251:0x0449  */
    /* JADX WARN: Code duplicated, block: B:260:0x0481  */
    /* JADX WARN: Code duplicated, block: B:261:0x048e  */
    /* JADX WARN: Code duplicated, block: B:273:0x04dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:274:0x04de  */
    /* JADX WARN: Code duplicated, block: B:276:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:281:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:285:0x050b A[LOOP:1: B:283:0x0505->B:285:0x050b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:288:0x0553  */
    /* JADX WARN: Code duplicated, block: B:289:0x055c  */
    /* JADX WARN: Code duplicated, block: B:291:0x0565  */
    /* JADX WARN: Code duplicated, block: B:293:0x0578  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* JADX INFO: renamed from: ֫ */
    private C6507 m33236(String str, boolean z, InterfaceC5166 interfaceC5166, C9385 c9385) throws C5276, C23750 {
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        String str3;
        long j;
        boolean z5;
        String str4;
        boolean z6;
        String str5;
        long j2;
        boolean z7;
        C5276 c5276;
        String simpleName;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z8;
        boolean z9;
        RuntimeException runtimeException;
        boolean z10;
        Object obj2;
        String str10;
        String str11;
        boolean z11;
        C5276 c5276M33234;
        boolean z12;
        RuntimeException runtimeException2;
        RuntimeException runtimeException3;
        RuntimeException runtimeException4;
        String str12;
        boolean z13;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str13;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z14;
        boolean z15;
        Object obj6;
        String str14;
        String str15;
        boolean z16;
        String str16;
        boolean z17;
        String str17;
        boolean z18;
        String str18;
        C19056 c19056;
        EnumC18385 enumC18385M43292;
        EnumC18385 enumC18385M43297;
        C14553 c14553 = this;
        String str19 = str;
        C19247 c19247 = c14553.f41513;
        JSONArray jSONArrayArray = JSON.array();
        C10530 c10530M33239 = m33239(str, (String) null, z, c9385, jSONArrayArray);
        AbstractC12351 abstractC12351 = c10530M33239.f29137;
        String str20 = c10530M33239.f29139;
        AbstractC17043 abstractC17043 = c10530M33239.f29138;
        String strMo25505 = abstractC17043.mo25505();
        C3153 c3153 = c10530M33239.f29140;
        String str21 = c3153.f5774;
        String str22 = c9385.f25641;
        String str23 = "produce_temp";
        long j3 = 0;
        try {
            try {
                m33252(str19, abstractC12351, c3153, str22, jSONArrayArray);
                try {
                    C7177 c7177Mo11035 = interfaceC5166.mo11035(abstractC17043);
                    Object obj7 = c7177Mo11035.f18746;
                    try {
                        long j4 = c7177Mo11035.f18747;
                        while (true) {
                            try {
                                C9385 c9385M43852 = c19247.m43852();
                                String str24 = c9385M43852.f25641;
                                try {
                                    c9385M43852.m21857(str19);
                                    c9385M43852.m21857(str20);
                                    c9385M43852.m21855(str19);
                                    c10530M33239.m24266(c9385M43852.f25641);
                                    AbstractC17043 abstractC17044 = c10530M33239.f29135;
                                    AbstractC12351 abstractC12352 = c10530M33239.f29137;
                                    String str25 = str20;
                                    AbstractC17043 abstractC17045 = c10530M33239.f29138;
                                    Object obj8 = obj7;
                                    try {
                                        AbstractC12351 abstractC12353 = c10530M33239.f29143;
                                        C10530 c10530 = c10530M33239;
                                        C14362 c14362M33240 = c14553.m33240(abstractC12352);
                                        c14553.m33255(c14362M33240, str19);
                                        if (z) {
                                            str14 = str24;
                                            str15 = "pre_publish_validation";
                                        } else {
                                            str14 = str24;
                                            try {
                                                try {
                                                    str15 = "pre_publish_validation";
                                                    try {
                                                        if (c14362M33240.m32962() != EnumC5645.MISSING) {
                                                            j = j4;
                                                            try {
                                                                throw m33234("FILE_ALREADY_EXISTS", "The local destination appeared before publication and overwrite is false.", str, c9385M43852.f25641, "pre_publish_destination", "already_exists", false, str21, true, jSONArrayArray, null, null);
                                                            } catch (IOException e) {
                                                                e = e;
                                                                z15 = false;
                                                                obj5 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str19 = str19;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                z4 = false;
                                                                z5 = z15;
                                                                str4 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj5;
                                                                if (z5) {
                                                                    e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                }
                                                                runtimeException4 = null;
                                                                z12 = z5;
                                                                runtimeException2 = runtimeException4;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f12413;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject = e.f12412;
                                                                    jSONArray = e.f12407;
                                                                    str13 = e.f12414;
                                                                    for (JSONObject.Member member : jSONObject) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f12410) {
                                                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (C21260 e2) {
                                                                e = e2;
                                                                z14 = false;
                                                                obj4 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str19 = str19;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                z4 = false;
                                                                z3 = z14;
                                                                str3 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj4;
                                                                runtimeException3 = e.f66806;
                                                                if (z3) {
                                                                    c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                } else {
                                                                    simpleName = runtimeException3.getClass().getSimpleName();
                                                                    str6 = null;
                                                                    str7 = null;
                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                    z8 = false;
                                                                    z9 = true;
                                                                    c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                }
                                                                c5276 = c5276M33234;
                                                                e = null;
                                                                z12 = z3;
                                                                runtimeException2 = e;
                                                                e = c5276;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f12413;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject2 = e.f12412;
                                                                    jSONArray = e.f12407;
                                                                    str13 = e.f12414;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f12410) {
                                                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (RuntimeException e3) {
                                                                e = e3;
                                                                z2 = true;
                                                                z3 = false;
                                                                z4 = false;
                                                                obj = obj8;
                                                                str22 = str14;
                                                                str3 = str15;
                                                                if (z2) {
                                                                }
                                                                str2 = str19;
                                                                c5276 = null;
                                                                z12 = z3;
                                                                runtimeException2 = e;
                                                                e = c5276;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f12413;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = e.f12412;
                                                                    jSONArray = e.f12407;
                                                                    str13 = e.f12414;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f12410) {
                                                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        }
                                                    } catch (IOException e4) {
                                                        e = e4;
                                                        j = j4;
                                                        z15 = false;
                                                        obj5 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str19 = str19;
                                                        str22 = str14;
                                                        str23 = str15;
                                                        j3 = j;
                                                        z4 = false;
                                                        z5 = z15;
                                                        str4 = str23;
                                                        j = j3;
                                                        str2 = str19;
                                                        obj = obj5;
                                                        if (z5) {
                                                            e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                        } else {
                                                            e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                        }
                                                        runtimeException4 = null;
                                                        z12 = z5;
                                                        runtimeException2 = runtimeException4;
                                                        runtimeException = runtimeException2;
                                                        z10 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z11 = z12;
                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f12413;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject4 = e.f12412;
                                                            jSONArray = e.f12407;
                                                            str13 = e.f12414;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f12410) {
                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (C21260 e5) {
                                                        e = e5;
                                                        j = j4;
                                                        z14 = false;
                                                        obj4 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str19 = str19;
                                                        str22 = str14;
                                                        str23 = str15;
                                                        j3 = j;
                                                        z4 = false;
                                                        z3 = z14;
                                                        str3 = str23;
                                                        j = j3;
                                                        str2 = str19;
                                                        obj = obj4;
                                                        runtimeException3 = e.f66806;
                                                        if (z3) {
                                                            c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                        } else {
                                                            simpleName = runtimeException3.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z8 = false;
                                                            z9 = true;
                                                            c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                        }
                                                        c5276 = c5276M33234;
                                                        e = null;
                                                        z12 = z3;
                                                        runtimeException2 = e;
                                                        e = c5276;
                                                        runtimeException = runtimeException2;
                                                        z10 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z11 = z12;
                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f12413;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject5 = e.f12412;
                                                            jSONArray = e.f12407;
                                                            str13 = e.f12414;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f12410) {
                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (RuntimeException e6) {
                                                        e = e6;
                                                        j = j4;
                                                        z2 = true;
                                                        z3 = false;
                                                        z4 = false;
                                                        obj = obj8;
                                                        str22 = str14;
                                                        str3 = str15;
                                                        if (z2) {
                                                        }
                                                        str2 = str19;
                                                        c5276 = null;
                                                        z12 = z3;
                                                        runtimeException2 = e;
                                                        e = c5276;
                                                        runtimeException = runtimeException2;
                                                        z10 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z11 = z12;
                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f12413;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject6 = e.f12412;
                                                            jSONArray = e.f12407;
                                                            str13 = e.f12414;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f12410) {
                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (C5276 e7) {
                                                    e = e7;
                                                    j = j4;
                                                    obj6 = obj8;
                                                }
                                            } catch (IOException e8) {
                                                e = e8;
                                                str15 = "pre_publish_validation";
                                            } catch (C21260 e9) {
                                                e = e9;
                                                str15 = "pre_publish_validation";
                                            } catch (RuntimeException e10) {
                                                e = e10;
                                                str15 = "pre_publish_validation";
                                            }
                                            e = e;
                                            obj6 = obj8;
                                            str2 = str19;
                                            obj = obj6;
                                            str22 = str14;
                                            j3 = j;
                                            z6 = false;
                                            str5 = str21;
                                            j2 = j3;
                                            z7 = false;
                                            j = j2;
                                            str21 = str5;
                                            boolean z19 = z7;
                                            z5 = z6;
                                            runtimeException4 = null;
                                            z4 = z19;
                                            z12 = z5;
                                            runtimeException2 = runtimeException4;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                        }
                                        j = j4;
                                        try {
                                            try {
                                                m33268(str19, c14553.m33240(abstractC12353), c9385M43852.f25641, jSONArrayArray);
                                                boolean z20 = c14362M33240.m32962() == EnumC5645.REGULAR;
                                                C3153 c3153M33266 = m33266(abstractC12353, z20);
                                                String str26 = c3153M33266.f5774;
                                                try {
                                                    try {
                                                        m33252(str19, abstractC12352, c3153M33266, c9385M43852.f25641, jSONArrayArray);
                                                        if (z20) {
                                                            try {
                                                                try {
                                                                    c19056 = new C19056();
                                                                    try {
                                                                        enumC18385M43292 = c19056.m43292(abstractC17044);
                                                                    } catch (RuntimeException unused) {
                                                                        enumC18385M43292 = EnumC18385.FAILED;
                                                                    }
                                                                    if (enumC18385M43292 != EnumC18385.SUCCESS) {
                                                                        m33247(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully captured.");
                                                                        c19056 = null;
                                                                    }
                                                                } catch (C21260 e11) {
                                                                    e = e11;
                                                                    z14 = false;
                                                                    obj4 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str21 = str26;
                                                                    str22 = str14;
                                                                    str23 = str15;
                                                                    j3 = j;
                                                                    str19 = str19;
                                                                    z4 = false;
                                                                    z3 = z14;
                                                                    str3 = str23;
                                                                    j = j3;
                                                                    str2 = str19;
                                                                    obj = obj4;
                                                                    runtimeException3 = e.f66806;
                                                                    if (z3) {
                                                                        c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                    } else {
                                                                        simpleName = runtimeException3.getClass().getSimpleName();
                                                                        str6 = null;
                                                                        str7 = null;
                                                                        str8 = "FILE_STORAGE_ERROR";
                                                                        str9 = "The storage backend failed while preparing local file content.";
                                                                        z8 = false;
                                                                        z9 = true;
                                                                        c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                    }
                                                                    c5276 = c5276M33234;
                                                                    e = null;
                                                                    z12 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c5276;
                                                                    runtimeException = runtimeException2;
                                                                    z10 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z11 = z12;
                                                                } catch (RuntimeException e12) {
                                                                    e = e12;
                                                                    z2 = true;
                                                                    z3 = false;
                                                                    z4 = false;
                                                                    obj = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str21 = str26;
                                                                    str22 = str14;
                                                                    str3 = str15;
                                                                    str19 = str19;
                                                                    if (z2) {
                                                                    }
                                                                    str2 = str19;
                                                                    c5276 = null;
                                                                    z12 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c5276;
                                                                    runtimeException = runtimeException2;
                                                                    z10 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z11 = z12;
                                                                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                    if (runtimeException == null) {
                                                                        throw runtimeException;
                                                                    }
                                                                    if (e != null) {
                                                                        str12 = e.f12413;
                                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        jSONObjectObject = JSON.object();
                                                                        JSONObject<JSONObject.Member> jSONObject7 = e.f12412;
                                                                        jSONArray = e.f12407;
                                                                        str13 = e.f12414;
                                                                        while (r4.hasNext()) {
                                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                                        }
                                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                        if (e.f12410) {
                                                                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                }
                                                            } catch (IOException e13) {
                                                                e = e13;
                                                                z15 = false;
                                                                obj5 = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str21 = str26;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j3 = j;
                                                                str19 = str19;
                                                                z4 = false;
                                                                z5 = z15;
                                                                str4 = str23;
                                                                j = j3;
                                                                str2 = str19;
                                                                obj = obj5;
                                                                if (z5) {
                                                                    e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                }
                                                                runtimeException4 = null;
                                                                z12 = z5;
                                                                runtimeException2 = runtimeException4;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                            } catch (C5276 e14) {
                                                                e = e14;
                                                                z6 = false;
                                                                z7 = false;
                                                                obj = obj8;
                                                                jSONArrayArray = jSONArrayArray;
                                                                str2 = str19;
                                                                str5 = str26;
                                                                str22 = str14;
                                                                j2 = j;
                                                                j = j2;
                                                                str21 = str5;
                                                                boolean z110 = z7;
                                                                z5 = z6;
                                                                runtimeException4 = null;
                                                                z4 = z110;
                                                                z12 = z5;
                                                                runtimeException2 = runtimeException4;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f12413;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject8 = e.f12412;
                                                                    jSONArray = e.f12407;
                                                                    str13 = e.f12414;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f12410) {
                                                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        } else {
                                                            c19056 = null;
                                                        }
                                                        C19056 c19057 = c19056;
                                                        try {
                                                            interfaceC5166.mo11036(c9385M43852);
                                                            if (c9385M43852.f25641.equals(c19247.m43852().f25641)) {
                                                                try {
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                    try {
                                                                        m33254(str, abstractC17045, abstractC12353, abstractC17044, abstractC12352, c3153M33266, j, c9385M43852.f25641);
                                                                        try {
                                                                            try {
                                                                                AbstractC17043 abstractC17043M43857 = c19247.m43857(str19);
                                                                                if (c19057 != null) {
                                                                                    try {
                                                                                        enumC18385M43297 = c19057.m43297(abstractC17043M43857);
                                                                                    } catch (RuntimeException unused2) {
                                                                                        enumC18385M43297 = EnumC18385.FAILED;
                                                                                    }
                                                                                    if (enumC18385M43297 != EnumC18385.SUCCESS) {
                                                                                        m33247(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully restored.");
                                                                                    }
                                                                                }
                                                                                if (!z20) {
                                                                                    try {
                                                                                        C18524.m42113(abstractC17043M43857);
                                                                                    } catch (RuntimeException unused3) {
                                                                                        m33247(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                                    }
                                                                                }
                                                                                e = null;
                                                                                runtimeException = null;
                                                                                str2 = str19;
                                                                                str10 = str5;
                                                                                str11 = str14;
                                                                                z11 = true;
                                                                                z10 = true;
                                                                                break;
                                                                            } catch (IOException e15) {
                                                                                e = e15;
                                                                                z5 = true;
                                                                                z4 = true;
                                                                                str4 = "restore_metadata";
                                                                                str2 = str19;
                                                                                obj = obj2;
                                                                                str21 = str5;
                                                                                str22 = str14;
                                                                                if (z5) {
                                                                                    e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                                } else {
                                                                                    e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                                }
                                                                                runtimeException4 = null;
                                                                                z12 = z5;
                                                                                runtimeException2 = runtimeException4;
                                                                                runtimeException = runtimeException2;
                                                                                z10 = z4;
                                                                                obj2 = obj;
                                                                                str10 = str21;
                                                                                str11 = str22;
                                                                                z11 = z12;
                                                                            } catch (C5276 e16) {
                                                                                e = e16;
                                                                                z6 = true;
                                                                                z7 = true;
                                                                                str2 = str19;
                                                                                obj = obj2;
                                                                                str22 = str14;
                                                                                j2 = j;
                                                                                j = j2;
                                                                                str21 = str5;
                                                                                boolean z111 = z7;
                                                                                z5 = z6;
                                                                                runtimeException4 = null;
                                                                                z4 = z111;
                                                                                z12 = z5;
                                                                                runtimeException2 = runtimeException4;
                                                                                runtimeException = runtimeException2;
                                                                                z10 = z4;
                                                                                obj2 = obj;
                                                                                str10 = str21;
                                                                                str11 = str22;
                                                                                z11 = z12;
                                                                            }
                                                                        } catch (C21260 e17) {
                                                                            e = e17;
                                                                            z3 = true;
                                                                            z4 = true;
                                                                            str3 = "restore_metadata";
                                                                            str2 = str19;
                                                                            obj = obj2;
                                                                            str21 = str5;
                                                                            str22 = str14;
                                                                            runtimeException3 = e.f66806;
                                                                            if (z3) {
                                                                                c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                            } else {
                                                                                simpleName = runtimeException3.getClass().getSimpleName();
                                                                                str6 = null;
                                                                                str7 = null;
                                                                                str8 = "FILE_STORAGE_ERROR";
                                                                                str9 = "The storage backend failed while preparing local file content.";
                                                                                z8 = false;
                                                                                z9 = true;
                                                                                c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                            }
                                                                            c5276 = c5276M33234;
                                                                            e = null;
                                                                            z12 = z3;
                                                                            runtimeException2 = e;
                                                                            e = c5276;
                                                                            runtimeException = runtimeException2;
                                                                            z10 = z4;
                                                                            obj2 = obj;
                                                                            str10 = str21;
                                                                            str11 = str22;
                                                                            z11 = z12;
                                                                        } catch (RuntimeException e18) {
                                                                            e = e18;
                                                                            str3 = "restore_metadata";
                                                                            obj = obj2;
                                                                            str21 = str5;
                                                                            str22 = str14;
                                                                            z2 = true;
                                                                            z3 = true;
                                                                            z4 = true;
                                                                            if (z2) {
                                                                            }
                                                                            str2 = str19;
                                                                            c5276 = null;
                                                                            z12 = z3;
                                                                            runtimeException2 = e;
                                                                            e = c5276;
                                                                            runtimeException = runtimeException2;
                                                                            z10 = z4;
                                                                            obj2 = obj;
                                                                            str10 = str21;
                                                                            str11 = str22;
                                                                            z11 = z12;
                                                                        }
                                                                    } catch (IOException e19) {
                                                                        e = e19;
                                                                        str17 = "publish";
                                                                        z17 = true;
                                                                        z5 = z17;
                                                                        str4 = str17;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        if (z5) {
                                                                            e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                        } else {
                                                                            e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                                        }
                                                                        runtimeException4 = null;
                                                                        z12 = z5;
                                                                        runtimeException2 = runtimeException4;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f12413;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject9 = e.f12412;
                                                                            jSONArray = e.f12407;
                                                                            str13 = e.f12414;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f12410) {
                                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C21260 e20) {
                                                                        e = e20;
                                                                        str16 = "publish";
                                                                        z16 = true;
                                                                        z3 = z16;
                                                                        str3 = str16;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        runtimeException3 = e.f66806;
                                                                        if (z3) {
                                                                            c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                        } else {
                                                                            simpleName = runtimeException3.getClass().getSimpleName();
                                                                            str6 = null;
                                                                            str7 = null;
                                                                            str8 = "FILE_STORAGE_ERROR";
                                                                            str9 = "The storage backend failed while preparing local file content.";
                                                                            z8 = false;
                                                                            z9 = true;
                                                                            c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                        }
                                                                        c5276 = c5276M33234;
                                                                        e = null;
                                                                        z12 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c5276;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f12413;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject10 = e.f12412;
                                                                            jSONArray = e.f12407;
                                                                            str13 = e.f12414;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f12410) {
                                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (RuntimeException e21) {
                                                                        e = e21;
                                                                        str18 = "publish";
                                                                        z18 = true;
                                                                        z3 = z18;
                                                                        str3 = str18;
                                                                        str21 = str5;
                                                                        z4 = false;
                                                                        z2 = true;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        if (z2) {
                                                                        }
                                                                        str2 = str19;
                                                                        c5276 = null;
                                                                        z12 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c5276;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f12413;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject11 = e.f12412;
                                                                            jSONArray = e.f12407;
                                                                            str13 = e.f12414;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f12410) {
                                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C5276 e22) {
                                                                        e = e22;
                                                                        z6 = true;
                                                                        str2 = str19;
                                                                        obj = obj2;
                                                                        str22 = str14;
                                                                        j2 = j;
                                                                        z7 = false;
                                                                        j = j2;
                                                                        str21 = str5;
                                                                        boolean z112 = z7;
                                                                        z5 = z6;
                                                                        runtimeException4 = null;
                                                                        z4 = z112;
                                                                        z12 = z5;
                                                                        runtimeException2 = runtimeException4;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                    }
                                                                } catch (IOException e23) {
                                                                    e = e23;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C5276 e24) {
                                                                    e = e24;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C21260 e25) {
                                                                    e = e25;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (RuntimeException e26) {
                                                                    e = e26;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                }
                                                            } else {
                                                                c14553 = this;
                                                                obj7 = obj8;
                                                                str20 = str25;
                                                                c10530M33239 = c10530;
                                                                str21 = str26;
                                                                str22 = str14;
                                                                str23 = str15;
                                                                j4 = j;
                                                            }
                                                        } catch (RuntimeException e27) {
                                                            e = e27;
                                                            z3 = false;
                                                            z4 = false;
                                                            z2 = false;
                                                            obj = obj8;
                                                            str21 = str26;
                                                            str22 = str14;
                                                            str3 = str15;
                                                            if (z2) {
                                                            }
                                                            str2 = str19;
                                                            c5276 = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c5276;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                            m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                            if (runtimeException == null) {
                                                                throw runtimeException;
                                                            }
                                                            if (e != null) {
                                                                str12 = e.f12413;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject12 = e.f12412;
                                                                jSONArray = e.f12407;
                                                                str13 = e.f12414;
                                                                while (r4.hasNext()) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                if (e.f12410) {
                                                                    throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                        }
                                                    } catch (RuntimeException e28) {
                                                        e = e28;
                                                        obj2 = obj8;
                                                        jSONArrayArray = jSONArrayArray;
                                                        str21 = str26;
                                                        z18 = false;
                                                        str5 = str21;
                                                        str18 = str15;
                                                        z3 = z18;
                                                        str3 = str18;
                                                        str21 = str5;
                                                        z4 = false;
                                                        z2 = true;
                                                        obj = obj2;
                                                        str22 = str14;
                                                        if (z2 || !m33272(e)) {
                                                            str2 = str19;
                                                            c5276 = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c5276;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                        } else if (z3) {
                                                            e = m33267(jSONArrayArray, str19, str22, str21, e.getClass().getSimpleName());
                                                            runtimeException = null;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            str2 = str19;
                                                            z11 = z3;
                                                        } else {
                                                            simpleName = e.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z8 = false;
                                                            z9 = true;
                                                            str2 = str19;
                                                            c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                            c5276 = c5276M33234;
                                                            e = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c5276;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                        }
                                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f12413;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject13 = e.f12412;
                                                            jSONArray = e.f12407;
                                                            str13 = e.f12414;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f12410) {
                                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (IOException e29) {
                                                    e = e29;
                                                    obj2 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    z17 = false;
                                                    str5 = str21;
                                                    str17 = str15;
                                                    z5 = z17;
                                                    str4 = str17;
                                                    str21 = str5;
                                                    z4 = false;
                                                    str2 = str19;
                                                    obj = obj2;
                                                    str22 = str14;
                                                    if (z5) {
                                                        e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                    } else {
                                                        e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                                    }
                                                    runtimeException4 = null;
                                                    z12 = z5;
                                                    runtimeException2 = runtimeException4;
                                                    runtimeException = runtimeException2;
                                                    z10 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z11 = z12;
                                                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                    if (runtimeException == null) {
                                                        throw runtimeException;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f12413;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject14 = e.f12412;
                                                        jSONArray = e.f12407;
                                                        str13 = e.f12414;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f12410) {
                                                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                } catch (C5276 e30) {
                                                    e = e30;
                                                    obj6 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    str2 = str19;
                                                    obj = obj6;
                                                    str22 = str14;
                                                    j3 = j;
                                                    z6 = false;
                                                    str5 = str21;
                                                    j2 = j3;
                                                } catch (C21260 e31) {
                                                    e = e31;
                                                    obj2 = obj8;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str21 = str26;
                                                    z16 = false;
                                                    str5 = str21;
                                                    str16 = str15;
                                                    z3 = z16;
                                                    str3 = str16;
                                                    str21 = str5;
                                                    z4 = false;
                                                    str2 = str19;
                                                    obj = obj2;
                                                    str22 = str14;
                                                    runtimeException3 = e.f66806;
                                                    if (z3) {
                                                        c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                    } else {
                                                        simpleName = runtimeException3.getClass().getSimpleName();
                                                        str6 = null;
                                                        str7 = null;
                                                        str8 = "FILE_STORAGE_ERROR";
                                                        str9 = "The storage backend failed while preparing local file content.";
                                                        z8 = false;
                                                        z9 = true;
                                                        c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                    }
                                                    c5276 = c5276M33234;
                                                    e = null;
                                                    z12 = z3;
                                                    runtimeException2 = e;
                                                    e = c5276;
                                                    runtimeException = runtimeException2;
                                                    z10 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z11 = z12;
                                                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                                    if (runtimeException == null) {
                                                        throw runtimeException;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f12413;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject15 = e.f12412;
                                                        jSONArray = e.f12407;
                                                        str13 = e.f12414;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f12410) {
                                                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                }
                                            } catch (C5276 e32) {
                                                e = e32;
                                                obj6 = obj8;
                                            }
                                        } catch (IOException e33) {
                                            e = e33;
                                            obj2 = obj8;
                                            z17 = false;
                                            str5 = str21;
                                            str17 = str15;
                                            z5 = z17;
                                            str4 = str17;
                                            str21 = str5;
                                            z4 = false;
                                            str2 = str19;
                                            obj = obj2;
                                            str22 = str14;
                                            if (z5) {
                                                e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                            } else {
                                                e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                            }
                                            runtimeException4 = null;
                                            z12 = z5;
                                            runtimeException2 = runtimeException4;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                            m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f12413;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject16 = e.f12412;
                                                jSONArray = e.f12407;
                                                str13 = e.f12414;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f12410) {
                                                    throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (C21260 e34) {
                                            e = e34;
                                            obj2 = obj8;
                                            z16 = false;
                                            str5 = str21;
                                            str16 = str15;
                                            z3 = z16;
                                            str3 = str16;
                                            str21 = str5;
                                            z4 = false;
                                            str2 = str19;
                                            obj = obj2;
                                            str22 = str14;
                                            runtimeException3 = e.f66806;
                                            if (z3) {
                                                c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                            } else {
                                                simpleName = runtimeException3.getClass().getSimpleName();
                                                str6 = null;
                                                str7 = null;
                                                str8 = "FILE_STORAGE_ERROR";
                                                str9 = "The storage backend failed while preparing local file content.";
                                                z8 = false;
                                                z9 = true;
                                                c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                            }
                                            c5276 = c5276M33234;
                                            e = null;
                                            z12 = z3;
                                            runtimeException2 = e;
                                            e = c5276;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                            m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f12413;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject17 = e.f12412;
                                                jSONArray = e.f12407;
                                                str13 = e.f12414;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f12410) {
                                                    throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (RuntimeException e35) {
                                            e = e35;
                                            obj2 = obj8;
                                            z18 = false;
                                            str5 = str21;
                                            str18 = str15;
                                            z3 = z18;
                                            str3 = str18;
                                            str21 = str5;
                                            z4 = false;
                                            z2 = true;
                                            obj = obj2;
                                            str22 = str14;
                                            if (z2) {
                                            }
                                            str2 = str19;
                                            c5276 = null;
                                            z12 = z3;
                                            runtimeException2 = e;
                                            e = c5276;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                            m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f12413;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject18 = e.f12412;
                                                jSONArray = e.f12407;
                                                str13 = e.f12414;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f12410) {
                                                    throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        }
                                    } catch (IOException e36) {
                                        e = e36;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z17 = false;
                                        str5 = str21;
                                        str17 = str15;
                                        z5 = z17;
                                        str4 = str17;
                                        str21 = str5;
                                        z4 = false;
                                        str2 = str19;
                                        obj = obj2;
                                        str22 = str14;
                                        if (z5) {
                                            e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                        } else {
                                            e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                        }
                                        runtimeException4 = null;
                                        z12 = z5;
                                        runtimeException2 = runtimeException4;
                                        runtimeException = runtimeException2;
                                        z10 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z11 = z12;
                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f12413;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject19 = e.f12412;
                                            jSONArray = e.f12407;
                                            str13 = e.f12414;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f12410) {
                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C5276 e37) {
                                        e = e37;
                                        obj6 = obj8;
                                        str14 = str24;
                                        j = j4;
                                    } catch (C21260 e38) {
                                        e = e38;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z16 = false;
                                        str5 = str21;
                                        str16 = str15;
                                        z3 = z16;
                                        str3 = str16;
                                        str21 = str5;
                                        z4 = false;
                                        str2 = str19;
                                        obj = obj2;
                                        str22 = str14;
                                        runtimeException3 = e.f66806;
                                        if (z3) {
                                            c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                        } else {
                                            simpleName = runtimeException3.getClass().getSimpleName();
                                            str6 = null;
                                            str7 = null;
                                            str8 = "FILE_STORAGE_ERROR";
                                            str9 = "The storage backend failed while preparing local file content.";
                                            z8 = false;
                                            z9 = true;
                                            c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                        }
                                        c5276 = c5276M33234;
                                        e = null;
                                        z12 = z3;
                                        runtimeException2 = e;
                                        e = c5276;
                                        runtimeException = runtimeException2;
                                        z10 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z11 = z12;
                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f12413;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject110 = e.f12412;
                                            jSONArray = e.f12407;
                                            str13 = e.f12414;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f12410) {
                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (RuntimeException e39) {
                                        e = e39;
                                        obj2 = obj8;
                                        str14 = str24;
                                        str15 = "pre_publish_validation";
                                        j = j4;
                                        z18 = false;
                                        str5 = str21;
                                        str18 = str15;
                                        z3 = z18;
                                        str3 = str18;
                                        str21 = str5;
                                        z4 = false;
                                        z2 = true;
                                        obj = obj2;
                                        str22 = str14;
                                        if (z2) {
                                        }
                                        str2 = str19;
                                        c5276 = null;
                                        z12 = z3;
                                        runtimeException2 = e;
                                        e = c5276;
                                        runtimeException = runtimeException2;
                                        z10 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z11 = z12;
                                        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f12413;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject111 = e.f12412;
                                            jSONArray = e.f12407;
                                            str13 = e.f12414;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f12410) {
                                                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    }
                                } catch (IOException e40) {
                                    e = e40;
                                    obj2 = obj7;
                                } catch (RuntimeException e41) {
                                    e = e41;
                                    obj2 = obj7;
                                } catch (C5276 e42) {
                                    e = e42;
                                    obj6 = obj7;
                                } catch (C21260 e43) {
                                    e = e43;
                                    obj2 = obj7;
                                    str14 = str24;
                                    str15 = "pre_publish_validation";
                                    j = j4;
                                    z16 = false;
                                    str5 = str21;
                                    str16 = str15;
                                    z3 = z16;
                                    str3 = str16;
                                    str21 = str5;
                                    z4 = false;
                                    str2 = str19;
                                    obj = obj2;
                                    str22 = str14;
                                    runtimeException3 = e.f66806;
                                    if (z3) {
                                        c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                    } else {
                                        simpleName = runtimeException3.getClass().getSimpleName();
                                        str6 = null;
                                        str7 = null;
                                        str8 = "FILE_STORAGE_ERROR";
                                        str9 = "The storage backend failed while preparing local file content.";
                                        z8 = false;
                                        z9 = true;
                                        c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                    }
                                    c5276 = c5276M33234;
                                    e = null;
                                    z12 = z3;
                                    runtimeException2 = e;
                                    e = c5276;
                                    runtimeException = runtimeException2;
                                    z10 = z4;
                                    obj2 = obj;
                                    str10 = str21;
                                    str11 = str22;
                                    z11 = z12;
                                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                    if (runtimeException == null) {
                                        throw runtimeException;
                                    }
                                    if (e != null) {
                                        str12 = e.f12413;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject112 = e.f12412;
                                        jSONArray = e.f12407;
                                        str13 = e.f12414;
                                        while (r4.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                        if (e.f12410) {
                                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                }
                            } catch (IOException e44) {
                                e = e44;
                                obj5 = obj7;
                                j3 = j4;
                                z15 = false;
                                z4 = false;
                                z5 = z15;
                                str4 = str23;
                                j = j3;
                                str2 = str19;
                                obj = obj5;
                                if (z5) {
                                    e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                } else {
                                    e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                                }
                                runtimeException4 = null;
                                z12 = z5;
                                runtimeException2 = runtimeException4;
                                runtimeException = runtimeException2;
                                z10 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z11 = z12;
                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f12413;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject113 = e.f12412;
                                    jSONArray = e.f12407;
                                    str13 = e.f12414;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f12410) {
                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (RuntimeException e45) {
                                e = e45;
                                obj3 = obj7;
                                z2 = true;
                                j3 = j4;
                                z3 = false;
                                z4 = false;
                                str3 = str23;
                                j = j3;
                                obj = obj3;
                                if (z2) {
                                }
                                str2 = str19;
                                c5276 = null;
                                z12 = z3;
                                runtimeException2 = e;
                                e = c5276;
                                runtimeException = runtimeException2;
                                z10 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z11 = z12;
                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f12413;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject114 = e.f12412;
                                    jSONArray = e.f12407;
                                    str13 = e.f12414;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f12410) {
                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (C5276 e46) {
                                e = e46;
                                jSONArrayArray = jSONArrayArray;
                                j = j4;
                                str2 = str19;
                                obj = obj7;
                            } catch (C21260 e47) {
                                e = e47;
                                obj4 = obj7;
                                j3 = j4;
                                z14 = false;
                                z4 = false;
                                z3 = z14;
                                str3 = str23;
                                j = j3;
                                str2 = str19;
                                obj = obj4;
                                runtimeException3 = e.f66806;
                                if (z3) {
                                    c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                } else {
                                    simpleName = runtimeException3.getClass().getSimpleName();
                                    str6 = null;
                                    str7 = null;
                                    str8 = "FILE_STORAGE_ERROR";
                                    str9 = "The storage backend failed while preparing local file content.";
                                    z8 = false;
                                    z9 = true;
                                    c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                }
                                c5276 = c5276M33234;
                                e = null;
                                z12 = z3;
                                runtimeException2 = e;
                                e = c5276;
                                runtimeException = runtimeException2;
                                z10 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z11 = z12;
                                m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f12413;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject115 = e.f12412;
                                    jSONArray = e.f12407;
                                    str13 = e.f12414;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f12410) {
                                        throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            }
                        }
                    } catch (IOException e48) {
                        e = e48;
                        obj5 = obj7;
                    } catch (C5276 e49) {
                        e = e49;
                        jSONArrayArray = jSONArrayArray;
                        str2 = str19;
                        obj = obj7;
                    } catch (C21260 e50) {
                        e = e50;
                        obj4 = obj7;
                    } catch (RuntimeException e51) {
                        e = e51;
                        obj3 = obj7;
                        z2 = false;
                    }
                } catch (IOException e52) {
                    e = e52;
                    str2 = str19;
                    z5 = false;
                    z4 = false;
                    obj = null;
                    str4 = "produce_temp";
                    j = 0;
                    if (z5) {
                        e = m33267(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                    } else {
                        e = m33234("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
                    }
                    runtimeException4 = null;
                    z12 = z5;
                    runtimeException2 = runtimeException4;
                    runtimeException = runtimeException2;
                    z10 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z11 = z12;
                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                    if (runtimeException == null) {
                        throw runtimeException;
                    }
                    if (e != null) {
                        str12 = e.f12413;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject116 = e.f12412;
                        jSONArray = e.f12407;
                        str13 = e.f12414;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f12410) {
                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                } catch (C5276 e53) {
                    e = e53;
                    str2 = str19;
                    obj = null;
                } catch (C21260 e54) {
                    e = e54;
                    str2 = str19;
                    z3 = false;
                    z4 = false;
                    obj = null;
                    str3 = "produce_temp";
                    j = 0;
                    runtimeException3 = e.f66806;
                    if (z3) {
                        c5276M33234 = m33267(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                    } else {
                        simpleName = runtimeException3.getClass().getSimpleName();
                        str6 = null;
                        str7 = null;
                        str8 = "FILE_STORAGE_ERROR";
                        str9 = "The storage backend failed while preparing local file content.";
                        z8 = false;
                        z9 = true;
                        c5276M33234 = m33234(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                    }
                    c5276 = c5276M33234;
                    e = null;
                    z12 = z3;
                    runtimeException2 = e;
                    e = c5276;
                    runtimeException = runtimeException2;
                    z10 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z11 = z12;
                    m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
                    if (runtimeException == null) {
                        throw runtimeException;
                    }
                    if (e != null) {
                        str12 = e.f12413;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject117 = e.f12412;
                        jSONArray = e.f12407;
                        str13 = e.f12414;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f12410) {
                            throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                }
            } catch (RuntimeException e55) {
                e = e55;
                jSONArrayArray = jSONArrayArray;
                str19 = str19;
                z2 = false;
                z3 = false;
                z4 = false;
                obj = null;
                str3 = "produce_temp";
                j = 0;
            }
        } catch (IOException e56) {
            e = e56;
            str2 = str19;
        } catch (C5276 e57) {
            e = e57;
            str2 = str19;
        } catch (C21260 e58) {
            e = e58;
            str2 = str19;
        }
        m33250(strMo25505, str, z11, jSONArrayArray, runtimeException);
        if (runtimeException == null) {
            throw runtimeException;
        }
        if (e != null) {
            str12 = e.f12413;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12) || (z11 && (z10 || !"atomic".equals(str10)))) {
                z13 = false;
            } else {
                z13 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject118 = e.f12412;
            jSONArray = e.f12407;
            str13 = e.f12414;
            while (r4.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
            if (e.f12410) {
                throw C5276.m11407(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
            }
            throw C5276.m11411(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
        }
        return new C6507(obj2, str, str10, new JSONArray(jSONArrayArray), j);
    }

    /* JADX INFO: renamed from: ֫ */
    private C10530 m33239(String str, String str2, boolean z, C9385 c9385, JSONArray jSONArray) throws C5276, C23750 {
        C19247 c19247 = this.f41513;
        AbstractC17043 abstractC17043M43857 = c19247.m43857(str);
        AbstractC12351 abstractC12351Mo25509 = abstractC17043M43857.mo25509();
        C14362 c14362M33240 = m33240(abstractC12351Mo25509);
        m33255(c14362M33240, str);
        String str3 = str2 == null ? "The local destination" : "The destination";
        if (!z && c14362M33240.m32962() != EnumC5645.MISSING) {
            String str4 = c9385.f25641;
            String strConcat = str3.concat(" already exists and overwrite is false.");
            if (str2 == null) {
                throw m33234("FILE_ALREADY_EXISTS", strConcat, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array(), null, null);
            }
            throw m33233("FILE_ALREADY_EXISTS", strConcat, str2, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array());
        }
        String parent = abstractC17043M43857.getParent();
        if (parent == null) {
            String str5 = c9385.f25641;
            String strConcat2 = str3.concat(" has no writable parent directory.");
            if (str2 == null) {
                throw m33234("FILE_PARENT_NOT_FOUND", strConcat2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array(), null, null);
            }
            throw m33233("FILE_PARENT_NOT_FOUND", strConcat2, str2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array());
        }
        c9385.m21857(parent);
        String str6 = c9385.f25641;
        AbstractC17043 abstractC17043M43858 = c19247.m43857(parent);
        m33259(abstractC17043M43857, str, str6);
        m33251(str, abstractC17043M43858.mo25509(), str6);
        m33260(abstractC17043M43858, c9385, jSONArray);
        return new C10530(this, str, parent, abstractC17043M43857, abstractC12351Mo25509, m33242(jSONArray, str, parent, str6), c14362M33240.m32962() == EnumC5645.REGULAR);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33250(String str, String str2, boolean z, JSONArray jSONArray, RuntimeException runtimeException) {
        if (!m33263(str)) {
            m33247(jSONArray, "A temporary MCP file could not be removed.");
            if (runtimeException != null) {
                runtimeException.addSuppressed(new IOException("A temporary MCP file could not be removed"));
            }
        }
        if (z) {
            try {
                this.f41511.m54992(str2);
            } catch (RuntimeException e) {
                m33247(jSONArray, "File change notification could not be completed.");
                if (runtimeException == null || e == runtimeException) {
                    return;
                }
                runtimeException.addSuppressed(e);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ֫ */
    private p067l.C9859 m33238(java.lang.String r28, java.lang.String r29, p067l.InterfaceC11201 r30, p067l.C9385 r31) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C14553.m33238(java.lang.String, java.lang.String, l.ۢۖۜ, l.۟ۢۜ):l.۠ۖۜ");
    }

    /* JADX INFO: renamed from: ܽ */
    private void m33271(C14362 c14362, String str) throws C5276 {
        int i = C8518.f22864[c14362.m32962().ordinal()];
        C19247 c19247 = this.f41513;
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "Directories cannot be modified as file content.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links cannot be modified by generic file content tools.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be modified as file content.", str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m33269(C14362 c14362, String str) throws C5276 {
        int i = C8518.f22864[c14362.m32962().ordinal()];
        C19247 c19247 = this.f41513;
        if (i == 1) {
            c19247.getClass();
            throw C19247.m43851(str);
        }
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "Directories cannot be copied by mt_file_copy.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "Symbolic links cannot be copied by generic file tools.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "The source node type cannot be copied by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33255(C14362 c14362, String str) throws C5276 {
        int i = C8518.f22864[c14362.m32962().ordinal()];
        C19247 c19247 = this.f41513;
        if (i == 3) {
            throw C21740.m49020(c14362, c19247, "FILE_NOT_REGULAR", "A directory cannot be used as the file copy destination.", str);
        }
        if (i == 4) {
            throw C21740.m49020(c14362, c19247, "FILE_IS_SYMLINK", "A symbolic link cannot be used as the file copy destination.", str);
        }
        if (i == 5) {
            throw C21740.m49020(c14362, c19247, "FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33249(String str, String str2, C14362 c14362, String str3, JSONArray jSONArray) throws C5276 {
        if (c14362.m32962() == EnumC5645.REGULAR) {
            return;
        }
        throw m33233("FILE_STORAGE_ERROR", "The copied temporary file is no longer available for publication.", str, str2, str3, "pre_publish_temp", "temp_" + c14362.m32962().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m33268(String str, C14362 c14362, String str2, JSONArray jSONArray) throws C5276 {
        if (c14362.m32962() == EnumC5645.REGULAR) {
            return;
        }
        throw m33234("FILE_STORAGE_ERROR", "The streamed temporary file is no longer available for publication.", str, str2, "pre_publish_temp", "temp_" + c14362.m32962().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m33251(String str, AbstractC12351 abstractC12351, String str2) throws C5276 {
        C14362 c14362M33240 = m33240(abstractC12351);
        if (c14362M33240.m32962() == EnumC5645.MISSING) {
            throw m33234("FILE_PARENT_NOT_FOUND", "The target parent directory does not exist.", str, str2, "parent_stat", "parent_missing", false, null, true, JSON.array(), null, null);
        }
        if (c14362M33240.m32962() != EnumC5645.DIRECTORY) {
            throw m33234("FILE_NOT_DIRECTORY", "The target parent is not a directory.", str, str2, "parent_stat", c14362M33240.m32962().name().toLowerCase(Locale.ROOT), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m33259(AbstractC17043 abstractC17043, String str, String str2) throws C5276 {
        this.f41513.m43855(abstractC17043, new C18576(str, str2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m33232(String str, String str2, String str3, String str4, String str5) {
        return m33234(str3, str4, str, str2, "check_parent_links", str5, false, null, true, JSON.array(), null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC17043 m33242(JSONArray jSONArray, String str, String str2, String str3) throws C5276 {
        boolean zMo10731 = false;
        for (int i = 0; i < 16; i++) {
            StringBuilder sb = new StringBuilder(".mt-mcp-");
            sb.append(f41510);
            sb.append("-");
            byte[] bArr = new byte[18];
            f41509.nextBytes(bArr);
            sb.append(C16111.m36665(bArr));
            sb.append(".tmp");
            String string = sb.toString();
            AbstractC17043 abstractC17043M43857 = this.f41513.m43857("/".equals(str2) ? C21466.m48631("/", string) : C24104.m53357(str2, "/", string));
            AbstractC12351 abstractC12351Mo25509 = abstractC17043M43857.mo25509();
            if (abstractC12351Mo25509.mo10729(EnumC15032.CREATE_FILE_EXCLUSIVE) == EnumC6986.UNSUPPORTED) {
                throw m33234("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot safely create an MCP temporary file.", str, str3, "create_temp", "exclusive_create_unsupported", false, null, true, jSONArray, null, null);
            }
            try {
                abstractC12351Mo25509.mo10735();
                return abstractC17043M43857;
            } catch (C23750 e) {
                if (e.m52799() != EnumC23080.ALREADY_EXISTS) {
                    try {
                        zMo10731 = abstractC12351Mo25509.mo10731();
                    } catch (IOException | RuntimeException unused) {
                    }
                    if (!zMo10731) {
                        m33247(jSONArray, "A temporary MCP file could not be removed after creation failed.");
                    }
                    throw m33234("FILE_STORAGE_ERROR", "Failed to create an MCP temporary file.", str, str3, "create_temp", e.m52799().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
                }
            }
        }
        throw m33234("FILE_STORAGE_ERROR", "Unable to allocate a unique MCP temporary file name.", str, str3, "create_temp", "name_collision", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33260(AbstractC17043 abstractC17043, C9385 c9385, JSONArray jSONArray) throws C23750 {
        synchronized (this.f41512) {
            if (c9385.f25641.equals(this.f41512.get(abstractC17043.mo25505()))) {
                return;
            }
            this.f41512.put(abstractC17043.mo25505(), c9385.f25641);
            if (this.f41512.size() > 64) {
                LinkedHashMap linkedHashMap = this.f41512;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            AbstractC12351 abstractC12351Mo25509 = abstractC17043.mo25509();
            if (abstractC12351Mo25509.mo10729(EnumC15032.LIST) == EnumC6986.UNSUPPORTED) {
                return;
            }
            try {
                boolean z = false;
                for (C14362 c14362 : abstractC12351Mo25509.mo10734()) {
                    AbstractC17043 abstractC17043M32959 = c14362.m32959();
                    EnumC5645 enumC5645M32962 = c14362.m32962();
                    EnumC5645 enumC5645 = EnumC5645.REGULAR;
                    if (enumC5645M32962 == enumC5645 && m33270(abstractC17043M32959.getName())) {
                        try {
                            c9385.m21857(abstractC17043M32959.mo25505());
                            AbstractC12351 abstractC12351Mo255010 = abstractC17043M32959.mo25509();
                            if (abstractC12351Mo255010.mo10729(EnumC15032.DELETE_FILE_OR_LINK) == EnumC6986.UNSUPPORTED) {
                                z = true;
                            } else {
                                C14362 c14362Mo10732 = abstractC12351Mo255010.mo10732();
                                if (c14362Mo10732.m32962() == enumC5645 && m33270(c14362Mo10732.m32959().getName())) {
                                    abstractC12351Mo255010.mo10736();
                                }
                            }
                        } catch (RuntimeException | C5276 | C23750 unused) {
                        }
                    }
                }
                if (z) {
                    m33247(jSONArray, "One or more stale MCP temporary files could not be removed.");
                }
            } catch (RuntimeException | C23750 unused2) {
                m33247(jSONArray, "Stale MCP temporary files could not be checked on this storage backend.");
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m33270(String str) {
        if (str.length() != 73 || !str.startsWith(".mt-mcp-") || str.charAt(32) != '-' || !str.endsWith(".tmp") || !m33261(8, 32, str) || !m33261(33, 69, str)) {
            return false;
        }
        String str2 = f41510;
        return !str.regionMatches(8, str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33261(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33247(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21930 m33246(String str, AbstractC17043 abstractC17043, C16564 c16564, InterfaceC11201 interfaceC11201, String str2) throws C5276, IOException {
        MessageDigest messageDigestM36666 = C16111.m36666();
        C4495 c4495 = new C4495(abstractC17043.mo25506(false), messageDigestM36666);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c4495, 65536);
        try {
            interfaceC11201.mo9172(c16564, bufferedOutputStream);
            bufferedOutputStream.close();
            if (c4495.f10092 > 9007199254740991L) {
                throw m33234("FILE_STORAGE_ERROR", "The output size exceeds the supported JSON integer range.", str, str2, "write_temp", "size_out_of_range", false, null, true, JSON.array(), null, null);
            }
            return C21930.m49461(c4495.f10092, C16111.m36665(messageDigestM36666.digest()).substring(0, 16));
        } catch (Throwable th) {
            try {
                bufferedOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m33228(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC17043.mo29987(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC17044.mo25506(false), 65536);
            try {
                long jM33227 = m33227(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return jM33227;
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7177 m33237(C22797 c22797, AbstractC17043 abstractC17043) throws IOException {
        try {
            C5836 c5836 = new C5836(new C23271(abstractC17043.mo25506(false)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c5836, 65536);
            try {
                C11042 c11042M31940 = C14079.m31940(c22797.f71841, c22797.f71842, c22797.f71843, bufferedOutputStream);
                bufferedOutputStream.close();
                return new C7177(c5836.f14311, c11042M31940);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RuntimeException e) {
            if ((e instanceof C21260) || !m33272(e)) {
                throw e;
            }
            throw new C21260(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static RuntimeException m33265(RuntimeException runtimeException) {
        return ((runtimeException instanceof C21260) || !m33272(runtimeException)) ? runtimeException : new C21260(runtimeException);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3153 m33230(AbstractC17043 abstractC17043, boolean z) {
        EnumC15032 enumC15032;
        if (z) {
            enumC15032 = EnumC15032.REPLACE;
        } else {
            enumC15032 = EnumC15032.RENAME_NO_REPLACE;
        }
        EnumC6986 enumC6986Mo10729 = abstractC17043.mo25509().mo10729(enumC15032);
        if (enumC6986Mo10729 == EnumC6986.ATOMIC) {
            return new C3153(enumC15032, "atomic", true, true);
        }
        if (enumC6986Mo10729 == EnumC6986.BEST_EFFORT || enumC6986Mo10729 == EnumC6986.SUPPORTED) {
            return new C3153(enumC15032, "best_effort", false, true);
        }
        return new C3153(enumC15032, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C3153 m33266(AbstractC12351 abstractC12351, boolean z) {
        EnumC15032 enumC15032;
        if (z) {
            enumC15032 = EnumC15032.REPLACE;
        } else {
            enumC15032 = EnumC15032.RENAME_NO_REPLACE;
        }
        EnumC6986 enumC6986Mo10729 = abstractC12351.mo10729(enumC15032);
        if (enumC6986Mo10729 == EnumC6986.ATOMIC) {
            return new C3153(enumC15032, "atomic", true, true);
        }
        if (enumC6986Mo10729 == EnumC6986.BEST_EFFORT || enumC6986Mo10729 == EnumC6986.SUPPORTED) {
            return new C3153(enumC15032, "best_effort", false, true);
        }
        return new C3153(enumC15032, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33248(String str, String str2, AbstractC12351 abstractC12351, C3153 c3153, String str3, JSONArray jSONArray) throws C5276 {
        if (c3153.f5773 == EnumC15032.RENAME_NO_REPLACE && !c3153.f5772 && abstractC12351.mo10729(EnumC15032.CREATE_FILE_EXCLUSIVE) == EnumC6986.UNSUPPORTED) {
            throw m33233("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, str3, "publish_capability", "no_replace_unsupported", false, c3153.f5774, true, jSONArray);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33252(String str, AbstractC12351 abstractC12351, C3153 c3153, String str2, JSONArray jSONArray) throws C5276 {
        if (c3153.f5773 == EnumC15032.RENAME_NO_REPLACE && !c3153.f5772 && abstractC12351.mo10729(EnumC15032.CREATE_FILE_EXCLUSIVE) == EnumC6986.UNSUPPORTED) {
            throw m33234("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, c3153.f5774, true, jSONArray, null, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33254(String str, AbstractC17043 abstractC17043, AbstractC12351 abstractC12351, AbstractC17043 abstractC17044, AbstractC12351 abstractC12352, C3153 c3153, long j, String str2) throws C5276, IOException {
        AbstractC17043 abstractC17045;
        AbstractC17043 abstractC17046;
        AbstractC12351 abstractC12353;
        String str3 = c3153.f5774;
        boolean z = c3153.f5772;
        boolean z2 = c3153.f5771;
        EnumC15032 enumC15032 = c3153.f5773;
        if (z) {
            try {
                if (enumC15032 == EnumC15032.REPLACE) {
                    abstractC12351.mo12969(abstractC17044);
                    return;
                } else {
                    abstractC12351.mo10730(abstractC17044);
                    return;
                }
            } catch (C23750 e) {
                C19247 c19247 = this.f41513;
                C19918 c19918 = null;
                if (enumC15032 == EnumC15032.RENAME_NO_REPLACE && !z2 && C12826.equals(abstractC17043.getParent(), abstractC17044.getParent())) {
                    try {
                        AbstractC17043 abstractC17043M43857 = c19247.m43857(abstractC17043.mo25505());
                        AbstractC17043 abstractC17043M43858 = c19247.m43857(abstractC17044.mo25505());
                        AbstractC12351 abstractC12351Mo25509 = abstractC17043M43857.mo25509();
                        AbstractC12351 abstractC12351Mo255010 = abstractC17043M43858.mo25509();
                        C14362 c14362Mo10732 = abstractC12351Mo25509.mo10732();
                        if (c14362Mo10732.m32962() == EnumC5645.REGULAR && ((c14362Mo10732.m32961() < 0 || c14362Mo10732.m32961() == j) && abstractC12351Mo255010.mo10732().m32962() == EnumC5645.MISSING)) {
                            c19918 = new C19918(abstractC17043M43857, abstractC17043M43858, abstractC12351Mo255010);
                        }
                    } catch (RuntimeException | C23750 unused) {
                    }
                }
                if (c19918 == null) {
                    String str4 = z2 ? "FILE_STORAGE_ERROR" : "FILE_OPERATION_STATE_UNKNOWN";
                    String strName = enumC15032.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strName.toLowerCase(locale);
                    String lowerCase2 = e.m52799().name().toLowerCase(locale);
                    boolean z3 = c3153.f5771;
                    throw m33234(str4, "Failed to publish local file content.", str, str2, lowerCase, lowerCase2, !z3, str3, z3, JSON.array(), null, null);
                }
                abstractC17045 = c19918.f60481;
                abstractC17046 = c19918.f60479;
                abstractC12353 = c19918.f60480;
            }
        } else {
            abstractC17045 = abstractC17043;
            abstractC17046 = abstractC17044;
            abstractC12353 = abstractC12352;
        }
        if (enumC15032 == EnumC15032.RENAME_NO_REPLACE) {
            if (abstractC12353.mo10729(EnumC15032.CREATE_FILE_EXCLUSIVE) == EnumC6986.UNSUPPORTED) {
                throw m33234("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, str3, true, JSON.array(), null, null);
            }
            try {
                abstractC12353.mo10735();
            } catch (C23750 e2) {
                throw m33234("FILE_OPERATION_STATE_UNKNOWN", "Failed to create the final local file before publishing content.", str, str2, "create_target", e2.m52799().name().toLowerCase(Locale.ROOT), true, str3, false, JSON.array(), null, null);
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC17045.mo29987(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC17046.mo25506(false), 65536);
            try {
                m33227(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                bufferedInputStream.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C21930 m33245(String str, C14362 c14362, String str2, String str3) throws C5276 {
        if (c14362.m32962() == EnumC5645.MISSING) {
            return C21930.m49460();
        }
        try {
            C18082 c18082M44197 = C19424.m44197(c14362.m32959(), 0L, 1);
            long j = c18082M44197.f53990;
            C14362 c14362M33240 = m33240(c14362.m32959().mo25509());
            if (c14362M33240.m32962() != EnumC5645.REGULAR || ((c14362.m32961() >= 0 && c14362.m32961() != j) || (c14362M33240.m32961() >= 0 && c14362M33240.m32961() != j))) {
                throw m33234("FILE_CHANGED_DURING_READ", "The file changed while its targetVersion was being calculated.", str, str2, str3, "metadata_changed", false, null, true, JSON.array(), null, null);
            }
            return C21930.m49461(j, c18082M44197.f53991);
        } catch (IOException e) {
            throw m33234("FILE_STORAGE_ERROR", "Failed to read current local file content.", str, str2, str3, e.getClass().getSimpleName(), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m33263(String str) {
        try {
            AbstractC12351 abstractC12351Mo25509 = this.f41513.m43857(str).mo25509();
            C14362 c14362Mo10732 = abstractC12351Mo25509.mo10732();
            if (c14362Mo10732.m32962() == EnumC5645.MISSING) {
                return true;
            }
            if (c14362Mo10732.m32962() == EnumC5645.REGULAR && abstractC12351Mo25509.mo10729(EnumC15032.DELETE_FILE_OR_LINK) != EnumC6986.UNSUPPORTED) {
                abstractC12351Mo25509.mo10736();
                return true;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33258(AbstractC17043 abstractC17043, long j, JSONArray jSONArray) {
        if (C7050.m16218()) {
            if (j < 0) {
                m33247(jSONArray, "Source modified time was unavailable and could not be preserved.");
                return;
            }
            try {
                if (abstractC17043.mo29973() && abstractC17043.mo20486(j)) {
                    return;
                }
                m33247(jSONArray, "Source modified time could not be applied to the destination.");
            } catch (RuntimeException unused) {
                m33247(jSONArray, "Source modified time could not be applied to the destination.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public C14362 m33240(AbstractC12351 abstractC12351) throws C5276 {
        try {
            return abstractC12351.mo10732();
        } catch (C23750 e) {
            this.f41513.getClass();
            throw C19247.m43849(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m33272(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m33235(C5276 c5276, String str, String str2) {
        boolean z = c5276.f12408;
        JSONArray jSONArray = c5276.f12407;
        String str3 = c5276.f12414;
        String str4 = c5276.f12413;
        if (z) {
            return c5276;
        }
        JSONObject jSONObjectObject = JSON.object();
        for (JSONObject.Member member : c5276.f12412) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        jSONObjectObject.put("localPath", str);
        JSONValue jSONValue = jSONObjectObject.get("policyRevision");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONObjectObject.put("policyRevision", str2);
        }
        if (c5276.f12410) {
            return C5276.m11407(str4, c5276.getMessage(), str3, jSONArray, jSONObjectObject);
        }
        return C5276.m11411(str4, c5276.getMessage(), str3, jSONArray, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m33233(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "targetPath", str4).add("policyRevision", str5).add("operation", str6).add("backendReason", str7).add("changed", z).add("operationMode", str8 == null ? JSON.NULL : JSON.value(str8)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        return ("FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C5276.m11411(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m33231(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m33234("FILE_STORAGE_ERROR", str, str2, str3, str4, "size_out_of_range", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m33267(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m33234("FILE_OPERATION_STATE_UNKNOWN", "The file operation may have changed the target, but its final state is unknown.", str, str2, "publish", str4, true, str3, false, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m33234(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        if (str8 != null) {
            jSONObjectAdd.add("expectedTargetVersion", str8).add("actualTargetVersion", str9);
        }
        return (("parent_stat".equals(str5) && (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str6)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str6)))) || "FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_TARGET_VERSION_MISMATCH".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C5276.m11407(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C5276.m11411(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9859 m33275(String str, String str2, InterfaceC11201 interfaceC11201) throws C5276 {
        boolean zEquals = "missing".equals(str2);
        if (!zEquals && str2 != null && str2.length() == 16) {
            zEquals = false;
            int i = 0;
            while (true) {
                if (i >= str2.length()) {
                    zEquals = true;
                    break;
                }
                char cCharAt = str2.charAt(i);
                if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                    break;
                }
                i++;
            }
        }
        if (zEquals) {
            C19247 c19247 = this.f41513;
            C9385 c9385M43852 = c19247.m43852();
            String strM43850 = C19247.m43850(str, c9385M43852, MotionUtils.EASING_TYPE_PATH);
            C11872 c11872M43856 = c19247.m43856(strM43850);
            try {
                C9859 c9859M33238 = m33238(strM43850, str2, interfaceC11201, c9385M43852);
                c11872M43856.close();
                return c9859M33238;
            } catch (Throwable th) {
                try {
                    c11872M43856.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C5276.m11406("Invalid targetVersion", "targetVersion", str2 == null ? null : JSON.value(str2), JSON.array().add("missing").add("<16 lowercase hex digits copied from the latest read>"), JSON.object().add("targetVersion", "missing"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m33227(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        long j;
        byte[] bArr = new byte[65536];
        long j2 = 0;
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i < 0) {
                break;
            }
            if (i == 0) {
                int i2 = bufferedInputStream.read();
                if (i2 < 0) {
                    break;
                }
                bufferedOutputStream.write(i2);
                j = 1;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            } else {
                bufferedOutputStream.write(bArr, 0, i);
                j = i;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            }
            j2 += j;
        }
        return j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33264(C21930 c21930, C21930 c21931) {
        return c21930.f68947 == c21931.f68947 && c21930.f68948 == c21931.f68948 && c21930.f68949.equals(c21931.f68949);
    }
}
