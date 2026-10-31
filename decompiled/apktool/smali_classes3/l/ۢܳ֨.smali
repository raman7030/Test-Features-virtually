.class public final Ll/ۢܳ֨;
.super Ll/ۡܳ֨;
.source "34PY"


# instance fields
.field public final ֫:Ll/ۡܳ֨;

.field public final ۧ:Ll/᩷ܳ֨;


# direct methods
.method public constructor <init>(Ll/᩷ܳ֨;Ll/ۡܳ֨;)V
    .locals 0

    .line 356
    invoke-direct {p0}, Ll/ۡܳ֨;-><init>()V

    .line 357
    iput-object p1, p0, Ll/ۢܳ֨;->ۧ:Ll/᩷ܳ֨;

    .line 358
    iput-object p2, p0, Ll/ۢܳ֨;->֫:Ll/ۡܳ֨;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 367
    iget-object v0, p0, Ll/ۢܳ֨;->ۧ:Ll/᩷ܳ֨;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    iget-object v2, p0, Ll/ۢܳ֨;->֫:Ll/ۡܳ֨;

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 373
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "? super "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 375
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 371
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "? extends "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, "?"

    return-object v0
.end method
