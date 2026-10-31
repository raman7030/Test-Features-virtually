.class public final Ll/ۧܿۧ;
.super Ll/ᩳܿۧ;
.source "18UV"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ۗ:Z

.field public final ۛ:I

.field public final ۟:I

.field public final ۤ:Z

.field public final ۨ:I

.field public final ۫:Z

.field public final ۬:Z

.field public final ܰ:I

.field public final ᩺:I


# direct methods
.method public constructor <init>(ILl/۬᩵֫;ILl/᩺ᩳۧ;ILjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 4110
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳܿۧ;-><init>(ILl/۬᩵֫;I)V

    const/4 p1, 0x0

    .line 4112
    invoke-static {p5, p1}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p2

    iput-boolean p2, p0, Ll/ۧܿۧ;->ۤ:Z

    .line 4113
    iget-object p2, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p2, p2, Ll/۠ᩴ֫;->ᩳ֫:I

    iget p3, p4, Ll/ۨ᩵֫;->ܿ:I

    iget-object v0, p4, Ll/ۨ᩵֫;->᩸:Ll/ܳ۬ܺ;

    not-int p3, p3

    and-int/2addr p2, p3

    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 4114
    :goto_0
    iput-boolean p3, p0, Ll/ۧܿۧ;->۬:Z

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 4115
    :goto_1
    iput-boolean p2, p0, Ll/ۧܿۧ;->۫:Z

    if-eqz p7, :cond_2

    .line 4122
    invoke-static {p7}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p2

    goto :goto_2

    .line 4123
    :cond_2
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, ""

    .line 4124
    invoke-static {p2}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p2

    goto :goto_2

    :cond_3
    move-object p2, v0

    :goto_2
    const/4 p3, 0x0

    .line 4126
    :goto_3
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const v2, 0x7fffffff

    if-ge p3, v1, :cond_5

    .line 4127
    iget-object v1, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 4129
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-boolean v4, p4, Ll/ۨ᩵֫;->۬:Z

    .line 4128
    invoke-static {v1, v3, v4}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result v1

    if-lez v1, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_5
    const p3, 0x7fffffff

    const/4 v1, 0x0

    .line 4136
    :goto_4
    iput p3, p0, Ll/ۧܿۧ;->ۛ:I

    .line 4137
    iput v1, p0, Ll/ۧܿۧ;->ۨ:I

    const/16 p2, 0x440

    if-eqz p7, :cond_6

    const/16 p3, 0x440

    goto :goto_5

    .line 4141
    :cond_6
    iget p3, p4, Ll/ۨ᩵֫;->᩹:I

    .line 4142
    :goto_5
    iget-object p7, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p7, p7, Ll/۠ᩴ֫;->۟:I

    sget v3, Ll/ۜܿۧ;->ۡ:I

    if-eqz p7, :cond_7

    if-ne p7, p3, :cond_7

    goto :goto_6

    :cond_7
    and-int/2addr p3, p7

    .line 3460
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    move-result v2

    .line 4142
    :goto_6
    iput v2, p0, Ll/ۧܿۧ;->᩺:I

    .line 4143
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    iget p3, p3, Ll/۠ᩴ֫;->۟:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_8

    const/4 p2, 0x1

    goto :goto_7

    :cond_8
    const/4 p2, 0x0

    :goto_7
    iput-boolean p2, p0, Ll/ۧܿۧ;->ۗ:Z

    .line 4146
    invoke-static {p6}, Ll/ۜܿۧ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_9

    const/4 p2, 0x1

    goto :goto_8

    :cond_9
    const/4 p2, 0x0

    .line 4147
    :goto_8
    iget-object p3, p0, Ll/ᩳܿۧ;->᩸:Ll/۠ᩴ֫;

    .line 4148
    invoke-static {p3, p6, p2}, Ll/ۜܿۧ;->֫(Ll/۠ᩴ֫;Ljava/lang/String;Z)I

    move-result p2

    iput p2, p0, Ll/ۧܿۧ;->ܰ:I

    if-gtz v1, :cond_c

    .line 4151
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_a

    if-gtz v2, :cond_c

    :cond_a
    iget-boolean p3, p0, Ll/ۧܿۧ;->۬:Z

    if-nez p3, :cond_c

    iget-boolean p3, p0, Ll/ۧܿۧ;->۫:Z

    if-eqz p3, :cond_b

    if-lez p2, :cond_b

    goto :goto_9

    :cond_b
    const/4 p2, 0x0

    goto :goto_a

    :cond_c
    :goto_9
    const/4 p2, 0x1

    .line 4156
    :goto_a
    iget-boolean p3, p4, Ll/᩺ᩳۧ;->ۢ֫:Z

    .line 4155
    invoke-static {p5, p3}, Ll/ۧ۬֫;->֫(IZ)Z

    move-result p3

    if-eqz p3, :cond_d

    if-eqz p2, :cond_d

    const/4 p1, 0x1

    .line 4158
    :cond_d
    iput p1, p0, Ll/ۧܿۧ;->۟:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 4067
    check-cast p1, Ll/ۧܿۧ;

    invoke-virtual {p0, p1}, Ll/ۧܿۧ;->֫(Ll/ۧܿۧ;)I

    move-result p1

    return p1
.end method

.method public final ֫()I
    .locals 1

    .line 4163
    iget v0, p0, Ll/ۧܿۧ;->۟:I

    return v0
.end method

.method public final ֫(Ll/ۧܿۧ;)I
    .locals 5

    .line 4174
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۧܿۧ;->ۤ:Z

    iget-boolean v2, p1, Ll/ۧܿۧ;->ۤ:Z

    .line 4175
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/ۧܿۧ;->ۛ:I

    .line 4179
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Ll/ۧܿۧ;->ۛ:I

    .line 4180
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 4181
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v3

    .line 4178
    invoke-virtual {v0, v1, v2, v3}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p1, Ll/ۧܿۧ;->ۨ:I

    .line 4182
    iget v2, p0, Ll/ۧܿۧ;->ۨ:I

    invoke-virtual {v0, v2, v1}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p1, Ll/ۧܿۧ;->᩺:I

    .line 4183
    iget v3, p0, Ll/ۧܿۧ;->᩺:I

    invoke-virtual {v0, v3, v1}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۧܿۧ;->۬:Z

    iget-boolean v4, p1, Ll/ۧܿۧ;->۬:Z

    .line 4185
    invoke-virtual {v0, v1, v4}, Ll/ۜۗܺ;->֫(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۧܿۧ;->۫:Z

    .line 4187
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v4, p1, Ll/ۧܿۧ;->۫:Z

    .line 4188
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v2, :cond_0

    .line 4192
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v2

    .line 4186
    :goto_0
    invoke-virtual {v0, v1, v4, v2}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget v1, p0, Ll/ۧܿۧ;->ܰ:I

    iget v2, p1, Ll/ۧܿۧ;->ܰ:I

    .line 4193
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object v0

    if-nez v3, :cond_1

    .line 4195
    iget-boolean v1, p0, Ll/ۧܿۧ;->ۗ:Z

    iget-boolean p1, p1, Ll/ۧܿۧ;->ۗ:Z

    invoke-virtual {v0, v1, p1}, Ll/ۜۗܺ;->ۧ(ZZ)Ll/ۜۗܺ;

    move-result-object v0

    .line 4197
    :cond_1
    invoke-virtual {v0}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method

.method public final bridge synthetic ֫(Ll/ᩳܿۧ;)Z
    .locals 0

    .line 4067
    check-cast p1, Ll/ۧܿۧ;

    const/4 p1, 0x0

    return p1
.end method
