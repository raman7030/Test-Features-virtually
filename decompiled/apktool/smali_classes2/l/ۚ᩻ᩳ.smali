.class public final synthetic Ll/ۚ᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۜۜᩳ;

.field public final synthetic ᩹:Ll/ۙۜᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜᩳ;Ll/ۙۜᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput-object p2, p0, Ll/ۚ᩻ᩳ;->᩹:Ll/ۙۜᩳ;

    iput p3, p0, Ll/ۚ᩻ᩳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 389
    iget-object p1, p0, Ll/ۚ᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v0, p2, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    iget-object p2, p2, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {p2}, Ll/᩷ᩳܽ;->ۚۧ()I

    move-result p2

    invoke-virtual {v0, p2}, Ll/ۖܿܽ;->ᩳ(I)V

    .line 390
    sget-object p2, Ll/ۙۜᩳ;->᩹:Ll/ۙۜᩳ;

    iget-object v0, p0, Ll/ۚ᩻ᩳ;->᩹:Ll/ۙۜᩳ;

    iget v1, p0, Ll/ۚ᩻ᩳ;->᩶:I

    const/4 v2, 0x1

    if-ne v0, p2, :cond_1

    .line 391
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-boolean v0, p2, Ll/᩻ۜᩳ;->᩻֫:Z

    if-eqz v0, :cond_0

    .line 392
    iget v0, p2, Ll/᩻ۜᩳ;->ᩳ֫:I

    sub-int/2addr v0, v2

    iput v0, p2, Ll/᩻ۜᩳ;->ᩳ֫:I

    .line 393
    :goto_0
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget v0, p2, Ll/᩻ۜᩳ;->ᩳ֫:I

    if-ge v1, v0, :cond_0

    .line 394
    iget-object p2, p2, Ll/᩻ۜᩳ;->ܽ֫:[I

    add-int/lit8 v0, v1, 0x1

    aget v3, p2, v0

    sub-int/2addr v3, v2

    aput v3, p2, v1

    move v1, v0

    goto :goto_0

    .line 396
    :cond_0
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    invoke-virtual {p2}, Ll/᩻ۜᩳ;->ܿ()V

    goto :goto_1

    .line 397
    :cond_1
    sget-object p2, Ll/ۙۜᩳ;->۬:Ll/ۙۜᩳ;

    if-ne v0, p2, :cond_2

    .line 398
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object p2, p2, Ll/᩻ۜᩳ;->ۡ֫:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 399
    :cond_2
    sget-object p2, Ll/ۙۜᩳ;->ۤ:Ll/ۙۜᩳ;

    if-ne v0, p2, :cond_3

    .line 400
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object p2, p2, Ll/᩻ۜᩳ;->ۢ֫:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 403
    :goto_1
    iget-object p2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    const/4 v0, 0x0

    iput-object v0, p2, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    .line 404
    iget-object p2, p1, Ll/ۜۜᩳ;->ᩳۧ:Ll/۫᩵ۘ;

    invoke-virtual {p2}, Ll/ۙ᩵ۘ;->notifyDataSetChanged()V

    .line 405
    iget-object p1, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iput-boolean v2, p1, Ll/᩻ۜᩳ;->᩺:Z

    return-void

    .line 402
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
