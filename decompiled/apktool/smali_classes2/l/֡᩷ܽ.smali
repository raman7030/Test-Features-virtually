.class public final Ll/֡᩷ܽ;
.super Ljava/lang/Object;
.source "V1PS"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/֡᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/֡᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/֡᩷ܽ;->ۧ:Ll/֡᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 23
    sget v0, Ll/ܳ᩷ܽ;->ۘ:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 5

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    aget-byte p1, p2, v1

    const/16 v0, 0xff

    and-int/2addr p1, v0

    const/4 v2, 0x1

    .line 14
    aget-byte v2, p2, v2

    and-int/2addr v2, v0

    const/4 v3, 0x2

    .line 15
    aget-byte v3, p2, v3

    and-int/2addr v3, v0

    const/4 v4, 0x3

    .line 16
    aget-byte p2, p2, v4

    and-int/2addr p2, v0

    if-nez p1, :cond_1

    if-nez v2, :cond_1

    const/16 p1, 0xfe

    if-ne v3, p1, :cond_1

    if-ne p2, v0, :cond_1

    const/16 p1, 0x64

    return p1

    :cond_1
    :goto_0
    return v1
.end method
