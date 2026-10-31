.class public final Ll/۫᩹ܽ;
.super Ll/ܿ۬ܿ;
.source "P676"


# instance fields
.field public final synthetic ᩳ:Ll/᩷᩶ܽ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;Z)V
    .locals 0

    .line 410
    iput-object p1, p0, Ll/۫᩹ܽ;->ᩳ:Ll/᩷᩶ܽ;

    invoke-direct {p0, p2, p3}, Ll/ܿ۬ܿ;-><init>(Ll/ۗܺ᩷;Z)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 429
    iget-object v0, p0, Ll/۫᩹ܽ;->ᩳ:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v1, Ll/ᩳ᩶ܽ;->֫֫:Z

    const v1, 0x7f120a00

    .line 430
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    .line 431
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method

.method public final ֫(Ll/ᩳ۬ܿ;Ljava/lang/String;)V
    .locals 8

    .line 414
    iget-object v0, p0, Ll/۫᩹ܽ;->ᩳ:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    const/4 v2, 0x1

    iput-boolean v2, v1, Ll/ᩳ᩶ܽ;->֫֫:Z

    .line 415
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    const/4 v3, 0x0

    iput v3, v1, Ll/ᩳ᩶ܽ;->ܰ:I

    .line 416
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    array-length v4, v4

    new-array v4, v4, [I

    iput-object v4, v1, Ll/ᩳ᩶ܽ;->᩺:[I

    const/4 v1, 0x0

    .line 417
    :goto_0
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    array-length v4, v4

    if-ge v1, v4, :cond_1

    .line 418
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    aget-object v4, v4, v1

    invoke-virtual {v4}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v4

    .line 419
    invoke-virtual {p1, v4}, Ll/ᩳ۬ܿ;->֫(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 420
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v4

    iget-object v4, v4, Ll/ᩳ᩶ܽ;->᩺:[I

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v5

    iget v6, v5, Ll/ᩳ᩶ܽ;->ܰ:I

    add-int/lit8 v7, v6, 0x1

    iput v7, v5, Ll/ᩳ᩶ܽ;->ܰ:I

    aput v1, v4, v6

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v2, [Ljava/lang/Object;

    aput-object p2, p1, v3

    const p2, 0x7f1203de

    .line 423
    invoke-virtual {v0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 424
    invoke-static {v0}, Ll/᩷᩶ܽ;->ۧ(Ll/᩷᩶ܽ;)Ll/۫᩵ۘ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    return-void
.end method
