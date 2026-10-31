package l;

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
public final class C2550 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f8075;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f8076;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8077;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f8078;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f8079;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8080;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15954 f8081;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f8082;

    public C2550(C13132 c13132) {
        this.f8076 = c13132;
        ArrayList arrayList = new ArrayList();
        this.f8075 = arrayList;
        this.f8079 = null;
        this.f8077 = new ArrayList();
        this.f8078 = C20195.unmodifiableList(arrayList);
        this.f8080 = 2;
        this.f8082 = 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8074(AbstractC19902 abstractC19902, AbstractC19902 abstractC19903, boolean z) {
        this.f8075.clear();
        m8082();
        m8065(abstractC19902, true);
        C15954 c15954M8069 = m8069();
        if (abstractC19902 != null) {
            c15954M8069.f49246--;
        }
        if (!z && c15954M8069.f49246 == 0) {
            SparseArray sparseArray = c15954M8069.f49248;
            for (int i = 0; i < sparseArray.size(); i++) {
                C8900 c8900 = (C8900) sparseArray.valueAt(i);
                Iterator it = c8900.f27068.iterator();
                while (it.hasNext()) {
                    C9975.m25138(((AbstractC3255) it.next()).itemView);
                }
                c8900.f27068.clear();
            }
        }
        if (abstractC19903 != null) {
            c15954M8069.f49246++;
        } else {
            c15954M8069.getClass();
        }
        m8066();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8084(int i) {
        this.f8080 = i;
        m8079();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8079() {
        AbstractC17366 abstractC17366 = this.f8076.mLayout;
        this.f8082 = this.f8080 + (abstractC17366 != null ? abstractC17366.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f8077;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f8082) {
                return;
            } else {
                m8081(size);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m8076() {
        return this.f8078;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8067(int i) {
        C13132 c13132 = this.f8076;
        if (i >= 0 && i < c13132.mState.m48777()) {
            return !c13132.mState.f69359 ? i : c13132.mAdapterHelper.m4701(i, 0);
        }
        StringBuilder sbM32308 = C13325.m32308(i, "invalid position ", ". State item count is ");
        sbM32308.append(c13132.mState.m48777());
        sbM32308.append(c13132.exceptionLabel());
        throw new IndexOutOfBoundsException(sbM32308.toString());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m8075(int i) {
        return m8068(i, C13132.FOREVER_NS).itemView;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3255 m8068(int i, long j) {
        AbstractC3255 abstractC3255CreateViewHolder;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        boolean z2;
        AbstractC3255 abstractC3255;
        long nanoTime;
        boolean z3;
        boolean z4;
        View view;
        C10311 c10311;
        C16445 itemDelegate;
        ViewGroup.LayoutParams layoutParams;
        C14543 c14543;
        boolean z5;
        int iM4701;
        long nanoTime2;
        C13132 c13132M31804;
        C8900 c8900;
        AbstractC3255 abstractC3256;
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
        AbstractC3255 abstractC3257;
        int iM50475;
        AbstractC3255 abstractC3255M31833;
        int i5;
        boolean z6;
        int size5;
        int iM4702;
        C13132 c13132 = this.f8076;
        if (i < 0 || i >= c13132.mState.m48777()) {
            StringBuilder sbM46682 = C20361.m46682("Invalid item position ", i, MotionUtils.EASING_TYPE_FORMAT_START, "). Item count:", i);
            sbM46682.append(c13132.mState.m48777());
            sbM46682.append(c13132.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        if (c13132.mState.f69359) {
            ArrayList arrayList5 = this.f8079;
            if (arrayList5 != null && (size5 = arrayList5.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        if (c13132.mAdapter.hasStableIds() && (iM4702 = c13132.mAdapterHelper.m4701(i, 0)) > 0 && iM4702 < c13132.mAdapter.getItemCount()) {
                            long itemId = c13132.mAdapter.getItemId(iM4702);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    abstractC3255CreateViewHolder = null;
                                    break;
                                }
                                AbstractC3255 abstractC3258 = (AbstractC3255) this.f8079.get(i7);
                                if (!abstractC3258.wasReturnedFromScrap() && abstractC3258.getItemId() == itemId) {
                                    abstractC3258.addFlags(32);
                                    abstractC3255CreateViewHolder = abstractC3258;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            abstractC3255CreateViewHolder = null;
                            break;
                        }
                    } else {
                        abstractC3255CreateViewHolder = (AbstractC3255) this.f8079.get(i6);
                        if (!abstractC3255CreateViewHolder.wasReturnedFromScrap() && abstractC3255CreateViewHolder.getLayoutPosition() == i) {
                            abstractC3255CreateViewHolder.addFlags(32);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                abstractC3255CreateViewHolder = null;
                break;
            }
            z = abstractC3255CreateViewHolder != null;
            arrayList = this.f8075;
            arrayList2 = this.f8077;
            if (abstractC3255CreateViewHolder == null) {
                size2 = arrayList.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        arrayList4 = c13132.mChildHelper.f72858;
                        size3 = arrayList4.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size3) {
                                view3 = null;
                                break;
                            }
                            view3 = (View) arrayList4.get(i3);
                            abstractC3255M31833 = C13132.m31833(view3);
                            if (abstractC3255M31833.getLayoutPosition() != i && !abstractC3255M31833.isInvalid() && !abstractC3255M31833.isRemoved()) {
                                break;
                            }
                            i3++;
                        }
                        if (view3 != null) {
                            size4 = arrayList2.size();
                            i4 = 0;
                            while (true) {
                                if (i4 < size4) {
                                    abstractC3255CreateViewHolder = null;
                                    break;
                                }
                                abstractC3257 = (AbstractC3255) arrayList2.get(i4);
                                if (abstractC3257.isInvalid() && abstractC3257.getLayoutPosition() == i && !abstractC3257.isAttachedToTransitionOverlay()) {
                                    arrayList2.remove(i4);
                                    if (C13132.sVerboseLoggingEnabled) {
                                        abstractC3257.toString();
                                    }
                                } else {
                                    i4++;
                                }
                            }
                        } else {
                            abstractC3255CreateViewHolder = C13132.m31833(view3);
                            c13132.mChildHelper.m50479(view3);
                            iM50475 = c13132.mChildHelper.m50475(view3);
                            if (iM50475 != -1) {
                                c13132.mChildHelper.m50470(iM50475);
                                m8077(view3);
                                abstractC3255CreateViewHolder.addFlags(8224);
                                break;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC3255CreateViewHolder + c13132.exceptionLabel());
                        }
                    } else {
                        abstractC3257 = (AbstractC3255) arrayList.get(i2);
                        if (!abstractC3257.wasReturnedFromScrap() || abstractC3257.getLayoutPosition() != i || abstractC3257.isInvalid() || (!c13132.mState.f69359 && abstractC3257.isRemoved())) {
                            i2++;
                        } else {
                            abstractC3257.addFlags(32);
                        }
                    }
                    abstractC3255CreateViewHolder = abstractC3257;
                    break;
                }
                if (abstractC3255CreateViewHolder != null) {
                    if (!abstractC3255CreateViewHolder.isRemoved()) {
                        i5 = abstractC3255CreateViewHolder.mPosition;
                        if (i5 >= 0 || i5 >= c13132.mAdapter.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC3255CreateViewHolder + c13132.exceptionLabel());
                        }
                        z6 = (c13132.mState.f69359 || c13132.mAdapter.getItemViewType(abstractC3255CreateViewHolder.mPosition) == abstractC3255CreateViewHolder.getItemViewType()) && (!c13132.mAdapter.hasStableIds() || abstractC3255CreateViewHolder.getItemId() == c13132.mAdapter.getItemId(abstractC3255CreateViewHolder.mPosition));
                    } else {
                        if (!C13132.sDebugAssertionsEnabled && !c13132.mState.f69359) {
                            throw new IllegalStateException("should not receive a removed view unless it is pre layout" + c13132.exceptionLabel());
                        }
                        z6 = c13132.mState.f69359;
                    }
                    if (z6) {
                        z = true;
                    } else {
                        abstractC3255CreateViewHolder.addFlags(4);
                        if (abstractC3255CreateViewHolder.isScrap()) {
                            c13132.removeDetachedView(abstractC3255CreateViewHolder.itemView, false);
                            abstractC3255CreateViewHolder.unScrap();
                        } else if (abstractC3255CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC3255CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m8071(abstractC3255CreateViewHolder);
                        abstractC3255CreateViewHolder = null;
                    }
                }
            }
            if (abstractC3255CreateViewHolder == null) {
                iM4701 = c13132.mAdapterHelper.m4701(i, 0);
                if (iM4701 >= 0 || iM4701 >= c13132.mAdapter.getItemCount()) {
                    StringBuilder sbM46683 = C20361.m46682("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM4701);
                    sbM46683.append(c13132.mState.m48777());
                    sbM46683.append(c13132.exceptionLabel());
                    throw new IndexOutOfBoundsException(sbM46683.toString());
                }
                int itemViewType = c13132.mAdapter.getItemViewType(iM4701);
                if (c13132.mAdapter.hasStableIds()) {
                    long itemId2 = c13132.mAdapter.getItemId(iM4701);
                    int size6 = arrayList.size() - 1;
                    while (true) {
                        if (size6 < 0) {
                            j2 = C13132.FOREVER_NS;
                            int size7 = arrayList2.size() - 1;
                            while (true) {
                                if (size7 >= 0) {
                                    AbstractC3255 abstractC3259 = (AbstractC3255) arrayList2.get(size7);
                                    if (abstractC3259.getItemId() != itemId2 || abstractC3259.isAttachedToTransitionOverlay()) {
                                        size7--;
                                    } else {
                                        if (itemViewType == abstractC3259.getItemViewType()) {
                                            arrayList2.remove(size7);
                                            abstractC3255CreateViewHolder = abstractC3259;
                                            break;
                                        }
                                        m8081(size7);
                                    }
                                }
                                abstractC3255CreateViewHolder = null;
                                break;
                            }
                        }
                        Object obj = arrayList.get(size6);
                        j2 = C13132.FOREVER_NS;
                        AbstractC3255 abstractC32510 = (AbstractC3255) obj;
                        if (abstractC32510.getItemId() == itemId2 && !abstractC32510.wasReturnedFromScrap()) {
                            if (itemViewType == abstractC32510.getItemViewType()) {
                                abstractC32510.addFlags(32);
                                if (abstractC32510.isRemoved() && !c13132.mState.f69359) {
                                    abstractC32510.setFlags(2, 14);
                                }
                                abstractC3255CreateViewHolder = abstractC32510;
                                break;
                            }
                            arrayList.remove(size6);
                            c13132.removeDetachedView(abstractC32510.itemView, false);
                            AbstractC3255 abstractC3255M31834 = C13132.m31833(abstractC32510.itemView);
                            abstractC3255M31834.mScrapContainer = null;
                            abstractC3255M31834.mInChangeScrap = false;
                            abstractC3255M31834.clearReturnedFromScrapFlag();
                            m8071(abstractC3255M31834);
                        }
                        size6--;
                    }
                    if (abstractC3255CreateViewHolder != null) {
                        abstractC3255CreateViewHolder.mPosition = iM4701;
                        z2 = true;
                    }
                    if (abstractC3255CreateViewHolder == null) {
                        int i8 = C13132.HORIZONTAL;
                        c8900 = (C8900) m8069().f49248.get(itemViewType);
                        if (c8900 != null) {
                            abstractC3256 = null;
                            break;
                        }
                        arrayList3 = c8900.f27068;
                        if (arrayList3.isEmpty()) {
                            size = arrayList3.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    abstractC3256 = null;
                                    break;
                                }
                                if (!((AbstractC3255) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                                    abstractC3256 = (AbstractC3255) arrayList3.remove(size);
                                    break;
                                }
                                size--;
                            }
                        } else {
                            abstractC3256 = null;
                            break;
                        }
                        if (abstractC3256 != null) {
                            abstractC3256.resetInternal();
                            if (C13132.FORCE_INVALIDATE_DISPLAY_LIST) {
                                view2 = abstractC3256.itemView;
                                if (view2 instanceof ViewGroup) {
                                    m8064((ViewGroup) view2, false);
                                }
                            }
                        }
                        abstractC3255CreateViewHolder = abstractC3256;
                    }
                    if (abstractC3255CreateViewHolder == null) {
                        nanoTime2 = c13132.getNanoTime();
                        if (j == j2 && !this.f8081.m37729(nanoTime2, itemViewType, j)) {
                            return null;
                        }
                        abstractC3255CreateViewHolder = c13132.mAdapter.createViewHolder(c13132, itemViewType);
                        if (C13132.ALLOW_THREAD_GAP_WORK && (c13132M31804 = C13132.m31804(abstractC3255CreateViewHolder.itemView)) != null) {
                            abstractC3255CreateViewHolder.mNestedRecyclerView = new WeakReference(c13132M31804);
                        }
                        this.f8081.m37728(itemViewType, c13132.getNanoTime() - nanoTime2);
                    }
                } else {
                    j2 = C13132.FOREVER_NS;
                }
                z2 = z;
                if (abstractC3255CreateViewHolder == null) {
                    int i9 = C13132.HORIZONTAL;
                    c8900 = (C8900) m8069().f49248.get(itemViewType);
                    if (c8900 != null) {
                        abstractC3256 = null;
                        break;
                    }
                    arrayList3 = c8900.f27068;
                    if (arrayList3.isEmpty()) {
                        abstractC3256 = null;
                        break;
                    }
                    size = arrayList3.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            abstractC3256 = null;
                            break;
                        }
                        if (!((AbstractC3255) arrayList3.get(size)).isAttachedToTransitionOverlay()) {
                            abstractC3256 = (AbstractC3255) arrayList3.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (abstractC3256 != null) {
                        abstractC3256.resetInternal();
                        if (C13132.FORCE_INVALIDATE_DISPLAY_LIST) {
                            view2 = abstractC3256.itemView;
                            if (view2 instanceof ViewGroup) {
                                m8064((ViewGroup) view2, false);
                            }
                        }
                    }
                    abstractC3255CreateViewHolder = abstractC3256;
                }
                if (abstractC3255CreateViewHolder == null) {
                    nanoTime2 = c13132.getNanoTime();
                    if (j == j2) {
                    }
                    abstractC3255CreateViewHolder = c13132.mAdapter.createViewHolder(c13132, itemViewType);
                    if (C13132.ALLOW_THREAD_GAP_WORK) {
                        abstractC3255CreateViewHolder.mNestedRecyclerView = new WeakReference(c13132M31804);
                    }
                    this.f8081.m37728(itemViewType, c13132.getNanoTime() - nanoTime2);
                }
            } else {
                j2 = C13132.FOREVER_NS;
                z2 = z;
            }
            abstractC3255 = abstractC3255CreateViewHolder;
            if (z2 && !c13132.mState.f69359 && abstractC3255.hasAnyOfTheFlags(8192)) {
                abstractC3255.setFlags(0, 8192);
                if (c13132.mState.f69353) {
                    AbstractC22723.m50780(abstractC3255);
                    AbstractC22723 abstractC22723 = c13132.mItemAnimator;
                    abstractC3255.getUnmodifiedPayloads();
                    abstractC22723.getClass();
                    C11435 c11435 = new C11435();
                    c11435.m28252(abstractC3255);
                    c13132.recordAnimationInfoIfBouncedHiddenView(abstractC3255, c11435);
                }
            }
            if (c13132.mState.f69359 || !abstractC3255.isBound()) {
                if (abstractC3255.isBound() || abstractC3255.needsUpdate() || abstractC3255.isInvalid()) {
                    if (!C13132.sDebugAssertionsEnabled && abstractC3255.isRemoved()) {
                        throw new IllegalStateException("Removed holder should be bound and it should come here only in pre-layout. Holder: " + abstractC3255 + c13132.exceptionLabel());
                    }
                    int iM4703 = c13132.mAdapterHelper.m4701(i, 0);
                    abstractC3255.mBindingAdapter = null;
                    abstractC3255.mOwnerRecyclerView = c13132;
                    int itemViewType2 = abstractC3255.getItemViewType();
                    nanoTime = c13132.getNanoTime();
                    if (j != j2 || this.f8081.m37727(nanoTime, itemViewType2, j)) {
                        if (abstractC3255.isTmpDetached()) {
                            c13132.attachViewToParent(abstractC3255.itemView, c13132.getChildCount(), abstractC3255.itemView.getLayoutParams());
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c13132.mAdapter.bindViewHolder(abstractC3255, iM4703);
                        if (z3) {
                            c13132.detachViewFromParent(abstractC3255.itemView);
                        }
                        this.f8081.m37725(abstractC3255.getItemViewType(), c13132.getNanoTime() - nanoTime);
                        if (c13132.isAccessibilityEnabled()) {
                            view = abstractC3255.itemView;
                            int i10 = C17648.f53953;
                            if (view.getImportantForAccessibility() == 0) {
                                view.setImportantForAccessibility(1);
                            }
                            c10311 = c13132.mAccessibilityDelegate;
                            if (c10311 != null) {
                                itemDelegate = c10311.getItemDelegate();
                                if (itemDelegate instanceof C12427) {
                                    ((C12427) itemDelegate).m30594(view);
                                }
                                C17648.m41309(view, itemDelegate);
                            }
                        }
                        if (c13132.mState.f69359) {
                            abstractC3255.mPreLayoutPosition = i;
                        }
                        z4 = true;
                    }
                }
                layoutParams = abstractC3255.itemView.getLayoutParams();
                if (layoutParams == null) {
                    c14543 = (C14543) c13132.generateDefaultLayoutParams();
                    abstractC3255.itemView.setLayoutParams(c14543);
                } else if (c13132.checkLayoutParams(layoutParams)) {
                    c14543 = (C14543) layoutParams;
                } else {
                    c14543 = (C14543) c13132.generateLayoutParams(layoutParams);
                    abstractC3255.itemView.setLayoutParams(c14543);
                }
                c14543.f44554 = abstractC3255;
                if (z2 || !z4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                c14543.f44553 = z5;
                return abstractC3255;
            }
            abstractC3255.mPreLayoutPosition = i;
            z4 = false;
            layoutParams = abstractC3255.itemView.getLayoutParams();
            if (layoutParams == null) {
                c14543 = (C14543) c13132.generateDefaultLayoutParams();
                abstractC3255.itemView.setLayoutParams(c14543);
            } else if (c13132.checkLayoutParams(layoutParams)) {
                c14543 = (C14543) c13132.generateLayoutParams(layoutParams);
                abstractC3255.itemView.setLayoutParams(c14543);
            } else {
                c14543 = (C14543) layoutParams;
            }
            c14543.f44554 = abstractC3255;
            if (z2) {
                z5 = false;
            } else {
                z5 = false;
            }
            c14543.f44553 = z5;
            return abstractC3255;
        }
        abstractC3255CreateViewHolder = null;
        arrayList = this.f8075;
        arrayList2 = this.f8077;
        if (abstractC3255CreateViewHolder == null) {
            size2 = arrayList.size();
            i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    abstractC3257 = (AbstractC3255) arrayList.get(i2);
                    if (abstractC3257.wasReturnedFromScrap()) {
                    }
                    i2++;
                } else {
                    arrayList4 = c13132.mChildHelper.f72858;
                    size3 = arrayList4.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size3) {
                            view3 = null;
                            break;
                        }
                        view3 = (View) arrayList4.get(i3);
                        abstractC3255M31833 = C13132.m31833(view3);
                        if (abstractC3255M31833.getLayoutPosition() != i) {
                        }
                        i3++;
                    }
                    if (view3 != null) {
                        size4 = arrayList2.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size4) {
                                abstractC3255CreateViewHolder = null;
                                break;
                            }
                            abstractC3257 = (AbstractC3255) arrayList2.get(i4);
                            if (abstractC3257.isInvalid()) {
                            }
                            i4++;
                        }
                    } else {
                        abstractC3255CreateViewHolder = C13132.m31833(view3);
                        c13132.mChildHelper.m50479(view3);
                        iM50475 = c13132.mChildHelper.m50475(view3);
                        if (iM50475 != -1) {
                            c13132.mChildHelper.m50470(iM50475);
                            m8077(view3);
                            abstractC3255CreateViewHolder.addFlags(8224);
                            break;
                        }
                        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC3255CreateViewHolder + c13132.exceptionLabel());
                    }
                    if (abstractC3255CreateViewHolder != null) {
                        if (!abstractC3255CreateViewHolder.isRemoved()) {
                            i5 = abstractC3255CreateViewHolder.mPosition;
                            if (i5 >= 0) {
                            }
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC3255CreateViewHolder + c13132.exceptionLabel());
                        }
                        if (!C13132.sDebugAssertionsEnabled) {
                        }
                        z6 = c13132.mState.f69359;
                        if (z6) {
                            abstractC3255CreateViewHolder.addFlags(4);
                            if (abstractC3255CreateViewHolder.isScrap()) {
                                c13132.removeDetachedView(abstractC3255CreateViewHolder.itemView, false);
                                abstractC3255CreateViewHolder.unScrap();
                            } else if (abstractC3255CreateViewHolder.wasReturnedFromScrap()) {
                                abstractC3255CreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            m8071(abstractC3255CreateViewHolder);
                            abstractC3255CreateViewHolder = null;
                        } else {
                            z = true;
                        }
                    }
                }
                abstractC3255CreateViewHolder = abstractC3257;
                if (abstractC3255CreateViewHolder != null) {
                    if (!abstractC3255CreateViewHolder.isRemoved()) {
                        i5 = abstractC3255CreateViewHolder.mPosition;
                        if (i5 >= 0) {
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC3255CreateViewHolder + c13132.exceptionLabel());
                    }
                    if (!C13132.sDebugAssertionsEnabled) {
                    }
                    z6 = c13132.mState.f69359;
                    if (z6) {
                        abstractC3255CreateViewHolder.addFlags(4);
                        if (abstractC3255CreateViewHolder.isScrap()) {
                            c13132.removeDetachedView(abstractC3255CreateViewHolder.itemView, false);
                            abstractC3255CreateViewHolder.unScrap();
                        } else if (abstractC3255CreateViewHolder.wasReturnedFromScrap()) {
                            abstractC3255CreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        m8071(abstractC3255CreateViewHolder);
                        abstractC3255CreateViewHolder = null;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (abstractC3255CreateViewHolder == null) {
            iM4701 = c13132.mAdapterHelper.m4701(i, 0);
            if (iM4701 >= 0) {
            }
            StringBuilder sbM46684 = C20361.m46682("Inconsistency detected. Invalid item position ", i, "(offset:", ").state:", iM4701);
            sbM46684.append(c13132.mState.m48777());
            sbM46684.append(c13132.exceptionLabel());
            throw new IndexOutOfBoundsException(sbM46684.toString());
        }
        j2 = C13132.FOREVER_NS;
        z2 = z;
        abstractC3255 = abstractC3255CreateViewHolder;
        if (z2) {
            abstractC3255.setFlags(0, 8192);
            if (c13132.mState.f69353) {
                AbstractC22723.m50780(abstractC3255);
                AbstractC22723 abstractC22724 = c13132.mItemAnimator;
                abstractC3255.getUnmodifiedPayloads();
                abstractC22724.getClass();
                C11435 c11436 = new C11435();
                c11436.m28252(abstractC3255);
                c13132.recordAnimationInfoIfBouncedHiddenView(abstractC3255, c11436);
            }
        }
        if (c13132.mState.f69359) {
            if (abstractC3255.isBound()) {
                if (!C13132.sDebugAssertionsEnabled) {
                }
                int iM4704 = c13132.mAdapterHelper.m4701(i, 0);
                abstractC3255.mBindingAdapter = null;
                abstractC3255.mOwnerRecyclerView = c13132;
                int itemViewType3 = abstractC3255.getItemViewType();
                nanoTime = c13132.getNanoTime();
                if (j != j2) {
                }
                if (abstractC3255.isTmpDetached()) {
                    c13132.attachViewToParent(abstractC3255.itemView, c13132.getChildCount(), abstractC3255.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c13132.mAdapter.bindViewHolder(abstractC3255, iM4704);
                if (z3) {
                    c13132.detachViewFromParent(abstractC3255.itemView);
                }
                this.f8081.m37725(abstractC3255.getItemViewType(), c13132.getNanoTime() - nanoTime);
                if (c13132.isAccessibilityEnabled()) {
                    view = abstractC3255.itemView;
                    int i11 = C17648.f53953;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c10311 = c13132.mAccessibilityDelegate;
                    if (c10311 != null) {
                        itemDelegate = c10311.getItemDelegate();
                        if (itemDelegate instanceof C12427) {
                            ((C12427) itemDelegate).m30594(view);
                        }
                        C17648.m41309(view, itemDelegate);
                    }
                }
                if (c13132.mState.f69359) {
                    abstractC3255.mPreLayoutPosition = i;
                }
                z4 = true;
            } else {
                if (!C13132.sDebugAssertionsEnabled) {
                }
                int iM4705 = c13132.mAdapterHelper.m4701(i, 0);
                abstractC3255.mBindingAdapter = null;
                abstractC3255.mOwnerRecyclerView = c13132;
                int itemViewType4 = abstractC3255.getItemViewType();
                nanoTime = c13132.getNanoTime();
                if (j != j2) {
                }
                if (abstractC3255.isTmpDetached()) {
                    c13132.attachViewToParent(abstractC3255.itemView, c13132.getChildCount(), abstractC3255.itemView.getLayoutParams());
                    z3 = true;
                } else {
                    z3 = false;
                }
                c13132.mAdapter.bindViewHolder(abstractC3255, iM4705);
                if (z3) {
                    c13132.detachViewFromParent(abstractC3255.itemView);
                }
                this.f8081.m37725(abstractC3255.getItemViewType(), c13132.getNanoTime() - nanoTime);
                if (c13132.isAccessibilityEnabled()) {
                    view = abstractC3255.itemView;
                    int i12 = C17648.f53953;
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                    c10311 = c13132.mAccessibilityDelegate;
                    if (c10311 != null) {
                        itemDelegate = c10311.getItemDelegate();
                        if (itemDelegate instanceof C12427) {
                            ((C12427) itemDelegate).m30594(view);
                        }
                        C17648.m41309(view, itemDelegate);
                    }
                }
                if (c13132.mState.f69359) {
                    abstractC3255.mPreLayoutPosition = i;
                }
                z4 = true;
            }
        } else if (abstractC3255.isBound()) {
            if (!C13132.sDebugAssertionsEnabled) {
            }
            int iM4706 = c13132.mAdapterHelper.m4701(i, 0);
            abstractC3255.mBindingAdapter = null;
            abstractC3255.mOwnerRecyclerView = c13132;
            int itemViewType5 = abstractC3255.getItemViewType();
            nanoTime = c13132.getNanoTime();
            if (j != j2) {
            }
            if (abstractC3255.isTmpDetached()) {
                c13132.attachViewToParent(abstractC3255.itemView, c13132.getChildCount(), abstractC3255.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c13132.mAdapter.bindViewHolder(abstractC3255, iM4706);
            if (z3) {
                c13132.detachViewFromParent(abstractC3255.itemView);
            }
            this.f8081.m37725(abstractC3255.getItemViewType(), c13132.getNanoTime() - nanoTime);
            if (c13132.isAccessibilityEnabled()) {
                view = abstractC3255.itemView;
                int i13 = C17648.f53953;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c10311 = c13132.mAccessibilityDelegate;
                if (c10311 != null) {
                    itemDelegate = c10311.getItemDelegate();
                    if (itemDelegate instanceof C12427) {
                        ((C12427) itemDelegate).m30594(view);
                    }
                    C17648.m41309(view, itemDelegate);
                }
            }
            if (c13132.mState.f69359) {
                abstractC3255.mPreLayoutPosition = i;
            }
            z4 = true;
        } else {
            if (!C13132.sDebugAssertionsEnabled) {
            }
            int iM4707 = c13132.mAdapterHelper.m4701(i, 0);
            abstractC3255.mBindingAdapter = null;
            abstractC3255.mOwnerRecyclerView = c13132;
            int itemViewType6 = abstractC3255.getItemViewType();
            nanoTime = c13132.getNanoTime();
            if (j != j2) {
            }
            if (abstractC3255.isTmpDetached()) {
                c13132.attachViewToParent(abstractC3255.itemView, c13132.getChildCount(), abstractC3255.itemView.getLayoutParams());
                z3 = true;
            } else {
                z3 = false;
            }
            c13132.mAdapter.bindViewHolder(abstractC3255, iM4707);
            if (z3) {
                c13132.detachViewFromParent(abstractC3255.itemView);
            }
            this.f8081.m37725(abstractC3255.getItemViewType(), c13132.getNanoTime() - nanoTime);
            if (c13132.isAccessibilityEnabled()) {
                view = abstractC3255.itemView;
                int i14 = C17648.f53953;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                c10311 = c13132.mAccessibilityDelegate;
                if (c10311 != null) {
                    itemDelegate = c10311.getItemDelegate();
                    if (itemDelegate instanceof C12427) {
                        ((C12427) itemDelegate).m30594(view);
                    }
                    C17648.m41309(view, itemDelegate);
                }
            }
            if (c13132.mState.f69359) {
                abstractC3255.mPreLayoutPosition = i;
            }
            z4 = true;
        }
        layoutParams = abstractC3255.itemView.getLayoutParams();
        if (layoutParams == null) {
            c14543 = (C14543) c13132.generateDefaultLayoutParams();
            abstractC3255.itemView.setLayoutParams(c14543);
        } else if (c13132.checkLayoutParams(layoutParams)) {
            c14543 = (C14543) c13132.generateLayoutParams(layoutParams);
            abstractC3255.itemView.setLayoutParams(c14543);
        } else {
            c14543 = (C14543) layoutParams;
        }
        c14543.f44554 = abstractC3255;
        if (z2) {
            z5 = false;
        } else {
            z5 = false;
        }
        c14543.f44553 = z5;
        return abstractC3255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8064(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m8064((ViewGroup) childAt, true);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8070(View view) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        boolean zIsTmpDetached = abstractC3255M31833.isTmpDetached();
        C13132 c13132 = this.f8076;
        if (zIsTmpDetached) {
            c13132.removeDetachedView(view, false);
        }
        if (abstractC3255M31833.isScrap()) {
            abstractC3255M31833.unScrap();
        } else if (abstractC3255M31833.wasReturnedFromScrap()) {
            abstractC3255M31833.clearReturnedFromScrapFlag();
        }
        m8071(abstractC3255M31833);
        if (c13132.mItemAnimator == null || abstractC3255M31833.isRecyclable()) {
            return;
        }
        c13132.mItemAnimator.mo20596(abstractC3255M31833);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m8082() {
        ArrayList arrayList = this.f8077;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                m8081(size);
            }
        }
        arrayList.clear();
        if (C13132.ALLOW_THREAD_GAP_WORK) {
            C19238 c19238 = this.f8076.mPrefetchRegistry;
            int[] iArr = c19238.f60552;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c19238.f60551 = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8081(int i) {
        int i2 = C13132.HORIZONTAL;
        ArrayList arrayList = this.f8077;
        AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(i);
        if (C13132.sVerboseLoggingEnabled) {
            C11003.toString(abstractC3255);
        }
        m8072(abstractC3255, true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7 A[LOOP:2: B:56:0x00be->B:60:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ca A[EDGE_INSN: B:84:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ca A[EDGE_INSN: B:85:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ca A[EDGE_INSN: B:86:0x00ca->B:61:0x00ca BREAK  A[LOOP:1: B:51:0x00a7->B:88:?, LOOP_LABEL: LOOP:1: B:51:0x00a7->B:88:?], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8071(AbstractC3255 abstractC3255) {
        int i;
        C19238 c19238;
        int i2;
        int i3;
        boolean zIsScrap = abstractC3255.isScrap();
        boolean z = false;
        boolean z2 = true;
        C13132 c13132 = this.f8076;
        if (zIsScrap || abstractC3255.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC3255.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC3255.itemView.getParent() != null);
            sb.append(c13132.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC3255.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC3255 + c13132.exceptionLabel());
        }
        if (abstractC3255.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + c13132.exceptionLabel());
        }
        boolean zDoesTransientStatePreventRecycling = abstractC3255.doesTransientStatePreventRecycling();
        AbstractC19902 abstractC19902 = c13132.mAdapter;
        boolean z3 = abstractC19902 != null && zDoesTransientStatePreventRecycling && abstractC19902.onFailedToRecycleView(abstractC3255);
        boolean z4 = C13132.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f8077;
        if (z4 && arrayList.contains(abstractC3255)) {
            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC3255 + c13132.exceptionLabel());
        }
        if (z3 || abstractC3255.isRecyclable()) {
            if (this.f8082 <= 0 || abstractC3255.hasAnyOfTheFlags(526)) {
                z = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f8082 && size > 0) {
                    m8081(0);
                    size--;
                }
                if (C13132.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C19238 c19239 = c13132.mPrefetchRegistry;
                    int i4 = abstractC3255.mPosition;
                    if (c19239.f60552 != null) {
                        int i5 = c19239.f60551 * 2;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                loop1: while (true) {
                                    size--;
                                    if (size >= 0) {
                                        break;
                                    }
                                    i = ((AbstractC3255) arrayList.get(size)).mPosition;
                                    c19238 = c13132.mPrefetchRegistry;
                                    if (c19238.f60552 != null) {
                                        break;
                                    }
                                    i2 = c19238.f60551 * 2;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < i2) {
                                            break loop1;
                                        } else if (c19238.f60552[i3] == i) {
                                            break;
                                        } else {
                                            i3 += 2;
                                        }
                                    }
                                }
                                size++;
                            } else if (c19239.f60552[i6] != i4) {
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
                            i = ((AbstractC3255) arrayList.get(size)).mPosition;
                            c19238 = c13132.mPrefetchRegistry;
                            if (c19238.f60552 != null) {
                                break;
                                break;
                            }
                            i2 = c19238.f60551 * 2;
                            i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    break loop1;
                                    break loop1;
                                } else if (c19238.f60552[i3] == i) {
                                    break;
                                } else {
                                    i3 += 2;
                                }
                            }
                        }
                        size++;
                    }
                }
                arrayList.add(size, abstractC3255);
                z = true;
            }
            if (!z) {
                m8072(abstractC3255, true);
            }
            c13132.mViewInfoStore.m44867(abstractC3255);
            if (z && !z2 && zDoesTransientStatePreventRecycling) {
                C9975.m25138(abstractC3255.itemView);
                abstractC3255.mBindingAdapter = null;
                abstractC3255.mOwnerRecyclerView = null;
                return;
            }
            return;
        }
        if (C13132.sVerboseLoggingEnabled) {
            c13132.exceptionLabel();
        }
        z2 = false;
        c13132.mViewInfoStore.m44867(abstractC3255);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8072(AbstractC3255 abstractC3255, boolean z) {
        C13132.m31835(abstractC3255);
        View view = abstractC3255.itemView;
        C13132 c13132 = this.f8076;
        C10311 c10311 = c13132.mAccessibilityDelegate;
        if (c10311 != null) {
            C16445 itemDelegate = c10311.getItemDelegate();
            C17648.m41309(view, itemDelegate instanceof C12427 ? ((C12427) itemDelegate).m30593(view) : null);
        }
        if (z) {
            InterfaceC3961 interfaceC3961 = c13132.mRecyclerListener;
            if (interfaceC3961 != null) {
                interfaceC3961.m12001();
            }
            int size = c13132.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC3961) c13132.mRecyclerListeners.get(i)).m12001();
            }
            AbstractC19902 abstractC19902 = c13132.mAdapter;
            if (abstractC19902 != null) {
                abstractC19902.onViewRecycled(abstractC3255);
            }
            if (c13132.mState != null) {
                c13132.mViewInfoStore.m44867(abstractC3255);
            }
            if (C13132.sVerboseLoggingEnabled) {
                C11003.toString(abstractC3255);
            }
        }
        abstractC3255.mBindingAdapter = null;
        abstractC3255.mOwnerRecyclerView = null;
        m8069().m37726(abstractC3255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8077(View view) {
        AbstractC3255 abstractC3255M31833 = C13132.m31833(view);
        boolean zHasAnyOfTheFlags = abstractC3255M31833.hasAnyOfTheFlags(12);
        C13132 c13132 = this.f8076;
        if (zHasAnyOfTheFlags || !abstractC3255M31833.isUpdated() || c13132.canReuseUpdatedViewHolder(abstractC3255M31833)) {
            if (abstractC3255M31833.isInvalid() && !abstractC3255M31833.isRemoved() && !c13132.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c13132.exceptionLabel());
            }
            abstractC3255M31833.setScrapContainer(this, false);
            this.f8075.add(abstractC3255M31833);
            return;
        }
        if (this.f8079 == null) {
            this.f8079 = new ArrayList();
        }
        abstractC3255M31833.setScrapContainer(this, true);
        this.f8079.add(abstractC3255M31833);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8078(AbstractC3255 abstractC3255) {
        if (abstractC3255.mInChangeScrap) {
            this.f8079.remove(abstractC3255);
        } else {
            this.f8075.remove(abstractC3255);
        }
        abstractC3255.mScrapContainer = null;
        abstractC3255.mInChangeScrap = false;
        abstractC3255.clearReturnedFromScrapFlag();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8073(C15954 c15954) {
        C13132 c13132 = this.f8076;
        m8065(c13132.mAdapter, false);
        C15954 c15955 = this.f8081;
        if (c15955 != null) {
            c15955.f49246--;
        }
        this.f8081 = c15954;
        if (c15954 != null && c13132.getAdapter() != null) {
            this.f8081.f49246++;
        }
        m8066();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m8066() {
        if (this.f8081 != null) {
            C13132 c13132 = this.f8076;
            if (c13132.mAdapter == null || !c13132.isAttachedToWindow()) {
                return;
            }
            C15954 c15954 = this.f8081;
            c15954.f49247.add(c13132.mAdapter);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8065(AbstractC19902 abstractC19902, boolean z) {
        C15954 c15954 = this.f8081;
        if (c15954 != null) {
            SparseArray sparseArray = c15954.f49248;
            Set set = c15954.f49247;
            set.remove(abstractC19902);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C8900) sparseArray.get(sparseArray.keyAt(i))).f27068;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C9975.m25138(((AbstractC3255) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8080() {
        m8066();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8083() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8077;
            if (i >= arrayList.size()) {
                m8065(this.f8076.mAdapter, false);
                return;
            } else {
                C9975.m25138(((AbstractC3255) arrayList.get(i)).itemView);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15954 m8069() {
        if (this.f8081 == null) {
            C15954 c15954 = new C15954();
            c15954.f49248 = new SparseArray();
            c15954.f49246 = 0;
            c15954.f49247 = Collections.newSetFromMap(new IdentityHashMap());
            this.f8081 = c15954;
            m8066();
        }
        return this.f8081;
    }
}
