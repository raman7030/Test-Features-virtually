.class public final Ll/ۛᩳۘ;
.super Ljava/lang/Object;
.source "P1MC"


# instance fields
.field public ֫:I

.field public final synthetic ۜ:Ll/ܺۢᩴ;

.field public final synthetic ۧ:[I

.field public final synthetic ܳ:I

.field public final synthetic ܽ:[I

.field public final synthetic ܿ:Ljava/util/List;

.field public final synthetic ᩳ:Ljava/util/List;

.field public final synthetic ᩻:Ll/ܺۢᩴ;


# direct methods
.method public constructor <init>(Ll/ܺۢᩴ;I[ILl/ܺۢᩴ;Ljava/util/List;Ljava/util/List;[I)V
    .locals 0

    .line 220
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛᩳۘ;->ۜ:Ll/ܺۢᩴ;

    iput p2, p0, Ll/ۛᩳۘ;->ܳ:I

    iput-object p3, p0, Ll/ۛᩳۘ;->ܽ:[I

    iput-object p4, p0, Ll/ۛᩳۘ;->᩻:Ll/ܺۢᩴ;

    iput-object p5, p0, Ll/ۛᩳۘ;->ᩳ:Ljava/util/List;

    iput-object p6, p0, Ll/ۛᩳۘ;->ܿ:Ljava/util/List;

    iput-object p7, p0, Ll/ۛᩳۘ;->ۧ:[I

    const/4 p1, 0x0

    .line 221
    iput p1, p0, Ll/ۛᩳۘ;->֫:I

    return-void
.end method

.method private ֫(III)V
    .locals 5

    .line 228
    iget-object v0, p0, Ll/ۛᩳۘ;->ܽ:[I

    iget v1, p0, Ll/ۛᩳۘ;->ܳ:I

    if-ne p3, v1, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_0
    if-ge p2, v1, :cond_1

    .line 242
    iget-object v2, p0, Ll/ۛᩳۘ;->᩻:Ll/ܺۢᩴ;

    invoke-virtual {v2, p2}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v2

    .line 243
    iget-object v3, p0, Ll/ۛᩳۘ;->ۜ:Ll/ܺۢᩴ;

    aget v4, v0, p2

    invoke-virtual {v3, v4}, Ll/ܺۢᩴ;->getInt(I)I

    move-result v3

    .line 244
    iget-object v4, p0, Ll/ۛᩳۘ;->ᩳ:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ᩳۘ;

    iget-object v4, p0, Ll/ۛᩳۘ;->ܿ:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩺ᩳۘ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 p3, p3, 0x1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 247
    :cond_1
    iget p2, p0, Ll/ۛᩳۘ;->֫:I

    if-le p3, p2, :cond_3

    .line 248
    iput p3, p0, Ll/ۛᩳۘ;->֫:I

    .line 249
    iget-object p2, p0, Ll/ۛᩳۘ;->ۧ:[I

    array-length p3, v0

    invoke-static {v0, p1, p2, p1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_2
    :goto_1
    if-gt p1, p2, :cond_3

    .line 234
    aput p1, v0, p3

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v1, p3, 0x1

    .line 235
    invoke-direct {p0, p1, p2, v1}, Ll/ۛᩳۘ;->֫(III)V

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 224
    iget-object v0, p0, Ll/ۛᩳۘ;->ۜ:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ll/ܺۢᩴ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, v1}, Ll/ۛᩳۘ;->֫(III)V

    return-void
.end method
