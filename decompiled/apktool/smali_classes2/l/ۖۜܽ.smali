.class public final Ll/ۖۜܽ;
.super Ljava/util/AbstractList;
.source "R537"


# instance fields
.field public final synthetic ᩸:Ll/ۢۜܽ;


# direct methods
.method public constructor <init>(Ll/ۢۜܽ;)V
    .locals 0

    .line 112
    iput-object p1, p0, Ll/ۖۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 115
    iget-object v0, p0, Ll/ۖۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-virtual {v0}, Ll/ۢۜܽ;->size()I

    move-result v1

    if-lt p1, v1, :cond_1

    const/16 v0, 0xa

    if-ge p1, v0, :cond_0

    const-string v0, "type0"

    goto :goto_0

    :cond_0
    const-string v0, "type"

    .line 0
    :goto_0
    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 118
    :cond_1
    invoke-virtual {v0, p1}, Ll/᩷ܿܽ;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 123
    iget-object v0, p0, Ll/ۖۜܽ;->᩸:Ll/ۢۜܽ;

    invoke-virtual {v0}, Ll/ۢۜܽ;->size()I

    move-result v0

    return v0
.end method
