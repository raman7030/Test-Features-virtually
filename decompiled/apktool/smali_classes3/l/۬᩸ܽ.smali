.class public final Ll/۬᩸ܽ;
.super Ljava/lang/Object;
.source "D77D"


# instance fields
.field public final ֫:Ll/ܰܶܽ;

.field public final ۧ:Ll/ܰܶܽ;


# direct methods
.method public constructor <init>(Ll/ܰܶܽ;Ll/ܰܶܽ;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    iput-object p1, p0, Ll/۬᩸ܽ;->֫:Ll/ܰܶܽ;

    .line 226
    iput-object p2, p0, Ll/۬᩸ܽ;->ۧ:Ll/ܰܶܽ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 234
    :cond_0
    instance-of v1, p1, Ll/۬᩸ܽ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Ll/۬᩸ܽ;

    .line 237
    iget-object v1, p0, Ll/۬᩸ܽ;->֫:Ll/ܰܶܽ;

    iget-object v3, p1, Ll/۬᩸ܽ;->֫:Ll/ܰܶܽ;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/۬᩸ܽ;->ۧ:Ll/ܰܶܽ;

    iget-object p1, p1, Ll/۬᩸ܽ;->ۧ:Ll/ܰܶܽ;

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 242
    iget-object v0, p0, Ll/۬᩸ܽ;->֫:Ll/ܰܶܽ;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/۬᩸ܽ;->ۧ:Ll/ܰܶܽ;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
