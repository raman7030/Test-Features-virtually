.class public final Ll/ۛ֫ܺ;
.super Ljava/lang/Object;
.source "AAVA"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۖ:Ljava/util/ArrayList;

.field public final ۜ:Ll/ۜۧܺ;

.field public ۡ:Ljava/util/IdentityHashMap;

.field public ۢ:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܳ:Ljava/util/Locale;

.field public ܺ:Ljava/util/TimeZone;

.field public final ܽ:Ll/᩻ۧܺ;

.field public ܿ:I

.field public ᩳ:Ll/ܳۧܺ;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۜۧܺ;Ll/᩻ۧܺ;)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-object v0, p0, Ll/ۛ֫ܺ;->ۧ:Ljava/util/ArrayList;

    .line 43
    iput-object v0, p0, Ll/ۛ֫ܺ;->֫:Ljava/util/ArrayList;

    .line 44
    iput-object v0, p0, Ll/ۛ֫ܺ;->᩷:Ljava/util/ArrayList;

    .line 45
    iput-object v0, p0, Ll/ۛ֫ܺ;->ۖ:Ljava/util/ArrayList;

    .line 46
    iput-object v0, p0, Ll/ۛ֫ܺ;->᩻:Ljava/util/ArrayList;

    .line 47
    iput-object v0, p0, Ll/ۛ֫ܺ;->ۢ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 49
    iput v1, p0, Ll/ۛ֫ܺ;->ܿ:I

    .line 54
    iput-object v0, p0, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    .line 57
    sget-object v0, Ll/ۚ۟ۡ;->ۗ:Ljava/util/TimeZone;

    iput-object v0, p0, Ll/ۛ֫ܺ;->ܺ:Ljava/util/TimeZone;

    .line 58
    sget-object v1, Ll/ۚ۟ۡ;->ۙ:Ljava/util/Locale;

    iput-object v1, p0, Ll/ۛ֫ܺ;->ܳ:Ljava/util/Locale;

    .line 74
    iput-object p1, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    .line 75
    iput-object p2, p0, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    .line 76
    iput-object v0, p0, Ll/ۛ֫ܺ;->ܺ:Ljava/util/TimeZone;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    invoke-virtual {v0}, Ll/ۜۧܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 175
    iget v0, p0, Ll/ۛ֫ܺ;->ܿ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۛ֫ܺ;->ܿ:I

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    .line 254
    iget-object p1, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    invoke-virtual {p1}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 258
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 259
    iget-object v1, p0, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    invoke-virtual {v1, v0}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 262
    :try_start_0
    invoke-interface {v0, p0, p1, v1, v1}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 264
    new-instance v0, Ll/ܶ۟ۡ;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 29
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 264
    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 312
    iget-object v0, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-nez p1, :cond_1

    .line 313
    iget p1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v1, Ll/᩷ۧܺ;->ۢ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    const-string p1, ""

    .line 314
    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 316
    :cond_0
    invoke-virtual {v0}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 321
    :cond_1
    iget v1, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v2, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v2, v2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    .line 322
    invoke-virtual {v0, p1}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    return-void

    :cond_2
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 324
    invoke-virtual {v0, p1, v1, v2}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    return-void
.end method

.method public final ֫(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    iget v0, v0, Ll/ۜۧܺ;->᩶:I

    sget-object v1, Ll/᩷ۧܺ;->ۗ:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v1

    if-nez v0, :cond_1

    .line 113
    new-instance v0, Ll/ܳۧܺ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Ll/ܳۧܺ;-><init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 114
    iget-object p1, p0, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-nez p1, :cond_0

    .line 115
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    .line 117
    :cond_0
    iget-object p1, p0, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    iget-object p3, p0, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    invoke-virtual {p1, p2, p3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final ۧ()Ljava/text/DateFormat;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)V
    .locals 3

    .line 122
    iget-object v0, p0, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 123
    iget-object v1, v0, Ll/ܳۧܺ;->ܽ:Ljava/lang/Object;

    .line 125
    iget-object v2, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    if-ne p1, v1, :cond_0

    const-string p1, "{\"$ref\":\"@\"}"

    .line 126
    invoke-virtual {v2, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 130
    :cond_0
    iget-object v1, v0, Ll/ܳۧܺ;->ᩳ:Ll/ܳۧܺ;

    if-eqz v1, :cond_1

    .line 133
    iget-object v1, v1, Ll/ܳۧܺ;->ܽ:Ljava/lang/Object;

    if-ne p1, v1, :cond_1

    const-string p1, "{\"$ref\":\"..\"}"

    .line 134
    invoke-virtual {v2, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 141
    :cond_1
    :goto_0
    iget-object v1, v0, Ll/ܳۧܺ;->ᩳ:Ll/ܳۧܺ;

    if-nez v1, :cond_3

    .line 147
    iget-object v0, v0, Ll/ܳۧܺ;->ܽ:Ljava/lang/Object;

    if-ne p1, v0, :cond_2

    const-string p1, "{\"$ref\":\"$\"}"

    .line 148
    invoke-virtual {v2, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 152
    :cond_2
    iget-object v0, p0, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۧܺ;

    .line 154
    invoke-virtual {p1}, Ll/ܳۧܺ;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "{\"$ref\":\""

    .line 156
    invoke-virtual {v2, v0}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    .line 157
    invoke-virtual {v2, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    const-string p1, "\"}"

    .line 158
    invoke-virtual {v2, p1}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method public final ܽ()V
    .locals 1

    .line 171
    iget v0, p0, Ll/ۛ֫ܺ;->ܿ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۛ֫ܺ;->ܿ:I

    return-void
.end method

.method public final ᩳ()V
    .locals 3

    const/16 v0, 0xa

    .line 179
    iget-object v1, p0, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    invoke-virtual {v1, v0}, Ll/ۜۧܺ;->write(I)V

    const/4 v0, 0x0

    .line 180
    :goto_0
    iget v2, p0, Ll/ۛ֫ܺ;->ܿ:I

    if-ge v0, v2, :cond_0

    const/16 v2, 0x9

    .line 181
    invoke-virtual {v1, v2}, Ll/ۜۧܺ;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
