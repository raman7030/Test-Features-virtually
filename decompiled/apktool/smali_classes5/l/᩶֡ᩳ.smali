.class public final Ll/᩶֡ᩳ;
.super Ljava/lang/Object;
.source "1AOV"

# interfaces
.implements Ll/ۖܰۧ;


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public final onPageSelected(I)V
    .locals 3

    .line 72
    invoke-static {}, Ll/ۙ֡ᩳ;->ܽ()I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 73
    invoke-static {p1}, Ll/ۙ֡ᩳ;->֫(I)V

    .line 75
    new-instance p1, Ll/᩹֡ᩳ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const-string v0, "tfcgi"

    const-wide/16 v1, 0x1388

    invoke-static {v0, v1, v2, p1}, Ll/֫ۨۡ;->֫(Ljava/lang/Object;JLjava/lang/Runnable;)V

    :cond_0
    return-void
.end method
