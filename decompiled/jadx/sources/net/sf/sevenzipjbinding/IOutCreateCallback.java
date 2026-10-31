package net.sf.sevenzipjbinding;

import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: loaded from: classes.dex */
public interface IOutCreateCallback extends IProgress {
    IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory);

    ISequentialInStream getStream(int i);

    void setOperationResult(boolean z);
}
