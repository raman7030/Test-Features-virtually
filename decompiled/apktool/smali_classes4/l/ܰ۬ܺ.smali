.class public Ll/ܰ۬ܺ;
.super Ll/֡۬ܺ;
.source "C3A0"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final transient ۬:Ll/ۛ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;I)V
    .locals 0

    .line 519
    invoke-direct {p0, p1, p2}, Ll/֡۬ܺ;-><init>(Ll/ۢ۬ܺ;I)V

    .line 652
    sget p1, Ll/ۛ۬ܺ;->᩶:I

    .line 79
    sget-object p1, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    .line 520
    iput-object p1, p0, Ll/ܰ۬ܺ;->۬:Ll/ۛ۬ܺ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 10

    .line 694
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 695
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Comparator;

    .line 696
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v1

    if-ltz v1, :cond_6

    .line 700
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 704
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v6

    if-lez v6, :cond_3

    if-nez v0, :cond_0

    .line 659
    new-instance v7, Ll/۫۬ܺ;

    invoke-direct {v7}, Ll/۫۬ܺ;-><init>()V

    goto :goto_1

    .line 660
    :cond_0
    new-instance v7, Ll/ܿ۫ܺ;

    invoke-direct {v7, v0}, Ll/ܿ۫ܺ;-><init>(Ljava/util/Comparator;)V

    :goto_1
    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_1

    .line 712
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v9}, Ll/۫۬ܺ;->֫(Ljava/lang/Object;)Ll/۫۬ܺ;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 714
    :cond_1
    invoke-virtual {v7}, Ll/۫۬ܺ;->֫()Ll/ۛ۬ܺ;

    move-result-object v7

    .line 715
    invoke-virtual {v7}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ne v8, v6, :cond_2

    .line 718
    invoke-virtual {v2, v5, v7}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 716
    :cond_2
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Duplicate key-value pairs exist for key "

    .line 0
    invoke-static {v5, v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 716
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 707
    :cond_3
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Invalid value count "

    .line 0
    invoke-static {v6, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 707
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 724
    :cond_4
    :try_start_0
    invoke-virtual {v2}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 729
    sget-object v1, Ll/ᩴ۬ܺ;->֫:Ll/ۖۛܺ;

    invoke-virtual {v1, p0, p1}, Ll/ۖۛܺ;->֫(Ll/֡۬ܺ;Ljava/io/Serializable;)V

    .line 730
    sget-object p1, Ll/ᩴ۬ܺ;->ۧ:Ll/ۖۛܺ;

    invoke-virtual {p1, p0, v4}, Ll/ۖۛܺ;->֫(Ll/֡۬ܺ;I)V

    .line 731
    sget-object p1, Ll/᩺۬ܺ;->֫:Ll/ۖۛܺ;

    if-nez v0, :cond_5

    .line 652
    sget v0, Ll/ۛ۬ܺ;->᩶:I

    .line 79
    sget-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    goto :goto_3

    .line 653
    :cond_5
    invoke-static {v0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object v0

    .line 731
    :goto_3
    invoke-virtual {p1, p0, v0}, Ll/ۖۛܺ;->֫(Ll/֡۬ܺ;Ljava/io/Serializable;)V

    return-void

    :catch_0
    move-exception p1

    .line 726
    new-instance v0, Ljava/io/InvalidObjectException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/io/InvalidObjectException;

    throw p1

    .line 698
    :cond_6
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Invalid key count "

    .line 0
    invoke-static {v1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 698
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 670
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 676
    iget-object v0, p0, Ll/ܰ۬ܺ;->۬:Ll/ۛ۬ܺ;

    instance-of v1, v0, Ll/᩻۫ܺ;

    if-eqz v1, :cond_0

    .line 677
    check-cast v0, Ll/᩻۫ܺ;

    .line 567
    iget-object v0, v0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 671
    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 672
    invoke-static {p0, p1}, Ll/ۘۛܺ;->֫(Ll/֡ۤܺ;Ljava/io/ObjectOutputStream;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    .line 62
    invoke-virtual {p0, p1}, Ll/ܰ۬ܺ;->get(Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ll/ۛ۬ܺ;
    .locals 1

    .line 533
    iget-object v0, p0, Ll/֡۬ܺ;->ۙ:Ll/ۢ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۬ܺ;

    .line 534
    iget-object v0, p0, Ll/ܰ۬ܺ;->۬:Ll/ۛ۬ܺ;

    invoke-static {p1, v0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ۬ܺ;

    return-object p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ll/᩺ۗܺ;
    .locals 0

    .line 62
    invoke-virtual {p0, p1}, Ll/ܰ۬ܺ;->get(Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p1

    return-object p1
.end method
