.class public final Ll/ۗۢܺ;
.super Ll/ۘ᩷ܺ;
.source "BBH0"


# instance fields
.field public final ܳ:[I

.field public final ܿ:[I


# direct methods
.method public constructor <init>(Ll/۠ۢܺ;I[I[I)V
    .locals 7

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 41
    invoke-direct/range {v0 .. v6}, Ll/ۘ᩷ܺ;-><init>(Ll/۠ۢܺ;IIIJ)V

    .line 43
    array-length p1, p3

    array-length p2, p4

    if-ne p1, p2, :cond_0

    .line 47
    iput-object p3, p0, Ll/ۗۢܺ;->ܿ:[I

    .line 48
    iput-object p4, p0, Ll/ۗۢܺ;->ܳ:[I

    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "keys/targets length mismatch"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֡()[I
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۗۢܺ;->ܳ:[I

    return-object v0
.end method

.method public final ᩴ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩵()[I
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۗۢܺ;->ܿ:[I

    return-object v0
.end method
