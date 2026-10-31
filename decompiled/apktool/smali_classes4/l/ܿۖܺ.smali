.class public final Ll/ܿۖܺ;
.super Ll/ۗۘۢ;
.source "2BGD"


# instance fields
.field public final synthetic ۧ:Ll/᩸ۡܺ;

.field public final synthetic ܽ:Ll/᩸ۡܺ;


# direct methods
.method public constructor <init>(Ll/ܳۖܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V
    .locals 0

    const/4 p1, 0x1

    .line 29
    invoke-direct {p0, p1}, Ll/ۗۘۢ;-><init>(I)V

    .line 379
    iput-object p2, p0, Ll/ܿۖܺ;->ܽ:Ll/᩸ۡܺ;

    iput-object p3, p0, Ll/ܿۖܺ;->ۧ:Ll/᩸ۡܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 2

    .line 387
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    iget-object v1, p0, Ll/ܿۖܺ;->ܽ:Ll/᩸ۡܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 388
    iget-object v0, p0, Ll/ܿۖܺ;->ۧ:Ll/᩸ۡܺ;

    .line 389
    invoke-virtual {p1}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object p1

    .line 388
    invoke-virtual {v0, p1}, Ll/᩸ۡܺ;->֫(Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    :cond_0
    return-object p1
.end method
