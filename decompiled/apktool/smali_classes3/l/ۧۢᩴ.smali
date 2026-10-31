.class public final Ll/ۧۢᩴ;
.super Ljava/lang/Object;
.source "25I"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ۙ:Ll/ۧۢᩴ;

.field public ᩶:Ll/ۧۢᩴ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 674
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 675
    iput p1, p0, Ll/ۧۢᩴ;->᩹:I

    const/high16 p1, -0x40000000    # -2.0f

    .line 676
    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 649
    invoke-virtual {p0}, Ll/ۧۢᩴ;->clone()Ll/ۧۢᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ۧۢᩴ;
    .locals 2

    .line 831
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۢᩴ;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 835
    iget v1, p0, Ll/ۧۢᩴ;->᩹:I

    iput v1, v0, Ll/ۧۢᩴ;->᩹:I

    .line 836
    iget v1, p0, Ll/ۧۢᩴ;->᩸:I

    iput v1, v0, Ll/ۧۢᩴ;->᩸:I

    return-object v0

    .line 833
    :catch_0
    new-instance v0, Ljava/lang/InternalError;

    invoke-direct {v0}, Ljava/lang/InternalError;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 842
    instance-of v0, p1, Ll/ۧۢᩴ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 843
    :cond_0
    check-cast p1, Ll/ۧۢᩴ;

    .line 844
    iget v0, p0, Ll/ۧۢᩴ;->᩹:I

    iget p1, p1, Ll/ۧۢᩴ;->᩹:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 849
    iget v0, p0, Ll/ۧۢᩴ;->᩹:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 854
    iget v0, p0, Ll/ۧۢᩴ;->᩹:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ۧۢᩴ;
    .locals 2

    .line 685
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 790
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    and-int/lit16 v0, v0, -0x100

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    .line 791
    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void
.end method

.method public final ֫(Ll/ۧۢᩴ;)V
    .locals 2

    .line 741
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, 0x40000000    # 2.0f

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۧۢᩴ;->᩸:I

    .line 742
    iput-object p1, p0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 721
    iget p1, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v0, 0x40000000    # 2.0f

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void

    .line 722
    :cond_0
    iget p1, p0, Ll/ۧۢᩴ;->᩸:I

    const v0, -0x40000001    # -1.9999999f

    and-int/2addr p1, v0

    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void
.end method

.method public final ۜ()Z
    .locals 2

    .line 712
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Ll/ۧۢᩴ;)V
    .locals 2

    .line 751
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Ll/ۧۢᩴ;->᩸:I

    .line 752
    iput-object p1, p0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    return-void
.end method

.method public final ܳ()Ll/ۧۢᩴ;
    .locals 2

    .line 694
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    return-object v0
.end method

.method public final ܽ()Ll/ۧۢᩴ;
    .locals 3

    .line 810
    iget-object v0, p0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    .line 811
    iget v1, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    :goto_0
    iget v1, v0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ܽ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 731
    iget p1, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void

    .line 732
    :cond_0
    iget p1, p0, Ll/ۧۢᩴ;->᩸:I

    const v0, 0x7fffffff

    and-int/2addr p1, v0

    iput p1, p0, Ll/ۧۢᩴ;->᩸:I

    return-void
.end method

.method public final ܿ()Ll/ۧۢᩴ;
    .locals 3

    .line 821
    iget-object v0, p0, Ll/ۧۢᩴ;->᩶:Ll/ۧۢᩴ;

    .line 822
    iget v1, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    :goto_0
    iget v1, v0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ۧۢᩴ;->ۙ:Ll/ۧۢᩴ;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ᩳ()Z
    .locals 2

    .line 703
    iget v0, p0, Ll/ۧۢᩴ;->᩸:I

    const/high16 v1, 0x40000000    # 2.0f

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
