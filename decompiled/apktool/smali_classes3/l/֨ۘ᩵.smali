.class public final Ll/֨ۘ᩵;
.super Ll/ۨۖ᩵;
.source "69WS"


# instance fields
.field public ֡֫:I

.field public ۚ֫:I


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;)V
    .locals 1

    const/16 v0, 0x12

    .line 37
    invoke-direct {p0, p1, v0}, Ll/ۨۖ᩵;-><init>(Ll/֨ۡ᩵;B)V

    const/4 p1, 0x0

    .line 38
    iput p1, p0, Ll/֨ۘ᩵;->֡֫:I

    return-void
.end method


# virtual methods
.method public final ۡ֫()V
    .locals 1

    const/4 v0, 0x2

    .line 58
    iput v0, p0, Ll/֨ۘ᩵;->ۚ֫:I

    return-void
.end method

.method public final ۢ(I)V
    .locals 0

    .line 50
    iput p1, p0, Ll/֨ۘ᩵;->֡֫:I

    return-void
.end method

.method public final ۧ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ(I[B)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻(I[B)I
    .locals 3

    .line 78
    iget v0, p0, Ll/֨ۘ᩵;->֡֫:I

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x2

    .line 80
    iget v1, p0, Ll/֨ۘ᩵;->ۚ֫:I

    int-to-long v1, v1

    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v0, p1, 0x4

    const-wide/16 v1, 0x0

    .line 82
    invoke-static {v1, v2, v0, p2}, Ll/֫֡᩵;->ۧ(JI[B)V

    add-int/lit8 p2, p1, 0x8

    sub-int/2addr p2, p1

    return p2
.end method
