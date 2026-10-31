.class public Ll/ۡۖ;
.super Ll/۫ܺ;
.source "Q8VZ"


# instance fields
.field public final ۫֫:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p3}, Ll/۫ܺ;-><init>(Landroid/content/Context;Z)V

    .line 14
    iput p2, p0, Ll/ۡۖ;->۫֫:I

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 1

    .line 19
    iget v0, p0, Ll/ۡۖ;->۫֫:I

    if-lez v0, :cond_0

    if-le p2, v0, :cond_0

    move p2, v0

    .line 22
    :cond_0
    invoke-super {p0, p1, p2}, Ll/۫ܺ;->֫(II)I

    move-result p1

    return p1
.end method
