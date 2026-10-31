.class public final Ll/ۢۧ᩻;
.super Ll/ܺۘܳ;
.source "K250"


# static fields
.field public static final ۡ֫:Ll/ܽۜܳ;

.field public static final ۢ֫:Ll/ܽۜܳ;

.field public static final ᩷֫:Ll/ܽۜܳ;


# instance fields
.field public ۜ֫:Ll/ܽۜܳ;

.field public ۧ֫:Z

.field public ܳ֫:Ll/ܿ᩹ܿ;

.field public ܽ֫:Ll/ܶ᩵ܿ;

.field public ܿ֫:Z

.field public ᩳ֫:Z

.field public ᩻֫:Ll/ۘܶܿ;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 38
    invoke-static {}, Ll/᩺֨ۢ;->ۧ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ֨ۢ;

    .line 39
    iget-object v3, v1, Ll/ۨ֨ۢ;->ۧ:Ljava/lang/String;

    const-string v4, "everybody"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 40
    iget v0, v1, Ll/ۨ֨ۢ;->ᩳ:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_0
    new-instance v1, Ll/ܽۜܳ;

    const/16 v3, 0x41b0

    invoke-direct {v1, v3, v2, v0}, Ll/ܽۜܳ;-><init>(III)V

    sput-object v1, Ll/ۢۧ᩻;->᩷֫:Ll/ܽۜܳ;

    .line 45
    new-instance v1, Ll/ܽۜܳ;

    const v3, 0x81b0

    invoke-direct {v1, v3, v2, v0}, Ll/ܽۜܳ;-><init>(III)V

    sput-object v1, Ll/ۢۧ᩻;->ۢ֫:Ll/ܽۜܳ;

    .line 46
    new-instance v1, Ll/ܽۜܳ;

    const v3, 0xa1b0

    invoke-direct {v1, v3, v2, v0}, Ll/ܽۜܳ;-><init>(III)V

    sput-object v1, Ll/ۢۧ᩻;->ۡ֫:Ll/ܽۜܳ;

    return-void
.end method

.method public constructor <init>(Ll/ۘܶܿ;)V
    .locals 9

    .line 107
    iget-object v1, p1, Ll/ۘܶܿ;->᩻:Ljava/lang/String;

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-string v2, "/storage"

    const/4 v3, 0x0

    const-wide/16 v4, -0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 108
    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۧ᩻;->ܽ֫:Ll/ܶ᩵ܿ;

    .line 109
    iput-object p1, p0, Ll/ۢۧ᩻;->᩻֫:Ll/ۘܶܿ;

    .line 110
    sget-object p1, Ll/ۢۧ᩻;->᩷֫:Ll/ܽۜܳ;

    iput-object p1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 10

    .line 58
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿ֫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v4

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v0

    const/4 v9, 0x1

    xor-int/lit8 v8, v0, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ll/ܺۘܳ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 59
    iput-object p1, p0, Ll/ۢۧ᩻;->ܽ֫:Ll/ܶ᩵ܿ;

    .line 60
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/data/adb/ksu/modules.img"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۗۧ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ll/ܺۘܳ;->֫(J)V

    .line 63
    :cond_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩹֫()Z

    move-result v0

    sget-object v1, Ll/ۢۧ᩻;->᩷֫:Ll/ܽۜܳ;

    if-eqz v0, :cond_1

    .line 64
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿ()Ll/ۡܶܿ;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ll/ۡܶܿ;->ܳܽ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 66
    invoke-virtual {v0}, Ll/ۡܶܿ;->֫ܽ()Ll/ۘܶܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۧ᩻;->᩻֫:Ll/ۘܶܿ;

    .line 67
    iput-object v1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-void

    .line 71
    :cond_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۗ֫()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۢۧ᩻;->ܿ֫:Z

    .line 72
    sget-object v2, Ll/ۢۧ᩻;->ۢ֫:Ll/ܽۜܳ;

    if-eqz v0, :cond_3

    .line 74
    :try_start_0
    new-instance v0, Ll/ܽۜܳ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢ()Ll/ۧ᩹ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩹ܿ;->ۨۧ()Ll/ܿ᩹ܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۧ᩻;->ܳ֫:Ll/ܿ᩹ܿ;

    invoke-direct {v0, p1}, Ll/ܽۜܳ;-><init>(Ll/ܿ᩹ܿ;)V

    iput-object v0, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    .line 76
    invoke-virtual {p0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    iput-object v1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-void

    .line 79
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_4

    .line 0
    instance-of v0, p1, Ll/۬۠ܿ;

    if-eqz v0, :cond_4

    .line 80
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬۠ܿ;->᩶ۧ()Ll/ۧ᩹ܿ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 82
    invoke-virtual {v0}, Ll/ۧ᩹ܿ;->ۛۧ()Ll/ܿ᩹ܿ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 84
    new-instance p1, Ll/ܽۜܳ;

    invoke-direct {p1, v0}, Ll/ܽۜܳ;-><init>(Ll/ܿ᩹ܿ;)V

    iput-object p1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-void

    .line 0
    :cond_4
    instance-of v0, p1, Ll/۬ܶܿ;

    if-eqz v0, :cond_5

    .line 90
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩻()Ll/۬ܶܿ;

    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ll/۬ܶܿ;->ۡܽ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 92
    iput-boolean v9, p0, Ll/ۢۧ᩻;->ᩳ֫:Z

    .line 93
    new-instance v0, Ll/ܽۜܳ;

    invoke-virtual {p1}, Ll/۬ܶܿ;->᩷ܽ()Ll/ۗܶܿ;

    move-result-object p1

    .line 303
    invoke-virtual {p1}, Ll/ۗܶܿ;->ᩳ()I

    move-result v3

    invoke-virtual {p1}, Ll/ۗܶܿ;->ܳ()I

    move-result v4

    invoke-virtual {p1}, Ll/ۗܶܿ;->֫()I

    move-result p1

    invoke-direct {v0, v3, v4, p1}, Ll/ܽۜܳ;-><init>(III)V

    .line 93
    iput-object v0, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    .line 96
    :cond_5
    iget-boolean p1, p0, Ll/ۢۧ᩻;->ᩳ֫:Z

    if-nez p1, :cond_8

    .line 97
    invoke-virtual {p0}, Ll/ܺۘܳ;->۬()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 98
    sget-object p1, Ll/ۢۧ᩻;->ۡ֫:Ll/ܽۜܳ;

    iput-object p1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-void

    .line 100
    :cond_6
    invoke-virtual {p0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    move-object v1, v2

    :goto_1
    iput-object v1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    :cond_8
    return-void
.end method

.method public static ۧ(Ll/ܽۜܳ;)Z
    .locals 1

    .line 228
    sget-object v0, Ll/ۢۧ᩻;->᩷֫:Ll/ܽۜܳ;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/ۢۧ᩻;->ۢ֫:Ll/ܽۜܳ;

    if-eq p0, v0, :cond_1

    sget-object v0, Ll/ۢۧ᩻;->ۡ֫:Ll/ܽۜܳ;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_5

    .line 207
    const-class v0, Ll/ۢۧ᩻;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 209
    :cond_1
    iget-boolean v0, p0, Ll/ۢۧ᩻;->ۧ֫:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 211
    :cond_2
    invoke-super {p0, p1}, Ll/ܺۘܳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 213
    :cond_3
    check-cast p1, Ll/ۢۧ᩻;

    .line 215
    iget-boolean v0, p1, Ll/ۢۧ᩻;->ۧ֫:Z

    if-eqz v0, :cond_4

    goto :goto_0

    .line 217
    :cond_4
    iget-object v0, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    iget-object p1, p1, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 222
    invoke-super {p0}, Ll/ܺۘܳ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 223
    iget-object v1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܽۜܳ;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ֨ۧ()Ll/ܽۜܳ;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    return-object v0
.end method

.method public final ֫(Ll/ܽۜܳ;)V
    .locals 0

    .line 200
    iput-object p1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    const/4 p1, 0x1

    .line 201
    iput-boolean p1, p0, Ll/ۢۧ᩻;->ۧ֫:Z

    return-void
.end method

.method public final ۜ()Z
    .locals 4

    const/4 v0, 0x1

    .line 145
    iget-object v1, p0, Ll/ۢۧ᩻;->ܳ֫:Ll/ܿ᩹ܿ;

    if-eqz v1, :cond_1

    .line 146
    invoke-virtual {v1}, Ll/ܿ᩹ܿ;->ܿ()C

    move-result v2

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Ll/ܿ᩹ܿ;->ܽ()C

    move-result v1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public final ۠ۧ()I
    .locals 1

    .line 137
    invoke-virtual {p0}, Ll/ۢۧ᩻;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x6

    return v0

    .line 140
    :cond_0
    invoke-super {p0}, Ll/ܺۘܳ;->۠ۧ()I

    move-result v0

    return v0
.end method

.method public final ܳ()V
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۢۧ᩻;->ܽ֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۧ᩻;->ܽ֫:Ll/ܶ᩵ܿ;

    return-void
.end method

.method public final ܶۧ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ۢۧ᩻;->ܽ֫:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ܽ()Ll/ۘܶܿ;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۢۧ᩻;->᩻֫:Ll/ۘܶܿ;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۢۧ᩻;->᩻֫:Ll/ۘܶܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 191
    iget-boolean v0, p0, Ll/ۢۧ᩻;->ᩳ֫:Z

    return v0
.end method

.method public final ᩸()Ljava/lang/CharSequence;
    .locals 5

    .line 172
    iget-object v0, p0, Ll/ۢۧ᩻;->᩻֫:Ll/ۘܶܿ;

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, v0, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    return-object v0

    .line 175
    :cond_0
    sget-boolean v0, Ll/᩶ۖ᩷;->ۧ:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_4

    .line 187
    iget-boolean v0, p0, Ll/ۢۧ᩻;->ܿ֫:Z

    iget-boolean v1, p0, Ll/ۢۧ᩻;->ᩳ֫:Z

    if-nez v0, :cond_1

    if-eqz v1, :cond_4

    .line 175
    :cond_1
    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ܿ֡ܿ;->ᩳ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩵᩸ܿ;->֫(Ljava/lang/String;)Ll/ۘ᩸ܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 178
    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_3

    goto :goto_0

    .line 181
    :cond_3
    new-instance v0, Landroid/text/SpannableString;

    iget-object v1, p0, Ll/ۢۧ᩻;->ۜ֫:Ll/ܽۜܳ;

    invoke-virtual {v1}, Ll/ܽۜܳ;->ܳ()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 182
    new-instance v1, Landroid/text/style/TypefaceSpan;

    const-string v2, "monospace"

    invoke-direct {v1, v2}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/SpannableString;->length()I

    move-result v2

    const/16 v3, 0x12

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    return-object v0

    :cond_4
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩸֫()Z
    .locals 4

    .line 154
    iget-object v0, p0, Ll/ۢۧ᩻;->ܳ֫:Ll/ܿ᩹ܿ;

    if-eqz v0, :cond_1

    .line 155
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ܿ()C

    move-result v1

    const/16 v2, 0x2d

    if-eq v1, v2, :cond_1

    const/16 v3, 0x6c

    if-eq v1, v3, :cond_0

    goto :goto_0

    .line 160
    :cond_0
    invoke-virtual {v0}, Ll/ܿ᩹ܿ;->ܽ()C

    move-result v0

    if-eq v0, v2, :cond_1

    goto :goto_0

    .line 166
    :cond_1
    invoke-super {p0}, Ll/ܺۘܳ;->᩸֫()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/ܺۘܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/proc/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
