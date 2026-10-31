.class public final Ll/ᩴۖۡ;
.super Ll/۬ۗܿ;
.source "W5L3"


# instance fields
.field public final synthetic ۟:Ll/᩵ۖۡ;


# direct methods
.method public constructor <init>(Ll/᩵ۖۡ;Ll/ۗܺ᩷;)V
    .locals 1

    .line 518
    iput-object p1, p0, Ll/ᩴۖۡ;->۟:Ll/᩵ۖۡ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    const/16 p1, 0xa

    .line 520
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const p1, 0x7f12017a

    invoke-static {p1, p2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->ܽ(Ljava/lang/String;)V

    .line 521
    invoke-virtual {p0}, Ll/۬ۗܿ;->۠()V

    .line 522
    sget p1, Ll/᩹֡᩷;->ۜ֫:I

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->᩷(I)V

    .line 523
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۜ()Landroid/widget/TextView;

    move-result-object p1

    const/16 p2, 0x8

    .line 524
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 525
    new-instance p2, Ll/ۖۖۡ;

    invoke-direct {p2, p0, p1}, Ll/ۖۖۡ;-><init>(Ll/ᩴۖۡ;Landroid/widget/TextView;)V

    .line 539
    new-instance p1, Ll/ۘۖۡ;

    invoke-direct {p1, p2}, Ll/ۘۖۡ;-><init>(Ll/ۖۖۡ;)V

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->֫(Landroid/text/TextWatcher;)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 551
    iget-object v0, p0, Ll/ᩴۖۡ;->۟:Ll/᩵ۖۡ;

    iget-object v0, v0, Ll/᩵ۖۡ;->ۤ:Ll/ۚۖۡ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 552
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 553
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 558
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz v1, :cond_2

    .line 566
    :goto_0
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ۖۡ;->ܿ()I

    move-result v2

    if-le v2, v1, :cond_1

    .line 567
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ۖۡ;->ܽ()V

    goto :goto_0

    .line 569
    :cond_1
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ᩳ()V

    .line 570
    invoke-static {v0}, Ll/ۚۖۡ;->᩷(Ll/ۚۖۡ;)V

    .line 571
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܿ()V

    .line 572
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 560
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-direct {v0}, Ljava/lang/NumberFormatException;-><init>()V

    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    const v0, 0x7f120b48

    .line 563
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
