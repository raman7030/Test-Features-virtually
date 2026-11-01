package com.umeng.commonsdk.statistics.proto;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.AbstractC0690bu;
import com.umeng.analytics.pro.AbstractC0701ce;
import com.umeng.analytics.pro.AbstractC0702cf;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0661as;
import com.umeng.analytics.pro.C0671bb;
import com.umeng.analytics.pro.C0677bh;
import com.umeng.analytics.pro.C0678bi;
import com.umeng.analytics.pro.C0682bm;
import com.umeng.analytics.pro.C0684bo;
import com.umeng.analytics.pro.C0685bp;
import com.umeng.analytics.pro.C0691bv;
import com.umeng.analytics.pro.C0693bx;
import com.umeng.analytics.pro.C0695bz;
import com.umeng.analytics.pro.C0697ca;
import com.umeng.analytics.pro.C0703cg;
import com.umeng.analytics.pro.InterfaceC0664av;
import com.umeng.analytics.pro.InterfaceC0672bc;
import com.umeng.analytics.pro.InterfaceC0700cd;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import p067l.C19768;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public class Response implements InterfaceC0664av, Serializable, Cloneable {
    public static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map metaDataMap;
    public static final Map schemes;
    public static final long serialVersionUID = -4549277923241195391L;
    public byte __isset_bitfield;
    public C0827d imprint;
    public String msg;
    public EnumC0823e[] optionals;
    public int resp_code;
    public static final C0695bz STRUCT_DESC = new C0695bz("Response");
    public static final C0685bp RESP_CODE_FIELD_DESC = new C0685bp("resp_code", (byte) 8, 1);
    public static final C0685bp MSG_FIELD_DESC = new C0685bp("msg", (byte) 11, 2);
    public static final C0685bp IMPRINT_FIELD_DESC = new C0685bp(C0655am.f2269X, (byte) 12, 3);

    static {
        HashMap map = new HashMap();
        schemes = map;
        map.put(AbstractC0701ce.class, new C0820b());
        map.put(AbstractC0702cf.class, new C0822d());
        EnumMap enumMap = new EnumMap(EnumC0823e.class);
        enumMap.put(EnumC0823e.RESP_CODE, new C0677bh("resp_code", (byte) 1, new C0678bi((byte) 8)));
        enumMap.put(EnumC0823e.MSG, new C0677bh("msg", (byte) 2, new C0678bi((byte) 11)));
        enumMap.put(EnumC0823e.IMPRINT, new C0677bh(C0655am.f2269X, (byte) 2, new C0682bm((byte) 12, C0827d.class)));
        Map mapUnmodifiableMap = C21562.unmodifiableMap(enumMap);
        metaDataMap = mapUnmodifiableMap;
        C0677bh.m2351a(Response.class, mapUnmodifiableMap);
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    public enum EnumC0823e implements InterfaceC0672bc {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, C0655am.f2269X);


        /* JADX INFO: renamed from: d */
        public static final Map f3460d = new HashMap();

        /* JADX INFO: renamed from: e */
        public final short f3462e;

        /* JADX INFO: renamed from: f */
        public final String f3463f;

        static {
            for (EnumC0823e enumC0823e : EnumSet.allOf(EnumC0823e.class)) {
                f3460d.put(enumC0823e.mo2228b(), enumC0823e);
            }
        }

        /* JADX INFO: renamed from: a */
        public static EnumC0823e m3113a(int i) {
            if (i == 1) {
                return RESP_CODE;
            }
            if (i == 2) {
                return MSG;
            }
            if (i != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* JADX INFO: renamed from: b */
        public static EnumC0823e m3115b(int i) {
            EnumC0823e enumC0823eM3113a = m3113a(i);
            if (enumC0823eM3113a != null) {
                return enumC0823eM3113a;
            }
            throw new IllegalArgumentException(C19768.m44906(i, "Field ", " doesn't exist!"));
        }

        /* JADX INFO: renamed from: a */
        public static EnumC0823e m3114a(String str) {
            return (EnumC0823e) f3460d.get(str);
        }

        EnumC0823e(short s, String str) {
            this.f3462e = s;
            this.f3463f = str;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: a */
        public short mo2227a() {
            return this.f3462e;
        }

        @Override // com.umeng.analytics.pro.InterfaceC0672bc
        /* JADX INFO: renamed from: b */
        public String mo2228b() {
            return this.f3463f;
        }
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC0823e[]{EnumC0823e.MSG, EnumC0823e.IMPRINT};
    }

    public Response(int i) {
        this();
        this.resp_code = i;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC0823e[]{EnumC0823e.MSG, EnumC0823e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C0827d(response.imprint);
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public Response deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public Response setResp_code(int i) {
        this.resp_code = i;
        setResp_codeIsSet(true);
        return this;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = C0661as.m2264b(this.__isset_bitfield, 0);
    }

    public boolean isSetResp_code() {
        return C0661as.m2260a(this.__isset_bitfield, 0);
    }

    public void setResp_codeIsSet(boolean z) {
        this.__isset_bitfield = C0661as.m2252a(this.__isset_bitfield, 0, z);
    }

    public String getMsg() {
        return this.msg;
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public boolean isSetMsg() {
        return this.msg != null;
    }

    public void setMsgIsSet(boolean z) {
        if (z) {
            return;
        }
        this.msg = null;
    }

    public C0827d getImprint() {
        return this.imprint;
    }

    public Response setImprint(C0827d c0827d) {
        this.imprint = c0827d;
        return this;
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public boolean isSetImprint() {
        return this.imprint != null;
    }

    public void setImprintIsSet(boolean z) {
        if (z) {
            return;
        }
        this.imprint = null;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public EnumC0823e fieldForId(int i) {
        return EnumC0823e.m3113a(i);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void read(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) schemes.get(abstractC0690bu.mo2427D())).mo2220b().mo2218b(abstractC0690bu, this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0664av
    public void write(AbstractC0690bu abstractC0690bu) {
        ((InterfaceC0700cd) schemes.get(abstractC0690bu.mo2427D())).mo2220b().mo2216a(abstractC0690bu, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(resp_code:");
        sb.append(this.resp_code);
        if (isSetMsg()) {
            sb.append(", ");
            sb.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
        }
        if (isSetImprint()) {
            sb.append(", ");
            sb.append("imprint:");
            C0827d c0827d = this.imprint;
            if (c0827d == null) {
                sb.append("null");
            } else {
                sb.append(c0827d);
            }
        }
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }

    public void validate() throws C0691bv {
        C0827d c0827d = this.imprint;
        if (c0827d != null) {
            c0827d.m3251l();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new C0684bo(new C0703cg(objectOutputStream)));
        } catch (C0671bb e) {
            throw new IOException(e.getMessage());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new C0684bo(new C0703cg(objectInputStream)));
        } catch (C0671bb e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    public class C0820b implements InterfaceC0700cd {
        public C0820b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0819a mo2220b() {
            return new C0819a();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    public class C0819a extends AbstractC0701ce {
        public C0819a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, Response response) throws C0691bv {
            abstractC0690bu.mo2385j();
            while (true) {
                C0685bp c0685bpMo2387l = abstractC0690bu.mo2387l();
                byte b = c0685bpMo2387l.f2531b;
                if (b == 0) {
                    break;
                }
                short s = c0685bpMo2387l.f2532c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C0693bx.m2431a(abstractC0690bu, b);
                        } else if (b == 12) {
                            C0827d c0827d = new C0827d();
                            response.imprint = c0827d;
                            c0827d.read(abstractC0690bu);
                            response.setImprintIsSet(true);
                        } else {
                            C0693bx.m2431a(abstractC0690bu, b);
                        }
                    } else if (b == 11) {
                        response.msg = abstractC0690bu.mo2401z();
                        response.setMsgIsSet(true);
                    } else {
                        C0693bx.m2431a(abstractC0690bu, b);
                    }
                } else if (b == 8) {
                    response.resp_code = abstractC0690bu.mo2398w();
                    response.setResp_codeIsSet(true);
                } else {
                    C0693bx.m2431a(abstractC0690bu, b);
                }
                abstractC0690bu.mo2388m();
            }
            abstractC0690bu.mo2386k();
            if (!response.isSetResp_code()) {
                throw new C0691bv("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
            }
            response.validate();
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, Response response) throws C0691bv {
            response.validate();
            abstractC0690bu.mo2369a(Response.STRUCT_DESC);
            abstractC0690bu.mo2364a(Response.RESP_CODE_FIELD_DESC);
            abstractC0690bu.mo2362a(response.resp_code);
            abstractC0690bu.mo2376c();
            if (response.msg != null && response.isSetMsg()) {
                abstractC0690bu.mo2364a(Response.MSG_FIELD_DESC);
                abstractC0690bu.mo2370a(response.msg);
                abstractC0690bu.mo2376c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                abstractC0690bu.mo2364a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(abstractC0690bu);
                abstractC0690bu.mo2376c();
            }
            abstractC0690bu.mo2378d();
            abstractC0690bu.mo2375b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    public class C0822d implements InterfaceC0700cd {
        public C0822d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0700cd
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0821c mo2220b() {
            return new C0821c();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    public class C0821c extends AbstractC0702cf {
        public C0821c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo2216a(AbstractC0690bu abstractC0690bu, Response response) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            c0697ca.mo2362a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            c0697ca.m2435a(bitSet, 2);
            if (response.isSetMsg()) {
                c0697ca.mo2370a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(c0697ca);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC0699cc
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2218b(AbstractC0690bu abstractC0690bu, Response response) {
            C0697ca c0697ca = (C0697ca) abstractC0690bu;
            response.resp_code = c0697ca.mo2398w();
            response.setResp_codeIsSet(true);
            BitSet bitSetM2436b = c0697ca.m2436b(2);
            if (bitSetM2436b.get(0)) {
                response.msg = c0697ca.mo2401z();
                response.setMsgIsSet(true);
            }
            if (bitSetM2436b.get(1)) {
                C0827d c0827d = new C0827d();
                response.imprint = c0827d;
                c0827d.read(c0697ca);
                response.setImprintIsSet(true);
            }
        }
    }
}
