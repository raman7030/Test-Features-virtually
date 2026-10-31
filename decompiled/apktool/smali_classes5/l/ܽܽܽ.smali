.class public final Ll/ܽܽܽ;
.super Ll/᩸᩸᩵;
.source "MAMP"

# interfaces
.implements Ll/᩵᩹᩵;


# annotations
.annotation runtime Ll/֡᩸᩵;
    c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1"
    f = "WindowInfoTrackerImpl.kt"
    l = {
        0x36,
        0x37
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic ۗ:Landroid/app/Activity;

.field public ۛ:I

.field public ۤ:Ll/۟۫᩵;

.field public final synthetic ۨ:Ll/ᩳܽܽ;

.field public ۫:Ll/۬ۤ;

.field public synthetic ۬:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ᩳܽܽ;Landroid/app/Activity;Ll/ۨܶ᩵;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܽܽܽ;->ۨ:Ll/ᩳܽܽ;

    iput-object p2, p0, Ll/ܽܽܽ;->ۗ:Landroid/app/Activity;

    invoke-direct {p0, p3}, Ll/᩸᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/᩵ۤ᩵;

    .line 4
    check-cast p2, Ll/ۨܶ᩵;

    .line 0
    invoke-virtual {p0, p1, p2}, Ll/ܽܽܽ;->֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;

    move-result-object p1

    check-cast p1, Ll/ܽܽܽ;

    sget-object p2, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p1, p2}, Ll/ܽܽܽ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;
    .locals 3

    .line 0
    new-instance v0, Ll/ܽܽܽ;

    iget-object v1, p0, Ll/ܽܽܽ;->ۨ:Ll/ᩳܽܽ;

    iget-object v2, p0, Ll/ܽܽܽ;->ۗ:Landroid/app/Activity;

    invoke-direct {v0, v1, v2, p2}, Ll/ܽܽܽ;-><init>(Ll/ᩳܽܽ;Landroid/app/Activity;Ll/ۨܶ᩵;)V

    iput-object p1, v0, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 57
    sget-object v0, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    .line 46
    iget v1, p0, Ll/ܽܽܽ;->ۛ:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ܽܽܽ;->ۨ:Ll/ᩳܽܽ;

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ll/ܽܽܽ;->ۤ:Ll/۟۫᩵;

    iget-object v5, p0, Ll/ܽܽܽ;->۫:Ll/۬ۤ;

    iget-object v6, p0, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    check-cast v6, Ll/᩵ۤ᩵;

    :try_start_0
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object p1, v6

    move-object v6, p0

    :goto_0
    move-object v9, v5

    move-object v5, v1

    move-object v1, v9

    goto :goto_1

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_1
    iget-object v1, p0, Ll/ܽܽܽ;->ۤ:Ll/۟۫᩵;

    iget-object v5, p0, Ll/ܽܽܽ;->۫:Ll/۬ۤ;

    iget-object v6, p0, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    check-cast v6, Ll/᩵ۤ᩵;

    :try_start_1
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v7, v6

    move-object v6, p0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    check-cast p1, Ll/᩵ۤ᩵;

    .line 49
    sget-object v1, Ll/ܰ۫᩵;->᩶:Ll/ܰ۫᩵;

    .line 795
    new-instance v5, Ll/᩺۫᩵;

    const/16 v6, 0xa

    invoke-direct {v5, v6, v1}, Ll/᩺۫᩵;-><init>(ILl/ܰ۫᩵;)V

    .line 51
    new-instance v1, Ll/ۧܽܽ;

    invoke-direct {v1, v5}, Ll/ۧܽܽ;-><init>(Ll/᩺۫᩵;)V

    .line 52
    invoke-static {v4}, Ll/ᩳܽܽ;->֫(Ll/ᩳܽܽ;)Ll/ۨۧܽ;

    move-result-object v6

    new-instance v7, Ll/᩺᩹ۧ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    iget-object v8, p0, Ll/ܽܽܽ;->ۗ:Landroid/app/Activity;

    invoke-interface {v6, v8, v7, v1}, Ll/ۨۧܽ;->֫(Landroid/app/Activity;Ll/᩺᩹ۧ;Ll/ۧܽܽ;)V

    .line 54
    :try_start_2
    invoke-virtual {v5}, Ll/۫۫᩵;->ۜ()Ll/۟۫᩵;

    move-result-object v5

    move-object v6, p0

    :goto_1
    iput-object p1, v6, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    iput-object v1, v6, Ll/ܽܽܽ;->۫:Ll/۬ۤ;

    iput-object v5, v6, Ll/ܽܽܽ;->ۤ:Ll/۟۫᩵;

    iput v3, v6, Ll/ܽܽܽ;->ۛ:I

    invoke-interface {v5, v6}, Ll/۟۫᩵;->֫(Ll/ۨܶ᩵;)Ljava/lang/Object;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v7, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v9, v7

    move-object v7, p1

    move-object p1, v9

    move-object v10, v5

    move-object v5, v1

    move-object v1, v10

    :goto_2
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-interface {v1}, Ll/۟۫᩵;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿܽܽ;

    .line 55
    iput-object v7, v6, Ll/ܽܽܽ;->۬:Ljava/lang/Object;

    iput-object v5, v6, Ll/ܽܽܽ;->۫:Ll/۬ۤ;

    iput-object v1, v6, Ll/ܽܽܽ;->ۤ:Ll/۟۫᩵;

    iput v2, v6, Ll/ܽܽܽ;->ۛ:I

    invoke-interface {v7, p1, v6}, Ll/᩵ۤ᩵;->֫(Ljava/lang/Object;Ll/ᩴ᩸᩵;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v0, :cond_4

    :goto_3
    return-object v0

    :cond_4
    move-object p1, v7

    goto :goto_0

    .line 58
    :cond_5
    invoke-static {v4}, Ll/ᩳܽܽ;->֫(Ll/ᩳܽܽ;)Ll/ۨۧܽ;

    move-result-object p1

    invoke-interface {p1, v5}, Ll/ۨۧܽ;->֫(Ll/۬ۤ;)V

    .line 60
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v5, v1

    .line 58
    :goto_4
    invoke-static {v4}, Ll/ᩳܽܽ;->֫(Ll/ᩳܽܽ;)Ll/ۨۧܽ;

    move-result-object v0

    invoke-interface {v0, v5}, Ll/ۨۧܽ;->֫(Ll/۬ۤ;)V

    throw p1
.end method
