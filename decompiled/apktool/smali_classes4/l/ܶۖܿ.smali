.class public final Ll/ܶۖܿ;
.super Ljava/lang/Object;
.source "N6VA"


# instance fields
.field public final ֫:Ll/ᩳۢܿ;

.field public final ۧ:Ll/᩶ۘܿ;

.field public final ܳ:Ll/ۢۖܿ;

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ljava/util/List;

.field public final ᩻:Ljava/util/List;


# direct methods
.method public constructor <init>(IILl/ۢۖܿ;Ll/ᩳۢܿ;Ll/᩶ۘܿ;Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .line 255
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-le p2, p1, :cond_0

    .line 256
    invoke-virtual {p3}, Ll/ۢۖܿ;->֫()I

    move-result v0

    sub-int v1, p2, p1

    if-ne v0, v1, :cond_0

    .line 259
    iput p1, p0, Ll/ܶۖܿ;->ܿ:I

    .line 260
    iput p2, p0, Ll/ܶۖܿ;->ܽ:I

    .line 261
    iput-object p3, p0, Ll/ܶۖܿ;->ܳ:Ll/ۢۖܿ;

    .line 262
    iput-object p4, p0, Ll/ܶۖܿ;->֫:Ll/ᩳۢܿ;

    .line 263
    iput-object p5, p0, Ll/ܶۖܿ;->ۧ:Ll/᩶ۘܿ;

    .line 264
    iput-object p6, p0, Ll/ܶۖܿ;->ᩳ:Ljava/util/List;

    .line 265
    iput-object p7, p0, Ll/ܶۖܿ;->᩻:Ljava/util/List;

    return-void

    .line 257
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid speculative syntax fragment coverage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
