.class public final Ll/᩷ۧۘ;
.super Ljava/lang/Object;
.source "P9F1"


# instance fields
.field public ֫:Ll/᩹ۛۖ;

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;IIIZ)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/᩷ۧۘ;->֫:Ll/᩹ۛۖ;

    const/high16 p1, 0x10000

    if-eqz p5, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p2

    :goto_0
    iput p2, p0, Ll/᩷ۧۘ;->ܽ:I

    if-eqz p5, :cond_1

    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result p3

    :goto_1
    iput p3, p0, Ll/᩷ۧۘ;->ۧ:I

    if-eqz p5, :cond_2

    goto :goto_2

    .line 35
    :cond_2
    invoke-static {p4, p1}, Ljava/lang/Math;->max(II)I

    move-result p4

    :goto_2
    iput p4, p0, Ll/᩷ۧۘ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NegotiatedProtocol{dialect="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    iget-object v1, p0, Ll/᩷ۧۘ;->֫:Ll/᩹ۛۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxTransactSize="

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩷ۧۘ;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxReadSize="

    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩷ۧۘ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxWriteSize="

    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩷ۧۘ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩹ۛۖ;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/᩷ۧۘ;->֫:Ll/᩹ۛۖ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 47
    iget v0, p0, Ll/᩷ۧۘ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 43
    iget v0, p0, Ll/᩷ۧۘ;->ܽ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 51
    iget v0, p0, Ll/᩷ۧۘ;->ᩳ:I

    return v0
.end method
