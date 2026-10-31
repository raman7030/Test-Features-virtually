.class public final Ll/ۢۢܳ;
.super Ljava/lang/Object;
.source "M292"


# instance fields
.field public ֫:Z

.field public ۧ:Ljava/lang/String;

.field public final ܽ:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;)V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 13
    iput-object v0, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 16
    iput-object p1, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    sget-object v1, Ll/᩷ۢܳ;->᩻:Ll/᩻ۢܳ;

    sget-object v2, Ll/᩷ۢܳ;->ۜ:Ll/ۜۢܳ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "/"

    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v3, ""

    const/16 v4, 0x42

    const/4 v5, 0x1

    if-eqz v0, :cond_1

    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v5, :cond_3

    .line 82
    :try_start_0
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 83
    new-instance v0, Ll/ܿۢܳ;

    invoke-direct {v0, p0}, Ll/ܿۢܳ;-><init>(Ljava/util/regex/Matcher;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    const-string v0, "!/"

    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v5, 0x2

    if-le v0, v5, :cond_3

    .line 93
    :try_start_1
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    .line 94
    new-instance v0, Ll/ۚۡܳ;

    invoke-direct {v0, p0}, Ll/ۚۡܳ;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-object v0, v1

    goto :goto_1

    :cond_2
    const-string v0, "!"

    .line 101
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v5, :cond_3

    .line 103
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 104
    new-instance v0, Ll/ܳۢܳ;

    invoke-direct {v0, p0}, Ll/ܳۢܳ;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_0
    move-object v0, v2

    goto :goto_1

    .line 109
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    .line 110
    new-instance v0, Ll/۠ۡܳ;

    invoke-direct {v0, p0}, Ll/۠ۡܳ;-><init>(Ljava/lang/Object;)V

    :goto_1
    if-ne v0, v1, :cond_5

    .line 113
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_5
    if-ne v0, v2, :cond_6

    return-object p1

    .line 117
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 119
    invoke-interface {v1}, Ll/ᩳۜܳ;->ܺۧ()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_2

    .line 121
    :cond_8
    invoke-interface {v0, v1}, Ll/᩷ۢܳ;->֫(Ll/ᩳۜܳ;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 122
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 36
    iget-boolean v0, p0, Ll/ۢۢܳ;->֫:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Ll/ۢۢܳ;->֫:Z

    const-string v0, ""

    .line 39
    iput-object v0, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 40
    iget-object v0, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۛ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 41
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۘܳ;->ᩴ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 70
    iput-object p1, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 71
    iget-object v0, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ۢۢܳ;->֫(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->֫(Ljava/util/List;)V

    .line 72
    iget-object p1, v0, Ll/ܽۢܳ;->ۡ֫:Ll/۫ۢܳ;

    invoke-virtual {p1}, Ll/۫ۢܳ;->ܿ()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Z)V
    .locals 0

    .line 62
    iput-boolean p2, p0, Ll/ۢۢܳ;->֫:Z

    .line 63
    iput-object p1, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 64
    iget-object p1, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ۛ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 65
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۘܳ;->᩹()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/֫᩷ܳ;)V
    .locals 1

    .line 54
    iget-boolean v0, p1, Ll/֫᩷ܳ;->֫:Z

    iput-boolean v0, p0, Ll/ۢۢܳ;->֫:Z

    .line 55
    iget-object p1, p1, Ll/֫᩷ܳ;->ۧ:Ljava/lang/String;

    iput-object p1, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 56
    iget-object p1, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {p1}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۘܳ;->᩹()V

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 20
    iget-boolean v0, p0, Ll/ۢۢܳ;->֫:Z

    if-eq v0, p1, :cond_1

    .line 21
    iput-boolean p1, p0, Ll/ۢۢܳ;->֫:Z

    const-string v0, ""

    .line 22
    iput-object v0, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    .line 24
    iget-object v0, p0, Ll/ۢۢܳ;->ܽ:Ll/ܽۢܳ;

    if-nez p1, :cond_0

    .line 25
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۢ()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܽۢܳ;->֫(Ljava/util/List;)V

    .line 26
    iget-object p1, v0, Ll/ܽۢܳ;->ۡ֫:Ll/۫ۢܳ;

    invoke-virtual {p1}, Ll/۫ۢܳ;->ܿ()V

    .line 29
    :cond_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۛ()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 30
    invoke-virtual {v0}, Ll/ܽۢܳ;->ۗ()Ll/ۢۘܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۘܳ;->᩹()V

    :cond_1
    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۢۢܳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Ll/ۢۢܳ;->֫:Z

    return v0
.end method
