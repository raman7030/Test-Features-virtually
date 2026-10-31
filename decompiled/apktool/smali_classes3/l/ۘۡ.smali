.class public final Ll/ۘۡ;
.super Ll/ܰܺ;
.source "N5WL"


# instance fields
.field public final synthetic ۨ:Ll/ۗۡ;

.field public final synthetic ᩺:Ll/᩸ۡ;


# direct methods
.method public constructor <init>(Ll/ۗۡ;Ll/ۗۡ;Ll/᩸ۡ;)V
    .locals 0

    .line 271
    iput-object p1, p0, Ll/ۘۡ;->ۨ:Ll/ۗۡ;

    iput-object p3, p0, Ll/ۘۡ;->᩺:Ll/᩸ۡ;

    invoke-direct {p0, p2}, Ll/ܰܺ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ᩷;
    .locals 1

    .line 274
    iget-object v0, p0, Ll/ۘۡ;->᩺:Ll/᩸ۡ;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ۘۡ;->ۨ:Ll/ۗۡ;

    invoke-virtual {v0}, Ll/ۗۡ;->֫()Ll/ۙۡ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۙۡ;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 280
    invoke-virtual {v0}, Ll/ۗۡ;->ۧ()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
