.class public final Ll/ۤܿ;
.super Ljava/lang/Object;
.source "422Y"

# interfaces
.implements Ll/ܽۨ;


# instance fields
.field public final synthetic ᩸:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;)V
    .locals 0

    .line 997
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܿ;->᩸:Ll/ۚܳ;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 5

    .line 1001
    invoke-virtual {p2}, Ll/᩸ܰ;->ۢ()I

    move-result v0

    .line 1002
    iget-object v1, p0, Ll/ۤܿ;->᩸:Ll/ۚܳ;

    invoke-virtual {v1, p2}, Ll/ۚܳ;->֫(Ll/᩸ܰ;)I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 1006
    invoke-virtual {p2}, Ll/᩸ܰ;->ۜ()I

    move-result v0

    .line 1008
    invoke-virtual {p2}, Ll/᩸ܰ;->᩷()I

    move-result v2

    .line 1009
    invoke-virtual {p2}, Ll/᩸ܰ;->᩻()I

    move-result v3

    .line 339
    new-instance v4, Ll/᩻ܰ;

    invoke-direct {v4, p2}, Ll/᩻ܰ;-><init>(Ll/᩸ܰ;)V

    .line 340
    invoke-static {v0, v1, v2, v3}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object p2

    invoke-virtual {v4, p2}, Ll/᩻ܰ;->ۧ(Ll/ۧ۬;)V

    .line 341
    invoke-virtual {v4}, Ll/᩻ܰ;->֫()Ll/᩸ܰ;

    move-result-object p2

    .line 1013
    :cond_0
    invoke-static {p1, p2}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method
