package com.tencent.p062mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import p067l.C14523;

/* JADX INFO: loaded from: classes.dex */
public class HandleScanResult {

    public class Req extends BaseReq {
        public static final int MAX_URL_LENGHT = 10240;
        public String scanResult;

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str = this.scanResult;
            return str != null && str.length() >= 0 && this.scanResult.length() <= 10240;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 17;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_scan_qrcode_result", C14523.encode(this.scanResult));
        }
    }

    public class Resp extends BaseResp {
        public Resp() {
        }

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 17;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }
    }
}
