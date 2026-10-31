.class public final enum Ll/᩹۫ۘ;
.super Ll/ܶۛۘ;
.source "XBIX"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "RcdataLessthanSign"

    const/16 v1, 0xa

    .line 0
    invoke-direct {p0, v0, v1}, Ll/᩹۫ۘ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 177
    invoke-direct {p0, p1, p2, v0}, Ll/ܶۛۘ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܶ۫ۘ;Ll/ۜ۫ۘ;)V
    .locals 4

    const/16 v0, 0x2f

    .line 180
    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ۧ(C)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ۧ()V

    .line 182
    sget-object p2, Ll/ܶۛۘ;->۫֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ll/ܶۛۘ;)V

    return-void

    .line 183
    :cond_0
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->ۘ()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll/ܶ۫ۘ;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "</"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ܶ۫ۘ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 430
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 431
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 432
    invoke-virtual {p2, v2}, Ll/ۜ۫ۘ;->ܽ(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-gt v2, v3, :cond_3

    invoke-virtual {p2, v0}, Ll/ۜ۫ۘ;->ܽ(Ljava/lang/String;)I

    move-result v0

    if-le v0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 186
    invoke-virtual {p1, v0}, Ll/ܶ۫ۘ;->֫(Z)Ll/ۚ۫ۘ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ܶ۫ۘ;->֫()Ljava/lang/String;

    move-result-object v2

    .line 152
    iput-object v2, v0, Ll/ۚ۫ۘ;->ۢ:Ljava/lang/String;

    if-eqz v2, :cond_2

    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const-string v1, ""

    .line 153
    :goto_0
    iput-object v1, v0, Ll/ۚ۫ۘ;->ܿ:Ljava/lang/String;

    .line 186
    iput-object v0, p1, Ll/ܶ۫ۘ;->֡:Ll/ۚ۫ۘ;

    .line 187
    invoke-virtual {p1}, Ll/ܶ۫ۘ;->ܿ()V

    .line 188
    invoke-virtual {p2}, Ll/ۜ۫ۘ;->֡()V

    .line 189
    sget-object p2, Ll/ܶۛۘ;->֡֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void

    :cond_3
    :goto_1
    const-string p2, "<"

    .line 191
    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->֫(Ljava/lang/String;)V

    .line 192
    sget-object p2, Ll/ܶۛۘ;->ܰ֫:Ll/ܶۛۘ;

    invoke-virtual {p1, p2}, Ll/ܶ۫ۘ;->ᩳ(Ll/ܶۛۘ;)V

    return-void
.end method
