.class public final Ll/۫ۘܺ;
.super Ljava/lang/Object;
.source "TBH1"

# interfaces
.implements Ll/᩺ۖܺ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput-object p1, p0, Ll/۫ۘܺ;->֫:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰۖܺ;)V
    .locals 7

    .line 206
    invoke-virtual {p1}, Ll/ܰۖܺ;->ۘ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 207
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    .line 208
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    .line 211
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    .line 212
    iget-object v5, p0, Ll/۫ۘܺ;->֫:Ljava/util/ArrayList;

    .line 213
    invoke-virtual {p1, v3}, Ll/ܰۖܺ;->ᩳ(I)I

    move-result v6

    .line 212
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۘܺ;

    .line 215
    invoke-virtual {v5, v1, v4}, Ll/ܽۘܺ;->֫(Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
