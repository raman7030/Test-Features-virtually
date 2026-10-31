.class public final Ll/᩺۬᩵;
.super Ll/ᩳ۫᩵;
.source "HAYQ"


# instance fields
.field public final ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    .line 1316
    invoke-direct {p0, v0}, Ll/ᩳ۫᩵;-><init>(Z)V

    const/4 v1, 0x0

    .line 1317
    invoke-virtual {p0, v1}, Ll/ᩳ۫᩵;->֫(Ll/ۤ۬᩵;)V

    .line 1336
    invoke-virtual {p0}, Ll/ᩳ۫᩵;->᩷()Ll/ܺۗ᩵;

    move-result-object v2

    instance-of v3, v2, Ll/ۖۗ᩵;

    if-eqz v3, :cond_0

    check-cast v2, Ll/ۖۗ᩵;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v2

    .line 1338
    :goto_1
    invoke-virtual {v2}, Ll/ᩳ۫᩵;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_3

    .line 1339
    :cond_1
    invoke-virtual {v2}, Ll/ᩳ۫᩵;->᩷()Ll/ܺۗ᩵;

    move-result-object v2

    instance-of v3, v2, Ll/ۖۗ᩵;

    if-eqz v3, :cond_2

    check-cast v2, Ll/ۖۗ᩵;

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ll/۟۬᩵;->ۘ()Ll/ᩳ۫᩵;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 1329
    :goto_3
    iput-boolean v0, p0, Ll/᩺۬᩵;->᩹:Z

    return-void
.end method


# virtual methods
.method public final ܿ()Z
    .locals 1

    .line 1329
    iget-boolean v0, p0, Ll/᩺۬᩵;->᩹:Z

    return v0
.end method
