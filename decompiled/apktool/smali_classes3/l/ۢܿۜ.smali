.class public final synthetic Ll/ۢܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public final synthetic ֫:Ll/ۡܿۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۡܿۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܿۜ;->֫:Ll/ۡܿۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ܿۜ;)V
    .locals 12

    .line 2
    iget v0, p1, Ll/֫ܿۜ;->ۧ:I

    .line 4
    iget v1, p1, Ll/֫ܿۜ;->᩻:I

    .line 1754
    iget-object v2, p0, Ll/ۢܿۜ;->֫:Ll/ۡܿۜ;

    iget-object v3, v2, Ll/ۡܿۜ;->ܽ:Ljava/util/ArrayList;

    iget-object v4, v2, Ll/ۡܿۜ;->֫:Ll/֫ܿۜ;

    if-nez v4, :cond_1

    .line 1784
    iget-object v4, p1, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    instance-of v5, v4, Ljava/lang/String;

    if-eqz v5, :cond_0

    move-object v5, p1

    goto :goto_0

    .line 1787
    :cond_0
    new-instance v5, Ll/֫ܿۜ;

    iget-object v6, p1, Ll/֫ܿۜ;->ۜ:Ljava/lang/String;

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v1, v0, v4}, Ll/֫ܿۜ;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;)V

    .line 1755
    :goto_0
    iput-object v5, v2, Ll/ۡܿۜ;->֫:Ll/֫ܿۜ;

    .line 1757
    :cond_1
    iget v4, v2, Ll/ۡܿۜ;->ۧ:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v2, Ll/ۡܿۜ;->ۧ:I

    .line 1758
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v6, 0x2

    if-ge v4, v6, :cond_6

    .line 1794
    iget-object v2, p1, Ll/֫ܿۜ;->ܳ:Ljava/lang/CharSequence;

    sub-int v4, v0, v1

    const/16 v5, 0xf0

    if-le v4, v5, :cond_2

    const/16 v0, 0x79

    goto :goto_1

    .line 1798
    :cond_2
    invoke-static {v2, v1, v0}, Ljava/lang/Character;->codePointCount(Ljava/lang/CharSequence;II)I

    move-result v0

    :goto_1
    const/4 v4, 0x0

    const/16 v5, 0x78

    if-le v0, v5, :cond_3

    .line 1801
    invoke-static {v1, v4, v2}, Ll/۠ۨ᩻;->ۧ(IILjava/lang/CharSequence;)I

    move-result v0

    goto :goto_2

    :cond_3
    rsub-int/lit8 v0, v0, 0x78

    .line 1803
    div-int/2addr v0, v6

    neg-int v0, v0

    .line 1804
    invoke-static {v1, v0, v2}, Ll/۠ۨ᩻;->ۧ(IILjava/lang/CharSequence;)I

    move-result v0

    :goto_2
    move v8, v0

    .line 1806
    invoke-static {v8, v5, v2}, Ll/۠ۨ᩻;->֫(IILjava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 1807
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v8

    if-gtz v8, :cond_5

    .line 1808
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    const/4 v11, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v0, 0x1

    const/4 v11, 0x1

    .line 1809
    :goto_4
    new-instance v0, Ll/֨ۜۜ;

    iget v9, p1, Ll/֫ܿۜ;->᩻:I

    iget v10, p1, Ll/֫ܿۜ;->ۧ:I

    move-object v6, v0

    invoke-direct/range {v6 .. v11}, Ll/֨ۜۜ;-><init>(Ljava/lang/String;IIIZ)V

    .line 1759
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 1761
    :cond_6
    iput-boolean v5, v2, Ll/ۡܿۜ;->ᩳ:Z

    return-void
.end method
