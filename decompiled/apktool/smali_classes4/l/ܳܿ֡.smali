.class public Ll/ܳܿ֡;
.super Ljava/lang/Exception;
.source "N4NK"


# instance fields
.field public ۗ:Ljava/lang/Object;

.field public ۙ:I

.field public ۬:Ll/ۜܿ֡;

.field public transient ᩶:Ll/ۨᩳ֡;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ۨᩳ֡;)V
    .locals 5

    .line 102
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 103
    iput-object p1, p0, Ll/ܳܿ֡;->᩶:Ll/ۨᩳ֡;

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    instance-of v0, p1, Ll/᩷ܿ֡;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 106
    move-object v0, p1

    check-cast v0, Ll/᩷ܿ֡;

    invoke-interface {v0, v1}, Ll/᩷ܿ֡;->ܽ(I)Ll/ۜܿ֡;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 107
    invoke-interface {v0}, Ll/ۜܿ֡;->getLine()I

    move-result v0

    iput v0, p0, Ll/ܳܿ֡;->ۙ:I

    .line 108
    iget-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {v0}, Ll/ۜܿ֡;->֫()I

    move-result v0

    iput v0, p0, Ll/ܳܿ֡;->᩹:I

    .line 110
    :cond_0
    instance-of v0, p1, Ll/ۙܿ֡;

    if-eqz v0, :cond_d

    .line 124
    check-cast p1, Ll/ۙܿ֡;

    .line 126
    invoke-interface {p1, v1}, Ll/ۙܿ֡;->ܽ(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    .line 129
    instance-of v0, p1, Ll/֡ܿ֡;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 130
    move-object v0, p1

    check-cast v0, Ll/֡ܿ֡;

    invoke-interface {v0, v2}, Ll/֡ܿ֡;->֫(Z)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    .line 132
    invoke-interface {v0, v1}, Ll/֡ܿ֡;->֫(Z)Ljava/lang/Object;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, v3

    .line 137
    :cond_2
    :goto_0
    invoke-interface {p1}, Ll/ۙܿ֡;->ܽ()Ll/ۛ᩸ۘ;

    move-result-object v0

    if-eqz v4, :cond_3

    goto :goto_1

    .line 138
    :cond_3
    iget-object v4, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    instance-of v0, v4, Ll/ᩴܿ֡;

    if-eqz v0, :cond_4

    .line 140
    check-cast v4, Ll/ᩴܿ֡;

    .line 67
    iget-object v0, v4, Ll/ᩴܿ֡;->ܳ:Ll/ۜܿ֡;

    goto :goto_2

    :cond_4
    move-object v0, v3

    :goto_2
    if-eqz v0, :cond_8

    .line 140
    iput-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    .line 141
    invoke-interface {v0}, Ll/ۜܿ֡;->getLine()I

    move-result v1

    if-gtz v1, :cond_7

    const/4 v0, -0x1

    .line 144
    invoke-interface {p1, v0}, Ll/ۙܿ֡;->ܽ(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, -0x1

    :goto_3
    if-eqz v1, :cond_9

    .line 139
    instance-of v4, v1, Ll/ᩴܿ֡;

    if-eqz v4, :cond_5

    .line 140
    check-cast v1, Ll/ᩴܿ֡;

    .line 67
    iget-object v1, v1, Ll/ᩴܿ֡;->ܳ:Ll/ۜܿ֡;

    goto :goto_4

    :cond_5
    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_6

    .line 147
    invoke-interface {v1}, Ll/ۜܿ֡;->getLine()I

    move-result v4

    if-lez v4, :cond_6

    .line 149
    invoke-interface {v1}, Ll/ۜܿ֡;->getLine()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 150
    invoke-interface {v1}, Ll/ۜܿ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    goto :goto_5

    :cond_6
    add-int/2addr v2, v0

    .line 157
    :try_start_0
    invoke-interface {p1, v2}, Ll/ۙܿ֡;->ܽ(I)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-object v1, v3

    goto :goto_3

    .line 164
    :cond_7
    invoke-interface {v0}, Ll/ۜܿ֡;->getLine()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 165
    invoke-interface {v0}, Ll/ۜܿ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    return-void

    .line 168
    :cond_8
    iget-object p1, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    instance-of v0, p1, Ll/᩹ܿ֡;

    if-eqz v0, :cond_a

    .line 169
    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->getLine()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->ۙ:I

    .line 170
    iget-object p1, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    .line 171
    iget-object p1, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    instance-of v0, p1, Ll/ᩴܿ֡;

    if-eqz v0, :cond_9

    .line 172
    check-cast p1, Ll/ᩴܿ֡;

    iget-object p1, p1, Ll/ᩴܿ֡;->ܳ:Ll/ۜܿ֡;

    iput-object p1, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    :cond_9
    :goto_5
    return-void

    :cond_a
    if-nez p1, :cond_b

    goto :goto_6

    .line 130
    :cond_b
    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->getType()I

    move-result v2

    .line 177
    :goto_6
    iget-object p1, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    if-nez p1, :cond_c

    goto :goto_7

    .line 124
    :cond_c
    check-cast p1, Ll/᩹ܿ֡;

    invoke-interface {p1}, Ll/᩹ܿ֡;->getText()Ljava/lang/String;

    move-result-object v3

    .line 178
    :goto_7
    new-instance p1, Ll/ۗᩳ֡;

    invoke-direct {p1, v2, v3}, Ll/ۗᩳ֡;-><init>(ILjava/lang/String;)V

    iput-object p1, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    return-void

    .line 113
    :cond_d
    instance-of v0, p1, Ll/ۙᩳ֡;

    if-eqz v0, :cond_e

    .line 114
    invoke-interface {p1, v1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result v0

    iput v0, p0, Ll/ܳܿ֡;->᩸:I

    .line 115
    check-cast p1, Ll/ۙᩳ֡;

    invoke-interface {p1}, Ll/ۙᩳ֡;->getLine()I

    move-result v0

    iput v0, p0, Ll/ܳܿ֡;->ۙ:I

    .line 116
    invoke-interface {p1}, Ll/ۙᩳ֡;->֫()I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩹:I

    return-void

    .line 119
    :cond_e
    invoke-interface {p1, v1}, Ll/ۨᩳ֡;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ܳܿ֡;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 184
    iget-object v0, p0, Ll/ܳܿ֡;->᩶:Ll/ۨᩳ֡;

    instance-of v1, v0, Ll/᩷ܿ֡;

    if-eqz v1, :cond_0

    .line 185
    iget-object v0, p0, Ll/ܳܿ֡;->۬:Ll/ۜܿ֡;

    invoke-interface {v0}, Ll/ۜܿ֡;->getType()I

    move-result v0

    return v0

    .line 187
    :cond_0
    instance-of v1, v0, Ll/ۙܿ֡;

    if-eqz v1, :cond_2

    .line 188
    check-cast v0, Ll/ۙܿ֡;

    .line 189
    invoke-interface {v0}, Ll/ۙܿ֡;->ܽ()Ll/ۛ᩸ۘ;

    move-result-object v0

    .line 190
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    iget-object v0, p0, Ll/ܳܿ֡;->ۗ:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 130
    :cond_1
    check-cast v0, Ll/᩹ܿ֡;

    invoke-interface {v0}, Ll/᩹ܿ֡;->getType()I

    move-result v0

    return v0

    .line 193
    :cond_2
    iget v0, p0, Ll/ܳܿ֡;->᩸:I

    return v0
.end method
