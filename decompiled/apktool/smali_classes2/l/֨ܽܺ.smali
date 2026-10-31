.class public final Ll/֨ܽܺ;
.super Ljava/lang/Object;
.source "IBH2"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/۫ܺܺ;

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIILl/۫ܺܺ;)V
    .locals 0

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_2

    if-lt p2, p1, :cond_1

    if-ltz p3, :cond_0

    .line 272
    iput p1, p0, Ll/֨ܽܺ;->ᩳ:I

    .line 273
    iput p2, p0, Ll/֨ܽܺ;->֫:I

    .line 274
    iput p3, p0, Ll/֨ܽܺ;->ܽ:I

    .line 275
    iput-object p4, p0, Ll/֨ܽܺ;->ۧ:Ll/۫ܺܺ;

    return-void

    .line 269
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "handlerPc < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 265
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "endPc < startPc"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 261
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startPc < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 294
    iget v0, p0, Ll/֨ܽܺ;->֫:I

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 324
    iget v0, p0, Ll/֨ܽܺ;->ᩳ:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/֨ܽܺ;->֫:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/۫ܺܺ;
    .locals 1

    .line 313
    iget-object v0, p0, Ll/֨ܽܺ;->ۧ:Ll/۫ܺܺ;

    if-eqz v0, :cond_0

    return-object v0

    .line 314
    :cond_0
    sget-object v0, Ll/۫ܺܺ;->ܿ֫:Ll/۫ܺܺ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 303
    iget v0, p0, Ll/֨ܽܺ;->ܽ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 284
    iget v0, p0, Ll/֨ܽܺ;->ᩳ:I

    return v0
.end method
