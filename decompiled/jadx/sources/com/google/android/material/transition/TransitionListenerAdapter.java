package com.google.android.material.transition;

import p067l.AbstractC18164;
import p067l.InterfaceC7949;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionListenerAdapter implements InterfaceC7949 {
    @Override // p067l.InterfaceC7949
    public void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionEnd(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionPause(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionResume(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionStart(AbstractC18164 abstractC18164) {
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
        onTransitionStart(abstractC18164);
    }

    @Override // p067l.InterfaceC7949
    public void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
        onTransitionEnd(abstractC18164);
    }
}
