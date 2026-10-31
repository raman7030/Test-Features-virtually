.class public final Ll/᩵᩵᩵;
.super Ljava/lang/Object;
.source "LA1Y"

# interfaces
.implements Ll/۠ۡ᩵;


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(II[B)I
    .locals 3

    .line 88
    invoke-static {p1, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v0, p1, 0x4

    .line 90
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v0

    iput v0, p0, Ll/᩵᩵᩵;->᩸:I

    add-int/lit8 v0, p1, 0x8

    .line 92
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v0, p1, 0xc

    .line 94
    invoke-static {v0, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 v0, p1, 0x10

    add-int/lit8 p2, p2, -0x10

    .line 96
    new-array v1, p2, [B

    if-lez p2, :cond_0

    const/4 v2, 0x0

    .line 98
    invoke-static {p3, v0, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    sub-int/2addr v0, p1

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 52
    iget v0, p0, Ll/᩵᩵᩵;->᩸:I

    return v0
.end method
