.class public final Ll/᩵᩷ۧ;
.super Ljava/lang/Object;
.source "B8HW"

# interfaces
.implements Ll/᩵ۢۧ;


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 40
    iput-object v0, p0, Ll/᩵᩷ۧ;->֫:[B

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢᩴ֫;IZ)I
    .locals 0

    .line 168
    invoke-virtual {p0, p1, p2, p3}, Ll/᩵᩷ۧ;->ۧ(Ll/ۢᩴ֫;IZ)I

    move-result p1

    return p1
.end method

.method public final ֫(ILl/ᩳ֨֫;)V
    .locals 0

    .line 65
    invoke-virtual {p2, p1}, Ll/ᩳ֨֫;->ܳ(I)V

    return-void
.end method

.method public final synthetic ֫(J)V
    .locals 0

    return-void
.end method

.method public final ֫(JIIILl/ᩴۢۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/۠ᩴ֫;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;II)V
    .locals 0

    .line 65
    invoke-virtual {p1, p2}, Ll/ᩳ֨֫;->ܳ(I)V

    return-void
.end method

.method public final ۧ(Ll/ۢᩴ֫;IZ)I
    .locals 2

    .line 52
    iget-object v0, p0, Ll/᩵᩷ۧ;->֫:[B

    array-length v1, v0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 v1, 0x0

    .line 53
    invoke-interface {p1, v0, v1, p2}, Ll/ۢᩴ֫;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    .line 58
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    return p1
.end method
