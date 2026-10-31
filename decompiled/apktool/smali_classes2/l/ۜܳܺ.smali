.class public final Ll/ۜܳܺ;
.super Ljava/lang/Object;
.source "2BBU"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۤۡܺ;


# direct methods
.method public constructor <init>(ILl/ۤۡܺ;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    .line 177
    iput p1, p0, Ll/ۜܳܺ;->֫:I

    .line 178
    iput-object p2, p0, Ll/ۜܳܺ;->ۧ:Ll/ۤۡܺ;

    return-void

    .line 170
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "address < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 187
    iget v0, p0, Ll/ۜܳܺ;->֫:I

    return v0
.end method

.method public final ۧ()Ll/ۤۡܺ;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ۜܳܺ;->ۧ:Ll/ۤۡܺ;

    return-object v0
.end method
