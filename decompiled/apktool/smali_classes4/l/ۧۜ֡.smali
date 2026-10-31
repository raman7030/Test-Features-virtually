.class public final Ll/ۧۜ֡;
.super Ll/۟ܳ֡;
.source "FASF"


# instance fields
.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;IIZ)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    .line 22
    iput p2, p0, Ll/ۧۜ֡;->ܿ:I

    .line 23
    iput p3, p0, Ll/ۧۜ֡;->ᩳ:I

    .line 24
    iput-boolean p4, p0, Ll/ۧۜ֡;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "pred_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۧۜ֡;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧۜ֡;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final ֫(II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
