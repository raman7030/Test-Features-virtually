package l;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19902 {
    public final C4379 mObservable = new C4379();
    public boolean mHasStableIds = false;
    public EnumC22018 mStateRestorationPolicy = EnumC22018.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC19902 abstractC19902, AbstractC3255 abstractC3255, int i) {
        if (abstractC19902 == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onAttachedToRecyclerView(C13132 c13132) {
    }

    public abstract void onBindViewHolder(AbstractC3255 abstractC3255, int i);

    public abstract AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(C13132 c13132) {
    }

    public boolean onFailedToRecycleView(AbstractC3255 abstractC3255) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC3255 abstractC3255) {
    }

    public void onViewDetachedFromWindow(AbstractC3255 abstractC3255) {
    }

    public void onViewRecycled(AbstractC3255 abstractC3255) {
    }

    public void onBindViewHolder(AbstractC3255 abstractC3255, int i, List list) {
        onBindViewHolder(abstractC3255, i);
    }

    public final AbstractC3255 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = C5342.f16662;
            Trace.beginSection(C13132.TRACE_CREATE_VIEW_TAG);
            AbstractC3255 abstractC3255OnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (abstractC3255OnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC3255OnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return abstractC3255OnCreateViewHolder;
        } catch (Throwable th) {
            int i3 = C5342.f16662;
            Trace.endSection();
            throw th;
        }
    }

    public final void bindViewHolder(AbstractC3255 abstractC3255, int i) {
        boolean z = abstractC3255.mBindingAdapter == null;
        if (z) {
            abstractC3255.mPosition = i;
            if (hasStableIds()) {
                abstractC3255.mItemId = getItemId(i);
            }
            abstractC3255.setFlags(1, 519);
            int i2 = C5342.f16662;
            Trace.beginSection(C13132.TRACE_BIND_VIEW_TAG);
        }
        abstractC3255.mBindingAdapter = this;
        if (C13132.sDebugAssertionsEnabled) {
            if (abstractC3255.itemView.getParent() == null) {
                View view = abstractC3255.itemView;
                int i3 = C17648.f53953;
                if (view.isAttachedToWindow() != abstractC3255.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC3255.isTmpDetached() + ", attached to window: " + abstractC3255.itemView.isAttachedToWindow() + ", holder: " + abstractC3255);
                }
            }
            if (abstractC3255.itemView.getParent() == null) {
                View view2 = abstractC3255.itemView;
                int i4 = C17648.f53953;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC3255);
                }
            }
        }
        onBindViewHolder(abstractC3255, i, abstractC3255.getUnmodifiedPayloads());
        if (z) {
            abstractC3255.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC3255.itemView.getLayoutParams();
            if (layoutParams instanceof C14543) {
                ((C14543) layoutParams).f44552 = true;
            }
            int i5 = C5342.f16662;
            Trace.endSection();
        }
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z;
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final boolean hasObservers() {
        return this.mObservable.m13112();
    }

    public void registerAdapterDataObserver(AbstractC2968 abstractC2968) {
        this.mObservable.registerObserver(abstractC2968);
    }

    public void unregisterAdapterDataObserver(AbstractC2968 abstractC2968) {
        this.mObservable.unregisterObserver(abstractC2968);
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m13113();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.m13111(i, 1, null);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.m13111(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.m13111(i, i2, null);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.m13111(i, i2, obj);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.m13114(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.m13110(i, i2);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.m13114(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.m13116(i, 1);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.m13116(i, i2);
    }

    public void setStateRestorationPolicy(EnumC22018 enumC22018) {
        this.mStateRestorationPolicy = enumC22018;
        this.mObservable.m13115();
    }

    public final EnumC22018 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public boolean canRestoreState() {
        int i = C21313.f68700[this.mStateRestorationPolicy.ordinal()];
        return i != 1 && (i != 2 || getItemCount() > 0);
    }
}
