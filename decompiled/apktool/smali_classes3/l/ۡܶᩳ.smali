.class public final Ll/ۡܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ۗ:Ll/᩹ܶᩳ;

.field public final ۙ:Ll/۠ۨᩳ;

.field public final ۬:Ll/۫ۨᩳ;

.field public final ᩶:Ll/ۙܶᩳ;

.field public final ᩸:Ll/۟᩺ᩳ;

.field public final ᩹:Ll/ܳ᩸ᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/۠ۨᩳ;Ll/ۙܶᩳ;Ll/ܳ᩸ᩳ;)V
    .locals 0

    .line 2321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡܶᩳ;->ۗ:Ll/᩹ܶᩳ;

    .line 2322
    iput-object p2, p0, Ll/ۡܶᩳ;->۬:Ll/۫ۨᩳ;

    .line 2323
    iput-object p3, p0, Ll/ۡܶᩳ;->᩸:Ll/۟᩺ᩳ;

    .line 2324
    iput-object p4, p0, Ll/ۡܶᩳ;->ۙ:Ll/۠ۨᩳ;

    .line 2325
    iput-object p5, p0, Ll/ۡܶᩳ;->᩶:Ll/ۙܶᩳ;

    .line 2326
    iput-object p6, p0, Ll/ۡܶᩳ;->᩹:Ll/ܳ᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 2355
    iget-object v0, p0, Ll/ۡܶᩳ;->᩹:Ll/ܳ᩸ᩳ;

    invoke-virtual {v0}, Ll/ܳ᩸ᩳ;->close()V

    return-void
.end method

.method public final ֫()Z
    .locals 6

    .line 2337
    invoke-virtual {p0}, Ll/ۡܶᩳ;->۫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_3

    .line 2338
    :cond_0
    iget-object v0, p0, Ll/ۡܶᩳ;->᩹:Ll/ܳ᩸ᩳ;

    iget-object v2, p0, Ll/ۡܶᩳ;->ۗ:Ll/᩹ܶᩳ;

    invoke-static {v2}, Ll/᩹ܶᩳ;->᩵(Ll/᩹ܶᩳ;)Ll/᩺ܶᩳ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ܳ᩸ᩳ;->֫(Ll/᩺ܶᩳ;)Z

    move-result v0

    iget-object v3, p0, Ll/ۡܶᩳ;->۬:Ll/۫ۨᩳ;

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۡܶᩳ;->ۙ:Ll/۠ۨᩳ;

    invoke-virtual {v3, v0}, Ll/۫ۨᩳ;->֫(Ll/۠ۨᩳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 2339
    :goto_0
    invoke-virtual {p0}, Ll/ۡܶᩳ;->۫()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 2340
    invoke-virtual {v3}, Ll/۫ۨᩳ;->֡ۧ()Z

    move-result v3

    invoke-virtual {v2, v3}, Ll/᩹ܶᩳ;->ᩳ(Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Ll/֫ۘᩳ;->֫(Z)Z

    .line 2341
    iget-object v3, v2, Ll/֫ۘᩳ;->᩹:Ll/ۢۘᩳ;

    invoke-virtual {v2}, Ll/֫ۘᩳ;->᩷()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v2}, Ll/᩹ܶᩳ;->ܳ(Ll/᩹ܶᩳ;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v5, 0x1

    :goto_2
    invoke-virtual {v3, v5}, Ll/ۢۘᩳ;->ۡ(Z)V

    .line 2342
    invoke-static {v2}, Ll/᩹ܶᩳ;->᩹(Ll/᩹ܶᩳ;)V

    :cond_4
    if-eqz v0, :cond_5

    .line 2344
    invoke-virtual {p0}, Ll/ۡܶᩳ;->۫()Z

    move-result v0

    if-eqz v0, :cond_5

    return v4

    :cond_5
    :goto_3
    return v1
.end method

.method public final ۫()Z
    .locals 3

    .line 2331
    iget-object v0, p0, Ll/ۡܶᩳ;->ۗ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ܺ(Ll/᩹ܶᩳ;)Ll/᩵ᩴᩳ;

    move-result-object v1

    if-nez v1, :cond_0

    iget-boolean v1, v0, Ll/᩹ܶᩳ;->۬֫:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iget-object v2, p0, Ll/ۡܶᩳ;->۬:Ll/۫ۨᩳ;

    if-ne v1, v2, :cond_0

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/ۡܶᩳ;->᩸:Ll/۟᩺ᩳ;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Ll/ۡܶᩳ;->᩶:Ll/ۙܶᩳ;

    .line 63
    iget-object v1, v1, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 2332
    invoke-virtual {v0}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v0

    .line 63
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 2332
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
