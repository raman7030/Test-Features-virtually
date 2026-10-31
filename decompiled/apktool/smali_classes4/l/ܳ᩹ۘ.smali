.class public final Ll/ܳ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x96fb

    .line 36
    iput v0, p0, Ll/ܳ᩹ۘ;->᩸:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 25
    aget-byte v0, p1, v0

    shl-int/lit8 v0, v0, 0x8

    const v1, 0xff00

    and-int/2addr v0, v1

    iput v0, p0, Ll/ܳ᩹ۘ;->᩸:I

    const/4 v1, 0x0

    .line 26
    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v0, p1

    iput v0, p0, Ll/ܳ᩹ۘ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 47
    instance-of v1, p1, Ll/ܳ᩹ۘ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    check-cast p1, Ll/ܳ᩹ۘ;

    .line 74
    iget p1, p1, Ll/ܳ᩹ۘ;->᩸:I

    .line 51
    iget v1, p0, Ll/ܳ᩹ۘ;->᩸:I

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 85
    iget v0, p0, Ll/ܳ᩹ۘ;->᩸:I

    return v0
.end method

.method public final ֫()I
    .locals 1

    .line 74
    iget v0, p0, Ll/ܳ᩹ۘ;->᩸:I

    return v0
.end method
