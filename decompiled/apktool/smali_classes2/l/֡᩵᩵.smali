.class public final Ll/֡᩵᩵;
.super Ljava/lang/Object;
.source "Y9YW"

# interfaces
.implements Ll/۠ۡ᩵;


# virtual methods
.method public final ֫(II[B)I
    .locals 2

    const/16 v0, 0x18

    if-lt p2, v0, :cond_0

    new-array p2, v0, [B

    const/4 v1, 0x0

    .line 55
    invoke-static {p3, p1, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p2, p1, 0x18

    .line 58
    invoke-static {p2, p3}, Ll/֫֡᩵;->ۧ(I[B)I

    add-int/lit8 p2, p1, 0x1c

    sub-int/2addr p2, p1

    return p2

    .line 51
    :cond_0
    new-instance p1, Ll/ᩳۖ᩵;

    const-string p2, "Invalid resume key"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1
.end method
