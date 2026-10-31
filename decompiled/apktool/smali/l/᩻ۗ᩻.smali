.class public Ll/᩻ۗ᩻;
.super Ll/ᩳۗ᩻;
.source "Z96X"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa3

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 18
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, Ll/᩻ۗ᩻;-><init>([BII)V

    return-void
.end method

.method public native constructor <init>([BII)V
.end method


# virtual methods
.method public final ۧ(I)I
    .locals 2

    if-gez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 45
    :cond_0
    iget-object v0, p0, Ll/ܿۗ᩻;->ᩳ:[I

    array-length v1, v0

    if-lt p1, v1, :cond_1

    .line 46
    iget p1, p0, Ll/ܿۗ᩻;->ܿ:I

    neg-int p1, p1

    return p1

    .line 47
    :cond_1
    array-length v1, v0

    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x1

    aget p1, v0, v1

    .line 48
    iget v0, p0, Ll/ܿۗ᩻;->ܿ:I

    if-ltz v0, :cond_2

    mul-int/lit8 p1, p1, 0x1f

    return p1

    :cond_2
    xor-int/lit8 p1, p1, 0x1f

    return p1
.end method
