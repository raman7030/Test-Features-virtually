.class public final Ll/ۤ۫ۧ;
.super Ll/᩸᩸᩵;
.source "6AM8"

# interfaces
.implements Ll/᩵᩹᩵;


# annotations
.annotation runtime Ll/֡᩸᩵;
    c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1"
    f = "FoldingFeatureObserver.kt"
    l = {
        0x61
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic ۗ:Landroid/app/Activity;

.field public final synthetic ۫:Ll/ۛ۫ۧ;

.field public ۬:I


# direct methods
.method public constructor <init>(Ll/ۛ۫ۧ;Landroid/app/Activity;Ll/ۨܶ᩵;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۤ۫ۧ;->۫:Ll/ۛ۫ۧ;

    iput-object p2, p0, Ll/ۤ۫ۧ;->ۗ:Landroid/app/Activity;

    invoke-direct {p0, p3}, Ll/᩸᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ll/ۨۗ᩵;

    .line 4
    check-cast p2, Ll/ۨܶ᩵;

    .line 0
    invoke-virtual {p0, p1, p2}, Ll/ۤ۫ۧ;->֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;

    move-result-object p1

    check-cast p1, Ll/ۤ۫ۧ;

    sget-object p2, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    invoke-virtual {p1, p2}, Ll/ۤ۫ۧ;->ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۨܶ᩵;)Ll/ۨܶ᩵;
    .locals 2

    .line 0
    new-instance p1, Ll/ۤ۫ۧ;

    iget-object v0, p0, Ll/ۤ۫ۧ;->۫:Ll/ۛ۫ۧ;

    iget-object v1, p0, Ll/ۤ۫ۧ;->ۗ:Landroid/app/Activity;

    invoke-direct {p1, v0, v1, p2}, Ll/ۤ۫ۧ;-><init>(Ll/ۛ۫ۧ;Landroid/app/Activity;Ll/ۨܶ᩵;)V

    return-object p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 57
    sget-object v0, Ll/ۜ᩸᩵;->᩶:Ll/ۜ᩸᩵;

    .line 70
    iget v1, p0, Ll/ۤ۫ۧ;->۬:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_1
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    .line 71
    iget-object p1, p0, Ll/ۤ۫ۧ;->۫:Ll/ۛ۫ۧ;

    invoke-static {p1}, Ll/ۛ۫ۧ;->ۧ(Ll/ۛ۫ۧ;)Ll/۟ۧܽ;

    move-result-object v1

    iget-object v3, p0, Ll/ۤ۫ۧ;->ۗ:Landroid/app/Activity;

    check-cast v1, Ll/ᩳܽܽ;

    invoke-virtual {v1, v3}, Ll/ᩳܽܽ;->֫(Landroid/app/Activity;)Ll/ᩴۤ᩵;

    move-result-object v1

    .line 106
    new-instance v3, Ll/۫۫ۧ;

    invoke-direct {v3, v1, p1}, Ll/۫۫ۧ;-><init>(Ll/ᩴۤ᩵;Ll/ۛ۫ۧ;)V

    .line 73
    invoke-static {v3}, Ll/֡ۤ᩵;->֫(Ll/۫۫ۧ;)Ll/ᩴۤ᩵;

    move-result-object v1

    .line 97
    new-instance v3, Ll/ۙ۫ۧ;

    invoke-direct {v3, p1}, Ll/ۙ۫ۧ;-><init>(Ll/ۛ۫ۧ;)V

    iput v2, p0, Ll/ۤ۫ۧ;->۬:I

    invoke-interface {v1, v3, p0}, Ll/ᩴۤ᩵;->֫(Ll/᩵ۤ᩵;Ll/ۨܶ᩵;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 77
    :cond_2
    :goto_0
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
