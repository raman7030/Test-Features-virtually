.class public Ll/᩵᩷֫;
.super Ll/ۡ᩻֫;
.source "C5S0"


# instance fields
.field public ۗ:Z

.field public ۙ:Landroid/view/View;

.field public final ۤ:Ljava/lang/Runnable;

.field public ۫:Landroid/view/View;

.field public final ۬:Landroid/widget/AdapterView$OnItemClickListener;

.field public ᩶:Landroid/widget/ListView;

.field public ᩸:Landroid/view/View;

.field public final ᩹:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Ll/ۡ᩻֫;-><init>()V

    .line 50
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Ll/᩵᩷֫;->᩹:Landroid/os/Handler;

    .line 53
    new-instance v0, Ll/ۘ᩷֫;

    invoke-direct {v0, p0}, Ll/ۘ᩷֫;-><init>(Ll/᩵᩷֫;)V

    iput-object v0, p0, Ll/᩵᩷֫;->ۤ:Ljava/lang/Runnable;

    .line 60
    new-instance v0, Ll/ᩴ᩷֫;

    invoke-direct {v0, p0}, Ll/ᩴ᩷֫;-><init>(Ll/᩵᩷֫;)V

    iput-object v0, p0, Ll/᩵᩷֫;->۬:Landroid/widget/AdapterView$OnItemClickListener;

    return-void
.end method

.method private ۧ()V
    .locals 3

    .line 350
    iget-object v0, p0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    if-eqz v0, :cond_0

    return-void

    .line 353
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩻֫;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 357
    instance-of v1, v0, Landroid/widget/ListView;

    if-eqz v1, :cond_1

    .line 358
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    goto :goto_1

    :cond_1
    const v1, 0xff0001

    .line 360
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-nez v1, :cond_2

    const v1, 0x1020004

    .line 362
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/᩵᩷֫;->᩸:Landroid/view/View;

    goto :goto_0

    :cond_2
    const/16 v2, 0x8

    .line 364
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v1, 0xff0002

    .line 366
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/᩵᩷֫;->۫:Landroid/view/View;

    const v1, 0xff0003

    .line 367
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/᩵᩷֫;->ۙ:Landroid/view/View;

    const v1, 0x102000a

    .line 368
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 369
    instance-of v1, v0, Landroid/widget/ListView;

    if-nez v1, :cond_4

    if-nez v0, :cond_3

    .line 371
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Your content must have a ListView whose id attribute is \'android.R.id.list\'"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 375
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Content has view with id attribute \'android.R.id.list\' that is not a ListView class"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 379
    :cond_4
    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    .line 380
    iget-object v1, p0, Ll/᩵᩷֫;->᩸:Landroid/view/View;

    if-eqz v1, :cond_5

    .line 381
    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 387
    iput-boolean v0, p0, Ll/᩵᩷֫;->ۗ:Z

    .line 388
    iget-object v0, p0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    iget-object v1, p0, Ll/᩵᩷֫;->۬:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 396
    iget-object v0, p0, Ll/᩵᩷֫;->۫:Landroid/view/View;

    if-eqz v0, :cond_8

    .line 288
    invoke-direct {p0}, Ll/᩵᩷֫;->ۧ()V

    .line 289
    iget-object v0, p0, Ll/᩵᩷֫;->۫:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 292
    iget-boolean v1, p0, Ll/᩵᩷֫;->ۗ:Z

    const/4 v2, 0x0

    if-nez v1, :cond_6

    goto :goto_2

    .line 295
    :cond_6
    iput-boolean v2, p0, Ll/᩵᩷֫;->ۗ:Z

    const/4 v1, 0x0

    const/16 v2, 0x8

    .line 315
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 316
    iget-object v0, p0, Ll/᩵᩷֫;->ۙ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 318
    iget-object v0, p0, Ll/᩵᩷֫;->۫:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 319
    iget-object v0, p0, Ll/᩵᩷֫;->ۙ:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 290
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t be used with a custom content view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 400
    :cond_8
    :goto_2
    iget-object v0, p0, Ll/᩵᩷֫;->᩹:Landroid/os/Handler;

    iget-object v1, p0, Ll/᩵᩷֫;->ۤ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 355
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Content view not yet created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 98
    invoke-virtual {p0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p1

    .line 100
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 104
    new-instance p3, Landroid/widget/LinearLayout;

    invoke-direct {p3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const v0, 0xff0002

    .line 105
    invoke-virtual {p3, v0}, Landroid/view/View;->setId(I)V

    const/4 v0, 0x1

    .line 106
    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v0, 0x8

    .line 107
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    const/16 v0, 0x11

    .line 108
    invoke-virtual {p3, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 110
    new-instance v1, Landroid/widget/ProgressBar;

    const/4 v2, 0x0

    const v3, 0x101007a

    invoke-direct {v1, p1, v2, v3}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 112
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    new-instance p3, Landroid/widget/FrameLayout;

    invoke-direct {p3, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const v1, 0xff0003

    .line 121
    invoke-virtual {p3, v1}, Landroid/view/View;->setId(I)V

    .line 123
    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v3, 0xff0001

    .line 124
    invoke-virtual {v1, v3}, Landroid/view/View;->setId(I)V

    .line 125
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 126
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    new-instance v0, Landroid/widget/ListView;

    invoke-direct {v0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    const p1, 0x102000a

    .line 130
    invoke-virtual {v0, p1}, Landroid/view/View;->setId(I)V

    const/4 p1, 0x0

    .line 131
    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->setDrawSelectorOnTop(Z)V

    .line 132
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p3, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p2
.end method

.method public final onDestroyView()V
    .locals 2

    .line 160
    iget-object v0, p0, Ll/᩵᩷֫;->᩹:Landroid/os/Handler;

    iget-object v1, p0, Ll/᩵᩷֫;->ۤ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 161
    iput-object v0, p0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    const/4 v1, 0x0

    .line 162
    iput-boolean v1, p0, Ll/᩵᩷֫;->ۗ:Z

    .line 163
    iput-object v0, p0, Ll/᩵᩷֫;->ۙ:Landroid/view/View;

    iput-object v0, p0, Ll/᩵᩷֫;->۫:Landroid/view/View;

    iput-object v0, p0, Ll/᩵᩷֫;->᩸:Landroid/view/View;

    .line 165
    invoke-super {p0}, Ll/ۡ᩻֫;->onDestroyView()V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 151
    invoke-super {p0, p1, p2}, Ll/ۡ᩻֫;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 152
    invoke-direct {p0}, Ll/᩵᩷֫;->ۧ()V

    return-void
.end method
