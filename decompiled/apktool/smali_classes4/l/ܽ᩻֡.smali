.class public final Ll/ܽ᩻֡;
.super Ll/۬ۜ֡;
.source "0AR3"


# instance fields
.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;I)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    .line 18
    iput p2, p0, Ll/ܽ᩻֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 37
    iget v0, p0, Ll/ܽ᩻֡;->ܽ:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final ֫(II)Z
    .locals 0

    .line 32
    iget p2, p0, Ll/ܽ᩻֡;->ܽ:I

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Ll/᩻᩷֡;
    .locals 2

    .line 70
    new-instance v0, Ll/᩻᩷֡;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-direct {v0, v1}, Ll/᩻᩷֡;-><init>([I)V

    .line 71
    iget v1, p0, Ll/ܽ᩻֡;->ܽ:I

    invoke-virtual {v0, v1}, Ll/᩻᩷֡;->֫(I)V

    return-object v0
.end method
