.class public final Ll/ۙᩳۢ;
.super Ll/ۗ֫ۢ;
.source "C5A5"


# instance fields
.field public ֫֫:Ljava/util/List;

.field public ۟:Ljava/lang/Object;

.field public ۧ֫:Ll/ܳۛ᩷;

.field public ܳ֫:Ljava/util/List;

.field public ܽ֫:Ljava/util/List;

.field public ܿ֫:I

.field public ᩳ֫:I

.field public ᩻֫:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ll/ۗ֫ۢ;-><init>()V

    .line 16
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۙᩳۢ;->᩻֫:Ljava/util/List;

    .line 17
    iput-object v0, p0, Ll/ۙᩳۢ;->ܽ֫:Ljava/util/List;

    .line 18
    iput-object v0, p0, Ll/ۙᩳۢ;->֫֫:Ljava/util/List;

    .line 19
    iput-object v0, p0, Ll/ۙᩳۢ;->ܳ֫:Ljava/util/List;

    return-void
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/ܳۧۢ;)Ljava/lang/String;
    .locals 2

    .line 66
    sget-object v0, Ll/ۚᩳۢ;->ۧ:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    .line 68
    :try_start_0
    iget-object v0, p1, Ll/ܳۧۢ;->ᩳ:Ljava/lang/String;

    .line 69
    iget-object p1, p1, Ll/ܳۧۢ;->ܳ:Ljava/lang/String;

    const/4 v1, 0x0

    .line 70
    :goto_0
    invoke-static {p0, v1}, Ll/ۚᩳۢ;->֫(Ll/۫ۘܽ;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "name"

    .line 71
    invoke-virtual {p0, v1}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "type"

    .line 72
    invoke-virtual {p0, v1}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "modifiers"

    .line 73
    invoke-virtual {p0, p1}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 70
    :cond_0
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ll/᩻ۧۢ;)Ljava/lang/String;
    .locals 3

    .line 47
    sget-object v0, Ll/ۚᩳۢ;->ܿ:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    .line 49
    :try_start_0
    iget-object v0, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    .line 50
    iget-object v1, p1, Ll/᩻ۧۢ;->֫:Ljava/lang/String;

    .line 51
    iget-object p1, p1, Ll/᩻ۧۢ;->ܿ:Ljava/lang/String;

    const/4 v2, 0x0

    .line 52
    :goto_0
    invoke-static {p0, v2}, Ll/ۚᩳۢ;->֫(Ll/۫ۘܽ;I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "name"

    .line 53
    invoke-virtual {p0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "parameters"

    .line 54
    invoke-virtual {p0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "type"

    .line 55
    invoke-virtual {p0, v2}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "modifiers"

    .line 56
    invoke-virtual {p0, p1}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 52
    :cond_0
    invoke-virtual {p0}, Ll/۫ۘܽ;->end()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Ll/ۚᩳۢ;->ܿ:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    const/4 v0, 0x0

    .line 28
    invoke-static {p0, v0}, Ll/ۚᩳۢ;->֫(Ll/۫ۘܽ;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "modifiers"

    .line 29
    invoke-virtual {p0, v0}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۙᩳۢ;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 222
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩳۢ;->᩻֫:Ljava/util/List;

    .line 223
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩳۢ;->ܽ֫:Ljava/util/List;

    .line 224
    invoke-static {p3}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩳۢ;->֫֫:Ljava/util/List;

    .line 225
    invoke-static {p4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩳۢ;->ܳ֫:Ljava/util/List;

    .line 226
    iget-object p1, p0, Ll/ۙᩳۢ;->ۧ֫:Ll/ܳۛ᩷;

    if-eqz p1, :cond_0

    iget p2, p0, Ll/ۙᩳۢ;->ᩳ֫:I

    iget p3, p0, Ll/ۙᩳۢ;->ܿ֫:I

    invoke-direct {p0, p2, p3, p1}, Ll/ۙᩳۢ;->ۧ(IILl/᩷ۧۢ;)V

    .line 227
    :cond_0
    iget-object p1, p0, Ll/ۖۧۢ;->᩸:Ll/ۜۧۢ;

    if-eqz p1, :cond_1

    .line 228
    iget-object p2, p0, Ll/ۙᩳۢ;->᩻֫:Ljava/util/List;

    iget-object p3, p0, Ll/ۙᩳۢ;->ܽ֫:Ljava/util/List;

    iget-object p4, p0, Ll/ۙᩳۢ;->֫֫:Ljava/util/List;

    iget-object p0, p0, Ll/ۙᩳۢ;->ܳ֫:Ljava/util/List;

    invoke-interface {p1, p2, p3, p4, p0}, Ll/ۜۧۢ;->֫(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public static synthetic ֫(Ll/ۙᩳۢ;Ll/᩷ۧۢ;II)V
    .locals 1

    .line 260
    move-object v0, p1

    check-cast v0, Ll/ܳۛ᩷;

    iput-object v0, p0, Ll/ۙᩳۢ;->ۧ֫:Ll/ܳۛ᩷;

    .line 261
    iput p2, p0, Ll/ۙᩳۢ;->ᩳ֫:I

    .line 262
    iput p3, p0, Ll/ۙᩳۢ;->ܿ֫:I

    .line 263
    invoke-virtual {p0}, Ll/ۗ֫ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    invoke-direct {p0, p2, p3, p1}, Ll/ۙᩳۢ;->ۧ(IILl/᩷ۧۢ;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ljava/lang/CharSequence;)Ljava/lang/String;
    .locals 1

    .line 35
    sget-object v0, Ll/ۚᩳۢ;->֫:Ll/ۨۘܽ;

    invoke-virtual {v0, p0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object p0

    const/4 v0, 0x0

    .line 37
    :try_start_0
    invoke-static {p0, v0}, Ll/ۚᩳۢ;->֫(Ll/۫ۘܽ;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "modifiers"

    .line 38
    invoke-virtual {p0, v0}, Ll/۫ۘܽ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const-string p0, ""

    return-object p0
.end method

.method private ۧ(IILl/᩷ۧۢ;)V
    .locals 7

    const/4 v0, 0x0

    .line 270
    iput-object v0, p0, Ll/ۙᩳۢ;->۟:Ljava/lang/Object;

    .line 271
    iget-object v1, p0, Ll/ۙᩳۢ;->᩻֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۧۢ;

    .line 272
    iget v5, v2, Ll/ۡۧۢ;->ܽ:I

    if-lt p1, v5, :cond_0

    iget v6, v2, Ll/ۡۧۢ;->֫:I

    if-gt p1, v6, :cond_0

    if-lt p2, v5, :cond_1

    if-gt p2, v6, :cond_1

    .line 274
    iput-object v2, p0, Ll/ۙᩳۢ;->۟:Ljava/lang/Object;

    .line 275
    iget-object p1, v2, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    invoke-interface {p3, v3, v3, p1}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 277
    :cond_1
    invoke-interface {p3, v4, v4, v0}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 281
    :cond_2
    iget-object v1, p0, Ll/ۙᩳۢ;->֫֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۧۢ;

    .line 282
    iget v5, v2, Ll/ܳۧۢ;->ܿ:I

    if-lt p1, v5, :cond_3

    iget v6, v2, Ll/ܳۧۢ;->֫:I

    if-gt p1, v6, :cond_3

    if-lt p2, v5, :cond_4

    if-gt p2, v6, :cond_4

    .line 284
    iput-object v2, p0, Ll/ۙᩳۢ;->۟:Ljava/lang/Object;

    .line 285
    iget-object p1, v2, Ll/ܳۧۢ;->ᩳ:Ljava/lang/String;

    invoke-interface {p3, v3, v3, p1}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 287
    :cond_4
    invoke-interface {p3, v4, v4, v0}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 291
    :cond_5
    iget-object v1, p0, Ll/ۙᩳۢ;->ܽ֫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۧۢ;

    .line 292
    iget v3, v2, Ll/᩻ۧۢ;->ܳ:I

    if-lt p1, v3, :cond_6

    iget v5, v2, Ll/᩻ۧۢ;->ۧ:I

    if-gt p1, v5, :cond_6

    if-lt p2, v3, :cond_7

    if-gt p2, v5, :cond_7

    .line 294
    iput-object v2, p0, Ll/ۙᩳۢ;->۟:Ljava/lang/Object;

    .line 295
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, v2, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    const-string v0, "()"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 295
    iget p2, v2, Ll/᩻ۧۢ;->ܳ:I

    iget v0, v2, Ll/᩻ۧۢ;->ۧ:I

    invoke-interface {p3, p2, v0, p1}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 297
    :cond_7
    invoke-interface {p3, v4, v4, v0}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void

    .line 301
    :cond_8
    invoke-interface {p3, v4, v4, v0}, Ll/᩷ۧۢ;->֫(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 254
    invoke-virtual {p0}, Ll/ۗ֫ۢ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙᩳۢ;->۟:Ljava/lang/Object;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(IILl/᩷ۧۢ;)V
    .locals 1

    .line 259
    new-instance v0, Ll/֨ᩳۢ;

    invoke-direct {v0, p0, p3, p1, p2}, Ll/֨ᩳۢ;-><init>(Ll/ۙᩳۢ;Ll/᩷ۧۢ;II)V

    invoke-virtual {p0, v0}, Ll/ۗ֫ۢ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Ll/۫ۧۢ;Ljava/lang/CharSequence;)V
    .locals 0

    .line 84
    new-instance p1, Ll/۠ᩳۢ;

    invoke-direct {p1, p0}, Ll/۠ᩳۢ;-><init>(Ll/ۙᩳۢ;)V

    invoke-virtual {p0, p2, p1}, Ll/ۗ֫ۢ;->֫(Ljava/lang/CharSequence;Ll/᩶֫ۢ;)V

    return-void
.end method
