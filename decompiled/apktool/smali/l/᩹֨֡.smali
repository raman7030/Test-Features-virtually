.class public final Ll/᩹֨֡;
.super Ljava/lang/Object;
.source "I6LR"


# instance fields
.field public ֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "http"

    aput-object v3, v1, v2

    const/4 v3, 0x1

    const-string v4, "https"

    aput-object v4, v1, v3

    const-string v4, "mailto"

    const/4 v5, 0x2

    aput-object v4, v1, v5

    const-string v4, "data"

    const/4 v5, 0x3

    aput-object v4, v1, v5

    .line 0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v5, v1, v2

    invoke-static {v5, v4, v5, v2, v3}, Ll/ۡܶ֫;->֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v2

    goto :goto_0

    :cond_0
    invoke-static {v4}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Ll/᩹֨֡;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 48
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    const/16 v1, 0x20

    const/16 v2, 0xd

    const/16 v3, 0xc

    const/16 v4, 0xa

    const/16 v5, 0x9

    if-lez v0, :cond_1

    add-int/lit8 v6, v0, -0x1

    .line 50
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v5, :cond_0

    if-eq v6, v4, :cond_0

    if-eq v6, v3, :cond_0

    if-eq v6, v2, :cond_0

    if-eq v6, v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v0, :cond_3

    .line 55
    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-eq v8, v5, :cond_2

    if-eq v8, v4, :cond_2

    if-eq v8, v3, :cond_2

    if-eq v8, v2, :cond_2

    if-eq v8, v1, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    if-nez v7, :cond_4

    .line 59
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_4

    goto :goto_4

    .line 62
    :cond_4
    invoke-virtual {p1, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 25
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v0, :cond_6

    .line 26
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x23

    if-eq v2, v3, :cond_6

    const/16 v3, 0x2f

    if-eq v2, v3, :cond_6

    const/16 v3, 0x3a

    if-eq v2, v3, :cond_5

    const/16 v3, 0x3f

    if-eq v2, v3, :cond_6

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 32
    :cond_5
    invoke-virtual {p1, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 33
    iget-object v1, p0, Ll/᩹֨֡;->֫:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string p1, ""

    :cond_6
    return-object p1
.end method
