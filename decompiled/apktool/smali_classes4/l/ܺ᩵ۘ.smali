.class public final Ll/ܺ᩵ۘ;
.super Ljava/lang/Object;
.source "58CT"


# instance fields
.field public ֫:Ll/ۧᩴۘ;

.field public ۧ:Ll/ۧ᩵ۘ;


# direct methods
.method public constructor <init>(Ll/۟ۘۘ;)V
    .locals 6

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ll/ۧ᩵ۘ;

    .line 29
    invoke-direct {v0}, Ll/᩻᩵ۘ;-><init>()V

    .line 33
    new-instance v1, Ll/۠ᩴۘ;

    const-string v2, "Input"

    const-wide/16 v3, 0x0

    const/4 v5, 0x2

    .line 59
    invoke-direct {v1, v5, v2, v3, v4}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 33
    iput-object v1, v0, Ll/ۧ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 41
    iput-object v0, p0, Ll/ܺ᩵ۘ;->ۧ:Ll/ۧ᩵ۘ;

    .line 45
    invoke-virtual {p1, v0}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 47
    new-instance v1, Ll/ۧᩴۘ;

    invoke-direct {v1}, Ll/ۧᩴۘ;-><init>()V

    iput-object v1, p0, Ll/ܺ᩵ۘ;->֫:Ll/ۧᩴۘ;

    .line 48
    invoke-virtual {p1}, Ll/۟ۘۘ;->ܳ()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v1, p1}, Ll/ۧᩴۘ;->֫(Z)V

    .line 50
    invoke-virtual {v1}, Ll/ۧᩴۘ;->֫()V

    .line 51
    invoke-virtual {v0, v1}, Ll/ۧ᩵ۘ;->֫(Ll/ۧᩴۘ;)V

    .line 52
    invoke-virtual {v0}, Ll/᩻᩵ۘ;->ۜ()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ܺ᩵ۘ;->֫:Ll/ۧᩴۘ;

    invoke-virtual {v0}, Ll/ۧᩴۘ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ֫([DII)I
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܺ᩵ۘ;->֫:Ll/ۧᩴۘ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۧᩴۘ;->֫([DII)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/۠ᩴۘ;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ܺ᩵ۘ;->ۧ:Ll/ۧ᩵ۘ;

    iget-object v0, v0, Ll/ۧ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    return-object v0
.end method
