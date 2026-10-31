.class public final Ll/᩶֨᩵;
.super Ljava/lang/Object;
.source "T9X7"

# interfaces
.implements Ll/᩹ۡ᩵;


# instance fields
.field public ᩶:I

.field public ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>([BII)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/᩶֨᩵;->᩸:[B

    .line 41
    iput p2, p0, Ll/᩶֨᩵;->᩶:I

    .line 42
    iput p3, p0, Ll/᩶֨᩵;->᩹:I

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 53
    iget v0, p0, Ll/᩶֨᩵;->᩹:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 3

    .line 64
    iget-object v0, p0, Ll/᩶֨᩵;->᩸:[B

    iget v1, p0, Ll/᩶֨᩵;->᩶:I

    iget v2, p0, Ll/᩶֨᩵;->᩹:I

    invoke-static {v0, v1, p2, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v2
.end method
