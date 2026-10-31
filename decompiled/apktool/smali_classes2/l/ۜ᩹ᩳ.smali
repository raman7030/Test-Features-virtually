.class public final Ll/ۜ᩹ᩳ;
.super Ljava/lang/Object;
.source "56Q4"


# instance fields
.field public final ֫:Ljava/lang/Object;

.field public ۧ:Ll/ۨ᩹ᩳ;


# direct methods
.method public constructor <init>(Ll/᩸۬ᩳ;)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۜ᩹ᩳ;->֫:Ljava/lang/Object;

    if-nez p1, :cond_0

    const/16 v0, 0x800

    goto :goto_0

    .line 12
    :cond_0
    iget v0, p1, Ll/᩸۬ᩳ;->ۗ:I

    :goto_0
    if-nez p1, :cond_1

    const/16 v1, 0x10

    goto :goto_1

    .line 13
    :cond_1
    iget v1, p1, Ll/᩸۬ᩳ;->ۤ:I

    .line 12
    :goto_1
    invoke-static {v0, v1, p1}, Ll/ۨ᩹ᩳ;->֫(IILl/᩸۬ᩳ;)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    return-void
.end method

.method private ֫(Ll/᩶᩹ᩳ;I)I
    .locals 2

    if-nez p1, :cond_0

    return p2

    .line 45
    :cond_0
    instance-of v0, p1, Ll/᩸᩹ᩳ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/᩸᩹ᩳ;

    .line 46
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    iget-object v0, v0, Ll/᩸۬ᩳ;->ۙ:Ll/֨۬ᩳ;

    iget-object p1, p1, Ll/᩸᩹ᩳ;->᩷:Ll/۠۬ᩳ;

    invoke-virtual {v0, p1}, Ll/֨۬ᩳ;->ۧ(Ll/۠۬ᩳ;)V

    add-int/lit8 p2, p2, -0x1

    return p2

    .line 49
    :cond_1
    check-cast p1, Ll/᩻᩹ᩳ;

    iget-object p1, p1, Ll/᩻᩹ᩳ;->ܳ:[Ll/᩶᩹ᩳ;

    .line 50
    array-length v0, p1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    if-lez p2, :cond_2

    aget-object v1, p1, v0

    invoke-direct {p0, v1, p2}, Ll/ۜ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;I)I

    move-result p2

    goto :goto_0

    :cond_2
    return p2
.end method

.method private ᩳ()V
    .locals 2

    .line 57
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Text builder is finished"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(I)C
    .locals 1

    .line 26
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    if-ltz p1, :cond_0

    .line 27
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 28
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0, p1}, Ll/ۨ᩹ᩳ;->֫(I)C

    move-result p1

    return p1

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final ֫()Ll/ۨ᩹ᩳ;
    .locals 2

    .line 54
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    return-object v0
.end method

.method public final ֫([CI)V
    .locals 3

    .line 18
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    .line 19
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    const/4 v1, 0x0

    invoke-static {p1, v1, p2}, Ljava/nio/CharBuffer;->wrap([CII)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {v0, v1, p2, p1}, Ll/ۨ᩹ᩳ;->֫(IILjava/lang/CharSequence;)Ll/ۤ᩹ᩳ;

    move-result-object p1

    .line 20
    :try_start_0
    iget-object p2, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    invoke-virtual {p2}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v1

    iget-object v2, p0, Ll/ۜ᩹ᩳ;->֫:Ljava/lang/Object;

    invoke-virtual {p2, v0, v1, p1, v2}, Ll/ۨ᩹ᩳ;->֫(IILl/ۤ᩹ᩳ;Ljava/lang/Object;)Ll/ۨ᩹ᩳ;

    move-result-object p2

    iput-object p2, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-virtual {p1}, Ll/ۤ᩹ᩳ;->close()V

    return-void

    :catchall_0
    move-exception p2

    .line 19
    :try_start_1
    invoke-virtual {p1}, Ll/ۤ᩹ᩳ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
.end method

.method public final ۧ()I
    .locals 1

    .line 15
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    .line 34
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ۨ᩹ᩳ;->֫(II)Ll/ۨ᩹ᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 39
    invoke-direct {p0}, Ll/ۜ᩹ᩳ;->ᩳ()V

    .line 40
    iget-object v0, p0, Ll/ۜ᩹ᩳ;->ۧ:Ll/ۨ᩹ᩳ;

    iget-object v1, v0, Ll/ۨ᩹ᩳ;->ᩳ:Ll/᩸۬ᩳ;

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۨ᩹ᩳ;->ܽ:Ll/᩶᩹ᩳ;

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Ll/ۜ᩹ᩳ;->֫(Ll/᩶᩹ᩳ;I)I

    :cond_0
    return-void
.end method
