.class public Ll/֫ܳ֡;
.super Ljava/lang/Object;
.source "44P2"

# interfaces
.implements Ll/ܳܳ֡;


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܽ:Ll/᩻ܳ֡;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/᩻ܳ֡;)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 52
    iput v0, p0, Ll/֫ܳ֡;->ۧ:I

    .line 73
    iput-object p1, p0, Ll/֫ܳ֡;->ܽ:Ll/᩻ܳ֡;

    return-void
.end method


# virtual methods
.method public final index()I
    .locals 1

    .line 80
    iget v0, p0, Ll/֫ܳ֡;->ۧ:I

    return v0
.end method

.method public final size()I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 106
    invoke-virtual {p0}, Ll/֫ܳ֡;->ܿ()V

    .line 107
    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->ܿ(I)I

    move-result p1

    iput p1, p0, Ll/֫ܳ֡;->ۧ:I

    return-void
.end method

.method public final ۜ(I)I
    .locals 3

    .line 313
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->᩷(I)Z

    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    return p1

    .line 318
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    .line 319
    :goto_0
    invoke-interface {v1}, Ll/֡ܳ֡;->ۧ()I

    move-result v2

    if-eqz v2, :cond_2

    .line 320
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 325
    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->᩷(I)Z

    .line 326
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    goto :goto_0

    :cond_2
    :goto_1
    return p1
.end method

.method public final ۧ(I)I
    .locals 0

    .line 206
    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->ᩳ(I)Ll/֡ܳ֡;

    move-result-object p1

    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 4

    .line 116
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    iget v1, p0, Ll/֫ܳ֡;->ۧ:I

    const/4 v2, 0x1

    if-ltz v1, :cond_1

    .line 117
    iget-boolean v3, p0, Ll/֫ܳ֡;->֫:Z

    if-eqz v3, :cond_0

    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v2

    if-ge v1, v0, :cond_1

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    goto :goto_0

    .line 132
    :cond_1
    invoke-virtual {p0, v2}, Ll/֫ܳ֡;->ۧ(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 136
    :goto_0
    iget v0, p0, Ll/֫ܳ֡;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ll/֫ܳ֡;->᩷(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    iget v0, p0, Ll/֫ܳ֡;->ۧ:I

    add-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ll/֫ܳ֡;->ܿ(I)I

    move-result v0

    iput v0, p0, Ll/֫ܳ֡;->ۧ:I

    :cond_2
    return-void

    .line 133
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "cannot consume EOF"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ܳ(I)I
    .locals 5

    .line 164
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    iget-boolean v1, p0, Ll/֫ܳ֡;->֫:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    :goto_0
    if-ge v2, p1, :cond_3

    .line 169
    iget-object v1, p0, Ll/֫ܳ֡;->ܽ:Ll/᩻ܳ֡;

    invoke-interface {v1}, Ll/֨ܳ֡;->nextToken()Ll/֡ܳ֡;

    move-result-object v1

    .line 170
    instance-of v3, v1, Ll/ܰܿ֡;

    if-eqz v3, :cond_1

    .line 171
    move-object v3, v1

    check-cast v3, Ll/ܰܿ֡;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ܰܿ֡;->ܳ(I)V

    .line 173
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_2

    const/4 p1, 0x1

    .line 175
    iput-boolean p1, p0, Ll/֫ܳ֡;->֫:Z

    add-int/2addr v2, p1

    return v2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return p1
.end method

.method public final ܽ()V
    .locals 2

    .line 482
    invoke-virtual {p0}, Ll/֫ܳ֡;->ܿ()V

    :cond_0
    const/16 v0, 0x3e8

    .line 485
    invoke-virtual {p0, v0}, Ll/֫ܳ֡;->ܳ(I)I

    move-result v1

    if-ge v1, v0, :cond_0

    return-void
.end method

.method public final ܽ(I)V
    .locals 0

    return-void
.end method

.method public final ܿ(I)I
    .locals 0

    .line 70
    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->ۜ(I)I

    move-result p1

    return p1
.end method

.method public final ܿ()V
    .locals 2

    .line 248
    iget v0, p0, Ll/֫ܳ֡;->ۧ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 254
    invoke-virtual {p0, v0}, Ll/֫ܳ֡;->᩷(I)Z

    .line 255
    invoke-virtual {p0, v0}, Ll/֫ܳ֡;->ܿ(I)I

    move-result v0

    iput v0, p0, Ll/֫ܳ֡;->ۧ:I

    :cond_0
    return-void
.end method

.method public final ᩳ()Ljava/util/ArrayList;
    .locals 1

    .line 266
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public ᩳ(I)Ll/֡ܳ֡;
    .locals 6

    .line 92
    invoke-virtual {p0}, Ll/֫ܳ֡;->ܿ()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-gez p1, :cond_8

    neg-int p1, p1

    .line 75
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    if-eqz p1, :cond_7

    iget v1, p0, Ll/֫ܳ֡;->ۧ:I

    sub-int v2, v1, p1

    if-gez v2, :cond_1

    goto :goto_3

    :cond_1
    const/4 v2, 0x1

    :goto_0
    if-gt v2, p1, :cond_5

    if-lez v1, :cond_5

    add-int/lit8 v1, v1, -0x1

    .line 343
    invoke-virtual {p0, v1}, Ll/֫ܳ֡;->᩷(I)Z

    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v1, v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :cond_2
    :goto_1
    if-ltz v1, :cond_4

    .line 350
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    .line 351
    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_4

    invoke-interface {v3}, Ll/֡ܳ֡;->ۧ()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    if-gez v1, :cond_6

    goto :goto_3

    .line 86
    :cond_6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p1, 0x0

    :goto_4
    return-object p1

    .line 95
    :cond_8
    iget v0, p0, Ll/֫ܳ֡;->ۧ:I

    const/4 v1, 0x1

    :goto_5
    if-ge v1, p1, :cond_a

    add-int/lit8 v2, v0, 0x1

    .line 100
    invoke-virtual {p0, v2}, Ll/֫ܳ֡;->᩷(I)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 101
    invoke-virtual {p0, v2}, Ll/֫ܳ֡;->ۜ(I)I

    move-result v0

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 106
    :cond_a
    iget-object p1, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    return-object p1
.end method

.method public final ᩷(I)Z
    .locals 2

    .line 149
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr p1, v0

    const/4 v0, 0x1

    add-int/2addr p1, v0

    if-lez p1, :cond_1

    .line 152
    invoke-virtual {p0, p1}, Ll/֫ܳ֡;->ܳ(I)I

    move-result v1

    if-lt v1, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final ᩻(I)Ll/֡ܳ֡;
    .locals 4

    .line 185
    iget-object v0, p0, Ll/֫ܳ֡;->ᩳ:Ljava/util/ArrayList;

    if-ltz p1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 188
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    return-object p1

    .line 186
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "token index "

    const-string v3, " out of range 0.."

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 186
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
