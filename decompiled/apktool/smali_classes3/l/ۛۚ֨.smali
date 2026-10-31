.class public final Ll/ۛۚ֨;
.super Ll/᩶ۚ֨;
.source "34PY"


# instance fields
.field public ۧ֫:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method


# virtual methods
.method public final ֫()Ll/֡᩹۠;
    .locals 1

    .line 1288
    sget-object v0, Ll/֡᩹۠;->ܰ:Ll/֡᩹۠;

    return-object v0
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1258
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to an intersection type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/᩶ۚ֨;
    .locals 1

    .line 1258
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Cannot add metadata to an intersection type"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public final ۫֫()Ll/ۖܶ۠;
    .locals 2

    .line 1281
    iget-boolean v0, p0, Ll/ۛۚ֨;->ۧ֫:Z

    if-eqz v0, :cond_0

    .line 1282
    iget-object v0, p0, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    return-object v0

    .line 1272
    :cond_0
    iget-object v0, p0, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object v1, p0, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    invoke-virtual {v0, v1}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method
