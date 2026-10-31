.class public final Ll/۬۟ۜ;
.super Ll/ۙ۟ۜ;
.source "69LD"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final ᩶:Z


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Ll/ۙ۟ۜ;-><init>(II)V

    .line 14
    iput-boolean p3, p0, Ll/۬۟ۜ;->᩶:Z

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ll/ۙ۟ۜ;-><init>()V

    .line 9
    iput-boolean p1, p0, Ll/۬۟ۜ;->᩶:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 5
    invoke-virtual {p0}, Ll/۬۟ۜ;->clone()Ll/۬۟ۜ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/۬۟ۜ;
    .locals 2

    .line 22
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬۟ۜ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 24
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
