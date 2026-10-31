package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
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
public final class C12821 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f38466;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f38467;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23868 f38468;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f38469;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f38470;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f38466 = secureRandom;
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        f38467 = C14460.m34531(bArr);
    }

    public C12821(C17760 c17760) {
        C23868 c23868 = new C23868();
        this.f38469 = new LinkedHashMap(16, 0.75f, true);
        this.f38470 = c17760;
        this.f38468 = c23868;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15642 m31191(String str, String str2, boolean z) throws C3059 {
        C17760 c17760 = this.f38470;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(str, c7383M41607, "sourcePath");
        String strM41605 = C17760.m41605(str2, c7383M41607, "destinationPath");
        if (strM41599.equals(strM41605)) {
            throw m31147("FILE_INVALID_PATH", "Source and destination must have different normalized absolute paths.", strM41599, strM41605, c7383M41607.f22729, "prepare", "same_path", false, null, true, JSON.array());
        }
        C10000 c10000M41609 = c17760.m41609(Arrays.asList(strM41599, strM41605));
        try {
            C15642 c15642M31157 = m31157(c7383M41607, strM41599, strM41605, z);
            c10000M41609.close();
            return c15642M31157;
        } catch (Throwable th) {
            try {
                c10000M41609.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4355 m31188(String str, boolean z, final C21495 c21495) throws C3059 {
        C17760 c17760 = this.f38470;
        C7383 c7383M41607 = c17760.m41607();
        String strM41605 = C17760.m41605(str, c7383M41607, "localPath");
        C10000 c10000M41611 = c17760.m41611(strM41605);
        try {
            try {
                C4355 c4355M31150 = m31150(strM41605, z, new InterfaceC2944() { // from class: l.ܳۖۜ
                    @Override // l.InterfaceC2944
                    /* JADX INFO: renamed from: ֫ */
                    public final C5060 mo8967(AbstractC15440 abstractC15440) {
                        return C12821.m31151(c21495, abstractC15440);
                    }

                    @Override // l.InterfaceC2944
                    /* JADX INFO: renamed from: ֫ */
                    public final /* synthetic */ void mo8968(C7383 c7383) {
                    }
                }, c7383M41607);
                c10000M41611.close();
                return c4355M31150;
            } catch (C3059 e) {
                throw m31149(e, strM41605, c7383M41607.f22729);
            }
        } catch (Throwable th) {
            try {
                c10000M41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0120 m31187(String str, boolean z, C7383 c7383, InterfaceC19172 interfaceC19172) throws C3059 {
        this.f38470.getClass();
        String strM41605 = C17760.m41605(str, c7383, MotionUtils.EASING_TYPE_PATH);
        if (!strM41605.equals(str)) {
            throw C3059.m9364("The claimed file path must be normalized and absolute.", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return new C0120(m31150(strM41605, z, new C23404(this, interfaceC19172, strM41605, c7383), c7383));
        } catch (C3059 e) {
            throw m31149(e, strM41605, c7383.f22729);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9126 m31190(String str, C22200 c22200) throws C3059 {
        C17760 c17760 = this.f38470;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(str, c7383M41607, "localPath");
        C10000 c10000M41608 = c17760.m41608(strM41599);
        try {
            try {
                AbstractC15440 abstractC15440M41612 = c17760.m41612(strM41599);
                C12619 c12619M31154 = m31154(abstractC15440M41612.mo23558());
                m31183(c12619M31154, strM41599);
                if (c12619M31154.m30884() > 9007199254740991L) {
                    throw m31148("FILE_STORAGE_ERROR", "The local source size exceeds the supported JSON integer range.", strM41599, c7383M41607.f22729, "source_stat", "size_out_of_range", false, null, true, JSON.array(), null, null);
                }
                C21289 c21289 = new C21289(this, strM41599, abstractC15440M41612, c12619M31154);
                c21289.f68644 = true;
                try {
                    C9126 c9126M29881 = C12322.m29881(c22200.f72009, c22200.f72010, c22200.f72011, c21289);
                    C21289.m48314(c21289);
                    c21289.f68644 = false;
                    c10000M41608.close();
                    return c9126M29881;
                } catch (Throwable th) {
                    c21289.f68644 = false;
                    throw th;
                }
            } catch (C3059 e) {
                throw m31149(e, strM41599, c7383M41607.f22729);
            }
        } catch (Throwable th2) {
            try {
                c10000M41608.close();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C15642 m31157(C7383 c7383, String str, String str2, boolean z) throws C3059, C22497 {
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
        C3059 c3059;
        boolean z8;
        C3059 c3059M31147;
        String simpleName;
        C3059 c30510;
        String str13;
        String str14;
        boolean z9;
        JSONObject jSONObjectObject;
        JSONArray jSONArray;
        String str15;
        String str16;
        String str17;
        JSONArray jSONArray2;
        EnumC16852 enumC16852M41046;
        EnumC16852 enumC16852M41051;
        C12821 c12821 = this;
        C17760 c17760 = c12821.f38470;
        AbstractC15440 abstractC15440M41612 = c17760.m41612(str);
        C12619 c12619M31154 = c12821.m31154(abstractC15440M41612.mo23558());
        c12821.m31183(c12619M31154, str);
        if (c12619M31154.m30884() > 9007199254740991L) {
            throw m31147("FILE_STORAGE_ERROR", "The source size exceeds the supported JSON integer range.", str, str2, c7383.f22729, "source_stat", "size_out_of_range", false, null, true, JSON.array());
        }
        JSONArray jSONArrayArray = JSON.array();
        C8588 c8588M31153 = m31153(str2, str, z, c7383, jSONArrayArray);
        AbstractC10503 abstractC10503 = c8588M31153.f26220;
        String str18 = c8588M31153.f26222;
        AbstractC15440 abstractC15440 = c8588M31153.f26221;
        String strMo23554 = abstractC15440.mo23554();
        C0826 c0826 = c8588M31153.f26223;
        String str19 = c0826.f3000;
        String str20 = c7383.f22729;
        String str21 = "copy_to_temp";
        RuntimeException runtimeException = null;
        long jM31142 = 0;
        String str22 = str19;
        try {
            try {
                m31162(str, str2, abstractC10503, c0826, str20, jSONArrayArray);
                jM31142 = m31142(abstractC15440M41612, abstractC15440);
                str3 = str20;
                while (true) {
                    try {
                        C7383 c7383M41607 = c17760.m41607();
                        String str23 = c7383M41607.f22729;
                        try {
                            try {
                                str21 = "pre_publish_validation";
                                c7383M41607.m19883(str);
                                c7383M41607.m19884(str2);
                                c7383M41607.m19884(str18);
                                c7383M41607.m19882(str2);
                                AbstractC15440 abstractC15440M41613 = c17760.m41612(str);
                                AbstractC10503 abstractC10503Mo23558 = abstractC15440M41613.mo23558();
                                c8588M31153.m22297(c7383M41607.f22729);
                                AbstractC15440 abstractC15441 = c8588M31153.f26218;
                                AbstractC10503 abstractC10504 = c8588M31153.f26220;
                                AbstractC15440 abstractC15442 = c8588M31153.f26221;
                                AbstractC10503 abstractC10505 = c8588M31153.f26226;
                                c12821.m31183(c12821.m31154(abstractC10503Mo23558), str);
                                C12619 c12619M31155 = c12821.m31154(abstractC10504);
                                c12821.m31169(c12619M31155, str2);
                                if (!z) {
                                    try {
                                        try {
                                            if (c12619M31155.m30885() != EnumC3447.MISSING) {
                                                str16 = str23;
                                                jSONArray2 = jSONArrayArray;
                                                try {
                                                    try {
                                                        try {
                                                            throw m31147("FILE_ALREADY_EXISTS", "The destination appeared before publication and overwrite is false.", str, str2, c7383M41607.f22729, "pre_publish_destination", "already_exists", false, str22, true, jSONArrayArray);
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
                                                                c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                            } else {
                                                                c3059M31147 = m31147("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                            }
                                                            c3059 = c3059M31147;
                                                            z8 = z6;
                                                            str6 = str9;
                                                            c30510 = c3059;
                                                            str13 = str6;
                                                            m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                                                            if (runtimeException != null) {
                                                                throw runtimeException;
                                                            }
                                                            if (c30510 != null) {
                                                                str14 = c30510.f9610;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                    z9 = false;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject = c30510.f9609;
                                                                jSONArray = c30510.f9604;
                                                                str15 = c30510.f9611;
                                                                for (JSONObject.Member member : jSONObject) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                if (c30510.f9607) {
                                                                    throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
                                                        } catch (RuntimeException e2) {
                                                            e = e2;
                                                        }
                                                    } catch (C3059 e3) {
                                                        e = e3;
                                                        jSONArrayArray = jSONArray2;
                                                        str6 = str22;
                                                        z3 = false;
                                                        z5 = false;
                                                        z7 = z5;
                                                        boolean z10 = z3;
                                                        c3059 = e;
                                                        z8 = z10;
                                                        c30510 = c3059;
                                                        str13 = str6;
                                                        m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                                                        if (runtimeException != null) {
                                                            throw runtimeException;
                                                        }
                                                        if (c30510 != null) {
                                                            str14 = c30510.f9610;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                z9 = false;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject2 = c30510.f9609;
                                                            jSONArray = c30510.f9604;
                                                            str15 = c30510.f9611;
                                                            while (r3.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                            if (c30510.f9607) {
                                                                throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
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
                                    } catch (C3059 e8) {
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
                                    if (m31186(e)) {
                                        if (z6) {
                                            simpleName = e.getClass().getSimpleName();
                                            c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                        } else {
                                            c3059M31147 = m31147("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                        }
                                        c3059 = c3059M31147;
                                        z8 = z6;
                                        str6 = str9;
                                        c30510 = c3059;
                                        str13 = str6;
                                    } else {
                                        c30510 = null;
                                        str13 = str9;
                                        runtimeException = e;
                                        z8 = z6;
                                    }
                                }
                                str16 = str23;
                                try {
                                    m31163(str, str2, c12821.m31154(abstractC10505), c7383M41607.f22729, jSONArrayArray);
                                    boolean z11 = c12619M31155.m30885() == EnumC3447.REGULAR;
                                    C0826 c0826M31180 = m31180(abstractC10505, z11);
                                    String str24 = c0826M31180.f3000;
                                    try {
                                        str9 = str24;
                                        try {
                                            try {
                                                m31162(str, str2, abstractC10504, c0826M31180, c7383M41607.f22729, jSONArrayArray);
                                                C17558 c17558 = new C17558();
                                                try {
                                                    try {
                                                        enumC16852M41046 = c17558.m41046(z11 ? abstractC15441 : abstractC15440M41613);
                                                    } catch (RuntimeException unused) {
                                                        enumC16852M41046 = EnumC16852.FAILED;
                                                    }
                                                    if (c7383M41607.f22729.equals(c17760.m41607().f22729)) {
                                                        if (enumC16852M41046 != EnumC16852.SUCCESS) {
                                                            m31161(jSONArrayArray, z11 ? "Existing destination mode, owner, or group metadata could not be fully captured." : "Source mode, owner, or group metadata could not be fully captured.");
                                                            c17558 = null;
                                                        }
                                                        try {
                                                            str21 = "publish";
                                                            boolean z12 = z11;
                                                            jSONArrayArray = jSONArrayArray;
                                                            try {
                                                                m31168(str2, abstractC15442, abstractC10505, abstractC15441, abstractC10504, c0826M31180, jM31142, c7383M41607.f22729);
                                                                try {
                                                                    try {
                                                                        str21 = "restore_metadata";
                                                                        AbstractC15440 abstractC15440M41614 = c17760.m41612(str2);
                                                                        if (c17558 != null) {
                                                                            try {
                                                                                enumC16852M41051 = c17558.m41051(abstractC15440M41614);
                                                                            } catch (RuntimeException unused2) {
                                                                                enumC16852M41051 = EnumC16852.FAILED;
                                                                            }
                                                                            if (enumC16852M41051 != EnumC16852.SUCCESS) {
                                                                                m31161(jSONArrayArray, z12 ? "Existing destination mode, owner, or group metadata could not be fully restored." : "Source mode, owner, or group metadata could not be fully applied to the destination.");
                                                                            }
                                                                        }
                                                                        if (!z12) {
                                                                            try {
                                                                                C16999.m39870(abstractC15440M41614);
                                                                            } catch (RuntimeException unused3) {
                                                                                m31161(jSONArrayArray, "SELinux context restoration could not be completed.");
                                                                            }
                                                                        }
                                                                        m31172(abstractC15440M41614, c12619M31154.m30883(), jSONArrayArray);
                                                                        z8 = true;
                                                                        c30510 = null;
                                                                        str13 = str9;
                                                                        z7 = true;
                                                                        break;
                                                                    } catch (RuntimeException e9) {
                                                                        e = e9;
                                                                        str11 = str21;
                                                                        str10 = str16;
                                                                        z6 = true;
                                                                        z7 = true;
                                                                        if (m31186(e)) {
                                                                            c30510 = null;
                                                                            str13 = str9;
                                                                            runtimeException = e;
                                                                            z8 = z6;
                                                                        } else {
                                                                            if (z6) {
                                                                                simpleName = e.getClass().getSimpleName();
                                                                                c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                            } else {
                                                                                c3059M31147 = m31147("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", str, str2, str10, str11, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                            }
                                                                            c3059 = c3059M31147;
                                                                            z8 = z6;
                                                                            str6 = str9;
                                                                            c30510 = c3059;
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
                                                                        c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                                                    } else {
                                                                        c3059M31147 = m31147("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                                                    }
                                                                    c3059 = c3059M31147;
                                                                    z8 = z6;
                                                                    str6 = str9;
                                                                    c30510 = c3059;
                                                                    str13 = str6;
                                                                } catch (C3059 e11) {
                                                                    e = e11;
                                                                    z3 = true;
                                                                    z5 = true;
                                                                    str6 = str9;
                                                                    z7 = z5;
                                                                    boolean z13 = z3;
                                                                    c3059 = e;
                                                                    z8 = z13;
                                                                    c30510 = c3059;
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
                                                            } catch (C3059 e14) {
                                                                e = e14;
                                                                z3 = true;
                                                                str6 = str9;
                                                                z5 = false;
                                                                z7 = z5;
                                                                boolean z14 = z3;
                                                                c3059 = e;
                                                                z8 = z14;
                                                                c30510 = c3059;
                                                                str13 = str6;
                                                                m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                                                                if (runtimeException != null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (c30510 != null) {
                                                                    str14 = c30510.f9610;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                                        z9 = false;
                                                                    } else {
                                                                        z9 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = c30510.f9609;
                                                                    jSONArray = c30510.f9604;
                                                                    str15 = c30510.f9611;
                                                                    while (r3.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                                    if (c30510.f9607) {
                                                                        throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
                                                            }
                                                        } catch (IOException e15) {
                                                            e = e15;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (RuntimeException e16) {
                                                            e = e16;
                                                            jSONArrayArray = jSONArrayArray;
                                                        } catch (C3059 e17) {
                                                            e = e17;
                                                            jSONArrayArray = jSONArrayArray;
                                                        }
                                                    } else {
                                                        c12821 = this;
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
                                                } catch (C3059 e19) {
                                                    e = e19;
                                                    jSONArrayArray = jSONArrayArray;
                                                    str6 = str9;
                                                    z3 = false;
                                                    z5 = false;
                                                    z7 = z5;
                                                    boolean z15 = z3;
                                                    c3059 = e;
                                                    z8 = z15;
                                                    c30510 = c3059;
                                                    str13 = str6;
                                                    m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                                                    if (runtimeException != null) {
                                                        throw runtimeException;
                                                    }
                                                    if (c30510 != null) {
                                                        str14 = c30510.f9610;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                                            z9 = false;
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject4 = c30510.f9609;
                                                        jSONArray = c30510.f9604;
                                                        str15 = c30510.f9611;
                                                        while (r3.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                                        if (c30510.f9607) {
                                                            throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
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
                                        } catch (C3059 e22) {
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
                                    } catch (C3059 e25) {
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
                                        c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                                    } else {
                                        c3059M31147 = m31147("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                                    }
                                    c3059 = c3059M31147;
                                    z8 = z6;
                                    str6 = str9;
                                    c30510 = c3059;
                                    str13 = str6;
                                    m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                                    if (runtimeException != null) {
                                        throw runtimeException;
                                    }
                                    if (c30510 != null) {
                                        str14 = c30510.f9610;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                            z9 = false;
                                        } else {
                                            z9 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject5 = c30510.f9609;
                                        jSONArray = c30510.f9604;
                                        str15 = c30510.f9611;
                                        while (r3.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                                        if (c30510.f9607) {
                                            throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                        }
                                        throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                                    }
                                    return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
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
                            c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                        } else {
                            c3059M31147 = m31147("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                        }
                        c3059 = c3059M31147;
                        z8 = z6;
                        str6 = str9;
                        c30510 = c3059;
                        str13 = str6;
                        m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
                        if (runtimeException != null) {
                            throw runtimeException;
                        }
                        if (c30510 != null) {
                            str14 = c30510.f9610;
                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14)) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            jSONObjectObject = JSON.object();
                            JSONObject<JSONObject.Member> jSONObject6 = c30510.f9609;
                            jSONArray = c30510.f9604;
                            str15 = c30510.f9611;
                            while (r3.hasNext()) {
                                jSONObjectObject.put(member.getName(), member.getValue());
                            }
                            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
                            if (c30510.f9607) {
                                throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                            }
                            throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
                        }
                        return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
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
                        c3059M31147 = m31147("FILE_OPERATION_STATE_UNKNOWN", "The copy may have changed the destination, but its final state is unknown.", str, str2, str10, "publish", simpleName, true, str9, false, jSONArrayArray);
                    } else {
                        c3059M31147 = m31147("FILE_STORAGE_ERROR", "Failed to prepare the copied file for publication.", str, str2, str10, str12, e.getClass().getSimpleName(), false, str9, true, jSONArrayArray);
                    }
                    c3059 = c3059M31147;
                    z8 = z6;
                    str6 = str9;
                    c30510 = c3059;
                    str13 = str6;
                }
            } catch (C3059 e32) {
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
        m31164(strMo23554, str2, z8, jSONArrayArray, runtimeException);
        if (runtimeException != null) {
            throw runtimeException;
        }
        if (c30510 != null) {
            str14 = c30510.f9610;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str14) || (z8 && (z7 || !"atomic".equals(str13)))) {
                z9 = false;
            } else {
                z9 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject7 = c30510.f9609;
            jSONArray = c30510.f9604;
            str15 = c30510.f9611;
            while (r3.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put(MotionUtils.EASING_TYPE_PATH, str).put("targetPath", str2).put("changed", !z9).put("operationMode", str13).put("stateKnown", z9).put("warnings", new JSONArray(jSONArrayArray));
            if (c30510.f9607) {
                throw C3059.m9365(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
            }
            throw C3059.m9369(str14, c30510.getMessage(), str15, jSONArray, jSONObjectObject);
        }
        return new C15642(str, str2, new JSONArray(jSONArrayArray), jM31142);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4355 m31150(String str, boolean z, InterfaceC2944 interfaceC2944, C7383 c7383) throws C3059, C22497 {
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
        C3059 c3059;
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
        C3059 c3059M31148;
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
        C17558 c17558;
        EnumC16852 enumC16852M41046;
        EnumC16852 enumC16852M41051;
        C12821 c12821 = this;
        String str19 = str;
        C17760 c17760 = c12821.f38470;
        JSONArray jSONArrayArray = JSON.array();
        C8588 c8588M31153 = m31153(str, (String) null, z, c7383, jSONArrayArray);
        AbstractC10503 abstractC10503 = c8588M31153.f26220;
        String str20 = c8588M31153.f26222;
        AbstractC15440 abstractC15440 = c8588M31153.f26221;
        String strMo23554 = abstractC15440.mo23554();
        C0826 c0826 = c8588M31153.f26223;
        String str21 = c0826.f3000;
        String str22 = c7383.f22729;
        String str23 = "produce_temp";
        long j3 = 0;
        try {
            try {
                m31166(str19, abstractC10503, c0826, str22, jSONArrayArray);
                try {
                    C5060 c5060Mo8967 = interfaceC2944.mo8967(abstractC15440);
                    Object obj7 = c5060Mo8967.f15910;
                    try {
                        long j4 = c5060Mo8967.f15911;
                        while (true) {
                            try {
                                C7383 c7383M41607 = c17760.m41607();
                                String str24 = c7383M41607.f22729;
                                try {
                                    c7383M41607.m19884(str19);
                                    c7383M41607.m19884(str20);
                                    c7383M41607.m19882(str19);
                                    c8588M31153.m22297(c7383M41607.f22729);
                                    AbstractC15440 abstractC15441 = c8588M31153.f26218;
                                    AbstractC10503 abstractC10504 = c8588M31153.f26220;
                                    String str25 = str20;
                                    AbstractC15440 abstractC15442 = c8588M31153.f26221;
                                    Object obj8 = obj7;
                                    try {
                                        AbstractC10503 abstractC10505 = c8588M31153.f26226;
                                        C8588 c8588 = c8588M31153;
                                        C12619 c12619M31154 = c12821.m31154(abstractC10504);
                                        c12821.m31169(c12619M31154, str19);
                                        if (z) {
                                            str14 = str24;
                                            str15 = "pre_publish_validation";
                                        } else {
                                            str14 = str24;
                                            try {
                                                try {
                                                    str15 = "pre_publish_validation";
                                                    try {
                                                        if (c12619M31154.m30885() != EnumC3447.MISSING) {
                                                            j = j4;
                                                            try {
                                                                throw m31148("FILE_ALREADY_EXISTS", "The local destination appeared before publication and overwrite is false.", str, c7383M41607.f22729, "pre_publish_destination", "already_exists", false, str21, true, jSONArrayArray, null, null);
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
                                                                    e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f9610;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject = e.f9609;
                                                                    jSONArray = e.f9604;
                                                                    str13 = e.f9611;
                                                                    for (JSONObject.Member member : jSONObject) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f9607) {
                                                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            } catch (C19878 e2) {
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
                                                                runtimeException3 = e.f64170;
                                                                if (z3) {
                                                                    c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                } else {
                                                                    simpleName = runtimeException3.getClass().getSimpleName();
                                                                    str6 = null;
                                                                    str7 = null;
                                                                    str8 = "FILE_STORAGE_ERROR";
                                                                    str9 = "The storage backend failed while preparing local file content.";
                                                                    z8 = false;
                                                                    z9 = true;
                                                                    c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                }
                                                                c3059 = c3059M31148;
                                                                e = null;
                                                                z12 = z3;
                                                                runtimeException2 = e;
                                                                e = c3059;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f9610;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject2 = e.f9609;
                                                                    jSONArray = e.f9604;
                                                                    str13 = e.f9611;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f9607) {
                                                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                                c3059 = null;
                                                                z12 = z3;
                                                                runtimeException2 = e;
                                                                e = c3059;
                                                                runtimeException = runtimeException2;
                                                                z10 = z4;
                                                                obj2 = obj;
                                                                str10 = str21;
                                                                str11 = str22;
                                                                z11 = z12;
                                                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f9610;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject3 = e.f9609;
                                                                    jSONArray = e.f9604;
                                                                    str13 = e.f9611;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f9607) {
                                                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                            e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                        } else {
                                                            e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f9610;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject4 = e.f9609;
                                                            jSONArray = e.f9604;
                                                            str13 = e.f9611;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f9607) {
                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    } catch (C19878 e5) {
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
                                                        runtimeException3 = e.f64170;
                                                        if (z3) {
                                                            c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                        } else {
                                                            simpleName = runtimeException3.getClass().getSimpleName();
                                                            str6 = null;
                                                            str7 = null;
                                                            str8 = "FILE_STORAGE_ERROR";
                                                            str9 = "The storage backend failed while preparing local file content.";
                                                            z8 = false;
                                                            z9 = true;
                                                            c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                        }
                                                        c3059 = c3059M31148;
                                                        e = null;
                                                        z12 = z3;
                                                        runtimeException2 = e;
                                                        e = c3059;
                                                        runtimeException = runtimeException2;
                                                        z10 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z11 = z12;
                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f9610;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject5 = e.f9609;
                                                            jSONArray = e.f9604;
                                                            str13 = e.f9611;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f9607) {
                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        c3059 = null;
                                                        z12 = z3;
                                                        runtimeException2 = e;
                                                        e = c3059;
                                                        runtimeException = runtimeException2;
                                                        z10 = z4;
                                                        obj2 = obj;
                                                        str10 = str21;
                                                        str11 = str22;
                                                        z11 = z12;
                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f9610;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject6 = e.f9609;
                                                            jSONArray = e.f9604;
                                                            str13 = e.f9611;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f9607) {
                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                    }
                                                } catch (C3059 e7) {
                                                    e = e7;
                                                    j = j4;
                                                    obj6 = obj8;
                                                }
                                            } catch (IOException e8) {
                                                e = e8;
                                                str15 = "pre_publish_validation";
                                            } catch (C19878 e9) {
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
                                                m31182(str19, c12821.m31154(abstractC10505), c7383M41607.f22729, jSONArrayArray);
                                                boolean z20 = c12619M31154.m30885() == EnumC3447.REGULAR;
                                                C0826 c0826M31180 = m31180(abstractC10505, z20);
                                                String str26 = c0826M31180.f3000;
                                                try {
                                                    try {
                                                        m31166(str19, abstractC10504, c0826M31180, c7383M41607.f22729, jSONArrayArray);
                                                        if (z20) {
                                                            try {
                                                                try {
                                                                    c17558 = new C17558();
                                                                    try {
                                                                        enumC16852M41046 = c17558.m41046(abstractC15441);
                                                                    } catch (RuntimeException unused) {
                                                                        enumC16852M41046 = EnumC16852.FAILED;
                                                                    }
                                                                    if (enumC16852M41046 != EnumC16852.SUCCESS) {
                                                                        m31161(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully captured.");
                                                                        c17558 = null;
                                                                    }
                                                                } catch (C19878 e11) {
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
                                                                    runtimeException3 = e.f64170;
                                                                    if (z3) {
                                                                        c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                    } else {
                                                                        simpleName = runtimeException3.getClass().getSimpleName();
                                                                        str6 = null;
                                                                        str7 = null;
                                                                        str8 = "FILE_STORAGE_ERROR";
                                                                        str9 = "The storage backend failed while preparing local file content.";
                                                                        z8 = false;
                                                                        z9 = true;
                                                                        c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                    }
                                                                    c3059 = c3059M31148;
                                                                    e = null;
                                                                    z12 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c3059;
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
                                                                    c3059 = null;
                                                                    z12 = z3;
                                                                    runtimeException2 = e;
                                                                    e = c3059;
                                                                    runtimeException = runtimeException2;
                                                                    z10 = z4;
                                                                    obj2 = obj;
                                                                    str10 = str21;
                                                                    str11 = str22;
                                                                    z11 = z12;
                                                                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                    if (runtimeException == null) {
                                                                        throw runtimeException;
                                                                    }
                                                                    if (e != null) {
                                                                        str12 = e.f9610;
                                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        jSONObjectObject = JSON.object();
                                                                        JSONObject<JSONObject.Member> jSONObject7 = e.f9609;
                                                                        jSONArray = e.f9604;
                                                                        str13 = e.f9611;
                                                                        while (r4.hasNext()) {
                                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                                        }
                                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                        if (e.f9607) {
                                                                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                                    e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                } else {
                                                                    e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                            } catch (C3059 e14) {
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
                                                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                if (runtimeException == null) {
                                                                    throw runtimeException;
                                                                }
                                                                if (e != null) {
                                                                    str12 = e.f9610;
                                                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    jSONObjectObject = JSON.object();
                                                                    JSONObject<JSONObject.Member> jSONObject8 = e.f9609;
                                                                    jSONArray = e.f9604;
                                                                    str13 = e.f9611;
                                                                    while (r4.hasNext()) {
                                                                        jSONObjectObject.put(member.getName(), member.getValue());
                                                                    }
                                                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                    if (e.f9607) {
                                                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                    }
                                                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                            }
                                                        } else {
                                                            c17558 = null;
                                                        }
                                                        C17558 c17559 = c17558;
                                                        try {
                                                            interfaceC2944.mo8968(c7383M41607);
                                                            if (c7383M41607.f22729.equals(c17760.m41607().f22729)) {
                                                                try {
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                    try {
                                                                        m31168(str, abstractC15442, abstractC10505, abstractC15441, abstractC10504, c0826M31180, j, c7383M41607.f22729);
                                                                        try {
                                                                            try {
                                                                                AbstractC15440 abstractC15440M41612 = c17760.m41612(str19);
                                                                                if (c17559 != null) {
                                                                                    try {
                                                                                        enumC16852M41051 = c17559.m41051(abstractC15440M41612);
                                                                                    } catch (RuntimeException unused2) {
                                                                                        enumC16852M41051 = EnumC16852.FAILED;
                                                                                    }
                                                                                    if (enumC16852M41051 != EnumC16852.SUCCESS) {
                                                                                        m31161(jSONArrayArray, "Existing destination mode, owner, or group metadata could not be fully restored.");
                                                                                    }
                                                                                }
                                                                                if (!z20) {
                                                                                    try {
                                                                                        C16999.m39870(abstractC15440M41612);
                                                                                    } catch (RuntimeException unused3) {
                                                                                        m31161(jSONArrayArray, "SELinux context restoration could not be completed.");
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
                                                                                    e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                                } else {
                                                                                    e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                            } catch (C3059 e16) {
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
                                                                        } catch (C19878 e17) {
                                                                            e = e17;
                                                                            z3 = true;
                                                                            z4 = true;
                                                                            str3 = "restore_metadata";
                                                                            str2 = str19;
                                                                            obj = obj2;
                                                                            str21 = str5;
                                                                            str22 = str14;
                                                                            runtimeException3 = e.f64170;
                                                                            if (z3) {
                                                                                c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                            } else {
                                                                                simpleName = runtimeException3.getClass().getSimpleName();
                                                                                str6 = null;
                                                                                str7 = null;
                                                                                str8 = "FILE_STORAGE_ERROR";
                                                                                str9 = "The storage backend failed while preparing local file content.";
                                                                                z8 = false;
                                                                                z9 = true;
                                                                                c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                            }
                                                                            c3059 = c3059M31148;
                                                                            e = null;
                                                                            z12 = z3;
                                                                            runtimeException2 = e;
                                                                            e = c3059;
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
                                                                            c3059 = null;
                                                                            z12 = z3;
                                                                            runtimeException2 = e;
                                                                            e = c3059;
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
                                                                            e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                                        } else {
                                                                            e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f9610;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject9 = e.f9609;
                                                                            jSONArray = e.f9604;
                                                                            str13 = e.f9611;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f9607) {
                                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C19878 e20) {
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
                                                                        runtimeException3 = e.f64170;
                                                                        if (z3) {
                                                                            c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                                        } else {
                                                                            simpleName = runtimeException3.getClass().getSimpleName();
                                                                            str6 = null;
                                                                            str7 = null;
                                                                            str8 = "FILE_STORAGE_ERROR";
                                                                            str9 = "The storage backend failed while preparing local file content.";
                                                                            z8 = false;
                                                                            z9 = true;
                                                                            c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                                        }
                                                                        c3059 = c3059M31148;
                                                                        e = null;
                                                                        z12 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c3059;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f9610;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject10 = e.f9609;
                                                                            jSONArray = e.f9604;
                                                                            str13 = e.f9611;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f9607) {
                                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                                        c3059 = null;
                                                                        z12 = z3;
                                                                        runtimeException2 = e;
                                                                        e = c3059;
                                                                        runtimeException = runtimeException2;
                                                                        z10 = z4;
                                                                        obj2 = obj;
                                                                        str10 = str21;
                                                                        str11 = str22;
                                                                        z11 = z12;
                                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                                        if (runtimeException == null) {
                                                                            throw runtimeException;
                                                                        }
                                                                        if (e != null) {
                                                                            str12 = e.f9610;
                                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                                z13 = false;
                                                                            } else {
                                                                                z13 = false;
                                                                            }
                                                                            jSONObjectObject = JSON.object();
                                                                            JSONObject<JSONObject.Member> jSONObject11 = e.f9609;
                                                                            jSONArray = e.f9604;
                                                                            str13 = e.f9611;
                                                                            while (r4.hasNext()) {
                                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                                            }
                                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                            if (e.f9607) {
                                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                            }
                                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                        }
                                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                                    } catch (C3059 e22) {
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
                                                                } catch (C3059 e24) {
                                                                    e = e24;
                                                                    obj2 = obj8;
                                                                    jSONArrayArray = jSONArrayArray;
                                                                    str5 = str26;
                                                                    str19 = str19;
                                                                } catch (C19878 e25) {
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
                                                                c12821 = this;
                                                                obj7 = obj8;
                                                                str20 = str25;
                                                                c8588M31153 = c8588;
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
                                                            c3059 = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c3059;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                            m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                            if (runtimeException == null) {
                                                                throw runtimeException;
                                                            }
                                                            if (e != null) {
                                                                str12 = e.f9610;
                                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                jSONObjectObject = JSON.object();
                                                                JSONObject<JSONObject.Member> jSONObject12 = e.f9609;
                                                                jSONArray = e.f9604;
                                                                str13 = e.f9611;
                                                                while (r4.hasNext()) {
                                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                                }
                                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                                if (e.f9607) {
                                                                    throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                                }
                                                                throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        if (z2 || !m31186(e)) {
                                                            str2 = str19;
                                                            c3059 = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c3059;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                        } else if (z3) {
                                                            e = m31181(jSONArrayArray, str19, str22, str21, e.getClass().getSimpleName());
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
                                                            c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                            c3059 = c3059M31148;
                                                            e = null;
                                                            z12 = z3;
                                                            runtimeException2 = e;
                                                            e = c3059;
                                                            runtimeException = runtimeException2;
                                                            z10 = z4;
                                                            obj2 = obj;
                                                            str10 = str21;
                                                            str11 = str22;
                                                            z11 = z12;
                                                        }
                                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                        if (runtimeException == null) {
                                                            throw runtimeException;
                                                        }
                                                        if (e != null) {
                                                            str12 = e.f9610;
                                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                                z13 = false;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            jSONObjectObject = JSON.object();
                                                            JSONObject<JSONObject.Member> jSONObject13 = e.f9609;
                                                            jSONArray = e.f9604;
                                                            str13 = e.f9611;
                                                            while (r4.hasNext()) {
                                                                jSONObjectObject.put(member.getName(), member.getValue());
                                                            }
                                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                            if (e.f9607) {
                                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                            }
                                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                                        e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                                    } else {
                                                        e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                    if (runtimeException == null) {
                                                        throw runtimeException;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f9610;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject14 = e.f9609;
                                                        jSONArray = e.f9604;
                                                        str13 = e.f9611;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f9607) {
                                                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                } catch (C3059 e30) {
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
                                                } catch (C19878 e31) {
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
                                                    runtimeException3 = e.f64170;
                                                    if (z3) {
                                                        c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                                    } else {
                                                        simpleName = runtimeException3.getClass().getSimpleName();
                                                        str6 = null;
                                                        str7 = null;
                                                        str8 = "FILE_STORAGE_ERROR";
                                                        str9 = "The storage backend failed while preparing local file content.";
                                                        z8 = false;
                                                        z9 = true;
                                                        c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                                    }
                                                    c3059 = c3059M31148;
                                                    e = null;
                                                    z12 = z3;
                                                    runtimeException2 = e;
                                                    e = c3059;
                                                    runtimeException = runtimeException2;
                                                    z10 = z4;
                                                    obj2 = obj;
                                                    str10 = str21;
                                                    str11 = str22;
                                                    z11 = z12;
                                                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                                    if (runtimeException == null) {
                                                        throw runtimeException;
                                                    }
                                                    if (e != null) {
                                                        str12 = e.f9610;
                                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                            z13 = false;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        jSONObjectObject = JSON.object();
                                                        JSONObject<JSONObject.Member> jSONObject15 = e.f9609;
                                                        jSONArray = e.f9604;
                                                        str13 = e.f9611;
                                                        while (r4.hasNext()) {
                                                            jSONObjectObject.put(member.getName(), member.getValue());
                                                        }
                                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                        if (e.f9607) {
                                                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                        }
                                                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                    }
                                                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                                }
                                            } catch (C3059 e32) {
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
                                                e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                            } else {
                                                e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                            m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f9610;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject16 = e.f9609;
                                                jSONArray = e.f9604;
                                                str13 = e.f9611;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f9607) {
                                                    throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                        } catch (C19878 e34) {
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
                                            runtimeException3 = e.f64170;
                                            if (z3) {
                                                c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                            } else {
                                                simpleName = runtimeException3.getClass().getSimpleName();
                                                str6 = null;
                                                str7 = null;
                                                str8 = "FILE_STORAGE_ERROR";
                                                str9 = "The storage backend failed while preparing local file content.";
                                                z8 = false;
                                                z9 = true;
                                                c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                            }
                                            c3059 = c3059M31148;
                                            e = null;
                                            z12 = z3;
                                            runtimeException2 = e;
                                            e = c3059;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                            m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f9610;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject17 = e.f9609;
                                                jSONArray = e.f9604;
                                                str13 = e.f9611;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f9607) {
                                                    throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                            c3059 = null;
                                            z12 = z3;
                                            runtimeException2 = e;
                                            e = c3059;
                                            runtimeException = runtimeException2;
                                            z10 = z4;
                                            obj2 = obj;
                                            str10 = str21;
                                            str11 = str22;
                                            z11 = z12;
                                            m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                            if (runtimeException == null) {
                                                throw runtimeException;
                                            }
                                            if (e != null) {
                                                str12 = e.f9610;
                                                if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                jSONObjectObject = JSON.object();
                                                JSONObject<JSONObject.Member> jSONObject18 = e.f9609;
                                                jSONArray = e.f9604;
                                                str13 = e.f9611;
                                                while (r4.hasNext()) {
                                                    jSONObjectObject.put(member.getName(), member.getValue());
                                                }
                                                jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                                if (e.f9607) {
                                                    throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                                }
                                                throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                            e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                        } else {
                                            e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f9610;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject19 = e.f9609;
                                            jSONArray = e.f9604;
                                            str13 = e.f9611;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f9607) {
                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    } catch (C3059 e37) {
                                        e = e37;
                                        obj6 = obj8;
                                        str14 = str24;
                                        j = j4;
                                    } catch (C19878 e38) {
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
                                        runtimeException3 = e.f64170;
                                        if (z3) {
                                            c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                        } else {
                                            simpleName = runtimeException3.getClass().getSimpleName();
                                            str6 = null;
                                            str7 = null;
                                            str8 = "FILE_STORAGE_ERROR";
                                            str9 = "The storage backend failed while preparing local file content.";
                                            z8 = false;
                                            z9 = true;
                                            c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                        }
                                        c3059 = c3059M31148;
                                        e = null;
                                        z12 = z3;
                                        runtimeException2 = e;
                                        e = c3059;
                                        runtimeException = runtimeException2;
                                        z10 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z11 = z12;
                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f9610;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject110 = e.f9609;
                                            jSONArray = e.f9604;
                                            str13 = e.f9611;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f9607) {
                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                        c3059 = null;
                                        z12 = z3;
                                        runtimeException2 = e;
                                        e = c3059;
                                        runtimeException = runtimeException2;
                                        z10 = z4;
                                        obj2 = obj;
                                        str10 = str21;
                                        str11 = str22;
                                        z11 = z12;
                                        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                        if (runtimeException == null) {
                                            throw runtimeException;
                                        }
                                        if (e != null) {
                                            str12 = e.f9610;
                                            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                                z13 = false;
                                            } else {
                                                z13 = false;
                                            }
                                            jSONObjectObject = JSON.object();
                                            JSONObject<JSONObject.Member> jSONObject111 = e.f9609;
                                            jSONArray = e.f9604;
                                            str13 = e.f9611;
                                            while (r4.hasNext()) {
                                                jSONObjectObject.put(member.getName(), member.getValue());
                                            }
                                            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                            if (e.f9607) {
                                                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                            }
                                            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                                    }
                                } catch (IOException e40) {
                                    e = e40;
                                    obj2 = obj7;
                                } catch (RuntimeException e41) {
                                    e = e41;
                                    obj2 = obj7;
                                } catch (C3059 e42) {
                                    e = e42;
                                    obj6 = obj7;
                                } catch (C19878 e43) {
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
                                    runtimeException3 = e.f64170;
                                    if (z3) {
                                        c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                    } else {
                                        simpleName = runtimeException3.getClass().getSimpleName();
                                        str6 = null;
                                        str7 = null;
                                        str8 = "FILE_STORAGE_ERROR";
                                        str9 = "The storage backend failed while preparing local file content.";
                                        z8 = false;
                                        z9 = true;
                                        c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                    }
                                    c3059 = c3059M31148;
                                    e = null;
                                    z12 = z3;
                                    runtimeException2 = e;
                                    e = c3059;
                                    runtimeException = runtimeException2;
                                    z10 = z4;
                                    obj2 = obj;
                                    str10 = str21;
                                    str11 = str22;
                                    z11 = z12;
                                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                    if (runtimeException == null) {
                                        throw runtimeException;
                                    }
                                    if (e != null) {
                                        str12 = e.f9610;
                                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                            z13 = false;
                                        } else {
                                            z13 = false;
                                        }
                                        jSONObjectObject = JSON.object();
                                        JSONObject<JSONObject.Member> jSONObject112 = e.f9609;
                                        jSONArray = e.f9604;
                                        str13 = e.f9611;
                                        while (r4.hasNext()) {
                                            jSONObjectObject.put(member.getName(), member.getValue());
                                        }
                                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                        if (e.f9607) {
                                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                        }
                                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                    e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                                } else {
                                    e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f9610;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject113 = e.f9609;
                                    jSONArray = e.f9604;
                                    str13 = e.f9611;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f9607) {
                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
                                c3059 = null;
                                z12 = z3;
                                runtimeException2 = e;
                                e = c3059;
                                runtimeException = runtimeException2;
                                z10 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z11 = z12;
                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f9610;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject114 = e.f9609;
                                    jSONArray = e.f9604;
                                    str13 = e.f9611;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f9607) {
                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            } catch (C3059 e46) {
                                e = e46;
                                jSONArrayArray = jSONArrayArray;
                                j = j4;
                                str2 = str19;
                                obj = obj7;
                            } catch (C19878 e47) {
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
                                runtimeException3 = e.f64170;
                                if (z3) {
                                    c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                                } else {
                                    simpleName = runtimeException3.getClass().getSimpleName();
                                    str6 = null;
                                    str7 = null;
                                    str8 = "FILE_STORAGE_ERROR";
                                    str9 = "The storage backend failed while preparing local file content.";
                                    z8 = false;
                                    z9 = true;
                                    c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                                }
                                c3059 = c3059M31148;
                                e = null;
                                z12 = z3;
                                runtimeException2 = e;
                                e = c3059;
                                runtimeException = runtimeException2;
                                z10 = z4;
                                obj2 = obj;
                                str10 = str21;
                                str11 = str22;
                                z11 = z12;
                                m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                                if (runtimeException == null) {
                                    throw runtimeException;
                                }
                                if (e != null) {
                                    str12 = e.f9610;
                                    if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    jSONObjectObject = JSON.object();
                                    JSONObject<JSONObject.Member> jSONObject115 = e.f9609;
                                    jSONArray = e.f9604;
                                    str13 = e.f9611;
                                    while (r4.hasNext()) {
                                        jSONObjectObject.put(member.getName(), member.getValue());
                                    }
                                    jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                                    if (e.f9607) {
                                        throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                    }
                                    throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                                }
                                return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                            }
                        }
                    } catch (IOException e48) {
                        e = e48;
                        obj5 = obj7;
                    } catch (C3059 e49) {
                        e = e49;
                        jSONArrayArray = jSONArrayArray;
                        str2 = str19;
                        obj = obj7;
                    } catch (C19878 e50) {
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
                        e = m31181(jSONArrayArray, str2, str22, str21, e.getClass().getSimpleName());
                    } else {
                        e = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", str, str22, str4, e.getClass().getSimpleName(), false, str21, true, jSONArrayArray, null, null);
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
                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                    if (runtimeException == null) {
                        throw runtimeException;
                    }
                    if (e != null) {
                        str12 = e.f9610;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject116 = e.f9609;
                        jSONArray = e.f9604;
                        str13 = e.f9611;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f9607) {
                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
                } catch (C3059 e53) {
                    e = e53;
                    str2 = str19;
                    obj = null;
                } catch (C19878 e54) {
                    e = e54;
                    str2 = str19;
                    z3 = false;
                    z4 = false;
                    obj = null;
                    str3 = "produce_temp";
                    j = 0;
                    runtimeException3 = e.f64170;
                    if (z3) {
                        c3059M31148 = m31181(jSONArrayArray, str2, str22, str21, runtimeException3.getClass().getSimpleName());
                    } else {
                        simpleName = runtimeException3.getClass().getSimpleName();
                        str6 = null;
                        str7 = null;
                        str8 = "FILE_STORAGE_ERROR";
                        str9 = "The storage backend failed while preparing local file content.";
                        z8 = false;
                        z9 = true;
                        c3059M31148 = m31148(str8, str9, str, str22, str3, simpleName, z8, str21, z9, jSONArrayArray, str6, str7);
                    }
                    c3059 = c3059M31148;
                    e = null;
                    z12 = z3;
                    runtimeException2 = e;
                    e = c3059;
                    runtimeException = runtimeException2;
                    z10 = z4;
                    obj2 = obj;
                    str10 = str21;
                    str11 = str22;
                    z11 = z12;
                    m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
                    if (runtimeException == null) {
                        throw runtimeException;
                    }
                    if (e != null) {
                        str12 = e.f9610;
                        if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12)) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        jSONObjectObject = JSON.object();
                        JSONObject<JSONObject.Member> jSONObject117 = e.f9609;
                        jSONArray = e.f9604;
                        str13 = e.f9611;
                        while (r4.hasNext()) {
                            jSONObjectObject.put(member.getName(), member.getValue());
                        }
                        jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
                        if (e.f9607) {
                            throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                        }
                        throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
                    }
                    return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
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
        } catch (C3059 e57) {
            e = e57;
            str2 = str19;
        } catch (C19878 e58) {
            e = e58;
            str2 = str19;
        }
        m31164(strMo23554, str, z11, jSONArrayArray, runtimeException);
        if (runtimeException == null) {
            throw runtimeException;
        }
        if (e != null) {
            str12 = e.f9610;
            if ("FILE_OPERATION_STATE_UNKNOWN".equals(str12) || (z11 && (z10 || !"atomic".equals(str10)))) {
                z13 = false;
            } else {
                z13 = true;
            }
            jSONObjectObject = JSON.object();
            JSONObject<JSONObject.Member> jSONObject118 = e.f9609;
            jSONArray = e.f9604;
            str13 = e.f9611;
            while (r4.hasNext()) {
                jSONObjectObject.put(member.getName(), member.getValue());
            }
            jSONObjectObject.put("localPath", str2).put("policyRevision", str11).put("changed", !z13).put("operationMode", str10).put("stateKnown", z13).put("warnings", new JSONArray(jSONArrayArray)).put("bytesCopied", JSON.NULL);
            if (e.f9607) {
                throw C3059.m9365(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
            }
            throw C3059.m9369(str12, e.getMessage(), str13, jSONArray, jSONObjectObject);
        }
        return new C4355(obj2, str, str10, new JSONArray(jSONArrayArray), j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8588 m31153(String str, String str2, boolean z, C7383 c7383, JSONArray jSONArray) throws C3059, C22497 {
        C17760 c17760 = this.f38470;
        AbstractC15440 abstractC15440M41612 = c17760.m41612(str);
        AbstractC10503 abstractC10503Mo23558 = abstractC15440M41612.mo23558();
        C12619 c12619M31154 = m31154(abstractC10503Mo23558);
        m31169(c12619M31154, str);
        String str3 = str2 == null ? "The local destination" : "The destination";
        if (!z && c12619M31154.m30885() != EnumC3447.MISSING) {
            String str4 = c7383.f22729;
            String strConcat = str3.concat(" already exists and overwrite is false.");
            if (str2 == null) {
                throw m31148("FILE_ALREADY_EXISTS", strConcat, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array(), null, null);
            }
            throw m31147("FILE_ALREADY_EXISTS", strConcat, str2, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array());
        }
        String parent = abstractC15440M41612.getParent();
        if (parent == null) {
            String str5 = c7383.f22729;
            String strConcat2 = str3.concat(" has no writable parent directory.");
            if (str2 == null) {
                throw m31148("FILE_PARENT_NOT_FOUND", strConcat2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array(), null, null);
            }
            throw m31147("FILE_PARENT_NOT_FOUND", strConcat2, str2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array());
        }
        c7383.m19884(parent);
        String str6 = c7383.f22729;
        AbstractC15440 abstractC15440M41613 = c17760.m41612(parent);
        m31173(abstractC15440M41612, str, str6);
        m31165(str, abstractC15440M41613.mo23558(), str6);
        m31174(abstractC15440M41613, c7383, jSONArray);
        return new C8588(this, str, parent, abstractC15440M41612, abstractC10503Mo23558, m31156(jSONArray, str, parent, str6), c12619M31154.m30885() == EnumC3447.REGULAR);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31164(String str, String str2, boolean z, JSONArray jSONArray, RuntimeException runtimeException) {
        if (!m31177(str)) {
            m31161(jSONArray, "A temporary MCP file could not be removed.");
            if (runtimeException != null) {
                runtimeException.addSuppressed(new IOException("A temporary MCP file could not be removed"));
            }
        }
        if (z) {
            try {
                this.f38468.m52583(str2);
            } catch (RuntimeException e) {
                m31161(jSONArray, "File change notification could not be completed.");
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private l.C7882 m31152(java.lang.String r28, java.lang.String r29, l.InterfaceC9294 r30, l.C7383 r31) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31152(java.lang.String, java.lang.String, l.ۢۖۜ, l.۟ۢۜ):l.۠ۖۜ");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31185(C12619 c12619, String str) throws C3059 {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be modified as file content.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be modified by generic file content tools.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be modified as file content.", str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31183(C12619 c12619, String str) throws C3059 {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 1) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be copied by mt_file_copy.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be copied by generic file tools.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The source node type cannot be copied by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31169(C12619 c12619, String str) throws C3059 {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "A directory cannot be used as the file copy destination.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "A symbolic link cannot be used as the file copy destination.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by generic file tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31163(String str, String str2, C12619 c12619, String str3, JSONArray jSONArray) throws C3059 {
        if (c12619.m30885() == EnumC3447.REGULAR) {
            return;
        }
        throw m31147("FILE_STORAGE_ERROR", "The copied temporary file is no longer available for publication.", str, str2, str3, "pre_publish_temp", "temp_" + c12619.m30885().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31182(String str, C12619 c12619, String str2, JSONArray jSONArray) throws C3059 {
        if (c12619.m30885() == EnumC3447.REGULAR) {
            return;
        }
        throw m31148("FILE_STORAGE_ERROR", "The streamed temporary file is no longer available for publication.", str, str2, "pre_publish_temp", "temp_" + c12619.m30885().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m31165(String str, AbstractC10503 abstractC10503, String str2) throws C3059 {
        C12619 c12619M31154 = m31154(abstractC10503);
        if (c12619M31154.m30885() == EnumC3447.MISSING) {
            throw m31148("FILE_PARENT_NOT_FOUND", "The target parent directory does not exist.", str, str2, "parent_stat", "parent_missing", false, null, true, JSON.array(), null, null);
        }
        if (c12619M31154.m30885() != EnumC3447.DIRECTORY) {
            throw m31148("FILE_NOT_DIRECTORY", "The target parent is not a directory.", str, str2, "parent_stat", c12619M31154.m30885().name().toLowerCase(Locale.ROOT), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m31173(AbstractC15440 abstractC15440, String str, String str2) throws C3059 {
        this.f38470.m41610(abstractC15440, new C17054(str, str2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31146(String str, String str2, String str3, String str4, String str5) {
        return m31148(str3, str4, str, str2, "check_parent_links", str5, false, null, true, JSON.array(), null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC15440 m31156(JSONArray jSONArray, String str, String str2, String str3) throws C3059 {
        boolean zMo8671 = false;
        for (int i = 0; i < 16; i++) {
            StringBuilder sb = new StringBuilder(".mt-mcp-");
            sb.append(f38467);
            sb.append("-");
            byte[] bArr = new byte[18];
            f38466.nextBytes(bArr);
            sb.append(C14460.m34531(bArr));
            sb.append(".tmp");
            String string = sb.toString();
            AbstractC15440 abstractC15440M41612 = this.f38470.m41612("/".equals(str2) ? C20094.m46315("/", string) : C22870.m50967(str2, "/", string));
            AbstractC10503 abstractC10503Mo23558 = abstractC15440M41612.mo23558();
            if (abstractC10503Mo23558.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
                throw m31148("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot safely create an MCP temporary file.", str, str3, "create_temp", "exclusive_create_unsupported", false, null, true, jSONArray, null, null);
            }
            try {
                abstractC10503Mo23558.mo8675();
                return abstractC15440M41612;
            } catch (C22497 e) {
                if (e.m50458() != EnumC21792.ALREADY_EXISTS) {
                    try {
                        zMo8671 = abstractC10503Mo23558.mo8671();
                    } catch (IOException | RuntimeException unused) {
                    }
                    if (!zMo8671) {
                        m31161(jSONArray, "A temporary MCP file could not be removed after creation failed.");
                    }
                    throw m31148("FILE_STORAGE_ERROR", "Failed to create an MCP temporary file.", str, str3, "create_temp", e.m50458().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
                }
            }
        }
        throw m31148("FILE_STORAGE_ERROR", "Unable to allocate a unique MCP temporary file name.", str, str3, "create_temp", "name_collision", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31174(AbstractC15440 abstractC15440, C7383 c7383, JSONArray jSONArray) throws C22497 {
        synchronized (this.f38469) {
            if (c7383.f22729.equals(this.f38469.get(abstractC15440.mo23554()))) {
                return;
            }
            this.f38469.put(abstractC15440.mo23554(), c7383.f22729);
            if (this.f38469.size() > 64) {
                LinkedHashMap linkedHashMap = this.f38469;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            AbstractC10503 abstractC10503Mo23558 = abstractC15440.mo23558();
            if (abstractC10503Mo23558.mo8669(EnumC13324.LIST) == EnumC4858.UNSUPPORTED) {
                return;
            }
            try {
                boolean z = false;
                for (C12619 c12619 : abstractC10503Mo23558.mo8674()) {
                    AbstractC15440 abstractC15440M30882 = c12619.m30882();
                    EnumC3447 enumC3447M30885 = c12619.m30885();
                    EnumC3447 enumC3447 = EnumC3447.REGULAR;
                    if (enumC3447M30885 == enumC3447 && m31184(abstractC15440M30882.getName())) {
                        try {
                            c7383.m19884(abstractC15440M30882.mo23554());
                            AbstractC10503 abstractC10503Mo23559 = abstractC15440M30882.mo23558();
                            if (abstractC10503Mo23559.mo8669(EnumC13324.DELETE_FILE_OR_LINK) == EnumC4858.UNSUPPORTED) {
                                z = true;
                            } else {
                                C12619 c12619Mo8672 = abstractC10503Mo23559.mo8672();
                                if (c12619Mo8672.m30885() == enumC3447 && m31184(c12619Mo8672.m30882().getName())) {
                                    abstractC10503Mo23559.mo8676();
                                }
                            }
                        } catch (RuntimeException | C3059 | C22497 unused) {
                        }
                    }
                }
                if (z) {
                    m31161(jSONArray, "One or more stale MCP temporary files could not be removed.");
                }
            } catch (RuntimeException | C22497 unused2) {
                m31161(jSONArray, "Stale MCP temporary files could not be checked on this storage backend.");
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31184(String str) {
        if (str.length() != 73 || !str.startsWith(".mt-mcp-") || str.charAt(32) != '-' || !str.endsWith(".tmp") || !m31175(8, 32, str) || !m31175(33, 69, str)) {
            return false;
        }
        String str2 = f38467;
        return !str.regionMatches(8, str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31175(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < '0' || cCharAt > '9') && (cCharAt < 'a' || cCharAt > 'f')) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31161(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20583 m31160(String str, AbstractC15440 abstractC15440, C14937 c14937, InterfaceC9294 interfaceC9294, String str2) throws C3059, IOException {
        MessageDigest messageDigestM34532 = C14460.m34532();
        C2238 c2238 = new C2238(abstractC15440.mo23555(false), messageDigestM34532);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c2238, 65536);
        try {
            interfaceC9294.mo7077(c14937, bufferedOutputStream);
            bufferedOutputStream.close();
            if (c2238.f7304 > 9007199254740991L) {
                throw m31148("FILE_STORAGE_ERROR", "The output size exceeds the supported JSON integer range.", str, str2, "write_temp", "size_out_of_range", false, null, true, JSON.array(), null, null);
            }
            return C20583.m47135(c2238.f7304, C14460.m34531(messageDigestM34532.digest()).substring(0, 16));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m31142(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC15440.mo27926(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC15441.mo23555(false), 65536);
            try {
                long jM31141 = m31141(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return jM31141;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5060 m31151(C21495 c21495, AbstractC15440 abstractC15440) throws IOException {
        try {
            C3649 c3649 = new C3649(new C21994(abstractC15440.mo23555(false)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c3649, 65536);
            try {
                C9126 c9126M29880 = C12322.m29880(c21495.f69144, c21495.f69145, c21495.f69146, bufferedOutputStream);
                bufferedOutputStream.close();
                return new C5060(c3649.f11505, c9126M29880);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RuntimeException e) {
            if ((e instanceof C19878) || !m31186(e)) {
                throw e;
            }
            throw new C19878(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m31179(RuntimeException runtimeException) {
        return ((runtimeException instanceof C19878) || !m31186(runtimeException)) ? runtimeException : new C19878(runtimeException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0826 m31144(AbstractC15440 abstractC15440, boolean z) {
        EnumC13324 enumC13324;
        if (z) {
            enumC13324 = EnumC13324.REPLACE;
        } else {
            enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        }
        EnumC4858 enumC4858Mo8669 = abstractC15440.mo23558().mo8669(enumC13324);
        if (enumC4858Mo8669 == EnumC4858.ATOMIC) {
            return new C0826(enumC13324, "atomic", true, true);
        }
        if (enumC4858Mo8669 == EnumC4858.BEST_EFFORT || enumC4858Mo8669 == EnumC4858.SUPPORTED) {
            return new C0826(enumC13324, "best_effort", false, true);
        }
        return new C0826(enumC13324, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0826 m31180(AbstractC10503 abstractC10503, boolean z) {
        EnumC13324 enumC13324;
        if (z) {
            enumC13324 = EnumC13324.REPLACE;
        } else {
            enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        }
        EnumC4858 enumC4858Mo8669 = abstractC10503.mo8669(enumC13324);
        if (enumC4858Mo8669 == EnumC4858.ATOMIC) {
            return new C0826(enumC13324, "atomic", true, true);
        }
        if (enumC4858Mo8669 == EnumC4858.BEST_EFFORT || enumC4858Mo8669 == EnumC4858.SUPPORTED) {
            return new C0826(enumC13324, "best_effort", false, true);
        }
        return new C0826(enumC13324, "best_effort", false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31162(String str, String str2, AbstractC10503 abstractC10503, C0826 c0826, String str3, JSONArray jSONArray) throws C3059 {
        if (c0826.f2999 == EnumC13324.RENAME_NO_REPLACE && !c0826.f2998 && abstractC10503.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
            throw m31147("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, str3, "publish_capability", "no_replace_unsupported", false, c0826.f3000, true, jSONArray);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31166(String str, AbstractC10503 abstractC10503, C0826 c0826, String str2, JSONArray jSONArray) throws C3059 {
        if (c0826.f2999 == EnumC13324.RENAME_NO_REPLACE && !c0826.f2998 && abstractC10503.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
            throw m31148("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, c0826.f3000, true, jSONArray, null, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31168(String str, AbstractC15440 abstractC15440, AbstractC10503 abstractC10503, AbstractC15440 abstractC15441, AbstractC10503 abstractC10504, C0826 c0826, long j, String str2) throws C3059, IOException {
        AbstractC15440 abstractC15442;
        AbstractC15440 abstractC15443;
        AbstractC10503 abstractC10505;
        String str3 = c0826.f3000;
        boolean z = c0826.f2998;
        boolean z2 = c0826.f2997;
        EnumC13324 enumC13324 = c0826.f2999;
        if (z) {
            try {
                if (enumC13324 == EnumC13324.REPLACE) {
                    abstractC10503.mo10993(abstractC15441);
                    return;
                } else {
                    abstractC10503.mo8670(abstractC15441);
                    return;
                }
            } catch (C22497 e) {
                C17760 c17760 = this.f38470;
                C18466 c18466 = null;
                if (enumC13324 == EnumC13324.RENAME_NO_REPLACE && !z2 && C11003.equals(abstractC15440.getParent(), abstractC15441.getParent())) {
                    try {
                        AbstractC15440 abstractC15440M41612 = c17760.m41612(abstractC15440.mo23554());
                        AbstractC15440 abstractC15440M41613 = c17760.m41612(abstractC15441.mo23554());
                        AbstractC10503 abstractC10503Mo23558 = abstractC15440M41612.mo23558();
                        AbstractC10503 abstractC10503Mo23559 = abstractC15440M41613.mo23558();
                        C12619 c12619Mo8672 = abstractC10503Mo23558.mo8672();
                        if (c12619Mo8672.m30885() == EnumC3447.REGULAR && ((c12619Mo8672.m30884() < 0 || c12619Mo8672.m30884() == j) && abstractC10503Mo23559.mo8672().m30885() == EnumC3447.MISSING)) {
                            c18466 = new C18466(abstractC15440M41612, abstractC15440M41613, abstractC10503Mo23559);
                        }
                    } catch (RuntimeException | C22497 unused) {
                    }
                }
                if (c18466 == null) {
                    String str4 = z2 ? "FILE_STORAGE_ERROR" : "FILE_OPERATION_STATE_UNKNOWN";
                    String strName = enumC13324.name();
                    Locale locale = Locale.ROOT;
                    String lowerCase = strName.toLowerCase(locale);
                    String lowerCase2 = e.m50458().name().toLowerCase(locale);
                    boolean z3 = c0826.f2997;
                    throw m31148(str4, "Failed to publish local file content.", str, str2, lowerCase, lowerCase2, !z3, str3, z3, JSON.array(), null, null);
                }
                abstractC15442 = c18466.f57261;
                abstractC15443 = c18466.f57259;
                abstractC10505 = c18466.f57260;
            }
        } else {
            abstractC15442 = abstractC15440;
            abstractC15443 = abstractC15441;
            abstractC10505 = abstractC10504;
        }
        if (enumC13324 == EnumC13324.RENAME_NO_REPLACE) {
            if (abstractC10505.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
                throw m31148("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, str3, true, JSON.array(), null, null);
            }
            try {
                abstractC10505.mo8675();
            } catch (C22497 e2) {
                throw m31148("FILE_OPERATION_STATE_UNKNOWN", "Failed to create the final local file before publishing content.", str, str2, "create_target", e2.m50458().name().toLowerCase(Locale.ROOT), true, str3, false, JSON.array(), null, null);
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC15442.mo27926(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC15443.mo23555(false), 65536);
            try {
                m31141(bufferedInputStream, bufferedOutputStream);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20583 m31159(String str, C12619 c12619, String str2, String str3) throws C3059 {
        if (c12619.m30885() == EnumC3447.MISSING) {
            return C20583.m47134();
        }
        try {
            C16534 c16534M41948 = C17946.m41948(c12619.m30882(), 0L, 1);
            long j = c16534M41948.f50811;
            C12619 c12619M31154 = m31154(c12619.m30882().mo23558());
            if (c12619M31154.m30885() != EnumC3447.REGULAR || ((c12619.m30884() >= 0 && c12619.m30884() != j) || (c12619M31154.m30884() >= 0 && c12619M31154.m30884() != j))) {
                throw m31148("FILE_CHANGED_DURING_READ", "The file changed while its targetVersion was being calculated.", str, str2, str3, "metadata_changed", false, null, true, JSON.array(), null, null);
            }
            return C20583.m47135(j, c16534M41948.f50812);
        } catch (IOException e) {
            throw m31148("FILE_STORAGE_ERROR", "Failed to read current local file content.", str, str2, str3, e.getClass().getSimpleName(), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31177(String str) {
        try {
            AbstractC10503 abstractC10503Mo23558 = this.f38470.m41612(str).mo23558();
            C12619 c12619Mo8672 = abstractC10503Mo23558.mo8672();
            if (c12619Mo8672.m30885() == EnumC3447.MISSING) {
                return true;
            }
            if (c12619Mo8672.m30885() == EnumC3447.REGULAR && abstractC10503Mo23558.mo8669(EnumC13324.DELETE_FILE_OR_LINK) != EnumC4858.UNSUPPORTED) {
                abstractC10503Mo23558.mo8676();
                return true;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31172(AbstractC15440 abstractC15440, long j, JSONArray jSONArray) {
        if (C4925.m14321()) {
            if (j < 0) {
                m31161(jSONArray, "Source modified time was unavailable and could not be preserved.");
                return;
            }
            try {
                if (abstractC15440.mo27912() && abstractC15440.mo18537(j)) {
                    return;
                }
                m31161(jSONArray, "Source modified time could not be applied to the destination.");
            } catch (RuntimeException unused) {
                m31161(jSONArray, "Source modified time could not be applied to the destination.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12619 m31154(AbstractC10503 abstractC10503) throws C3059 {
        try {
            return abstractC10503.mo8672();
        } catch (C22497 e) {
            this.f38470.getClass();
            throw C17760.m41604(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31186(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31149(C3059 c3059, String str, String str2) {
        boolean z = c3059.f9605;
        JSONArray jSONArray = c3059.f9604;
        String str3 = c3059.f9611;
        String str4 = c3059.f9610;
        if (z) {
            return c3059;
        }
        JSONObject jSONObjectObject = JSON.object();
        for (JSONObject.Member member : c3059.f9609) {
            jSONObjectObject.put(member.getName(), member.getValue());
        }
        jSONObjectObject.put("localPath", str);
        JSONValue jSONValue = jSONObjectObject.get("policyRevision");
        if (jSONValue == null || !jSONValue.isString()) {
            jSONObjectObject.put("policyRevision", str2);
        }
        if (c3059.f9607) {
            return C3059.m9365(str4, c3059.getMessage(), str3, jSONArray, jSONObjectObject);
        }
        return C3059.m9369(str4, c3059.getMessage(), str3, jSONArray, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31147(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, JSONArray jSONArray) {
        JSONObject jSONObjectAdd = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "targetPath", str4).add("policyRevision", str5).add("operation", str6).add("backendReason", str7).add("changed", z).add("operationMode", str8 == null ? JSON.NULL : JSON.value(str8)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        return ("FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C3059.m9369(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31145(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m31148("FILE_STORAGE_ERROR", str, str2, str3, str4, "size_out_of_range", false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m31181(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m31148("FILE_OPERATION_STATE_UNKNOWN", "The file operation may have changed the target, but its final state is unknown.", str, str2, "publish", str4, true, str3, false, jSONArray, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31148(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        if (str8 != null) {
            jSONObjectAdd.add("expectedTargetVersion", str8).add("actualTargetVersion", str9);
        }
        return (("parent_stat".equals(str5) && (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str6)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str6)))) || "FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_TARGET_VERSION_MISMATCH".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C3059.m9369(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7882 m31189(String str, String str2, InterfaceC9294 interfaceC9294) throws C3059 {
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
            C17760 c17760 = this.f38470;
            C7383 c7383M41607 = c17760.m41607();
            String strM41605 = C17760.m41605(str, c7383M41607, MotionUtils.EASING_TYPE_PATH);
            C10000 c10000M41611 = c17760.m41611(strM41605);
            try {
                C7882 c7882M31152 = m31152(strM41605, str2, interfaceC9294, c7383M41607);
                c10000M41611.close();
                return c7882M31152;
            } catch (Throwable th) {
                try {
                    c10000M41611.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C3059.m9364("Invalid targetVersion", "targetVersion", str2 == null ? null : JSON.value(str2), JSON.array().add("missing").add("<16 lowercase hex digits copied from the latest read>"), JSON.object().add("targetVersion", "missing"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m31141(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31178(C20583 c20583, C20583 c20584) {
        return c20583.f66266 == c20584.f66266 && c20583.f66267 == c20584.f66267 && c20583.f66268.equals(c20584.f66268);
    }
}
