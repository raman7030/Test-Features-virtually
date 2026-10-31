.class public final Ll/۫ܺ᩻;
.super Ll/ۙܺ֡;
.source "6AII"

# interfaces
.implements Ll/۬ܺ᩻;


# instance fields
.field public ܳ֫:Ljava/lang/String;

.field public final ܿ֫:Ll/ۗܺ᩻;

.field public ᩳ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩻;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ll/ۙܺ֡;-><init>()V

    .line 19
    iput-object p1, p0, Ll/۫ܺ᩻;->ܿ֫:Ll/ۗܺ᩻;

    .line 20
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩹()V

    .line 21
    invoke-virtual {p0}, Ll/ۚܺ֡;->᩶()V

    .line 22
    invoke-virtual {p0}, Ll/ۙܺ֡;->᩺()V

    return-void
.end method

.method public static ܺ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x4

    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\u5f53\u524d\u76ee\u5f55\u662f"

    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 96
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    const-string v0, "\""

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 102
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_4

    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-ne v3, v4, :cond_2

    if-eqz v2, :cond_1

    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    .line 114
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 116
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_5

    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_5
    return-object p0
.end method


# virtual methods
.method public final getKey()Ll/ۗܺ᩻;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/۫ܺ᩻;->ܿ֫:Ll/ۗܺ᩻;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۫ܺ᩻;->ܳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)Z
    .locals 2

    .line 129
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۫ܺ᩻;->ܳ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 471
    :cond_0
    sget-object v0, Ll/۬ܺ֡;->۟:Ll/۬ܺ֡;

    invoke-virtual {p0, v0, p1}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result p1

    .line 1172
    invoke-static {p1}, Ll/ۧ᩷ܽ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 133
    invoke-virtual {p0}, Ll/۫ܺ᩻;->ܳ()Ljava/lang/String;

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 1090
    sget-object v0, Ll/۬ܺ֡;->ۨ֫:Ll/۬ܺ֡;

    const/4 v1, 0x0

    .line 1217
    invoke-virtual {p0, v0, v1}, Ll/ܶܺ֡;->֫(Ll/۬ܺ֡;Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x101

    if-eq v0, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 90
    :cond_0
    iget-object v0, p0, Ll/ܶܺ֡;->֡:Ljava/util/ArrayList;

    const/4 v2, 0x1

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 90
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ll/۫ܺ᩻;->ܺ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    .line 79
    invoke-static {v0}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۫ܺ᩻;->ܳ֫:Ljava/lang/String;

    .line 80
    iget-object v2, p0, Ll/۫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 81
    iput-object v1, p0, Ll/۫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    :cond_1
    return-object v0

    .line 77
    :cond_2
    invoke-virtual {p0}, Ll/۫ܺ᩻;->᩻()Ljava/io/IOException;

    throw v1
.end method

.method public final ܽ(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 33
    :try_start_0
    invoke-super {p0, p1, p2}, Ll/ܶܺ֡;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 46
    :try_start_1
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۡ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 50
    :catch_1
    throw p1

    :catch_2
    move-exception p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Broken pipe"

    .line 36
    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Software caused connection abort"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 38
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Ll/ۙܺ֡;->ۡ()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 43
    :catch_3
    :cond_1
    throw p1
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/۫ܺ᩻;->ᩳ֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩻()Ljava/io/IOException;
    .locals 4

    .line 55
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۖ()Ljava/lang/String;

    move-result-object v0

    .line 56
    invoke-virtual {p0}, Ll/ܶܺ֡;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "FTP reply: "

    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v2, "FTP reply "

    const-string v3, ": "

    .line 0
    invoke-static {v2, v1, v3, v0}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    :goto_0
    new-instance v1, Ljava/net/SocketException;

    invoke-direct {v1, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
