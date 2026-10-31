.class public final Ll/ۗᩴ۠;
.super Ll/۫᩹۠;
.source "Y43E"


# static fields
.field public static final ᩳ:[Ljava/lang/String;


# instance fields
.field public final ֫:Ll/ۙ᩹۠;

.field public ۧ:I

.field public final ܽ:Ljava/io/PrintWriter;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    const-string v9, "                  "

    const-string v10, "                    "

    const-string v0, ""

    const-string v1, "  "

    const-string v2, "    "

    const-string v3, "      "

    const-string v4, "        "

    const-string v5, "          "

    const-string v6, "            "

    const-string v7, "              "

    const-string v8, "                "

    .line 718
    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۗᩴ۠;->ᩳ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/io/PrintWriter;Ll/᩸ۖ۠;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    .line 100
    iput-object p2, p0, Ll/ۗᩴ۠;->֫:Ll/ۙ᩹۠;

    const/4 p1, 0x0

    .line 101
    iput p1, p0, Ll/ۗᩴ۠;->ۧ:I

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ᩹۠;)Ljava/lang/String;
    .locals 2

    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v1

    invoke-interface {v1}, Ll/ۚ᩹۠;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۨ᩸۠;)Ljava/lang/String;
    .locals 3

    .line 513
    invoke-interface {p0}, Ll/ۨ᩸۠;->᩷()Ll/ۖܶ۠;

    move-result-object p0

    .line 514
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    .line 516
    :cond_0
    invoke-static {p0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    new-instance v0, Ll/᩸ܺ֡;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Ll/᩸ܺ֡;-><init>(I)V

    .line 517
    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    const-string v0, " "

    .line 518
    invoke-static {v0, v1, v0}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ܺ᩹۠;)Ljava/lang/String;
    .locals 2

    .line 505
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ֫()V
    .locals 4

    .line 733
    iget v0, p0, Ll/ۗᩴ۠;->ۧ:I

    if-gez v0, :cond_0

    return-void

    .line 738
    :cond_0
    :goto_0
    sget-object v1, Ll/ۗᩴ۠;->ᩳ:[Ljava/lang/String;

    iget-object v2, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    const/16 v3, 0xa

    if-le v0, v3, :cond_1

    .line 739
    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    add-int/lit8 v0, v0, -0xa

    goto :goto_0

    .line 742
    :cond_1
    aget-object v0, v1, v0

    invoke-virtual {v2, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗᩴ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    return-void
.end method

.method private ֫(Ll/ۜ᩹۠;Z)V
    .locals 3

    .line 502
    invoke-interface {p1}, Ll/ۜ᩹۠;->ܽ()Ll/ۖܶ۠;

    move-result-object p1

    .line 503
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 504
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩹᩷ܳ;

    invoke-direct {v0, p0}, Ll/᩹᩷ܳ;-><init>(Ll/ۗᩴ۠;)V

    .line 505
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    const-string v0, "<"

    const-string v1, ">"

    const-string v2, ", "

    .line 506
    invoke-static {v2, v0, v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 504
    iget-object v0, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string p1, " "

    .line 508
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/ܰ᩸۠;)V
    .locals 14

    .line 604
    invoke-interface {p1}, Ll/ܰ᩸۠;->getParameters()Ll/ۖܶ۠;

    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v1

    if-eqz v1, :cond_9

    const-string v2, " "

    const-string v3, "..."

    .line 607
    const-class v4, Ll/ᩴ᩹۠;

    const-string v5, "Var-args parameter is not an array type: "

    const/4 v6, 0x1

    iget-object v7, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-eq v1, v6, :cond_6

    .line 630
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x1

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۘ᩹۠;

    if-ne v9, v11, :cond_0

    .line 632
    iget v11, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/2addr v11, v6

    iput v11, p0, Ll/ۗᩴ۠;->ۧ:I

    :cond_0
    if-le v9, v6, :cond_1

    .line 635
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    .line 637
    :cond_1
    invoke-direct {p0, v10}, Ll/ۗᩴ۠;->ۧ(Ll/ۨ᩸۠;)V

    if-ne v9, v1, :cond_3

    .line 639
    invoke-interface {p1}, Ll/ܰ᩸۠;->֡()Z

    move-result v11

    if-eqz v11, :cond_3

    .line 640
    invoke-interface {v10}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v11

    .line 641
    invoke-interface {v11}, Ll/ۚ᩹۠;->֫()Ll/֡᩹۠;

    move-result-object v12

    sget-object v13, Ll/֡᩹۠;->᩹:Ll/֡᩹۠;

    if-ne v12, v13, :cond_2

    .line 643
    invoke-virtual {v4, v11}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩴ᩹۠;

    invoke-interface {v11}, Ll/ᩴ᩹۠;->ܿ()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 645
    invoke-virtual {v7, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_1

    .line 642
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 647
    :cond_3
    invoke-interface {v10}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 648
    :goto_1
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v10}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-ge v9, v1, :cond_4

    const-string v10, ","

    .line 651
    invoke-virtual {v7, v10}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 218
    :cond_5
    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result p1

    if-lt p1, v11, :cond_9

    .line 657
    iget p1, p0, Ll/ۗᩴ۠;->ۧ:I

    sub-int/2addr p1, v6

    iput p1, p0, Ll/ۗᩴ۠;->ۧ:I

    return-void

    .line 612
    :cond_6
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ᩹۠;

    .line 613
    invoke-direct {p0, v1}, Ll/ۗᩴ۠;->ۧ(Ll/ۨ᩸۠;)V

    .line 615
    invoke-interface {p1}, Ll/ܰ᩸۠;->֡()Z

    move-result v6

    if-eqz v6, :cond_8

    .line 616
    invoke-interface {v1}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v6

    .line 617
    invoke-interface {v6}, Ll/ۚ᩹۠;->֫()Ll/֡᩹۠;

    move-result-object v8

    sget-object v9, Ll/֡᩹۠;->᩹:Ll/֡᩹۠;

    if-ne v8, v9, :cond_7

    .line 619
    invoke-virtual {v4, v6}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴ᩹۠;

    invoke-interface {v6}, Ll/ᩴ᩹۠;->ܿ()Ll/ۙ֨֨;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 620
    invoke-virtual {v7, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_3

    .line 618
    :cond_7
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 622
    :cond_8
    invoke-interface {v1}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 623
    :goto_3
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    return-void
.end method

.method private ۧ(Ll/ۨ᩸۠;)V
    .locals 10

    .line 449
    invoke-interface {p1}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object v0

    .line 450
    sget-object v1, Ll/᩺᩸۠;->ᩳ֫:Ll/᩺᩸۠;

    iget-object v2, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-eq v0, v1, :cond_4

    sget-object v1, Ll/᩺᩸۠;->ܳ֫:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_0

    goto/16 :goto_1

    .line 522
    :cond_0
    invoke-interface {p1}, Ll/ۨ᩸۠;->᩷()Ll/ۖܶ۠;

    move-result-object v1

    .line 523
    invoke-virtual {v1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫᩸۠;

    .line 539
    iget-object v4, p0, Ll/ۗᩴ۠;->֫:Ll/ۙ᩹۠;

    check-cast v4, Ll/᩸ۖ۠;

    invoke-virtual {v4, v3}, Ll/᩸ۖ۠;->֫(Ll/۫᩸۠;)Ll/᩶᩹۠;

    move-result-object v4

    sget-object v5, Ll/᩶᩹۠;->᩶:Ll/᩶᩹۠;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    .line 553
    invoke-interface {v3}, Ll/۫᩸۠;->֫()Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    .line 554
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_2

    .line 555
    invoke-interface {v3}, Ll/۫᩸۠;->ᩳ()Ll/᩵᩹۠;

    move-result-object v5

    .line 556
    invoke-interface {v5}, Ll/᩵᩹۠;->۠()Ll/᩶֡֨;

    move-result-object v5

    .line 558
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 559
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۤ᩸۠;

    .line 566
    invoke-interface {v5}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object v8

    sget-object v9, Ll/᩺᩸۠;->᩹:Ll/᩺᩸۠;

    if-ne v8, v9, :cond_2

    .line 568
    invoke-interface {v5}, Ll/ۨ᩸۠;->ܺ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ܶ᩹۠;->ۧ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 569
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ne v8, v7, :cond_2

    .line 570
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰ᩸۠;

    .line 571
    invoke-interface {v5}, Ll/ܰ᩸۠;->ᩳ()Ll/ۙ֨֨;

    move-result-object v7

    .line 573
    invoke-interface {v5}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v8, "value"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 574
    invoke-interface {v7}, Ll/ۚ᩹۠;->֫()Ll/֡᩹۠;

    move-result-object v5

    sget-object v7, Ll/֡᩹۠;->᩹:Ll/֡᩹۠;

    if-ne v5, v7, :cond_2

    .line 580
    new-instance v5, Ll/᩶ᩴ۠;

    invoke-direct {v5, p0}, Ll/᩶ᩴ۠;-><init>(Ll/ۗᩴ۠;)V

    .line 107
    invoke-interface {v4, v5}, Ll/ۤ᩸۠;->֫(Ll/ۛ᩸۠;)Ljava/lang/Object;

    move-result-object v4

    .line 593
    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_2
    if-nez v6, :cond_1

    .line 526
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    .line 527
    invoke-virtual {v2, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 455
    :cond_3
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    goto :goto_2

    .line 452
    :cond_4
    :goto_1
    invoke-static {p1}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 458
    :goto_2
    sget-object v1, Ll/᩺᩸۠;->۫:Ll/᩺᩸۠;

    if-eq v0, v1, :cond_7

    sget-object v1, Ll/᩺᩸۠;->ܳ֫:Ll/᩺᩸۠;

    if-ne v0, v1, :cond_5

    goto/16 :goto_4

    .line 461
    :cond_5
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 462
    invoke-interface {p1}, Ll/ۨ᩸۠;->ܳ()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 464
    sget-object v3, Ll/ܶᩴ۠;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_3

    .line 477
    :pswitch_0
    sget-object p1, Ll/֫᩹۠;->ۙ:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    .line 471
    :pswitch_1
    sget-object p1, Ll/֫᩹۠;->ۙ:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 472
    sget-object p1, Ll/֫᩹۠;->᩹:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 473
    sget-object p1, Ll/֫᩹۠;->ۨ:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    .line 467
    :pswitch_2
    sget-object p1, Ll/֫᩹۠;->᩹:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_3

    .line 482
    :pswitch_3
    invoke-interface {p1}, Ll/ۨ᩸۠;->ۜ()Ll/ۨ᩸۠;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 484
    invoke-interface {p1}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺᩸۠;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 485
    sget-object p1, Ll/֫᩹۠;->ۛ:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 486
    sget-object p1, Ll/֫᩹۠;->᩹:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 487
    sget-object p1, Ll/֫᩹۠;->᩺:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 488
    sget-object p1, Ll/֫᩹۠;->ۙ:Ll/֫᩹۠;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 493
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    .line 494
    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ܿ᩶ܳ;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ll/ܿ᩶ܳ;-><init>(I)V

    .line 495
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    const-string v0, ""

    const-string v1, " "

    .line 496
    invoke-static {v1, v0, v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 494
    invoke-virtual {v2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_7
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public final ֫(Ll/֡֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 330
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    .line 332
    invoke-virtual {p1}, Ll/֡֡֨;->ۙ֫()Z

    move-result p2

    iget-object v0, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-nez p2, :cond_3

    .line 1021
    iget-object p2, p1, Ll/֡֡֨;->۟:Ljava/util/EnumSet;

    sget-object v1, Ll/ᩴ֡֨;->ۙ:Ll/ᩴ֡֨;

    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "open "

    .line 334
    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 336
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "module "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 471
    iget-object v1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 336
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 337
    iget p2, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Ll/ۗᩴ۠;->ۧ:I

    .line 1045
    invoke-virtual {p1}, Ll/ۛ֡֨;->᩸()V

    .line 1051
    iget-object p2, p1, Ll/֡֡֨;->ܺ֫:Ll/ۜ֡֨;

    sget-object v1, Ll/ۜ֡֨;->ܶ:Ll/ۜ֡֨;

    if-eq p2, v1, :cond_1

    .line 1053
    iput-object v1, p1, Ll/֡֡֨;->ܺ֫:Ll/ۜ֡֨;

    .line 1054
    invoke-interface {p2, p1}, Ll/ۜ֡֨;->֫(Ll/ۛ֡֨;)V

    .line 1047
    :cond_1
    iget-object p1, p1, Ll/֡֡֨;->ۨ:Ll/ۖܶ۠;

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 338
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۧ᩹۠;

    .line 349
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    .line 350
    new-instance v1, Ll/ۙᩴ۠;

    invoke-direct {v1, v0}, Ll/ۙᩴ۠;-><init>(Ljava/io/PrintWriter;)V

    .line 227
    invoke-interface {p2, v1}, Ll/ۧ᩹۠;->֫(Ll/ᩳ᩹۠;)V

    const-string p2, ";"

    .line 351
    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 341
    :cond_2
    iget p1, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۗᩴ۠;->ۧ:I

    const-string p1, "}"

    .line 342
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0

    :cond_3
    const-string p1, "// Unnamed module"

    .line 344
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ֫(Ll/ۘ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 122
    invoke-virtual {p1}, Ll/ۘ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object p2

    .line 124
    sget-object v0, Ll/᩺᩸۠;->ۜ֫:Ll/᩺᩸۠;

    if-eq p2, v0, :cond_a

    sget-object v0, Ll/᩺᩸۠;->ۨ:Ll/᩺᩸۠;

    if-eq p2, v0, :cond_a

    .line 126
    invoke-interface {p1}, Ll/ۨ᩸۠;->ۜ()Ll/ۨ᩸۠;

    move-result-object v0

    .line 129
    sget-object v1, Ll/᩺᩸۠;->ۗ:Ll/᩺᩸۠;

    if-ne p2, v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v1, Ll/᩻᩹۠;->᩹:Ll/᩻᩹۠;

    new-instance v2, Ll/᩹ᩴ۠;

    .line 83
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v3, 0x0

    .line 110
    invoke-interface {v0, v2, v3}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_0

    goto/16 :goto_2

    .line 141
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    const/4 v0, 0x1

    .line 142
    invoke-direct {p0, p1, v0}, Ll/ۗᩴ۠;->֫(Ll/ۜ᩹۠;Z)V

    .line 144
    sget-object v1, Ll/ܶᩴ۠;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const-string v1, " "

    const/4 v2, 0x2

    iget-object v3, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-eq p2, v0, :cond_2

    if-eq p2, v2, :cond_1

    goto :goto_0

    .line 151
    :cond_1
    invoke-interface {p1}, Ll/ܰ᩸۠;->ᩳ()Ll/ۙ֨֨;

    move-result-object p2

    invoke-interface {p2}, Ll/ۚ᩹۠;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 153
    invoke-interface {p1}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_0

    .line 147
    :cond_2
    invoke-interface {p1}, Ll/ۨ᩸۠;->ۜ()Ll/ۨ᩸۠;

    move-result-object p2

    invoke-interface {p2}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    :goto_0
    const-string p2, "("

    .line 157
    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 158
    invoke-direct {p0, p1}, Ll/ۗᩴ۠;->֫(Ll/ܰ᩸۠;)V

    const-string p2, ")"

    .line 159
    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    invoke-interface {p1}, Ll/ܰ᩸۠;->ۖ()Ll/ۡۘ֨;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 162
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, " default "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 689
    :cond_3
    invoke-interface {p1}, Ll/ܰ᩸۠;->֨()Ll/ۖܶ۠;

    move-result-object p1

    .line 218
    invoke-virtual {p1}, Ll/ۖܶ۠;->ۧ()I

    move-result p2

    if-eqz p2, :cond_9

    const-string v4, " throws"

    .line 692
    invoke-virtual {v3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 695
    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚ᩹۠;

    if-ne v4, v0, :cond_4

    .line 697
    invoke-virtual {v3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_4
    if-ne v4, v2, :cond_5

    .line 700
    iget v6, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/2addr v6, v0

    iput v6, p0, Ll/ۗᩴ۠;->ۧ:I

    :cond_5
    if-lt v4, v2, :cond_6

    .line 703
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    .line 705
    :cond_6
    invoke-virtual {v3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    if-eq v4, p2, :cond_7

    const-string v5, ", "

    .line 708
    invoke-virtual {v3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_8
    if-lt p2, v2, :cond_9

    .line 714
    iget p1, p0, Ll/ۗᩴ۠;->ۧ:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ۗᩴ۠;->ۧ:I

    :cond_9
    const-string p1, ";"

    .line 165
    invoke-virtual {v3, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_a
    :goto_2
    return-object p0
.end method

.method public final ֫(Ll/ۙ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 313
    iget-object p2, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    .line 723
    iget-object p1, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 313
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final bridge synthetic ֫(Ll/ۛ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public final ֫(Ll/۠֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 320
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    .line 321
    invoke-virtual {p1}, Ll/۠֡֨;->ۙ֫()Z

    move-result p2

    iget-object v0, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-nez p2, :cond_0

    .line 322
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "package "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1167
    iget-object p1, p1, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 322
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ";"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0

    :cond_0
    const-string p1, "// Unnamed package"

    .line 324
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ֫(Ll/۫֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 294
    invoke-interface {p1}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object v0

    .line 295
    invoke-virtual {p0, p1, p2}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    .line 297
    sget-object p2, Ll/᩺᩸۠;->۫:Ll/᩺᩸۠;

    iget-object v1, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-ne v0, p2, :cond_0

    .line 298
    invoke-interface {p1}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    return-object p0

    .line 300
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Ll/ۨ᩸۠;->᩵()Ll/ۙ֨֨;

    move-result-object v0

    invoke-interface {v0}, Ll/ۚ᩹۠;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ll/ۨ᩸۠;->ᩴ()Ll/ۤܶ۠;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 301
    invoke-virtual {p1}, Ll/۫֡֨;->᩶֫()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string p2, " = "

    .line 303
    invoke-virtual {v1, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 304
    iget-object p2, p0, Ll/ۗᩴ۠;->֫:Ll/ۙ᩹۠;

    check-cast p2, Ll/᩸ۖ۠;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    invoke-static {p1}, Ll/᩹֨۠;->֫(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 304
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_1
    const-string p1, ";"

    .line 306
    invoke-virtual {v1, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ֫(Ll/ܳ֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    .line 173
    invoke-virtual {p1}, Ll/ܳ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object p2

    .line 174
    invoke-virtual {p1}, Ll/ܳ֡֨;->۬֫()Ll/᩻᩹۠;

    move-result-object v0

    .line 176
    sget-object v1, Ll/᩻᩹۠;->᩹:Ll/᩻᩹۠;

    const-string v2, ";\n"

    const-string v3, ")"

    const-string v4, "("

    const/4 v5, 0x0

    iget-object v6, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-ne v1, v0, :cond_2

    const-string v0, "new "

    .line 180
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 186
    invoke-virtual {v0, v5}, Ll/ۖܶ۠;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    goto :goto_0

    .line 1257
    :cond_0
    invoke-virtual {p1}, Ll/ܳ֡֨;->ۛ֫()Ll/ۙ֨֨;

    move-result-object v1

    .line 188
    invoke-virtual {v6, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 190
    :goto_0
    invoke-virtual {v6, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object v0

    .line 199
    invoke-static {v0}, Ll/ܶ᩹۠;->֫(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 202
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸۠;

    invoke-direct {p0, v0}, Ll/ۗᩴ۠;->֫(Ll/ܰ᩸۠;)V

    .line 204
    :cond_1
    invoke-virtual {v6, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 206
    :cond_2
    sget-object v1, Ll/᩻᩹۠;->ۗ:Ll/᩻᩹۠;

    if-ne v0, v1, :cond_3

    .line 207
    iget-object v0, p0, Ll/ۗᩴ۠;->֫:Ll/ۙ᩹۠;

    check-cast v0, Ll/᩸ۖ۠;

    invoke-virtual {v0, p1}, Ll/᩸ۖ۠;->֫(Ll/ܳ֡֨;)Ll/۠֡֨;

    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ll/۠֡֨;->ۙ֫()Z

    move-result v1

    if-nez v1, :cond_3

    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "package "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1167
    iget-object v0, v0, Ll/۠֡֨;->ۛ:Ll/ۤܶ۠;

    .line 209
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 212
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Ll/ۗᩴ۠;->֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V

    .line 214
    sget-object v0, Ll/ܶᩴ۠;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    .line 219
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 45
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 219
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const-string v0, "@interface"

    .line 216
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :goto_1
    const-string v0, " "

    .line 221
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 723
    iget-object v0, p1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 222
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 224
    invoke-direct {p0, p1, v5}, Ll/ۗᩴ۠;->֫(Ll/ۜ᩹۠;Z)V

    .line 226
    sget-object v0, Ll/᩺᩸۠;->ܿ֫:Ll/᩺᩸۠;

    const-string v1, ", "

    if-ne p2, v0, :cond_5

    .line 228
    invoke-virtual {v6, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 229
    invoke-virtual {p1}, Ll/ܳ֡֨;->ۤ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 230
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v4, Ll/ܳ֫֨;

    invoke-direct {v4, p0}, Ll/ܳ֫֨;-><init>(Ll/ۗᩴ۠;)V

    .line 231
    invoke-interface {v0, v4}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 232
    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v4

    invoke-interface {v0, v4}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 229
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v6, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 237
    :cond_5
    sget-object v0, Ll/᩺᩸۠;->ۙ:Ll/᩺᩸۠;

    const-string v3, " extends "

    if-ne p2, v0, :cond_6

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ۛ֫()Ll/ۙ֨֨;

    move-result-object v0

    .line 239
    invoke-interface {v0}, Ll/ۚ᩹۠;->֫()Ll/֡᩹۠;

    move-result-object v4

    sget-object v7, Ll/֡᩹۠;->ۧ֫:Ll/֡᩹۠;

    if-eq v4, v7, :cond_6

    .line 240
    move-object v4, v0

    check-cast v4, Ll/᩵᩹۠;

    .line 241
    invoke-interface {v4}, Ll/᩵᩹۠;->۠()Ll/᩶֡֨;

    move-result-object v4

    check-cast v4, Ll/ۡ᩹۠;

    .line 242
    invoke-interface {v4}, Ll/ۡ᩹۠;->᩻()Ll/ۙ֨֨;

    move-result-object v4

    invoke-interface {v4}, Ll/ۚ᩹۠;->֫()Ll/֡᩹۠;

    move-result-object v4

    if-eq v4, v7, :cond_6

    .line 243
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 664
    :cond_6
    invoke-virtual {p1}, Ll/ܳ֡֨;->֫()Ll/᩺᩸۠;

    move-result-object v0

    .line 666
    sget-object v4, Ll/᩺᩸۠;->᩹:Ll/᩺᩸۠;

    if-eq v0, v4, :cond_8

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ۗ֫()Ll/ۖܶ۠;

    move-result-object v4

    .line 668
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_8

    .line 669
    invoke-virtual {v0}, Ll/᩺᩸۠;->֫()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v3, " implements "

    :cond_7
    invoke-virtual {v6, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 670
    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/ܽۧۢ;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Ll/ܽۧۢ;-><init>(I)V

    .line 671
    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 672
    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v3

    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 670
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1635
    :cond_8
    iget-object v0, p1, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    new-instance v3, Ll/᩺ۜܳ;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ll/᩺ۜܳ;-><init>(I)V

    invoke-virtual {v0, v3}, Ll/ۖܶ۠;->֫(Ljava/util/function/Function;)Ll/ۖܶ۠;

    move-result-object v0

    .line 679
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, " permits "

    .line 680
    invoke-virtual {v6, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 682
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/ۜ۠ۢ;

    const/4 v4, 0x6

    invoke-direct {v3, v4}, Ll/ۜ۠ۢ;-><init>(I)V

    .line 683
    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 684
    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 681
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_9
    :goto_2
    const-string v0, " {"

    .line 250
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 251
    iget v0, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۗᩴ۠;->ۧ:I

    .line 253
    sget-object v0, Ll/᩺᩸۠;->۬:Ll/᩺᩸۠;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_e

    .line 254
    new-instance p2, Ljava/util/ArrayList;

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object p1

    .line 254
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 256
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 257
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ᩸۠;

    .line 258
    invoke-interface {v3}, Ll/ۨ᩸۠;->֫()Ll/᩺᩸۠;

    move-result-object v4

    sget-object v7, Ll/᩺᩸۠;->۫:Ll/᩺᩸۠;

    if-ne v4, v7, :cond_a

    .line 259
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 261
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 263
    :goto_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v5, v0, :cond_c

    .line 264
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩸۠;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    invoke-interface {v0, p0, v3}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ","

    .line 265
    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 267
    :cond_c
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩸۠;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 96
    invoke-interface {v0, p0, v3}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    invoke-virtual {v6, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 270
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 273
    :cond_d
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۨ᩸۠;

    .line 110
    invoke-interface {p2, p0, v1}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 277
    :cond_e
    sget-object v0, Ll/᩺᩸۠;->ܿ֫:Ll/᩺᩸۠;

    if-eq p2, v0, :cond_f

    .line 1257
    invoke-virtual {p1}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object p1

    goto :goto_6

    :cond_f
    invoke-virtual {p1}, Ll/ܳ֡֨;->ܺ()Ll/ۖܶ۠;

    move-result-object p1

    .line 280
    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/᩸ᩴ۠;

    invoke-direct {p2, p0}, Ll/᩸ᩴ۠;-><init>(Ll/ۗᩴ۠;)V

    .line 281
    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 282
    invoke-interface {p1}, Ll/ܿ᩺ᩴ;->toList()Ljava/util/List;

    move-result-object p1

    .line 277
    :goto_6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۨ᩸۠;

    .line 110
    invoke-interface {p2, p0, v1}, Ll/ۨ᩸۠;->֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    .line 286
    :cond_10
    iget p1, p0, Ll/ۗᩴ۠;->ۧ:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۗᩴ۠;->ۧ:I

    .line 287
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    const-string p1, "}"

    .line 288
    invoke-virtual {v6, p1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ֫(Ll/᩸֡֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 91
    check-cast p2, Ljava/lang/Boolean;

    return-object p0
.end method

.method public final ֫(Ll/ۨ᩸۠;Ljava/lang/Boolean;)V
    .locals 3

    .line 106
    iget-object v0, p0, Ll/ۗᩴ۠;->ܽ:Ljava/io/PrintWriter;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 107
    invoke-virtual {v0}, Ljava/io/PrintWriter;->println()V

    .line 428
    :cond_0
    iget-object p2, p0, Ll/ۗᩴ۠;->֫:Ll/ۙ᩹۠;

    check-cast p2, Ll/᩸ۖ۠;

    invoke-virtual {p2, p1}, Ll/᩸ۖ۠;->ۧ(Ll/ۨ᩸۠;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 432
    new-instance v1, Ljava/util/StringTokenizer;

    const-string v2, "\n\r"

    invoke-direct {v1, p2, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    const-string p2, "/**"

    .line 435
    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 437
    :goto_0
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 438
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    const-string p2, " *"

    .line 439
    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 440
    invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto :goto_0

    .line 443
    :cond_1
    invoke-direct {p0}, Ll/ۗᩴ۠;->֫()V

    const-string p2, " */"

    .line 444
    invoke-virtual {v0, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    :cond_2
    invoke-direct {p0, p1}, Ll/ۗᩴ۠;->ۧ(Ll/ۨ᩸۠;)V

    return-void
.end method
