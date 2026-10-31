.class public final Ll/֫᩻֡;
.super Ll/۬ۜ֡;
.source "FART"


# instance fields
.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;II)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    .line 20
    iput p2, p0, Ll/֫᩻֡;->ᩳ:I

    .line 21
    iput p3, p0, Ll/֫᩻֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "action_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/֫᩻֡;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֫᩻֡;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public final ֫(II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
