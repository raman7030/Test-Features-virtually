.class public final Ll/ܺ᩷ܽ;
.super Ljava/lang/Object;
.source "M1QD"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/ܺ᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/ܺ᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/ܺ᩷ܽ;->ۧ:Ll/ܺ᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 22
    sget v0, Ll/ܳ᩷ܽ;->᩷:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    add-int/lit8 v2, v1, 0x3

    if-ge v2, p1, :cond_0

    .line 13
    aget-byte v3, p2, v1

    const/16 v4, 0x1b

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, p2, v3

    int-to-char v3, v3

    const/16 v4, 0x24

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v1, 0x2

    aget-byte v3, p2, v3

    int-to-char v3, v3

    const/16 v4, 0x29

    if-ne v3, v4, :cond_0

    aget-byte v2, p2, v2

    int-to-char v2, v2

    const/16 v3, 0x43

    if-ne v2, v3, :cond_0

    const/16 p1, 0x64

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method
