package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class HandlerChainFactory {
    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m1403() {
        return m1401(RequestHandler.class, "/com/amazonaws/services/s3/request.handlers");
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m1402() {
        return m1401(RequestHandler2.class, "/com/amazonaws/services/s3/request.handler2s");
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m1401(Class cls, String str) throws Throwable {
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StringUtils.f2004));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            String strTrim = line.trim();
                            if (!"".equals(strTrim)) {
                                Object objNewInstance = ClassLoaderHelper.m1925(strTrim, cls, getClass()).newInstance();
                                if (cls.isInstance(objNewInstance)) {
                                    if (cls == RequestHandler2.class) {
                                        arrayList.add((RequestHandler2) objNewInstance);
                                    } else if (cls == RequestHandler.class) {
                                        arrayList.add(new RequestHandler2Adaptor((RequestHandler) objNewInstance));
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + strTrim + "') does not implement the " + cls + " API.");
                                }
                            }
                        } else {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader2 = bufferedReader;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
        throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
    }
}
