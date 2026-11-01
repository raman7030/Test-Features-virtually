package com.tencent.p062mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p062mm.opensdk.modelbase.BaseReq;
import com.tencent.p062mm.opensdk.modelbase.BaseResp;
import com.tencent.p062mm.opensdk.utils.C0626d;
import com.tencent.p062mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes.dex */
public class WXInvoiceAuthInsert {

    public final class Req extends BaseReq {
        public static final String TAG = "MicroMsg.SDK.WXInvoiceAuthInsert.Req";
        public static final int URL_LENGTH_LIMIT = 10240;
        public String url;

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            if (C0626d.m2033b(this.url)) {
                Log.m2022i(TAG, "url should not be empty");
                return false;
            }
            if (this.url.length() <= 10240) {
                return true;
            }
            Log.m2021e(TAG, "url must be in 10k");
            return false;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_invoice_auth_insert_req_url");
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 20;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseReq
        public final void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_invoice_auth_insert_req_url", this.url);
        }
    }

    public final class Resp extends BaseResp {
        public String wxOrderId;

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_invoice_auth_insert_order_id");
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 20;
        }

        @Override // com.tencent.p062mm.opensdk.modelbase.BaseResp
        public final void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_invoice_auth_insert_order_id", this.wxOrderId);
        }
    }
}
