.class public final Ll/ۙ᩹ᩳ;
.super Ljava/lang/Object;
.source "C8OA"

# interfaces
.implements Ll/ۤ۬ᩳ;


# instance fields
.field public final ᩶:Ll/᩷۠ᩴ;

.field public ᩸:Z

.field public final ᩹:Ll/۬۬ᩳ;


# direct methods
.method public constructor <init>(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 170
    iput-object p1, p0, Ll/ۙ᩹ᩳ;->᩶:Ll/᩷۠ᩴ;

    .line 171
    invoke-static {p1}, Ll/ۗ۬ᩳ;->֫(Ll/᩷۠ᩴ;)Ll/۬۬ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 180
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩶:Ll/᩷۠ᩴ;

    iget-boolean v1, p0, Ll/ۙ᩹ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 181
    iput-boolean v1, p0, Ll/ۙ᩹ᩳ;->᩸:Z

    .line 182
    :try_start_0
    iget-object v1, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v1}, Ll/۬۬ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Ll/ܿ۠ᩴ;->deleteIfExists(Ll/᩷۠ᩴ;)Z

    throw v1
.end method

.method public final length()J
    .locals 2

    .line 175
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v0}, Ll/۬۬ᩳ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final truncate(J)V
    .locals 1

    .line 176
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v0, p1, p2}, Ll/۬۬ᩳ;->truncate(J)V

    return-void
.end method

.method public final ֫(JI[B)V
    .locals 1

    .line 174
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۬۬ᩳ;->֫(JI[B)V

    return-void
.end method

.method public final ֫(J[BII)V
    .locals 6

    .line 173
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    move-wide v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/۬۬ᩳ;->֫(J[BII)V

    return-void
.end method

.method public final ۘ֫()V
    .locals 1

    .line 178
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v0}, Ll/۬۬ᩳ;->ۘ֫()V

    return-void
.end method

.method public final ܺ()V
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۙ᩹ᩳ;->᩹:Ll/۬۬ᩳ;

    invoke-virtual {v0}, Ll/۬۬ᩳ;->ܺ()V

    return-void
.end method
