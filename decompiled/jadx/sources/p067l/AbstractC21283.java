package p067l;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21283 {
    public final C6530 mObservable = new C6530();
    public boolean mHasStableIds = false;
    public EnumC23294 mStateRestorationPolicy = EnumC23294.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC21283 abstractC21283, AbstractC5462 abstractC5462, int i) {
        if (abstractC21283 == this) {
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

    public void onAttachedToRecyclerView(C14849 c14849) {
    }

    public abstract void onBindViewHolder(AbstractC5462 abstractC5462, int i);

    public abstract AbstractC5462 onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(C14849 c14849) {
    }

    public boolean onFailedToRecycleView(AbstractC5462 abstractC5462) {
        return false;
    }

    public void onViewAttachedToWindow(AbstractC5462 abstractC5462) {
    }

    public void onViewDetachedFromWindow(AbstractC5462 abstractC5462) {
    }

    public void onViewRecycled(AbstractC5462 abstractC5462) {
    }

    public void onBindViewHolder(AbstractC5462 abstractC5462, int i, List list) {
        onBindViewHolder(abstractC5462, i);
    }

    public final AbstractC5462 createViewHolder(ViewGroup viewGroup, int i) {
        try {
            int i2 = C1107.f19501;
            Trace.beginSection(C14849.TRACE_CREATE_VIEW_TAG);
            AbstractC5462 abstractC5462OnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (abstractC5462OnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            abstractC5462OnCreateViewHolder.mItemViewType = i;
            Trace.endSection();
            return abstractC5462OnCreateViewHolder;
        } catch (Throwable th) {
            int i3 = C1107.f19501;
            Trace.endSection();
            throw th;
        }
    }

    public final void bindViewHolder(AbstractC5462 abstractC5462, int i) {
        boolean z = abstractC5462.mBindingAdapter == null;
        if (z) {
            abstractC5462.mPosition = i;
            if (hasStableIds()) {
                abstractC5462.mItemId = getItemId(i);
            }
            abstractC5462.setFlags(1, 519);
            int i2 = C1107.f19501;
            Trace.beginSection(C14849.TRACE_BIND_VIEW_TAG);
        }
        abstractC5462.mBindingAdapter = this;
        if (C14849.sDebugAssertionsEnabled) {
            if (abstractC5462.itemView.getParent() == null) {
                View view = abstractC5462.itemView;
                int i3 = C1717.f57146;
                if (view.isAttachedToWindow() != abstractC5462.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC5462.isTmpDetached() + ", attached to window: " + abstractC5462.itemView.isAttachedToWindow() + ", holder: " + abstractC5462);
                }
            }
            if (abstractC5462.itemView.getParent() == null) {
                View view2 = abstractC5462.itemView;
                int i4 = C1717.f57146;
                if (view2.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC5462);
                }
            }
        }
        onBindViewHolder(abstractC5462, i, abstractC5462.getUnmodifiedPayloads());
        if (z) {
            abstractC5462.clearPayload();
            ViewGroup.LayoutParams layoutParams = abstractC5462.itemView.getLayoutParams();
            if (layoutParams instanceof C16190) {
                ((C16190) layoutParams).f47658 = true;
            }
            int i5 = C1107.f19501;
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
        return this.mObservable.m14976();
    }

    public void registerAdapterDataObserver(AbstractC5189 abstractC5189) {
        this.mObservable.registerObserver(abstractC5189);
    }

    public void unregisterAdapterDataObserver(AbstractC5189 abstractC5189) {
        this.mObservable.unregisterObserver(abstractC5189);
    }

    public final void notifyDataSetChanged() {
        this.mObservable.m14977();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.m14975(i, 1, null);
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.m14975(i, 1, obj);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.m14975(i, i2, null);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.m14975(i, i2, obj);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.m14978(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.m14974(i, i2);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.m14978(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.m14980(i, 1);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.m14980(i, i2);
    }

    public void setStateRestorationPolicy(EnumC23294 enumC23294) {
        this.mStateRestorationPolicy = enumC23294;
        this.mObservable.m14979();
    }

    public final EnumC23294 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public boolean canRestoreState() {
        int i = C22624.f71391[this.mStateRestorationPolicy.ordinal()];
        return i != 1 && (i != 2 || getItemCount() > 0);
    }
}
