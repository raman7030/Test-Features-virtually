.class public final Ll/᩸ۖܽ;
.super Ljava/util/LinkedHashMap;
.source "17JK"


# instance fields
.field public final synthetic ᩸:Ll/᩶ۖܽ;


# direct methods
.method public constructor <init>(Ll/᩶ۖܽ;)V
    .locals 2

    .line 95
    iput-object p1, p0, Ll/᩸ۖܽ;->᩸:Ll/᩶ۖܽ;

    const/4 p1, 0x6

    const/high16 v0, 0x3f400000    # 0.75f

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    return-void
.end method


# virtual methods
.method public final removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 2

    .line 98
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 100
    :try_start_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖۖܽ;

    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 102
    iget-object v0, p0, Ll/᩸ۖܽ;->᩸:Ll/᩶ۖܽ;

    invoke-static {v0, p1}, Ll/᩶ۖܽ;->֫(Ll/᩶ۖܽ;Ljava/io/IOException;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
