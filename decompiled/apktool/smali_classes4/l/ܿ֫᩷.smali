.class public final Ll/ܿ֫᩷;
.super Ljava/lang/Object;
.source "U9LB"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OpticalInsetChunk{layoutBoundsLeft="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܿ֫᩷;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", layoutBoundsTop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֫᩷;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", layoutBoundsRight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֫᩷;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", layoutBoundsBottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֫᩷;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()[B
    .locals 2

    .line 23
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    .line 24
    iget v1, p0, Ll/ܿ֫᩷;->ۧ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 25
    iget v1, p0, Ll/ܿ֫᩷;->ᩳ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 26
    iget v1, p0, Ll/ܿ֫᩷;->ܽ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 27
    iget v1, p0, Ll/ܿ֫᩷;->֫:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 29
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    return-object v0
.end method
