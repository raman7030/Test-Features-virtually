.class public final Ll/ۚ᩵᩵;
.super Ljava/lang/Object;
.source "B9ZO"

# interfaces
.implements Ll/᩹ۡ᩵;


# instance fields
.field public ۙ:I

.field public ᩶:[I

.field public ᩸:I

.field public ᩹:[B


# direct methods
.method public constructor <init>(I[BI[I)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput p1, p0, Ll/ۚ᩵᩵;->᩸:I

    .line 44
    iput-object p2, p0, Ll/ۚ᩵᩵;->᩹:[B

    .line 45
    iput p3, p0, Ll/ۚ᩵᩵;->ۙ:I

    .line 46
    iput-object p4, p0, Ll/ۚ᩵᩵;->᩶:[I

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۚ᩵᩵;->᩶:[I

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x18

    return v0
.end method

.method public final ֫(I[B)I
    .locals 6

    .line 59
    iget v0, p0, Ll/ۚ᩵᩵;->᩸:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 v0, p1, 0x4

    const/16 v1, 0x10

    .line 62
    iget-object v2, p0, Ll/ۚ᩵᩵;->᩹:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, p1, 0x14

    .line 65
    iget v1, p0, Ll/ۚ᩵᩵;->ۙ:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x16

    .line 67
    iget-object v1, p0, Ll/ۚ᩵᩵;->᩶:[I

    array-length v2, v1

    int-to-long v4, v2

    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x18

    .line 70
    array-length v2, v1

    :goto_0
    if-ge v3, v2, :cond_0

    aget v4, v1, v3

    int-to-long v4, v4

    .line 71
    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    return v0
.end method
