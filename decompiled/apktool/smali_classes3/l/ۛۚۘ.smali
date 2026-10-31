.class public abstract Ll/ۛۚۘ;
.super Ll/۠ۚۘ;
.source "J8A0"


# instance fields
.field public final ۧ:J

.field public final ܽ:Ljava/lang/Long;

.field public final ᩳ:Ll/᩻֨ۘ;


# direct methods
.method public constructor <init>(Ll/᩻֨ۘ;Ljava/lang/Long;)V
    .locals 2

    .line 71
    sget-object v0, Ll/۫ۚۘ;->ۨ֫:Ll/۫ۚۘ;

    invoke-virtual {v0}, Ll/۫ۚۘ;->֫()S

    move-result v0

    invoke-direct {p0, v0}, Ll/۠ۚۘ;-><init>(S)V

    .line 72
    iput-object p1, p0, Ll/ۛۚۘ;->ᩳ:Ll/᩻֨ۘ;

    const-wide v0, 0xffffffffL

    .line 73
    iput-wide v0, p0, Ll/ۛۚۘ;->ۧ:J

    .line 74
    iput-object p2, p0, Ll/ۛۚۘ;->ܽ:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۖۚۘ;)V
    .locals 3

    const/4 v0, 0x0

    .line 68
    iget-object v1, p0, Ll/ۛۚۘ;->ᩳ:Ll/᩻֨ۘ;

    if-nez v1, :cond_0

    .line 81
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p1}, Ll/ۖۚۘ;->֫()V

    .line 44
    invoke-virtual {v1, p1}, Ll/ۜ֨ۘ;->ܽ(Ll/ۖۚۘ;)V

    .line 45
    invoke-virtual {v1, p1}, Ll/ۜ֨ۘ;->ۧ(Ll/ۖۚۘ;)V

    .line 46
    invoke-virtual {v1, p1}, Ll/ۜ֨ۘ;->֫(Ll/ۖۚۘ;)V

    .line 84
    sget-object v1, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 147
    :goto_0
    sget-object v1, Ll/ܰۚۘ;->ۙ:Ll/ܰۚۘ;

    .line 89
    invoke-virtual {v1}, Ll/ܰۚۘ;->֫()I

    move-result v2

    invoke-virtual {p1, v2}, Ll/ۖۚۘ;->ۧ(I)V

    .line 92
    invoke-virtual {v1}, Ll/ܰۚۘ;->֫()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ۧ(I)V

    .line 95
    invoke-virtual {p1}, Ll/ۖۚۘ;->֫()V

    .line 99
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    .line 81
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    .line 106
    iget-wide v1, p0, Ll/ۛۚۘ;->ۧ:J

    long-to-int v2, v1

    .line 91
    invoke-virtual {p1, v2}, Ll/ۖۚۘ;->ۧ(I)V

    .line 68
    iget-object v1, p0, Ll/ۛۚۘ;->ܽ:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 81
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    return-void

    .line 72
    :cond_1
    invoke-virtual {p1}, Ll/ۖۚۘ;->֫()V

    .line 112
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 91
    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ۧ(I)V

    return-void
.end method
