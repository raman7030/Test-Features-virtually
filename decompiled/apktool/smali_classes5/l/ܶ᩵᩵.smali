.class public final Ll/ܶ᩵᩵;
.super Ljava/lang/Object;
.source "M9VY"

# interfaces
.implements Ll/᩸᩵᩵;
.implements Ll/᩹᩵᩵;


# instance fields
.field public ᩸:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ܶ᩵᩵;->᩸:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(II[B)I
    .locals 4

    .line 113
    invoke-static {p1, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result p2

    add-int/lit8 v0, p1, 0x2

    .line 116
    new-array v1, p2, [I

    iput-object v1, p0, Ll/ܶ᩵᩵;->᩸:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 118
    iget-object v2, p0, Ll/ܶ᩵᩵;->᩸:[I

    invoke-static {v0, p3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p1

    return v0
.end method

.method public final ֫(I[B)I
    .locals 6

    .line 92
    iget-object v0, p0, Ll/ܶ᩵᩵;->᩸:[I

    if-eqz v0, :cond_0

    array-length v0, v0

    int-to-long v0, v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 95
    iget-object v1, p0, Ll/ܶ᩵᩵;->᩸:[I

    if-eqz v1, :cond_1

    .line 96
    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    int-to-long v4, v4

    .line 97
    invoke-static {v4, v5, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    sub-int/2addr v0, p1

    return v0
.end method

.method public final ܽ()[I
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܶ᩵᩵;->᩸:[I

    return-object v0
.end method
