package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.ܶᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6WI */
/* JADX INFO: loaded from: classes4.dex */
public final class C17015 implements InterfaceC11201 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ String f50326;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C6878[] f50327;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ C18615 f50328;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean f50329;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ long f50330;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C10569 f50331;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int[] f50332;

    /* JADX INFO: renamed from: ᩸ */
    public String f50333;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ String[] f50334;

    public C17015(String str, String str2, String[] strArr, C10569 c10569, boolean z, int[] iArr, long j, C6878[] c6878Arr, C18615 c18615) {
        this.f50326 = str2;
        this.f50334 = strArr;
        this.f50331 = c10569;
        this.f50329 = z;
        this.f50332 = iArr;
        this.f50330 = j;
        this.f50327 = c6878Arr;
        this.f50328 = c18615;
        this.f50333 = str;
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
        C6878[] c6878Arr = this.f50327;
        String strMo25505 = c16564.f48646.mo25505();
        this.f50333 = strMo25505;
        C23722.m52753(strMo25505);
        byte[] bArrM55001 = C25063.m55001(c16564, 524288);
        C23722.m52753(this.f50333);
        try {
            C21631 c21631M34145 = C14924.m34145(this.f50326, bArrM55001);
            String str = c21631M34145.f68178;
            String str2 = c21631M34145.f68177;
            String[] strArr = this.f50334;
            strArr[0] = str2;
            try {
                C11240 c11240M24359 = this.f50331.m24359(str, this.f50329);
                int iM26036 = c11240M24359.m26036();
                int[] iArr = this.f50332;
                iArr[0] = iM26036;
                long j = this.f50330;
                if (j != -1 && j != iM26036) {
                    throw C5276.m11407("FILE_TEXT_REPLACEMENT_COUNT_MISMATCH", "The selected replacement count differs from expectedReplacements. No changes were published.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, this.f50333).add("expectedReplacements", j).add("actualReplacements", iArr[0]));
                }
                if (c11240M24359.m26037().equals(str)) {
                    bufferedOutputStream.write(bArrM55001);
                } else {
                    try {
                        C6878 c6878M34144 = C14924.m34144(10485760, c11240M24359.m26037(), strArr[0]);
                        c6878Arr[0] = c6878M34144;
                        if (!this.f50328.m42357(c6878M34144.f17882)) {
                            throw C23722.m52751("FILE_TEXT_ENCODING_MISMATCH", "The replacement would change the physical BOM. Adjust the pattern or replacement text to preserve it.", this.f50333);
                        }
                        bufferedOutputStream.write(c6878Arr[0].f17882);
                    } catch (CharacterCodingException unused) {
                        throw C23722.m52751("FILE_TEXT_ENCODE_FAILED", "The replacement cannot be represented in the selected encoding.", this.f50333);
                    } catch (C5537 e) {
                        throw C23722.m52755(this.f50333, JSON.value(e.f13347));
                    }
                }
                C23722.m52753(this.f50333);
            } catch (C24650 e2) {
                throw C23722.m52756(e2, this.f50333);
            }
        } catch (CharacterCodingException unused2) {
            throw C23722.m52751("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected encoding.", this.f50333);
        } catch (C23642 unused3) {
            throw C23722.m52751("FILE_TEXT_ENCODING_MISMATCH", "Copy the current file's encoding including its physical BOM.", this.f50333);
        }
    }

    @Override // p067l.InterfaceC11201
    /* JADX INFO: renamed from: ֫ */
    public final void mo9169() throws C5276 {
        C23722.m52753(this.f50333);
    }
}
