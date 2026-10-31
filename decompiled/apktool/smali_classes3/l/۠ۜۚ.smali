.class public final Ll/۠ۜۚ;
.super Ljava/lang/Object;
.source "L5VZ"


# instance fields
.field public final ֫:Ll/ۚۡۚ;

.field public final ۧ:Ll/ܺۜۚ;

.field public ܳ:Z

.field public ܽ:I

.field public final ܿ:I

.field public final ᩳ:Ll/ܺۜۚ;


# direct methods
.method public constructor <init>(Ll/ۚۡۚ;Ll/ܺۜۚ;I)V
    .locals 2

    .line 671
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 667
    iput-boolean v0, p0, Ll/۠ۜۚ;->ܳ:Z

    .line 668
    iput v0, p0, Ll/۠ۜۚ;->ܽ:I

    .line 672
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result v1

    iput v1, p0, Ll/۠ۜۚ;->ܿ:I

    .line 673
    iput-object p1, p0, Ll/۠ۜۚ;->֫:Ll/ۚۡۚ;

    .line 674
    iput-object p2, p0, Ll/۠ۜۚ;->ᩳ:Ll/ܺۜۚ;

    mul-int/lit8 p3, p3, 0x4

    .line 130
    invoke-static {p2, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 681
    invoke-virtual {p2}, Ll/ܺۜۚ;->getPosition()I

    move-result p2

    invoke-static {p1, p2}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۜۚ;->ۧ:Ll/ܺۜۚ;

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p3, :cond_0

    .line 685
    iget-object p2, p0, Ll/۠ۜۚ;->ᩳ:Ll/ܺۜۚ;

    invoke-virtual {p2, v0}, Ll/ܺۜۚ;->write(I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 687
    :cond_0
    iget-object p1, p0, Ll/۠ۜۚ;->ᩳ:Ll/ܺۜۚ;

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 728
    iget v0, p0, Ll/۠ۜۚ;->ܿ:I

    .line 729
    iget-object v1, p0, Ll/۠ۜۚ;->ۧ:Ll/ܺۜۚ;

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    const/4 v1, 0x0

    .line 731
    :try_start_0
    iget-object v2, p0, Ll/۠ۜۚ;->֫:Ll/ۚۡۚ;

    invoke-static {v2, v0}, Ll/᩸ۜۚ;->֫(Ll/ۚۡۚ;I)Ll/ܺۜۚ;

    move-result-object v1

    .line 732
    iget-object v2, p0, Ll/۠ۜۚ;->ᩳ:Ll/ܺۜۚ;

    invoke-virtual {v2}, Ll/ܺۜۚ;->getPosition()I

    move-result v2

    sub-int/2addr v2, v0

    .line 130
    invoke-static {v1, v2}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 735
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 737
    :cond_0
    throw v0
.end method

.method public final ֫(Ljava/util/Set;)V
    .locals 4

    .line 710
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۠ۜۚ;->ᩳ:Ll/ܺۜۚ;

    if-eqz v0, :cond_1

    .line 702
    iget-boolean p1, p0, Ll/۠ۜۚ;->ܳ:Z

    if-eqz p1, :cond_0

    .line 703
    sget-object p1, Ll/ᩴۗ֡;->֫֫:Ll/ᩴۗ֡;

    invoke-virtual {p1}, Ll/ᩴۗ֡;->getValue()I

    move-result p1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    invoke-static {v2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void

    .line 705
    :cond_0
    iget p1, p0, Ll/۠ۜۚ;->ܽ:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/۠ۜۚ;->ܽ:I

    return-void

    .line 715
    :cond_1
    iget-boolean v0, p0, Ll/۠ۜۚ;->ܳ:Z

    if-nez v0, :cond_3

    .line 716
    iput-boolean v1, p0, Ll/۠ۜۚ;->ܳ:Z

    .line 717
    invoke-virtual {v2}, Ll/ܺۜۚ;->getPosition()I

    move-result v0

    iget v1, p0, Ll/۠ۜۚ;->ܿ:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/۠ۜۚ;->ۧ:Ll/ܺۜۚ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    invoke-static {v1, v0}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 719
    :goto_0
    iget v3, p0, Ll/۠ۜۚ;->ܽ:I

    if-ge v1, v3, :cond_2

    .line 720
    sget-object v3, Ll/ᩴۗ֡;->֫֫:Ll/ᩴۗ֡;

    invoke-virtual {v3}, Ll/ᩴۗ֡;->getValue()I

    move-result v3

    .line 157
    invoke-static {v2, v3}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 722
    :cond_2
    iput v0, p0, Ll/۠ۜۚ;->ܽ:I

    .line 724
    :cond_3
    invoke-static {p1}, Ll/ᩴۗ֡;->֫(Ljava/lang/Iterable;)I

    move-result p1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    invoke-static {v2, p1}, Ll/ܺۜۚ;->ܽ(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 691
    iget-boolean v0, p0, Ll/۠ۜۚ;->ܳ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 694
    iget-object v0, p0, Ll/۠ۜۚ;->ۧ:Ll/ܺۜۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    invoke-static {v0, v1}, Ll/ܺۜۚ;->֫(Ljava/io/OutputStream;I)V

    .line 697
    :cond_0
    iput-boolean v1, p0, Ll/۠ۜۚ;->ܳ:Z

    .line 698
    iput v1, p0, Ll/۠ۜۚ;->ܽ:I

    return-void
.end method
