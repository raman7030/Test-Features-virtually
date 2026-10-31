.class public final Ll/᩹۠ۜ;
.super Ljava/lang/Object;
.source "B74J"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:J

.field public ܿ:J

.field public ᩳ:Ljava/lang/String;


# virtual methods
.method public final ֫()Z
    .locals 5

    .line 408
    iget-wide v0, p0, Ll/᩹۠ۜ;->ܽ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    iget-object v0, p0, Ll/᩹۠ۜ;->֫:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩹۠ۜ;->ᩳ:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-wide v0, p0, Ll/᩹۠ۜ;->ܿ:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
