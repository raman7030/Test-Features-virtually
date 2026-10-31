package org.chromium.support_lib_boundary;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface NoVarySearchDataBoundaryInterface {
    List getConsideredQueryParameters();

    boolean getIgnoreDifferencesInParameters();

    List getIgnoredQueryParameters();

    boolean getVaryOnKeyOrder();
}
