.class public final Ll/֨ۨܳ;
.super Ll/֫ۜܳ;
.source "51Z1"


# static fields
.field public static ۗ:J


# direct methods
.method public static ֫(Lbin/mt/plus/Main;)V
    .locals 5

    .line 48
    invoke-static {}, Ll/᩷ܶܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Ll/֨ۨܳ;->ۗ:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const v0, 0x7f0d0020

    .line 34
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    .line 35
    new-instance v1, Landroid/widget/PopupWindow;

    const/4 v2, -0x1

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 36
    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v3, -0x78000000

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const v2, 0x7f0a0172

    .line 37
    invoke-virtual {p0, v2}, Ll/֨ܿ;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    const p0, 0x7f0a0443

    .line 39
    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/high16 v2, 0x43480000    # 200.0f

    .line 40
    invoke-static {v2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [F

    .line 41
    fill-array-data v3, :array_0

    .line 315
    new-instance v4, Ll/ۨ֡ۘ;

    invoke-direct {v4}, Ll/ۨ֡ۘ;-><init>()V

    .line 316
    invoke-virtual {v4, v3}, Ll/ۨ֡ۘ;->֫([F)V

    .line 42
    new-instance v3, Ll/᩻ܶܳ;

    invoke-direct {v3, v2, p0}, Ll/᩻ܶܳ;-><init>(ILandroid/view/View;)V

    invoke-virtual {v4, v3}, Ll/ۨ֡ۘ;->֫(Ll/᩻ܶܳ;)V

    const-wide/16 v2, 0x4b0

    .line 59
    invoke-virtual {v4, v2, v3}, Ll/ۨ֡ۘ;->ۧ(J)Ll/ۨ֡ۘ;

    .line 60
    invoke-virtual {v4}, Ll/ۨ֡ۘ;->ܿ()V

    .line 61
    invoke-virtual {v4}, Ll/ۨ֡ۘ;->ܳ()V

    .line 63
    new-instance p0, Ll/ۜܶܳ;

    invoke-direct {p0, v4}, Ll/ۜܶܳ;-><init>(Ll/ۨ֡ۘ;)V

    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    const p0, 0x7f0a05f1

    .line 64
    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    new-instance v0, Ll/ܶ᩻ᩳ;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ll/ܶ᩻ᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Ll/֨ۨܳ;->ۗ:J

    return-void

    :cond_0
    const p0, 0x7f120030

    .line 52
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 6

    const-string v0, "local"

    .line 24
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    .line 28
    invoke-interface {v2}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object v1

    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x5

    if-gt v2, v3, :cond_1

    .line 32
    invoke-virtual {v1}, Ll/ۢۘܳ;->ܺ()I

    move-result v1

    invoke-static {v0, v1}, Ll/ۡᩴܳ;->ۧ(Ljava/util/ArrayList;I)V

    .line 33
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1}, Ll/֨ۨܳ;->֫(Lbin/mt/plus/Main;)V

    return-void

    .line 35
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    const v3, 0x7f1205ae

    .line 36
    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const v3, 0x7f12002e

    invoke-static {v3, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v3, Ll/ۚۨܳ;

    invoke-direct {v3, v0, v1, p1}, Ll/ۚۨܳ;-><init>(Ljava/util/ArrayList;Ll/ۢۘܳ;Ll/ۖۢܳ;)V

    const p1, 0x7f12070a

    .line 38
    invoke-virtual {v2, p1, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 42
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 43
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
