.class public final Ll/֫ۜ֡;
.super Ll/۟ܳ֡;
.source "HASO"


# instance fields
.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/᩺ܳ֡;I)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ll/۬ۜ֡;-><init>(Ll/᩺ܳ֡;)V

    .line 18
    iput p2, p0, Ll/֫ۜ֡;->ܽ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/֫ۜ֡;->ܽ:I

    const-string v2, " >= _p"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    const/16 v0, 0xa

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
