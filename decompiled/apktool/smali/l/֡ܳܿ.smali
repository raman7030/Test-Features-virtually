.class public Ll/֡ܳܿ;
.super Ll/ۗܺ᩷;
.source "4AWI"


# static fields
.field public static final synthetic ֨ۧ:I

.field private static final ۙۢ֫:[S


# instance fields
.field public ֡ۧ:Lcom/google/android/material/tabs/TabLayout;

.field public final ۖۧ:Ljava/util/ArrayList;

.field public final ۘۧ:Ll/ۚۡ֫;

.field public ۚۧ:Ll/ۜۡۡ;

.field public ۜۧ:Landroid/view/View;

.field public ۡۧ:Landroid/view/View;

.field public ۢۧ:Landroid/view/View;

.field public ܳۧ:Landroid/view/View;

.field public ܺۧ:Ll/ۘܳܿ;

.field public final ܿۧ:Ll/ۚۡ֫;

.field public ᩳۧ:Z

.field public ᩴۧ:Landroid/view/View;

.field public final ᩵ۧ:Ll/᩹ܿܿ;

.field public ᩷ۧ:Landroid/view/View;

.field public ᩻ۧ:Ll/۬᩵᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0x30

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֡ܳܿ;->ۙۢ֫:[S

    return-void

    :array_0
    .array-data 2
        0x247es
        0x70e8s
        -0x6161s
        -0x588bs
        -0x68dfs
        -0x5348s
        -0x79d8s
        -0x6773s
        0x7e5bs
        0x744fs
        -0x6e1cs
        0x6953s
        0x7970s
        0x7c7es
        -0x6580s
        -0x5e08s
        0x731bs
        -0x5668s
        -0x6c17s
        0x7e10s
        -0x5553s
        -0x6f90s
        -0x6593s
        0x7081s
        -0x63a7s
        0x7674s
        0x7e55s
        -0x50c0s
        0x68a8s
        -0x4841s
        -0x6765s
        -0x60cs
        -0x617s
        -0x61fs
        -0x602s
        -0x61ds
        -0x61bs
        -0x61bs
        -0x609s
        -0x60bs
        -0x61fs
        -0x605s
        -0x61es
        -0x602s
        -0x601s
        -0x49acs
        0x7fb7s
        0x7853s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 78
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    .line 90
    new-instance v0, Ll/ۚۡ֫;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 90
    iput-object v0, p0, Ll/֡ܳܿ;->ۘۧ:Ll/ۚۡ֫;

    .line 91
    new-instance v0, Ll/ۚۡ֫;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 33
    invoke-direct {v0, v1}, Ll/֡ۡ֫;-><init>(Ljava/lang/Object;)V

    .line 91
    iput-object v0, p0, Ll/֡ܳܿ;->ܿۧ:Ll/ۚۡ֫;

    .line 311
    new-instance v0, Ll/᩹ܿܿ;

    invoke-direct {v0, p0}, Ll/᩹ܿܿ;-><init>(Ll/֡ܳܿ;)V

    iput-object v0, p0, Ll/֡ܳܿ;->᩵ۧ:Ll/᩹ܿܿ;

    return-void
.end method

.method private ֫(IILl/֫ۛ;Ljava/lang/Runnable;)V
    .locals 8

    .line 414
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩻ۛ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩻ۛ᩷;-><init>(I)V

    .line 415
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܺܿܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    .line 416
    new-instance v1, Landroid/text/SpannableString;

    aget-object v2, v0, p2

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 417
    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    sget v4, Ll/᩹֡᩷;->᩻֫:I

    invoke-direct {v2, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/16 v5, 0x21

    const/4 v6, 0x0

    invoke-virtual {v1, v2, v6, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 418
    aput-object v1, v0, p2

    .line 419
    filled-new-array {p2}, [I

    move-result-object v2

    .line 420
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v6

    invoke-virtual {v6, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v1, Ll/֡֨ۢ;

    const/4 v4, 0x2

    invoke-direct {v1, v4, v2}, Ll/֡֨ۢ;-><init>(ILjava/lang/Object;)V

    .line 421
    invoke-virtual {v6, v0, p2, v1}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v7, Ll/ۖܿܿ;

    move-object v0, v7

    move-object v1, p0

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll/ۖܿܿ;-><init>(Ll/֡ܳܿ;[IILl/֫ۛ;Ljava/lang/Runnable;)V

    const v0, 0x7f12070a

    .line 422
    invoke-virtual {v6, v0, v7}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 431
    invoke-virtual {v6, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 432
    invoke-virtual {v6}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method private native ֫(Landroid/view/MenuItem;)V
.end method

.method public static synthetic ֫(Ll/֡ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֡ܳܿ;->᩺()V

    return-void
.end method

.method public static synthetic ֫(Ll/֡ܳܿ;I)V
    .locals 1

    .line 377
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 378
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    .line 379
    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {v0}, Ll/֡ܰۧ;->ܽ()I

    move-result v0

    .line 380
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    if-lez p1, :cond_0

    if-ne v0, p1, :cond_0

    .line 382
    iget-object p0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->ᩳ(I)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/֡ܳܿ;ILandroid/view/MenuItem;)V
    .locals 3

    .line 331
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    packed-switch p2, :pswitch_data_0

    return-void

    .line 389
    :pswitch_0
    new-instance p2, Ll/۫ܿܿ;

    invoke-direct {p2, p0, p0, p1}, Ll/۫ܿܿ;-><init>(Ll/֡ܳܿ;Ll/֡ܳܿ;I)V

    const p0, 0x7f12002c

    .line 403
    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 205
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    .line 373
    :pswitch_1
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۚܳܿ;

    invoke-virtual {p2}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object p2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const p2, 0x7f12023b

    .line 372
    invoke-static {p2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 374
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f1205ca

    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 375
    invoke-virtual {v1, p2}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p2, Ll/ۡܿܿ;

    invoke-direct {p2, p0, p1}, Ll/ۡܿܿ;-><init>(Ll/֡ܳܿ;I)V

    const p0, 0x7f12070a

    .line 376
    invoke-virtual {v1, p0, p2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    .line 385
    invoke-virtual {v1, p0, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 386
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 350
    :pswitch_2
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܳܿ;

    .line 351
    new-instance p2, Ll/۬ܿܿ;

    invoke-direct {p2, p0, p0, p1}, Ll/۬ܿܿ;-><init>(Ll/֡ܳܿ;Ll/֡ܳܿ;Ll/ۚܳܿ;)V

    const p0, 0x7f1205f9

    .line 364
    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->ۡ(I)V

    .line 365
    invoke-virtual {p1}, Ll/ۚܳܿ;->ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 366
    invoke-virtual {p2}, Ll/۬ۗܿ;->᩵()V

    .line 367
    invoke-virtual {p2}, Ll/۬ۗܿ;->֫()V

    .line 205
    invoke-virtual {p2, v1}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    .line 345
    :pswitch_3
    new-instance p2, Ll/ۢܿܿ;

    invoke-direct {p2, p1}, Ll/ۢܿܿ;-><init>(I)V

    const v1, 0x7f1205c6

    invoke-direct {p0, v1, p1, p2, v0}, Ll/֡ܳܿ;->֫(IILl/֫ۛ;Ljava/lang/Runnable;)V

    return-void

    .line 339
    :pswitch_4
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object p2

    add-int/lit8 v0, p1, 0x1

    invoke-static {p2, p1, v0}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 340
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    .line 341
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    .line 342
    iget-object p0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {p0, v0}, Ll/֡ܰۧ;->ᩳ(I)V

    return-void

    .line 333
    :pswitch_5
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object p2

    add-int/lit8 v0, p1, -0x1

    invoke-static {p2, p1, v0}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 334
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    .line 335
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    .line 336
    iget-object p0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {p0, v0}, Ll/֡ܰۧ;->ᩳ(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic ֫(Ll/֡ܳܿ;Landroid/view/MenuItem;Landroid/view/MenuItem;Ljava/lang/Boolean;)V
    .locals 1

    .line 545
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    move-result v0

    iget-object p0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-eq v0, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 546
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-interface {p2, p0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public static synthetic ֫(Ll/֡ܳܿ;Landroid/view/MenuItem;Ljava/lang/Integer;)V
    .locals 1

    .line 543
    iget-boolean v0, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object p0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-eq p2, p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-interface {p1, p0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡ܳܿ;Ll/ܶܳܿ;IZLl/۬ۤ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֡ܳܿ;->֫(Ll/ܶܳܿ;IZLl/۬ۤ;)V

    return-void
.end method

.method public static ֫(Ll/֡ܳܿ;Ll/ܶ᩵ܿ;[I)V
    .locals 1

    const/4 v0, 0x0

    .line 161
    :try_start_0
    aget p2, p2, v0

    invoke-static {p1, p2}, Ll/۠ܳܿ;->֫(Ll/ܶ᩵ܿ;I)V

    .line 162
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    const p1, 0x7f120487

    .line 163
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 546
    invoke-virtual {p0, p1, p2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V
    .locals 3

    .line 236
    iget v0, p1, Ll/᩻ܳܿ;->ۧ:I

    if-nez v0, :cond_0

    return-void

    .line 239
    :cond_0
    iget v0, p1, Ll/᩻ܳܿ;->ܳ:I

    new-instance v1, Ll/ܶܿܿ;

    invoke-direct {v1, p1}, Ll/ܶܿܿ;-><init>(Ll/᩻ܳܿ;)V

    new-instance p1, Ll/ۘ᩷ᩳ;

    const/4 v2, 0x2

    invoke-direct {p1, v2, p0}, Ll/ۘ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f1205c6

    invoke-direct {p0, v2, v0, v1, p1}, Ll/֡ܳܿ;->֫(IILl/֫ۛ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֡ܳܿ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֡ܳܿ;->ۧ(Z)V

    return-void
.end method

.method public static ֫(Ll/֡ܳܿ;[IILl/֫ۛ;Ljava/lang/Runnable;)V
    .locals 2

    const/4 v0, 0x0

    .line 423
    aget p1, p1, v0

    if-eq p1, p2, :cond_2

    .line 425
    invoke-interface {p3}, Ll/֫ۛ;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 436
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_1

    .line 439
    :cond_0
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۚܳܿ;

    invoke-virtual {p3}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object p3

    .line 440
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܳܿ;

    .line 441
    invoke-virtual {v0}, Ll/ܶܳܿ;->ܿ()Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ܶܳܿ;->֫(Lbin/mt/json/JSONObject;)Ll/ܶܳܿ;

    move-result-object v0

    move-object v1, p3

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 443
    :cond_1
    iget-object p0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩻ܳܿ;

    iget-object p0, p0, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 444
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    :cond_2
    :goto_1
    if-eqz p4, :cond_3

    .line 428
    invoke-interface {p4}, Ljava/lang/Runnable;->run()V

    :cond_3
    return-void
.end method

.method public static ֫(Ll/֡ܳܿ;[Z)V
    .locals 8

    .line 605
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 606
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 607
    aget-boolean v2, p1, v1

    if-eqz v2, :cond_0

    .line 608
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 611
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 614
    :cond_2
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string p1, "export"

    const/4 v1, 0x1

    .line 615
    invoke-virtual {v3, p1, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p1, "indices"

    .line 616
    invoke-virtual {v3, p1, v0}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 617
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "tfdp"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    .line 618
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v4, v0

    if-nez p1, :cond_4

    const-string p1, "TextFunctions.json"

    goto :goto_2

    .line 619
    :cond_4
    invoke-static {p1}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v5, p1

    .line 620
    iget-object v1, p0, Ll/֡ܳܿ;->᩻ۧ:Ll/۬᩵᩷;

    const-string p0, "json"

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f1205d5

    const/16 v7, 0x20

    .line 0
    invoke-static/range {v1 .. v7}, Ll/۬᩵᩷;->֫(Ll/۬᩵᩷;ILandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    return-void
.end method

.method private ֫(Ll/ܶܳܿ;IZLl/۬ۤ;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f0d00fd

    .line 641
    invoke-virtual {v0, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a0631

    .line 642
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    move/from16 v4, p2

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    const v3, 0x7f0a0633

    .line 643
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Landroid/widget/EditText;

    const v3, 0x7f0a0551

    .line 645
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroid/widget/Spinner;

    const v3, 0x7f0a0111

    .line 646
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/widget/EditText;

    const v3, 0x7f0a00a2

    .line 647
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/widget/Button;

    const v3, 0x7f0a0397

    .line 648
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Landroid/widget/TextView;

    .line 649
    invoke-virtual {v10, v3, v9}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v4, 0x7f0a0555

    .line 651
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/Spinner;

    const v4, 0x7f0a0112

    .line 652
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Landroid/widget/EditText;

    const v4, 0x7f0a00a5

    .line 653
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/widget/Button;

    const v4, 0x7f0a0398

    .line 654
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Landroid/widget/TextView;

    .line 655
    invoke-virtual {v13, v3, v12}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const v3, 0x7f0a0113

    .line 657
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 658
    new-instance v4, Ll/᩹ۖᩳ;

    const/4 v14, 0x1

    invoke-direct {v4, v8, v11, v3, v14}, Ll/᩹ۖᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 665
    invoke-virtual/range {p1 .. p1}, Ll/ܶܳܿ;->ᩳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 667
    sget-object v3, Ll/ۧܿܿ;->ܿ:Ll/ۙۡᩴ;

    .line 668
    invoke-virtual {v3}, Ll/ۙۡᩴ;->size()I

    move-result v14

    new-array v14, v14, [Ljava/lang/String;

    .line 53
    iget-object v15, v1, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    move-object/from16 p2, v5

    .line 671
    invoke-virtual {v15}, Ll/ۧܿܿ;->ܽ()I

    move-result v5

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v2

    move-object/from16 v17, v4

    move-object/from16 v18, v11

    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 672
    :goto_0
    invoke-virtual {v3}, Ll/ۙۡᩴ;->size()I

    move-result v11

    if-ge v2, v11, :cond_1

    .line 673
    invoke-virtual {v3, v2}, Ll/ۙۡᩴ;->getInt(I)I

    move-result v11

    .line 674
    invoke-static {v11}, Ll/ۧܿܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v20

    aput-object v20, v14, v2

    if-ne v11, v5, :cond_0

    move v4, v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 679
    :cond_1
    new-instance v2, Ll/᩶ۡۡ;

    invoke-direct {v2, v0, v14}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 680
    invoke-virtual {v6, v4}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 681
    invoke-static {v5}, Ll/ۧܿܿ;->֫(I)Ll/᩵ᩳܿ;

    move-result-object v2

    invoke-interface {v2, v8, v9, v10, v15}, Ll/᩵ᩳܿ;->֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/ۧܿܿ;)V

    .line 684
    sget-object v2, Ll/ۧܿܿ;->ᩳ:Ll/ۙۡᩴ;

    .line 685
    invoke-virtual {v2}, Ll/ۙۡᩴ;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const v4, 0x7f120a60

    .line 686
    invoke-static {v4}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v16

    .line 58
    iget-object v1, v1, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    if-nez v1, :cond_2

    const/4 v4, -0x1

    goto :goto_1

    .line 689
    :cond_2
    invoke-virtual {v1}, Ll/ۧܿܿ;->ܽ()I

    move-result v4

    :goto_1
    const/4 v5, 0x0

    const/4 v11, 0x0

    .line 690
    :cond_3
    :goto_2
    invoke-virtual {v2}, Ll/ۙۡᩴ;->size()I

    move-result v14

    if-ge v5, v14, :cond_4

    .line 691
    invoke-virtual {v2, v5}, Ll/ۙۡᩴ;->getInt(I)I

    move-result v14

    add-int/lit8 v5, v5, 0x1

    .line 692
    invoke-static {v14}, Ll/ۧܿܿ;->ۧ(I)Ljava/lang/String;

    move-result-object v15

    aput-object v15, v3, v5

    if-ne v14, v4, :cond_3

    move v11, v5

    goto :goto_2

    .line 697
    :cond_4
    new-instance v2, Ll/᩶ۡۡ;

    invoke-direct {v2, v0, v3}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;[Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 698
    invoke-virtual {v7, v11}, Landroid/widget/AdapterView;->setSelection(I)V

    if-eqz v1, :cond_5

    .line 700
    invoke-static {v4}, Ll/ۧܿܿ;->֫(I)Ll/᩵ᩳܿ;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-interface {v2, v3, v12, v13, v1}, Ll/᩵ᩳܿ;->֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/ۧܿܿ;)V

    goto :goto_3

    :cond_5
    move-object/from16 v3, v18

    .line 702
    sget-object v1, Ll/ۧܿܿ;->ܽ:Ll/۟ᩳܿ;

    .line 264
    invoke-virtual {v1, v3, v12, v13}, Ll/۟ᩳܿ;->֫(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;)V

    .line 705
    :goto_3
    invoke-virtual/range {v17 .. v17}, Ll/᩹ۖᩳ;->run()V

    .line 707
    new-instance v1, Ll/ۛܿܿ;

    move-object/from16 v2, v17

    invoke-direct {v1, v8, v9, v10, v2}, Ll/ۛܿܿ;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/᩹ۖᩳ;)V

    invoke-virtual {v6, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 721
    new-instance v1, Ll/ۨܿܿ;

    invoke-direct {v1, v3, v12, v13, v2}, Ll/ۨܿܿ;-><init>(Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/᩹ۖᩳ;)V

    invoke-virtual {v7, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 739
    new-instance v1, Ll/ܳܿܿ;

    invoke-direct {v1, v0, v6}, Ll/ܳܿܿ;-><init>(Ll/֡ܳܿ;Landroid/widget/Spinner;)V

    invoke-virtual {v10, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 740
    new-instance v1, Ll/᩻ܿܿ;

    invoke-direct {v1, v0, v7}, Ll/᩻ܿܿ;-><init>(Ll/֡ܳܿ;Landroid/widget/Spinner;)V

    invoke-virtual {v13, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 742
    invoke-virtual/range {p0 .. p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v2, 0x7f12070a

    const v4, 0x7f12015e

    const/4 v5, 0x0

    .line 0
    invoke-static {v1, v2, v5, v4, v5}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v15

    if-eqz p3, :cond_6

    .line 747
    invoke-static/range {p2 .. p2}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 749
    :cond_6
    invoke-virtual {v15}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ۜܿܿ;

    move-object v4, v2

    move-object/from16 v5, p2

    move-object v11, v3

    move-object/from16 v14, p4

    invoke-direct/range {v4 .. v15}, Ll/ۜܿܿ;-><init>(Landroid/widget/EditText;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/Button;Ll/۬ۤ;Ll/֡ۚۢ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ll/֡ܳܿ;Landroid/view/View;)Z
    .locals 9

    const v0, 0x7f0a05a0

    .line 312
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 313
    iget-object v1, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    return v3

    .line 316
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v4, 0x1

    invoke-interface {v2, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 317
    new-instance v2, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 68
    invoke-direct {v2, v5, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 318
    invoke-virtual {v2}, Ll/᩸ۖ;->ᩳ()V

    .line 319
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    if-lez v0, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 321
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v4

    if-ge v0, v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    .line 322
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v4, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 323
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v4, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    const v8, 0x7f120644

    .line 324
    invoke-interface {p1, v3, v4, v3, v8}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v8

    invoke-interface {v8, v5}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v8, 0x7f0801d7

    invoke-interface {v5, v8}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x2

    const v8, 0x7f120645

    .line 325
    invoke-interface {p1, v3, v5, v3, v8}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f0801fd

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x6

    const v6, 0x7f1205ad

    .line 326
    invoke-interface {p1, v3, v5, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f0801ce

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x3

    const v6, 0x7f1205c6

    .line 327
    invoke-interface {p1, v3, v5, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5, v7}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f0801e3

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x4

    const v6, 0x7f1205f9

    .line 328
    invoke-interface {p1, v3, v5, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f080231

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const/4 v5, 0x5

    const v6, 0x7f1205ca

    .line 329
    invoke-interface {p1, v3, v5, v3, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801e6

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 330
    new-instance p1, Ll/ܿܿܿ;

    invoke-direct {p1, p0, v0}, Ll/ܿܿܿ;-><init>(Ll/֡ܳܿ;I)V

    invoke-virtual {v2, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 409
    invoke-virtual {v2}, Ll/᩸ۖ;->ܿ()V

    return v4
.end method

.method public static bridge synthetic ۜ(Ll/֡ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    return-void
.end method

.method public static ۧ(Ll/֡ܳܿ;I)V
    .locals 8

    .line 213
    iget-object v0, p0, Ll/֡ܳܿ;->ܿۧ:Ll/ۚۡ֫;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {v2}, Ll/֡ܰۧ;->ܽ()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻ܳܿ;

    .line 215
    iput p1, v0, Ll/᩻ܳܿ;->ᩳ:I

    const/4 v2, -0x2

    .line 216
    iput v2, v0, Ll/᩻ܳܿ;->ۜ:I

    .line 217
    iget-object v2, v0, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {v2}, Ljava/util/BitSet;->clear()V

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eq p1, v3, :cond_0

    .line 219
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->set(I)V

    .line 220
    iput v1, v0, Ll/᩻ܳܿ;->ۧ:I

    goto :goto_0

    .line 222
    :cond_0
    iput v4, v0, Ll/᩻ܳܿ;->ۧ:I

    .line 224
    :goto_0
    iget-object p1, v0, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 225
    iget-object p1, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {p1, v4}, Ll/ۜۡۡ;->֫(Z)V

    .line 227
    new-instance p1, Ll/֡᩵ܳ;

    iget-object v2, p0, Ll/֡ܳܿ;->ۡۧ:Landroid/view/View;

    iget-object v3, p0, Ll/֡ܳܿ;->ܳۧ:Landroid/view/View;

    iget-object v5, p0, Ll/֡ܳܿ;->ᩴۧ:Landroid/view/View;

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    aput-object v2, v6, v4

    aput-object v3, v6, v1

    const/4 v2, 0x2

    aput-object v5, v6, v2

    invoke-direct {p1, v6}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    .line 228
    new-instance v3, Ll/֡᩵ܳ;

    iget-object v5, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    new-array v6, v1, [Landroid/view/View;

    aput-object v5, v6, v4

    invoke-direct {v3, v6}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    const/4 v5, 0x0

    .line 229
    invoke-virtual {p1, v5}, Ll/֡᩵ܳ;->setAlpha(F)V

    .line 230
    invoke-virtual {p1, v4}, Ll/֡᩵ܳ;->֫(I)V

    .line 231
    iput-boolean v1, v3, Ll/֡᩵ܳ;->ۧ:Z

    new-array v4, v2, [F

    .line 232
    fill-array-data v4, :array_0

    const-string v5, "alpha"

    invoke-static {p1, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v6, 0xc8

    invoke-virtual {p1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    new-array p1, v2, [F

    .line 233
    fill-array-data p1, :array_1

    invoke-static {v3, v5, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1, v6, v7}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 234
    iget p1, v0, Ll/᩻ܳܿ;->ۧ:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {p0, v1}, Ll/֡ܳܿ;->ۧ(Z)V

    .line 235
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    new-instance v1, Ll/ۘܿܿ;

    invoke-direct {v1, p0, v0}, Ll/ۘܿܿ;-><init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    new-instance v1, Ll/ᩴܿܿ;

    invoke-direct {v1, p0, v0}, Ll/ᩴܿܿ;-><init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    new-instance v1, Ll/᩵ܿܿ;

    invoke-direct {v1, p0, v0}, Ll/᩵ܿܿ;-><init>(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static synthetic ۧ(Ll/֡ܳܿ;Ll/᩻ܳܿ;)V
    .locals 3

    .line 245
    iget v0, p1, Ll/᩻ܳܿ;->ۧ:I

    if-nez v0, :cond_0

    return-void

    .line 248
    :cond_0
    iget v0, p1, Ll/᩻ܳܿ;->ܳ:I

    new-instance v1, Ll/֨ܿܿ;

    invoke-direct {v1, p1}, Ll/֨ܿܿ;-><init>(Ll/᩻ܳܿ;)V

    new-instance p1, Ll/᩹ܶ᩷;

    const/4 v2, 0x1

    invoke-direct {p1, v2, p0}, Ll/᩹ܶ᩷;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f1205ed

    invoke-direct {p0, v2, v0, v1, p1}, Ll/֡ܳܿ;->֫(IILl/֫ۛ;Ljava/lang/Runnable;)V

    return-void
.end method

.method private ۧ(Z)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_1

    .line 192
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    cmpl-float p1, p1, v0

    if-eqz p1, :cond_2

    .line 193
    :cond_0
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 194
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 195
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 196
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 197
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 198
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    .line 201
    :cond_1
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result p1

    cmpl-float p1, p1, v0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 202
    :cond_3
    :goto_0
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 203
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 204
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 205
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 206
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 207
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֡ܳܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    return p0
.end method

.method private ۨ()V
    .locals 5

    .line 505
    iget-boolean v0, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 506
    invoke-virtual {p0, v1}, Ll/֡ܳܿ;->֫(Z)V

    .line 508
    :cond_0
    invoke-static {}, Ll/۠ܳܿ;->ܽ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 509
    iget-object v2, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v0, v3, :cond_2

    .line 510
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܳܿ;

    .line 511
    iget-object v1, v1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    goto :goto_0

    .line 513
    :cond_1
    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {v0}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ܽ()V

    return-void

    .line 516
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-le v0, v3, :cond_3

    .line 517
    new-instance v3, Ll/᩻ܳܿ;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, p0, v4}, Ll/᩻ܳܿ;-><init>(Ll/֡ܳܿ;I)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 519
    :cond_3
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 0
    invoke-static {v2, v1}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_2

    .line 522
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ܳܿ;

    .line 523
    iget-object v3, v3, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {v3}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    goto :goto_3

    .line 525
    :cond_5
    iget-object v2, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    if-eqz v2, :cond_8

    .line 526
    invoke-virtual {v2}, Ll/֡ܰۧ;->ܽ()I

    move-result v2

    .line 528
    iget-object v3, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    new-instance v4, Ll/᩵ܳܿ;

    invoke-direct {v4, p0}, Ll/᩵ܳܿ;-><init>(Ll/֡ܳܿ;)V

    invoke-virtual {v3, v4}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    if-ltz v2, :cond_6

    if-ge v2, v0, :cond_6

    .line 530
    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->ᩳ(I)V

    goto :goto_4

    :cond_6
    if-ne v2, v0, :cond_7

    .line 532
    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 534
    :cond_7
    :goto_4
    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    new-instance v1, Ll/᩷ۛ᩻;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/᩷ۛ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_8
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/֡ܳܿ;)Lcom/google/android/material/tabs/TabLayout;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/֡ܳܿ;)Ll/ۘܳܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ܳܿ;->ܺۧ:Ll/ۘܳܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/֡ܳܿ;)Ll/ۚۡ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ܳܿ;->ۘۧ:Ll/ۚۡ֫;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/֡ܳܿ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ᩳ(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0xd

    new-array v0, v0, [F

    .line 793
    fill-array-data v0, :array_0

    const-string v1, "translationX"

    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-wide/16 v0, 0x258

    .line 794
    invoke-virtual {p0, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    .line 795
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        -0x3e380000    # -25.0f
        0x0
        0x41c80000    # 25.0f
        0x0
        -0x3e900000    # -15.0f
        0x0
        0x41700000    # 15.0f
        0x0
        -0x3f600000    # -5.0f
        0x0
        0x40a00000    # 5.0f
        0x0
    .end array-data
.end method

.method private ᩺()V
    .locals 4

    const/4 v0, 0x0

    .line 448
    :goto_0
    iget-object v1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 449
    iget-object v1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 451
    iget-object v1, v1, Lcom/google/android/material/tabs/TabLayout$Tab;->view:Lcom/google/android/material/tabs/TabLayout$TabView;

    const v2, 0x7f0a05a0

    .line 452
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 453
    iget-object v2, p0, Ll/֡ܳܿ;->᩵ۧ:Ll/᩹ܿܿ;

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/֡ܳܿ;)Ll/ۜۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 101
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d0056

    .line 102
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a58

    .line 103
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 104
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 105
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 106
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 107
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/۠ۘ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/۠ۘ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    new-instance p1, Ll/ۘܳܿ;

    invoke-direct {p1, p0}, Ll/ۘܳܿ;-><init>(Ll/֡ܳܿ;)V

    iput-object p1, p0, Ll/֡ܳܿ;->ܺۧ:Ll/ۘܳܿ;

    .line 110
    invoke-direct {p0}, Ll/֡ܳܿ;->ۨ()V

    const p1, 0x7f0a015c

    .line 112
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->ܳۧ:Landroid/view/View;

    const p1, 0x7f0a0324

    .line 113
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->ۡۧ:Landroid/view/View;

    const p1, 0x7f0a059f

    .line 114
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->ᩴۧ:Landroid/view/View;

    const p1, 0x7f0a0321

    .line 115
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    const p1, 0x7f0a0322

    .line 116
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    const p1, 0x7f0a0323

    .line 117
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    .line 118
    iget-object p1, p0, Ll/֡ܳܿ;->ܳۧ:Landroid/view/View;

    new-instance v0, Ll/ۘۢ᩷;

    invoke-direct {v0, v1, p0}, Ll/ۘۢ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a05a0

    .line 120
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    iput-object p1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    const p1, 0x7f0a0685

    .line 121
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۜۡۡ;

    iput-object p1, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    .line 122
    new-instance v0, Ll/᩵ܳܿ;

    invoke-direct {v0, p0}, Ll/᩵ܳܿ;-><init>(Ll/֡ܳܿ;)V

    invoke-virtual {p1, v0}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    .line 123
    iget-object p1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    new-instance v0, Ll/ۙܿܿ;

    invoke-direct {v0, p0}, Ll/ۙܿܿ;-><init>(Ll/֡ܳܿ;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 139
    iget-object p1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Ll/֡ܰۧ;)V

    .line 140
    iget-object p1, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getTabTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setTabIconTint(Landroid/content/res/ColorStateList;)V

    .line 142
    iget-object p1, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pageIndex"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 144
    new-instance p1, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    invoke-direct {p1, p0}, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Object;)V

    .line 1557
    new-instance v0, Ll/۬᩵᩷;

    new-instance v1, Ll/᩹᩵᩷;

    invoke-direct {v1, p1}, Ll/᩹᩵᩷;-><init>(Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;)V

    .line 824
    invoke-static {p0, v1}, Ll/۠᩹᩷;->֫(Ll/᩻ܽ;Ll/᩵᩹᩷;)Ll/ۚ᩹᩷;

    move-result-object p1

    .line 1691
    invoke-direct {v0, p1}, Ll/ܶ᩵᩷;-><init>(Ll/ۚ᩹᩷;)V

    .line 144
    iput-object v0, p0, Ll/֡ܳܿ;->᩻ۧ:Ll/۬᩵᩷;

    .line 172
    invoke-virtual {p0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object p1

    new-instance v0, Ll/ۗܿܿ;

    invoke-direct {v0, p0}, Ll/ۗܿܿ;-><init>(Ll/֡ܳܿ;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {p1, v0}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 3

    .line 540
    invoke-virtual {p0}, Ll/֨ܿ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0020

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a0327

    .line 541
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0a03ae

    .line 542
    invoke-interface {p1, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 543
    new-instance v1, Ll/᩶ܿܿ;

    invoke-direct {v1, p0, v0}, Ll/᩶ܿܿ;-><init>(Ll/֡ܳܿ;Landroid/view/MenuItem;)V

    iget-object v2, p0, Ll/֡ܳܿ;->ۘۧ:Ll/ۚۡ֫;

    invoke-virtual {v2, p0, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 544
    new-instance v1, Ll/ᩳܿܿ;

    invoke-direct {v1, p0, v0, p1}, Ll/ᩳܿܿ;-><init>(Ll/֡ܳܿ;Landroid/view/MenuItem;Landroid/view/MenuItem;)V

    iget-object p1, p0, Ll/֡ܳܿ;->ܿۧ:Ll/ۚۡ֫;

    invoke-virtual {p1, p0, v1}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    .line 553
    invoke-direct {p0, p1}, Ll/֡ܳܿ;->֫(Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 186
    invoke-super {p0, p1}, Ll/֨ܿ;->onPostCreate(Landroid/os/Bundle;)V

    .line 187
    invoke-direct {p0}, Ll/֡ܳܿ;->᩺()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 7

    .line 286
    iget-boolean v0, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 287
    iput-boolean v0, p0, Ll/֡ܳܿ;->ᩳۧ:Z

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v2, p0, Ll/֡ܳܿ;->ܿۧ:Ll/ۚۡ֫;

    invoke-virtual {v2, v1}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    .line 288
    iget-object v1, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    invoke-virtual {v1}, Ll/֡ܰۧ;->ܽ()I

    move-result v1

    iget-object v2, p0, Ll/֡ܳܿ;->ۖۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ܳܿ;

    if-eqz p1, :cond_0

    .line 290
    iget-object p1, v1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 292
    :cond_0
    iget-object p1, p0, Ll/֡ܳܿ;->ۚۧ:Ll/ۜۡۡ;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ll/ۜۡۡ;->֫(Z)V

    .line 294
    new-instance p1, Ll/֡᩵ܳ;

    iget-object v2, p0, Ll/֡ܳܿ;->֡ۧ:Lcom/google/android/material/tabs/TabLayout;

    new-array v3, v1, [Landroid/view/View;

    aput-object v2, v3, v0

    invoke-direct {p1, v3}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    .line 295
    new-instance v2, Ll/֡᩵ܳ;

    iget-object v3, p0, Ll/֡ܳܿ;->ۡۧ:Landroid/view/View;

    iget-object v4, p0, Ll/֡ܳܿ;->ܳۧ:Landroid/view/View;

    iget-object v5, p0, Ll/֡ܳܿ;->ᩴۧ:Landroid/view/View;

    const/4 v6, 0x3

    new-array v6, v6, [Landroid/view/View;

    aput-object v3, v6, v0

    aput-object v4, v6, v1

    const/4 v3, 0x2

    aput-object v5, v6, v3

    invoke-direct {v2, v6}, Ll/֡᩵ܳ;-><init>([Landroid/view/View;)V

    const/4 v4, 0x0

    .line 296
    invoke-virtual {p1, v4}, Ll/֡᩵ܳ;->setAlpha(F)V

    .line 297
    invoke-virtual {p1, v0}, Ll/֡᩵ܳ;->֫(I)V

    .line 298
    iput-boolean v1, v2, Ll/֡᩵ܳ;->֫:Z

    new-array v0, v3, [F

    .line 299
    fill-array-data v0, :array_0

    const-string v1, "alpha"

    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v4, 0xc8

    invoke-virtual {p1, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    new-array p1, v3, [F

    .line 300
    fill-array-data p1, :array_1

    invoke-static {v2, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 302
    iget-object p1, p0, Ll/֡ܳܿ;->ۜۧ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 303
    iget-object p1, p0, Ll/֡ܳܿ;->ۢۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 304
    iget-object p1, p0, Ll/֡ܳܿ;->᩷ۧ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "TextFunctionBarEditActivity"

    return-object v0
.end method
