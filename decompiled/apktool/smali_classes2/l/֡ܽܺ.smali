.class public final Ll/֡ܽܺ;
.super Ljava/lang/Object;
.source "QBHJ"

# interfaces
.implements Ll/ۡᩴܺ;


# instance fields
.field public final ֫:Ll/۠ܽܺ;

.field public final ۧ:I

.field public final ܽ:I

.field public final ܿ:Ll/᩷ᩴܺ;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIILl/᩷ᩴܺ;Ll/۠ܽܺ;)V
    .locals 3

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_5

    if-ltz p2, :cond_4

    if-le p3, p2, :cond_3

    .line 83
    invoke-virtual {p4}, Ll/᩷ᩴܺ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 85
    invoke-virtual {p4, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    if-ltz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 86
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "successors["

    const-string p3, "] == "

    .line 0
    invoke-static {v1, p2, p3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 88
    invoke-virtual {p4, v1}, Ll/᩷ᩴܺ;->get(I)I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eqz p5, :cond_2

    .line 96
    iput p1, p0, Ll/֡ܽܺ;->ܽ:I

    .line 97
    iput p2, p0, Ll/֡ܽܺ;->ᩳ:I

    .line 98
    iput p3, p0, Ll/֡ܽܺ;->ۧ:I

    .line 99
    iput-object p4, p0, Ll/֡ܽܺ;->ܿ:Ll/᩷ᩴܺ;

    .line 100
    iput-object p5, p0, Ll/֡ܽܺ;->֫:Ll/۠ܽܺ;

    return-void

    .line 93
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "catches == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "end <= start"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "start < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "label < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/֡ܽܺ;->ܽ:I

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֡ܽܺ;->ᩳ:I

    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֡ܽܺ;->ۧ:I

    .line 109
    invoke-static {v1}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 119
    iget v0, p0, Ll/֡ܽܺ;->ܽ:I

    return v0
.end method

.method public final ۧ()Ll/۠ܽܺ;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/֡ܽܺ;->֫:Ll/۠ܽܺ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 137
    iget v0, p0, Ll/֡ܽܺ;->ۧ:I

    return v0
.end method

.method public final ܿ()Ll/᩷ᩴܺ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/֡ܽܺ;->ܿ:Ll/᩷ᩴܺ;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 128
    iget v0, p0, Ll/֡ܽܺ;->ᩳ:I

    return v0
.end method
