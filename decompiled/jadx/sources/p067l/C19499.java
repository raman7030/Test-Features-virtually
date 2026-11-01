package p067l;

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
public final class C19499 implements InterfaceC9283 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C20780 f59397 = new C20780(6);

    /* JADX INFO: renamed from: ֫ */
    public final MediaDrm f59398;

    /* JADX INFO: renamed from: ۧ */
    public int f59399;

    /* JADX INFO: renamed from: ܽ */
    public final UUID f59400;

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo21486() {
        int i = this.f59399 - 1;
        this.f59399 = i;
        if (i == 0) {
            this.f59398.release();
        }
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ᩳ */
    public final int mo21496() {
        return 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC9283 m44324(UUID uuid) {
        try {
            try {
                return new C19499(uuid);
            } catch (C22182 unused) {
                C21334.m48347("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new C13977();
            }
        } catch (UnsupportedSchemeException e) {
            throw new C22182(e);
        } catch (Exception e2) {
            throw new C22182(e2);
        }
    }

    public C19499(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C25059.f79953;
        C23877.m52956("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f59400 = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(C25059.f79952)) ? uuid : uuid2);
        this.f59398 = mediaDrm;
        this.f59399 = 1;
        if (C25059.f79955.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final void mo21487(final InterfaceC13307 interfaceC13307) {
        this.f59398.setOnEventListener(new MediaDrm.OnEventListener() { // from class: l.ۧۨ֫
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C19499 c19499 = this.f36008;
                InterfaceC13307 interfaceC13308 = interfaceC13307;
                c19499.getClass();
                HandlerC18671 handlerC18671 = ((C19342) interfaceC13308).f57743.f10296;
                handlerC18671.getClass();
                handlerC18671.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo21495() {
        return this.f59398.openSession();
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21497(byte[] bArr) {
        this.f59398.closeSession(bArr);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final void mo21488(byte[] bArr, C15512 c15512) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                C18157.m41363(this.f59398, bArr, c15512);
            } catch (UnsupportedOperationException unused) {
                C21334.m48351("setLogSessionId failed.");
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
    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final C7942 mo21485(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        C20366 c20366;
        C3867 c3867M28989;
        int i3;
        int i4;
        byte[] bArrM28990;
        C3867 c3867M289810;
        UUID uuid = this.f59400;
        C20366 c20367 = null;
        if (list != null) {
            if (!C25059.f79955.equals(uuid)) {
                c20366 = (C20366) list.get(0);
            } else if (Build.VERSION.SDK_INT < 28 || list.size() <= 1) {
                i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        c20366 = (C20366) list.get(0);
                        break;
                    }
                    C20366 c20368 = (C20366) list.get(i2);
                    byte[] bArr3 = c20368.f62960;
                    bArr3.getClass();
                    c3867M28989 = C12585.m28989(bArr3);
                    if (c3867M28989 == null) {
                        i3 = -1;
                    } else {
                        i3 = c3867M28989.f8365;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        c20366 = c20368;
                        break;
                    }
                }
            } else {
                C20366 c20369 = (C20366) list.get(0);
                int i5 = 0;
                int length = 0;
                while (true) {
                    if (i5 < list.size()) {
                        C20366 c203610 = (C20366) list.get(i5);
                        byte[] bArr4 = c203610.f62960;
                        bArr4.getClass();
                        if (!C12826.equals(c203610.f62958, c20369.f62958) || !C12826.equals(c203610.f62959, c20369.f62959) || C12585.m28989(bArr4) == null) {
                            i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    c20366 = (C20366) list.get(0);
                                    break;
                                }
                                C20366 c203611 = (C20366) list.get(i2);
                                byte[] bArr5 = c203611.f62960;
                                bArr5.getClass();
                                c3867M28989 = C12585.m28989(bArr5);
                                if (c3867M28989 == null) {
                                    i3 = -1;
                                } else {
                                    i3 = c3867M28989.f8365;
                                }
                                i4 = Build.VERSION.SDK_INT;
                                i2 = i4 >= 23 ? i2 + 1 : i2 + 1;
                                c20366 = c203611;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i5++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i6 = 0;
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            byte[] bArr7 = ((C20366) list.get(i7)).f62960;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i6, length2);
                            i6 += length2;
                        }
                        c20366 = new C20366(c20369.f62957, c20369.f62959, c20369.f62958, bArr6);
                    }
                }
            }
            byte[] bArrM28991 = c20366.f62960;
            bArrM28991.getClass();
            UUID uuid2 = C25059.f79954;
            if (uuid2.equals(uuid)) {
                byte[] bArrM28992 = C12585.m28990(uuid, bArrM28991);
                if (bArrM28992 != null) {
                    bArrM28991 = bArrM28992;
                }
                C19203 c19203 = new C19203(bArrM28991);
                int iM43736 = c19203.m43736();
                short sM43716 = c19203.m43716();
                short sM43717 = c19203.m43716();
                if (sM43716 == 1 && sM43717 == 1) {
                    short sM43718 = c19203.m43716();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM43705 = c19203.m43705(sM43718, charset);
                    if (!strM43705.contains("<LA_URL>")) {
                        int iIndexOf = strM43705.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            C21334.m48351("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(strM43705.substring(0, iIndexOf));
                        sb.append("<LA_URL>https://x</LA_URL>");
                        String strM48621 = C21459.m48621(iIndexOf, strM43705, sb);
                        int i8 = iM43736 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sM43716);
                        byteBufferAllocate.putShort(sM43717);
                        byteBufferAllocate.putShort((short) (strM48621.length() * 2));
                        byteBufferAllocate.put(strM48621.getBytes(charset));
                        bArrM28991 = byteBufferAllocate.array();
                    }
                } else {
                    C21334.m48349("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM28991 = C12585.m28991(uuid2, null, bArrM28991);
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 27 && C12826.equals(uuid, C25059.f79952) && (c3867M289810 = C12585.m28989(bArrM28991)) != null) {
                bArrM28991 = C12585.m28991(C25059.f79953, c3867M289810.f8362, c3867M289810.f8363);
            }
            if (i9 < 23 && C25059.f79955.equals(uuid)) {
                bArrM28990 = C12585.m28990(uuid, bArrM28991);
                if (bArrM28990 != null) {
                    bArrM28991 = bArrM28990;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str2 = Build.MODEL;
                if ("AFTB".equals(str2) || "AFTS".equals(str2) || "AFTM".equals(str2) || "AFTT".equals(str2)) {
                    bArrM28990 = C12585.m28990(uuid, bArrM28991);
                    if (bArrM28990 != null) {
                        bArrM28991 = bArrM28990;
                    }
                }
            }
            String str3 = c20366.f62958;
            str = (i9 < 26 && C25059.f79952.equals(uuid) && ("video/mp4".equals(str3) || "audio/mp4".equals(str3))) ? "cenc" : str3;
            bArr2 = bArrM28991;
            c20367 = c20366;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f59398.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C25059.f79952.equals(uuid) && Build.VERSION.SDK_INT < 27) {
            data = C5792.m12997(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f59398.getPropertyString("version");
            if (C12826.equals(propertyString, "1.2") || C12826.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c20367 != null) {
            String str4 = c20367.f62959;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            keyRequest.getRequestType();
        }
        return new C7942(data, defaultUrl);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ۧ */
    public final byte[] mo21493(byte[] bArr, byte[] bArr2) {
        if (C25059.f79952.equals(this.f59400) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(C5792.m12997(bArr2));
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
                C21334.m48348("Failed to adjust response data: ".concat(C5792.m12997(bArr2)), e);
            }
        }
        return this.f59398.provideKeyResponse(bArr, bArr2);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ۧ */
    public final C15317 mo21491() {
        MediaDrm.ProvisionRequest provisionRequest = this.f59398.getProvisionRequest();
        return new C15317(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ۧ */
    public final void mo21492(byte[] bArr) throws DeniedByServerException {
        this.f59398.provideProvisionResponse(bArr);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final Map mo21484(byte[] bArr) {
        return this.f59398.queryKeyStatus(bArr);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21490(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f59400;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C25059.f79955);
            MediaDrm mediaDrm = this.f59398;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C25059.f79952);
            }
            if (zEquals) {
                return C18157.m41364(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !C12826.equals(uuid, C25059.f79952)) ? uuid : C25059.f79953, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto2 = mediaCrypto;
                    boolean z = !uuid.equals(C25059.f79952);
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

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ֫ */
    public final void mo21489(byte[] bArr, byte[] bArr2) {
        this.f59398.restoreKeys(bArr, bArr2);
    }

    @Override // p067l.InterfaceC9283
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20446 mo21494(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f59400;
        if (i < 27 && C12826.equals(uuid, C25059.f79952)) {
            uuid = C25059.f79953;
        }
        return new C4076(uuid, bArr);
    }
}
