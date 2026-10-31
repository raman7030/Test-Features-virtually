.class public final Ll/᩹ᩳۜ;
.super Ll/᩺ۖܽ;
.source "S776"


# instance fields
.field public ۙ:C

.field public final ᩶:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1180
    invoke-direct {p0}, Ll/᩺ۖܽ;-><init>()V

    const/high16 v0, 0x100000

    .line 1181
    iput v0, p0, Ll/᩹ᩳۜ;->᩶:I

    return-void
.end method

.method private ֫(IILjava/lang/CharSequence;)V
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_0

    .line 1244
    invoke-interface {p3, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Ll/᩹ᩳۜ;->ۧ(C)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ۧ(C)V
    .locals 2

    .line 1255
    iget-char v0, p0, Ll/᩹ᩳۜ;->ۙ:C

    if-eqz v0, :cond_1

    .line 1256
    invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1257
    iput-char v1, p0, Ll/᩹ᩳۜ;->ۙ:C

    return-void

    .line 1260
    :cond_0
    iput-char v1, p0, Ll/᩹ᩳۜ;->ۙ:C

    .line 1262
    :cond_1
    invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1263
    iput-char p1, p0, Ll/᩹ᩳۜ;->ۙ:C

    .line 1265
    :cond_2
    iget p1, p0, Ll/᩹ᩳۜ;->᩹:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩹ᩳۜ;->᩹:I

    .line 1266
    iget v0, p0, Ll/᩹ᩳۜ;->᩶:I

    if-gt p1, v0, :cond_3

    return-void

    .line 1267
    :cond_3
    new-instance p1, Ll/᩺ᩳۜ;

    .line 1272
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 1267
    throw p1
.end method


# virtual methods
.method public final append(C)Ljava/io/Writer;
    .locals 0

    .line 1224
    invoke-direct {p0, p1}, Ll/᩹ᩳۜ;->ۧ(C)V

    .line 1225
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->append(C)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    const/4 v0, 0x0

    .line 1231
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1232
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    .line 1238
    :cond_0
    invoke-direct {p0, p2, p3, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1239
    invoke-super {p0, p1, p2, p3}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    .line 1224
    invoke-direct {p0, p1}, Ll/᩹ᩳۜ;->ۧ(C)V

    .line 1225
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->append(C)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    const/4 v0, 0x0

    .line 1231
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1232
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    .line 1238
    :cond_0
    invoke-direct {p0, p2, p3, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1239
    invoke-super {p0, p1, p2, p3}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    return-object p0
.end method

.method public final write(I)V
    .locals 1

    int-to-char v0, p1

    .line 1186
    invoke-direct {p0, v0}, Ll/᩹ᩳۜ;->ۧ(C)V

    .line 1187
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->write(I)V

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 1193
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1194
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->write(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 1

    if-eqz p1, :cond_0

    add-int v0, p2, p3

    .line 1201
    invoke-direct {p0, p2, v0, p1}, Ll/᩹ᩳۜ;->֫(IILjava/lang/CharSequence;)V

    .line 1202
    invoke-super {p0, p1, p2, p3}, Ll/᩺ۖܽ;->write(Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method public final write([C)V
    .locals 3

    if-eqz p1, :cond_1

    .line 1217
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1250
    aget-char v2, p1, v1

    invoke-direct {p0, v2}, Ll/᩹ᩳۜ;->ۧ(C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1218
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۖܽ;->write([C)V

    :cond_1
    return-void
.end method

.method public final write([CII)V
    .locals 3

    if-eqz p1, :cond_1

    add-int v0, p2, p3

    move v1, p2

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1250
    aget-char v2, p1, v1

    invoke-direct {p0, v2}, Ll/᩹ᩳۜ;->ۧ(C)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1210
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺ۖܽ;->write([CII)V

    :cond_1
    return-void
.end method
