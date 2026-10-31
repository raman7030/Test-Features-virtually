.class public Ll/֫᩷֫;
.super Landroid/widget/TabHost;
.source "J62A"

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:Z

.field public ᩹:Landroid/widget/TabHost$OnTabChangeListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 148
    invoke-direct {p0, p1, p2}, Landroid/widget/TabHost;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫᩷֫;->᩶:Ljava/util/ArrayList;

    const v0, 0x10100f3

    .line 153
    filled-new-array {v0}, [I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 155
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 156
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 158
    invoke-super {p0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    return-void
.end method

.method private ֫()Ll/ܽ᩷֫;
    .locals 3

    .line 433
    iget-object v0, p0, Ll/֫᩷֫;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-gtz v1, :cond_0

    return-object v2

    :cond_0
    const/4 v1, 0x0

    .line 434
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۜ֫;

    .line 435
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v2
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 299
    invoke-super {p0}, Landroid/widget/TabHost;->onAttachedToWindow()V

    .line 301
    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    .line 306
    iget-object v0, p0, Ll/֫᩷֫;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    .line 328
    iput-boolean v0, p0, Ll/֫᩷֫;->᩸:Z

    .line 329
    invoke-direct {p0}, Ll/֫᩷֫;->֫()Ll/ܽ᩷֫;

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 307
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۜ֫;

    .line 308
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 344
    invoke-super {p0}, Landroid/widget/TabHost;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 345
    iput-boolean v0, p0, Ll/֫᩷֫;->᩸:Z

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1
    .param p1    # Landroid/os/Parcelable;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 371
    instance-of v0, p1, Ll/ܰۜ֫;

    if-nez v0, :cond_0

    .line 372
    invoke-super {p0, p1}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 375
    :cond_0
    check-cast p1, Ll/ܰۜ֫;

    .line 376
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/TabHost;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 377
    iget-object p1, p1, Ll/ܰۜ֫;->᩸:Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/widget/TabHost;->setCurrentTabByTag(Ljava/lang/String;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 357
    invoke-super {p0}, Landroid/widget/TabHost;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 358
    new-instance v1, Ll/ܰۜ֫;

    .line 92
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 359
    invoke-virtual {p0}, Landroid/widget/TabHost;->getCurrentTabTag()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ll/ܰۜ֫;->᩸:Ljava/lang/String;

    return-object v1
.end method

.method public final onTabChanged(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 388
    iget-boolean v0, p0, Ll/֫᩷֫;->᩸:Z

    if-eqz v0, :cond_0

    .line 389
    invoke-direct {p0}, Ll/֫᩷֫;->֫()Ll/ܽ᩷֫;

    .line 394
    :cond_0
    iget-object v0, p0, Ll/֫᩷֫;->᩹:Landroid/widget/TabHost$OnTabChangeListener;

    if-eqz v0, :cond_1

    .line 395
    invoke-interface {v0, p1}, Landroid/widget/TabHost$OnTabChangeListener;->onTabChanged(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 259
    iput-object p1, p0, Ll/֫᩷֫;->᩹:Landroid/widget/TabHost$OnTabChangeListener;

    return-void
.end method

.method public final setup()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 196
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must call setup() that takes a Context and FragmentManager"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
