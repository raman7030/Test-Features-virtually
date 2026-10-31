.class public final Ll/᩺ۨ֡;
.super Ljava/lang/Object;
.source "T65P"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final synthetic ܿ:Ll/ܰۨ֡;

.field public final ᩳ:Ll/۬ۨ֡;


# direct methods
.method public constructor <init>(Ll/ܰۨ֡;Ll/ۗۨ֡;)V
    .locals 3

    .line 550
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۨ֡;->ܿ:Ll/ܰۨ֡;

    .line 552
    :try_start_0
    new-instance v0, Ll/۬ۨ֡;

    invoke-static {p1}, Ll/ܰۨ֡;->ܽ(Ll/ܰۨ֡;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2}, Ll/ۗۨ֡;->ܽ()I

    move-result v2

    check-cast v1, Ll/ۚۨ֡;

    invoke-virtual {v1, v2}, Ll/ۚۨ֡;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۨ֡;

    invoke-direct {v0, p1, v1}, Ll/۬ۨ֡;-><init>(Ll/ܰۨ֡;Ll/ۗۨ֡;)V

    iput-object v0, p0, Ll/᩺ۨ֡;->ᩳ:Ll/۬ۨ֡;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    invoke-virtual {p2}, Ll/ۗۨ֡;->ᩳ()I

    move-result v0

    iput v0, p0, Ll/᩺ۨ֡;->ܽ:I

    .line 557
    invoke-virtual {p2}, Ll/ۗۨ֡;->ۧ()I

    move-result v1

    iput v1, p0, Ll/᩺ۨ֡;->ۧ:I

    .line 558
    invoke-virtual {p2}, Ll/ۗۨ֡;->ܿ()I

    move-result p2

    div-int/2addr p2, v1

    iput p2, p0, Ll/᩺ۨ֡;->֫:I

    mul-int p2, p2, v1

    add-int/2addr p2, v0

    .line 560
    invoke-virtual {p1}, Ll/᩺ۤ֡;->length()I

    move-result p1

    if-gt p2, p1, :cond_0

    return-void

    .line 561
    :cond_0
    new-instance p1, Ll/۠ۨ֡;

    const-string p2, "Symbol table extends past end of file"

    .line 325
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 561
    throw p1

    .line 554
    :catch_0
    new-instance p1, Ll/۠ۨ֡;

    const-string p2, "String table section index is invalid"

    .line 325
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 554
    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩺ۨ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩺ۨ֡;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/᩺ۨ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩺ۨ֡;->ۧ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/᩺ۨ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩺ۨ֡;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩺ۨ֡;)Ll/۬ۨ֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ۨ֡;->ᩳ:Ll/۬ۨ֡;

    return-object p0
.end method
