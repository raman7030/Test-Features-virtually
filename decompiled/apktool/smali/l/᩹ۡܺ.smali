.class public final Ll/᩹ۡܺ;
.super Ljava/lang/Object;
.source "ZBH4"


# instance fields
.field public ֫:I

.field public final ۧ:Ljava/util/BitSet;

.field public ܽ:Z

.field public final ܿ:Ll/᩶ۡܺ;

.field public final ᩳ:Ll/᩶ۡܺ;


# direct methods
.method public constructor <init>(Ll/᩶ۡܺ;Ljava/util/BitSet;Z)V
    .locals 0

    .line 413
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 414
    iput-object p1, p0, Ll/᩹ۡܺ;->ᩳ:Ll/᩶ۡܺ;

    .line 415
    iput-object p2, p0, Ll/᩹ۡܺ;->ۧ:Ljava/util/BitSet;

    const/4 p2, 0x0

    .line 416
    iput p2, p0, Ll/᩹ۡܺ;->֫:I

    .line 417
    new-instance p2, Ll/᩶ۡܺ;

    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result p1

    .line 105
    invoke-direct {p2, p1}, Ll/ܿᩴܺ;-><init>(I)V

    .line 417
    iput-object p2, p0, Ll/᩹ۡܺ;->ܿ:Ll/᩶ۡܺ;

    .line 418
    iput-boolean p3, p0, Ll/᩹ۡܺ;->ܽ:Z

    return-void
.end method

.method public static ֫(Ll/᩹ۡܺ;)Ll/᩶ۡܺ;
    .locals 1

    .line 445
    iget-object v0, p0, Ll/᩹ۡܺ;->ܿ:Ll/᩶ۡܺ;

    iget-object p0, p0, Ll/᩹ۡܺ;->ᩳ:Ll/᩶ۡܺ;

    invoke-virtual {p0}, Ll/ᩴᩴܺ;->᩻()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 446
    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/᩹ۡܺ;I)V
    .locals 3

    .line 422
    iget-object v0, p0, Ll/᩹ۡܺ;->ᩳ:Ll/᩶ۡܺ;

    invoke-static {v0, p1}, Ll/᩶ۡܺ;->֫(Ll/᩶ۡܺ;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ۡܺ;

    .line 426
    iget-object v1, p0, Ll/᩹ۡܺ;->ۧ:Ljava/util/BitSet;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 430
    :goto_0
    iget v1, p0, Ll/᩹ۡܺ;->֫:I

    invoke-virtual {v0, v1}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object v0

    .line 431
    iget-boolean v1, p0, Ll/᩹ۡܺ;->ܽ:Z

    if-nez v1, :cond_1

    .line 432
    iget v1, p0, Ll/᩹ۡܺ;->֫:I

    invoke-virtual {v0}, Ll/᩸ۡܺ;->ۧ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, p0, Ll/᩹ۡܺ;->֫:I

    :cond_1
    const/4 v1, 0x0

    .line 439
    iput-boolean v1, p0, Ll/᩹ۡܺ;->ܽ:Z

    .line 441
    iget-object p0, p0, Ll/᩹ۡܺ;->ܿ:Ll/᩶ۡܺ;

    invoke-static {p0, p1, v0}, Ll/᩶ۡܺ;->֫(Ll/᩶ۡܺ;ILl/᩸ۡܺ;)V

    return-void
.end method
