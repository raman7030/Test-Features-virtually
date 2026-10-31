.class public final synthetic Ll/ܺ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/۠ۚ֫;
.implements Ll/ܽܶܺ;
.implements Ll/᩸ۜ᩵;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺ۫᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֡۬֫;)V
    .locals 0

    const/4 p1, 0x5

    .line 0
    iput p1, p0, Ll/ܺ۫᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic ֫(Landroid/graphics/Insets;)I
    .locals 0

    .line 0
    iget p0, p0, Landroid/graphics/Insets;->bottom:I

    return p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫()Ljava/util/Map;
    .locals 6

    .line 0
    new-instance v0, Ljava/util/AbstractMap$SimpleEntry;

    const-string v1, "X-Content-Type-Options"

    const-string v2, "nosniff"

    invoke-direct {v0, v1, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ljava/util/AbstractMap$SimpleEntry;

    const-string v2, "Cache-Control"

    const-string v3, "private, max-age=31536000"

    invoke-direct {v1, v2, v3}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/util/Map$Entry;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v1, v3, v4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate key: "

    invoke-static {v5, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/ܺ۫᩷;->᩸:I

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    .line 8
    check-cast p1, Ll/ۨ᩹۠;

    .line 63
    invoke-interface {p1}, Ll/ۨ᩹۠;->getLineNumber()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-interface {p1}, Ll/ۨ᩹۠;->getColumnNumber()J

    move-result-wide v2

    long-to-int v0, v2

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-interface {p1, v2}, Ll/ۨ᩹۠;->֫(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 62
    invoke-static {v1, v0, p1}, Ll/᩵۟ܺ;->֫(IILjava/lang/String;)Ll/᩵۟ܺ;

    move-result-object p1

    return-object p1

    .line 0
    :sswitch_0
    check-cast p1, Ljava/lang/Void;

    sget p1, Ll/᩹ᩴᩳ;->ܿ:I

    return-object v1

    :sswitch_1
    check-cast p1, Ll/۬᩵֫;

    .line 95
    iget p1, p1, Ll/۬᩵֫;->ܿ:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 0
    :sswitch_2
    check-cast p1, Ljava/lang/Throwable;

    sget v0, Ll/ܿۛ᩷;->ۛۧ:I

    .line 1134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x6 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/֨۬֫;

    .line 961
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
