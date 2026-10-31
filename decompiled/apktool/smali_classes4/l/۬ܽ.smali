.class public final Ll/۬ܽ;
.super Ljava/lang/Object;
.source "K234"

# interfaces
.implements Ll/ܿۡ֫;
.implements Ll/ۙۧ;


# instance fields
.field public final synthetic ۙ:Ll/ۨܽ;

.field public final ᩶:Ll/֡ܽ;

.field public ᩸:Ll/ۙۧ;

.field public final ᩹:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/ۨܽ;Ll/۟ۢ֫;Ll/֡ܽ;)V
    .locals 1

    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    .line 0
    invoke-static {p3, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 315
    iput-object p1, p0, Ll/۬ܽ;->ۙ:Ll/ۨܽ;

    .line 316
    iput-object p2, p0, Ll/۬ܽ;->᩹:Ll/۟ۢ֫;

    .line 317
    iput-object p3, p0, Ll/۬ܽ;->᩶:Ll/֡ܽ;

    .line 322
    invoke-virtual {p2, p0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 340
    iget-object v0, p0, Ll/۬ܽ;->᩹:Ll/۟ۢ֫;

    invoke-virtual {v0, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 341
    iget-object v0, p0, Ll/۬ܽ;->᩶:Ll/֡ܽ;

    invoke-virtual {v0, p0}, Ll/֡ܽ;->ۧ(Ll/ۙۧ;)V

    .line 342
    iget-object v0, p0, Ll/۬ܽ;->᩸:Ll/ۙۧ;

    if-eqz v0, :cond_0

    check-cast v0, Ll/۫ܽ;

    invoke-virtual {v0}, Ll/۫ܽ;->cancel()V

    :cond_0
    const/4 v0, 0x0

    .line 343
    iput-object v0, p0, Ll/۬ܽ;->᩸:Ll/ۙۧ;

    return-void
.end method

.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 0

    .line 329
    sget-object p1, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_0

    .line 330
    iget-object p1, p0, Ll/۬ܽ;->ۙ:Ll/ۨܽ;

    iget-object p2, p0, Ll/۬ܽ;->᩶:Ll/֡ܽ;

    invoke-virtual {p1, p2}, Ll/ۨܽ;->֫(Ll/֡ܽ;)Ll/ۙۧ;

    move-result-object p1

    iput-object p1, p0, Ll/۬ܽ;->᩸:Ll/ۙۧ;

    return-void

    .line 331
    :cond_0
    sget-object p1, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_1

    .line 333
    iget-object p1, p0, Ll/۬ܽ;->᩸:Ll/ۙۧ;

    if-eqz p1, :cond_2

    check-cast p1, Ll/۫ܽ;

    invoke-virtual {p1}, Ll/۫ܽ;->cancel()V

    return-void

    .line 334
    :cond_1
    sget-object p1, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    if-ne p2, p1, :cond_2

    .line 335
    invoke-virtual {p0}, Ll/۬ܽ;->cancel()V

    :cond_2
    return-void
.end method
