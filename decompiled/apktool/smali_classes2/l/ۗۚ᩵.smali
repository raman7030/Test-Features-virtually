.class public Ll/ۗۚ᩵;
.super Ll/᩵ۡ᩵;
.source "C9VN"

# interfaces
.implements Ll/ۡۚ᩵;
.implements Ll/ܿۚ᩵;
.implements Ll/֨֨᩵;


# static fields
.field public static final serialVersionUID:J = 0x6ba94d8f51b20f9L

.field public static final ۙ:Ljava/util/Map;

.field public static final ᩶:Ljava/util/Map;

.field public static final ᩹:Ljava/util/Map;


# instance fields
.field public ᩸:I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 57
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x47

    if-ge v2, v3, :cond_0

    .line 59
    sget-object v3, Ll/ۡۚ᩵;->ۖ:[I

    aget v3, v3, v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Ll/ۡۚ᩵;->ۘ:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 62
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x0

    :goto_1
    const/16 v4, 0x29

    if-ge v3, v4, :cond_2

    .line 64
    sget-object v4, Ll/ܿۚ᩵;->ܺ:[[I

    aget-object v5, v4, v3

    aget v5, v5, v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aget-object v6, v4, v3

    const/4 v7, 0x1

    aget v6, v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    aget-object v5, v4, v3

    aget v5, v5, v7

    .line 66
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 68
    aget-object v4, v4, v3

    aget v4, v4, v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "NT_STATUS_SUCCESS"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/ۗۚ᩵;->᩶:Ljava/util/Map;

    .line 77
    invoke-static {v2}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/ۗۚ᩵;->᩹:Ljava/util/Map;

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_2
    const/16 v2, 0xa

    if-ge v1, v2, :cond_3

    .line 81
    sget-object v2, Ll/֨֨᩵;->ᩴ:[I

    aget v2, v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget-object v3, Ll/֨֨᩵;->᩵:[Ljava/lang/String;

    aget-object v3, v3, v1

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 84
    :cond_3
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ll/ۗۚ᩵;->ۙ:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    .line 139
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(I)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {p0, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    invoke-static {p1}, Ll/ۗۚ᩵;->ۧ(I)I

    move-result p1

    iput p1, p0, Ll/ۗۚ᩵;->᩸:I

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 2

    if-eqz p2, :cond_0

    .line 117
    sget-object v0, Ll/ۗۚ᩵;->ۙ:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    const/16 v0, 0x8

    .line 119
    invoke-static {p1, v0}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "W"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 168
    :cond_0
    invoke-static {p1}, Ll/ۗۚ᩵;->֫(I)Ljava/lang/String;

    move-result-object v0

    .line 58
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_2

    goto :goto_1

    .line 169
    :cond_2
    invoke-static {p1}, Ll/ۗۚ᩵;->ۧ(I)I

    move-result p1

    :goto_1
    iput p1, p0, Ll/ۗۚ᩵;->᩸:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const p1, -0x3fffffff    # -2.0000002f

    .line 149
    iput p1, p0, Ll/ۗۚ᩵;->᩸:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const p1, -0x3fffffff    # -2.0000002f

    .line 159
    iput p1, p0, Ll/ۗۚ᩵;->᩸:I

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 2

    .line 95
    sget-object v0, Ll/ۗۚ᩵;->᩶:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const/16 v0, 0x8

    .line 97
    invoke-static {p0, v0}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "0x"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/᩵ۡ᩵;)Ll/ۗۚ᩵;
    .locals 2

    .line 195
    instance-of v0, p0, Ll/ۗۚ᩵;

    if-eqz v0, :cond_0

    .line 196
    check-cast p0, Ll/ۗۚ᩵;

    return-object p0

    .line 198
    :cond_0
    new-instance v0, Ll/ۗۚ᩵;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static ۧ(I)I
    .locals 2

    const/high16 v0, -0x40000000    # -2.0f

    and-int/2addr v0, p0

    if-eqz v0, :cond_0

    return p0

    .line 107
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll/ۗۚ᩵;->᩹:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    const p0, -0x3fffffff    # -2.0000002f

    return p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 177
    iget v0, p0, Ll/ۗۚ᩵;->᩸:I

    return v0
.end method
