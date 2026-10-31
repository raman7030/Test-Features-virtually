.class public final Ll/ۨۘܽ;
.super Ljava/lang/Object;
.source "NATX"

# interfaces
.implements Ljava/io/Serializable;
.implements Lbin/mt/plugin/api/regex/Pattern;


# static fields
.field public static final serialVersionUID:J = 0x4667d56b6e49020dL


# instance fields
.field public ᩶:Ljava/lang/String;

.field public volatile transient ᩸:Ll/֫֡ܽ;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .line 1453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit16 v0, p2, -0x400

    if-nez v0, :cond_1

    .line 1457
    iput-object p1, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    and-int/lit16 v0, p2, 0x100

    if-eqz v0, :cond_0

    or-int/lit8 p2, p2, 0x40

    .line 1458
    :cond_0
    iput p2, p0, Ll/ۨۘܽ;->᩹:I

    .line 1459
    invoke-static {p2, p1}, Ll/᩷ᩴܽ;->֫(ILjava/lang/String;)Ll/֫֡ܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    return-void

    .line 1455
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown flag 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, p2}, Ll/ܰۗ;->֫(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p2

    .line 1455
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1443
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1444
    iget-object p1, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    iget v0, p0, Ll/ۨۘܽ;->᩹:I

    invoke-static {v0, p1}, Ll/᩷ᩴܽ;->֫(ILjava/lang/String;)Ll/֫֡ܽ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/util/regex/PatternSyntaxException;)Landroid/text/SpannableStringBuilder;
    .locals 4

    .line 1633
    invoke-virtual {p0}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1634
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    const/16 v1, 0xa

    .line 1635
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    .line 1637
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v2

    :cond_0
    if-eq v2, v3, :cond_1

    .line 1639
    new-instance p0, Landroid/text/style/TypefaceSpan;

    const-string v1, "monospace"

    invoke-direct {p0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/16 v3, 0x21

    invoke-virtual {v0, p0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1640
    new-instance p0, Landroid/text/style/RelativeSizeSpan;

    const v1, 0x3f4ccccd    # 0.8f

    invoke-direct {p0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v0, p0, v2, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_1
    return-object v0
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۨۘܽ;
    .locals 1

    .line 1034
    new-instance v0, Ll/ۨۘܽ;

    invoke-direct {v0, p1, p0}, Ll/ۨۘܽ;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۨۘܽ;
    .locals 2

    .line 1009
    new-instance v0, Ll/ۨۘܽ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۨۘܽ;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "\\E"

    .line 1414
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const-string v2, "\\Q"

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    .line 0
    invoke-static {v2, p0, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1418
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    const v5, 0x7ffffff7

    sub-int v6, v5, v4

    if-ge v4, v6, :cond_1

    shl-int/lit8 v5, v4, 0x1

    .line 0
    :cond_1
    invoke-static {v5, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v4, 0x0

    .line 1426
    :cond_2
    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    const-string v4, "\\E\\\\E\\Q"

    .line 1427
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v1, 0x2

    .line 1429
    invoke-virtual {p0, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v3, :cond_2

    .line 1431
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, p0, v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 1432
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1433
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final flags()I
    .locals 1

    .line 1119
    iget-object v0, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    if-nez v0, :cond_0

    .line 1120
    iget v0, p0, Ll/ۨۘܽ;->᩹:I

    return v0

    :cond_0
    iget v0, v0, Ll/֫֡ܽ;->ۧ:I

    return v0
.end method

.method public final bridge synthetic matcher(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/regex/Matcher;
    .locals 0

    .line 804
    invoke-virtual {p0, p1}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p1

    return-object p1
.end method

.method public final matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;
    .locals 1

    .line 1062
    invoke-virtual {p0}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    .line 1085
    instance-of v0, p1, Ll/ۙۘܽ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙۘܽ;

    invoke-interface {p1}, Ll/ۙۘܽ;->ۧ()Ljava/lang/CharSequence;

    move-result-object p1

    .line 1086
    :cond_0
    new-instance v0, Ll/۫ۘܽ;

    invoke-direct {v0, p0, p1}, Ll/۫ۘܽ;-><init>(Ll/ۨۘܽ;Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public final pattern()Ljava/lang/String;
    .locals 1

    .line 1044
    iget-object v0, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1057
    iget-object v0, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ll/֫֡ܽ;
    .locals 3

    .line 1648
    iget-object v1, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    if-nez v1, :cond_1

    move-object v0, p0

    .line 1650
    monitor-enter v0

    .line 1651
    :try_start_0
    iget-object v1, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    if-nez v1, :cond_0

    .line 1652
    iget-object v1, p0, Ll/ۨۘܽ;->᩶:Ljava/lang/String;

    iget v2, p0, Ll/ۨۘܽ;->᩹:I

    invoke-static {v2, v1}, Ll/᩷ᩴܽ;->֫(ILjava/lang/String;)Ll/֫֡ܽ;

    move-result-object v1

    iput-object v1, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    .line 1653
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-object v1
.end method

.method public final ֫(I)Z
    .locals 1

    if-lez p1, :cond_0

    .line 1102
    invoke-virtual {p0}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֫֡ܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ll/۟ۘܽ;
    .locals 1

    .line 1109
    invoke-virtual {p0}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/֫֡ܽ;->ܺ:Ll/۟ۘܽ;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 1094
    invoke-virtual {p0}, Ll/ۨۘܽ;->֫()Ll/֫֡ܽ;

    move-result-object v0

    iget-boolean v0, v0, Ll/֫֡ܽ;->ܽ:Z

    return v0
.end method

.method public final ܿ()Ljava/util/Map;
    .locals 1

    .line 1659
    iget-object v0, p0, Ll/ۨۘܽ;->᩸:Ll/֫֡ܽ;

    if-nez v0, :cond_0

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    .line 1660
    :cond_0
    iget-object v0, v0, Ll/֫֡ܽ;->ۜ:Ljava/util/Map;

    return-object v0
.end method

.method public final ᩳ()Ljava/util/Map;
    .locals 1

    .line 1665
    invoke-virtual {p0}, Ll/ۨۘܽ;->ܿ()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
