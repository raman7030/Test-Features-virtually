.class public final Ll/ܶۙ᩵;
.super Ljava/lang/Object;
.source "S4VX"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ۗ:Ll/᩸ۙ᩵;

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:Ll/ۙ᩶᩵;


# direct methods
.method public constructor <init>(Ll/᩸ۙ᩵;)V
    .locals 3

    .line 1216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ܶۙ᩵;->ۗ:Ll/᩸ۙ᩵;

    const/4 v0, -0x1

    .line 1217
    iput v0, p0, Ll/ܶۙ᩵;->ۙ:I

    .line 1218
    invoke-static {p1}, Ll/᩸ۙ᩵;->ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-ltz p1, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Ll/ܶۙ᩵;->᩸:I

    .line 1219
    iput p1, p0, Ll/ܶۙ᩵;->᩶:I

    return-void

    .line 1449
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    const-string v2, " is less than minimum 0."

    .line 0
    invoke-static {p1, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1449
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final ֫()V
    .locals 7

    .line 1224
    iget v0, p0, Ll/ܶۙ᩵;->᩶:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    .line 1225
    iput v1, p0, Ll/ܶۙ᩵;->ۙ:I

    const/4 v0, 0x0

    .line 1226
    iput-object v0, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    return-void

    .line 1228
    :cond_0
    iget-object v2, p0, Ll/ܶۙ᩵;->ۗ:Ll/᩸ۙ᩵;

    invoke-static {v2}, Ll/᩸ۙ᩵;->ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-le v0, v3, :cond_1

    .line 1229
    new-instance v0, Ll/ۙ᩶᩵;

    iget v1, p0, Ll/ܶۙ᩵;->᩸:I

    invoke-static {v2}, Ll/᩸ۙ᩵;->ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result v2

    .line 54
    invoke-direct {v0, v1, v2, v5}, Ll/᩹᩶᩵;-><init>(III)V

    .line 1229
    iput-object v0, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    .line 1230
    iput v4, p0, Ll/ܶۙ᩵;->᩶:I

    goto :goto_1

    .line 1232
    :cond_1
    invoke-static {v2}, Ll/᩸ۙ᩵;->֫(Ll/᩸ۙ᩵;)Ll/᩵᩹᩵;

    move-result-object v0

    invoke-static {v2}, Ll/᩸ۙ᩵;->ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;

    move-result-object v3

    iget v6, p0, Ll/ܶۙ᩵;->᩶:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    check-cast v0, Ll/ܰۙ᩵;

    invoke-virtual {v0, v3, v6}, Ll/ܰۙ᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ۠᩵;

    if-nez v0, :cond_2

    .line 1234
    new-instance v0, Ll/ۙ᩶᩵;

    iget v1, p0, Ll/ܶۙ᩵;->᩸:I

    invoke-static {v2}, Ll/᩸ۙ᩵;->ۧ(Ll/᩸ۙ᩵;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Ll/۟ۙ᩵;->֫(Ljava/lang/CharSequence;)I

    move-result v2

    .line 54
    invoke-direct {v0, v1, v2, v5}, Ll/᩹᩶᩵;-><init>(III)V

    .line 1234
    iput-object v0, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    .line 1235
    iput v4, p0, Ll/ܶۙ᩵;->᩶:I

    goto :goto_1

    .line 1237
    :cond_2
    invoke-virtual {v0}, Ll/ܺ۠᩵;->֫()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Ll/ܺ۠᩵;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 1238
    iget v3, p0, Ll/ܶۙ᩵;->᩸:I

    const/high16 v4, -0x80000000

    if-gt v2, v4, :cond_3

    .line 86
    invoke-static {}, Ll/ۙ᩶᩵;->ܽ()Ll/ۙ᩶᩵;

    move-result-object v3

    goto :goto_0

    .line 1131
    :cond_3
    new-instance v4, Ll/ۙ᩶᩵;

    add-int/lit8 v6, v2, -0x1

    .line 54
    invoke-direct {v4, v3, v6, v5}, Ll/᩹᩶᩵;-><init>(III)V

    move-object v3, v4

    .line 1238
    :goto_0
    iput-object v3, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    add-int/2addr v2, v0

    .line 1239
    iput v2, p0, Ll/ܶۙ᩵;->᩸:I

    if-nez v0, :cond_4

    const/4 v1, 0x1

    :cond_4
    add-int/2addr v2, v1

    .line 1240
    iput v2, p0, Ll/ܶۙ᩵;->᩶:I

    .line 1243
    :goto_1
    iput v5, p0, Ll/ܶۙ᩵;->ۙ:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1260
    iget v0, p0, Ll/ܶۙ᩵;->ۙ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 1261
    invoke-direct {p0}, Ll/ܶۙ᩵;->֫()V

    .line 1262
    :cond_0
    iget v0, p0, Ll/ܶۙ᩵;->ۙ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1248
    iget v0, p0, Ll/ܶۙ᩵;->ۙ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 1249
    invoke-direct {p0}, Ll/ܶۙ᩵;->֫()V

    .line 1250
    :cond_0
    iget v0, p0, Ll/ܶۙ᩵;->ۙ:I

    if-eqz v0, :cond_1

    .line 1252
    iget-object v0, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 1254
    iput-object v2, p0, Ll/ܶۙ᩵;->᩹:Ll/ۙ᩶᩵;

    .line 1255
    iput v1, p0, Ll/ܶۙ᩵;->ۙ:I

    return-object v0

    .line 1251
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
