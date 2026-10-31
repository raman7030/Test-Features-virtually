.class public final Ll/ܽۘۖ;
.super Ljava/lang/Object;
.source "R9OM"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILl/ۡ֡ۖ;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    iput-object p2, p0, Ll/ܽۘۖ;->ۧ:Ljava/lang/Object;

    .line 196
    iput p1, p0, Ll/ܽۘۖ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 206
    instance-of v0, p1, Ll/ܽۘۖ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 209
    :cond_0
    check-cast p1, Ll/ܽۘۖ;

    .line 210
    iget-object v0, p0, Ll/ܽۘۖ;->ۧ:Ljava/lang/Object;

    iget-object v2, p1, Ll/ܽۘۖ;->ۧ:Ljava/lang/Object;

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ܽۘۖ;->֫:I

    iget p1, p1, Ll/ܽۘۖ;->֫:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 201
    iget-object v0, p0, Ll/ܽۘۖ;->ۧ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0xffff

    mul-int v0, v0, v1

    iget v1, p0, Ll/ܽۘۖ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method
