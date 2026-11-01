package com.tencent.p062mm.opensdk.diffdev;

/* JADX INFO: loaded from: classes.dex */
public interface OAuthListener {
    void onAuthFinish(OAuthErrCode oAuthErrCode, String str);

    void onAuthGotQrcode(String str, byte[] bArr);

    void onQrcodeScanned();
}
