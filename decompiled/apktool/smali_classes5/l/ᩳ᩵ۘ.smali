.class public abstract Ll/ᩳ᩵ۘ;
.super Ll/᩻᩵ۘ;
.source "K8DW"


# instance fields
.field public ۜ:Ll/ܶᩴۘ;

.field public ܳ:Ll/۠ᩴۘ;

.field public ᩻:Ll/۠ᩴۘ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 33
    invoke-direct {p0}, Ll/᩻᩵ۘ;-><init>()V

    .line 34
    new-instance v0, Ll/۠ᩴۘ;

    const-string v1, "InputA"

    invoke-direct {v0, v1}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 35
    new-instance v0, Ll/۠ᩴۘ;

    const-string v1, "InputB"

    invoke-direct {v0, v1}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 36
    new-instance v0, Ll/ܶᩴۘ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v0, p0, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    invoke-virtual {p0, v0}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    return-void
.end method
