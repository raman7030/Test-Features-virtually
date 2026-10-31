.class public Ll/᩸ܳᩳ;
.super Ljava/lang/Object;
.source "4B3Z"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IOutCreateCallback;


# instance fields
.field public ۗ:J

.field public ۙ:I

.field public ᩶:Lnet/sf/sevenzipjbinding/ISequentialInStream;

.field public final ᩸:Ll/ۙܳᩳ;

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ۙܳᩳ;)V
    .locals 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 67
    iput v0, p0, Ll/᩸ܳᩳ;->ۙ:I

    const/4 v0, 0x0

    .line 68
    iput-object v0, p0, Ll/᩸ܳᩳ;->᩶:Lnet/sf/sevenzipjbinding/ISequentialInStream;

    .line 91
    iput-object p1, p0, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    return-void
.end method

.method private ֫(JJ)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    invoke-static {p1, p2, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    .line 143
    iget p2, p0, Ll/᩸ܳᩳ;->ۙ:I

    if-eq p1, p2, :cond_0

    .line 144
    iput p1, p0, Ll/᩸ܳᩳ;->ۙ:I

    .line 145
    new-instance p2, Ll/۠ܳᩳ;

    invoke-direct {p2, p0, p1}, Ll/۠ܳᩳ;-><init>(Ll/᩸ܳᩳ;I)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    .line 140
    :cond_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Canceled"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getItemInformation(ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/IOutItemBase;
    .locals 2

    .line 96
    iget-object v0, p0, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 99
    invoke-interface {v0, p1, p2}, Ll/ۙܳᩳ;->getItemInformation(ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object p1

    return-object p1

    .line 97
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Canceled"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getStream(I)Lnet/sf/sevenzipjbinding/ISequentialInStream;
    .locals 2

    .line 105
    iget-object v0, p0, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 109
    :try_start_0
    invoke-interface {v0, p1}, Ll/ۙܳᩳ;->getStream(I)Lnet/sf/sevenzipjbinding/ISequentialInStream;

    move-result-object p1

    .line 110
    iput-object p1, p0, Ll/᩸ܳᩳ;->᩶:Lnet/sf/sevenzipjbinding/ISequentialInStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 113
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 106
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setCompleted(J)V
    .locals 2

    .line 134
    iput-wide p1, p0, Ll/᩸ܳᩳ;->᩹:J

    .line 135
    iget-wide v0, p0, Ll/᩸ܳᩳ;->ۗ:J

    invoke-direct {p0, p1, p2, v0, v1}, Ll/᩸ܳᩳ;->֫(JJ)V

    return-void
.end method

.method public final setOperationResult(Z)V
    .locals 1

    .line 119
    iget-object v0, p0, Ll/᩸ܳᩳ;->᩶:Lnet/sf/sevenzipjbinding/ISequentialInStream;

    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    const/4 v0, 0x0

    .line 120
    iput-object v0, p0, Ll/᩸ܳᩳ;->᩶:Lnet/sf/sevenzipjbinding/ISequentialInStream;

    if-eqz p1, :cond_0

    return-void

    .line 122
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>()V

    throw p1
.end method

.method public final setTotal(J)V
    .locals 2

    .line 128
    iput-wide p1, p0, Ll/᩸ܳᩳ;->ۗ:J

    .line 129
    iget-wide v0, p0, Ll/᩸ܳᩳ;->᩹:J

    invoke-direct {p0, v0, v1, p1, p2}, Ll/᩸ܳᩳ;->֫(JJ)V

    return-void
.end method
