.class public final Ll/ۨۘۘ;
.super Ljava/lang/Object;
.source "O8D0"


# instance fields
.field public final ֫:[D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [D

    .line 193
    iput-object v0, p0, Ll/ۨۘۘ;->֫:[D

    return-void
.end method

.method public static synthetic ֫(Ll/ۨۘۘ;)[D
    .locals 0

    .line 189
    iget-object p0, p0, Ll/ۨۘۘ;->֫:[D

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    const/4 v0, 0x0

    .line 197
    :goto_0
    iget-object v1, p0, Ll/ۨۘۘ;->֫:[D

    array-length v2, v1

    if-ge v0, v2, :cond_0

    const-wide/16 v2, 0x0

    .line 198
    aput-wide v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
