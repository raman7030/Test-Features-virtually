.class public final Ll/֨ۨ֡;
.super Ljava/lang/Object;
.source "T65P"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic ᩶:Ll/ܰۨ֡;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ܰۨ֡;)V
    .locals 1

    .line 734
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۨ֡;->᩶:Ll/ܰۨ֡;

    const/4 v0, 0x0

    .line 735
    iput v0, p0, Ll/֨ۨ֡;->᩸:I

    .line 736
    invoke-static {p1}, Ll/ܰۨ֡;->ۧ(Ll/ܰۨ֡;)Ll/᩹ۨ֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩹ۨ֡;->ۧ()I

    move-result p1

    iput p1, p0, Ll/֨ۨ֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 740
    iget v0, p0, Ll/֨ۨ֡;->᩸:I

    iget-object v1, p0, Ll/֨ۨ֡;->᩶:Ll/ܰۨ֡;

    invoke-static {v1}, Ll/ܰۨ֡;->ۧ(Ll/ܰۨ֡;)Ll/᩹ۨ֡;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ۨ֡;->֫()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 745
    iget v0, p0, Ll/֨ۨ֡;->᩹:I

    iget-object v1, p0, Ll/֨ۨ֡;->᩶:Ll/ܰۨ֡;

    invoke-virtual {v1, v0}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 746
    iget v2, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/֨ۨ֡;->᩹:I

    const-string v3, "US-ASCII"

    .line 749
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {v1, v2, v0, v3}, Ll/᩺ۤ֡;->֫(IILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 750
    iget v2, p0, Ll/֨ۨ֡;->᩹:I

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x4

    .line 752
    iput v2, p0, Ll/֨ۨ֡;->᩹:I

    .line 754
    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v0

    .line 755
    iget v2, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v2, v2, 0x4

    iput v2, p0, Ll/֨ۨ֡;->᩹:I

    .line 758
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    .line 761
    invoke-virtual {v1}, Ll/᩺ۤ֡;->֫()[B

    move-result-object v2

    .line 762
    invoke-static {v1}, Ll/ܰۨ֡;->ۧ(Ll/ܰۨ֡;)Ll/᩹ۨ֡;

    move-result-object v3

    invoke-static {v3}, Ll/᩹ۨ֡;->֫(Ll/᩹ۨ֡;)I

    move-result v3

    add-int/2addr v0, v3

    .line 765
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    const/16 v4, 0x4b

    if-lt v3, v4, :cond_0

    .line 766
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v3, v3, 0x4

    iput v3, p0, Ll/֨ۨ֡;->᩹:I

    .line 768
    :cond_0
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    const/16 v5, 0x49

    if-lt v3, v5, :cond_1

    .line 769
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v3, v3, 0x4

    iput v3, p0, Ll/֨ۨ֡;->᩹:I

    .line 771
    :cond_1
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    const/16 v5, 0x83

    if-lt v3, v5, :cond_2

    .line 772
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v3, v3, 0x4

    iput v3, p0, Ll/֨ۨ֡;->᩹:I

    .line 774
    :cond_2
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    const/16 v5, 0x7f

    if-lt v3, v5, :cond_3

    .line 775
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v3, v3, 0x4

    iput v3, p0, Ll/֨ۨ֡;->᩹:I

    .line 777
    :cond_3
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    const/16 v5, 0x87

    if-lt v3, v5, :cond_4

    .line 778
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    add-int/lit8 v3, v3, 0x8

    iput v3, p0, Ll/֨ۨ֡;->᩹:I

    .line 780
    :cond_4
    invoke-virtual {v1}, Ll/ܰۨ֡;->ᩳ()I

    move-result v3

    if-ge v3, v4, :cond_5

    add-int/lit8 v3, v0, 0x60

    .line 782
    invoke-virtual {v1, v3}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 783
    iget v3, p0, Ll/֨ۨ֡;->᩹:I

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v3

    iput v1, p0, Ll/֨ۨ֡;->᩹:I

    .line 786
    :cond_5
    iget v1, p0, Ll/֨ۨ֡;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֨ۨ֡;->᩸:I

    .line 788
    new-instance v1, Ll/᩸ۨ֡;

    invoke-direct {v1, v2, v0}, Ll/᩸ۨ֡;-><init>([BI)V

    return-object v1
.end method

.method public final remove()V
    .locals 1

    .line 793
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
