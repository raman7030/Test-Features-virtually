.class public abstract Ll/ۛۗۚ;
.super Ljava/lang/Object;
.source "842E"


# instance fields
.field public ֫:Ll/᩶ۗۚ;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ll/ۖ۬ۚ;


# direct methods
.method public constructor <init>(Ll/ۘ۬ۚ;Ll/᩸۬ۚ;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۗۚ;->ۧ:Ljava/util/ArrayList;

    .line 45
    invoke-virtual {p0, p1, p2}, Ll/ۛۗۚ;->֫(Ll/ۘ۬ۚ;Ll/᩸۬ۚ;)Ll/᩶ۗۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    return-void
.end method


# virtual methods
.method public abstract ֫(Ll/ۘ۬ۚ;Ll/᩸۬ۚ;)Ll/᩶ۗۚ;
.end method

.method public final ֫()V
    .locals 3

    .line 96
    iget-object v0, p0, Ll/ۛۗۚ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻۬ۚ;

    .line 97
    instance-of v2, v2, Ll/ᩳ۬ۚ;

    if-eqz v2, :cond_0

    return-void

    .line 102
    :cond_1
    new-instance v1, Ll/ᩳ۬ۚ;

    invoke-direct {v1}, Ll/ᩳ۬ۚ;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final varargs ֫(Ll/ܺ۬ۚ;I[Ljava/lang/String;)V
    .locals 4

    .line 72
    array-length v0, p3

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۛۗۚ;->֫:Ll/᩶ۗۚ;

    if-lt p2, v0, :cond_1

    .line 74
    sget-object p2, Ll/ܺ۬ۚ;->᩶:Ll/ܺ۬ۚ;

    if-ne p1, p2, :cond_0

    const-string p1, "-f requires argument <file>"

    goto :goto_0

    :cond_0
    const-string p1, "-d requires argument <directory>"

    :goto_0
    new-array p2, v1, [Ljava/lang/Object;

    invoke-virtual {v2, p1, p2}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 77
    :cond_1
    aget-object p2, p3, p2

    .line 78
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 79
    sget-object v0, Ll/ܺ۬ۚ;->᩹:Ll/ܺ۬ۚ;

    const/4 v3, 0x1

    if-ne p1, v0, :cond_3

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-array p1, v3, [Ljava/lang/Object;

    aput-object p2, p1, v1

    const-string p2, "The output directory \"{0}\" does not exist"

    .line 80
    invoke-virtual {v2, p2, p1}, Ll/᩶ۗۚ;->֫(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 83
    :cond_3
    :goto_1
    iget-object v0, p0, Ll/ۛۗۚ;->ܽ:Ll/ۖ۬ۚ;

    if-nez v0, :cond_4

    .line 84
    new-instance v0, Ll/ۖ۬ۚ;

    .line 48
    invoke-direct {v0}, Ll/ۘ۬ۚ;-><init>()V

    .line 84
    iput-object v0, p0, Ll/ۛۗۚ;->ܽ:Ll/ۖ۬ۚ;

    .line 86
    :cond_4
    sget-object v0, Ll/ۤۗۚ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    if-eq p1, v3, :cond_6

    const/4 p2, 0x2

    if-eq p1, p2, :cond_5

    return-void

    .line 91
    :cond_5
    iget-object p1, p0, Ll/ۛۗۚ;->ܽ:Ll/ۖ۬ۚ;

    invoke-virtual {p1, p3}, Ll/ۖ۬ۚ;->֫(Ljava/io/File;)V

    invoke-virtual {v2, p1}, Ll/᩶ۗۚ;->֫(Ll/ۖ۬ۚ;)V

    return-void

    .line 88
    :cond_6
    iget-object p1, p0, Ll/ۛۗۚ;->ܽ:Ll/ۖ۬ۚ;

    new-instance p3, Ljava/io/File;

    const-string v0, "."

    invoke-direct {p3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3, p2}, Ll/ۖ۬ۚ;->֫(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ll/᩶ۗۚ;->֫(Ll/ۖ۬ۚ;)V

    return-void
.end method
