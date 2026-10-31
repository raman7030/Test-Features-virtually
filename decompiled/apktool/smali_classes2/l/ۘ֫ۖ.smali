.class public final Ll/ۘ֫ۖ;
.super Ljava/lang/Object;
.source "OBBK"


# static fields
.field public static final ۧ:Ll/ܰۤܺ;


# instance fields
.field public final ֫:Ll/۠֫ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0, v0}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v0

    sput-object v0, Ll/ۘ֫ۖ;->ۧ:Ll/ܰۤܺ;

    return-void
.end method

.method public constructor <init>(Ll/۠֫ۖ;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Ll/ۘ֫ۖ;->֫:Ll/۠֫ۖ;

    return-void
.end method

.method public static ֫(Ll/᩶֫ۖ;Ll/ᩴۧۖ;Ll/۠֫ۖ;)V
    .locals 10

    .line 118
    new-instance v0, Ll/ۗ֨۠;

    invoke-direct {v0}, Ll/ۗ֨۠;-><init>()V

    .line 119
    new-instance v1, Ll/᩺᩹۠;

    invoke-direct {v1}, Ll/᩺᩹۠;-><init>()V

    .line 120
    const-class v2, Ll/ܰ᩹۠;

    invoke-virtual {v0, v2, v1}, Ll/ۗ֨۠;->֫(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 121
    invoke-static {v0}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v2

    const-string v3, "allowStringFolding"

    const-string v4, "false"

    invoke-virtual {v2, v3, v4}, Ll/ۨܶ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-static {v0}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v2

    const-string v3, "--enable-preview"

    const-string v4, "true"

    invoke-virtual {v2, v3, v4}, Ll/ۨܶ۠;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    new-instance v2, Ll/ۨܿ۠;

    const/4 v3, 0x1

    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v0, v3, v4}, Ll/ۨܿ۠;-><init>(Ll/ۗ֨۠;ZLjava/nio/charset/Charset;)V

    .line 126
    :try_start_0
    sget-object v3, Ll/᩷᩶۠;->ۨ:Ll/᩷᩶۠;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ll/ۨܿ۠;->֫(Ll/᩷᩶۠;Ljava/lang/Iterable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    new-instance v2, Ll/ۖ֫ۖ;

    const-string v3, "source"

    .line 132
    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    sget-object v4, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-direct {v2, v3, v4, p0}, Ll/ۖ֫ۖ;-><init>(Ljava/net/URI;Ll/ܽ᩶۠;Ll/᩶֫ۖ;)V

    .line 138
    invoke-static {v0}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/ۖ֨۠;->ۧ(Ll/ᩳ᩶۠;)Ll/ᩳ᩶۠;

    .line 139
    invoke-static {v0}, Ll/ܺۘ۠;->֫(Ll/ۗ֨۠;)Ll/ܺۘ۠;

    move-result-object v4

    .line 142
    invoke-virtual {p0}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    .line 88
    invoke-virtual/range {v4 .. v9}, Ll/ܺۘ۠;->֫(Ljava/lang/CharSequence;ZZZZ)Ll/ܳۘ۠;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ll/ܳۘ۠;->ۘ()Ll/֨᩵۠;

    move-result-object v0

    .line 147
    iput-object v2, v0, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    .line 149
    invoke-virtual {p0, v0}, Ll/᩶֫ۖ;->֫(Ll/֨᩵۠;)V

    .line 151
    invoke-virtual {v1}, Ll/᩺᩹۠;->֫()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/ܺ֫ۖ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;Ll/ᩴܶܺ;)Ljava/lang/Iterable;

    move-result-object v1

    .line 152
    invoke-static {v1}, Ll/ۡ۫ܺ;->ܽ(Ljava/lang/Iterable;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 155
    new-instance v1, Ll/ܰ۟ܺ;

    invoke-direct {v1, p0, p1}, Ll/ܰ۟ܺ;-><init>(Ll/᩶֫ۖ;Ll/ᩴۧۖ;)V

    .line 157
    new-instance v2, Ll/ۘۧۖ;

    .line 58
    invoke-virtual {p2}, Ll/۠֫ۖ;->ܽ()Ll/֨֫ۖ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֨֫ۖ;->֫()I

    move-result p2

    .line 157
    invoke-direct {v2, v1, p2}, Ll/ۘۧۖ;-><init>(Ll/ܰ۟ܺ;I)V

    .line 158
    invoke-virtual {v2, v0}, Ll/ۘۧۖ;->֫(Ll/۬ܺ֨;)V

    .line 159
    invoke-virtual {p0}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v1, p0}, Ll/ܰ۟ܺ;->ᩳ(I)V

    .line 160
    invoke-virtual {v1}, Ll/ܰ۟ܺ;->ۜ()V

    .line 161
    new-instance p0, Ll/ᩴ۟ܺ;

    invoke-direct {p0}, Ll/ᩴ۟ܺ;-><init>()V

    invoke-virtual {v1}, Ll/ܰ۟ܺ;->ܿ()Ll/ܳ۬ܺ;

    move-result-object p2

    const/4 v0, 0x0

    .line 375
    invoke-virtual {p2, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object p2

    .line 61
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫۟ܺ;

    .line 62
    invoke-interface {v0, p0}, Ll/۫۟ܺ;->֫(Ll/ᩴ۟ܺ;)V

    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual {p0}, Ll/ᩴ۟ܺ;->֫()Ll/ۘ۟ܺ;

    move-result-object p0

    .line 162
    invoke-virtual {p1}, Ll/ᩴۧۖ;->ܽ()Ll/ۧ۟ܺ;

    move-result-object p2

    new-instance v0, Ll/ۢ۟ܺ;

    invoke-direct {v0}, Ll/ۢ۟ܺ;-><init>()V

    invoke-virtual {p0, p2, v0}, Ll/ۘ۟ܺ;->֫(Ll/ۧ۟ܺ;Ll/ۢ۟ܺ;)Ll/ۢ۟ܺ;

    .line 163
    invoke-virtual {p0, p1}, Ll/ۘ۟ܺ;->֫(Ll/ᩴۧۖ;)V

    .line 164
    invoke-virtual {p1}, Ll/ᩴۧۖ;->ۧ()V

    return-void

    .line 57
    :cond_1
    new-instance p0, Ll/ᩴ֫ۖ;

    new-instance p1, Ll/ܺ۫᩷;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ll/ܺ۫᩷;-><init>(I)V

    .line 58
    invoke-static {v1, p1}, Ll/ۡ۫ܺ;->֫(Ljava/lang/Iterable;Ll/ܽܶܺ;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴ֫ۖ;-><init>(Ljava/lang/Iterable;)V

    .line 153
    throw p0

    :catch_0
    move-exception p0

    .line 129
    new-instance p1, Ljava/io/IOError;

    invoke-direct {p1, p0}, Ljava/io/IOError;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ll/᩷᩺ܺ;Ll/ܿ᩺ܺ;)V
    .locals 6

    .line 191
    invoke-virtual {p1}, Ll/᩷᩺ܺ;->֫()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 204
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 251
    new-instance v1, Ll/᩶֫ۖ;

    invoke-direct {v1, p1}, Ll/᩶֫ۖ;-><init>(Ljava/lang/String;)V

    .line 256
    iget-object v2, p0, Ll/ۘ֫ۖ;->֫:Ll/۠֫ۖ;

    invoke-virtual {v2}, Ll/۠֫ۖ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 257
    invoke-static {v1, v0}, Ll/᩶ۧۖ;->֫(Ll/᩶֫ۖ;Ljava/util/Collection;)Ll/᩶֫ۖ;

    move-result-object v1

    .line 260
    :cond_0
    invoke-static {p1}, Ll/۬۟ܺ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 261
    new-instance v4, Ll/ᩴۧۖ;

    new-instance v5, Ll/֡֫ۖ;

    invoke-direct {v5, v3, v2}, Ll/֡֫ۖ;-><init>(Ljava/lang/String;Ll/۠֫ۖ;)V

    invoke-direct {v4, v3, v1, v5}, Ll/ᩴۧۖ;-><init>(Ljava/lang/String;Ll/᩶֫ۖ;Ll/֡֫ۖ;)V

    .line 264
    :try_start_0
    invoke-static {v1, v4, v2}, Ll/ۘ֫ۖ;->֫(Ll/᩶֫ۖ;Ll/ᩴۧۖ;Ll/۠֫ۖ;)V
    :try_end_0
    .catch Ll/֡۟ܺ; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    invoke-virtual {v1, v0}, Ll/᩶֫ۖ;->֫(Ljava/util/Collection;)Ll/᩹ۨܺ;

    move-result-object v0

    .line 269
    invoke-virtual {v4, v0}, Ll/ᩴۧۖ;->֫(Ll/᩹ۨܺ;)Ll/ܳ۬ܺ;

    move-result-object v0

    .line 238
    invoke-static {p1, v0}, Ll/ᩴۧۖ;->֫(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    invoke-virtual {p2}, Ll/ܿ᩺ܺ;->֫()Ll/᩺ۖܽ;

    move-result-object p2

    .line 98
    invoke-virtual {p2, p1}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-void

    :catch_0
    move-exception p1

    .line 266
    new-instance p2, Ll/ᩴ֫ۖ;

    invoke-virtual {p1}, Ll/֡۟ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ᩴ֫ۖ;-><init>(Ljava/lang/Iterable;)V

    throw p2
.end method
