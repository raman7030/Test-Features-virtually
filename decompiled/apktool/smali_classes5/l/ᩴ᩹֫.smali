.class public abstract Ll/ᩴ᩹֫;
.super Ll/ۙ᩵֫;
.source "C8OL"


# static fields
.field public static final synthetic ᩳ:I


# instance fields
.field public final ۧ:I

.field public final ܽ:Ll/֨ܽۧ;


# direct methods
.method public constructor <init>(Ll/֨ܽۧ;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ll/ۙ᩵֫;-><init>()V

    .line 77
    iput-object p1, p0, Ll/ᩴ᩹֫;->ܽ:Ll/֨ܽۧ;

    .line 78
    invoke-interface {p1}, Ll/֨ܽۧ;->getLength()I

    move-result p1

    iput p1, p0, Ll/ᩴ᩹֫;->ۧ:I

    return-void
.end method

.method private ֫(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    .line 321
    iget-object p2, p0, Ll/ᩴ᩹֫;->ܽ:Ll/֨ܽۧ;

    invoke-interface {p2, p1}, Ll/֨ܽۧ;->ܽ(I)I

    move-result p1

    return p1

    .line 322
    :cond_0
    iget p2, p0, Ll/ᩴ᩹֫;->ۧ:I

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method public final ֫(IIZ)I
    .locals 5

    .line 90
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ܽ(I)I

    move-result v0

    .line 91
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v1

    .line 93
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v2

    sub-int/2addr p1, v1

    const/4 v3, 0x2

    if-ne p2, v3, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    move v4, p2

    .line 94
    :goto_0
    invoke-virtual {v2, p1, v4, p3}, Ll/ۙ᩵֫;->֫(IIZ)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_1

    add-int/2addr v1, p1

    return v1

    .line 102
    :cond_1
    invoke-direct {p0, v0, p3}, Ll/ᩴ᩹֫;->֫(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v2, :cond_2

    .line 103
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    invoke-direct {p0, p1, p3}, Ll/ᩴ᩹֫;->֫(IZ)I

    move-result p1

    goto :goto_1

    :cond_2
    if-eq p1, v2, :cond_3

    .line 107
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result p2

    .line 108
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p1

    add-int/2addr p1, p2

    return p1

    :cond_3
    if-ne p2, v3, :cond_4

    .line 112
    invoke-virtual {p0, p3}, Ll/ᩴ᩹֫;->֫(Z)I

    move-result p1

    return p1

    :cond_4
    return v2
.end method

.method public final ֫(Ljava/lang/Object;)I
    .locals 3

    .line 244
    instance-of v0, p1, Landroid/util/Pair;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    .line 42
    :cond_0
    check-cast p1, Landroid/util/Pair;

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 249
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ۧ(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    .line 253
    :cond_1
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v2

    invoke-virtual {v2, p1}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_2

    return v1

    .line 256
    :cond_2
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܿ(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final ֫(Z)I
    .locals 3

    .line 177
    iget v0, p0, Ll/ᩴ᩹֫;->ۧ:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    .line 184
    iget-object v0, p0, Ll/ᩴ᩹֫;->ܽ:Ll/֨ܽۧ;

    invoke-interface {v0}, Ll/֨ܽۧ;->ܽ()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 185
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 186
    invoke-direct {p0, v0, p1}, Ll/ᩴ᩹֫;->֫(IZ)I

    move-result v0

    if-ne v0, v1, :cond_2

    :goto_1
    return v1

    .line 192
    :cond_3
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v1

    .line 193
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۙ᩵֫;->֫(Z)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 3

    .line 261
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ۧ(I)I

    move-result v0

    .line 262
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܿ(I)I

    move-result v1

    .line 264
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v2

    sub-int/2addr p1, v1

    invoke-virtual {v2, p1}, Ll/ۙ᩵֫;->֫(I)Ljava/lang/Object;

    move-result-object p1

    .line 265
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ᩳ(I)Ljava/lang/Object;

    move-result-object v0

    .line 64
    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;
    .locals 4

    .line 198
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ܽ(I)I

    move-result v0

    .line 199
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v1

    .line 200
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܿ(I)I

    move-result v2

    .line 201
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v3

    sub-int/2addr p1, v1

    .line 202
    invoke-virtual {v3, p1, p2, p3, p4}, Ll/ۙ᩵֫;->֫(ILl/᩶᩵֫;J)Ll/᩶᩵֫;

    .line 203
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ᩳ(I)Ljava/lang/Object;

    move-result-object p1

    .line 206
    sget-object p3, Ll/᩶᩵֫;->ۚ:Ljava/lang/Object;

    iget-object p4, p2, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    iget-object p3, p2, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 64
    invoke-static {p1, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    .line 208
    :goto_0
    iput-object p1, p2, Ll/᩶᩵֫;->ᩴ:Ljava/lang/Object;

    .line 209
    iget p1, p2, Ll/᩶᩵֫;->ᩳ:I

    add-int/2addr p1, v2

    iput p1, p2, Ll/᩶᩵֫;->ᩳ:I

    .line 210
    iget p1, p2, Ll/᩶᩵֫;->ۜ:I

    add-int/2addr p1, v2

    iput p1, p2, Ll/᩶᩵֫;->ۜ:I

    return-object p2
.end method

.method public final ֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;
    .locals 4

    .line 228
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ۧ(I)I

    move-result v0

    .line 229
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v1

    .line 230
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܿ(I)I

    move-result v2

    .line 231
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v3

    sub-int/2addr p1, v2

    .line 232
    invoke-virtual {v3, p1, p2, p3}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    .line 233
    iget p1, p2, Ll/᩹᩵֫;->᩻:I

    add-int/2addr p1, v1

    iput p1, p2, Ll/᩹᩵֫;->᩻:I

    if-eqz p3, :cond_0

    .line 237
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ᩳ(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    .line 155
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    invoke-static {p1, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    .line 236
    iput-object p1, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;
    .locals 3

    .line 42
    move-object v0, p1

    check-cast v0, Landroid/util/Pair;

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 53
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 218
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->ۧ(Ljava/lang/Object;)I

    move-result v1

    .line 219
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v2

    .line 220
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v1

    invoke-virtual {v1, v0, p2}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;Ll/᩹᩵֫;)Ll/᩹᩵֫;

    .line 221
    iget v0, p2, Ll/᩹᩵֫;->᩻:I

    add-int/2addr v0, v2

    iput v0, p2, Ll/᩹᩵֫;->᩻:I

    .line 222
    iput-object p1, p2, Ll/᩹᩵֫;->ܳ:Ljava/lang/Object;

    return-object p2
.end method

.method public abstract ۧ(I)I
.end method

.method public final ۧ(IIZ)I
    .locals 5

    .line 126
    invoke-virtual {p0, p1}, Ll/ᩴ᩹֫;->ܽ(I)I

    move-result v0

    .line 127
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v1

    .line 129
    invoke-virtual {p0, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v2

    sub-int/2addr p1, v1

    const/4 v3, 0x2

    if-ne p2, v3, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    move v4, p2

    .line 130
    :goto_0
    invoke-virtual {v2, p1, v4, p3}, Ll/ۙ᩵֫;->ۧ(IIZ)I

    move-result p1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_1

    add-int/2addr v1, p1

    return v1

    .line 326
    :cond_1
    iget-object p1, p0, Ll/ᩴ᩹֫;->ܽ:Ll/֨ܽۧ;

    if-eqz p3, :cond_2

    .line 327
    invoke-interface {p1, v0}, Ll/֨ܽۧ;->ۧ(I)I

    move-result v0

    move-object v1, p0

    goto :goto_2

    :cond_2
    if-lez v0, :cond_3

    move-object v1, p0

    goto :goto_3

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, -0x1

    move-object v1, v0

    const/4 v0, -0x1

    :goto_2
    if-eq v0, v2, :cond_6

    .line 140
    invoke-virtual {v1, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz p3, :cond_4

    .line 327
    invoke-interface {p1, v0}, Ll/֨ܽۧ;->ۧ(I)I

    move-result v0

    goto :goto_2

    :cond_4
    if-lez v0, :cond_5

    :goto_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_5
    move-object v0, v1

    goto :goto_1

    :cond_6
    if-eq v0, v2, :cond_7

    .line 144
    invoke-virtual {v1, v0}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result p1

    .line 145
    invoke-virtual {v1, v0}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object p2

    invoke-virtual {p2, p3}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result p2

    add-int/2addr p2, p1

    return p2

    :cond_7
    if-ne p2, v3, :cond_8

    .line 149
    invoke-virtual {v1, p3}, Ll/ᩴ᩹֫;->ۧ(Z)I

    move-result p1

    return p1

    :cond_8
    return v2
.end method

.method public abstract ۧ(Ljava/lang/Object;)I
.end method

.method public final ۧ(Z)I
    .locals 4

    const/4 v0, -0x1

    .line 156
    iget v1, p0, Ll/ᩴ᩹֫;->ۧ:I

    if-nez v1, :cond_0

    goto :goto_2

    .line 163
    :cond_0
    iget-object v2, p0, Ll/ᩴ᩹֫;->ܽ:Ll/֨ܽۧ;

    if-eqz p1, :cond_1

    invoke-interface {v2}, Ll/֨ܽۧ;->֫()I

    move-result v1

    goto :goto_0

    :cond_1
    add-int/lit8 v1, v1, -0x1

    .line 164
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz p1, :cond_3

    .line 327
    invoke-interface {v2, v1}, Ll/֨ܽۧ;->ۧ(I)I

    move-result v1

    goto :goto_1

    :cond_3
    if-lez v1, :cond_4

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_4
    const/4 v1, -0x1

    :goto_1
    if-ne v1, v0, :cond_2

    :goto_2
    return v0

    .line 171
    :cond_5
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->ܳ(I)I

    move-result v0

    .line 172
    invoke-virtual {p0, v1}, Ll/ᩴ᩹֫;->᩻(I)Ll/ۙ᩵֫;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۙ᩵֫;->ۧ(Z)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public abstract ܳ(I)I
.end method

.method public abstract ܽ(I)I
.end method

.method public abstract ܿ(I)I
.end method

.method public abstract ᩳ(I)Ljava/lang/Object;
.end method

.method public abstract ᩻(I)Ll/ۙ᩵֫;
.end method
