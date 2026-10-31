.class public final Ll/ۗۨ᩷;
.super Ljava/lang/Object;
.source "V1EH"

# interfaces
.implements Ll/ܰܿܽ;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ll/᩺ۖܽ;

.field public ܽ:Ll/ۧۘܽ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩺ۖܽ;)V
    .locals 1

    .line 718
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 719
    iput-object p1, p0, Ll/ۗۨ᩷;->֫:Ljava/lang/String;

    .line 720
    new-instance p1, Ll/ۧۘܽ;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ll/ۧۘܽ;-><init>(Z)V

    iput-object p1, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    .line 721
    invoke-virtual {p2}, Ll/᩺ۖܽ;->ܽ()V

    .line 722
    iput-object p2, p0, Ll/ۗۨ᩷;->ۧ:Ll/᩺ۖܽ;

    .line 723
    invoke-virtual {p1, p2}, Ll/ۧۘܽ;->setOutput(Ljava/io/Writer;)V

    const-string p2, "utf-8"

    const/4 v0, 0x0

    .line 724
    invoke-virtual {p1, p2, v0}, Ll/ۧۘܽ;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public final text(Ljava/lang/String;)V
    .locals 1

    .line 761
    iget-object v0, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    invoke-virtual {v0, p1}, Ll/ۧۘܽ;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۤۜܽ;)Ll/ۙۨ᩷;
    .locals 5

    .line 728
    iget-object v0, p0, Ll/ۗۨ᩷;->ۧ:Ll/᩺ۖܽ;

    invoke-virtual {v0}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۨۖܽ;->length()I

    move-result v1

    const v2, 0xc800

    iget-object v3, p0, Ll/ۗۨ᩷;->֫:Ljava/lang/String;

    iget-object v4, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    if-le v1, v2, :cond_1

    .line 729
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܿۧ()Ljava/io/BufferedOutputStream;

    move-result-object v1

    .line 730
    :try_start_0
    invoke-virtual {v0}, Ll/᩺ۖܽ;->֫()Ll/ۨۖܽ;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۛۖܽ;->֫(Ljava/io/OutputStream;Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 731
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 732
    invoke-virtual {v4}, Ll/ۧۘܽ;->֫()Ll/᩵ۘܽ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p3}, Ll/᩵ۘܽ;->֫(Ll/ۤۜܽ;)V

    .line 733
    invoke-virtual {p2, p3}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    .line 734
    invoke-virtual {p3}, Ll/ۤۜܽ;->ᩳ()V

    .line 735
    invoke-virtual {p3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    array-length v0, v0

    const/16 v1, 0x5000

    if-le v0, v1, :cond_0

    .line 736
    invoke-virtual {p3}, Ll/ۤۜܽ;->ᩴ()V

    .line 738
    :cond_0
    new-instance p3, Ll/ۙۨ᩷;

    .line 595
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 596
    iput-object v3, p3, Ll/ۙۨ᩷;->ܽ:Ljava/lang/String;

    .line 597
    iput-object p1, p3, Ll/ۙۨ᩷;->ܿ:Ll/ܶ᩵ܿ;

    .line 598
    iput-object p2, p3, Ll/ۙۨ᩷;->֫:Ll/ܶ᩵ܿ;

    return-object p3

    :catchall_0
    move-exception p1

    .line 729
    :try_start_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 740
    :cond_1
    new-instance p1, Ll/ۙۨ᩷;

    invoke-virtual {v0}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4}, Ll/ۧۘܽ;->֫()Ll/᩵ۘܽ;

    move-result-object p3

    .line 601
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 602
    iput-object v3, p1, Ll/ۙۨ᩷;->ܽ:Ljava/lang/String;

    .line 603
    iput-object p2, p1, Ll/ۙۨ᩷;->ܳ:Ljava/lang/String;

    .line 604
    iput-object p3, p1, Ll/ۙۨ᩷;->᩻:Ll/᩵ۘܽ;

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 751
    iget-object v0, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۧۘܽ;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 756
    iget-object v0, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Ll/ۧۘܽ;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 746
    iget-object v0, p0, Ll/ۗۨ᩷;->ܽ:Ll/ۧۘܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۧۘܽ;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void
.end method
