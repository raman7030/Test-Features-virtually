.class public Ll/ۖܳ֡;
.super Ljava/lang/RuntimeException;
.source "N4NK"


# instance fields
.field public final ۗ:Ll/ᩴܳ֡;

.field public ۙ:Ll/֡ܳ֡;

.field public ᩶:I

.field public final ᩸:Ll/ۡܳ֡;

.field public final ᩹:Ll/ܳܳ֡;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۢܳ֡;Ll/ܳܳ֡;Ll/ۡܳ֡;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const/4 p1, -0x1

    .line 32
    iput p1, p0, Ll/ۖܳ֡;->᩶:I

    .line 50
    iput-object p2, p0, Ll/ۖܳ֡;->ۗ:Ll/ᩴܳ֡;

    .line 51
    iput-object p3, p0, Ll/ۖܳ֡;->᩹:Ll/ܳܳ֡;

    .line 52
    iput-object p4, p0, Ll/ۖܳ֡;->᩸:Ll/ۡܳ֡;

    if-eqz p2, :cond_0

    .line 53
    invoke-virtual {p2}, Ll/ᩴܳ֡;->᩻()I

    move-result p1

    iput p1, p0, Ll/ۖܳ֡;->᩶:I

    :cond_0
    return-void
.end method

.method public constructor <init>(Ll/ᩴܳ֡;Ll/ܳܳ֡;Ll/ۡܳ֡;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ll/ۖܳ֡;->᩶:I

    .line 38
    iput-object p1, p0, Ll/ۖܳ֡;->ۗ:Ll/ᩴܳ֡;

    .line 39
    iput-object p2, p0, Ll/ۖܳ֡;->᩹:Ll/ܳܳ֡;

    .line 40
    iput-object p3, p0, Ll/ۖܳ֡;->᩸:Ll/ۡܳ֡;

    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p1}, Ll/ᩴܳ֡;->᩻()I

    move-result p1

    iput p1, p0, Ll/ۖܳ֡;->᩶:I

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩻᩷֡;
    .locals 3

    .line 84
    iget-object v0, p0, Ll/ۖܳ֡;->ۗ:Ll/ᩴܳ֡;

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {v0}, Ll/ᩴܳ֡;->ܽ()Ll/᩸ܳ֡;

    move-result-object v0

    iget v1, p0, Ll/ۖܳ֡;->᩶:I

    iget-object v2, p0, Ll/ۖܳ֡;->᩸:Ll/ۡܳ֡;

    invoke-virtual {v0, v1, v2}, Ll/᩸ܳ֡;->֫(ILl/᩵ܳ֡;)Ll/᩻᩷֡;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 70
    iput p1, p0, Ll/ۖܳ֡;->᩶:I

    return-void
.end method

.method public final ֫(Ll/֡ܳ֡;)V
    .locals 0

    .line 123
    iput-object p1, p0, Ll/ۖܳ֡;->ۙ:Ll/֡ܳ֡;

    return-void
.end method

.method public final ۧ()Ll/ܳܳ֡;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۖܳ֡;->᩹:Ll/ܳܳ֡;

    return-object v0
.end method

.method public final ܽ()Ll/֡ܳ֡;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۖܳ֡;->ۙ:Ll/֡ܳ֡;

    return-object v0
.end method
