package l;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18025 implements InterfaceC7276 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C19373 f56199 = new C19373(6);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaDrm f56200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56201;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID f56202;

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo19519() {
        int i = this.f56201 - 1;
        this.f56201 = i;
        if (i == 0) {
            this.f56200.release();
        }
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ᩳ */
    public final int mo19529() {
        return 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC7276 m42073(UUID uuid) {
        try {
            try {
                return new C18025(uuid);
            } catch (C20848 unused) {
                C19956.m46033("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new C12215();
            }
        } catch (UnsupportedSchemeException e) {
            throw new C20848(e);
        } catch (Exception e2) {
            throw new C20848(e2);
        }
    }

    public C18025(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C23875.f77201;
        C22632.m50630("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f56202 = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C23875.f77200)) ? uuid : uuid2);
        this.f56200 = mediaDrm;
        this.f56201 = 1;
        if (C23875.f77203.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final void mo19520(final InterfaceC11510 interfaceC11510) {
        this.f56200.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l.ۧۨ֫
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C18025 c18025 = this.f33015;
                InterfaceC11510 interfaceC11511 = interfaceC11510;
                c18025.getClass();
                HandlerC17154 handlerC17154 = ((C17860) interfaceC11511).f54545.f7505;
                handlerC17154.getClass();
                handlerC17154.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo19528() {
        return this.f56200.openSession();
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ᩳ */
    public final void mo19530(byte[] bArr) {
        this.f56200.closeSession(bArr);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final void mo19521(byte[] bArr, C13830 c13830) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C16613.m39136(this.f56200, bArr, c13830);
            } catch (UnsupportedOperationException unused) {
                C19956.m46037("setLogSessionId failed.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final C5865 mo19518(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C18937 c18937;
        C1577 c1577M26945;
        int i3;
        int i4;
        byte[] bArrM26946;
        C1577 c1577M26946;
        UUID uuid = this.f56202;
        C18937 c18938 = null;
        if (list != null) {
            if (!C23875.f77203.equals(uuid)) {
                c18937 = (C18937) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c18937 = (C18937) list.get(0);
                        break;
                    }
                    C18937 c18939 = (C18937) list.get(i2);
                    byte[] bArr3 = c18939.f59729;
                    bArr3.getClass();
                    c1577M26945 = C10750.m26945(bArr3);
                    if (c1577M26945 == null) {
                        i3 = -1;
                    } else {
                        i3 = c1577M26945.f5585;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        c18937 = c18939;
                        break;
                    }
                }
            } else {
                C18937 c189310 = (C18937) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        C18937 c189311 = (C18937) list.get(i5);
                        byte[] bArr4 = c189311.f59729;
                        bArr4.getClass();
                        if (!C11003.equals(c189311.f59727, c189310.f59727) || !C11003.equals(c189311.f59728, c189310.f59728) || C10750.m26945(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c18937 = (C18937) list.get(0);
                                    break;
                                }
                                C18937 c189312 = (C18937) list.get(i2);
                                byte[] bArr5 = c189312.f59729;
                                bArr5.getClass();
                                c1577M26945 = C10750.m26945(bArr5);
                                if (c1577M26945 == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c1577M26945.f5585;
                                }
                                i4 = Build.VERSION.SDK_INT;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                c18937 = c189312;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((C18937) list.get(i7)).f59729;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        c18937 = new C18937(c189310.f59726, c189310.f59728, c189310.f59727, bArr6);
                    }
                }
            }
            byte[] bArrM26947 = c18937.f59729;
            bArrM26947.getClass();
            UUID uuid2 = C23875.f77202;
            if (uuid2.equals(uuid)) {
                byte[] bArrM26948 = C10750.m26946(uuid, bArrM26947);
                if (bArrM26948 != null) {
                    bArrM26947 = bArrM26948;
                }
                C17714 c17714 = new C17714(bArrM26947);
                int iM41490 = c17714.m41490();
                short sM41470 = c17714.m41470();
                short sM41471 = c17714.m41470();
                if (sM41470 == 1 && sM41471 == 1) {
                    short sM41472 = c17714.m41470();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM41459 = c17714.m41459(sM41472, charset);
                    if (!strM41459.contains("<LA_URL>")) {
                        int iIndexOf = strM41459.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            C19956.m46037("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(strM41459.substring(0, iIndexOf));
                        sb.append("<LA_URL>https://x</LA_URL>");
                        String strM46305 = C20087.m46305(iIndexOf, strM41459, sb);
                        int i8 = iM41490 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sM41470);
                        byteBufferAllocate.putShort(sM41471);
                        byteBufferAllocate.putShort((short) (strM46305.length() * 2));
                        byteBufferAllocate.put(strM46305.getBytes(charset));
                        bArrM26947 = byteBufferAllocate.array();
                    }
                } else {
                    C19956.m46035("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM26947 = C10750.m26947(uuid2, null, bArrM26947);
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 27 && C11003.equals(uuid, C23875.f77200) && (c1577M26946 = C10750.m26945(bArrM26947)) != null) {
                bArrM26947 = C10750.m26947(C23875.f77201, c1577M26946.f5582, c1577M26946.f5583);
            }
            if (i9 < 23 && C23875.f77203.equals(uuid)) {
                bArrM26946 = C10750.m26946(uuid, bArrM26947);
                if (bArrM26946 != null) {
                    bArrM26947 = bArrM26946;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str2 = Build.MODEL;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                    bArrM26946 = C10750.m26946(uuid, bArrM26947);
                    if (bArrM26946 != null) {
                        bArrM26947 = bArrM26946;
                    }
                }
            }
            String str3 = c18937.f59727;
            str = (i9 < 26 && C23875.f77200.equals(uuid) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) ? "cenc" : str3;
            bArr2 = bArrM26947;
            c18938 = c18937;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f56200.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C23875.f77200.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = C3603.m11021(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f56200.getPropertyString("version");
            if (C11003.equals(propertyString, "1.2") || C11003.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c18938 != null) {
            String str4 = c18938.f59728;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            keyRequest.getRequestType();
        }
        return new C5865(data, defaultUrl);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo19526(byte[] bArr, byte[] bArr2) {
        if (C23875.f77200.equals(this.f56202) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(C3603.m11021(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                C19956.m46034("Failed to adjust response data: ".concat(C3603.m11021(bArr2)), e);
            }
        }
        return this.f56200.provideKeyResponse(bArr, bArr2);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ۧ */
    public final C13625 mo19524() {
        MediaDrm.ProvisionRequest provisionRequest = this.f56200.getProvisionRequest();
        return new C13625(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ۧ */
    public final void mo19525(byte[] bArr) throws DeniedByServerException {
        this.f56200.provideProvisionResponse(bArr);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final Map mo19517(byte[] bArr) {
        return this.f56200.queryKeyStatus(bArr);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19523(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f56202;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C23875.f77203);
            MediaDrm mediaDrm = this.f56200;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C23875.f77200);
            }
            if (zEquals) {
                return C16613.m39137(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !C11003.equals(uuid, C23875.f77200)) ? uuid : C23875.f77201, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto2 = mediaCrypto;
                    boolean z = !uuid.equals(C23875.f77200);
                    if (mediaCrypto2 != null) {
                        mediaCrypto2.release();
                    }
                    return z;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto = mediaCrypto2;
        }
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ֫ */
    public final void mo19522(byte[] bArr, byte[] bArr2) {
        this.f56200.restoreKeys(bArr, bArr2);
    }

    @Override // l.InterfaceC7276
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC19021 mo19527(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f56202;
        if (i < 27 && C11003.equals(uuid, C23875.f77200)) {
            uuid = C23875.f77201;
        }
        return new C1797(uuid, bArr);
    }
}
