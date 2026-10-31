.class public final Ll/ۖۢ۠;
.super Ljava/lang/Object;
.source "Q7KW"


# instance fields
.field public ֫:I

.field public ۧ:Ll/ܶ֨۠;

.field public ܽ:Ll/᩶ۢ۠;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ll/ܶ֨۠;

    const v1, 0xfff0

    invoke-direct {v0, v1}, Ll/ܶ֨۠;-><init>(I)V

    iput-object v0, p0, Ll/ۖۢ۠;->ۧ:Ll/ܶ֨۠;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    .line 130
    :cond_0
    new-instance v0, Ll/ܺۢ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for module: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 54
    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 130
    throw v0
.end method


# virtual methods
.method public final ֫()C
    .locals 2

    .line 136
    iget-object v0, p0, Ll/ۖۢ۠;->ۧ:Ll/ܶ֨۠;

    iget v1, p0, Ll/ۖۢ۠;->֫:I

    invoke-virtual {v0, v1}, Ll/ܶ֨۠;->ᩳ(I)C

    move-result v0

    .line 137
    iget v1, p0, Ll/ۖۢ۠;->֫:I

    add-int/lit8 v1, v1, 0x2

    iput v1, p0, Ll/ۖۢ۠;->֫:I

    return v0
.end method

.method public final ֫(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    .line 88
    iput v0, p0, Ll/ۖۢ۠;->֫:I

    .line 237
    iget-object v1, p0, Ll/ۖۢ۠;->ۧ:Ll/ܶ֨۠;

    iput v0, v1, Ll/ܶ֨۠;->ۧ:I

    .line 90
    invoke-virtual {v1, p1}, Ll/ܶ֨۠;->֫(Ljava/io/InputStream;)V

    .line 144
    iget p1, p0, Ll/ۖۢ۠;->֫:I

    invoke-virtual {v1, p1}, Ll/ܶ֨۠;->ܿ(I)I

    move-result p1

    .line 145
    iget v2, p0, Ll/ۖۢ۠;->֫:I

    add-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/ۖۢ۠;->֫:I

    const v2, -0x35014542    # -8346975.0f

    if-ne p1, v2, :cond_4

    .line 96
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    .line 97
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const/16 v2, 0x35

    if-lt p1, v2, :cond_3

    .line 101
    new-instance p1, Ll/᩶ۢ۠;

    const/4 v2, 0x0

    .line 80
    invoke-direct {p1, v2, v1, v2, v2}, Ll/᩶ۢ۠;-><init>(Ll/᩶ۜ۠;Ll/ܶ֨۠;Ll/ۛܶ۠;Ll/᩷ۚ֨;)V

    .line 101
    iput-object p1, p0, Ll/ۖۢ۠;->ܽ:Ll/᩶ۢ۠;

    .line 102
    iget v2, p0, Ll/ۖۢ۠;->֫:I

    invoke-virtual {p1, v1, v2}, Ll/᩶ۢ۠;->֫(Ll/ܶ֨۠;I)I

    move-result p1

    iput p1, p0, Ll/ۖۢ۠;->֫:I

    .line 104
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const v2, 0x8000

    if-ne p1, v2, :cond_2

    .line 108
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    .line 110
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const-string v2, "super_class"

    invoke-static {p1, v2}, Ll/ۖۢ۠;->֫(ILjava/lang/String;)V

    .line 111
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const-string v2, "interface_count"

    invoke-static {p1, v2}, Ll/ۖۢ۠;->֫(ILjava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const-string v2, "fields_count"

    invoke-static {p1, v2}, Ll/ۖۢ۠;->֫(ILjava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    const-string v2, "methods_count"

    invoke-static {p1, v2}, Ll/ۖۢ۠;->֫(ILjava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result p1

    :goto_0
    if-ge v0, p1, :cond_1

    .line 116
    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result v2

    .line 144
    iget v3, p0, Ll/ۖۢ۠;->֫:I

    invoke-virtual {v1, v3}, Ll/ܶ֨۠;->ܿ(I)I

    move-result v3

    .line 145
    iget v4, p0, Ll/ۖۢ۠;->֫:I

    add-int/lit8 v4, v4, 0x4

    iput v4, p0, Ll/ۖۢ۠;->֫:I

    .line 118
    iget-object v4, p0, Ll/ۖۢ۠;->ܽ:Ll/᩶ۢ۠;

    .line 153
    new-instance v5, Ll/ۡܽܳ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 118
    invoke-virtual {v4, v2, v5}, Ll/᩶ۢ۠;->ܽ(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "Module"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    if-le v3, v2, :cond_0

    .line 119
    iget-object p1, p0, Ll/ۖۢ۠;->ܽ:Ll/᩶ۢ۠;

    invoke-virtual {p0}, Ll/ۖۢ۠;->֫()C

    move-result v0

    .line 151
    new-instance v1, Ll/᩶۫᩷;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 119
    invoke-virtual {p1, v0, v1}, Ll/᩶ۢ۠;->ۧ(ILl/۬ܶ۠;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 122
    :cond_0
    iget v2, p0, Ll/ۖۢ۠;->֫:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/ۖۢ۠;->֫:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 125
    :cond_1
    new-instance p1, Ll/ܺۢ۠;

    const-string v0, "no Module attribute"

    .line 54
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 125
    throw p1

    .line 106
    :cond_2
    new-instance v0, Ll/ܺۢ۠;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid access flags for module: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v1, p1}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 106
    throw v0

    .line 99
    :cond_3
    new-instance v0, Ll/ܺۢ۠;

    const-string v1, "bad major version number for module: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 54
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 99
    throw v0

    .line 94
    :cond_4
    new-instance p1, Ll/ܺۢ۠;

    const-string v0, "illegal.start.of.class.file"

    .line 54
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 94
    throw p1
.end method
