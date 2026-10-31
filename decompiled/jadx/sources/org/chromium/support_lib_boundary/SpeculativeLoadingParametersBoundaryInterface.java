package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface SpeculativeLoadingParametersBoundaryInterface {
    Map getAdditionalHeaders();

    InvocationHandler getNoVarySearchData();

    boolean isJavaScriptEnabled();
}
