.class public final Ll/ۤܽܺ;
.super Ljava/lang/Object;
.source "2BF0"


# instance fields
.field public final ֫:I

.field public final ۧ:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-ltz p2, :cond_0

    .line 168
    iput p1, p0, Ll/ۤܽܺ;->ۧ:I

    .line 169
    iput p2, p0, Ll/ۤܽܺ;->֫:I

    return-void

    .line 165
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "lineNumber < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 161
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "startPc < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 187
    iget v0, p0, Ll/ۤܽܺ;->֫:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 178
    iget v0, p0, Ll/ۤܽܺ;->ۧ:I

    return v0
.end method
