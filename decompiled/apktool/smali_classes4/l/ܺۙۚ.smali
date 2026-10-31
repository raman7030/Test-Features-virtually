.class public Ll/ܺۙۚ;
.super Ll/ܰ᩹ۚ;
.source "R65Z"


# instance fields
.field public ܽ:Ljava/lang/String;

.field public ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 63
    invoke-direct {p0, p1, v0}, Ll/ܺۙۚ;-><init>(Ljava/lang/String;I)V

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ܺۙۚ;

    if-ne p1, v0, :cond_0

    return-void

    .line 65
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ll/ܰ᩹ۚ;-><init>()V

    .line 78
    iput-object p1, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 87
    invoke-direct {p0}, Ll/ܰ᩹ۚ;-><init>()V

    .line 88
    iput-object p1, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    if-eqz p0, :cond_4

    .line 210
    instance-of v0, p2, [Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 211
    check-cast p2, [Ljava/lang/String;

    .line 212
    aget-object v0, p2, v1

    const/4 v1, 0x1

    aget-object p2, p2, v1

    invoke-virtual {p0, p1, v0, p2}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 213
    :cond_0
    instance-of v0, p2, Ll/ܺۙۚ;

    if-eqz v0, :cond_1

    .line 214
    check-cast p2, Ll/ܺۙۚ;

    .line 215
    iget-object v0, p2, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;)V

    return-void

    .line 216
    :cond_1
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_3

    .line 217
    invoke-virtual {p0, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 219
    check-cast p2, Ljava/util/List;

    .line 220
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    :goto_0
    if-ge v1, p1, :cond_2

    const/4 v0, 0x0

    .line 221
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0, v0, v2}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 223
    :cond_2
    invoke-virtual {p0}, Ll/ܰ᩹ۚ;->֫()V

    return-void

    .line 226
    :cond_3
    invoke-virtual {p0, p2, p1}, Ll/ܰ᩹ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 3

    .line 150
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    :cond_1
    if-eqz v1, :cond_2

    .line 154
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 157
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    new-instance v0, Ll/ܺۙۚ;

    invoke-direct {v0, p1}, Ll/ܺۙۚ;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܰ᩹ۚ;
    .locals 3

    .line 137
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    :cond_1
    if-eqz v1, :cond_2

    .line 141
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    :cond_2
    new-instance p1, Ll/ܺۙۚ;

    invoke-direct {p1, p2}, Ll/ܺۙۚ;-><init>(Ljava/lang/String;)V

    .line 144
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 5

    .line 97
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    :cond_1
    if-eqz v1, :cond_2

    .line 101
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    :cond_2
    instance-of p2, p1, [B

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 104
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [B

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    array-length v2, p1

    :goto_1
    if-ge v0, v2, :cond_3

    aget-byte v3, p1, v0

    .line 74
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 104
    :cond_3
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 105
    :cond_4
    instance-of p2, p1, [Z

    if-eqz p2, :cond_6

    .line 106
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [Z

    .line 83
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    array-length v2, p1

    :goto_2
    if-ge v0, v2, :cond_5

    aget-boolean v3, p1, v0

    .line 85
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 106
    :cond_5
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 107
    :cond_6
    instance-of p2, p1, [S

    if-eqz p2, :cond_8

    .line 108
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [S

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    array-length v2, p1

    :goto_3
    if-ge v0, v2, :cond_7

    aget-short v3, p1, v0

    .line 96
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 108
    :cond_7
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 109
    :cond_8
    instance-of p2, p1, [C

    if-eqz p2, :cond_a

    .line 110
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [C

    .line 105
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 106
    array-length v2, p1

    :goto_4
    if-ge v0, v2, :cond_9

    aget-char v3, p1, v0

    .line 107
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 110
    :cond_9
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 111
    :cond_a
    instance-of p2, p1, [I

    if-eqz p2, :cond_b

    .line 112
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [I

    invoke-static {p1}, Ll/ᩳۗۚ;->֫([I)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 113
    :cond_b
    instance-of p2, p1, [J

    if-eqz p2, :cond_d

    .line 114
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [J

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    array-length v2, p1

    :goto_5
    if-ge v0, v2, :cond_c

    aget-wide v3, p1, v0

    .line 140
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 114
    :cond_c
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 115
    :cond_d
    instance-of p2, p1, [F

    if-eqz p2, :cond_f

    .line 116
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [F

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    array-length v2, p1

    :goto_6
    if-ge v0, v2, :cond_e

    aget v3, p1, v0

    .line 129
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    .line 116
    :cond_e
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 117
    :cond_f
    instance-of p2, p1, [D

    if-eqz p2, :cond_11

    .line 118
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    check-cast p1, [D

    .line 149
    new-instance v1, Ljava/util/ArrayList;

    array-length v2, p1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    array-length v2, p1

    :goto_7
    if-ge v0, v2, :cond_10

    aget-wide v3, p1, v0

    .line 151
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    .line 118
    :cond_10
    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 120
    :cond_11
    iget-object p2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 126
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    :cond_1
    if-eqz v1, :cond_2

    .line 130
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    :cond_2
    iget-object p1, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܰ᩹ۚ;)V
    .locals 5

    if-eqz p1, :cond_1

    .line 189
    iget-object v0, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 190
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 191
    iget-object v2, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 192
    iget-object v3, p0, Ll/ܺۙۚ;->ᩳ:Ljava/util/ArrayList;

    add-int/lit8 v4, v1, 0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 193
    invoke-static {p1, v2, v3}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;Ljava/lang/String;Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 196
    :cond_0
    invoke-virtual {p1}, Ll/ܰ᩹ۚ;->֫()V

    :cond_1
    return-void
.end method
