.class public final Ll/۠᩻ᩴ;
.super Ll/ۙ᩻ᩴ;
.source "M1N0"

# interfaces
.implements Ll/ۜۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۫:Ll/ۤ᩻ᩴ;


# direct methods
.method public constructor <init>(Ll/ۤ᩻ᩴ;)V
    .locals 0

    .line 1150
    iput-object p1, p0, Ll/۠᩻ᩴ;->۫:Ll/ۤ᩻ᩴ;

    .line 1151
    invoke-direct {p0, p1}, Ll/ۙ᩻ᩴ;-><init>(Ll/ۤ᩻ᩴ;)V

    return-void
.end method


# virtual methods
.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 46
    invoke-virtual {p0}, Ll/۠᩻ᩴ;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 28
    invoke-virtual {p0}, Ll/۠᩻ᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextInt()I
    .locals 2

    .line 1164
    iget-object v0, p0, Ll/۠᩻ᩴ;->۫:Ll/ۤ᩻ᩴ;

    iget-object v0, v0, Ll/ۤ᩻ᩴ;->ۗ:[I

    invoke-virtual {p0}, Ll/ۙ᩻ᩴ;->֫()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1149
    check-cast p2, Ljava/util/function/IntConsumer;

    .line 1159
    iget-object v0, p0, Ll/۠᩻ᩴ;->۫:Ll/ۤ᩻ᩴ;

    iget-object v0, v0, Ll/ۤ᩻ᩴ;->ۗ:[I

    aget p1, v0, p1

    invoke-interface {p2, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method
