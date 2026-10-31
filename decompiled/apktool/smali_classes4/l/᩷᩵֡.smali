.class public final Ll/᩷᩵֡;
.super Ljava/lang/Object;
.source "D906"


# instance fields
.field public final ֫:[Ll/ۖ֨֡;

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public varargs constructor <init>([Ll/ۖ֨֡;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Ll/᩷᩵֡;->ܽ:I

    .line 10
    iput v0, p0, Ll/᩷᩵֡;->ۧ:I

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Ll/᩷᩵֡;->ᩳ:I

    .line 15
    iput-object p1, p0, Ll/᩷᩵֡;->֫:[Ll/ۖ֨֡;

    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/᩷᩵֡;
    .locals 0

    .line 46
    iput p1, p0, Ll/᩷᩵֡;->ۧ:I

    return-object p0
.end method

.method public final ֫()[Ll/ۖ֨֡;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/᩷᩵֡;->֫:[Ll/ۖ֨֡;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 27
    iget v0, p0, Ll/᩷᩵֡;->ۧ:I

    return v0
.end method

.method public final ۧ(I)Ll/᩷᩵֡;
    .locals 0

    .line 40
    iput p1, p0, Ll/᩷᩵֡;->ܽ:I

    return-object p0
.end method

.method public final ܽ()I
    .locals 1

    .line 23
    iget v0, p0, Ll/᩷᩵֡;->ܽ:I

    return v0
.end method

.method public final ܽ(I)Ll/᩷᩵֡;
    .locals 1

    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    .line 61
    iput p1, p0, Ll/᩷᩵֡;->ᩳ:I

    return-object p0

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Lines must be >= 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩳ()I
    .locals 1

    .line 35
    iget v0, p0, Ll/᩷᩵֡;->ᩳ:I

    return v0
.end method
