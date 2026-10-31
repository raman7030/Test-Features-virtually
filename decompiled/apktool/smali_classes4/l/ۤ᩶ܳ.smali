.class public final Ll/ۤ᩶ܳ;
.super Ll/۬ۗܿ;
.source "X5LN"


# instance fields
.field public final synthetic ֫֫:Ll/֡ۚۢ;

.field public final synthetic ۟:Ll/ܳۙܳ;

.field public final synthetic ۧ֫:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/ܳۙܳ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 0

    .line 430
    iput-object p1, p0, Ll/ۤ᩶ܳ;->۟:Ll/ܳۙܳ;

    iput-object p3, p0, Ll/ۤ᩶ܳ;->֫֫:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ۤ᩶ܳ;->ۧ֫:Landroid/view/View;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 433
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 435
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 440
    :cond_0
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v0, :cond_3

    .line 448
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 449
    :goto_0
    invoke-static {}, Ll/ܳۙܳ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v1, v0, :cond_1

    .line 450
    invoke-static {}, Ll/ܳۙܳ;->ܽ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {}, Ll/ܳۙܳ;->ܽ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 452
    :cond_1
    invoke-static {}, Ll/ܳۙܳ;->֫()V

    .line 453
    iget-object v0, p0, Ll/ۤ᩶ܳ;->֫֫:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 454
    invoke-static {}, Ll/ܳۙܳ;->ܽ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/ۤ᩶ܳ;->۟:Ll/ܳۙܳ;

    if-eqz v0, :cond_2

    .line 455
    invoke-static {v1}, Ll/ܳۙܳ;->ܳ(Ll/ܳۙܳ;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 457
    :cond_2
    iget-object v0, p0, Ll/ۤ᩶ܳ;->ۧ֫:Landroid/view/View;

    invoke-static {v1, v0}, Ll/ܳۙܳ;->ۧ(Ll/ܳۙܳ;Landroid/view/View;)V

    return-void

    .line 442
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0}, Ljava/lang/NumberFormatException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    const v0, 0x7f120b48

    .line 445
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
