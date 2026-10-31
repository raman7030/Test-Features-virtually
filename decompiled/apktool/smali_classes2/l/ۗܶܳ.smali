.class public final Ll/ۗܶܳ;
.super Ll/᩶ۗۧ;
.source "C1ZO"


# instance fields
.field public final ֫:Lbin/mt/plus/Main;

.field public ۜ:Ll/۬۬ۧ;

.field public final ۡ:Ll/ܽ᩶ܳ;

.field public final ۢ:Ll/ۙ᩸ܳ;

.field public final ۧ:Ll/ۛ۠ܳ;

.field public ܳ:Ljava/lang/Runnable;

.field public final ܺ:Ll/ۙܶܳ;

.field public final ܽ:Ll/᩵ܶܳ;

.field public final ܿ:Ll/᩸ܶܳ;

.field public final ᩳ:Ll/᩻᩸ܳ;

.field public final ᩷:Ll/ܽۢۡ;

.field public final ᩻:Ll/֡᩸ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ܽۢۡ;)V
    .locals 6

    .line 36
    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 32
    new-instance v0, Ll/᩸ܶܳ;

    .line 408
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object v0, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    .line 37
    iput-object p1, p0, Ll/ۗܶܳ;->֫:Lbin/mt/plus/Main;

    .line 38
    iput-object p2, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    .line 39
    new-instance p2, Ll/ۙ᩸ܳ;

    invoke-direct {p2, p1, p0}, Ll/ۙ᩸ܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->ۢ:Ll/ۙ᩸ܳ;

    .line 40
    new-instance p2, Ll/᩻᩸ܳ;

    const v0, 0x7f1206c9

    .line 29
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 30
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, -0x1

    move-object v0, p2

    move-object v1, p1

    move-object v4, p0

    .line 29
    invoke-direct/range {v0 .. v5}, Ll/ܿܶܳ;-><init>(Lbin/mt/plus/Main;Ljava/lang/String;Ljava/lang/String;Ll/ۗܶܳ;I)V

    .line 40
    iput-object p2, p0, Ll/ۗܶܳ;->ᩳ:Ll/᩻᩸ܳ;

    .line 41
    new-instance p2, Ll/ۛ۠ܳ;

    invoke-direct {p2, p1, p0}, Ll/ۛ۠ܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->ۧ:Ll/ۛ۠ܳ;

    .line 42
    new-instance p2, Ll/᩵ܶܳ;

    invoke-direct {p2, p1, p0}, Ll/᩵ܶܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->ܽ:Ll/᩵ܶܳ;

    .line 43
    new-instance p2, Ll/֡᩸ܳ;

    invoke-direct {p2, p1, p0}, Ll/֡᩸ܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->᩻:Ll/֡᩸ܳ;

    .line 44
    new-instance p2, Ll/ܽ᩶ܳ;

    invoke-direct {p2, p1, p0}, Ll/ܽ᩶ܳ;-><init>(Lbin/mt/plus/Main;Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->ۡ:Ll/ܽ᩶ܳ;

    .line 45
    new-instance p2, Ll/ۙܶܳ;

    invoke-direct {p2, p0}, Ll/ۙܶܳ;-><init>(Ll/ۗܶܳ;)V

    iput-object p2, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    .line 46
    new-instance p2, Ll/֫֫ۢ;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p0}, Ll/֫֫ۢ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p2}, Ll/۫᩻᩻;->֫(Ll/ۗܺ᩷;Ll/֨ۡ֫;)V

    .line 47
    new-instance p2, Ll/۠ܶܳ;

    invoke-direct {p2, p0}, Ll/۠ܶܳ;-><init>(Ll/ۗܶܳ;)V

    invoke-static {p1, p2}, Ll/֫᩸ܳ;->֫(Lbin/mt/plus/Main;Ll/۠ܶܳ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗܶܳ;)Lbin/mt/plus/Main;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->֫:Lbin/mt/plus/Main;

    return-object p0
.end method

.method public static ֫(Ll/ۗܶܳ;Ll/ܽܶܳ;I)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-eqz v0, :cond_2

    .line 181
    iget-object p0, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    .line 182
    invoke-virtual {p0}, Ll/᩸ܶܳ;->ۧ()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p1, :cond_2

    iget-object p0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    if-eq p0, v0, :cond_0

    goto :goto_0

    .line 186
    :cond_0
    invoke-virtual {v0}, Ll/۬۬ۧ;->stopScroll()V

    .line 187
    invoke-virtual {v0}, Ll/۬۬ۧ;->getItemAnimator()Ll/᩺ۗۧ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 189
    invoke-virtual {p0}, Ll/᩺ۗۧ;->ۧ()V

    .line 191
    :cond_1
    iget-object p0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result p0

    sub-int/2addr p0, p2

    if-eqz p0, :cond_2

    const/4 p1, 0x0

    .line 193
    invoke-virtual {v0, p1, p0}, Ll/۬۬ۧ;->scrollBy(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۗܶܳ;)Ll/ۙ᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ۢ:Ll/ۙ᩸ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۗܶܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۗܶܳ;)Ll/ۛ۠ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ۧ:Ll/ۛ۠ܳ;

    return-object p0
.end method

.method private ۧ(I)Ll/᩹ܶܳ;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 370
    :goto_0
    iget-object v2, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    invoke-virtual {v2}, Ll/ۙܶܳ;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 371
    invoke-virtual {v2, v0}, Ll/ۙܶܳ;->get(I)Ll/۫ܶܳ;

    move-result-object v2

    .line 372
    invoke-virtual {v2}, Ll/۫ܶܳ;->ܽ()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr v3, v1

    if-ge p1, v3, :cond_2

    .line 378
    new-instance v0, Ll/᩹ܶܳ;

    if-ne p1, v1, :cond_1

    const/4 p1, -0x1

    goto :goto_1

    :cond_1
    sub-int/2addr p1, v1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    invoke-direct {v0, v2, p1}, Ll/᩹ܶܳ;-><init>(Ll/۫ܶܳ;I)V

    return-object v0

    :cond_2
    move v1, v3

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 382
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown drawer position "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 382
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ܳ(Ll/ۗܶܳ;)Ljava/lang/Runnable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۗܶܳ;)Ll/᩵ܶܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ܽ:Ll/᩵ܶܳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۗܶܳ;)Ll/᩸ܶܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۗܶܳ;)Ll/᩻᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ᩳ:Ll/᩻᩸ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۗܶܳ;)Ll/ܽ᩶ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->ۡ:Ll/ܽ᩶ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۗܶܳ;)Ll/֡᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܶܳ;->᩻:Ll/֡᩸ܳ;

    return-object p0
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 326
    iget-object v0, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    invoke-virtual {v0}, Ll/ۙܶܳ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 2

    .line 360
    invoke-direct {p0, p1}, Ll/ۗܶܳ;->ۧ(I)Ll/᩹ܶܳ;

    move-result-object p1

    .line 361
    iget v0, p1, Ll/᩹ܶܳ;->֫:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 364
    :cond_0
    iget-object p1, p1, Ll/᩹ܶܳ;->ۧ:Ll/۫ܶܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܶܳ;

    invoke-virtual {p1}, Ll/ۨ۠ܳ;->ۧ()I

    move-result p1

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 3

    .line 20
    check-cast p1, Ll/ܳܶܳ;

    .line 331
    invoke-direct {p0, p2}, Ll/ۗܶܳ;->ۧ(I)Ll/᩹ܶܳ;

    move-result-object p2

    iget-object v0, p2, Ll/᩹ܶܳ;->ۧ:Ll/۫ܶܳ;

    .line 332
    iget v1, p1, Ll/ܳܶܳ;->ۙ:I

    sget v2, Ll/᩹֡᩷;->ᩴ֫:I

    if-eq v1, v2, :cond_0

    .line 333
    iget-object v1, p0, Ll/ۗܶܳ;->֫:Lbin/mt/plus/Main;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ܳܶܳ;->֫(Landroid/content/res/Resources$Theme;)V

    .line 334
    sget v1, Ll/᩹֡᩷;->ᩴ֫:I

    iput v1, p1, Ll/ܳܶܳ;->ۙ:I

    .line 336
    :cond_0
    iget p2, p2, Ll/᩹ܶܳ;->֫:I

    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 337
    invoke-virtual {v0, p1}, Ll/۫ܶܳ;->֫(Ll/ܳܶܳ;)V

    return-void

    .line 339
    :cond_1
    invoke-virtual {v0, p1, p2}, Ll/۫ܶܳ;->֫(Ll/ܳܶܳ;I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    const v0, 0x7f0d0118

    const/4 v1, 0x0

    .line 346
    iget-object v2, p0, Ll/ۗܶܳ;->֫:Lbin/mt/plus/Main;

    packed-switch p2, :pswitch_data_0

    .line 354
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 378
    :pswitch_0
    new-instance p2, Ll/ܽܶܳ;

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 378
    invoke-direct {p2, v2, p1}, Ll/ܽܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    return-object p2

    .line 158
    :pswitch_1
    new-instance p2, Ll/᩵᩸ܳ;

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 158
    iget-object v0, p0, Ll/ۗܶܳ;->᩻:Ll/֡᩸ܳ;

    invoke-direct {p2, v2, p1, v0}, Ll/᩵᩸ܳ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/֡᩸ܳ;)V

    return-object p2

    .line 724
    :pswitch_2
    new-instance p2, Ll/ۨ᩹ܳ;

    const v0, 0x7f0d011c

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 724
    iget-object v0, p0, Ll/ۗܶܳ;->ۡ:Ll/ܽ᩶ܳ;

    invoke-direct {p2, v2, p1, v0}, Ll/ۨ᩹ܳ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ܽ᩶ܳ;)V

    return-object p2

    .line 193
    :pswitch_3
    new-instance p2, Ll/۫۠ܳ;

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 193
    iget-object v0, p0, Ll/ۗܶܳ;->ۧ:Ll/ۛ۠ܳ;

    invoke-direct {p2, v2, p1, v0}, Ll/۫۠ܳ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ۛ۠ܳ;)V

    return-object p2

    .line 244
    :pswitch_4
    new-instance p2, Ll/ᩴܶܳ;

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 244
    iget-object v0, p0, Ll/ۗܶܳ;->ܽ:Ll/᩵ܶܳ;

    invoke-direct {p2, v2, p1, v0}, Ll/ᩴܶܳ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/᩵ܶܳ;)V

    return-object p2

    .line 203
    :pswitch_5
    new-instance p2, Ll/᩶᩸ܳ;

    const v0, 0x7f0d011a

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 203
    iget-object v0, p0, Ll/ۗܶܳ;->ۢ:Ll/ۙ᩸ܳ;

    invoke-direct {p2, v2, p1, v0}, Ll/᩶᩸ܳ;-><init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ۙ᩸ܳ;)V

    return-object p2

    .line 117
    :pswitch_6
    new-instance p2, Ll/۬ܶܳ;

    const v0, 0x7f0d011d

    .line 0
    invoke-static {p1, v0, p1, v1}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 117
    invoke-direct {p2, v2, p1}, Ll/۬ܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ֫(Ll/۫ܶܳ;)I
    .locals 1

    .line 314
    iget-object v0, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    invoke-virtual {v0, p1}, Ll/ۙܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result p1

    return p1
.end method

.method public final ֫(I)Ll/ܿܶܳ;
    .locals 1

    .line 321
    iget-object v0, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    invoke-virtual {v0, p1}, Ll/ۙܶܳ;->֫(I)Ll/ܿܶܳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()V
    .locals 2

    .line 67
    iget-object v0, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 70
    :cond_0
    invoke-virtual {v0}, Ll/ܽۢۡ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ۗ۬ۧ;)V
    .locals 2

    .line 170
    iget-object v0, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    invoke-virtual {v0}, Ll/᩸ܶܳ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_0

    return-void

    .line 201
    :cond_0
    iget-object p1, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-eqz p1, :cond_1

    .line 202
    iget-object v1, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 203
    invoke-virtual {p1, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 p1, 0x0

    .line 205
    iput-object p1, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    .line 213
    invoke-virtual {v0}, Ll/᩸ܶܳ;->֫()V

    return-void
.end method

.method public final ֫(Ll/۬۬ۧ;)V
    .locals 0

    .line 106
    iput-object p1, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    return-void
.end method

.method public final ֫(Ll/ܳܶܳ;)V
    .locals 2

    .line 95
    iget-object v0, p1, Ll/ܳܶܳ;->᩹:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    iget-object v1, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    invoke-virtual {p1}, Ll/ܳܶܳ;->֫()Z

    move-result p1

    invoke-virtual {v1, v0, p1}, Ll/ܽۢۡ;->֫(Landroid/widget/ImageView;Z)V

    return-void
.end method

.method public final ֫(Ll/ܽܶܳ;)V
    .locals 2

    .line 132
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    invoke-virtual {v1, p1, v0}, Ll/᩸ܶܳ;->֫(Ll/ܽܶܳ;I)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 2

    .line 84
    iget-object v0, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 87
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܽۢۡ;->֫(Z)V

    return-void
.end method

.method public final ۧ()Ll/֡᩸ܳ;
    .locals 1

    .line 398
    iget-object v0, p0, Ll/ۗܶܳ;->᩻:Ll/֡᩸ܳ;

    return-object v0
.end method

.method public final ۧ(Ll/ܳܶܳ;)V
    .locals 4

    .line 110
    invoke-virtual {p1}, Ll/ܳܶܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 111
    instance-of v0, p1, Ll/ܽܶܳ;

    iget-object v1, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 201
    iget-object v0, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    .line 202
    iget-object v3, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    if-eqz v3, :cond_0

    .line 203
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 205
    :cond_0
    iput-object v2, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    .line 113
    invoke-virtual {v1, p1}, Ll/᩸ܶܳ;->֫(Ll/ܳܶܳ;)V

    goto :goto_0

    .line 201
    :cond_1
    iget-object v0, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-eqz v0, :cond_2

    .line 202
    iget-object v3, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    if-eqz v3, :cond_2

    .line 203
    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 205
    :cond_2
    iput-object v2, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    .line 213
    invoke-virtual {v1}, Ll/᩸ܶܳ;->֫()V

    .line 117
    :goto_0
    iget-object v0, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    invoke-virtual {v0, p1}, Ll/ܽۢۡ;->֫(Ll/ۗ۬ۧ;)V

    :cond_3
    return-void
.end method

.method public final ۧ(Ll/ܽܶܳ;)V
    .locals 5

    .line 139
    iget-object v0, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 143
    :cond_0
    iget-object v1, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    invoke-virtual {v1, p1}, Ll/᩸ܶܳ;->֫(Ll/ܽܶܳ;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    :goto_0
    return-void

    .line 201
    :cond_1
    iget-object v3, p0, Ll/ۗܶܳ;->ۜ:Ll/۬۬ۧ;

    if-eqz v3, :cond_2

    .line 202
    iget-object v4, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    if-eqz v4, :cond_2

    .line 203
    invoke-virtual {v3, v4}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_2
    const/4 v3, 0x0

    .line 205
    iput-object v3, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    .line 148
    invoke-virtual {v1}, Ll/᩸ܶܳ;->ܽ()I

    move-result v1

    .line 149
    new-instance v3, Ll/ܶܶܳ;

    invoke-direct {v3, p0, p1, v2, v1}, Ll/ܶܶܳ;-><init>(Ll/ۗܶܳ;Ll/ܽܶܳ;II)V

    .line 162
    iput-object v3, p0, Ll/ۗܶܳ;->ܳ:Ljava/lang/Runnable;

    .line 163
    invoke-virtual {v0, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۗܶܳ;->ܿ:Ll/᩸ܶܳ;

    invoke-virtual {v0, p1}, Ll/᩸ܶܳ;->֫(Ll/ۗ۬ۧ;)Z

    move-result p1

    return p1
.end method

.method public final ܽ()Z
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۗܶܳ;->᩷:Ll/ܽۢۡ;

    invoke-virtual {v0}, Ll/ܽۢۡ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۗܶܳ;->ܺ:Ll/ۙܶܳ;

    if-nez v0, :cond_0

    return-void

    .line 59
    :cond_0
    invoke-virtual {v0}, Ll/ۙܶܳ;->ܽ()V

    .line 60
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
