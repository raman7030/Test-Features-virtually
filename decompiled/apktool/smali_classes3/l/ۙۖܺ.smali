.class public final Ll/ۙۖܺ;
.super Ll/ۗۘۢ;
.source "JBI9"


# instance fields
.field public final synthetic ۧ:Ll/᩸ۡܺ;

.field public final synthetic ܽ:Ll/᩸ۡܺ;


# direct methods
.method public constructor <init>(Ll/ۗۖܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V
    .locals 0

    const/4 p1, 0x1

    .line 29
    invoke-direct {p0, p1}, Ll/ۗۘۢ;-><init>(I)V

    .line 114
    iput-object p2, p0, Ll/ۙۖܺ;->ܽ:Ll/᩸ۡܺ;

    iput-object p3, p0, Ll/ۙۖܺ;->ۧ:Ll/᩸ۡܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 2

    .line 124
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    iget-object v1, p0, Ll/ۙۖܺ;->ܽ:Ll/᩸ۡܺ;

    invoke-virtual {v1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 125
    iget-object p1, p0, Ll/ۙۖܺ;->ۧ:Ll/᩸ۡܺ;

    :cond_0
    return-object p1
.end method
