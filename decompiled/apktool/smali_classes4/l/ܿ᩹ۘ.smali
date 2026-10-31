.class public final Ll/ܿ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Cloneable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 49
    instance-of v0, p1, Ll/ܿ᩹ۘ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    check-cast p1, Ll/ܿ᩹ۘ;

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const-wide/32 v0, 0x6054b50

    long-to-int v1, v0

    return v1
.end method
