package com.alipay.sdk.p010m.p033l;

import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: com.alipay.sdk.m.l.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0163c {
    SUCCEEDED(OpenAuthTask.f239OK, "处理成功"),
    FAILED(OpenAuthTask.SYS_ERR, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(OpenAuthTask.NOT_INSTALLED, "参数错误"),
    DOUBLE_REQUEST(OpenAuthTask.Duplex, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");


    /* JADX INFO: renamed from: a */
    public int f559a;

    /* JADX INFO: renamed from: b */
    public String f560b;

    EnumC0163c(int i, String str) {
        this.f559a = i;
        this.f560b = str;
    }

    /* JADX INFO: renamed from: b */
    public void m740b(int i) {
        this.f559a = i;
    }

    /* JADX INFO: renamed from: c */
    public int m741c() {
        return this.f559a;
    }

    /* JADX INFO: renamed from: a */
    public void m738a(String str) {
        this.f560b = str;
    }

    /* JADX INFO: renamed from: b */
    public String m739b() {
        return this.f560b;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC0163c m736a(int i) {
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i == 8000) {
            return PAY_WAITTING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i == 6001) {
            return CANCELED;
        }
        if (i != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }
}
