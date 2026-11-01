package p067l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۖ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4792 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f10865;

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C14849 f10866;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f10867;

    /* JADX INFO: renamed from: ܳ */
    public final List f10868;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f10869;

    /* JADX INFO: renamed from: ܿ */
    public int f10870;

    /* JADX INFO: renamed from: ᩳ */
    public C17531 f10871;

    /* JADX INFO: renamed from: ᩻ */
    public int f10872;

    public C4792(C14849 c14849) {
        this.f10866 = c14849;
        ArrayList arrayList = new ArrayList();
        this.f10865 = arrayList;
        this.f10869 = null;
        this.f10867 = new ArrayList();
        this.f10868 = C21562.unmodifiableList(arrayList);
        this.f10870 = 2;
        this.f10872 = 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10105(AbstractC21283 abstractC21283, AbstractC21283 abstractC21284, boolean z) {
        this.f10865.clear();
        m10113();
        m10096(abstractC21283, true);
        C17531 c17531M10100 = m10100();
        if (abstractC21283 != null) {
            c17531M10100.f52393--;
        }
        if (!z && c17531M10100.f52393 == 0) {
            SparseArray sparseArray = c17531M10100.f52395;
            for (int i = 0; i < sparseArray.size(); i++) {
                C10827 c10827 = (C10827) sparseArray.valueAt(i);
                Iterator it = c10827.f29992.iterator();
                while (it.hasNext()) {
                    C11848.m27155(((AbstractC5462) it.next()).itemView);
                }
                c10827.f29992.clear();
            }
        }
        if (abstractC21284 != null) {
            c17531M10100.f52393++;
        } else {
            c17531M10100.getClass();
        }
        m10097();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m10115(int i) {
        this.f10870 = i;
        m10110();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m10110() {
        AbstractC18873 abstractC18873 = this.f10866.mLayout;
        this.f10872 = this.f10870 + (abstractC18873 != null ? abstractC18873.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f10867;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f10872) {
                return;
            } else {
                m10112(size);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m10107() {
        return this.f10868;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10098(int i) {
        C14849 c14849 = this.f10866;
        if (i >= 0 && i < c14849.mState.m51124()) {
            return !c14849.mState.f72063 ? i : c14849.mAdapterHelper.m6933(i, 0);
        }
        StringBuilder sbM34408 = C15033.m34408(i, "invalid position ", ". State item count is ");
        sbM34408.append(c14849.mState.m51124());
        sbM34408.append(c14849.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    /* JADX INFO: renamed from: ۧ */
    public final View m10106(int i) {
        return m10099(i, C14849.FOREVER_NS).itemView;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:165:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x02da  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fd A[LOOP:5: B:170:0x02e8->B:174:0x02fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0300 A[EDGE_INSN: B:175:0x0300->B:176:0x0301 BREAK  A[LOOP:5: B:170:0x02e8->B:174:0x02fd]] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303  */
    /* JADX WARN: Code duplicated, block: B:179:0x030a  */
    /* JADX WARN: Code duplicated, block: B:181:0x0310  */
    /* JADX WARN: Code duplicated, block: B:184:0x0318  */
    /* JADX WARN: Code duplicated, block: B:197:0x0375  */
    /* JADX WARN: Code duplicated, block: B:206:0x0395  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:214:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:220:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x0408  */
    /* JADX WARN: Code duplicated, block: B:232:0x041c  */
    /* JADX WARN: Code duplicated, block: B:233:0x042d  */
    /* JADX WARN: Code duplicated, block: B:236:0x0435  */
    /* JADX WARN: Code duplicated, block: B:239:0x044e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0458  */
    /* JADX WARN: Code duplicated, block: B:242:0x045d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0463  */
    /* JADX WARN: Code duplicated, block: B:248:0x046b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0475  */
    /* JADX WARN: Code duplicated, block: B:253:0x047c  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487  */
    /* JADX WARN: Code duplicated, block: B:258:0x0493  */
    /* JADX WARN: Code duplicated, block: B:260:0x0499  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:264:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x04af  */
    /* JADX WARN: Code duplicated, block: B:277:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0300 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[EDGE_INSN: B:35:0x0083->B:36:0x0084 BREAK  A[LOOP:0: B:14:0x0027->B:20:0x0041]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103 A[EDGE_INSN: B:70:0x0103->B:87:0x015b BREAK  A[LOOP:1: B:43:0x0095->B:55:0x00c0]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163  */
    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0111, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5462 m10099(int i, long j) {
        AbstractC5462 abstractC5462CreateViewHolder;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        boolean z2;
        AbstractC5462 abstractC5462;
        long nanoTime;
        boolean z3;
        boolean z4;
        View view;
        C12168 c12168;
        C1658 itemDelegate;
        ViewGroup.LayoutParams layoutParams;
        C16190 c16190;
        boolean z5;
        int iM6933;
        long nanoTime2;
        C14849 c14849M33896;
        C10827 c10827;
        AbstractC5462 abstractC5463;
        View view2;
        ArrayList arrayList3;
        int size;
        int size2;
        int i2;
        ArrayList arrayList4;
        int size3;
        int i3;
        View view3;
        int size4;
        int i4;
        AbstractC5462 abstractC5464;
        int iM52817;
        AbstractC5462 abstractC5462M33925;
        int i5;
        boolean z6;
        int size5;
        int iM6934;
        C14849 c14849 = this.f10866;
        if (i < 0 || i >= c14849.mState.m51124()) {
            StringBuilder sbM49005 = C21720.m49005("Invalid item position ", i, MotionUtils.EASING_TYPE_FORMAT_START, "). Item count:", i);
            sbM49005.append(c14849.mState.m51124());
            sbM49005.append(c14849.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (c14849.mState.f72063) {
            ArrayList arrayList5 = this.f10869;
            if (arrayList5 != null && (size5 = arrayList5.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        if (c14849.mAdapter.hasStableIds() && (iM6934 = c14849.mAdapterHelper.m6933(i, 0)) > 0 && iM6934 < c14849.mAdapter.getItemCount()) {
                            long itemId = c14849.mAdapter.getItemId(iM6934);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    abstractC5462CreateViewHolder = null;
                                    break;
                                }
                                AbstractC5462 abstractC5465 = (AbstractC5462) this.f10869.get(i7);
                                if (!abstractC5465.wasReturnedFromScrap() && abstractC5465.getItemId() == itemId) {
                                    abstractC5465.addFlags(32);
                                    abstractC5462CreateViewHolder = abstractC5465;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            abstractC5462CreateViewHolder = null;
                            break;
                        }
                    } else {
                        abstractC5462CreateViewHolder = (AbstractC5462) this.f10869.get(i6);
                        if (!abstractC5462CreateViewHolder.wasReturnedFromScrap() && abstractC5462CreateViewHolder.getLayoutPosition() == i) {
                            abstractC5462CreateViewHolder.addFlags(32);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                abstractC5462CreateViewHolder = null;
                break;
            }
            z = abstractC5462CreateViewHolder != null;
            arrayList = this.f10865;
            arrayList2 = this.f10867;
            if (abstractC5462CreateViewHolder == null) {
                size2 = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        arrayList4 = c14849.mChildHelper.f75584;
                        size3 = arrayList4.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size3) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i3);
                            abstractC5462M33925 = C14849.m33925(view3);
                            if (abstractC5462M33925.getLayoutPosition() != i && !abstractC5462M33925.isInvalid() && !abstractC5462M33925.isRemoved()) {
                                break;
                            }
                            i3++;
                        }
                        if (view3 != null) {
                            size4 = arrayList2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size4) {
                                    abstractC5462CreateViewHolder = null;
                                    break;
                                }
                                abstractC5464 = (AbstractC5462) arrayList2.get(i4);
                                if (abstractC5464.isInvalid() && abstractC5464.getLayoutPosition() == i && !abstractC5464.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i4);
                                    if (C14849.sVerboseLoggingEnabled) {
                                        abstractC5464.toString();
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            abstractC5462CreateViewHolder = C14849.m33925(view3);
                            c14849.mChildHelper.m52821(view3);
                            iM52817 = c14849.mChildHelper.m52817(view3);
                            if (iM52817 != -1) {
                                c14849.mChildHelper.m52812(iM52817);
                                m10108(view3);
                                abstractC5462CreateViewHolder.addFlags(8224);
                                break;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC5462CreateViewHolder + c14849.exceptionLabel());
                        }
                    } else {
                        abstractC5464 = (AbstractC5462) arrayList.get(i2);
                        if (!abstractC5464.wasReturnedFromScrap() || abstractC5464.getLayoutPosition() != i || abstractC5464.isInvalid() || (!c14849.mState.f72063 && abstractC5464.isRemoved())) {
                            i2++;
                        } else {
                            abstractC5464.addFlags(32);
                        }
                    }
                    abstractC5462CreateViewHolder = abstractC5464;
                    break;
                }
                if (abstractC5462CreateViewHolder != null) {
                    if (!abstractC5462CreateViewHolder.isRemoved()) {
                        i5 = abstractC5462CreateViewHolder.mPosition;
                        if (i5 >= 0 || i5 >= c14849.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5462CreateViewHolder + c14849.exceptionLabel());
                        }
                        z6 = (c14849.mState.f72063 || c14849.mAdapter.getItemViewType(abstractC5462CreateViewHolder.mPosition) == abstractC5462CreateViewHolder.getItemViewType()) && (!c14849.mAdapter.hasStableIds() || abstractC5462CreateViewHolder.getItemId() == c14849.mAdapter.getItemId(abstractC5462CreateViewHolder.mPosition));
                    } else {
                        if (!C14849.sDebugAssertionsEnabled && !c14849.mState.f72063) {
                            throw new IllegalStateException("should not receive a removed view unless it is pre layout" + c14849.exceptionLabel());
                        }
                        z6 = c14849.mState.f72063;
                    }
                    if (z6) {
                        z = true;
                    } else {
                        abstractC5462CreateViewHolder.addFlags(4);
                        if (abstractC5462CreateViewHolder.isScrap()) {
                            c14849.removeDetachedView(abstractC5462CreateViewHolder.itemView, false);
                            abstractC5462CreateViewHolder.unScrap();
                        } else if (abstractC5462CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC5462CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m10102(abstractC5462CreateViewHolder);
                        abstractC5462CreateViewHolder = null;
                    }
                }
            }
            if (abstractC5462CreateViewHolder == null) {
                iM6933 = c14849.mAdapterHelper.m6933(i, 0);
                if (iM6933 >= 0 || iM6933 >= c14849.mAdapter.getItemCount()) {
                    StringBuilder sbM49006 = C21720.m49005("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM6933);
                    sbM49006.append(c14849.mState.m51124());
                    sbM49006.append(c14849.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM49006.toString());
                }
                int itemViewType = c14849.mAdapter.getItemViewType(iM6933);
                if (c14849.mAdapter.hasStableIds()) {
                    long itemId2 = c14849.mAdapter.getItemId(iM6933);
                    int size6 = arrayList.size() - 1;
                    while (true) {
                        if (size6 < 0) {
                            j2 = C14849.FOREVER_NS;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    AbstractC5462 abstractC5466 = (AbstractC5462) arrayList2.get(size7);
                                    if (abstractC5466.getItemId() != itemId2 || abstractC5466.isAttachedToTransitionOverlay()) {
                                        size7--;
                                    } else {
                                        if (itemViewType == abstractC5466.getItemViewType()) {
                                            arrayList2.remove(size7);
                                            abstractC5462CreateViewHolder = abstractC5466;
                                            break;
                                        }
                                        m10112(size7);
                                    }
                                }
                                abstractC5462CreateViewHolder = null;
                                break;
                            }
                        }
                        Object obj = arrayList.get(size6);
                        j2 = C14849.FOREVER_NS;
                        AbstractC5462 abstractC5467 = (AbstractC5462) obj;
                        if (abstractC5467.getItemId() == itemId2 && !abstractC5467.wasReturnedFromScrap()) {
                            if (itemViewType == abstractC5467.getItemViewType()) {
                                abstractC5467.addFlags(32);
                                if (abstractC5467.isRemoved() && !c14849.mState.f72063) {
                                    abstractC5467.setFlags(2, 14);
                                }
                                abstractC5462CreateViewHolder = abstractC5467;
                                break;
                            }
                            arrayList.remove(size6);
                            c14849.removeDetachedView(abstractC5467.itemView, false);
                            AbstractC5462 abstractC5462M33926 = C14849.m33925(abstractC5467.itemView);
                            abstractC5462M33926.mScrapContainer = null;
                            abstractC5462M33926.mInChangeScrap = false;
                            abstractC5462M33926.clearReturnedFromScrapFlag();
                            m10102(abstractC5462M33926);
                        }
                        size6--;
                    }
                    if (abstractC5462CreateViewHolder != null) {
                        abstractC5462CreateViewHolder.mPosition = iM6933;
                        z2 = true;
                    }
                    if (abstractC5462CreateViewHolder == null) {
                        int i8 = C14849.HORIZONTAL;
                        c10827 = (C10827) m10100().f52395.get(itemViewType);
                        if (c10827 != null) {
                            abstractC5463 = null;
                            break;
                        }
                        arrayList3 = c10827.f29992;
                        if (arrayList3.isEmpty()) {
                            size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    abstractC5463 = null;
                                    break;
                                }
                                if (!((AbstractC5462) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                    abstractC5463 = (AbstractC5462) arrayList3.remove(size);
                                    break;
                                }
                                size--;
                            }
                        } else {
                            abstractC5463 = null;
                            break;
                        }
                        if (abstractC5463 != null) {
                            abstractC5463.resetInternal();
                            if (C14849.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = abstractC5463.itemView;
                                if (view2 instanceof ViewGroup) {
                                    m10095((ViewGroup) view2, false);
                                }
                            }
                        }
                        abstractC5462CreateViewHolder = abstractC5463;
                    }
                    if (abstractC5462CreateViewHolder == null) {
                        nanoTime2 = c14849.getNanoTime();
                        if (j == j2 && !this.f10871.m39904(nanoTime2, itemViewType, j)) {
                            return null;
                        }
                        abstractC5462CreateViewHolder = c14849.mAdapter.createViewHolder(c14849, itemViewType);
                        if (C14849.ALLOW_THREAD_GAP_WORK && (c14849M33896 = C14849.m33896(abstractC5462CreateViewHolder.itemView)) != null) {
                            abstractC5462CreateViewHolder.mNestedRecyclerView = new WeakReference(c14849M33896);
                        }
                        this.f10871.m39903(itemViewType, c14849.getNanoTime() - nanoTime2);
                    }
                } else {
                    j2 = C14849.FOREVER_NS;
                }
                z2 = z;
                if (abstractC5462CreateViewHolder == null) {
                    int i9 = C14849.HORIZONTAL;
                    c10827 = (C10827) m10100().f52395.get(itemViewType);
                    if (c10827 != null) {
                        abstractC5463 = null;
                        break;
                    }
                    arrayList3 = c10827.f29992;
                    if (arrayList3.isEmpty()) {
                        abstractC5463 = null;
                        break;
                    }
                    size = arrayList3.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            abstractC5463 = null;
                            break;
                        }
                        if (!((AbstractC5462) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                            abstractC5463 = (AbstractC5462) arrayList3.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (abstractC5463 != null) {
                        abstractC5463.resetInternal();
                        if (C14849.FORCE_INVALIDATE_DISPLAY_LIST) {
                            view2 = abstractC5463.itemView;
                            if (view2 instanceof ViewGroup) {
                                m10095((ViewGroup) view2, false);
                            }
                        }
                    }
                    abstractC5462CreateViewHolder = abstractC5463;
                }
                if (abstractC5462CreateViewHolder == null) {
                    nanoTime2 = c14849.getNanoTime();
                    if (j == j2) {
                    }
                    abstractC5462CreateViewHolder = c14849.mAdapter.createViewHolder(c14849, itemViewType);
                    if (C14849.ALLOW_THREAD_GAP_WORK) {
                        abstractC5462CreateViewHolder.mNestedRecyclerView = new WeakReference(c14849M33896);
                    }
                    this.f10871.m39903(itemViewType, c14849.getNanoTime() - nanoTime2);
                }
            } else {
                j2 = C14849.FOREVER_NS;
                z2 = z;
            }
            abstractC5462 = abstractC5462CreateViewHolder;
            if (z2 && !c14849.mState.f72063 && abstractC5462.hasAnyOfTheFlags(8192)) {
                abstractC5462.setFlags(0, 8192);
                if (c14849.mState.f72057) {
                    AbstractC23964.m53106(abstractC5462);
                    AbstractC23964 abstractC23964 = c14849.mItemAnimator;
                    abstractC5462.getUnmodifiedPayloads();
                    abstractC23964.getClass();
                    C13236 c13236 = new C13236();
                    c13236.m30296(abstractC5462);
                    c14849.recordAnimationInfoIfBouncedHiddenView(abstractC5462, c13236);
                }
            }
            if (c14849.mState.f72063 || !abstractC5462.isBound()) {
                if (abstractC5462.isBound() || abstractC5462.needsUpdate() || abstractC5462.isInvalid()) {
                    if (!C14849.sDebugAssertionsEnabled && abstractC5462.isRemoved()) {
                        throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC5462 + c14849.exceptionLabel());
                    }
                    int iM6935 = c14849.mAdapterHelper.m6933(i, 0);
                    abstractC5462.mBindingAdapter = null;
                    abstractC5462.mOwnerRecyclerView = c14849;
                    int itemViewType2 = abstractC5462.getItemViewType();
                    nanoTime = c14849.getNanoTime();
                    if (j != j2 || this.f10871.m39902(nanoTime, itemViewType2, j)) {
                        if (abstractC5462.isTmpDetached()) {
                            c14849.attachViewToParent(abstractC5462.itemView, c14849.getChildCount(), abstractC5462.itemView.getLayoutParams());
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c14849.mAdapter.bindViewHolder(abstractC5462, iM6935);
                        if (z3) {
                            c14849.detachViewFromParent(abstractC5462.itemView);
                        }
                        this.f10871.m39900(abstractC5462.getItemViewType(), c14849.getNanoTime() - nanoTime);
                        if (c14849.isAccessibilityEnabled()) {
                            view = abstractC5462.itemView;
                            int i10 = C1717.f57146;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c12168 = c14849.mAccessibilityDelegate;
                            if (c12168 != null) {
                                itemDelegate = c12168.getItemDelegate();
                                if (itemDelegate instanceof C14179) {
                                    ((C14179) itemDelegate).m32659(view);
                                }
                                C1717.m43555(view, itemDelegate);
                            }
                        }
                        if (c14849.mState.f72063) {
                            abstractC5462.mPreLayoutPosition = i;
                        }
                        z4 = true;
                    }
                }
                layoutParams = abstractC5462.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c16190 = (C16190) c14849.generateDefaultLayoutParams();
                    abstractC5462.itemView.setLayoutParams(c16190);
                } else if (c14849.checkLayoutParams(layoutParams)) {
                    c16190 = (C16190) layoutParams;
                } else {
                    c16190 = (C16190) c14849.generateLayoutParams(layoutParams);
                    abstractC5462.itemView.setLayoutParams(c16190);
                }
                c16190.f47660 = abstractC5462;
                if (z2 || !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c16190.f47659 = z5;
                return abstractC5462;
            }
            abstractC5462.mPreLayoutPosition = i;
            z4 = false;
            layoutParams = abstractC5462.itemView.getLayoutParams();
            if (layoutParams == null) {
                c16190 = (C16190) c14849.generateDefaultLayoutParams();
                abstractC5462.itemView.setLayoutParams(c16190);
            } else if (c14849.checkLayoutParams(layoutParams)) {
                c16190 = (C16190) c14849.generateLayoutParams(layoutParams);
                abstractC5462.itemView.setLayoutParams(c16190);
            } else {
                c16190 = (C16190) layoutParams;
            }
            c16190.f47660 = abstractC5462;
            if (z2) {
                z5 = false;
            } else {
                z5 = false;
            }
            c16190.f47659 = z5;
            return abstractC5462;
        }
        abstractC5462CreateViewHolder = null;
        arrayList = this.f10865;
        arrayList2 = this.f10867;
        if (abstractC5462CreateViewHolder == null) {
            size2 = arrayList.size();
            i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    abstractC5464 = (AbstractC5462) arrayList.get(i2);
                    if (abstractC5464.wasReturnedFromScrap()) {
                    }
                    i2++;
                } else {
                    arrayList4 = c14849.mChildHelper.f75584;
                    size3 = arrayList4.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size3) {
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i3);
                        abstractC5462M33925 = C14849.m33925(view3);
                        if (abstractC5462M33925.getLayoutPosition() != i) {
                        }
                        i3++;
                    }
                    if (view3 != null) {
                        size4 = arrayList2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size4) {
                                abstractC5462CreateViewHolder = null;
                                break;
                            }
                            abstractC5464 = (AbstractC5462) arrayList2.get(i4);
                            if (abstractC5464.isInvalid()) {
                            }
                            i4++;
                        }
                    } else {
                        abstractC5462CreateViewHolder = C14849.m33925(view3);
                        c14849.mChildHelper.m52821(view3);
                        iM52817 = c14849.mChildHelper.m52817(view3);
                        if (iM52817 != -1) {
                            c14849.mChildHelper.m52812(iM52817);
                            m10108(view3);
                            abstractC5462CreateViewHolder.addFlags(8224);
                            break;
                        }
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC5462CreateViewHolder + c14849.exceptionLabel());
                    }
                    if (abstractC5462CreateViewHolder != null) {
                        if (!abstractC5462CreateViewHolder.isRemoved()) {
                            i5 = abstractC5462CreateViewHolder.mPosition;
                            if (i5 >= 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5462CreateViewHolder + c14849.exceptionLabel());
                        }
                        if (!C14849.sDebugAssertionsEnabled) {
                        }
                        z6 = c14849.mState.f72063;
                        if (z6) {
                            abstractC5462CreateViewHolder.addFlags(4);
                            if (abstractC5462CreateViewHolder.isScrap()) {
                                c14849.removeDetachedView(abstractC5462CreateViewHolder.itemView, false);
                                abstractC5462CreateViewHolder.unScrap();
                            } else if (abstractC5462CreateViewHolder.wasReturnedFromScrap()) {
                                abstractC5462CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            m10102(abstractC5462CreateViewHolder);
                            abstractC5462CreateViewHolder = null;
                        } else {
                            z = true;
                        }
                    }
                }
                abstractC5462CreateViewHolder = abstractC5464;
                if (abstractC5462CreateViewHolder != null) {
                    if (!abstractC5462CreateViewHolder.isRemoved()) {
                        i5 = abstractC5462CreateViewHolder.mPosition;
                        if (i5 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC5462CreateViewHolder + c14849.exceptionLabel());
                    }
                    if (!C14849.sDebugAssertionsEnabled) {
                    }
                    z6 = c14849.mState.f72063;
                    if (z6) {
                        abstractC5462CreateViewHolder.addFlags(4);
                        if (abstractC5462CreateViewHolder.isScrap()) {
                            c14849.removeDetachedView(abstractC5462CreateViewHolder.itemView, false);
                            abstractC5462CreateViewHolder.unScrap();
                        } else if (abstractC5462CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC5462CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m10102(abstractC5462CreateViewHolder);
                        abstractC5462CreateViewHolder = null;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (abstractC5462CreateViewHolder == null) {
            iM6933 = c14849.mAdapterHelper.m6933(i, 0);
            if (iM6933 >= 0) {
            }
            StringBuilder sbM49007 = C21720.m49005("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM6933);
            sbM49007.append(c14849.mState.m51124());
            sbM49007.append(c14849.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM49007.toString());
        }
        j2 = C14849.FOREVER_NS;
        z2 = z;
        abstractC5462 = abstractC5462CreateViewHolder;
        if (z2) {
            abstractC5462.setFlags(0, 8192);
            if (c14849.mState.f72057) {
                AbstractC23964.m53106(abstractC5462);
                AbstractC23964 abstractC23965 = c14849.mItemAnimator;
                abstractC5462.getUnmodifiedPayloads();
                abstractC23965.getClass();
                C13236 c13237 = new C13236();
                c13237.m30296(abstractC5462);
                c14849.recordAnimationInfoIfBouncedHiddenView(abstractC5462, c13237);
            }
        }
        if (c14849.mState.f72063) {
            if (abstractC5462.isBound()) {
                if (!C14849.sDebugAssertionsEnabled) {
                }
                int iM6936 = c14849.mAdapterHelper.m6933(i, 0);
                abstractC5462.mBindingAdapter = null;
                abstractC5462.mOwnerRecyclerView = c14849;
                int itemViewType3 = abstractC5462.getItemViewType();
                nanoTime = c14849.getNanoTime();
                if (j != j2) {
                }
                if (abstractC5462.isTmpDetached()) {
                    c14849.attachViewToParent(abstractC5462.itemView, c14849.getChildCount(), abstractC5462.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c14849.mAdapter.bindViewHolder(abstractC5462, iM6936);
                if (z3) {
                    c14849.detachViewFromParent(abstractC5462.itemView);
                }
                this.f10871.m39900(abstractC5462.getItemViewType(), c14849.getNanoTime() - nanoTime);
                if (c14849.isAccessibilityEnabled()) {
                    view = abstractC5462.itemView;
                    int i11 = C1717.f57146;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c12168 = c14849.mAccessibilityDelegate;
                    if (c12168 != null) {
                        itemDelegate = c12168.getItemDelegate();
                        if (itemDelegate instanceof C14179) {
                            ((C14179) itemDelegate).m32659(view);
                        }
                        C1717.m43555(view, itemDelegate);
                    }
                }
                if (c14849.mState.f72063) {
                    abstractC5462.mPreLayoutPosition = i;
                }
                z4 = true;
            } else {
                if (!C14849.sDebugAssertionsEnabled) {
                }
                int iM6937 = c14849.mAdapterHelper.m6933(i, 0);
                abstractC5462.mBindingAdapter = null;
                abstractC5462.mOwnerRecyclerView = c14849;
                int itemViewType4 = abstractC5462.getItemViewType();
                nanoTime = c14849.getNanoTime();
                if (j != j2) {
                }
                if (abstractC5462.isTmpDetached()) {
                    c14849.attachViewToParent(abstractC5462.itemView, c14849.getChildCount(), abstractC5462.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c14849.mAdapter.bindViewHolder(abstractC5462, iM6937);
                if (z3) {
                    c14849.detachViewFromParent(abstractC5462.itemView);
                }
                this.f10871.m39900(abstractC5462.getItemViewType(), c14849.getNanoTime() - nanoTime);
                if (c14849.isAccessibilityEnabled()) {
                    view = abstractC5462.itemView;
                    int i12 = C1717.f57146;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c12168 = c14849.mAccessibilityDelegate;
                    if (c12168 != null) {
                        itemDelegate = c12168.getItemDelegate();
                        if (itemDelegate instanceof C14179) {
                            ((C14179) itemDelegate).m32659(view);
                        }
                        C1717.m43555(view, itemDelegate);
                    }
                }
                if (c14849.mState.f72063) {
                    abstractC5462.mPreLayoutPosition = i;
                }
                z4 = true;
            }
        } else if (abstractC5462.isBound()) {
            if (!C14849.sDebugAssertionsEnabled) {
            }
            int iM6938 = c14849.mAdapterHelper.m6933(i, 0);
            abstractC5462.mBindingAdapter = null;
            abstractC5462.mOwnerRecyclerView = c14849;
            int itemViewType5 = abstractC5462.getItemViewType();
            nanoTime = c14849.getNanoTime();
            if (j != j2) {
            }
            if (abstractC5462.isTmpDetached()) {
                c14849.attachViewToParent(abstractC5462.itemView, c14849.getChildCount(), abstractC5462.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c14849.mAdapter.bindViewHolder(abstractC5462, iM6938);
            if (z3) {
                c14849.detachViewFromParent(abstractC5462.itemView);
            }
            this.f10871.m39900(abstractC5462.getItemViewType(), c14849.getNanoTime() - nanoTime);
            if (c14849.isAccessibilityEnabled()) {
                view = abstractC5462.itemView;
                int i13 = C1717.f57146;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c12168 = c14849.mAccessibilityDelegate;
                if (c12168 != null) {
                    itemDelegate = c12168.getItemDelegate();
                    if (itemDelegate instanceof C14179) {
                        ((C14179) itemDelegate).m32659(view);
                    }
                    C1717.m43555(view, itemDelegate);
                }
            }
            if (c14849.mState.f72063) {
                abstractC5462.mPreLayoutPosition = i;
            }
            z4 = true;
        } else {
            if (!C14849.sDebugAssertionsEnabled) {
            }
            int iM6939 = c14849.mAdapterHelper.m6933(i, 0);
            abstractC5462.mBindingAdapter = null;
            abstractC5462.mOwnerRecyclerView = c14849;
            int itemViewType6 = abstractC5462.getItemViewType();
            nanoTime = c14849.getNanoTime();
            if (j != j2) {
            }
            if (abstractC5462.isTmpDetached()) {
                c14849.attachViewToParent(abstractC5462.itemView, c14849.getChildCount(), abstractC5462.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c14849.mAdapter.bindViewHolder(abstractC5462, iM6939);
            if (z3) {
                c14849.detachViewFromParent(abstractC5462.itemView);
            }
            this.f10871.m39900(abstractC5462.getItemViewType(), c14849.getNanoTime() - nanoTime);
            if (c14849.isAccessibilityEnabled()) {
                view = abstractC5462.itemView;
                int i14 = C1717.f57146;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c12168 = c14849.mAccessibilityDelegate;
                if (c12168 != null) {
                    itemDelegate = c12168.getItemDelegate();
                    if (itemDelegate instanceof C14179) {
                        ((C14179) itemDelegate).m32659(view);
                    }
                    C1717.m43555(view, itemDelegate);
                }
            }
            if (c14849.mState.f72063) {
                abstractC5462.mPreLayoutPosition = i;
            }
            z4 = true;
        }
        layoutParams = abstractC5462.itemView.getLayoutParams();
        if (layoutParams == null) {
            c16190 = (C16190) c14849.generateDefaultLayoutParams();
            abstractC5462.itemView.setLayoutParams(c16190);
        } else if (c14849.checkLayoutParams(layoutParams)) {
            c16190 = (C16190) c14849.generateLayoutParams(layoutParams);
            abstractC5462.itemView.setLayoutParams(c16190);
        } else {
            c16190 = (C16190) layoutParams;
        }
        c16190.f47660 = abstractC5462;
        if (z2) {
            z5 = false;
        } else {
            z5 = false;
        }
        c16190.f47659 = z5;
        return abstractC5462;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10095(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m10095((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10101(View view) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        boolean zIsTmpDetached = abstractC5462M33925.isTmpDetached();
        C14849 c14849 = this.f10866;
        if (zIsTmpDetached) {
            c14849.removeDetachedView(view, false);
        }
        if (abstractC5462M33925.isScrap()) {
            abstractC5462M33925.unScrap();
        } else if (abstractC5462M33925.wasReturnedFromScrap()) {
            abstractC5462M33925.clearReturnedFromScrapFlag();
        }
        m10102(abstractC5462M33925);
        if (c14849.mItemAnimator == null || abstractC5462M33925.isRecyclable()) {
            return;
        }
        c14849.mItemAnimator.mo22576(abstractC5462M33925);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m10113() {
        ArrayList arrayList = this.f10867;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                m10112(size);
            }
        }
        arrayList.clear();
        if (C14849.ALLOW_THREAD_GAP_WORK) {
            C20652 c20652 = this.f10866.mPrefetchRegistry;
            int[] iArr = c20652.f63783;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c20652.f63782 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10112(int i) {
        int i2 = C14849.HORIZONTAL;
        ArrayList arrayList = this.f10867;
        AbstractC5462 abstractC5462 = (AbstractC5462) arrayList.get(i);
        if (C14849.sVerboseLoggingEnabled) {
            C12826.toString(abstractC5462);
        }
        m10103(abstractC5462, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:56:0x00be->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ca A[EDGE_INSN: B:84:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ca A[EDGE_INSN: B:85:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ca A[EDGE_INSN: B:86:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?, LOOP_LABEL: LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m10102(AbstractC5462 abstractC5462) {
        int i;
        C20652 c20652;
        int i2;
        int i3;
        boolean zIsScrap = abstractC5462.isScrap();
        boolean z = false;
        boolean z2 = true;
        C14849 c14849 = this.f10866;
        if (zIsScrap || abstractC5462.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC5462.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC5462.itemView.getParent() != null);
            sb.append(c14849.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC5462.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC5462 + c14849.exceptionLabel());
        }
        if (abstractC5462.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + c14849.exceptionLabel());
        }
        boolean zDoesTransientStatePreventRecycling = abstractC5462.doesTransientStatePreventRecycling();
        AbstractC21283 abstractC21283 = c14849.mAdapter;
        boolean z3 = abstractC21283 != null && zDoesTransientStatePreventRecycling && abstractC21283.onFailedToRecycleView(abstractC5462);
        boolean z4 = C14849.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f10867;
        if (z4 && arrayList.contains(abstractC5462)) {
            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC5462 + c14849.exceptionLabel());
        }
        if (z3 || abstractC5462.isRecyclable()) {
            if (this.f10872 <= 0 || abstractC5462.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f10872 && size > 0) {
                    m10112(0);
                    size--;
                }
                if (C14849.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C20652 c20653 = c14849.mPrefetchRegistry;
                    int i4 = abstractC5462.mPosition;
                    if (c20653.f63783 != null) {
                        int i5 = c20653.f63782 * 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                loop1: while (true) {
                                    size--;
                                    if (size >= 0) {
                                        break;
                                    }
                                    i = ((AbstractC5462) arrayList.get(size)).mPosition;
                                    c20652 = c14849.mPrefetchRegistry;
                                    if (c20652.f63783 != null) {
                                        break;
                                    }
                                    i2 = c20652.f63782 * 2;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < i2) {
                                            break loop1;
                                        } else if (c20652.f63783[i3] == i) {
                                            break;
                                        } else {
                                            i3 += 2;
                                        }
                                    }
                                }
                                size++;
                            } else if (c20653.f63783[i6] != i4) {
                                i6 += 2;
                            }
                        }
                    } else {
                        loop1: while (true) {
                            size--;
                            if (size >= 0) {
                                break;
                                break;
                            }
                            i = ((AbstractC5462) arrayList.get(size)).mPosition;
                            c20652 = c14849.mPrefetchRegistry;
                            if (c20652.f63783 != null) {
                                break;
                                break;
                            }
                            i2 = c20652.f63782 * 2;
                            i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    break loop1;
                                    break loop1;
                                } else if (c20652.f63783[i3] == i) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        size++;
                    }
                }
                arrayList.add(size, abstractC5462);
                z = true;
            }
            if (!z) {
                m10103(abstractC5462, true);
            }
            c14849.mViewInfoStore.m47163(abstractC5462);
            if (z && !z2 && zDoesTransientStatePreventRecycling) {
                C11848.m27155(abstractC5462.itemView);
                abstractC5462.mBindingAdapter = null;
                abstractC5462.mOwnerRecyclerView = null;
                return;
            }
            return;
        }
        if (C14849.sVerboseLoggingEnabled) {
            c14849.exceptionLabel();
        }
        z2 = false;
        c14849.mViewInfoStore.m47163(abstractC5462);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10103(AbstractC5462 abstractC5462, boolean z) {
        C14849.m33927(abstractC5462);
        View view = abstractC5462.itemView;
        C14849 c14849 = this.f10866;
        C12168 c12168 = c14849.mAccessibilityDelegate;
        if (c12168 != null) {
            C1658 itemDelegate = c12168.getItemDelegate();
            C1717.m43555(view, itemDelegate instanceof C14179 ? ((C14179) itemDelegate).m32658(view) : null);
        }
        if (z) {
            InterfaceC6133 interfaceC6133 = c14849.mRecyclerListener;
            if (interfaceC6133 != null) {
                interfaceC6133.m13922();
            }
            int size = c14849.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6133) c14849.mRecyclerListeners.get(i)).m13922();
            }
            AbstractC21283 abstractC21283 = c14849.mAdapter;
            if (abstractC21283 != null) {
                abstractC21283.onViewRecycled(abstractC5462);
            }
            if (c14849.mState != null) {
                c14849.mViewInfoStore.m47163(abstractC5462);
            }
            if (C14849.sVerboseLoggingEnabled) {
                C12826.toString(abstractC5462);
            }
        }
        abstractC5462.mBindingAdapter = null;
        abstractC5462.mOwnerRecyclerView = null;
        m10100().m39901(abstractC5462);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10108(View view) {
        AbstractC5462 abstractC5462M33925 = C14849.m33925(view);
        boolean zHasAnyOfTheFlags = abstractC5462M33925.hasAnyOfTheFlags(12);
        C14849 c14849 = this.f10866;
        if (zHasAnyOfTheFlags || !abstractC5462M33925.isUpdated() || c14849.canReuseUpdatedViewHolder(abstractC5462M33925)) {
            if (abstractC5462M33925.isInvalid() && !abstractC5462M33925.isRemoved() && !c14849.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c14849.exceptionLabel());
            }
            abstractC5462M33925.setScrapContainer(this, false);
            this.f10865.add(abstractC5462M33925);
            return;
        }
        if (this.f10869 == null) {
            this.f10869 = new ArrayList();
        }
        abstractC5462M33925.setScrapContainer(this, true);
        this.f10869.add(abstractC5462M33925);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10109(AbstractC5462 abstractC5462) {
        if (abstractC5462.mInChangeScrap) {
            this.f10869.remove(abstractC5462);
        } else {
            this.f10865.remove(abstractC5462);
        }
        abstractC5462.mScrapContainer = null;
        abstractC5462.mInChangeScrap = false;
        abstractC5462.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10104(C17531 c17531) {
        C14849 c14849 = this.f10866;
        m10096(c14849.mAdapter, false);
        C17531 c17532 = this.f10871;
        if (c17532 != null) {
            c17532.f52393--;
        }
        this.f10871 = c17531;
        if (c17531 != null && c14849.getAdapter() != null) {
            this.f10871.f52393++;
        }
        m10097();
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m10097() {
        if (this.f10871 != null) {
            C14849 c14849 = this.f10866;
            if (c14849.mAdapter == null || !c14849.isAttachedToWindow()) {
                return;
            }
            C17531 c17531 = this.f10871;
            c17531.f52394.add(c14849.mAdapter);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10096(AbstractC21283 abstractC21283, boolean z) {
        C17531 c17531 = this.f10871;
        if (c17531 != null) {
            SparseArray sparseArray = c17531.f52395;
            Set set = c17531.f52394;
            set.remove(abstractC21283);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C10827) sparseArray.get(sparseArray.keyAt(i))).f29992;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C11848.m27155(((AbstractC5462) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10111() {
        m10097();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m10114() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10867;
            if (i >= arrayList.size()) {
                m10096(this.f10866.mAdapter, false);
                return;
            } else {
                C11848.m27155(((AbstractC5462) arrayList.get(i)).itemView);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17531 m10100() {
        if (this.f10871 == null) {
            C17531 c17531 = new C17531();
            c17531.f52395 = new SparseArray();
            c17531.f52393 = 0;
            c17531.f52394 = Collections.newSetFromMap(new IdentityHashMap());
            this.f10871 = c17531;
            m10097();
        }
        return this.f10871;
    }
}
