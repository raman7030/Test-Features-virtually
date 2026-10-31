.class public final Ll/֡ۙ᩷;
.super Ll/ۧۙۧ;
.source "657B"


# instance fields
.field public final synthetic ֫:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Ll/֡ۙ᩷;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 109
    invoke-static {}, Ll/ܶۙ᩷;->ۢ֫()[I

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public final ֫(II)Z
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֡ۙ᩷;->֫:[I

    aget p1, v0, p1

    invoke-static {}, Ll/ܶۙ᩷;->ۢ֫()[I

    move-result-object v0

    aget p2, v0, p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 104
    iget-object v0, p0, Ll/֡ۙ᩷;->֫:[I

    array-length v0, v0

    return v0
.end method

.method public final ۧ(II)Z
    .locals 1

    .line 114
    iget-object v0, p0, Ll/֡ۙ᩷;->֫:[I

    aget p1, v0, p1

    invoke-static {}, Ll/ܶۙ᩷;->ۢ֫()[I

    move-result-object v0

    aget p2, v0, p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
