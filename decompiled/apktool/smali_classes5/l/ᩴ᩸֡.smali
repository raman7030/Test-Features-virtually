.class public final Ll/ᩴ᩸֡;
.super Ll/֫᩶֡;
.source "B5L5"

# interfaces
.implements Ll/᩷᩶֡;


# static fields
.field public static final ܽ:Ll/۟᩹֡;


# instance fields
.field public ۧ:B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ll/ۘ᩸֡;

    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    sput-object v0, Ll/ᩴ᩸֡;->ܽ:Ll/۟᩹֡;

    return-void
.end method

.method public constructor <init>(Ll/᩻᩶֡;S)V
    .locals 0

    .line 43
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    const/16 p1, 0x100

    if-ge p2, p1, :cond_0

    int-to-byte p1, p2

    .line 49
    iput-byte p1, p0, Ll/ᩴ᩸֡;->ۧ:B

    return-void

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "The register number must be less than v256"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Ll/᩻᩶֡;[BI)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Ll/֫᩶֡;-><init>(Ll/᩻᩶֡;)V

    add-int/lit8 p3, p3, 0x1

    .line 55
    aget-byte p1, p2, p3

    and-int/lit16 p1, p1, 0xff

    int-to-short p1, p1

    int-to-byte p1, p1

    iput-byte p1, p0, Ll/ᩴ᩸֡;->ۧ:B

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 68
    iget-byte v0, p0, Ll/ᩴ᩸֡;->ۧ:B

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final ۢ()Ll/᩻᩸֡;
    .locals 1

    .line 64
    sget-object v0, Ll/᩻᩸֡;->ۛ:Ll/᩻᩸֡;

    return-object v0
.end method

.method public final ۧ(Ll/֫ۗ֡;I)V
    .locals 0

    .line 59
    iget-object p2, p0, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-byte p2, p2, Ll/᩻᩶֡;->ۗ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    .line 60
    iget-byte p2, p0, Ll/ᩴ᩸֡;->ۧ:B

    invoke-virtual {p1, p2}, Ll/֫ۗ֡;->ۧ(I)V

    return-void
.end method
