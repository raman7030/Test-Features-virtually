.class public Ll/ۗۜ;
.super Ljava/lang/Object;
.source "G5Q6"

# interfaces
.implements Ll/᩺۬;


# static fields
.field public static final ACTION_VIEW_STATES_KEY:Ljava/lang/String; = "android:menu:actionviewstates"

.field public static final EXPANDED_ACTION_VIEW_ID:Ljava/lang/String; = "android:menu:expandedactionview"

.field public static final PRESENTER_KEY:Ljava/lang/String; = "android:menu:presenters"

.field public static final TAG:Ljava/lang/String; = "MenuBuilder"

.field public static final sCategoryToOrder:[I


# instance fields
.field public mActionItems:Ljava/util/ArrayList;

.field public mCallback:Ll/᩶ۜ;

.field public final mContext:Landroid/content/Context;

.field public mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

.field public mDefaultShowAsAction:I

.field public mExpandedItem:Ll/ۛۜ;

.field public mGroupDividerEnabled:Z

.field public mHeaderIcon:Landroid/graphics/drawable/Drawable;

.field public mHeaderTitle:Ljava/lang/CharSequence;

.field public mHeaderView:Landroid/view/View;

.field public mIsActionItemsStale:Z

.field public mIsClosing:Z

.field public mIsVisibleItemsStale:Z

.field public mItems:Ljava/util/ArrayList;

.field public mItemsChangedWhileDispatchPrevented:Z

.field public mNonActionItems:Ljava/util/ArrayList;

.field public mOptionalIconsVisible:Z

.field public mOverrideVisibleItems:Z

.field public mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public mPreventDispatchingItemsChanged:Z

.field public mQwertyMode:Z

.field public final mResources:Landroid/content/res/Resources;

.field public mShortcutsVisible:Z

.field public mStructureChangedWhileDispatchPrevented:Z

.field public mTempShortcutItemList:Ljava/util/ArrayList;

.field public mVisibleItems:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [I

    .line 67
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۜ;->sCategoryToOrder:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
        0x4
        0x5
        0x3
        0x2
        0x0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 133
    iput v0, p0, Ll/ۗۜ;->mDefaultShowAsAction:I

    .line 158
    iput-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    .line 160
    iput-boolean v0, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    .line 162
    iput-boolean v0, p0, Ll/ۗۜ;->mStructureChangedWhileDispatchPrevented:Z

    .line 164
    iput-boolean v0, p0, Ll/ۗۜ;->mOptionalIconsVisible:Z

    .line 166
    iput-boolean v0, p0, Ll/ۗۜ;->mIsClosing:Z

    .line 168
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ۗۜ;->mTempShortcutItemList:Ljava/util/ArrayList;

    .line 170
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 181
    iput-boolean v0, p0, Ll/ۗۜ;->mGroupDividerEnabled:Z

    .line 221
    iput-object p1, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    .line 222
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    .line 223
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    .line 225
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۗۜ;->mVisibleItems:Ljava/util/ArrayList;

    const/4 p1, 0x1

    .line 226
    iput-boolean p1, p0, Ll/ۗۜ;->mIsVisibleItemsStale:Z

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗۜ;->mActionItems:Ljava/util/ArrayList;

    .line 229
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    .line 230
    iput-boolean p1, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    .line 232
    invoke-direct {p0, p1}, Ll/ۗۜ;->ۧ(Z)V

    return-void
.end method

.method public static ֫(I)I
    .locals 3

    const/high16 v0, -0x10000

    and-int/2addr v0, p0

    shr-int/lit8 v0, v0, 0x10

    if-ltz v0, :cond_0

    .line 780
    sget-object v1, Ll/ۗۜ;->sCategoryToOrder:[I

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 784
    aget v0, v1, v0

    shl-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    and-int/2addr p0, v1

    or-int/2addr p0, v0

    return p0

    .line 781
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "order does not contain a valid category."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;I)I
    .locals 2

    .line 846
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 847
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜ;

    .line 848
    invoke-virtual {v1}, Ll/ۛۜ;->ᩳ()I

    move-result v1

    if-gt v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(IIIILjava/lang/CharSequence;I)Ll/ۛۜ;
    .locals 9

    .line 459
    new-instance v8, Ll/ۛۜ;

    move-object v0, v8

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Ll/ۛۜ;-><init>(Ll/ۗۜ;IIIILjava/lang/CharSequence;I)V

    return-object v8
.end method

.method private ֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
    .locals 2

    .line 1225
    invoke-virtual {p0}, Ll/ۗۜ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p5, :cond_0

    .line 1228
    iput-object p5, p0, Ll/ۗۜ;->mHeaderView:Landroid/view/View;

    .line 1231
    iput-object v1, p0, Ll/ۗۜ;->mHeaderTitle:Ljava/lang/CharSequence;

    .line 1232
    iput-object v1, p0, Ll/ۗۜ;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_2

    :cond_0
    if-lez p1, :cond_1

    .line 1235
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۜ;->mHeaderTitle:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    .line 1237
    iput-object p2, p0, Ll/ۗۜ;->mHeaderTitle:Ljava/lang/CharSequence;

    :cond_2
    :goto_0
    if-lez p3, :cond_3

    .line 1241
    invoke-virtual {p0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p3}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۜ;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    :cond_3
    if-eqz p4, :cond_4

    .line 1243
    iput-object p4, p0, Ll/ۗۜ;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    .line 1247
    :cond_4
    :goto_1
    iput-object v1, p0, Ll/ۗۜ;->mHeaderView:Landroid/view/View;

    :goto_2
    const/4 p1, 0x0

    .line 1251
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method private ֫(IZ)V
    .locals 1

    if-ltz p1, :cond_1

    .line 579
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 581
    :cond_0
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    .line 583
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "android:menu:presenters"

    .line 342
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 344
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 346
    :cond_0
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 347
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷;

    if-nez v2, :cond_2

    .line 349
    iget-object v2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 351
    :cond_2
    invoke-interface {v2}, Ll/ܳ᩷;->getId()I

    move-result v1

    if-lez v1, :cond_1

    .line 353
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Parcelable;

    if-eqz v1, :cond_1

    .line 355
    invoke-interface {v2, v1}, Ll/ܳ᩷;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private ֫(Z)V
    .locals 3

    .line 281
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 283
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 284
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 285
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷;

    if-nez v2, :cond_1

    .line 287
    iget-object v2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 289
    :cond_1
    invoke-interface {v2, p1}, Ll/ܳ᩷;->updateMenuView(Z)V

    goto :goto_0

    .line 292
    :cond_2
    invoke-virtual {p0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return-void
.end method

.method private ֫(Ll/᩵᩷;Ll/ܳ᩷;)Z
    .locals 3

    .line 297
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-eqz p2, :cond_1

    .line 303
    invoke-interface {p2, p1}, Ll/ܳ᩷;->onSubMenuSelected(Ll/᩵᩷;)Z

    move-result v1

    .line 306
    :cond_1
    iget-object p2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 307
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷;

    if-nez v2, :cond_3

    .line 309
    iget-object v2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-nez v1, :cond_2

    .line 311
    invoke-interface {v2, p1}, Ll/ܳ᩷;->onSubMenuSelected(Ll/᩵᩷;)Z

    move-result v1

    goto :goto_0

    :cond_4
    return v1
.end method

.method private ۧ(Landroid/os/Bundle;)V
    .locals 4

    .line 318
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 320
    :cond_0
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 322
    iget-object v1, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 323
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷;

    if-nez v3, :cond_2

    .line 325
    iget-object v3, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 327
    :cond_2
    invoke-interface {v3}, Ll/ܳ᩷;->getId()I

    move-result v2

    if-lez v2, :cond_1

    .line 329
    invoke-interface {v3}, Ll/ܳ᩷;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 331
    invoke-virtual {v0, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    const-string v1, "android:menu:presenters"

    .line 337
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-void
.end method

.method private ۧ(Z)V
    .locals 2

    if-eqz p1, :cond_0

    .line 811
    iget-object p1, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    .line 812
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->keyboard:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    .line 814
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    iget-object v1, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    .line 813
    invoke-static {p1, v1}, Ll/᩷᩺;->ᩳ(Landroid/view/ViewConfiguration;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۗۜ;->mShortcutsVisible:Z

    return-void
.end method


# virtual methods
.method public add(I)Landroid/view/MenuItem;
    .locals 1

    .line 470
    iget-object v0, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, p1}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public add(IIII)Landroid/view/MenuItem;
    .locals 1

    .line 480
    iget-object v0, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0

    .line 475
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    const/4 v0, 0x0

    .line 465
    invoke-virtual {p0, v0, v0, v0, p1}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 7

    .line 519
    iget-object v0, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    .line 521
    invoke-virtual {v0, p4, p5, p6, v1}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p4

    if-eqz p4, :cond_0

    .line 522
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 p7, p7, 0x1

    if-nez p7, :cond_1

    .line 525
    invoke-virtual {p0, p1}, Ll/ۗۜ;->removeGroup(I)V

    :cond_1
    :goto_1
    if-ge v1, v2, :cond_4

    .line 529
    invoke-interface {p4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Landroid/content/pm/ResolveInfo;

    .line 530
    new-instance v3, Landroid/content/Intent;

    .line 531
    iget v4, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I

    if-gez v4, :cond_2

    move-object v4, p6

    goto :goto_2

    :cond_2
    aget-object v4, p5, v4

    :goto_2
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 532
    new-instance v4, Landroid/content/ComponentName;

    iget-object v5, p7, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v5, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v4, v6, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 535
    invoke-virtual {p7, v0}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {p0, p1, p2, p3, v4}, Ll/ۗۜ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v4

    .line 536
    invoke-virtual {p7, v0}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-interface {v4, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v4

    .line 537
    invoke-interface {v4, v3}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    move-result-object v3

    if-eqz p8, :cond_3

    .line 538
    iget p7, p7, Landroid/content/pm/ResolveInfo;->specificIndex:I

    if-ltz p7, :cond_3

    .line 539
    aput-object v3, p8, p7

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    return v2
.end method

.method public addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 8

    .line 440
    invoke-static {p3}, Ll/ۗۜ;->֫(I)I

    move-result v7

    .line 442
    iget v6, p0, Ll/ۗۜ;->mDefaultShowAsAction:I

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, v7

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Ll/ۗۜ;->֫(IIIILjava/lang/CharSequence;I)Ll/ۛۜ;

    move-result-object p1

    .line 445
    iget-object p2, p0, Ll/ۗۜ;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    if-eqz p2, :cond_0

    .line 447
    invoke-virtual {p1, p2}, Ll/ۛۜ;->֫(Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 450
    :cond_0
    iget-object p2, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-static {p2, v7}, Ll/ۗۜ;->֫(Ljava/util/ArrayList;I)I

    move-result p3

    invoke-virtual {p2, p3, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 p2, 0x1

    .line 451
    invoke-virtual {p0, p2}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-object p1
.end method

.method public addMenuPresenter(Ll/ܳ᩷;)V
    .locals 1

    .line 247
    iget-object v0, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    invoke-virtual {p0, p1, v0}, Ll/ۗۜ;->addMenuPresenter(Ll/ܳ᩷;Landroid/content/Context;)V

    return-void
.end method

.method public addMenuPresenter(Ll/ܳ᩷;Landroid/content/Context;)V
    .locals 2

    .line 260
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    invoke-interface {p1, p2, p0}, Ll/ܳ᩷;->initForMenu(Landroid/content/Context;Ll/ۗۜ;)V

    const/4 p1, 0x1

    .line 262
    iput-boolean p1, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    return-void
.end method

.method public addSubMenu(I)Landroid/view/SubMenu;
    .locals 1

    .line 490
    iget-object v0, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0, p1}, Ll/ۗۜ;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1

    .line 504
    iget-object v0, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 495
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ۗۜ;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    check-cast p1, Ll/ۛۜ;

    .line 496
    new-instance p2, Ll/᩵᩷;

    iget-object p3, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    invoke-direct {p2, p3, p0, p1}, Ll/᩵᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Ll/ۛۜ;)V

    .line 497
    invoke-virtual {p1, p2}, Ll/ۛۜ;->֫(Ll/᩵᩷;)V

    return-object p2
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    const/4 v0, 0x0

    .line 485
    invoke-virtual {p0, v0, v0, v0, p1}, Ll/ۗۜ;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public changeMenuMode()V
    .locals 1

    .line 840
    iget-object v0, p0, Ll/ۗۜ;->mCallback:Ll/᩶ۜ;

    if-eqz v0, :cond_0

    .line 841
    invoke-interface {v0, p0}, Ll/᩶ۜ;->onMenuModeChange(Ll/ۗۜ;)V

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 1

    .line 603
    iget-object v0, p0, Ll/ۗۜ;->mExpandedItem:Ll/ۛۜ;

    if-eqz v0, :cond_0

    .line 604
    invoke-virtual {p0, v0}, Ll/ۗۜ;->collapseItemActionView(Ll/ۛۜ;)Z

    .line 606
    :cond_0
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    .line 608
    invoke-virtual {p0, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public clearAll()V
    .locals 2

    const/4 v0, 0x1

    .line 591
    iput-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    .line 592
    invoke-virtual {p0}, Ll/ۗۜ;->clear()V

    .line 593
    invoke-virtual {p0}, Ll/ۗۜ;->clearHeader()V

    .line 594
    iget-object v1, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const/4 v1, 0x0

    .line 595
    iput-boolean v1, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    .line 596
    iput-boolean v1, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    .line 597
    iput-boolean v1, p0, Ll/ۗۜ;->mStructureChangedWhileDispatchPrevented:Z

    .line 598
    invoke-virtual {p0, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public clearHeader()V
    .locals 1

    const/4 v0, 0x0

    .line 1216
    iput-object v0, p0, Ll/ۗۜ;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    .line 1217
    iput-object v0, p0, Ll/ۗۜ;->mHeaderTitle:Ljava/lang/CharSequence;

    .line 1218
    iput-object v0, p0, Ll/ۗۜ;->mHeaderView:Landroid/view/View;

    const/4 v0, 0x0

    .line 1220
    invoke-virtual {p0, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x1

    .line 1045
    invoke-virtual {p0, v0}, Ll/ۗۜ;->close(Z)V

    return-void
.end method

.method public final close(Z)V
    .locals 3

    .line 1029
    iget-boolean v0, p0, Ll/ۗۜ;->mIsClosing:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1031
    iput-boolean v0, p0, Ll/ۗۜ;->mIsClosing:Z

    .line 1032
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 1033
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷;

    if-nez v2, :cond_1

    .line 1035
    iget-object v2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1037
    :cond_1
    invoke-interface {v2, p0, p1}, Ll/ܳ᩷;->onCloseMenu(Ll/ۗۜ;Z)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 1040
    iput-boolean p1, p0, Ll/ۗۜ;->mIsClosing:Z

    return-void
.end method

.method public collapseItemActionView(Ll/ۛۜ;)Z
    .locals 4

    .line 1376
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۗۜ;->mExpandedItem:Ll/ۛۜ;

    if-eq v0, p1, :cond_0

    goto :goto_1

    .line 1380
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 1381
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 1382
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷;

    if-nez v3, :cond_2

    .line 1384
    iget-object v3, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1385
    :cond_2
    invoke-interface {v3, p0, p1}, Ll/ܳ᩷;->collapseItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1389
    :cond_3
    invoke-virtual {p0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    if-eqz v1, :cond_4

    const/4 p1, 0x0

    .line 1392
    iput-object p1, p0, Ll/ۗۜ;->mExpandedItem:Ll/ۛۜ;

    :cond_4
    :goto_1
    return v1
.end method

.method public dispatchMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 833
    iget-object v0, p0, Ll/ۗۜ;->mCallback:Ll/᩶ۜ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/᩶ۜ;->onMenuItemSelected(Ll/ۗۜ;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public expandItemActionView(Ll/ۛۜ;)Z
    .locals 4

    .line 1354
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 1358
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    .line 1359
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 1360
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ᩷;

    if-nez v3, :cond_2

    .line 1362
    iget-object v3, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1363
    :cond_2
    invoke-interface {v3, p0, p1}, Ll/ܳ᩷;->expandItemActionView(Ll/ۗۜ;Ll/ۛۜ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1367
    :cond_3
    invoke-virtual {p0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    if-eqz v1, :cond_4

    .line 1370
    iput-object p1, p0, Ll/ۗۜ;->mExpandedItem:Ll/ۛۜ;

    :cond_4
    return v1
.end method

.method public findGroupIndex(I)I
    .locals 1

    const/4 v0, 0x0

    .line 723
    invoke-virtual {p0, p1, v0}, Ll/ۗۜ;->findGroupIndex(II)I

    move-result p1

    return p1
.end method

.method public findGroupIndex(II)I
    .locals 2

    .line 727
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    if-gez p2, :cond_0

    const/4 p2, 0x0

    :cond_0
    :goto_0
    if-ge p2, v0, :cond_2

    .line 734
    iget-object v1, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛۜ;

    .line 736
    invoke-virtual {v1}, Ll/ۛۜ;->getGroupId()I

    move-result v1

    if-ne v1, p1, :cond_1

    return p2

    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public findItem(I)Landroid/view/MenuItem;
    .locals 4

    .line 692
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 694
    iget-object v2, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ;

    .line 695
    invoke-virtual {v2}, Ll/ۛۜ;->getItemId()I

    move-result v3

    if-ne v3, p1, :cond_0

    return-object v2

    .line 697
    :cond_0
    invoke-virtual {v2}, Ll/ۛۜ;->hasSubMenu()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 698
    invoke-virtual {v2}, Ll/ۛۜ;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v2

    invoke-interface {v2, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public findItemIndex(I)I
    .locals 3

    .line 710
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 713
    iget-object v2, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ;

    .line 714
    invoke-virtual {v2}, Ll/ۛۜ;->getItemId()I

    move-result v2

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Ll/ۛۜ;
    .locals 11

    .line 929
    iget-object v0, p0, Ll/ۗۜ;->mTempShortcutItemList:Ljava/util/ArrayList;

    .line 930
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 931
    invoke-virtual {p0, v0, p1, p2}, Ll/ۗۜ;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V

    .line 933
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 937
    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    .line 938
    new-instance v3, Landroid/view/KeyCharacterMap$KeyData;

    invoke-direct {v3}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 940
    invoke-virtual {p2, v3}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    .line 943
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne p2, v4, :cond_1

    .line 945
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۜ;

    return-object p1

    .line 948
    :cond_1
    invoke-virtual {p0}, Ll/ۗۜ;->isQwertyMode()Z

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, p2, :cond_7

    .line 952
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۜ;

    if-eqz v4, :cond_2

    .line 953
    invoke-virtual {v7}, Ll/ۛۜ;->getAlphabeticShortcut()C

    move-result v8

    goto :goto_1

    .line 954
    :cond_2
    invoke-virtual {v7}, Ll/ۛۜ;->getNumericShortcut()C

    move-result v8

    .line 955
    :goto_1
    iget-object v9, v3, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    aget-char v10, v9, v5

    if-ne v8, v10, :cond_3

    and-int/lit8 v10, v1, 0x2

    if-eqz v10, :cond_5

    :cond_3
    const/4 v10, 0x2

    aget-char v9, v9, v10

    if-ne v8, v9, :cond_4

    and-int/lit8 v9, v1, 0x2

    if-nez v9, :cond_5

    :cond_4
    if-eqz v4, :cond_6

    const/16 v9, 0x8

    if-ne v8, v9, :cond_6

    const/16 v8, 0x43

    if-ne p1, v8, :cond_6

    :cond_5
    return-object v7

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_7
    return-object v2
.end method

.method public findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V
    .locals 12

    .line 881
    invoke-virtual {p0}, Ll/ۗۜ;->isQwertyMode()Z

    move-result v0

    .line 882
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getModifiers()I

    move-result v1

    .line 883
    new-instance v2, Landroid/view/KeyCharacterMap$KeyData;

    invoke-direct {v2}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 885
    invoke-virtual {p3, v2}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    move-result v3

    const/16 v4, 0x43

    if-nez v3, :cond_0

    if-eq p2, v4, :cond_0

    goto :goto_3

    .line 892
    :cond_0
    iget-object v3, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_6

    .line 894
    iget-object v7, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۜ;

    .line 895
    invoke-virtual {v7}, Ll/ۛۜ;->hasSubMenu()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 896
    invoke-virtual {v7}, Ll/ۛۜ;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v8

    check-cast v8, Ll/ۗۜ;

    invoke-virtual {v8, p1, p2, p3}, Ll/ۗۜ;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V

    :cond_1
    if-eqz v0, :cond_2

    .line 899
    invoke-virtual {v7}, Ll/ۛۜ;->getAlphabeticShortcut()C

    move-result v8

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Ll/ۛۜ;->getNumericShortcut()C

    move-result v8

    :goto_1
    if-eqz v0, :cond_3

    .line 901
    invoke-virtual {v7}, Ll/ۛۜ;->getAlphabeticModifiers()I

    move-result v9

    goto :goto_2

    :cond_3
    invoke-virtual {v7}, Ll/ۛۜ;->getNumericModifiers()I

    move-result v9

    :goto_2
    const v10, 0x1100f

    and-int v11, v1, v10

    and-int/2addr v9, v10

    if-ne v11, v9, :cond_5

    if-eqz v8, :cond_5

    .line 904
    iget-object v9, v2, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    aget-char v10, v9, v5

    if-eq v8, v10, :cond_4

    const/4 v10, 0x2

    aget-char v9, v9, v10

    if-eq v8, v9, :cond_4

    if-eqz v0, :cond_5

    const/16 v9, 0x8

    if-ne v8, v9, :cond_5

    if-ne p2, v4, :cond_5

    .line 909
    :cond_4
    invoke-virtual {v7}, Ll/ۛۜ;->isEnabled()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 910
    invoke-interface {p1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    return-void
.end method

.method public flagActionItems()V
    .locals 6

    .line 1166
    invoke-virtual {p0}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 1168
    iget-boolean v1, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    if-nez v1, :cond_0

    return-void

    .line 1174
    :cond_0
    iget-object v1, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 1175
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳ᩷;

    if-nez v5, :cond_1

    .line 1177
    iget-object v5, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1179
    :cond_1
    invoke-interface {v5}, Ll/ܳ᩷;->flagActionItems()Z

    move-result v4

    or-int/2addr v3, v4

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_4

    .line 1184
    iget-object v1, p0, Ll/ۗۜ;->mActionItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1185
    iget-object v1, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1186
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_5

    .line 1188
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۜ;

    .line 1189
    invoke-virtual {v4}, Ll/ۛۜ;->᩷()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1190
    iget-object v5, p0, Ll/ۗۜ;->mActionItems:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1192
    :cond_3
    iget-object v5, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 1198
    :cond_4
    iget-object v0, p0, Ll/ۗۜ;->mActionItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1199
    iget-object v0, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1200
    iget-object v0, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1202
    :cond_5
    iput-boolean v2, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    return-void
.end method

.method public getActionItems()Ljava/util/ArrayList;
    .locals 1

    .line 1206
    invoke-virtual {p0}, Ll/ۗۜ;->flagActionItems()V

    .line 1207
    iget-object v0, p0, Ll/ۗۜ;->mActionItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getActionViewStatesKey()Ljava/lang/String;
    .locals 1

    const-string v0, "android:menu:actionviewstates"

    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 829
    iget-object v0, p0, Ll/ۗۜ;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getExpandedItem()Ll/ۛۜ;
    .locals 1

    .line 1398
    iget-object v0, p0, Ll/ۗۜ;->mExpandedItem:Ll/ۛۜ;

    return-object v0
.end method

.method public getHeaderIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1319
    iget-object v0, p0, Ll/ۗۜ;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getHeaderTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 1315
    iget-object v0, p0, Ll/ۗۜ;->mHeaderTitle:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public getHeaderView()Landroid/view/View;
    .locals 1

    .line 1323
    iget-object v0, p0, Ll/ۗۜ;->mHeaderView:Landroid/view/View;

    return-object v0
.end method

.method public getItem(I)Landroid/view/MenuItem;
    .locals 1

    .line 751
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    return-object p1
.end method

.method public getNonActionItems()Ljava/util/ArrayList;
    .locals 1

    .line 1211
    invoke-virtual {p0}, Ll/ۗۜ;->flagActionItems()V

    .line 1212
    iget-object v0, p0, Ll/ۗۜ;->mNonActionItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getOptionalIconsVisible()Z
    .locals 1

    .line 1350
    iget-boolean v0, p0, Ll/ۗۜ;->mOptionalIconsVisible:Z

    return v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    .line 825
    iget-object v0, p0, Ll/ۗۜ;->mResources:Landroid/content/res/Resources;

    return-object v0
.end method

.method public getRootMenu()Ll/ۗۜ;
    .locals 0

    return-object p0
.end method

.method public getVisibleItems()Ljava/util/ArrayList;
    .locals 5

    .line 1121
    iget-boolean v0, p0, Ll/ۗۜ;->mIsVisibleItemsStale:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۗۜ;->mVisibleItems:Ljava/util/ArrayList;

    return-object v0

    .line 1124
    :cond_0
    iget-object v0, p0, Ll/ۗۜ;->mVisibleItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1126
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 1129
    iget-object v3, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۜ;

    .line 1130
    invoke-virtual {v3}, Ll/ۛۜ;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Ll/ۗۜ;->mVisibleItems:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1133
    :cond_2
    iput-boolean v1, p0, Ll/ۗۜ;->mIsVisibleItemsStale:Z

    const/4 v0, 0x1

    .line 1134
    iput-boolean v0, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    .line 1136
    iget-object v0, p0, Ll/ۗۜ;->mVisibleItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public hasVisibleItems()Z
    .locals 5

    .line 674
    iget-boolean v0, p0, Ll/ۗۜ;->mOverrideVisibleItems:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 678
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 681
    iget-object v4, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۜ;

    .line 682
    invoke-virtual {v4}, Ll/ۛۜ;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public isDispatchingItemsChanged()Z
    .locals 1

    .line 1072
    iget-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isGroupDividerEnabled()Z
    .locals 1

    .line 513
    iget-boolean v0, p0, Ll/ۗۜ;->mGroupDividerEnabled:Z

    return v0
.end method

.method public isQwertyMode()Z
    .locals 1

    .line 791
    iget-boolean v0, p0, Ll/ۗۜ;->mQwertyMode:Z

    return v0
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 756
    invoke-virtual {p0, p1, p2}, Ll/ۗۜ;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Ll/ۛۜ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isShortcutsVisible()Z
    .locals 1

    .line 821
    iget-boolean v0, p0, Ll/ۗۜ;->mShortcutsVisible:Z

    return v0
.end method

.method public onItemActionRequestChanged(Ll/ۛۜ;)V
    .locals 0

    const/4 p1, 0x1

    .line 1115
    iput-boolean p1, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    .line 1116
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public onItemVisibleChanged(Ll/ۛۜ;)V
    .locals 0

    const/4 p1, 0x1

    .line 1104
    iput-boolean p1, p0, Ll/ۗۜ;->mIsVisibleItemsStale:Z

    .line 1105
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public onItemsChanged(Z)V
    .locals 2

    .line 1056
    iget-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 1058
    iput-boolean v1, p0, Ll/ۗۜ;->mIsVisibleItemsStale:Z

    .line 1059
    iput-boolean v1, p0, Ll/ۗۜ;->mIsActionItemsStale:Z

    .line 1062
    :cond_0
    invoke-direct {p0, p1}, Ll/ۗۜ;->֫(Z)V

    return-void

    .line 1064
    :cond_1
    iput-boolean v1, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    if-eqz p1, :cond_2

    .line 1066
    iput-boolean v1, p0, Ll/ۗۜ;->mStructureChangedWhileDispatchPrevented:Z

    :cond_2
    return-void
.end method

.method public performIdentifierAction(II)Z
    .locals 0

    .line 970
    invoke-virtual {p0, p1}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result p1

    return p1
.end method

.method public performItemAction(Landroid/view/MenuItem;I)Z
    .locals 1

    const/4 v0, 0x0

    .line 974
    invoke-virtual {p0, p1, v0, p2}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;Ll/ܳ᩷;I)Z

    move-result p1

    return p1
.end method

.method public performItemAction(Landroid/view/MenuItem;Ll/ܳ᩷;I)Z
    .locals 6

    .line 978
    check-cast p1, Ll/ۛۜ;

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    .line 980
    invoke-virtual {p1}, Ll/ۛۜ;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 984
    :cond_0
    invoke-virtual {p1}, Ll/ۛۜ;->ۜ()Z

    move-result v1

    .line 986
    invoke-virtual {p1}, Ll/ۛۜ;->֫()Ll/ܿۛ;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 987
    invoke-virtual {v2}, Ll/ܿۛ;->֫()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 988
    :goto_0
    invoke-virtual {p1}, Ll/ۛۜ;->᩻()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 989
    invoke-virtual {p1}, Ll/ۛۜ;->expandActionView()Z

    move-result p1

    or-int/2addr p1, v1

    if-eqz p1, :cond_2

    .line 991
    invoke-virtual {p0, v3}, Ll/ۗۜ;->close(Z)V

    :cond_2
    return p1

    .line 993
    :cond_3
    invoke-virtual {p1}, Ll/ۛۜ;->hasSubMenu()Z

    move-result v5

    if-nez v5, :cond_6

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_5

    .line 1013
    invoke-virtual {p0, v3}, Ll/ۗۜ;->close(Z)V

    :cond_5
    return v1

    :cond_6
    :goto_1
    and-int/lit8 p3, p3, 0x4

    if-nez p3, :cond_7

    .line 996
    invoke-virtual {p0, v0}, Ll/ۗۜ;->close(Z)V

    .line 999
    :cond_7
    invoke-virtual {p1}, Ll/ۛۜ;->hasSubMenu()Z

    move-result p3

    if-nez p3, :cond_8

    .line 1000
    new-instance p3, Ll/᩵᩷;

    invoke-virtual {p0}, Ll/ۗۜ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0, p0, p1}, Ll/᩵᩷;-><init>(Landroid/content/Context;Ll/ۗۜ;Ll/ۛۜ;)V

    invoke-virtual {p1, p3}, Ll/ۛۜ;->֫(Ll/᩵᩷;)V

    .line 1003
    :cond_8
    invoke-virtual {p1}, Ll/ۛۜ;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    check-cast p1, Ll/᩵᩷;

    if-eqz v4, :cond_9

    .line 1005
    invoke-virtual {v2, p1}, Ll/ܿۛ;->֫(Ll/᩵᩷;)V

    .line 1007
    :cond_9
    invoke-direct {p0, p1, p2}, Ll/ۗۜ;->֫(Ll/᩵᩷;Ll/ܳ᩷;)Z

    move-result p1

    or-int/2addr p1, v1

    if-nez p1, :cond_a

    .line 1009
    invoke-virtual {p0, v3}, Ll/ۗۜ;->close(Z)V

    :cond_a
    return p1

    :cond_b
    :goto_2
    return v0
.end method

.method public performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 0

    .line 858
    invoke-virtual {p0, p1, p2}, Ll/ۗۜ;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Ll/ۛۜ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 863
    invoke-virtual {p0, p1, p3}, Ll/ۗۜ;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/lit8 p2, p3, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    .line 867
    invoke-virtual {p0, p2}, Ll/ۗۜ;->close(Z)V

    :cond_1
    return p1
.end method

.method public removeGroup(I)V
    .locals 5

    .line 553
    invoke-virtual {p0, p1}, Ll/ۗۜ;->findGroupIndex(I)I

    move-result v0

    if-ltz v0, :cond_1

    .line 556
    iget-object v1, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    add-int/lit8 v4, v3, 0x1

    if-ge v3, v1, :cond_0

    .line 558
    iget-object v3, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۜ;

    invoke-virtual {v3}, Ll/ۛۜ;->getGroupId()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 560
    invoke-direct {p0, v0, v2}, Ll/ۗۜ;->֫(IZ)V

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 564
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_1
    return-void
.end method

.method public removeItem(I)V
    .locals 1

    .line 548
    invoke-virtual {p0, p1}, Ll/ۗۜ;->findItemIndex(I)I

    move-result p1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/ۗۜ;->֫(IZ)V

    return-void
.end method

.method public removeItemAt(I)V
    .locals 1

    const/4 v0, 0x1

    .line 587
    invoke-direct {p0, p1, v0}, Ll/ۗۜ;->֫(IZ)V

    return-void
.end method

.method public removeMenuPresenter(Ll/ܳ᩷;)V
    .locals 3

    .line 272
    iget-object v0, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 273
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ᩷;

    if-eqz v2, :cond_1

    if-ne v2, p1, :cond_0

    .line 275
    :cond_1
    iget-object v2, p0, Ll/ۗۜ;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public restoreActionViewStates(Landroid/os/Bundle;)V
    .locals 7

    if-nez p1, :cond_0

    goto :goto_1

    .line 404
    :cond_0
    invoke-virtual {p0}, Ll/ۗۜ;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v0

    .line 403
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    .line 406
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    .line 408
    invoke-virtual {p0, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    .line 409
    invoke-interface {v3}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 410
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 411
    invoke-virtual {v4, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 413
    :cond_1
    invoke-interface {v3}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 414
    invoke-interface {v3}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    check-cast v3, Ll/᩵᩷;

    .line 415
    invoke-virtual {v3, p1}, Ll/ۗۜ;->restoreActionViewStates(Landroid/os/Bundle;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const-string v0, "android:menu:expandedactionview"

    .line 419
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_4

    .line 421
    invoke-virtual {p0, p1}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 423
    invoke-interface {p1}, Landroid/view/MenuItem;->expandActionView()Z

    :cond_4
    :goto_1
    return-void
.end method

.method public restorePresenterStates(Landroid/os/Bundle;)V
    .locals 0

    .line 367
    invoke-direct {p0, p1}, Ll/ۗۜ;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public saveActionViewStates(Landroid/os/Bundle;)V
    .locals 7

    .line 373
    invoke-virtual {p0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 375
    invoke-virtual {p0, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    .line 376
    invoke-interface {v3}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 377
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    if-nez v1, :cond_0

    .line 379
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 381
    :cond_0
    invoke-virtual {v4, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 382
    invoke-interface {v3}, Landroid/view/MenuItem;->isActionViewExpanded()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "android:menu:expandedactionview"

    .line 383
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 386
    :cond_1
    invoke-interface {v3}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 387
    invoke-interface {v3}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    check-cast v3, Ll/᩵᩷;

    .line 388
    invoke-virtual {v3, p1}, Ll/ۗۜ;->saveActionViewStates(Landroid/os/Bundle;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v1, :cond_4

    .line 393
    invoke-virtual {p0}, Ll/ۗۜ;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_4
    return-void
.end method

.method public savePresenterStates(Landroid/os/Bundle;)V
    .locals 0

    .line 363
    invoke-direct {p0, p1}, Ll/ۗۜ;->ۧ(Landroid/os/Bundle;)V

    return-void
.end method

.method public setCallback(Ll/᩶ۜ;)V
    .locals 0

    .line 433
    iput-object p1, p0, Ll/ۗۜ;->mCallback:Ll/᩶ۜ;

    return-void
.end method

.method public setCurrentMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0

    .line 1342
    iput-object p1, p0, Ll/ۗۜ;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    return-void
.end method

.method public setDefaultShowAsAction(I)Ll/ۗۜ;
    .locals 0

    .line 236
    iput p1, p0, Ll/ۗۜ;->mDefaultShowAsAction:I

    return-object p0
.end method

.method public setExclusiveItemChecked(Landroid/view/MenuItem;)V
    .locals 5

    .line 612
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v0

    .line 614
    iget-object v1, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 615
    invoke-virtual {p0}, Ll/ۗۜ;->stopDispatchingItemsChanged()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 617
    iget-object v3, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۜ;

    .line 618
    invoke-virtual {v3}, Ll/ۛۜ;->getGroupId()I

    move-result v4

    if-ne v4, v0, :cond_3

    .line 619
    invoke-virtual {v3}, Ll/ۛۜ;->ۢ()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 620
    :cond_0
    invoke-virtual {v3}, Ll/ۛۜ;->isCheckable()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    if-ne v3, p1, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    .line 623
    :goto_1
    invoke-virtual {v3, v4}, Ll/ۛۜ;->ۧ(Z)V

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 626
    :cond_4
    invoke-virtual {p0}, Ll/ۗۜ;->startDispatchingItemsChanged()V

    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 4

    .line 631
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 634
    iget-object v2, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ;

    .line 635
    invoke-virtual {v2}, Ll/ۛۜ;->getGroupId()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 636
    invoke-virtual {v2, p3}, Ll/ۛۜ;->ܽ(Z)V

    .line 637
    invoke-virtual {v2, p2}, Ll/ۛۜ;->setCheckable(Z)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setGroupDividerEnabled(Z)V
    .locals 0

    .line 509
    iput-boolean p1, p0, Ll/ۗۜ;->mGroupDividerEnabled:Z

    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 4

    .line 662
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 665
    iget-object v2, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۜ;

    .line 666
    invoke-virtual {v2}, Ll/ۛۜ;->getGroupId()I

    move-result v3

    if-ne v3, p1, :cond_0

    .line 667
    invoke-virtual {v2, p2}, Ll/ۛۜ;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 5

    .line 644
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v1, v0, :cond_1

    .line 651
    iget-object v3, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۜ;

    .line 652
    invoke-virtual {v3}, Ll/ۛۜ;->getGroupId()I

    move-result v4

    if-ne v4, p1, :cond_0

    .line 653
    invoke-virtual {v3, p2}, Ll/ۛۜ;->ܿ(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    .line 657
    invoke-virtual {p0, v3}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_2
    return-void
.end method

.method public setHeaderIconInt(I)Ll/ۗۜ;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v3, p1

    .line 1298
    invoke-direct/range {v0 .. v5}, Ll/ۗۜ;->֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object p0
.end method

.method public setHeaderIconInt(Landroid/graphics/drawable/Drawable;)Ll/ۗۜ;
    .locals 6

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v4, p1

    .line 1286
    invoke-direct/range {v0 .. v5}, Ll/ۗۜ;->֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object p0
.end method

.method public setHeaderTitleInt(I)Ll/ۗۜ;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    .line 1274
    invoke-direct/range {v0 .. v5}, Ll/ۗۜ;->֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object p0
.end method

.method public setHeaderTitleInt(Ljava/lang/CharSequence;)Ll/ۗۜ;
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p1

    .line 1262
    invoke-direct/range {v0 .. v5}, Ll/ۗۜ;->֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object p0
.end method

.method public setHeaderViewInt(Landroid/view/View;)Ll/ۗۜ;
    .locals 6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v5, p1

    .line 1310
    invoke-direct/range {v0 .. v5}, Ll/ۗۜ;->֫(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    return-object p0
.end method

.method public setOptionalIconsVisible(Z)V
    .locals 0

    .line 1346
    iput-boolean p1, p0, Ll/ۗۜ;->mOptionalIconsVisible:Z

    return-void
.end method

.method public setOverrideVisibleItems(Z)V
    .locals 0

    .line 1407
    iput-boolean p1, p0, Ll/ۗۜ;->mOverrideVisibleItems:Z

    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 0

    .line 761
    iput-boolean p1, p0, Ll/ۗۜ;->mQwertyMode:Z

    const/4 p1, 0x0

    .line 763
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public setShortcutsVisible(Z)V
    .locals 1

    .line 802
    iget-boolean v0, p0, Ll/ۗۜ;->mShortcutsVisible:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 806
    :cond_0
    invoke-direct {p0, p1}, Ll/ۗۜ;->ۧ(Z)V

    const/4 p1, 0x0

    .line 807
    invoke-virtual {p0, p1}, Ll/ۗۜ;->onItemsChanged(Z)V

    return-void
.end method

.method public size()I
    .locals 1

    .line 746
    iget-object v0, p0, Ll/ۗۜ;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public startDispatchingItemsChanged()V
    .locals 2

    const/4 v0, 0x0

    .line 1089
    iput-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    .line 1091
    iget-boolean v1, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    if-eqz v1, :cond_0

    .line 1092
    iput-boolean v0, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    .line 1093
    iget-boolean v0, p0, Ll/ۗۜ;->mStructureChangedWhileDispatchPrevented:Z

    invoke-virtual {p0, v0}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_0
    return-void
.end method

.method public stopDispatchingItemsChanged()V
    .locals 1

    .line 1081
    iget-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 1082
    iput-boolean v0, p0, Ll/ۗۜ;->mPreventDispatchingItemsChanged:Z

    const/4 v0, 0x0

    .line 1083
    iput-boolean v0, p0, Ll/ۗۜ;->mItemsChangedWhileDispatchPrevented:Z

    .line 1084
    iput-boolean v0, p0, Ll/ۗۜ;->mStructureChangedWhileDispatchPrevented:Z

    :cond_0
    return-void
.end method
