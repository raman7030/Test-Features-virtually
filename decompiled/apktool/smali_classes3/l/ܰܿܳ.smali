.class public final Ll/ܰܿܳ;
.super Ljava/lang/Object;
.source "A6LD"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:I

.field public final ᩳ:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܰܿܳ;->ᩳ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 80
    iget v0, p0, Ll/ܰܿܳ;->ܽ:I

    return v0
.end method

.method public final ֫(ILjava/lang/CharSequence;)V
    .locals 6

    .line 67
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/ܰܿܳ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const v3, 0xf4240

    sub-int/2addr v3, v2

    if-gt v0, v3, :cond_8

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 68
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-gt v2, v3, :cond_7

    if-ne v2, p1, :cond_0

    .line 69
    iget v3, p0, Ll/ܰܿܳ;->֫:I

    iput v3, p0, Ll/ܰܿܳ;->ܽ:I

    .line 70
    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_4

    .line 71
    :cond_1
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_2

    .line 72
    iget-boolean v5, p0, Ll/ܰܿܳ;->ۧ:Z

    if-eqz v5, :cond_2

    iput-boolean v0, p0, Ll/ܰܿܳ;->ۧ:Z

    goto :goto_3

    :cond_2
    const/16 v5, 0xd

    if-ne v3, v5, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    .line 73
    :goto_1
    iput-boolean v5, p0, Ll/ܰܿܳ;->ۧ:Z

    if-eqz v5, :cond_4

    const/16 v3, 0xa

    :cond_4
    if-ne v3, v4, :cond_6

    .line 75
    iget v4, p0, Ll/ܰܿܳ;->֫:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Ll/ܰܿܳ;->֫:I

    const/16 v5, 0x4e20

    if-ge v4, v5, :cond_5

    goto :goto_2

    :cond_5
    new-instance p1, Ll/֫ܳܳ;

    invoke-direct {p1}, Ll/֫ܳܳ;-><init>()V

    throw p1

    .line 76
    :cond_6
    :goto_2
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    :goto_4
    return-void

    .line 67
    :cond_8
    new-instance p1, Ll/֫ܳܳ;

    invoke-direct {p1}, Ll/֫ܳܳ;-><init>()V

    throw p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܰܿܳ;->ᩳ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
