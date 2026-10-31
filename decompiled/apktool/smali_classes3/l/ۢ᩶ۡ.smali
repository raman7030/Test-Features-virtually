.class public final Ll/ۢ᩶ۡ;
.super Ljava/lang/Object;
.source "BBKO"


# static fields
.field public static final ۚ:Ljava/util/logging/Logger;


# instance fields
.field public ֡:F

.field public ֫:F

.field public ۖ:F

.field public final ۘ:Ljava/util/HashMap;

.field public final ۜ:Ljava/util/HashSet;

.field public ۡ:Ll/ۧ᩶ۡ;

.field public final ۢ:Ljava/util/HashSet;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public ܳ:Z

.field public final ܺ:Ll/֡᩶ۡ;

.field public ܽ:Ljava/text/DecimalFormat;

.field public ܿ:Z

.field public ᩳ:Ljava/lang/String;

.field public final ᩴ:Ljava/util/HashMap;

.field public ᩵:[F

.field public final ᩷:Ljava/util/ArrayList;

.field public final ᩻:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SvgTree"

    .line 59
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/ۢ᩶ۡ;->ۚ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    .line 69
    iput v0, p0, Ll/ۢ᩶ۡ;->֡:F

    .line 70
    iput v0, p0, Ll/ۢ᩶ۡ;->֫:F

    .line 71
    new-instance v0, Ll/֡᩶ۡ;

    invoke-direct {v0}, Ll/֡᩶ۡ;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ܺ:Ll/֡᩶ۡ;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 73
    iput v0, p0, Ll/ۢ᩶ۡ;->ۖ:F

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->᩷:Ljava/util/ArrayList;

    .line 87
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->᩻:Ljava/util/HashMap;

    .line 92
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ۜ:Ljava/util/HashSet;

    .line 97
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ۢ:Ljava/util/HashSet;

    .line 103
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ۧ:Ljava/util/LinkedHashMap;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ۘ:Ljava/util/HashMap;

    .line 116
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۢ᩶ۡ;->ᩴ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;D)D
    .locals 4

    const-string v0, "%"

    .line 385
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    mul-double v0, v0, p1

    return-wide v0

    .line 389
    :cond_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final ֫(D)Ljava/lang/String;
    .locals 4

    .line 482
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ܽ:Ljava/text/DecimalFormat;

    if-nez v0, :cond_4

    .line 293
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩵:[F

    const/high16 v1, -0x40800000    # -1.0f

    if-nez v0, :cond_0

    const/high16 v2, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    aget v2, v0, v2

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x3

    .line 297
    aget v1, v0, v1

    .line 485
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-double v0, v0

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    rsub-int/lit8 v0, v0, 0x4

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-lez v0, :cond_3

    const/4 v2, 0x6

    if-le v0, v2, :cond_2

    const/4 v0, 0x6

    :cond_2
    const/16 v2, 0x2e

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_3

    const/16 v3, 0x23

    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 47
    :cond_3
    new-instance v0, Ljava/text/DecimalFormat;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/text/DecimalFormatSymbols;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {v2, v3}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    invoke-direct {v0, v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 48
    sget-object v1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 485
    iput-object v0, p0, Ll/ۢ᩶ۡ;->ܽ:Ljava/text/DecimalFormat;

    .line 487
    :cond_4
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ܽ:Ljava/text/DecimalFormat;

    .line 473
    invoke-virtual {v0, p1, p2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۗᩳۘ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳ᩶ۡ;)Ll/ۧ᩶ۡ;
    .locals 1

    .line 465
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    invoke-virtual {v0, p1}, Ll/ۧ᩶ۡ;->ۧ(Ll/ܳ᩶ۡ;)Ll/ۧ᩶ۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/ArrayList;[B)Lorg/w3c/dom/Document;
    .locals 0

    .line 206
    iput-object p1, p0, Ll/ۢ᩶ۡ;->ᩳ:Ljava/lang/String;

    .line 208
    :try_start_0
    invoke-static {p2, p3}, Ll/ۙ᩶ۡ;->֫(Ljava/util/ArrayList;[B)Lorg/w3c/dom/Document;

    move-result-object p1
    :try_end_0
    .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 210
    new-instance p2, Ljava/lang/Error;

    const-string p3, "Internal error"

    invoke-direct {p2, p3, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final ֫()V
    .locals 3

    .line 227
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "file: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۢ᩶ۡ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۢ᩶ۡ;->ۚ:Ljava/util/logging/Logger;

    invoke-virtual {v2, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ll/ۧ᩶ۡ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/io/ByteArrayOutputStream;)V
    .locals 6

    .line 491
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    if-eqz v0, :cond_3

    .line 495
    new-instance v0, Ljava/io/OutputStreamWriter;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    const-string p1, "<vector xmlns:android=\"http://schemas.android.com/apk/res/android\""

    .line 496
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string p1, "\n"

    .line 497
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 282
    iget-boolean v1, p0, Ll/ۢ᩶ۡ;->ܿ:Z

    const-string v2, "    "

    if-eqz v1, :cond_0

    .line 499
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "xmlns:aapt=\"http://schemas.android.com/aapt\""

    .line 500
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 501
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 504
    :cond_0
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "android:width=\""

    .line 505
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 165
    iget v1, p0, Ll/ۢ᩶ۡ;->֡:F

    .line 506
    iget v3, p0, Ll/ۢ᩶ۡ;->ۖ:F

    mul-float v1, v1, v3

    float-to-double v4, v1

    invoke-virtual {p0, v4, v5}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "dp\""

    .line 507
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 508
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 509
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v4, "android:height=\""

    .line 510
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 169
    iget v4, p0, Ll/ۢ᩶ۡ;->֫:F

    mul-float v4, v4, v3

    float-to-double v3, v4

    .line 511
    invoke-virtual {p0, v3, v4}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 512
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 513
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 515
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "android:viewportWidth=\""

    .line 516
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 293
    iget-object v1, p0, Ll/ۢ᩶ۡ;->᩵:[F

    const/high16 v3, -0x40800000    # -1.0f

    if-nez v1, :cond_1

    const/high16 v1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    aget v1, v1, v4

    :goto_0
    float-to-double v4, v1

    .line 517
    invoke-virtual {p0, v4, v5}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\""

    .line 518
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 519
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 520
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "android:viewportHeight=\""

    .line 521
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 297
    iget-object v1, p0, Ll/ۢ᩶ۡ;->᩵:[F

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x3

    aget v3, v1, v2

    :goto_1
    float-to-double v1, v3

    .line 522
    invoke-virtual {p0, v1, v2}, Ll/ۢ᩶ۡ;->֫(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    const-string v1, "\">"

    .line 523
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 524
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 216
    new-instance v1, Ll/֡᩶ۡ;

    iget-object v2, p0, Ll/ۢ᩶ۡ;->᩵:[F

    const/4 v3, 0x0

    aget v3, v2, v3

    neg-float v3, v3

    const/4 v4, 0x1

    aget v2, v2, v4

    neg-float v2, v2

    invoke-direct {v1, v3, v2}, Ll/֡᩶ۡ;-><init>(FF)V

    iget-object v2, p0, Ll/ۢ᩶ۡ;->ܺ:Ll/֡᩶ۡ;

    invoke-virtual {v2, v1}, Ll/֡᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    .line 223
    iget-object v1, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    invoke-virtual {v1, v2}, Ll/ۧ᩶ۡ;->ۧ(Ll/֡᩶ۡ;)V

    .line 219
    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "matrix="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ll/ۢ᩶ۡ;->ۚ:Ljava/util/logging/Logger;

    invoke-virtual {v3, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 527
    iget-object v1, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    const-string v2, "  "

    invoke-virtual {v1, v0, v2}, Ll/ۧ᩶ۡ;->֫(Ljava/io/OutputStreamWriter;Ljava/lang/String;)V

    const-string v1, "</vector>"

    .line 528
    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 529
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 531
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->close()V

    return-void

    .line 492
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SvgTree is not fully initialized"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 412
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 445
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V
    .locals 1

    .line 241
    sget-object v0, Ll/᩷᩶ۡ;->᩹:Ll/᩷᩶ۡ;

    invoke-virtual {p0, p1, p2, v0}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;Ll/᩷᩶ۡ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Lorg/w3c/dom/Node;Ll/᩷᩶ۡ;)V
    .locals 1

    .line 249
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ll/ۘܶܺ;->֫(Z)V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 289
    :cond_0
    invoke-static {p2}, Ll/ۙ᩶ۡ;->֫(Lorg/w3c/dom/Node;)Ll/ۗ᩶ۡ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۗ᩶ۡ;->֫()I

    move-result p2

    add-int/lit8 p2, p2, 0x1

    .line 251
    :goto_0
    new-instance v0, Ll/᩻᩶ۡ;

    invoke-direct {v0, p3, p2, p1}, Ll/᩻᩶ۡ;-><init>(Ll/᩷᩶ۡ;ILjava/lang/String;)V

    iget-object p1, p0, Ll/ۢ᩶ۡ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۧ᩶ۡ;)V
    .locals 1

    .line 403
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۢ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܳ᩶ۡ;Ljava/lang/String;)V
    .locals 2

    .line 435
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 436
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    .line 438
    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 439
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 440
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ܳ᩶ۡ;Ll/ۧ᩶ۡ;Ljava/lang/String;)V
    .locals 1

    .line 423
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-static {p2, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Lorg/w3c/dom/Element;)V
    .locals 12

    .line 306
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    move-result-object p1

    .line 307
    invoke-interface {p1}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    move-result v0

    .line 308
    sget-object v1, Ll/ۜ᩶ۡ;->᩶:Ll/ۜ᩶ۡ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v3, v1

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x4

    const/4 v6, 0x2

    if-ge v4, v0, :cond_5

    .line 311
    invoke-interface {p1, v4}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    move-result-object v7

    .line 312
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    .line 313
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 314
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    .line 315
    sget-object v10, Ll/ۜ᩶ۡ;->᩶:Ll/ۜ᩶ۡ;

    .line 316
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    sub-int/2addr v11, v6

    invoke-static {v11, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v7, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const-string v11, "em|ex|px|in|cm|mm|pt|pc"

    .line 317
    invoke-virtual {v6, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    add-int/lit8 v9, v9, -0x2

    goto :goto_1

    :cond_0
    const-string v6, "%"

    .line 319
    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v9, v9, -0x1

    .line 321
    sget-object v10, Ll/ۜ᩶ۡ;->᩹:Ll/ۜ᩶ۡ;

    :cond_1
    :goto_1
    const-string v6, "width"

    .line 324
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 325
    invoke-virtual {v7, v2, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Ll/ۢ᩶ۡ;->֡:F

    move-object v1, v10

    goto :goto_3

    :cond_2
    const-string v6, "height"

    .line 327
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 328
    invoke-virtual {v7, v2, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    iput v3, p0, Ll/ۢ᩶ۡ;->֫:F

    move-object v3, v10

    goto :goto_3

    :cond_3
    const-string v6, "viewBox"

    .line 330
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    new-array v5, v5, [F

    .line 331
    iput-object v5, p0, Ll/ۢ᩶ۡ;->᩵:[F

    const-string v5, "[ ,]+"

    .line 332
    invoke-virtual {v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    .line 333
    :goto_2
    iget-object v7, p0, Ll/ۢ᩶ۡ;->᩵:[F

    array-length v8, v7

    if-ge v6, v8, :cond_4

    .line 334
    aget-object v8, v5, v6

    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    aput v8, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 341
    :cond_5
    iget-object p1, p0, Ll/ۢ᩶ۡ;->᩵:[F

    const/4 v0, 0x3

    const/4 v2, 0x0

    if-nez p1, :cond_6

    iget v4, p0, Ll/ۢ᩶ۡ;->֡:F

    cmpl-float v7, v4, v2

    if-lez v7, :cond_6

    iget v7, p0, Ll/ۢ᩶ۡ;->֫:F

    cmpl-float v8, v7, v2

    if-lez v8, :cond_6

    new-array p1, v5, [F

    .line 342
    iput-object p1, p0, Ll/ۢ᩶ۡ;->᩵:[F

    aput v4, p1, v6

    aput v7, p1, v0

    goto :goto_4

    .line 345
    :cond_6
    iget v4, p0, Ll/ۢ᩶ۡ;->֡:F

    cmpg-float v4, v4, v2

    if-ltz v4, :cond_7

    iget v4, p0, Ll/ۢ᩶ۡ;->֫:F

    cmpg-float v4, v4, v2

    if-gez v4, :cond_8

    :cond_7
    if-eqz p1, :cond_8

    .line 346
    aget v4, p1, v6

    iput v4, p0, Ll/ۢ᩶ۡ;->֡:F

    .line 347
    aget p1, p1, v0

    iput p1, p0, Ll/ۢ᩶ۡ;->֫:F

    .line 350
    :cond_8
    :goto_4
    sget-object p1, Ll/ۜ᩶ۡ;->᩹:Ll/ۜ᩶ۡ;

    const/high16 v4, 0x42c80000    # 100.0f

    if-ne v1, p1, :cond_9

    iget v1, p0, Ll/ۢ᩶ۡ;->֡:F

    cmpl-float v5, v1, v2

    if-lez v5, :cond_9

    .line 351
    iget-object v5, p0, Ll/ۢ᩶ۡ;->᩵:[F

    aget v5, v5, v6

    mul-float v5, v5, v1

    div-float/2addr v5, v4

    iput v5, p0, Ll/ۢ᩶ۡ;->֡:F

    :cond_9
    if-ne v3, p1, :cond_a

    .line 353
    iget p1, p0, Ll/ۢ᩶ۡ;->֫:F

    cmpl-float v1, p1, v2

    if-lez v1, :cond_a

    .line 354
    iget-object v1, p0, Ll/ۢ᩶ۡ;->᩵:[F

    aget v0, v1, v0

    mul-float v0, v0, p1

    div-float/2addr v0, v4

    iput v0, p0, Ll/ۢ᩶ۡ;->֫:F

    :cond_a
    return-void
.end method

.method public final ۖ()V
    .locals 2

    .line 199
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    invoke-virtual {v0}, Ll/ۧ᩶ۡ;->ܽ()V

    .line 200
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    iget-boolean v0, p0, Ll/ۢ᩶ۡ;->ܳ:Z

    if-nez v0, :cond_0

    const-string v0, "No vector content found"

    const/4 v1, 0x0

    .line 201
    invoke-virtual {p0, v0, v1}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;Lorg/w3c/dom/Node;)V

    :cond_0
    return-void
.end method

.method public final ۜ()Ljava/util/Set;
    .locals 1

    .line 455
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۘ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()V
    .locals 1

    const/4 v0, 0x1

    .line 181
    iput-boolean v0, p0, Ll/ۢ᩶ۡ;->ܿ:Z

    return-void
.end method

.method public final ۢ()F
    .locals 1

    .line 165
    iget v0, p0, Ll/ۢ᩶ۡ;->֡:F

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 450
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ᩴ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ۧ()V
    .locals 2

    .line 192
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    new-instance v1, Ll/֡᩶ۡ;

    invoke-direct {v1}, Ll/֡᩶ۡ;-><init>()V

    invoke-virtual {v0, v1}, Ll/ۧ᩶ۡ;->֫(Ll/֡᩶ۡ;)V

    return-void
.end method

.method public final ۧ(Ll/ۧ᩶ۡ;)V
    .locals 0

    .line 232
    iput-object p1, p0, Ll/ۢ᩶ۡ;->ۡ:Ll/ۧ᩶ۡ;

    return-void
.end method

.method public final ۧ(Ll/ܳ᩶ۡ;Ljava/lang/String;)V
    .locals 1

    .line 394
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)D
    .locals 2

    .line 297
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩵:[F

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    aget v0, v0, v1

    :goto_0
    float-to-double v0, v0

    .line 381
    invoke-static {p1, v0, v1}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public final ܳ()F
    .locals 1

    .line 169
    iget v0, p0, Ll/ۢ᩶ۡ;->֫:F

    return v0
.end method

.method public final ܺ()V
    .locals 1

    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Ll/ۢ᩶ۡ;->ܳ:Z

    return-void
.end method

.method public final ܽ()Ljava/util/Set;
    .locals 1

    .line 428
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)Ll/ܳ᩶ۡ;
    .locals 1

    .line 399
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩻:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳ᩶ۡ;

    return-object p1
.end method

.method public final ܿ(Ljava/lang/String;)D
    .locals 2

    .line 293
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩵:[F

    if-nez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    aget v0, v0, v1

    :goto_0
    float-to-double v0, v0

    .line 368
    invoke-static {p1, v0, v1}, Ll/ۢ᩶ۡ;->֫(Ljava/lang/String;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 278
    iget-boolean v0, p0, Ll/ۢ᩶ۡ;->ܳ:Z

    return v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 7

    .line 260
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    return-object v2

    .line 263
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 264
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻᩶ۡ;

    .line 266
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0xa

    .line 267
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 147
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v3, Ll/᩻᩶ۡ;->᩸:Ll/᩷᩶ۡ;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Ll/᩻᩶ۡ;->᩹:I

    if-nez v5, :cond_2

    move-object v5, v2

    goto :goto_1

    :cond_2
    const-string v6, " @ line "

    .line 0
    invoke-static {v5, v6}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 147
    :goto_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v3, Ll/᩻᩶ۡ;->᩶:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 269
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 271
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)Z
    .locals 1

    .line 416
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩷()[F
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۢ᩶ۡ;->᩵:[F

    return-object v0
.end method

.method public final ᩻()Ljava/util/HashSet;
    .locals 1

    .line 408
    iget-object v0, p0, Ll/ۢ᩶ۡ;->ۢ:Ljava/util/HashSet;

    return-object v0
.end method
