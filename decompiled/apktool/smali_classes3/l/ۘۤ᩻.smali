.class public final Ll/ۘۤ᩻;
.super Ll/۟ܶۡ;
.source "M6WW"


# instance fields
.field public final synthetic ۜ:Z

.field public ܳ:Ll/ܰۢۜ;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/ܶۤ᩻;


# direct methods
.method public constructor <init>(Ll/ܶۤ᩻;Ljava/lang/String;Z)V
    .locals 0

    .line 178
    iput-object p1, p0, Ll/ۘۤ᩻;->᩻:Ll/ܶۤ᩻;

    iput-object p2, p0, Ll/ۘۤ᩻;->᩷:Ljava/lang/String;

    iput-boolean p3, p0, Ll/ۘۤ᩻;->ۜ:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۘۤ᩻;)V
    .locals 0

    .line 183
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 197
    iget-object v0, p0, Ll/ۘۤ᩻;->᩻:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->᩻(Ll/ܶۤ᩻;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۘۤ᩻;->ܳ:Ll/ܰۢۜ;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ܰۢۜ;Z)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۘۤ᩻;->᩻:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->᩻(Ll/ܶۤ᩻;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of p1, p1, Ljava/io/IOException;

    if-eqz p1, :cond_0

    const p1, 0x7f12056e

    goto :goto_0

    :cond_0
    const p1, 0x7f120578

    :goto_0
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_1
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 183
    new-instance v0, Ll/ۖۤ᩻;

    invoke-direct {v0, p0}, Ll/ۖۤ᩻;-><init>(Ll/ۘۤ᩻;)V

    iget-object v1, p0, Ll/ۘۤ᩻;->᩻:Ll/ܶۤ᩻;

    invoke-static {v1, v0}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ۖۤ᩻;)V

    .line 184
    invoke-static {v1}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 189
    iget-object v0, p0, Ll/ۘۤ᩻;->᩷:Ljava/lang/String;

    invoke-static {v0}, Ll/᩸ۛ᩻;->ۧ(Ljava/lang/String;)Ll/ܰۢۜ;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۤ᩻;->ܳ:Ll/ܰۢۜ;

    .line 190
    iget-object v0, v0, Ll/ܰۢۜ;->ᩳ:Ll/ۜܺۜ;

    sget-object v1, Ll/ۜܺۜ;->᩶:Ll/ۜܺۜ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-boolean v1, p0, Ll/ۘۤ᩻;->ۜ:Z

    if-ne v0, v1, :cond_1

    return-void

    .line 191
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Selected rule target type has changed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()V
    .locals 2

    .line 208
    iget-object v0, p0, Ll/ۘۤ᩻;->᩻:Ll/ܶۤ᩻;

    invoke-static {v0}, Ll/ܶۤ᩻;->ܳ(Ll/ܶۤ᩻;)V

    .line 209
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    const/4 v1, 0x0

    .line 210
    invoke-static {v0, v1}, Ll/ܶۤ᩻;->֫(Ll/ܶۤ᩻;Ll/ۖۤ᩻;)V

    return-void
.end method
