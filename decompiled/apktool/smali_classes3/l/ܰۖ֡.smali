.class public final Ll/ܰۖ֡;
.super Ljava/lang/Object;
.source "UAIG"


# instance fields
.field public final ֫:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, Ll/ܰۖ֡;->֫:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 217
    instance-of v0, p1, Ll/ܰۖ֡;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܰۖ֡;

    iget-object p1, p1, Ll/ܰۖ֡;->֫:Ljava/lang/Object;

    iget-object v0, p0, Ll/ܰۖ֡;->֫:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ܰۖ֡;->֫:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 234
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IdentityWrapper [instance="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    iget-object v1, p0, Ll/ܰۖ֡;->֫:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 237
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
