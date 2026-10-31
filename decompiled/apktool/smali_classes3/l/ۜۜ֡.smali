.class public final Ll/ۜۜ֡;
.super Ll/۬ۜ֡;
.source "0ASK"


# instance fields
.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;II)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    .line 17
    iput p2, p0, Ll/ۜۜ֡;->ܽ:I

    .line 18
    iput p3, p0, Ll/ۜۜ֡;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Ll/ۜۜ֡;->ܽ:I

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\'..\'"

    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۜۜ֡;->ᩳ:I

    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ֫(II)Z
    .locals 0

    .line 32
    iget p2, p0, Ll/ۜۜ֡;->ܽ:I

    if-lt p1, p2, :cond_0

    iget p2, p0, Ll/ۜۜ֡;->ᩳ:I

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ()Ll/᩻᩷֡;
    .locals 3

    .line 77
    new-instance v0, Ll/᩻᩷֡;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-direct {v0, v1}, Ll/᩻᩷֡;-><init>([I)V

    .line 78
    iget v1, p0, Ll/ۜۜ֡;->ܽ:I

    iget v2, p0, Ll/ۜۜ֡;->ᩳ:I

    invoke-virtual {v0, v1, v2}, Ll/᩻᩷֡;->֫(II)V

    return-object v0
.end method
