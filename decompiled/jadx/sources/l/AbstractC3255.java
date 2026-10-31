package l;

import android.view.View;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3255 {
    public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    public static final int FLAG_BOUND = 1;
    public static final int FLAG_IGNORE = 128;
    public static final int FLAG_INVALID = 4;
    public static final int FLAG_MOVED = 2048;
    public static final int FLAG_NOT_RECYCLABLE = 16;
    public static final int FLAG_REMOVED = 8;
    public static final int FLAG_RETURNED_FROM_SCRAP = 32;
    public static final int FLAG_TMP_DETACHED = 256;
    public static final int FLAG_UPDATE = 2;
    public static final List FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    public AbstractC19902 mBindingAdapter;
    public int mFlags;
    public WeakReference mNestedRecyclerView;
    public C13132 mOwnerRecyclerView;
    public int mPosition = -1;
    public int mOldPosition = -1;
    public long mItemId = -1;
    public int mItemViewType = -1;
    public int mPreLayoutPosition = -1;
    public AbstractC3255 mShadowedHolder = null;
    public AbstractC3255 mShadowingHolder = null;
    public List mPayloads = null;
    public List mUnmodifiedPayloads = null;
    public int mIsRecyclableCount = 0;
    public C2550 mScrapContainer = null;
    public boolean mInChangeScrap = false;
    public int mWasImportantForAccessibilityBeforeHidden = 0;
    public int mPendingAccessibilityState = -1;

    public AbstractC3255(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.itemView = view;
    }

    public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
        addFlags(8);
        offsetPosition(i2, z);
        this.mPosition = i;
    }

    public void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z) {
            this.mPreLayoutPosition += i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((C14543) this.itemView.getLayoutParams()).f44552 = true;
        }
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final int getBindingAdapterPosition() {
        C13132 c13132;
        AbstractC19902 adapter;
        int adapterPositionInRecyclerView;
        if (this.mBindingAdapter == null || (c13132 = this.mOwnerRecyclerView) == null || (adapter = c13132.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
    }

    public final int getAbsoluteAdapterPosition() {
        C13132 c13132 = this.mOwnerRecyclerView;
        if (c13132 == null) {
            return -1;
        }
        return c13132.getAdapterPositionInRecyclerView(this);
    }

    public final AbstractC19902 getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public void unScrap() {
        this.mScrapContainer.m8078(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public void setScrapContainer(C2550 c2550, boolean z) {
        this.mScrapContainer = c2550;
        this.mInChangeScrap = z;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean hasAnyOfTheFlags(int i) {
        return (i & this.mFlags) != 0;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (~i2));
    }

    public void addFlags(int i) {
        this.mFlags = i | this.mFlags;
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
        } else if ((1024 & this.mFlags) == 0) {
            m9974();
            this.mPayloads.add(obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9974() {
        if (this.mPayloads == null) {
            ArrayList arrayList = new ArrayList();
            this.mPayloads = arrayList;
            this.mUnmodifiedPayloads = C20195.unmodifiableList(arrayList);
        }
    }

    public void clearPayload() {
        List list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public List getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) == 0) {
            List list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public void resetInternal() {
        if (C13132.sDebugAssertionsEnabled && isTmpDetached()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        C13132.m31835(this);
    }

    public void onEnteredHiddenState(C13132 c13132) {
        int i = this.mPendingAccessibilityState;
        if (i != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i;
        } else {
            View view = this.itemView;
            int i2 = C17648.f53953;
            this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
        }
        c13132.setChildImportantForAccessibilityInternal(this, 4);
    }

    public void onLeftHiddenState(C13132 c13132) {
        c13132.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public String toString() {
        StringBuilder sbM19190 = C7166.m19190(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM19190.append(Integer.toHexString(hashCode()));
        sbM19190.append(" position=");
        sbM19190.append(this.mPosition);
        sbM19190.append(" id=");
        sbM19190.append(this.mItemId);
        sbM19190.append(", oldPos=");
        sbM19190.append(this.mOldPosition);
        sbM19190.append(", pLpos:");
        sbM19190.append(this.mPreLayoutPosition);
        StringBuilder sb = new StringBuilder(sbM19190.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final void setIsRecyclable(boolean z) {
        int i = this.mIsRecyclableCount;
        int i2 = z ? i - 1 : i + 1;
        this.mIsRecyclableCount = i2;
        if (i2 < 0) {
            this.mIsRecyclableCount = 0;
            if (C13132.sDebugAssertionsEnabled) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z && i2 == 1) {
            this.mFlags |= 16;
        } else if (z && i2 == 0) {
            this.mFlags &= -17;
        }
        if (C13132.sVerboseLoggingEnabled) {
            toString();
        }
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        int i = C17648.f53953;
        return !view.hasTransientState();
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        int i = C17648.f53953;
        return view.hasTransientState();
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }
}
