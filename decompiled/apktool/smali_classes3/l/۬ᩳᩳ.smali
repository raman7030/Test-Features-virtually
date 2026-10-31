.class public final Ll/۬ᩳᩳ;
.super Ljava/lang/Object;
.source "8B7K"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final ᩸:Ll/۬ᩳᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 195
    new-instance v0, Ll/۬ᩳᩳ;

    .line 194
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 195
    sput-object v0, Ll/۬ᩳᩳ;->᩸:Ll/۬ᩳᩳ;

    return-void
.end method

.method public static bridge synthetic ֫()Ll/۬ᩳᩳ;
    .locals 1

    .line 0
    sget-object v0, Ll/۬ᩳᩳ;->᩸:Ll/۬ᩳᩳ;

    return-object v0
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 194
    check-cast p1, [B

    check-cast p2, [B

    .line 200
    array-length v0, p1

    array-length v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 202
    aget-byte v2, p1, v1

    and-int/lit16 v2, v2, 0xff

    aget-byte v3, p2, v1

    and-int/lit16 v3, v3, 0xff

    sub-int/2addr v2, v3

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 207
    :cond_1
    array-length p1, p1

    array-length p2, p2

    sub-int/2addr p1, p2

    return p1
.end method
