package com.google.android.material.transition;

import l.AbstractC16620;
import l.InterfaceC5872;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionListenerAdapter implements InterfaceC5872 {
    @Override // l.InterfaceC5872
    public void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public void onTransitionEnd(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public void onTransitionPause(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public void onTransitionResume(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public void onTransitionStart(AbstractC16620 abstractC16620) {
    }

    @Override // l.InterfaceC5872
    public void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
        onTransitionStart(abstractC16620);
    }

    @Override // l.InterfaceC5872
    public void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
        onTransitionEnd(abstractC16620);
    }
}
