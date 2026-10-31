.class public final Ll/ۘܿۘ;
.super Ll/ᩴܿۘ;
.source "L1LP"


# instance fields
.field public final ܳ:Ljava/lang/CharSequence;

.field public final ܿ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 147
    invoke-direct {p0, p4, p5, p1}, Ll/ᩴܿۘ;-><init>(Ljava/util/List;Ljava/util/List;Ll/ۜܳۘ;)V

    .line 148
    iput-object p2, p0, Ll/ۘܿۘ;->ܿ:Ljava/lang/CharSequence;

    .line 149
    iput-object p3, p0, Ll/ۘܿۘ;->ܳ:Ljava/lang/CharSequence;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/util/List;IIZ)I
    .locals 3

    const/4 v0, 0x0

    :cond_0
    if-ge v0, p3, :cond_2

    if-eqz p4, :cond_1

    add-int v1, p2, v0

    .line 158
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܿۘ;

    add-int/lit8 v1, v1, 0x1

    .line 159
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳܿۘ;

    goto :goto_0

    :cond_1
    sub-int v1, p2, v0

    add-int/lit8 v2, v1, -0x1

    .line 161
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܿۘ;

    .line 162
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳܿۘ;

    .line 164
    :goto_0
    invoke-static {p0, v2, v1}, Ll/ۘܿۘ;->֫(Ljava/lang/CharSequence;Ll/ᩳܿۘ;Ll/ᩳܿۘ;)Z

    move-result v1

    add-int/lit8 v0, v0, 0x1

    if-eqz v1, :cond_0

    return v0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ᩳܿۘ;Ll/ᩳܿۘ;)Z
    .locals 2

    .line 170
    instance-of v0, p1, Ll/ܳܿۘ;

    const/4 v1, 0x1

    if-nez v0, :cond_3

    instance-of v0, p2, Ll/ܳܿۘ;

    if-eqz v0, :cond_0

    return v1

    .line 172
    :cond_0
    invoke-interface {p1}, Ll/ᩳܿۘ;->֫()I

    move-result p1

    .line 173
    invoke-interface {p2}, Ll/ᩳܿۘ;->ۧ()I

    move-result p2

    :goto_0
    if-ge p1, p2, :cond_2

    .line 176
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ll/ۧ᩷ܽ;->֫(C)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    return v1
.end method


# virtual methods
.method public final ֫(Ll/᩶ܳۘ;IILl/᩹ܳۘ;Ll/᩹ܳۘ;)I
    .locals 3

    .line 183
    iget-object p4, p0, Ll/ᩴܿۘ;->֫:Ljava/util/List;

    iget-object v0, p0, Ll/ᩴܿۘ;->ۧ:Ljava/util/List;

    invoke-virtual {p1, p4, v0}, Ll/᩶ܳۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    invoke-static {p4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object v0, p0, Ll/ۘܿۘ;->ܿ:Ljava/lang/CharSequence;

    iget-object v1, p0, Ll/ۘܿۘ;->ܳ:Ljava/lang/CharSequence;

    invoke-virtual {p1, v0, v1}, Ll/᩶ܳۘ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iget v1, p5, Ll/᩹ܳۘ;->ܽ:I

    iget p5, p5, Ll/᩹ܳۘ;->ᩳ:I

    invoke-virtual {p1, v1, p5}, Ll/᩶ܳۘ;->ۧ(II)I

    move-result p1

    add-int/lit8 p5, p1, -0x1

    .line 188
    invoke-interface {p4, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳܿۘ;

    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳܿۘ;

    invoke-static {v0, v1, v2}, Ll/ۘܿۘ;->֫(Ljava/lang/CharSequence;Ll/ᩳܿۘ;Ll/ᩳܿۘ;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 193
    invoke-static {v0, p4, p1, p2, v1}, Ll/ۘܿۘ;->֫(Ljava/lang/CharSequence;Ljava/util/List;IIZ)I

    move-result p1

    if-lez p1, :cond_1

    return p1

    .line 198
    :cond_1
    invoke-static {v0, p4, p5, p3, v2}, Ll/ۘܿۘ;->֫(Ljava/lang/CharSequence;Ljava/util/List;IIZ)I

    move-result p1

    if-lez p1, :cond_2

    neg-int p1, p1

    return p1

    :cond_2
    :goto_0
    return v2
.end method
