.class public abstract Ll/ܺܿ֡;
.super Ll/ۡܿ֡;
.source "T62G"


# instance fields
.field public ܳ:I

.field public ܿ:Ljava/lang/Object;

.field public ᩳ:I

.field public ᩻:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Ll/ۡܿ֡;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput v0, p0, Ll/ܺܿ֡;->ᩳ:I

    const/4 v1, 0x0

    .line 52
    iput-object v1, p0, Ll/ܺܿ֡;->ܿ:Ljava/lang/Object;

    .line 58
    iput v0, p0, Ll/ܺܿ֡;->ܳ:I

    return-void
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 134
    iget v0, p0, Ll/ܺܿ֡;->ᩳ:I

    return v0
.end method

.method public final size()I
    .locals 2

    .line 121
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "streams are of unknown size"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ֫(Ljava/lang/Object;)Z
.end method

.method public abstract ۜ()Ljava/lang/Object;
.end method

.method public final ۧ()V
    .locals 2

    const/4 v0, 0x1

    .line 96
    invoke-virtual {p0, v0}, Ll/ܺܿ֡;->ܳ(I)V

    .line 97
    invoke-virtual {p0}, Ll/ܺܿ֡;->ܿ()Ljava/lang/Object;

    .line 98
    iget v1, p0, Ll/ܺܿ֡;->ᩳ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܺܿ֡;->ᩳ:I

    return-void
.end method

.method public final ܳ(I)V
    .locals 4

    .line 106
    iget v0, p0, Ll/ۡܿ֡;->ۧ:I

    add-int/2addr v0, p1

    const/4 p1, 0x1

    sub-int/2addr v0, p1

    iget-object v1, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v0, v2

    add-int/2addr v0, p1

    if-lez v0, :cond_1

    :goto_0
    if-gt p1, v0, :cond_1

    .line 113
    invoke-virtual {p0}, Ll/ܺܿ֡;->ۜ()Ljava/lang/Object;

    move-result-object v2

    .line 114
    invoke-virtual {p0, v2}, Ll/ܺܿ֡;->֫(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iput-object v2, p0, Ll/ܺܿ֡;->ܿ:Ljava/lang/Object;

    .line 115
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ܽ(I)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 127
    :cond_0
    iget-object v0, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    if-gez p1, :cond_4

    neg-int p1, p1

    .line 191
    iget v1, p0, Ll/ۡܿ֡;->ۧ:I

    sub-int/2addr v1, p1

    const/4 p1, -0x1

    if-ne v1, p1, :cond_1

    .line 193
    iget-object p1, p0, Ll/ܺܿ֡;->᩻:Ljava/lang/Object;

    return-object p1

    :cond_1
    if-ltz v1, :cond_2

    .line 199
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    if-ge v1, p1, :cond_3

    .line 203
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "can\'t look more than one token before the beginning of this stream\'s buffer"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 206
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "can\'t look past the end of this stream\'s buffer using LB(int)"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 129
    :cond_4
    invoke-virtual {p0, p1}, Ll/ܺܿ֡;->ܳ(I)V

    .line 130
    iget v1, p0, Ll/ۡܿ֡;->ۧ:I

    add-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v1, v0, :cond_5

    iget-object p1, p0, Ll/ܺܿ֡;->ܿ:Ljava/lang/Object;

    return-object p1

    :cond_5
    add-int/lit8 p1, p1, -0x1

    .line 131
    invoke-virtual {p0, p1}, Ll/ۡܿ֡;->ᩳ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ܿ()Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    .line 83
    invoke-virtual {p0, v0}, Ll/ۡܿ֡;->ᩳ(I)Ljava/lang/Object;

    move-result-object v1

    .line 84
    iget v2, p0, Ll/ۡܿ֡;->ۧ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Ll/ۡܿ֡;->ۧ:I

    .line 86
    iget-object v3, p0, Ll/ۡܿ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v2, v4, :cond_0

    iget v2, p0, Ll/ܺܿ֡;->ܳ:I

    if-nez v2, :cond_0

    .line 87
    iput-object v1, p0, Ll/ܺܿ֡;->᩻:Ljava/lang/Object;

    .line 52
    iput v0, p0, Ll/ۡܿ֡;->ۧ:I

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    :cond_0
    return-object v1
.end method

.method public final ܿ(I)V
    .locals 2

    .line 147
    iget v0, p0, Ll/ܺܿ֡;->ܳ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܺܿ֡;->ܳ:I

    .line 148
    iget v0, p0, Ll/ۡܿ֡;->ۧ:I

    sub-int/2addr v0, p1

    .line 149
    iget v1, p0, Ll/ܺܿ֡;->ᩳ:I

    sub-int/2addr v1, v0

    iput v1, p0, Ll/ܺܿ֡;->ᩳ:I

    .line 150
    iput p1, p0, Ll/ۡܿ֡;->ۧ:I

    return-void
.end method

.method public final ᩻()I
    .locals 1

    .line 137
    iget v0, p0, Ll/ܺܿ֡;->ܳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ܺܿ֡;->ܳ:I

    .line 138
    iget v0, p0, Ll/ۡܿ֡;->ۧ:I

    return v0
.end method
