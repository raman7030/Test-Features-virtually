.class public Ll/ۛܿ᩻;
.super Ll/ۛܶۢ;
.source "7AHA"


# instance fields
.field public ۖ֫:Ll/ۗۢ᩻;

.field public ܺ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 81
    invoke-direct {p0}, Ll/ۛܶۢ;-><init>()V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛܿ᩻;->ܺ֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Lbin/mt/plus/Main;Ll/ܽۢܳ;Ll/ܽۢܳ;Ll/ܿ۠ۢ;)V
    .locals 0

    .line 128
    invoke-virtual {p0, p2}, Ll/ۘ۠ۢ;->ۧ(Ll/ܽۢܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۛܿ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    .line 129
    invoke-virtual {p2, p1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 130
    invoke-virtual {p2}, Ll/ܽۢܳ;->ۖ֫()V

    :cond_0
    return-void
.end method

.method public final ۘ֫()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "targetPath"

    .line 92
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֨(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120a2c

    .line 655
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ۨܺ᩷;
    .locals 1

    .line 87
    sget-object v0, Ll/᩻ܶۢ;->ܿ:Ll/ۨܺ᩷;

    return-object v0
.end method

.method public final ۢ()Ll/ܿ۠ۢ;
    .locals 10

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->᩵(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 105
    invoke-virtual {p0, v1}, Ll/ۘ۠ۢ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->֫֫()Ll/ܰܺܳ;

    move-result-object v2

    check-cast v2, Ll/ۗۢ᩻;

    iput-object v2, p0, Ll/ۛܿ᩻;->ۖ֫:Ll/ۗۢ᩻;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 107
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_1

    .line 108
    invoke-virtual {p0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 109
    invoke-static {}, Ll/ܿ۠ۢ;->ܿ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0

    .line 111
    :cond_0
    aget-object v4, v0, v3

    .line 112
    invoke-static {v4}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 113
    invoke-virtual {p0, v5}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    add-int/lit8 v3, v3, 0x1

    int-to-long v6, v3

    .line 114
    array-length v8, v0

    int-to-long v8, v8

    invoke-virtual {p0, v6, v7, v8, v9}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    .line 115
    invoke-static {v1, v5}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 117
    :try_start_0
    iget-object v7, p0, Ll/ۛܿ᩻;->ۖ֫:Ll/ۗۢ᩻;

    invoke-virtual {v7, v4, v6}, Ll/ۗۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    iget-object v4, p0, Ll/ۛܿ᩻;->ܺ֫:Ljava/util/ArrayList;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v0

    .line 119
    new-instance v1, Ljava/lang/Exception;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v5, v3, v2

    const v2, 0x7f1203ad

    invoke-static {v2, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 123
    :cond_1
    invoke-static {}, Ll/ܿ۠ۢ;->ܳ()Ll/ܿ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܿ۠ۢ;)V
    .locals 0

    .line 136
    iget-object p1, p0, Ll/ۛܿ᩻;->ۖ֫:Ll/ۗۢ᩻;

    invoke-virtual {p1}, Ll/ۗۢ᩻;->ۘ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    const v0, 0x7f120647

    .line 97
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->ۡ(I)V

    const-string v0, "..."

    .line 98
    invoke-virtual {p0, v0}, Ll/ۘ۠ۢ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method
