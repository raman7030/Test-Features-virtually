.class public final Ll/֨᩷ܽ;
.super Ljava/lang/Object;
.source "T971"

# interfaces
.implements Ll/ۘ᩷ܽ;


# static fields
.field public static final ۧ:Ll/֨᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 4
    new-instance v0, Ll/֨᩷ܽ;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    sput-object v0, Ll/֨᩷ܽ;->ۧ:Ll/֨᩷ܽ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 19
    sget v0, Ll/ܳ᩷ܽ;->֡:I

    return v0
.end method

.method public final ֫(I[B)I
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    .line 11
    aget-byte p1, p2, v1

    and-int/lit16 p1, p1, 0xff

    const/16 v0, 0xef

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    aget-byte p1, p2, p1

    and-int/lit16 p1, p1, 0xff

    const/16 v0, 0xbb

    if-ne p1, v0, :cond_0

    const/4 p1, 0x2

    aget-byte p1, p2, p1

    and-int/lit16 p1, p1, 0xff

    const/16 p2, 0xbf

    if-ne p1, p2, :cond_0

    const/16 p1, 0x64

    return p1

    :cond_0
    return v1
.end method
